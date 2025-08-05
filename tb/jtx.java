package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes6.dex */
public class jtx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_GROUP_NAME = "aura_waitpay_detail";

    static {
        kge.a(-1080673970);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : OrangeConfig.getInstance().getConfig(ORANGE_GROUP_NAME, str, str2);
    }
}
