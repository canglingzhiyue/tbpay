package tb;

import mtopsdk.common.util.StringUtils;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes7.dex */
public class npl extends npm {
    public static final String API_NAME = "mtop.taobao.wsearch.suggest";
    public static final String API_VERSION = "1.0";

    static {
        kge.a(1616954431);
    }

    public npl(String str) {
        super("mtop.taobao.wsearch.suggest", "1.0", true, false, "suggest");
        a("area", "active_page");
        a("src", "c2c");
        a("history", "off");
        a("action", a.ATOM_EXT_del);
        if (!StringUtils.isEmpty(str)) {
            a("q", str);
        }
    }
}
