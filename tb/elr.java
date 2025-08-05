package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class elr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, elq> f27409a;

    static {
        kge.a(1432900606);
        f27409a = new ConcurrentHashMap();
    }

    public static elq a(Context context, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (elq) ipChange.ipc$dispatch("5f22d2a1", new Object[]{context, str, map});
        }
        if (f27409a.containsKey(str)) {
            return f27409a.get(str);
        }
        elq elqVar = new elq(context, str, map);
        f27409a.put(str, elqVar);
        return elqVar;
    }

    public static elq a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (elq) ipChange.ipc$dispatch("7c6edaaa", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return f27409a.get(str);
        }
        return null;
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            f27409a.remove(str);
        }
    }
}
