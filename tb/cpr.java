package tb;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView$historyView$1;
import com.etao.feimagesearch.capture.dynamic.bottom.album.d;
import com.etao.feimagesearch.result.ScrollInterceptView;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.ad;
import com.etao.feimagesearch.util.y;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.taobao.R;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class cpr extends ctc<cpq, com.etao.feimagesearch.model.b, CaptureManager> implements bxk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String TAG = "AutoSize__Bottom_BottomAreaView";
    public static final String TAG_PREFIX = "AutoSize__Bottom_";
    public static final int TYPE_BROWSED = 2;

    /* renamed from: a  reason: collision with root package name */
    public static final int f26413a = 0;
    public static final int f = 1;
    private static final int w;
    private static final int z;
    public ScrollInterceptView g;
    private bym h;
    private int i;
    private final ViewGroup j;
    private int k;
    private FrameLayout l;
    private eeb m;
    private final d n;
    private final com.etao.feimagesearch.capture.dynamic.bottom.history.d o;
    private b p;
    private cps q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private FrameLayout x;

    /* loaded from: classes3.dex */
    public interface b {
        void a(int i, int i2);

        void a(boolean z);

        boolean a();
    }

    /* loaded from: classes3.dex */
    public static final class c extends ac {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ViewGroup b;

        public c(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // com.etao.feimagesearch.util.ac
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                cpr.this.n().addView(this.b, -1, -1);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements ScrollInterceptView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.a
        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            b a2 = cpr.a(cpr.this);
            if (a2 == null) {
                return false;
            }
            return a2.a();
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public h(int i) {
            this.b = i;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            ViewGroup.LayoutParams layoutParams = cpr.c(cpr.this).getLayoutParams();
            layoutParams.height = cpr.c(cpr.this).getHeight() - this.b;
            cpr.c(cpr.this).setLayoutParams(layoutParams);
            cpr.c(cpr.this).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* loaded from: classes3.dex */
    public static final class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            cpr.this.m().setDownContentHeight(cpr.e(cpr.this));
            cpr.this.m().movePageToAssignPageLocationRatioWithAnim(1.0f, com.etao.feimagesearch.config.b.cr() ? 0L : 150L, null);
        }
    }

    @JvmStatic
    public static final int a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{activity})).intValue() : Companion.a(activity);
    }

    public static /* synthetic */ Object ipc$super(cpr cprVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 92838762) {
            super.c();
            return null;
        } else if (hashCode != 95609325) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.f();
            return null;
        }
    }

    public static final /* synthetic */ b a(cpr cprVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("1d52d950", new Object[]{cprVar}) : cprVar.p;
    }

    public static final /* synthetic */ void a(cpr cprVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98968650", new Object[]{cprVar, new Integer(i2)});
        } else {
            cprVar.r = i2;
        }
    }

    public static final /* synthetic */ void a(cpr cprVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9896c621", new Object[]{cprVar, new Boolean(z2)});
        } else {
            cprVar.u = z2;
        }
    }

    public static final /* synthetic */ int b(cpr cprVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d266d587", new Object[]{cprVar})).intValue() : cprVar.r;
    }

    public static final /* synthetic */ void b(cpr cprVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a744fef", new Object[]{cprVar, new Integer(i2)});
        } else {
            cprVar.s = i2;
        }
    }

    public static final /* synthetic */ FrameLayout c(cpr cprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("a46a47a4", new Object[]{cprVar});
        }
        FrameLayout frameLayout = cprVar.l;
        if (frameLayout == null) {
            q.b("bizContainer");
        }
        return frameLayout;
    }

    public static final /* synthetic */ bym d(cpr cprVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bym) ipChange.ipc$dispatch("9a27defa", new Object[]{cprVar}) : cprVar.h;
    }

    public static final /* synthetic */ int e(cpr cprVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9defe90a", new Object[]{cprVar})).intValue() : cprVar.i;
    }

    public static final /* synthetic */ int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue() : w;
    }

    public static final /* synthetic */ int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[0])).intValue() : z;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [tb.cpq, tb.ctb] */
    @Override // tb.ctc
    public /* synthetic */ cpq b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ctb) ipChange.ipc$dispatch("16b50a8c", new Object[]{this}) : a();
    }

    public final ViewGroup n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("c70e9880", new Object[]{this}) : this.j;
    }

    public /* synthetic */ cpr(Activity activity, cte cteVar, ViewGroup viewGroup, boolean z2, int i2, o oVar) {
        this(activity, cteVar, viewGroup, (i2 & 8) != 0 ? true : z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpr(Activity activity, cte<com.etao.feimagesearch.model.b, CaptureManager> cteVar, ViewGroup parentView, boolean z2) {
        super(activity, cteVar, false, z2);
        bwl bwlVar;
        q.c(activity, "activity");
        q.c(parentView, "parentView");
        this.j = parentView;
        cpr cprVar = this;
        this.n = new d(activity, cprVar, this.i);
        this.o = new com.etao.feimagesearch.capture.dynamic.bottom.history.d(activity, cprVar, new CaptureBottomAreaView$historyView$1(this));
        this.t = -1;
        boolean dz = com.etao.feimagesearch.config.b.dz();
        if (!dz) {
            ScrollInterceptView scrollInterceptView = this.g;
            if (scrollInterceptView == null) {
                q.b("rootView");
            }
            a(scrollInterceptView);
        }
        this.u = false;
        if (j().o()) {
            FrameLayout frameLayout = this.x;
            if (frameLayout == null) {
                q.b("navViewContainer");
            }
            bwlVar = new bwm(activity, cprVar, frameLayout, this);
        } else {
            FrameLayout frameLayout2 = this.x;
            if (frameLayout2 == null) {
                q.b("navViewContainer");
            }
            bwlVar = new bwl(activity, cprVar, frameLayout2, this);
        }
        this.h = bwlVar;
        this.t = -1;
        c(0);
        l();
        if (dz) {
            ScrollInterceptView scrollInterceptView2 = this.g;
            if (scrollInterceptView2 == null) {
                q.b("rootView");
            }
            a(scrollInterceptView2);
        }
        this.v = true;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(608885423);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : cpr.g();
        }

        @JvmStatic
        public final int a(Activity activity, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cabb047c", new Object[]{this, activity, new Integer(i)})).intValue();
            }
            q.c(activity, "activity");
            return ((com.b(activity) - ((i - 1) * d.Companion.a())) / i) + j.a(45.0f);
        }

        @JvmStatic
        public final int a(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{this, activity})).intValue();
            }
            q.c(activity, "activity");
            int b = (int) ((com.b(activity) + d.Companion.a()) / (cpr.k() + d.Companion.a()));
            if (b > 0) {
                return b;
            }
            return 1;
        }
    }

    static {
        kge.a(-1691044825);
        kge.a(176508535);
        Companion = new a(null);
        w = j.a(50.0f);
        z = j.a(89.0f);
    }

    public final ScrollInterceptView m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollInterceptView) ipChange.ipc$dispatch("2602126e", new Object[]{this});
        }
        ScrollInterceptView scrollInterceptView = this.g;
        if (scrollInterceptView == null) {
            q.b("rootView");
        }
        return scrollInterceptView;
    }

    @Override // tb.ctc
    public void c() {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        super.c();
        this.k = com.etao.feimagesearch.config.b.a(this.d);
        if (j().o()) {
            a2 = 0;
        } else {
            a aVar = Companion;
            Activity activity = this.d;
            q.a((Object) activity, "activity");
            a2 = aVar.a(activity, this.k);
        }
        this.i = a2;
        View inflate = LayoutInflater.from(this.d).inflate(R.layout.feis_view_capture_bottom_area, (ViewGroup) null, false);
        if (inflate == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.etao.feimagesearch.result.ScrollInterceptView");
        }
        this.g = (ScrollInterceptView) inflate;
        ScrollInterceptView scrollInterceptView = this.g;
        if (scrollInterceptView == null) {
            q.b("rootView");
        }
        View findViewById = scrollInterceptView.findViewById(R.id.fl_area_container);
        q.a((Object) findViewById, "this");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(j.b(24.0f));
        gradientDrawable.setColor(Color.parseColor("#E0000000"));
        findViewById.setBackground(gradientDrawable);
        ScrollInterceptView scrollInterceptView2 = this.g;
        if (scrollInterceptView2 == null) {
            q.b("rootView");
        }
        scrollInterceptView2.setStateProvider(new e());
        ScrollInterceptView scrollInterceptView3 = this.g;
        if (scrollInterceptView3 == null) {
            q.b("rootView");
        }
        scrollInterceptView3.setAutoScrollInterval(1);
        ScrollInterceptView scrollInterceptView4 = this.g;
        if (scrollInterceptView4 == null) {
            q.b("rootView");
        }
        scrollInterceptView4.setOffsetCallback(new f());
        ScrollInterceptView scrollInterceptView5 = this.g;
        if (scrollInterceptView5 == null) {
            q.b("rootView");
        }
        View findViewById2 = scrollInterceptView5.findViewById(R.id.fl_container);
        q.a((Object) findViewById2, "rootView.findViewById(R.id.fl_container)");
        this.l = (FrameLayout) findViewById2;
        ScrollInterceptView scrollInterceptView6 = this.g;
        if (scrollInterceptView6 == null) {
            q.b("rootView");
        }
        View findViewById3 = scrollInterceptView6.findViewById(R.id.fl_nav_bar_container);
        q.a((Object) findViewById3, "rootView.findViewById(R.id.fl_nav_bar_container)");
        this.x = (FrameLayout) findViewById3;
    }

    /* loaded from: classes3.dex */
    public static final class f implements ScrollInterceptView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            }
        }

        public f() {
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
        public void a(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            cpr.a(cpr.this, i4 - i2);
            cpr.b(cpr.this, i4);
            b a2 = cpr.a(cpr.this);
            if (a2 == null) {
                return;
            }
            a2.a(cpr.b(cpr.this), i4);
        }

        @Override // com.etao.feimagesearch.result.ScrollInterceptView.b
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (i2 == 1 || i2 == 2) {
                CaptureManager manager = cpr.this.j();
                q.a((Object) manager, "manager");
                manager.b(false);
            } else if (i2 == -1 && i != -1) {
            } else {
                if (i2 == 0 && i != 0 && i != -1) {
                    CaptureManager manager2 = cpr.this.j();
                    q.a((Object) manager2, "manager");
                    manager2.b(true);
                    cpr.d(cpr.this).b(false);
                    cpr.a(cpr.this, false);
                } else if (i2 != 3 || i == 3 || i == -1) {
                } else {
                    CaptureManager manager3 = cpr.this.j();
                    q.a((Object) manager3, "manager");
                    manager3.b(false);
                    cpr.this.j().c(3);
                    cpr.d(cpr.this).b(true);
                    cpr.a(cpr.this, true);
                }
            }
        }
    }

    public cpq a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cpq) ipChange.ipc$dispatch("f0357fa", new Object[]{this}) : new cpq();
    }

    private final void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else if (!this.L) {
        } else {
            ad.c("AutoSize__Bottom_BottomAreaViewaddView", new c(viewGroup));
        }
    }

    private final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        ScrollInterceptView scrollInterceptView = this.g;
        if (scrollInterceptView == null) {
            q.b("rootView");
        }
        scrollInterceptView.setDownContentHeight(this.i);
        y yVar = y.INSTANCE;
        Activity activity = this.d;
        if (activity == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
        }
        Integer a2 = yVar.a((Activity) ((AppCompatActivity) activity));
        int intValue = (a2 != null ? a2.intValue() : j.a(50.0f)) + j.a(10.0f);
        ScrollInterceptView scrollInterceptView2 = this.g;
        if (scrollInterceptView2 == null) {
            q.b("rootView");
        }
        scrollInterceptView2.setContentUpStateOffset(intValue);
        FrameLayout frameLayout = this.l;
        if (frameLayout == null) {
            q.b("bizContainer");
        }
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new h(intValue));
        ScrollInterceptView scrollInterceptView3 = this.g;
        if (scrollInterceptView3 == null) {
            q.b("rootView");
        }
        scrollInterceptView3.post(new i());
    }

    public final void a(boolean z2) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
        } else if (this.v == z2) {
        } else {
            this.v = z2;
            ScrollInterceptView scrollInterceptView = this.g;
            if (scrollInterceptView == null) {
                q.b("rootView");
            }
            if (!z2) {
                i2 = 8;
            }
            scrollInterceptView.setVisibility(i2);
        }
    }

    public final boolean a(adt adtVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a6c5731", new Object[]{this, adtVar, new Boolean(z2)})).booleanValue();
        }
        if (!z2) {
            this.o.a(adtVar, false);
            this.h.a(false);
            return true;
        } else if (adtVar == null || !this.o.k()) {
            return false;
        } else {
            this.o.a(adtVar, true);
            this.h.a(true);
            return true;
        }
    }

    public final void b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
        } else {
            this.h.b(i2);
        }
    }

    @Override // tb.bxk
    public void c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i2)});
            return;
        }
        cot.c(TAG, "onTabChanged " + i2);
        this.t = i2;
        if (i2 == 0) {
            d dVar = this.n;
            this.p = dVar;
            this.q = dVar;
            FrameLayout frameLayout = this.l;
            if (frameLayout == null) {
                q.b("bizContainer");
            }
            dVar.a(frameLayout, true, this.u, this.r, this.s);
            com.etao.feimagesearch.capture.dynamic.bottom.history.d dVar2 = this.o;
            FrameLayout frameLayout2 = this.l;
            if (frameLayout2 == null) {
                q.b("bizContainer");
            }
            dVar2.a(frameLayout2, false, this.u, this.r, this.s);
            eeb eebVar = this.m;
            if (eebVar == null) {
                return;
            }
            FrameLayout frameLayout3 = this.l;
            if (frameLayout3 == null) {
                q.b("bizContainer");
            }
            eebVar.a(frameLayout3, false, this.u, this.r, this.s);
        } else if (i2 == 1) {
            com.etao.feimagesearch.capture.dynamic.bottom.history.d dVar3 = this.o;
            this.p = dVar3;
            this.q = dVar3;
            d dVar4 = this.n;
            FrameLayout frameLayout4 = this.l;
            if (frameLayout4 == null) {
                q.b("bizContainer");
            }
            dVar4.a(frameLayout4, false, this.u, this.r, this.s);
            com.etao.feimagesearch.capture.dynamic.bottom.history.d dVar5 = this.o;
            FrameLayout frameLayout5 = this.l;
            if (frameLayout5 == null) {
                q.b("bizContainer");
            }
            dVar5.a(frameLayout5, true, this.u, this.r, this.s);
            eeb eebVar2 = this.m;
            if (eebVar2 == null) {
                return;
            }
            FrameLayout frameLayout6 = this.l;
            if (frameLayout6 == null) {
                q.b("bizContainer");
            }
            eebVar2.a(frameLayout6, false, this.u, this.r, this.s);
        } else if (i2 != 2) {
        } else {
            if (this.m == null) {
                Activity activity = this.d;
                q.a((Object) activity, "activity");
                this.m = new eeb(activity, this.c);
            }
            eeb eebVar3 = this.m;
            this.p = eebVar3;
            this.q = eebVar3;
            d dVar6 = this.n;
            FrameLayout frameLayout7 = this.l;
            if (frameLayout7 == null) {
                q.b("bizContainer");
            }
            dVar6.a(frameLayout7, false, this.u, this.r, this.s);
            com.etao.feimagesearch.capture.dynamic.bottom.history.d dVar7 = this.o;
            FrameLayout frameLayout8 = this.l;
            if (frameLayout8 == null) {
                q.b("bizContainer");
            }
            dVar7.a(frameLayout8, false, this.u, this.r, this.s);
            eeb eebVar4 = this.m;
            if (eebVar4 == null) {
                return;
            }
            FrameLayout frameLayout9 = this.l;
            if (frameLayout9 == null) {
                q.b("bizContainer");
            }
            eebVar4.a(frameLayout9, true, this.u, this.r, this.s);
        }
    }

    @Override // tb.bxk
    public void b(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z2)});
            return;
        }
        cot.c(TAG, "onFolderStateChange: isFoldUp=" + z2 + ", this.isPageFoldUp=" + this.u);
        if (this.u == z2) {
            return;
        }
        this.u = z2;
        b bVar = this.p;
        if (bVar != null) {
            bVar.a(this.u);
        }
        ScrollInterceptView scrollInterceptView = this.g;
        if (scrollInterceptView == null) {
            q.b("rootView");
        }
        scrollInterceptView.movePageToAssignPageLocationRatioWithAnim(this.u ? 0.0f : 1.0f, 150L, null);
    }

    @Override // tb.bxk
    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.u;
    }

    @Override // tb.ctc
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.j;
        ScrollInterceptView scrollInterceptView = this.g;
        if (scrollInterceptView == null) {
            q.b("rootView");
        }
        viewGroup.removeView(scrollInterceptView);
        super.f();
    }
}
