package tb;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class llu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GOOD_PRICE_ORANGE_CONFIG = "good_price_config";
    public static final String GOOD_PRICE_VERSION = "goodprice_version";
    public static final String KEY_MEMORY_OPT_LEVEL = "memory-opt-level";

    static {
        kge.a(314964441);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : ((ghm) ghi.a(ghm.class)).isSpecifyVersionCode(GOOD_PRICE_VERSION);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return str;
        }
        return parse.getHost() + parse.getPath();
    }
}
