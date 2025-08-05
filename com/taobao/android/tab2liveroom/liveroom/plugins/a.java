package com.taobao.android.tab2liveroom.liveroom.plugins;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.b;
import com.taobao.android.tab2liveroom.liveroom.plugins.a;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.taobao.R;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.ogg;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private Context f15300a;
    private aa d;
    private FrameLayout e;
    private View f;
    private boolean g;
    private BroadcastReceiver h;
    private Handler b = new Handler(Looper.getMainLooper());
    private int c = 0;
    private Runnable j = new Runnable() { // from class: com.taobao.android.tab2liveroom.liveroom.plugins.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            a.this = this;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (a.d(a.this) != null) {
                LoginBroadcastHelper.unregisterLoginReceiver(a.i(a.this), a.d(a.this));
            }
            a.a(a.this, 2);
            ogg.a("AutoLoginPlugin", "autoLoginTimeoutTask showLoginUI");
            a.f(a.this);
        }
    };
    private boolean i = oeb.a("enableAutoLoginPlugin", true);

    /* renamed from: com.taobao.android.tab2liveroom.liveroom.plugins.a$2 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15302a = new int[LoginAction.values().length];

        static {
            try {
                f15302a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15302a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15302a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(704246446);
    }

    public static /* synthetic */ int a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9547d61", new Object[]{aVar, new Integer(i)})).intValue();
        }
        aVar.c = i;
        return i;
    }

    public static /* synthetic */ Handler a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("3f301471", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9faf8536", new Object[]{aVar});
        } else {
            aVar.h();
        }
    }

    public static /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5438e37", new Object[]{aVar});
        } else {
            aVar.e();
        }
    }

    public static /* synthetic */ BroadcastReceiver d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("8931bd2f", new Object[]{aVar}) : aVar.h;
    }

    public static /* synthetic */ int e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("106ba02c", new Object[]{aVar})).intValue() : aVar.c;
    }

    public static /* synthetic */ void f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35ffa93a", new Object[]{aVar});
        } else {
            aVar.f();
        }
    }

    public static /* synthetic */ boolean g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b93b23f", new Object[]{aVar})).booleanValue() : aVar.g;
    }

    public static /* synthetic */ void h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8127bb3c", new Object[]{aVar});
        } else {
            aVar.i();
        }
    }

    public static /* synthetic */ Context i(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("403e7c35", new Object[]{aVar}) : aVar.f15300a;
    }

    public a(Context context, FrameLayout frameLayout, aa aaVar) {
        this.f15300a = context;
        this.e = frameLayout;
        this.d = aaVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.i) {
        } else {
            this.g = true;
            ogg.a("AutoLoginPlugin", "checkLoginState: " + this.c);
            int i = this.c;
            if (i < 4) {
                c();
            } else if (i == 4) {
                i();
            } else if (i == 5) {
                i();
            } else if (i == 6) {
                h();
            } else if (i != 7) {
            } else {
                f();
            }
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ogg.a("AutoLoginPlugin", "checkLoginState");
        if (g()) {
            ogg.a("AutoLoginPlugin", "checkLoginState return : isLogin");
            return;
        }
        this.c = 1;
        d();
        this.b.postDelayed(this.j, 3000L);
        Login.login(false);
        if (this.h == null) {
            this.h = new BroadcastReceiver() { // from class: com.taobao.android.tab2liveroom.liveroom.plugins.AutoLoginPlugin$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent == null) {
                    } else {
                        int i = a.AnonymousClass2.f15302a[LoginAction.valueOf(intent.getAction()).ordinal()];
                        if (i == 1) {
                            a.a(a.this, 3);
                            a.a(a.this).removeCallbacksAndMessages(null);
                            a.b(a.this);
                            a.c(a.this);
                            LoginBroadcastHelper.unregisterLoginReceiver(context, a.d(a.this));
                            ogg.a("AutoLoginPlugin", "自动登录回调 " + a.e(a.this));
                        } else if (i != 2) {
                        } else {
                            a.a(a.this, 2);
                            a.a(a.this).removeCallbacksAndMessages(null);
                            a.f(a.this);
                            LoginBroadcastHelper.unregisterLoginReceiver(context, a.d(a.this));
                            ogg.a("AutoLoginPlugin", "自动登录回调 " + a.e(a.this));
                        }
                    }
                }
            };
        }
        LoginBroadcastHelper.registerLoginReceiver(this.f15300a, this.h);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.i) {
        } else {
            this.g = false;
            this.b.removeCallbacksAndMessages(null);
            BroadcastReceiver broadcastReceiver = this.h;
            if (broadcastReceiver == null) {
                return;
            }
            LoginBroadcastHelper.unregisterLoginReceiver(this.f15300a, broadcastReceiver);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ogg.a("AutoLoginPlugin", "showAutoLoginView");
        if (this.f == null) {
            this.f = LayoutInflater.from(this.f15300a).inflate(R.layout.tab2_liveroom_layout_live_login, (ViewGroup) null);
        }
        this.e.addView(this.f, new FrameLayout.LayoutParams(-1, -1));
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ogg.a("AutoLoginPlugin", "hideAutoLoginView");
        View view = this.f;
        if (view == null) {
            return;
        }
        this.e.removeView(view);
        this.f = null;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (g()) {
        } else {
            ogg.a("AutoLoginPlugin", "showLoginUI");
            this.c = 4;
            Login.login(true);
            LoginBroadcastHelper.registerLoginReceiver(this.f15300a, new BroadcastReceiver() { // from class: com.taobao.android.tab2liveroom.liveroom.plugins.AutoLoginPlugin$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (intent == null) {
                    } else {
                        int i = a.AnonymousClass2.f15302a[LoginAction.valueOf(intent.getAction()).ordinal()];
                        if (i == 1) {
                            if (a.e(a.this) == 4) {
                                a.a(a.this, 6);
                            }
                            LoginBroadcastHelper.unregisterLoginReceiver(context, this);
                            ogg.a("AutoLoginPlugin", "登录页面回调 SUCCESS" + a.e(a.this) + " isPageAppear :" + a.g(a.this));
                            if (!a.g(a.this)) {
                                return;
                            }
                            a.b(a.this);
                        } else if (i != 2 && i != 3) {
                        } else {
                            if (a.e(a.this) == 4) {
                                a.a(a.this, 5);
                            }
                            LoginBroadcastHelper.unregisterLoginReceiver(context, this);
                            ogg.a("AutoLoginPlugin", "登录页面回调 FAILED" + a.e(a.this) + " isPageAppear :" + a.g(a.this));
                            if (!a.g(a.this)) {
                                return;
                            }
                            a.h(a.this);
                        }
                    }
                }
            });
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : Login.checkSessionValid();
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.c = 0;
        ogg.a("AutoLoginPlugin", b.REFRESH_SOURCE_LOGIN_SUCCESS);
        ((com.taobao.android.tab2liveroom.liveroom.a) this.d.I()).b("onLiveLoginSuccess", (Map) null);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.c = 7;
        ogg.a("AutoLoginPlugin", "loginFailed");
        ((com.taobao.android.tab2liveroom.liveroom.a) this.d.I()).b("onLiveLoginFailed", (Map) null);
    }
}
