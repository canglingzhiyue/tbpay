package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* loaded from: classes4.dex */
public class cyw {

    /* renamed from: a  reason: collision with root package name */
    private static SharedPreferences f26607a;

    public static synchronized SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (cyw.class) {
            if (f26607a == null) {
                f26607a = Build.VERSION.SDK_INT >= 24 ? context.createDeviceProtectedStorageContext().getSharedPreferences("aegis", 0) : context.getApplicationContext().getSharedPreferences("aegis", 0);
            }
            sharedPreferences = f26607a;
        }
        return sharedPreferences;
    }

    public static void a(String str, String str2, Context context) {
        a(context).edit().putString(str, str2).apply();
    }

    public static String b(String str, String str2, Context context) {
        return a(context).getString(str, str2);
    }
}
