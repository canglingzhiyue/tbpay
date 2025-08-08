package com.taobao.taobao.weex2.modules;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.impl.user.UserAbility;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class AliMUSLoginModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "user";

    /* renamed from: com.taobao.taobao.weex2.modules.AliMUSLoginModule$1  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21305a = new int[LoginAction.values().length];

        static {
            try {
                f21305a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21305a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21305a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21305a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(AliMUSLoginModule aliMUSLoginModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @MUSMethod(uiThread = true)
    public void logout(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2511afa8", new Object[]{this, bVar});
        }
    }

    public AliMUSLoginModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void getUserInfo(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e22c0ad", new Object[]{this, bVar});
            return;
        }
        String nick = Login.getNick();
        String userId = Login.getUserId();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (isLogin() && !StringUtils.isEmpty(nick) && !StringUtils.isEmpty(userId)) {
            hashMap.put(UserAbility.API_IS_LOGIN, "true");
            hashMap.put("nick", nick);
            hashMap.put("userId", userId);
            hashMap2.put("nick", nick);
            hashMap2.put("userId", userId);
            hashMap.put("info", hashMap2);
        } else {
            hashMap.put(UserAbility.API_IS_LOGIN, "false");
        }
        bVar.a(JSON.toJSON(hashMap));
    }

    @MUSMethod(uiThread = true)
    public void login(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b06af87", new Object[]{this, bVar});
        } else if (isLogin()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) "success");
            JSONObject jSONObject2 = new JSONObject();
            String nick = Login.getNick();
            String userId = Login.getUserId();
            jSONObject2.put("nick", (Object) nick);
            jSONObject2.put("userId", (Object) userId);
            jSONObject.put("info", (Object) jSONObject2);
            bVar.a(jSONObject);
        } else {
            LoginReceiver loginReceiver = new LoginReceiver(getInstance().getUIContext());
            loginReceiver.a(bVar);
            LoginBroadcastHelper.registerLoginReceiver(getInstance().getUIContext(), loginReceiver);
            Login.login(true);
        }
    }

    private boolean isLogin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(Login.getSid()) && Login.checkSessionValid();
    }

    /* loaded from: classes8.dex */
    public static class LoginReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Context f21306a;
        private b b;

        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bfcdf07f", new Object[]{this, bVar});
            } else {
                this.b = bVar;
            }
        }

        public LoginReceiver(Context context) {
            this.f21306a = context;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LoginAction valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || (valueOf = LoginAction.valueOf(intent.getAction())) == null) {
            } else {
                int i = AnonymousClass1.f21305a[valueOf.ordinal()];
                if (i == 1 || i == 2) {
                    LoginBroadcastHelper.unregisterLoginReceiver(this.f21306a, this);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", (Object) "failed");
                    b bVar = this.b;
                    if (bVar == null) {
                        return;
                    }
                    bVar.a(jSONObject);
                } else if (i == 3) {
                    LoginBroadcastHelper.unregisterLoginReceiver(this.f21306a, this);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("status", (Object) "success");
                    b bVar2 = this.b;
                    if (bVar2 == null) {
                        return;
                    }
                    bVar2.a(jSONObject2);
                } else if (i != 4) {
                } else {
                    LoginBroadcastHelper.unregisterLoginReceiver(context, this);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("status", (Object) "success");
                    JSONObject jSONObject4 = new JSONObject();
                    String nick = Login.getNick();
                    String userId = Login.getUserId();
                    jSONObject4.put("nick", (Object) nick);
                    jSONObject4.put("userId", (Object) userId);
                    jSONObject3.put("info", (Object) jSONObject4);
                    b bVar3 = this.b;
                    if (bVar3 == null) {
                        return;
                    }
                    bVar3.a(jSONObject3);
                }
            }
        }
    }
}
