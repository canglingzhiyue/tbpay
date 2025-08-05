package tb;

import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.collections.g;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class cek {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static final int f26245a;
    private static final int b;
    private static final int c;
    private static final GradientDrawable d;
    private static final GradientDrawable e;
    private static final GradientDrawable f;
    private static final GradientDrawable g;
    private static final GradientDrawable h;
    private static final GradientDrawable i;
    private static final ColorDrawable j;
    private static final GradientDrawable k;
    private static final ColorDrawable l;
    private static final ColorDrawable m;
    private static final ColorDrawable n;
    private static final GradientDrawable o;
    private static final GradientDrawable p;
    private static final GradientDrawable q;

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes3.dex */
        public static final class b extends ViewOutlineProvider {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f26247a;
            public final /* synthetic */ int b;
            public final /* synthetic */ boolean c;

            public b(boolean z, int i, boolean z2) {
                this.f26247a = z;
                this.b = i;
                this.c = z2;
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                } else if (view == null || outline == null) {
                } else {
                    outline.setRoundRect(0, 0, view.getWidth(), this.f26247a ? view.getHeight() + this.b : view.getHeight(), this.c ? this.b : 0.0f);
                }
            }
        }

        static {
            kge.a(-905583050);
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        private a() {
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : cek.a();
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : cek.b();
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : cek.c();
        }

        public final GradientDrawable d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("e8ac839f", new Object[]{this}) : cek.d();
        }

        public final GradientDrawable e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("2277257e", new Object[]{this}) : cek.e();
        }

        public final GradientDrawable f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("5c41c75d", new Object[]{this}) : cek.f();
        }

        public final GradientDrawable g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("960c693c", new Object[]{this}) : cek.g();
        }

        public final GradientDrawable h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("cfd70b1b", new Object[]{this}) : cek.h();
        }

        public final GradientDrawable o() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("64617834", new Object[]{this}) : cek.o();
        }

        public final ColorDrawable i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ColorDrawable) ipChange.ipc$dispatch("b517f76d", new Object[]{this}) : cek.i();
        }

        public final GradientDrawable j() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("436c4ed9", new Object[]{this}) : cek.j();
        }

        public final ColorDrawable k() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ColorDrawable) ipChange.ipc$dispatch("ea597c6f", new Object[]{this}) : cek.k();
        }

        public final ColorDrawable l() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ColorDrawable) ipChange.ipc$dispatch("84fa3ef0", new Object[]{this}) : cek.l();
        }

        public final GradientDrawable m() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("f0cc3476", new Object[]{this}) : cek.m();
        }

        public final GradientDrawable n() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("2a96d655", new Object[]{this}) : cek.n();
        }

        /* renamed from: tb.cek$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C1097a {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final C1097a INSTANCE;

            /* renamed from: a  reason: collision with root package name */
            private static final int f26246a;
            private static final GradientDrawable b;
            private static final GradientDrawable c;

            private C1097a() {
            }

            static {
                kge.a(976700102);
                INSTANCE = new C1097a();
                f26246a = Color.parseColor("#b1000000");
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, g.a(new Integer[]{Integer.valueOf(f26246a), Integer.valueOf(f26246a), Integer.valueOf(Color.parseColor("#5a000000"))}));
                gradientDrawable.setGradientType(0);
                float a2 = com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 21);
                gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, a2, a2, a2, a2});
                b = gradientDrawable;
                GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, g.a(new Integer[]{Integer.valueOf(Color.parseColor("#e0000000")), Integer.valueOf(Color.parseColor("#00000000"))}));
                gradientDrawable2.setGradientType(0);
                c = gradientDrawable2;
            }

            public final GradientDrawable a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("3b4c9e02", new Object[]{this}) : c;
            }
        }

        public static /* synthetic */ Object a(a aVar, boolean z, int i, boolean z2, int i2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("97bb51e6", new Object[]{aVar, new Boolean(z), new Integer(i), new Boolean(z2), new Integer(i2), obj});
            }
            if ((i2 & 2) != 0) {
                i = aVar.a();
            }
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return aVar.a(z, i, z2);
        }

        public final Object a(boolean z, int i, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("979e7c35", new Object[]{this, new Boolean(z), new Integer(i), new Boolean(z2)});
            }
            if (Build.VERSION.SDK_INT >= 21 && z) {
                return new b(z2, i, z);
            }
            return null;
        }
    }

    public static final /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : f26245a;
    }

    public static final /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : b;
    }

    public static final /* synthetic */ int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue() : c;
    }

    public static final /* synthetic */ GradientDrawable d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("e8ac839f", new Object[0]) : d;
    }

    public static final /* synthetic */ GradientDrawable e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("2277257e", new Object[0]) : e;
    }

    public static final /* synthetic */ GradientDrawable f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("5c41c75d", new Object[0]) : f;
    }

    public static final /* synthetic */ GradientDrawable g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("960c693c", new Object[0]) : g;
    }

    public static final /* synthetic */ GradientDrawable h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("cfd70b1b", new Object[0]) : h;
    }

    public static final /* synthetic */ ColorDrawable i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ColorDrawable) ipChange.ipc$dispatch("b517f76d", new Object[0]) : j;
    }

    public static final /* synthetic */ GradientDrawable j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("436c4ed9", new Object[0]) : k;
    }

    public static final /* synthetic */ ColorDrawable k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ColorDrawable) ipChange.ipc$dispatch("ea597c6f", new Object[0]) : l;
    }

    public static final /* synthetic */ ColorDrawable l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ColorDrawable) ipChange.ipc$dispatch("84fa3ef0", new Object[0]) : m;
    }

    public static final /* synthetic */ GradientDrawable m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("f0cc3476", new Object[0]) : o;
    }

    public static final /* synthetic */ GradientDrawable n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("2a96d655", new Object[0]) : p;
    }

    public static final /* synthetic */ GradientDrawable o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("64617834", new Object[0]) : q;
    }

    static {
        kge.a(2037918830);
        Companion = new a(null);
        f26245a = com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 30);
        b = com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 42);
        c = Color.parseColor("#eeeeee");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#242424"));
        float a2 = com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 21);
        gradientDrawable.setCornerRadii(new float[]{a2, a2, a2, a2, 0.0f, 0.0f, 0.0f, 0.0f});
        d = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-1);
        float a3 = com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 21);
        gradientDrawable2.setCornerRadii(new float[]{a3, a3, a3, a3, 0.0f, 0.0f, 0.0f, 0.0f});
        e = gradientDrawable2;
        GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, g.a(new Integer[]{Integer.valueOf(Color.parseColor("#b1000000")), Integer.valueOf(Color.parseColor("#00000000"))}));
        gradientDrawable3.setGradientType(0);
        f = gradientDrawable3;
        GradientDrawable gradientDrawable4 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, g.a(new Integer[]{Integer.valueOf(Color.parseColor("#7f000000")), Integer.valueOf(Color.parseColor("#00000000"))}));
        gradientDrawable4.setGradientType(0);
        g = gradientDrawable4;
        GradientDrawable gradientDrawable5 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, g.a(new Integer[]{Integer.valueOf(Color.parseColor("#e5000000")), Integer.valueOf(Color.parseColor("#00000000"))}));
        gradientDrawable5.setGradientType(0);
        h = gradientDrawable5;
        GradientDrawable gradientDrawable6 = new GradientDrawable();
        gradientDrawable6.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        if (Build.VERSION.SDK_INT >= 29) {
            gradientDrawable6.setColors(g.a(new Integer[]{1962934272, 855638016, 0}), g.a(new Float[]{Float.valueOf(0.0f), Float.valueOf(0.7f), Float.valueOf(1.0f)}));
        } else {
            gradientDrawable6.setColors(g.a(new Integer[]{1962934272, 855638016, 0}));
        }
        gradientDrawable6.setGradientType(0);
        q = gradientDrawable6;
        GradientDrawable gradientDrawable7 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, g.a(new Integer[]{Integer.valueOf(Color.parseColor("#b2000000")), Integer.valueOf(Color.parseColor("#00000000"))}));
        gradientDrawable7.setGradientType(0);
        i = gradientDrawable7;
        j = new ColorDrawable(Color.parseColor("#cc111111"));
        GradientDrawable gradientDrawable8 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, g.a(new Integer[]{Integer.valueOf(Color.parseColor("#cc111111")), Integer.valueOf(Color.parseColor("#00000000"))}));
        gradientDrawable8.setGradientType(0);
        k = gradientDrawable8;
        l = new ColorDrawable(Color.parseColor("#cc111111"));
        m = new ColorDrawable(0);
        n = new ColorDrawable(-1);
        GradientDrawable gradientDrawable9 = new GradientDrawable();
        gradientDrawable9.setColor(-1);
        gradientDrawable9.setAlpha(242);
        gradientDrawable9.setCornerRadius(com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 21));
        o = gradientDrawable9;
        GradientDrawable gradientDrawable10 = new GradientDrawable();
        gradientDrawable10.setColor(Color.parseColor("#111111"));
        gradientDrawable10.setAlpha(76);
        gradientDrawable10.setCornerRadius(com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 21));
        p = gradientDrawable10;
    }
}
