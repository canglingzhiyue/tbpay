package tb;

import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class odl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            return new String(a(Base64.decode(str, 0), str2.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b2e6bb67", new Object[]{bArr, bArr2});
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i % bArr2.length]);
        }
        return bArr3;
    }
}
