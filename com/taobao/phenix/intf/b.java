package com.taobao.phenix.intf;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.cache.memory.MemoryCacheProducer;
import com.taobao.rxm.schedule.k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.nic;
import tb.nie;
import tb.nif;
import tb.nig;
import tb.nih;
import tb.nii;
import tb.nij;
import tb.nik;
import tb.nil;
import tb.nio;
import tb.nip;
import tb.nis;
import tb.niw;
import tb.njf;
import tb.nji;
import tb.njk;
import tb.njl;
import tb.nmr;

/* loaded from: classes.dex */
public class b implements nif {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18927a;
    private static volatile b b;
    private Context l;
    private boolean m;
    private com.taobao.phenix.cache.a p;
    private com.taobao.phenix.decode.b q;
    private com.taobao.phenix.request.a r;
    private njl s;
    private boolean t;
    private List<nji> u;
    private nis v;
    private nio w;
    private boolean x = false;
    private boolean y = false;
    private boolean z = false;
    private boolean A = false;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private boolean G = false;
    private boolean H = false;
    private boolean I = false;
    private boolean J = false;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private boolean N = false;
    private boolean n = true;
    private boolean o = true;
    private final nik c = new nik();
    private final nic d = new nic();
    private final nig e = new nig();
    private final nie f = new nie();
    private final nii g = new nii();
    private final nij h = new nij();
    private final nil i = new nil();
    private final nip k = new nip(this);
    private final nih j = new nih();

    public static b h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("71cd7d00", new Object[0]);
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    static {
        kge.a(1123615196);
        kge.a(1796479737);
        f18927a = false;
    }

    private b() {
    }

    public nip i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nip) ipChange.ipc$dispatch("4c9568a1", new Object[]{this}) : this.k;
    }

    public k j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("6e6b4314", new Object[]{this}) : this.k.a();
    }

    public synchronized nis k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nis) ipChange.ipc$dispatch("5bf8b3bc", new Object[]{this});
        }
        if (this.v == null) {
            this.v = new nis(this);
        }
        if (this.m) {
            this.v.b();
        }
        return this.v;
    }

    public com.taobao.phenix.cache.a l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.phenix.cache.a) ipChange.ipc$dispatch("dfbed25c", new Object[]{this}) : this.p;
    }

    public com.taobao.phenix.request.a m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.phenix.request.a) ipChange.ipc$dispatch("6c52faf0", new Object[]{this}) : this.r;
    }

    @Override // tb.nif
    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.t;
    }

    public Context n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("8ea2aded", new Object[]{this}) : this.l;
    }

    public com.taobao.phenix.decode.b o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.phenix.decode.b) ipChange.ipc$dispatch("f0710562", new Object[]{this}) : this.q;
    }

    public void a(com.taobao.phenix.request.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71689964", new Object[]{this, aVar});
            return;
        }
        this.r = aVar;
        niw.b("Initialize", "setup image flow monitor=%s", aVar);
    }

    public void a(njl njlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f651d6a8", new Object[]{this, njlVar});
        } else {
            this.s = njlVar;
        }
    }

    public void a(com.taobao.phenix.decode.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b25bea", new Object[]{this, bVar});
        } else {
            this.q = bVar;
        }
    }

    public boolean a(nji njiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f650798f", new Object[]{this, njiVar})).booleanValue();
        }
        synchronized (this) {
            if (this.u == null) {
                this.u = new CopyOnWriteArrayList();
            }
        }
        return this.u.add(njiVar);
    }

    public List<nji> p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f4f19870", new Object[]{this}) : this.u;
    }

    @Override // tb.nif
    public nik a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nik) ipChange.ipc$dispatch("f083d0e", new Object[]{this}) : this.c;
    }

    @Override // tb.nif
    public nig b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nig) ipChange.ipc$dispatch("16b9e1f1", new Object[]{this}) : this.e;
    }

    @Override // tb.nif
    public nii d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nii) ipChange.ipc$dispatch("261d2ced", new Object[]{this}) : this.g;
    }

    @Override // tb.nif
    public nil e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nil) ipChange.ipc$dispatch("2dced2a9", new Object[]{this}) : this.i;
    }

    @Override // tb.nif
    public nih f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nih) ipChange.ipc$dispatch("3580778c", new Object[]{this}) : this.j;
    }

    @Override // tb.nif
    public nij c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nij) ipChange.ipc$dispatch("1e6b87ad", new Object[]{this}) : this.h;
    }

    public nie q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nie) ipChange.ipc$dispatch("8a229244", new Object[]{this}) : this.f;
    }

    public nic r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nic) ipChange.ipc$dispatch("91d43765", new Object[]{this}) : this.d;
    }

    public synchronized b a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("74203aaf", new Object[]{this, context});
        }
        com.taobao.tcommon.core.b.a(context, "Phenix with context must not be null.");
        if (this.l == null) {
            this.l = context.getApplicationContext();
        }
        return this;
    }

    public synchronized void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        com.taobao.tcommon.core.b.a(this.l, "Phenix.with(Context) hasn't been called before chain producer building");
        this.k.b();
        this.m = true;
        niw.b("Initialize", "Phenix chain producer build complete", new Object[0]);
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.o;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.n;
    }

    public b a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("47d69123", new Object[]{this, new Boolean(z)});
        }
        this.n = z;
        return this;
    }

    private njk c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njk) ipChange.ipc$dispatch("7dcc4103", new Object[]{this, str});
        }
        njl njlVar = this.s;
        if (njlVar == null) {
            return null;
        }
        return njlVar.a(str);
    }

    private njk d(String str) {
        njk a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njk) ipChange.ipc$dispatch("7e78eca2", new Object[]{this, str});
        }
        if (this.s != null) {
            if (!L() && StringUtils.equals("trade-module", str)) {
                a2 = this.s.a("common");
            } else {
                a2 = this.s.a(str);
            }
            if (a2 != null) {
                return a2;
            }
            throw new RuntimeException("preload module[" + str + "] strategy hasn't been registered, please contact zhaomi.zm@alibaba-inc.com");
        }
        return new njk("common", 2, 17, 17, false, true);
    }

    public PhenixCreator a(String str, String str2, com.taobao.phenix.cache.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PhenixCreator) ipChange.ipc$dispatch("f4bea978", new Object[]{this, str, str2, aVar}) : new PhenixCreator(c(str), str2, aVar);
    }

    public PhenixCreator a(String str, com.taobao.phenix.cache.a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PhenixCreator) ipChange.ipc$dispatch("5cb82e", new Object[]{this, str, aVar}) : a(null, str, aVar);
    }

    public PhenixCreator a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PhenixCreator) ipChange.ipc$dispatch("9dc9a159", new Object[]{this, str, str2}) : a(str, str2, h().l());
    }

    public PhenixCreator a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PhenixCreator) ipChange.ipc$dispatch("9114fc63", new Object[]{this, str}) : a(null, str, h().l());
    }

    public d a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("2227bb8a", new Object[]{this, str, list}) : new d(d(str), list);
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else if (this.m) {
            this.c.b().f();
            for (com.taobao.phenix.cache.disk.b bVar : this.e.a().a()) {
                if (bVar.a(this.l)) {
                    bVar.a();
                }
            }
            niw.c("UserAction", "clear all phenix cache", new Object[0]);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        nip nipVar = this.k;
        if (nipVar == null) {
            return;
        }
        nipVar.a(z);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        nip nipVar = this.k;
        if (nipVar == null) {
            return;
        }
        nipVar.b(z);
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else {
            this.B = z;
        }
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : this.B;
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else {
            this.C = z;
        }
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : this.C;
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else {
            this.D = z;
        }
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : this.D;
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
        } else {
            this.z = z;
        }
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : this.z;
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue() : this.A;
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
        } else {
            this.E = z;
        }
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue() : this.E;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : this.F;
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
        } else {
            this.F = z;
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be50d37f", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue() : this.G;
    }

    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c005ac1e", new Object[]{this, new Boolean(z)});
        } else {
            this.H = z;
        }
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue() : this.H;
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba84bd", new Object[]{this, new Boolean(z)});
        } else {
            this.I = z;
        }
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue() : this.I;
    }

    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36f5d5c", new Object[]{this, new Boolean(z)});
        } else {
            this.J = z;
        }
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : this.J;
    }

    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52435fb", new Object[]{this, new Boolean(z)});
        } else {
            this.K = z;
        }
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : this.K;
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d90e9a", new Object[]{this, new Boolean(z)});
        } else {
            this.L = z;
        }
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue() : this.L;
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue() : this.M;
    }

    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88de739", new Object[]{this, new Boolean(z)});
        } else {
            this.M = z;
        }
    }

    public void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca42bfd8", new Object[]{this, new Boolean(z)});
        } else {
            this.N = z;
        }
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue() : this.N;
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d7103", new Object[]{this, new Boolean(z)});
        } else {
            com.taobao.phenix.loader.file.a.a(z);
        }
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93249a2", new Object[]{this, new Boolean(z)});
        } else {
            this.x = z;
        }
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue() : this.x;
    }

    @Deprecated
    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e4ca40", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            cVar.b();
        }
    }

    @Deprecated
    public BitmapDrawable e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("7524e715", new Object[]{this, str});
        }
        if (this.m) {
            return MemoryCacheProducer.a(a().b(), new com.taobao.phenix.request.b(str, this.p, this.t).u(), false);
        }
        return null;
    }

    public njf a(String str, String str2, int i, boolean z) {
        String w;
        int x;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (njf) ipChange.ipc$dispatch("16cc64f", new Object[]{this, str, str2, new Integer(i), new Boolean(z)});
        }
        com.taobao.tcommon.core.b.a(!com.taobao.tcommon.core.c.a(), "fetchDiskCache must be called in non-main thread");
        njf njfVar = null;
        if (!this.m) {
            return null;
        }
        if (z) {
            w = str2;
            x = i;
        } else {
            com.taobao.phenix.request.b bVar = new com.taobao.phenix.request.b(str2, this.p, this.t);
            if (bVar.y().h()) {
                return null;
            }
            w = bVar.w();
            x = bVar.x();
        }
        int i2 = 17;
        njk c = c(str);
        if (c != null) {
            i2 = c.d;
        }
        com.taobao.phenix.cache.disk.b a2 = b().a().a(i2);
        if (a2 != null && a2.a(this.l)) {
            njfVar = a2.a(w, x);
        }
        Object[] objArr = new Object[4];
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Boolean.valueOf(z);
        if (njfVar != null) {
            z2 = true;
        }
        objArr[3] = Boolean.valueOf(z2);
        niw.a("UserAction", str2, "fetch disk cache, module=%s, catalog=%d, direct=%b, result=%B", objArr);
        return njfVar;
    }

    public nio D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nio) ipChange.ipc$dispatch("2fe881c7", new Object[]{this}) : this.w;
    }

    public void a(nio nioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6451c44", new Object[]{this, nioVar});
        } else {
            this.w = nioVar;
        }
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
            return;
        }
        niw.d("Phenix", "startLimit " + str + ", " + i, new Object[0]);
        nmr.a(str, i);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        niw.d("Phenix", "stopLimit " + str, new Object[0]);
        nmr.a(str);
    }
}
