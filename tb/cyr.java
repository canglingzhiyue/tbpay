package tb;

import android.content.Context;

/* loaded from: classes4.dex */
public class cyr {

    /* renamed from: a  reason: collision with root package name */
    private static Context f26604a;

    public static Context a() {
        return f26604a;
    }

    public static void a(Context context) {
        if (context == null || f26604a != null) {
            return;
        }
        f26604a = context.getApplicationContext();
    }
}
