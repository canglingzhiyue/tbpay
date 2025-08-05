package tb;

import android.content.Context;

/* loaded from: classes4.dex */
public class czr {
    public static <T> T a(Context context, String str, String str2, T t) {
        try {
            if (a(context, str, str2)) {
                String b = czo.b(context.getSharedPreferences(str, 0).getString(str2, ""));
                if (t instanceof Integer) {
                    return (T) Integer.valueOf(b);
                }
                if (t instanceof Boolean) {
                    return (T) Boolean.valueOf(b);
                }
                if (t instanceof Long) {
                    return (T) Long.valueOf(b);
                }
                if (!(t instanceof String)) {
                    throw new Exception("unsupported type");
                }
                return (T) String.valueOf(b);
            }
        } catch (Exception unused) {
        }
        return t;
    }

    public static boolean a(Context context, String str, String str2) {
        return context.getSharedPreferences(str, 0).contains(str2);
    }

    public static synchronized void b(Context context, String str, String str2) {
        synchronized (czr.class) {
            try {
                context.getSharedPreferences(str, 0).edit().remove(str2).commit();
            } catch (Exception unused) {
            }
        }
    }

    public static <T> void b(Context context, String str, String str2, T t) {
        try {
            context.getSharedPreferences(str, 0).edit().putString(str2, czo.a(t.toString())).commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
