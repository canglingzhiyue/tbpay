package mtopsdk.mtop.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicLong;
import tb.kge;

/* loaded from: classes.dex */
public final class RequestIdGenerator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final AtomicLong sTimeStamp;

    private RequestIdGenerator() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    static {
        kge.a(1583674732);
        sTimeStamp = new AtomicLong();
    }

    public static String getRequestId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91478625", new Object[0]);
        }
        return "r_" + sTimeStamp.incrementAndGet();
    }
}
