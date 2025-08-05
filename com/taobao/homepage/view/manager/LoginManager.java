package com.taobao.homepage.view.manager;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.ali.user.mobile.model.LoginType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.c;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import com.taobao.android.nav.Nav;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.util.BuiltConfig;
import com.taobao.tao.util.NavUrls;
import com.taobao.taobao.R;
import com.taobao.wangxin.proxy.WangxinControlerProxy;
import java.lang.ref.WeakReference;
import tb.gkb;
import tb.kge;
import tb.ksp;
import tb.kss;
import tb.lan;
import tb.las;
import tb.lbq;
import tb.mbn;
import tb.oql;
import tb.oqq;

/* loaded from: classes7.dex */
public class LoginManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NETWORK_PUSH_VIEW = 4004;

    /* renamed from: a  reason: collision with root package name */
    private lbq f17299a;
    private LoginBroadcastReceiver b;
    private int c = 0;

    /* renamed from: com.taobao.homepage.view.manager.LoginManager$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17301a = new int[LoginAction.values().length];

        static {
            try {
                f17301a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17301a[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17301a[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17301a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(1343693570);
    }

    public static /* synthetic */ lbq a(LoginManager loginManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lbq) ipChange.ipc$dispatch("35625ff4", new Object[]{loginManager}) : loginManager.f17299a;
    }

    public static /* synthetic */ void b(LoginManager loginManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b9e6b6", new Object[]{loginManager});
        } else {
            loginManager.e();
        }
    }

    public static /* synthetic */ void c(LoginManager loginManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1928115", new Object[]{loginManager});
        } else {
            loginManager.f();
        }
    }

    public LoginManager(lbq lbqVar) {
        this.f17299a = lbqVar;
        this.b = new LoginBroadcastReceiver(lbqVar);
    }

    public LoginManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginManager) ipChange.ipc$dispatch("c636b557", new Object[]{this});
        }
        LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this.b);
        return this;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this.b);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        TBS.Adv.ctrlClicked(CT.Button, "wangxinclick", new String[0]);
        WangxinControlerProxy.gotoWangxin(this.f17299a.getCurActivity());
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        com.taobao.homepage.utils.c.b("overlayTime");
        oqq.b();
        oql.a().h();
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (Login.getCommentUsed()) {
            g();
        } else if (!"0".equals(BuiltConfig.getString(R.string.dynamic_package_switch))) {
        } else {
            Login.setCommentUsed(true);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (Login.checkSessionValid() || TextUtils.isEmpty(Login.getLoginToken())) {
        } else {
            Login.login(false);
        }
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else if (intent == null) {
        } else {
            try {
                c(intent);
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    this.c = 0;
                    return;
                }
                if (extras.getString("msg_ww") != null) {
                    this.c = 2;
                    lan.a("onCreate_goToWangWang");
                } else if ("com.android.mms".equals(extras.getString("com.android.browser.application_id"))) {
                    this.c = 0;
                } else if ("weitao_widget".equals(extras.getString("fromWidget"))) {
                    a(extras);
                    lan.a("onCreate_goToWeitao");
                } else {
                    this.c = 0;
                    las.b();
                }
                a(extras, "onCreate_goToShop");
            } catch (Exception unused) {
                this.c = 0;
            }
        }
    }

    private void a(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1273636", new Object[]{this, bundle, str});
            return;
        }
        String string = bundle.getString("uid");
        String string2 = bundle.getString("shop_id");
        if (!TextUtils.isEmpty(string)) {
            lan.a(str);
            Nav.from(g.a()).toUri(String.format(NavUrls.nav_urls_shop[2], string));
        } else if (TextUtils.isEmpty(string2)) {
        } else {
            lan.a(str);
            Nav.from(g.a()).toUri(String.format(NavUrls.nav_urls_shop[1], string2));
        }
    }

    public void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            this.c = 0;
            return;
        }
        c(intent);
        if (extras.getString("msg_service") != null) {
            if ("logistic".equals(extras.getString("msg_type"))) {
                TBS.Ext.commitEvent(kss.f30292a, 4004, "Logistic", null, null, "NewStart=False");
                lan.a("onNewIntent_goToLogisic");
                this.c = 1;
                if (Login.getSid() != null) {
                    this.c = 0;
                    Nav.from(this.f17299a.getCurActivity()).toUri(NavUrls.NAV_URL_LOGISTIC_LIST);
                } else {
                    Login.login(true);
                }
            } else if ("browser".equals(extras.getString("msg_type"))) {
                TBS.Ext.commitEvent(kss.f30292a, 4004, Dispatchers.TYPE_ACTIVITY, null, null, "NewStart=False");
                lan.a("onNewIntent_goToMyBrowser");
                String string = extras.getString("myBrowserUrl");
                Bundle bundle = new Bundle();
                bundle.putString("myBrowserUrl", string);
                bundle.putString("msg_service", "msg_service");
                Nav.from(this.f17299a.getCurActivity()).withExtras(bundle).skipPreprocess().withCategory(mbn.BROWSER_ONLY_CATEGORY).toUri(string);
            }
        } else if (extras.getString("msg_ww") != null) {
            this.c = 2;
            lan.a("onNewIntent_goToWangWang");
            if (Login.getSid() != null) {
                this.c = 0;
                e();
            } else {
                Login.login(true);
            }
        } else if ("weitao_widget".equals(extras.getString("fromWidget"))) {
            a(extras);
            lan.a("onNewIntent_goToWeitao");
        } else {
            this.c = 0;
        }
        a(extras, "onNewIntent_goToShop");
    }

    private void a(final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
        } else {
            new Handler().postDelayed(new Runnable() { // from class: com.taobao.homepage.view.manager.LoginManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    bundle.putString("weitao_widget", "");
                    long j = bundle.getLong("snsId", -1L);
                    long j2 = bundle.getLong("feedId", -1L);
                    if (j <= -1 || j2 <= -1) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("feedId", j2);
                    bundle2.putLong("snsId", j);
                    int identifier = Globals.getApplication().getResources().getIdentifier("allspark_wapp_detail_url", "string", Globals.getApplication().getPackageName());
                    String str = (identifier > 0 ? Globals.getApplication().getResources().getString(identifier) : "http://h5.m.taobao.com/we/detail2.htm") + "?feedId=" + j2 + "&snsId=" + j;
                    Activity curActivity = LoginManager.a(LoginManager.this).getCurActivity();
                    if (curActivity == null) {
                        return;
                    }
                    Nav.from(curActivity).withExtras(bundle2).toUri(str);
                }
            }, 150L);
        }
    }

    private void c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa30527", new Object[]{this, intent});
            return;
        }
        try {
            String dataString = intent.getDataString();
            String stringExtra = intent.getStringExtra(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY);
            if (TextUtils.isEmpty(dataString)) {
                return;
            }
            Uri parse = Uri.parse(dataString);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = parse.getQueryParameter(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY);
                if (!TextUtils.isEmpty(stringExtra)) {
                    extras.putString(AlipayConstant.LOGIN_ALIPAY_TOKEN_KEY, stringExtra);
                }
            }
            if (TextUtils.isEmpty(intent.getStringExtra("source"))) {
                String queryParameter = parse.getQueryParameter("source");
                if (!TextUtils.isEmpty(queryParameter)) {
                    extras.putString("source", queryParameter);
                }
            }
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            Login.setLaunchBundle(extras);
            lan.a("setLaunchBundle");
        } catch (Throwable th) {
            e.b("home.LoginManager", th, "initBundle error");
        }
    }

    /* loaded from: classes7.dex */
    public static class LoginBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<lbq> f17302a;

        static {
            kge.a(-1503745687);
        }

        public LoginBroadcastReceiver(lbq lbqVar) {
            this.f17302a = new WeakReference<>(lbqVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            lbq lbqVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || (lbqVar = this.f17302a.get()) == null) {
            } else {
                LoginManager c = lbqVar.getHomePageManager().c();
                try {
                    int i = AnonymousClass2.f17301a[LoginAction.valueOf(intent.getAction()).ordinal()];
                    if (i == 1) {
                        ksp.a("LoginHandler", com.taobao.android.ucp.util.LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS);
                        if (!LoginType.LocalLoginType.AUTO_LOGIN.equalsIgnoreCase(intent.getStringExtra("message"))) {
                            com.taobao.tao.homepage.a.a(context, com.taobao.android.editionswitcher.b.REFRESH_SOURCE_LOGIN_SUCCESS);
                        }
                        e.b("LoginHandler", "Login Success" + Login.getSid() + " " + Login.getNick());
                        gkb.a.b("home.kv", "oldEncryptedUserId", Login.getOldEncryptedUserId());
                        int c2 = c.c();
                        if (c2 == 1) {
                            c.a(0);
                            Activity curActivity = lbqVar.getCurActivity();
                            if (curActivity == null) {
                                return;
                            }
                            Nav.from(curActivity).toUri(NavUrls.NAV_URL_LOGISTIC_LIST);
                        } else if (c2 == 2) {
                            c.a(0);
                            LoginManager.b(c);
                        }
                        LoginManager.c(c);
                    } else if (i == 2) {
                        e.b("LoginHandler", "Login fail");
                        ksp.c("LoginHandler", "NOTIFY_LOGIN_FAILED");
                        if (c.c() == 1 || c.c() == 2) {
                            Login.login(true);
                        }
                    } else if (i == 3) {
                        e.b("LoginHandler", "Login cancel");
                        ksp.a("LoginHandler", "NOTIFY_LOGIN_CANCEL");
                        c.a(0);
                    } else if (i == 4) {
                        c.a.b("homepage_switch", "user_id", "");
                    }
                    com.taobao.android.behavix.d.a().a(Login.getUserId());
                } catch (Throwable unused) {
                }
            }
        }
    }
}
