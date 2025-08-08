package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.home.component.utils.e;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.homepage.f;
import com.taobao.tao.linklog.a;
import com.taobao.tao.recommend3.a;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.tracelog.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class oov implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ope f32238a;

    static {
        kge.a(1936198113);
        kge.a(1464465151);
    }

    public static /* synthetic */ ope a(oov oovVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ope) ipChange.ipc$dispatch("5d4d95a0", new Object[]{oovVar}) : oovVar.f32238a;
    }

    public static /* synthetic */ void a(oov oovVar, gkc gkcVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341269a", new Object[]{oovVar, gkcVar, new Integer(i), str});
        } else {
            oovVar.a(gkcVar, i, str);
        }
    }

    public static /* synthetic */ void a(oov oovVar, gkc gkcVar, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be8ca24f", new Object[]{oovVar, gkcVar, awesomeGetContainerData});
        } else {
            oovVar.a(gkcVar, awesomeGetContainerData);
        }
    }

    public oov(ope opeVar) throws GatewayException {
        if (opeVar == null) {
            throw new GatewayException("RecmdDataSource should not be null");
        }
        this.f32238a = opeVar;
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        e.c("gateway2.loadCache", "start action:", jSONObject.toJSONString());
        a.a("cacheProcess", "gateway2.loadCache", "start action");
        final String string = jSONObject == null ? null : jSONObject.getString("containerId");
        if (StringUtils.isEmpty(string)) {
            a(gkcVar, 1, "containerId不能为空");
            return;
        }
        try {
            jSONObject.getBooleanValue("needSync");
        } catch (Throwable th) {
            e.a("gateway2.loadCache", th, new String[0]);
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(string);
        b.a().a("loadCacheByCacheAction", 1);
        this.f32238a.a(arrayList, new opf() { // from class: tb.oov.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.opf
            public void a(List<String> list, List<String> list2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
                    return;
                }
                b.a().b("loadCacheByCacheAction");
                if (list == null || list.isEmpty()) {
                    oov oovVar = oov.this;
                    gkc gkcVar2 = gkcVar;
                    oov.a(oovVar, gkcVar2, 4, "load cache : read file error, cid=" + string);
                }
                for (String str : list) {
                    AwesomeGetContainerData b = oov.a(oov.this).b(str);
                    if (b == null || b.getBaseData() == null) {
                        oov oovVar2 = oov.this;
                        gkc gkcVar3 = gkcVar;
                        oov.a(oovVar2, gkcVar3, 4, "load cache : container data is null, cid=" + str);
                    } else {
                        List<SectionModel> a2 = opb.a(str, b, (AwesomeGetContainerData) null);
                        oov.a(oov.this).a(str, a2);
                        oov.this.a(str, a2, gkcVar);
                        a.a("cacheProcess", "gateway2.loadCache", "load cache data trigger successfully");
                        oov oovVar3 = oov.this;
                        oov.a(oovVar3, gkcVar, oov.a(oovVar3).b(str));
                    }
                }
            }
        });
        e.c("gateway2.loadCache", "end action");
        a.a("cacheProcess", "gateway2.loadCache", "end action");
    }

    public void a(final String str, List<SectionModel> list, final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5cc834", new Object[]{this, str, list, gkcVar});
        } else if (list == null || list.isEmpty() || str == null || StringUtils.isEmpty(str)) {
        } else {
            if (StringUtils.equals(str.startsWith("recommend_") ? "guess" : "homepage", "homepage")) {
                f.a().a(list, "homepage", new f.b() { // from class: tb.oov.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.homepage.f.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        oov oovVar = oov.this;
                        oov.a(oovVar, gkcVar, oov.a(oovVar).b(str));
                    }
                });
            } else {
                com.taobao.tao.recommend3.a.a().a(list, "guess", new a.b() { // from class: tb.oov.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.recommend3.a.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        com.taobao.tao.linklog.a.a("cacheProcess", "gateway2.loadCache", "template download completed trigger successfully");
                        oov oovVar = oov.this;
                        oov.a(oovVar, gkcVar, oov.a(oovVar).b(str));
                    }
                }, str);
            }
        }
    }

    private void a(gkc gkcVar, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7c40b5", new Object[]{this, gkcVar, awesomeGetContainerData});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("containerModel", (Object) awesomeGetContainerData);
        jSONObject.put("dataChangeType", "base");
        gkcVar.a("success", jSONObject, null);
    }

    private void a(gkc gkcVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2162af4", new Object[]{this, gkcVar, new Integer(i), str});
            return;
        }
        com.taobao.tao.linklog.a.b("cacheProcess", "param_error", "网关2.0缓存处理，加载失败", "gateway2.loadCache", str);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", (Object) Integer.valueOf(i));
        jSONObject.put("errorMsg", (Object) str);
        gkcVar.a("fail", jSONObject, null);
    }
}
