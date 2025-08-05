package com.alibaba.triver.triver_shop.newShop.view;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlin.t;
import tb.ceg;
import tb.kge;
import tb.ruk;

/* loaded from: classes3.dex */
public final class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a */
    private View f3992a;
    private TUrlImageView b;
    private TUrlImageView c;
    private TUrlImageView d;
    private ViewGroup e;
    private TUrlImageView f;
    private FrameLayout g;
    private boolean h;
    private RecyclerView i;
    private com.alibaba.triver.triver_shop.newShop.view.e j;
    private FrameLayout k;
    private com.alibaba.triver.triver_shop.newShop.data.d l;
    private int m;
    private final j n = new j();
    private final b o;
    private final i p;

    /* loaded from: classes3.dex */
    public static final class c implements com.alibaba.triver.triver_shop.newShop.view.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ RecyclerView b;
        public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.view.j c;

        public c(RecyclerView recyclerView, com.alibaba.triver.triver_shop.newShop.view.j jVar) {
            l.this = r1;
            this.b = recyclerView;
            this.c = jVar;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.j
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            l.a(l.this, i);
            this.b.smoothScrollToPosition(i);
            com.alibaba.triver.triver_shop.newShop.view.j jVar = this.c;
            if (jVar == null) {
                return;
            }
            jVar.a(i);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ Context f3995a;
        public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d b;

        public d(Context context, com.alibaba.triver.triver_shop.newShop.data.d dVar) {
            this.f3995a = context;
            this.b = dVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            com.alibaba.triver.triver_shop.d.INSTANCE.a((Activity) this.f3995a, this.b, this.b.L(), this.b.K(), null, null, null);
            com.alibaba.triver.triver_shop.newShop.ext.j.a(this.b);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ Context f3996a;

        public e(Context context) {
            this.f3996a = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                com.alibaba.triver.triver_shop.newShop.ext.b.a(this.f3996a);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements p {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ Ref.IntRef f3997a;
        public final /* synthetic */ ruk<t> b;

        public f(Ref.IntRef intRef, ruk<t> rukVar) {
            this.f3997a = intRef;
            this.b = rukVar;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.p
        public void a(View view, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e734472a", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            kotlin.jvm.internal.q.d(view, "view");
            this.f3997a.element = i;
            this.b.mo2427invoke();
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements p {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref.IntRef b;
        public final /* synthetic */ Ref.IntRef c;
        public final /* synthetic */ ruk<t> d;

        public g(Ref.IntRef intRef, Ref.IntRef intRef2, ruk<t> rukVar) {
            l.this = r1;
            this.b = intRef;
            this.c = intRef2;
            this.d = rukVar;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.p
        public void a(View view, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e734472a", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            kotlin.jvm.internal.q.d(view, "view");
            if (l.b(l.this) != null) {
                return;
            }
            this.b.element = i2;
            this.c.element = i;
            this.d.mo2427invoke();
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ Context f3999a;
        public final /* synthetic */ com.alibaba.triver.triver_shop.newShop.data.d b;

        public h(Context context, com.alibaba.triver.triver_shop.newShop.data.d dVar) {
            this.f3999a = context;
            this.b = dVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                com.alibaba.triver.triver_shop.newShop.ext.l.a(this.f3999a, this.b.aw());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class i extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
            l.this = r1;
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            com.alibaba.triver.triver_shop.newShop.view.e d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            } else if (i != 0 || (d = l.d(l.this)) == null) {
            } else {
                int findFirstVisibleItemPosition = d.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = d.findLastVisibleItemPosition();
                ceg.a aVar = ceg.Companion;
                aVar.b("recycle index nav scroll stable : " + findFirstVisibleItemPosition + ',' + findLastVisibleItemPosition);
                com.alibaba.triver.triver_shop.newShop.ext.b.a("cycleIndexNavExposeTask", new ShopIndexNavCycleComponent$onScrollListener$1$onScrollStateChanged$1(l.this, findFirstVisibleItemPosition, findLastVisibleItemPosition));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class j implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
            l.this = r1;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.l.b.a
        public void a(b statusModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81b30ed8", new Object[]{this, statusModel});
                return;
            }
            kotlin.jvm.internal.q.d(statusModel, "statusModel");
            l.c(l.this);
        }
    }

    static {
        kge.a(-1942385881);
        Companion = new a(null);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(-1301352017);
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        private a() {
        }
    }

    public l() {
        b bVar = new b();
        bVar.a(this.n);
        t tVar = t.INSTANCE;
        this.o = bVar;
        this.p = new i();
    }

    public static final /* synthetic */ void a(l lVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885a2ded", new Object[]{lVar, new Integer(i2)});
        } else {
            lVar.m = i2;
        }
    }

    public static final /* synthetic */ void a(l lVar, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5b304", new Object[]{lVar, recyclerView});
        } else {
            lVar.i = recyclerView;
        }
    }

    public static final /* synthetic */ RecyclerView b(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("a9987cef", new Object[]{lVar}) : lVar.i;
    }

    public static final /* synthetic */ void c(l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811f7494", new Object[]{lVar});
        } else {
            lVar.b();
        }
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.newShop.view.e d(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.newShop.view.e) ipChange.ipc$dispatch("aeb6308", new Object[]{lVar}) : lVar.j;
    }

    private final RecyclerView a(Context context, List<String> list, int i2, int i3, com.alibaba.triver.triver_shop.newShop.view.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("89a706f5", new Object[]{this, context, list, new Integer(i2), new Integer(i3), jVar});
        }
        RecyclerView recyclerView = new RecyclerView(context);
        com.alibaba.triver.triver_shop.newShop.view.e eVar = new com.alibaba.triver.triver_shop.newShop.view.e(context);
        eVar.setOrientation(0);
        recyclerView.setLayoutManager(eVar);
        t tVar = t.INSTANCE;
        this.j = eVar;
        b bVar = this.o;
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.l;
        if (dVar != null) {
            com.alibaba.triver.triver_shop.newShop.view.i iVar = new com.alibaba.triver.triver_shop.newShop.view.i(i2, i3, list, bVar, dVar);
            recyclerView.setAdapter(iVar);
            iVar.a(new c(recyclerView, jVar));
            recyclerView.addOnScrollListener(this.p);
            return recyclerView;
        }
        kotlin.jvm.internal.q.b("shopData");
        throw null;
    }

    public final void a(com.alibaba.triver.triver_shop.newShop.data.d shopData, Context context, int i2, List<String> dataList, com.alibaba.triver.triver_shop.newShop.view.j jVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b00c9739", new Object[]{this, shopData, context, new Integer(i2), dataList, jVar, new Boolean(z)});
            return;
        }
        kotlin.jvm.internal.q.d(shopData, "shopData");
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(dataList, "dataList");
        this.h = true;
        this.l = shopData;
        View a2 = com.alibaba.triver.triver_shop.newShop.ext.o.a(context, R.layout.view_shop_cycle_index_nav);
        kotlin.jvm.internal.q.a(a2);
        this.f3992a = a2;
        View view = this.f3992a;
        if (view == null) {
            kotlin.jvm.internal.q.b("rootView");
            throw null;
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = (PerceptionSizeFrameLayout) view.findViewById(R.id.shop_index_nav_hidden_layout);
        View view2 = this.f3992a;
        if (view2 == null) {
            kotlin.jvm.internal.q.b("rootView");
            throw null;
        }
        PerceptionSizeFrameLayout perceptionLayout = (PerceptionSizeFrameLayout) view2.findViewById(R.id.shop_index_nav_list);
        kotlin.jvm.internal.q.b(perceptionLayout, "perceptionLayout");
        this.k = perceptionLayout;
        View view3 = this.f3992a;
        if (view3 == null) {
            kotlin.jvm.internal.q.b("rootView");
            throw null;
        }
        View findViewById = view3.findViewById(R.id.shop_index_nav_more_button);
        kotlin.jvm.internal.q.b(findViewById, "rootView.findViewById(R.id.shop_index_nav_more_button)");
        this.b = (TUrlImageView) findViewById;
        View view4 = this.f3992a;
        if (view4 == null) {
            kotlin.jvm.internal.q.b("rootView");
            throw null;
        }
        View findViewById2 = view4.findViewById(R.id.shop_index_nav_back_button);
        kotlin.jvm.internal.q.b(findViewById2, "rootView.findViewById(R.id.shop_index_nav_back_button)");
        this.c = (TUrlImageView) findViewById2;
        View view5 = this.f3992a;
        if (view5 == null) {
            kotlin.jvm.internal.q.b("rootView");
            throw null;
        }
        View findViewById3 = view5.findViewById(R.id.shop_index_nav_search_button);
        kotlin.jvm.internal.q.b(findViewById3, "rootView.findViewById(R.id.shop_index_nav_search_button)");
        this.d = (TUrlImageView) findViewById3;
        View view6 = this.f3992a;
        if (view6 == null) {
            kotlin.jvm.internal.q.b("rootView");
            throw null;
        }
        View findViewById4 = view6.findViewById(R.id.shop_index_nav_search_area);
        kotlin.jvm.internal.q.b(findViewById4, "rootView.findViewById(R.id.shop_index_nav_search_area)");
        this.e = (ViewGroup) findViewById4;
        View view7 = this.f3992a;
        if (view7 == null) {
            kotlin.jvm.internal.q.b("rootView");
            throw null;
        }
        View findViewById5 = view7.findViewById(R.id.shop_index_nav_full_screen_search_button);
        kotlin.jvm.internal.q.b(findViewById5, "rootView.findViewById(R.id.shop_index_nav_full_screen_search_button)");
        this.f = (TUrlImageView) findViewById5;
        View view8 = this.f3992a;
        if (view8 == null) {
            kotlin.jvm.internal.q.b("rootView");
            throw null;
        }
        View findViewById6 = view8.findViewById(R.id.shop_index_nav_full_screen_search_area);
        kotlin.jvm.internal.q.b(findViewById6, "rootView.findViewById(R.id.shop_index_nav_full_screen_search_area)");
        this.g = (FrameLayout) findViewById6;
        TUrlImageView tUrlImageView = this.d;
        if (tUrlImageView == null) {
            kotlin.jvm.internal.q.b("searchButton");
            throw null;
        }
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01qgdlsv1KrQnhB97ic_!!6000000001217-2-tps-200-200.png");
        TUrlImageView tUrlImageView2 = this.f;
        if (tUrlImageView2 == null) {
            kotlin.jvm.internal.q.b("fullScreenSearchButton");
            throw null;
        }
        tUrlImageView2.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01PB5kst1ricTm8lbdM_!!6000000005665-2-tps-240-240.png");
        TUrlImageView tUrlImageView3 = this.b;
        if (tUrlImageView3 == null) {
            kotlin.jvm.internal.q.b("moreButton");
            throw null;
        }
        tUrlImageView3.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN015IWb5R29Dcedtk9RC_!!6000000008034-2-tps-60-60.png");
        TUrlImageView tUrlImageView4 = this.c;
        if (tUrlImageView4 == null) {
            kotlin.jvm.internal.q.b("backButton");
            throw null;
        }
        tUrlImageView4.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01KPYj0C1wiEDrahb75_!!6000000006341-2-tps-256-256.png");
        h hVar = new h(context, shopData);
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            kotlin.jvm.internal.q.b("searchArea");
            throw null;
        }
        viewGroup.setOnClickListener(hVar);
        TUrlImageView tUrlImageView5 = this.f;
        if (tUrlImageView5 == null) {
            kotlin.jvm.internal.q.b("fullScreenSearchButton");
            throw null;
        }
        tUrlImageView5.setOnClickListener(hVar);
        TUrlImageView tUrlImageView6 = this.b;
        if (tUrlImageView6 == null) {
            kotlin.jvm.internal.q.b("moreButton");
            throw null;
        }
        tUrlImageView6.setOnClickListener(new d(context, shopData));
        TUrlImageView tUrlImageView7 = this.c;
        if (tUrlImageView7 == null) {
            kotlin.jvm.internal.q.b("backButton");
            throw null;
        }
        tUrlImageView7.setOnClickListener(new e(context));
        Ref.IntRef intRef = new Ref.IntRef();
        Ref.IntRef intRef2 = new Ref.IntRef();
        Ref.IntRef intRef3 = new Ref.IntRef();
        ShopIndexNavCycleComponent$init$tryToCreateRecyclerView$1 shopIndexNavCycleComponent$init$tryToCreateRecyclerView$1 = new ShopIndexNavCycleComponent$init$tryToCreateRecyclerView$1(intRef2, intRef, intRef3, this, context, dataList, jVar, z, shopData, perceptionLayout);
        perceptionSizeFrameLayout.setViewSizeChangedListener(new f(intRef3, shopIndexNavCycleComponent$init$tryToCreateRecyclerView$1));
        perceptionLayout.setViewSizeChangedListener(new g(intRef2, intRef, shopIndexNavCycleComponent$init$tryToCreateRecyclerView$1));
    }

    public final View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        View view = this.f3992a;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.q.b("rootView");
        throw null;
    }

    public final void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
        } else if (this.m == i2) {
        } else {
            this.m = i2;
            RecyclerView recyclerView = this.i;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(i2);
            }
            RecyclerView recyclerView2 = this.i;
            RecyclerView.Adapter adapter = recyclerView2 == null ? null : recyclerView2.getAdapter();
            if (!(adapter instanceof com.alibaba.triver.triver_shop.newShop.view.i)) {
                return;
            }
            ((com.alibaba.triver.triver_shop.newShop.view.i) adapter).b(i2);
        }
    }

    public final void b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
        } else {
            a(this, null, null, null, null, Integer.valueOf(i2), null, 47, null);
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            a(this, null, Boolean.valueOf(z), null, null, null, null, 61, null);
        }
    }

    public static /* synthetic */ void a(l lVar, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Boolean bool5, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a19d13", new Object[]{lVar, bool, bool2, bool3, bool4, num, bool5, new Integer(i2), obj});
            return;
        }
        if ((i2 & 1) != 0) {
            bool = null;
        }
        if ((i2 & 2) != 0) {
            bool2 = null;
        }
        if ((i2 & 4) != 0) {
            bool3 = null;
        }
        if ((i2 & 8) != 0) {
            bool4 = null;
        }
        if ((i2 & 16) != 0) {
            num = null;
        }
        if ((i2 & 32) != 0) {
            bool5 = null;
        }
        lVar.a(bool, bool2, bool3, bool4, num, bool5);
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Boolean bool5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4919b9e", new Object[]{this, bool, bool2, bool3, bool4, num, bool5});
            return;
        }
        b bVar = this.o;
        bVar.c(bool2 == null ? bVar.c() : bool2.booleanValue());
        b bVar2 = this.o;
        bVar2.b(bool == null ? bVar2.b() : bool.booleanValue());
        b bVar3 = this.o;
        bVar3.d(bool3 == null ? bVar3.d() : bool3.booleanValue());
        b bVar4 = this.o;
        bVar4.e(bool4 == null ? bVar4.e() : bool4.booleanValue());
        b bVar5 = this.o;
        bVar5.a(num == null ? bVar5.g() : num.intValue());
        b bVar6 = this.o;
        bVar6.f(bool5 == null ? bVar6.f() : bool5.booleanValue());
        this.o.h();
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.o.d()) {
            if (this.o.c()) {
                TUrlImageView tUrlImageView = this.c;
                if (tUrlImageView == null) {
                    kotlin.jvm.internal.q.b("backButton");
                    throw null;
                }
                tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01HSkEZO1EdnIvWCfFO_!!6000000000375-2-tps-256-256.png");
                TUrlImageView tUrlImageView2 = this.b;
                if (tUrlImageView2 == null) {
                    kotlin.jvm.internal.q.b("moreButton");
                    throw null;
                }
                tUrlImageView2.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN014WivCG23tPCFeqWJC_!!6000000007313-2-tps-240-240.png");
                TUrlImageView tUrlImageView3 = this.f;
                if (tUrlImageView3 == null) {
                    kotlin.jvm.internal.q.b("fullScreenSearchButton");
                    throw null;
                }
                tUrlImageView3.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01GERx6s1jAFplLrTnm_!!6000000004507-2-tps-240-240.png");
                if (this.o.f()) {
                    TUrlImageView tUrlImageView4 = this.c;
                    if (tUrlImageView4 == null) {
                        kotlin.jvm.internal.q.b("backButton");
                        throw null;
                    }
                    com.alibaba.triver.triver_shop.newShop.ext.o.e(tUrlImageView4);
                    FrameLayout frameLayout = this.g;
                    if (frameLayout == null) {
                        kotlin.jvm.internal.q.b("fullScreenSearchArea");
                        throw null;
                    }
                    com.alibaba.triver.triver_shop.newShop.ext.o.e(frameLayout);
                    ViewGroup viewGroup = this.e;
                    if (viewGroup == null) {
                        kotlin.jvm.internal.q.b("searchArea");
                        throw null;
                    }
                    com.alibaba.triver.triver_shop.newShop.ext.o.d(viewGroup);
                } else {
                    com.alibaba.triver.triver_shop.newShop.data.d dVar = this.l;
                    if (dVar == null) {
                        kotlin.jvm.internal.q.b("shopData");
                        throw null;
                    } else if (dVar.D()) {
                        b(this.o.b());
                    } else {
                        TUrlImageView tUrlImageView5 = this.c;
                        if (tUrlImageView5 == null) {
                            kotlin.jvm.internal.q.b("backButton");
                            throw null;
                        }
                        com.alibaba.triver.triver_shop.newShop.ext.o.b(tUrlImageView5);
                        FrameLayout frameLayout2 = this.g;
                        if (frameLayout2 == null) {
                            kotlin.jvm.internal.q.b("fullScreenSearchArea");
                            throw null;
                        }
                        com.alibaba.triver.triver_shop.newShop.ext.o.b(frameLayout2);
                        ViewGroup viewGroup2 = this.e;
                        if (viewGroup2 == null) {
                            kotlin.jvm.internal.q.b("searchArea");
                            throw null;
                        }
                        com.alibaba.triver.triver_shop.newShop.ext.o.d(viewGroup2);
                    }
                }
            } else {
                TUrlImageView tUrlImageView6 = this.c;
                if (tUrlImageView6 == null) {
                    kotlin.jvm.internal.q.b("backButton");
                    throw null;
                }
                tUrlImageView6.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01KPYj0C1wiEDrahb75_!!6000000006341-2-tps-256-256.png");
                TUrlImageView tUrlImageView7 = this.b;
                if (tUrlImageView7 == null) {
                    kotlin.jvm.internal.q.b("moreButton");
                    throw null;
                } else {
                    tUrlImageView7.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN015IWb5R29Dcedtk9RC_!!6000000008034-2-tps-60-60.png");
                    b(this.o.b());
                }
            }
        } else if (this.o.e()) {
            if (this.o.g() == 0) {
                if (!this.o.b()) {
                    TUrlImageView tUrlImageView8 = this.c;
                    if (tUrlImageView8 == null) {
                        kotlin.jvm.internal.q.b("backButton");
                        throw null;
                    }
                    tUrlImageView8.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01HSkEZO1EdnIvWCfFO_!!6000000000375-2-tps-256-256.png");
                    TUrlImageView tUrlImageView9 = this.b;
                    if (tUrlImageView9 == null) {
                        kotlin.jvm.internal.q.b("moreButton");
                        throw null;
                    }
                    tUrlImageView9.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN014WivCG23tPCFeqWJC_!!6000000007313-2-tps-240-240.png");
                    TUrlImageView tUrlImageView10 = this.f;
                    if (tUrlImageView10 == null) {
                        kotlin.jvm.internal.q.b("fullScreenSearchButton");
                        throw null;
                    }
                    tUrlImageView10.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01GERx6s1jAFplLrTnm_!!6000000004507-2-tps-240-240.png");
                }
            } else {
                TUrlImageView tUrlImageView11 = this.c;
                if (tUrlImageView11 == null) {
                    kotlin.jvm.internal.q.b("backButton");
                    throw null;
                }
                tUrlImageView11.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01KPYj0C1wiEDrahb75_!!6000000006341-2-tps-256-256.png");
                TUrlImageView tUrlImageView12 = this.b;
                if (tUrlImageView12 == null) {
                    kotlin.jvm.internal.q.b("moreButton");
                    throw null;
                }
                tUrlImageView12.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN015IWb5R29Dcedtk9RC_!!6000000008034-2-tps-60-60.png");
                TUrlImageView tUrlImageView13 = this.f;
                if (tUrlImageView13 == null) {
                    kotlin.jvm.internal.q.b("fullScreenSearchButton");
                    throw null;
                }
                tUrlImageView13.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01PB5kst1ricTm8lbdM_!!6000000005665-2-tps-240-240.png");
            }
            b(this.o.b());
        } else {
            b(this.o.b());
        }
        RecyclerView recyclerView = this.i;
        if (recyclerView == null) {
            return;
        }
        recyclerView.requestLayout();
    }

    private final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.o.d() && this.o.a() && this.o.f() && this.o.g() == 0) {
            z = true;
        }
        if (z) {
            TUrlImageView tUrlImageView = this.c;
            if (tUrlImageView == null) {
                kotlin.jvm.internal.q.b("backButton");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.e(tUrlImageView);
            ViewGroup viewGroup = this.e;
            if (viewGroup == null) {
                kotlin.jvm.internal.q.b("searchArea");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.e(viewGroup);
            FrameLayout frameLayout = this.g;
            if (frameLayout == null) {
                kotlin.jvm.internal.q.b("fullScreenSearchArea");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.e(frameLayout);
            TUrlImageView tUrlImageView2 = this.b;
            if (tUrlImageView2 == null) {
                kotlin.jvm.internal.q.b("moreButton");
                throw null;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.e(tUrlImageView2);
            FrameLayout frameLayout2 = this.k;
            if (frameLayout2 != null) {
                com.alibaba.triver.triver_shop.newShop.ext.o.e(frameLayout2, com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 24));
                return;
            } else {
                kotlin.jvm.internal.q.b("listContainer");
                throw null;
            }
        }
        TUrlImageView tUrlImageView3 = this.c;
        if (tUrlImageView3 == null) {
            kotlin.jvm.internal.q.b("backButton");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.b(tUrlImageView3);
        FrameLayout frameLayout3 = this.g;
        if (frameLayout3 == null) {
            kotlin.jvm.internal.q.b("fullScreenSearchArea");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.b(frameLayout3);
        TUrlImageView tUrlImageView4 = this.b;
        if (tUrlImageView4 == null) {
            kotlin.jvm.internal.q.b("moreButton");
            throw null;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.b(tUrlImageView4);
        FrameLayout frameLayout4 = this.k;
        if (frameLayout4 != null) {
            com.alibaba.triver.triver_shop.newShop.ext.o.e(frameLayout4, com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 6));
        } else {
            kotlin.jvm.internal.q.b("listContainer");
            throw null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private final HashSet<a> f3993a = new HashSet<>();
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private int h;

        /* loaded from: classes3.dex */
        public interface a {
            void a(b bVar);
        }

        static {
            kge.a(-1149414342);
        }

        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.b = z;
            }
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
        }

        public final void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c;
        }

        public final void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            } else {
                this.d = z;
            }
        }

        public final boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
        }

        public final void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            } else {
                this.e = z;
            }
        }

        public final boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.e;
        }

        public final void e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            } else {
                this.f = z;
            }
        }

        public final boolean e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.f;
        }

        public final void f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            } else {
                this.g = z;
            }
        }

        public final boolean f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.g;
        }

        public final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.h = i;
            }
        }

        public final int g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.h;
        }

        public final void a(a statusObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfffb0fb", new Object[]{this, statusObserver});
                return;
            }
            kotlin.jvm.internal.q.d(statusObserver, "statusObserver");
            this.f3993a.add(statusObserver);
        }

        public final void b(a statusObserver) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e13603da", new Object[]{this, statusObserver});
                return;
            }
            kotlin.jvm.internal.q.d(statusObserver, "statusObserver");
            this.f3993a.remove(statusObserver);
        }

        public final void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
                return;
            }
            Iterator<a> it = this.f3993a.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
        }
    }
}
