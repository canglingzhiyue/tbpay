package com.etao.feimagesearch.pipline;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.pipline.b;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.crj;
import tb.crk;
import tb.crl;
import tb.crm;
import tb.crq;
import tb.jex;
import tb.kge;

/* loaded from: classes3.dex */
public final class a implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0243a Companion;

    /* renamed from: a  reason: collision with root package name */
    private volatile AtomicReference<crj> f6929a;
    private volatile crj b;
    private volatile boolean c;
    private final AtomicLong d;
    private final com.etao.feimagesearch.pipline.b e;
    private volatile crq f;

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ crm b;
        public final /* synthetic */ crj c;

        public b(crm crmVar, crj crjVar) {
            this.b = crmVar;
            this.c = crjVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            crl mo2427invoke = this.b.a().mo2427invoke();
            if (mo2427invoke instanceof crk) {
                return;
            }
            a.a(a.this).a(mo2427invoke);
            a.this.a().set(this.c);
            a.a(a.this, false);
            a.this.a(false);
        }
    }

    static {
        kge.a(-106194010);
        kge.a(-1390502639);
        Companion = new C0243a(null);
    }

    @JvmStatic
    public static final crj a(crj crjVar, crj crjVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (crj) ipChange.ipc$dispatch("b5789af9", new Object[]{crjVar, crjVar2}) : Companion.a(crjVar, crjVar2);
    }

    public a(crq pipLineDS) {
        q.c(pipLineDS, "pipLineDS");
        this.f = pipLineDS;
        this.f6929a = new AtomicReference<>();
        this.d = new AtomicLong(-1L);
        this.e = new com.etao.feimagesearch.pipline.b();
    }

    public static final /* synthetic */ com.etao.feimagesearch.pipline.b a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.etao.feimagesearch.pipline.b) ipChange.ipc$dispatch("4145416d", new Object[]{aVar}) : aVar.e;
    }

    public static final /* synthetic */ void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1df3beb", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.c = z;
        }
    }

    public final crq d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (crq) ipChange.ipc$dispatch("26184f99", new Object[]{this}) : this.f;
    }

    /* renamed from: com.etao.feimagesearch.pipline.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0243a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1576947858);
        }

        private C0243a() {
        }

        public /* synthetic */ C0243a(o oVar) {
            this();
        }

        @JvmStatic
        public final crj a(crj crjVar, crj curNode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (crj) ipChange.ipc$dispatch("b5789af9", new Object[]{this, crjVar, curNode});
            }
            q.c(curNode, "curNode");
            if (crjVar == null) {
                return curNode;
            }
            crjVar.a(curNode);
            return curNode;
        }
    }

    public final AtomicReference<crj> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicReference) ipChange.ipc$dispatch("c151fa5", new Object[]{this}) : this.f6929a;
    }

    public final void a(crj crjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8fbb57", new Object[]{this, crjVar, new Boolean(z)});
        } else if (crjVar == null) {
        } else {
            this.b = crjVar;
            if (!z) {
                return;
            }
            b();
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.c || this.b == null) {
            return false;
        }
        this.f6929a.set(this.b);
        return b(true);
    }

    public final boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (this.c) {
            return false;
        }
        if (this.f6929a.get() == null) {
            if (this.b == null) {
                return false;
            }
            this.f6929a.set(this.b);
        }
        return b(z);
    }

    public final void a(b.a observable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a7c6a8b", new Object[]{this, observable});
            return;
        }
        q.c(observable, "observable");
        this.e.a(observable);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.e.a();
        }
    }

    private final boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            c.a(this);
        } else {
            run();
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        crj crjVar = this.f6929a.get();
        if (crjVar == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.d.set(currentTimeMillis);
        while (crjVar != null && a(currentTimeMillis)) {
            crl a2 = crjVar.a(this.f);
            if (!a(currentTimeMillis)) {
                break;
            }
            this.e.a(a2);
            if (a2 instanceof crm) {
                a((crm) a2, crjVar.c());
                crjVar = crjVar.c();
            } else if (a2 instanceof jex) {
                ((jex) a2).a(this.e);
                crjVar = crjVar.c();
            } else if (!a2.d() && a2.f()) {
                break;
            } else {
                crjVar = crjVar.c();
            }
        }
        if (!a(currentTimeMillis)) {
            return;
        }
        this.f6929a.set(crjVar);
        this.c = false;
    }

    private final boolean a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue() : j == this.d.get();
    }

    private final void a(crm crmVar, crj crjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e35b4ef", new Object[]{this, crmVar, crjVar});
        } else if (crjVar == null) {
        } else {
            c.a(new b(crmVar, crjVar));
        }
    }
}
