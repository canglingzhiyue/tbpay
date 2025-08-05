package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dwf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(226478465);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (!str.startsWith("1") || str.length() != 11) {
            return str;
        }
        return str.substring(0, 3) + " " + str.substring(3, 7) + " " + str.substring(7);
    }
}
