package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.j;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class dsp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Set<String> k;

    /* renamed from: a  reason: collision with root package name */
    public String f26946a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Map<String, String> f;
    public Map<String, Object> g;
    public boolean h;
    public String i;
    public JSONObject j;

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f26946a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public Map<String, Object> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.g;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.i;
    }

    static {
        kge.a(-598468639);
        k = i();
    }

    private static Set<String> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("d6a805f", new Object[0]);
        }
        HashSet hashSet = new HashSet();
        hashSet.add("SDKTYPE");
        hashSet.add("PAGE");
        hashSet.add("ARG1");
        hashSet.add("ARG2");
        hashSet.add("ARG3");
        hashSet.add("ARGS");
        hashSet.add("EVENTID");
        hashSet.add("_priority");
        return hashSet;
    }

    public Map<String, Object> f() {
        HashMap<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this});
        }
        if (!this.h) {
            return this.g;
        }
        if (this.f != null) {
            HashMap hashMap = new HashMap();
            String str = this.f.get("ARGS");
            if (!StringUtils.isEmpty(str) && (a2 = j.a(str, ",", "=", true)) != null) {
                hashMap.putAll(a2);
            }
            for (Map.Entry<String, String> entry : this.f.entrySet()) {
                if (!k.contains(entry.getKey())) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
            this.g = hashMap;
        }
        if (this.g == null) {
            this.g = new HashMap();
        }
        if (!StringUtils.isEmpty(this.d)) {
            this.g.put("bx_arg2", this.d);
        }
        if (!StringUtils.isEmpty(this.e)) {
            this.g.put("bx_arg3", this.e);
        }
        return this.g;
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this});
        }
        Map<String, String> map = this.f;
        if (map == null || map.size() == 0) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : this.f.entrySet()) {
            if (!k.contains(entry.getKey())) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            String str = "";
            if (StringUtils.equals(entry.getKey(), "ARG2")) {
                if (entry.getValue() != null) {
                    str = entry.getValue();
                }
                hashMap.put("bx_arg2", str);
            } else if (StringUtils.equals(entry.getKey(), "ARG3")) {
                if (entry.getValue() != null) {
                    str = entry.getValue();
                }
                hashMap.put("bx_arg3", str);
            }
        }
        return hashMap;
    }

    public JSONObject h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("fa36400f", new Object[]{this}) : this.j;
    }
}
