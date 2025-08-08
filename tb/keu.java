package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class keu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUFFIX_MP4 = ".mp4";

    static {
        kge.a(1462937093);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            return str.split("\\?")[0].endsWith(str2);
        }
        return false;
    }
}
