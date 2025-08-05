package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.business.permission.c;
import com.taobao.homepage.datasource.OnDataSourceUpdatedListener;
import com.taobao.homepage.datasource.b;
import com.taobao.homepage.utils.HomePageUtility;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class ktr implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, String> b;

    /* renamed from: a  reason: collision with root package name */
    public final String f30310a;
    private ksj c = new ksj(HomePageUtility.b(), HomePageUtility.a(h()));

    static {
        kge.a(-1850293492);
        kge.a(-477511663);
        b = new HashMap();
    }

    public ktr(OnDataSourceUpdatedListener onDataSourceUpdatedListener, String str) {
        this.f30310a = str;
    }

    @Override // com.taobao.homepage.datasource.b
    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        JSONObject a2 = this.c.a();
        if (a2 == null) {
            return null;
        }
        try {
            return (Map) JSON.parseObject(JSON.toJSONString(a2), new TypeReference<HashMap<String, String>>() { // from class: tb.ktr.1
            }, new Feature[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.taobao.homepage.datasource.b
    public Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        JSONObject c = this.c.c(HomePageUtility.a());
        if (c == null) {
            return null;
        }
        try {
            return (Map) JSON.parseObject(JSON.toJSONString(c), new TypeReference<HashMap<String, Object>>() { // from class: tb.ktr.2
            }, new Feature[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.taobao.homepage.datasource.b
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        JSONObject b2 = this.c.b();
        if (b2 == null) {
            return null;
        }
        return JSON.toJSONString(b2);
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this});
        }
        ksj ksjVar = this.c;
        if (ksjVar == null) {
            return null;
        }
        return ksjVar.b(HomePageUtility.a());
    }

    @Override // com.taobao.homepage.datasource.b
    public JSONObject e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this}) : this.c.d(HomePageUtility.a());
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        if (!b.containsKey(this.f30310a)) {
            b.put(this.f30310a, c.a(i(), (String) null));
        }
        return b.get(this.f30310a);
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        String g = g();
        return (d() == null ? false : HomePageUtility.a(d().getString("multiTabRecommend"))) || (g == null ? false : g.startsWith("v5"));
    }

    private String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        return "lastResultVersion_" + this.f30310a;
    }
}
