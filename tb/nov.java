package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.y;
import com.taobao.vessel.utils.b;

/* loaded from: classes7.dex */
public class nov {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FROM_FULL = "full";
    public static final String FROM_SMALL = "small";
    public static final int STRATEGY_DIRECT = 0;
    public static final int STRATEGY_MUISE = 6;
    public static final int STRATEGY_WEEX = 3;

    static {
        kge.a(2045858299);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        String a2 = y.a(str, "wh_weex");
        String a3 = y.a(str, b.WX_TPL);
        String a4 = y.a(str, "_mus_tpl");
        String a5 = y.a(str, "wh_muise");
        if ("true".equals(a2) || !TextUtils.isEmpty(a3)) {
            return 3;
        }
        return (!TextUtils.isEmpty(a4) || !TextUtils.isEmpty(a5)) ? 6 : 0;
    }
}
