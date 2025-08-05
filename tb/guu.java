package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.e;
import com.taobao.android.job.core.j;
import com.taobao.android.job.core.task.d;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class guu implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final guj f28468a;

    public static /* synthetic */ void a(guu guuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaff0431", new Object[]{guuVar});
        } else {
            guuVar.b();
        }
    }

    public static /* synthetic */ void b(guu guuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9820ab2", new Object[]{guuVar});
        } else {
            guuVar.c();
        }
    }

    public static /* synthetic */ void c(guu guuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8051133", new Object[]{guuVar});
        } else {
            guuVar.d();
        }
    }

    public static /* synthetic */ void d(guu guuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68817b4", new Object[]{guuVar});
        } else {
            guuVar.e();
        }
    }

    public guu(guj gujVar) {
        this.f28468a = gujVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (gvu.a("m-idle")) {
            gsl.b("Sche-LifeCycle", "onIdled, but ignore because of switch m-idle", new Object[0]);
        } else {
            gsl.b("Sche-LifeCycle", "onIdled", new Object[0]);
            long b = gvu.b();
            if (b == 0) {
                b = 200;
            }
            gvi.a("m-idle");
            e<String, Void> a2 = this.f28468a.a("m-idle");
            this.f28468a.n().q(j.a((e) a2));
            this.f28468a.a_(a2, b, TimeUnit.MILLISECONDS, new gtl<String, Void>() { // from class: tb.guu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.gtl
                public void a(e<String, Void> eVar, d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                        return;
                    }
                    gvi.b("m-idle");
                    gur.a(LauncherRuntime.g, eVar, dVar);
                    guu.a(guu.this);
                }
            });
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        gsl.b("Sche-LifeCycle", "onIdled5s", new Object[0]);
        gvi.a("m-idle-5");
        e<String, Void> a2 = this.f28468a.a("m-idle-5");
        this.f28468a.n().p(j.a((e) a2));
        this.f28468a.a_(a2, 5L, TimeUnit.SECONDS, new gtl<String, Void>() { // from class: tb.guu.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-idle-5");
                gur.a(LauncherRuntime.g, eVar, dVar);
                guu.b(guu.this);
            }
        });
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        gsl.b("Sche-LifeCycle", "onIdled10s", new Object[0]);
        gvi.a("m-idle-10");
        e<String, Void> a2 = this.f28468a.a("m-idle-10");
        this.f28468a.n().m(j.a((e) a2));
        this.f28468a.a_(a2, 5L, TimeUnit.SECONDS, new gtl<String, Void>() { // from class: tb.guu.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-idle-10");
                gur.a(LauncherRuntime.g, eVar, dVar);
                guu.c(guu.this);
            }
        });
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        gsl.b("Sche-LifeCycle", "onIdled15s", new Object[0]);
        gvi.a("m-idle-15");
        e<String, Void> a2 = this.f28468a.a("m-idle-15");
        this.f28468a.n().n(j.a((e) a2));
        this.f28468a.a_(a2, 5L, TimeUnit.SECONDS, new gtl<String, Void>() { // from class: tb.guu.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-idle-15");
                gur.a(LauncherRuntime.g, eVar, dVar);
                guu.d(guu.this);
            }
        });
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        gsl.b("Sche-LifeCycle", "onIdled30s", new Object[0]);
        gvi.a("m-idle-30");
        e<String, Void> a2 = this.f28468a.a("m-idle-30");
        this.f28468a.n().o(j.a((e) a2));
        this.f28468a.a_(a2, 15L, TimeUnit.SECONDS, new gtl<String, Void>() { // from class: tb.guu.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-idle-30");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }
}
