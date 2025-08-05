package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.a;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.acn;

/* loaded from: classes.dex */
public abstract class AppCompatDelegate {
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_YES = 2;

    /* renamed from: a  reason: collision with root package name */
    private static int f1314a = -1;
    private static boolean b = false;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface NightMode {
    }

    public static AppCompatDelegate a(Activity activity, c cVar) {
        return a(activity, activity.getWindow(), cVar);
    }

    public static AppCompatDelegate a(Dialog dialog, c cVar) {
        return a(dialog.getContext(), dialog.getWindow(), cVar);
    }

    private static AppCompatDelegate a(Context context, Window window, c cVar) {
        return Build.VERSION.SDK_INT >= 24 ? new e(context, window, cVar) : Build.VERSION.SDK_INT >= 23 ? new g(context, window, cVar) : new f(context, window, cVar);
    }

    public static void a(boolean z) {
        b = z;
    }

    public static void d(int i) {
        if (i == -1 || i == 0 || i == 1 || i == 2) {
            f1314a = i;
        }
    }

    public static int k() {
        return f1314a;
    }

    public static boolean l() {
        return b;
    }

    public abstract ActionBar a();

    public abstract <T extends View> T a(int i);

    public abstract acn a(acn.a aVar);

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(Toolbar toolbar);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(CharSequence charSequence);

    public abstract MenuInflater b();

    public abstract void b(int i);

    public abstract void b(Bundle bundle);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void c();

    public abstract void c(Bundle bundle);

    public abstract boolean c(int i);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract a.InterfaceC0011a h();

    public abstract void i();

    public abstract boolean j();
}
