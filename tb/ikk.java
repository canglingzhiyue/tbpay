package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class ikk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4dbad4dc", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig(str, str2, null);
            return ikw.a((CharSequence) config) ? z : Boolean.parseBoolean(config);
        } catch (Throwable th) {
            ikq.a("OUtils.getBoolean,error", th);
            return z;
        }
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        if (ikw.a((CharSequence) str)) {
            return Collections.emptyMap();
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str);
        return (configs == null || configs.isEmpty()) ? Collections.emptyMap() : configs;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : ikw.a((CharSequence) str) ? str2 : OrangeConfig.getInstance().getCustomConfig(str, str2);
    }
}
