package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class szh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1132097537);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        int indexOf = str.indexOf(":");
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return str.substring(0, indexOf);
    }
}
