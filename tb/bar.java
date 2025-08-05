package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes2.dex */
public class bar {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME_SPACE = "aura_purchase";

    static {
        kge.a(1982971463);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("aura_purchase", str, String.valueOf(z)));
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : OrangeConfig.getInstance().getConfig("aura_purchase", str, str2);
    }

    public static double a(String str, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81239a3a", new Object[]{str, new Double(d)})).doubleValue();
        }
        try {
            return Double.parseDouble(OrangeConfig.getInstance().getConfig("aura_purchase", str, String.valueOf(d)));
        } catch (Exception unused) {
            return d;
        }
    }
}
