package tb;

import com.alibaba.android.ultron.event.base.e;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bjw extends bjx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FIELD_KEY_ERROR_FIELDS = "errorFields";
    public static final String FIELD_KEY_SUCCESS_FIELDS = "successFields";

    static {
        kge.a(-634607312);
    }

    @Override // tb.bjx
    public boolean f(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("332ef922", new Object[]{this, eVar})).booleanValue();
        }
        if (eVar.d() == null || eVar.d().getFields() == null || eVar.d().getFields().containsKey("asyncRefreshExecuted")) {
            return false;
        }
        eVar.d().getFields().put("asyncRefreshExecuted", "true");
        return true;
    }

    @Override // tb.bjx
    public JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            bkd.a("AsyncRefreshV2Subscribe", "buildCombineEvent", "fields is none");
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "refreshMtopV2");
        jSONObject2.put("fields", (Object) bkg.a(jSONObject));
        a(jSONObject2, "success", "updateAsyncStatusV2", (JSONObject) null);
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject != null && jSONObject.get(FIELD_KEY_SUCCESS_FIELDS) != null) {
            jSONObject3.put("updateFields", jSONObject.get(FIELD_KEY_SUCCESS_FIELDS));
        } else {
            jSONObject3.put("updateFields", "@data{data}");
        }
        a(jSONObject2, "success", "updateComponentV2", jSONObject3);
        a(jSONObject2, "fail", "updateAsyncStatusV2", (JSONObject) null);
        JSONObject jSONObject4 = new JSONObject();
        if (jSONObject != null && jSONObject.get(FIELD_KEY_ERROR_FIELDS) != null) {
            jSONObject4.put("updateFields", jSONObject.get(FIELD_KEY_ERROR_FIELDS));
            a(jSONObject2, "fail", "updateComponentV2", jSONObject4);
        }
        return jSONObject2;
    }
}
