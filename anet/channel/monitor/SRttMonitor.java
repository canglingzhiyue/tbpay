package anet.channel.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class SRttMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long UNKNOWN_SRTT = -1;
    private static ConcurrentHashMap<String, Long> srttMap;

    static {
        kge.a(-1833362169);
        srttMap = new ConcurrentHashMap<>();
    }

    public static void putDomainSRtt(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e58039c1", new Object[]{str, new Long(j)});
        } else if (str == null) {
        } else {
            srttMap.put(str, Long.valueOf(j));
        }
    }

    public static long getDomainSRtt(String str) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b092699e", new Object[]{str})).longValue();
        }
        if (str != null && (l = srttMap.get(str)) != null) {
            return l.longValue();
        }
        return -1L;
    }
}
