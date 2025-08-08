package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class fkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2127033300);
    }

    public static void a(JSONArray jSONArray, fmd fmdVar) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a66c4663", new Object[]{jSONArray, fmdVar});
        } else if (jSONArray != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String string = jSONObject.getString(fin.EVENT_KEY);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                    String string2 = jSONObject.getString("target");
                    if (!StringUtils.isEmpty(string2)) {
                        for (String str : string2.split(",")) {
                            if (StringUtils.equals(str, "weexMain")) {
                                JSONObject a2 = a(string, jSONObject2);
                                if (a2 != null) {
                                    arrayList.add(a2);
                                }
                            } else if (StringUtils.equals(str, "weexNavi")) {
                                JSONObject a3 = a(string, jSONObject2);
                                if (a3 != null) {
                                    arrayList2.add(a3);
                                }
                            } else if (StringUtils.equals(str, "default")) {
                                JSONObject a4 = a(string, jSONObject2);
                                if (a4 != null) {
                                    arrayList.add(a4);
                                }
                                JSONObject a5 = a(string, jSONObject2);
                                if (a5 != null) {
                                    arrayList2.add(a5);
                                }
                            }
                        }
                    }
                }
            }
            a(arrayList, fmdVar);
            b(arrayList2, fmdVar);
        }
    }

    private static JSONObject a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9490f01e", new Object[]{str, jSONObject});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(fin.EVENT_KEY, (Object) str);
        jSONObject2.put("params", (Object) jSONObject);
        return jSONObject2;
    }

    private static void a(List<JSONObject> list, fmd fmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("685af12c", new Object[]{list, fmdVar});
        } else if (list == null || list.isEmpty() || fmdVar == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("params", (Object) list);
            fmdVar.a("clientActionCallBack", jSONObject);
        }
    }

    private static void b(List<JSONObject> list, fmd fmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91aad5ad", new Object[]{list, fmdVar});
        } else if (list == null || list.isEmpty() || fmdVar == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("params", (Object) list);
            fmdVar.b("clientActionCallBack", jSONObject);
        }
    }
}
