package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData;
import java.util.List;

/* loaded from: classes7.dex */
public class lwj implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lwz f30939a;

    static {
        kge.a(2116206011);
        kge.a(1464465151);
    }

    public lwj(lwz lwzVar) throws GatewayException {
        if (lwzVar == null) {
            throw new GatewayException("dataServiceEngineContext should not be null");
        }
        this.f30939a = lwzVar;
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        lwd b = this.f30939a.b();
        if (jSONObject == null || b == null) {
            return;
        }
        String b2 = b(jSONObject);
        if (TextUtils.isEmpty(b2)) {
            return;
        }
        JSONObject a2 = a(jSONObject);
        if (a2 == null) {
            a(jSONObject, b2, gkcVar, 1, "deleteModel is null");
            return;
        }
        lxl.b("NewFaceDataDeleteAction", "start action:", b2, ", ", a2.getString("sectionBizCode"));
        List<SectionModel> a3 = a(b, b2);
        if (a3 == null || a3.isEmpty()) {
            a(jSONObject, b2, gkcVar, 4, "containerModel is empty");
            return;
        }
        if (a(a2, a3)) {
            a(b.b(b2), a2);
            a(b.c(b2), a2);
            a(jSONObject, b2, gkcVar, b.a(b2));
        } else {
            a(jSONObject, b2, gkcVar, 4, "delete failed");
        }
        lxl.b("NewFaceDataDeleteAction", "end action");
    }

    private void a(AwesomeGetContainerInnerData awesomeGetContainerInnerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde87aa8", new Object[]{this, awesomeGetContainerInnerData, jSONObject});
            return;
        }
        List<SectionModel> sections = awesomeGetContainerInnerData == null ? null : awesomeGetContainerInnerData.getSections();
        if (sections == null) {
            return;
        }
        a(jSONObject, sections);
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject}) : jSONObject.getJSONObject("deleteModel");
    }

    private List<SectionModel> a(lwd lwdVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d94da31e", new Object[]{this, lwdVar, str});
        }
        AwesomeGetContainerData a2 = lwdVar.a(str);
        if (a2 != null) {
            return a2.getTotalData();
        }
        return null;
    }

    private String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{this, jSONObject});
        }
        String[] a2 = lwi.a(jSONObject);
        if (a2 != null && a2.length == 1) {
            return a2[0];
        }
        return null;
    }

    private boolean a(JSONObject jSONObject, List<SectionModel> list) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("883d787d", new Object[]{this, jSONObject, list})).booleanValue();
        }
        boolean remove = list.remove(jSONObject);
        if (remove) {
            return remove;
        }
        String string = jSONObject.getString("sectionBizCode");
        return (TextUtils.isEmpty(string) || (a2 = lwe.a(string, list)) == -1) ? remove : list.remove(a2) != null;
    }

    private void a(JSONObject jSONObject, String str, gkc gkcVar, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8615e79", new Object[]{this, jSONObject, str, gkcVar, awesomeGetContainerData});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("containerModel", (Object) awesomeGetContainerData);
        jSONObject2.put("containerId", (Object) str);
        jSONObject2.put("dataSourceType", "remote");
        lwv.a(jSONObject2, lwv.a(jSONObject));
        gkcVar.a("success", jSONObject2, null);
    }

    private void a(JSONObject jSONObject, String str, gkc gkcVar, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aec41ca", new Object[]{this, jSONObject, str, gkcVar, new Integer(i), str2});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorCode", (Object) Integer.valueOf(i));
        jSONObject2.put("errorMsg", (Object) str2);
        jSONObject2.put("containerId", (Object) str);
        jSONObject2.put("dataSourceType", "remote");
        lwv.a(jSONObject2, lwv.a(jSONObject));
        gkcVar.a("fail", jSONObject2, null);
    }
}
