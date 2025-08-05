package com.taobao.search.sf;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseBean;
import com.taobao.android.searchbaseframe.nx3.bean.MuiseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.i;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.r;
import com.taobao.search.common.util.u;
import com.taobao.search.musie.MUSXSearchEventModule;
import com.taobao.search.sf.b;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ShareContentCallBack;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.ut.share.business.ShareContent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.alo;
import tb.alq;
import tb.alr;
import tb.alu;
import tb.imn;
import tb.ipj;
import tb.ipk;
import tb.ipl;
import tb.ipn;
import tb.iqu;
import tb.iru;
import tb.jrw;
import tb.jrx;
import tb.jry;
import tb.jrz;
import tb.kge;
import tb.nnd;
import tb.nne;
import tb.nsp;
import tb.ntl;
import tb.ntr;
import tb.ntx;
import tb.nxa;

/* loaded from: classes8.dex */
public class MainSearchResultActivity extends BaseResultActivity implements com.taobao.android.launcher.bootstrap.tao.ability.c, f, ShareContentCallBack, ipk, jrw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private jrz B;
    private ScreenType D;
    private boolean o;
    private long p;
    private JSONArray q;
    private JSONObject s;
    private String w;
    private p x;
    private View z;
    private com.taobao.search.sf.realtimetag.b n = null;
    private final boolean r = r.al();
    private boolean v = true;

    /* renamed from: a  reason: collision with root package name */
    private final ipj f19422a = new ipj();
    private boolean f = false;
    private final boolean A = r.ak();
    private final boolean C = r.bv();

    static {
        kge.a(-454973611);
        kge.a(1811067990);
        kge.a(321354641);
        kge.a(-1135978835);
        kge.a(2135162064);
        kge.a(-1864841087);
    }

    public static /* synthetic */ Object ipc$super(MainSearchResultActivity mainSearchResultActivity, String str, Object... objArr) {
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
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 72521300:
                super.M();
                return null;
            case 103921014:
                super.o();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
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
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    public static /* synthetic */ jrz a(MainSearchResultActivity mainSearchResultActivity, jrz jrzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jrz) ipChange.ipc$dispatch("3ed28e32", new Object[]{mainSearchResultActivity, jrzVar});
        }
        mainSearchResultActivity.B = jrzVar;
        return jrzVar;
    }

    public static /* synthetic */ void a(MainSearchResultActivity mainSearchResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50fe0324", new Object[]{mainSearchResultActivity});
        } else {
            mainSearchResultActivity.c();
        }
    }

    public static /* synthetic */ void b(MainSearchResultActivity mainSearchResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed69d83", new Object[]{mainSearchResultActivity});
        } else {
            mainSearchResultActivity.K();
        }
    }

    public static /* synthetic */ void c(MainSearchResultActivity mainSearchResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acaf37e2", new Object[]{mainSearchResultActivity});
        } else {
            mainSearchResultActivity.J();
        }
    }

    public static /* synthetic */ boolean d(MainSearchResultActivity mainSearchResultActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("da87d245", new Object[]{mainSearchResultActivity})).booleanValue() : mainSearchResultActivity.f;
    }

    public static /* synthetic */ void e(MainSearchResultActivity mainSearchResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8606ca0", new Object[]{mainSearchResultActivity});
        } else {
            mainSearchResultActivity.k();
        }
    }

    public static /* synthetic */ com.taobao.search.sf.realtimetag.b f(MainSearchResultActivity mainSearchResultActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.sf.realtimetag.b) ipChange.ipc$dispatch("7fcb188c", new Object[]{mainSearchResultActivity}) : mainSearchResultActivity.n;
    }

    public static /* synthetic */ View g(MainSearchResultActivity mainSearchResultActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("3659de20", new Object[]{mainSearchResultActivity}) : mainSearchResultActivity.z;
    }

    public static /* synthetic */ void h(MainSearchResultActivity mainSearchResultActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91ea3bbd", new Object[]{mainSearchResultActivity});
        } else {
            mainSearchResultActivity.F();
        }
    }

    @Override // com.taobao.uikit.actionbar.ShareContentCallBack
    public /* synthetic */ Object getQueryShareParameters() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("febe4434", new Object[]{this}) : D();
    }

    @Override // tb.ipk
    public ipj d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ipj) ipChange.ipc$dispatch("261b0178", new Object[]{this}) : this.f19422a;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        TLogTracker.a(nne.PAGE_NAME_MAIN);
        this.w = com.taobao.search.mmd.rebuild.e.a();
        TLogTracker.a(r.bk());
        a(getIntent());
        n();
    }

    @Override // com.taobao.search.sf.BaseResultActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        if (w()) {
            this.G = com.taobao.search.e.a();
        }
        this.f = com.alibaba.ability.localization.b.f();
        this.p = System.currentTimeMillis();
        if (!r.a() && B()) {
            setTheme(R.style.Theme_SearchResultActivity);
        }
        getWindow().setSoftInputMode(16);
        if (this.G != null) {
            this.G.post(new i() { // from class: com.taobao.search.sf.MainSearchResultActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        MainSearchResultActivity.a(MainSearchResultActivity.this);
                    }
                }
            });
        } else {
            c();
        }
        this.D = ScreenType.b(this);
        super.onCreate(bundle);
        if (this.G != null) {
            this.G.post(new i() { // from class: com.taobao.search.sf.MainSearchResultActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.i
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        MainSearchResultActivity.b(MainSearchResultActivity.this);
                    }
                }
            });
        } else {
            K();
        }
    }

    private void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        this.o = nnd.a();
        H();
        if (this.c == null) {
            return;
        }
        TLogTracker.a(this.k ? "PageRebuild" : "Default", this.c.getParamsSnapshot());
        this.f19422a.a(this);
        runOnUiThread(new i() { // from class: com.taobao.search.sf.MainSearchResultActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.util.i
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    MainSearchResultActivity.c(MainSearchResultActivity.this);
                }
            }
        });
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!r.bw() || !r.e("preloadInstance") || !TextUtils.isEmpty(((com.taobao.search.refactor.j) ((iru) this.b.getModel()).c()).getTab()) || !ipl.g().e()) {
        } else {
            if (!ipl.g().c()) {
                com.taobao.search.e.a().post(new Runnable() { // from class: com.taobao.search.sf.MainSearchResultActivity.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            String a2 = com.taobao.search.searchdoor.i.a(MainSearchResultActivity.d(MainSearchResultActivity.this));
                            if (TextUtils.isEmpty(a2)) {
                                return;
                            }
                            JSONObject parseObject = JSON.parseObject(a2);
                            ipl.g().a(parseObject, MainSearchResultActivity.this.getCore());
                            ipl.g().b(parseObject, MainSearchResultActivity.this.getCore());
                            MainSearchResultActivity.this.runOnUiThread(new Runnable() { // from class: com.taobao.search.sf.MainSearchResultActivity.5.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        MainSearchResultActivity.e(MainSearchResultActivity.this);
                                    }
                                }
                            });
                        } catch (Exception unused) {
                        }
                    }
                });
            } else {
                k();
            }
        }
    }

    @Override // com.taobao.search.sf.BaseResultActivity
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
            return;
        }
        super.M();
        this.f19422a.a((ViewGroup) getWindow().getDecorView());
        m();
        f();
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!isFinishing()) {
            if (com.taobao.search.mmd.util.k.a(this)) {
                com.taobao.search.searchdoor.f.a().d();
            } else if (this.f || u.s()) {
                if (!com.taobao.search.common.util.n.INSTANCE.e() || !this.f) {
                    List<MuiseCellBean> f = ipl.g().f();
                    HashMap hashMap = new HashMap();
                    hashMap.put("containerWidth", String.valueOf(com.taobao.android.searchbaseframe.util.j.d(b.g.a(ListStyle.WATERFALL, ntx.a()))));
                    hashMap.put("layoutStyle", 1);
                    hashMap.put("preload", "true");
                    for (int i = 0; i < f.size(); i++) {
                        com.taobao.android.weex_framework.p c = com.taobao.search.searchdoor.f.a().c();
                        ipn ipnVar = new ipn(this, getCore(), (iru) this.b.getModel(), null, null);
                        MuiseCellBean muiseCellBean = f.get(i);
                        TemplateBean a2 = ipnVar.a(muiseCellBean.mMuiseBean);
                        if (c == null || c.isDestroyed()) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("model", muiseCellBean.mMuiseBean.model);
                            hashMap2.put("status", hashMap);
                            ipnVar.a(muiseCellBean.mMuiseBean, hashMap2);
                            d().a(a2.templateName, a2.version, ipnVar.e());
                        } else {
                            c.resetContext(this);
                            if (c.getRenderRoot() instanceof MUSView) {
                                ((MUSView) c.getRenderRoot()).setMountContext(this);
                            }
                            d().a(a2.templateName, a2.version, c);
                        }
                    }
                    com.taobao.search.searchdoor.f.a().d();
                }
                if (ipl.g().j() == null) {
                    return;
                }
                MuiseBean k = ipl.g().k();
                iqu iquVar = new iqu(this, getCore(), null, null, null, null);
                TemplateBean a3 = iquVar.a(k);
                HashMap hashMap3 = new HashMap();
                hashMap3.put("model", k.model);
                HashMap hashMap4 = new HashMap();
                hashMap4.put("containerWidth", "200");
                hashMap3.put("status", hashMap4);
                iquVar.a(k, hashMap3);
                d().b(a3.templateName, a3.version, iquVar.e());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View] */
    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (this.b == null || this.b.getView() == 0) {
        } else {
            final ?? view = this.b.getView();
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.search.sf.MainSearchResultActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;
                private boolean c;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                        return;
                    }
                    int width = view.getWidth();
                    int height = view.getHeight();
                    if (width == 0 || height == 0) {
                        return;
                    }
                    Rect rect = new Rect();
                    view.getWindowVisibleDisplayFrame(rect);
                    int height2 = rect.height() + SystemBarDecorator.getStatusBarHeight(MainSearchResultActivity.this.getActivity());
                    if (height2 >= height || this.c) {
                        if (height2 < height || !this.c) {
                            return;
                        }
                        this.c = false;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", (Object) Integer.valueOf(com.taobao.search.common.util.l.b(rect.left)));
                        jSONObject.put("y", (Object) Integer.valueOf(com.taobao.search.common.util.l.b(rect.bottom)));
                        jSONObject.put("width", (Object) Integer.valueOf(com.taobao.search.common.util.l.b(rect.width())));
                        jSONObject.put("height", (Object) 0);
                        ntr.INSTANCE.a(MainSearchResultActivity.this, "keyboard", "rect", jSONObject);
                        com.taobao.android.searchbaseframe.util.k.e("SrpKeyboard", "keyboard hide");
                        return;
                    }
                    this.c = true;
                    int i = height - height2;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", (Object) Integer.valueOf(com.taobao.search.common.util.l.b(rect.left)));
                    jSONObject2.put("y", (Object) Integer.valueOf(com.taobao.search.common.util.l.b(rect.bottom)));
                    jSONObject2.put("width", (Object) Integer.valueOf(com.taobao.search.common.util.l.b(rect.width())));
                    jSONObject2.put("height", (Object) Integer.valueOf(com.taobao.search.common.util.l.b(i)));
                    ntr.INSTANCE.a(MainSearchResultActivity.this, "keyboard", "rect", jSONObject2);
                    com.taobao.android.searchbaseframe.util.k.e("SrpKeyboard", "keyboard show, visible height:" + height2 + ", keyboard height:" + i);
                }
            });
        }
    }

    private void a(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else if (intent == null || (data = intent.getData()) == null || !"audioAssistance".equals(data.getQueryParameter("from"))) {
        } else {
            intent.putExtra("from", com.taobao.search.mmd.util.j.INSTANCE.b() ? k.b.TYPE_ELDER_NEW_VOICE : k.b.TYPE_INVERT_ELDER_NEW_VOICE);
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                return;
            }
            String string = extras.getString(MUSXSearchEventModule.KEY_CARRIED_DATA);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.q = com.taobao.search.sf.datasource.b.a().a(string);
            extras.remove(MUSXSearchEventModule.KEY_CARRIED_DATA);
            com.taobao.search.sf.datasource.b.a().b();
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.search.sf.BaseResultActivity
    public JSONArray p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("abd36e67", new Object[]{this}) : this.q;
    }

    @Override // com.taobao.search.sf.BaseResultActivity, tb.ium
    public imn getCore() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("f78bd660", new Object[]{this}) : j.f19452a;
    }

    @Override // com.taobao.search.sf.BaseResultActivity, com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        if (this.b != null) {
            this.b.postEvent(nxa.b.a(menu));
        }
        boolean onCreateOptionsMenu = super.onCreateOptionsMenu(menu);
        E();
        return onCreateOptionsMenu;
    }

    private void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        TBPublicMenu publicMenu = getPublicMenu();
        TBPublicMenuItem build = new TBPublicMenuItem.Builder().setTitle("똊:添加到桌面").setUTControlName("quanjudaohang_widget_click").setOrder(1).setNeedLogin(false).setMenuNeedtoBeClosedAfterItemClicked(true).setName(com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16688)).setId(R.id.tbsearch_add_widget).build();
        ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
        arrayList.add(build);
        publicMenu.addExternalMenus(arrayList, new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.search.sf.MainSearchResultActivity.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
            public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                } else if (tBPublicMenuItem.getId() != R.id.tbsearch_add_widget) {
                } else {
                    com.taobao.search.mmd.util.e.b("quanjudaohang_widget_click");
                    alu aluVar = new alu(new alr("search").a((Context) MainSearchResultActivity.this));
                    HashMap hashMap = new HashMap();
                    hashMap.put("popId", "search_widget");
                    hashMap.put("bizId", "search");
                    hashMap.put("url", r.cD());
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("animation", (Object) com.taobao.android.abilitykit.ability.pop.model.d.KEY_BOTTOM_IN_OUT);
                    jSONObject.put("panEnable", (Object) "true");
                    jSONObject.put("maxHeight", (Object) "0.8");
                    hashMap.put(com.taobao.android.abilitykit.ability.pop.model.c.KEY_POP_CONFIG, jSONObject);
                    aluVar.a("stdPop", com.taobao.android.tbabilitykit.m.API_H5, new alq(), hashMap, new alo() { // from class: com.taobao.search.sf.MainSearchResultActivity.7.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.alo
                        public void onCallback(ExecuteResult executeResult) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                            }
                        }
                    });
                }
            }
        });
        publicMenu.setOnMenuShowedListener(new TBPublicMenu.TBOnMenuShowedListener() { // from class: com.taobao.search.sf.MainSearchResultActivity.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnMenuShowedListener
            public void onMenuShowed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91fdc161", new Object[]{this});
                } else {
                    com.taobao.search.mmd.util.e.c("Page_SearchItemList_quanjudaohang_exposure");
                }
            }
        });
    }

    @Override // com.taobao.search.sf.BaseResultActivity
    public boolean a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79f30289", new Object[]{this, new Integer(i), new Integer(i2), intent})).booleanValue();
        }
        if (i != 2001) {
            return false;
        }
        com.taobao.android.address.b.a(i, i2, intent);
        return true;
    }

    @Override // com.taobao.search.sf.BaseResultActivity
    public void u() {
        com.taobao.search.sf.datasource.c cVar;
        com.taobao.search.sf.realtimetag.b K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else if (this.b == null || (K = (cVar = (com.taobao.search.sf.datasource.c) ((iru) this.b.getModel()).b()).K()) == null) {
        } else {
            this.n = K;
            a(cVar, K);
            b(cVar, K);
        }
    }

    private void a(com.taobao.search.sf.datasource.c cVar, com.taobao.search.sf.realtimetag.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5aaf6ad", new Object[]{this, cVar, bVar});
        } else if (bVar == null || !bVar.c()) {
        } else {
            String a2 = bVar.a();
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            HashMap hashMap = new HashMap();
            String c = cVar.c("channelSrp");
            if (!TextUtils.isEmpty(c)) {
                hashMap.put("channelSrp", c);
            }
            CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
            if (commonSearchResult != null && !TextUtils.isEmpty(commonSearchResult.sessionId)) {
                hashMap.put("sessionId", commonSearchResult.sessionId);
            }
            String tab = cVar.getTab();
            if (!TextUtils.isEmpty(tab)) {
                hashMap.put("tab", tab);
            }
            this.n.a(hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("itemId", a2);
            try {
                try {
                    com.taobao.android.jarviswe.a.a().a("Page_SearchList", "dynamic_card_scene", hashMap2, new com.taobao.search.jarvis.b(bVar));
                    if (this.b == null || this.b.getView() == 0) {
                        return;
                    }
                    ((FrameLayout) this.b.getView()).postDelayed(new Runnable() { // from class: com.taobao.search.sf.MainSearchResultActivity.9
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (MainSearchResultActivity.f(MainSearchResultActivity.this) == null || !MainSearchResultActivity.f(MainSearchResultActivity.this).c()) {
                            } else {
                                MainSearchResultActivity.f(MainSearchResultActivity.this).a("timeout", "");
                            }
                        }
                    }, r.G());
                } catch (Exception e) {
                    q.b("MainSearchResultPage", e.getMessage());
                    ArrayMap arrayMap = new ArrayMap();
                    arrayMap.put("message", e.getMessage());
                    arrayMap.put(com.taobao.android.weex_framework.util.a.ATOM_stack, Log.getStackTraceString(e));
                    com.taobao.search.mmd.util.e.a("jarvisTriggerAction", (ArrayMap<String, String>) arrayMap);
                    if (this.b == null || this.b.getView() == 0) {
                        return;
                    }
                    ((FrameLayout) this.b.getView()).postDelayed(new Runnable() { // from class: com.taobao.search.sf.MainSearchResultActivity.9
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (MainSearchResultActivity.f(MainSearchResultActivity.this) == null || !MainSearchResultActivity.f(MainSearchResultActivity.this).c()) {
                            } else {
                                MainSearchResultActivity.f(MainSearchResultActivity.this).a("timeout", "");
                            }
                        }
                    }, r.G());
                }
            } catch (Throwable th) {
                if (this.b != null && this.b.getView() != 0) {
                    ((FrameLayout) this.b.getView()).postDelayed(new Runnable() { // from class: com.taobao.search.sf.MainSearchResultActivity.9
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (MainSearchResultActivity.f(MainSearchResultActivity.this) == null || !MainSearchResultActivity.f(MainSearchResultActivity.this).c()) {
                            } else {
                                MainSearchResultActivity.f(MainSearchResultActivity.this).a("timeout", "");
                            }
                        }
                    }, r.G());
                }
                throw th;
            }
        }
    }

    private void b(com.taobao.search.sf.datasource.c cVar, com.taobao.search.sf.realtimetag.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7c2240c", new Object[]{this, cVar, bVar});
        } else if (!r.bB() || bVar == null || !bVar.e()) {
        } else {
            HashMap hashMap = new HashMap();
            String c = cVar.c("channelSrp");
            if (!TextUtils.isEmpty(c)) {
                hashMap.put("channelSrp", c);
            }
            CommonSearchResult commonSearchResult = (CommonSearchResult) cVar.getTotalSearchResult();
            if (commonSearchResult != null && !TextUtils.isEmpty(commonSearchResult.sessionId)) {
                hashMap.put("sessionId", commonSearchResult.sessionId);
            }
            String tab = cVar.getTab();
            if (!TextUtils.isEmpty(tab)) {
                hashMap.put("tab", tab);
            }
            this.n.c(hashMap);
            if (!r.bC() || !this.n.f()) {
                this.n.i();
                return;
            }
            JSONObject g = this.n.g();
            if (g == null || g.isEmpty()) {
                this.n.i();
                return;
            }
            String string = g.getString("jarvisPage");
            String string2 = g.getString("jarvisEvent");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                this.n.i();
                return;
            }
            try {
                try {
                    com.taobao.android.jarviswe.a.a().a(string, string2, com.taobao.android.searchbaseframe.util.a.b(g), new com.taobao.search.jarvis.a(bVar));
                    if (this.b == null || this.b.getView() == 0) {
                        return;
                    }
                    ((FrameLayout) this.b.getView()).postDelayed(new Runnable() { // from class: com.taobao.search.sf.MainSearchResultActivity.10
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (MainSearchResultActivity.f(MainSearchResultActivity.this) == null) {
                            } else {
                                MainSearchResultActivity.f(MainSearchResultActivity.this).b("timeout", "");
                            }
                        }
                    }, r.G());
                } catch (Exception e) {
                    q.b("MainSearchResultPage", e.getMessage());
                    ArrayMap arrayMap = new ArrayMap();
                    arrayMap.put("message", e.getMessage());
                    arrayMap.put(com.taobao.android.weex_framework.util.a.ATOM_stack, Log.getStackTraceString(e));
                    com.taobao.search.mmd.util.e.a("jarvisTriggerAction", (ArrayMap<String, String>) arrayMap);
                    if (this.b == null || this.b.getView() == 0) {
                        return;
                    }
                    ((FrameLayout) this.b.getView()).postDelayed(new Runnable() { // from class: com.taobao.search.sf.MainSearchResultActivity.10
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (MainSearchResultActivity.f(MainSearchResultActivity.this) == null) {
                            } else {
                                MainSearchResultActivity.f(MainSearchResultActivity.this).b("timeout", "");
                            }
                        }
                    }, r.G());
                }
            } catch (Throwable th) {
                if (this.b != null && this.b.getView() != 0) {
                    ((FrameLayout) this.b.getView()).postDelayed(new Runnable() { // from class: com.taobao.search.sf.MainSearchResultActivity.10
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (MainSearchResultActivity.f(MainSearchResultActivity.this) == null) {
                            } else {
                                MainSearchResultActivity.f(MainSearchResultActivity.this).b("timeout", "");
                            }
                        }
                    }, r.G());
                }
                throw th;
            }
        }
    }

    @Override // com.taobao.search.sf.BaseResultActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TLogTracker.a(nne.PAGE_NAME_MAIN);
        super.onResume();
    }

    @Override // com.taobao.search.sf.BaseResultActivity, com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        TLogTracker.c();
        this.m.a();
        p pVar = this.x;
        if (pVar != null) {
            pVar.b();
        }
        d().a();
    }

    @Override // com.taobao.search.sf.BaseResultActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        TLogTracker.a();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        TLogTracker.b();
    }

    public long C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c5ab3e", new Object[]{this})).longValue() : this.p;
    }

    @Override // com.taobao.search.sf.BaseResultActivity, com.taobao.tao.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        a(intent);
        super.onNewIntent(intent);
        F();
    }

    @Override // com.taobao.search.sf.BaseResultActivity, com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        String str = this.w;
        if (str == null) {
            return;
        }
        com.taobao.search.mmd.rebuild.e.b(str);
    }

    @Override // com.taobao.search.sf.BaseResultActivity
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        super.o();
        if (j() == null) {
            return;
        }
        this.d.a(com.taobao.search.sf.detailpre.a.PAGE_CONFIG_DETAIL_PRE_REQUEST_PAGE_TYPE, com.taobao.search.sf.detailpre.a.b().a(false));
    }

    @Override // tb.jrw
    public jrx bO_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jrx) ipChange.ipc$dispatch("10f974dd", new Object[]{this}) : new jrx.a().b(this.A).a(this.A).c(false).a(81).b(28).a();
    }

    private void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
        } else if (this.B == null || !this.A) {
        } else {
            String str = "";
            if (ntl.INSTANCE.a(Boolean.valueOf(this.r), aE_().getParam("from", str))) {
                com.taobao.android.searchbaseframe.datasource.impl.a aVar = null;
                if (this.b != null) {
                    aVar = ((iru) this.b.getModel()).b();
                }
                if (aVar instanceof com.taobao.search.sf.datasource.c) {
                    str = ((com.taobao.search.sf.datasource.c) aVar).c("channelSrp");
                }
                if (ntl.INSTANCE.b(str)) {
                    this.B.show();
                    return;
                }
            }
            this.B.hide();
        }
    }

    @Override // tb.jrw
    public jry b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jry) ipChange.ipc$dispatch("16b8346c", new Object[]{this}) : new jry.a().a(new jry.b() { // from class: com.taobao.search.sf.MainSearchResultActivity.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jry.b
            public void a(jrz jrzVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("eff58d66", new Object[]{this, jrzVar});
                    return;
                }
                MainSearchResultActivity.a(MainSearchResultActivity.this, jrzVar);
                MainSearchResultActivity.h(MainSearchResultActivity.this);
            }
        }).a(new jry.c() { // from class: com.taobao.search.sf.MainSearchResultActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jry.c
            public View a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (View) ipChange2.ipc$dispatch("195fbaaa", new Object[]{this}) : MainSearchResultActivity.g(MainSearchResultActivity.this);
            }
        }).a();
    }

    public ShareContent D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("a7f03e63", new Object[]{this});
        }
        if (!this.v) {
            return null;
        }
        if (this.s == null) {
            return com.taobao.search.sf.widgets.searchbar.g.a((com.taobao.android.searchbaseframe.context.a) aE_());
        }
        return G();
    }

    @Override // com.taobao.search.sf.f
    public void a_(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691f71eb", new Object[]{this, jSONObject});
        } else {
            this.s = jSONObject;
        }
    }

    private ShareContent G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("ad4a1100", new Object[]{this});
        }
        ShareContent shareContent = new ShareContent();
        shareContent.businessId = this.s.getString("businessId");
        shareContent.title = this.s.getString("title");
        shareContent.imageUrl = this.s.getString("image");
        if (TextUtils.isEmpty(shareContent.imageUrl)) {
            shareContent.imageUrl = com.taobao.search.sf.widgets.searchbar.g.SHARE_IMAGE_URL;
        }
        shareContent.description = this.s.getString("description");
        if (shareContent.description == null) {
            shareContent.description = com.alibaba.ability.localization.b.a(R.string.taobao_app_1005_1_16689);
        }
        shareContent.url = this.s.getString("url");
        return shareContent;
    }

    private void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
        } else {
            I();
        }
    }

    private void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
        } else if (this.b != null) {
            com.taobao.android.searchbaseframe.datasource.impl.a b = ((iru) this.b.getModel()).b();
            if (!(b instanceof com.taobao.search.sf.datasource.c)) {
                return;
            }
            String c = ((com.taobao.search.sf.datasource.c) b).c("channelSrp");
            for (String str : r.aE()) {
                if (c.equals(str)) {
                    this.v = false;
                    return;
                }
            }
        }
    }

    @Override // com.taobao.android.launcher.bootstrap.tao.ability.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            q.b("MainSearchResultPage", "AFC: onSetActivityTheme");
        }
    }

    @Override // com.taobao.search.sf.BaseResultActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        if (this.b == null) {
            return;
        }
        bundle.putString(com.taobao.search.mmd.rebuild.e.EXTRA_REBUILD_PAGE, ((com.taobao.search.refactor.j) ((iru) this.b.getModel()).e().e()).r());
        bundle.putString(com.taobao.search.mmd.rebuild.e.EXTRA_REBUILD_TAB, ((com.taobao.search.refactor.j) ((iru) this.b.getModel()).e().e()).getTab());
        if (this.l || !this.C) {
            return;
        }
        bundle.putString(com.taobao.search.mmd.rebuild.e.EXTRA_REBUILD_TOKEN, this.w);
        com.taobao.search.mmd.rebuild.d a2 = com.taobao.search.mmd.rebuild.d.a(aE_(), (nsp) ((iru) this.b.getModel()).c(), (nsp) ((iru) this.b.getModel()).b(), this.e, true);
        CommonSearchResult commonSearchResult = (CommonSearchResult) ((com.taobao.search.refactor.j) ((iru) this.b.getModel()).c()).getTotalSearchResult();
        if (commonSearchResult != null && commonSearchResult.newSearch) {
            return;
        }
        com.taobao.search.mmd.rebuild.e.a(this.w, a2);
    }

    private void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
        } else if (!r.cu()) {
        } else {
            this.x = new p((ViewGroup) findViewById(R.id.fl_top_header), this);
            this.x.a();
        }
    }
}
