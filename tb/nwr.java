package tb;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.g;
import com.taobao.search.common.SearchSdk;
import com.taobao.search.common.util.k;
import com.taobao.search.common.util.r;
import com.taobao.search.refactor.f;
import com.taobao.search.refactor.j;
import com.taobao.search.refactor.m;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.datasource.e;
import com.taobao.search.sf.widgets.list.floatbar.l;
import com.taobao.search.sf.widgets.list.listcell.crosstips.b;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.isu;
import tb.nop;
import tb.nuf;
import tb.nws;

/* loaded from: classes8.dex */
public final class nwr implements ium, nus, nwl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d Companion;

    /* renamed from: a  reason: collision with root package name */
    private nop.a f31814a;
    private boolean b;
    private j c;
    private CommonSearchContext d;
    private Activity e;
    private m f;
    private String g;
    private com.taobao.search.sf.realtimetag.b h;
    private nwn i;
    private irt<j> j;
    private boolean k;
    private boolean l;
    private int m;
    private nop.b n;
    private boolean o;
    private f p;
    private nwo q;
    private boolean r;
    private boolean s;
    private int t;
    private boolean u;
    private drc v;

    /* loaded from: classes8.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            nwr.c(nwr.this).postEvent(new nuf.a());
            if (nwr.d(nwr.this)) {
                return;
            }
            nop.a e = nwr.e(nwr.this);
            if (e != null) {
                e.onSearchRenderEnd();
            }
            nwr.a(nwr.this, true);
        }
    }

    /* loaded from: classes8.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.search.sf.realtimetag.b b = nwr.b(nwr.this);
            if (b == null || !b.c()) {
                return;
            }
            b.a("timeout", "");
        }
    }

    static {
        kge.a(113202546);
        kge.a(-1747045540);
        kge.a(-541163887);
        kge.a(-810632237);
        Companion = new d(null);
    }

    @Override // tb.nus
    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.nus
    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* loaded from: classes8.dex */
    public static final class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1631544774);
        }

        private d() {
        }

        public /* synthetic */ d(o oVar) {
            this();
        }

        public final String a(Map<String, String> params) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, params});
            }
            q.c(params, "params");
            SearchSdk.Companion.b();
            CommonSearchContext fromMap = CommonSearchContext.fromMap(params);
            fromMap.setParam("m", noa.VALUE_MODULE_INSHOP);
            fromMap.handleInShopSearchParams();
            j a2 = e.a(true, fromMap, com.taobao.search.sf.j.f19452a);
            a2.doNewSearch();
            String a3 = nnz.a().a(a2);
            q.a((Object) a3, "SearchDatasourceManager.…ashDatasource(dataSource)");
            return a3;
        }
    }

    public nwr(boolean z) {
        SearchSdk.Companion.b();
        this.m = 1;
        this.p = new f(getCore());
        this.p.m(z);
        f fVar = this.p;
        ise<irq, ius> iseVar = com.taobao.search.sf.widgets.searchbar.f.CREATOR;
        q.a((Object) iseVar, "SFShopActionBarWidget.CREATOR");
        fVar.l(iseVar);
        this.p.a(new nwm());
        this.p.n(false);
        this.p.a(r.cE());
        this.p.s(true);
    }

    public static final /* synthetic */ nop.b a(nwr nwrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nop.b) ipChange.ipc$dispatch("39873c0a", new Object[]{nwrVar}) : nwrVar.n;
    }

    public static final /* synthetic */ void a(nwr nwrVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6cfe74", new Object[]{nwrVar, new Integer(i)});
        } else {
            nwrVar.t = i;
        }
    }

    public static final /* synthetic */ void a(nwr nwrVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6d3e45", new Object[]{nwrVar, new Boolean(z)});
        } else {
            nwrVar.o = z;
        }
    }

    public static final /* synthetic */ com.taobao.search.sf.realtimetag.b b(nwr nwrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.search.sf.realtimetag.b) ipChange.ipc$dispatch("4159c8fb", new Object[]{nwrVar}) : nwrVar.h;
    }

    public static final /* synthetic */ m c(nwr nwrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("c12d38e0", new Object[]{nwrVar});
        }
        m mVar = nwrVar.f;
        if (mVar == null) {
            q.b("widget");
        }
        return mVar;
    }

    public static final /* synthetic */ boolean d(nwr nwrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c294d5f6", new Object[]{nwrVar})).booleanValue() : nwrVar.o;
    }

    public static final /* synthetic */ nop.a e(nwr nwrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nop.a) ipChange.ipc$dispatch("539e2667", new Object[]{nwrVar}) : nwrVar.f31814a;
    }

    public static final /* synthetic */ boolean f(nwr nwrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f9ae2f8", new Object[]{nwrVar})).booleanValue() : nwrVar.s;
    }

    public static final /* synthetic */ int g(nwr nwrVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8e1de968", new Object[]{nwrVar})).intValue() : nwrVar.t;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    @Override // tb.nwl
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        m mVar = this.f;
        if (mVar == null) {
            q.b("widget");
        }
        return mVar.getView();
    }

    @Override // tb.nwl
    public void a(Activity activity, Map<String, String> params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5944a8b", new Object[]{this, activity, params});
            return;
        }
        q.c(activity, "activity");
        q.c(params, "params");
        ScreenType.b(activity);
        c(params);
        a(activity, CommonSearchContext.fromMap(params));
    }

    @Override // tb.nwl
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        m mVar = this.f;
        if (mVar == null) {
            q.b("widget");
        }
        mVar.postEvent(new l.b());
    }

    @Override // tb.nwl
    public void a(Activity activity, CommonSearchContext commonSearchContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b9ef235", new Object[]{this, activity, commonSearchContext});
            return;
        }
        q.c(activity, "activity");
        if (commonSearchContext == null) {
            return;
        }
        this.e = activity;
        this.d = commonSearchContext;
        this.p.U().a((com.taobao.android.meta.data.d<com.taobao.android.searchbaseframe.meta.uikit.c>) new a());
        commonSearchContext.setParam("m", noa.VALUE_MODULE_INSHOP);
        commonSearchContext.handleInShopSearchParams();
        this.i = new nwn(getCore(), activity);
        nwn nwnVar = this.i;
        if (nwnVar == null) {
            q.b("controller");
        }
        nwnVar.a(this);
        j a2 = a(commonSearchContext);
        nwn nwnVar2 = this.i;
        if (nwnVar2 == null) {
            q.b("controller");
        }
        nwnVar2.a(commonSearchContext);
        nwn nwnVar3 = this.i;
        if (nwnVar3 == null) {
            q.b("controller");
        }
        this.j = nwnVar3.d();
        this.g = com.taobao.search.sf.detailpre.a.Companion.a().b(true);
        String str = this.g;
        if (str == null) {
            q.b("detailPreToken");
        }
        a2.a(str, true);
        irt<j> irtVar = this.j;
        if (irtVar == null) {
            q.b("pageModel");
        }
        irtVar.a(k.CONFIG_LIST_CLIP_CHILDREN, (Object) false);
        irt<j> irtVar2 = this.j;
        if (irtVar2 == null) {
            q.b("pageModel");
        }
        irtVar2.a(com.taobao.search.sf.detailpre.a.PAGE_CONFIG_DETAIL_PRE_REQUEST_PAGE_TYPE, com.taobao.search.sf.detailpre.a.Companion.a().a(true));
        imn imnVar = com.taobao.search.sf.j.f19452a;
        q.a((Object) imnVar, "NxCore.CORE");
        nns nnsVar = new nns(imnVar, a2);
        nwn nwnVar4 = this.i;
        if (nwnVar4 == null) {
            q.b("controller");
        }
        nwnVar4.a(nnsVar);
        f fVar = this.p;
        nwr nwrVar = this;
        nwn nwnVar5 = this.i;
        if (nwnVar5 == null) {
            q.b("controller");
        }
        this.f = new m(fVar, activity, nwrVar, nwnVar5.e(), null, new iuo());
        m mVar = this.f;
        if (mVar == null) {
            q.b("widget");
        }
        mVar.subscribeScopeEvent(this, "childPageWidget");
        m mVar2 = this.f;
        if (mVar2 == null) {
            q.b("widget");
        }
        mVar2.subscribeEvent(this);
        a2.subscribePreSearch(this, -10);
        if (TextUtils.equals(commonSearchContext.getParam("isNewStyle"), "true")) {
            c(true);
        }
        this.c = a2;
        m mVar3 = this.f;
        if (mVar3 == null) {
            q.b("widget");
        }
        mVar3.attachToContainer();
        m mVar4 = this.f;
        if (mVar4 == null) {
            q.b("widget");
        }
        mVar4.w();
        m mVar5 = this.f;
        if (mVar5 == null) {
            q.b("widget");
        }
        nwn nwnVar6 = this.i;
        if (nwnVar6 == null) {
            q.b("controller");
        }
        mVar5.a(nwnVar6);
        m mVar6 = this.f;
        if (mVar6 == null) {
            q.b("widget");
        }
        mVar6.h();
        m mVar7 = this.f;
        if (mVar7 == null) {
            q.b("widget");
        }
        ((com.taobao.android.meta.structure.page.b) mVar7.J()).a();
        this.q = new nwo(activity, a2);
    }

    /* loaded from: classes8.dex */
    public static final class a implements com.taobao.android.searchbaseframe.meta.uikit.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.searchbaseframe.meta.uikit.c
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            }
        }

        public a() {
        }

        @Override // com.taobao.android.searchbaseframe.meta.uikit.c
        public void b(int i) {
            nop.b a2;
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else if (!nwr.f(nwr.this)) {
            } else {
                iru iruVar = (iru) nwr.c(nwr.this).getModel();
                q.a((Object) iruVar, "widget.model");
                com.taobao.android.searchbaseframe.datasource.impl.a d = iruVar.d();
                q.a((Object) d, "widget.model.scopeDatasource");
                CommonSearchResult commonSearchResult = (CommonSearchResult) ((j) d).getTotalSearchResult();
                if (commonSearchResult == null || !commonSearchResult.isPageFinished()) {
                    z = false;
                }
                if (z && nwr.g(nwr.this) > 150 && (a2 = nwr.a(nwr.this)) != null) {
                    a2.t();
                }
                nwr.a(nwr.this, 0);
            }
        }

        @Override // com.taobao.android.searchbaseframe.meta.uikit.c
        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
                return;
            }
            nop.b a2 = nwr.a(nwr.this);
            if (a2 == null) {
                return;
            }
            a2.a(i);
        }

        @Override // com.taobao.android.searchbaseframe.meta.uikit.c
        public void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            } else {
                nwr.a(nwr.this, i);
            }
        }
    }

    private final j a(CommonSearchContext commonSearchContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("ede6f3d1", new Object[]{this, commonSearchContext});
        }
        String removeParam = commonSearchContext.removeParam("inshop_preload_token");
        if (!TextUtils.isEmpty(removeParam)) {
            com.taobao.search.sf.datasource.c a2 = nnz.a().a(removeParam);
            if (!(a2 instanceof j)) {
                a2 = null;
            }
            j jVar = (j) a2;
            if (jVar != null) {
                nwn nwnVar = this.i;
                if (nwnVar == null) {
                    q.b("controller");
                }
                jVar.a(nwnVar);
                nwn nwnVar2 = this.i;
                if (nwnVar2 == null) {
                    q.b("controller");
                }
                nwnVar2.a((nwn) jVar);
                return jVar;
            }
        }
        nwn nwnVar3 = this.i;
        if (nwnVar3 == null) {
            q.b("controller");
        }
        j a3 = e.a(true, commonSearchContext, (e.b) nwnVar3);
        q.a((Object) a3, "DatasourceFactory.create…earchContext, controller)");
        return a3;
    }

    @Override // tb.nwl
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            j();
        }
    }

    @Override // tb.nwl
    public void a(Map<String, String> params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, params});
            return;
        }
        q.c(params, "params");
        c(params);
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String str = key;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(value)) {
                CommonSearchContext commonSearchContext = this.d;
                if (commonSearchContext == null) {
                    q.b("searchContext");
                }
                commonSearchContext.setParam(key, value);
                j jVar = this.c;
                if (jVar != null) {
                    jVar.setParam(key, value);
                }
            } else if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(value)) {
                CommonSearchContext commonSearchContext2 = this.d;
                if (commonSearchContext2 == null) {
                    q.b("searchContext");
                }
                commonSearchContext2.removeParam(key);
                j jVar2 = this.c;
                if (jVar2 != null) {
                    jVar2.clearParam(key);
                }
            }
        }
        this.r = TextUtils.equals(params.get(noa.VALUE_MODULE_DYNAMIC_CARD), "true");
        boolean a2 = com.taobao.search.mmd.util.j.INSTANCE.a(q.a((Object) nto.IN_SHOP_ELDER_HIT_VALUE, (Object) params.get(noa.KEY_SHOP_SEARCH_ELDER)));
        CommonSearchContext commonSearchContext3 = this.d;
        if (commonSearchContext3 == null) {
            q.b("searchContext");
        }
        commonSearchContext3.setParam(noa.KEY_SEARCH_ELDER_HOME_OPEN, String.valueOf(a2));
        CommonSearchContext commonSearchContext4 = this.d;
        if (commonSearchContext4 == null) {
            q.b("searchContext");
        }
        commonSearchContext4.setParam(noa.KEY_GRAY_HAIR, String.valueOf(a2));
        j jVar3 = this.c;
        if (jVar3 == null) {
            return;
        }
        jVar3.setParam(noa.KEY_GRAY_HAIR, String.valueOf(a2));
    }

    private final void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
            return;
        }
        String str = map.get("nextCategoryGuidText");
        if (TextUtils.isEmpty(str)) {
            this.p.a((String) null);
            this.s = false;
        } else {
            this.p.a(str);
            this.s = true;
        }
        String str2 = map.get("bottomPadding");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.p.R().a((com.taobao.android.meta.data.d<Integer>) Integer.valueOf(g.b(str2, 0)));
    }

    public void b(Map<String, String> params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, params});
            return;
        }
        q.c(params, "params");
        c(params);
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.h(params);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        j jVar = this.c;
        if (jVar != null) {
            jVar.X();
        }
        j jVar2 = this.c;
        if (jVar2 == null) {
            return;
        }
        jVar2.Y();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View] */
    @Override // tb.nwl
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        this.k = z;
        j jVar = this.c;
        if (jVar != null) {
            jVar.setParam("tb2021", String.valueOf(this.k));
        }
        if (!z) {
            return;
        }
        m mVar = this.f;
        if (mVar == null) {
            q.b("widget");
        }
        ViewCompat.setBackground(mVar.getView(), null);
    }

    @Override // tb.nwl
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.doNewSearch();
    }

    @Override // tb.nwl
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.k) {
        } else {
            this.m = i;
        }
    }

    @Override // tb.nwl
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        CommonSearchContext commonSearchContext = this.d;
        if (commonSearchContext == null) {
            q.b("searchContext");
        }
        commonSearchContext.setParam(noa.KEY_MINI_APP, str);
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.setParam(noa.KEY_MINI_APP, str);
    }

    @Override // tb.nwl
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        CommonSearchContext commonSearchContext = this.d;
        if (commonSearchContext == null) {
            q.b("searchContext");
        }
        commonSearchContext.setParam(noa.KEY_MINI_APP_DETAIL_URL, str);
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.setParam(noa.KEY_MINI_APP_DETAIL_URL, str);
    }

    @Override // tb.nwl
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        CommonSearchContext commonSearchContext = this.d;
        if (commonSearchContext == null) {
            q.b("searchContext");
        }
        commonSearchContext.setParam(noa.KEY_MINI_APP_CATEGORY_URL, str);
        j jVar = this.c;
        if (jVar == null) {
            return;
        }
        jVar.setParam(noa.KEY_MINI_APP_CATEGORY_URL, str);
    }

    @Override // tb.nwl
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void a(nop.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b75ec3eb", new Object[]{this, bVar});
        } else {
            this.n = bVar;
        }
    }

    @Override // tb.nwl
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.k) {
        } else {
            m mVar = this.f;
            if (mVar == null) {
                q.b("widget");
            }
            FrameLayout frameLayout = (FrameLayout) mVar.getView();
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            this.l = true;
        }
    }

    @Override // tb.nwl
    public void a(nop.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b75e4f8c", new Object[]{this, aVar});
        } else {
            this.f31814a = aVar;
        }
    }

    public final void onEventMainThread(l.e event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5efb24f6", new Object[]{this, event});
            return;
        }
        q.c(event, "event");
        Intent intent = new Intent(com.taobao.android.miniLive.sdk.d.TAOLIVE_SHOW_MINILIVE_ACTION);
        intent.putExtra("actionType", "updateLivePosition");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        hashMap2.put("x", String.valueOf(event.f19522a));
        hashMap2.put("y", String.valueOf(event.b));
        intent.putExtra("actionDatas", JSON.toJSONString(hashMap));
        LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
    }

    public final void onEventMainThread(b.a event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba93a52", new Object[]{this, event});
            return;
        }
        q.c(event, "event");
        if (this.u == event.a()) {
            return;
        }
        this.u = event.a();
        drc drcVar = this.v;
        if (drcVar != null) {
            drcVar.a(this.u);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("cross shop rec ");
        sb.append(this.u ? "showed" : "hidden");
        com.taobao.android.searchbaseframe.util.k.d("moyutest", sb.toString(), new Object[0]);
    }

    @Override // tb.nwl
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        m mVar = this.f;
        if (mVar == null) {
            q.b("widget");
        }
        mVar.onCtxPauseInternal();
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!this.l) {
        } else {
            m mVar = this.f;
            if (mVar == null) {
                q.b("widget");
            }
            mVar.postEvent(nws.a.a());
        }
    }

    @Override // tb.nwl
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        m mVar = this.f;
        if (mVar == null) {
            q.b("widget");
        }
        mVar.onCtxDestroyInternal();
        com.taobao.search.sf.detailpre.a a2 = com.taobao.search.sf.detailpre.a.Companion.a();
        String str = this.g;
        if (str == null) {
            q.b("detailPreToken");
        }
        a2.a(str, true);
        nwo nwoVar = this.q;
        if (nwoVar == null) {
            q.b("gotoTopChannel");
        }
        nwoVar.b();
    }

    private final void d(String str) {
        nop.a aVar;
        com.taobao.search.refactor.e combo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        j jVar = this.c;
        if (jVar == null || (aVar = this.f31814a) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        String paramValue = jVar.getParamValue("shopId");
        if (TextUtils.isEmpty(paramValue)) {
            paramValue = "";
        }
        hashMap.put("shop_id", paramValue);
        String paramValue2 = jVar.getParamValue("sellerId");
        if (TextUtils.isEmpty(paramValue2)) {
            paramValue2 = "";
        }
        hashMap.put("seller_id", paramValue2);
        hashMap.put(djy.SERIALIZE_EXP_BUCKET_ID, str);
        hashMap.put("inshops", "search");
        String paramValue3 = jVar.getParamValue("sort");
        if (TextUtils.isEmpty(paramValue3)) {
            paramValue3 = "_coefp";
        }
        hashMap.put("sort_tag", paramValue3);
        CommonSearchContext commonSearchContext = this.d;
        if (commonSearchContext == null) {
            q.b("searchContext");
        }
        if (!q.a((Object) "category", (Object) commonSearchContext.getParam("from", ""))) {
            String paramValue4 = jVar.getParamValue(noa.KEY_KEYWORD_PATH);
            if (TextUtils.isEmpty(paramValue4)) {
                paramValue4 = "";
            }
            hashMap.put("shopsearchq", paramValue4);
        }
        hashMap.put("encode_rainbow", com.taobao.android.searchbaseframe.util.r.c(com.taobao.search.rainbow.a.c()));
        CommonSearchResult sr = (CommonSearchResult) jVar.getTotalSearchResult();
        if (sr != null && (combo = sr.getCombo(0)) != null) {
            String str2 = combo.a().rn;
            if (str2 == null) {
                q.a((Object) sr, "sr");
                str2 = sr.getMainInfo().rn;
            }
            hashMap.put("pageid", str2);
        }
        aVar.onPagePropertiesUpdate(hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Runnable] */
    private final void l() {
        c cVar;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (r.y() || !this.r) {
        } else {
            j jVar = this.c;
            if (jVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("shopId", jVar.getParamValue("shopId"));
                hashMap.put("sellerId", jVar.getParamValue("sellerId"));
                com.taobao.search.mmd.util.e.a("InshopAllItemDetailBack", hashMap);
            }
            m mVar = this.f;
            c cVar2 = "widget";
            if (mVar == null) {
                q.b(cVar2);
            }
            iru iruVar = (iru) mVar.getModel();
            q.a((Object) iruVar, "widget.model");
            com.taobao.android.searchbaseframe.datasource.impl.a b2 = iruVar.b();
            if (b2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonBaseDatasource");
            }
            com.taobao.search.sf.datasource.c cVar3 = (com.taobao.search.sf.datasource.c) b2;
            CommonSearchResult commonSearchResult = (CommonSearchResult) cVar3.getTotalSearchResult();
            com.taobao.search.sf.realtimetag.b K = cVar3.K();
            if (K == null) {
                return;
            }
            this.h = K;
            String itemId = K.a();
            if (TextUtils.isEmpty(itemId)) {
                return;
            }
            HashMap hashMap2 = new HashMap();
            q.a((Object) itemId, "itemId");
            hashMap2.put("itemId", itemId);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("appId", "18193");
            K.b(hashMap3);
            HashMap hashMap4 = new HashMap();
            hashMap4.put("rainbow", com.taobao.search.rainbow.a.c());
            if (commonSearchResult != null && !TextUtils.isEmpty(commonSearchResult.sessionId)) {
                hashMap4.put("sessionId", commonSearchResult.sessionId);
            }
            K.a(hashMap4);
            try {
                try {
                    com.taobao.android.jarviswe.a.a().a("Page_InshopAllItem", "dynamic_card_scene", hashMap2, new com.taobao.search.jarvis.b(K));
                    m mVar2 = this.f;
                    if (mVar2 == null) {
                        q.b(cVar2);
                    }
                    frameLayout2 = (FrameLayout) mVar2.getView();
                } catch (Exception e) {
                    com.taobao.search.common.util.q.b("SFShopAuctionModule", e.getMessage());
                    ArrayMap arrayMap = new ArrayMap();
                    arrayMap.put("message", e.getMessage());
                    arrayMap.put(com.taobao.android.weex_framework.util.a.ATOM_stack, Log.getStackTraceString(e));
                    com.taobao.search.mmd.util.e.a("jarvisTriggerAction", (ArrayMap<String, String>) arrayMap);
                    m mVar3 = this.f;
                    if (mVar3 == null) {
                        q.b(cVar2);
                    }
                    FrameLayout frameLayout3 = (FrameLayout) mVar3.getView();
                    if (frameLayout3 == null) {
                        return;
                    }
                    cVar = new c();
                    frameLayout = frameLayout3;
                }
                if (frameLayout2 == null) {
                    return;
                }
                cVar = new c();
                frameLayout = frameLayout2;
                cVar2 = cVar;
                frameLayout.postDelayed(cVar2, 1000L);
            } catch (Throwable th) {
                m mVar4 = this.f;
                if (mVar4 == null) {
                    q.b(cVar2);
                }
                FrameLayout frameLayout4 = (FrameLayout) mVar4.getView();
                if (frameLayout4 != null) {
                    frameLayout4.postDelayed(new c(), 1000L);
                }
                throw th;
            }
        }
    }

    @Override // tb.nwl
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        m mVar = this.f;
        if (mVar == null) {
            q.b("widget");
        }
        mVar.onCtxResumeInternal();
        l();
    }

    public final void a(boolean z, boolean z2) {
        j jVar;
        String str;
        j jVar2;
        CommonSearchResult it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z) {
            m mVar = this.f;
            if (mVar == null) {
                q.b("widget");
            }
            FrameLayout frameLayout = (FrameLayout) mVar.getView();
            if (frameLayout != null) {
                frameLayout.post(new b());
            }
        }
        if (this.l && !this.k) {
            m mVar2 = this.f;
            if (mVar2 == null) {
                q.b("widget");
            }
            mVar2.postEvent(nws.a.a());
        }
        if (z2 && (jVar2 = this.c) != null && (it = (CommonSearchResult) jVar2.getLastSearchResult()) != null) {
            q.a((Object) it, "it");
            String str2 = it.getMainInfo().abtest;
            if (z) {
                d(str2);
            }
        }
        nop.b bVar = this.n;
        if (bVar == null || (jVar = this.c) == null) {
            return;
        }
        if (bVar == null) {
            q.a();
        }
        String paramValue = jVar.getParamValue("sort");
        CommonSearchResult sr = (CommonSearchResult) jVar.getLastSearchResult();
        if (sr != null) {
            q.a((Object) sr, "sr");
            str = sr.getMainInfo().abtest;
        } else {
            str = null;
        }
        bVar.a(paramValue, str);
    }

    @Override // tb.nwl
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        m mVar = this.f;
        if (mVar == null) {
            q.b("widget");
        }
        iru iruVar = (iru) mVar.getModel();
        q.a((Object) iruVar, "widget.model");
        ((j) iruVar.d()).postEvent(isu.a.a());
        onEventMainThread(new b.a(false));
    }

    public final void onEventMainThread(isu.f scrollStop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48595d88", new Object[]{this, scrollStop});
            return;
        }
        q.c(scrollStop, "scrollStop");
        nop.b bVar = this.n;
        if (bVar == null) {
            return;
        }
        bVar.b(scrollStop.f29290a);
    }

    public final void onEventMainThread(isu.b event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48578c0c", new Object[]{this, event});
            return;
        }
        q.c(event, "event");
        int i = event.b + 1;
        m mVar = this.f;
        if (mVar == null) {
            q.b("widget");
        }
        iru iruVar = (iru) mVar.getModel();
        q.a((Object) iruVar, "widget.model");
        com.taobao.android.searchbaseframe.datasource.impl.a d2 = iruVar.d();
        q.a((Object) d2, "widget.model.scopeDatasource");
        int totalResultCount = ((j) d2).getTotalResultCount();
        nop.b bVar = this.n;
        if (bVar == null) {
            return;
        }
        bVar.a(i, totalResultCount);
    }

    public void a(drc listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5ae0523", new Object[]{this, listener});
            return;
        }
        q.c(listener, "listener");
        this.v = listener;
    }

    @Override // tb.ium
    public imn getCore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imn) ipChange.ipc$dispatch("f78bd660", new Object[]{this});
        }
        imn imnVar = com.taobao.search.sf.j.f19452a;
        q.a((Object) imnVar, "NxCore.CORE");
        return imnVar;
    }
}
