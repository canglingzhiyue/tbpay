package com.taobao.tao.flexbox.layoutmanager.filter;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Calendar;
import java.util.Date;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ONE_DAY = 86400000;
    public static final long ONE_HOUR = 3600000;
    public static final long ONE_MINUS = 60000;
    public static final long ONE_SECOND = 1000;

    /* renamed from: a  reason: collision with root package name */
    private static StringBuffer f20399a;

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        long a2 = a();
        Calendar calendar2 = Calendar.getInstance();
        if (a2 != 0) {
            calendar2.setTimeInMillis(a2);
        }
        long timeInMillis = calendar2.getTimeInMillis() - calendar.getTimeInMillis();
        int i = calendar.get(1);
        int i2 = calendar2.get(1);
        int i3 = calendar.get(2);
        int i4 = calendar.get(5);
        int i5 = (timeInMillis > 60000L ? 1 : (timeInMillis == 60000L ? 0 : -1));
        if (i5 < 0) {
            return "刚刚";
        }
        if (i5 >= 0 && timeInMillis < 3600000) {
            return (timeInMillis / 60000) + "分钟前";
        } else if (timeInMillis < 3600000 || timeInMillis >= 86400000) {
            if (i == i2) {
                return a(0, i3 + 1, i4);
            }
            return a(i, i3 + 1, i4);
        } else {
            return (timeInMillis / 3600000) + "小时前";
        }
    }

    private static String a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39c0b8c5", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
        }
        StringBuffer stringBuffer = f20399a;
        stringBuffer.delete(0, stringBuffer.length());
        if (i != 0) {
            StringBuffer stringBuffer2 = f20399a;
            stringBuffer2.append(i);
            stringBuffer2.append("-");
        }
        if (i2 < 10) {
            StringBuffer stringBuffer3 = f20399a;
            stringBuffer3.append("0");
            stringBuffer3.append(i2);
        } else {
            f20399a.append(i2);
        }
        f20399a.append("-");
        if (i3 < 10) {
            StringBuffer stringBuffer4 = f20399a;
            stringBuffer4.append("0");
            stringBuffer4.append(i3);
        } else {
            f20399a.append(i3);
        }
        return f20399a.toString();
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : new Date().getTime();
    }

    static {
        kge.a(1367204662);
        f20399a = new StringBuffer(16);
    }
}
