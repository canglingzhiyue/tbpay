package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.rxm.request.c;
import com.taobao.rxm.schedule.f;
import com.taobao.rxm.schedule.g;
import com.taobao.rxm.schedule.i;
import com.taobao.rxm.schedule.j;
import com.taobao.tcommon.core.b;

/* loaded from: classes7.dex */
public abstract class nms<OUT, CONTEXT extends c> implements nmv<OUT, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CONTEXT f31576a;
    public boolean b;
    private j c;
    private final i d;

    public abstract void a();

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        }
    }

    public abstract void a(OUT out, boolean z);

    public abstract void a(Throwable th);

    public static /* synthetic */ void a(nms nmsVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97eddb94", new Object[]{nmsVar, fVar});
        } else {
            nmsVar.b(fVar);
        }
    }

    @Override // tb.nmv
    public /* synthetic */ Object e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d74af246", new Object[]{this}) : b();
    }

    public nms(CONTEXT context) {
        b.a(context);
        this.f31576a = context;
        this.d = new i();
    }

    public CONTEXT b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CONTEXT) ipChange.ipc$dispatch("7be85dd4", new Object[]{this}) : this.f31576a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        j jVar = this.c;
        return jVar != null && (!jVar.b() || !com.taobao.tcommon.core.c.a());
    }

    private void a(f<OUT> fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b57470", new Object[]{this, fVar});
        } else if (c()) {
            g a2 = this.d.a();
            if (a2 == null) {
                a2 = new g(b().I(), this, fVar) { // from class: tb.nms.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.rxm.schedule.g
                    public void a(nmv nmvVar, f fVar2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d6a83457", new Object[]{this, nmvVar, fVar2});
                        } else {
                            nms.a(nms.this, fVar2);
                        }
                    }
                };
                a2.a(this.d);
            } else {
                a2.a(b().I(), this, fVar);
            }
            this.c.a(a2);
        } else {
            b(fVar);
        }
    }

    private void b(f<OUT> fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8be5b44f", new Object[]{this, fVar});
            return;
        }
        try {
            if (8 != fVar.f19010a && !this.f31576a.L()) {
                int i = fVar.f19010a;
                if (i == 1) {
                    a((nms<OUT, CONTEXT>) fVar.c, fVar.b);
                    return;
                } else if (i == 4) {
                    a(fVar.d);
                    return;
                } else if (i != 16) {
                    return;
                } else {
                    a(fVar.e);
                    return;
                }
            }
            a();
        } catch (Exception e) {
            a(e);
        }
    }

    @Override // tb.nmv
    public synchronized void b(OUT out, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7f77ef", new Object[]{this, out, new Boolean(z)});
        } else if (this.b) {
        } else {
            if (this.f31576a.L()) {
                d();
                return;
            }
            this.b = z;
            f<OUT> fVar = new f<>(1, this.b);
            fVar.c = out;
            a(fVar);
        }
    }

    @Override // tb.nmv
    public synchronized void b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd742bac", new Object[]{this, th});
        } else if (this.b) {
        } else {
            if (this.f31576a.L()) {
                d();
                return;
            }
            this.b = true;
            f<OUT> fVar = new f<>(16, true);
            fVar.e = th;
            a(fVar);
        }
    }

    @Override // tb.nmv
    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.b) {
        } else {
            this.b = true;
            a(new f<>(8, true));
        }
    }

    @Override // tb.nmv
    public synchronized void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else if (this.b) {
        } else {
            f<OUT> fVar = new f<>(4, false);
            fVar.d = f;
            a(fVar);
        }
    }

    public void a(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd91d31e", new Object[]{this, exc});
        } else {
            qol.h("RxSysLog", "UnhandledException when BaseConsumer dispatch result: %s", Log.getStackTraceString(exc));
        }
    }

    public nmv<OUT, CONTEXT> a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmv) ipChange.ipc$dispatch("b8a27763", new Object[]{this, jVar});
        }
        this.c = jVar;
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return com.taobao.tcommon.core.c.a(getClass()) + "[cxt-id:" + b().H() + riy.ARRAY_END_STR;
    }
}
