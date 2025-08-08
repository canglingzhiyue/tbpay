package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rqo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f33325a;
    private Map<String, String> b = new HashMap();
    private Map<String, String> c = new HashMap();
    private boolean d = false;

    static {
        kge.a(927470241);
    }

    public rqo(String str, Map<String, String> map, Map<String, String> map2) {
        this.f33325a = str;
        if (map != null) {
            this.b.putAll(map);
        }
        d(map2);
    }

    private void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
        } else if (map != null && map.size() > 0) {
            this.c.putAll(map);
            this.d = true;
        } else {
            this.d = false;
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null) {
        } else {
            this.b.putAll(map);
        }
    }

    public void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!this.b.containsKey(key)) {
                    Map<String, String> map2 = this.b;
                    map2.put(anz.UT_TMP_ARGS_KEY + key, value);
                }
            }
        }
    }

    public void c(Map<String, String> map) {
        Map<String, String> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else if (!this.d || map == null || map.size() <= 0 || (map2 = this.c) == null || map2.size() <= 0) {
            this.d = false;
        } else {
            for (Map.Entry<String, String> entry : this.c.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                    String str = map.get(key);
                    if (!StringUtils.isEmpty(str)) {
                        this.b.put(value, str);
                    }
                }
            }
            this.d = false;
        }
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.b;
    }
}
