package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tcommon.core.a;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class niv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2003766054);
    }

    public static njc a(InputStream inputStream, a aVar, int[] iArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njc) ipChange.ipc$dispatch("e373f44f", new Object[]{inputStream, aVar, iArr});
        }
        njj njjVar = new njj(null, iArr[0], 0);
        try {
            a(inputStream, aVar, njjVar);
            iArr[0] = njjVar.c();
            return njjVar.d();
        } catch (Throwable th) {
            iArr[0] = njjVar.c();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.ByteArrayOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.io.InputStream r10, com.taobao.tcommon.core.a r11, tb.njj r12) throws java.lang.Exception {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.niv.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r2] = r11
            r10 = 2
            r1[r10] = r12
            java.lang.String r10 = "2b8037e4"
            r0.ipc$dispatch(r10, r1)
            return
        L18:
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r11 == 0) goto L21
            byte[] r0 = r11.a(r0)
            goto L23
        L21:
            byte[] r0 = new byte[r0]
        L23:
            int r1 = r12.f31500a
            java.lang.String r4 = "Stream"
            r5 = 0
            if (r1 <= 0) goto L4d
            if (r11 == 0) goto L36
            int r1 = r12.f31500a     // Catch: java.lang.OutOfMemoryError -> L3e
            byte[] r1 = r11.a(r1)     // Catch: java.lang.OutOfMemoryError -> L3e
            r9 = r5
            r5 = r1
            r1 = r9
            goto L4e
        L36:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.OutOfMemoryError -> L3e
            int r6 = r12.f31500a     // Catch: java.lang.OutOfMemoryError -> L3e
            r1.<init>(r6)     // Catch: java.lang.OutOfMemoryError -> L3e
            goto L4e
        L3e:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            int r6 = r12.f31500a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r3] = r6
            java.lang.String r6 = "allocate byte array OOM with content length=%d"
            tb.niw.d(r4, r6, r1)
        L4d:
            r1 = r5
        L4e:
            if (r5 != 0) goto L5a
            if (r1 != 0) goto L5a
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r6 = 32768(0x8000, float:4.5918E-41)
            r1.<init>(r6)
        L5a:
            int r6 = r10.read(r0)     // Catch: java.lang.Throwable -> Laf
            r7 = -1
            if (r6 == r7) goto L7c
            boolean r8 = r12.a(r6)     // Catch: java.lang.Throwable -> Laf
            if (r8 == 0) goto L7c
            if (r1 == 0) goto L6d
            r1.write(r0, r3, r6)     // Catch: java.lang.Throwable -> Laf
            goto L74
        L6d:
            int r8 = r12.c()     // Catch: java.lang.Throwable -> Laf
            java.lang.System.arraycopy(r0, r3, r5, r8, r6)     // Catch: java.lang.Throwable -> Laf
        L74:
            boolean r8 = r12.b(r6)     // Catch: java.lang.Throwable -> Laf
            if (r8 != 0) goto L5a
            r8 = 1
            goto L7d
        L7c:
            r8 = 0
        L7d:
            if (r8 != 0) goto La1
            if (r1 == 0) goto L86
            byte[] r1 = r1.toByteArray()     // Catch: java.lang.Throwable -> Laf
            goto L87
        L86:
            r1 = r5
        L87:
            r12.a(r1)     // Catch: java.lang.Throwable -> Laf
            if (r6 == r7) goto La0
            java.lang.String r1 = "read bytes incorrect, exceed content-length=%d"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L9d
            int r12 = r12.f31500a     // Catch: java.lang.Throwable -> L9d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L9d
            r2[r3] = r12     // Catch: java.lang.Throwable -> L9d
            tb.niw.c(r4, r1, r2)     // Catch: java.lang.Throwable -> L9d
            goto La0
        L9d:
            r12 = move-exception
            r2 = 0
            goto Lb0
        La0:
            r2 = 0
        La1:
            if (r11 == 0) goto Lab
            r11.a(r0)
            if (r2 == 0) goto Lab
            r11.a(r5)
        Lab:
            r10.close()     // Catch: java.lang.Throwable -> Lae
        Lae:
            return
        Laf:
            r12 = move-exception
        Lb0:
            if (r11 == 0) goto Lba
            r11.a(r0)
            if (r2 == 0) goto Lba
            r11.a(r5)
        Lba:
            r10.close()     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.niv.a(java.io.InputStream, com.taobao.tcommon.core.a, tb.njj):void");
    }
}
