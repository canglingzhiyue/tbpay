package com.taobao.message.notification.util;

import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Calendar;
import tb.kge;

/* loaded from: classes7.dex */
public class TimeUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ONE_DAY = 86400000;
    public static final long ONE_HOUR = 3600000;
    public static final long ONE_MINUS = 60000;
    public static final long ONE_WEEK = 604800000;
    public static final long ONE_YEAR = 31536000000L;
    private static long lastClickTime;

    static {
        kge.a(989930067);
        lastClickTime = 0L;
    }

    public static String formatTimeForInnerNotification(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f383503f", new Object[]{new Long(j)});
        }
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        long j2 = currentTimeMillis - j;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i < 0) {
            return calendar.get(1) + "/" + (calendar.get(2) + 1) + "/" + calendar.get(5);
        } else if (i >= 0 && j2 < 60000) {
            return b.a(R.string.mp_notification_now);
        } else {
            if (j2 >= 60000 && j2 < 3600000) {
                return (j2 / 60000) + b.a(R.string.mp_notification_minutes_ago);
            } else if (j2 >= 3600000 && j2 < 86400000) {
                return (j2 / 3600000) + b.a(R.string.mp_notification_hours_ago);
            } else {
                return calendar.get(1) + "/" + (calendar.get(2) + 1) + "/" + calendar.get(5);
            }
        }
    }

    public static boolean isFastDoubleClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57bf07bc", new Object[0])).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - lastClickTime;
        if (0 < j && j < 500) {
            return true;
        }
        lastClickTime = currentTimeMillis;
        return false;
    }
}
