package com.huawei.hms.push.utils;

import com.huawei.hms.support.log.HMSLog;
import com.taobao.android.weex_framework.util.a;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public class DateUtil {
    private DateUtil() {
    }

    public static String parseMilliSecondToString(Long l) {
        if (l == null) {
            return null;
        }
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(l);
        } catch (Exception e) {
            HMSLog.e("DateUtil", "parseMilliSecondToString Exception.", e);
            return null;
        }
    }

    public static long parseUtcToMillisecond(String str) throws ParseException, StringIndexOutOfBoundsException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(a.ATOM_EXT_UTC));
        String substring = str.substring(0, str.indexOf("."));
        String substring2 = str.substring(str.indexOf("."));
        return simpleDateFormat.parse(substring + (substring2.substring(0, 4) + "Z")).getTime();
    }
}
