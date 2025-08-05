package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class cge {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final a f26280a = b();

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f26281a = -1;
        public String b;

        public String a(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : cge.a(str);
        }
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5b08af20", new Object[0]) : f26280a;
    }

    private static a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3ce678bf", new Object[0]) : c();
    }

    private static a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1ec4425e", new Object[0]);
        }
        a aVar = new a();
        aVar.b = Build.MANUFACTURER.toLowerCase();
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.cge.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r6
            java.lang.String r6 = "9f352ae"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L15:
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r2.<init>()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            java.lang.String r3 = "getprop "
            r2.append(r3)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r2.append(r6)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            if (r1 == 0) goto L4c
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r1 = 1024(0x400, float:1.435E-42)
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            java.lang.String r1 = r2.readLine()     // Catch: java.io.IOException -> L4a java.lang.Throwable -> L7d
            r2.close()     // Catch: java.io.IOException -> L4a java.lang.Throwable -> L7d
            r0 = r2
            goto L4d
        L4a:
            r1 = move-exception
            goto L5c
        L4c:
            r1 = r0
        L4d:
            if (r0 == 0) goto L57
            r0.close()     // Catch: java.io.IOException -> L53
            goto L57
        L53:
            r6 = move-exception
            r6.printStackTrace()
        L57:
            return r1
        L58:
            r6 = move-exception
            goto L7f
        L5a:
            r1 = move-exception
            r2 = r0
        L5c:
            java.lang.String r3 = "AndroidOSUtils"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r4.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r5 = "Unable to read prop "
            r4.append(r5)     // Catch: java.lang.Throwable -> L7d
            r4.append(r6)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Throwable -> L7d
            android.util.Log.e(r3, r6, r1)     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L7c
            r2.close()     // Catch: java.io.IOException -> L78
            goto L7c
        L78:
            r6 = move-exception
            r6.printStackTrace()
        L7c:
            return r0
        L7d:
            r6 = move-exception
            r0 = r2
        L7f:
            if (r0 == 0) goto L89
            r0.close()     // Catch: java.io.IOException -> L85
            goto L89
        L85:
            r0 = move-exception
            r0.printStackTrace()
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cge.a(java.lang.String):java.lang.String");
    }
}
