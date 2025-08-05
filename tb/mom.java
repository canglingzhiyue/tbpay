package tb;

import android.support.v4.os.TraceCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.common.PageVisibleAlgorithm;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.PageLeaveDispatcher;
import com.taobao.monitor.impl.trace.e;
import com.taobao.monitor.impl.trace.f;
import com.taobao.monitor.impl.trace.i;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.util.h;
import com.taobao.monitor.procedure.NotifyApm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class mom implements ApplicationBackgroundChangedDispatcher.a, PageLeaveDispatcher.a, e.a, i.a, NotifyApm.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<mou, Boolean> f31168a = new HashMap();
    private final Map<mou, Boolean> b = new HashMap();
    private final Map<mou, Boolean> c = new HashMap();
    private final Map<mou, mok> d = new HashMap();
    private final Map<mou, mok> e = new HashMap();

    public static /* synthetic */ Map a(mom momVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ce571762", new Object[]{momVar}) : momVar.e;
    }

    public mom() {
        m a2 = f.a(a.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
        if (a2 instanceof ApplicationBackgroundChangedDispatcher) {
            ((ApplicationBackgroundChangedDispatcher) a2).a((ApplicationBackgroundChangedDispatcher) this);
        }
        m a3 = f.a(a.PAGE_LEAVE_DISPATCHER);
        if (a3 instanceof PageLeaveDispatcher) {
            ((PageLeaveDispatcher) a3).a((PageLeaveDispatcher) this);
        }
        m a4 = f.a(a.PAGE_FIRST_FRAME_DISPATCHER);
        if (a4 instanceof i) {
            ((i) a4).a((i) this);
        }
        NotifyApm.a().a(2, this);
    }

    @Override // com.taobao.monitor.impl.trace.e.a
    public void a(mou mouVar, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2712cc4", new Object[]{this, mouVar, map, new Long(j)});
            return;
        }
        this.f31168a.put(mouVar, true);
        if (this.d.containsKey(mouVar)) {
            return;
        }
        this.d.put(mouVar, new moj(mouVar));
    }

    @Override // com.taobao.monitor.impl.trace.e.a
    public void a(mou mouVar, long j) {
        mok mokVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80a487f", new Object[]{this, mouVar, new Long(j)});
            return;
        }
        this.b.put(mouVar, true);
        if (d.b || mpe.g(mouVar.k()) || (mokVar = this.d.get(mouVar)) == null) {
            return;
        }
        mokVar.a(mouVar.a(), j);
    }

    @Override // com.taobao.monitor.impl.trace.i.a
    public void d(mou mouVar, long j) {
        mok mokVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4da3a55c", new Object[]{this, mouVar, new Long(j)});
        } else if (!d.b || (mokVar = this.d.get(mouVar)) == null || mpe.c(mouVar.k()) || mpe.g(mouVar.k())) {
        } else {
            TraceCompat.beginSection("apm.startPageCalculateExecutor");
            mokVar.a(mouVar.a(), j);
            TraceCompat.endSection();
        }
    }

    @Override // com.taobao.monitor.impl.trace.e.a
    public void b(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e8121e", new Object[]{this, mouVar, new Long(j)});
            return;
        }
        this.c.put(mouVar, true);
        mok mokVar = this.d.get(mouVar);
        if (mokVar != null) {
            mokVar.b();
        }
        mok mokVar2 = this.e.get(mouVar);
        if (mokVar2 == null) {
            return;
        }
        mokVar2.b();
    }

    @Override // com.taobao.monitor.impl.trace.e.a
    public void c(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc5dbbd", new Object[]{this, mouVar, new Long(j)});
            return;
        }
        mok mokVar = this.d.get(mouVar);
        if (mokVar != null) {
            if (a(mouVar)) {
                mokVar.b(-6);
            }
            mokVar.b();
        }
        this.f31168a.remove(mouVar);
        this.b.remove(mouVar);
        this.c.remove(mouVar);
        this.d.remove(mouVar);
        this.e.remove(mouVar);
    }

    private boolean a(mou mouVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f4e78ae9", new Object[]{this, mouVar})).booleanValue() : !Boolean.TRUE.equals(this.f31168a.get(mouVar)) || !Boolean.TRUE.equals(this.b.get(mouVar)) || !Boolean.TRUE.equals(this.c.get(mouVar));
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.a
    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
        } else if (i == 0) {
            this.b.clear();
            this.c.clear();
            ArrayList arrayList = new ArrayList(this.d.keySet());
            this.d.clear();
            this.e.clear();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                mou mouVar = (mou) arrayList.get(i2);
                if (mouVar != null) {
                    this.d.put(mouVar, new moj(mouVar));
                }
            }
        }
    }

    @Override // com.taobao.monitor.impl.trace.PageLeaveDispatcher.a
    public void a(mou mouVar, int i, long j) {
        mok mokVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593ec9c6", new Object[]{this, mouVar, new Integer(i), new Long(j)});
        } else if (mouVar == null || (mokVar = this.d.get(mouVar)) == null) {
        } else {
            if (i == -5) {
                mokVar.b(-5);
            } else if (i == -4) {
                mokVar.b(-4);
            } else if (i != -3) {
            } else {
                mokVar.b(-3);
            }
        }
    }

    @Override // com.taobao.monitor.procedure.NotifyApm.a
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        Object obj = map.get("page");
        final mou mouVar = null;
        if (obj instanceof mou) {
            mouVar = (mou) obj;
        }
        if (mouVar == null) {
            return;
        }
        final int a2 = mqe.a(map.get("algorithmType"), PageVisibleAlgorithm.CANVAS.getValue());
        com.taobao.monitor.impl.common.e.a().d().post(new Runnable() { // from class: tb.mom.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                mol molVar = new mol(mouVar);
                try {
                    molVar.a(mouVar.a(), h.a(), PageVisibleAlgorithm.valueOf(a2));
                    mom.a(mom.this).put(mouVar, molVar);
                    mpi.c("VisibleCollector", "业务触发页面可视计算", mouVar.i());
                } catch (Exception e) {
                    mpi.c("VisibleCollector", e);
                }
            }
        });
    }
}
