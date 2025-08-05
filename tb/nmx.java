package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.rxm.request.c;
import com.taobao.rxm.schedule.f;
import com.taobao.rxm.schedule.g;
import com.taobao.rxm.schedule.i;
import com.taobao.rxm.schedule.j;
import tb.nmq;

/* loaded from: classes.dex */
public abstract class nmx<OUT, NEXT_OUT extends nmq, CONTEXT extends c> extends nmy<OUT, NEXT_OUT, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private i f31581a;
    private nmw<OUT, NEXT_OUT, CONTEXT> b;

    public static /* synthetic */ Object ipc$super(nmx nmxVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void a(nmv<OUT, CONTEXT> nmvVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d994daff", new Object[]{this, nmvVar, new Float(f)});
        }
    }

    public void a(nmv<OUT, CONTEXT> nmvVar, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf951b4", new Object[]{this, nmvVar, th});
        }
    }

    public void a(nmv<OUT, CONTEXT> nmvVar, boolean z, NEXT_OUT next_out) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a09441b1", new Object[]{this, nmvVar, new Boolean(z), next_out});
        }
    }

    public void c(nmv<OUT, CONTEXT> nmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d386b5e3", new Object[]{this, nmvVar});
        }
    }

    public static /* synthetic */ void a(nmx nmxVar, nmv nmvVar, f fVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1c37277", new Object[]{nmxVar, nmvVar, fVar, gVar});
        } else {
            nmxVar.a(nmvVar, fVar, gVar);
        }
    }

    public nmx(int i, int i2) {
        this(null, i, i2);
    }

    public nmx(String str, int i, int i2) {
        super(str, i, i2);
        this.f31581a = new i();
        this.b = new nmw<>();
    }

    @Override // tb.nmy
    public void a(j jVar, nmv<OUT, CONTEXT> nmvVar, f<NEXT_OUT> fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847a70e1", new Object[]{this, jVar, nmvVar, fVar, new Boolean(z)});
        } else if (jVar != null && (!z || !jVar.b() || !com.taobao.tcommon.core.c.a())) {
            g a2 = this.f31581a.a();
            if (a2 == null) {
                a2 = new g(nmvVar.e().I(), nmvVar, fVar, z) { // from class: tb.nmx.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.rxm.schedule.g
                    public void a(nmv nmvVar2, f fVar2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d6a83457", new Object[]{this, nmvVar2, fVar2});
                        } else {
                            nmx.a(nmx.this, nmvVar2, fVar2, this);
                        }
                    }
                };
                a2.a(this.f31581a);
            } else {
                a2.a(nmvVar.e().I(), nmvVar, fVar, z);
            }
            jVar.a(a2);
        } else {
            a(nmvVar, fVar, (g) null);
        }
    }

    private void a(nmv<OUT, CONTEXT> nmvVar, f<NEXT_OUT> fVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("957ba380", new Object[]{this, nmvVar, fVar, gVar});
        } else if (fVar == null) {
            if (nmvVar.e().K()) {
                qol.f("RxSysLog", "[ChainProducer] ID=%d cancelled before conducting result, producer=%s type=%s", Integer.valueOf(nmvVar.e().H()), j(), nmz.a(c()));
                nmvVar.d();
            } else if (a(nmvVar, gVar) || c() != 1) {
            } else {
                f(nmvVar);
            }
        } else {
            int i = fVar.f19010a;
            if (i == 1) {
                a((nmv) nmvVar, fVar.b, (boolean) fVar.c);
            } else if (i == 4) {
                a(nmvVar, fVar.d);
            } else if (i == 8) {
                c(nmvVar);
            } else if (i != 16) {
            } else {
                a(nmvVar, fVar.e);
            }
        }
    }

    @Override // tb.nna
    public void b(nmv<OUT, CONTEXT> nmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e503af62", new Object[]{this, nmvVar});
        } else if (nmvVar.e().K()) {
            qol.f("RxSysLog", "[ChainProducer] ID=%d cancelled before leading to produce result, producer=%s type=%s", Integer.valueOf(nmvVar.e().H()), j(), nmz.a(c()));
            nmvVar.d();
        } else if (c() != 0) {
            a(e(), nmvVar, (f) null);
        } else {
            f(nmvVar);
        }
    }

    private void f(nmv<OUT, CONTEXT> nmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0fc966", new Object[]{this, nmvVar});
        } else if (i() != null) {
            i().b(g(nmvVar).a(f()));
        } else {
            throw new RuntimeException(j() + " can't conduct result while no next producer");
        }
    }

    @Override // tb.nmy
    public nmw<OUT, NEXT_OUT, CONTEXT> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nmw) ipChange.ipc$dispatch("f084d86", new Object[]{this}) : this.b;
    }

    private nmt<OUT, NEXT_OUT, CONTEXT> g(nmv<OUT, CONTEXT> nmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmt) ipChange.ipc$dispatch("cd31ccca", new Object[]{this, nmvVar});
        }
        nmt<OUT, NEXT_OUT, CONTEXT> a2 = a().a();
        return a2 != null ? a2.a(nmvVar, this) : new nmt<>(nmvVar, this);
    }
}
