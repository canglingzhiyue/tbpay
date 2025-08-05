package com.alipay.android.msp.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public class ThreadSafeDateFormat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, ThreadLocal<SimpleDateFormat>> patternMap = new HashMap();

    private static synchronized SimpleDateFormat getSimpleDateFormat(final String str) {
        synchronized (ThreadSafeDateFormat.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SimpleDateFormat) ipChange.ipc$dispatch("1aebcd3b", new Object[]{str});
            }
            ThreadLocal<SimpleDateFormat> threadLocal = patternMap.get(str);
            if (threadLocal == null) {
                threadLocal = new ThreadLocal<SimpleDateFormat>() { // from class: com.alipay.android.msp.utils.ThreadSafeDateFormat.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.ThreadLocal
                    public SimpleDateFormat initialValue() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (SimpleDateFormat) ipChange2.ipc$dispatch("2acb5bc5", new Object[]{this}) : new SimpleDateFormat(str, Locale.CHINA);
                    }
                };
                patternMap.put(str, threadLocal);
            }
            return threadLocal.get();
        }
    }

    public static String format(Date date, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ab452d7", new Object[]{date, str}) : getSimpleDateFormat(str).format(date);
    }

    public static String format(long j, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c755ccd0", new Object[]{new Long(j), str}) : getSimpleDateFormat(str).format(Long.valueOf(j));
    }

    public static Date parse(String str, String str2) throws ParseException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Date) ipChange.ipc$dispatch("2a4ef1a9", new Object[]{str, str2}) : getSimpleDateFormat(str2).parse(str);
    }
}
