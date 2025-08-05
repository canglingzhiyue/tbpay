package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public class axr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(171309797);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a12221e4", new Object[]{obj, str});
        }
        if (obj != null && str != 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, " ${.[]}", true);
            boolean z = false;
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (nextToken.length() == 1) {
                    char charAt = nextToken.charAt(0);
                    if ('$' != charAt) {
                        if (' ' != charAt && '[' != charAt && ']' != charAt && '{' != charAt && '.' != charAt) {
                            if ('}' == charAt) {
                                break;
                            }
                        }
                    } else {
                        z = true;
                        str = obj;
                    }
                }
                if (z) {
                    str = axx.a(str, nextToken);
                }
            }
        }
        return str;
    }
}
