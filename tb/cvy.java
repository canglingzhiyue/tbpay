package tb;

import android.util.Log;

/* loaded from: classes4.dex */
public class cvy {
    public static final String TAG = "mcssdk---";

    /* renamed from: a  reason: collision with root package name */
    private static String f26558a;
    private static boolean b;
    private static boolean c;
    private static boolean d;
    private static boolean e;
    private static boolean f;
    private static String g;
    private static boolean h;

    static {
        kge.a(-1094587568);
        f26558a = "MCS";
        b = false;
        c = false;
        d = true;
        e = true;
        f = true;
        g = "-->";
        h = true;
    }

    public static void a(String str) {
        if (!d || !h) {
            return;
        }
        String str2 = f26558a + g + str;
    }

    public static void a(String str, String str2) {
        if (!f || !h) {
            return;
        }
        Log.e(str, f26558a + g + str2);
    }

    public static void a(boolean z) {
        h = z;
        boolean z2 = z;
        b = z2;
        d = z2;
        c = z2;
        e = z2;
        f = z2;
    }

    public static void b(String str) {
        if (!f || !h) {
            return;
        }
        Log.e(TAG, f26558a + g + str);
    }
}
