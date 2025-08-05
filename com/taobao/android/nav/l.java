package com.taobao.android.nav;

import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes6.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private f f14456a;
    private f b;
    private Intent c;
    private String d;
    private n e;

    static {
        kge.a(-669313042);
        kge.a(240592194);
    }

    private l() {
    }

    public l a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("8bb233a8", new Object[]{this, fVar});
        }
        this.b.addNext(fVar);
        this.b = fVar;
        return this;
    }

    public static l b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("8ce88687", new Object[]{fVar});
        }
        l lVar = new l();
        lVar.f14456a = fVar;
        lVar.b = fVar;
        lVar.e = Nav.getProcessorMonitor();
        return lVar;
    }

    public l a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("dc024293", new Object[]{this, intent});
        }
        this.c = intent;
        return this;
    }

    public l a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l) ipChange.ipc$dispatch("bafa6b26", new Object[]{this, str});
        }
        this.d = str;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0 A[LOOP:0: B:7:0x0022->B:33:0x00e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(com.taobao.android.nav.d r15) {
        /*
            r14 = this;
            java.lang.String r0 = "node:"
            java.lang.String r1 = "ProcessorChain"
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.nav.l.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L20
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r14
            r0[r6] = r15
            java.lang.String r15 = "4059dcb6"
            java.lang.Object r15 = r2.ipc$dispatch(r15, r0)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            return r15
        L20:
            com.taobao.android.nav.f r2 = r14.f14456a
        L22:
            if (r2 == 0) goto Le6
            boolean r3 = r15.b()
            if (r3 == 0) goto L36
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "isSkipFollowProcessors: true"
            r0[r5] = r1
            r0[r6] = r15
            r14.a(r0)
            return r6
        L36:
            boolean r3 = r2.skip()     // Catch: java.lang.Throwable -> L87
            if (r3 != 0) goto L85
            android.content.Intent r3 = r14.c     // Catch: java.lang.Throwable -> L87
            boolean r3 = r2.filter(r3, r15)     // Catch: java.lang.Throwable -> L87
            if (r3 == 0) goto L85
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L87
            android.content.Intent r3 = r14.c     // Catch: java.lang.Throwable -> L87
            boolean r3 = r2.execute(r3, r15)     // Catch: java.lang.Throwable -> L87
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L83
            java.lang.String r10 = "NavProcessor exe after, name:"
            r9[r5] = r10     // Catch: java.lang.Throwable -> L83
            java.lang.String r10 = r2.name()     // Catch: java.lang.Throwable -> L83
            r9[r6] = r10     // Catch: java.lang.Throwable -> L83
            java.lang.String r10 = "url:"
            r9[r4] = r10     // Catch: java.lang.Throwable -> L83
            r10 = 3
            android.content.Intent r11 = r14.c     // Catch: java.lang.Throwable -> L83
            android.net.Uri r11 = r11.getData()     // Catch: java.lang.Throwable -> L83
            r9[r10] = r11     // Catch: java.lang.Throwable -> L83
            r14.a(r9)     // Catch: java.lang.Throwable -> L83
            com.taobao.android.nav.n r9 = r14.e     // Catch: java.lang.Throwable -> L83
            if (r9 == 0) goto Lbc
            com.taobao.android.nav.n r9 = r14.e     // Catch: java.lang.Throwable -> L83
            android.content.Context r10 = r15.a()     // Catch: java.lang.Throwable -> L83
            com.taobao.android.nav.e r11 = r2.asNavProcessor()     // Catch: java.lang.Throwable -> L83
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L83
            long r12 = r12 - r7
            r9.a(r10, r11, r12)     // Catch: java.lang.Throwable -> L83
            goto Lbc
        L83:
            r7 = move-exception
            goto L89
        L85:
            r3 = 1
            goto Lbc
        L87:
            r7 = move-exception
            r3 = 1
        L89:
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r8[r5] = r1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            java.lang.String r10 = r2.name()
            r9.append(r10)
            java.lang.String r10 = ";throwable:"
            r9.append(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            r8[r6] = r9
            r14.a(r8)
            com.taobao.android.nav.n r8 = r14.e
            if (r8 == 0) goto Lbc
            android.content.Context r9 = r15.a()
            java.lang.String r10 = r2.name()
            r8.a(r9, r10, r7)
        Lbc:
            if (r3 != 0) goto Le0
            java.lang.Object[] r15 = new java.lang.Object[r4]
            r15[r5] = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r2.name()
            r1.append(r0)
            java.lang.String r0 = " return false"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15[r6] = r0
            r14.a(r15)
            return r5
        Le0:
            com.taobao.android.nav.f r2 = r2.m1006getNext()
            goto L22
        Le6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.nav.l.a(com.taobao.android.nav.d):boolean");
    }

    private void a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63135c9", new Object[]{this, objArr});
        } else if (!TextUtils.isEmpty(this.d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.d);
            sb.append(" ");
            if (objArr != null) {
                for (Object obj : objArr) {
                    sb.append(obj);
                    sb.append(" ");
                }
            }
            TLog.loge("Nav", sb.toString());
        }
    }
}
