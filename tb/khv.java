package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.intf.Mtop;

/* loaded from: classes.dex */
public class khv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Mtop.XIAOMI_WIDGET_PROCESS_NAME.equals(khm.a().f());
    }
}
