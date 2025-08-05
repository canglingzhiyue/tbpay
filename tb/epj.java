package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.protocol.adapter.core.IAppAdapter;
import com.taobao.android.detail.datasdk.protocol.adapter.core.ILimitAdapter;
import com.taobao.android.detail.datasdk.protocol.adapter.core.INavAdapter;
import com.taobao.android.detail.datasdk.protocol.adapter.core.IShareAdapter;
import com.taobao.android.detail.datasdk.protocol.adapter.core.c;
import com.taobao.android.detail.datasdk.protocol.adapter.core.d;
import com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter;
import com.taobao.android.detail.datasdk.protocol.adapter.optional.b;

/* loaded from: classes.dex */
public class epj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static IAppAdapter f27507a;
    private static c b;
    private static d c;
    private static INavAdapter d;
    private static IShareAdapter e;
    private static ILimitAdapter f;
    private static com.taobao.android.detail.datasdk.protocol.adapter.core.a g;
    private static b h;
    private static com.taobao.android.detail.datasdk.protocol.adapter.optional.d i;
    private static ITrackAdapter j;
    private static com.taobao.android.detail.datasdk.protocol.adapter.optional.c k;
    private static com.taobao.android.detail.datasdk.protocol.adapter.optional.a l;
    private static com.taobao.android.detail.datasdk.protocol.adapter.core.b m;
    private static a n;
    private com.taobao.android.detail.datasdk.factory.manager.b o;
    private eox p;
    private com.taobao.android.detail.datasdk.factory.manager.a q;
    private epk r;

    /* loaded from: classes4.dex */
    public interface a {
        IAppAdapter a();

        c b();

        d c();

        ILimitAdapter d();

        com.taobao.android.detail.datasdk.protocol.adapter.optional.a e();

        INavAdapter f();

        IShareAdapter g();

        b h();

        com.taobao.android.detail.datasdk.protocol.adapter.optional.d i();

        ITrackAdapter j();

        com.taobao.android.detail.datasdk.protocol.adapter.optional.c k();

        com.taobao.android.detail.datasdk.protocol.adapter.core.b l();

        com.taobao.android.detail.datasdk.factory.manager.b m();

        eox n();

        com.taobao.android.detail.datasdk.factory.manager.a o();

        epk p();

        com.taobao.android.detail.datasdk.protocol.adapter.core.a q();
    }

    static {
        kge.a(-1043994980);
        f27507a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        n = null;
        emu.a("com.taobao.android.detail.datasdk.protocol.adapter.DetailAdapterManager");
    }

    public static IAppAdapter a() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAppAdapter) ipChange.ipc$dispatch("f5542a85", new Object[0]);
        }
        if (f27507a == null && (aVar = n) != null) {
            f27507a = aVar.a();
        }
        return f27507a;
    }

    public static void a(IAppAdapter iAppAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c873c5c5", new Object[]{iAppAdapter});
        } else {
            f27507a = iAppAdapter;
        }
    }

    public static c b() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("714af43a", new Object[0]);
        }
        if (b == null && (aVar = n) != null) {
            b = aVar.b();
        }
        return b;
    }

    public static void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d58551f9", new Object[]{cVar});
        } else {
            b = cVar;
        }
    }

    public static d c() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("64da789a", new Object[0]);
        }
        if (c == null && (aVar = n) != null) {
            c = aVar.c();
        }
        return c;
    }

    public static void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d585c658", new Object[]{dVar});
        } else {
            c = dVar;
        }
    }

    public static ILimitAdapter d() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ILimitAdapter) ipChange.ipc$dispatch("b0168462", new Object[0]);
        }
        if (f == null && (aVar = n) != null) {
            f = aVar.d();
        }
        return f;
    }

    public static com.taobao.android.detail.datasdk.protocol.adapter.optional.a e() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.datasdk.protocol.adapter.optional.a) ipChange.ipc$dispatch("c6d38ede", new Object[0]);
        }
        if (l == null && (aVar = n) != null) {
            l = aVar.e();
        }
        return l;
    }

    public static void a(com.taobao.android.detail.datasdk.protocol.adapter.optional.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11405c1a", new Object[]{aVar});
        } else {
            l = aVar;
        }
    }

    public static INavAdapter f() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INavAdapter) ipChange.ipc$dispatch("9179ba8c", new Object[0]);
        }
        if (d == null && (aVar = n) != null) {
            d = aVar.f();
        }
        return d;
    }

    public static void a(INavAdapter iNavAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0e9a47", new Object[]{iNavAdapter});
        } else {
            d = iNavAdapter;
        }
    }

    public static IShareAdapter g() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IShareAdapter) ipChange.ipc$dispatch("b4dea4c9", new Object[0]);
        }
        if (e == null && (aVar = n) != null) {
            e = aVar.g();
        }
        return e;
    }

    public static void a(IShareAdapter iShareAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf5c743", new Object[]{iShareAdapter});
        } else {
            e = iShareAdapter;
        }
    }

    public static b h() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("5a180240", new Object[0]);
        }
        if (h == null && (aVar = n) != null) {
            h = aVar.h();
        }
        return h;
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1140d079", new Object[]{bVar});
        } else {
            h = bVar;
        }
    }

    public static com.taobao.android.detail.datasdk.protocol.adapter.optional.d i() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.datasdk.protocol.adapter.optional.d) ipChange.ipc$dispatch("35d97e3f", new Object[0]);
        }
        if (i == null && (aVar = n) != null) {
            i = aVar.i();
        }
        return i;
    }

    public static void a(com.taobao.android.detail.datasdk.protocol.adapter.optional.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1141b937", new Object[]{dVar});
        } else {
            i = dVar;
        }
    }

    public static ITrackAdapter j() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITrackAdapter) ipChange.ipc$dispatch("e6220797", new Object[0]);
        }
        if (j == null && (aVar = n) != null) {
            j = aVar.j();
        }
        return j;
    }

    public static void a(ITrackAdapter iTrackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cf22e0e", new Object[]{iTrackAdapter});
        } else {
            j = iTrackAdapter;
        }
    }

    public static com.taobao.android.detail.datasdk.protocol.adapter.optional.c k() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.datasdk.protocol.adapter.optional.c) ipChange.ipc$dispatch("ed5c75a2", new Object[0]);
        }
        if (k == null && (aVar = n) != null) {
            k = aVar.k();
        }
        return k;
    }

    public static void a(com.taobao.android.detail.datasdk.protocol.adapter.optional.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("114144d8", new Object[]{cVar});
        } else {
            k = cVar;
        }
    }

    public com.taobao.android.detail.datasdk.factory.manager.b l() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.datasdk.factory.manager.b) ipChange.ipc$dispatch("d0b85073", new Object[]{this});
        }
        if (this.o == null && (aVar = n) != null) {
            this.o = aVar.m();
        }
        return this.o;
    }

    public void a(com.taobao.android.detail.datasdk.factory.manager.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ab121e8", new Object[]{this, bVar});
        } else {
            this.o = bVar;
        }
    }

    public eox m() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eox) ipChange.ipc$dispatch("6b57fe44", new Object[]{this});
        }
        if (this.p == null && (aVar = n) != null) {
            this.p = aVar.n();
        }
        return this.p;
    }

    public void a(eox eoxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e742230a", new Object[]{this, eoxVar});
        } else {
            this.p = eoxVar;
        }
    }

    public com.taobao.android.detail.datasdk.factory.manager.a n() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.datasdk.factory.manager.a) ipChange.ipc$dispatch("1be06256", new Object[]{this});
        }
        if (this.q == null && (aVar = n) != null) {
            this.q = aVar.o();
        }
        return this.q;
    }

    public void a(com.taobao.android.detail.datasdk.factory.manager.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ab0ad89", new Object[]{this, aVar});
        } else {
            this.q = aVar;
        }
    }

    public epk o() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epk) ipChange.ipc$dispatch("7abb4b30", new Object[]{this});
        }
        if (this.r == null && (aVar = n) != null) {
            this.r = aVar.p();
        }
        return this.r;
    }

    public void a(epk epkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e74a51b8", new Object[]{this, epkVar});
        } else {
            this.r = epkVar;
        }
    }

    public static void a(com.taobao.android.detail.datasdk.protocol.adapter.core.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d584693b", new Object[]{aVar});
        } else {
            g = aVar;
        }
    }

    public static com.taobao.android.detail.datasdk.protocol.adapter.core.a p() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.datasdk.protocol.adapter.core.a) ipChange.ipc$dispatch("c3242f8a", new Object[0]);
        }
        if (g == null && (aVar = n) != null) {
            g = aVar.q();
        }
        return g;
    }

    public static void a(com.taobao.android.detail.datasdk.protocol.adapter.core.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d584dd9a", new Object[]{bVar});
        } else {
            m = bVar;
        }
    }

    public static com.taobao.android.detail.datasdk.protocol.adapter.core.b q() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.datasdk.protocol.adapter.core.b) ipChange.ipc$dispatch("b6b3b3ea", new Object[0]);
        }
        if (m == null && (aVar = n) != null) {
            m = aVar.l();
        }
        return m;
    }
}
