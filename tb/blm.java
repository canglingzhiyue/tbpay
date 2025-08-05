package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes2.dex */
public class blm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(313981315);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("newUltron_container", "crashWhenFindLastVisibleItem", "true"));
    }
}
