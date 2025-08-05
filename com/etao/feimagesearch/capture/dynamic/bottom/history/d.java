package com.etao.feimagesearch.capture.dynamic.bottom.history;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ads;
import tb.adt;
import tb.cpr;
import tb.cps;
import tb.ctb;
import tb.ctc;
import tb.cte;
import tb.kge;
import tb.ruk;

/* loaded from: classes3.dex */
public final class d extends ctc<com.etao.feimagesearch.capture.dynamic.bottom.history.c, com.etao.feimagesearch.model.b, CaptureManager> implements cpr.b, cps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f6549a;
    private boolean f;
    private int g;
    private TUrlImageView j;
    private RecyclerView k;
    private View l;
    private View m;
    private View n;
    private com.etao.feimagesearch.capture.dynamic.bottom.history.a o;
    private int p;
    private int q;
    private List<ads> r;
    private ruk<t> s;

    /* loaded from: classes3.dex */
    public static final class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            d.b(d.this).d();
            d.d(d.this).setVisibility(8);
            d.e(d.this).setVisibility(0);
            d dVar = d.this;
            d.a(dVar, d.f(dVar), d.g(d.this));
            d.a(d.this, false);
            dialogInterface.cancel();
            d.i(d.this).clear();
            com.etao.feimagesearch.capture.dynamic.bottom.history.c h = d.h(d.this);
            if (h != null) {
                h.e();
            }
            d.this.l().mo2427invoke();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                d.a(d.this);
            }
        }
    }

    /* renamed from: com.etao.feimagesearch.capture.dynamic.bottom.history.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0215d extends GridLayoutManager.SpanSizeLookup {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0215d() {
        }

        @Override // android.support.v7.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3462f00e", new Object[]{this, new Integer(i)})).intValue();
            }
            int itemViewType = d.b(d.this).getItemViewType(i);
            if (itemViewType == 0) {
                return 1;
            }
            return itemViewType != 1 ? d.c(d.this) : d.c(d.this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v7.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
            } else if (view == null || !(view.getTag() instanceof String) || !q.a((Object) "item", view.getTag())) {
            } else {
                int a2 = j.a(1.0f);
                if (rect != null) {
                    rect.bottom = a2;
                }
                if (rect != null) {
                    rect.left = a2 / 2;
                }
                if (rect == null) {
                    return;
                }
                rect.right = a2 / 2;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ ViewGroup c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        public f(boolean z, ViewGroup viewGroup, boolean z2, int i, int i2) {
            this.b = z;
            this.c = viewGroup;
            this.d = z2;
            this.e = i;
            this.f = i2;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            if (this.b) {
                this.c.removeAllViews();
                this.c.addView(d.this.m(), -1, -1);
                d.a(d.this, this.d);
            }
            d.this.b(this.e, this.f);
        }
    }

    static {
        kge.a(-1788930326);
        kge.a(605119092);
        kge.a(469456750);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
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
            case 1978668644:
                super.B_();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.cpr.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        }
    }

    public static final /* synthetic */ void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4501474c", new Object[]{dVar});
        } else {
            dVar.i();
        }
    }

    public static final /* synthetic */ void a(d dVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db04ac", new Object[]{dVar, new Integer(i), new Integer(i2)});
        } else {
            dVar.c(i, i2);
        }
    }

    public static final /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b285508", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.b(z);
        }
    }

    public static final /* synthetic */ com.etao.feimagesearch.capture.dynamic.bottom.history.a b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.capture.dynamic.bottom.history.a) ipChange.ipc$dispatch("ccc03272", new Object[]{dVar}) : dVar.o;
    }

    public static final /* synthetic */ int c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6d7e267d", new Object[]{dVar})).intValue() : dVar.g;
    }

    public static final /* synthetic */ RecyclerView d(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("38fff67b", new Object[]{dVar});
        }
        RecyclerView recyclerView = dVar.k;
        if (recyclerView == null) {
            q.b("rvHistory");
        }
        return recyclerView;
    }

    public static final /* synthetic */ View e(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d6bebc0a", new Object[]{dVar});
        }
        View view = dVar.l;
        if (view == null) {
            q.b("hintContainer");
        }
        return view;
    }

    public static final /* synthetic */ int f(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2a39755a", new Object[]{dVar})).intValue() : dVar.p;
    }

    public static final /* synthetic */ int g(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("be77e4f9", new Object[]{dVar})).intValue() : dVar.q;
    }

    public static final /* synthetic */ com.etao.feimagesearch.capture.dynamic.bottom.history.c h(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.capture.dynamic.bottom.history.c) ipChange.ipc$dispatch("834a5a6a", new Object[]{dVar}) : (com.etao.feimagesearch.capture.dynamic.bottom.history.c) dVar.b;
    }

    public static final /* synthetic */ List i(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("abaf7d83", new Object[]{dVar}) : dVar.r;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.etao.feimagesearch.capture.dynamic.bottom.history.c, tb.ctb] */
    @Override // tb.ctc
    public /* synthetic */ com.etao.feimagesearch.capture.dynamic.bottom.history.c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctb) ipChange.ipc$dispatch("16b50a8c", new Object[]{this}) : g();
    }

    public final ruk<t> l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("63ac56ab", new Object[]{this}) : this.s;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Activity activity, cte<com.etao.feimagesearch.model.b, CaptureManager> cteVar, ruk<t> onHistoryClear) {
        super(activity, cteVar);
        q.c(activity, "activity");
        q.c(onHistoryClear, "onHistoryClear");
        this.s = onHistoryClear;
        this.g = com.etao.feimagesearch.config.b.a(activity);
        this.r = new ArrayList();
        int i = this.g;
        CaptureManager manager = j();
        q.a((Object) manager, "manager");
        this.o = new com.etao.feimagesearch.capture.dynamic.bottom.history.a(activity, i, manager.W(), new CaptureHistoryView$historyAdapter$1(this), new CaptureHistoryView$historyAdapter$2(this), new CaptureHistoryView$historyAdapter$3(this));
        RecyclerView recyclerView = this.k;
        if (recyclerView == null) {
            q.b("rvHistory");
        }
        recyclerView.setAdapter(this.o);
    }

    public final View m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93b2e9b6", new Object[]{this});
        }
        View view = this.f6549a;
        if (view == null) {
            q.b("rootView");
        }
        return view;
    }

    @Override // tb.ctc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.feis_view_capture_history, (ViewGroup) null, false);
        q.a((Object) inflate, "LayoutInflater.from(acti…istory, null, false\n    )");
        this.f6549a = inflate;
        View view = this.f6549a;
        if (view == null) {
            q.b("rootView");
        }
        View findViewById = view.findViewById(R.id.btn_delete);
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById;
        q.a((Object) tUrlImageView, "this");
        tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01RgOv3h1dAojXTYRou_!!6000000003696-2-tps-84-84.png");
        tUrlImageView.setOnClickListener(new c());
        tUrlImageView.setContentDescription(com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_clear_all_history) + (char) 65292 + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_button));
        tUrlImageView.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = tUrlImageView.getLayoutParams();
        CaptureManager manager = j();
        q.a((Object) manager, "manager");
        int a2 = j.a(manager.W() ? 40.0f : 35.0f);
        layoutParams.height = a2;
        layoutParams.width = a2;
        tUrlImageView.setLayoutParams(layoutParams);
        q.a((Object) findViewById, "rootView.findViewById<TU…idth = size\n      }\n    }");
        this.j = tUrlImageView;
        View view2 = this.f6549a;
        if (view2 == null) {
            q.b("rootView");
        }
        View findViewById2 = view2.findViewById(R.id.fl_empty_container);
        q.a((Object) findViewById2, "rootView.findViewById(R.id.fl_empty_container)");
        this.l = findViewById2;
        View view3 = this.f6549a;
        if (view3 == null) {
            q.b("rootView");
        }
        View findViewById3 = view3.findViewById(R.id.ll_empty_hint);
        q.a((Object) findViewById3, "rootView.findViewById(R.id.ll_empty_hint)");
        this.m = findViewById3;
        View view4 = this.f6549a;
        if (view4 == null) {
            q.b("rootView");
        }
        TextView textView = (TextView) view4.findViewById(R.id.tv_empty_hint);
        CaptureManager manager2 = j();
        q.a((Object) manager2, "manager");
        float f2 = 17.0f;
        textView.setTextSize(1, manager2.W() ? 17.0f : 15.0f);
        View view5 = this.f6549a;
        if (view5 == null) {
            q.b("rootView");
        }
        View findViewById4 = view5.findViewById(R.id.iv_empty_hint);
        q.a((Object) findViewById4, "rootView.findViewById<TU…View>(R.id.iv_empty_hint)");
        ((TUrlImageView) findViewById4).setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01p6cuBa1ClvBluXI7s_!!6000000000122-2-tps-104-102.png");
        View view6 = this.f6549a;
        if (view6 == null) {
            q.b("rootView");
        }
        View findViewById5 = view6.findViewById(R.id.ll_empty_full);
        q.a((Object) findViewById5, "rootView.findViewById(R.id.ll_empty_full)");
        this.n = findViewById5;
        View view7 = this.f6549a;
        if (view7 == null) {
            q.b("rootView");
        }
        TextView textView2 = (TextView) view7.findViewById(R.id.tv_empty_hint_full);
        CaptureManager manager3 = j();
        q.a((Object) manager3, "manager");
        if (!manager3.W()) {
            f2 = 15.0f;
        }
        textView2.setTextSize(1, f2);
        View view8 = this.f6549a;
        if (view8 == null) {
            q.b("rootView");
        }
        View findViewById6 = view8.findViewById(R.id.iv_empty_hint_full);
        q.a((Object) findViewById6, "rootView.findViewById<TU…(R.id.iv_empty_hint_full)");
        ((TUrlImageView) findViewById6).setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01p6cuBa1ClvBluXI7s_!!6000000000122-2-tps-104-102.png");
        View view9 = this.f6549a;
        if (view9 == null) {
            q.b("rootView");
        }
        View findViewById7 = view9.findViewById(R.id.rv_list);
        q.a((Object) findViewById7, "rootView.findViewById(R.id.rv_list)");
        this.k = (RecyclerView) findViewById7;
        RecyclerView recyclerView = this.k;
        if (recyclerView == null) {
            q.b("rvHistory");
        }
        recyclerView.setTranslationY(-j.b(35.0f));
        this.g = com.etao.feimagesearch.config.b.a(this.d);
        RecyclerView recyclerView2 = this.k;
        if (recyclerView2 == null) {
            q.b("rvHistory");
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.d, this.g);
        gridLayoutManager.setSpanSizeLookup(new C0215d());
        recyclerView2.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView3 = this.k;
        if (recyclerView3 == null) {
            q.b("rvHistory");
        }
        recyclerView3.addItemDecoration(new e());
    }

    public com.etao.feimagesearch.capture.dynamic.bottom.history.c g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.capture.dynamic.bottom.history.c) ipChange.ipc$dispatch("e7541033", new Object[]{this}) : new com.etao.feimagesearch.capture.dynamic.bottom.history.c();
    }

    @Override // tb.ctc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        super.d();
        for (ads adsVar : this.r) {
            adsVar.a();
        }
    }

    @Override // tb.ctc
    public void B_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f01664", new Object[]{this});
            return;
        }
        super.B_();
        for (ads adsVar : this.r) {
            adsVar.b();
        }
    }

    @Override // tb.ctc
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        Iterator<ads> it = this.r.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // tb.ctc
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        for (ads adsVar : this.r) {
            adsVar.c();
        }
        this.r.clear();
    }

    public final void a(List<Object> result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, result});
            return;
        }
        q.c(result, "result");
        if (result.isEmpty()) {
            RecyclerView recyclerView = this.k;
            if (recyclerView == null) {
                q.b("rvHistory");
            }
            recyclerView.setVisibility(8);
            View view = this.l;
            if (view == null) {
                q.b("hintContainer");
            }
            view.setVisibility(0);
            b(false);
            c(this.p, this.q);
            return;
        }
        RecyclerView recyclerView2 = this.k;
        if (recyclerView2 == null) {
            q.b("rvHistory");
        }
        recyclerView2.setVisibility(0);
        View view2 = this.l;
        if (view2 == null) {
            q.b("hintContainer");
        }
        view2.setVisibility(8);
        this.o.a(result);
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        com.etao.feimagesearch.capture.dynamic.bottom.history.c cVar = (com.etao.feimagesearch.capture.dynamic.bottom.history.c) this.b;
        if (cVar == null) {
            return false;
        }
        return cVar.d();
    }

    public final void a(adt adtVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a6c572d", new Object[]{this, adtVar, new Boolean(z)});
        } else if (!z) {
            this.o.c();
        } else if (adtVar == null) {
        } else {
            this.o.a(adtVar);
        }
    }

    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.p == i) {
        } else {
            this.p = i;
            this.q = i2;
            c(i, i2);
        }
    }

    public void a(ViewGroup container, boolean z, boolean z2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7411d007", new Object[]{this, container, new Boolean(z), new Boolean(z2), new Integer(i), new Integer(i2)});
            return;
        }
        q.c(container, "container");
        if (this.f == z) {
            return;
        }
        this.f = z;
        ad.c("", new f(z, container, z2, i, i2));
    }

    private final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        View view = this.l;
        if (view == null) {
            q.b("hintContainer");
        }
        if (view.getVisibility() == 0) {
            return;
        }
        com.taobao.search.common.util.d.a(this.d, "", com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_18976), com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_confirm), new a(), com.alibaba.ability.localization.b.a(R.string.irp_error_message_cancel_text), b.INSTANCE, false, 128, null);
    }

    /* loaded from: classes3.dex */
    public static final class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final b INSTANCE = new b();

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                dialogInterface.cancel();
            }
        }
    }

    private final void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        View view = this.l;
        if (view == null) {
            q.b("hintContainer");
        }
        if (view.getVisibility() != 0) {
            return;
        }
        if (i <= i2 / 3) {
            z = false;
        }
        if (z) {
            View view2 = this.m;
            if (view2 == null) {
                q.b("emptyHintView");
            }
            if (view2.getVisibility() != 8) {
                View view3 = this.m;
                if (view3 == null) {
                    q.b("emptyHintView");
                }
                view3.setVisibility(8);
                View view4 = this.m;
                if (view4 == null) {
                    q.b("emptyHintView");
                }
                view4.setVisibility(8);
            }
            View view5 = this.n;
            if (view5 == null) {
                q.b("emptyHintFullView");
            }
            if (view5.getVisibility() != 0) {
                View view6 = this.n;
                if (view6 == null) {
                    q.b("emptyHintFullView");
                }
                view6.setVisibility(0);
            }
        } else {
            View view7 = this.m;
            if (view7 == null) {
                q.b("emptyHintView");
            }
            if (view7.getVisibility() != 0) {
                View view8 = this.m;
                if (view8 == null) {
                    q.b("emptyHintView");
                }
                view8.setVisibility(0);
                View view9 = this.m;
                if (view9 == null) {
                    q.b("emptyHintView");
                }
                view9.setVisibility(0);
            }
            View view10 = this.n;
            if (view10 == null) {
                q.b("emptyHintFullView");
            }
            if (view10.getVisibility() != 8) {
                View view11 = this.n;
                if (view11 == null) {
                    q.b("emptyHintFullView");
                }
                view11.setVisibility(8);
            }
        }
        View view12 = this.m;
        if (view12 == null) {
            q.b("emptyHintView");
        }
        if (view12.getVisibility() == 0) {
            View view13 = this.m;
            if (view13 == null) {
                q.b("emptyHintView");
            }
            ViewGroup.LayoutParams layoutParams = view13.getLayoutParams();
            if (layoutParams == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = ((i - j.a(48.0f)) - cpr.Companion.a()) / 2;
            View view14 = this.m;
            if (view14 == null) {
                q.b("emptyHintView");
            }
            view14.setLayoutParams(layoutParams2);
        }
        View view15 = this.n;
        if (view15 == null) {
            q.b("emptyHintFullView");
        }
        if (view15.getVisibility() != 0) {
            return;
        }
        View view16 = this.n;
        if (view16 == null) {
            q.b("emptyHintFullView");
        }
        ViewGroup.LayoutParams layoutParams3 = view16.getLayoutParams();
        if (layoutParams3 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.topMargin = ((i - cpr.Companion.a()) / 2) - j.a(152.0f);
        View view17 = this.n;
        if (view17 == null) {
            q.b("emptyHintFullView");
        }
        view17.setLayoutParams(layoutParams4);
    }

    private final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            View view = this.l;
            if (view == null) {
                q.b("hintContainer");
            }
            if (view.getVisibility() == 0) {
                TUrlImageView tUrlImageView = this.j;
                if (tUrlImageView == null) {
                    q.b("deleteBtn");
                }
                if (tUrlImageView.getVisibility() == 8) {
                    return;
                }
                TUrlImageView tUrlImageView2 = this.j;
                if (tUrlImageView2 == null) {
                    q.b("deleteBtn");
                }
                tUrlImageView2.setVisibility(8);
                RecyclerView recyclerView = this.k;
                if (recyclerView == null) {
                    q.b("rvHistory");
                }
                recyclerView.setTranslationY(-j.b(35.0f));
                return;
            }
            TUrlImageView tUrlImageView3 = this.j;
            if (tUrlImageView3 == null) {
                q.b("deleteBtn");
            }
            if (tUrlImageView3.getVisibility() == 0) {
                return;
            }
            TUrlImageView tUrlImageView4 = this.j;
            if (tUrlImageView4 == null) {
                q.b("deleteBtn");
            }
            tUrlImageView4.setVisibility(0);
            RecyclerView recyclerView2 = this.k;
            if (recyclerView2 == null) {
                q.b("rvHistory");
            }
            recyclerView2.setTranslationY(0.0f);
        } else {
            TUrlImageView tUrlImageView5 = this.j;
            if (tUrlImageView5 == null) {
                q.b("deleteBtn");
            }
            if (tUrlImageView5.getVisibility() == 8) {
                return;
            }
            TUrlImageView tUrlImageView6 = this.j;
            if (tUrlImageView6 == null) {
                q.b("deleteBtn");
            }
            tUrlImageView6.setVisibility(8);
            RecyclerView recyclerView3 = this.k;
            if (recyclerView3 == null) {
                q.b("rvHistory");
            }
            recyclerView3.setTranslationY(-j.b(35.0f));
        }
    }

    @Override // tb.cpr.b
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        b(i, i2);
        if (i <= i2 / 2) {
            z = false;
        }
        b(z);
    }

    @Override // tb.cpr.b
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        RecyclerView recyclerView = this.k;
        if (recyclerView == null) {
            q.b("rvHistory");
        }
        if (recyclerView.getVisibility() != 0) {
            return true;
        }
        RecyclerView recyclerView2 = this.k;
        if (recyclerView2 == null) {
            q.b("rvHistory");
        }
        return !recyclerView2.canScrollVertically(-1);
    }
}
