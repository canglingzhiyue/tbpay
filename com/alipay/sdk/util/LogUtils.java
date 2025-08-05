package com.alipay.sdk.util;

import android.util.Log;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public class LogUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            new SimpleDateFormat("hh:mm:ss.SSS", Locale.getDefault()).format(new Date());
            LogUtil.record(4, "phonecashier", "stdsdk", str);
        } catch (Throwable unused) {
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        String a2 = a(str, str2);
        boolean z = GlobalConstant.DEBUG;
        a(a2);
    }

    public static void i(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf1c6b7", new Object[]{str, objArr});
        } else {
            i(str, Arrays.toString(objArr));
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
            return;
        }
        String a2 = a(str, str2);
        boolean z = GlobalConstant.DEBUG;
        a(a2);
    }

    public static void w(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257aae69", new Object[]{str, objArr});
        } else {
            w(str, Arrays.toString(objArr));
        }
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
            return;
        }
        String a2 = a(str, str2);
        boolean z = GlobalConstant.DEBUG;
        a(a2);
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            return;
        }
        String a2 = a(str, str2);
        if (GlobalConstant.DEBUG) {
            Log.e(LogCategory.CATEGORY_ALIPAYSDK, a2);
        }
        a(a2);
    }

    public static void e(String str, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11662452", new Object[]{str, th, objArr});
        } else {
            e(str, Arrays.toString(objArr), th);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
            return;
        }
        String a2 = a(str, str2);
        if (GlobalConstant.DEBUG) {
            Log.e(LogCategory.CATEGORY_ALIPAYSDK, a2, th);
        }
        a(a2 + " " + a(th));
    }

    public static void printExceptionStackTrace(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92fab54f", new Object[]{th});
        } else if (th == null) {
        } else {
            if (GlobalConstant.DEBUG) {
                th.printStackTrace();
            }
            try {
                a(a(th));
            } catch (Throwable unused) {
            }
        }
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return String.format("[%s][%s]", str, str2);
    }

    private static String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th});
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
