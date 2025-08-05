package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.StringTokenizer;

/* loaded from: classes5.dex */
public class syv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1125266192);
    }

    public static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a12221e4", new Object[]{obj, str});
        }
        Object obj2 = null;
        if (obj != null && str != null) {
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
                        obj2 = obj;
                    }
                }
                if (z) {
                    obj2 = foa.a(obj2, nextToken);
                }
            }
        }
        return obj2;
    }
}
