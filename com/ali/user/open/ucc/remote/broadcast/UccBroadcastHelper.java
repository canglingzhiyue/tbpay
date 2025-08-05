package com.ali.user.open.ucc.remote.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ali.user.open.core.trace.SDKLogger;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ucp.util.LoginBroadcastReceiver;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes2.dex */
public class UccBroadcastHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UccBroadcastHelper";
    private static Method doSendBroadcast;
    private static IntentFilter mfilter;
    private static Method registerReceiverMethod;
    private static Method unRegisterReceiverMethod;

    static {
        kge.a(-1190913001);
        registerReceiverMethod = null;
        unRegisterReceiverMethod = null;
        doSendBroadcast = null;
        try {
            Class<?> cls = Class.forName("com.taobao.login4android.broadcast.LoginBroadcastHelper");
            registerReceiverMethod = cls.getMethod("registerLoginReceiver", Context.class, BroadcastReceiver.class, IntentFilter.class);
            unRegisterReceiverMethod = cls.getMethod("unregisterLoginReceiver", Context.class, BroadcastReceiver.class);
            doSendBroadcast = Class.forName("com.ali.user.mobile.base.helper.BroadCastHelper").getMethod("doSendBroadcast", Intent.class);
            mfilter = new IntentFilter();
            for (UccResultAction uccResultAction : UccResultAction.values()) {
                mfilter.addAction(uccResultAction.name());
            }
            mfilter.addAction(LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS);
            mfilter.addAction(LoginBroadcastReceiver.NOTIFY_LOGOUT);
            mfilter.setPriority(1000);
        } catch (Exception e) {
            e.printStackTrace();
            SDKLogger.e(TAG, "static " + e.getMessage());
        }
    }

    public static void registerLoginReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d919b1b", new Object[]{context, broadcastReceiver});
        } else {
            registerLoginReceiver(context, broadcastReceiver, mfilter);
        }
    }

    public static void registerLoginReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Method method = registerReceiverMethod;
        if (method == null) {
            return;
        }
        try {
            method.invoke(null, context, broadcastReceiver, intentFilter);
        } catch (Throwable th) {
            th.printStackTrace();
            SDKLogger.e(TAG, "registerLoginReceiver " + th.getMessage());
        }
    }

    public static void unregisterLoginReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        Method method = unRegisterReceiverMethod;
        if (method == null) {
            return;
        }
        try {
            method.invoke(null, context, broadcastReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
            SDKLogger.e(TAG, "unregisterLoginReceiver " + th.getMessage());
        }
    }

    public static void sendBroadcast(Intent intent) {
        Method method = doSendBroadcast;
        if (method == null) {
            return;
        }
        try {
            method.invoke(null, intent);
        } catch (Throwable th) {
            th.printStackTrace();
            SDKLogger.e(TAG, "sendBroadcast " + th.getMessage());
        }
    }
}
