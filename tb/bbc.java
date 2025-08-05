package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public class bbc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1308836379);
    }

    public static <T> T a(Map<String, ?> map, String str, Class<T> cls, T t) {
        T t2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("833baba0", new Object[]{map, str, cls, t});
        }
        if (map == null || (t2 = (T) map.get(str)) == null) {
            return t;
        }
        try {
        } catch (Throwable th) {
            arc.a().c("AURAMapValueGetter", "getValue", th.getMessage());
        }
        return cls.isAssignableFrom(t2.getClass()) ? t2 : t;
    }

    public static Float a(Map<String, ?> map, String str, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("c827c85b", new Object[]{map, str, f});
        }
        if (map == null) {
            return f;
        }
        Object obj = map.get(str);
        if (obj instanceof Float) {
            return (Float) obj;
        }
        try {
            return Float.valueOf(Float.parseFloat(String.valueOf(obj)));
        } catch (Exception unused) {
            return f;
        }
    }
}
