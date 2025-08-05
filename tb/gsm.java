package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public final class gsm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int a(double d) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a82180c9", new Object[]{new Double(d)})).intValue() : (int) (Runtime.getRuntime().availableProcessors() / (1.0d - d));
    }
}
