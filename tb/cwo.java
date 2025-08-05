package tb;

import android.content.Context;
import tb.aav;

/* loaded from: classes.dex */
public class cwo {
    static {
        kge.a(-385346512);
    }

    public static void a(Context context) {
        aau.b = aav.b.f25195a.a(context.getApplicationContext());
        aau.f25192a = true;
    }

    public static boolean a() {
        if (aau.f25192a) {
            return aau.b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    public static String b(Context context) {
        if (aau.f25192a) {
            return aav.b.f25195a.a(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }
}
