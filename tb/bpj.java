package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes2.dex */
public class bpj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(141399191);
    }

    public static String a(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe45281d", new Object[]{list, str});
        }
        if (list == null || list.isEmpty()) {
            return "";
        }
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : list) {
            if (str2 != null) {
                sb.append(str2);
                sb.append(str);
            }
        }
        if (sb.length() > 0 && sb.lastIndexOf(str) > 0) {
            sb.deleteCharAt(sb.lastIndexOf(str));
        }
        return sb.toString();
    }
}
