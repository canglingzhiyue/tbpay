package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class alb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public long[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (long[]) ipChange.ipc$dispatch("a821217d", new Object[]{this}) : new long[]{Runtime.getRuntime().maxMemory() >> 10, (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) >> 10};
    }

    public long[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (long[]) ipChange.ipc$dispatch("a9d5fa1c", new Object[]{this}) : new long[]{Debug.getNativeHeapSize() >> 10, (Debug.getNativeHeapAllocatedSize() - Debug.getNativeHeapFreeSize()) >> 10};
    }

    public long[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("ab8ad2bb", new Object[]{this});
        }
        long[] d = d();
        return new long[]{d[0], d[0] - ((d[1] + d[2]) + d[3])};
    }

    private long[] d() {
        long[] jArr = new long[4];
        try {
            Method method = Class.forName("android.os.Process").getMethod("readProcLines", String.class, String[].class, long[].class);
            String[] strArr = {"MemTotal:", "MemFree:", "Buffers:", "Cached:"};
            long[] jArr2 = new long[strArr.length];
            jArr2[0] = 30;
            jArr2[1] = -30;
            Object[] objArr = {"/proc/meminfo", strArr, jArr2};
            if (method != null) {
                method.invoke(null, objArr);
                for (int i = 0; i < jArr2.length; i++) {
                    jArr[i] = jArr2[i];
                }
            }
            return jArr;
        } catch (Exception e) {
            e.printStackTrace();
            return jArr;
        }
    }

    public long[] a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("8c63baa2", new Object[]{this, context, new Integer(i)});
        }
        long[] jArr = new long[3];
        try {
            if (i >= 0) {
                Debug.MemoryInfo memoryInfo = ((ActivityManager) context.getSystemService("activity")).getProcessMemoryInfo(new int[]{i})[0];
                jArr[0] = memoryInfo.dalvikPss;
                jArr[1] = memoryInfo.nativePss;
                jArr[2] = memoryInfo.getTotalPss();
            } else {
                jArr[0] = 0;
                jArr[1] = 0;
                jArr[2] = 0;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jArr;
    }

    public int[] a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("258f2884", new Object[]{this, context});
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        return new int[]{activityManager.getMemoryClass(), activityManager.getLargeMemoryClass()};
    }
}
