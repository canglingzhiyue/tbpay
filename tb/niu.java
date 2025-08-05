package tb;

import android.graphics.Bitmap;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class niu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1275218651);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue() : i >> 16;
    }

    public static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue() : (i << 16) | (i2 & 65535);
    }

    public static int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{new Integer(i)})).intValue() : i & 65535;
    }

    public static int b(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("315a901c", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
        }
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (i == 0) {
            return (int) (i3 * (i2 / i4));
        }
        if (i2 == 0) {
            return i;
        }
        double d = i4 / i3;
        double d2 = i2;
        return ((double) i) * d > d2 ? (int) (d2 / d) : i;
    }

    public static int a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d16211b", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
        }
        double min = Math.min(i / i3, i2 / i4);
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 > min) {
                return (int) f;
            }
            f = f2;
        }
    }

    public static int a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acc0f2b9", new Object[]{bitmap})).intValue();
        }
        if (bitmap == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
            }
        }
        return bitmap.getHeight() * bitmap.getRowBytes();
    }
}
