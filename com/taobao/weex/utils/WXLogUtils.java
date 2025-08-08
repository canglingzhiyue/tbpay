package com.taobao.weex.utils;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class WXLogUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WEEX_PERF_TAG = "weex_perf";
    public static final String WEEX_TAG = "weex1";

    /* renamed from: a  reason: collision with root package name */
    private static StringBuilder f23537a;
    private static HashMap<String, Class> b;
    private static List<JsLogWatcher> c;
    private static volatile LogWatcher d;

    /* loaded from: classes9.dex */
    public interface JsLogWatcher {
        void onJsLog(int i, String str);
    }

    /* loaded from: classes9.dex */
    public interface LogWatcher {
        void onLog(String str, String str2, String str3);
    }

    public static void performance(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9aecf48", new Object[]{str, bArr});
        }
    }

    public static void renderPerformanceLog(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ac02e9", new Object[]{str, new Long(j)});
        }
    }

    static {
        kge.a(-566125081);
        f23537a = new StringBuilder(50);
        HashMap<String, Class> hashMap = new HashMap<>(2);
        b = hashMap;
        hashMap.put("com.taobao.weex.devtools.common.LogUtil", a("com.taobao.weex.devtools.common.LogUtil"));
        c = new ArrayList();
    }

    private static Class a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("582938df", new Object[]{str});
        }
        Class<?> cls = null;
        try {
            cls = Class.forName(str);
            if (cls != null) {
                b.put(str, cls);
            }
        } catch (ClassNotFoundException unused) {
        }
        return cls;
    }

    private static void a(String str, String str2, LogLevel logLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf82472", new Object[]{str, str2, logLevel});
        } else if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str) || logLevel == null || StringUtils.isEmpty(logLevel.getName())) {
        } else {
            if (!str.toLowerCase().startsWith(WEEX_TAG)) {
                str = "weex1_" + str;
            }
            if (d != null) {
                d.onLog(logLevel.getName(), str, str2);
            }
            if (WXEnvironment.isApkDebugable()) {
                if (logLevel.getValue() - WXEnvironment.sLogLevel.getValue() < 0) {
                    return;
                }
                Log.println(logLevel.getPriority(), str, str2);
                a(logLevel.getName(), str2);
            } else if (logLevel.getValue() - LogLevel.WARN.getValue() < 0 || logLevel.getValue() - WXEnvironment.sLogLevel.getValue() < 0) {
            } else {
                Log.println(logLevel.getPriority(), str, str2);
            }
        }
    }

    public static void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7de87", new Object[]{str});
        } else {
            v(WEEX_TAG, str);
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            d(WEEX_TAG, str);
        }
    }

    public static void d(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2feb637c", new Object[]{str, bArr});
        } else {
            d(str, new String(bArr));
        }
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{str});
        } else {
            i(WEEX_TAG, str);
        }
    }

    public static void i(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4dce481", new Object[]{str, bArr});
        } else {
            i(str, new String(bArr));
        }
    }

    public static void info(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9dfc8bf", new Object[]{str});
        } else {
            i(WEEX_TAG, str);
        }
    }

    public static void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e977c8", new Object[]{str});
        } else {
            w(WEEX_TAG, str);
        }
    }

    public static void w(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff811a8f", new Object[]{str, bArr});
        } else {
            w(str, new String(bArr));
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else {
            e(WEEX_TAG, str);
        }
    }

    public static void e(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41bb07d", new Object[]{str, bArr});
        } else {
            e(str, new String(bArr));
        }
    }

    public static void wtf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c6d2fa", new Object[]{str});
        } else {
            wtf(WEEX_TAG, str);
        }
    }

    public static void d(String str, String str2) {
        List<JsLogWatcher> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            a(str, str2, LogLevel.DEBUG);
            if (!WXEnvironment.isApkDebugable() || !"jsLog".equals(str) || (list = c) == null || list.size() <= 0) {
                return;
            }
            for (JsLogWatcher jsLogWatcher : c) {
                if (str2.endsWith("__DEBUG")) {
                    jsLogWatcher.onJsLog(3, str2.replace("__DEBUG", ""));
                } else if (str2.endsWith("__INFO")) {
                    jsLogWatcher.onJsLog(3, str2.replace("__INFO", ""));
                } else if (str2.endsWith("__WARN")) {
                    jsLogWatcher.onJsLog(3, str2.replace("__WARN", ""));
                } else if (str2.endsWith("__ERROR")) {
                    jsLogWatcher.onJsLog(3, str2.replace("__ERROR", ""));
                } else {
                    jsLogWatcher.onJsLog(3, str2);
                }
            }
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
        } else {
            a(str, str2, LogLevel.INFO);
        }
    }

    public static void v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{str, str2});
        } else {
            a(str, str2, LogLevel.VERBOSE);
        }
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
        } else {
            a(str, str2, LogLevel.WARN);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            a(str, str2, LogLevel.ERROR);
        }
    }

    public static void wtf(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839ef244", new Object[]{str, str2});
        } else {
            a(str, str2, LogLevel.WTF);
        }
    }

    public static void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c8e4701", new Object[]{str});
        } else {
            d(WEEX_PERF_TAG, str);
        }
    }

    public static void d(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46dcd720", new Object[]{str, th});
        } else if (!WXEnvironment.isApkDebugable()) {
        } else {
            d(str + getStackTrace(th));
        }
    }

    public static void i(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("157ae5fb", new Object[]{str, th});
        } else if (!WXEnvironment.isApkDebugable()) {
        } else {
            info(str + getStackTrace(th));
        }
    }

    public static void v(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7c3fce", new Object[]{str, th});
        } else if (!WXEnvironment.isApkDebugable()) {
        } else {
            v(str + getStackTrace(th));
        }
    }

    public static void w(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be68a92d", new Object[]{str, th});
            return;
        }
        w(str + getStackTrace(th));
    }

    public static void e(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9407f", new Object[]{str, th});
            return;
        }
        e(str + getStackTrace(th));
    }

    public static void wtf(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1420a13b", new Object[]{str, th});
        } else if (!WXEnvironment.isApkDebugable()) {
        } else {
            wtf(str + getStackTrace(th));
        }
    }

    public static void p(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69f1c794", new Object[]{str, th});
        } else if (!WXEnvironment.isApkDebugable()) {
        } else {
            p(str + getStackTrace(th));
        }
    }

    public static void eTag(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af755ef", new Object[]{str, th});
        } else if (!WXEnvironment.isApkDebugable()) {
        } else {
            e(str, getStackTrace(th));
        }
    }

    public static String getStackTrace(Throwable th) {
        StringWriter stringWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b084d465", new Object[]{th});
        }
        if (th == null) {
            return "";
        }
        PrintWriter printWriter = null;
        try {
            stringWriter = new StringWriter();
            try {
                PrintWriter printWriter2 = new PrintWriter(stringWriter);
                try {
                    th.printStackTrace(printWriter2);
                    printWriter2.flush();
                    stringWriter.flush();
                    try {
                        stringWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    printWriter2.close();
                    return stringWriter.toString();
                } catch (Throwable th2) {
                    th = th2;
                    printWriter = printWriter2;
                    if (stringWriter != null) {
                        try {
                            stringWriter.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            stringWriter = null;
        }
    }

    private static void a(String str, String str2) {
        if (WXEnvironment.isApkDebugable()) {
            try {
                Class cls = b.get("com.taobao.weex.devtools.common.LogUtil");
                if (cls == null) {
                    return;
                }
                cls.getMethod("log", String.class, String.class).invoke(cls, str, str2);
            } catch (Exception unused) {
            }
        }
    }

    public static void setJsLogWatcher(JsLogWatcher jsLogWatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568291b9", new Object[]{jsLogWatcher});
        } else if (c.contains(jsLogWatcher)) {
        } else {
            c.add(jsLogWatcher);
        }
    }

    public static void setLogWatcher(LogWatcher logWatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b21ab8b", new Object[]{logWatcher});
        } else {
            d = logWatcher;
        }
    }
}
