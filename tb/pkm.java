package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.k;
import com.taobao.taolive.sdk.core.e;
import com.taobao.taolive.sdk.ui.media.u;
import com.taobao.taolive.sdk.utils.o;

/* loaded from: classes8.dex */
public class pkm implements u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f32719a;
    private String c;
    private String e;
    private String f;
    private String g;
    private e h;
    private final boolean d = com.taobao.taolive.sdk.utils.u.ab();
    private pcx b = new pcx();

    static {
        kge.a(763729457);
        kge.a(-567167322);
        f32719a = pkm.class.getSimpleName();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.e;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcdbddb", new Object[]{this, eVar});
        } else {
            this.h = eVar;
        }
    }

    public pkm(boolean z) {
        this.b.h("liveRoom");
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
        } else if (!this.d) {
        } else {
            this.c = str;
            this.f = str2;
            this.b.a(str);
            this.b.b(str2);
            this.b.c(String.valueOf(k.a()));
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (!this.d) {
        } else {
            this.b.a(j);
            pqi.a().b(f32719a, "pageInitBegin");
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!this.d || str == null || !str.equals(this.c)) {
        } else {
            this.b.a();
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!this.d) {
        } else {
            if (str != null && str.equals(this.c)) {
                this.b.b();
            }
            pkn e = pko.a().e(this.e);
            if (e != null) {
                e.i = str;
                e.h = this.f;
                e.e = this.g;
                e.f32720a = System.currentTimeMillis();
            }
            pko.a().b(this.e);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.b.d(str);
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else if (!this.d) {
        } else {
            this.b.e(str);
            pkn e = pko.a().e(this.e);
            if (e != null) {
                e.f = str;
            }
            e eVar = this.h;
            if (eVar == null || eVar.B() == null) {
                return;
            }
            this.h.B().i(str);
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25cadc0", new Object[]{this, str});
        } else if (!this.d) {
        } else {
            this.b.j(str);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else if (!this.d || str == null || !str.equals(this.c)) {
        } else {
            this.b.c();
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.b.f(str);
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            this.b.g(str);
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
        } else if (!this.d || str == null || !str.equals(this.c)) {
        } else {
            this.b.d();
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else if (!this.d || str == null || !str.equals(this.c)) {
        } else {
            this.b.e();
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
        } else if (!this.d || str == null || !str.equals(this.c)) {
        } else {
            this.b.f();
        }
    }

    public void a(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{this, str, str2, new Long(j)});
        } else if (!this.d || str == null || !str.equals(this.c)) {
        } else {
            this.b.a(str2, j);
        }
    }

    public void a(String str, String str2, int i, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270e7737", new Object[]{this, str, str2, new Integer(i), new Boolean(z), str3});
        } else if (!this.d || str == null || !str.equals(this.c)) {
        } else {
            this.b.a(str2, i, z, str3);
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
        } else if (!this.d || str == null || !str.equals(this.c)) {
        } else {
            this.b.g();
        }
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else if (!this.d || str == null || !str.equals(this.c)) {
        } else {
            if (com.taobao.taolive.sdk.utils.u.an()) {
                this.b.o();
            }
            this.b.b(j);
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df97b3e", new Object[]{this, str});
        } else if (!this.d || str == null || !str.equals(this.c)) {
        } else {
            if (com.taobao.taolive.sdk.utils.u.an()) {
                this.b.q();
            }
            if (com.taobao.taolive.sdk.utils.u.ao()) {
                this.b.p();
            }
            if (o.Q()) {
                this.b.h();
            } else if (this.b.j() <= 0) {
            } else {
                this.b.h();
            }
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82b147f", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.u
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        pcx pcxVar = this.b;
        if (pcxVar == null) {
            return;
        }
        pcxVar.a(str, str2);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.d) {
        } else {
            this.b.i();
            this.e = null;
        }
    }

    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8e4701", new Object[]{this, str});
        } else if (!com.taobao.taolive.sdk.utils.u.an() || str == null || !str.equals(this.c)) {
        } else {
            this.b.l();
        }
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bfe042", new Object[]{this, str});
        } else if (!com.taobao.taolive.sdk.utils.u.an() || str == null || !str.equals(this.c)) {
        } else {
            this.b.m();
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f17983", new Object[]{this, str});
        } else if (!com.taobao.taolive.sdk.utils.u.an() || str == null || !str.equals(this.c)) {
        } else {
            this.b.n();
        }
    }

    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (!com.taobao.taolive.sdk.utils.u.ao() || str == null || !str.equals(this.c)) {
        } else {
            this.b.a(i);
        }
    }
}
