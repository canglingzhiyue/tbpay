package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.homepage.d;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class oog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2043137956);
    }

    public static Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
        }
        JSONObject c = c();
        if (c == null) {
            lap.a("smartLoading", "getBucket", "homeGlobalAbTest == null");
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bucket", c.getString("bucket"));
        return hashMap;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            ooh.a(c());
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        JSONObject c = c();
        if (c == null) {
            lap.a("smartLoading", "getValue", "homeGlobalAbTest == null");
            return null;
        }
        return c.getString(str);
    }

    private static JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[0]);
        }
        String m = oqc.a().m();
        ope f = d.f(m);
        if (f == null) {
            lap.a("smartLoading", "getHomeGlobalAbTest", "recmdDataSource == null");
            return null;
        }
        AwesomeGetContainerData b = f.b(m);
        if (b == null) {
            lap.a("smartLoading", "getHomeGlobalAbTest", "containerData == null");
            return null;
        }
        JSONObject ext = b.getExt();
        if (ext == null) {
            lap.a("smartLoading", "getHomeGlobalAbTest", "ext == null");
            return null;
        }
        return ext.getJSONObject("homeGlobalABTest");
    }
}
