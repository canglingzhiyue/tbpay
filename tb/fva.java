package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.exception.a;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.monitor.b;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;
import tb.fvc;

/* loaded from: classes.dex */
public class fva implements fvc.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public fve f28137a;
    public int c;
    public int d;
    public int e;
    public List<DXTemplateItem> f;
    public List<DXTemplateItem> g;
    public List<fvd> h;
    public boolean b = false;
    public List<fve> i = new ArrayList();

    static {
        kge.a(-387003899);
        kge.a(1933598856);
    }

    public fva(DXEngineConfig dXEngineConfig) {
        int i;
        this.c = dXEngineConfig.a();
        if (this.c < fvc.f28140a) {
            i = fvc.f28140a;
        } else {
            i = this.c;
        }
        this.d = i / fvc.f28140a;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
    }

    public void a(fve fveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e950fd23", new Object[]{this, fveVar});
        } else if (fveVar == null) {
        } else {
            this.f28137a = fveVar;
            if (this.b) {
                return;
            }
            fvc.a().a(this);
            this.b = true;
        }
    }

    public void b(fve fveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d403a4", new Object[]{this, fveVar});
        } else if (!this.b) {
        } else {
            if (fveVar != null) {
                this.f28137a = null;
            }
            fvc.a().b(this);
            this.b = false;
        }
    }

    public void c(fve fveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6570a25", new Object[]{this, fveVar});
        } else if (fveVar == null || this.i.contains(fveVar)) {
        } else {
            this.i.add(fveVar);
        }
    }

    public void d(fve fveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4da10a6", new Object[]{this, fveVar});
        } else if (fveVar == null || !this.i.contains(fveVar)) {
        } else {
            this.i.remove(fveVar);
        }
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (e()) {
            final fvb fvbVar = new fvb(this.f, this.g, this.h);
            a();
            fxe.a(new Runnable() { // from class: tb.fva.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (fva.this.f28137a != null) {
                        fva.this.f28137a.onNotificationListener(fvbVar);
                        try {
                            if (fva.this.i == null || fva.this.i.size() <= 0) {
                                return;
                            }
                            for (int i = 0; i < fva.this.i.size(); i++) {
                                fva.this.i.get(i).onNotificationListener(fvbVar);
                            }
                        } catch (Throwable th) {
                            a.b(th);
                            b.a("DinamicX", null, DXMonitorConstant.DX_MONITOR_SIGNAL, DXMonitorConstant.DX_MONITOR_SIGNAL_EXCETION_, s.DX_ERROR_CODE_SIGNAL_EXCEPTION_CRASH_2, a.a(th));
                        }
                    }
                }
            });
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.f.size() > 0 || this.g.size() > 0 || this.h.size() > 0;
    }

    public synchronized void a(fvd fvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e95088c4", new Object[]{this, fvdVar});
            return;
        }
        if (fvdVar != null && fvdVar.f28145a != null) {
            b(fvdVar);
        }
    }

    public synchronized void a(com.taobao.android.dinamicx.template.download.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7715669c", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            if (bVar.b() && bVar.a() != null) {
                this.f.add(bVar.a());
                return;
            }
            if (bVar.a() != null) {
                this.g.add(bVar.a());
            }
        }
    }

    public synchronized void a(List<DXTemplateItem> list, List<DXTemplateItem> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
            return;
        }
        if (list != null && list.size() > 0) {
            this.f.addAll(list);
        }
        if (list2 != null && list2.size() > 0) {
            this.g.addAll(list2);
        }
    }

    private void b(fvd fvdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d38f45", new Object[]{this, fvdVar});
        } else if (fvdVar == null || fvdVar.f28145a == null) {
        } else {
            this.h.add(fvdVar);
        }
    }

    @Override // tb.fvc.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f28137a != null && this.e == this.d) {
            b();
            this.e = 0;
        } else {
            this.e++;
        }
    }

    public fve d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fve) ipChange.ipc$dispatch("2619ba46", new Object[]{this}) : this.f28137a;
    }
}
