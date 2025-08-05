package tb;

import com.alibaba.motu.tbrest.d;
import com.taobao.search.common.util.k;

/* loaded from: classes.dex */
public class byw {

    /* renamed from: a  reason: collision with root package name */
    public static int f26191a;
    private static byv b;

    static {
        kge.a(1414513062);
        f26191a = 0;
        b = null;
        System.setProperty("http.keepAlive", "true");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.byu a(java.lang.String r8, java.lang.String r9, byte[] r10) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.byw.a(java.lang.String, java.lang.String, byte[]):tb.byu");
    }

    public static byu a(String str, byte[] bArr) {
        StringBuilder sb;
        String str2;
        String str3 = d.a().c;
        if (d.a().i.booleanValue()) {
            sb = new StringBuilder();
            str2 = k.HTTP_PREFIX;
        } else {
            sb = new StringBuilder();
            str2 = k.HTTPS_PREFIX;
        }
        sb.append(str2);
        sb.append(str);
        sb.append("/upload");
        return a(str3, sb.toString(), bArr);
    }
}
