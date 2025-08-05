package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.common.d;
import com.taobao.tao.Globals;

/* loaded from: classes2.dex */
public class bgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : d.a(Globals.getApplication());
    }
}
