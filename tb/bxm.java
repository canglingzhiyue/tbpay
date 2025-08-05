package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes4.dex */
public class bxm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f26161a = "0123456789abcdef".toCharArray();

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f26162a;
        public final String b;
        public final String c;
        public final String d;

        public a(JSONObject jSONObject, String str, String str2, String str3) {
            this.f26162a = jSONObject;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "<TplCdnDownloadItem id=" + this.b + " url=" + this.c + " hash=" + this.d + ">";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0250 A[LOOP:3: B:92:0x024a->B:94:0x0250, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] a(android.content.Context r19, tb.bxl r20, java.util.Map<java.lang.String, java.lang.String> r21) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bxm.a(android.content.Context, tb.bxl, java.util.Map):java.lang.Object[]");
    }

    public static byte[] a(String str) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{str});
        }
        char[] charArray = str.toCharArray();
        if (charArray.length == 32) {
            char[] cArr = new char[32];
            System.arraycopy(charArray, 0, cArr, 16, 16);
            System.arraycopy(charArray, 16, cArr, 0, 16);
            char c = charArray[1];
            char[] cArr2 = new char[32];
            for (int i = 0; i < 32; i++) {
                cArr2[i] = f26161a[(cArr[i] ^ c) % 16];
            }
            char c2 = cArr2[1];
            for (int i2 = 0; i2 < 32; i2++) {
                cArr2[i2] = f26161a[(cArr2[i2] ^ c2) % 16];
            }
            char[] cArr3 = new char[16];
            System.arraycopy(cArr2, 8, cArr3, 0, 16);
            return new String(cArr3).getBytes(Charset.forName("UTF-8"));
        }
        throw new RuntimeException("Wrong hash length: " + charArray.length);
    }
}
