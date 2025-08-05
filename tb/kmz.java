package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class kmz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f30176a;

    public static synchronized int a() {
        synchronized (kmz.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
            }
            if (f30176a >= Integer.MAX_VALUE) {
                f30176a = 0;
            }
            int i = f30176a;
            f30176a = i + 1;
            return i;
        }
    }
}
