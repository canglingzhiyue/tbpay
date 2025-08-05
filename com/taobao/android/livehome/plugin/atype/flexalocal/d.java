package com.taobao.android.livehome.plugin.atype.flexalocal;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.taobao.windvane.embed.BaseEmbedView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ability.impl.user.UserAbility;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.live.plugin.proxy.livehome.e;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.DinamicSdkManager2;
import com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.LiveHomeController2;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.dinamic.DinamicRegister;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBaseFragment2;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeBottomH5Fragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeNormalFragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.HomeSelectedContainerFragment;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.c;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.LiveNewTabView;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TBLHomeNativeSearchInputView;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.g;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.i;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.j;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.k;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.l;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.n;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.p;
import com.taobao.android.nav.Nav;
import com.taobao.live.home.h5container.TBLiveHomePlugin;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import com.taobao.tao.homepage.launcher.b;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.gbg;
import tb.kge;
import tb.mff;
import tb.mfg;
import tb.mfj;
import tb.mfm;
import tb.mfn;
import tb.noa;
import tb.pbt;
import tb.psb;
import tb.sdt;
import tb.sqt;

/* loaded from: classes6.dex */
public class d extends com.taobao.android.live.plugin.proxy.livehome.d implements com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.a, c, LiveNewTabView.a, mff {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_LIVE_SOURCE = "livesource";

    /* renamed from: a */
    public static int f14139a;
    public static String b;
    private long D;
    private volatile TabManager.JSONTabNew E;
    private volatile FrameLayout F;
    private volatile boolean G;
    private int I;
    private boolean J;
    private int K;
    private int L;
    private String M;
    private Context c;
    private ViewPager d;
    private a e;
    private LiveNewTabView f;
    private View g;
    private TUrlImageView h;
    private String k;
    private String l;
    private String m;
    private String n;
    private JSONObject o;
    private JSONObject p;
    private String q;
    private volatile AppCompatActivity s;
    private Intent t;
    private String u;
    private volatile JSONObject v;
    private boolean x;
    private String z;
    private String j = "jingxuan";
    private Handler r = new Handler(Looper.getMainLooper());
    private sqt w = new sqt();
    private BroadcastReceiver y = new BroadcastReceiver() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveNewHomePage$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || l.a((CharSequence) intent.getAction())) {
            } else {
                try {
                    LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                    if (valueOf == LoginAction.NOTIFY_LOGIN_SUCCESS) {
                        mfg.a().b("com.taobao.taolive.login.success");
                    } else if (valueOf != LoginAction.NOTIFY_LOGOUT) {
                    } else {
                        mfg.a().b("com.taobao.taolive.login.out");
                    }
                } catch (Exception e) {
                    mfj.a("TaoLiveNewHomePage", "login receive exp. Action: " + intent.getAction(), e);
                }
            }
        }
    };
    private volatile boolean i = false;
    private volatile boolean N = false;
    private volatile boolean O = false;
    private volatile boolean P = false;
    private boolean H = false;
    private boolean A = true;
    private TabManager.TabMarketing B = null;
    private boolean C = false;

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -670876635) {
            super.a((Intent) objArr[0]);
            return null;
        } else if (hashCode != 94685804) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.e();
            return null;
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.LiveNewTabView.a
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ Map a(d dVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2c2d5ae1", new Object[]{dVar, str}) : dVar.b(str);
    }

    public static /* synthetic */ void a(d dVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9acf9953", new Object[]{dVar, list});
        } else {
            dVar.b(list);
        }
    }

    public static /* synthetic */ boolean a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a4fa1066", new Object[]{dVar})).booleanValue() : dVar.P;
    }

    public static /* synthetic */ boolean a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa48aeb6", new Object[]{dVar, new Boolean(z)})).booleanValue();
        }
        dVar.H = z;
        return z;
    }

    public static /* synthetic */ AppCompatActivity b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppCompatActivity) ipChange.ipc$dispatch("f54797ae", new Object[]{dVar}) : dVar.s;
    }

    public static /* synthetic */ void b(d dVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dce6c6b2", new Object[]{dVar, list});
        } else {
            dVar.a(list);
        }
    }

    public static /* synthetic */ void b(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4be4f33", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.b(z);
        }
    }

    public static /* synthetic */ sqt c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sqt) ipChange.ipc$dispatch("cfd86850", new Object[]{dVar}) : dVar.w;
    }

    public static /* synthetic */ Handler d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("186e55e7", new Object[]{dVar}) : dVar.r;
    }

    public static /* synthetic */ boolean e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bd093de2", new Object[]{dVar})).booleanValue() : dVar.H;
    }

    public static /* synthetic */ void f(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30d093d", new Object[]{dVar});
        } else {
            dVar.t();
        }
    }

    public static /* synthetic */ Context g(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6501f94", new Object[]{dVar}) : dVar.c;
    }

    public static /* synthetic */ JSONObject h(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d79c9f1b", new Object[]{dVar}) : dVar.v;
    }

    public static /* synthetic */ ViewPager i(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager) ipChange.ipc$dispatch("f5b80946", new Object[]{dVar}) : dVar.d;
    }

    public static /* synthetic */ a j(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f114fb96", new Object[]{dVar}) : dVar.e;
    }

    public static /* synthetic */ TabManager.TabMarketing k(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TabManager.TabMarketing) ipChange.ipc$dispatch("a0ec302b", new Object[]{dVar}) : dVar.B;
    }

    public d(Context context, boolean z, Object obj, Intent intent) {
        boolean z2 = false;
        TLog.loge("LiveHome", "dynamic test!!!");
        g.c("tbLiveChannelTabs_NewHomePage", null);
        this.c = context;
        this.t = intent;
        sqt sqtVar = this.w;
        sqtVar.f33847a = obj;
        sqtVar.h = intent;
        sqtVar.b = z;
        if (intent != null) {
            sqtVar.d = intent.getData();
            if (this.w.d != null) {
                sqt sqtVar2 = this.w;
                sqtVar2.e = sqtVar2.d.getQueryParameter("livesource");
                sqt sqtVar3 = this.w;
                sqtVar3.f = sqtVar3.d.getQueryParameter("spm");
                sqt sqtVar4 = this.w;
                sqtVar4.g = sqtVar4.d.getQueryParameter("tabSpm");
                sqt sqtVar5 = this.w;
                sqtVar5.F = sqtVar5.d.getQueryParameter("selectedSingleLiveTab");
                if (TextUtils.isEmpty(this.w.g)) {
                    this.w.g = "a2141.28646552";
                }
            }
        }
        this.w.a((com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.a) this);
        this.w.a((c) this);
        this.w.a((sdt.b(context) || sdt.a(context)) ? true : z2);
    }

    static {
        kge.a(-122225587);
        kge.a(1038752494);
        kge.a(1104042418);
        kge.a(1597899295);
        kge.a(314066533);
        f14139a = 31;
        b = com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.IMG_BIE_TYPE;
    }

    private LiveHomeController2 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveHomeController2) ipChange.ipc$dispatch("8f21e2f4", new Object[]{this, str});
        }
        LiveHomeController2 liveHomeController2 = new LiveHomeController2();
        liveHomeController2.setTemplateCardListOwner(new com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.a(str));
        liveHomeController2.loadTemplate(1);
        DinamicSdkManager2 dinamicSdkManager2 = new DinamicSdkManager2(f.z().getDXBizType(), f14139a, b);
        dinamicSdkManager2.setIDinamicRegister(new DinamicRegister());
        dinamicSdkManager2.enableBusinessEnableDesignScale(this.c);
        liveHomeController2.setDinamicSdkManager(dinamicSdkManager2);
        dinamicSdkManager2.setLiveHomeController2(liveHomeController2);
        return liveHomeController2;
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.d
    public synchronized void a(boolean z, boolean z2) {
        Uri data;
        Uri data2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (i.Z()) {
            if (!this.N) {
                this.N = true;
                if (!this.i) {
                    TLog.loge("TaoLiveHomepage", "TaoLiveNewHomePage onCreate");
                    v();
                    if (this.t != null && (data2 = this.t.getData()) != null) {
                        try {
                            if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.j()) {
                                this.w.D = data2.getQueryParameter("dxAppVersion");
                            }
                            TBLiveHomePlugin.entryPageUrl = data2.toString();
                        } catch (Exception e) {
                            mfj.a("TaoLiveNewHomePage", "get livehomesource exp.", e);
                        }
                    }
                    this.w.a(a(this.w.D));
                    q();
                    this.v = o();
                    if (this.v != null) {
                        this.w.a(this.v);
                    }
                    this.w.o = f.B().createSmartLanding(this.c, "liveHomePage", this.w.e, this.w.d == null ? "" : this.w.d.toString(), null);
                    this.w.z = z();
                    this.i = true;
                    this.J = sdt.c(this.c);
                    this.K = h.a().a(this.c);
                    this.L = h.a().e(this.c);
                    if (this.O && !this.P) {
                        this.s.runOnUiThread(new Runnable() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.TaoLiveNewHomePage$2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (d.a(d.this)) {
                                } else {
                                    d dVar = d.this;
                                    dVar.a(d.b(dVar), d.c(d.this).c);
                                }
                            }
                        });
                    }
                }
            }
        } else {
            if (!this.i) {
                TLog.loge("TaoLiveHomepage", "TaoLiveNewHomePage onCreate");
                v();
                if (this.t != null && (data = this.t.getData()) != null) {
                    try {
                        if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.j()) {
                            this.w.D = data.getQueryParameter("dxAppVersion");
                        }
                        TBLiveHomePlugin.entryPageUrl = data.toString();
                    } catch (Exception e2) {
                        mfj.a("TaoLiveNewHomePage", "get livehomesource exp.", e2);
                    }
                }
                this.w.a(a(this.w.D));
                q();
                this.v = o();
                if (this.v != null) {
                    this.w.a(this.v);
                }
                this.w.o = f.B().createSmartLanding(this.c, "liveHomePage", this.w.e, this.w.d == null ? "" : this.w.d.toString(), null);
                this.w.z = z();
                this.i = true;
                this.J = sdt.c(this.c);
                this.K = h.a().a(this.c);
                this.L = h.a().e(this.c);
            }
        }
    }

    private void v() {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        Intent intent = this.t;
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        try {
            this.u = data.getQueryParameter("livesource");
            this.l = data.getQueryParameter("contentId");
            this.m = data.getQueryParameter(aw.PARAM_SUB_CONTENT_ID);
            this.q = data.getQueryParameter("channelType");
            if ("true".equals(this.w.F)) {
                this.q = "jingxuan,singleLiveTab";
            }
            String queryParameter = data.getQueryParameter(aw.PARAM_EXTEND);
            String queryParameter2 = data.getQueryParameter("rightInfo");
            String queryParameter3 = data.getQueryParameter("channelId");
            String queryParameter4 = data.getQueryParameter("channelType");
            String queryParameter5 = data.getQueryParameter("contentId");
            String queryParameter6 = data.getQueryParameter("scm");
            String queryParameter7 = data.getQueryParameter("spm");
            String queryParameter8 = data.getQueryParameter("pvidUrl");
            String queryParameter9 = data.getQueryParameter("commonTransparentData");
            this.p = new JSONObject();
            this.p.put(aw.PARAM_EXTEND, (Object) queryParameter);
            this.p.put("rightInfo", (Object) queryParameter2);
            this.p.put("channelId", (Object) queryParameter3);
            this.p.put("channelType", (Object) queryParameter4);
            this.p.put("contentId", (Object) queryParameter5);
            this.p.put("scm", (Object) queryParameter6);
            this.p.put("spm", (Object) queryParameter7);
            this.p.put("pvidUrl", (Object) queryParameter8);
            this.p.put("commonTransparentData", (Object) queryParameter9);
            this.n = data.getQuery();
        } catch (Exception e) {
            mfj.a("TaoLiveNewHomePage", "get uri params exp.", e);
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        TBLiveHomePlugin.entryPageUrl = "";
        Uri uri = null;
        Intent intent = this.t;
        if (intent != null) {
            uri = intent.getData();
        }
        if (uri != null) {
            this.z = uri.getQueryParameter(b.LAUNCHER_TYPE);
            this.M = uri.getQueryParameter("entityId");
        }
        TabManager.a().a(this.q, uri, this.w);
        mfm.a();
        pbt.a().a(this.c);
        pbt.a().b();
        mfg.a().a(this);
        android.taobao.windvane.embed.a.a("tbl_home_native_search_input_view", (Class<? extends BaseEmbedView>) TBLHomeNativeSearchInputView.class, false);
    }

    private boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
        }
        if (Looper.getMainLooper().getThread().getId() != Thread.currentThread().getId()) {
            g.c("tbLiveChannelTabs_asyncProc", null);
            try {
                mfj.b("TaoLiveNewHomePage", "tabMenu localCache read start");
                String str = (String) p.a(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.CACHE_KEY_HOME_TABS);
                if (l.a((CharSequence) str)) {
                    str = p.b(Globals.getApplication(), "live_flexalocal/tabmenu_cache.json");
                }
                String str2 = (String) p.a(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.CACHE_KEY_HOME_TABS_EVENT);
                if (str2 != null) {
                    this.w.b(JSONObject.parseObject(str2));
                }
                TabManager.JSONDataNew jSONDataNew = (TabManager.JSONDataNew) JSON.parseObject(str, TabManager.JSONDataNew.class);
                if (jSONDataNew != null) {
                    this.E = jSONDataNew.data;
                }
                if (this.E.hideBottomNavigation) {
                    this.w.m = 0;
                } else {
                    this.w.m = this.c.getResources().getDimensionPixelOffset(R.dimen.homepage2024_bottom_tab_height);
                }
                this.v.put("bottomBarHeight", (Object) Float.valueOf(gbg.a(this.c, this.w.m)));
                ArrayList arrayList = new ArrayList();
                arrayList.add("taolive_discover_tab_container_2024");
                arrayList.add("taolive_discovery_live_banner_v2");
                arrayList.add("taolive_discovery_feed_goods_card_v2");
                arrayList.add("taolive_discovery_livemove_good_v2");
                arrayList.add("taolive_discovery_flow_banner_v2");
                arrayList.add("taolive_discovery_feed_live_v2");
                arrayList.add("taolive_discovery_feed_hotlist_card_v2");
                arrayList.add("taolive_discovery_head_card_2024");
                this.w.a().getDinamicSdkManager().preLoad(this.c, arrayList);
                return true;
            } catch (Exception e) {
                mfj.a("TaoLiveNewHomePage", "tabMenu local data read exp", e);
            }
        }
        g.c("tbLiveChannelTabs_asyncProc", null);
        return false;
    }

    private JSONObject o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83cd0896", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("tlHomePageOptimize", (Object) "true");
        jSONObject2.put("loadImgImprove", (Object) "true");
        jSONObject2.put("liveBackInsertCard", (Object) String.valueOf(i.P()));
        if (!l.a((CharSequence) this.z)) {
            jSONObject2.put(b.LAUNCHER_TYPE, (Object) this.z);
        }
        if (!l.a((CharSequence) this.M)) {
            jSONObject2.put("entityId", (Object) this.M);
        }
        jSONObject2.put("enablePad", (Object) Boolean.valueOf(sdt.b(this.c)));
        jSONObject2.put("appVersion", (Object) TaoLiveHomePageX.getAppVersion(this.w.D));
        jSONObject2.put("pad", (Object) Boolean.valueOf(sdt.b(this.c)));
        jSONObject2.put("aPad", (Object) Boolean.valueOf(sdt.b(this.c)));
        jSONObject2.put("foldDevice", (Object) Boolean.valueOf(sdt.a(this.c)));
        jSONObject2.put("flipDevice", (Object) Boolean.valueOf(com.taobao.android.autosize.l.m(this.c)));
        if (Login.checkSessionValid()) {
            jSONObject2.put(UserAbility.API_IS_LOGIN, (Object) "true");
        } else {
            jSONObject2.put(UserAbility.API_IS_LOGIN, (Object) "false");
        }
        Context context = this.c;
        if (context != null) {
            jSONObject2.put("width", (Object) Float.valueOf(com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a(context, h.a().a(this.c))));
            Context context2 = this.c;
            jSONObject2.put("statusBarHeight", (Object) Float.valueOf(com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a(context2, com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.e(context2))));
        }
        jSONObject2.put("isAllDX", (Object) "true");
        jSONObject2.put("channel_isAllDX", (Object) true);
        JSONObject p = p();
        jSONObject2.put("extendParamsRefresh", (Object) p.toJSONString());
        a(p);
        jSONObject2.put("extendParams", (Object) p.toJSONString());
        jSONObject2.put("extendParamsInfo", (Object) p);
        jSONObject2.put("hasReadCache", (Object) "0");
        jSONObject.putAll(jSONObject2);
        jSONObject.put("queryData", (Object) jSONObject2);
        jSONObject.put("transParam", (Object) this.p);
        jSONObject.put("originalQuery", (Object) this.o);
        Intent intent = this.t;
        if (intent != null && intent.getData() != null) {
            jSONObject.put("entryUrl", (Object) this.t.getData().toString());
        }
        jSONObject.put("sessionId", (Object) e.d());
        jSONObject.put("spmPre", (Object) this.w.f);
        jSONObject.put("livesourcePre", (Object) this.w.e);
        return jSONObject;
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject != null && !l.a((CharSequence) this.n)) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                for (String str : this.n.split("&")) {
                    String[] split = str.split("=");
                    if (split.length >= 2) {
                        jSONObject2.put(split[0], (Object) split[1]);
                    }
                }
                jSONObject.put("queryParams", (Object) jSONObject2);
                this.o = jSONObject2;
            } catch (Exception e) {
                mfj.a("TaoLiveNewHomePage", "addQueryParamsOnce exp..", e);
            }
        }
    }

    private JSONObject p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9774dc17", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageName", (Object) "Page_TaobaoLive");
        jSONObject.put("followCardTemplateName", (Object) com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.DX_FOLLOW_LIVE_CARD);
        jSONObject.put("addWhiteRoundCard", (Object) "true");
        jSONObject.put("sessionId", (Object) e.d());
        jSONObject.put("spmPre", (Object) this.w.f);
        jSONObject.put("livesourcePre", (Object) this.w.e);
        TBLocationDTO b2 = TBLocationClient.b();
        if (b2 != null) {
            jSONObject.put(noa.KEY_CITY_CODE, (Object) b2.cityCode);
            jSONObject.put(noa.KEY_CITY_NAME, (Object) b2.cityName);
        } else {
            k.c("Page_TaobaoLive", "getCacheLocationNull", new HashMap());
        }
        return jSONObject;
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.d
    public void a(AppCompatActivity appCompatActivity, boolean z) {
        sqt sqtVar;
        sqt sqtVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67a327d3", new Object[]{this, appCompatActivity, new Boolean(z)});
        } else if (i.Z()) {
            if (!this.O) {
                this.O = true;
                TLog.loge("TaoLiveHomepage", "TaoLiveNewHomePage createContentView");
                this.s = appCompatActivity;
                this.w.c = z;
                this.c = appCompatActivity;
                if (this.F == null) {
                    this.s.setContentView(R.layout.activity_tao_live_home_page2_flexalocal);
                    this.F = (FrameLayout) this.s.findViewById(R.id.taolive_home_root);
                }
            }
            if (!this.N || !this.i) {
                return;
            }
            if (this.v == null) {
                this.v = o();
                if (this.v != null) {
                    this.w.a(this.v);
                }
            }
            s();
            n();
            if (i.a() && (sqtVar2 = this.w) != null && sqtVar2.o != null) {
                this.w.o.a("channelType", this.j);
                this.w.o.a(g4.b.i, (ISmartLandingProxy.a) null);
            }
            com.taobao.android.livehome.plugin.atype.flexalocal.utils.h.a(this.s);
            try {
                LoginBroadcastHelper.registerLoginReceiver(this.c, this.y);
            } catch (Exception e) {
                mfj.a("TaoLiveNewHomePage", "register local broadcast exp.", e);
            }
            this.P = true;
        } else {
            this.s = appCompatActivity;
            this.w.c = z;
            this.c = appCompatActivity;
            if (this.v == null) {
                this.v = o();
                if (this.v != null) {
                    this.w.a(this.v);
                }
            }
            if (this.F == null) {
                this.s.setContentView(R.layout.activity_tao_live_home_page2_flexalocal);
                this.F = (FrameLayout) this.s.findViewById(R.id.taolive_home_root);
                s();
                n();
                if (i.a() && (sqtVar = this.w) != null && sqtVar.o != null) {
                    this.w.o.a("channelType", this.j);
                    this.w.o.a(g4.b.i, (ISmartLandingProxy.a) null);
                }
            }
            com.taobao.android.livehome.plugin.atype.flexalocal.utils.h.a(this.s);
            try {
                LoginBroadcastHelper.registerLoginReceiver(this.c, this.y);
            } catch (Exception e2) {
                mfj.a("TaoLiveNewHomePage", "register local broadcast exp.", e2);
            }
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        TLog.loge("TaoLiveHomepage", "TaoLiveNewHomePage checkDisplayCutout");
        sqt sqtVar = this.w;
        sqtVar.i = false;
        sqtVar.k = SystemBarDecorator.getStatusBarHeight(this.c);
        this.w.l = this.c.getResources().getDimensionPixelOffset(R.dimen.homepage2024_top_bar_height);
        if (this.v != null) {
            sqt sqtVar2 = this.w;
            sqtVar2.n = (int) com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a(this.c, Math.max(sqtVar2.k, this.w.j));
            int a2 = (int) (this.w.n + com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a(this.c, this.w.l));
            this.v.put("marginTop", (Object) Integer.valueOf(a2));
            this.v.put("stautsNavHeight", (Object) Integer.valueOf(a2));
            if (i.aa()) {
                this.w.H = this.c.getResources().getDimensionPixelOffset(R.dimen.homepage2024_new_search_bar_height);
                this.v.put("statusNavWithSearchbarHeight", (Object) Integer.valueOf((int) (((this.w.n + com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a(this.c, this.w.l)) + com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a(this.c, this.w.H)) - 2.0f)));
            }
            if (i.M()) {
                JSONObject jSONObject = this.v;
                Context context = this.c;
                jSONObject.put("height", (Object) Float.valueOf(gbg.a(context, com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a((Activity) context) - sdt.f)));
            } else {
                JSONObject jSONObject2 = this.v;
                Context context2 = this.c;
                jSONObject2.put("height", (Object) Float.valueOf(gbg.a(context2, com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a((Activity) context2))));
            }
        }
        if (!com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.k()) {
            if (sdt.g()) {
                t();
                return;
            } else if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.i() && i.Y()) {
                t();
                return;
            } else if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.d() && i.r()) {
                t();
                return;
            } else {
                this.F.post(new Runnable() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.d.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        d.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (d.d(d.this) == null || d.e(d.this)) {
                        } else {
                            d.a(d.this, true);
                            d.f(d.this);
                        }
                    }
                });
                return;
            }
        }
        this.F.post(new Runnable() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.d.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                d.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (d.d(d.this) == null || d.e(d.this)) {
                } else {
                    d.a(d.this, true);
                    d.d(d.this).post(new Runnable() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.d.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            AnonymousClass3.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                d.f(d.this);
                            }
                        }
                    });
                }
            }
        });
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.d
    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        super.a(intent);
        mfg.a().a(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_EVENT_ON_NEW_INTENT, intent);
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        a(this.B);
        k.a("ACTIVITY", this.w);
        this.x = true;
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.d
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        k.a("BACK_GROUND", this.w);
        this.x = false;
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.d
    public boolean a(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14b42c5", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4) {
            return false;
        }
        return h();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        sqt sqtVar = this.w;
        if (sqtVar != null && sqtVar.o != null) {
            if (this.w.o.a("leave", (ISmartLandingProxy.a) null)) {
                return;
            }
            Context context = this.c;
            if (!(context instanceof Activity)) {
                return;
            }
            ((Activity) context).finish();
            return;
        }
        Context context2 = this.c;
        if (!(context2 instanceof Activity)) {
            return;
        }
        ((Activity) context2).finish();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.c
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        ViewPager viewPager = this.d;
        if (viewPager != null && viewPager.getCurrentItem() != 0) {
            LiveNewTabView liveNewTabView = this.f;
            if (liveNewTabView != null) {
                liveNewTabView.setCurrentItem(0);
            }
            return true;
        }
        sqt sqtVar = this.w;
        return (sqtVar == null || sqtVar.o == null || !this.w.o.a("leave", (ISmartLandingProxy.a) null)) ? false : true;
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.d
    public void a(int i, int i2, Intent intent) {
        ViewPager viewPager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else if (!i.P() || i != 240 || (viewPager = this.d) == null || this.e == null) {
        } else {
            Fragment fragment = (Fragment) this.e.instantiateItem((ViewGroup) this.d, viewPager.getCurrentItem());
            if (!(fragment instanceof HomeSelectedContainerFragment)) {
                return;
            }
            ((HomeSelectedContainerFragment) fragment).onActivityResult(i, i2, intent);
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        BroadcastReceiver broadcastReceiver = this.y;
        if (broadcastReceiver != null) {
            LoginBroadcastHelper.unregisterLoginReceiver(this.c, broadcastReceiver);
            LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.y);
        }
        this.y = null;
        r();
        if (this.w.o != null) {
            this.w.o.a();
            this.w.o = null;
        }
        psb.a().a((Object) com.taobao.live.home.c.PLAY_PAGEID, false);
        sqt sqtVar = this.w;
        if (sqtVar != null && sqtVar.a() != null) {
            this.w.a().destroy();
        }
        Handler handler = this.r;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        mfg.a().b(this);
        TabManager.a().b();
        mfm.b();
        mfg.b();
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        this.d = (ViewPager) this.s.findViewById(R.id.live_fragment_vp);
        this.f = (LiveNewTabView) this.s.findViewById(R.id.live_tab);
        this.g = this.s.findViewById(R.id.live_home_bottom_line);
        this.h = (TUrlImageView) this.s.findViewById(R.id.live_marking_tab);
        LiveNewTabView liveNewTabView = this.f;
        if (liveNewTabView != null) {
            liveNewTabView.setVisibility(4);
            this.f.setOnTabClickListener(this);
        }
        TUrlImageView tUrlImageView = this.h;
        if (tUrlImageView == null) {
            return;
        }
        tUrlImageView.setSkipAutoSize(true);
        this.h.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.android.livehome.plugin.atype.flexalocal.d$4] */
    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        TLog.loge("TaoLiveHomepage", "TaoLiveNewHomePage getTabsNew");
        if (this.E != null) {
            g.c("tbLiveChannelTabs_sync", null);
            TabManager.JSONTabNew jSONTabNew = this.E;
            TabManager.a().a(jSONTabNew.bottomTab);
            TabManager.a().a(jSONTabNew.hideBottomNavigation);
            b(TabManager.a().e());
            b(TabManager.a().c());
            a(TabManager.a().d());
            return;
        }
        new AsyncTask() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.d.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
                if (str.hashCode() == -1325021319) {
                    super.onPostExecute(objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            {
                d.this = this;
            }

            @Override // android.os.AsyncTask
            public /* synthetic */ Object doInBackground(Object[] objArr) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
            }

            public TabManager.JSONTabNew a(Object[] objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (TabManager.JSONTabNew) ipChange2.ipc$dispatch("6fb51438", new Object[]{this, objArr});
                }
                try {
                    mfj.b("TaoLiveNewHomePage", "tabMenu localCache read start");
                    String str = (String) p.a(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.CACHE_KEY_HOME_TABS);
                    if (l.a((CharSequence) str)) {
                        mfj.b("TaoLiveNewHomePage", "tabMenu localDefault read start");
                        str = p.b(Globals.getApplication(), "live_flexalocal/tabmenu_cache.json");
                    }
                    TabManager.JSONDataNew jSONDataNew = (TabManager.JSONDataNew) JSON.parseObject(str, TabManager.JSONDataNew.class);
                    if (jSONDataNew == null) {
                        return null;
                    }
                    return jSONDataNew.data;
                } catch (Exception e) {
                    mfj.a("TaoLiveNewHomePage", "tabMenu local data read exp", e);
                    return new TabManager.JSONTabNew();
                }
            }

            @Override // android.os.AsyncTask
            public void onPostExecute(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b105c779", new Object[]{this, obj});
                    return;
                }
                super.onPostExecute(obj);
                if (obj instanceof TabManager.JSONTabNew) {
                    TabManager.JSONTabNew jSONTabNew2 = (TabManager.JSONTabNew) obj;
                    TabManager.a().a(jSONTabNew2.bottomTab);
                    TabManager.a().a(jSONTabNew2.hideBottomNavigation);
                }
                if (TabManager.a().e()) {
                    d.c(d.this).m = 0;
                } else {
                    d.c(d.this).m = d.g(d.this).getResources().getDimensionPixelOffset(R.dimen.homepage2024_bottom_tab_height);
                }
                d.h(d.this).put("bottomBarHeight", (Object) Float.valueOf(gbg.a(d.g(d.this), d.c(d.this).m)));
                d.b(d.this, TabManager.a().e());
                d.a(d.this, TabManager.a().c());
                d.b(d.this, TabManager.a().d());
            }
        }.execute(new Object[0]);
        g.c("tbLiveChannelTabs_async", null);
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.A = z;
        LiveNewTabView liveNewTabView = this.f;
        if (liveNewTabView == null) {
            return;
        }
        if (z) {
            liveNewTabView.setVisibility(8);
            this.g.setVisibility(8);
            return;
        }
        liveNewTabView.setVisibility(0);
        this.g.setVisibility(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x008e, code lost:
        if (r11.equals("com.taobao.taolive.update.bottom.update") != false) goto L11;
     */
    @Override // tb.mff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLiveEvent(java.lang.String r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.livehome.plugin.atype.flexalocal.d.onLiveEvent(java.lang.String, java.lang.Object):void");
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        TabManager.JSONDataNew jSONDataNew = (TabManager.JSONDataNew) JSON.parseObject(str, TabManager.JSONDataNew.class);
        if (jSONDataNew != null) {
            this.E = jSONDataNew.data;
        }
        List<TabManager.TabBottom> c = TabManager.a().c();
        if (this.E.bottomTab == null || this.E.bottomTab.size() != c.size()) {
            w();
            return;
        }
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).isSelected) {
                this.E.bottomTab.set(i, c.get(i));
            }
        }
        for (int i2 = 0; i2 < this.E.bottomTab.size(); i2++) {
            TabManager.TabBottom tabBottom = this.E.bottomTab.get(i2);
            if (tabBottom != null && !tabBottom.isSelected) {
                LiveNewTabView.b bVar = new LiveNewTabView.b();
                bVar.a(tabBottom.name);
                if (TextUtils.isEmpty(tabBottom.androidNormalColor)) {
                    tabBottom.androidNormalColor = "#000000";
                }
                try {
                    bVar.a(Color.parseColor(tabBottom.androidNormalColor));
                } catch (Exception unused) {
                    bVar.a(Color.parseColor("#000000"));
                }
                bVar.b(tabBottom.androidNormalIcon);
                if (TextUtils.isEmpty(tabBottom.androidPressedColor)) {
                    tabBottom.androidPressedColor = "#FF3344";
                }
                try {
                    bVar.b(Color.parseColor(tabBottom.androidPressedColor));
                } catch (Exception unused2) {
                    bVar.b(Color.parseColor("#FF3344"));
                }
                bVar.c(tabBottom.androidPressedIcon);
                this.f.updateTab(i2, bVar);
            }
        }
        TabManager.a().a(this.E.bottomTab);
        this.e.a(this.E.bottomTab);
        this.e.notifyDataSetChanged();
        w();
    }

    private void d(String str) {
        boolean z;
        int parseInt;
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (this.f != null) {
            TabManager.JSONDataNew jSONDataNew = (TabManager.JSONDataNew) JSON.parseObject(str, TabManager.JSONDataNew.class);
            if (jSONDataNew != null) {
                this.E = jSONDataNew.data;
            }
            List<TabManager.TabBottom> list = this.E.bottomTab;
            int i2 = 0;
            while (i2 < list.size()) {
                TabManager.TabBottom tabBottom = list.get(i2);
                if (tabBottom != null && tabBottom.subscriptInfo != null) {
                    String format = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance(Locale.CHINA).getTime());
                    int intValue = tabBottom.subscriptInfo.getInteger("exposeTimes").intValue();
                    String string = tabBottom.subscriptInfo.getString("id");
                    if (!TextUtils.isEmpty(j.a("tabCornerIdList"))) {
                        String[] split = j.a("tabCornerIdList").split(",");
                        int i3 = 0;
                        while (true) {
                            if (i3 >= split.length) {
                                z = false;
                                break;
                            }
                            String str2 = split[i3];
                            if (string.equals(str2)) {
                                String[] split2 = j.a(str2).split("_");
                                if (split2.length == 2) {
                                    if (!format.equals(split2[0]) && intValue > 0) {
                                        for (String str3 : split) {
                                            j.b(str3);
                                        }
                                        j.a("tabCornerIdList", str2);
                                        j.a(str2, format + "_1");
                                        this.f.setTabCornerMark(i2, tabBottom);
                                    } else {
                                        if (Integer.parseInt(split2[1]) < intValue) {
                                            this.f.setTabCornerMark(i2, tabBottom);
                                        }
                                        j.a(str2, format + "_" + (parseInt + 1));
                                    }
                                }
                                z = true;
                            } else {
                                i3++;
                            }
                        }
                        if (!z) {
                            j.a("tabCornerIdList", j.a("tabCornerIdList") + "," + string);
                            j.a(string, format + "_1");
                            this.f.setTabCornerMark(i2, tabBottom);
                            i2++;
                            i = 1;
                        }
                    } else if (intValue > 0) {
                        j.a("tabCornerIdList", string);
                        j.a(string, format + "_" + i);
                        this.f.setTabCornerMark(i2, tabBottom);
                    }
                }
                i2++;
                i = 1;
            }
        }
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.LiveNewTabView.a
    public void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
            return;
        }
        ViewPager viewPager = this.d;
        if (viewPager != null) {
            viewPager.setCurrentItem(i, false);
        }
        this.I = i;
        List<TabManager.TabBottom> c = TabManager.a().c();
        if (c == null || i < 0 || i >= c.size()) {
            return;
        }
        this.w.B = c.get(i);
        c.get(i).isSelected = true;
        this.f.setTabCornerMark(i, this.w.B);
        if (this.w.B.tabUT != null) {
            Map<String, String> b2 = b(this.w.B.tabUT.getString("spm"));
            if (this.w.B.subscriptInfo != null) {
                String string = this.w.B.subscriptInfo.getString("id");
                if (!TextUtils.isEmpty(j.a(string))) {
                    if (Integer.parseInt(j.a(string).split("_")[1]) > this.w.B.subscriptInfo.getInteger("exposeTimes").intValue()) {
                        b2.put("isCorner", "2");
                    } else {
                        b2.put("isCorner", "1");
                    }
                }
            } else {
                b2.put("isCorner", "2");
            }
            g.a(this.w.B.tabUT.getString(com.taobao.android.weex_framework.util.a.ATOM_EXT_button), b2);
        }
        k.a("CHANGE_TAB", this.w);
    }

    private boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue();
        }
        if (!i.H()) {
            return false;
        }
        return com.taobao.android.livehome.plugin.atype.flexalocal.utils.a.d();
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.LiveNewTabView.a
    public void b(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f6b49da", new Object[]{this, view, new Integer(i)});
            return;
        }
        ViewPager viewPager = this.d;
        if (viewPager == null || this.e == null) {
            return;
        }
        int currentItem = viewPager.getCurrentItem();
        Fragment fragment = (Fragment) this.e.instantiateItem((ViewGroup) this.d, currentItem);
        if (fragment instanceof HomeSelectedContainerFragment) {
            if (!y() || this.f == null) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (((float) (currentTimeMillis - this.D)) < i.I() * 1000.0f) {
                return;
            }
            this.D = currentTimeMillis;
            View tabView = this.f.getTabView(currentItem);
            if (tabView == null) {
                return;
            }
            n.a(tabView);
            ((HomeSelectedContainerFragment) fragment).refreshCurrentPage();
            List<TabManager.TabBottom> c = TabManager.a().c();
            if (c == null || i < 0 || i >= c.size()) {
                return;
            }
            this.w.B = c.get(i);
            if (this.w.B.tabUT == null) {
                return;
            }
            g.a("Bottom_HomePageTab_Refresh", b(this.w.B.tabUT.getString("spm")));
        } else if (!(fragment instanceof HomeNormalFragment)) {
        } else {
            ((HomeNormalFragment) fragment).refreshCurrentPage();
        }
    }

    private void a(List<TabManager.TabMarketing> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null || list.size() <= 0 || this.h == null || TabManager.a().e() || !i.d()) {
        } else {
            this.B = list.get(0);
            TabManager.TabMarketing tabMarketing = this.B;
            if (tabMarketing == null) {
                return;
            }
            if (!l.a((CharSequence) tabMarketing.endTime)) {
                try {
                    if (Calendar.getInstance(Locale.CHINA).getTime().getTime() > new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(this.B.endTime).getTime()) {
                        return;
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            if (!TextUtils.isEmpty(this.B.androidBackGroundPic)) {
                this.C = true;
                if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.TAB_SINGLELIVE.equals(this.k)) {
                    this.h.setVisibility(8);
                } else {
                    this.h.setVisibility(0);
                }
                this.h.setImageUrl(this.B.androidBackGroundPic);
                this.f.reLayoutAdaptiveMarketing();
                a(this.B);
            }
            this.h.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    d.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (d.i(d.this) == null || d.j(d.this) == null || d.k(d.this) == null || !d.k(d.this).jumpOut || TextUtils.isEmpty(d.k(d.this).jumpUrl)) {
                    } else {
                        Nav.from(Globals.getApplication()).toUri(d.k(d.this).jumpUrl);
                        if (d.k(d.this).tabUT == null) {
                            return;
                        }
                        String string = d.k(d.this).tabUT.getString(com.taobao.android.weex_framework.util.a.ATOM_EXT_button);
                        d dVar = d.this;
                        g.a(string, d.a(dVar, d.k(dVar).tabUT.getString("spm")));
                    }
                }
            });
        }
    }

    private void a(TabManager.TabMarketing tabMarketing) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98d53815", new Object[]{this, tabMarketing});
        } else if (!this.C || tabMarketing.tabUT == null) {
        } else {
            g.b(tabMarketing.tabUT.getString("show"), b(tabMarketing.tabUT.getString("spm")));
        }
    }

    private synchronized void c(List<TabManager.TabBottom> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
            return;
        }
        if (!this.G && list != null && this.f != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                TabManager.TabBottom tabBottom = list.get(i);
                LiveNewTabView.b bVar = new LiveNewTabView.b();
                bVar.a(tabBottom.name);
                if (TextUtils.isEmpty(tabBottom.androidNormalColor)) {
                    tabBottom.androidNormalColor = "#000000";
                }
                try {
                    bVar.a(Color.parseColor(tabBottom.androidNormalColor));
                } catch (Exception unused) {
                    bVar.a(Color.parseColor("#000000"));
                }
                bVar.b(tabBottom.androidNormalIcon);
                if (TextUtils.isEmpty(tabBottom.androidPressedColor)) {
                    tabBottom.androidPressedColor = "#FF3344";
                }
                try {
                    bVar.b(Color.parseColor(tabBottom.androidPressedColor));
                } catch (Exception unused2) {
                    bVar.b(Color.parseColor("#FF3344"));
                }
                bVar.c(tabBottom.androidPressedIcon);
                this.f.addTab(bVar);
            }
            this.G = true;
        }
    }

    private void b(List<TabManager.TabBottom> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (list == null || this.f == null || this.d == null) {
        } else {
            if (list.size() > 0) {
                this.w.B = list.get(0);
            }
            this.k = "";
            if (!l.a((CharSequence) this.q)) {
                String[] split = this.q.split(",");
                if (split.length > 0 && !l.a((CharSequence) split[0])) {
                    this.j = split[0];
                }
                if (split.length > 1 && !l.a((CharSequence) split[1])) {
                    this.k = split[1];
                }
            }
            c(list);
            this.d.setOffscreenPageLimit(list.size());
            if (!l.a((CharSequence) this.j) && this.j.equals("jingxuan") && l.a((CharSequence) this.k)) {
                this.k = "jingxuan";
            }
            this.e = new a(this.s, this.s.getSupportFragmentManager(), list, this.j, this.k, this.l, this.m, this.n, this.w);
            if (i.b() && !l.a((CharSequence) this.u)) {
                this.e.a(this.u);
            }
            this.d.setAdapter(this.e);
            this.f.reLayout();
            this.f.setCurrentItem(0);
            if (i.B()) {
                return;
            }
            w();
        }
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        List<TabManager.TabBottom> c = TabManager.a().c();
        if (c == null || TabManager.a().e()) {
            return;
        }
        int size = c.size();
        for (int i = 0; i < size; i++) {
            TabManager.TabBottom tabBottom = c.get(i);
            if (tabBottom.tabUT != null) {
                Map<String, String> b2 = b(tabBottom.tabUT.getString("spm"));
                if (tabBottom.subscriptInfo != null) {
                    String format = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance(Locale.CHINA).getTime());
                    String string = tabBottom.subscriptInfo.getString("id");
                    if (!TextUtils.isEmpty(j.a(string))) {
                        String[] split = j.a(string).split("_");
                        String str = split[0];
                        int parseInt = Integer.parseInt(split[1]);
                        if (format.equals(str) && parseInt >= tabBottom.subscriptInfo.getInteger("exposeTimes").intValue()) {
                            b2.put("isCorner", "2");
                        } else {
                            b2.put("isCorner", "1");
                        }
                    }
                } else {
                    b2.put("isCorner", "2");
                }
                g.b(tabBottom.tabUT.getString("show"), b2);
            }
        }
    }

    private Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", str);
        sqt sqtVar = this.w;
        if (sqtVar != null) {
            hashMap.put("entryLiveSource", sqtVar.e);
            hashMap.put("entrySpm", this.w.f);
        }
        return hashMap;
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.a
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        LiveNewTabView liveNewTabView = this.f;
        if (liveNewTabView != null) {
            liveNewTabView.setVisibility(8);
            this.g.setVisibility(8);
        }
        if (!this.C) {
            return;
        }
        this.h.setVisibility(8);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.a
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (this.A) {
        } else {
            LiveNewTabView liveNewTabView = this.f;
            if (liveNewTabView != null) {
                liveNewTabView.setVisibility(0);
                this.g.setVisibility(0);
            }
            if (!this.C) {
                return;
            }
            this.h.setVisibility(0);
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends FragmentStatePagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private List<TabManager.TabBottom> f14145a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private Context g;
        private String h;
        private sqt i;

        static {
            kge.a(84628583);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 50642664) {
                return new Integer(super.getItemPosition(objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(Context context, FragmentManager fragmentManager, List<TabManager.TabBottom> list, String str, String str2, String str3, String str4, String str5, sqt sqtVar) {
            super(fragmentManager);
            this.f14145a = new ArrayList();
            a(list);
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = context;
            this.i = sqtVar;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.h = str;
            }
        }

        public void a(List<TabManager.TabBottom> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
                return;
            }
            this.f14145a.clear();
            if (list == null) {
                return;
            }
            this.f14145a.addAll(list);
        }

        @Override // android.support.v4.app.FragmentStatePagerAdapter
        public Fragment getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("3c4466d5", new Object[]{this, new Integer(i)});
            }
            if (i < 0 || i >= this.f14145a.size()) {
                return HomeNormalFragment.newInstance(new Bundle(), this.i);
            }
            Bundle bundle = new Bundle();
            if (this.f14145a.get(i) != null) {
                String str = this.f14145a.get(i).channelType;
                bundle.putSerializable(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_TAB_BOTTOM, this.f14145a.get(i));
                bundle.putString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_TYPE, str);
                bundle.putInt(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_ID, this.f14145a.get(i).channelId);
                bundle.putString("entryLiveSource", this.h);
                bundle.putInt(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_POSITION, i);
                bundle.putString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_JUMP_URL, this.f14145a.get(i).jumpUrl);
                bundle.putString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_TAB_TITLE_NAME, this.f14145a.get(i).name);
                bundle.putString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_ANDROID_NORMAL_ICON, this.f14145a.get(i).androidNormalIcon);
                bundle.putString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_BUSINESS_ANDROID_PRESSED_ICON, this.f14145a.get(i).androidPressedIcon);
                if (mfn.a(this.b, str)) {
                    bundle.putString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.START_CONTENT_ID, this.d);
                    bundle.putString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.START_SUB_CONTENT_ID, this.e);
                    bundle.putString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.BUNDLE_QUERY_PARAMS, this.f);
                }
            }
            TabManager.TabBottom tabBottom = this.f14145a.get(i);
            if (tabBottom.topTab != null && tabBottom.topTab.size() > 0) {
                bundle.putString(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.START_CHANNEL_TYPE, this.c);
                return HomeSelectedContainerFragment.newInstance(bundle, this.i);
            } else if (!l.a((CharSequence) tabBottom.pageType) && tabBottom.pageType.equals("h5")) {
                return HomeBottomH5Fragment.newInstance(bundle, this.i);
            } else {
                return HomeNormalFragment.newInstance(bundle, this.i);
            }
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            if (obj instanceof HomeBaseFragment2) {
                HomeBaseFragment2 homeBaseFragment2 = (HomeBaseFragment2) obj;
                if (this.f14145a.get(homeBaseFragment2.getPosition()).isSelected) {
                    return super.getItemPosition(obj);
                }
                String str = this.f14145a.get(homeBaseFragment2.getPosition()).jumpUrl;
                String str2 = this.f14145a.get(homeBaseFragment2.getPosition()).name;
                String str3 = this.f14145a.get(homeBaseFragment2.getPosition()).androidNormalIcon;
                String str4 = this.f14145a.get(homeBaseFragment2.getPosition()).androidPressedIcon;
                if (!TextUtils.isEmpty(str) && !str.equals(homeBaseFragment2.getJumpUrl())) {
                    return -2;
                }
                if (!TextUtils.isEmpty(str2) && !str2.equals(homeBaseFragment2.getTabTitleName())) {
                    return -2;
                }
                if (!TextUtils.isEmpty(str3) && !str3.equals(homeBaseFragment2.getAndroidNormalIcon())) {
                    return -2;
                }
                if (!TextUtils.isEmpty(str4) && !str4.equals(homeBaseFragment2.getAndroidPressedIcon())) {
                    return -2;
                }
            }
            return super.getItemPosition(obj);
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.f14145a.size();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.d
    public DinamicXEngine x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("7e73eda8", new Object[]{this});
        }
        sqt sqtVar = this.w;
        if (sqtVar != null && sqtVar.a() != null && this.w.a().getDinamicSdkManager() != null) {
            return this.w.a().getDinamicSdkManager().getDinamicEngine();
        }
        return null;
    }

    @Override // com.taobao.android.live.plugin.proxy.livehome.d
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.c();
        sqt sqtVar = this.w;
        if (sqtVar != null) {
            sqtVar.c(z);
        }
        try {
            if (this.s.getWindow().getDecorView().getVisibility() == 0) {
                c(z);
            }
            if (this.f != null) {
                this.f.reLayout();
                if (this.B != null && !TextUtils.isEmpty(this.B.androidBackGroundPic)) {
                    this.f.reLayoutAdaptiveMarketing();
                }
            }
            if (this.e == null || this.d == null) {
                return;
            }
            Fragment fragment = (Fragment) this.e.instantiateItem((ViewGroup) this.d, this.I);
            if (!(fragment instanceof HomeBaseFragment2)) {
                return;
            }
            ((HomeBaseFragment2) fragment).onScreenOrientationChange(z);
        } catch (Exception e) {
            TLog.loge("TaoLiveNewHomePage", "onScreenOrientationChange is error," + e.getMessage());
        }
    }

    private void c(boolean z) {
        sqt sqtVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (this.d != null && this.e != null && this.F != null && (sqtVar = this.w) != null && sqtVar.a() != null && this.w.a().getDinamicSdkManager() != null) {
            TLog.loge("TaoLiveHomepage", "refreshRootView 0");
            if (sdt.a(this.c)) {
                if (z == this.J && this.K == h.a().a(this.c)) {
                    TLog.loge("TaoLiveHomepage", "refreshRootView 1");
                    return;
                }
            } else if (sdt.b(this.c) && this.K == h.a().a(this.c) && this.L == h.a().e(this.c)) {
                TLog.loge("TaoLiveHomepage", "refreshRootView 1");
                return;
            }
            TLog.loge("TaoLiveHomepage", "refreshRootView 2");
            ViewPager viewPager = this.d;
            if (viewPager == null || this.e == null) {
                return;
            }
            int childCount = viewPager.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Fragment fragment = (Fragment) this.e.instantiateItem((ViewGroup) this.d, i);
                if (fragment instanceof HomeBaseFragment2) {
                    ((HomeBaseFragment2) fragment).refreshFragment();
                }
            }
            this.K = h.a().a(this.c);
            this.L = h.a().e(this.c);
            this.J = z;
        }
    }
}
