package com.taobao.android.layoutmanager.module;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import tb.kge;

/* loaded from: classes5.dex */
public class UserModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.android.layoutmanager.module.UserModule$2  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13265a = new int[LoginAction.values().length];

        static {
            try {
                f13265a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13265a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13265a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(1837665979);
        kge.a(-818961104);
    }

    public static void isLogin(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef00cd9", new Object[]{cVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (Login.checkSessionValid()) {
            jSONObject.put("result", (Object) true);
            cVar.c.a(cVar, jSONObject);
            return;
        }
        jSONObject.put("result", (Object) false);
        cVar.c.a(cVar, jSONObject);
    }

    public static void getUserInfo(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29baaa9", new Object[]{cVar});
        } else if (Login.checkSessionValid()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uId", (Object) Login.getUserId());
            jSONObject.put("nick", (Object) Login.getNick());
            jSONObject.put("userLogo", (Object) Login.getHeadPicLink());
            cVar.c.a(cVar, jSONObject);
        } else {
            cVar.c.a(cVar, new JSONObject());
        }
    }

    public static void logout(g.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("598a9b0e", new Object[]{cVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (Login.checkSessionValid()) {
            Login.logout(false);
            jSONObject.put("result", (Object) true);
            cVar.c.a(cVar, jSONObject);
            return;
        }
        jSONObject.put("result", (Object) true);
        cVar.c.a(cVar, jSONObject);
    }

    public static void login(final g.c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c235970f", new Object[]{cVar});
        } else if (!Login.checkSessionValid()) {
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.android.layoutmanager.module.UserModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent == null || TextUtils.isEmpty(intent.getAction())) {
                    } else {
                        int i = AnonymousClass2.f13265a[LoginAction.valueOf(intent.getAction()).ordinal()];
                        if (i == 1) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("uId", (Object) Login.getUserId());
                            jSONObject.put("nick", (Object) Login.getNick());
                            jSONObject.put("userLogo", (Object) Login.getHeadPicLink());
                            g.c.this.c.a(g.c.this, jSONObject);
                            LoginBroadcastHelper.unregisterLoginReceiver(ab.a(), this);
                        } else if (i == 2) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("result", (Object) false);
                            g.c.this.c.a(g.c.this, jSONObject2);
                            LoginBroadcastHelper.unregisterLoginReceiver(ab.a(), this);
                        } else if (i != 3) {
                        } else {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("result", (Object) false);
                            g.c.this.c.a(g.c.this, jSONObject3);
                            LoginBroadcastHelper.unregisterLoginReceiver(ab.a(), this);
                        }
                    }
                }
            };
            if ((cVar.b instanceof JSONObject) && ((JSONObject) cVar.b).containsKey("auto")) {
                z = true;
            }
            Login.login(!z);
            LoginBroadcastHelper.registerLoginReceiver(ab.a(), broadcastReceiver);
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uId", (Object) Login.getUserId());
            jSONObject.put("nick", (Object) Login.getNick());
            jSONObject.put("userLogo", (Object) Login.getHeadPicLink());
            cVar.c.a(cVar, jSONObject);
        }
    }
}
