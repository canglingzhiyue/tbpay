package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetData;
import com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a;
import java.util.List;

/* loaded from: classes7.dex */
public class lwk implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lwd f30940a;
    private lwz b;
    private lwr c;

    static {
        kge.a(-959447349);
        kge.a(1464465151);
    }

    public static /* synthetic */ lwd a(lwk lwkVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lwd) ipChange.ipc$dispatch("697cbbd5", new Object[]{lwkVar}) : lwkVar.f30940a;
    }

    public static /* synthetic */ void a(lwk lwkVar, JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b779969", new Object[]{lwkVar, jSONObject, gkcVar});
        } else {
            lwkVar.b(jSONObject, gkcVar);
        }
    }

    public static /* synthetic */ void a(lwk lwkVar, String str, AwesomeGetContainerData awesomeGetContainerData, String str2, gkc gkcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbadcea1", new Object[]{lwkVar, str, awesomeGetContainerData, str2, gkcVar, new Boolean(z)});
        } else {
            lwkVar.a(str, awesomeGetContainerData, str2, gkcVar, z);
        }
    }

    public lwk(lwz lwzVar) throws GatewayException {
        if (lwzVar == null) {
            throw new GatewayException("dataServiceEngineContext should not be null");
        }
        this.b = lwzVar;
        this.f30940a = lwzVar.b();
        this.c = new lwr(lwzVar);
    }

    @Override // tb.gke
    public void a(final JSONObject jSONObject, final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        lxl.b("gateway2.dataProcess", "start action:", jSONObject.getString("containerId"));
        a.a("dataProcess", "gateway2.dataProcess", "start action:" + jSONObject.getString("containerId"));
        if (lxp.a()) {
            lxs.a().a(new Runnable() { // from class: tb.lwk.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        lwk.a(lwk.this, jSONObject, gkcVar);
                    }
                }
            });
        } else {
            b(jSONObject, gkcVar);
        }
    }

    private void b(JSONObject jSONObject, gkc gkcVar) {
        AwesomeGetData awesomeGetData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c96ae738", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        lxl.b("gateway2.dataProcess", "start action in async thread");
        a.a("dataProcess", "gateway2.dataProcess", "start action in async thread");
        if (jSONObject == null) {
            a(jSONObject, (String) null, "actionParam is null", gkcVar);
            return;
        }
        try {
            awesomeGetData = (AwesomeGetData) jSONObject.get("dataModel");
        } catch (Throwable unused) {
            a.b("dataProcess", "param_error", "数据处理异常", "gateway2.dataProcess", "数据处理异常");
        }
        if (awesomeGetData != null && awesomeGetData.getContainers() != null && !awesomeGetData.getContainers().isEmpty()) {
            this.f30940a.a(awesomeGetData.getCurrentPageParams());
            this.f30940a.b(awesomeGetData.getCurrentUTParams());
            this.f30940a.c(awesomeGetData.getGlobalUTParams());
            this.c.a(awesomeGetData);
            for (String str : awesomeGetData.getContainers().keySet()) {
                a(str, jSONObject, awesomeGetData, gkcVar);
            }
            lxl.b("gateway2.dataProcess", "end action");
            a.a("dataProcess", "gateway2.dataProcess", "end action");
            return;
        }
        a(jSONObject, (String) null, "dataModel is empty", gkcVar);
    }

    private void a(String str, JSONObject jSONObject, AwesomeGetData awesomeGetData, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b78238d8", new Object[]{this, str, jSONObject, awesomeGetData, gkcVar});
            return;
        }
        AwesomeGetContainerData awesomeGetContainerData = awesomeGetData.getContainers().get(str);
        if (awesomeGetContainerData == null) {
            a(jSONObject, str, "responseModel不能为空", gkcVar);
            return;
        }
        boolean isBaseDataChange = awesomeGetContainerData.isBaseDataChange();
        boolean isDeltaDataChange = awesomeGetContainerData.isDeltaDataChange();
        if (!isBaseDataChange && !isDeltaDataChange) {
            a(jSONObject, str, "is not base or delta refresh", gkcVar);
            return;
        }
        AwesomeGetContainerData a2 = this.f30940a.a(str);
        if (this.f30940a.d(str) != null) {
            this.b.d().a(a2, awesomeGetContainerData);
        }
        a(a2, awesomeGetContainerData, str, jSONObject, gkcVar);
        a(str, jSONObject);
        a(str, jSONObject, this.f30940a);
        a(str, awesomeGetContainerData.getTotalData(), gkcVar);
        lxt.a(awesomeGetContainerData.getExt());
        a(str, this.f30940a.a(str), isDeltaDataChange ? "delta" : "base", gkcVar, false, jSONObject);
    }

    private void a(String str, JSONObject jSONObject, lwd lwdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be2e0e95", new Object[]{this, str, jSONObject, lwdVar});
            return;
        }
        lxg a2 = this.b.a(str);
        if (a2 == null) {
            return;
        }
        a2.b(lwdVar.a(str), jSONObject);
    }

    private void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else {
            if (this.b.c(str) == null) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    private void a(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2, String str, JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b3e363", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2, str, jSONObject, gkcVar});
            return;
        }
        a.a("dataProcess", "gateway2.dataProcess", "start mergeDelta containerId : " + str);
        boolean isBaseDataChange = awesomeGetContainerData2.isBaseDataChange();
        boolean isDeltaDataChange = awesomeGetContainerData2.isDeltaDataChange();
        if (isBaseDataChange) {
            a(awesomeGetContainerData, awesomeGetContainerData2, str);
        } else if (isDeltaDataChange) {
            b(awesomeGetContainerData, awesomeGetContainerData2, str);
        }
        this.f30940a.a(str, (AwesomeGetContainerInnerData) awesomeGetContainerData2.getBase(), a(str, this.b));
        this.f30940a.a(str, (AwesomeGetContainerInnerData) awesomeGetContainerData2.getDelta(), this.b.d().a(awesomeGetContainerData2));
        this.f30940a.a(str, awesomeGetContainerData2.getTotalData());
        a.a("dataProcess", "gateway2.dataProcess", "end mergeData, isDeltaRefresh : " + isDeltaDataChange);
    }

    private void a(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("696f2f5e", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2, str});
            return;
        }
        if (awesomeGetContainerData.getBaseData() == null || awesomeGetContainerData2.getPageNum() <= 0) {
            z = false;
        }
        if (z) {
            awesomeGetContainerData2.getBase().getSections().addAll(0, awesomeGetContainerData.getBaseData());
        }
        a(str, awesomeGetContainerData2);
        awesomeGetContainerData2.setTotalData(this.b.d().a(str, awesomeGetContainerData2, awesomeGetContainerData));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    private void b(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("482d061f", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2, str});
        } else if (awesomeGetContainerData == null || awesomeGetContainerData.getBaseData() == null) {
        } else {
            awesomeGetContainerData.getBase().setDataChange(false);
            awesomeGetContainerData2.setBase(awesomeGetContainerData.getBase());
            b(str, awesomeGetContainerData2);
            awesomeGetContainerData2.setTotalData(this.b.d().a(str, awesomeGetContainerData2, awesomeGetContainerData));
        }
    }

    private boolean a(String str, lwz lwzVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("339029f7", new Object[]{this, str, lwzVar})).booleanValue() : TextUtils.equals(str, lwzVar.g());
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    private void a(String str, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d486f888", new Object[]{this, str, awesomeGetContainerData});
        } else if (a(awesomeGetContainerData)) {
            lxw.a(str, awesomeGetContainerData.getPassParams());
        } else if (awesomeGetContainerData == null || awesomeGetContainerData.getBase() == null) {
        } else {
            awesomeGetContainerData.getBase().setPassParams(lxw.a(str));
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData] */
    private void b(String str, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b845e889", new Object[]{this, str, awesomeGetContainerData});
        } else if (awesomeGetContainerData == null) {
        } else {
            JSONObject a2 = lxw.a(str);
            if (b(awesomeGetContainerData)) {
                JSONObject passParams = awesomeGetContainerData.getDelta().getPassParams();
                if (a2 == null) {
                    a2 = passParams;
                } else if (passParams != null && !passParams.isEmpty()) {
                    a2.putAll(passParams);
                }
                lxw.a(str, a2);
            }
            awesomeGetContainerData.getBase().setPassParams(a2);
        }
    }

    private boolean a(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b1c542", new Object[]{this, awesomeGetContainerData})).booleanValue();
        }
        if (awesomeGetContainerData != null && awesomeGetContainerData.getExt() != null) {
            return awesomeGetContainerData.getExt().getBooleanValue("updatePassParams");
        }
        return false;
    }

    private boolean b(AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3996383", new Object[]{this, awesomeGetContainerData})).booleanValue();
        }
        if (awesomeGetContainerData != null && awesomeGetContainerData.getDeltaExt() != null) {
            return awesomeGetContainerData.getDeltaExt().getBooleanValue("updatePassParams");
        }
        return false;
    }

    private void a(String str, AwesomeGetContainerData awesomeGetContainerData, String str2, gkc gkcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b073ad1", new Object[]{this, str, awesomeGetContainerData, str2, gkcVar, new Boolean(z)});
        } else {
            a(str, awesomeGetContainerData, str2, gkcVar, z, (JSONObject) null);
        }
    }

    private void a(String str, AwesomeGetContainerData awesomeGetContainerData, String str2, gkc gkcVar, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e55e3f", new Object[]{this, str, awesomeGetContainerData, str2, gkcVar, new Boolean(z), jSONObject});
        } else if (gkcVar == null) {
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("containerId", (Object) str);
            jSONObject2.put("containerModel", (Object) awesomeGetContainerData);
            jSONObject2.put("dataChangeType", (Object) str2);
            jSONObject2.put("dataSourceType", (Object) (z ? "download" : "remote"));
            lwv.a(jSONObject2, lwv.a(jSONObject));
            gkcVar.a("finish", jSONObject2, null);
        }
    }

    private void a(JSONObject jSONObject, String str, String str2, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("399516ad", new Object[]{this, jSONObject, str, str2, gkcVar});
        } else if (gkcVar == null) {
        } else {
            a.b("dataProcess", "param_error", "网关2.0数据处理，参数异常", "gateway2.dataProcess", str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("containerId", (Object) str);
            jSONObject2.put("errorCode", (Object) 1);
            jSONObject2.put("errorMsg", (Object) str2);
            jSONObject2.put("dataSourceType", "remote");
            lwv.a(jSONObject2, lwv.a(jSONObject));
            gkcVar.a("finish", jSONObject2, null);
        }
    }

    private void a(final String str, List<SectionModel> list, final gkc gkcVar) {
        lxg a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5cc834", new Object[]{this, str, list, gkcVar});
        } else if (list == null || list.isEmpty() || str == null || TextUtils.isEmpty(str) || (a2 = this.b.a(str)) == null) {
        } else {
            a2.a(list, new lwh() { // from class: tb.lwk.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.lwh
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    lwk lwkVar = lwk.this;
                    lwk.a(lwkVar, str, lwk.a(lwkVar).a(str), "base", gkcVar, true);
                    a.a("dataProcess", "gateway2.dataProcess", "template download completed trigger successfully. containerId : " + str);
                }
            });
        }
    }
}
