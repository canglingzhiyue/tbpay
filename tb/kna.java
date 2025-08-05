package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;

/* loaded from: classes7.dex */
public class kna {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f30177a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        try {
            return a(str2).equals(str.toLowerCase());
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.kna.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            java.lang.String r6 = "9f352ae"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L15:
            r0 = 0
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L67
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L67
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L67
            java.nio.channels.FileChannel r0 = r3.getChannel()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r6 = 102400(0x19000, float:1.43493E-40)
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r6)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
        L2c:
            int r4 = r0.read(r6)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r5 = -1
            if (r4 == r5) goto L43
            byte[] r5 = r6.array()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r1.update(r5, r2, r4)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r6.position(r2)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r4 = 1
            java.lang.Thread.sleep(r4)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            goto L2c
        L43:
            byte[] r6 = r1.digest()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            java.lang.String r6 = a(r6)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r3.close()     // Catch: java.io.IOException -> L4f
            goto L53
        L4f:
            r1 = move-exception
            r1.printStackTrace()
        L53:
            if (r0 == 0) goto L5d
            r0.close()     // Catch: java.io.IOException -> L59
            goto L5d
        L59:
            r0 = move-exception
            r0.printStackTrace()
        L5d:
            return r6
        L5e:
            r6 = move-exception
            goto L86
        L60:
            r6 = move-exception
            r1 = r0
            r0 = r3
            goto L69
        L64:
            r6 = move-exception
            r3 = r0
            goto L86
        L67:
            r6 = move-exception
            r1 = r0
        L69:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = ""
            if (r0 == 0) goto L78
            r0.close()     // Catch: java.io.IOException -> L74
            goto L78
        L74:
            r0 = move-exception
            r0.printStackTrace()
        L78:
            if (r1 == 0) goto L82
            r1.close()     // Catch: java.io.IOException -> L7e
            goto L82
        L7e:
            r0 = move-exception
            r0.printStackTrace()
        L82:
            return r6
        L83:
            r6 = move-exception
            r3 = r0
            r0 = r1
        L86:
            if (r3 == 0) goto L90
            r3.close()     // Catch: java.io.IOException -> L8c
            goto L90
        L8c:
            r1 = move-exception
            r1.printStackTrace()
        L90:
            if (r0 == 0) goto L9a
            r0.close()     // Catch: java.io.IOException -> L96
            goto L9a
        L96:
            r0 = move-exception
            r0.printStackTrace()
        L9a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.kna.a(java.lang.String):java.lang.String");
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
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
            char[] cArr2 = f30177a;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i = i3 + 1;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
