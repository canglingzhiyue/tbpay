package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.snr;

/* loaded from: classes5.dex */
public final class snk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final boolean b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f33728a = false;
    private final psw c;
    private final a d;
    private boolean e;
    private boolean f;
    private boolean g;
    private snr h;

    public static /* synthetic */ void a(snk snkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff11fb68", new Object[]{snkVar});
        } else {
            snkVar.j();
        }
    }

    public static /* synthetic */ void b(snk snkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9501e9", new Object[]{snkVar});
        } else {
            snkVar.k();
        }
    }

    public static /* synthetic */ psw c(snk snkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psw) ipChange.ipc$dispatch("79188a88", new Object[]{snkVar}) : snkVar.c;
    }

    static {
        kge.a(721750949);
        b = obu.a(obu.e());
    }

    public snk(psw pswVar, a aVar, snr.a aVar2) {
        this.c = pswVar;
        this.d = aVar;
        if (sjt.a()) {
            this.h = new snr(this, pswVar, aVar2);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f33728a) {
        } else {
            a.a(this.d, this);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f33728a) {
        } else {
            if (!this.e) {
                if (b) {
                    throw new RuntimeException("appear must after bindData");
                }
            } else if (this.f) {
            } else {
                spz.c("CardLifecyclePerformer", "appear");
                psw pswVar = this.c;
                pswVar.onAppear(pswVar);
                this.f = true;
                if (a.a(this.d) != 0 || a.b(this.d) != null) {
                    return;
                }
                spz.c("CardLifecyclePerformer", "appear to active");
                a();
            }
        }
    }

    public void a(com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8180bd1f", new Object[]{this, aVar, new Integer(i)});
        } else if (this.e) {
            if (b) {
                throw new RuntimeException("bindData repeated");
            }
        } else {
            spz.c("CardLifecyclePerformer", "onBindData");
            psw pswVar = this.c;
            pswVar.onBindData(pswVar, aVar, i);
            this.e = true;
        }
    }

    public void b(com.taobao.android.fluid.framework.data.datamodel.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923689e0", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        try {
            spz.c("CardLifecyclePerformer", "bindDataForce");
            this.c.onBindData(this.c, aVar, i);
            this.e = true;
        } catch (Throwable th) {
            spz.c("CardLifecyclePerformer", "bindDataForce Error" + th.getMessage());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a.b(this.d, this);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.f) {
        } else {
            if (this.g) {
                c();
            }
            spz.c("CardLifecyclePerformer", "disAppear");
            psw pswVar = this.c;
            pswVar.onDisAppear(pswVar);
            this.f = false;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.g;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.e) {
        } else {
            if (this.f) {
                d();
            }
            spz.c("CardLifecyclePerformer", "recycle");
            psw pswVar = this.c;
            pswVar.onRecycle(pswVar);
            this.e = false;
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        snr snrVar = this.h;
        if (snrVar == null) {
            return;
        }
        snrVar.a();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        snr snrVar = this.h;
        if (snrVar == null) {
            return;
        }
        snrVar.b();
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (!this.f) {
            if (b) {
                throw new RuntimeException("active must after appear");
            }
        } else if (this.g) {
            spz.b("CardLifecyclePerformer", "active mIsActive: " + this.c);
        } else {
            h();
            spz.a("CardLifecyclePerformer", "active: " + this.c);
            psw pswVar = this.c;
            pswVar.onActive(pswVar);
            this.g = true;
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (!this.g) {
        } else {
            i();
            spz.a("CardLifecyclePerformer", "disActive: " + this.c);
            psw pswVar = this.c;
            pswVar.onDisActive(pswVar);
            this.g = false;
        }
    }

    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private snk f33729a;
        private int b;
        private snj c;

        static {
            kge.a(1615962844);
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8155b97e", new Object[]{aVar})).intValue() : aVar.b;
        }

        public static /* synthetic */ void a(a aVar, snk snkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cb9758b", new Object[]{aVar, snkVar});
            } else {
                aVar.a(snkVar);
            }
        }

        public static /* synthetic */ snk b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (snk) ipChange.ipc$dispatch("7fcf85ca", new Object[]{aVar}) : aVar.f33729a;
        }

        public static /* synthetic */ void b(a aVar, snk snkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6eb0ecc", new Object[]{aVar, snkVar});
            } else {
                aVar.b(snkVar);
            }
        }

        public void a(snj snjVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff118709", new Object[]{this, snjVar});
            } else {
                this.c = snjVar;
            }
        }

        private void a(snk snkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff11fb68", new Object[]{this, snkVar});
                return;
            }
            this.b++;
            snk snkVar2 = this.f33729a;
            if (snkVar == snkVar2) {
                if (snkVar == null || snkVar.e()) {
                    return;
                }
                snk.a(snkVar);
                return;
            }
            psw pswVar = null;
            if (snkVar2 != null && snkVar2.e()) {
                snk.b(this.f33729a);
            }
            snk snkVar3 = this.f33729a;
            if (snkVar3 != null) {
                pswVar = snk.c(snkVar3);
            }
            if (snkVar != null && !snkVar.e()) {
                snj snjVar = this.c;
                if (snjVar != null) {
                    snjVar.a(snk.c(snkVar), pswVar);
                }
                snk.a(snkVar);
                snj snjVar2 = this.c;
                if (snjVar2 != null) {
                    snjVar2.b(snk.c(snkVar), pswVar);
                }
            }
            this.f33729a = snkVar;
        }

        private void b(snk snkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed9501e9", new Object[]{this, snkVar});
            } else if (snkVar == null) {
            } else {
                snk.b(snkVar);
            }
        }
    }
}
