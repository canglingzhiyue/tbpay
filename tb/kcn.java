package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;

/* loaded from: classes6.dex */
public class kcn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBDWInstance";

    /* renamed from: a  reason: collision with root package name */
    private static String f29961a;
    private static String b;
    private static int c;

    static {
        kge.a(1635550290);
        f29961a = "";
        b = "";
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : kck.a();
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(riy.ARRAY_START_STR);
        stringBuffer.append(f29961a);
        stringBuffer.append("-");
        stringBuffer.append(b);
        stringBuffer.append(":");
        stringBuffer.append(c);
        stringBuffer.append(riy.ARRAY_END_STR);
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    private static void a(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cccacb29", new Object[]{stackTraceElementArr});
        } else if (stackTraceElementArr == null || stackTraceElementArr.length <= 3) {
        } else {
            f29961a = stackTraceElementArr[3].getFileName();
            b = stackTraceElementArr[3].getMethodName();
            c = stackTraceElementArr[3].getLineNumber();
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (a()) {
            a(new Throwable().getStackTrace());
            if (str == null) {
                str = "TBDWInstance";
            }
            AVSDKLog.e(str, a(str2));
        } else {
            if (str == null) {
                str = "TBDWInstance";
            }
            AVSDKLog.e(str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (a()) {
            a(new Throwable().getStackTrace());
            if (str == null) {
                str = "TBDWInstance";
            }
            AVSDKLog.i(str, a(str2));
        } else {
            if (str == null) {
                str = "TBDWInstance";
            }
            AVSDKLog.i(str, str2);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else if (a()) {
            a(new Throwable().getStackTrace());
            if (str == null) {
                str = "TBDWInstance";
            }
            AVSDKLog.d(str, a(str2));
        } else {
            if (str == null) {
                str = "TBDWInstance";
            }
            AVSDKLog.d(str, str2);
        }
    }
}
