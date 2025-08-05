package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public class nur {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<Context, Map<String, String>> f31776a;

    static {
        kge.a(-317058617);
        f31776a = new WeakHashMap();
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        Map<String, String> map = f31776a.get(context);
        return map == null ? "" : map.get(str);
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        Map<String, String> map = f31776a.get(context);
        if (map == null) {
            map = new HashMap<>();
            f31776a.put(context, map);
        }
        map.put(str, str2);
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        Map<String, String> map = f31776a.get(context);
        if (map == null) {
            return;
        }
        map.remove(str);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            f31776a.remove(context);
        }
    }
}
