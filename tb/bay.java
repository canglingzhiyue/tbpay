package tb;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bay {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f25742a;
    private static int b;
    private static DisplayMetrics c;
    private static Resources d;

    static {
        kge.a(-423259393);
        f25742a = -1;
        b = -1;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        Resources resources = context.getResources();
        d = resources;
        c = resources.getDisplayMetrics();
    }

    public static DisplayMetrics a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("53d6ed8b", new Object[0]);
        }
        DisplayMetrics displayMetrics = c;
        return displayMetrics == null ? Resources.getSystem().getDisplayMetrics() : displayMetrics;
    }

    public static Resources d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Resources) ipChange.ipc$dispatch("45bf56bc", new Object[0]);
        }
        Resources resources = d;
        return resources == null ? Resources.getSystem() : resources;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        if (f25742a < 0) {
            DisplayMetrics a2 = a();
            f25742a = Math.min(a2.widthPixels, a2.heightPixels);
        }
        return f25742a;
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue();
        }
        if (b < 0) {
            DisplayMetrics a2 = a();
            b = Math.max(a2.widthPixels, a2.heightPixels);
        }
        return b;
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[0])).intValue();
        }
        int identifier = d().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        return d().getDimensionPixelSize(identifier);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue() : (int) (f * a().density);
    }
}
