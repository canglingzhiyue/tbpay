package com.etao.feimagesearch.newresult.widget.titlebar;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.irp.b;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.etao.feimagesearch.ui.CornerImageView;
import com.etao.feimagesearch.util.ao;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.LinkedList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import tb.com;
import tb.coy;
import tb.cpe;
import tb.fhs;
import tb.hon;
import tb.igi;
import tb.igj;
import tb.kge;

/* loaded from: classes3.dex */
public final class e extends igj<FrameLayout, IrpDatasource> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FrameLayout f6866a;
    private View b;
    private View c;
    private View d;
    private RecyclerView e;
    private IrpDatasource f;

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e.c(e.this).setVisibility(8);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6871a;

        public d(int i) {
            this.f6871a = i;
        }

        @Override // android.support.v7.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
                return;
            }
            int childAdapterPosition = recyclerView != null ? recyclerView.getChildAdapterPosition(view) : 0;
            if (state != null) {
                i = state.getItemCount();
            }
            if (childAdapterPosition == i - 1 || rect == null) {
                return;
            }
            rect.right = this.f6871a;
        }
    }

    /* renamed from: com.etao.feimagesearch.newresult.widget.titlebar.e$e  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class View$OnTouchListenerC0240e implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View$OnTouchListenerC0240e() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            e.a(e.this);
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            e.a(e.this);
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e.c(e.this).setVisibility(0);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                e.a(e.this);
            }
        }
    }

    static {
        kge.a(745174344);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfcbffdc", new Object[]{eVar});
        } else {
            eVar.eW_();
        }
    }

    public static final /* synthetic */ FrameLayout c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("aec5bc3b", new Object[]{eVar});
        }
        FrameLayout frameLayout = eVar.f6866a;
        if (frameLayout == null) {
            q.b("mRootView");
        }
        return frameLayout;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.FrameLayout, android.view.View] */
    @Override // tb.igj
    public /* synthetic */ FrameLayout k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this}) : a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Activity activity, hon parent, IrpDatasource irpDatasource, igi setter) {
        super(activity, parent, irpDatasource, setter);
        q.c(activity, "activity");
        q.c(parent, "parent");
        q.c(irpDatasource, "irpDatasource");
        q.c(setter, "setter");
        this.f = irpDatasource;
    }

    public FrameLayout a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("46931b71", new Object[]{this});
        }
        View inflate = LayoutInflater.from(g()).inflate(R.layout.feis_irp_scan_code_region_guide, P(), false);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f6866a = (FrameLayout) inflate;
        FrameLayout frameLayout = this.f6866a;
        if (frameLayout == null) {
            q.b("mRootView");
        }
        View findViewById = frameLayout.findViewById(R.id.view_guide_top);
        q.a((Object) findViewById, "mRootView.findViewById(R.id.view_guide_top)");
        this.b = findViewById;
        FrameLayout frameLayout2 = this.f6866a;
        if (frameLayout2 == null) {
            q.b("mRootView");
        }
        View findViewById2 = frameLayout2.findViewById(R.id.view_guide_bottom);
        q.a((Object) findViewById2, "mRootView.findViewById(R.id.view_guide_bottom)");
        this.c = findViewById2;
        FrameLayout frameLayout3 = this.f6866a;
        if (frameLayout3 == null) {
            q.b("mRootView");
        }
        View findViewById3 = frameLayout3.findViewById(R.id.fl_region_container);
        q.a((Object) findViewById3, "mRootView.findViewById(R.id.fl_region_container)");
        this.d = findViewById3;
        FrameLayout frameLayout4 = this.f6866a;
        if (frameLayout4 == null) {
            q.b("mRootView");
        }
        View findViewById4 = frameLayout4.findViewById(R.id.rv_region);
        q.a((Object) findViewById4, "mRootView.findViewById(R.id.rv_region)");
        this.e = (RecyclerView) findViewById4;
        FrameLayout frameLayout5 = this.f6866a;
        if (frameLayout5 == null) {
            q.b("mRootView");
        }
        frameLayout5.setVisibility(8);
        FrameLayout frameLayout6 = this.f6866a;
        if (frameLayout6 == null) {
            q.b("mRootView");
        }
        return frameLayout6;
    }

    public final void a(LinkedList<com.etao.feimagesearch.result.d> linkedList, boolean z, int i) {
        LinkedList<com.etao.feimagesearch.result.d> g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db2786f", new Object[]{this, linkedList, new Boolean(z), new Integer(i)});
        } else if (m().O().isEmpty()) {
        } else {
            LinkedList<com.etao.feimagesearch.result.d> linkedList2 = linkedList;
            if ((linkedList2 == null || linkedList2.isEmpty()) || com.etao.feimagesearch.config.b.dE()) {
                return;
            }
            Boolean j = com.etao.feimagesearch.config.b.j(fhs.KEY_IRP_TITLE_BAR_GUIDE);
            if (!((j != null && j.booleanValue()) || (!q.a((Object) this.f.r(), (Object) cpe.PsSourceSY_SYS) ? !com.etao.feimagesearch.k.c(g(), fhs.KEY_IRP_TITLE_BAR_GUIDE) : !com.etao.feimagesearch.k.c(g(), fhs.KEY_IRP_CODE_HEAD_CLICK)))) {
                return;
            }
            com.etao.feimagesearch.k.a((Context) g(), fhs.KEY_IRP_TITLE_BAR_GUIDE, true);
            int a2 = j.a((z ? 3.0f : 8.0f) + 32.0f);
            int a3 = j.a(fhs.f(z));
            View view = this.d;
            if (view == null) {
                q.b("mRegionContainer");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = a2;
            layoutParams2.height = a3;
            View view2 = this.d;
            if (view2 == null) {
                q.b("mRegionContainer");
            }
            view2.setLayoutParams(layoutParams2);
            View view3 = this.b;
            if (view3 == null) {
                q.b("mGuideTopBg");
            }
            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
            int i2 = a3 + a2;
            layoutParams3.height = i2;
            View view4 = this.b;
            if (view4 == null) {
                q.b("mGuideTopBg");
            }
            view4.setLayoutParams(layoutParams3);
            View view5 = this.b;
            if (view5 == null) {
                q.b("mGuideTopBg");
            }
            view5.setBackgroundColor(Color.parseColor("#000000"));
            View view6 = this.c;
            if (view6 == null) {
                q.b("mGuideBottomBg");
            }
            ViewGroup.LayoutParams layoutParams4 = view6.getLayoutParams();
            if (layoutParams4 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) layoutParams4;
            layoutParams5.topMargin = i2;
            View view7 = this.c;
            if (view7 == null) {
                q.b("mGuideBottomBg");
            }
            view7.setLayoutParams(layoutParams5);
            View view8 = this.c;
            if (view8 == null) {
                q.b("mGuideBottomBg");
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setColors(new int[]{Color.parseColor("#CC000000"), Color.parseColor("#00000000")});
            gradientDrawable.setGradientType(0);
            view8.setBackground(gradientDrawable);
            int a4 = j.a(fhs.h(z));
            RecyclerView recyclerView = this.e;
            if (recyclerView == null) {
                q.b("mRegionRv");
            }
            ViewGroup.LayoutParams layoutParams6 = recyclerView.getLayoutParams();
            if (layoutParams6 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) layoutParams6;
            layoutParams7.height = a4;
            int a5 = j.a(13.0f);
            layoutParams7.leftMargin = a5;
            RecyclerView recyclerView2 = this.e;
            if (recyclerView2 == null) {
                q.b("mRegionRv");
            }
            recyclerView2.setLayoutParams(layoutParams7);
            RecyclerView recyclerView3 = this.e;
            if (recyclerView3 == null) {
                q.b("mRegionRv");
            }
            recyclerView3.setLayoutManager(new LinearLayoutManager(g(), 0, false));
            RecyclerView recyclerView4 = this.e;
            if (recyclerView4 == null) {
                q.b("mRegionRv");
            }
            recyclerView4.setItemAnimator(null);
            int a6 = j.a(fhs.b());
            RecyclerView recyclerView5 = this.e;
            if (recyclerView5 == null) {
                q.b("mRegionRv");
            }
            recyclerView5.addItemDecoration(new d(a6));
            int a7 = j.a(fhs.g(z));
            int i3 = i / (a7 + a6);
            if (linkedList.size() < i3) {
                g2 = linkedList;
            } else {
                List<com.etao.feimagesearch.result.d> subList = linkedList.subList(0, i3);
                q.a((Object) subList, "titleBarRegionImgList.subList(0, showCount)");
                g2 = p.g((Iterable) subList);
            }
            RecyclerView recyclerView6 = this.e;
            if (recyclerView6 == null) {
                q.b("mRegionRv");
            }
            recyclerView6.setOnTouchListener(new View$OnTouchListenerC0240e());
            RecyclerView recyclerView7 = this.e;
            if (recyclerView7 == null) {
                q.b("mRegionRv");
            }
            recyclerView7.setAdapter(new a(this, z, g2));
            FrameLayout frameLayout = this.f6866a;
            if (frameLayout == null) {
                q.b("mRootView");
            }
            TUrlImageView tUrlImageView = (TUrlImageView) frameLayout.findViewById(R.id.tiv_hing_bg);
            q.a((Object) tUrlImageView, "this");
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01wmMiGr1ChLHJ6TXvt_!!6000000000112-2-tps-568-180.png");
            FrameLayout frameLayout2 = this.f6866a;
            if (frameLayout2 == null) {
                q.b("mRootView");
            }
            View guideHintView = frameLayout2.findViewById(R.id.fl_guide_hint);
            q.a((Object) guideHintView, "guideHintView");
            ViewGroup.LayoutParams layoutParams8 = guideHintView.getLayoutParams();
            if (layoutParams8 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) layoutParams8;
            layoutParams9.width = j.a(140.0f);
            layoutParams9.topMargin = a2 + a4;
            layoutParams9.leftMargin = (((a5 + a7) + a6) + (a7 / 2)) - j.a(70.0f);
            guideHintView.setLayoutParams(layoutParams9);
            FrameLayout frameLayout3 = this.f6866a;
            if (frameLayout3 == null) {
                q.b("mRootView");
            }
            frameLayout3.setOnTouchListener(new f());
            FrameLayout frameLayout4 = this.f6866a;
            if (frameLayout4 == null) {
                q.b("mRootView");
            }
            frameLayout4.postDelayed(new g(), 200L);
            FrameLayout frameLayout5 = this.f6866a;
            if (frameLayout5 == null) {
                q.b("mRootView");
            }
            frameLayout5.postDelayed(new h(), 3000L);
            coy.c("Page_PhotoSearchResult", "codeBoxGuideExpose", new String[0]);
        }
    }

    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.Adapter<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f6867a;
        private int b;
        private boolean c;
        private List<? extends com.etao.feimagesearch.result.d> d;

        /* renamed from: com.etao.feimagesearch.newresult.widget.titlebar.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class View$OnClickListenerC0239a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ int b;

            public View$OnClickListenerC0239a(int i) {
                this.b = i;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                com.etao.feimagesearch.k.a((Context) com.b(), fhs.KEY_IRP_CODE_HEAD_CLICK, true);
                e.a(a.this.f6867a);
                coy.a("Page_PhotoSearchResult", "codeBoxGuideClick", new String[0]);
                if (this.b != a.a(a.this)) {
                    return;
                }
                com.etao.feimagesearch.result.d dVar = a.this.a().get(a.a(a.this));
                if (!dVar.a()) {
                    return;
                }
                ao.a();
                b.a a2 = a.this.f6867a.m().a(dVar.c);
                if (a2 == null) {
                    return;
                }
                com.etao.feimagesearch.capture.scan.irp.b.a().a((FragmentActivity) a.this.f6867a.g(), a2);
            }
        }

        static {
            kge.a(1651460886);
        }

        public a(e eVar, boolean z, List<? extends com.etao.feimagesearch.result.d> titleBarRegionImgList) {
            q.c(titleBarRegionImgList, "titleBarRegionImgList");
            this.f6867a = eVar;
            this.c = z;
            this.d = titleBarRegionImgList;
            this.b = -1;
        }

        public static final /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ba070f2", new Object[]{aVar})).intValue() : aVar.b;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public /* synthetic */ void onBindViewHolder(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1071b8aa", new Object[]{this, bVar, new Integer(i)});
            } else {
                a(bVar, i);
            }
        }

        /* JADX WARN: Type inference failed for: r4v6, types: [android.support.v7.widget.RecyclerView$ViewHolder, com.etao.feimagesearch.newresult.widget.titlebar.e$b] */
        @Override // android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: onCreateViewHolder */
        public /* synthetic */ b mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
        }

        public final List<com.etao.feimagesearch.result.d> a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.d;
        }

        public b a(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("76cf6d90", new Object[]{this, viewGroup, new Integer(i)}) : new b(this.c);
        }

        public void a(b bVar, int i) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("687c3965", new Object[]{this, bVar, new Integer(i)});
            } else if (bVar == null) {
            } else {
                int adapterPosition = bVar.getAdapterPosition();
                if (this.d.get(adapterPosition).a() && this.b < 0) {
                    this.b = adapterPosition;
                    z = false;
                }
                bVar.a(this.d.get(adapterPosition), z);
                bVar.itemView.setOnClickListener(new View$OnClickListenerC0239a(adapterPosition));
            }
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue() : this.d.size();
        }
    }

    /* loaded from: classes3.dex */
    public final class b extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final View b;
        private final CornerImageView c;
        private final FrameLayout d;
        private final int e;
        private boolean f;

        static {
            kge.a(-1409936502);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public b(boolean z) {
            super(LayoutInflater.from(e.this.g()).inflate(R.layout.feis_view_title_bar_guide_region_object_2024, e.this.P(), false));
            this.f = z;
            this.b = this.itemView.findViewById(R.id.view_shade);
            View findViewById = this.itemView.findViewById(R.id.iv_object);
            CornerImageView cornerImageView = (CornerImageView) findViewById;
            cornerImageView.setRadius(j.b(this.f ? 4.5f : 6.5f));
            cornerImageView.setBackgroundColor(Color.parseColor("#222222"));
            q.a((Object) findViewById, "itemView.findViewById<Co…Color(\"#222222\"))\n      }");
            this.c = cornerImageView;
            View findViewById2 = this.itemView.findViewById(R.id.fl_scan_hint);
            q.a((Object) findViewById2, "itemView.findViewById(R.id.fl_scan_hint)");
            this.d = (FrameLayout) findViewById2;
            this.e = j.a(fhs.i(this.f));
        }

        public final void a(com.etao.feimagesearch.result.d bean, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f0276bc", new Object[]{this, bean, new Boolean(z)});
                return;
            }
            q.c(bean, "bean");
            a(this.f);
            float f = 6.5f;
            float b = j.b(6.5f);
            this.c.setImageBitmap(bean.e);
            View shadeView = this.b;
            q.a((Object) shadeView, "shadeView");
            if (shadeView.getBackground() == null) {
                View shadeView2 = this.b;
                q.a((Object) shadeView2, "shadeView");
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(b);
                gradientDrawable.setColor(Color.parseColor("#CC000000"));
                shadeView2.setBackground(gradientDrawable);
            }
            View shadeView3 = this.b;
            q.a((Object) shadeView3, "shadeView");
            shadeView3.setVisibility(z ? 0 : 8);
            if (bean.a()) {
                this.d.setVisibility(0);
                FrameLayout frameLayout = this.d;
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setColor(Color.parseColor("#B3000000"));
                float b2 = j.b(8.0f);
                gradientDrawable2.setCornerRadii(new float[]{b2, b2, 0.0f, 0.0f, b, b, 0.0f, 0.0f});
                frameLayout.setBackground(gradientDrawable2);
                int a2 = j.a(this.f ? 14.0f : 18.0f);
                ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
                if (layoutParams == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.width = a2;
                layoutParams2.height = a2;
                if (this.f) {
                    f = 5.0f;
                }
                layoutParams2.bottomMargin = j.a(f);
                layoutParams2.rightMargin = j.a(this.f ? 3.0f : 3.5f);
                this.d.setLayoutParams(layoutParams2);
                this.d.removeAllViews();
                TUrlImageView tUrlImageView = new TUrlImageView(e.this.g());
                tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN016i1s771dsmmoEqz9f_!!6000000003792-49-tps-511-489.webp");
                int a3 = j.a(this.f ? 9.0f : 12.0f);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(a3, a3);
                layoutParams3.gravity = 17;
                this.d.addView(tUrlImageView, layoutParams3);
            } else {
                this.d.setVisibility(8);
            }
            this.itemView.invalidate();
        }

        private final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int i = this.e;
            layoutParams2.width = i;
            layoutParams2.height = i;
            float f = 3.0f;
            layoutParams2.topMargin = j.a(z ? 3.0f : 3.5f);
            this.c.setLayoutParams(layoutParams2);
            View shadeView = this.b;
            q.a((Object) shadeView, "shadeView");
            ViewGroup.LayoutParams layoutParams3 = shadeView.getLayoutParams();
            if (layoutParams3 == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            int i2 = this.e;
            layoutParams4.width = i2;
            layoutParams4.height = i2;
            if (!z) {
                f = 3.5f;
            }
            layoutParams4.topMargin = j.a(f);
            View shadeView2 = this.b;
            q.a((Object) shadeView2, "shadeView");
            shadeView2.setLayoutParams(layoutParams4);
            View itemView = this.itemView;
            q.a((Object) itemView, "itemView");
            ViewGroup.LayoutParams layoutParams5 = itemView.getLayoutParams();
            layoutParams5.width = j.a(fhs.g(z));
            layoutParams5.height = j.a(fhs.h(z));
            View itemView2 = this.itemView;
            q.a((Object) itemView2, "itemView");
            itemView2.setLayoutParams(layoutParams5);
        }
    }

    private final void eW_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("789b3c14", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.f6866a;
        if (frameLayout == null) {
            q.b("mRootView");
        }
        frameLayout.animate().alpha(0.0f).setDuration(200L).withEndAction(new c());
    }
}
