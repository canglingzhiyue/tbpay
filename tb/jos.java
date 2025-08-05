package tb;

import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class jos {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f29665a;

    static {
        kge.a(894302730);
        ArrayList arrayList = new ArrayList();
        f29665a = arrayList;
        arrayList.add("performanceStage");
        f29665a.add(LinkageUtils.PolicyType.RULE);
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2bba2a8", new Object[]{jSONObject, jSONObject2, jSONObject3});
        }
        if (jSONObject2 != null && jSONObject3 != null) {
            for (String str : f29665a) {
                jSONObject3.remove(str);
            }
            try {
                JSONObject a2 = jot.a(jSONObject2, jSONObject3);
                b(jSONObject, jSONObject2, jSONObject3);
                return a2;
            } catch (Exception e) {
                jqg.a("UltronMergeGlobalException", e.getMessage());
            }
        }
        return jSONObject3;
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb649067", new Object[]{jSONObject, jSONObject2, jSONObject3});
            return;
        }
        JSONObject a2 = a(jSONObject);
        if (a2 == null) {
            return;
        }
        jot.a(a2, jSONObject2, jSONObject3);
    }

    private static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("global");
        if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject(LinkageUtils.PolicyType.RULE)) != null) {
            return jSONObject2.getJSONObject("globalMerge");
        }
        return null;
    }
}
