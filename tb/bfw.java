package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class bfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f25863a = new AtomicInteger(0);

    public static int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{str, str2})).intValue();
        }
        if (str == null) {
            return str2 == null ? 0 : -1;
        } else if (str2 == null) {
            return 1;
        } else {
            try {
                return Integer.parseInt(str) - Integer.parseInt(str2);
            } catch (Exception unused) {
                return str.compareTo(str2);
            }
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : String.valueOf(f25863a.incrementAndGet());
    }
}
