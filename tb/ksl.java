package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.gateway.executor.response.AwesomeGetContainerData;
import com.taobao.homepage.utils.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class ksl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GATEWAY_SP_FILE = "home_gateway";
    public static final String TYPE_BASE = "base";
    public static final String TYPE_DELTA = "delta";
    private JSONObject b;
    private JSONObject c;
    private String d;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, AwesomeGetContainerData> f30288a = new ConcurrentHashMap(16);
    private List<String> e = new ArrayList();

    static {
        kge.a(-871168002);
    }

    public ksl(String str, List<String> list) {
        a(str, list);
    }

    private void a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, str, list});
            return;
        }
        this.d = str;
        this.e.clear();
        this.e.addAll(list);
        if (!this.e.isEmpty()) {
            for (String str2 : this.e) {
                this.f30288a.put(str2, new AwesomeGetContainerData());
            }
        }
        this.c = new JSONObject();
        this.c.put("homepage_version", (Object) "v5");
        this.b = new JSONObject();
        this.b.put(ood.HOME_BUCKETS, (Object) "tsp2189_11196_tsp2218_11203");
        this.b.put("resultVersion", (Object) "v5");
        this.b.put("homepage_bucket", (Object) "tsp2189_11196");
        this.b.put(g.RANGER_BUCKETS_KEY, (Object) "tsp2189_11196_tsp2218_11203");
        this.b.put("containerId", (Object) "main");
        this.b.put("spm-cnt", (Object) "a2141.1.1.1");
    }

    public AwesomeGetContainerData a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerData) ipChange.ipc$dispatch("a9a9958b", new Object[]{this, str});
        }
        AwesomeGetContainerData awesomeGetContainerData = this.f30288a.get(str);
        if (awesomeGetContainerData != null) {
            return awesomeGetContainerData;
        }
        AwesomeGetContainerData awesomeGetContainerData2 = new AwesomeGetContainerData();
        this.f30288a.put(str, awesomeGetContainerData2);
        return awesomeGetContainerData2;
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.b;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this}) : this.c;
    }
}
