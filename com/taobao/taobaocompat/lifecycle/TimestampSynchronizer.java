package com.taobao.taobaocompat.lifecycle;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.timestamp.TimeStampManager;
import tb.kge;

/* loaded from: classes8.dex */
public final class TimestampSynchronizer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2057987623);
    }

    public static String getServerTimeString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ffc0f02", new Object[0]) : String.valueOf(getServerTime() / 1000);
    }

    public static long getServerTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7cda1621", new Object[0])).longValue() : TimeStampManager.instance().getCurrentTimeStamp();
    }
}
