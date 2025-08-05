package tb;

import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class fhf extends fij {
    public static final String EVENT_KEY = "openShare";

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f27940a;
    public a b;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f27941a;
        public List<String> b;
        public String c;
        public String d;
        public String e;

        static {
            kge.a(536297057);
        }
    }

    static {
        kge.a(-1644131757);
    }

    public fhf(JSONObject jSONObject, Object obj) {
        super(obj);
        if (jSONObject == null) {
            return;
        }
        this.b = new a();
        JSONObject jSONObject2 = jSONObject.getJSONObject("shareItemModel");
        if (jSONObject2 != null) {
            this.b.e = jSONObject2.getString("originPrice");
            this.b.f27941a = jSONObject2.getString("itemTitle");
            this.b.d = jSONObject2.getString("itemId");
            this.b.c = jSONObject2.getString("price");
            if (jSONObject2.getJSONArray("images") != null) {
                this.b.b = JSONObject.parseArray(jSONObject2.getJSONArray("images").toJSONString(), String.class);
            }
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("detailShareParams");
        if (jSONObject3 == null) {
            return;
        }
        this.f27940a = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
            this.f27940a.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
    }
}
