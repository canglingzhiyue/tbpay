package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.p;
import java.util.Map;

/* loaded from: classes7.dex */
public class ngs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1754906520);
    }

    public static String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map});
        }
        nfg k = p.b().k();
        if (k == null) {
            return null;
        }
        return k.a(str, map);
    }

    public static nfh a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfh) ipChange.ipc$dispatch("6ee0002d", new Object[]{str, str2, map});
        }
        nfg k = p.b().k();
        if (k == null) {
            return null;
        }
        return k.a(str, str2, map);
    }
}
