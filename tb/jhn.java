package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tlog.protocol.model.reply.base.a;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jhn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f29559a = "TLOG.Protocol.UserDefineUploadReply";
    private String b = "REPLY";

    static {
        kge.a(-1257994003);
    }

    public String a(jhg jhgVar, a aVar) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c72f7007", new Object[]{this, jhgVar, aVar});
        }
        if (aVar == null) {
            return null;
        }
        Map<String, String> a2 = jhe.a(jhgVar, aVar);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (jhgVar.k != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("content", new String(jhgVar.k, "utf-8"));
            jSONObject2.put("forward", (Object) linkedHashMap);
        }
        jSONObject2.put("version", (Object) jhb.version);
        jSONObject2.put("type", (Object) this.b);
        jSONObject2.put("headers", (Object) a2);
        jSONObject2.put("data", (Object) jSONObject);
        return jhf.a(jSONObject2.toString());
    }
}
