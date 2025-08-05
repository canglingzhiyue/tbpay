package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public final class bam {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1290564615);
    }

    public static String a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bfa4f210", new Object[]{str, str2, str3, str4}) : a(str, str2, null, null, str3, str4);
    }

    public static String a(String str, String str2, Map<String, Object> map, Object obj, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bdf3107", new Object[]{str, str2, map, obj, str3, str4});
        }
        Variation variation = UTABTest.activate(str, str2, map, obj).getVariation(str3);
        if (variation == null) {
            return null;
        }
        return variation.getValueAsString(str4);
    }
}
