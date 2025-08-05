package com.taobao.android.launcher.bootstrap.tao;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;

/* loaded from: classes.dex */
public class LoginBroadcastRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f13062a;
    public volatile boolean b;
    public volatile boolean c;
    public boolean d;
    private final e e;
    private BroadcastReceiver f;

    /* renamed from: com.taobao.android.launcher.bootstrap.tao.LoginBroadcastRegister$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13063a = new int[LoginAction.values().length];

        static {
            try {
                f13063a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13063a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(int i);
    }

    public static /* synthetic */ e a(LoginBroadcastRegister loginBroadcastRegister) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("be37f868", new Object[]{loginBroadcastRegister}) : loginBroadcastRegister.e;
    }

    public LoginBroadcastRegister(e eVar) {
        this.e = eVar;
    }

    public void a(boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78df29dc", new Object[]{this, new Boolean(z), context});
        } else if (z) {
            if (this.f == null) {
                this.f = new LoginBroadcastReceiver(this, null);
            }
            LoginBroadcastHelper.registerLoginReceiver(context, this.f);
        } else {
            BroadcastReceiver broadcastReceiver = this.f;
            if (broadcastReceiver == null) {
                return;
            }
            LoginBroadcastHelper.unregisterLoginReceiver(context, broadcastReceiver);
            this.f = null;
        }
    }

    /* loaded from: classes.dex */
    public class LoginBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private LoginBroadcastReceiver() {
        }

        public /* synthetic */ LoginBroadcastReceiver(LoginBroadcastRegister loginBroadcastRegister, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null) {
            } else {
                int i = AnonymousClass1.f13063a[LoginAction.valueOf(intent.getAction()).ordinal()];
                if (i == 1) {
                    LoginBroadcastRegister loginBroadcastRegister = LoginBroadcastRegister.this;
                    loginBroadcastRegister.d = true;
                    loginBroadcastRegister.b = true;
                    if (LoginBroadcastRegister.a(loginBroadcastRegister).j_() && !LoginBroadcastRegister.this.c) {
                        LoginBroadcastRegister loginBroadcastRegister2 = LoginBroadcastRegister.this;
                        loginBroadcastRegister2.c = true;
                        if (loginBroadcastRegister2.f13062a != null) {
                            LoginBroadcastRegister.this.f13062a.a(1);
                        }
                    }
                    if (LoginBroadcastRegister.this.f13062a == null) {
                        return;
                    }
                    LoginBroadcastRegister.this.f13062a.a(2);
                } else if (i != 2 || LoginBroadcastRegister.this.f13062a == null) {
                } else {
                    LoginBroadcastRegister.this.f13062a.a(3);
                }
            }
        }
    }
}
