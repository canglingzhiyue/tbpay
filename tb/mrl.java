package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;

/* loaded from: classes5.dex */
public final class mrl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-746737998);
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            ADaemon.postMainLooper(runnable, new long[0]);
        }
    }

    public static void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{runnable, new Long(j)});
        } else {
            ADaemon.postMainLooper(runnable, j);
        }
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
        } else {
            ADaemon.removeMainLooperCallback(runnable);
        }
    }
}
