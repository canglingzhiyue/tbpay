package tb;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jhv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f29566a;
    public String b;
    public Map<String, String> c;
    private String d = "TLOG.Protocol.UserDefineUploadRequest";

    static {
        kge.a(1346178231);
    }

    public void a(JSON json, jhg jhgVar) throws Exception {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a32ca6e", new Object[]{this, json, jhgVar});
            return;
        }
        JSONObject jSONObject2 = (JSONObject) json;
        if (jSONObject2.containsKey("bizType")) {
            this.f29566a = jSONObject2.getString("bizType");
        }
        if (jSONObject2.containsKey("bizCode")) {
            this.b = jSONObject2.getString("bizCode");
        }
        if (!jSONObject2.containsKey("extraInfo") || (jSONObject = jSONObject2.getJSONObject("extraInfo")) == null) {
            return;
        }
        try {
            if (jSONObject.size() <= 0) {
                return;
            }
            this.c = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                this.c.put(entry.getKey(), (String) entry.getValue());
            }
        } catch (Exception e) {
            Log.e(this.d, "user define upload error", e);
        }
    }
}
