package tb;

import android.app.ActivityManager;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jqe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-370843626);
    }

    public static long a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6454", new Object[]{context})).longValue();
        }
        if (context == null) {
            return Long.MAX_VALUE;
        }
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            return memoryInfo.availMem;
        } catch (Exception e) {
            jqg.a("UltronMemoryUtils", e.getMessage());
            return Long.MAX_VALUE;
        }
    }

    public static long b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9eca0ff3", new Object[]{context})).longValue() : a(context) / 1048576;
    }
}
