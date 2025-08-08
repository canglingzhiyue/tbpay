package com.taobao.login4android.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginConstants;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.session.SessionManager;
import tb.kge;

/* loaded from: classes.dex */
public class LoginBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "login.LoginBroadcastReceiver";

    static {
        kge.a(1279586835);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null) {
        } else {
            try {
                LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                if (valueOf == null) {
                    return;
                }
                switch (valueOf) {
                    case NOTIFY_LOGIN_SUCCESS:
                        LoginStatus.resetLoginFlag();
                        SessionManager.sendCustomTrack(UTConstant.PageName.UT_PAGE_EXTEND, "RECEIVED_SUCCESS_BROADCAST", null);
                        return;
                    case NOTIFY_LOGIN_CANCEL:
                    case NOTIFY_LOGIN_FAILED:
                    case NOTIFY_RESET_STATUS:
                        LoginStatus.resetLoginFlag();
                        return;
                    case NOTIFY_USER_LOGIN:
                        LoginStatus.setUserLogin(true);
                        return;
                    case NOTIFY_LOGOUT:
                        SessionManager.sendCustomTrack(UTConstant.PageName.UT_PAGE_EXTEND, "RECEIVED_LOGOUT_BROADCAST", null);
                        if (StringUtils.equals(intent.getStringExtra(LoginConstants.LOGOUT_TYPE), LoginConstants.LogoutType.CHANGE_ACCOUNT.getType())) {
                            return;
                        }
                        LoginStatus.resetLoginFlag();
                        return;
                    default:
                        return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
