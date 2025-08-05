package tb;

import android.content.Context;

/* loaded from: classes4.dex */
public class czq {
    public static int a(Context context, String str) {
        if (a()) {
            return b(context, str);
        }
        return 10;
    }

    private static boolean a() {
        try {
            return Class.forName("androidx.core.content.ContextCompat") != null;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static int b(Context context, String str) {
        try {
            Object invoke = Class.forName("androidx.core.content.ContextCompat").getDeclaredMethod("checkSelfPermission", Context.class, String.class).invoke(null, context, str);
            if (invoke == null) {
                return 0;
            }
            return Integer.parseInt(invoke.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
