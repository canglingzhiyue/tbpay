package com.vivo.push;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class j implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f24207a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(i iVar) {
        this.f24207a = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
        if (r5.get() == 2) goto L14;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            java.lang.String r0 = "AidlManager"
            if (r5 != 0) goto Lb
            java.lang.String r5 = "handleMessage error : msg is null"
            com.vivo.push.util.u.a(r0, r5)
            r5 = 0
            return r5
        Lb:
            int r1 = r5.what
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L40
            if (r1 == r2) goto L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "unknow msg what ["
            r1.<init>(r2)
            int r5 = r5.what
            r1.append(r5)
            java.lang.String r5 = "]"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            com.vivo.push.util.u.b(r0, r5)
            goto L56
        L2d:
            com.vivo.push.i r5 = r4.f24207a
            java.util.concurrent.atomic.AtomicInteger r5 = com.vivo.push.i.a(r5)
            int r5 = r5.get()
            r0 = 4
            if (r5 != r0) goto L51
            com.vivo.push.i r5 = r4.f24207a
            com.vivo.push.i.c(r5)
            goto L51
        L40:
            java.lang.String r5 = "In connect, bind core service time out"
            com.vivo.push.util.u.a(r0, r5)
            com.vivo.push.i r5 = r4.f24207a
            java.util.concurrent.atomic.AtomicInteger r5 = com.vivo.push.i.a(r5)
            int r5 = r5.get()
            if (r5 != r2) goto L56
        L51:
            com.vivo.push.i r5 = r4.f24207a
            com.vivo.push.i.b(r5)
        L56:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.j.handleMessage(android.os.Message):boolean");
    }
}
