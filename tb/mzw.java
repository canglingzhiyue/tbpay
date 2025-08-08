package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.util.OLog;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public class mzw implements nab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f31349a;

    static {
        kge.a(696464901);
        kge.a(1678113215);
        f31349a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    @Override // tb.nab
    public String a(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("61b42118", new Object[]{this, context, str, str2, str3, str4}) : a(str3, str2);
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            try {
                Mac mac = Mac.getInstance("HmacSHA1");
                mac.init(new SecretKeySpec(str2.getBytes("utf-8"), "HmacSHA1"));
                char[] a2 = a(mac.doFinal(str.getBytes("utf-8")));
                if (a2 == null) {
                    return null;
                }
                return new String(a2);
            } catch (Exception e) {
                OLog.e("HmacSign", "hmacSha1", e, new Object[0]);
            }
        }
        return null;
    }

    private char[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("27137f8f", new Object[]{this, bArr});
        }
        int length = bArr.length;
        char[] cArr = new char[length << 1];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            char[] cArr2 = f31349a;
            cArr[i] = cArr2[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[bArr[i2] & 15];
        }
        return cArr;
    }
}
