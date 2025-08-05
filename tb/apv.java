package tb;

import com.android.alibaba.ip.runtime.IpChange;

@Deprecated
/* loaded from: classes.dex */
public class apv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-779556026);
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (aqc.c(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }
}
