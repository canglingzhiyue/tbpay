package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

@Deprecated
/* loaded from: classes4.dex */
public class duy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1660680010);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("new_purchase", str, String.valueOf(z)));
    }
}
