package com.uc.webview.base.klog;

import android.os.Process;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.analytics.core.sync.q;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f23793a = Process.myPid();
    public static final String[] b = {Repeat.D, q.MSGTYPE_INTERVAL, "w", "e"};
    public final int c;
    public final int d;
    public final long e;
    public final int f;
    public final String g;
    public final String h;
    public final Throwable i;

    public a(int i, String str, String str2, Throwable th) {
        this(System.currentTimeMillis(), f23793a, Process.myTid(), i, str, str2, th);
    }

    public a(long j, int i, int i2, int i3, String str, String str2, Throwable th) {
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = i3;
        this.g = StringUtils.isEmpty(str) ? "u4klog" : "u4klog.".concat(String.valueOf(str));
        this.h = str2;
        this.i = th;
    }

    public static final String a(long j) {
        return a("yyyy-MM-dd kk:mm:ss.SSS", j);
    }

    private static String a(String str, long j) {
        try {
            return new SimpleDateFormat(str).format(new Date(j));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static final String a(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public static final String b(long j) {
        return a("yyMMddkkmmssSSS", j);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r5.e
            java.lang.String r3 = "yyyy-MM-dd kk:mm:ss.SSS"
            java.lang.String r1 = a(r3, r1)
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            int r2 = r5.c
            r0.append(r2)
            r0.append(r1)
            int r2 = r5.d
            r0.append(r2)
            r0.append(r1)
            int r2 = r5.f
            if (r2 < 0) goto L33
            java.lang.String[] r3 = com.uc.webview.base.klog.a.b
            int r4 = r3.length
            if (r2 <= r4) goto L30
            goto L33
        L30:
            r2 = r3[r2]
            goto L38
        L33:
            java.lang.String[] r2 = com.uc.webview.base.klog.a.b
            r3 = 0
            r2 = r2[r3]
        L38:
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r5.g
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r5.h
            r0.append(r1)
            java.lang.Throwable r1 = r5.i
            if (r1 == 0) goto L5d
            java.lang.String r1 = "\n"
            r0.append(r1)
            java.lang.Throwable r1 = r5.i
            java.lang.String r1 = android.util.Log.getStackTraceString(r1)
            r0.append(r1)
        L5d:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.base.klog.a.toString():java.lang.String");
    }
}
