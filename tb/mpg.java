package tb;

import android.os.SystemClock;
import com.alipay.zoloz.hardware.camera.preview.utils.SPManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.c;
import com.taobao.monitor.impl.trace.h;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.trace.n;
import com.taobao.monitor.impl.trace.p;
import com.taobao.monitor.impl.trace.q;
import com.taobao.monitor.impl.util.i;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.p;
import com.taobao.monitor.procedure.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class mpg extends mop implements ApplicationBackgroundChangedDispatcher.a, c.a, h.a, n.a, p.a, q.a, mqc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final g f31186a;
    private m b;
    private m c;
    private m d;
    private m e;
    private List<Integer> f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private long t;
    private final String u;
    private boolean v;
    private boolean w;
    private boolean x;

    public static /* synthetic */ Object ipc$super(mpg mpgVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1474193572) {
            super.a(((Number) objArr[0]).longValue());
            return null;
        } else if (hashCode != 90991720) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a();
            return null;
        }
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void a(mou mouVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80a44be", new Object[]{this, mouVar, new Integer(i)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.h.a
    public void blockFps(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e069e7c0", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void f(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("115f389a", new Object[]{this, mouVar, new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void h(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51acbd8", new Object[]{this, mouVar, new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.h.a
    public void scrollHitchRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93e51", new Object[]{this, new Integer(i)});
        }
    }

    public mpg(String str) {
        super(false);
        this.f = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = true;
        this.s = false;
        this.v = true;
        this.w = true;
        this.x = true;
        this.u = str;
        com.taobao.monitor.procedure.p a2 = new p.a().b(true).a(true).c(true).a((g) null).a();
        r rVar = r.f18232a;
        this.f31186a = rVar.a(i.a("/" + str), a2);
        this.b = a(a.APPLICATION_LOW_MEMORY_DISPATCHER);
        this.c = a(a.ACTIVITY_FPS_DISPATCHER);
        this.d = a(a.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
        this.e = a(a.PAGE_RENDER_DISPATCHER);
    }

    @Override // tb.mop
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        super.a(j);
        this.t = com.taobao.monitor.impl.util.h.a();
        this.f31186a.b();
        this.f31186a.a("timestampInterval", Long.valueOf(System.currentTimeMillis() - SystemClock.uptimeMillis()));
        this.f31186a.a("procedureStartTime", com.taobao.monitor.impl.util.h.a());
        this.b.a(this);
        this.c.a(this);
        this.d.a(this);
        this.e.a(this);
    }

    @Override // tb.mop
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (!this.s) {
            this.f31186a.a("procedureEndTime", com.taobao.monitor.impl.util.h.a());
            this.f31186a.b(SPManager.FPS_KEY, this.f.toString());
            this.f31186a.b("jankCount", Integer.valueOf(this.g));
            this.f31186a.b("movieJankCount", Integer.valueOf(this.h));
            this.f31186a.b("movieBigJankCount", Integer.valueOf(this.i));
            this.f31186a.a("deviceLevel", Integer.valueOf(com.taobao.application.common.c.a().a("deviceLevel", -1)));
            if (d.y) {
                mpi.c("WeexProcessor", "collecting runtimeLevel、cpuUsageOfDevcie、memoryRuntimeLevel");
                this.f31186a.a("runtimeLevel", Integer.valueOf(aks.a().g().d));
                this.f31186a.a("cpuUsageOfDevcie", Float.valueOf(aks.a().e().d));
                this.f31186a.a("memoryRuntimeLevel", Integer.valueOf(aks.a().f().k));
            }
            this.f31186a.b("imgLoadCount", Integer.valueOf(this.k));
            this.f31186a.b("imgLoadSuccessCount", Integer.valueOf(this.l));
            this.f31186a.b("imgLoadFailCount", Integer.valueOf(this.m));
            this.f31186a.b("imgLoadCancelCount", Integer.valueOf(this.n));
            this.f31186a.b("networkRequestCount", Integer.valueOf(this.o));
            this.f31186a.b("networkRequestSuccessCount", Integer.valueOf(this.p));
            this.f31186a.b("networkRequestFailCount", Integer.valueOf(this.q));
            this.f31186a.b("networkRequestCancelCount", Integer.valueOf(this.r));
            this.b.b(this);
            this.c.b(this);
            this.d.b(this);
            this.e.b(this);
            this.f31186a.d();
            super.a();
        }
        this.s = true;
    }

    @Override // tb.mqc
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        a(com.taobao.monitor.impl.util.h.a());
        this.f31186a.a("instanceId", str);
    }

    @Override // tb.mqc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a();
        }
    }

    @Override // tb.mqc
    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else {
            this.f31186a.a(str, j);
        }
    }

    @Override // tb.mqc
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.f31186a.a(str, obj);
        }
    }

    @Override // tb.mqc
    public void a(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81239a4c", new Object[]{this, str, new Double(d)});
        } else {
            this.f31186a.b(str, Double.valueOf(d));
        }
    }

    @Override // tb.mqc
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            this.f31186a.b(str, map);
        }
    }

    @Override // tb.mqc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.j = true;
        }
    }

    @Override // tb.mqc
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.j = false;
        }
    }

    @Override // tb.mqc
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : mpn.b(ProcedureGlobal.PROCEDURE_MANAGER.b(this.f31186a));
    }

    @Override // com.taobao.monitor.impl.trace.c.a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(com.taobao.monitor.impl.util.h.a()));
        this.f31186a.a("onLowMemory", (Map<String, Object>) hashMap);
    }

    @Override // com.taobao.monitor.impl.trace.h.a
    public void frameDataPerSecond(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d825ceeb", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else if (this.f.size() >= 200 || !this.j) {
        } else {
            this.g += i2;
            this.h += i3;
            this.h += i4;
            this.f.add(Integer.valueOf(i));
        }
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.a
    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
        } else if (i == 1) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("timestamp", Long.valueOf(j));
            this.f31186a.a("foreground2Background", (Map<String, Object>) hashMap);
        } else {
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("timestamp", Long.valueOf(j));
            this.f31186a.a("background2Foreground", (Map<String, Object>) hashMap2);
        }
    }

    @Override // com.taobao.monitor.impl.trace.n.a
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (!this.j) {
        } else {
            if (i == 0) {
                this.k++;
            } else if (i == 1) {
                this.l++;
            } else if (i == 2) {
                this.m++;
            } else if (i != 3) {
            } else {
                this.n++;
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.p.a
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (!this.j) {
        } else {
            if (i == 0) {
                this.o++;
            } else if (i == 1) {
                this.p++;
            } else if (i == 2) {
                this.q++;
            } else if (i != 3) {
            } else {
                this.r++;
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void d(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4da3a55c", new Object[]{this, mouVar, new Long(j)});
        } else if (!this.v || !this.j || !mouVar.w()) {
        } else {
            this.f31186a.a("pageInitDuration", Long.valueOf(j - this.t));
            this.f31186a.a("renderStartTime", j);
            this.v = false;
        }
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void a(mou mouVar, float f, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593d6ca9", new Object[]{this, mouVar, new Float(f), new Long(j)});
        } else if (!this.j || !mouVar.w()) {
        } else {
            this.f31186a.a("onRenderPercent", Float.valueOf(f));
            this.f31186a.a("drawPercentTime", Long.valueOf(j));
        }
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void e(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f816efb", new Object[]{this, mouVar, new Long(j)});
        } else if (!this.w || !this.j || !mouVar.w()) {
        } else {
            this.f31186a.a("displayDuration", Long.valueOf(j - this.t));
            this.f31186a.a("displayedTime", j);
            this.w = false;
        }
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void g(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33d0239", new Object[]{this, mouVar, new Long(j)});
        } else if (!this.x || !this.j || !mouVar.w()) {
        } else {
            this.f31186a.a("interactiveDuration", Long.valueOf(j - this.t));
            this.f31186a.a("loadDuration", Long.valueOf(j - this.t));
            this.f31186a.a("interactiveTime", j);
            this.x = false;
        }
    }
}
