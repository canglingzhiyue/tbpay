package tb;

import com.alibaba.android.umbrella.link.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* loaded from: classes.dex */
public class lap {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1618961736);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        try {
            TLog.loge("Page_Home_Track", str, " " + str2 + " " + str3);
        } catch (Throwable th) {
            String str4 = null;
            a.a(th, a.POINT_COMMIT_FAILURE, "Page_Home", str4, str4, str4);
        }
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
            return;
        }
        TLog.logd("Page_Home_Track", str, " " + str2 + " " + str3);
    }

    public static String a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th});
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            th.printStackTrace(new PrintStream(byteArrayOutputStream));
            String byteArrayOutputStream2 = byteArrayOutputStream.toString();
            byteArrayOutputStream.close();
            return byteArrayOutputStream2;
        } catch (Throwable th2) {
            ldf.a("Page_Home_Track", "appendThrowable", th2);
            return "null";
        }
    }
}
