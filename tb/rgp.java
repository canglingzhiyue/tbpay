package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;

/* loaded from: classes9.dex */
public class rgp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f33149a;

    static {
        kge.a(-1707728113);
        f33149a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isMd5Same(java.lang.String r6, java.lang.String r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.rgp.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r6 = "d370f299"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            boolean r0 = android.text.StringUtils.isEmpty(r6)
            if (r0 == 0) goto L23
            return r2
        L23:
            java.lang.String r6 = r6.toLowerCase()
            if (r7 != 0) goto L2a
            return r3
        L2a:
            r0 = 0
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
            java.nio.channels.FileChannel r0 = r2.getChannel()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r7 = 102400(0x19000, float:1.43493E-40)
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
        L41:
            int r4 = r0.read(r7)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r5 = -1
            if (r4 == r5) goto L58
            byte[] r5 = r7.array()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r1.update(r5, r3, r4)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r7.position(r3)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r4 = 1
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            goto L41
        L58:
            byte[] r7 = r1.digest()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            java.lang.String r7 = a(r7)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            boolean r6 = r7.equals(r6)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L79
            r2.close()     // Catch: java.io.IOException -> L68
            goto L6c
        L68:
            r7 = move-exception
            r7.printStackTrace()
        L6c:
            if (r0 == 0) goto L76
            r0.close()     // Catch: java.io.IOException -> L72
            goto L76
        L72:
            r7 = move-exception
            r7.printStackTrace()
        L76:
            return r6
        L77:
            r6 = move-exception
            goto L9d
        L79:
            r6 = move-exception
            r7 = r0
            r0 = r2
            goto L82
        L7d:
            r6 = move-exception
            r2 = r0
            goto L9d
        L80:
            r6 = move-exception
            r7 = r0
        L82:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L9a
            if (r0 == 0) goto L8f
            r0.close()     // Catch: java.io.IOException -> L8b
            goto L8f
        L8b:
            r6 = move-exception
            r6.printStackTrace()
        L8f:
            if (r7 == 0) goto L99
            r7.close()     // Catch: java.io.IOException -> L95
            goto L99
        L95:
            r6 = move-exception
            r6.printStackTrace()
        L99:
            return r3
        L9a:
            r6 = move-exception
            r2 = r0
            r0 = r7
        L9d:
            if (r2 == 0) goto La7
            r2.close()     // Catch: java.io.IOException -> La3
            goto La7
        La3:
            r7 = move-exception
            r7.printStackTrace()
        La7:
            if (r0 == 0) goto Lb1
            r0.close()     // Catch: java.io.IOException -> Lad
            goto Lb1
        Lad:
            r7 = move-exception
            r7.printStackTrace()
        Lb1:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rgp.isMd5Same(java.lang.String, java.lang.String):boolean");
    }

    public static String getTextMd5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e96a4f4", new Object[]{str});
        }
        try {
            return a(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (Throwable unused) {
            return "";
        }
    }

    private static final String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        char[] cArr = new char[32];
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            byte b = bArr[i2];
            int i3 = i + 1;
            char[] cArr2 = f33149a;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i = i3 + 1;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
