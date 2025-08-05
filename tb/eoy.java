package tb;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class eoy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String C_TYPE_DINAMICX = "dinamicx";
    public static final String C_TYPE_NATIVE = "native";
    public static final String C_TYPE_WEEX = "weex";

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, String> f27501a;

    static {
        kge.a(-824663854);
        emu.a("com.taobao.android.detail.datasdk.factory.ultron.protocol.UltronUtils");
    }

    public static String a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41ebe234", new Object[]{iDMComponent});
        }
        if (iDMComponent == null || TextUtils.isEmpty(iDMComponent.getType())) {
            epp.a("UltronUtils", "组件Key解析异常 ");
            return "";
        }
        String[] split = iDMComponent.getType().split("\\$");
        if (split.length != 2) {
            epp.a("UltronUtils", "组件Key解析异常2 ");
            return "";
        }
        return split[0];
    }

    public static String b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("759a0cf5", new Object[]{iDMComponent});
        }
        if (iDMComponent == null || TextUtils.isEmpty(iDMComponent.getType())) {
            epp.a("UltronUtils", "组件rule解析异常 ");
            return "";
        }
        String[] split = iDMComponent.getType().split("\\$");
        if (split.length != 2) {
            epp.a("UltronUtils", "组件rule解析异常2 ");
            return "";
        }
        return split[1];
    }

    public static void a(View view, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43a25ece", new Object[]{view, jSONObject, new Boolean(z)});
        } else if (view == null || jSONObject == null || jSONObject.size() <= 0) {
        } else {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(view.getContext().getResources().getResourceEntryName(view.getId()), (Object) jSONObject);
                rly.a().a(view, jSONObject2.toJSONString(), z);
            } catch (Throwable unused) {
                epp.a("UltronUtils", "registeSpecilView content : " + jSONObject);
            }
        }
    }

    public static JSONObject a(JSONObject jSONObject) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        if (jSONObject == null || (map = f27501a) == null || map.isEmpty()) {
            Log.e("UltronUtils", "styleObject is null or style dict is null");
            return jSONObject;
        }
        JSONObject jSONObject2 = (JSONObject) jSONObject.clone();
        a(jSONObject2, f27501a);
        return jSONObject2;
    }

    private static void a(JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37335efd", new Object[]{jSONObject, map});
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap(32);
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String str = map.get(entry.getKey());
            if (str != null) {
                hashMap.put(str, entry.getValue());
                arrayList.add(entry.getKey());
            }
            if (entry.getValue() instanceof JSONArray) {
                a((JSONArray) entry.getValue(), map);
            } else if (entry.getValue() instanceof JSONObject) {
                a((JSONObject) entry.getValue(), map);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONObject.remove((String) it.next());
        }
        jSONObject.putAll(hashMap);
        arrayList.clear();
        hashMap.clear();
    }

    private static void a(JSONArray jSONArray, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10163f5", new Object[]{jSONArray, map});
        } else if (jSONArray != null && jSONArray.size() > 0) {
            for (int i = 0; i < jSONArray.size(); i++) {
                if (jSONArray.get(i) instanceof JSONObject) {
                    a((JSONObject) jSONArray.get(i), map);
                } else if (jSONArray.get(i) instanceof JSONArray) {
                    a((JSONArray) jSONArray.get(i), map);
                }
            }
        }
    }
}
