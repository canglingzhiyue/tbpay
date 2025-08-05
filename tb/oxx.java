package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes8.dex */
public class oxx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1867399088);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "1".equals(OrangeConfig.getInstance().getConfig("android_scancode_client", "enable_alipay_change_url", "1"));
    }
}
