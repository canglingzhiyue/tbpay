package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class fw implements bf.b.a {

    /* renamed from: a  reason: collision with root package name */
    private int f24484a;

    /* renamed from: a  reason: collision with other field name */
    private gq f382a;

    /* renamed from: a  reason: collision with other field name */
    private XMPushService f383a;

    /* renamed from: a  reason: collision with other field name */
    private bf.b f384a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f386a = false;

    /* renamed from: a  reason: collision with other field name */
    private bf.c f385a = bf.c.binding;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fw(XMPushService xMPushService, bf.b bVar) {
        this.f383a = xMPushService;
        this.f384a = bVar;
    }

    private void b() {
        this.f384a.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            r4 = this;
            r4.b()
            boolean r0 = r4.f386a
            if (r0 != 0) goto L8
            return
        L8:
            int r0 = r4.f24484a
            r1 = 11
            if (r0 != r1) goto Lf
            return
        Lf:
            com.xiaomi.push.gb r0 = com.xiaomi.push.gb.m1954a()
            com.xiaomi.push.fu r0 = r0.m1956a()
            int[] r1 = com.xiaomi.push.fy.f24486a
            com.xiaomi.push.service.bf$c r2 = r4.f385a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L34
            r3 = 2
            if (r1 == r3) goto L5f
            r3 = 3
            if (r1 == r3) goto L2b
            goto L5f
        L2b:
            com.xiaomi.push.ft r1 = com.xiaomi.push.ft.BIND_SUCCESS
        L2d:
            int r1 = r1.a()
            r0.f368a = r1
            goto L5f
        L34:
            int r1 = r4.f24484a
            r3 = 17
            if (r1 != r3) goto L3d
            com.xiaomi.push.ft r1 = com.xiaomi.push.ft.BIND_TCP_READ_TIMEOUT
            goto L2d
        L3d:
            r3 = 21
            if (r1 != r3) goto L44
            com.xiaomi.push.ft r1 = com.xiaomi.push.ft.BIND_TIMEOUT
            goto L2d
        L44:
            com.xiaomi.push.ga r1 = com.xiaomi.push.gb.a()     // Catch: java.lang.NullPointerException -> L5e
            java.lang.Exception r1 = r1.a()     // Catch: java.lang.NullPointerException -> L5e
            com.xiaomi.push.fz$a r1 = com.xiaomi.push.fz.c(r1)     // Catch: java.lang.NullPointerException -> L5e
            com.xiaomi.push.ft r3 = r1.f24487a     // Catch: java.lang.NullPointerException -> L5e
            int r3 = r3.a()     // Catch: java.lang.NullPointerException -> L5e
            r0.f368a = r3     // Catch: java.lang.NullPointerException -> L5e
            java.lang.String r1 = r1.f387a     // Catch: java.lang.NullPointerException -> L5e
            r0.c(r1)     // Catch: java.lang.NullPointerException -> L5e
            goto L5f
        L5e:
            r0 = 0
        L5f:
            if (r0 == 0) goto L86
            com.xiaomi.push.gq r1 = r4.f382a
            java.lang.String r1 = r1.m1985a()
            r0.b(r1)
            com.xiaomi.push.service.bf$b r1 = r4.f384a
            java.lang.String r1 = r1.f960b
            r0.d(r1)
            r0.f371b = r2
            com.xiaomi.push.service.bf$b r1 = r4.f384a     // Catch: java.lang.NumberFormatException -> L7f
            java.lang.String r1 = r1.g     // Catch: java.lang.NumberFormatException -> L7f
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L7f
            byte r1 = (byte) r1     // Catch: java.lang.NumberFormatException -> L7f
            r0.a(r1)     // Catch: java.lang.NumberFormatException -> L7f
        L7f:
            com.xiaomi.push.gb r1 = com.xiaomi.push.gb.m1954a()
            r1.a(r0)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.fw.c():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f384a.a(this);
        this.f382a = this.f383a.m2236a();
    }

    @Override // com.xiaomi.push.service.bf.b.a
    public void a(bf.c cVar, bf.c cVar2, int i) {
        if (!this.f386a && cVar == bf.c.binding) {
            this.f385a = cVar2;
            this.f24484a = i;
            this.f386a = true;
        }
        this.f383a.a(new fx(this, 4));
    }
}
