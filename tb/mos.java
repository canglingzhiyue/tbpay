package tb;

import android.os.Build;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.FrameMetrics;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.MemoryDispatcher;
import com.taobao.monitor.impl.trace.PageLeaveDispatcher;
import com.taobao.monitor.impl.trace.c;
import com.taobao.monitor.impl.trace.d;
import com.taobao.monitor.impl.trace.e;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.h;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.trace.n;
import com.taobao.monitor.impl.trace.o;
import com.taobao.monitor.impl.trace.p;
import com.taobao.monitor.impl.trace.q;
import com.taobao.monitor.impl.trace.r;
import com.taobao.monitor.impl.util.i;
import com.taobao.monitor.procedure.IPage;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.p;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class mos extends mop implements ApplicationBackgroundChangedDispatcher.a, MemoryDispatcher.a, PageLeaveDispatcher.a, c.a, d.a, e.a, h.a, n.a, o.a, p.a, q.a, r.a, IPage.b, IPage.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private o A;
    private ApplicationBackgroundChangedDispatcher B;
    private p C;
    private n D;
    private q E;
    private PageLeaveDispatcher F;
    private d G;
    private MemoryDispatcher H;
    private final Map<String, List<Object>> I;

    /* renamed from: a  reason: collision with root package name */
    public final mou f31174a;
    public g b;
    public e c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public final List<Integer> m;
    public final List<Integer> n;
    public final List<Integer> o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public final List<FrameMetrics> u;
    public final List<Integer> v;
    public final Map<String, Integer> w;
    private r x;
    private c y;
    private h z;

    public static /* synthetic */ Object ipc$super(mos mosVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void a(float f, long j);

    public abstract void a(int i);

    public abstract void a(String str, String str2, Map<String, Object> map, long j);

    public abstract void b(long j);

    public void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j)});
        }
    }

    public abstract void c(long j);

    public abstract void d(long j);

    public abstract void e(long j);

    public abstract void f(long j);

    public abstract void g(long j);

    public abstract void h(long j);

    public abstract void i(mou mouVar, long j);

    public static /* synthetic */ void a(mos mosVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e6a227", new Object[]{mosVar});
        } else {
            mosVar.h();
        }
    }

    public static /* synthetic */ void a(mos mosVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ee197d", new Object[]{mosVar, new Long(j)});
        } else {
            mosVar.a(j);
        }
    }

    public static /* synthetic */ q b(mos mosVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("e5339659", new Object[]{mosVar}) : mosVar.E;
    }

    public mos() {
        this.d = true;
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new HashMap();
        this.I = new HashMap();
        this.f31174a = new mou();
    }

    public mos(mou mouVar) {
        this.d = true;
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new HashMap();
        this.I = new HashMap();
        this.f31174a = mouVar;
        c();
        d();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        m a2 = f.a(a.CUSTOM_PAGE_LIFECYCLE_DISPATCHER);
        if (a2 instanceof e) {
            this.c = (e) a2;
        }
        if (f.a(this.c)) {
            return;
        }
        this.c.a((e) this);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        p.a a2 = new p.a().a(this.f31174a.c()).b(false).a(true).c(true).a((g) null);
        if ((!com.taobao.monitor.impl.common.d.c || !com.taobao.monitor.impl.common.e.a().i()) && com.taobao.monitor.impl.common.d.k && !mna.b(this.f31174a.k())) {
            z = true;
        }
        this.b = com.taobao.monitor.procedure.r.f18232a.a(i.a("/pageLoad"), a2.e(z).a());
        this.b.b();
        ProcedureGlobal.PROCEDURE_MANAGER.a(this.f31174a, this.b);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        m a2 = a(a.WINDOW_EVENT_DISPATCHER);
        if (a2 instanceof r) {
            this.x = (r) a2;
        }
        m a3 = a(a.APPLICATION_LOW_MEMORY_DISPATCHER);
        if (a3 instanceof c) {
            this.y = (c) a3;
        }
        m a4 = a(a.ACTIVITY_FPS_DISPATCHER);
        if (a4 instanceof h) {
            this.z = (h) a4;
        }
        m a5 = a(a.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
        if (a5 instanceof ApplicationBackgroundChangedDispatcher) {
            this.B = (ApplicationBackgroundChangedDispatcher) a5;
        }
        m a6 = a(a.NETWORK_STAGE_DISPATCHER);
        if (a6 instanceof com.taobao.monitor.impl.trace.p) {
            this.C = (com.taobao.monitor.impl.trace.p) a6;
        }
        m a7 = a(a.IMAGE_STAGE_DISPATCHER);
        if (a7 instanceof n) {
            this.D = (n) a7;
        }
        m a8 = a(a.PAGE_RENDER_DISPATCHER);
        if (a8 instanceof q) {
            this.E = (q) a8;
        }
        m a9 = a(a.PAGE_LEAVE_DISPATCHER);
        if (a9 instanceof PageLeaveDispatcher) {
            this.F = (PageLeaveDispatcher) a9;
        }
        m a10 = a(a.LOOPER_HEAVY_MSG_DISPATCHER);
        if (a10 instanceof o) {
            this.A = (o) a10;
        }
        m a11 = a(a.BATTERY_DISPATCHER);
        if (a11 instanceof d) {
            this.G = (d) a11;
        }
        m a12 = a(a.CLOCKED_MEMORY_DISPATCHER);
        if (a12 instanceof MemoryDispatcher) {
            this.H = (MemoryDispatcher) a12;
        }
        if (!f.a(this.y)) {
            this.y.a((c) this);
        }
        if (!f.a(this.x)) {
            this.x.a((r) this);
        }
        if (!f.a(this.z)) {
            this.z.a((h) this);
        }
        if (!f.a(this.B)) {
            this.B.a((ApplicationBackgroundChangedDispatcher) this);
        }
        if (!f.a(this.C)) {
            this.C.a((com.taobao.monitor.impl.trace.p) this);
        }
        if (!f.a(this.D)) {
            this.D.a((n) this);
        }
        if (!f.a(this.E)) {
            this.E.a((q) this);
        }
        if (!f.a(this.F)) {
            this.F.a((PageLeaveDispatcher) this);
        }
        if (!f.a(this.A)) {
            this.A.a((o) this);
        }
        if (f.a(this.G)) {
            return;
        }
        this.G.a((d) this);
    }

    @Override // com.taobao.monitor.impl.trace.e.a
    public void a(mou mouVar, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2712cc4", new Object[]{this, mouVar, map, new Long(j)});
        } else if (!a(mouVar)) {
        } else {
            e();
            a(j);
            a(mouVar.i(), mouVar.l(), map, j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.e.a
    public void a(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80a487f", new Object[]{this, mouVar, new Long(j)});
        } else if (!a(mouVar)) {
        } else {
            this.d = true;
            b(j);
            if (f.a(this.H)) {
                return;
            }
            this.H.a((MemoryDispatcher) this);
        }
    }

    @Override // com.taobao.monitor.impl.trace.e.a
    public void b(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e8121e", new Object[]{this, mouVar, new Long(j)});
        } else if (!a(mouVar)) {
        } else {
            this.d = false;
            c(j);
            if (f.a(this.H)) {
                return;
            }
            this.H.b(this);
        }
    }

    @Override // com.taobao.monitor.impl.trace.e.a
    public void c(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc5dbbd", new Object[]{this, mouVar, new Long(j)});
        } else if (!a(mouVar)) {
        } else {
            d(j);
            b();
        }
    }

    @Override // tb.mop
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        if (!f.a(this.c)) {
            this.c.b(this);
        }
        if (!f.a(this.H)) {
            this.H.b(this);
        }
        if (!f.a(this.y)) {
            this.y.b(this);
        }
        if (!f.a(this.x)) {
            this.x.b(this);
        }
        if (!f.a(this.z)) {
            this.z.b((h) this);
        }
        if (!f.a(this.B)) {
            this.B.b(this);
        }
        if (!f.a(this.D)) {
            this.D.b(this);
        }
        if (!f.a(this.C)) {
            this.C.b(this);
        }
        if (!f.a(this.E)) {
            this.E.b(this);
        }
        if (!f.a(this.F)) {
            this.F.b(this);
        }
        if (!f.a(this.A)) {
            this.A.b(this);
        }
        if (!f.a(this.G)) {
            this.G.b((d) this);
        }
        ProcedureGlobal.PROCEDURE_MANAGER.a(this.f31174a);
        g();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        for (Map.Entry<String, List<Object>> entry : this.I.entrySet()) {
            this.b.b(entry.getKey(), entry.getValue());
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.m.clear();
        this.n.clear();
        this.o.clear();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u.clear();
        this.v.clear();
        this.w.clear();
        this.I.clear();
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void d(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4da3a55c", new Object[]{this, mouVar, new Long(j)});
        } else if (!a(mouVar)) {
        } else {
            e(j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void a(mou mouVar, float f, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593d6ca9", new Object[]{this, mouVar, new Float(f), new Long(j)});
        } else if (!a(mouVar)) {
        } else {
            a(f, j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void e(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f816efb", new Object[]{this, mouVar, new Long(j)});
        } else if (!a(mouVar)) {
        } else {
            f(j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void f(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("115f389a", new Object[]{this, mouVar, new Long(j)});
        } else if (!a(mouVar)) {
        } else {
            g(j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void g(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33d0239", new Object[]{this, mouVar, new Long(j)});
        } else if (!a(mouVar)) {
        } else {
            h(j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void a(mou mouVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80a44be", new Object[]{this, mouVar, new Integer(i)});
        } else if (!a(mouVar)) {
        } else {
            a(i);
        }
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void h(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51acbd8", new Object[]{this, mouVar, new Long(j)});
        } else if (!a(mouVar)) {
        } else {
            i(mouVar, j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.n.a
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (!this.d) {
        } else {
            if (i == 0) {
                this.e++;
            } else if (i == 1) {
                this.f++;
            } else if (i == 2) {
                this.g++;
            } else if (i != 3) {
            } else {
                this.h++;
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.p.a
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (!this.d) {
        } else {
            if (i == 0) {
                this.i++;
            } else if (i == 1) {
                this.j++;
            } else if (i == 2) {
                this.k++;
            } else if (i != 3) {
            } else {
                this.l++;
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.h.a
    public void frameDataPerSecond(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d825ceeb", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        if (this.m.size() < 200 && this.d) {
            this.m.add(Integer.valueOf(i));
        }
        if (Build.VERSION.SDK_INT < 16 || !mny.SCROLL_TYPE_FINGER.equals(str) || this.n.size() >= 200 || !this.d) {
            return;
        }
        this.r += i2;
        this.s += i3;
        this.t += i4;
        this.p += i5;
        this.q += i6;
        this.n.add(Integer.valueOf(i));
    }

    @Override // com.taobao.monitor.impl.trace.h.a
    public void blockFps(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e069e7c0", new Object[]{this, new Integer(i)});
        } else if (this.o.size() >= 200 || !this.d) {
        } else {
            this.o.add(Integer.valueOf(i));
        }
    }

    @Override // com.taobao.monitor.impl.trace.h.a
    public void scrollHitchRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93e51", new Object[]{this, new Integer(i)});
        } else if (this.v.size() >= 200 || !this.d) {
        } else {
            this.v.add(Integer.valueOf(i));
        }
    }

    @Override // com.taobao.monitor.impl.trace.o.a
    public void a(Looper looper, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ec33c7", new Object[]{this, looper, str});
        } else if (looper != Looper.getMainLooper() || this.w.size() >= 100) {
        } else {
            Integer num = this.w.get(str);
            Map<String, Integer> map = this.w;
            if (num != null) {
                i = Integer.valueOf(num.intValue() + 1).intValue();
            }
            map.put(str, Integer.valueOf(i));
        }
    }

    public boolean a(mou mouVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f4e78ae9", new Object[]{this, mouVar})).booleanValue() : mouVar != null && mouVar == this.f31174a;
    }

    @Override // com.taobao.monitor.procedure.IPage.c
    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else {
            this.b.a(str, j);
        }
    }

    @Override // com.taobao.monitor.procedure.IPage.c
    public void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{this, str, obj});
        } else if (StringUtils.isEmpty(str) || obj == null) {
        } else {
            List<Object> list = this.I.get(str);
            if (list == null) {
                list = new ArrayList<>();
                this.I.put(str, list);
            }
            list.add(obj);
        }
    }

    @Override // com.taobao.monitor.procedure.IPage.c
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.b.a(str, obj);
        }
    }

    @Override // com.taobao.monitor.procedure.IPage.c
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            this.b.b(str, map);
        }
    }

    @Override // com.taobao.monitor.impl.trace.PageLeaveDispatcher.a
    public void a(mou mouVar, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593ec9c6", new Object[]{this, mouVar, new Integer(i), new Long(j)});
        } else if (!a(mouVar)) {
        } else {
            if (i == -5) {
                b("jumpNextPage", j);
            } else if (i == -4) {
                b("back", j);
                b();
            } else if (i != -3) {
            } else {
                b("F2B", j);
                b();
                j();
            }
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (!mpe.o(this.f31174a.k()) && !mpe.o(this.f31174a.i())) {
        } else {
            com.taobao.monitor.impl.common.e.a().d().post(new Runnable() { // from class: tb.mos.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    mos.this.c();
                    mos.this.d();
                    mos.this.e();
                    mos.a(mos.this);
                    if (!f.a(mos.b(mos.this))) {
                        mos.b(mos.this).b(mos.this);
                    }
                    long a2 = com.taobao.monitor.impl.util.h.a();
                    mos.a(mos.this, a2);
                    mos mosVar = mos.this;
                    mosVar.a(mosVar.f31174a.i(), mos.this.f31174a.l(), new HashMap(), a2);
                    mos.this.b.a(b.KEY_LOAD_TYPE, "supplementary");
                }
            });
        }
    }
}
