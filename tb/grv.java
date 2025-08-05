package tb;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class grv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f28421a;
    private boolean b;
    private boolean c = false;
    private WeakReference<Activity> d;
    private int e;

    public grv(Activity activity) {
        this.b = true;
        this.d = new WeakReference<>(activity);
        if (Build.VERSION.SDK_INT >= 21) {
            this.e = 2;
        } else if (Build.VERSION.SDK_INT >= 19) {
        } else {
            this.e = 0;
            this.b = false;
        }
    }

    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        WeakReference<Activity> weakReference = this.d;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        Window window = this.d.get().getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            Window window2 = this.d.get().getWindow();
            if (z) {
                window2.clearFlags(201326592);
                window2.getDecorView().setSystemUiVisibility(9472);
                window2.addFlags(Integer.MIN_VALUE);
            } else {
                window2.clearFlags(201334784);
                window2.getDecorView().setSystemUiVisibility(1280);
                window2.addFlags(Integer.MIN_VALUE);
            }
            window2.setStatusBarColor(0);
        } else if (Build.VERSION.SDK_INT >= 19) {
            window.addFlags(67108864);
        }
        return true;
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
                declaredMethod.setAccessible(true);
                f28421a = (String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
            } catch (Throwable unused) {
                f28421a = null;
            }
        }
    }
}
