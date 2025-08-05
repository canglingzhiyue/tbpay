package com.alipay.mobile.common.logging.util.config;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class GrayScaleUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5469a = "GrayScaleUtils";
    private static long b;
    private static JSONObject c;

    public static boolean getGrayScaleSwitch(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdbc5442", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        String a2 = a(str);
        return !TextUtils.isEmpty(a2) ? grayscaleUtdid(LoggerFactory.getLogContext().getDeviceId(), a2) : z;
    }

    public static int getIntSwitch(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d72c2698", new Object[]{str, new Integer(i)})).intValue();
        }
        String a2 = a(str);
        return TextUtils.isEmpty(a2) ? i : Integer.valueOf(a2).intValue();
    }

    public static String getStringSwitch(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b69c572a", new Object[]{str, str2});
        }
        String a2 = a(str);
        return TextUtils.isEmpty(a2) ? str2 : a2;
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        JSONObject a2 = a();
        return a2 == null ? "" : a2.optString(str);
    }

    private static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("69129956", new Object[0]);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (c != null && currentTimeMillis - b < TimeUnit.MINUTES.toMillis(3L)) {
            return c;
        }
        b = currentTimeMillis;
        String string = LoggerFactory.getLogContext().getApplicationContext().getSharedPreferences("LOG_SWITCH_MDAP_CORE", 4).getString(LogContext.LOG_SWITCH_MDAP_CORE, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            c = new JSONObject(string);
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            String str = f5469a;
            traceLogger.info(str, "getMdapCoreSwitchJson,jsonObj= " + c.toString());
        } catch (Throwable th) {
            c = null;
            if (LoggingUtil.isDebuggable(LoggerFactory.getLogContext().getApplicationContext())) {
                new StringBuilder("getMdapCoreSwitchJson ex= ").append(th.toString());
            }
        }
        return c;
    }

    public static final boolean grayscaleUtdid(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73978218", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.equals(str2, "0") && !TextUtils.equals(str2, "-1")) {
            try {
                String[] split = str2.split(",");
                int[] iArr = new int[split.length];
                for (int i = 0; i < iArr.length; i++) {
                    iArr[i] = Integer.parseInt(split[i]);
                }
                return grayscaleUtdid(str, iArr);
            } catch (Throwable unused) {
                LoggerFactory.getTraceLogger().error(f5469a, "grayscaleUtdid exception");
            }
        }
        return false;
    }

    public static final boolean grayscaleUtdid(String str, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8da6bb5c", new Object[]{str, iArr})).booleanValue();
        }
        if (str == null || str.length() < 2 || iArr == null || iArr.length == 0 || iArr[iArr.length - 1] == 0) {
            return false;
        }
        int length = iArr.length;
        if (iArr.length > str.length()) {
            length = str.length();
        }
        int i = 0;
        int i2 = 1;
        while (i < length) {
            if ("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ+/".indexOf(str.charAt(str.length() - i2)) > iArr[length - i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }
}
