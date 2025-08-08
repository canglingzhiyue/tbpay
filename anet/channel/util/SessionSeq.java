package anet.channel.util;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes.dex */
public class SessionSeq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AtomicInteger mIndex;

    static {
        kge.a(1954313655);
        mIndex = new AtomicInteger();
    }

    public static String createSequenceNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7ccb4f1", new Object[]{str});
        }
        if (mIndex.get() == Integer.MAX_VALUE) {
            mIndex.set(0);
        }
        if (!StringUtils.isEmpty(str)) {
            return StringUtils.concatString(str, ".AWCN", String.valueOf(mIndex.incrementAndGet()));
        }
        return StringUtils.concatString("AWCN", String.valueOf(mIndex.incrementAndGet()));
    }
}
