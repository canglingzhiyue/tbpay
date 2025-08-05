package com.taobao.tao.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.timestamp.TimeStampManager;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import tb.kge;

/* loaded from: classes8.dex */
public class LimitSwitchCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static long limit_11_EndTime;
    private static long limit_11_StartTime;
    private static long limit_12_EndTime;
    private static long limit_12_StartTime;

    static {
        kge.a(353641623);
        limit_11_StartTime = 0L;
        limit_11_EndTime = 0L;
        limit_12_StartTime = 0L;
        limit_12_EndTime = 0L;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        try {
            limit_11_StartTime = simpleDateFormat.parse("2016-10-22 00:00:00").getTime();
            limit_11_EndTime = simpleDateFormat.parse("2016-11-12 00:00:00").getTime();
            limit_12_StartTime = simpleDateFormat.parse("2016-11-13 00:00:00").getTime();
            limit_12_EndTime = simpleDateFormat.parse("2016-12-13 00:00:00").getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final boolean is11Time() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5b713c2", new Object[0])).booleanValue();
        }
        long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
        return currentTimeStamp > limit_11_StartTime && currentTimeStamp < limit_11_EndTime;
    }

    public static final boolean is12Time() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49fb82c3", new Object[0])).booleanValue();
        }
        long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
        return currentTimeStamp > limit_12_StartTime && currentTimeStamp < limit_12_EndTime;
    }
}
