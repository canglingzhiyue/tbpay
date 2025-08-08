package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class nal {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1782245508);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("wh_weex=true") || str.contains("renderType=2");
    }
}
