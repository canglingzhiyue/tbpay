package com.taobao.android.actionservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.flexbox.layoutmanager.actionservice.a;

/* loaded from: classes4.dex */
public class LoginModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOGIN_STATUS = "status";

    /* renamed from: com.taobao.android.actionservice.LoginModule$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8955a = new int[LoginAction.values().length];

        static {
            try {
                f8955a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8955a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8955a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void login(JSON json, a.b bVar, a.InterfaceC0830a interfaceC0830a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e415d032", new Object[]{json, bVar, interfaceC0830a});
        } else if (Login.checkSessionValid()) {
        } else {
            Login.login(true);
        }
    }

    public static void loginAsync(JSON json, final a.b bVar, final a.InterfaceC0830a interfaceC0830a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53c4c9c8", new Object[]{json, bVar, interfaceC0830a});
            return;
        }
        final JSONObject jSONObject = new JSONObject();
        if (!Login.checkSessionValid()) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.android.actionservice.LoginModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent == null || TextUtils.isEmpty(intent.getAction())) {
                    } else {
                        int i = AnonymousClass2.f8955a[LoginAction.valueOf(intent.getAction()).ordinal()];
                        if (i == 1) {
                            JSONObject.this.put("status", (Object) "SUCCESS");
                            interfaceC0830a.a(bVar, JSONObject.this);
                            LoginBroadcastHelper.unregisterLoginReceiver(com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a(), this);
                        } else if (i == 2) {
                            JSONObject.this.put("status", (Object) "FAILED");
                            interfaceC0830a.a(bVar, JSONObject.this);
                            LoginBroadcastHelper.unregisterLoginReceiver(com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a(), this);
                        } else if (i != 3) {
                        } else {
                            JSONObject.this.put("status", (Object) "CANCEL");
                            interfaceC0830a.a(bVar, JSONObject.this);
                            LoginBroadcastHelper.unregisterLoginReceiver(com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a(), this);
                        }
                    }
                }
            };
            Login.login(true);
            LoginBroadcastHelper.registerLoginReceiver(com.taobao.tao.flexbox.layoutmanager.actionservice.core.a.a(), broadcastReceiver);
            return;
        }
        jSONObject.put("status", (Object) "SUCCESS");
        interfaceC0830a.a(bVar, jSONObject);
    }
}
