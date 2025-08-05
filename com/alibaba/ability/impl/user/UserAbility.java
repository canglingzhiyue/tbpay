package com.alibaba.ability.impl.user;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.login4android.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import mtopsdk.mtop.util.ErrorConstant;
import tb.alm;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes2.dex */
public final class UserAbility extends alm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_IS_LOGIN = "isLogin";
    public static final String API_LOGIN = "login";
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f1965a = new AtomicBoolean(false);
    private UserBroadCastReceiver b;
    private Context c;

    static {
        kge.a(-1775812124);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(UserAbility userAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes2.dex */
    public static final class a {
        static {
            kge.a(2080972844);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        int hashCode = api.hashCode();
        if (hashCode != 103149417) {
            if (hashCode == 2064555103 && api.equals(API_IS_LOGIN)) {
                return new FinishResult(new JSONObject(ai.b(j.a("result", Boolean.valueOf(a())))), null, 2, null);
            }
        } else if (api.equals("login")) {
            Context f = context.f().f();
            if (f == null) {
                return a$a.Companion.b("context 为空");
            }
            a(f, callback);
            return null;
        }
        a$a.a aVar = a$a.Companion;
        return aVar.a(api + " 没找到");
    }

    private final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : Login.checkSessionValid();
    }

    private final void a(Context context, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72556e4d", new Object[]{this, context, alnVar});
            return;
        }
        this.c = context;
        if (a()) {
            alnVar.a(new FinishResult(new JSONObject(ai.b(j.a("result", true))), "onSuccess"));
            return;
        }
        if (this.f1965a.compareAndSet(false, true)) {
            this.b = new UserBroadCastReceiver(alnVar);
            LoginBroadcastHelper.registerLoginReceiver(context, this.b);
        }
        UserBroadCastReceiver userBroadCastReceiver = this.b;
        if (userBroadCastReceiver != null) {
            userBroadCastReceiver.a(alnVar);
        }
        Login.login(true);
    }

    @Override // tb.alm
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (!this.f1965a.compareAndSet(true, false)) {
            return;
        }
        UserBroadCastReceiver userBroadCastReceiver = this.b;
        if (userBroadCastReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(this.c, userBroadCastReceiver);
        }
        this.b = null;
        this.c = null;
    }

    /* loaded from: classes2.dex */
    public static final class UserBroadCastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private aln f1966a;

        static {
            kge.a(308202117);
        }

        public UserBroadCastReceiver(aln callback) {
            q.d(callback, "callback");
            this.f1966a = callback;
        }

        public final void a(aln alnVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e03fee55", new Object[]{this, alnVar});
                return;
            }
            q.d(alnVar, "<set-?>");
            this.f1966a = alnVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null) {
            } else {
                try {
                    String action = intent.getAction();
                    q.a((Object) action);
                    q.b(action, "intent.action!!");
                    int i = com.alibaba.ability.impl.user.a.$EnumSwitchMapping$0[LoginAction.valueOf(action).ordinal()];
                    if (i == 1) {
                        this.f1966a.a(new FinishResult(new JSONObject(ai.b(j.a("result", true))), "onSuccess"));
                    } else if (i == 2) {
                        this.f1966a.a(new ErrorResult("LOGIN_ERROR", Constant.MSG_ERROR_USER_CANCEL, (Map) null, 4, (o) null));
                    } else if (i != 3) {
                        if (i != 4) {
                        }
                    } else {
                        this.f1966a.a(new ErrorResult("LOGIN_ERROR", ErrorConstant.ERRMSG_ANDROID_SYS_LOGIN_FAIL, (Map) null, 4, (o) null));
                    }
                } catch (Throwable th) {
                    aln alnVar = this.f1966a;
                    alnVar.a(new ErrorResult("LOGIN_ERROR", "登录失败，错误信息：" + Log.getStackTraceString(th), (Map) null, 4, (o) null));
                }
            }
        }
    }
}
