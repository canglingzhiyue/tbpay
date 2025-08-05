package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.FandomPreLiveInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.q;
import java.util.Map;

/* loaded from: classes8.dex */
public class ppb implements ppa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ppe f32794a = new ppe(this);
    private ppf b = new ppf(this);
    private ppg c = new ppg(this);
    private ppl d = new ppl(this);
    private a e;

    static {
        kge.a(-748184214);
        kge.a(139127850);
    }

    public ppb() {
        q.b("IDataCenterImpl", "init new data");
    }

    @Override // tb.ppa
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{this, aVar});
            return;
        }
        this.e = aVar;
        this.f32794a.a(this.e);
        this.b.a(this.e);
        this.c.a(this.e);
        this.d.a(this.e);
    }

    @Override // tb.ppa
    public ppe a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ppe) ipChange.ipc$dispatch("f093f59", new Object[]{this}) : this.f32794a;
    }

    @Override // tb.ppa
    public ppf b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ppf) ipChange.ipc$dispatch("16bae4d7", new Object[]{this}) : this.b;
    }

    @Override // tb.ppa
    public ppg c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ppg) ipChange.ipc$dispatch("1e6c8a55", new Object[]{this}) : this.c;
    }

    @Override // tb.ppa
    public ppl d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ppl) ipChange.ipc$dispatch("261e304f", new Object[]{this}) : this.d;
    }

    @Override // tb.ppa
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.d.a(str);
        }
    }

    private ibt aP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ibt) ipChange.ipc$dispatch("ebdf5995", new Object[]{this});
        }
        a aVar = this.e;
        if (aVar != null && aVar.z() != null && this.e.z().aJ_() != null && this.e.z().aJ_().a() != null) {
            return this.e.z().aJ_().a();
        }
        return null;
    }

    private ibu aQ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ibu) ipChange.ipc$dispatch("f390ff13", new Object[]{this});
        }
        a aVar = this.e;
        if (aVar != null && aVar.z() != null && this.e.z().aJ_() != null && this.e.z().aJ_().b() != null) {
            return this.e.z().aJ_().b();
        }
        return null;
    }

    private ibv aR() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ibv) ipChange.ipc$dispatch("fb42a491", new Object[]{this});
        }
        a aVar = this.e;
        if (aVar != null && aVar.z() != null && this.e.z().aJ_() != null && this.e.z().aJ_().c() != null) {
            return this.e.z().aJ_().c();
        }
        return null;
    }

    @Override // tb.ppa
    public String aq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("351da0c9", new Object[]{this});
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return null;
        }
        return pplVar.i();
    }

    @Override // tb.ppc
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().b();
    }

    @Override // tb.ppc
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().c();
    }

    @Override // tb.ppc
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().d();
    }

    @Override // tb.ppc
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().e();
    }

    @Override // tb.ppc
    public String ay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("694b75c1", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().f();
    }

    @Override // tb.ppc
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().h();
    }

    @Override // tb.ppc
    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().i();
    }

    @Override // tb.ppc
    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().j();
    }

    @Override // tb.ppc
    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().k();
    }

    @Override // tb.ppc
    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().m();
    }

    @Override // tb.ppc
    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().o();
    }

    @Override // tb.ppc
    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().p();
    }

    @Override // tb.ppc
    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18528f28", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().q();
    }

    @Override // tb.ppc
    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().r();
    }

    @Override // tb.ppc
    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("255e0466", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().s();
    }

    @Override // tb.ppc
    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().t();
    }

    @Override // tb.ppc
    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("326979a4", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().u();
    }

    @Override // tb.ppc
    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().v();
    }

    @Override // tb.ppc
    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue();
        }
        if (aP() == null) {
            return 0;
        }
        return aP().w();
    }

    @Override // tb.ppc
    public String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5faa981", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().x();
    }

    @Override // tb.ppc
    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c806420", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().z();
    }

    @Override // tb.ppc
    public String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3061ebf", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().A();
    }

    @Override // tb.ppc
    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df3f9158", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().B();
    }

    @Override // tb.ppc
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65c54bf7", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().H();
    }

    @Override // tb.ppc
    public JSONArray C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("3cb685b4", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().I();
    }

    @Override // tb.ppc
    public String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d0c135", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().J();
    }

    @Override // tb.ppc
    public String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9567bd4", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().K();
    }

    @Override // tb.ppc
    public Map<String, String> F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ef1c5942", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().L();
    }

    @Override // tb.ppc
    public String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("661f112", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().M();
    }

    @Override // tb.ppc
    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ce7abb1", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().N();
    }

    @Override // tb.ppc
    public String I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("136d6650", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().O();
    }

    @Override // tb.ppc
    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue();
        }
        if (aP() == null) {
            return false;
        }
        aP();
        return ibt.P();
    }

    @Override // tb.ppc
    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue();
        }
        if (aP() == null) {
            return false;
        }
        return aP().Q();
    }

    @Override // tb.ppc
    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue();
        }
        if (aP() == null) {
            return false;
        }
        return aP().R();
    }

    @Override // tb.ppc
    public String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2d8450cc", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().S();
    }

    @Override // tb.ppc
    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("460add9", new Object[]{this})).booleanValue();
        }
        if (aQ() == null) {
            return false;
        }
        return aQ().e();
    }

    @Override // tb.ppc
    public long O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46ec54a", new Object[]{this})).longValue();
        }
        if (aQ() == null) {
            return 0L;
        }
        return aQ().f();
    }

    @Override // tb.ppc
    public long aS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa2d378d", new Object[]{this})).longValue();
        }
        if (aQ() == null) {
            return 0L;
        }
        return aQ().f();
    }

    @Override // tb.ppc
    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[]{this})).booleanValue();
        }
        if (aQ() == null) {
            return false;
        }
        return aQ().g();
    }

    @Override // tb.ppc
    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[]{this})).booleanValue();
        }
        if (aQ() == null) {
            return false;
        }
        return aQ().h();
    }

    @Override // tb.ppc
    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[]{this})).booleanValue();
        }
        if (aQ() == null) {
            return false;
        }
        return aQ().i();
    }

    @Override // tb.ppc
    public long S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a7234e", new Object[]{this})).longValue();
        }
        if (aQ() == null) {
            return 0L;
        }
        return aQ().j();
    }

    @Override // tb.ppc
    public String T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db2c6b25", new Object[]{this});
        }
        if (aQ() == null) {
            return null;
        }
        return aQ().k();
    }

    @Override // tb.ppc
    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c35260", new Object[]{this})).booleanValue();
        }
        if (aQ() == null) {
            return false;
        }
        return aQ().l();
    }

    @Override // tb.ppc
    public boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[]{this})).booleanValue();
        }
        if (aQ() == null) {
            return false;
        }
        return aQ().m();
    }

    @Override // tb.ppc
    public boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4df8162", new Object[]{this})).booleanValue();
        }
        if (aQ() == null) {
            return false;
        }
        return aQ().n();
    }

    @Override // tb.ppc
    public boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ed98e3", new Object[]{this})).booleanValue();
        }
        if (aQ() == null) {
            return false;
        }
        return aQ().o();
    }

    @Override // tb.ppc
    public int Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fbb053", new Object[]{this})).intValue();
        }
        if (aQ() == null) {
            return 0;
        }
        return aQ().p();
    }

    @Override // tb.ppc
    public int Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("509c7d4", new Object[]{this})).intValue();
        }
        if (aQ() == null) {
            return 0;
        }
        return aQ().q();
    }

    @Override // tb.ppc
    public int aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aaf2809a", new Object[]{this})).intValue();
        }
        if (aQ() == null) {
            return 0;
        }
        return aQ().r();
    }

    @Override // tb.ppc
    public String ad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("605326b6", new Object[]{this});
        }
        if (aQ() == null) {
            return null;
        }
        return aQ().w();
    }

    @Override // tb.ppc
    public boolean ab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab00982c", new Object[]{this})).booleanValue();
        }
        if (aQ() == null) {
            return false;
        }
        return aQ().u();
    }

    @Override // tb.ppc
    public boolean ac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab0eafad", new Object[]{this})).booleanValue();
        }
        if (aQ() == null) {
            return false;
        }
        return aQ().v();
    }

    @Override // tb.ppc
    public boolean ae() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[]{this})).booleanValue();
        }
        if (aQ() == null) {
            return false;
        }
        return aQ().x();
    }

    @Override // tb.ppc
    public boolean af() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab38f630", new Object[]{this})).booleanValue();
        }
        if (aQ() == null) {
            return false;
        }
        return aQ().y();
    }

    @Override // tb.ppc
    public boolean ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab470db1", new Object[]{this})).booleanValue();
        }
        if (aQ() == null) {
            return false;
        }
        return aQ().z();
    }

    @Override // tb.ppc
    public String ah() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a6a1132", new Object[]{this});
        }
        if (aR() == null) {
            return null;
        }
        return aR().a();
    }

    @Override // tb.ppc
    public boolean ai() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[]{this})).booleanValue();
        }
        if (aR() == null) {
            return false;
        }
        return aR().b();
    }

    @Override // tb.ppa
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        ppe ppeVar = this.f32794a;
        if (ppeVar == null) {
            return;
        }
        ppeVar.b(str);
    }

    @Override // tb.ppa
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        ppe ppeVar = this.f32794a;
        if (ppeVar == null) {
            return;
        }
        ppeVar.a(str);
    }

    @Override // tb.ppa
    public Map<String, String> ar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cb7606d", new Object[]{this});
        }
        ppe ppeVar = this.f32794a;
        if (ppeVar == null) {
            return null;
        }
        return ppeVar.b();
    }

    @Override // tb.ppa
    public boolean as() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abf027bd", new Object[]{this})).booleanValue();
        }
        ppe ppeVar = this.f32794a;
        if (ppeVar == null) {
            return false;
        }
        return ppeVar.a();
    }

    @Override // tb.ppa
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        ppe ppeVar = this.f32794a;
        if (ppeVar == null) {
            return;
        }
        ppeVar.a(z);
    }

    @Override // tb.ppa
    public Map<String, String> at() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a80c23ef", new Object[]{this});
        }
        ppe ppeVar = this.f32794a;
        if (ppeVar == null) {
            return null;
        }
        return ppeVar.b();
    }

    @Override // tb.ppa
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        ppf ppfVar = this.b;
        if (ppfVar == null) {
            return;
        }
        ppfVar.a(str);
    }

    @Override // tb.ppa
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        ppf ppfVar = this.b;
        if (ppfVar == null) {
            return;
        }
        ppfVar.a(z);
    }

    @Override // tb.ppa
    public boolean au() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac0c56bf", new Object[]{this})).booleanValue();
        }
        ppf ppfVar = this.b;
        if (ppfVar == null) {
            return false;
        }
        return ppfVar.a();
    }

    @Override // tb.ppa
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        ppf ppfVar = this.b;
        if (ppfVar == null) {
            return;
        }
        ppfVar.b(z);
    }

    @Override // tb.ppa
    public boolean av() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac1a6e40", new Object[]{this})).booleanValue();
        }
        ppf ppfVar = this.b;
        if (ppfVar == null) {
            return false;
        }
        return ppfVar.b();
    }

    @Override // tb.ppa
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        ppf ppfVar = this.b;
        if (ppfVar == null) {
            return;
        }
        ppfVar.c(z);
    }

    @Override // tb.ppa
    public String aw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c400083", new Object[]{this});
        }
        ppf ppfVar = this.b;
        if (ppfVar == null) {
            return null;
        }
        return ppfVar.c();
    }

    @Override // tb.ppc
    public boolean am() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[]{this})).booleanValue();
        }
        if (aQ() == null) {
            return false;
        }
        return aQ().B();
    }

    @Override // tb.ppc
    public String an() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a18c70ec", new Object[]{this});
        }
        if (aQ() == null) {
            return null;
        }
        return aQ().C();
    }

    @Override // tb.ppc
    public String ao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28122b8b", new Object[]{this});
        }
        if (aQ() == null) {
            return null;
        }
        return aQ().D();
    }

    @Override // tb.ppc
    public String ap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae97e62a", new Object[]{this});
        }
        if (aQ() == null) {
            return null;
        }
        return aQ().E();
    }

    @Override // tb.ppa
    public void a(TBLiveDataModel tBLiveDataModel, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e336bcc", new Object[]{this, tBLiveDataModel, videoInfo});
            return;
        }
        ppf ppfVar = this.b;
        if (ppfVar == null) {
            return;
        }
        ppfVar.a(tBLiveDataModel, videoInfo);
    }

    @Override // tb.ppc
    public String aj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87758670", new Object[]{this});
        }
        if (aQ() == null) {
            return null;
        }
        return aQ().d();
    }

    @Override // tb.ppc
    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        if (aP() == null) {
            return null;
        }
        return aP().a();
    }

    @Override // tb.ppa
    public String ax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c5bb22", new Object[]{this});
        }
        if (aQ() == null) {
            return null;
        }
        return aQ().a();
    }

    @Override // tb.ppc
    public LiveDetailMessinfoResponseData.AlimamaInfo ak() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.AlimamaInfo) ipChange.ipc$dispatch("4a50862e", new Object[]{this});
        }
        if (aQ() == null) {
            return null;
        }
        return aQ().b();
    }

    @Override // tb.ppc
    public LiveDetailMessinfoResponseData.AlimamaInfo2 al() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveDetailMessinfoResponseData.AlimamaInfo2) ipChange.ipc$dispatch("6e474ff7", new Object[]{this});
        }
        if (aQ() == null) {
            return null;
        }
        return aQ().c();
    }

    @Override // tb.ppa
    public boolean b(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18b293c8", new Object[]{this, videoInfo})).booleanValue();
        }
        ppf ppfVar = this.b;
        if (ppfVar == null) {
            return false;
        }
        return ppfVar.b(videoInfo);
    }

    @Override // tb.ppa
    public String az() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("efd13060", new Object[]{this});
        }
        ppf ppfVar = this.b;
        if (ppfVar == null) {
            return null;
        }
        return ppfVar.e();
    }

    @Override // tb.ppa
    public VideoInfo aA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("c5a213c4", new Object[]{this});
        }
        ppf ppfVar = this.b;
        if (ppfVar == null) {
            return null;
        }
        return ppfVar.f();
    }

    @Override // tb.ppa
    public boolean aB() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a93da80c", new Object[]{this})).booleanValue();
        }
        ppf ppfVar = this.b;
        if (ppfVar == null) {
            return false;
        }
        return ppfVar.g();
    }

    @Override // tb.ppa
    public boolean aC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a94bbf8d", new Object[]{this})).booleanValue();
        }
        ppf ppfVar = this.b;
        if (ppfVar == null) {
            return false;
        }
        return ppfVar.h();
    }

    @Override // tb.ppa
    public String aD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f9bd2d6", new Object[]{this});
        }
        if (aQ() == null) {
            return null;
        }
        return aQ().A();
    }

    @Override // tb.ppa
    public VideoStatus aE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoStatus) ipChange.ipc$dispatch("a0c96774", new Object[]{this});
        }
        ppg ppgVar = this.c;
        if (ppgVar == null) {
            return null;
        }
        return ppgVar.a();
    }

    @Override // tb.ppa
    public void a(VideoStatus videoStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ce9271", new Object[]{this, videoStatus});
            return;
        }
        ppg ppgVar = this.c;
        if (ppgVar == null) {
            return;
        }
        ppgVar.a(videoStatus);
    }

    @Override // tb.ppa
    public String aF() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ca74814", new Object[]{this});
        }
        ppg ppgVar = this.c;
        if (ppgVar == null) {
            return null;
        }
        return ppgVar.b();
    }

    @Override // tb.ppa
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        ppg ppgVar = this.c;
        if (ppgVar == null) {
            return;
        }
        ppgVar.a(str);
    }

    @Override // tb.ppa
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        ppg ppgVar = this.c;
        if (ppgVar == null) {
            return;
        }
        ppgVar.b(str);
    }

    @Override // tb.ppa
    public boolean aG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9841d91", new Object[]{this})).booleanValue();
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return false;
        }
        return pplVar.a();
    }

    @Override // tb.ppa
    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return;
        }
        pplVar.a(z);
    }

    @Override // tb.ppa
    public int aH() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9923501", new Object[]{this})).intValue();
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return 0;
        }
        return pplVar.b();
    }

    @Override // tb.ppa
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return;
        }
        pplVar.a(i);
    }

    @Override // tb.ppa
    public String aI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("303877f1", new Object[]{this});
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return null;
        }
        return pplVar.c();
    }

    @Override // tb.ppa
    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return;
        }
        pplVar.b(str);
    }

    @Override // tb.ppa
    public String aJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b6be3290", new Object[]{this});
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return null;
        }
        return pplVar.d();
    }

    @Override // tb.ppa
    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            return;
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return;
        }
        pplVar.c(str);
    }

    @Override // tb.ppa
    public String aK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d43ed2f", new Object[]{this});
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return null;
        }
        return pplVar.e();
    }

    @Override // tb.ppa
    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
            return;
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return;
        }
        pplVar.d(str);
    }

    @Override // tb.ppa
    public String aL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3c9a7ce", new Object[]{this});
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return null;
        }
        return pplVar.f();
    }

    @Override // tb.ppa
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
            return;
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return;
        }
        pplVar.e(str);
    }

    @Override // tb.ppa
    public FandomPreLiveInfo aM() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomPreLiveInfo) ipChange.ipc$dispatch("a641248b", new Object[]{this});
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return null;
        }
        return pplVar.g();
    }

    @Override // tb.ppa
    public FandomInfo aN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomInfo) ipChange.ipc$dispatch("f03d481f", new Object[]{this});
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return null;
        }
        return pplVar.h();
    }

    @Override // tb.ppa
    public FandomInfo a(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomInfo) ipChange.ipc$dispatch("476cedb2", new Object[]{this, tBLiveDataModel});
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return null;
        }
        return pplVar.a(tBLiveDataModel);
    }

    @Override // tb.ppa
    public boolean aO() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9f4d999", new Object[]{this})).booleanValue();
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return false;
        }
        return pplVar.j();
    }

    @Override // tb.ppa
    public boolean b(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1229aa6", new Object[]{this, tBLiveDataModel})).booleanValue();
        }
        ppl pplVar = this.d;
        if (pplVar == null) {
            return false;
        }
        return pplVar.b(tBLiveDataModel);
    }
}
