package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class sdl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f33495a;
    private static Map<String, Integer> b;

    static {
        kge.a(-1784676918);
        f33495a = -1;
        b = new ConcurrentHashMap();
    }

    public static int a(DinamicXEngine dinamicXEngine, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3bb887d", new Object[]{dinamicXEngine, new Integer(i)})).intValue();
        }
        String b2 = b(dinamicXEngine, i);
        if (!b.containsKey(b2)) {
            return f33495a;
        }
        Integer num = b.get(b2);
        return num == null ? f33495a : num.intValue();
    }

    public static void a(DinamicXEngine dinamicXEngine, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b5fbb9", new Object[]{dinamicXEngine, new Integer(i), new Integer(i2)});
        } else {
            b.put(b(dinamicXEngine, i), Integer.valueOf(i2));
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b.clear();
        }
    }

    private static String b(DinamicXEngine dinamicXEngine, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7564cd17", new Object[]{dinamicXEngine, new Integer(i)});
        }
        return dinamicXEngine.hashCode() + "_" + i;
    }
}
