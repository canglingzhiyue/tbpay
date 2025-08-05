package com.taobao.themis.ability.taobao.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.ability.impl.user.UserAbility;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import mtopsdk.mtop.util.ErrorConstant;

/* loaded from: classes9.dex */
public class TMSTBLoginAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.themis.ability.taobao.impl.TMSTBLoginAbility$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22294a = new int[LoginAction.values().length];

        static {
            try {
                f22294a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22294a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22294a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class LoginReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private a f22295a;

        public LoginReceiver(a aVar) {
            this.f22295a = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || (action = intent.getAction()) == null) {
            } else {
                LoginAction valueOf = LoginAction.valueOf(action);
                int i = AnonymousClass1.f22294a[valueOf.ordinal()];
                if (i == 1 || i == 2) {
                    LoginBroadcastHelper.unregisterLoginReceiver(context, this);
                    int i2 = valueOf == LoginAction.NOTIFY_LOGIN_CANCEL ? 12 : 11;
                    String str = valueOf == LoginAction.NOTIFY_LOGIN_CANCEL ? "登录取消" : ErrorConstant.ERRMSG_ANDROID_SYS_LOGIN_FAIL;
                    a aVar = this.f22295a;
                    if (aVar != null) {
                        aVar.a(i2, str);
                    }
                } else if (i == 3) {
                    LoginBroadcastHelper.unregisterLoginReceiver(context, this);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("userId", (Object) Login.getUserId());
                    jSONObject.put("nick", (Object) Login.getNick());
                    a aVar2 = this.f22295a;
                    if (aVar2 != null) {
                        aVar2.a(jSONObject);
                    }
                }
                this.f22295a = null;
            }
        }
    }

    /* loaded from: classes9.dex */
    public interface a {
        void a(int i, String str);

        void a(JSONObject jSONObject);
    }

    public static void a(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a493ad64", new Object[]{context, aVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (a()) {
            jSONObject.put("userId", (Object) Login.getUserId());
            jSONObject.put("nick", (Object) Login.getNick());
            if (aVar == null) {
                return;
            }
            aVar.a(jSONObject);
        } else if (context != null) {
            LoginBroadcastHelper.registerLoginReceiver(context, new LoginReceiver(aVar));
            Login.login(true);
        } else {
            aVar.a(13, "Context null");
        }
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee5e005c", new Object[]{aVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(UserAbility.API_IS_LOGIN, (Object) Boolean.valueOf(a()));
        if (aVar == null) {
            return;
        }
        aVar.a(jSONObject);
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Login.getSid() != null;
    }
}
