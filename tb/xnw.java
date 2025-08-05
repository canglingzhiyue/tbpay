package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002J\u001a\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0014"}, d2 = {"Lcom/taobao/mytaobao/dataservice/utils/DiffProcessor;", "", "()V", "calcDiff", "", "hierarchyData", "Lcom/alibaba/fastjson/JSONObject;", "newData", "Lcom/taobao/mytaobao/dataservice/utils/DataMerger;", iar.FIELD_OLD_DATA, "generateDiffLoadIdentify", "", AliFestivalWVPlugin.PARAMS_MODULE_NAME, "isHierarchyDifferent", "", "newHierarchy", "oldHierarchy", "isUIDataDifferent", "newOriginData", "oldOriginData", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xnw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-451186743);
    }

    public final void a(JSONObject hierarchyData, xnv newData, xnv xnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45751fe8", new Object[]{this, hierarchyData, newData, xnvVar});
            return;
        }
        q.c(hierarchyData, "hierarchyData");
        q.c(newData, "newData");
        for (String moduleName : hierarchyData.keySet()) {
            q.a((Object) moduleName, "moduleName");
            JSONObject b = newData.b(moduleName);
            if (b == null) {
                q.a();
            }
            JSONObject jSONObject = null;
            JSONObject b2 = xnvVar != null ? xnvVar.b(moduleName) : null;
            if (a(b, b2)) {
                b.put((JSONObject) "diffLoadIdentify", a(moduleName));
            } else {
                JSONObject newOriginData = hierarchyData.getJSONObject(moduleName);
                if (xnvVar != null) {
                    jSONObject = xnvVar.a(moduleName);
                }
                q.a((Object) newOriginData, "newOriginData");
                if (b(newOriginData, jSONObject)) {
                    b.put((JSONObject) "diffLoadIdentify", a(moduleName));
                } else {
                    JSONObject jSONObject2 = b;
                    if (b2 == null) {
                        q.a();
                    }
                    jSONObject2.put((JSONObject) "diffLoadIdentify", (String) b2.get("diffLoadIdentify"));
                }
            }
        }
    }

    private final boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{this, jSONObject, jSONObject2})).booleanValue() : jSONObject2 == null || !q.a((Object) jSONObject.getString("name"), (Object) jSONObject2.getString("name")) || !q.a((Object) jSONObject.getString("url"), (Object) jSONObject2.getString("url")) || !q.a((Object) jSONObject.getString("version"), (Object) jSONObject2.getString("version")) || !q.a((Object) jSONObject.getString("containerType"), (Object) jSONObject2.getString("containerType"));
    }

    private final boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("525e83ad", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject2 == null || (jSONObject3 = jSONObject2.getJSONObject("fields")) == null) {
            return true;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("fields");
        if (jSONObject4 == null) {
            q.a();
        }
        return !q.a(jSONObject3, jSONObject4);
    }

    public final String a(String moduleName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, moduleName});
        }
        q.c(moduleName, "moduleName");
        return moduleName + System.currentTimeMillis();
    }
}
