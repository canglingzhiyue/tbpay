package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.datasource.a;
import com.taobao.homepage.view.manager.LoginManager;
import com.taobao.homepage.view.manager.b;
import com.taobao.homepage.view.manager.broadcast.BroadcastManager;
import com.taobao.homepage.view.manager.d;
import com.taobao.homepage.view.manager.m;
import com.taobao.homepage.view.manager.o;
import com.taobao.homepage.view.widgets.bgcontainer.c;

/* loaded from: classes7.dex */
public class lbo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile a b;
    private lbh A;

    /* renamed from: a  reason: collision with root package name */
    private lbq f30457a;
    private c c;
    private mjx d;
    private ohv e;
    private BroadcastManager g;
    private kud h;
    private m i;
    private LoginManager j;
    private tik k;
    private com.taobao.homepage.view.manager.a m;
    private d n;
    private com.taobao.homepage.view.manager.c p;
    private b q;
    private law z;
    private kyi y = new kyi();
    private o B = new o(this);

    static {
        kge.a(2076000381);
    }

    public lbo(lbq lbqVar) {
        this.f30457a = lbqVar;
    }

    public lbq a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lbq) ipChange.ipc$dispatch("f073ac3", new Object[]{this}) : this.f30457a;
    }

    public static a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a6739397", new Object[0]);
        }
        if (b == null) {
            synchronized (lbo.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public LoginManager c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginManager) ipChange.ipc$dispatch("4d4cf0d9", new Object[]{this});
        }
        if (this.j == null) {
            this.j = new LoginManager(this.f30457a);
        }
        return this.j;
    }

    public tik g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tik) ipChange.ipc$dispatch("3d34d782", new Object[]{this});
        }
        if (this.k == null) {
            this.k = new tik();
        }
        return this.k;
    }

    public c d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ffcb0066", new Object[]{this}) : this.c;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f888eb43", new Object[]{this, cVar});
        } else {
            this.c = cVar;
        }
    }

    public ohv e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ohv) ipChange.ipc$dispatch("2dcf447d", new Object[]{this}) : this.e;
    }

    public void a(ohv ohvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ef0bfb", new Object[]{this, ohvVar});
        } else {
            this.e = ohvVar;
        }
    }

    public mjx i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mjx) ipChange.ipc$dispatch("4c94f8fb", new Object[]{this}) : this.d;
    }

    public void a(mjx mjxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a2727d", new Object[]{this, mjxVar});
            return;
        }
        this.d = mjxVar;
        this.A = new lbh(this);
    }

    public kud h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kud) ipChange.ipc$dispatch("44e291bd", new Object[]{this});
        }
        if (this.h == null) {
            this.h = new kud(this.f30457a.getCurActivity(), this);
        }
        return this.h;
    }

    public BroadcastManager f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastManager) ipChange.ipc$dispatch("dcaf0ce6", new Object[]{this});
        }
        if (this.g == null) {
            this.g = new BroadcastManager(this);
        }
        return this.g;
    }

    public com.taobao.homepage.view.manager.a j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.homepage.view.manager.a) ipChange.ipc$dispatch("932d3711", new Object[]{this});
        }
        if (this.m == null) {
            this.m = new com.taobao.homepage.view.manager.a();
        }
        return this.m;
    }

    public d l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("4169192c", new Object[]{this});
        }
        if (this.n == null) {
            this.n = new d(this.f30457a);
        }
        return this.n;
    }

    public m m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("98870b22", new Object[]{this});
        }
        if (this.i == null) {
            this.i = new m(this.f30457a);
        }
        return this.i;
    }

    public com.taobao.homepage.view.manager.c o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.homepage.view.manager.c) ipChange.ipc$dispatch("46c2ebaa", new Object[]{this});
        }
        if (this.p == null) {
            this.p = new com.taobao.homepage.view.manager.c(this.f30457a);
        }
        return this.p;
    }

    public b p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("9de0dc6a", new Object[]{this});
        }
        if (this.q == null) {
            this.q = new b(this);
        }
        return this.q;
    }

    public law y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (law) ipChange.ipc$dispatch("c7aeb8a4", new Object[]{this});
        }
        if (this.z == null) {
            this.z = new law();
        }
        return this.z;
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        kyi kyiVar = this.y;
        if (kyiVar != null) {
            kyiVar.a();
            this.y = null;
        }
        lbh lbhVar = this.A;
        if (lbhVar != null) {
            lbhVar.a();
            this.A = null;
        }
        law lawVar = this.z;
        if (lawVar != null) {
            lawVar.f();
            this.z = null;
        }
        o oVar = this.B;
        if (oVar != null) {
            oVar.a();
            this.B = null;
        }
        ohv ohvVar = this.e;
        if (ohvVar == null) {
            return;
        }
        ohvVar.c();
    }
}
