package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.request.base.c;
import com.taobao.android.tlog.protocol.model.request.base.d;
import com.taobao.android.tlog.protocol.model.request.base.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jhs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Boolean f29563a;
    public Boolean b;
    public String c;
    public String d;
    public Map<String, d> e;
    public Map<String, c> f;
    private String g = "TLOG.Protocol.LogConfigRequest";

    static {
        kge.a(-37097542);
    }

    public void a(JSON json, jhg jhgVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a32ca6e", new Object[]{this, json, jhgVar});
            return;
        }
        JSONObject jSONObject = (JSONObject) json;
        if (jSONObject.containsKey("enable")) {
            this.f29563a = jSONObject.getBoolean("enable");
        }
        if (jSONObject.containsKey("destroy")) {
            this.b = jSONObject.getBoolean("destroy");
        }
        if (jSONObject.containsKey("level")) {
            this.c = jSONObject.getString("level");
        }
        if (jSONObject.containsKey("module")) {
            this.d = jSONObject.getString("module");
        }
        if (jSONObject.containsKey("appenders")) {
            this.e = b(jSONObject.getJSONObject("appenders"));
        }
        if (!jSONObject.containsKey("loggers")) {
            return;
        }
        this.f = a(jSONObject.getJSONObject("loggers"));
    }

    private Map<String, c> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObject2 = (JSONObject) entry.getValue();
            c cVar = new c();
            if (jSONObject2 != null) {
                if (jSONObject2.containsKey("appender")) {
                    cVar.d = jSONObject2.getString("appender");
                }
                if (jSONObject2.containsKey("level")) {
                    cVar.c = jSONObject2.getString("level");
                }
                if (jSONObject2.containsKey("module")) {
                    cVar.f15569a = jSONObject2.getString("module");
                }
                if (jSONObject2.containsKey("tag")) {
                    cVar.b = jSONObject2.getString("tag");
                }
            }
            hashMap.put(key, cVar);
        }
        return hashMap;
    }

    private Map<String, d> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("592eda1c", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            String key = entry.getKey();
            JSONObject jSONObject2 = (JSONObject) entry.getValue();
            d dVar = new d();
            if (jSONObject2 != null) {
                if (jSONObject2.containsKey("fileName")) {
                    dVar.b = jSONObject2.getString("fileName");
                }
                if (jSONObject2.containsKey("filePattern")) {
                    dVar.c = jSONObject2.getString("filePattern");
                }
                if (jSONObject2.containsKey("level")) {
                    dVar.e = jSONObject2.getString("level");
                }
                if (jSONObject2.containsKey("name")) {
                    dVar.f15570a = jSONObject2.getString("name");
                }
                if (jSONObject2.containsKey("pattern")) {
                    dVar.d = jSONObject2.getString("pattern");
                }
                if (jSONObject2.containsKey("rollingPolicy")) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("rollingPolicy");
                    e eVar = new e();
                    if (jSONObject3.containsKey("maxHistory")) {
                        eVar.f15571a = jSONObject3.getInteger("maxHistory").intValue();
                    }
                    if (jSONObject3.containsKey("totalSizeCap")) {
                        eVar.b = jSONObject3.getString("totalSizeCap");
                    }
                    dVar.f = eVar;
                }
                hashMap.put(key, dVar);
            }
        }
        return hashMap;
    }
}
