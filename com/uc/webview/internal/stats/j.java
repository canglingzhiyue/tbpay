package com.uc.webview.internal.stats;

import mtopsdk.common.util.StringUtils;
import com.uc.webview.base.Log;
import com.uc.webview.base.io.a;
import java.io.File;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final String f24008a = "j";
    private final File b;
    private final long c;
    private final a.InterfaceC1034a d;

    public j(File file) {
        this(file, (byte) 0);
    }

    private j(File file, byte b) {
        this.b = file;
        this.c = Long.MAX_VALUE;
        this.d = new a.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
        if (r1 == null) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.uc.webview.internal.stats.d> b() {
        /*
            r10 = this;
            r0 = 0
            com.uc.webview.base.io.a r1 = r10.c()     // Catch: java.lang.Throwable -> L95
            boolean r2 = r1.a()     // Catch: java.lang.Throwable -> L8b
            if (r2 != 0) goto L20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = "load failed: invalid file "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = r1.b()     // Catch: java.lang.Throwable -> L8b
            r2.append(r3)     // Catch: java.lang.Throwable -> L8b
            com.uc.webview.base.Log.b()     // Catch: java.lang.Throwable -> L8b
            r1.d()
            return r0
        L20:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8b
            r2.<init>()     // Catch: java.lang.Throwable -> L8b
        L25:
            java.lang.String r0 = r1.c()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L83
            java.lang.String r3 = r0.trim()     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = "`"
            java.lang.String[] r3 = r3.split(r4)     // Catch: java.lang.Throwable -> L87
            if (r3 == 0) goto L73
            int r4 = r3.length     // Catch: java.lang.Throwable -> L87
            r5 = 3
            if (r4 < r5) goto L73
            int r4 = r3.length     // Catch: java.lang.Throwable -> L87
            int r4 = r4 % 2
            r5 = 1
            if (r4 == r5) goto L42
            goto L73
        L42:
            r0 = 0
            r0 = r3[r0]     // Catch: java.lang.Throwable -> L87
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L87
            r4.<init>()     // Catch: java.lang.Throwable -> L87
        L4a:
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L87
            int r7 = r5 + 1
            r7 = r3[r7]     // Catch: java.lang.Throwable -> L87
            int r5 = r5 + 2
            boolean r8 = android.text.StringUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L87
            if (r8 != 0) goto L61
            boolean r8 = android.text.StringUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L87
            if (r8 != 0) goto L61
            r4.put(r6, r7)     // Catch: java.lang.Throwable -> L87
        L61:
            int r6 = r3.length     // Catch: java.lang.Throwable -> L87
            if (r5 < r6) goto L4a
            boolean r3 = r4.isEmpty()     // Catch: java.lang.Throwable -> L87
            if (r3 != 0) goto L25
            com.uc.webview.internal.stats.d r3 = new com.uc.webview.internal.stats.d     // Catch: java.lang.Throwable -> L87
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> L87
            r2.add(r3)     // Catch: java.lang.Throwable -> L87
            goto L25
        L73:
            java.lang.String r3 = com.uc.webview.internal.stats.j.f24008a     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = "load error line data:"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = r4.concat(r0)     // Catch: java.lang.Throwable -> L87
            com.uc.webview.base.Log.w(r3, r0)     // Catch: java.lang.Throwable -> L87
            goto L25
        L83:
            r1.d()
            goto La3
        L87:
            r0 = move-exception
            goto L99
        L89:
            r0 = move-exception
            goto La4
        L8b:
            r2 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
            goto L99
        L90:
            r1 = move-exception
            r9 = r1
            r1 = r0
            r0 = r9
            goto La4
        L95:
            r2 = move-exception
            r1 = r0
            r0 = r2
            r2 = r1
        L99:
            java.lang.String r3 = com.uc.webview.internal.stats.j.f24008a     // Catch: java.lang.Throwable -> L89
            java.lang.String r4 = "load failed"
            com.uc.webview.base.Log.w(r3, r4, r0)     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto La3
            goto L83
        La3:
            return r2
        La4:
            if (r1 == 0) goto La9
            r1.d()
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.stats.j.b():java.util.List");
    }

    private com.uc.webview.base.io.a c() {
        return new com.uc.webview.base.io.a(this.b, this.c, this.d);
    }

    public final synchronized List<d> a() {
        List<d> b;
        b = b();
        com.uc.webview.base.io.d.c(f24008a + "-cl", this.b);
        return b;
    }

    public final synchronized void a(List<d> list) {
        if (list.isEmpty()) {
            Log.b();
            return;
        }
        long j = 0;
        com.uc.webview.base.io.a c = c();
        for (d dVar : list) {
            if (!StringUtils.isEmpty(dVar.f23997a) && dVar.b != null && !dVar.b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(dVar.f23997a);
                for (Map.Entry<String, String> entry : dVar.b.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!StringUtils.isEmpty(key) && !StringUtils.isEmpty(value)) {
                        sb.append("`");
                        sb.append(key);
                        sb.append("`");
                        sb.append(value);
                    }
                }
                String sb2 = sb.toString();
                j += sb2.length();
                "write line:".concat(String.valueOf(sb2));
                Log.b();
                if (c.c == null) {
                    c.c = new a.d(c.f23785a, true);
                }
                a.d dVar2 = c.c;
                if (c.b != null) {
                    sb2 = c.b.a(sb2);
                }
                dVar2.a(sb2);
            }
        }
        c.d();
        String str = f24008a;
        Log.d(str, "save size:" + j + ", total:" + this.b.length());
    }
}
