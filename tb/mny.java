package tb;

import android.app.Activity;
import android.os.Build;
import android.view.Choreographer;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.h;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.procedure.IPage;
import java.lang.ref.WeakReference;
import tb.mon;

/* loaded from: classes7.dex */
public class mny extends sgh implements Choreographer.FrameCallback, ViewTreeObserver.OnScrollChangedListener, mon.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BLOCK_FRAME_TIME = 250;
    public static final int FROZEN_FRAME_TIME = 700;
    public static final int JANK_FRAME_TIME = 32;
    public static final int MOVIE_BIG_JANK_FRAME_TIME = 125;
    public static final int MOVIE_JANK_FRAME_TIME = 83;
    public static final String SCROLL_TYPE_FINGER = "fingerScroll";
    public static final String SCROLL_TYPE_VIEW = "viewScroll";
    public static final int SLOW_FRAME_TIME = 17;
    private boolean A;

    /* renamed from: a  reason: collision with root package name */
    public int f31152a;
    public int b;
    private final h c;
    private final WeakReference<Activity> d;
    private boolean e;
    private boolean f;
    private long g;
    private int h;
    private int i;
    private int j;
    private int k;
    private long l;
    private boolean m;
    private boolean n;
    private long o;
    private boolean p;
    private long q;
    private int r;
    private final mnw s;
    private int t;
    private final int u;
    private long v;
    private long w;
    private boolean x;
    private volatile float y;
    private boolean z;

    public static /* synthetic */ Object ipc$super(mny mnyVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1662353079:
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).longValue());
                return null;
            case -265957085:
                super.a((IPage) objArr[0]);
                return null;
            case 91915241:
                super.b();
                return null;
            case 95609325:
                super.f();
                return null;
            case 2093349924:
                super.b((IPage) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public mny(Activity activity, qpi qpiVar, mnw mnwVar) {
        super(activity, qpiVar);
        this.e = false;
        this.f = true;
        this.g = 0L;
        this.f31152a = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.b = 0;
        this.k = 0;
        this.l = -1L;
        this.m = false;
        this.n = false;
        this.p = false;
        this.q = 0L;
        this.r = 0;
        this.t = Integer.MAX_VALUE;
        this.u = ViewConfiguration.getTapTimeout();
        this.v = 0L;
        this.w = 0L;
        this.x = false;
        this.z = true;
        this.A = false;
        this.d = new WeakReference<>(activity);
        this.c = g();
        this.s = mnwVar;
        this.t = ViewConfiguration.get(activity).getScaledTouchSlop();
        this.y = 16.666666f;
    }

    private h g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("ab264e08", new Object[]{this});
        }
        m a2 = f.a(a.ACTIVITY_FPS_DISPATCHER);
        if (!(a2 instanceof h)) {
            return null;
        }
        return (h) a2;
    }

    @Override // tb.sgh
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        Activity activity = this.d.get();
        if (activity == null) {
            return;
        }
        a(activity, this);
        a(activity, this.s);
    }

    @Override // tb.sgh
    public void a(IPage iPage) {
        mnw mnwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f025d123", new Object[]{this, iPage});
            return;
        }
        super.a(iPage);
        if (Build.VERSION.SDK_INT < 24 || (mnwVar = this.s) == null || !(iPage instanceof mou)) {
            return;
        }
        mnwVar.a((mou) iPage);
    }

    @Override // tb.sgh
    public void b(IPage iPage) {
        mnw mnwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cc5fc24", new Object[]{this, iPage});
            return;
        }
        super.b(iPage);
        if (!(iPage instanceof mou)) {
            return;
        }
        mou mouVar = (mou) iPage;
        mouVar.d(this.o);
        if (Build.VERSION.SDK_INT < 24 || (mnwVar = this.s) == null) {
            return;
        }
        mnwVar.b(mouVar);
    }

    @Override // tb.sgh
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        this.e = true;
        Activity activity = this.d.get();
        if (activity == null) {
            return;
        }
        b(activity, this);
        a(activity, (Window.OnFrameMetricsAvailableListener) this.s);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d815a80f", new Object[]{this});
            return;
        }
        this.m = true;
        this.n = true;
        if (!this.z) {
            return;
        }
        this.l = System.nanoTime() / 1000000;
        this.w = this.l;
        c();
        this.z = false;
        mpi.a("Scroll", "ScrollBegin");
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
            return;
        }
        long j2 = j / 1000000;
        if (this.m) {
            c();
        } else {
            this.z = true;
            this.A = false;
            e();
            b(this.l);
            mpi.a("Scroll", "ScrollEnd");
        }
        if (this.f) {
            this.l = j2;
            this.f = false;
            this.n = false;
            this.A = false;
        } else if (!this.m) {
            this.l = j2;
            this.n = false;
            if (this.p) {
                int i = (int) (((this.r * 1.0d) / this.q) * 1000.0d);
                if (i < 30) {
                    this.c.a(i);
                }
                this.p = false;
            }
            this.A = false;
        } else {
            if (this.x && !this.A) {
                d();
                this.A = true;
            }
            a(j2);
        }
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        long j2 = j - this.l;
        this.l = j;
        if (this.n) {
            this.o += j2;
        }
        if (this.g + j2 > 1000) {
            if (!f.a(this.c)) {
                this.c.a(this.x ? SCROLL_TYPE_FINGER : SCROLL_TYPE_VIEW, this.k, this.h, this.i, this.j, this.b, this.f31152a);
            }
            this.g = 0L;
            this.k = 0;
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.b = 0;
            this.f31152a = 0;
            this.m = false;
            if (!this.n) {
                return;
            }
        }
        this.n = false;
        int i = (j2 > 17L ? 1 : (j2 == 17L ? 0 : -1));
        if (i > 0) {
            this.f31152a++;
            if (j2 > 32) {
                this.h++;
            }
            if (j2 > 83) {
                this.i++;
                if (j2 > 125) {
                    this.j++;
                }
            }
            if (j2 > 700) {
                this.b++;
            }
        }
        if (this.p) {
            long j3 = this.q;
            if (j3 > 99.6d && i < 0) {
                int i2 = (int) (((this.r * 1.0d) / j3) * 1000.0d);
                if (i2 < 30) {
                    this.c.a(i2);
                }
                this.p = false;
            } else {
                this.q += j2;
                this.r++;
            }
        } else if (j2 > 33.3d && this.x) {
            this.p = true;
            this.q = j2;
            this.r = 1;
        }
        this.g += j2;
        this.v = ((float) this.v) + Math.max(((float) j2) - this.y, 0.0f);
        this.k++;
    }

    private void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        if (this.x && !f.a(this.c)) {
            long j2 = this.w;
            if (j - j2 > 0) {
                this.c.b((int) ((1000.0d / (j - j2)) * this.v));
            }
        }
        this.x = false;
        this.v = 0L;
        this.w = 0L;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.e) {
        } else {
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // tb.sgh, tb.mon.a
    public void a(int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cea8149", new Object[]{this, new Integer(i), new Float(f), new Float(f2), new Long(j)});
            return;
        }
        super.a(i, f, f2, j);
        if (i != 2) {
            return;
        }
        if ((this.H <= this.t && this.I <= this.t) || this.E <= 0 || j - this.E <= this.u) {
            return;
        }
        this.x = true;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        mnw mnwVar = this.s;
        if (mnwVar == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        mnwVar.a(this.d.get(), this.x ? SCROLL_TYPE_FINGER : SCROLL_TYPE_VIEW);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        mnw mnwVar = this.s;
        if (mnwVar == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        mnwVar.a(this.d.get());
    }
}
