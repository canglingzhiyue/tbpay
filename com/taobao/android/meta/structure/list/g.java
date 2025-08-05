package com.taobao.android.meta.structure.list;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.WindowType;
import com.taobao.android.megaadaptivekit.gesture.a;
import com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.xsl.section.SectionLayout;
import com.taobao.android.searchbaseframe.xsl.section.g;
import com.taobao.android.searchbaseframe.xsl.section.refact.XSectionLayout;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import kotlin.TypeCastException;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.hte;
import tb.inx;
import tb.ise;
import tb.ivn;
import tb.kge;
import tb.myg;
import tb.rwf;

/* loaded from: classes6.dex */
public class g extends inx<FrameLayout, com.taobao.android.meta.structure.list.a> implements com.taobao.android.meta.structure.list.b, com.taobao.android.searchbaseframe.uikit.screentype.a, XSectionLayout.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f14294a;
    private FrameLayout g;
    private XSectionLayout h;
    private com.taobao.android.searchbaseframe.xsl.section.refact.c i;
    private inx.b j;
    private LinearLayout k;
    private LinearLayout l;
    private boolean m;
    private final kotlin.d n;
    private final hte o;
    private int p;
    private com.taobao.android.megaadaptivekit.gesture.a q;

    /* loaded from: classes6.dex */
    public static final class b extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3018fdc0", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            } else if (!g.b(g.this)) {
            } else {
                g.c(g.this);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class e implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            WindowType b;
            com.taobao.android.megaadaptivekit.gesture.a k;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (g.h(g.this) != ListStyle.LIST && (b = com.taobao.android.autosize.h.a().b(g.j(g.this))) != WindowType.MIN && b != WindowType.SMALL && (k = g.k(g.this)) != null) {
                k.a(motionEvent);
            }
            return false;
        }
    }

    static {
        kge.a(937199526);
        kge.a(219399731);
        kge.a(1557738531);
        kge.a(-1327398134);
        f14294a = new k[]{t.a(new PropertyReference1Impl(t.b(g.class), "scrollToHelper", "getScrollToHelper()Lcom/taobao/android/searchbaseframe/xsl/list/ScrollToHelper;"))};
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1256514261) {
            super.a((RecyclerView.Adapter) objArr[0]);
            return null;
        } else if (hashCode == 92838762) {
            super.c();
            return null;
        } else if (hashCode != 1803856229) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((ListStyle) objArr[0]);
            return null;
        }
    }

    private final ivn r() {
        IpChange ipChange = $ipChange;
        return (ivn) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("91d223ac", new Object[]{this}) : this.n.getValue());
    }

    public g(hte metaConfig) {
        q.c(metaConfig, "metaConfig");
        this.o = metaConfig;
        this.p = -1;
        this.n = kotlin.e.a(new MetaListView$scrollToHelper$2(this));
    }

    public static final /* synthetic */ int a(g gVar, ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d072e172", new Object[]{gVar, listStyle})).intValue() : gVar.c(listStyle);
    }

    public static final /* synthetic */ FrameLayout a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("87eb818b", new Object[]{gVar});
        }
        FrameLayout frameLayout = gVar.g;
        if (frameLayout == null) {
            q.b("rootView");
        }
        return frameLayout;
    }

    public static final /* synthetic */ void a(g gVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d36e", new Object[]{gVar, new Integer(i), new Integer(i2)});
        } else {
            gVar.a(i, i2);
        }
    }

    public static final /* synthetic */ boolean b(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e77e04d3", new Object[]{gVar})).booleanValue() : gVar.m;
    }

    public static final /* synthetic */ void c(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf82b10", new Object[]{gVar});
        } else {
            gVar.u();
        }
    }

    public static final /* synthetic */ XSectionLayout d(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XSectionLayout) ipChange.ipc$dispatch("3bb87523", new Object[]{gVar});
        }
        XSectionLayout xSectionLayout = gVar.h;
        if (xSectionLayout == null) {
            q.b("sectionLayout");
        }
        return xSectionLayout;
    }

    public static final /* synthetic */ hte e(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hte) ipChange.ipc$dispatch("b4649cfb", new Object[]{gVar}) : gVar.o;
    }

    public static final /* synthetic */ ListStyle h(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ListStyle) ipChange.ipc$dispatch("c8c11812", new Object[]{gVar}) : gVar.e;
    }

    public static final /* synthetic */ PartnerRecyclerView i(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PartnerRecyclerView) ipChange.ipc$dispatch("883962a2", new Object[]{gVar}) : gVar.c;
    }

    public static final /* synthetic */ Activity j(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("4dfe2031", new Object[]{gVar}) : gVar.f;
    }

    public static final /* synthetic */ com.taobao.android.megaadaptivekit.gesture.a k(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.megaadaptivekit.gesture.a) ipChange.ipc$dispatch("690c1906", new Object[]{gVar}) : gVar.q;
    }

    @Override // tb.iuj
    public /* synthetic */ Object b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : f();
    }

    @Override // tb.iuj
    public /* synthetic */ Object b(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c01d4bb4", new Object[]{this, context, viewGroup}) : a(context, viewGroup);
    }

    @Override // com.taobao.android.meta.structure.list.b
    public void a(int i, int i2, boolean z, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d1ddb77", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3)});
            return;
        }
        l().stopScroll();
        RecyclerView l = l();
        if (l == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        }
        r().a(i + ((PartnerRecyclerView) l).getHeaderViewsCount(), z, i2, i3);
    }

    @Override // com.taobao.android.meta.structure.list.b
    public void a(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2621338a", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
            return;
        }
        l().stopScroll();
        r().a(0, z, i, i2);
    }

    @Override // com.taobao.android.meta.structure.list.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        PartnerRecyclerView partnerRecyclerView = this.c;
        if (partnerRecyclerView == null) {
            return;
        }
        partnerRecyclerView.invalidateItemDecorations();
    }

    @Override // com.taobao.android.meta.structure.list.b
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        q.c(view, "view");
        LinearLayout linearLayout = this.k;
        if (linearLayout == null) {
            q.b("footerContainer");
        }
        linearLayout.addView(view, new ViewGroup.LayoutParams(-1, -2));
    }

    @Override // com.taobao.android.meta.structure.list.b
    public void cW_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecec592", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.k;
        if (linearLayout == null) {
            q.b("footerContainer");
        }
        linearLayout.removeAllViews();
    }

    @Override // com.taobao.android.meta.structure.list.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        LinearLayout linearLayout = this.k;
        if (linearLayout == null) {
            q.b("footerContainer");
        }
        if (!z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    @Override // com.taobao.android.meta.structure.list.b
    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
            return;
        }
        q.c(view, "view");
        LinearLayout linearLayout = this.l;
        if (linearLayout == null) {
            q.b("headerContainer");
        }
        linearLayout.addView(view);
        LinearLayout linearLayout2 = this.l;
        if (linearLayout2 == null) {
            q.b("headerContainer");
        }
        linearLayout2.setMinimumHeight(1);
    }

    @Override // com.taobao.android.meta.structure.list.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.l;
        if (linearLayout == null) {
            q.b("headerContainer");
        }
        linearLayout.setMinimumHeight(0);
        LinearLayout linearLayout2 = this.l;
        if (linearLayout2 == null) {
            q.b("headerContainer");
        }
        linearLayout2.removeAllViews();
    }

    @Override // tb.ioa
    public ViewGroup e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4fb55629", new Object[]{this});
        }
        LinearLayout linearLayout = this.l;
        if (linearLayout == null) {
            q.b("headerContainer");
        }
        return linearLayout;
    }

    private final void a(Context context, PartnerRecyclerView partnerRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9ac90c2", new Object[]{this, context, partnerRecyclerView});
        } else if (!this.o.av()) {
        } else {
            com.taobao.android.megaadaptivekit.gesture.a aVar = new com.taobao.android.megaadaptivekit.gesture.a(context);
            aVar.a(new d());
            this.q = aVar;
            partnerRecyclerView.setOnTouchListener(new e());
        }
    }

    /* loaded from: classes6.dex */
    public static final class d implements com.taobao.android.megaadaptivekit.gesture.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.megaadaptivekit.gesture.b
        public void a(ScaleGestureDetector detector) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adc0528a", new Object[]{this, detector});
            } else {
                q.c(detector, "detector");
            }
        }

        public d() {
        }

        @Override // com.taobao.android.megaadaptivekit.gesture.b
        public void a(a.C0547a config) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fe0a1d3", new Object[]{this, config});
                return;
            }
            q.c(config, "config");
            PartnerRecyclerView mRecycler = g.i(g.this);
            q.a((Object) mRecycler, "mRecycler");
            RecyclerView.LayoutManager layoutManager = mRecycler.getLayoutManager();
            if (layoutManager == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager");
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int spanCount = staggeredGridLayoutManager.getSpanCount();
            g gVar = g.this;
            ListStyle mStyle = g.h(gVar);
            q.a((Object) mStyle, "mStyle");
            int a2 = g.a(gVar, mStyle);
            staggeredGridLayoutManager.setSpanCount(a2);
            g.a(g.this, a2, spanCount);
        }
    }

    private final void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.e == ListStyle.LIST) {
        } else {
            if (i > i2) {
                Toast.makeText(this.f, com.alibaba.ability.localization.b.a(R.string.sf_show_more_content), 0).show();
            } else if (i < i2) {
                Toast.makeText(this.f, com.alibaba.ability.localization.b.a(R.string.sf_show_less_content), 0).show();
            } else if (i <= 3) {
                Toast.makeText(this.f, com.alibaba.ability.localization.b.a(R.string.sf_cannot_scale_up), 0).show();
            } else {
                Toast.makeText(this.f, com.alibaba.ability.localization.b.a(R.string.sf_cannot_scale_down), 0).show();
            }
        }
    }

    public FrameLayout a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("8d96acda", new Object[]{this, context, viewGroup});
        }
        q.c(context, "context");
        this.g = new FrameLayout(context);
        this.o.u().a(new MetaListView$createView$1(this));
        PartnerRecyclerView a2 = this.o.aB().a(context);
        if (this.o.ay()) {
            a2.restrainFirstScrollChange();
            this.o.u(false);
        }
        a2.disableScrollFeature();
        ScreenType a3 = ScreenType.a(context);
        if (a3 != null) {
            a3.a(this);
            this.p = a3.a();
            a(context, a2);
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            q.b("rootView");
        }
        frameLayout.addView(a2, new FrameLayout.LayoutParams(-1, -1));
        this.h = new XSectionLayout(context);
        XSectionLayout xSectionLayout = this.h;
        if (xSectionLayout == null) {
            q.b("sectionLayout");
        }
        xSectionLayout.setBackgroundSetter(this);
        XSectionLayout xSectionLayout2 = this.h;
        if (xSectionLayout2 == null) {
            q.b("sectionLayout");
        }
        xSectionLayout2.setItemBackgroundProvider((g.a) q());
        s();
        a(a2, context, viewGroup);
        c(a2);
        this.i = new com.taobao.android.searchbaseframe.xsl.section.refact.c();
        com.taobao.android.searchbaseframe.xsl.section.refact.c cVar = this.i;
        if (cVar == null) {
            q.b("bgDecoration");
        }
        cVar.a((g.a) q());
        this.k = new LinearLayout(context);
        LinearLayout linearLayout = this.k;
        if (linearLayout == null) {
            q.b("footerContainer");
        }
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = this.k;
        if (linearLayout2 == null) {
            q.b("footerContainer");
        }
        linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout linearLayout3 = this.k;
        if (linearLayout3 == null) {
            q.b("footerContainer");
        }
        a2.addFooterView(linearLayout3);
        a2.setFixTrigger(this.o.aa());
        a2.getHeaderFrame().addOnAttachStateChangeListener(new a(a2));
        this.o.ab().a(new MetaListView$createView$3(a2));
        this.l = new LinearLayout(context);
        LinearLayout linearLayout4 = this.l;
        if (linearLayout4 == null) {
            q.b("headerContainer");
        }
        linearLayout4.setOrientation(1);
        LinearLayout linearLayout5 = this.l;
        if (linearLayout5 == null) {
            q.b("headerContainer");
        }
        a2.addHeaderView(linearLayout5);
        if (this.o.W()) {
            a2.addOnScrollListener(new b());
        }
        if (this.o.Z()) {
            a2.setDescendantFocusability(393216);
        }
        FrameLayout frameLayout2 = this.g;
        if (frameLayout2 == null) {
            q.b("rootView");
        }
        return frameLayout2;
    }

    /* loaded from: classes6.dex */
    public static final class a implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PartnerRecyclerView f14295a;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            }
        }

        public a(PartnerRecyclerView partnerRecyclerView) {
            this.f14295a = partnerRecyclerView;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                return;
            }
            FrameLayout headerFrame = this.f14295a.getHeaderFrame();
            q.a((Object) headerFrame, "recyclerView.headerFrame");
            this.f14295a.setTotalScrollOffset(-headerFrame.getTop());
        }
    }

    private final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (!this.o.z()) {
        } else {
            FrameLayout frameLayout = this.g;
            if (frameLayout == null) {
                q.b("rootView");
            }
            XSectionLayout xSectionLayout = this.h;
            if (xSectionLayout == null) {
                q.b("sectionLayout");
            }
            frameLayout.addView(xSectionLayout, new FrameLayout.LayoutParams(-1, -1));
            this.o.E().a(new MetaListView$applySectionProperties$1(this));
            this.o.J().a(new MetaListView$applySectionProperties$2(this));
            XSectionLayout xSectionLayout2 = this.h;
            if (xSectionLayout2 == null) {
                q.b("sectionLayout");
            }
            xSectionLayout2.setSectionChangeListener((SectionLayout.a) q());
        }
    }

    private final void c(PartnerRecyclerView partnerRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f23cc", new Object[]{this, partnerRecyclerView});
            return;
        }
        this.o.r().a(new MetaListView$applyListProperties$1(partnerRecyclerView));
        this.o.K().a(new MetaListView$applyListProperties$2(this, partnerRecyclerView));
        RecyclerView l = l();
        if (l == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.list.uikit.PartnerRecyclerView");
        }
        FrameLayout footerFrame = ((PartnerRecyclerView) l).getFooterFrame();
        this.o.L().a(new MetaListView$applyListProperties$3(this, footerFrame));
        this.o.M().a(new MetaListView$applyListProperties$4(partnerRecyclerView));
        this.o.N().a(new MetaListView$applyListProperties$5(this, partnerRecyclerView));
        this.o.Q().a(new MetaListView$applyListProperties$6(this, footerFrame));
        this.o.R().a(new MetaListView$applyListProperties$7(footerFrame));
        this.o.O().a(new MetaListView$applyListProperties$8(this));
        this.o.P().a(new MetaListView$applyListProperties$9(this));
        this.o.ac().a(new MetaListView$applyListProperties$10(this));
    }

    public FrameLayout f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ef845acc", new Object[]{this});
        }
        FrameLayout frameLayout = this.g;
        if (frameLayout == null) {
            q.b("rootView");
        }
        return frameLayout;
    }

    @Override // tb.inx
    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.o.t();
    }

    private final inx.b t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (inx.b) ipChange.ipc$dispatch("2927015a", new Object[]{this});
        }
        if (this.j == null) {
            ise<Void, inx.b> s = this.o.s();
            inx.b bVar = null;
            if (s != null) {
                bVar = s.a(null);
            }
            this.j = bVar;
        }
        return this.j;
    }

    @Override // tb.inx, tb.ioa
    public void a(ListStyle style) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b84a965", new Object[]{this, style});
            return;
        }
        q.c(style, "style");
        super.a(style);
        PartnerRecyclerView mRecycler = this.c;
        q.a((Object) mRecycler, "mRecycler");
        RecyclerView.LayoutManager layoutManager = mRecycler.getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return;
        }
        if (style == ListStyle.LIST) {
            ((StaggeredGridLayoutManager) layoutManager).setSpanCount(c(style));
            this.m = false;
            return;
        }
        Integer a2 = this.o.ac().a();
        if (a2 == null) {
            q.a();
        }
        int intValue = a2.intValue();
        if (intValue > 0) {
            ((StaggeredGridLayoutManager) layoutManager).setSpanCount(intValue);
        } else {
            ((StaggeredGridLayoutManager) layoutManager).setSpanCount(c(style));
        }
        this.m = true;
    }

    private final void u() {
        try {
            if (com.taobao.android.searchbaseframe.xsl.section.refact.a.f15053a == null) {
                Method declaredMethod = StaggeredGridLayoutManager.class.getDeclaredMethod("checkForGaps", new Class[0]);
                com.taobao.android.searchbaseframe.xsl.section.refact.a.f15053a = declaredMethod;
                q.a((Object) declaredMethod, "ClipDecoration.sCheckForGap");
                declaredMethod.setAccessible(true);
            }
            Method method = com.taobao.android.searchbaseframe.xsl.section.refact.a.f15053a;
            RecyclerView recyclerView = l();
            q.a((Object) recyclerView, "recyclerView");
            Object invoke = method.invoke(recyclerView.getLayoutManager(), new Object[0]);
            if (invoke == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
            }
            boolean booleanValue = ((Boolean) invoke).booleanValue();
            if (!this.m || !booleanValue) {
                return;
            }
            this.m = false;
        } catch (Exception unused) {
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends myg {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ PartnerRecyclerView b;
        private Parcelable c;

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case 1092366570:
                    super.onLayoutCompleted((RecyclerView.State) objArr[0]);
                    return null;
                case 1133151231:
                    super.onDetachedFromWindow((RecyclerView) objArr[0], (RecyclerView.Recycler) objArr[1]);
                    return null;
                case 1238488515:
                    super.onAttachedToWindow((RecyclerView) objArr[0]);
                    return null;
                case 1820198362:
                    super.onMeasure((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                    return null;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PartnerRecyclerView partnerRecyclerView, int i, int i2) {
            super(i, i2);
            this.b = partnerRecyclerView;
        }

        @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public void onLayoutCompleted(RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("411c30ea", new Object[]{this, state});
                return;
            }
            q.c(state, "state");
            super.onLayoutCompleted(state);
            this.b.notifyLayoutComplete();
        }

        @Override // android.support.v7.widget.RecyclerView.LayoutManager
        public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c7e05da", new Object[]{this, recycler, state, new Integer(i), new Integer(i2)});
                return;
            }
            super.onMeasure(recycler, state, i, i2);
            int headerViewsCount = this.b.getHeaderViewsCount() + this.b.getFooterViewsCount();
            if (!q.a((Object) g.e(g.this).ab().a(), (Object) true) || getItemCount() <= headerViewsCount) {
                return;
            }
            FrameLayout footerFrame = this.b.getFooterFrame();
            q.a((Object) footerFrame, "footerFrame");
            scrollToPositionWithOffset(getItemCount() - 1, this.b.getMeasuredHeight() - rwf.c(footerFrame.getMeasuredHeight(), footerFrame.getPaddingTop()));
        }

        @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("438a83ff", new Object[]{this, recyclerView, recycler});
                return;
            }
            if (getSpanCount() > 1) {
                this.c = onSaveInstanceState();
            }
            super.onDetachedFromWindow(recyclerView, recycler);
        }

        @Override // android.support.v7.widget.RecyclerView.LayoutManager
        public void onAttachedToWindow(RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49d1d5c3", new Object[]{this, recyclerView});
                return;
            }
            Parcelable parcelable = this.c;
            if (parcelable != null) {
                onRestoreInstanceState(parcelable);
                this.c = null;
            }
            super.onAttachedToWindow(recyclerView);
        }
    }

    @Override // tb.inx
    public StaggeredGridLayoutManager a(PartnerRecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StaggeredGridLayoutManager) ipChange.ipc$dispatch("a0dc9ccd", new Object[]{this, recyclerView});
        }
        q.c(recyclerView, "recyclerView");
        com.taobao.android.meta.structure.list.a presenter = (com.taobao.android.meta.structure.list.a) q();
        q.a((Object) presenter, "presenter");
        c cVar = new c(recyclerView, presenter.u(), 1);
        cVar.a(recyclerView);
        return cVar;
    }

    @Override // tb.inx
    public RecyclerView.ItemDecoration a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ItemDecoration) ipChange.ipc$dispatch("265bd166", new Object[]{this, new Integer(i)});
        }
        inx.b t = t();
        if (t == null) {
            return null;
        }
        com.taobao.android.meta.structure.list.a presenter = (com.taobao.android.meta.structure.list.a) q();
        q.a((Object) presenter, "presenter");
        return t.b(i, presenter.p());
    }

    @Override // tb.inx
    public void b(ListStyle style) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cbafc44", new Object[]{this, style});
            return;
        }
        q.c(style, "style");
        inx.b t = t();
        if (t == null) {
            return;
        }
        int i = this.d;
        com.taobao.android.meta.structure.list.a presenter = (com.taobao.android.meta.structure.list.a) q();
        q.a((Object) presenter, "presenter");
        t.a(style, i, presenter.p(), this.c, this.b);
    }

    @Override // tb.inx, tb.ioa
    public void a(RecyclerView.Adapter<?> adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51b1d2b", new Object[]{this, adapter});
            return;
        }
        super.a(adapter);
        if (!this.o.z()) {
            return;
        }
        XSectionLayout xSectionLayout = this.h;
        if (xSectionLayout == null) {
            q.b("sectionLayout");
        }
        RecyclerView l = l();
        if (adapter == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.taobao.android.searchbaseframe.xsl.section.ISectionAdapter");
        }
        com.taobao.android.searchbaseframe.xsl.section.c cVar = (com.taobao.android.searchbaseframe.xsl.section.c) adapter;
        xSectionLayout.attach(l, cVar);
        com.taobao.android.searchbaseframe.xsl.section.refact.c cVar2 = this.i;
        if (cVar2 == null) {
            q.b("bgDecoration");
        }
        cVar2.a(l(), cVar);
    }

    @Override // tb.inx
    public void b(PartnerRecyclerView partnerRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5162b64b", new Object[]{this, partnerRecyclerView});
        } else {
            this.o.S().a(new MetaListView$setupRecyclerView$1(partnerRecyclerView));
        }
    }

    @Override // com.taobao.android.searchbaseframe.uikit.screentype.a
    public void i_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57263006", new Object[]{this, new Integer(i)});
            return;
        }
        this.p = i;
        if (this.c == null) {
            return;
        }
        PartnerRecyclerView mRecycler = this.c;
        q.a((Object) mRecycler, "mRecycler");
        RecyclerView.LayoutManager layoutManager = mRecycler.getLayoutManager();
        if (layoutManager == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager");
        }
        ListStyle mStyle = this.e;
        q.a((Object) mStyle, "mStyle");
        int c2 = c(mStyle);
        ((StaggeredGridLayoutManager) layoutManager).setSpanCount(c2);
        com.taobao.android.searchbaseframe.util.k.d("ms.containerWidth", "update span count to " + c2, new Object[0]);
    }

    @Override // tb.iuf, tb.iuj
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        com.taobao.android.megaadaptivekit.gesture.a aVar = this.q;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private final int c(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6df14f16", new Object[]{this, listStyle})).intValue();
        }
        if (listStyle == ListStyle.LIST) {
            return 1;
        }
        Context context = f().getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null) {
            return 2;
        }
        this.o.ac();
        boolean av = this.o.av();
        a.C0547a columnConfiguration = a.C0547a.a(activity);
        if (this.p == 3 && av) {
            q.a((Object) columnConfiguration, "columnConfiguration");
            return columnConfiguration.a();
        }
        WindowType b2 = com.taobao.android.autosize.h.a().b(activity);
        if (b2 != null) {
            int i = i.$EnumSwitchMapping$0[b2.ordinal()];
            if (i == 1) {
                if (!av) {
                    return 5;
                }
                q.a((Object) columnConfiguration, "columnConfiguration");
                return columnConfiguration.b();
            } else if (i == 2) {
                if (!av) {
                    return 4;
                }
                q.a((Object) columnConfiguration, "columnConfiguration");
                return columnConfiguration.d();
            } else if (i == 3) {
                if (!av) {
                    return 4;
                }
                q.a((Object) columnConfiguration, "columnConfiguration");
                return columnConfiguration.c();
            }
        }
        return 2;
    }
}
