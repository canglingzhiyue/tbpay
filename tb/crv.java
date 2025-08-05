package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.util.g;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class crv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final csg f26481a;
    private static final csg b;
    private static final csg c;
    private static final csg d;
    private static final float e;

    /* loaded from: classes3.dex */
    public static final class a implements csg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.csg
        public void a(RectF percentRegion, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a421139", new Object[]{this, percentRegion, new Float(f), new Float(f2)});
                return;
            }
            q.c(percentRegion, "percentRegion");
            percentRegion.bottom += f;
            percentRegion.bottom = rwf.b(1.0f, rwf.a(percentRegion.bottom, percentRegion.top + f2));
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements csg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.csg
        public void a(RectF percentRegion, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a421139", new Object[]{this, percentRegion, new Float(f), new Float(f2)});
                return;
            }
            q.c(percentRegion, "percentRegion");
            percentRegion.left += f;
            percentRegion.left = rwf.a(0.0f, rwf.b(percentRegion.left, percentRegion.right - f2));
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements csg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.csg
        public void a(RectF percentRegion, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a421139", new Object[]{this, percentRegion, new Float(f), new Float(f2)});
                return;
            }
            q.c(percentRegion, "percentRegion");
            percentRegion.right += f;
            percentRegion.right = rwf.b(1.0f, rwf.a(percentRegion.right, percentRegion.left + f2));
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements csg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.csg
        public void a(RectF percentRegion, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a421139", new Object[]{this, percentRegion, new Float(f), new Float(f2)});
                return;
            }
            q.c(percentRegion, "percentRegion");
            percentRegion.top += f;
            percentRegion.top = rwf.a(0.0f, rwf.b(percentRegion.top, percentRegion.bottom - f2));
        }
    }

    static {
        kge.a(574013201);
        f26481a = new d();
        b = new a();
        c = new b();
        d = new c();
        e = g.b(37.0f);
    }

    public static final csg a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (csg) ipChange.ipc$dispatch("f036207", new Object[0]) : f26481a;
    }

    public static final csg b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (csg) ipChange.ipc$dispatch("16b50766", new Object[0]) : b;
    }

    public static final csg c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (csg) ipChange.ipc$dispatch("1e66acc5", new Object[0]) : c;
    }

    public static final csg d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (csg) ipChange.ipc$dispatch("26185224", new Object[0]) : d;
    }

    public static final float e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[0])).floatValue() : e;
    }
}
