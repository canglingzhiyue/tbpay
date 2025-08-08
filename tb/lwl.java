package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.protocol.c;
import com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes7.dex */
public class lwl implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lwd f30943a;
    private lwz b;

    static {
        kge.a(-140665758);
        kge.a(1464465151);
    }

    public static /* synthetic */ lwd a(lwl lwlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lwd) ipChange.ipc$dispatch("fe616e96", new Object[]{lwlVar}) : lwlVar.f30943a;
    }

    public static /* synthetic */ void a(lwl lwlVar, JSONObject jSONObject, gkc gkcVar, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e90e59", new Object[]{lwlVar, jSONObject, gkcVar, str, new Integer(i), str2});
        } else {
            lwlVar.a(jSONObject, gkcVar, str, i, str2);
        }
    }

    public static /* synthetic */ void a(lwl lwlVar, JSONObject jSONObject, gkc gkcVar, String str, AwesomeGetContainerData awesomeGetContainerData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691afb0a", new Object[]{lwlVar, jSONObject, gkcVar, str, awesomeGetContainerData, new Boolean(z)});
        } else {
            lwlVar.a(jSONObject, gkcVar, str, awesomeGetContainerData, z);
        }
    }

    public static /* synthetic */ lwz b(lwl lwlVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lwz) ipChange.ipc$dispatch("e603479f", new Object[]{lwlVar}) : lwlVar.b;
    }

    public lwl(lwz lwzVar) throws GatewayException {
        if (lwzVar == null) {
            throw new GatewayException("dataServiceEngineContext should not be null");
        }
        this.f30943a = lwzVar.b();
        this.b = lwzVar;
    }

    @Override // tb.gke
    public void a(final JSONObject jSONObject, final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        lxl.b("gateway2.loadCache", "start action:", jSONObject.toJSONString());
        a.a("cacheProcess", "gateway2.loadCache", "start action");
        final String[] a2 = lwi.a(jSONObject);
        if (a2 == null) {
            a(jSONObject, gkcVar, (String) null, 1, "containers");
            return;
        }
        try {
            z = jSONObject.getBooleanValue("needSync");
        } catch (Throwable th) {
            lxl.a("gateway2.loadCache", th, new String[0]);
        }
        this.f30943a.a(new ArrayList(Arrays.asList(a2)), z, new c() { // from class: tb.lwl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.informationflowdataservice.dataservice.core.datasource.protocol.c
            public void a(List<String> list, List<String> list2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
                    return;
                }
                if (list == null || list.isEmpty()) {
                    lwl lwlVar = lwl.this;
                    JSONObject jSONObject2 = jSONObject;
                    gkc gkcVar2 = gkcVar;
                    lwl.a(lwlVar, jSONObject2, gkcVar2, (String) null, 4, "load cache : read file error, cid=" + a2);
                }
                for (String str : list) {
                    AwesomeGetContainerData a3 = lwl.a(lwl.this).a(str);
                    if (a3 == null || a3.getBaseData() == null) {
                        lwl lwlVar2 = lwl.this;
                        JSONObject jSONObject3 = jSONObject;
                        gkc gkcVar3 = gkcVar;
                        lwl.a(lwlVar2, jSONObject3, gkcVar3, str, 4, "load cache : container data is null, cid=" + str);
                    } else {
                        List<SectionModel> a4 = lwl.b(lwl.this).d().a(str, a3, null);
                        lwl.a(lwl.this).a(str, a4);
                        lwl.this.a(jSONObject, str, a4, gkcVar);
                        a.a("cacheProcess", "gateway2.loadCache", "load cache data trigger successfully");
                        lwl lwlVar3 = lwl.this;
                        lwl.a(lwlVar3, jSONObject, gkcVar, str, lwl.a(lwlVar3).a(str), false);
                    }
                }
            }
        });
        lxl.b("gateway2.loadCache", "end action");
        a.a("cacheProcess", "gateway2.loadCache", "end action");
    }

    public void a(final JSONObject jSONObject, final String str, List<SectionModel> list, final gkc gkcVar) {
        lxg a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e26f54", new Object[]{this, jSONObject, str, list, gkcVar});
        } else if (list == null || list.isEmpty() || str == null || StringUtils.isEmpty(str) || (a2 = this.b.a(str)) == null) {
        } else {
            a2.a(list, new lwh() { // from class: tb.lwl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.lwh
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    a.a("cacheProcess", "gateway2.loadCache", "template download completed trigger successfully, containerId : " + str);
                    lwl lwlVar = lwl.this;
                    lwl.a(lwlVar, jSONObject, gkcVar, str, lwl.a(lwlVar).a(str), true);
                }
            });
        }
    }

    private void a(JSONObject jSONObject, gkc gkcVar, String str, AwesomeGetContainerData awesomeGetContainerData, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e6163bb", new Object[]{this, jSONObject, gkcVar, str, awesomeGetContainerData, new Boolean(z)});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("containerModel", (Object) awesomeGetContainerData);
        jSONObject2.put("dataChangeType", "base");
        jSONObject2.put("containerId", (Object) str);
        jSONObject2.put("dataSourceType", (Object) (z ? "download" : "local"));
        lwv.a(jSONObject2, lwv.a(jSONObject));
        gkcVar.a("success", jSONObject2, null);
    }

    private void a(JSONObject jSONObject, gkc gkcVar, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a91420a", new Object[]{this, jSONObject, gkcVar, str, new Integer(i), str2});
            return;
        }
        a.b("cacheProcess", "param_error", "网关2.0缓存处理，加载失败", "gateway2.loadCache", str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("containerId", (Object) str);
        jSONObject2.put("errorCode", (Object) Integer.valueOf(i));
        jSONObject2.put("errorMsg", (Object) str2);
        jSONObject2.put("dataSourceType", "local");
        lwv.a(jSONObject2, lwv.a(jSONObject));
        gkcVar.a("fail", jSONObject2, null);
    }
}
