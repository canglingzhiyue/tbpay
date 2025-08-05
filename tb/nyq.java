package tb;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class nyq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static float f31845a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;

    static {
        kge.a(1906040152);
        f31845a = -1.0f;
        b = -1;
        c = -1;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        DisplayMetrics displayMetrics = nym.a().getResources().getDisplayMetrics();
        if (Build.DEVICE.equalsIgnoreCase("mx2")) {
            d = 96;
        }
        Configuration configuration = nym.a().getResources().getConfiguration();
        if (Build.DEVICE.equalsIgnoreCase("mx2")) {
            d = 96;
        }
        if (configuration.orientation == 2) {
            e = displayMetrics.heightPixels / 2;
            f31845a = displayMetrics.density;
            b = displayMetrics.heightPixels;
            c = displayMetrics.widthPixels - d;
            f = b << 1;
            return;
        }
        e = displayMetrics.widthPixels / 2;
        f31845a = displayMetrics.density;
        b = displayMetrics.widthPixels;
        c = displayMetrics.heightPixels - d;
        f = b << 1;
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[0])).intValue();
        }
        if (c < 0) {
            a();
        }
        return c;
    }

    public static float b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83d9", new Object[0])).floatValue();
        }
        if (f31845a < 0.0f) {
            a();
        }
        return f31845a;
    }

    public static int a(float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f2)})).intValue() : (int) ((f2 * b()) + 0.5f);
    }

    public static int a(Context context, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f2)})).intValue() : (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
