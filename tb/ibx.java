package tb;

import android.content.Context;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.service.a;
import com.taobao.taolive.sdk.utils.q;
import java.util.Map;

/* loaded from: classes8.dex */
public class ibx implements ibw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ibt f28902a = new ibt();
    private ibu b = new ibu();
    private ibv c = new ibv();

    static {
        kge.a(1801772973);
        kge.a(175228909);
    }

    @Override // tb.ppc
    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        return null;
    }

    public ibx() {
        q.b("IGlobalDataCenterImpl", "init new data");
    }

    @Override // tb.ppd
    public ViewGroup a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("d01cc9b5", new Object[]{this, context});
        }
        ibv ibvVar = this.c;
        if (ibvVar == null) {
            return null;
        }
        return ibvVar.a(context);
    }

    @Override // tb.ppd
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (b() == null) {
        } else {
            b().a(str);
        }
    }

    @Override // tb.ppd
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (b() == null) {
        } else {
            b().h(str);
        }
    }

    @Override // tb.ppd
    public void a(LiveDetailMessinfoResponseData.AlimamaInfo2 alimamaInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d7c3ad", new Object[]{this, alimamaInfo2});
        } else if (b() == null) {
        } else {
            b().a(alimamaInfo2);
        }
    }

    @Override // tb.ppd
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379e58d2", new Object[]{this, aVar});
            return;
        }
        ibv ibvVar = this.c;
        if (ibvVar == null) {
            return;
        }
        ibvVar.a(aVar);
    }

    @Override // tb.ibw
    public ibt a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ibt) ipChange.ipc$dispatch("f05de03", new Object[]{this}) : this.f28902a;
    }

    @Override // tb.ibw
    public ibu b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ibu) ipChange.ipc$dispatch("16b78381", new Object[]{this}) : this.b;
    }

    @Override // tb.ibw
    public ibv c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ibv) ipChange.ipc$dispatch("1e6928ff", new Object[]{this}) : this.c;
    }

    @Override // tb.ppc
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().b();
    }

    @Override // tb.ppd
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().b(str);
        }
    }

    @Override // tb.ppd
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else if (b() == null) {
        } else {
            b().b(str);
        }
    }

    @Override // tb.ppc
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().c();
    }

    @Override // tb.ppd
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().c(str);
        }
    }

    @Override // tb.ppc
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().d();
    }

    @Override // tb.ppd
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().d(str);
        }
    }

    @Override // tb.ppc
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().e();
    }

    @Override // tb.ppd
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().e(str);
        }
    }

    @Override // tb.ppd
    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().a(str);
        }
    }

    @Override // tb.ppc
    public String ay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("694b75c1", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().f();
    }

    @Override // tb.ppd
    public void X(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57e7e8e9", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().L(str);
        }
    }

    @Override // tb.ppc
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().h();
    }

    @Override // tb.ppd
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().f(str);
        }
    }

    @Override // tb.ppc
    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().i();
    }

    @Override // tb.ppd
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().g(str);
        }
    }

    @Override // tb.ppc
    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().j();
    }

    @Override // tb.ppd
    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().h(str);
        }
    }

    @Override // tb.ppc
    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().k();
    }

    @Override // tb.ppd
    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().i(str);
        }
    }

    @Override // tb.ppd
    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df97b3e", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().j(str);
        }
    }

    @Override // tb.ppc
    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().m();
    }

    @Override // tb.ppd
    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b82b147f", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().k(str);
        }
    }

    @Override // tb.ppd
    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25cadc0", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().l(str);
        }
    }

    @Override // tb.ppc
    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().o();
    }

    @Override // tb.ppd
    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8e4701", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().m(str);
        }
    }

    @Override // tb.ppc
    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().p();
    }

    @Override // tb.ppd
    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bfe042", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().n(str);
        }
    }

    @Override // tb.ppc
    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18528f28", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().q();
    }

    @Override // tb.ppd
    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0f17983", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().o(str);
        }
    }

    @Override // tb.ppc
    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().r();
    }

    @Override // tb.ppd
    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2312c4", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().p(str);
        }
    }

    @Override // tb.ppc
    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("255e0466", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().s();
    }

    @Override // tb.ppd
    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7554ac05", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().q(str);
        }
    }

    @Override // tb.ppc
    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().t();
    }

    @Override // tb.ppd
    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf864546", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().r(str);
        }
    }

    @Override // tb.ppc
    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("326979a4", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().u();
    }

    @Override // tb.ppd
    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7de87", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().s(str);
        }
    }

    @Override // tb.ppc
    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().v();
    }

    @Override // tb.ppd
    public void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e977c8", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().t(str);
        }
    }

    @Override // tb.ppc
    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue();
        }
        if (a() == null) {
            return 0;
        }
        return a().w();
    }

    @Override // tb.ppd
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (a() == null) {
        } else {
            a().a(i);
        }
    }

    @Override // tb.ppc
    public String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5faa981", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().x();
    }

    @Override // tb.ppd
    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1b1109", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().u(str);
        }
    }

    @Override // tb.ppd
    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e84caa4a", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().v(str);
        }
    }

    @Override // tb.ppc
    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c806420", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().z();
    }

    @Override // tb.ppd
    public void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327e438b", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().w(str);
        }
    }

    @Override // tb.ppc
    public String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3061ebf", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().A();
    }

    @Override // tb.ppd
    public void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad732412", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().x(str);
        }
    }

    @Override // tb.ppc
    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df3f9158", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().B();
    }

    @Override // tb.ppd
    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a4bd53", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().y(str);
        }
    }

    @Override // tb.ppd
    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41d65694", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().z(str);
        }
    }

    @Override // tb.ppd
    public void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c07efd5", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().A(str);
        }
    }

    @Override // tb.ppd
    public void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6398916", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().B(str);
        }
    }

    @Override // tb.ppd
    public void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206b2257", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().C(str);
        }
    }

    @Override // tb.ppd
    public void G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a9cbb98", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().D(str);
        }
    }

    @Override // tb.ppc
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65c54bf7", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().H();
    }

    @Override // tb.ppd
    public void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ce54d9", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().E(str);
        }
    }

    @Override // tb.ppc
    public JSONArray C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("3cb685b4", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().I();
    }

    @Override // tb.ppd
    public void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else if (a() == null) {
        } else {
            a().a(jSONArray);
        }
    }

    @Override // tb.ppc
    public String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d0c135", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().J();
    }

    @Override // tb.ppd
    public void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feffee1a", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().F(str);
        }
    }

    @Override // tb.ppc
    public String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9567bd4", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().K();
    }

    @Override // tb.ppd
    public void J(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4931875b", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().G(str);
        }
    }

    @Override // tb.ppc
    public Map<String, String> F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ef1c5942", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().L();
    }

    @Override // tb.ppd
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (a() == null) {
        } else {
            a().a(map);
        }
    }

    @Override // tb.ppc
    public String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("661f112", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().M();
    }

    @Override // tb.ppd
    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9363209c", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().H(str);
        }
    }

    @Override // tb.ppd
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (a() == null) {
        } else {
            a().a(z);
        }
    }

    @Override // tb.ppc
    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ce7abb1", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().N();
    }

    @Override // tb.ppd
    public void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd94b9dd", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().I(str);
        }
    }

    @Override // tb.ppc
    public String I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("136d6650", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().O();
    }

    @Override // tb.ppd
    public void M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c6531e", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().J(str);
        }
    }

    @Override // tb.ppc
    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue();
        }
        if (a() == null) {
            return false;
        }
        a();
        return ibt.P();
    }

    @Override // tb.ppc
    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue();
        }
        if (a() == null) {
            return false;
        }
        return a().Q();
    }

    @Override // tb.ppc
    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue();
        }
        if (a() == null) {
            return false;
        }
        return a().R();
    }

    @Override // tb.ppc
    public String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d8450cc", new Object[]{this});
        }
        if (a() == null) {
            return null;
        }
        return a().S();
    }

    @Override // tb.ppd
    public void N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f7ec5f", new Object[]{this, str});
        } else if (a() == null) {
        } else {
            a().K(str);
        }
    }

    @Override // tb.ppc
    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("460add9", new Object[]{this})).booleanValue();
        }
        if (b() == null) {
            return false;
        }
        return b().e();
    }

    @Override // tb.ppd
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().a(z);
        }
    }

    @Override // tb.ppc
    public long O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46ec54a", new Object[]{this})).longValue();
        }
        if (b() == null) {
            return 0L;
        }
        return b().f();
    }

    @Override // tb.ppc
    public long aS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa2d378d", new Object[]{this})).longValue();
        }
        if (b() == null) {
            return 0L;
        }
        return b().G();
    }

    @Override // tb.ppd
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (b() == null) {
        } else {
            b().a(j);
        }
    }

    @Override // tb.ppd
    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
        } else if (b() == null) {
        } else {
            b().c(j);
        }
    }

    @Override // tb.ppd
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().b(z);
        }
    }

    @Override // tb.ppd
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().c(z);
        }
    }

    @Override // tb.ppc
    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue();
        }
        if (b() == null) {
            return false;
        }
        return b().g();
    }

    @Override // tb.ppd
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().d(z);
        }
    }

    @Override // tb.ppc
    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[]{this})).booleanValue();
        }
        if (b() == null) {
            return false;
        }
        return b().h();
    }

    @Override // tb.ppd
    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().e(z);
        }
    }

    @Override // tb.ppd
    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().f(z);
        }
    }

    @Override // tb.ppc
    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[]{this})).booleanValue();
        }
        if (b() == null) {
            return false;
        }
        return b().i();
    }

    @Override // tb.ppc
    public long S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a7234e", new Object[]{this})).longValue();
        }
        if (b() == null) {
            return 0L;
        }
        return b().j();
    }

    @Override // tb.ppd
    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else if (b() == null) {
        } else {
            b().b(j);
        }
    }

    @Override // tb.ppc
    public String T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db2c6b25", new Object[]{this});
        }
        if (b() == null) {
            return null;
        }
        return b().k();
    }

    @Override // tb.ppd
    public void O(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc2985a0", new Object[]{this, str});
        } else if (b() == null) {
        } else {
            b().c(str);
        }
    }

    @Override // tb.ppc
    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[]{this})).booleanValue();
        }
        if (b() == null) {
            return false;
        }
        return b().l();
    }

    @Override // tb.ppd
    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().g(z);
        }
    }

    @Override // tb.ppd
    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().h(z);
        }
    }

    @Override // tb.ppc
    public boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[]{this})).booleanValue();
        }
        if (b() == null) {
            return false;
        }
        return b().m();
    }

    @Override // tb.ppd
    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d7103", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().i(z);
        }
    }

    @Override // tb.ppc
    public boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[]{this})).booleanValue();
        }
        if (b() == null) {
            return false;
        }
        return b().n();
    }

    @Override // tb.ppd
    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93249a2", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().j(z);
        }
    }

    @Override // tb.ppd
    public void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b1ee1", new Object[]{this, str});
        } else if (b() == null) {
        } else {
            b().d(str);
        }
    }

    @Override // tb.ppc
    public boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[]{this})).booleanValue();
        }
        if (b() == null) {
            return false;
        }
        return b().o();
    }

    @Override // tb.ppd
    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().k(z);
        }
    }

    @Override // tb.ppc
    public int Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fbb053", new Object[]{this})).intValue();
        }
        if (b() == null) {
            return 0;
        }
        return b().p();
    }

    @Override // tb.ppd
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (b() == null) {
        } else {
            b().a(i);
        }
    }

    @Override // tb.ppc
    public int Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("509c7d4", new Object[]{this})).intValue();
        }
        if (b() == null) {
            return 0;
        }
        return b().q();
    }

    @Override // tb.ppd
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (b() == null) {
        } else {
            b().b(i);
        }
    }

    @Override // tb.ppc
    public int aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aaf2809a", new Object[]{this})).intValue();
        }
        if (b() == null) {
            return 0;
        }
        return b().r();
    }

    @Override // tb.ppd
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else if (b() == null) {
        } else {
            b().c(i);
        }
    }

    @Override // tb.ppd
    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().l(z);
        }
    }

    @Override // tb.ppc
    public String ad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("605326b6", new Object[]{this});
        }
        if (b() == null) {
            return null;
        }
        return b().w();
    }

    @Override // tb.ppd
    public void Q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508cb822", new Object[]{this, str});
        } else if (b() == null) {
        } else {
            b().e(str);
        }
    }

    @Override // tb.ppd
    public void R(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abe5163", new Object[]{this, str});
        } else if (b() == null) {
        } else {
            b().f(str);
        }
    }

    @Override // tb.ppc
    public boolean ab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[]{this})).booleanValue();
        }
        if (b() == null) {
            return false;
        }
        return b().u();
    }

    @Override // tb.ppd
    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be50d37f", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().m(z);
        }
    }

    @Override // tb.ppc
    public boolean ac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[]{this})).booleanValue();
        }
        if (b() == null) {
            return false;
        }
        return b().v();
    }

    @Override // tb.ppd
    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c005ac1e", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().n(z);
        }
    }

    @Override // tb.ppd
    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba84bd", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().o(z);
        }
    }

    @Override // tb.ppd
    public void S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4efeaa4", new Object[]{this, str});
        } else if (b() == null) {
        } else {
            b().g(str);
        }
    }

    @Override // tb.ppc
    public boolean ae() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[]{this})).booleanValue();
        }
        if (b() == null) {
            return false;
        }
        return b().x();
    }

    @Override // tb.ppc
    public boolean af() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[]{this})).booleanValue();
        }
        if (b() == null) {
            return false;
        }
        return b().y();
    }

    @Override // tb.ppd
    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c36f5d5c", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().p(z);
        }
    }

    @Override // tb.ppc
    public boolean ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[]{this})).booleanValue();
        }
        if (b() == null) {
            return false;
        }
        return b().z();
    }

    @Override // tb.ppd
    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52435fb", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().q(z);
        }
    }

    @Override // tb.ppc
    public String ah() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a6a1132", new Object[]{this});
        }
        if (c() == null) {
            return null;
        }
        return c().a();
    }

    @Override // tb.ppd
    public void T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2183e5", new Object[]{this, str});
        } else if (c() == null) {
        } else {
            c().a(str);
        }
    }

    @Override // tb.ppc
    public boolean ai() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[]{this})).booleanValue();
        }
        if (c() == null) {
            return false;
        }
        return c().b();
    }

    @Override // tb.ppd
    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d90e9a", new Object[]{this, new Boolean(z)});
        } else if (c() == null) {
        } else {
            c().a(z);
        }
    }

    @Override // tb.ppd
    public void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88de739", new Object[]{this, new Boolean(z)});
        } else if (c() == null) {
        } else {
            c().b(z);
        }
    }

    @Override // tb.ppc
    public String aj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87758670", new Object[]{this});
        }
        if (b() == null) {
            return null;
        }
        return b().d();
    }

    @Override // tb.ppc
    public LiveDetailMessinfoResponseData.AlimamaInfo ak() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.AlimamaInfo) ipChange.ipc$dispatch("4a50862e", new Object[]{this});
        }
        if (b() == null) {
            return null;
        }
        return b().b();
    }

    @Override // tb.ppc
    public LiveDetailMessinfoResponseData.AlimamaInfo2 al() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.AlimamaInfo2) ipChange.ipc$dispatch("6e474ff7", new Object[]{this});
        }
        if (b() == null) {
            return null;
        }
        return b().c();
    }

    @Override // tb.ppd
    public void a(LiveDetailMessinfoResponseData.AlimamaInfo alimamaInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f071591", new Object[]{this, alimamaInfo});
        } else if (b() == null) {
        } else {
            b().a(alimamaInfo);
        }
    }

    @Override // tb.ppd
    public void U(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79531d26", new Object[]{this, str});
        } else if (b() == null) {
        } else {
            b().k(str);
        }
    }

    @Override // tb.ppd
    public void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca42bfd8", new Object[]{this, new Boolean(z)});
        } else if (b() == null) {
        } else {
            b().r(z);
        }
    }

    @Override // tb.ppd
    public void V(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c384b667", new Object[]{this, str});
        } else if (b() == null) {
        } else {
            b().i(str);
        }
    }

    @Override // tb.ppd
    public void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db64fa8", new Object[]{this, str});
        } else if (b() == null) {
        } else {
            b().j(str);
        }
    }

    @Override // tb.ppc
    public boolean am() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[]{this})).booleanValue();
        }
        if (b() == null) {
            return false;
        }
        return b().B();
    }

    @Override // tb.ppc
    public String an() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a18c70ec", new Object[]{this});
        }
        if (b() == null) {
            return null;
        }
        return b().C();
    }

    @Override // tb.ppc
    public String ao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28122b8b", new Object[]{this});
        }
        if (b() == null) {
            return null;
        }
        return b().D();
    }

    @Override // tb.ppc
    public String ap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae97e62a", new Object[]{this});
        }
        if (b() == null) {
            return null;
        }
        return b().E();
    }

    @Override // tb.ppd
    public void Y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a219822a", new Object[]{this, str});
        } else if (b() == null) {
        } else {
            b().l(str);
        }
    }
}
