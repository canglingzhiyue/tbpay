package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class toc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(668809796);
    }

    public static long a(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb6ab7c3", new Object[]{bArr, new Integer(i), new Integer(i2)})).longValue();
        }
        long j = 0;
        int i3 = i2 + i;
        while (i < i3 && bArr[i] != 0) {
            if (bArr[i] == 32 || bArr[i] == 48) {
                if (!z) {
                    if (bArr[i] == 32) {
                        break;
                    }
                } else {
                    continue;
                    i++;
                }
            }
            j = (j << 3) + (bArr[i] - 48);
            z = false;
            i++;
        }
        return j;
    }
}
