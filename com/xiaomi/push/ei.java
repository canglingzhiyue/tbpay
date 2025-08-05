package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.ah;

/* loaded from: classes9.dex */
public abstract class ei extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    protected int f24446a;

    /* renamed from: a  reason: collision with other field name */
    protected Context f256a;

    public ei(Context context, int i) {
        this.f24446a = i;
        this.f256a = context;
    }

    public static void a(Context context, ik ikVar) {
        eb m1834a = ec.a().m1834a();
        String a2 = m1834a == null ? "" : m1834a.a();
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(ikVar.a())) {
            a(context, ikVar, a2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009c A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #3 {, blocks: (B:15:0x005c, B:17:0x0062, B:18:0x0065, B:19:0x0068, B:44:0x0095, B:50:0x009c, B:52:0x00a2, B:53:0x00a5, B:54:0x00ab, B:40:0x0088, B:42:0x008e, B:43:0x0091), top: B:64:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(android.content.Context r6, com.xiaomi.push.ik r7, java.lang.String r8) {
        /*
            byte[] r7 = com.xiaomi.push.jm.a(r7)
            byte[] r7 = com.xiaomi.push.ee.b(r8, r7)
            if (r7 == 0) goto Laf
            int r8 = r7.length
            if (r8 != 0) goto Lf
            goto Laf
        Lf:
            java.lang.Object r8 = com.xiaomi.push.ef.f24443a
            monitor-enter(r8)
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L80
            java.io.File r2 = r6.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L80
            java.lang.String r3 = "push_cdata.lock"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L80
            com.xiaomi.push.x.m2368a(r1)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L80
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L80
            java.lang.String r3 = "rw"
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L7c java.io.IOException -> L80
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            java.nio.channels.FileLock r1 = r1.lock()     // Catch: java.lang.Throwable -> L76 java.io.IOException -> L79
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            java.io.File r6 = r6.getExternalFilesDir(r0)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            java.lang.String r4 = "push_cdata.data"
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            r5 = 1
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
            int r0 = r7.length     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            byte[] r0 = com.xiaomi.push.ab.a(r0)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            r6.write(r0)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            r6.write(r7)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            r6.flush()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            r4 = 0
            r3.setLastModified(r4)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e
            if (r1 == 0) goto L65
            boolean r7 = r1.isValid()     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L65
            r1.release()     // Catch: java.io.IOException -> L65 java.lang.Throwable -> Lac
        L65:
            com.xiaomi.push.x.a(r6)     // Catch: java.lang.Throwable -> Lac
        L68:
            com.xiaomi.push.x.a(r2)     // Catch: java.lang.Throwable -> Lac
            goto L95
        L6c:
            r7 = move-exception
            goto L99
        L6e:
            r7 = move-exception
            goto L74
        L70:
            r7 = move-exception
            goto L9a
        L72:
            r7 = move-exception
            r6 = r0
        L74:
            r0 = r1
            goto L83
        L76:
            r7 = move-exception
            r1 = r0
            goto L9a
        L79:
            r7 = move-exception
            r6 = r0
            goto L83
        L7c:
            r7 = move-exception
            r1 = r0
            r2 = r1
            goto L9a
        L80:
            r7 = move-exception
            r6 = r0
            r2 = r6
        L83:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L91
            boolean r7 = r0.isValid()     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L91
            r0.release()     // Catch: java.io.IOException -> L91 java.lang.Throwable -> Lac
        L91:
            com.xiaomi.push.x.a(r6)     // Catch: java.lang.Throwable -> Lac
            goto L68
        L95:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lac
            return
        L97:
            r7 = move-exception
            r1 = r0
        L99:
            r0 = r6
        L9a:
            if (r1 == 0) goto La5
            boolean r6 = r1.isValid()     // Catch: java.lang.Throwable -> Lac
            if (r6 == 0) goto La5
            r1.release()     // Catch: java.io.IOException -> La5 java.lang.Throwable -> Lac
        La5:
            com.xiaomi.push.x.a(r0)     // Catch: java.lang.Throwable -> Lac
            com.xiaomi.push.x.a(r2)     // Catch: java.lang.Throwable -> Lac
            throw r7     // Catch: java.lang.Throwable -> Lac
        Lac:
            r6 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lac
            throw r6
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ei.a(android.content.Context, com.xiaomi.push.ik, java.lang.String):void");
    }

    private String c() {
        return "dc_job_result_time_" + mo1839a();
    }

    private String d() {
        return "dc_job_result_" + mo1839a();
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public abstract ie mo1839a();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.xiaomi.push.ah.a
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo1839a() {
        return ee.a(this.f256a, String.valueOf(mo1839a()), this.f24446a);
    }

    public abstract String b();

    /* renamed from: b  reason: collision with other method in class */
    protected boolean m1837b() {
        return true;
    }

    /* renamed from: c  reason: collision with other method in class */
    protected boolean m1838c() {
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        String b = b();
        if (TextUtils.isEmpty(b)) {
            return;
        }
        if (mo1839a()) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("DC run job mutual: " + mo1839a());
            return;
        }
        eb m1834a = ec.a().m1834a();
        String a2 = m1834a == null ? "" : m1834a.a();
        if (TextUtils.isEmpty(a2) || !m1837b()) {
            return;
        }
        if (m1838c()) {
            SharedPreferences sharedPreferences = this.f256a.getSharedPreferences("mipush_extra", 0);
            if (bm.a(b).equals(sharedPreferences.getString(d(), null))) {
                long j = sharedPreferences.getLong(c(), 0L);
                int a3 = com.xiaomi.push.service.az.a(this.f256a).a(ih.DCJobUploadRepeatedInterval.a(), 604800);
                if ((System.currentTimeMillis() - j) / 1000 < this.f24446a) {
                    return;
                }
                if ((System.currentTimeMillis() - j) / 1000 < a3) {
                    b = "same_" + j;
                }
            }
        }
        ik ikVar = new ik();
        ikVar.a(b);
        ikVar.a(System.currentTimeMillis());
        ikVar.a(mo1839a());
        a(this.f256a, ikVar, a2);
    }
}
