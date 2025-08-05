package com.xiaomi.push;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.uc.webview.export.extension.UCExtension;
import com.xiaomi.push.fj;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class fk implements fj.a {

    /* renamed from: a  reason: collision with other field name */
    protected Context f358a;

    /* renamed from: a  reason: collision with other field name */
    private PendingIntent f357a = null;

    /* renamed from: a  reason: collision with root package name */
    private volatile long f24474a = 0;

    public fk(Context context) {
        this.f358a = null;
        this.f358a = context;
    }

    private void a(AlarmManager alarmManager, long j, PendingIntent pendingIntent) {
        try {
            AlarmManager.class.getMethod("setExact", Integer.TYPE, Long.TYPE, PendingIntent.class).invoke(alarmManager, 2, Long.valueOf(j), pendingIntent);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("[Alarm] invoke setExact method meet error. " + e);
        }
    }

    @Override // com.xiaomi.push.fj.a
    /* renamed from: a */
    public void mo1937a() {
        if (this.f357a != null) {
            try {
                ((AlarmManager) this.f358a.getSystemService("alarm")).cancel(this.f357a);
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.f357a = null;
                com.xiaomi.channel.commonutils.logger.b.c("[Alarm] unregister timer");
                this.f24474a = 0L;
                throw th;
            }
            this.f357a = null;
            com.xiaomi.channel.commonutils.logger.b.c("[Alarm] unregister timer");
            this.f24474a = 0L;
        }
        this.f24474a = 0L;
    }

    public void a(Intent intent, long j) {
        AlarmManager alarmManager = (AlarmManager) this.f358a.getSystemService("alarm");
        this.f357a = Build.VERSION.SDK_INT >= 31 ? com.android.taobao.aop.a.b(this.f358a, 0, intent, UCExtension.EXTEND_INPUT_TYPE_IDCARD) : com.android.taobao.aop.a.b(this.f358a, 0, intent, 0);
        if (Build.VERSION.SDK_INT >= 31 && !j.m2118a(this.f358a)) {
            alarmManager.set(2, j, this.f357a);
        } else if (Build.VERSION.SDK_INT >= 23) {
            bh.a((Object) alarmManager, "setExactAndAllowWhileIdle", 2, Long.valueOf(j), this.f357a);
        } else {
            a(alarmManager, j, this.f357a);
        }
        com.xiaomi.channel.commonutils.logger.b.c("[Alarm] register timer " + j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r8.f24474a < r4) goto L17;
     */
    @Override // com.xiaomi.push.fj.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f358a
            com.xiaomi.push.service.p r0 = com.xiaomi.push.service.p.a(r0)
            long r0 = r0.m2341a()
            r2 = 0
            if (r9 != 0) goto L15
            long r4 = r8.f24474a
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L15
            return
        L15:
            if (r9 == 0) goto L1a
            r8.mo1937a()
        L1a:
            long r4 = android.os.SystemClock.elapsedRealtime()
            if (r9 != 0) goto L39
            long r6 = r8.f24474a
            int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r9 != 0) goto L27
            goto L39
        L27:
            long r2 = r8.f24474a
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 > 0) goto L3f
            long r2 = r8.f24474a
            long r2 = r2 + r0
            r8.f24474a = r2
            long r2 = r8.f24474a
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 >= 0) goto L3f
            goto L3c
        L39:
            long r2 = r4 % r0
            long r0 = r0 - r2
        L3c:
            long r4 = r4 + r0
            r8.f24474a = r4
        L3f:
            android.content.Intent r9 = new android.content.Intent
            java.lang.String r0 = com.xiaomi.push.service.bj.q
            r9.<init>(r0)
            android.content.Context r0 = r8.f358a
            java.lang.String r0 = r0.getPackageName()
            r9.setPackage(r0)
            long r0 = r8.f24474a
            r8.a(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.fk.a(boolean):void");
    }

    @Override // com.xiaomi.push.fj.a
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo1937a() {
        return this.f24474a != 0;
    }
}
