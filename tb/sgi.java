package tb;

import android.app.Activity;
import android.os.Build;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.impl.b;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.trace.s;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import tb.mon;
import tb.mto;

/* loaded from: classes7.dex */
public class sgi extends sgh implements Choreographer.FrameCallback, ViewTreeObserver.OnDrawListener, ViewTreeObserver.OnScrollChangedListener, mon.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final s f33550a;
    private final mnw b;
    private final int c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    public int h;
    private long i;
    private double j;
    private double k;
    private long l;

    public static /* synthetic */ Object ipc$super(sgi sgiVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1662353079) {
            super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).longValue());
            return null;
        } else if (hashCode == 91915241) {
            super.b();
            return null;
        } else if (hashCode != 95609325) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.f();
            return null;
        }
    }

    public sgi(Activity activity, qpi qpiVar, mnw mnwVar) {
        super(activity, qpiVar);
        this.d = true;
        this.e = false;
        this.f = true;
        this.g = false;
        this.i = -1L;
        this.j = mto.a.GEO_NOT_SUPPORT;
        this.k = mto.a.GEO_NOT_SUPPORT;
        this.l = 0L;
        this.h = 0;
        this.c = ViewConfiguration.get(activity).getScaledTouchSlop();
        this.f33550a = c();
        this.b = mnwVar;
    }

    private s c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("5c870159", new Object[]{this});
        }
        m a2 = f.a(a.ACTIVITY_SCROLL_HITCH_RATE_V2_DISPATCHER);
        if (!(a2 instanceof s)) {
            return null;
        }
        return (s) a2;
    }

    @Override // tb.sgh
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        a(this.B.get(), this);
        ViewTreeObserver a2 = a(this.B.get());
        if (a2 == null || !a2.isAlive()) {
            return;
        }
        a2.addOnDrawListener(this);
    }

    @Override // tb.sgh
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        b(this.B.get(), this);
        Choreographer.getInstance().removeFrameCallback(this);
        ViewTreeObserver a2 = a(this.B.get());
        if (a2 == null) {
            return;
        }
        a2.removeOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d815a80f", new Object[]{this});
            return;
        }
        this.e = true;
        if (!this.f) {
            return;
        }
        long nanoTime = System.nanoTime();
        this.i = nanoTime;
        this.l = nanoTime;
        this.f = false;
        d();
        b.d().k().onScrollStart(this.B.get(), this.g ? 1 : 2);
        mpi.a("ScrollHitchRateV2", "ScrollBegin");
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73be92ca", new Object[]{this});
        } else if (!this.f || !this.g) {
        } else {
            this.g = false;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
        } else if (!this.e && this.h > 0) {
            mpi.a("ScrollHitchRateV2", "ScrollEnd");
            a(a(this.i));
            b.d().k().onStopMonitorDoFrame();
        } else {
            d();
            if (!this.e && j == this.i) {
                j = System.nanoTime();
            }
            long j2 = this.i;
            long j3 = 0;
            if (j2 > 0) {
                j3 = j - j2;
            }
            this.i = j;
            if (!this.e) {
                this.h++;
                a(j, j3);
                return;
            }
            this.e = false;
            if (this.d) {
                this.d = false;
                b.d().k().onStopMonitorDoFrame();
                return;
            }
            this.h = 0;
            a(j, j3);
        }
    }

    private void a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        b.d().k().onDoFrame(j);
        this.j += Math.max(((float) j2) - (a() * 1000000.0f), 0.0f);
        this.k += Math.max(j2, 0L);
    }

    private int a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821974f", new Object[]{this, new Long(j)})).intValue();
        }
        int i = -1;
        if (this.g) {
            long j2 = this.l;
            if (j2 > 0 && j - j2 > 100000000) {
                int i2 = (int) ((this.j * 1000.0d) / this.k);
                if (a(i2, j2 / 1000000)) {
                    i = i2;
                }
                mpi.c("ScrollHitchRateV2", "scrollHitchRateV2", Integer.valueOf(i));
                s sVar = this.f33550a;
                if (sVar != null) {
                    sVar.a(i);
                }
            }
        }
        this.g = false;
        this.f = true;
        this.j = mto.a.GEO_NOT_SUPPORT;
        this.k = mto.a.GEO_NOT_SUPPORT;
        this.l = 0L;
        this.i = -1L;
        this.h = 0;
        return i;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
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
        if (2 != i) {
            return;
        }
        if ((this.H <= this.c && this.I <= this.c) || this.E <= 0) {
            return;
        }
        this.g = true;
    }

    private boolean a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c11568d", new Object[]{this, new Integer(i), new Long(j)})).booleanValue();
        }
        boolean z = false;
        for (Map.Entry<mou, Long> entry : this.C.entrySet()) {
            Long value = entry.getValue();
            if (value != null && j >= value.longValue()) {
                entry.getKey().g().b("scrollHitchRateV2", Integer.valueOf(i));
                mpi.c("ScrollHitchRateV2", entry.getKey().i());
                z = true;
            }
        }
        return z;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        mnw mnwVar = this.b;
        String str = null;
        if (mnwVar != null && Build.VERSION.SDK_INT >= 24) {
            StringBuilder sb = new StringBuilder();
            Queue<FrameMetrics> a2 = mnwVar.a();
            if (a2 != null) {
                Iterator<FrameMetrics> it = a2.iterator();
                while (it.hasNext()) {
                    mnw.a(sb, it.next());
                    if (it.hasNext()) {
                        sb.append("~~~~\n");
                    } else {
                        sb.append("\n");
                    }
                }
            }
            str = sb.toString();
        }
        b.d().k().onScrollEnd(this.B.get(), str);
        b.d().k().onScrollEnd(this.B.get(), i, str);
    }
}
