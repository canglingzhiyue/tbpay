package com.taobao.message.kit.util;

import mtopsdk.common.util.StringUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.launcher.server_time.AmpTimeStampManager;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.taobao.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import tb.eoe;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class TimeUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FORMAT_yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";
    public static final long ONE_DAY = 86400000;
    public static final long ONE_HOUR = 3600000;
    public static final long ONE_MINUS = 60000;
    public static final long ONE_WEEK = 604800000;
    public static final long ONE_YEAR = 31536000000L;
    private static LruCache<String, String> mpFormatTimeCache;
    public static StringBuffer sBuffer;

    static {
        kge.a(1353474472);
        sBuffer = new StringBuffer(8);
        mpFormatTimeCache = new LruCache<>(500);
    }

    public static int isToday(long j) throws ParseException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eca64139", new Object[]{new Long(j)})).intValue();
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(simpleDateFormat.format(date));
        if (parse.getTime() - j <= 0) {
            return (parse.getTime() - j > 0 || j - parse.getTime() > 86400000) ? 1 : 0;
        } else if (parse.getTime() - j <= 86400000) {
            return -1;
        } else {
            return j - getFirstDayOfWeek(parse.getTime()) > 0 ? -2 : -3;
        }
    }

    public static String getWeekOfTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ca32ef1", new Object[]{new Long(j)});
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        switch (calendar.get(7)) {
            case 1:
                return DisplayUtil.localizedString(R.string.mp_Sunday);
            case 2:
                return DisplayUtil.localizedString(R.string.mp_Monday);
            case 3:
                return DisplayUtil.localizedString(R.string.mp_Tuesday);
            case 4:
                return DisplayUtil.localizedString(R.string.mp_Wednesday);
            case 5:
                return DisplayUtil.localizedString(R.string.mp_Thursday);
            case 6:
                return DisplayUtil.localizedString(R.string.mp_Friday);
            case 7:
                return DisplayUtil.localizedString(R.string.mp_Saturday);
            default:
                return "";
        }
    }

    public static long getFirstDayOfWeek(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21fc81e4", new Object[]{new Long(j)})).longValue();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(7);
        calendar.add(5, i == 1 ? -6 : 2 - i);
        return calendar.getTimeInMillis();
    }

    public static String formatTimeForMsgCenterCategory(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4bfab3f2", new Object[]{new Long(j)}) : formatTimeForMsgCenterCategory(j, false);
    }

    public static String formatTimeForMsgCenterCategory(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d699ef3a", new Object[]{new Long(j), new Boolean(z)});
        }
        if (j == 0) {
            return null;
        }
        long currentTimeStamp = AmpTimeStampManager.instance().getCurrentTimeStamp() + 3000;
        Calendar calendar = DateFormatUtil.getCalendar();
        calendar.setTimeInMillis(j);
        if (currentTimeStamp - j < 0) {
            if (z) {
                LruCache<String, String> lruCache = mpFormatTimeCache;
                String str = lruCache.get(j + "default");
                if (!StringUtils.isEmpty(str)) {
                    return str;
                }
                String formatDate2 = DateFormatUtil.formatDate2(calendar.getTime());
                LruCache<String, String> lruCache2 = mpFormatTimeCache;
                lruCache2.put(j + "default", formatDate2);
                return formatDate2;
            }
            return DateFormatUtil.formatDate2(calendar.getTime());
        }
        long offset = currentTimeStamp - ((TimeZone.getDefault().getOffset(currentTimeStamp) + currentTimeStamp) % 86400000);
        if (j - offset >= 0) {
            if (z) {
                LruCache<String, String> lruCache3 = mpFormatTimeCache;
                String str2 = lruCache3.get(j + eoe.c.KEY_DAY);
                if (!StringUtils.isEmpty(str2)) {
                    return str2;
                }
                String convertHourAndMinus = convertHourAndMinus(calendar.get(11), calendar.get(12));
                LruCache<String, String> lruCache4 = mpFormatTimeCache;
                lruCache4.put(j + eoe.c.KEY_DAY, convertHourAndMinus);
                return convertHourAndMinus;
            }
            return convertHourAndMinus(calendar.get(11), calendar.get(12));
        } else if (offset - j < 86400000) {
            return DisplayUtil.localizedString(R.string.mp_yesterday);
        } else {
            if (j - (offset - 604800000) > 0) {
                if (z) {
                    LruCache<String, String> lruCache5 = mpFormatTimeCache;
                    String str3 = lruCache5.get(j + "week");
                    if (!StringUtils.isEmpty(str3)) {
                        return str3;
                    }
                    String weekOfTime = getWeekOfTime(j);
                    LruCache<String, String> lruCache6 = mpFormatTimeCache;
                    lruCache6.put(j + "week", weekOfTime);
                    return weekOfTime;
                }
                return getWeekOfTime(j);
            } else if (z) {
                LruCache<String, String> lruCache7 = mpFormatTimeCache;
                String str4 = lruCache7.get(j + "default");
                if (!StringUtils.isEmpty(str4)) {
                    return str4;
                }
                String formatDate22 = DateFormatUtil.formatDate2(calendar.getTime());
                LruCache<String, String> lruCache8 = mpFormatTimeCache;
                lruCache8.put(j + "default", formatDate22);
                return formatDate22;
            } else {
                return DateFormatUtil.formatDate2(calendar.getTime());
            }
        }
    }

    public static String formatTimeForMsgCenterCategory(long j, SimpleDateFormat simpleDateFormat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3879dcf", new Object[]{new Long(j), simpleDateFormat});
        }
        if (j == 0 || simpleDateFormat == null) {
            return null;
        }
        long currentTimeStamp = AmpTimeStampManager.instance().getCurrentTimeStamp() + 3000;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (currentTimeStamp - j < 0) {
            return simpleDateFormat.format(calendar.getTime());
        }
        long offset = currentTimeStamp - ((TimeZone.getDefault().getOffset(currentTimeStamp) + currentTimeStamp) % 86400000);
        if (j - offset >= 0) {
            return convertHourAndMinus(calendar.get(11), calendar.get(12));
        }
        if (offset - j < 86400000) {
            return DisplayUtil.localizedString(R.string.mp_yesterday);
        }
        if (j - (offset - 604800000) > 0) {
            return getWeekOfTime(j);
        }
        return simpleDateFormat.format(calendar.getTime());
    }

    private static String convertHourAndMinus(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1ccbe09", new Object[]{new Long(j), new Long(j2)});
        }
        StringBuffer stringBuffer = sBuffer;
        stringBuffer.delete(0, stringBuffer.length());
        if (j < 10) {
            sBuffer.append('0');
        }
        sBuffer.append(j);
        sBuffer.append(riy.CONDITION_IF_MIDDLE);
        if (j2 < 10) {
            sBuffer.append('0');
        }
        sBuffer.append(j2);
        return sBuffer.toString();
    }

    public static long getCurDay0ClockInMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c2bd756", new Object[0])).longValue();
        }
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long getCurDayByHourClockInMillis(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7d19d84", new Object[]{new Integer(i)})).longValue();
        }
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        calendar.set(11, i);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
