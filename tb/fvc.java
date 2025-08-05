package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bf;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes.dex */
public class fvc implements bf.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f28140a;
    public CopyOnWriteArrayList<WeakReference<fva>> b;
    public CopyOnWriteArrayList<WeakReference<fzm>> c;
    public CopyOnWriteArrayList<WeakReference<Object>> d;
    public int e;
    private int f;
    private volatile ScheduledFuture<?> g;

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final fvc f28144a;

        static {
            kge.a(-1527511329);
            f28144a = new fvc();
        }

        public static /* synthetic */ fvc a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fvc) ipChange.ipc$dispatch("f04c9eb", new Object[0]) : f28144a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void c();
    }

    public static /* synthetic */ void a(fvc fvcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9501465", new Object[]{fvcVar});
        } else {
            fvcVar.f();
        }
    }

    public static /* synthetic */ void b(fvc fvcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d31ae6", new Object[]{fvcVar});
        } else {
            fvcVar.e();
        }
    }

    public static /* synthetic */ void c(fvc fvcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6562167", new Object[]{fvcVar});
        } else {
            fvcVar.g();
        }
    }

    public static /* synthetic */ int d(fvc fvcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b4d927db", new Object[]{fvcVar})).intValue() : fvcVar.f;
    }

    static {
        kge.a(-1989129965);
        kge.a(151788738);
        f28140a = 50;
    }

    public static fvc a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fvc) ipChange.ipc$dispatch("f04c9eb", new Object[0]) : a.a();
    }

    @Override // com.taobao.android.dinamicx.bf.a
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            d();
        } else if (i != 2) {
        } else {
            c();
        }
    }

    private fvc() {
        this.f = 10;
        this.b = new CopyOnWriteArrayList<>();
        this.c = new CopyOnWriteArrayList<>();
        this.d = new CopyOnWriteArrayList<>();
        b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.g = fxe.d().scheduleAtFixedRate(new Runnable() { // from class: tb.fvc.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        fvc.a(fvc.this);
                        fvc.b(fvc.this);
                        fvc.c(fvc.this);
                    } catch (Throwable th) {
                        if (fvc.this.e >= fvc.d(fvc.this)) {
                            return;
                        }
                        s sVar = new s("dinamicx");
                        s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_SIGNAL, DXMonitorConstant.DX_MONITOR_SIGNAL_EXCETION_, s.DX_ERROR_CODE_SIGNAL_EXCEPTION_CRASH);
                        aVar.e = com.taobao.android.dinamicx.exception.a.a(th);
                        sVar.c.add(aVar);
                        com.taobao.android.dinamicx.monitor.b.a(sVar);
                        fvc.this.e++;
                    }
                }
            }, 0L, f28140a, TimeUnit.MILLISECONDS);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            fxe.a(new Runnable() { // from class: tb.fvc.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        fvc.this.c();
                    }
                }
            });
        } else {
            try {
                if (this.g != null && !this.g.isDone()) {
                    return;
                }
                if (DinamicXEngine.j()) {
                    fuw.d("DXSignalProduce", "restartProduce");
                }
                b();
            } catch (Exception e) {
                a("restartProduce", e);
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            fxe.a(new Runnable() { // from class: tb.fvc.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        fvc.this.d();
                    }
                }
            });
        } else {
            try {
                if (this.g == null || this.g.isDone()) {
                    return;
                }
                if (DinamicXEngine.j()) {
                    fuw.d("DXSignalProduce", "stopProduce");
                }
                this.g.cancel(false);
                this.g = null;
            } catch (Exception e) {
                a("stopProduce", e);
            }
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        while (i < this.c.size()) {
            fzm fzmVar = this.c.get(i).get();
            if (fzmVar != null) {
                fzmVar.c();
                i++;
            } else {
                this.c.remove(i);
            }
        }
    }

    public void a(fzm fzmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98cfe1f", new Object[]{this, fzmVar});
        } else if (fzmVar == null) {
        } else {
            this.c.add(new WeakReference<>(fzmVar));
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        while (i < this.b.size()) {
            fva fvaVar = this.b.get(i).get();
            if (fvaVar != null) {
                fvaVar.c();
                i++;
            } else {
                this.b.remove(i);
            }
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        while (i < this.d.size()) {
            b bVar = (b) this.d.get(i).get();
            if (bVar != null) {
                bVar.c();
                i++;
            } else {
                this.d.remove(i);
            }
        }
    }

    public void a(fva fvaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94f2ba7", new Object[]{this, fvaVar});
        } else if (fvaVar == null) {
        } else {
            this.b.add(new WeakReference<>(fvaVar));
        }
    }

    public void b(fva fvaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d23228", new Object[]{this, fvaVar});
        } else if (fvaVar != null) {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).get() == fvaVar) {
                    this.b.remove(i);
                    return;
                }
            }
        }
    }

    public void a(String str, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e00e9594", new Object[]{this, str, exc});
            return;
        }
        s sVar = new s("dinamicx");
        sVar.c = new ArrayList();
        s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_SIGNAL, DXMonitorConstant.DX_MONITOR_SIGNAL_EXCETION_, s.DX_ERROR_SIGNAL_BACKGROUND_STOP);
        aVar.e = str + ResponseProtocolType.COMMENT + com.taobao.android.dinamicx.exception.a.a(exc);
        sVar.c.add(aVar);
        com.taobao.android.dinamicx.monitor.b.a(sVar);
    }
}
