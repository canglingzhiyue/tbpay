package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lxp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1333763851);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
