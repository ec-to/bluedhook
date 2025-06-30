package com.zjfgh.bluedhook.simple;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.XModuleResources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;

public class LiveMultiPKItemViewHook {
    private final ClassLoader classLoader;
    private static LiveMultiPKItemViewHook instance;
    private final WeakReference<Context> contextRef;
    private final XModuleResources modRes;
    private final HashMap<String, MsgSenderAnchor> hmSendMsgAnchor;


    private LiveMultiPKItemViewHook(Context context, XModuleResources modRes) {
        this.contextRef = new WeakReference<>(context);
        this.classLoader = context.getClassLoader();
        this.modRes = modRes;
        hmSendMsgAnchor = new HashMap<>();
        setDataHook();
        viewHook();
    }

    // 获取单例实例
    public static synchronized LiveMultiPKItemViewHook getInstance(Context context, XModuleResources modRes) {
        if (instance == null) {
            instance = new LiveMultiPKItemViewHook(context, modRes);
        }
        return instance;
    }

    public void setDataHook() {
        XposedHelpers.findAndHookMethod(
                "com.blued.android.module.live_china.view.LiveMultiPKItemView",
                AppContainer.getInstance().getClassLoader(), "setData",
                "com.blued.android.module.live_china.model.LiveInviteUserModel",
                new XC_MethodHook() {
                    @SuppressLint("UseCompatLoadingForDrawables")
                    @Override
                    protected void beforeHookedMethod(XC_MethodHook.MethodHookParam param) throws Throwable {
                        super.beforeHookedMethod(param);
                        Object liveInviteUserModel = param.args[0];
                        String name = (String) XposedHelpers.getObjectField(liveInviteUserModel, "name");
                        String uid = (String) XposedHelpers.getObjectField(liveInviteUserModel, "uid");
                        String lid = (String) XposedHelpers.getObjectField(liveInviteUserModel, "lid");
                        String avatar = (String) XposedHelpers.getObjectField(liveInviteUserModel, "avatar");
                        Object liveMultiConnectionItemViewBinding = XposedHelpers.callMethod(param.thisObject, "getViewBinding");
                        FrameLayout frameLayout = (FrameLayout) XposedHelpers.callMethod(liveMultiConnectionItemViewBinding, "getRoot", new Object[0]);
                        LayoutInflater inflater = (LayoutInflater) frameLayout.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        XmlResourceParser llBackRoundParser = modRes.getLayout(R.layout.live_room_sysn_msg);
                        LinearLayout llBackRound = (LinearLayout) inflater.inflate(llBackRoundParser, null, false);
                        FrameLayout flBackRound = llBackRound.findViewById(R.id.fl_live_room_bg);
                        flBackRound.setBackground(modRes.getDrawable(R.drawable.tech_bg_default, null));
                        TextView tvSyncTitle = llBackRound.findViewById(R.id.tv_live_room_sync_title);
                        frameLayout.addView(llBackRound);
                        MsgSenderAnchor msgSenderAnchor = new MsgSenderAnchor();
                        msgSenderAnchor.name = name;
                        msgSenderAnchor.lid = lid;
                        msgSenderAnchor.uid = uid;
                        msgSenderAnchor.avatar = avatar;
                        msgSenderAnchor.tvSyncTitle = tvSyncTitle;
                        msgSenderAnchor.flBackRound = flBackRound;
                        flBackRound.setTag(msgSenderAnchor);
                        flBackRound.setOnClickListener(v -> {
                            MsgSenderAnchor msgSenderAnchor1 = (MsgSenderAnchor) v.getTag();
                            if (!msgSenderAnchor1.isChecked) {
                                msgSenderAnchor1.isChecked = true;
                                flBackRound.setBackground(modRes.getDrawable(R.drawable.tech_bg_selected, null));
                                hmSendMsgAnchor.put(lid, msgSenderAnchor1);
                            } else {
                                msgSenderAnchor1.isChecked = false;
                                removeUser(uid);
                                flBackRound.setBackground(modRes.getDrawable(R.drawable.tech_bg_default, null));
                                hmSendMsgAnchor.remove(uid);
                            }
                        });
                    }
                });
    }

    public void removeUser(String uid) {
        hmSendMsgAnchor.remove(uid);
        Log.d("BluedHook", "移除用户UID：" + hmSendMsgAnchor.size());
    }

    public void cleanUser() {
        hmSendMsgAnchor.clear();
        Log.d("BluedHook", "清空用户：" + hmSendMsgAnchor.size());
    }

    public void viewHook() {
        XposedHelpers.findAndHookMethod("com.blued.android.module.live_china.msg.GrpcMsgSender",
                classLoader, "a",
                "java.lang.String",
                boolean.class,
                "com.blued.android.module.live_china.model.LiveZanExtraModel$EmojiModel",
                "com.blued.android.module.live_china.msg.SendMsgListener", new XC_MethodHook() {
                    @Override
                    protected void afterHookedMethod(MethodHookParam param) throws Throwable {
                        super.afterHookedMethod(param);
                        String msg = (String) param.args[0];
                        Object liveRoomData = LiveMsgSendManagerHook.liveRoomData;
                        Object liveRoomManager = LiveMsgSendManagerHook.getLiveRoomManager();
                        long lid = XposedHelpers.getLongField(liveRoomData, "lid");
                        hmSendMsgAnchor.forEach((key, value) -> {
                            // 使用 key 和 value 进行操作
                            if (key.equals(String.valueOf(lid))) {
                                Log.i("BluedHook", "跳过主直播间发言");
                                return;
                            }
                            XposedHelpers.setLongField(liveRoomData, "lid", Long.parseLong(value.lid));
                            XposedHelpers.callMethod(liveRoomManager, "a", liveRoomData);
                            Log.e("BluedHook", "Key: " + key + ", Value: " + value.name);
                            LiveMsgSendManagerHook.startSendMsg(msg);
                        });
                        XposedHelpers.setLongField(liveRoomData, "lid", LiveMsgSendManagerHook.mainLid);
                        XposedHelpers.callMethod(liveRoomManager, "a", liveRoomData);
                    }
                });
    }

    public static class MsgSenderAnchor {
        public View flBackRound;
        public boolean isChecked;
        public View tvSyncTitle;
        public String uid = "";
        public String name = "";
        public String avatar = "";
        public String lid = "";
    }
}
