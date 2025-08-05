package com.alipay.mobile.security.bio.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes3.dex */
public class DateUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final SimpleDateFormat DATE_FORMAT2 = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss-SSS", Locale.US);

    public static String getDetailDateFormat(long j) {
        String format;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69643a0f", new Object[]{new Long(j)});
        }
        synchronized (DATE_FORMAT2) {
            format = DATE_FORMAT2.format(new Date(j));
        }
        return format;
    }

    public static String getDateFormat(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d38921e", new Object[]{new Long(j)});
        }
        Date date = new Date(j);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return new SimpleDateFormat("yyyyMMddhhmmss").format(gregorianCalendar.getTime());
    }

    public static String getSimpleDateFormat(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b4c8f70", new Object[]{new Long(j)});
        }
        Date date = new Date(j);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(date);
        return new SimpleDateFormat("yyyyMMdd").format(gregorianCalendar.getTime());
    }
}
