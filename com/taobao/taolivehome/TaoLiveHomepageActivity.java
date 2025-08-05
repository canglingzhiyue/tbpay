package com.taobao.taolivehome;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ali.user.mobile.info.AppInfo;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.launcher.bootstrap.tao.ability.b;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.livehome.d;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.live.home.dinamic.ability.h;
import com.taobao.live.home.h5container.TBLiveHomePlugin;
import com.taobao.live.home.h5container.a;
import com.taobao.live.timemove.weex.TBLivePlatformView;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.media.MediaConstant;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taobaocompat.lifecycle.IUtActivityNotTrack;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.m;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.utils.u;
import com.taobao.taolivehome.utils.k;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;
import java.util.Map;
import tb.ddw;
import tb.kge;
import tb.mfm;
import tb.pmd;
import tb.sdt;
import tb.sdu;
import tb.xkw;

/* loaded from: classes8.dex */
public class TaoLiveHomepageActivity extends CustomBaseActivity implements com.alibaba.ut.c, com.taobao.android.launcher.bootstrap.tao.ability.c, a, IUtActivityNotTrack, sdu.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_LIVE_SOURCE = "livesource";

    /* renamed from: a  reason: collision with root package name */
    private static final String f22055a;
    private long b;
    private long h;
    private String i;
    private Object j;
    private boolean l;
    private Uri m;
    private boolean o;
    private boolean p;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private BroadcastReceiver k = new BroadcastReceiver() { // from class: com.taobao.taolivehome.TaoLiveHomepageActivity.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || TextUtils.isEmpty(intent.getAction())) {
            } else {
                String action = intent.getAction();
                if (!TextUtils.equals(action, LoginAction.NOTIFY_LOGIN_SUCCESS.name())) {
                    if (!TextUtils.equals(action, LoginAction.NOTIFY_LOGIN_CANCEL.name())) {
                        return;
                    }
                    TaoLiveHomepageActivity taoLiveHomepageActivity = TaoLiveHomepageActivity.this;
                    TaoLiveHomepageActivity.a(taoLiveHomepageActivity, taoLiveHomepageActivity);
                    TLog.loge(MediaConstant.LBLIVE_SOURCE, TaoLiveHomepageActivity.b() + "_APM", "onCreate checkSessionValid NOTIFY_LOGIN_CANCEL");
                    TaoLiveHomepageActivity.this.finish();
                    return;
                }
                TaoLiveHomepageActivity taoLiveHomepageActivity2 = TaoLiveHomepageActivity.this;
                if (TaoLiveHomepageActivity.a(taoLiveHomepageActivity2, TaoLiveHomepageActivity.b(taoLiveHomepageActivity2))) {
                    TaoLiveHomepageActivity.b(TaoLiveHomepageActivity.this, true);
                }
                TaoLiveHomepageActivity taoLiveHomepageActivity3 = TaoLiveHomepageActivity.this;
                TaoLiveHomepageActivity.a(taoLiveHomepageActivity3, taoLiveHomepageActivity3);
                TLog.loge(MediaConstant.LBLIVE_SOURCE, TaoLiveHomepageActivity.b() + "_APM", "onCreate checkSessionValid NOTIFY_LOGIN_SUCCESS");
                TaoLiveHomepageActivity.a(TaoLiveHomepageActivity.this, true);
            }
        }
    };

    private boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveHomepageActivity taoLiveHomepageActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean needActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4205b12", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean needPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24050629", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50f98c0", new Object[]{this, bundle});
        }
    }

    public static /* synthetic */ void a(TaoLiveHomepageActivity taoLiveHomepageActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b36241", new Object[]{taoLiveHomepageActivity});
        } else {
            taoLiveHomepageActivity.f();
        }
    }

    public static /* synthetic */ void a(TaoLiveHomepageActivity taoLiveHomepageActivity, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870642d3", new Object[]{taoLiveHomepageActivity, activity});
        } else {
            taoLiveHomepageActivity.b(activity);
        }
    }

    public static /* synthetic */ void a(TaoLiveHomepageActivity taoLiveHomepageActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53b998b3", new Object[]{taoLiveHomepageActivity, new Boolean(z)});
        } else {
            taoLiveHomepageActivity.c(z);
        }
    }

    public static /* synthetic */ boolean a(TaoLiveHomepageActivity taoLiveHomepageActivity, Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("662cdd2a", new Object[]{taoLiveHomepageActivity, uri})).booleanValue() : taoLiveHomepageActivity.a(uri);
    }

    public static /* synthetic */ Uri b(TaoLiveHomepageActivity taoLiveHomepageActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("666418f9", new Object[]{taoLiveHomepageActivity}) : taoLiveHomepageActivity.m;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f22055a;
    }

    public static /* synthetic */ void b(TaoLiveHomepageActivity taoLiveHomepageActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd51752", new Object[]{taoLiveHomepageActivity, new Boolean(z)});
        } else {
            taoLiveHomepageActivity.d(z);
        }
    }

    static {
        kge.a(28251926);
        kge.a(-1864841087);
        kge.a(-2028101264);
        kge.a(1306513280);
        kge.a(1698775038);
        kge.a(-1310276871);
        f22055a = TaoLiveHomepageActivity.class.getSimpleName();
        q.a("TBLiveHomePlugin", (Class<? extends e>) TBLiveHomePlugin.class);
        q.a("TBLiveBaseCommonPlugin", f.w().createWVPluginClass());
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.TAOLIVE_HOMEPAGE, true, this);
        TaoLiveLaunchInitializer.init();
        super.onCreate(null);
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        if (sdt.b(getApplicationContext()) || sdt.a(getApplicationContext())) {
            sdu.a().a((sdu.a) this);
            com.taobao.android.autosize.f.a((Activity) this);
        }
        com.taobao.android.live.plugin.proxy.livehome.e.c = SystemClock.uptimeMillis();
        h();
        Intent intent = getIntent();
        this.m = intent.getData();
        this.d = b.d(intent);
        this.e = b.c(intent);
        com.taobao.android.live.plugin.proxy.livehome.e.c(com.taobao.android.live.plugin.proxy.livehome.e.a(this));
        TLog.loge(MediaConstant.LBLIVE_SOURCE, f22055a + "_APM", "onCreate isAfcColdContext " + this.d + " isAfcContextCallback " + this.e);
        if (this.d) {
            String dataString = intent.getDataString();
            HashMap hashMap = new HashMap();
            hashMap.put("isAfcColdContext", String.valueOf(this.d));
            hashMap.put("isAfcContextCallback", String.valueOf(this.e));
            hashMap.put("isAfcColdContext_rul", dataString);
            ai.a(n.a(), "IsAfcColdContext_create2", (Map<String, String>) hashMap);
            if (this.e && c.b() && a(dataString, false)) {
                return;
            }
        }
        this.h = System.currentTimeMillis();
        if (a(this.m)) {
            Uri data = getIntent().getData();
            m.a(this.h, this.d, data != null ? data.getQueryParameter("livesource") : "");
            s.f18233a.d().a("taolive_session_id", m.a());
            s.f18233a.d().a("taolive_create_time", Long.valueOf(SystemClock.uptimeMillis()));
            s.f18233a.d().a("taolive_create_isAfcColdContext", Boolean.valueOf(this.d));
        }
        MUSEngine.registerPlatformView("tblivevideox", TBLivePlatformView.class);
        if (a(this.m)) {
            boolean checkSessionValid = Login.checkSessionValid();
            String userId = Login.getUserId();
            String nick = Login.getNick();
            s.f18233a.d().a("taolive_check_login_session_valid", Boolean.valueOf(checkSessionValid));
            if (this.d && c.d()) {
                if (!checkSessionValid && ((TextUtils.isEmpty(userId) || TextUtils.isEmpty(nick)) && !a(checkSessionValid))) {
                    d(false);
                    return;
                }
            } else if (!a(checkSessionValid)) {
                d(false);
                return;
            }
            d(true);
        }
        c(false);
        if (sdt.f()) {
            return;
        }
        new Handler().postDelayed(new Runnable() { // from class: com.taobao.taolivehome.TaoLiveHomepageActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (pmd.a().u() != null) {
                    com.taobao.taolive.sdk.morelive.e.a().a(pmd.a().u().c());
                }
                com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.ATYPE, false, TaoLiveHomepageActivity.this);
                com.taobao.android.live.plugin.proxy.e.a().a(com.taobao.android.live.plugin.proxy.e.BTYPE, false, TaoLiveHomepageActivity.this);
                com.taobao.android.live.plugin.proxy.c.a().f();
                com.taobao.taolive.launcherx.a.a();
                com.taobao.taolive.launcherx.a.b(TaoLiveHomepageActivity.this.getApplication());
            }
        }, 3000L);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        if (com.taobao.android.live.plugin.proxy.livehome.e.k == null) {
            return;
        }
        d dVar = com.taobao.android.live.plugin.proxy.livehome.e.k;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (!this.p && com.taobao.android.live.plugin.proxy.livehome.e.k != null) {
            com.taobao.android.live.plugin.proxy.livehome.e.k.a((AppCompatActivity) this, false);
            this.p = true;
        }
        this.g = true;
        if (com.taobao.android.live.plugin.proxy.livehome.e.k != null) {
            com.taobao.android.live.plugin.proxy.livehome.e.k.c();
        }
        if (!u.w()) {
            return;
        }
        View findViewById = findViewById(R.id.live_fragment_vp);
        if (Build.VERSION.SDK_INT < 29 || !(findViewById instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) findViewById).suppressLayout(false);
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b = SystemClock.uptimeMillis();
        if (com.taobao.android.live.plugin.proxy.livehome.e.k == null) {
            com.taobao.android.live.plugin.proxy.livehome.e.k = f.z().createTaoLiveHomePage(this, this.d, this.j, getIntent());
        }
        com.taobao.android.live.plugin.proxy.livehome.e.k.a(this.d, z);
    }

    private void d(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        Uri data = getIntent().getData();
        if (data == null) {
            return;
        }
        this.i = data.getQueryParameter("livesource");
        String queryParameter = data.getQueryParameter("tabSpm");
        if (!TextUtils.isEmpty(this.i) && this.i.startsWith("taolivejulang") && !TextUtils.isEmpty(queryParameter) && com.taobao.taolivehome.utils.j.a()) {
            if ("jingxuan,singleLiveTab".equals(data.getQueryParameter("channelType")) && z) {
                this.j = new Object();
                UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this.j, "Page_TaobaoLiveWatch");
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(this.j, "Page_TaobaoLiveWatch");
                str = "a2141.28646552";
            } else {
                UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this, "PageTaoLive");
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "PageTaoLive");
                str = "";
            }
            if (!TextUtils.isEmpty(queryParameter)) {
                str = queryParameter;
            }
            hashMap.put("spm-cnt", str);
            if (!TextUtils.isEmpty(this.i)) {
                hashMap.put("livesource", this.i);
                hashMap.put("entryLiveSource", this.i);
            }
            String queryParameter2 = data.getQueryParameter("spm");
            if (!TextUtils.isEmpty(queryParameter2)) {
                hashMap.put("entrySpm", queryParameter2);
            }
            String queryParameter3 = data.getQueryParameter("userId");
            if (!TextUtils.isEmpty(queryParameter3)) {
                hashMap.put("account_id", queryParameter3);
            }
            String queryParameter4 = data.getQueryParameter("id");
            if (!TextUtils.isEmpty(queryParameter4)) {
                hashMap.put("feed_id", queryParameter4);
            }
            hashMap.put("isAfcColdContext", String.valueOf(this.d));
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
    }

    private boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return true;
        }
        if (this.d && c.a() && !Login.checkInit()) {
            e();
        } else {
            f();
        }
        return false;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(this).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.taolivehome.TaoLiveHomepageActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
                if (!AppInfo.INITED_ACTION.equals(intent.getAction())) {
                    return;
                }
                TLog.loge(MediaConstant.LBLIVE_SOURCE, TaoLiveHomepageActivity.b() + "_APM", "onCreate registerLoginInitAction onReceive INITED_ACTION");
                if (!c.c() || !Login.checkSessionValid()) {
                    TaoLiveHomepageActivity.a(TaoLiveHomepageActivity.this);
                } else {
                    TaoLiveHomepageActivity.a(TaoLiveHomepageActivity.this, false);
                }
            }
        }, new IntentFilter(AppInfo.INITED_ACTION));
        HashMap hashMap = new HashMap();
        hashMap.put("isAfcColdContext", String.valueOf(this.d));
        hashMap.put("isAfcContextCallback", String.valueOf(this.e));
        ai.a(n.a(), "IsAfcColdContext_checkLoginInit", (Map<String, String>) hashMap);
        TLog.loge(MediaConstant.LBLIVE_SOURCE, f22055a + "_APM", "onCreate registerLoginInitAction");
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        a((Activity) this);
        Login.login(true);
        HashMap hashMap = new HashMap();
        hashMap.put("isAfcColdContext", String.valueOf(this.d));
        hashMap.put("isAfcContextCallback", String.valueOf(this.e));
        ai.a(n.a(), "IsAfcColdContext_checkSessionValid", (Map<String, String>) hashMap);
        TLog.loge(MediaConstant.LBLIVE_SOURCE, f22055a + "_APM", "onCreate checkSessionValidFalse " + this.d);
    }

    private void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            LoginBroadcastHelper.registerLoginReceiver(activity, this.k);
        }
    }

    private void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(activity, this.k);
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        this.f = b.d(intent);
        boolean c = b.c(intent);
        TLog.loge(MediaConstant.LBLIVE_SOURCE, f22055a + "_APM", "onNewIntent isAfcColdContext " + this.f + " isAfcContextCallback " + c);
        if (this.d) {
            HashMap hashMap = new HashMap();
            hashMap.put("isAfcColdContext", String.valueOf(this.d));
            hashMap.put("isAfcContextCallback", String.valueOf(this.e));
            hashMap.put("isNewIntentAfcColdContext", String.valueOf(this.f));
            hashMap.put("isAfcContextCallbackNewIntent", String.valueOf(c));
            ai.a(n.a(), "IsAfcColdContext_newIntent2", (Map<String, String>) hashMap);
        }
        if (this.d && this.f && c) {
            TLog.loge(MediaConstant.LBLIVE_SOURCE, f22055a + "_APM", "onNewIntent return");
            if (this.e || !c.b()) {
                return;
            }
            intent.getDataString();
        } else if (com.taobao.android.live.plugin.proxy.livehome.e.k == null) {
        } else {
            com.taobao.android.live.plugin.proxy.livehome.e.k.a(intent);
        }
    }

    private boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{this, uri})).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("channelType");
        String queryParameter2 = uri.getQueryParameter(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_HOME_PAGE_TYPE);
        return "jingxuan,singleLiveTab".equals(queryParameter) && (com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_HOME_PAGE_TYPE_mixLiveAndTab.equals(queryParameter2) || com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_HOME_PAGE_TYPE_mixLive.equals(queryParameter2));
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (k.a() && this.d) {
            if (this.f && this.g) {
                UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
                this.g = false;
            }
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
        }
        if (com.taobao.android.live.plugin.proxy.livehome.e.k == null) {
            return;
        }
        d dVar = com.taobao.android.live.plugin.proxy.livehome.e.k;
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        if (k.a() && this.d && this.g) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
            this.g = false;
        }
        if (com.taobao.android.live.plugin.proxy.livehome.e.k != null) {
            com.taobao.android.live.plugin.proxy.livehome.e.k.e();
        }
        if (!isFinishing()) {
            return;
        }
        d();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder("Page_TaobaoLive", "LivePage_StayTime");
        uTControlHitBuilder.setProperty(g4.b.i, String.valueOf(this.b));
        uTControlHitBuilder.setProperty("stayTime", String.valueOf(SystemClock.uptimeMillis() - this.b));
        UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
        sdu.a().b();
        com.taobao.android.live.plugin.proxy.c.a().f();
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.o) {
        } else {
            b((Activity) this);
            com.taobao.android.live.plugin.proxy.livehome.e.c("");
            com.taobao.android.live.plugin.proxy.livehome.e.a("");
            com.taobao.android.live.plugin.proxy.livehome.e.b("");
            com.taobao.android.live.plugin.proxy.livehome.e.f14116a = false;
            com.taobao.android.live.plugin.proxy.livehome.e.c = 0L;
            com.taobao.android.live.plugin.proxy.livehome.e.b = 0L;
            com.taobao.android.live.plugin.proxy.livehome.e.e = 0L;
            com.taobao.android.live.plugin.proxy.livehome.e.d = 0L;
            h.a().b();
            if (com.taobao.android.live.plugin.proxy.livehome.e.k != null) {
                com.taobao.android.live.plugin.proxy.livehome.e.k.f();
            }
            com.taobao.android.live.plugin.proxy.livehome.e.k = null;
            this.o = true;
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (com.taobao.android.live.plugin.proxy.livehome.e.k != null && com.taobao.android.live.plugin.proxy.livehome.e.k.a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            setTheme(R.style.Theme_NoBackgroundAndOverLayingActionBar_LiveHome);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isAfcColdContextTrackHomePageBugfix", "true");
        hashMap.put("enableHomePageDX0828", "false");
        mfm.a(hashMap);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (com.taobao.android.live.plugin.proxy.livehome.e.k == null) {
            return;
        }
        com.taobao.android.live.plugin.proxy.livehome.e.k.a(i, i2, intent);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        } else {
            super.onConfigurationChanged(configuration);
        }
    }

    @Override // tb.sdu.a
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.l = z;
        if (com.taobao.android.live.plugin.proxy.livehome.e.k == null) {
            return;
        }
        if (!sdt.a(getApplicationContext()) && !sdt.b(getApplicationContext())) {
            return;
        }
        com.taobao.android.live.plugin.proxy.livehome.e.k.a(this.l);
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        ddw.a().a(xkw.EVENT_MEDIAPLATFORM_DISABLE_SMALLWINDOW);
    }

    @Override // com.taobao.live.home.h5container.a
    public DinamicXEngine c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("c0d4a65d", new Object[]{this});
        }
        if (com.taobao.android.live.plugin.proxy.livehome.e.k == null) {
            return null;
        }
        return com.taobao.android.live.plugin.proxy.livehome.e.k.x();
    }
}
