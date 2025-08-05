package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class fil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, Integer> f27975a;
    private static volatile int b;

    static {
        kge.a(1921012151);
        f27975a = new HashMap<>(32);
        b = 0;
    }

    public static <T extends fij> int a(Class<T> cls, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2b9dcc64", new Object[]{cls, obj})).intValue();
        }
        return (cls.toString() + obj).hashCode();
    }
}
