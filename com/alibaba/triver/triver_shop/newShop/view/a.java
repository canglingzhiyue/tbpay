package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.d;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import com.taobao.taolive.room.utils.aw;
import com.ut.mini.UTAnalytics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.ai;
import kotlin.jvm.internal.Ref;
import kotlin.t;
import tb.ceg;
import tb.cen;
import tb.djy;
import tb.drc;
import tb.kge;
import tb.noa;
import tb.nop;
import tb.nwl;
import tb.ris;
import tb.ruk;
import tb.rul;

/* loaded from: classes3.dex */
public final class a extends com.alibaba.triver.triver_shop.newShop.view.b implements nop.a, nop.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Context f3923a;
    private final com.alibaba.triver.triver_shop.newShop.data.g b;
    private final FrameLayout c;
    private nwl d;
    private int e;
    private final String f;
    private Pair<String, String> g;
    private Map<String, String> h;
    private Map<String, String> i;
    private Map<String, String> j;
    private boolean k;
    private boolean l;
    private int m;
    private boolean n;
    private com.alibaba.triver.triver_shop.shop2023.nativeview.e o;
    private com.alibaba.triver.triver_shop.web.a p;
    private ris q;
    private boolean r;
    private com.alibaba.triver.triver_shop.shop2023.nativeview.j s;
    private int t;
    private final b u;
    private int v;

    /* renamed from: com.alibaba.triver.triver_shop.newShop.view.a$a */
    /* loaded from: classes3.dex */
    public static final class C0140a implements drc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ Ref.BooleanRef f3924a;
        public final /* synthetic */ a b;

        public C0140a(Ref.BooleanRef booleanRef, a aVar) {
            this.f3924a = booleanRef;
            this.b = aVar;
        }

        @Override // tb.drc
        public final void a(final boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            ceg.Companion.b(kotlin.jvm.internal.q.a("allitems crossShop : ", (Object) Boolean.valueOf(z)));
            if (this.f3924a.element) {
                com.alibaba.triver.triver_shop.newShop.ext.b.b(new AllItemsContentRender$initAllItemsComponent$8$2(this.b, z, this.f3924a));
                return;
            }
            a.f(this.b).removeCallbacksAndMessages(null);
            b f = a.f(this.b);
            final a aVar = this.b;
            f.postDelayed(new Runnable() { // from class: com.alibaba.triver.triver_shop.newShop.view.a.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    d.C0135d G;
                    rul<Boolean, Boolean> h;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    com.alibaba.triver.triver_shop.newShop.data.d g = aVar.s().g();
                    if (g == null || (G = g.G()) == null || (h = G.h()) == null) {
                        return;
                    }
                    h.mo2421invoke(Boolean.valueOf(z));
                }
            }, 500L);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }
    }

    static {
        kge.a(-476800793);
        kge.a(-1835926073);
        kge.a(-569200449);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 92838762:
                super.c();
                return null;
            case 93762283:
                super.d();
                return null;
            case 94685804:
                super.e();
                return null;
            case 95609325:
                super.f();
                return null;
            case 96532846:
                super.g();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.nop.a
    public void onPagePropertiesUpdate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30d12d4", new Object[]{this, map});
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, com.alibaba.triver.triver_shop.newShop.data.g tabBarItemDataModel) {
        super(context, tabBarItemDataModel);
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(tabBarItemDataModel, "tabBarItemDataModel");
        this.f3923a = context;
        this.b = tabBarItemDataModel;
        this.c = new FrameLayout(this.f3923a);
        this.f = "Page_Shop_All_Item";
        this.j = new LinkedHashMap();
        this.l = cen.Companion.f();
        this.q = new ris(this.f3923a, "shop_allitem", null);
        this.t = 13;
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        if (g != null) {
            g.b("nativeAllItemContainer", "true");
        }
        this.c.setBackgroundColor(-1);
        this.u = new b(Looper.getMainLooper());
    }

    public static final /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25693fc1", new Object[]{aVar});
        } else {
            aVar.r();
        }
    }

    public static final /* synthetic */ int c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("811a7472", new Object[]{aVar})).intValue() : aVar.e;
    }

    public static final /* synthetic */ b f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("766783f7", new Object[]{aVar}) : aVar.u;
    }

    public final Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.f3923a;
    }

    public final com.alibaba.triver.triver_shop.newShop.data.g s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.data.g) ipChange.ipc$dispatch("41d30468", new Object[]{this}) : this.b;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.h
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.c;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void c() {
        View a2;
        View a3;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new AllItemsContentRender$onViewSelectedByViewPager$1(this), 200L);
        nwl nwlVar = this.d;
        if (nwlVar != null) {
            nwlVar.f();
        }
        n();
        com.alibaba.triver.triver_shop.shop2023.nativeview.e eVar = this.o;
        if (eVar != null) {
            com.alibaba.triver.triver_shop.shop2023.nativeview.e.a(eVar, false, 1, null);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.j jVar = this.s;
        if (jVar != null) {
            i = jVar.c();
        }
        if (i > this.t) {
            com.alibaba.triver.triver_shop.shop2023.nativeview.j jVar2 = this.s;
            if (jVar2 == null || (a3 = jVar2.a()) == null) {
                return;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.b(a3);
            return;
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.j jVar3 = this.s;
        if (jVar3 == null || (a2 = jVar3.a()) == null) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.d(a2);
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        JSONObject jSONObject = null;
        if (this.d != null) {
            com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
            if (g != null) {
                jSONObject = g.i(this.b.f());
            }
            if (jSONObject == null) {
                o();
                return;
            }
            com.alibaba.triver.triver_shop.newShop.data.d g2 = this.b.g();
            if (g2 != null) {
                g2.j(this.b.f());
            }
            ceg.Companion.b("refresh allItems");
            p();
            a(jSONObject);
            return;
        }
        a(this, null, 1, null);
    }

    private final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else if (!this.k || !this.l) {
        } else {
            this.k = false;
            p();
            a(this, null, 1, null);
        }
    }

    private final void p() {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        this.c.removeAllViews();
        try {
            Result.a aVar = Result.Companion;
            nwl nwlVar = this.d;
            this.d = null;
            if (nwlVar != null) {
                nwlVar.e();
            }
            m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m2371constructorimpl = Result.m2371constructorimpl(kotlin.i.a(th));
        }
        Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
        if (m2374exceptionOrNullimpl == null) {
            return;
        }
        ceg.Companion.a("catching block has error", m2374exceptionOrNullimpl);
    }

    public static /* synthetic */ void a(a aVar, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dee0d870", new Object[]{aVar, jSONObject, new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            jSONObject = null;
        }
        aVar.a(jSONObject);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:6|(7:12|(1:14)(1:38)|15|(6:17|(1:19)(1:36)|20|(1:22)(1:35)|(1:34)(1:24)|25)(1:37)|26|(1:30)|31)|39|(1:41)(1:122)|(1:43)|44|(1:121)(1:46)|(2:48|(29:50|51|(1:53)(1:116)|54|(1:56)(1:115)|(1:(1:59)(1:60))|61|(1:63)|64|(1:66)|67|(1:69)(1:114)|70|(1:72)|73|74|75|(1:77)|78|(1:82)|83|(6:85|(3:87|(1:89)(1:91)|90)|92|(1:94)|95|(1:97))|98|(1:100)|101|(1:103)|104|(1:106)|(2:108|109)(1:110))(1:117))|118|51|(0)(0)|54|(0)(0)|(0)|61|(0)|64|(0)|67|(0)(0)|70|(0)|73|74|75|(0)|78|(2:80|82)|83|(0)|98|(0)|101|(0)|104|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x01df, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01e0, code lost:
        r1 = kotlin.Result.Companion;
        r0 = kotlin.Result.m2371constructorimpl(kotlin.i.a(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(com.alibaba.fastjson.JSONObject r14) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.view.a.a(com.alibaba.fastjson.JSONObject):void");
    }

    private final Map<String, String> q() {
        Pair<String, String> pair;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7abac4ad", new Object[]{this});
        }
        Uri parse = Uri.parse(this.b.h());
        kotlin.jvm.internal.q.b(parse, "parse(tabBarItemDataModel.getRenderUrl())");
        Map<String, String> b2 = com.alibaba.triver.triver_shop.newShop.ext.b.b(parse);
        b2.remove("appId");
        this.j.put("inNativeShop", "true");
        this.j.put("inShop", "true");
        Map<String, String> map = this.j;
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        String str = null;
        map.put("shop_id", g == null ? null : g.T());
        Map<String, String> map2 = this.j;
        com.alibaba.triver.triver_shop.newShop.data.d g2 = this.b.g();
        if (g2 != null) {
            str = g2.U();
        }
        map2.put("seller_id", str);
        b2.put("nativeAllItemContainer", "true");
        com.alibaba.triver.triver_shop.newShop.data.d g3 = this.b.g();
        if (g3 != null && g3.s()) {
            z = true;
        }
        if (z) {
            pair = new Pair<>("a2141", "b37071050");
        } else {
            pair = new Pair<>("a2141", "7631671");
        }
        this.g = pair;
        b2.put("shopAuctionSpmCnt", pair.getFirst() + '.' + pair.getSecond());
        b2.put("spm-cnt", pair.getFirst() + '.' + pair.getSecond() + ".0.0");
        a(b2);
        b2.put(noa.KEY_IS_WEEX_SHOP, "true");
        return b2;
    }

    private final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        String str = map.get("from_spm");
        if (str == null && (str = map.get("spm")) == null) {
            str = "";
        }
        map.put("from_spm", str);
        map.put("mainse_query", b(map));
        map.put("bxConfigInvokeId", "shop.request.allitem");
        map.put("bxConfigBizId", "PageShop");
        map.put("bxConfigCurScene", ShopConstants.PAGE_SHOP);
    }

    private final String b(Map<String, String> map) {
        JSONObject jSONObject;
        String string;
        List b2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{this, map});
        }
        String str2 = map.get("upText");
        if (str2 == null) {
            str2 = "";
        }
        JSONObject a2 = com.alibaba.triver.triver_shop.newShop.ext.d.a(map.get(aw.PARAM_UT_PARAMS));
        if (a2 != null && a2.get("list_param") == null && (jSONObject = a2.getJSONObject("s_utmap")) != null && (string = jSONObject.getString("list_param")) != null && (b2 = kotlin.text.n.b((CharSequence) string, new String[]{"_"}, false, 0, 6, (Object) null)) != null && (str = (String) kotlin.collections.p.a((List<? extends Object>) b2, 0)) != null) {
            str2 = str;
        }
        String str3 = map.get("mainse_query");
        if (str3 == null) {
            str3 = str2;
        }
        return str3.length() > 10 ? "" : str3;
    }

    private final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        Map<String, String> map = this.h;
        String str = null;
        String str2 = map == null ? null : map.get("spm-cnt");
        com.alibaba.triver.triver_shop.newShop.ext.m.a(this.f3923a, str2, this.f);
        Context context = this.f3923a;
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        if (g != null) {
            str = g.ba();
        }
        com.alibaba.triver.triver_shop.newShop.ext.m.b(context, "identityCode", str);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.f3923a, this.i);
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.f3923a, this.j);
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(ai.a(kotlin.j.a("spm-url", str2)));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void d() {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.f3923a);
        com.alibaba.triver.triver_shop.shop2023.nativeview.j jVar = this.s;
        if (jVar == null || (a2 = jVar.a()) == null) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.d(a2);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        nwl nwlVar = this.d;
        if (nwlVar == null) {
            return;
        }
        nwlVar.d();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        nwl nwlVar = this.d;
        if (nwlVar != null) {
            nwlVar.c();
        }
        if (!h()) {
            return;
        }
        r();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.b, com.alibaba.triver.triver_shop.newShop.view.h
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        nwl nwlVar = this.d;
        if (nwlVar != null) {
            nwlVar.e();
        }
        this.d = null;
        this.q.b();
    }

    @Override // tb.nop.b
    public void b(int i) {
        com.alibaba.triver.triver_shop.web.a aVar;
        d.C0135d G;
        ruk<t> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.m = i;
        if (this.n) {
            ceg.Companion.b("onSearchScrollStop");
            this.n = false;
            com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
            if (g != null && (G = g.G()) != null && (f = G.f()) != null) {
                f.mo2427invoke();
            }
        }
        if (this.r) {
            this.r = false;
            this.q.a(com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("_msg_name", "scrollEnd"), kotlin.j.a("offset", Integer.valueOf(i))));
        }
        if (i == 0 && this.v != 0 && (aVar = this.p) != null) {
            aVar.b();
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.j jVar = this.s;
        if (jVar != null) {
            jVar.e();
        }
        this.v = 0;
    }

    @Override // tb.nop.b
    public void a(int i) {
        d.C0135d G;
        ruk<t> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.v += i;
        int i2 = this.e - i;
        this.e = i;
        if (!this.n && i2 < 0 && Math.abs(this.m - i) >= 500) {
            ceg.Companion.b("onSearchScroll");
            this.n = true;
            com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
            if (g != null && (G = g.G()) != null && (e = G.e()) != null) {
                e.mo2427invoke();
            }
        }
        if (this.r) {
            return;
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.j jVar = this.s;
        if (jVar != null) {
            jVar.f();
        }
        this.r = true;
        this.q.a(com.alibaba.triver.triver_shop.newShop.ext.d.a(kotlin.j.a("_msg_name", "scrollStart"), kotlin.j.a("offset", Integer.valueOf(i))));
    }

    @Override // tb.nop.b
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        Map<String, String> map = this.h;
        if (map != null) {
            map.put("sort_tag", str);
        }
        Map<String, String> map2 = this.h;
        if (map2 != null) {
            map2.put(djy.SERIALIZE_EXP_BUCKET_ID, str2);
        }
        r();
    }

    @Override // tb.nop.a
    public void onSearchRenderEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59913c45", new Object[]{this});
            return;
        }
        j();
        com.alibaba.triver.triver_shop.newShop.data.d g = this.b.g();
        if (g == null) {
            return;
        }
        g.c("shopAuctionSearchRenderEnd", Long.valueOf(System.currentTimeMillis()));
    }

    @Override // tb.nop.b
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.e eVar = this.o;
        if (eVar == null) {
            return;
        }
        eVar.a();
    }

    @Override // tb.nop.b
    public void a(int i, int i2) {
        View a2;
        com.alibaba.triver.triver_shop.shop2023.nativeview.j jVar;
        View a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ceg.a aVar = ceg.Companion;
        aVar.b("allItem cur : " + i + " , total : " + i2);
        com.alibaba.triver.triver_shop.shop2023.nativeview.j jVar2 = this.s;
        if (jVar2 != null) {
            jVar2.b(i2);
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.j jVar3 = this.s;
        if (jVar3 != null) {
            jVar3.a(i);
        }
        if (i > this.t) {
            if (!h() || (jVar = this.s) == null || (a3 = jVar.a()) == null) {
                return;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.b(a3);
            return;
        }
        com.alibaba.triver.triver_shop.shop2023.nativeview.j jVar4 = this.s;
        if (jVar4 == null || (a2 = jVar4.a()) == null) {
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.d(a2);
    }
}
