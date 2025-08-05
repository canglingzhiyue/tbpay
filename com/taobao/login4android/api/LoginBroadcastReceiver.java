package com.taobao.login4android.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import tb.kge;

@Deprecated
/* loaded from: classes7.dex */
public class LoginBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-237378790);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LoginAction valueOf;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null || (valueOf = LoginAction.valueOf(intent.getAction())) == null) {
        } else {
            Bundle extras = intent.getExtras();
            switch (valueOf) {
                case NOTIFY_LOGIN_SUCCESS:
                    i = 911101;
                    break;
                case NOTIFY_LOGIN_CANCEL:
                    i = 911103;
                    break;
                case NOTIFY_LOGIN_FAILED:
                    i = 911102;
                    break;
                case NOTIFY_LOGOUT:
                    i = Login.NOTIFY_WEEDOUT;
                    break;
                case NOTIFY_USER_LOGIN:
                    i = Login.NOTIFY_USER_LOGIN;
                    break;
                case NOTIFY_LOGINBYSECURITY:
                    i = 911104;
                    break;
                case BIND_ALIPAY_SUCCESS:
                    i = Login.NOTIFY_BINDALIPAYSUCCESS;
                    break;
                case BIND_ALIPAY_FAILED:
                    i = Login.NOTIFY_BINDALIPAYFAILED;
                    break;
            }
            if (i <= 0) {
                return;
            }
            Login.sendToHander(i, extras);
        }
    }
}
