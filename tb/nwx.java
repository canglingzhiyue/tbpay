package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.alibaba.ability.impl.photo.b;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class nwx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIGH_MAX_CACHE_SIZE = 104857600;
    public static final int LOW_MAX_CACHE_SIZE = 78643200;

    static {
        kge.a(-1723730638);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue() : a(context, 52428800, 5);
    }

    public static int a(Context context, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c642cb3", new Object[]{context, new Integer(i), new Integer(i2)})).intValue();
        }
        long maxMemory = Runtime.getRuntime().maxMemory();
        long j = 0;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            j = activityManager.getMemoryClass() * 1048576;
        }
        long min = Math.min(maxMemory, j);
        if (min < 33554432) {
            i3 = 6291456;
        } else {
            i3 = min < 67108864 ? b.MAX_IMAGE_SIZE : (int) (min / i2);
        }
        if (Build.VERSION.SDK_INT >= 23 && Process.is64Bit()) {
            int min2 = Math.min(i, i3);
            niw.d("MemCacheBuilder", "maxValue: " + min2, new Object[0]);
            return min2;
        }
        return Math.min(36700160, i3);
    }
}
