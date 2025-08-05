package tb;

import android.net.TrafficStats;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class mog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f31164a = false;
    private static int b = Process.myUid();

    static {
        boolean z = false;
        long[] jArr = {TrafficStats.getUidRxBytes(b), TrafficStats.getUidTxBytes(b)};
        if (jArr[0] >= 0 && jArr[1] >= 0) {
            z = true;
        }
        f31164a = z;
    }

    public static long[] a() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("a821217d", new Object[0]);
        }
        long[] jArr = new long[2];
        if (f31164a && (i = b) > 0) {
            jArr[0] = TrafficStats.getUidRxBytes(i);
            jArr[1] = TrafficStats.getUidTxBytes(b);
        }
        return jArr;
    }
}
