package com.taobao.android.ucp.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.g;
import com.taobao.android.behavir.util.i;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import tb.dro;
import tb.dsj;
import tb.kge;

/* loaded from: classes.dex */
public class LoginBroadcastReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NOTIFY_LOGIN_SUCCESS = "NOTIFY_LOGIN_SUCCESS";
    public static final String NOTIFY_LOGOUT = "NOTIFY_LOGOUT";

    static {
        kge.a(688285716);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (intent == null) {
        } else {
            final String action = intent.getAction();
            i.a(new i.a() { // from class: com.taobao.android.ucp.util.LoginBroadcastReceiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.behavix.utils.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (TextUtils.equals(action, LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS)) {
                        dro.l();
                        dsj.f26943a = intent.getStringExtra("uid");
                        NativeBroadcast.sendMessageFromJava(NativeBroadcast.USER_LOGIN_IN_CHANGE, g.a("userId", dsj.f26943a), null);
                    } else if (!LoginBroadcastReceiver.NOTIFY_LOGOUT.equals(action)) {
                    } else {
                        dsj.f26943a = "";
                        NativeBroadcast.sendMessageFromJava(NativeBroadcast.USER_LOGIN_IN_CHANGE, g.a("userId", ""), null);
                    }
                }
            });
        }
    }
}
