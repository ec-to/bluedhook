package com.zjfgh.bluedhook.simple;

import android.util.Log;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;

public class LiveMsgSendManagerHook {
    public static long mainLid;
    public static Object liveRoomData;

    public static void init() {
        XposedHelpers.findAndHookMethod("com.blued.android.module.live_china.manager.LiveRoomManager", AppContainer.getInstance().getClassLoader(), "a", "com.blued.android.module.live_china.model.LiveRoomData", new XC_MethodHook() {
            @Override
            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
                super.beforeHookedMethod(param);
                liveRoomData = param.args[0];
                mainLid = XposedHelpers.getLongField(liveRoomData, "lid");
            }
        });
    }

    public static Object getLiveMsgSendManager() {
        Class<?> LiveMsgSendManagerClass = XposedHelpers.findClass("com.blued.android.module.live_china.msg.LiveMsgSendManager", AppContainer.getInstance().getClassLoader());
        return XposedHelpers.callStaticMethod(LiveMsgSendManagerClass, "a");
    }

    public static Object getLiveRoomManager() {
        Class<?> LiveRoomManagerClass = XposedHelpers.findClass("com.blued.android.module.live_china.manager.LiveRoomManager", AppContainer.getInstance().getClassLoader());
        Object liveRoomManager = XposedHelpers.callStaticMethod(LiveRoomManagerClass, "a");
        Log.i("BluedHook", "liveRoomManager： " + liveRoomManager);
        return liveRoomManager;

    }

    public static void startSendMsg(String msg) {
        Class<?> LiveMsgSendManagerClass = XposedHelpers.findClass("com.blued.android.module.live_china.msg.LiveMsgSendManager", AppContainer.getInstance().getClassLoader());
        Object msgSendManager = XposedHelpers.callStaticMethod(LiveMsgSendManagerClass, "a");
        XposedHelpers.callMethod(msgSendManager, "a", msg);
    }
}
