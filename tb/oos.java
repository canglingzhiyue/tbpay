package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.home.component.utils.e;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.List;

/* loaded from: classes8.dex */
public class oos implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ope f32232a;

    static {
        kge.a(2074476572);
        kge.a(1464465151);
    }

    public oos(ope opeVar) throws GatewayException {
        if (opeVar == null) {
            throw new GatewayException("RarecmdGatewayDataSource should not be null");
        }
        this.f32232a = opeVar;
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("containerId");
            JSONObject jSONObject2 = jSONObject.getJSONObject("deleteModel");
            String[] strArr = new String[4];
            strArr[0] = "start action:";
            strArr[1] = string;
            strArr[2] = ", ";
            strArr[3] = jSONObject2 == null ? "null" : jSONObject2.getString("sectionBizCode");
            e.c("gateway2.dataDelete", strArr);
            if (jSONObject2 == null) {
                a(gkcVar, 1, "deleteModel is null");
                return;
            }
            AwesomeGetContainerData b = this.f32232a.b(string);
            List<SectionModel> list = null;
            List<SectionModel> totalData = b == null ? null : b.getTotalData();
            if (totalData == null || totalData.isEmpty()) {
                a(gkcVar, 4, "containerModel is empty");
                return;
            }
            if (a(jSONObject2, totalData)) {
                try {
                    AwesomeGetContainerInnerData c = this.f32232a.c(string);
                    List<SectionModel> list2 = c == null ? null : c.sections;
                    if (list2 != null) {
                        list2.remove(jSONObject2);
                    }
                    AwesomeGetContainerInnerData d = this.f32232a.d(string);
                    if (d != null) {
                        list = d.sections;
                    }
                    if (list != null) {
                        list.remove(jSONObject2);
                    }
                } catch (Throwable th) {
                    ksp.a("gateway2.dataDelete", "delete base or delta data exception.", th);
                }
                a(gkcVar, b);
            } else {
                a(gkcVar, 4, "delete failed");
            }
            e.c("gateway2.dataDelete", "end action");
        }
    }

    private boolean a(JSONObject jSONObject, List<SectionModel> list) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("883d787d", new Object[]{this, jSONObject, list})).booleanValue();
        }
        if (list == null || list.isEmpty() || jSONObject == null) {
            return false;
        }
        boolean remove = list.remove(jSONObject);
        if (remove) {
            return remove;
        }
        String string = jSONObject.getString("sectionBizCode");
        return (StringUtils.isEmpty(string) || (a2 = opb.a(string, list)) == -1) ? remove : list.remove(a2) != null;
    }

    private void a(gkc gkcVar, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7c40b5", new Object[]{this, gkcVar, awesomeGetContainerData});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("containerModel", (Object) awesomeGetContainerData);
        gkcVar.a("success", jSONObject, null);
    }

    private void a(gkc gkcVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2162af4", new Object[]{this, gkcVar, new Integer(i), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", (Object) Integer.valueOf(i));
        jSONObject.put("errorMsg", (Object) str);
        gkcVar.a("fail", jSONObject, null);
    }
}
