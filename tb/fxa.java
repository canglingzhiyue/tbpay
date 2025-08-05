package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1851242372);
    }

    public static long a(String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c26", new Object[]{str})).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        int length = str.length();
        long j = length;
        if (length > 96) {
            return b(str);
        }
        while (i < (length & (-4))) {
            j = (j * 67503105) + (str.charAt(i) * 769) + (str.charAt(i + 1) * 513) + (str.charAt(i + 2) * 257) + str.charAt(i + 3);
            i += 4;
        }
        while (i < length) {
            j = (j * 257) + str.charAt(i);
            i++;
        }
        return j + (j << (length & 31));
    }

    public static long b(String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{str})).longValue();
        }
        int length = str.length();
        if (length > 0) {
            i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i = (i * 199) + str.charAt(i2);
            }
        } else {
            i = 0;
        }
        return i;
    }
}
