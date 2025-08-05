package mtopsdk.network.domain;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import tb.kge;

/* loaded from: classes.dex */
public abstract class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private byte[] f25010a = null;

    static {
        kge.a(2102325392);
    }

    public abstract long a() throws IOException;

    public abstract InputStream b();

    public byte[] c() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ab8ad2b3", new Object[]{this});
        }
        if (this.f25010a == null) {
            this.f25010a = d();
        }
        return this.f25010a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.DataInputStream, java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] d() throws java.io.IOException {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = mtopsdk.network.domain.c.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r9
            java.lang.String r2 = "ad3fab52"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            byte[] r0 = (byte[]) r0
            return r0
        L15:
            long r0 = r9.a()
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto L8b
            java.io.InputStream r3 = r9.b()
            r4 = 0
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L58
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L58
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            r3.<init>()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L83
        L33:
            int r7 = r5.read(r6)     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L83
            r8 = -1
            if (r7 == r8) goto L3e
            r3.write(r6, r2, r7)     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L83
            goto L33
        L3e:
            r3.flush()     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L83
            byte[] r2 = r3.toByteArray()     // Catch: java.lang.Exception -> L4c java.lang.Throwable -> L83
            tb.rys.a(r5)
            tb.rys.a(r3)
            goto L6a
        L4c:
            r2 = move-exception
            goto L5b
        L4e:
            r0 = move-exception
            r3 = r4
            goto L84
        L51:
            r2 = move-exception
            r3 = r4
            goto L5b
        L54:
            r0 = move-exception
            r3 = r4
            r5 = r3
            goto L84
        L58:
            r2 = move-exception
            r3 = r4
            r5 = r3
        L5b:
            java.lang.String r6 = "mtopsdk.ResponseBody"
            java.lang.String r7 = "[readBytes] read bytes from byteStream error."
            mtopsdk.common.util.TBSdkLog.e(r6, r7, r2)     // Catch: java.lang.Throwable -> L83
            tb.rys.a(r5)
            tb.rys.a(r3)
            r2 = r4
        L6a:
            if (r2 != 0) goto L6d
            return r4
        L6d:
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L82
            int r3 = r2.length
            long r3 = (long) r3
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L7a
            goto L82
        L7a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Content-Length and stream length disagree"
            r0.<init>(r1)
            throw r0
        L82:
            return r2
        L83:
            r0 = move-exception
        L84:
            tb.rys.a(r5)
            tb.rys.a(r3)
            throw r0
        L8b:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot buffer entire body for content length: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mtopsdk.network.domain.c.d():byte[]");
    }
}
