package com.meizu.cloud.pushsdk.e.f;

import com.meizu.cloud.pushsdk.e.d.e;
import com.meizu.cloud.pushsdk.e.d.i;
import com.meizu.cloud.pushsdk.e.d.k;
import java.io.File;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f7928a;

    public static k a(com.meizu.cloud.pushsdk.e.b.b bVar) throws com.meizu.cloud.pushsdk.e.c.a {
        try {
            i.b a2 = new i.b().a(bVar.o());
            a(a2, bVar);
            i a3 = a2.b().a();
            bVar.a(new e());
            k a4 = bVar.e().a(a3);
            com.meizu.cloud.pushsdk.e.i.b.a(a4, bVar.f(), bVar.g());
            return a4;
        } catch (IOException e) {
            try {
                File file = new File(bVar.f() + File.separator + bVar.g());
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            throw new com.meizu.cloud.pushsdk.e.c.a(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.meizu.cloud.pushsdk.e.d.i.b r3, com.meizu.cloud.pushsdk.e.b.b r4) {
        /*
            java.lang.String r0 = r4.p()
            java.lang.String r1 = "User-Agent"
            if (r0 == 0) goto L10
            java.lang.String r0 = r4.p()
        Lc:
            r3.a(r1, r0)
            goto L1a
        L10:
            java.lang.String r0 = com.meizu.cloud.pushsdk.e.f.a.f7928a
            if (r0 == 0) goto L1a
            r4.a(r0)
            java.lang.String r0 = com.meizu.cloud.pushsdk.e.f.a.f7928a
            goto Lc
        L1a:
            com.meizu.cloud.pushsdk.e.d.c r0 = r4.h()
            if (r0 == 0) goto L3a
            r3.a(r0)
            java.lang.String r2 = r4.p()
            if (r2 == 0) goto L3a
            java.util.Set r0 = r0.a()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L3a
            java.lang.String r4 = r4.p()
            r3.a(r1, r4)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.e.f.a.a(com.meizu.cloud.pushsdk.e.d.i$b, com.meizu.cloud.pushsdk.e.b.b):void");
    }

    public static k b(com.meizu.cloud.pushsdk.e.b.b bVar) throws com.meizu.cloud.pushsdk.e.c.a {
        try {
            i.b a2 = new i.b().a(bVar.o());
            a(a2, bVar);
            int i = bVar.i();
            if (i == 0) {
                a2 = a2.b();
            } else if (i == 1) {
                a2 = a2.c(bVar.k());
            } else if (i == 2) {
                a2 = a2.d(bVar.k());
            } else if (i == 3) {
                a2 = a2.a(bVar.k());
            } else if (i == 4) {
                a2 = a2.c();
            } else if (i == 5) {
                a2 = a2.b(bVar.k());
            }
            i a3 = a2.a();
            bVar.a(new e());
            return bVar.e().a(a3);
        } catch (IOException e) {
            throw new com.meizu.cloud.pushsdk.e.c.a(e);
        }
    }

    public static k c(com.meizu.cloud.pushsdk.e.b.b bVar) throws com.meizu.cloud.pushsdk.e.c.a {
        try {
            i.b a2 = new i.b().a(bVar.o());
            a(a2, bVar);
            i a3 = a2.c(new b(bVar.j(), bVar.n())).a();
            bVar.a(new e());
            return bVar.e().a(a3);
        } catch (IOException e) {
            throw new com.meizu.cloud.pushsdk.e.c.a(e);
        }
    }
}
