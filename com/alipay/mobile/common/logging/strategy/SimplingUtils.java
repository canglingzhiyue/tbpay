package com.alipay.mobile.common.logging.strategy;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson2.time.e;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Calendar;
import java.util.TimeZone;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class SimplingUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SimplingUtils";
    public static final int maxRate = 1000;

    public static boolean isHitTest(int i, String str) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4181258f", new Object[]{new Integer(i), str})).booleanValue();
        }
        if (LoggingUtil.isOfflineMode() || i > 999 || i < 0) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        if (StringUtils.isEmpty(str) || str.length() < 2) {
            i2 = 999;
        } else {
            try {
                i2 = ((int) IntUtil.a(str.substring(str.length() - 2, str.length()))) % 1000;
            } catch (Throwable unused) {
                i2 = 0;
            }
        }
        return (i2 + getOffset(i)) % 1000 < i;
    }

    public static int getOffset(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("23114566", new Object[]{new Integer(i)})).intValue() : ((int) (getCurrentDay() % (1000 / i))) * i;
    }

    public static long getCurrentDay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e6081754", new Object[0])).longValue() : ((((Calendar.getInstance(TimeZone.getTimeZone(e.SHANGHAI_ZONE_ID_NAME)).getTimeInMillis() + 28800000) / 1000) / 60) / 60) / 24;
    }
}
