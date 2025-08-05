package tb;

import android.util.Log;

/* loaded from: classes4.dex */
public class cyu {
    private static String a(String str) {
        return "SecurityComp10200300: " + str;
    }

    public static void a(String str, String str2) {
        a(str);
    }

    public static void a(String str, String str2, Throwable th) {
        Log.e(a(str), str2, th);
    }

    public static void b(String str, String str2) {
        a(str);
    }

    public static void c(String str, String str2) {
        Log.e(a(str), str2);
    }
}
