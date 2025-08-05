package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class eno {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, Integer> f27472a;
    private static volatile int b;

    static {
        kge.a(-481572749);
        f27472a = new HashMap<>(32);
        b = 0;
    }

    public static <T extends enn> int a(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20fa47c8", new Object[]{cls})).intValue();
        }
        String name = cls.getName();
        Integer num = f27472a.get(name);
        if (num == null) {
            synchronized (f27472a) {
                num = Integer.valueOf(b + 50000);
                b++;
                f27472a.put(name, num);
            }
        }
        return num.intValue();
    }
}
