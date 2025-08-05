package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ctd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f26508a;
    public JSONObject b;
    public String c;
    public boolean d;
    public int e;

    static {
        kge.a(1332708589);
    }

    public com.alibaba.fastjson.JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject jSONObject = this.b;
        if (jSONObject == null) {
            return null;
        }
        try {
            return JSON.parseObject(jSONObject.toString());
        } catch (Exception unused) {
            return null;
        }
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        com.alibaba.fastjson.JSONObject a2 = a();
        HashMap hashMap = new HashMap();
        if (a2 != null) {
            for (Map.Entry<String, Object> entry : a2.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        hashMap.put("picType", "historyPic");
        return hashMap;
    }
}
