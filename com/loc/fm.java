package com.loc;

import android.content.Context;
import com.loc.bt;
import com.uc.webview.export.media.CommandID;

/* loaded from: classes4.dex */
public final class fm {
    private static fm b;

    /* renamed from: a  reason: collision with root package name */
    bo f7797a;
    private Context c;
    private int d = fr.i;
    private boolean e = false;
    private int f = 0;

    private fm(Context context) {
        this.f7797a = null;
        this.c = null;
        try {
            q.a().a(context);
        } catch (Throwable unused) {
        }
        this.c = context;
        this.f7797a = bo.a();
    }

    public static fm a(Context context) {
        if (b == null) {
            b = new fm(context);
        }
        return b;
    }

    public final bu a(fn fnVar) throws Throwable {
        if (this.e) {
            fnVar.a(bt.c.HTTPS);
        }
        return bo.a(fnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0102 A[Catch: Throwable -> 0x0109, TRY_LEAVE, TryCatch #0 {Throwable -> 0x0109, blocks: (B:4:0x0012, B:6:0x007b, B:7:0x0082, B:10:0x0090, B:17:0x00ea, B:19:0x00f1, B:21:0x0102, B:15:0x00e4), top: B:26:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.loc.fn a(android.content.Context r11, byte[] r12, java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fm.a(android.content.Context, byte[], java.lang.String, java.lang.String, boolean):com.loc.fn");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7 A[Catch: Throwable -> 0x00fb, TryCatch #1 {Throwable -> 0x0103, blocks: (B:2:0x0000, B:9:0x004f, B:11:0x0057, B:15:0x0066, B:7:0x0049, B:16:0x00d9, B:18:0x00e7, B:19:0x00ec), top: B:26:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(android.content.Context r9, double r10, double r12) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.fm.a(android.content.Context, double, double):java.lang.String");
    }

    public final void a(long j, boolean z, int i) {
        try {
            this.e = z;
            this.d = Long.valueOf(j).intValue();
            this.f = i;
        } catch (Throwable th) {
            fr.a(th, "LocNetManager", CommandID.setOption);
        }
    }
}
