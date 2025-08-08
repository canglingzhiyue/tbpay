package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ai.b;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.linklog.a;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.NewScrollLogic;
import com.taobao.tao.recommend4.recyclerview.m;
import java.util.List;
import java.util.Map;
import tb.osm;

/* loaded from: classes8.dex */
public class osd implements osm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final osp f32357a;

    static {
        kge.a(268910140);
        kge.a(1577330053);
    }

    private osd(ksk kskVar) {
        this.f32357a = osp.a(kskVar);
        b.a().a(kskVar.f30287a);
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : this.f32357a.a(str, str2);
    }

    @Override // tb.osm
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.f32357a.a(jSONObject);
        }
    }

    @Override // tb.osm
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            this.f32357a.b(jSONObject);
        }
    }

    @Override // tb.osm
    public otc a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (otc) ipChange.ipc$dispatch("f08d9c0", new Object[]{this}) : this.f32357a.a();
    }

    public void a(osm.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb9df92", new Object[]{this, aVar});
            return;
        }
        a.a("scaleScene", "RecommendContainer", "setAnimationResponseListener");
        this.f32357a.a(aVar);
    }

    @Override // tb.osm
    public DinamicXEngine n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("3c899af2", new Object[]{this}) : this.f32357a.n();
    }

    public static osd a(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osd) ipChange.ipc$dispatch("5c346df1", new Object[]{kskVar});
        }
        if (kskVar != null) {
            return new osd(kskVar);
        }
        return null;
    }

    public static osd a(ksk kskVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (osd) ipChange.ipc$dispatch("f7f5e827", new Object[]{kskVar, str});
        }
        if (kskVar == null) {
            return null;
        }
        if (StringUtils.equals("tmallhk_ds_native_taobao", str)) {
            return new osd(ksk.REC_DIRECT_SALE_CART);
        }
        return new osd(kskVar);
    }

    public void a(osc oscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8816b79", new Object[]{this, oscVar});
            return;
        }
        a.a("scaleScene", "RecommendContainer", "resigsterCallback");
        this.f32357a.a(oscVar);
    }

    public RecyclerView a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("3fe22864", new Object[]{this, context});
        }
        a.a("scaleScene", "RecommendContainer", "createRecommendContainer");
        return this.f32357a.a(context);
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("requestData bizParams : ");
        sb.append(jSONObject == null ? "" : jSONObject.toJSONString());
        a.a("scaleScene", "RecommendContainer", sb.toString());
        this.f32357a.c(jSONObject);
        this.f32357a.br_();
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        a.a("scaleScene", "RecommendContainer", "requestCacheData");
        this.f32357a.bT_();
    }

    public void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
            return;
        }
        a.a("scaleScene", "RecommendContainer", "requestPullRefresh");
        this.f32357a.e(jSONObject);
        this.f32357a.br_();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f32357a.a(str);
        }
    }

    @Override // tb.osm
    public void a(kso ksoVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d23ef9f", new Object[]{this, ksoVar, jSONObject});
            return;
        }
        a.a("scaleScene", "RecommendContainer", "replaceRequest");
        this.f32357a.a(ksoVar, jSONObject);
    }

    @Override // tb.osm
    public ksn b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ksn) ipChange.ipc$dispatch("16b8ab37", new Object[]{this}) : this.f32357a.b();
    }

    public void a(ksn ksnVar, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297c1c1e", new Object[]{this, ksnVar, jSONObject});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("requestData apiInfo : ");
        if (ksnVar == null || ksnVar.c()) {
            str = "";
        } else {
            str = ksnVar.a() + " - " + ksnVar.b();
        }
        sb.append(str);
        a.a("scaleScene", "RecommendContainer", sb.toString());
        this.f32357a.a(ksnVar, jSONObject);
        this.f32357a.br_();
    }

    public void b(ksn ksnVar, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f3a9bd", new Object[]{this, ksnVar, jSONObject});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("preRequestData apiInfo : ");
        if (ksnVar == null || ksnVar.c()) {
            str = "";
        } else {
            str = ksnVar.a() + " - " + ksnVar.b();
        }
        sb.append(str);
        a.a("scaleScene", "RecommendContainer", sb.toString());
        if (ksnVar == null || ksnVar.c()) {
            this.f32357a.c(jSONObject);
        } else {
            this.f32357a.a(ksnVar, jSONObject);
        }
    }

    @Override // tb.osm
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f32357a.c();
        }
    }

    @Override // tb.osm
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f32357a.d();
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f32357a.a(i);
        }
    }

    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        a.a("scaleScene", "RecommendContainer", Constant.KEY_PAGEBACK);
        this.f32357a.b(map);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.f32357a.m();
        }
    }

    @Override // tb.osm
    public ksk f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ksk) ipChange.ipc$dispatch("357f4056", new Object[]{this}) : this.f32357a.f();
    }

    @Override // tb.osm
    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.f32357a.g();
    }

    @Override // tb.osm
    public Context h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("96c352e7", new Object[]{this}) : this.f32357a.h();
    }

    @Override // tb.osm
    public RecyclerView i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("d8cf254", new Object[]{this}) : this.f32357a.i();
    }

    @Override // tb.osm
    public List<SectionModel> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("87269236", new Object[]{this}) : this.f32357a.j();
    }

    @Override // tb.osm
    public JSONObject t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e6142a1b", new Object[]{this}) : this.f32357a.t();
    }

    @Override // tb.osm
    public AwesomeGetPageData s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AwesomeGetPageData) ipChange.ipc$dispatch("10dcf7ba", new Object[]{this}) : this.f32357a.s();
    }

    @Override // tb.osm
    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.f32357a.k();
    }

    public void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else {
            this.f32357a.d(jSONObject);
        }
    }

    public void b(ksk kskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e034b276", new Object[]{this, kskVar});
            return;
        }
        this.f32357a.b(kskVar);
        ksp.a("real_time_rec", hashCode() + "updateGatewayContainerType: " + kskVar.f30287a);
    }

    @Override // tb.osm
    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.f32357a.o();
    }

    @Override // tb.osm
    public int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue() : this.f32357a.p();
    }

    @Override // tb.osm
    public int q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue() : this.f32357a.q();
    }

    public void a(m.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36296b61", new Object[]{this, aVar});
        } else {
            this.f32357a.a(aVar);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        a.a("scaleScene", "RecommendContainer", "setScrollEnabled : " + z);
        this.f32357a.a(z);
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            this.f32357a.be_();
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            this.f32357a.bf_();
        }
    }

    public void a(NewScrollLogic.PullState pullState, NewScrollLogic.PullState pullState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722f4868", new Object[]{this, pullState, pullState2});
        } else {
            this.f32357a.a(pullState, pullState2);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.f32357a.c(i);
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else {
            this.f32357a.N();
        }
    }
}
