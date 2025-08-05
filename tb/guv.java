package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.b;
import com.taobao.android.job.core.j;
import com.taobao.android.job.core.task.d;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.launcher.common.e;
import com.taobao.android.launcher.common.f;
import com.taobao.android.launcher.common.g;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import tb.gte;
import tb.mto;

/* loaded from: classes.dex */
public class guv extends gtk implements e, f, g<String>, Runnable, gte.a, guj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int c = gsm.a(mto.a.GEO_NOT_SUPPORT);
    private final Runnable b;
    private volatile boolean d;

    public static /* synthetic */ Object ipc$super(guv guvVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.gtk
    public f f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("7778cb9a", new Object[]{this}) : this;
    }

    @Override // tb.gtk
    public e g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("7ede009a", new Object[]{this}) : this;
    }

    public static /* synthetic */ com.taobao.android.job.core.e a(guv guvVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.job.core.e) ipChange.ipc$dispatch("93257a31", new Object[]{guvVar, str}) : guvVar.c(str);
    }

    public static /* synthetic */ Future a(guv guvVar, com.taobao.android.job.core.e eVar, long j, TimeUnit timeUnit, gtl gtlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("1186212", new Object[]{guvVar, eVar, new Long(j), timeUnit, gtlVar}) : guvVar.b(eVar, j, timeUnit, gtlVar);
    }

    public static /* synthetic */ gub a(guv guvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gub) ipChange.ipc$dispatch("175bb142", new Object[]{guvVar}) : guvVar.f28443a;
    }

    public guv(gua guaVar) {
        super(guaVar);
        this.d = false;
        this.b = new guu(this);
    }

    @Override // tb.gtk
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (LauncherRuntime.l) {
            o();
        }
        gvi.a("m-launch");
        com.taobao.android.job.core.e<String, Void> b_ = b_("m-launch");
        this.f28443a.a(j.a((com.taobao.android.job.core.e) b_));
        b(b_, new gtl<String, Void>() { // from class: tb.guv.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-launch");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        com.taobao.android.job.core.e<String, Void> b_ = b_("m-a-d");
        this.f28443a.d(j.a((com.taobao.android.job.core.e) b_));
        b(b_, new gtl<String, Void>() { // from class: tb.guv.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                } else {
                    gur.a(LauncherRuntime.g, eVar, dVar);
                }
            }
        });
    }

    @Override // tb.guj
    public gub<String> n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gub) ipChange.ipc$dispatch("730aa03d", new Object[]{this}) : this.f28443a;
    }

    @Override // tb.gtk
    public b<String, Void> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("642ff9a9", new Object[]{this});
        }
        int i = c;
        return new b<>(gtg.a("launcher", i, i, 0, this), this.l);
    }

    @Override // tb.gtk
    public b<String, Void> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3658f6b5", new Object[]{this});
        }
        int i = c;
        return new b<>(gtg.a("launcher-async", i, i, 0));
    }

    @Override // tb.gtk
    public b<String, Void> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("cb08b96a", new Object[]{this}) : new b<>(gtg.a("launcher-demand", 1, c, 10));
    }

    @Override // tb.gtk
    public b<String, Void> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("31e1792b", new Object[]{this}) : new b<>(gtg.a("launcher-idle", 1, c, 10));
    }

    @Override // com.taobao.android.launcher.common.f
    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        gsl.b("Sche-LifeCycle", "onAppAttach", new Object[0]);
        gvi.a("m-a-head");
        com.taobao.android.job.core.e<String, Void> b_ = b_("m-a-head");
        this.f28443a.b(j.a((com.taobao.android.job.core.e) b_));
        b(b_, new gtl<String, Void>() { // from class: tb.guv.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-a-head");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
        gvi.a("m-a-tail");
        com.taobao.android.job.core.e<String, Void> b_2 = b_("m-a-tail");
        this.f28443a.c(j.a((com.taobao.android.job.core.e) b_2));
        b(b_2, new gtl<String, Void>() { // from class: tb.guv.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-a-tail");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }

    @Override // com.taobao.android.launcher.common.f
    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        gsl.b("Sche-LifeCycle", "onAppCreated", new Object[0]);
        gvi.a("m-a-c");
        com.taobao.android.job.core.e<String, Void> b_ = b_("m-a-c");
        this.f28443a.e(j.a((com.taobao.android.job.core.e) b_));
        b(b_, new gtl<String, Void>() { // from class: tb.guv.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-a-c");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }

    @Override // com.taobao.android.launcher.common.e
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        gsl.b("Sche-LifeCycle", "onPrivacyKernelLoad", new Object[0]);
        gvi.a("m-privacy-kernel");
        com.taobao.android.job.core.e<String, Void> b_ = b_("m-privacy-kernel");
        this.f28443a.C(j.a((com.taobao.android.job.core.e) b_));
        b(b_, new gtl<String, Void>() { // from class: tb.guv.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-privacy-kernel");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }

    @Override // com.taobao.android.launcher.common.e
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        gsl.b("Sche-LifeCycle", "onMinKernelLoad", new Object[0]);
        gvi.a("m-min-kernel");
        com.taobao.android.job.core.e<String, Void> b_ = b_("m-min-kernel");
        this.f28443a.B(j.a((com.taobao.android.job.core.e) b_));
        b(b_, new gtl<String, Void>() { // from class: tb.guv.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-min-kernel");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }

    @Override // com.taobao.android.launcher.common.e
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        gsl.b("Sche-LifeCycle", "onLaunchResumed", new Object[0]);
        gvi.a("m-launch-resume");
        com.taobao.android.job.core.e<String, Void> b_ = b_("m-launch-resume");
        this.f28443a.D(j.a((com.taobao.android.job.core.e) b_));
        b(b_, new gtl<String, Void>() { // from class: tb.guv.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-launch-resume");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }

    @Override // com.taobao.android.launcher.common.e
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        gsl.b("Sche-LifeCycle", "onBeforeActivityDisplay", new Object[0]);
        gvi.a("m-b-a-d");
        com.taobao.android.job.core.e<String, Void> b_ = b_("m-b-a-d");
        this.f28443a.y(j.a((com.taobao.android.job.core.e) b_));
        b(b_, new gtl<String, Void>() { // from class: tb.guv.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-b-a-d");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }

    @Override // com.taobao.android.launcher.common.g
    public void a(String str, g.a<String> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2f14f05", new Object[]{this, str, aVar});
        } else if (aVar == null) {
        } else {
            final String str2 = "m-custom-" + str;
            gsl.b("Sche-LifeCycle", "onScheduleCustomizedStage: " + str, new Object[0]);
            gvi.a(str2);
            com.taobao.android.job.core.e<String, Void> b_ = b_(str2);
            aVar.a(j.a((com.taobao.android.job.core.e) b_));
            b(b_, new gtl<String, Void>() { // from class: tb.guv.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.gtl
                public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                        return;
                    }
                    gvi.b(str2);
                    gur.a(LauncherRuntime.g, eVar, dVar);
                }
            });
        }
    }

    @Override // com.taobao.android.launcher.common.g
    public void b(String str, g.a<String> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b680d346", new Object[]{this, str, aVar});
        } else if (aVar == null) {
        } else {
            final String str2 = "m-custom-" + str + "-async";
            gsl.b("Sche-LifeCycle", "onScheduleCustomizedStageAsync: " + str, new Object[0]);
            gvi.a(str2);
            com.taobao.android.job.core.e<String, Void> d = d(str2);
            aVar.a(j.a((com.taobao.android.job.core.e) d));
            a(d, new gtl<String, Void>() { // from class: tb.guv.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.gtl
                public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                        return;
                    }
                    gvi.b(str2);
                    gur.a(LauncherRuntime.g, eVar, dVar);
                }
            });
        }
    }

    @Override // com.taobao.android.launcher.common.e
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        gsl.b("Sche-LifeCycle", "onUIDemandStageExecute", new Object[0]);
        gvi.a("m-u-d");
        com.taobao.android.job.core.e<String, Void> c2 = c("m-u-d");
        this.f28443a.A(j.a((com.taobao.android.job.core.e) c2));
        b(c2, 0L, TimeUnit.MILLISECONDS, new gtl<String, Void>() { // from class: tb.guv.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-u-d");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }

    @Override // com.taobao.android.launcher.common.f
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        gsl.b("Sche-LifeCycle", "onFirstActivityCreated", new Object[0]);
        gvi.a("m-f-a");
        com.taobao.android.job.core.e<String, Void> b_ = b_("m-f-a");
        this.f28443a.f(j.a((com.taobao.android.job.core.e) b_));
        b(b_, new gtl<String, Void>() { // from class: tb.guv.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-f-a");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }

    @Override // com.taobao.android.launcher.common.f
    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            return;
        }
        gsl.b("Sche-LifeCycle", "onSchemaWaked", new Object[0]);
        gvi.a("m-s-w");
        com.taobao.android.job.core.e<String, Void> b_ = b_("m-s-w");
        this.f28443a.t(j.a((com.taobao.android.job.core.e) b_));
        b(b_, new gtl<String, Void>() { // from class: tb.guv.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-s-w");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }

    @Override // com.taobao.android.launcher.common.f
    public void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{this, activity});
            return;
        }
        this.d = true;
        gsl.b("Sche-LifeCycle", "onForeground", new Object[0]);
        gvi.a("m-f");
        com.taobao.android.job.core.e<String, Void> b = b("m-f");
        this.f28443a.l(j.a((com.taobao.android.job.core.e) b));
        a(b, 200L, TimeUnit.MILLISECONDS, new gtl<String, Void>() { // from class: tb.guv.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-f");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }

    @Override // com.taobao.android.launcher.common.f
    public void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27d57fd", new Object[]{this, activity});
            return;
        }
        gsl.b("Sche-LifeCycle", "onBackground", new Object[0]);
        gvi.a("m-b");
        com.taobao.android.job.core.e<String, Void> b = b("m-b");
        this.f28443a.g(j.a((com.taobao.android.job.core.e) b));
        a(b, 200L, TimeUnit.MILLISECONDS, new gtl<String, Void>() { // from class: tb.guv.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-b");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }

    @Override // com.taobao.android.launcher.common.e
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        gsl.b("Sche-LifeCycle", "onBackgroundDeepIdle", new Object[0]);
        com.taobao.android.job.core.e<String, Void> c2 = c("m-b-d-i");
        this.f28443a.h(j.a((com.taobao.android.job.core.e) c2));
        gvi.a("m-b-d-i");
        b(c2, 200L, TimeUnit.MILLISECONDS, new gtl<String, Void>() { // from class: tb.guv.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-b-d-i");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }

    @Override // com.taobao.android.launcher.common.f
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        gsl.b("Sche-LifeCycle", "onBootFinished", new Object[0]);
        if (gvu.a("m-b-f")) {
            return;
        }
        gvi.a("m-launched");
        com.taobao.android.job.core.e<String, Void> c2 = c("m-launched");
        this.f28443a.i(j.a((com.taobao.android.job.core.e) c2));
        b(c2, 500L, TimeUnit.MILLISECONDS, new gtl<String, Void>() { // from class: tb.guv.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gsl.b("Sche-LifeCycle", "onAppLaunched", new Object[0]);
                gvi.b("m-launched");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
        guh.a("bfn", new Runnable() { // from class: tb.guv.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                gvi.a("m-b-f");
                com.taobao.android.job.core.e a2 = guv.a(guv.this, "m-b-f");
                guv.a(guv.this).j(j.a(a2));
                guv.a(guv.this, a2, 200L, TimeUnit.MILLISECONDS, new gtl<String, Void>() { // from class: tb.guv.20.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.gtl
                    public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                            return;
                        }
                        gsl.b("Sche-LifeCycle", "onBootFinishIdle", new Object[0]);
                        gvi.b("m-b-f");
                        guh.a("bootFinish", guv.this);
                        gur.a(LauncherRuntime.g, eVar, dVar);
                    }
                });
            }
        });
    }

    @Override // tb.guj
    public com.taobao.android.job.core.e<String, Void> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.job.core.e) ipChange.ipc$dispatch("deda5e09", new Object[]{this, str}) : c(str);
    }

    @Override // tb.guj
    public Future<d> a_(com.taobao.android.job.core.e<String, Void> eVar, long j, TimeUnit timeUnit, gtl<String, Void> gtlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("241eb0dd", new Object[]{this, eVar, new Long(j), timeUnit, gtlVar}) : b(eVar, j, timeUnit, gtlVar);
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        this.d = true;
        this.b.run();
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            p();
        }
    }

    @Override // com.taobao.android.launcher.common.f
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        gsl.b("Sche-LifeCycle", "onColdLogin", new Object[0]);
        gvi.a("m-c-l");
        com.taobao.android.job.core.e<String, Void> b = b("m-c-l");
        this.f28443a.k(j.a((com.taobao.android.job.core.e) b));
        a(b, 200L, TimeUnit.MILLISECONDS, new gtl<String, Void>() { // from class: tb.guv.21
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-c-l");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }

    @Override // com.taobao.android.launcher.common.f
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        gsl.b("Sche-LifeCycle", "onLogin", new Object[0]);
        gvi.a("m-l-i");
        com.taobao.android.job.core.e<String, Void> b = b("m-l-i");
        this.f28443a.r(j.a((com.taobao.android.job.core.e) b));
        a(b, 200L, TimeUnit.MILLISECONDS, new gtl<String, Void>() { // from class: tb.guv.22
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-l-i");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }

    @Override // com.taobao.android.launcher.common.f
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        gsl.b("Sche-LifeCycle", "onLogout", new Object[0]);
        gvi.a("m-l-o");
        com.taobao.android.job.core.e<String, Void> b = b("m-l-o");
        this.f28443a.s(j.a((com.taobao.android.job.core.e) b));
        a(b, 200L, TimeUnit.MILLISECONDS, new gtl<String, Void>() { // from class: tb.guv.17
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gtl
            public void a(com.taobao.android.job.core.e<String, Void> eVar, d dVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d5228c09", new Object[]{this, eVar, dVar});
                    return;
                }
                gvi.b("m-l-o");
                gur.a(LauncherRuntime.g, eVar, dVar);
            }
        });
    }

    @Override // tb.gte.a
    public boolean a(gtf gtfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eaea1b23", new Object[]{this, gtfVar})).booleanValue();
        }
        if (!this.d) {
            return false;
        }
        gtfVar.f28438a = 1;
        gtfVar.b = c;
        gtfVar.c = 10;
        return true;
    }
}
