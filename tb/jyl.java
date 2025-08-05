package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import java.util.Map;

/* loaded from: classes6.dex */
public class jyl implements jyo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1898021781);
        kge.a(-82494792);
    }

    @Override // tb.jyo
    public String a(BaseSearchResult baseSearchResult) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1b3c4590", new Object[]{this, baseSearchResult}) : baseSearchResult.getExtMod(JarvisConstant.KEY_JARVIS_CONTEXT);
    }

    @Override // tb.jyo
    public String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject}) : jSONObject.getString("scene");
    }

    @Override // tb.jyo
    public jyq b(JSONObject jSONObject) {
        jyj a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jyq) ipChange.ipc$dispatch("c3a397bd", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(JarvisConstant.KEY_JARVIS_TRIGGER);
        if (jSONObject2 == null || jSONObject2.isEmpty()) {
            return null;
        }
        jyq jyqVar = new jyq();
        for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null && (a2 = jyqVar.a(key)) != null) {
                a(value, a2);
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject(JarvisConstant.KEY_JARVIS_TRIGGER_OPTION);
        if (jSONObject3 == null) {
            return jyqVar;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("expose");
        if (jSONObject4 != null) {
            jyqVar.f29863a.b = jSONObject4.getIntValue("batchNum");
        }
        JSONObject jSONObject5 = jSONObject3.getJSONObject("idle");
        if (jSONObject5 != null) {
            jyqVar.b.b = jSONObject5.getIntValue("idleSeconds");
        }
        JSONObject jSONObject6 = jSONObject3.getJSONObject("stopScroll");
        if (jSONObject6 != null) {
            jyqVar.d.c = jSONObject6.getIntValue("interval_pos");
            jyqVar.d.b = jSONObject6.getIntValue("interval_time");
        }
        return jyqVar;
    }

    private void a(Object obj, jyj jyjVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df63f5d9", new Object[]{this, obj, jyjVar});
        } else if (obj instanceof String) {
            jyjVar.f29862a.add((String) obj);
        } else if (!(obj instanceof JSONArray)) {
        } else {
            while (true) {
                JSONArray jSONArray = (JSONArray) obj;
                if (i >= jSONArray.size()) {
                    return;
                }
                jyjVar.f29862a.add(jSONArray.getString(i));
                i++;
            }
        }
    }
}
