package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes9.dex */
public class di {
    public static int a(Context context, int i) {
        int a2 = hv.a(context);
        if (-1 == a2) {
            return -1;
        }
        return (i * (a2 == 0 ? 13 : 11)) / 10;
    }

    public static int a(ic icVar) {
        return fc.a(icVar.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (com.xiaomi.push.fn.a(r2) != (-1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (com.xiaomi.push.fn.a(r2) != (-1)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(com.xiaomi.push.jn r2, com.xiaomi.push.ic r3) {
        /*
            int[] r0 = com.xiaomi.push.dj.f24421a
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = -1
            switch(r0) {
                case 1: goto Lb2;
                case 2: goto Lb2;
                case 3: goto Lb2;
                case 4: goto Lb2;
                case 5: goto Lb2;
                case 6: goto Lb2;
                case 7: goto Lb2;
                case 8: goto Lb2;
                case 9: goto Lb2;
                case 10: goto Lb2;
                case 11: goto L53;
                case 12: goto Le;
                default: goto Lc;
            }
        Lc:
            goto Lba
        Le:
            int r3 = r3.a()
            int r3 = com.xiaomi.push.fc.a(r3)
            if (r2 == 0) goto L51
            boolean r0 = r2 instanceof com.xiaomi.push.ix     // Catch: java.lang.Exception -> L4c
            if (r0 == 0) goto L35
            com.xiaomi.push.ix r2 = (com.xiaomi.push.ix) r2     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = r2.b()     // Catch: java.lang.Exception -> L4c
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L4c
            if (r0 != 0) goto L51
            int r0 = com.xiaomi.push.fn.a(r2)     // Catch: java.lang.Exception -> L4c
            if (r0 == r1) goto L51
        L2e:
            int r2 = com.xiaomi.push.fn.a(r2)     // Catch: java.lang.Exception -> L4c
        L32:
            r1 = r2
            goto Lba
        L35:
            boolean r0 = r2 instanceof com.xiaomi.push.iw     // Catch: java.lang.Exception -> L4c
            if (r0 == 0) goto L51
            com.xiaomi.push.iw r2 = (com.xiaomi.push.iw) r2     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = r2.a()     // Catch: java.lang.Exception -> L4c
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L4c
            if (r0 != 0) goto L51
            int r0 = com.xiaomi.push.fn.a(r2)     // Catch: java.lang.Exception -> L4c
            if (r0 == r1) goto L51
            goto L2e
        L4c:
            java.lang.String r2 = "PERF_ERROR : parse Command type error"
            com.xiaomi.channel.commonutils.logger.b.d(r2)
        L51:
            r1 = r3
            goto Lba
        L53:
            int r3 = r3.a()
            int r3 = com.xiaomi.push.fc.a(r3)
            if (r2 == 0) goto L51
            boolean r0 = r2 instanceof com.xiaomi.push.it     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L7e
            com.xiaomi.push.it r2 = (com.xiaomi.push.it) r2     // Catch: java.lang.Exception -> Lab
            java.lang.String r2 = r2.f623d     // Catch: java.lang.Exception -> Lab
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Lab
            if (r0 != 0) goto L51
            com.xiaomi.push.im r0 = com.xiaomi.push.fc.m1918a(r2)     // Catch: java.lang.Exception -> Lab
            int r0 = com.xiaomi.push.fc.a(r0)     // Catch: java.lang.Exception -> Lab
            if (r0 == r1) goto L51
            com.xiaomi.push.im r2 = com.xiaomi.push.fc.m1918a(r2)     // Catch: java.lang.Exception -> Lab
            int r2 = com.xiaomi.push.fc.a(r2)     // Catch: java.lang.Exception -> Lab
            goto L32
        L7e:
            boolean r0 = r2 instanceof com.xiaomi.push.jb     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L51
            com.xiaomi.push.jb r2 = (com.xiaomi.push.jb) r2     // Catch: java.lang.Exception -> Lab
            java.lang.String r2 = r2.f683d     // Catch: java.lang.Exception -> Lab
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Lab
            if (r0 != 0) goto L51
            com.xiaomi.push.im r0 = com.xiaomi.push.fc.m1918a(r2)     // Catch: java.lang.Exception -> Lab
            int r0 = com.xiaomi.push.fc.a(r0)     // Catch: java.lang.Exception -> Lab
            if (r0 == r1) goto L9e
            com.xiaomi.push.im r0 = com.xiaomi.push.fc.m1918a(r2)     // Catch: java.lang.Exception -> Lab
            int r3 = com.xiaomi.push.fc.a(r0)     // Catch: java.lang.Exception -> Lab
        L9e:
            com.xiaomi.push.im r0 = com.xiaomi.push.im.UploadTinyData     // Catch: java.lang.Exception -> Lab
            com.xiaomi.push.im r2 = com.xiaomi.push.fc.m1918a(r2)     // Catch: java.lang.Exception -> Lab
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Exception -> Lab
            if (r2 == 0) goto L51
            goto Lba
        Lab:
            r1 = r3
            java.lang.String r2 = "PERF_ERROR : parse Notification type error"
            com.xiaomi.channel.commonutils.logger.b.d(r2)
            goto Lba
        Lb2:
            int r2 = r3.a()
            int r1 = com.xiaomi.push.fc.a(r2)
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.di.a(com.xiaomi.push.jn, com.xiaomi.push.ic):int");
    }

    public static void a(String str, Context context, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        int a2 = a(context, i2);
        if (i == fc.a(im.UploadTinyData)) {
            return;
        }
        fd.a(context.getApplicationContext()).a(str, i, 1L, a2);
    }

    public static void a(String str, Context context, iy iyVar, int i) {
        ic a2;
        if (context == null || iyVar == null || (a2 = iyVar.a()) == null) {
            return;
        }
        int a3 = a(a2);
        if (i <= 0) {
            byte[] a4 = jm.a(iyVar);
            i = a4 != null ? a4.length : 0;
        }
        a(str, context, a3, i);
    }

    public static void a(String str, Context context, jn jnVar, ic icVar, int i) {
        a(str, context, a(jnVar, icVar), i);
    }

    public static void a(String str, Context context, byte[] bArr) {
        if (context == null || bArr == null || bArr.length <= 0) {
            return;
        }
        iy iyVar = new iy();
        try {
            jm.a(iyVar, bArr);
            a(str, context, iyVar, bArr.length);
        } catch (js unused) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("fail to convert bytes to container");
        }
    }
}
