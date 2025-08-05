package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public class rpo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static rpo f33314a;
    private Map<String, String> b;
    private Set<String> c = new HashSet();

    static {
        kge.a(-2032415249);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : str == null ? "" : str;
    }

    private rpo() {
        this.c.add("biz_arg1");
        this.c.add("biz_arg2");
        this.c.add("biz_arg3");
        this.c.add("biz_arg4");
        this.c.add("biz_arg5");
        this.c.add("biz_arg6");
        this.c.add("biz_arg7");
        this.c.add("biz_arg8");
        this.c.add("biz_arg9");
        this.c.add("biz_arg10");
        this.c.add("biz_args");
        this.c.add("sys_arg1");
        this.c.add("sys_arg2");
        this.c.add("sys_arg3");
        this.c.add("sys_arg4");
        this.c.add("sys_arg5");
        this.c.add("sys_args");
        this.b = Collections.synchronizedMap(new HashMap());
    }

    public static rpo getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpo) ipChange.ipc$dispatch("20148963", new Object[0]);
        }
        if (f33314a == null) {
            synchronized (rpo.class) {
                if (f33314a == null) {
                    f33314a = new rpo();
                }
            }
        }
        return f33314a;
    }

    public void setArgFieldsMap(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b9080f", new Object[]{this, map});
        } else if (map == null || map.size() == 0) {
            this.b.clear();
        } else {
            try {
                this.b.clear();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (this.c.contains(value) && !aqc.e(key)) {
                        this.b.put(key, value);
                    }
                }
            } catch (Throwable unused) {
                this.b.clear();
            }
        }
    }

    public void a(Map<String, Object> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0efabc8", new Object[]{this, map, map2});
            return;
        }
        Map<String, String> map3 = this.b;
        if (map3 == null || map3.size() == 0) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                map.put(entry.getValue(), a(map2.get(entry.getKey())));
            }
        } catch (Throwable unused) {
        }
    }
}
