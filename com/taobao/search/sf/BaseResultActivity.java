package com.taobao.search.sf;

import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.util.ArrayMap;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.ah;
import com.taobao.android.address.themis.ThemisConfig;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.baseactivity.CustomBaseActivity;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.common.util.i;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.u;
import com.taobao.search.common.util.y;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.searchdoor.SearchDoorActivity;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.search.sf.widgets.searchbar.SearchBarTagBean;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.bridge.JSCallback;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.hyt;
import tb.imn;
import tb.imo;
import tb.iqt;
import tb.irg;
import tb.irt;
import tb.iru;
import tb.isr;
import tb.isv;
import tb.iuk;
import tb.ium;
import tb.iur;
import tb.kge;
import tb.kuh;
import tb.nnd;
import tb.nng;
import tb.nns;
import tb.nnz;
import tb.noa;
import tb.noo;
import tb.nsp;
import tb.ntb;
import tb.ntd;
import tb.ntj;
import tb.ntp;
import tb.nul;
import tb.nur;
import tb.nus;
import tb.nww;
import tb.nyc;
import tb.pop;
import tb.pqq;

/* loaded from: classes8.dex */
public abstract class BaseResultActivity extends CustomBaseActivity implements com.taobao.android.searchbaseframe.uikit.a, com.taobao.android.xsearchplugin.muise.f, com.taobao.android.xsearchplugin.muise.g, com.taobao.search.m3.more.pk.b, e, m, com.taobao.search.sf.widgets.searchbar.d, irg, ium, ntb, nus, pop {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String B;
    private k C;
    private ntd F;
    public Handler G;
    public int H;

    /* renamed from: a  reason: collision with root package name */
    private boolean f19416a;
    public com.taobao.search.refactor.m b;
    public CommonSearchContext c;
    public irt<? extends com.taobao.search.sf.datasource.c> d;
    private boolean f;
    private boolean g;
    private ViewGroup n;
    private com.taobao.search.sf.datasource.c o;
    private String p;
    private Map<String, String> q;
    private Map<String, String> r;
    private boolean s;
    private boolean t;
    private boolean v;
    private long w;
    private Toolbar x;
    public ArrayList<SearchBarTagBean> e = new ArrayList<>();
    public int i = 0;
    private boolean u = false;
    private volatile boolean y = false;
    private boolean z = false;
    private boolean A = false;
    public boolean k = false;
    public boolean l = false;
    private com.taobao.search.c D = new com.taobao.search.c();
    private com.taobao.search.m3.more.pk.d h = new com.taobao.search.m3.more.pk.d(this);
    private boolean E = false;
    private final boolean j = r.bs();
    private boolean I = false;
    private boolean J = false;
    public h m = new h();

    static {
        kge.a(487257957);
        kge.a(-1747045540);
        kge.a(1057278578);
        kge.a(1423858129);
        kge.a(-918003784);
        kge.a(1201942783);
        kge.a(1283854440);
        kge.a(-541163887);
        kge.a(754605064);
        kge.a(-2010683929);
        kge.a(-1119321216);
        kge.a(-629875645);
        kge.a(279820077);
        kge.a(-313475756);
    }

    public static /* synthetic */ Object ipc$super(BaseResultActivity baseResultActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
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
            case -244620436:
                super.setSupportActionBar((Toolbar) objArr[0]);
                return null;
            case 311605593:
                return super.getSupportActionBar();
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
            case 1553572081:
                return super.getSystemService((String) objArr[0]);
            case 1893326613:
                return new Boolean(super.onOptionsItemSelected((MenuItem) objArr[0]));
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79f30289", new Object[]{this, new Integer(i), new Integer(i2), intent})).booleanValue();
        }
        return false;
    }

    public JSONArray p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("abd36e67", new Object[]{this});
        }
        return null;
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        }
    }

    @Override // tb.nus
    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void a(BaseResultActivity baseResultActivity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbce280", new Object[]{baseResultActivity, bundle});
        } else {
            baseResultActivity.b(bundle);
        }
    }

    public static /* synthetic */ void a(BaseResultActivity baseResultActivity, Toolbar toolbar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b9186f", new Object[]{baseResultActivity, toolbar});
        } else {
            super.setSupportActionBar(toolbar);
        }
    }

    public static /* synthetic */ boolean a(BaseResultActivity baseResultActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("52b969d8", new Object[]{baseResultActivity})).booleanValue() : baseResultActivity.J;
    }

    public static /* synthetic */ void b(BaseResultActivity baseResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c30f773", new Object[]{baseResultActivity});
        } else {
            baseResultActivity.f();
        }
    }

    public static /* synthetic */ void b(BaseResultActivity baseResultActivity, Toolbar toolbar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88326e70", new Object[]{baseResultActivity, toolbar});
        } else {
            super.setSupportActionBar(toolbar);
        }
    }

    public static /* synthetic */ com.taobao.search.sf.datasource.c c(BaseResultActivity baseResultActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.sf.datasource.c) ipChange.ipc$dispatch("a6b3b882", new Object[]{baseResultActivity}) : baseResultActivity.o;
    }

    public static /* synthetic */ ViewGroup d(BaseResultActivity baseResultActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("b8749044", new Object[]{baseResultActivity}) : baseResultActivity.n;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : u.j();
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity
    public void setSupportActionBar(final Toolbar toolbar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f16b636c", new Object[]{this, toolbar});
        } else {
            runOnUiThread(new Runnable() { // from class: com.taobao.search.sf.BaseResultActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!BaseResultActivity.a(BaseResultActivity.this) || BaseResultActivity.this.G == null) {
                        BaseResultActivity.b(BaseResultActivity.this, toolbar);
                    } else {
                        Window.Callback callback = BaseResultActivity.this.getWindow().getCallback();
                        BaseResultActivity.a(BaseResultActivity.this, toolbar);
                        BaseResultActivity.this.getWindow().setCallback(callback);
                    }
                }
            });
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        this.J = true;
    }

    public CommonSearchContext aE_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CommonSearchContext) ipChange.ipc$dispatch("52947a6f", new Object[]{this}) : this.c;
    }

    @Override // android.support.v7.app.AppCompatActivity
    public ActionBar getSupportActionBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionBar) ipChange.ipc$dispatch("1292b959", new Object[]{this});
        }
        try {
            return super.getSupportActionBar();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.w = System.currentTimeMillis();
        Q();
        Handler handler = this.G;
        if (handler != null) {
            handler.post(new i() { // from class: com.taobao.search.sf.BaseResultActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        BaseResultActivity.a(BaseResultActivity.this, bundle);
                    }
                }
            });
        } else {
            b(bundle);
        }
        this.D.a((Activity) this, false);
        if (B()) {
            setTheme(R.style.Theme_SearchAnimation);
        }
        super.onCreate(bundle);
        if (this.G != null) {
            this.n = new DelegateLayout(this);
            setContentView(this.n);
            this.G.post(new i() { // from class: com.taobao.search.sf.BaseResultActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        BaseResultActivity.b(BaseResultActivity.this);
                    }
                }
            });
        } else {
            f();
        }
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        de.greenrobot.event.c.a().a(this);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            com.alibaba.android.split.k.a().c(this, "taowise_android_aar");
            com.alibaba.android.split.k.a().c(this, "tbsearch_remote");
        } catch (Exception unused) {
        }
        E();
        q();
        com.taobao.search.mmd.uikit.shopinfo.b.a();
        this.o.setPageTraceSession(this);
        if (this.k) {
            runOnUiThread(new Runnable() { // from class: com.taobao.search.sf.BaseResultActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        BaseResultActivity.c(BaseResultActivity.this).l();
                    }
                }
            });
        }
        com.taobao.search.searchdoor.sf.config.a aVar = com.taobao.search.searchdoor.sf.config.a.INSTANCE;
    }

    public void M() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        com.taobao.search.c cVar = this.D;
        View m = m();
        k kVar = this.C;
        if (kVar != null) {
            i = kVar.b();
        }
        cVar.a(m, i);
        int i2 = this.H;
        if (i2 == 1) {
            N();
            R();
        } else if (i2 == 2) {
            O();
        } else if (i2 != 3) {
        } else {
            P();
        }
    }

    private void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
        } else if (!StringUtils.isEmpty(this.p) || !r.cL()) {
        } else {
            if (this.q == null) {
                this.q = new HashMap();
                this.q.put("spm-cnt", S());
            }
            this.p = "Page_SearchItemList";
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this);
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, this.q);
            com.taobao.search.jarvis.c.a(this.p, (String) null, K(), this);
        }
    }

    private void b(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47681e4b", new Object[]{this, bundle});
            return;
        }
        this.f19416a = com.taobao.android.launcher.bootstrap.tao.ability.b.d(getIntent());
        this.g = !u.d();
        SearchSdk.init();
        com.taobao.search.d.a(getCore());
        i.c.a().a(r.bb());
        this.k = a(bundle);
        if (!this.k) {
            C();
            a();
        }
        com.taobao.search.sf.datasource.c cVar = this.o;
        if (cVar != null) {
            cVar.a(this.B, false);
        }
        D();
        F();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View] */
    private View m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93b2e9b6", new Object[]{this});
        }
        com.taobao.search.refactor.m mVar = this.b;
        if (mVar == null) {
            return null;
        }
        return mVar.getView();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        n();
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c == null) {
        } else {
            HashMap hashMap = new HashMap();
            String param = this.c.getParam("entryUtparam");
            if (!StringUtils.isEmpty(param)) {
                hashMap.put("entryUtparam", param);
            }
            String param2 = this.c.getParam(pqq.KEY_ENTRY_SCM);
            if (!StringUtils.isEmpty(param2)) {
                hashMap.put(pqq.KEY_ENTRY_SCM, param2);
            }
            String param3 = this.c.getParam("entrySpm");
            if (!StringUtils.isEmpty(param3)) {
                hashMap.put("entrySpm", param3);
            }
            if (hashMap.isEmpty()) {
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(this, JSON.toJSONString(hashMap));
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        CommonSearchContext commonSearchContext = this.c;
        if (commonSearchContext == null) {
            return;
        }
        String param = commonSearchContext.getParam(kuh.ALI_TRACK_ID);
        if (StringUtils.isEmpty(param)) {
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().addTPKCache(kuh.ALI_TRACK_ID, param);
    }

    private boolean a(Bundle bundle) {
        com.taobao.search.mmd.rebuild.d a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b668f70", new Object[]{this, bundle})).booleanValue();
        }
        if (bundle == null) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pageName", (Object) bundle.getString(com.taobao.search.mmd.rebuild.e.EXTRA_REBUILD_PAGE, ""));
        jSONObject.put("tabName", (Object) bundle.getString(com.taobao.search.mmd.rebuild.e.EXTRA_REBUILD_TAB, ""));
        i.c.a().a(jSONObject);
        if (!r.bv()) {
            return false;
        }
        String string = bundle.getString(com.taobao.search.mmd.rebuild.e.EXTRA_REBUILD_TOKEN, "");
        if (!StringUtils.isEmpty(string) && (a2 = com.taobao.search.mmd.rebuild.e.a(string)) != null && a2.a() != null) {
            this.c = a2.a();
            if (a2.d()) {
                this.o = new com.taobao.search.refactor.j(a2.b(), true, getCore(), new nng(new nul("PageRebuild")));
                com.taobao.search.refactor.g gVar = new com.taobao.search.refactor.g(getCore());
                com.taobao.search.sf.datasource.c cVar = this.o;
                gVar.b = (com.taobao.search.refactor.j) cVar;
                ((com.taobao.search.refactor.j) cVar).a(gVar);
                ((com.taobao.search.refactor.j) this.o).m();
                this.e = a2.c();
                this.o.getCurrentParam().setParam(k.a.a(k.a.PARAM_KEY_LIST_START_INDEX), String.valueOf(((nsp) this.o).S()));
                return true;
            }
        }
        return false;
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        Map<String, String> a2 = com.taobao.android.searchbaseframe.util.f.a(getIntent());
        c(a2);
        if (!a2.containsKey(noa.KEY_SRP_SEARCH_BAR_TAG_STYLE) && u.e()) {
            a2.put(noa.KEY_SRP_SEARCH_BAR_TAG_STYLE, "true");
        }
        if (!SearchDoorActivity.a(getIntent()) && com.alibaba.ability.localization.b.f()) {
            this.I = u.b();
        }
        a2.put(noa.KEY_TB_2024, String.valueOf(this.I));
        b(a2, true);
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        com.taobao.search.sf.datasource.c cVar = this.o;
        return cVar != null ? cVar.getKeyword() : "";
    }

    private void b(Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa99d9d8", new Object[]{this, map, new Boolean(z)});
            return;
        }
        nur.a(this);
        if (map == null) {
            this.c = CommonSearchContext.fromIntent(getIntent());
        } else {
            this.c = CommonSearchContext.fromMap(map);
        }
        if (StringUtils.isEmpty(this.c.getParam(noa.KEY_SEARCH_ELDER_HOME_OPEN))) {
            this.c.setParam(noa.KEY_SEARCH_ELDER_HOME_OPEN, String.valueOf(com.taobao.search.mmd.util.j.INSTANCE.b()));
            this.c.setParam(noa.KEY_GRAY_HAIR, String.valueOf(com.taobao.search.mmd.util.j.INSTANCE.b()));
        }
        this.c.init();
        com.taobao.search.sf.datasource.c cVar = null;
        if (z) {
            cVar = nnz.a().a(this.c.getDatasourceToken());
        }
        if (cVar != null) {
            com.taobao.android.searchbaseframe.util.k.e("BaseResultActivity", "存在预加载datasource");
            this.o = cVar;
        } else {
            com.taobao.android.searchbaseframe.util.k.e("BaseResultActivity", "不存在预加载datasource，创建新的datasource");
            this.o = com.taobao.search.sf.datasource.e.a(true, this.c, getCore());
        }
        if (this.f19416a) {
            this.o.setParam("isPassiveLaunch", "true");
            this.o.setParam("isPreloadRequest", String.valueOf(!this.g));
        }
        if (z) {
            com.taobao.search.sf.datasource.c cVar2 = this.o;
            cVar2.r = this.w;
            cVar2.s = this.f19416a;
        }
        b(this.o);
        this.o.subscribePreSearch(this, -10);
        if (this.o.getSrpLifeCycleWatcher() != null) {
            this.o.getSrpLifeCycleWatcher().b(this.o instanceof com.taobao.search.refactor.j);
        }
        if (!this.o.isFirstSearchDone()) {
            if (this.f19416a && !this.f && this.g) {
                com.taobao.android.searchbaseframe.util.k.d("BaseResultActivity", "海关极简链路唤端，且需要等待换链完成，onCreate中不发起请求", new Object[0]);
            } else {
                com.taobao.android.searchbaseframe.util.k.e("BaseResultActivity", "首次搜索，发起请求");
                this.o.t();
                int b = com.taobao.search.mmd.util.d.b(this.c.getParam(k.a.PARAM_KEY_COMBO_PAGE), -1);
                if (b > 0) {
                    this.o.doNewSearchWithAssignPage(b);
                } else {
                    this.o.doNewSearch();
                }
            }
        } else {
            com.taobao.android.searchbaseframe.util.k.e("BaseResultActivity", "非首次搜索，不请求");
        }
        if (this.o.isSubscribed(this)) {
            return;
        }
        this.o.subscribe(this);
    }

    public void onEventMainThread(isv.k kVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a107c02", new Object[]{this, kVar});
        } else if (((CommonSearchResult) this.o.getTotalSearchResult()).newSearch || this.F == null || !r.bA()) {
        } else {
            iuk b = this.F.b();
            if (!(b instanceof com.taobao.android.xsearchplugin.muise.o)) {
                return;
            }
            com.taobao.android.xsearchplugin.muise.o oVar = (com.taobao.android.xsearchplugin.muise.o) b;
            if (!(oVar.getModel().d() instanceof com.taobao.search.sf.datasource.c)) {
                return;
            }
            com.taobao.search.sf.datasource.c cVar = (com.taobao.search.sf.datasource.c) oVar.getModel().d();
            if (cVar.getTotalSearchResult() == 0) {
                return;
            }
            if (((CommonSearchResult) cVar.getTotalSearchResult()).noResultMod == null) {
                i = ((CommonSearchResult) cVar.getTotalSearchResult()).getTotalResult();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("totalResults", (Object) String.valueOf(i));
            this.F.a("searchFinish", jSONObject);
        }
    }

    private void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
            return;
        }
        String remove = map.remove(com.taobao.search.common.util.k.KEY_SEARCH_BAR_TAG);
        if (StringUtils.isEmpty(remove)) {
            return;
        }
        try {
            JSONArray parseArray = JSON.parseArray(remove);
            if (parseArray == null) {
                return;
            }
            StringBuilder sb = new StringBuilder(map.get("q"));
            for (int i = 0; i < parseArray.size(); i++) {
                SearchBarTagBean fromJson = SearchBarTagBean.fromJson(parseArray.getJSONObject(i));
                if (fromJson != null) {
                    this.e.add(fromJson);
                    Map<String, String> params = fromJson.getParams();
                    if (params != null) {
                        map.putAll(params);
                    }
                    String q = fromJson.getQ();
                    if (!StringUtils.isEmpty(q)) {
                        sb.append(" ");
                        sb.append(q);
                    }
                    map.put("onTag", fromJson.getDescription());
                    map.put("tagAction", ThemisConfig.SCENE_SELECT);
                }
            }
            map.put(noa.KEY_TAG_SEARCH_KEYWORD, sb.toString());
        } catch (Exception unused) {
        }
    }

    private void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48af458", new Object[]{this});
            return;
        }
        try {
            if (getIntent().getBooleanExtra(noa.IS_IMMERSIVE, true)) {
                this.y = u.a();
            }
            this.B = com.taobao.search.sf.detailpre.a.b().b(false);
        } catch (Exception unused) {
            this.y = true;
        }
        try {
            com.taobao.search.mmd.util.g.a();
        } catch (Throwable unused2) {
            com.taobao.android.searchbaseframe.util.k.a("BaseResultActivity", "update country code error");
        }
    }

    private void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        this.s = true;
        this.t = r.J();
        this.v = com.taobao.android.tbtheme.kit.j.b();
        getCore().c().j().a(com.taobao.search.common.util.n.INSTANCE.i());
        getCore().c().j().h = com.taobao.search.common.util.n.INSTANCE.d();
        getCore().c().j().l = u.g();
        getCore().c().j().q = r.bU();
        r.C();
        com.taobao.android.xsearchplugin.weex.weex.a.f16270a = r.am();
        com.taobao.search.common.util.n.INSTANCE.h();
        getCore().c().j().m = u.h();
        getCore().c().j().p = new n();
        imo.b().c().j().n = r.cg();
        imo.b().c().j().o = r.ch();
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        nnd.b();
        i();
        com.taobao.search.common.util.f.a(this);
        h();
    }

    public void h() {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        if (intent == null || (data = intent.getData()) == null || !StringUtils.isEmpty(data.getQueryParameter(noa.KEY_MONITOR_COUNTRY))) {
            return;
        }
        Uri.Builder buildUpon = data.buildUpon();
        buildUpon.appendQueryParameter(noa.KEY_MONITOR_COUNTRY, com.taobao.search.mmd.util.g.b());
        intent.setData(buildUpon.build());
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        com.taobao.android.searchbaseframe.util.k.e("BaseResultActivity", "checkAndUpdateInActivity");
        com.taobao.search.rainbow.a.b();
    }

    private void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
        } else if (r.i()) {
            com.taobao.android.searchbaseframe.util.k.e("BaseResultActivity", "从外部分享进行搜索禁用");
        } else {
            Intent intent = getIntent();
            String action = intent.getAction();
            String type = intent.getType();
            if (!"android.intent.action.SEND".equals(action) || !Constants.SHARETYPE.equals(type)) {
                return;
            }
            String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
            String stringExtra2 = intent.getStringExtra("android.intent.extra.TITLE");
            com.taobao.android.searchbaseframe.util.k.e("BaseResultActivity", "send: text=" + stringExtra + ", title=" + stringExtra2);
            if (StringUtils.isEmpty(stringExtra)) {
                return;
            }
            intent.putExtra("q", stringExtra);
            com.taobao.android.searchbaseframe.util.k.e("BaseResultActivity", "putExtra: q=" + stringExtra);
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
        this.A = false;
        if (a(intent)) {
            j().e().doNewSearch();
        } else if (this.f19416a) {
            if (b(intent)) {
                com.taobao.android.searchbaseframe.util.k.d("BaseResultActivity", "海关极简链路换链完成，跳出搜索。新链接：" + intent.getData(), new Object[0]);
                Nav.from(this).toUri(intent.getData());
                finish();
            } else if (!this.g || this.f) {
            } else {
                this.f = true;
                com.taobao.android.searchbaseframe.util.k.d("BaseResultActivity", "海关极简链路换链完成，发起首次搜索", new Object[0]);
                d();
                this.o.doNewSearch();
            }
        } else {
            F();
            a((Map<String, String>) null);
        }
    }

    private boolean b(Intent intent) {
        ComponentName component;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        Intent intentForUri = Nav.from(this).intentForUri(intent.getData());
        return (intentForUri == null || (component = intentForUri.getComponent()) == null || StringUtils.equals(component.getClassName(), MainSearchResultActivity.class.getName())) ? false : true;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.c == null || this.o == null) {
        } else {
            Map<String, String> a2 = com.taobao.android.searchbaseframe.util.f.a(getIntent());
            this.c.updateParams(a2);
            this.o.setParams(a2);
        }
    }

    public irt j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (irt) ipChange.ipc$dispatch("5444ea6a", new Object[]{this}) : this.d;
    }

    private boolean a(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        try {
            str = intent.getStringExtra(com.taobao.search.common.util.k.KEY_IS_REFRESH);
        } catch (Throwable unused) {
            str = "";
        }
        return "true".equals(str);
    }

    private void b(com.taobao.search.sf.datasource.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3cea77", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            List asList = Arrays.asList(r.ax());
            if (asList.contains("g_jump")) {
                this.u = false;
            } else {
                this.u = StringUtils.equals(this.c.getParam("g_jump"), "true");
                cVar.getCurrentParam().setParam(k.a.a(k.a.PARAM_KEY_IS_NEW_SEARCH_JUMP), String.valueOf(this.u));
            }
            if (!this.u) {
                return;
            }
            if (!asList.contains(k.a.PARAM_KEY_LIST_START_INDEX)) {
                cVar.getCurrentParam().setParam(k.a.a(k.a.PARAM_KEY_LIST_START_INDEX), this.c.getParam(k.a.PARAM_KEY_LIST_START_INDEX));
            }
            if (!asList.contains(k.a.PARAM_KEY_FIRST_RN)) {
                cVar.getCurrentParam().setParam(k.a.a(k.a.PARAM_KEY_FIRST_RN), this.c.getParam(k.a.PARAM_KEY_FIRST_RN));
            }
            if (asList.contains(k.a.PARAM_KEY_COMBO_PAGE)) {
                return;
            }
            cVar.getCurrentParam().setParam(k.a.a(k.a.PARAM_KEY_COMBO_PAGE), this.c.getParam(k.a.PARAM_KEY_COMBO_PAGE));
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (j() == null) {
        } else {
            j().a("showSceneLayer", (Object) true);
            j().a("standaloneSearchBar", (Object) true);
            j().a("cellListenerFactory", new ntj());
            j().a("trimMemory", Boolean.valueOf(u.k()));
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.u = StringUtils.equals(this.c.getParam("g_jump"), "true");
        this.z = !StringUtils.equals(this.c.getParam(noa.KEY_JARVIS_DISABLED, ""), "true");
        this.d = new irt<>(this.o, this.c);
        final com.taobao.search.refactor.j jVar = (com.taobao.search.refactor.j) this.o;
        jVar.h().d = this.c;
        jVar.h().a(this.e);
        jVar.h().a(this);
        this.d = jVar.h().d();
        jVar.h().a(p());
        o();
        this.d.a().c(this.w);
        final ViewGroup viewGroup = null;
        nns nnsVar = this.o instanceof nsp ? new nns(j.f19452a, (nsp) this.o) : null;
        jVar.h().a(nnsVar);
        a aVar = new a(this.d, this.o, nnsVar);
        if (this.c.isPopupSrp() && !this.E && r.cu()) {
            this.E = true;
            setContentView(R.layout.tbsearch_mini_search);
        }
        aVar.a(true);
        if (!r.g() && com.taobao.android.searchbaseframe.chitu.e.SIGNAL.equals(this.c.getKeyword())) {
            getCore().l().c(true);
            imn imnVar = com.taobao.search.jarvis.rcmd.a.f19066a;
            if (imnVar != null) {
                imnVar.l().c(true);
            }
        }
        jVar.h().d().a().c(this.w);
        com.taobao.search.refactor.f fVar = new com.taobao.search.refactor.f(getCore());
        if (ScreenType.IS_FOLDABLE || ScreenType.IS_PAD) {
            fVar.a(true);
        }
        if (this.c.isPopupSrp()) {
            if (this.c.isPopupDrag()) {
                fVar.am();
            } else if (this.c.isPopupIcon()) {
                fVar.an();
            } else if (this.c.isPopupCloseStyle()) {
                fVar.ao();
            }
        }
        fVar.h(aF_());
        fVar.s(true);
        if (this.c.isGallerySrp()) {
            fVar.c(0);
        }
        com.taobao.search.refactor.m mVar = this.b;
        if (mVar != null) {
            if (mVar.getView() != 0 && (((FrameLayout) this.b.getView()).getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup2 = (ViewGroup) ((FrameLayout) this.b.getView()).getParent();
                viewGroup2.removeView(this.b.getView());
                viewGroup = viewGroup2;
            }
            this.b.destroyAndRemoveFromParent();
        }
        final com.taobao.search.refactor.m mVar2 = new com.taobao.search.refactor.m(fVar, this, this, jVar.h().e(), null, new iur() { // from class: com.taobao.search.sf.BaseResultActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iur
            public void b(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91037249", new Object[]{this, view});
                }
            }

            @Override // tb.iur
            public void a(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9501e36a", new Object[]{this, view});
                    return;
                }
                ViewGroup viewGroup3 = viewGroup;
                if (viewGroup3 == null) {
                    ViewGroup viewGroup4 = (ViewGroup) BaseResultActivity.this.findViewById(R.id.fl_root_view);
                    if (viewGroup4 != null) {
                        viewGroup4.addView(view, 0, new ViewGroup.LayoutParams(-1, -1));
                        return;
                    } else if (BaseResultActivity.d(BaseResultActivity.this) != null) {
                        BaseResultActivity.d(BaseResultActivity.this).addView(view, new ViewGroup.LayoutParams(-1, -1));
                        return;
                    } else {
                        BaseResultActivity.this.setContentView(view);
                        return;
                    }
                }
                viewGroup3.addView(view, 0, new ViewGroup.LayoutParams(-1, -1));
            }
        });
        mVar2.ensureView();
        mVar2.w();
        mVar2.x();
        mVar2.h();
        mVar2.subscribeEvent(this);
        runOnUiThread(new com.taobao.android.searchbaseframe.util.i() { // from class: com.taobao.search.sf.BaseResultActivity.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.util.i
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                mVar2.a(jVar.h());
                if (r.bw() && r.e("preloadInitPage1")) {
                    mVar2.C();
                }
                BaseResultActivity baseResultActivity = BaseResultActivity.this;
                baseResultActivity.b = mVar2;
                baseResultActivity.b.attachToContainer();
                ((com.taobao.android.meta.structure.page.b) BaseResultActivity.this.b.J()).a();
                BaseResultActivity.this.M();
            }
        });
        if (this.c.isPopupSrp()) {
            k kVar = this.C;
            if (kVar != null) {
                kVar.a();
                this.C = new k(mVar2, this);
                this.C.a(false);
            } else {
                this.C = new k(mVar2, this);
                this.C.a(r());
            }
        }
        G();
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : !"false".equals(this.c.getParamIncludingGlobal("tbsearch_popup_animated"));
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue();
        }
        CommonSearchContext commonSearchContext = this.c;
        return commonSearchContext != null && commonSearchContext.isPopupSrp();
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (!(context instanceof BaseResultActivity)) {
            return false;
        }
        return ((BaseResultActivity) context).s();
    }

    public void a(AnimatorListenerAdapter animatorListenerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8f11b0", new Object[]{this, animatorListenerAdapter});
            return;
        }
        k kVar = this.C;
        if (kVar != null) {
            kVar.a(animatorListenerAdapter);
        } else {
            animatorListenerAdapter.onAnimationEnd(null);
        }
    }

    public void a(Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee00e457", new Object[]{this, map, new Boolean(z)});
            return;
        }
        b(map, z);
        q();
    }

    private void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        CommonSearchContext commonSearchContext = this.c;
        if (commonSearchContext == null || !(this instanceof MainSearchResultActivity) || !StringUtils.isEmpty(commonSearchContext.getKeyword()) || getIntent() == null) {
            return;
        }
        String param = this.c.getParam("from");
        StringBuilder sb = new StringBuilder();
        String dataString = getIntent().getDataString();
        if (!StringUtils.isEmpty(dataString)) {
            try {
                dataString = URLEncoder.encode(dataString, "utf-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        sb.append("url=");
        sb.append(dataString);
        sb.append(",from=");
        sb.append(param);
        TBS.Adv.ctrlClicked("Page_SearchItemList", CT.Button, "SearchEmptyKeyword", sb.toString());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        if (r0.equals("searchOption") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEventMainThread(tb.isr.c r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.search.sf.BaseResultActivity.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r7 = "4339768e"
            r0.ipc$dispatch(r7, r1)
            return
        L15:
            if (r7 == 0) goto Lb8
            java.lang.String r0 = r7.f29283a
            boolean r0 = android.text.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L21
            goto Lb8
        L21:
            java.lang.String r0 = r7.f29283a
            r1 = -1
            int r5 = r0.hashCode()
            switch(r5) {
                case -1346841084: goto L77;
                case -1289673356: goto L6d;
                case -906336856: goto L62;
                case 2161725: goto L58;
                case 443574479: goto L4d;
                case 674818956: goto L42;
                case 1733653986: goto L37;
                case 2014054120: goto L2c;
                default: goto L2b;
            }
        L2b:
            goto L82
        L2c:
            java.lang.String r2 = "refreshAuction"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L82
            r2 = 3
            goto L83
        L37:
            java.lang.String r2 = "tagSearch"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L82
            r2 = 2
            goto L83
        L42:
            java.lang.String r2 = "jumpToTab"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L82
            r2 = 5
            goto L83
        L4d:
            java.lang.String r2 = "showLeftBar"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L82
            r2 = 6
            goto L83
        L58:
            java.lang.String r3 = "searchOption"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L82
            goto L83
        L62:
            java.lang.String r2 = "search"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L82
            r2 = 0
            goto L83
        L6d:
            java.lang.String r2 = "closeLeftBar"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L82
            r2 = 7
            goto L83
        L77:
            java.lang.String r2 = "prepareCompassRequest"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L82
            r2 = 4
            goto L83
        L82:
            r2 = -1
        L83:
            switch(r2) {
                case 0: goto Lb3;
                case 1: goto La9;
                case 2: goto La3;
                case 3: goto L9d;
                case 4: goto L97;
                case 5: goto L91;
                case 6: goto L8b;
                case 7: goto L87;
                default: goto L86;
            }
        L86:
            goto Lb8
        L87:
            r6.c()
            goto Lb8
        L8b:
            com.alibaba.fastjson.JSONObject r7 = r7.b
            r6.g(r7)
            return
        L91:
            com.alibaba.fastjson.JSONObject r7 = r7.b
            r6.b(r7)
            return
        L97:
            com.alibaba.fastjson.JSONObject r7 = r7.b
            r6.c(r7)
            return
        L9d:
            com.alibaba.fastjson.JSONObject r7 = r7.b
            r6.d(r7)
            return
        La3:
            com.alibaba.fastjson.JSONObject r7 = r7.b
            r6.a(r7)
            return
        La9:
            com.alibaba.fastjson.JSONObject r0 = r7.b
            tb.isr$c$a r1 = r7.c
            tb.isr$c$a r7 = r7.d
            r6.a(r0, r1, r7)
            return
        Lb3:
            com.alibaba.fastjson.JSONObject r7 = r7.b
            r6.f(r7)
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.sf.BaseResultActivity.onEventMainThread(tb.isr$c):void");
    }

    private void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a56a742", new Object[]{this, jSONObject});
            return;
        }
        com.taobao.android.meta.structure.childpage.g k = k();
        if (k == null) {
            return;
        }
        k.a(jSONObject);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.android.meta.structure.childpage.g k = k();
        if (k == null) {
            return;
        }
        k.L();
    }

    private com.taobao.android.meta.structure.childpage.g k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.meta.structure.childpage.g) ipChange.ipc$dispatch("fe0cacb3", new Object[]{this});
        }
        com.taobao.search.refactor.m mVar = this.b;
        if (mVar != null) {
            return mVar.B();
        }
        return null;
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("tab");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        JSONObject b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "params");
        if (b != null) {
            for (Map.Entry<String, Object> entry : b.entrySet()) {
                this.c.setTabParams(string, entry.getKey(), entry.getValue().toString());
            }
        }
        com.taobao.search.refactor.m mVar = this.b;
        if (mVar == null) {
            return;
        }
        ((com.taobao.search.refactor.g) mVar.p()).a(string, b);
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String obj = jSONObject.remove("id").toString();
            if (StringUtils.isEmpty(obj)) {
                return;
            }
            com.taobao.search.sf.datasource.c cVar = (com.taobao.search.sf.datasource.c) ((iru) this.b.getModel()).b();
            CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
            ArrayMap arrayMap = new ArrayMap();
            if (commonSearchResult != null) {
                arrayMap.put("sessionid", commonSearchResult.getMainInfo().rn);
            }
            arrayMap.put(noa.KEY_GRAY_HAIR, String.valueOf(this.c.getBooleanParam(noa.KEY_SEARCH_ELDER_HOME_OPEN)));
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                String obj2 = entry.getValue().toString();
                if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(obj2)) {
                    arrayMap.put(key, obj2);
                }
            }
            cVar.K().a(obj, arrayMap);
        }
    }

    private void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            com.taobao.android.searchbaseframe.util.k.a("BaseResultActivity", "doRefreshAuction: paramsObject is null");
        } else {
            JSONObject b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "params");
            if (b == null) {
                com.taobao.android.searchbaseframe.util.k.a("BaseResultActivity", "doRefreshAuction: realParamsObject is null");
                return;
            }
            com.taobao.search.sf.datasource.c cVar = (com.taobao.search.sf.datasource.c) j().e();
            for (String str : b.keySet()) {
                String string = b.getString(str);
                if (string == null) {
                    string = "";
                }
                cVar.setParam(str, string);
            }
            cVar.doRefreshListSearch();
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (r.aw()) {
            e(jSONObject);
        } else {
            SearchBarTagBean fromJson = SearchBarTagBean.fromJson(jSONObject);
            if (fromJson == null) {
                return;
            }
            a(fromJson);
        }
    }

    private void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("q", this.c.getKeyword());
        d(hashMap);
        JSONArray jSONArray = new JSONArray();
        Iterator<SearchBarTagBean> it = this.e.iterator();
        while (it.hasNext()) {
            jSONArray.add(JSON.toJSON(it.next()));
        }
        jSONArray.add(jSONObject);
        hashMap.put(com.taobao.search.common.util.k.KEY_SEARCH_BAR_TAG, jSONArray.toJSONString());
        Nav.from(this).toUri(y.a(com.taobao.search.common.util.k.SEARCHLIST_H5, hashMap));
    }

    private void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9040aa3", new Object[]{this, jSONObject});
            return;
        }
        HashMap hashMap = new HashMap();
        d(hashMap);
        JSONObject b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "params");
        if (b != null) {
            for (String str : b.keySet()) {
                hashMap.put(str, b.getString(str));
            }
        }
        a(hashMap);
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        ArrayList<SearchBarTagBean> arrayList = this.e;
        if (arrayList != null) {
            arrayList.clear();
        }
        a(map, false);
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else {
            a(map, false);
        }
    }

    private void d(Map<String, String> map) {
        com.taobao.search.sf.datasource.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
        } else if (j() == null || (cVar = (com.taobao.search.sf.datasource.c) j().e()) == null) {
        } else {
            noo.a(map, cVar.getParamsSnapShot());
            if (s() && r.cu()) {
                map.put(noa.KEY_POP_UP_HEIGHT, this.c.getParam(noa.KEY_POP_UP_HEIGHT));
                map.put(noa.KEY_POP_UP, this.c.getParam(noa.KEY_POP_UP));
            }
            String tab = cVar.getTab();
            if (!StringUtils.isEmpty(tab)) {
                map.put("tab", tab);
            }
            String paramValue = cVar.getParamValue("m");
            if (!StringUtils.isEmpty(paramValue)) {
                map.put("m", paramValue);
            }
            String paramValue2 = cVar.getParamValue(noa.KEY_HAS_TAB);
            if (StringUtils.isEmpty(paramValue2)) {
                return;
            }
            map.put(noa.KEY_HAS_TAB, paramValue2);
        }
    }

    private void a(JSONObject jSONObject, isr.c.a aVar, isr.c.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212dece0", new Object[]{this, jSONObject, aVar, aVar2});
        } else if (jSONObject == null) {
            com.taobao.android.searchbaseframe.util.k.a("BaseResultActivity", "doNewSearch: paramsObject is null");
        } else {
            JSONObject b = com.taobao.android.searchbaseframe.util.a.b(jSONObject, "params");
            if (b == null) {
                com.taobao.android.searchbaseframe.util.k.a("BaseResultActivity", "doNewSearch: realParamsObject is null");
                return;
            }
            com.taobao.search.sf.datasource.c cVar = (com.taobao.search.sf.datasource.c) j().e();
            for (String str : b.keySet()) {
                String string = b.getString(str);
                if (string == null) {
                    string = "";
                }
                cVar.setParam(str, string);
                if (CommonSearchContext.sOtherTabWhiteList.contains(str)) {
                    aE_().setParam(str, string);
                }
            }
            cVar.setParam(noa.KEY_TB_2024, String.valueOf(this.I));
            cVar.doNewSearch();
        }
    }

    public void a(SearchBarTagBean searchBarTagBean) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0147f6e", new Object[]{this, searchBarTagBean});
        } else if (searchBarTagBean == null || this.e == null) {
        } else {
            if (StringUtils.equals(searchBarTagBean.getType(), "append")) {
                this.e.add(searchBarTagBean);
            } else if (StringUtils.equals(searchBarTagBean.getType(), "update")) {
                while (true) {
                    if (i >= this.e.size()) {
                        i = -1;
                        break;
                    } else if (StringUtils.equals(this.e.get(i).getType(), "update")) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == -1) {
                    this.e.add(searchBarTagBean);
                } else {
                    this.e.set(i, searchBarTagBean);
                }
            }
            a(searchBarTagBean, ThemisConfig.SCENE_SELECT);
        }
    }

    public void a(SearchBarTagBean searchBarTagBean, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8de9b8", new Object[]{this, searchBarTagBean, str});
            return;
        }
        ntp ntpVar = new ntp();
        d(ntpVar);
        String keyword = ((com.taobao.search.sf.datasource.c) j().e()).getKeyword();
        StringBuilder sb = new StringBuilder(keyword);
        Iterator<SearchBarTagBean> it = this.e.iterator();
        while (it.hasNext()) {
            SearchBarTagBean next = it.next();
            Map<String, String> params = next.getParams();
            if (params != null) {
                ntpVar.putAll(params);
            }
            String q = next.getQ();
            if (!StringUtils.isEmpty(q)) {
                sb.append(" ");
                sb.append(q);
            }
        }
        ntpVar.put("q", keyword);
        ntpVar.put(noa.KEY_TAG_SEARCH_KEYWORD, sb.toString());
        ntpVar.put("onTag", searchBarTagBean.getDescription());
        ntpVar.put("tagAction", str);
        b(ntpVar);
    }

    public void b(SearchBarTagBean searchBarTagBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8452ef0d", new Object[]{this, searchBarTagBean});
            return;
        }
        ArrayList<SearchBarTagBean> arrayList = this.e;
        if (arrayList == null || !arrayList.contains(searchBarTagBean)) {
            return;
        }
        this.e.remove(searchBarTagBean);
        a(searchBarTagBean, "cancel");
    }

    @Override // com.taobao.search.sf.widgets.searchbar.d
    public List<SearchBarTagBean> t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9378f1ec", new Object[]{this}) : this.e;
    }

    private void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        String str = this.p;
        if (StringUtils.isEmpty(str)) {
            com.taobao.android.searchbaseframe.util.k.e("BaseResultActivity", "currentPageName is null ");
            str = "Page_SearchItemList";
        }
        if (StringUtils.isEmpty(str)) {
            return;
        }
        setUTPageName(str);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, str);
    }

    private void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
            return;
        }
        Map<String, String> map = this.q;
        if (map == null) {
            return;
        }
        HashMap hashMap = new HashMap(map);
        String str = (String) hashMap.remove("utparam-cnt");
        if (!StringUtils.isEmpty(str)) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(this, str);
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
    }

    private void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
        } else if (this.r == null) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(this.r);
        }
    }

    public void onEventMainThread(iqt.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcdc9a1d", new Object[]{this, pVar});
            return;
        }
        String str = pVar.f29237a;
        if (StringUtils.isEmpty(str)) {
            com.taobao.android.searchbaseframe.util.k.a("BaseResultActivity", "pageName为空，不更新2001埋点");
        } else if (StringUtils.equals(str, this.p)) {
            com.taobao.android.searchbaseframe.util.k.e("BaseResultActivity", "pageName没有变化，不更新2001埋点，只更新properties");
            this.q = pVar.c;
            I();
        } else {
            if (!StringUtils.isEmpty(this.p)) {
                UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
                String str2 = this.p;
                Map<String, String> map = this.q;
                com.taobao.search.jarvis.c.b(str2, null, map != null ? new HashMap(map) : null, this);
            }
            this.p = pVar.f29237a;
            this.q = pVar.c;
            this.r = pVar.d;
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this);
            com.taobao.search.jarvis.c.a(this.p, (String) null, K(), this);
            L();
        }
    }

    private void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
            return;
        }
        com.taobao.search.refactor.m mVar = this.b;
        if (mVar != null) {
            mVar.onCtxResumeInternal();
        }
        u();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.H = 1;
        WXSDKEngine.setActivityNavBarSetter(new nyc(this));
        L();
        if (!StringUtils.isEmpty(this.p)) {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this);
        }
        N();
        if (!StringUtils.isEmpty(this.p)) {
            com.taobao.search.jarvis.c.a(this.p, (String) null, K(), this);
        }
        com.taobao.search.m3.e.Companion.b(this);
    }

    private Map<String, Object> K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f3704207", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("query", e());
        String param = this.c.getParam("lastQ");
        if (!StringUtils.isEmpty(param)) {
            hashMap.put("lastQuery", param);
        }
        return hashMap;
    }

    private void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        H();
        I();
        J();
    }

    private void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
            return;
        }
        com.taobao.search.refactor.m mVar = this.b;
        if (mVar == null) {
            return;
        }
        mVar.onCtxPauseInternal();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.H = 2;
        WXSDKEngine.setActivityNavBarSetter(null);
        O();
        if (!StringUtils.isEmpty(this.p)) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
        } else {
            CommonSearchContext commonSearchContext = this.c;
            if (commonSearchContext != null && !StringUtils.isEmpty(commonSearchContext.getChannelSrp())) {
                UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
                defaultTracker.pageAppearDonotSkip(this);
                defaultTracker.updatePageName(this, "Page_SearchItemList");
                HashMap hashMap = new HashMap();
                hashMap.put("spm-cnt", S());
                defaultTracker.updatePageProperties(this, hashMap);
                defaultTracker.pageDisAppear(this);
            }
        }
        com.taobao.search.mmd.util.b.f19191a = false;
        String str = this.p;
        Map<String, String> map = this.q;
        com.taobao.search.jarvis.c.b(str, null, map != null ? new HashMap(map) : null, this);
    }

    private String S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54a6b086", new Object[]{this});
        }
        String param = this.c.getParam("fallbackSpm");
        return StringUtils.isEmpty(param) ? "a2141.7631557.0.0" : param;
    }

    private void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
            return;
        }
        try {
            if (this.b != null) {
                this.b.destroyAndRemoveFromParent();
            }
        } catch (Exception e) {
            com.taobao.android.searchbaseframe.util.k.a("BaseResultActivity", "pageWidget销毁失败，请检查log", e);
        }
        if (this.o == null) {
            return;
        }
        com.taobao.android.searchbaseframe.util.k.e("BaseResultActivity", "destroy datasource: " + this.o);
        if (this.o.isSubscribed(this)) {
            this.o.unsubscribe(this);
        }
        this.o.destroy();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.H = 3;
        P();
        com.taobao.search.sf.detailpre.a.b().a(this.B, false);
        de.greenrobot.event.c.a().c(this);
        ntd ntdVar = this.F;
        if (ntdVar != null) {
            ntdVar.a();
        }
        com.taobao.search.m3.e.Companion.a(this);
        this.h.a();
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString("pageName", "n_search");
        bundle.putParcelable(hyt.ZZB_BUNDLE_KEY, bundle2);
        if (this.c != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("q", this.c.getParam("q"));
            bundle.putParcelable("extraInfo", bundle3);
        }
        return bundle;
    }

    @Override // tb.ium
    public imn getCore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("f78bd660", new Object[]{this}) : j.f19452a;
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4) {
            com.taobao.search.mmd.util.e.a("Back");
            supportFinishAfterTransition();
            overridePendingTransition(0, 0);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.taobao.tao.BaseActivity
    public Toolbar getToolbar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Toolbar) ipChange.ipc$dispatch("21834ebf", new Object[]{this}) : this.x;
    }

    public void a(Toolbar toolbar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3236d5b", new Object[]{this, toolbar});
        } else {
            this.x = toolbar;
        }
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70d9df15", new Object[]{this, menuItem})).booleanValue();
        }
        if (menuItem.getItemId() == 16908332 && Build.VERSION.SDK_INT >= 21) {
            onKeyDown(4, null);
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.taobao.tao.BaseActivity, com.taobao.uikit.immersive.ITBImmersive
    public boolean isImmersiveStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4bc6b0e", new Object[]{this})).booleanValue() : aF_();
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue() : super.onCreateOptionsMenu(menu);
    }

    @Override // com.taobao.android.searchbaseframe.uikit.a
    public boolean aF_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("87ffec85", new Object[]{this})).booleanValue() : this.y;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        com.taobao.search.refactor.m mVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (a(i, i2, intent) || r.k() || (mVar = this.b) == null) {
            return;
        }
        mVar.postEvent(nww.a.a(i, i2, intent));
    }

    public void b(String str, JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2fe811d", new Object[]{this, str, jSONObject, jSCallback, jSCallback2});
            return;
        }
        com.taobao.search.refactor.m mVar = this.b;
        if (mVar == null) {
            return;
        }
        mVar.postEvent(isr.c.a(str, jSONObject, com.taobao.android.xsearchplugin.weex.weex.b.a(jSCallback), com.taobao.android.xsearchplugin.weex.weex.b.a(jSCallback2)));
    }

    @Override // com.taobao.android.xsearchplugin.weex.weex.d.a
    public void a(String str, JSONObject jSONObject, JSCallback jSCallback, JSCallback jSCallback2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfcc897e", new Object[]{this, str, jSONObject, jSCallback, jSCallback2});
        } else {
            onEventMainThread(isr.c.a(str, jSONObject, com.taobao.android.xsearchplugin.weex.weex.b.a(jSCallback), com.taobao.android.xsearchplugin.weex.weex.b.a(jSCallback2)));
        }
    }

    @Override // com.taobao.search.sf.e
    public boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.s;
    }

    @Override // tb.pop
    public boolean dR_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b2cc5bc", new Object[]{this})).booleanValue() : this.I;
    }

    @Override // tb.nus
    public boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : this.u || this.v;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        if (r.j() || !bundle.containsKey("android:support:fragments")) {
            return;
        }
        bundle.remove("android:support:fragments");
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        ntd ntdVar = this.F;
        if (ntdVar != null) {
            ntdVar.a();
        }
        CommonSearchContext commonSearchContext = this.c;
        if (commonSearchContext != null && commonSearchContext.isPopupSrp() && this.C != null && r()) {
            this.C.c();
        } else {
            super.finish();
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else {
            super.finish();
        }
    }

    @Override // tb.ntb
    public ntd A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntd) ipChange.ipc$dispatch("18d3b9a0", new Object[]{this});
        }
        if (this.F == null) {
            this.F = new ntd(this);
        }
        com.taobao.search.refactor.m mVar = this.b;
        if (mVar != null) {
            ((com.taobao.search.refactor.g) mVar.b).a(this.F);
        }
        return this.F;
    }

    @Override // com.taobao.android.xsearchplugin.muise.g
    public void a(com.taobao.android.weex_framework.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e8b525", new Object[]{this, pVar});
        } else {
            this.m.a(pVar);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.g
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.m.a(str);
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5c99a0f1", new Object[]{this, str});
        }
        if (StringUtils.equals(str, "connectivity") && r.bV()) {
            return getApplicationContext().getSystemService(str);
        }
        return super.getSystemService(str);
    }

    @Override // com.taobao.android.xsearchplugin.muise.f
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.D.a();
    }

    @Override // com.taobao.android.xsearchplugin.muise.f
    public void closeViewDarkMode(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33dae15", new Object[]{this, view});
        } else if (view == null || !r.cB()) {
        } else {
            ah.a(view);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.f
    public void a(com.taobao.android.xsearchplugin.muise.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf8a69d", new Object[]{this, eVar});
        } else {
            this.D.a(eVar);
        }
    }

    @Override // com.taobao.android.xsearchplugin.muise.f
    public void b(com.taobao.android.xsearchplugin.muise.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5172ccde", new Object[]{this, eVar});
        } else {
            this.D.b(eVar);
        }
    }

    @Override // tb.irg
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            TLogTracker.b(str, map);
        }
    }

    @Override // com.taobao.search.m3.more.pk.b
    public void a(com.taobao.search.m3.more.pk.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9a6b843", new Object[]{this, cVar});
        } else {
            this.h.a(cVar);
        }
    }

    @Override // com.taobao.search.m3.more.pk.b
    public void b(com.taobao.search.m3.more.pk.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed4e8bc4", new Object[]{this, cVar});
        } else {
            this.h.b(cVar);
        }
    }

    @Override // com.taobao.search.m3.more.pk.b
    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.h.l();
    }

    @Override // com.taobao.search.m3.more.pk.b
    public void a(M3CellBean m3CellBean, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82965c8", new Object[]{this, m3CellBean, new Boolean(z)});
        } else {
            this.h.a(m3CellBean, z);
        }
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean needActionBar() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c4205b12", new Object[]{this})).booleanValue() : this.j;
    }
}
