package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.io.File;

/* loaded from: classes.dex */
public final class iky {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : SystemClock.uptimeMillis();
    }

    public static String a(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        int lastIndexOf = str.lastIndexOf("/");
        return (lastIndexOf <= 0 || (i = lastIndexOf + 1) > str.length()) ? str : str.substring(i);
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        try {
            return iku.f(file);
        } catch (Throwable th) {
            ikq.a("safeDelete", th);
            return false;
        }
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
            return;
        }
        try {
            RSoLog.c("TUtils, ready to safeSleep  " + j);
            Thread.sleep(j);
        } catch (Throwable th) {
            ikq.a("safeSleep", th);
        }
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("935bc097", new Object[]{stackTraceElementArr});
        }
        if (stackTraceElementArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append(stackTraceElement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (str.startsWith("lib") && str.endsWith(bgy.SO_EXTENSION)) {
            return str;
        }
        return "lib" + str + bgy.SO_EXTENSION;
    }
}
