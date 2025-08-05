package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.ability.BootstrapMode;

/* loaded from: classes5.dex */
public class nlc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue();
        }
        int d = BootstrapMode.d();
        if (!BootstrapMode.a(d, 4) && !BootstrapMode.a(d, 8)) {
            z = false;
        }
        if (z) {
            return BootstrapMode.a(d, i);
        }
        return false;
    }
}
