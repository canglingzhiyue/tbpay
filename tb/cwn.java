package tb;

import com.heytap.mspsdk.keychain.impl.b;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes4.dex */
public class cwn {
    public static final String TAG = "MSP-LOG-SDK-";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f26570a = false;
    public static boolean b = false;
    public static cwm c;

    static {
        kge.a(1612278634);
        c = new cwm();
        a();
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }

    public static void a() {
        boolean parseBoolean = Boolean.parseBoolean(b.a("persist.sys.assert.panic", "false"));
        boolean parseBoolean2 = Boolean.parseBoolean(b.a("persist.sys.assert.enable", "false"));
        if (parseBoolean || parseBoolean2) {
            b = true;
        }
        b(TAG, "isDebug=" + f26570a + " ,IS_SYSOPEN=" + b);
    }

    public static void a(String str, Exception exc) {
        String str2 = TAG + str;
        a(exc);
    }

    public static void a(String str, String str2) {
        if (b()) {
            String str3 = TAG + str;
        }
    }

    public static void a(String str, Throwable th) {
        cwm cwmVar = c;
        cwmVar.a(TAG + str, a(th));
    }

    public static void b(String str, String str2) {
        String str3 = TAG + str;
    }

    public static boolean b() {
        return f26570a || b;
    }

    public static void c(String str, String str2) {
        cwm cwmVar = c;
        cwmVar.a(TAG + str, str2);
    }
}
