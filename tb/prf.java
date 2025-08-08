package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class prf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1116611443);
    }

    public static int a(String str) throws IllegalArgumentException {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (StringUtils.isEmpty(str) || str.charAt(0) != '#') {
            throw new IllegalArgumentException("Unknown color");
        }
        long parseLong = Long.parseLong(str.substring(1), 16);
        if (str.length() == 7) {
            j = (-16777216) | parseLong;
        } else if (str.length() != 9) {
            throw new IllegalArgumentException("Unknown color");
        } else {
            j = ((255 & parseLong) << 24) | (parseLong >> 8);
        }
        return (int) j;
    }
}
