package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class jvg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HashMap<String, String> c;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, Long> f29812a = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, JSONObject> d = new ConcurrentHashMap<>();

    static {
        kge.a(728822653);
    }

    public ConcurrentHashMap<String, JSONObject> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("f779de7e", new Object[]{this}) : this.d;
    }

    public ConcurrentHashMap<String, Long> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("ba6647dd", new Object[]{this}) : this.f29812a;
    }

    public ConcurrentHashMap<String, String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("7d52b13c", new Object[]{this}) : this.b;
    }

    public HashMap<String, String> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("9d11238e", new Object[]{this}) : this.c;
    }

    public void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
        } else {
            this.c = hashMap;
        }
    }
}
