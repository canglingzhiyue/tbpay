package tao.reactivex.d.h;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;

/* loaded from: classes9.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1471011211);
    }

    public static long a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c11cadc", new Object[]{new Long(j), new Long(j2)})).longValue();
        }
        long j3 = j + j2;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public static long a(AtomicLong atomicLong, long j) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a30fb9b4", new Object[]{atomicLong, new Long(j)})).longValue();
        }
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, a(j2, j)));
        return j2;
    }
}
