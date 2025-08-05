package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class ixf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MARKET_COMMA = ",";
    public static final String MARKET_EQUAL = "=";

    static {
        kge.a(1674076858);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        return str + str3 + str2;
    }
}
