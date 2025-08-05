package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class lyi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_INTERNAL_SPM_SPLIT = ".";
    private static final String d = "lyi";

    /* renamed from: a  reason: collision with root package name */
    public Context f30992a;
    public String b;
    public Map<String, Map<String, String>> c = new ConcurrentHashMap();

    public lyi(Context context, String str) {
        this.b = str;
        this.f30992a = context;
        a(context, str);
    }

    private void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else {
            new lyd(this.c).execute(context, str);
        }
    }

    public Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{this, str});
        }
        Map<String, Map<String, String>> map = this.c;
        if (map != null && map.containsKey(str)) {
            return this.c.get(str);
        }
        Map<String, Map<String, String>> map2 = this.c;
        if (map2 == null) {
            return null;
        }
        for (Map.Entry<String, Map<String, String>> entry : map2.entrySet()) {
            if (entry != null) {
                String key = entry.getKey();
                Map<String, String> value = entry.getValue();
                if (str != null && key != null && key.contains("|") && str.matches(key)) {
                    return value;
                }
            }
        }
        return null;
    }

    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : a(str, str2, null);
    }

    public String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3});
        }
        Map<String, String> c = c(str);
        return (c == null || !c.containsKey(str2)) ? str3 : c.get(str2);
    }
}
