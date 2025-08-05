package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes7.dex */
public class lye {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f30985a = Charset.forName("UTF-8");

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : str != null && str.matches(".*.csv");
    }

    public static String[] a(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("46292e3a", new Object[]{inputStream}) : a(inputStream, f30985a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String[] a(java.io.InputStream r3, java.nio.charset.Charset r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.lye.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            java.lang.String r3 = "eac58548"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            java.lang.String[] r3 = (java.lang.String[]) r3
            return r3
        L18:
            r0 = 0
            if (r3 == 0) goto L44
            tb.lyf r1 = new tb.lyf     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r2 = 44
            r1.<init>(r3, r2, r4)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L32
            r1.d()     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L3d
            java.lang.String[] r3 = r1.a()     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L3d
            r1.f()
            return r3
        L2d:
            r3 = move-exception
            goto L34
        L2f:
            r3 = move-exception
            r1 = r0
            goto L3e
        L32:
            r3 = move-exception
            r1 = r0
        L34:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L44
            r1.f()
            goto L44
        L3d:
            r3 = move-exception
        L3e:
            if (r1 == 0) goto L43
            r1.f()
        L43:
            throw r3
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lye.a(java.io.InputStream, java.nio.charset.Charset):java.lang.String[]");
    }

    public static List<String[]> b(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("8d29b2bd", new Object[]{inputStream}) : b(inputStream, f30985a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String[]> b(java.io.InputStream r3, java.nio.charset.Charset r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.lye.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            java.lang.String r3 = "387eb72f"
            java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
            java.util.List r3 = (java.util.List) r3
            return r3
        L18:
            r0 = 0
            if (r3 == 0) goto L53
            tb.lyf r1 = new tb.lyf     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r2 = 44
            r1.<init>(r3, r2, r4)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r1.d()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4c
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4c
            r3.<init>()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4c
        L2a:
            boolean r4 = r1.c()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4c
            if (r4 == 0) goto L38
            java.lang.String[] r4 = r1.b()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4c
            r3.add(r4)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L4c
            goto L2a
        L38:
            r1.f()
            return r3
        L3c:
            r3 = move-exception
            goto L43
        L3e:
            r3 = move-exception
            r1 = r0
            goto L4d
        L41:
            r3 = move-exception
            r1 = r0
        L43:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L53
            r1.f()
            goto L53
        L4c:
            r3 = move-exception
        L4d:
            if (r1 == 0) goto L52
            r1.f()
        L52:
            throw r3
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lye.b(java.io.InputStream, java.nio.charset.Charset):java.util.List");
    }
}
