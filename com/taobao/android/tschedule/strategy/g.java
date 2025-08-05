package com.taobao.android.tschedule.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final SimpleDateFormat f15672a;

    static {
        kge.a(660768434);
        f15672a = new SimpleDateFormat("yyyyMMdd", Locale.US);
    }

    public static String a(Date date) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18b99f77", new Object[]{date}) : f15672a.format(Long.valueOf(date.getTime()));
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f15672a.format(Long.valueOf(new Date().getTime()));
    }

    public static Date a(Date date, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Date) ipChange.ipc$dispatch("bc765a1d", new Object[]{date, new Integer(i)});
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, i);
        return calendar.getTime();
    }
}
