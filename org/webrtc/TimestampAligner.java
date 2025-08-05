package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class TimestampAligner {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(243380659);
    }

    private static native long nativeRtcTimeNanos();

    public static long getRtcTimeNanos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64204f82", new Object[0])).longValue() : nativeRtcTimeNanos();
    }
}
