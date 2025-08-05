package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.service.XMJobService;
import tb.riy;

/* loaded from: classes9.dex */
public final class fj {

    /* renamed from: a  reason: collision with other field name */
    private static a f355a;

    /* renamed from: a  reason: collision with other field name */
    private static final String f356a = XMJobService.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    private static int f24473a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public interface a {
        /* renamed from: a */
        void mo1937a();

        void a(boolean z);

        /* renamed from: a  reason: collision with other method in class */
        boolean m1935a();
    }

    public static synchronized void a() {
        synchronized (fj.class) {
            if (f355a == null) {
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m1616a("[Alarm] stop alarm.");
            f355a.mo1937a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (com.xiaomi.push.fj.f356a.equals(com.xiaomi.push.r.a(r9, r6.name).getSuperclass().getCanonicalName()) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r9) {
        /*
            java.lang.String r0 = "android.permission.BIND_JOB_SERVICE"
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.String r1 = r9.getPackageName()
            java.lang.String r2 = "com.xiaomi.xmsf"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1a
            com.xiaomi.push.fk r0 = new com.xiaomi.push.fk
            r0.<init>(r9)
        L17:
            com.xiaomi.push.fj.f355a = r0
            return
        L1a:
            android.content.pm.PackageManager r1 = r9.getPackageManager()
            r2 = 0
            r3 = 1
            java.lang.String r4 = r9.getPackageName()     // Catch: java.lang.Exception -> L80
            r5 = 4
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r4, r5)     // Catch: java.lang.Exception -> L80
            android.content.pm.ServiceInfo[] r4 = r1.services     // Catch: java.lang.Exception -> L80
            if (r4 == 0) goto L7e
            android.content.pm.ServiceInfo[] r1 = r1.services     // Catch: java.lang.Exception -> L80
            int r4 = r1.length     // Catch: java.lang.Exception -> L80
            r5 = 0
        L31:
            if (r2 >= r4) goto L7c
            r6 = r1[r2]     // Catch: java.lang.Exception -> L79
            java.lang.String r7 = r6.permission     // Catch: java.lang.Exception -> L79
            boolean r7 = r0.equals(r7)     // Catch: java.lang.Exception -> L79
            if (r7 == 0) goto L63
            java.lang.String r7 = com.xiaomi.push.fj.f356a     // Catch: java.lang.Exception -> L79
            java.lang.String r8 = r6.name     // Catch: java.lang.Exception -> L79
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> L79
            if (r7 == 0) goto L49
        L47:
            r5 = 1
            goto L61
        L49:
            java.lang.String r7 = r6.name     // Catch: java.lang.Exception -> L60
            java.lang.Class r7 = com.xiaomi.push.r.a(r9, r7)     // Catch: java.lang.Exception -> L60
            java.lang.String r8 = com.xiaomi.push.fj.f356a     // Catch: java.lang.Exception -> L60
            java.lang.Class r7 = r7.getSuperclass()     // Catch: java.lang.Exception -> L60
            java.lang.String r7 = r7.getCanonicalName()     // Catch: java.lang.Exception -> L60
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Exception -> L60
            if (r7 == 0) goto L61
            goto L47
        L60:
        L61:
            if (r5 == r3) goto L7c
        L63:
            java.lang.String r7 = com.xiaomi.push.fj.f356a     // Catch: java.lang.Exception -> L79
            java.lang.String r8 = r6.name     // Catch: java.lang.Exception -> L79
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Exception -> L79
            if (r7 == 0) goto L76
            java.lang.String r6 = r6.permission     // Catch: java.lang.Exception -> L79
            boolean r6 = r0.equals(r6)     // Catch: java.lang.Exception -> L79
            if (r6 == 0) goto L76
            goto L9a
        L76:
            int r2 = r2 + 1
            goto L31
        L79:
            r1 = move-exception
            r3 = r5
            goto L82
        L7c:
            r3 = r5
            goto L9a
        L7e:
            r3 = 0
            goto L9a
        L80:
            r1 = move-exception
            r3 = 0
        L82:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "check service err : "
            r2.append(r4)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.xiaomi.channel.commonutils.logger.b.m1616a(r1)
        L9a:
            if (r3 != 0) goto Lc9
            boolean r1 = com.xiaomi.push.r.m2215a(r9)
            if (r1 != 0) goto La3
            goto Lc9
        La3:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Should export service: "
            r1.append(r2)
            java.lang.String r2 = com.xiaomi.push.fj.f356a
            r1.append(r2)
            java.lang.String r2 = " with permission "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " in AndroidManifest.xml file"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        Lc9:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            com.xiaomi.push.fk r0 = new com.xiaomi.push.fk
            r0.<init>(r9)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.fj.a(android.content.Context):void");
    }

    public static synchronized void a(Context context, int i) {
        synchronized (fj.class) {
            int i2 = f24473a;
            if (!"com.xiaomi.xmsf".equals(context.getPackageName())) {
                if (i == 2) {
                    f24473a = 2;
                } else {
                    f24473a = 0;
                }
            }
            if (i2 != f24473a && f24473a == 2) {
                a();
                f355a = new fm(context);
            }
        }
    }

    public static synchronized void a(boolean z) {
        synchronized (fj.class) {
            if (f355a == null) {
                com.xiaomi.channel.commonutils.logger.b.m1616a("timer is not initialized");
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.m1616a("[Alarm] register alarm. (" + z + riy.BRACKET_END_STR);
            f355a.a(z);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static synchronized boolean m1934a() {
        synchronized (fj.class) {
            if (f355a == null) {
                return false;
            }
            return f355a.m1935a();
        }
    }
}
