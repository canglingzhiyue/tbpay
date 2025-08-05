package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import com.alipay.mobile.common.logging.api.DeviceProperty;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class mkt extends mkh<mks> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Application f31076a;
    private final int[] b = {Process.myPid()};

    @Override // tb.mkh
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [tb.mks, java.lang.Object] */
    @Override // tb.mkh
    public /* synthetic */ mks a(int i, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8d357de8", new Object[]{this, new Integer(i), map}) : c(i, map);
    }

    public mkt(Application application) {
        this.f31076a = application;
    }

    public mks c(int i, Map<String, ?> map) {
        Debug.MemoryInfo memoryInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mks) ipChange.ipc$dispatch("d984c385", new Object[]{this, new Integer(i), map});
        }
        if (Build.VERSION.SDK_INT < 23) {
            return new mks(Collections.emptyMap());
        }
        long maxMemory = Runtime.getRuntime().maxMemory();
        long j = Runtime.getRuntime().totalMemory();
        long freeMemory = j - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize();
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
        long j2 = 0;
        if (!"vivo".equalsIgnoreCase(Build.BRAND) && !DeviceProperty.ALIAS_ONEPLUS.equalsIgnoreCase(Build.BRAND)) {
            j2 = Debug.getPss() << 10;
        }
        if (i == 13 || i == 14) {
            try {
                memoryInfo = ((ActivityManager) this.f31076a.getSystemService("activity")).getProcessMemoryInfo(this.b)[0];
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
            return new mks(i, map, maxMemory, j, freeMemory, nativeHeapSize, nativeHeapAllocatedSize, j2, Debug.getRuntimeStats(), memoryInfo);
        }
        memoryInfo = null;
        return new mks(i, map, maxMemory, j, freeMemory, nativeHeapSize, nativeHeapAllocatedSize, j2, Debug.getRuntimeStats(), memoryInfo);
    }
}
