package mtopsdk.security.util;

import com.android.alibaba.ip.runtime.IpChange;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import tb.kge;

/* loaded from: classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f25026a;

    static {
        kge.a(-446280918);
        f25026a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    private static char[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("27137f8f", new Object[]{bArr});
        }
        int length = bArr.length;
        char[] cArr = new char[length << 1];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            char[] cArr2 = f25026a;
            cArr[i] = cArr2[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[bArr[i2] & 15];
        }
        return cArr;
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            Mac mac = Mac.getInstance("HmacSha1");
            mac.init(new SecretKeySpec(str2.getBytes("utf-8"), "HmacSha1"));
            return new String(a(mac.doFinal(str.getBytes("utf-8"))));
        } catch (Exception unused) {
            return null;
        }
    }
}
