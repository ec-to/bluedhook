package com.zjfgh.bluedhook.simple;

import android.util.Log;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;

public class LiveMsgSendManagerHook {
    private static LiveMsgSendManagerHook instance;
    private long mainLid;
    private long mainUid;
    private Object liveRoomData;

    private LiveMsgSendManagerHook() {
        init();
    }

    public static synchronized LiveMsgSendManagerHook getInstance() {
        if (instance == null) {
            instance = new LiveMsgSendManagerHook();
        }
        return instance;
    }

    public void init() {
        XposedHelpers.findAndHookMethod("com.blued.android.module.live_china.manager.LiveRoomManager",
                AppContainer.getInstance().getClassLoader(), "a",
                "com.blued.android.module.live_china.model.LiveRoomData", new XC_MethodHook() {
                    @Override
                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                        super.beforeHookedMethod(param);
                        liveRoomData = param.args[0];
                        if (mainLid == 0) {
                            mainLid = XposedHelpers.getLongField(liveRoomData, "lid");
                            Object profile = XposedHelpers.getObjectField(liveRoomData, "profile");
                            mainUid = (long) XposedHelpers.callMethod(profile, "getUid");
                        }
                    }
                });
    }

    public Object getLiveMsgSendManager() {
        Class<?> LiveMsgSendManagerClass = XposedHelpers.findClass(
                "com.blued.android.module.live_china.msg.LiveMsgSendManager",
                AppContainer.getInstance().getClassLoader());
        return XposedHelpers.callStaticMethod(LiveMsgSendManagerClass, "a");
    }

    public Object getLiveRoomManager() {
        Class<?> LiveRoomManagerClass = XposedHelpers.findClass(
                "com.blued.android.module.live_china.manager.LiveRoomManager",
                AppContainer.getInstance().getClassLoader());
        Object liveRoomManager = XposedHelpers.callStaticMethod(LiveRoomManagerClass, "a");
        Log.i("BluedHook", "liveRoomManager： " + liveRoomManager);
        return liveRoomManager;
    }

    public void startSendMsg(String msg) {
        Class<?> LiveMsgSendManagerClass = XposedHelpers.findClass(
                "com.blued.android.module.live_china.msg.LiveMsgSendManager",
                AppContainer.getInstance().getClassLoader());
        Object msgSendManager = XposedHelpers.callStaticMethod(LiveMsgSendManagerClass, "a");
        XposedHelpers.callMethod(msgSendManager, "a", msg);
    }

    // Getters for the fields
    public long getMainLid() {
        return mainLid;
    }

    public void setMainLid(long mainLid) {
        this.mainLid = mainLid;
    }

    public long getMainUid() {
        return mainUid;
    }

    public Object getLiveRoomData() {
        return liveRoomData;
    }
}