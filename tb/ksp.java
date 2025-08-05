package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.linklog.a;
import com.taobao.tao.log.TLog;

/* loaded from: classes7.dex */
public class ksp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f30291a;

    static {
        kge.a(668476905);
        f30291a = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            f30291a = false;
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (f30291a) {
        } else {
            TLog.logi("homepage_track", str, str2);
            a.a("logTrack", str, str2);
            nlj.b(str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (f30291a) {
        } else {
            TLog.logd("homepage_track", str, str2);
            a.a("logTrack", str, str2);
            nlj.c(str, str2);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
            return;
        }
        TLog.loge("homepage_track", str, str2);
        a.b("logTrack", "logTrack", "logTrack", str, str2);
        nlj.a(str, str2);
    }

    public static void a(String str, String str2, Throwable th) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
            return;
        }
        if (th == null) {
            a2 = str2 + "******* NULL == e *******";
        } else {
            a2 = a(str2, th);
        }
        TLog.loge("homepage_track", str, a2);
        a.b("logTrack", "logTrack", "logTrack", str, a2);
        nlj.a(str, a2, th);
    }

    private static String a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fda15ffd", new Object[]{str, th});
        }
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String message = th.getMessage();
        String name = th.getClass().getName();
        sb.append("\t");
        sb.append(str + "\t");
        sb.append(name);
        sb.append("  ");
        sb.append(message);
        sb.append("\r\n");
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (message == null || message.length() == 0) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("\tat  ");
            sb.append(stackTraceElement);
            sb.append("\r\n");
        }
        return sb.toString();
    }
}
