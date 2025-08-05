package com.alipay.android.msp.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class TimingUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public enum PreposeTimingEnum {
        PaTiming,
        HasAlipayTiming,
        TidTiming,
        UaTiming,
        UtdidTiming
    }

    /* loaded from: classes3.dex */
    public static final class TimingMsMap<X extends Enum<X>> extends HashMap<X, Long> {
    }

    public static long getLong(Long l, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f097d00", new Object[]{l, new Long(j)})).longValue() : l == null ? j : l.longValue();
    }
}
