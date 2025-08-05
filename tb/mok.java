package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.impl.common.PageVisibleAlgorithm;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.trace.r;
import com.taobao.monitor.impl.util.h;
import java.lang.ref.WeakReference;
import tb.mng;

/* loaded from: classes.dex */
public abstract class mok implements r.a, Runnable, mng.a, xjn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float PAGE_LOAD_PERCENT = 0.7f;

    /* renamed from: a  reason: collision with root package name */
    public final mou f31166a;
    private r b;
    private volatile mne c;
    private float g = 0.0f;
    private boolean h = false;
    private int i = 0;
    private float k = 0.0f;
    private float l = 0.0f;
    private float m = 0.0f;
    private float n = 0.0f;
    private boolean d = false;
    private final Runnable e = new Runnable() { // from class: tb.mok.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            mok.this.a(-1);
            mok.a(mok.this);
        }
    };
    private volatile boolean f = false;
    private boolean j = false;

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(long j);

    @Override // com.taobao.monitor.impl.trace.r.a
    public void a(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c497142", new Object[]{this, activity, keyEvent, new Long(j)});
        }
    }

    public abstract void b(float f, long j);

    public abstract void b(long j);

    public abstract void c(long j);

    public static /* synthetic */ void a(mok mokVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e2ff2f", new Object[]{mokVar});
        } else {
            mokVar.c();
        }
    }

    public mok(mou mouVar) {
        if (mouVar == null) {
            throw new IllegalArgumentException("Visible calculate must page not null");
        }
        this.f31166a = mouVar;
        m a2 = f.a(a.WINDOW_EVENT_DISPATCHER);
        if (!(a2 instanceof r)) {
            return;
        }
        this.b = (r) a2;
        if (d.j) {
            return;
        }
        this.b.a((r) this);
    }

    public void a(View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b009a", new Object[]{this, view, new Long(j)});
        } else {
            a(view, j, (PageVisibleAlgorithm) null);
        }
    }

    public void a(View view, long j, PageVisibleAlgorithm pageVisibleAlgorithm) {
        String k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b5263de", new Object[]{this, view, new Long(j), pageVisibleAlgorithm});
        } else if (this.f || !this.f31166a.p()) {
        } else {
            if (this.d) {
                a(-6);
                return;
            }
            if (this.f31166a.w() || this.f31166a.x()) {
                k = this.f31166a.k();
            } else {
                k = this.f31166a.i();
            }
            this.c = new mng(view, k, pageVisibleAlgorithm);
            ((mng) this.c).a(this);
            this.c.a();
            if (!f.a(this.b) && d.j) {
                this.b.a((r) this);
            }
            e.a().d().postDelayed(this.e, orq.FRAME_CHECK_TIMEOUT);
            a(j);
            this.f = true;
        }
    }

    @Override // tb.mng.a
    public void a(float f, long j) {
        String k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0ff96c", new Object[]{this, new Float(f), new Long(j)});
            return;
        }
        if (this.f31166a.w() || this.f31166a.x()) {
            k = this.f31166a.k();
        } else {
            k = this.f31166a.i();
        }
        float a2 = mpd.a(k);
        float f2 = 0.7f;
        if (a(this.f31166a)) {
            f2 = 0.8f;
        }
        if (Math.abs(f - this.g) <= 0.05f && f < f2 && f < a2) {
            return;
        }
        b(f, h.a());
        mpi.c("BaseVisibleCalculator", "visiblePercent", Float.valueOf(f), this.f31166a.i());
        if ((f >= f2 || f >= a2) && !this.h && !this.d) {
            d(j);
            run();
        }
        this.g = f;
    }

    @Override // tb.mng.a
    public void a(WeakReference<View> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb9cf36", new Object[]{this, weakReference});
            return;
        }
        this.f31166a.a(weakReference);
        ProcedureGlobal.PROCEDURE_MANAGER.a(this.f31166a, weakReference);
    }

    @Override // tb.mng.a
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else {
            this.f31166a.a(view);
        }
    }

    private boolean a(mou mouVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4e78ae9", new Object[]{this, mouVar})).booleanValue();
        }
        if (mouVar.w()) {
            return lsk.BIZ_NAME.equals(mouVar.k());
        }
        if (!mouVar.x()) {
            return false;
        }
        return "com.taobao.tao.homepage.HomepageFragment".equals(mouVar.k());
    }

    private void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad402139", new Object[]{this, new Long(j)});
        } else if (this.h || this.d) {
        } else {
            b(j);
            c();
            this.h = true;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        this.i++;
        if (this.i > 2) {
            e(h.a());
            return;
        }
        Handler j = e.a().j();
        j.removeCallbacks(this);
        if (d.af) {
            j.postAtFrontOfQueue(this);
        } else {
            j.postDelayed(this, 16L);
        }
    }

    private void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f9d8", new Object[]{this, new Long(j)});
        } else if (this.j) {
        } else {
            c(j);
            c();
            this.j = true;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            c();
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        a(i);
        b();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.d = true;
        if (this.c != null) {
            synchronized (this) {
                if (this.c != null) {
                    e.a().d().removeCallbacks(this.e);
                    if (this.c != null) {
                        this.c.b();
                    }
                    a();
                    this.c = null;
                }
            }
        }
        if (f.a(this.b)) {
            return;
        }
        this.b.b(this);
    }

    @Override // com.taobao.monitor.impl.trace.r.a
    public void a(Activity activity, int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb07419b", new Object[]{this, activity, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        } else if (this.d || this.h || !mnh.a(activity, this.f31166a.a())) {
        } else {
            if (i == 0) {
                this.k = f;
                this.l = f2;
                this.m = 0.0f;
                this.n = 0.0f;
            } else if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.m += Math.abs(f - this.k);
                this.n += Math.abs(f2 - this.l);
                this.k = f;
                this.l = f2;
            } else {
                float d = d();
                if (this.m <= d && this.n <= d) {
                    return;
                }
                c();
                a(-2);
            }
        }
    }

    private int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        Context v = this.f31166a.v();
        if (v == null) {
            return Integer.MAX_VALUE;
        }
        return ViewConfiguration.get(v).getScaledTouchSlop();
    }
}
