package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public class jri {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(312028244);
    }

    public static Set<String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("bf40e8a1", new Object[]{str});
        }
        try {
            if (!StringUtils.isEmpty(str)) {
                return new HashSet(Arrays.asList(str.split(";")));
            }
        } catch (Throwable th) {
            jrk.a(th);
        }
        return new HashSet();
    }
}
