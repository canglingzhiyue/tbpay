package com.huawei.hms.hatool;

import android.os.Build;
import android.text.TextUtils;
import tb.cyf;
import tb.cyh;

/* loaded from: classes4.dex */
public class o0 {
    private static o0 c;

    /* renamed from: a  reason: collision with root package name */
    private String f7478a;
    private String b;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (f() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = r2.f()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "analytics_keystore"
            java.lang.String r0 = tb.cyf.b(r0, r3)
            goto Lf
        Ld:
            java.lang.String r0 = ""
        Lf:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L4f
            java.lang.String r0 = "hmsSdk"
            java.lang.String r1 = "deCrypt work key first"
            com.huawei.hms.hatool.v.c(r0, r1)
            java.lang.String r0 = r2.e()
            java.lang.String r0 = com.huawei.hms.hatool.n.a(r3, r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L41
            r3 = 16
            java.lang.String r0 = tb.cyh.b(r3)
            java.lang.String r3 = r2.b(r0)
            r2.c(r3)
            boolean r3 = r2.f()
            if (r3 == 0) goto L4f
        L3d:
            com.huawei.hms.hatool.x.c()
            goto L4f
        L41:
            boolean r3 = r2.f()
            if (r3 == 0) goto L4f
            java.lang.String r3 = r2.b(r0)
            r2.c(r3)
            goto L3d
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.hatool.o0.a(java.lang.String):java.lang.String");
    }

    private String b(String str) {
        return f() ? cyf.a("analytics_keystore", str) : n.b(str, e());
    }

    private String c() {
        String a2 = d.a(q0.i(), "Privacy_MY", "PrivacyData", "");
        if (TextUtils.isEmpty(a2)) {
            String b = cyh.b(16);
            c(b(b));
            return b;
        }
        return a(a2);
    }

    private boolean c(String str) {
        v.c("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            v.c("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        d.b(q0.i(), "Privacy_MY", "PrivacyData", str);
        d.b(q0.i(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    public static o0 d() {
        if (c == null) {
            g();
        }
        return c;
    }

    private String e() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = new x().a();
        }
        return this.b;
    }

    private boolean f() {
        return Build.VERSION.SDK_INT >= 23;
    }

    private static synchronized void g() {
        synchronized (o0.class) {
            if (c == null) {
                c = new o0();
            }
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.f7478a)) {
            this.f7478a = c();
        }
        return this.f7478a;
    }

    public void b() {
        String b = cyh.b(16);
        if (c(b(b))) {
            this.f7478a = b;
        }
    }
}
