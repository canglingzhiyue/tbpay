package com.ali.user.mobile.base.helper;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.login.action.LoginResActions;
import com.ali.user.mobile.model.LoginParam;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class BroadCastHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "login.BroadCastHelper";

    static {
        kge.a(-77459900);
    }

    public static void sendCancelBroadcast(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8885c1da", new Object[]{str, str2});
            return;
        }
        Intent intent = new Intent(LoginResActions.LOGIN_CANCEL_ACTION);
        try {
            intent.putExtra("errorCode", str);
            intent.putExtra("message", str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sendLocalBroadCast(intent);
    }

    public static void sendLoginFailBroadcast(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3dac7e4", new Object[]{new Integer(i), str});
        } else {
            sendLoginFailBroadcast(null, i, str);
        }
    }

    public static void sendLoginFailBroadcast(LoginParam loginParam, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f565e7", new Object[]{loginParam, new Integer(i), str});
            return;
        }
        Intent intent = new Intent(LoginResActions.LOGIN_FAIL_ACTION);
        if (loginParam != null) {
            try {
                if (!StringUtils.isEmpty(loginParam.loginId)) {
                    intent.putExtra("username", loginParam.loginId);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        intent.putExtra("errorCode", i);
        intent.putExtra("message", str);
        sendLocalBroadCast(intent);
    }

    public static boolean sendLocalBroadCast(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b9ca1a6", new Object[]{intent})).booleanValue();
        }
        boolean sendBroadcast = LocalBroadcastManager.getInstance(DataProviderFactory.getApplicationContext()).sendBroadcast(intent);
        LoginTLogAdapter.e(TAG, intent.getAction() + "; sendResult=" + sendBroadcast);
        return sendBroadcast;
    }

    public static void sendBroadcast(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920b6c1c", new Object[]{loginAction});
        } else {
            sendBroadcast(loginAction, false, "");
        }
    }

    public static void sendBroadcast(LoginAction loginAction, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0ed602", new Object[]{loginAction, new Boolean(z), str});
        } else {
            sendBroadcast(loginAction, z, 0, "", str);
        }
    }

    public static void sendBroadcast(LoginAction loginAction, boolean z, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f88c6ad7", new Object[]{loginAction, new Boolean(z), map, str});
        } else {
            sendBroadcast(loginAction, z, 0, "", map, str);
        }
    }

    public static void sendBroadcast(LoginAction loginAction, boolean z, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee35b5f", new Object[]{loginAction, new Boolean(z), new Integer(i), str, str2});
        } else {
            sendBroadcast(loginAction, z, i, str, (Map<String, String>) null, str2);
        }
    }

    public static void sendBroadcast(LoginAction loginAction, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("247533e9", new Object[]{loginAction, map});
        } else {
            sendBroadcast(loginAction, false, 0, "", map, "");
        }
    }

    public static void sendBroadcast(LoginAction loginAction, boolean z, int i, String str, Map<String, String> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d7adfda", new Object[]{loginAction, new Boolean(z), new Integer(i), str, map, str2});
        } else if (loginAction == null) {
        } else {
            sendBroadcast(loginAction.name(), z, i, str, map, str2);
        }
    }

    public static void sendBroadcast(String str, boolean z, int i, String str2, Map<String, String> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae5accc", new Object[]{str, new Boolean(z), new Integer(i), str2, map, str3});
        } else if (str != null) {
            Intent intent = new Intent();
            intent.setAction(str);
            intent.putExtra(LoginConstants.SHOW_TOAST, z);
            if (!StringUtils.isEmpty(str2)) {
                intent.putExtra("message", str2);
            }
            intent.putExtra("errorCode", i);
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (key != null && value != null) {
                        intent.putExtra(entry.getKey(), entry.getValue());
                    }
                }
            }
            intent.putExtra(LoginConstants.BROWSER_REF_URL, str3);
            if (!doSendBroadcast(intent)) {
                return;
            }
            try {
                if (!isLoginBroadcast(str)) {
                    return;
                }
                LoginStatus.resetLoginFlag();
            } catch (Throwable th) {
                LoginTLogAdapter.e(TAG, "resetLoginFlag " + intent.getAction() + "=" + th);
            }
        }
    }

    public static boolean doSendBroadcast(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7f31596", new Object[]{intent})).booleanValue();
        }
        intent.setPackage(DataProviderFactory.getApplicationContext().getPackageName());
        try {
            DataProviderFactory.getApplicationContext().sendBroadcast(intent);
            Intent intent2 = new Intent(LoginBroadcastHelper.ACTION_NOTIFY_LOCAL_BROADCAST);
            intent2.putExtra("data", intent);
            DataProviderFactory.getApplicationContext().sendBroadcast(intent2);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            LoginTLogAdapter.e(TAG, "sendSimpleBroadcast " + intent.getAction() + "=" + th);
            return false;
        }
    }

    public static boolean isLoginBroadcast(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("48d03c37", new Object[]{str})).booleanValue() : LoginAction.NOTIFY_LOGIN_SUCCESS.name().equals(str) || LoginAction.NOTIFY_LOGIN_FAILED.equals(str) || LoginAction.NOTIFY_LOGIN_CANCEL.equals(str);
    }
}
