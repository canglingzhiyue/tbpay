package com.taobao.android.detail.ttdetail.skeleton.recommend;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.ComponentViewMeta;
import java.util.HashMap;
import java.util.Map;
import tb.eyx;
import tb.eza;
import tb.kge;
import tb.lfm;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f10943a;
    private eyx b;
    private Map<String, eza> c = new HashMap();

    static {
        kge.a(1240215046);
    }

    public c(Context context, eyx eyxVar) {
        this.f10943a = context;
        this.b = eyxVar;
        this.c.put(lfm.PARSER_ID, new lfm(context, eyxVar));
    }

    public JSONObject a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("836310b0", new Object[]{this, jSONArray});
        }
        JSONObject jSONObject = new JSONObject();
        int size = jSONArray.size();
        for (int i = 0; i < size; i++) {
            final JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            JSONArray jSONArray2 = jSONObject2.getJSONArray("type");
            if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                int size2 = jSONArray2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    final String string = jSONObject2.getString("name");
                    final String string2 = jSONObject2.getString("containerType");
                    if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2)) {
                        jSONObject.put(jSONArray2.getString(i2), (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.skeleton.recommend.RecommendDataEngine$1
                            {
                                put("name", (Object) string);
                                put("type", (Object) string2);
                                put("version", (Object) jSONObject2.getString("version"));
                                put("url", (Object) jSONObject2.getString("url"));
                            }
                        });
                    }
                }
            }
        }
        return jSONObject;
    }

    public Map<String, ComponentViewMeta> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{this, jSONObject});
        }
        HashMap hashMap = null;
        if (jSONObject == null) {
            return null;
        }
        for (String str : jSONObject.keySet()) {
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            hashMap.put(str, new ComponentViewMeta(jSONObject.getJSONObject(str)));
        }
        return hashMap;
    }

    public <O> O a(String str, JSONObject jSONObject) {
        eza ezaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (O) ipChange.ipc$dispatch("abaf35f4", new Object[]{this, str, jSONObject});
        }
        if (!StringUtils.isEmpty(str) && jSONObject != null && (ezaVar = this.c.get(str)) != null) {
            return (O) ezaVar.a(jSONObject);
        }
        return null;
    }
}
