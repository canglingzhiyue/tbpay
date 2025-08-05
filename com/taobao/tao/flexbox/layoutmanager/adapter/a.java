package com.taobao.tao.flexbox.layoutmanager.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.adapter.impl.LiteTaoApplicationImpl;
import com.taobao.android.layoutmanager.adapter.impl.aa;
import com.taobao.android.layoutmanager.adapter.impl.ac;
import com.taobao.android.layoutmanager.adapter.impl.ad;
import com.taobao.android.layoutmanager.adapter.impl.t;
import com.taobao.android.layoutmanager.adapter.impl.w;
import com.taobao.android.layoutmanager.adapter.impl.x;
import com.taobao.android.layoutmanager.adapter.impl.y;
import com.taobao.android.layoutmanager.container.PageRenderIntercept;
import com.taobao.android.layoutmanager.container.h;
import com.taobao.android.layoutmanager.module.BehaviXModule;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IFestival;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ILogin;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IStorage;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.b;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.f;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.i;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.k;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.l;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.m;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.n;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.o;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.p;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.q;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.r;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.s;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.u;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.v;
import com.taobao.tao.flexbox.layoutmanager.container.j;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager;
import tb.kge;
import tb.oef;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private p A;
    private j B;

    /* renamed from: a  reason: collision with root package name */
    private ImageLoader f19966a;
    private u b;
    private m c;
    private ILogin d;
    private com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a e;
    private d f;
    private k g;
    private i h;
    private IStorage i;
    private c j;
    private q k;
    private com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.j l;
    private f m;
    private b n;
    private IDeviceInfo o;
    private com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d p;
    private g q;
    private e r;
    private com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.c s;
    private IFestival t;
    private s u;
    private v v;
    private n w;
    private r x;
    private o y;
    private l z;

    /* renamed from: com.taobao.tao.flexbox.layoutmanager.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0834a {
        public static final a INSTANCE;

        static {
            kge.a(-672363785);
            INSTANCE = new a();
        }
    }

    static {
        kge.a(-1576687068);
    }

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3773b4a5", new Object[0]) : C0834a.INSTANCE;
    }

    public com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d b() {
        LiteTaoApplicationImpl nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d) ipChange.ipc$dispatch("7d3b7ee2", new Object[]{this});
        }
        if (this.p == null) {
            if (ab.a().getPackageName().equals("com.taobao.litetao")) {
                nVar = new LiteTaoApplicationImpl();
            } else {
                nVar = new com.taobao.android.layoutmanager.adapter.impl.n();
            }
            this.p = (com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d) nVar;
        }
        return this.p;
    }

    public e c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("70cb0342", new Object[]{this});
        }
        if (this.r == null) {
            this.r = new BehaviXModule();
        }
        return this.r;
    }

    public IFestival d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFestival) ipChange.ipc$dispatch("9204f587", new Object[]{this});
        }
        if (this.t == null) {
            this.t = new com.taobao.android.layoutmanager.adapter.impl.s();
        }
        return this.t;
    }

    public s e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("57ea0d76", new Object[]{this});
        }
        if (this.u == null) {
            this.u = new x();
        }
        return this.u;
    }

    public n f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("4b79911c", new Object[]{this});
        }
        if (this.w == null) {
            this.w = new h();
        }
        return this.w;
    }

    public ILogin g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILogin) ipChange.ipc$dispatch("b11729cb", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new t();
        }
        return this.d;
    }

    @Deprecated
    public ImageLoader h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoader) ipChange.ipc$dispatch("b0e539e", new Object[]{this});
        }
        if (this.f19966a == null) {
            this.f19966a = new com.taobao.android.layoutmanager.adapter.impl.k();
        }
        return this.f19966a;
    }

    public ImageLoader i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageLoader) ipChange.ipc$dispatch("d21a3a9f", new Object[]{this}) : h().a();
    }

    public NotifyManager.g a(NotifyManager.h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NotifyManager.g) ipChange.ipc$dispatch("29be9bef", new Object[]{this, hVar}) : j().a(hVar);
    }

    public v j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v) ipChange.ipc$dispatch("19b7a318", new Object[]{this});
        }
        if (this.v == null) {
            this.v = new ad();
        }
        return this.v;
    }

    public u k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("d47273a", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new ac();
        }
        return this.b;
    }

    public m l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("d6aa83", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new com.taobao.android.layoutmanager.adapter.impl.u();
        }
        return this.c;
    }

    public k m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("f4662e86", new Object[]{this});
        }
        if (this.g == null) {
            this.g = new com.taobao.android.layoutmanager.adapter.impl.f();
        }
        return this.g;
    }

    public com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.a) ipChange.ipc$dispatch("e7f5b191", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new com.taobao.android.layoutmanager.adapter.impl.d();
        }
        return this.e;
    }

    public d o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("b94c2634", new Object[]{this});
        }
        if (this.f == null) {
            this.f = new com.taobao.android.layoutmanager.adapter.impl.j();
        }
        return this.f;
    }

    public i p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("cf14bb0b", new Object[]{this});
        }
        if (this.h == null) {
            this.h = new com.taobao.android.layoutmanager.adapter.impl.q();
        }
        return this.h;
    }

    public IStorage q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IStorage) ipChange.ipc$dispatch("ee7f6cef", new Object[]{this});
        }
        if (this.i == null) {
            this.i = new y();
        }
        return this.i;
    }

    public c r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("42d5f532", new Object[]{this});
        }
        if (this.j == null) {
            this.j = new com.taobao.android.layoutmanager.adapter.impl.e();
        }
        return this.j;
    }

    public q s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("a9c348c6", new Object[]{this});
        }
        if (this.k == null) {
            this.k = new w();
        }
        return this.k;
    }

    public com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.j t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.j) ipChange.ipc$dispatch("9d52cc2e", new Object[]{this});
        }
        if (this.l == null) {
            this.l = new oef();
        }
        return this.l;
    }

    public f u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("90e24ff3", new Object[]{this});
        }
        if (this.m == null) {
            this.m = new com.taobao.android.layoutmanager.adapter.impl.i();
        }
        return this.m;
    }

    public b v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8471d3b8", new Object[]{this});
        }
        if (this.n == null) {
            this.n = new com.taobao.android.layoutmanager.adapter.impl.a();
        }
        return this.n;
    }

    public IDeviceInfo w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDeviceInfo) ipChange.ipc$dispatch("ab1e6c6e", new Object[]{this});
        }
        if (this.o == null) {
            this.o = new com.taobao.android.layoutmanager.adapter.impl.p();
        }
        return this.o;
    }

    public g x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("6b90dcd5", new Object[]{this});
        }
        if (this.q == null) {
            this.q = new com.taobao.android.layoutmanager.adapter.impl.o();
        }
        return this.q;
    }

    public com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.c y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.c) ipChange.ipc$dispatch("5f20609a", new Object[]{this});
        }
        if (this.s == null) {
            this.s = new com.taobao.android.layoutmanager.adapter.impl.c();
        }
        return this.s;
    }

    public r z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("52afe6ac", new Object[]{this});
        }
        if (this.x == null) {
            this.x = new aa();
        }
        return this.x;
    }

    public o A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("17bb73d6", new Object[]{this});
        }
        if (this.y == null) {
            this.y = new com.taobao.android.layoutmanager.container.g();
        }
        return this.y;
    }

    public l B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("b4af7ba", new Object[]{this});
        }
        if (this.z == null) {
            this.z = new com.taobao.android.layoutmanager.adapter.impl.h();
        }
        return this.z;
    }

    public p C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("feda7c77", new Object[]{this});
        }
        if (this.A == null) {
            synchronized (a.class) {
                if (this.A == null) {
                    this.A = new com.taobao.android.layoutmanager.adapter.impl.v();
                }
            }
        }
        return this.A;
    }

    public j D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("7c4f0087", new Object[]{this});
        }
        if (this.B == null) {
            synchronized (a.class) {
                if (this.B == null) {
                    this.B = new PageRenderIntercept();
                }
            }
        }
        return this.B;
    }
}
