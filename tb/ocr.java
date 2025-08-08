package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ocr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1990108976);
    }

    public static oct a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oct) ipChange.ipc$dispatch("953ddc6a", new Object[]{str, str2});
        }
        if ("taopasswordBackflow_goods".equals(str) && !StringUtils.isEmpty(str2)) {
            return new ocs(str2);
        }
        return null;
    }
}
