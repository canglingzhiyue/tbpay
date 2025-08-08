package com.etao.feimagesearch.videosearch;

import android.content.Context;
import android.graphics.Color;
import android.graphics.RectF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.VideoIrpActivity;
import com.etao.feimagesearch.datapoints.StatisticalDataPoint;
import com.etao.feimagesearch.result.ScrollInterceptView;
import com.etao.feimagesearch.videosearch.VideoResultList;
import com.etao.feimagesearch.videosearch.o;
import com.etao.feimagesearch.videosearch.result.a;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.TypeCastException;
import tb.cot;
import tb.cox;
import tb.csq;
import tb.cuc;
import tb.cud;
import tb.kge;
import tb.ljl;

/* loaded from: classes4.dex */
public final class k implements VideoResultList.b, j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f7057a;
    private final boolean b;
    private final ViewGroup c;
    private final LinearLayout d;
    private TUrlImageView e;
    private RecyclerView f;
    private final com.etao.feimagesearch.videosearch.result.a g;
    private final VideoResultList h;
    private final ScrollInterceptView i;
    private View j;
    private VideoIrpActivity k;
    private String l;
    private o m;
    private a n;
    private int o;
    private boolean p;

    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();
    }

    /* loaded from: classes4.dex */
    public static final class c implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (i8 - i6 == i4 - i2 || k.b(k.this).getChildState() != 0) {
            } else {
                k.b(k.this).moveChildTo(k.b(k.this).getDownStateOffset());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements ScrollInterceptView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.a
        public final boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : k.j(k.this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            cot.c(k.a(k.this), "back on Click");
            k.this.h();
            k.b(k.this).disappearAnim();
            k.b(k.this).setVisibility(8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements a.InterfaceC0252a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.etao.feimagesearch.videosearch.result.a.InterfaceC0252a
        public void a(cud result, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a059785d", new Object[]{this, result, new Integer(i)});
                return;
            }
            kotlin.jvm.internal.q.c(result, "result");
            cox.a("ObjectchangeClickon", new String[0]);
            RecyclerView c = k.c(k.this);
            if (c != null) {
                c.smoothScrollToPosition(i);
            }
            k.d(k.this);
            k.e(k.this);
            k kVar = k.this;
            String str = result.f;
            kotlin.jvm.internal.q.a((Object) str, "result.frameUrl");
            RectF rectF = result.g;
            kotlin.jvm.internal.q.a((Object) rectF, "result.cropRect");
            if (StringUtils.equals(k.f(k.this), k.a(kVar, str, rectF))) {
                return;
            }
            k.g(k.this).showLoading();
            k kVar2 = k.this;
            String str2 = result.f;
            kotlin.jvm.internal.q.a((Object) str2, "result.frameUrl");
            RectF rectF2 = result.g;
            kotlin.jvm.internal.q.a((Object) rectF2, "result.cropRect");
            k.a(kVar2, str2, rectF2, k.h(k.this));
        }
    }

    static {
        kge.a(-976590770);
        kge.a(1742505076);
        kge.a(-1691719726);
    }

    public k(Context context, boolean z) {
        kotlin.jvm.internal.q.c(context, "context");
        this.f7057a = "VideoSearch_NewVideoResultContainer";
        this.b = z;
        View inflate = LayoutInflater.from(context).inflate(R.layout.feis_video_search_ceiling_result_container, (ViewGroup) null, false);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.c = (ViewGroup) inflate;
        View findViewById = this.c.findViewById(R.id.video_search_result_header);
        if (findViewById == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.d = (LinearLayout) findViewById;
        this.g = new com.etao.feimagesearch.videosearch.result.a();
        View findViewById2 = this.c.findViewById(R.id.result_list);
        kotlin.jvm.internal.q.a((Object) findViewById2, "rootView.findViewById(R.id.result_list)");
        this.h = (VideoResultList) findViewById2;
        View findViewById3 = this.c.findViewById(R.id.video_result_scroll_view);
        if (findViewById3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.result.ScrollInterceptView");
        }
        this.i = (ScrollInterceptView) findViewById3;
        this.o = -1;
        this.c.setVisibility(4);
        a(this.c);
    }

    public static final /* synthetic */ String a(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("13da7799", new Object[]{kVar}) : kVar.f7057a;
    }

    public static final /* synthetic */ String a(k kVar, String str, RectF rectF) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e2ab16de", new Object[]{kVar, str, rectF}) : kVar.a(str, rectF);
    }

    public static final /* synthetic */ void a(k kVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3505f1", new Object[]{kVar, str});
        } else {
            kVar.l = str;
        }
    }

    public static final /* synthetic */ void a(k kVar, String str, RectF rectF, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ca1112", new Object[]{kVar, str, rectF, new Boolean(z)});
        } else {
            kVar.a(str, rectF, z);
        }
    }

    public static final /* synthetic */ ScrollInterceptView b(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScrollInterceptView) ipChange.ipc$dispatch("47196da2", new Object[]{kVar}) : kVar.i;
    }

    public static final /* synthetic */ RecyclerView c(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("c1619f3b", new Object[]{kVar}) : kVar.f;
    }

    public static final /* synthetic */ void d(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2461b42a", new Object[]{kVar});
        } else {
            kVar.m();
        }
    }

    public static final /* synthetic */ void e(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a322eb", new Object[]{kVar});
        } else {
            kVar.l();
        }
    }

    public static final /* synthetic */ String f(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("31ed7074", new Object[]{kVar}) : kVar.l;
    }

    public static final /* synthetic */ VideoResultList g(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoResultList) ipChange.ipc$dispatch("ef12287d", new Object[]{kVar}) : kVar.h;
    }

    public static final /* synthetic */ boolean h(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b9676f32", new Object[]{kVar})).booleanValue() : kVar.b;
    }

    public static final /* synthetic */ LinearLayout i(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("1a3da2c6", new Object[]{kVar}) : kVar.d;
    }

    public static final /* synthetic */ boolean j(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83ea4cb4", new Object[]{kVar})).booleanValue() : kVar.o();
    }

    public static final /* synthetic */ View k(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("7a86b973", new Object[]{kVar}) : kVar.j;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.o;
    }

    @Override // com.etao.feimagesearch.videosearch.j
    public void a(VideoIrpActivity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fae7422f", new Object[]{this, activity});
            return;
        }
        kotlin.jvm.internal.q.c(activity, "activity");
        this.k = activity;
        this.h.setPssource(activity.f());
        this.m = activity.r();
        cot.c(this.f7057a, "loadIfNeeded");
        this.h.loadIfNeeded(this.b);
    }

    @Override // com.etao.feimagesearch.videosearch.j
    public ViewGroup f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("40865d88", new Object[]{this}) : this.c;
    }

    private final void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        View findViewById = this.d.findViewById(R.id.tv_product_code);
        kotlin.jvm.internal.q.a((Object) findViewById, "header.findViewById<View…ore.R.id.tv_product_code)");
        findViewById.setVisibility(8);
        ViewGroup viewGroup2 = (ViewGroup) this.d.findViewById(R.id.btn_back);
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new f());
        }
        View findViewById2 = this.d.findViewById(R.id.iv_back);
        if (findViewById2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
        }
        this.e = (TUrlImageView) findViewById2;
        TUrlImageView tUrlImageView = this.e;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01YTxgsN1GkK7QdvOWs_!!6000000000660-2-tps-48-80.png");
        }
        View findViewById3 = this.d.findViewById(R.id.iv_search);
        kotlin.jvm.internal.q.a((Object) findViewById3, "header.findViewById(com.…arch_core.R.id.iv_search)");
        TUrlImageView tUrlImageView2 = (TUrlImageView) findViewById3;
        tUrlImageView2.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01DaiD2q1QxHTrKANyQ_!!6000000002042-2-tps-88-88.png");
        tUrlImageView2.setVisibility(8);
        View findViewById4 = this.d.findViewById(R.id.rv_objects);
        if (findViewById4 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
        }
        this.f = (RecyclerView) findViewById4;
        RecyclerView recyclerView = this.f;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(viewGroup.getContext(), 0, false));
        }
        RecyclerView recyclerView2 = this.f;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.g);
        }
        RecyclerView recyclerView3 = this.f;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new csq());
        }
        this.h.setCallback(this);
        this.g.a(new g());
        b(viewGroup);
    }

    private final String a(String str, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db930dbd", new Object[]{this, str, rectF});
        }
        return str + rectF.toString();
    }

    @Override // com.etao.feimagesearch.videosearch.j
    public void a(cud item) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e423e766", new Object[]{this, item});
            return;
        }
        kotlin.jvm.internal.q.c(item, "item");
        this.g.a(item);
    }

    private final int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.d.getHeight();
    }

    @Override // com.etao.feimagesearch.videosearch.j
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.g.notifyDataSetChanged();
        }
    }

    @Override // com.etao.feimagesearch.videosearch.j
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.p = true;
        m();
        l();
        cud a2 = this.g.a();
        if (a2 == null) {
            return;
        }
        this.h.showLoading();
        this.g.a(0);
        String str = a2.f;
        kotlin.jvm.internal.q.a((Object) str, "result.frameUrl");
        RectF rectF = a2.g;
        kotlin.jvm.internal.q.a((Object) rectF, "result.cropRect");
        a(str, rectF, this.b);
    }

    /* loaded from: classes4.dex */
    public static final class b implements o.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ RectF c;

        public b(String str, RectF rectF) {
            this.b = str;
            this.c = rectF;
        }

        @Override // com.etao.feimagesearch.videosearch.o.b
        public void a(JSONObject result, String region, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8e3c9c2", new Object[]{this, result, region, new Boolean(z)});
                return;
            }
            kotlin.jvm.internal.q.c(result, "result");
            kotlin.jvm.internal.q.c(region, "region");
            cot.c(k.a(k.this), "fetchResult onSuccess");
            k.g(k.this).setResult(result, region, z);
            View root = k.g(k.this).getRoot();
            if (root != null) {
                root.setTranslationY(k.i(k.this).getHeight());
            }
            if (k.g(k.this).isLoaded()) {
                k.g(k.this).hideLoading();
                k.b(k.this).movePageToAssignPageLocationRatioWithAnim(0.0f, 150L, null);
            } else {
                k.g(k.this).setMuiseRenderCallback(new a());
            }
            k kVar = k.this;
            k.a(kVar, k.a(kVar, this.b, this.c));
        }

        /* loaded from: classes4.dex */
        public static final class a implements VideoResultList.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // com.etao.feimagesearch.videosearch.VideoResultList.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                cot.c(k.a(k.this), ljl.RENDER_SUCCESS_TIME);
                k.g(k.this).hideLoading();
                k.d(k.this);
            }

            @Override // com.etao.feimagesearch.videosearch.VideoResultList.a
            public void a(int i, String str, boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fd351acf", new Object[]{this, new Integer(i), str, new Boolean(z)});
                } else {
                    k.g(k.this).hideLoading();
                }
            }
        }

        @Override // com.etao.feimagesearch.videosearch.o.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                k.g(k.this).hideLoading();
            }
        }
    }

    private final void a(String str, RectF rectF, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161a5f1", new Object[]{this, str, rectF, new Boolean(z)});
            return;
        }
        String str3 = this.f7057a;
        cot.c(str3, "fetchResult ~ " + str);
        o oVar = this.m;
        if (oVar == null) {
            return;
        }
        b bVar = new b(str, rectF);
        VideoIrpActivity videoIrpActivity = this.k;
        if (videoIrpActivity == null || (str2 = videoIrpActivity.f()) == null) {
            str2 = "";
        }
        oVar.a(str, rectF, bVar, str2, z);
    }

    private final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        this.h.hideLoading();
        o oVar = this.m;
        if (oVar == null) {
            return;
        }
        oVar.a();
    }

    @Override // com.etao.feimagesearch.videosearch.j
    public void a(cuc event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4237307", new Object[]{this, event});
            return;
        }
        kotlin.jvm.internal.q.c(event, "event");
        this.p = true;
        RecyclerView recyclerView = this.f;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(event.c);
        }
        m();
        l();
        this.h.showLoading();
        this.g.a(event.c);
        String str = event.f26535a;
        kotlin.jvm.internal.q.a((Object) str, "event.imageUrl");
        RectF rectF = event.b;
        kotlin.jvm.internal.q.a((Object) rectF, "event.cropArea");
        a(str, rectF, this.b);
    }

    @Override // com.etao.feimagesearch.videosearch.j
    public void a(a callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b8024a", new Object[]{this, callback});
            return;
        }
        kotlin.jvm.internal.q.c(callback, "callback");
        this.n = callback;
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            n();
        }
    }

    private final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.c.setVisibility(0);
        this.i.setVisibility(0);
        if (!this.h.isLoaded()) {
            return;
        }
        this.i.movePageToAssignPageLocationRatioWithAnim(0.0f, 150L, null);
    }

    private final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        VideoIrpActivity videoIrpActivity = this.k;
        if (videoIrpActivity != null) {
            if (videoIrpActivity == null) {
                kotlin.jvm.internal.q.a();
            }
            videoIrpActivity.q();
        }
        this.c.setVisibility(4);
    }

    @Override // com.etao.feimagesearch.videosearch.j
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        o oVar = this.m;
        if (oVar != null) {
            oVar.c();
        }
        this.h.destroy();
        this.g.b();
    }

    @Override // com.etao.feimagesearch.videosearch.j
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.c.getVisibility();
    }

    @Override // com.etao.feimagesearch.videosearch.j
    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.p;
    }

    private final boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.h.contentReachTop();
    }

    @Override // com.etao.feimagesearch.videosearch.VideoResultList.b
    public int b(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        View root = this.h.getRoot();
        kotlin.jvm.internal.q.a((Object) root, "resultList.root");
        int translationY = (int) (root.getTranslationY() - i);
        if (translationY >= 0) {
            i2 = translationY > k() ? k() : translationY;
        }
        View root2 = this.h.getRoot();
        kotlin.jvm.internal.q.a((Object) root2, "resultList.root");
        View root3 = this.h.getRoot();
        kotlin.jvm.internal.q.a((Object) root3, "resultList.root");
        root3.setTranslationY(i2);
        return ((int) root2.getTranslationY()) - i2;
    }

    private final void b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3684528", new Object[]{this, viewGroup});
            return;
        }
        this.j = viewGroup.findViewById(R.id.video_search_result_blur_bg);
        View view = this.j;
        if (view != null) {
            view.setBackgroundColor(Color.argb((int) 178.5f, 0, 0, 0));
        }
        this.i.setDownContentHeight(0);
        this.i.setHeaderHeight(this.d.getHeight());
        this.i.addOnLayoutChangeListener(new c());
        this.i.setStateProvider(new d());
        this.i.setOffsetCallback(new e());
    }

    /* loaded from: classes4.dex */
    public static final class e implements ScrollInterceptView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
        public void a(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            if (i2 > i4) {
                i2 = i4;
            } else if (i2 < 0) {
                i2 = 0;
            }
            int i5 = i - i2;
            if (i5 < 0) {
                i5 -= k.this.b(i5);
            }
            float f = i - i5;
            float f2 = i3;
            if (f > f2) {
                f = f2;
            }
            float f3 = (100 - ((int) ((f / f2) * 100))) / 100.0f;
            View k = k.k(k.this);
            if (k == null) {
                return;
            }
            k.setAlpha(f3);
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            String a2 = k.a(k.this);
            cot.c(a2, "onStateChanged~ oldState " + i + ", newState = " + i2);
            if (i2 == -1 && k.this.g() != -1) {
                k.this.a(i2);
                k.this.j();
                cot.d("TRACK", "ResultScrollOffScreen");
                cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_RESULT.getPageName(), "ResultScrollOffScreen", new String[0]);
            } else if (i2 == 0 && k.this.g() != 0 && k.this.g() != -1) {
                k.this.a(i2);
                k.this.j();
                cot.d("TRACK", "ResultScrollDown");
                cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_RESULT.getPageName(), "ResultScrollDown", new String[0]);
            } else {
                if (i2 == 3 && k.this.g() != 3) {
                    View k = k.k(k.this);
                    if (k != null) {
                        k.setVisibility(0);
                    }
                    k.this.i();
                }
                if (i2 == 3 && k.this.g() != 3 && k.this.g() != -1) {
                    k.this.a(i2);
                    cox.b(StatisticalDataPoint.PageName.PHOTO_SEARCH_RESULT.getPageName(), "ResultScrollUp", new String[0]);
                } else if (i2 != -1 && i2 != 3 && i2 != 0) {
                } else {
                    k.this.a(i2);
                }
            }
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                cot.d(k.a(k.this), "onScrollToBottom");
            }
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        a aVar = this.n;
        if (aVar != null) {
            aVar.b();
        }
        View view = this.j;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        View view = this.j;
        if (view != null) {
            view.setVisibility(4);
        }
        a aVar = this.n;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }
}
