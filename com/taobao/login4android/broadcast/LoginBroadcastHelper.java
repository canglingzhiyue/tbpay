package com.taobao.login4android.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.log.LoginTLogAdapter;
import tb.kge;

/* loaded from: classes.dex */
public class LoginBroadcastHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_NOTIFY_LOCAL_BROADCAST = "action_notify_local_broadcast";
    public static final String DATA_NOTIFY_LOCAL_BROADCAST = "data";
    private static final String TAG = "login.LoginBroadcastHelper";
    public static final String USE_LOCAL_BROADCAST = "use_local_broadcast";
    private static volatile BroadcastReceiver crossProcessNotifyReceiver;
    private static IntentFilter mfilter;
    private static volatile Boolean useLocalBroadcast;

    static {
        kge.a(1239339218);
        try {
            mfilter = new IntentFilter();
            for (LoginAction loginAction : LoginAction.values()) {
                mfilter.addAction(loginAction.name());
            }
            mfilter.setPriority(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean isUseLocalBroadcast(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d5bef12", new Object[]{context})).booleanValue();
        }
        if (useLocalBroadcast == null) {
            synchronized (LoginBroadcastHelper.class) {
                if (useLocalBroadcast == null) {
                    useLocalBroadcast = Boolean.valueOf(context.getSharedPreferences("userinfo", 0).getBoolean(USE_LOCAL_BROADCAST, false));
                    LoginTLogAdapter.e(TAG, "useLocalBroadcast" + useLocalBroadcast);
                }
            }
        }
        return useLocalBroadcast.booleanValue();
    }

    private static void ensureCrossProcessNotifyReady(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("468d7814", new Object[]{context});
        } else if (crossProcessNotifyReceiver != null) {
        } else {
            synchronized (LoginBroadcastHelper.class) {
                if (crossProcessNotifyReceiver == null) {
                    crossProcessNotifyReceiver = new BroadcastReceiver() { // from class: com.taobao.login4android.broadcast.LoginBroadcastHelper.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context2, Intent intent) {
                            Intent intent2;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                            } else if (intent == null || (intent2 = (Intent) intent.getParcelableExtra("data")) == null) {
                            } else {
                                LocalBroadcastManager.getInstance(context2).sendBroadcast(intent2);
                            }
                        }
                    };
                    context.getApplicationContext().registerReceiver(crossProcessNotifyReceiver, new IntentFilter(ACTION_NOTIFY_LOCAL_BROADCAST));
                }
            }
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fccb740", new Object[]{context, broadcastReceiver, intentFilter});
        } else if (broadcastReceiver == null || context == null) {
        } else {
            if (isUseLocalBroadcast(context)) {
                ensureCrossProcessNotifyReady(context);
                LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, intentFilter);
                return;
            }
            try {
                context.getApplicationContext().registerReceiver(broadcastReceiver, intentFilter);
            } catch (Throwable th) {
                LoginTLogAdapter.w(TAG, "registerLoginReceiver failed", th);
                th.printStackTrace();
            }
        }
    }

    public static void unregisterLoginReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac971e22", new Object[]{context, broadcastReceiver});
        } else if (broadcastReceiver == null || context == null) {
        } else {
            if (isUseLocalBroadcast(context)) {
                ensureCrossProcessNotifyReady(context);
                LocalBroadcastManager.getInstance(context).unregisterReceiver(broadcastReceiver);
                return;
            }
            try {
                context.getApplicationContext().unregisterReceiver(broadcastReceiver);
            } catch (Throwable th) {
                LoginTLogAdapter.w(TAG, "unregisterLoginReceiver failed", th);
                th.printStackTrace();
            }
        }
    }

    public static void sentInitFailBroadcast(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf0d3a6", new Object[]{context});
            return;
        }
        Intent intent = new Intent(LoginAction.NOTIFY_LOGIN_FAILED.name());
        intent.putExtra(LoginConstants.LOGIN_FAIL_REASON, LoginConstants.LOGIN_FAIL_BY_APPKEY);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }
}
