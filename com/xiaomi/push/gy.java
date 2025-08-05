package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* loaded from: classes9.dex */
class gy extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f24513a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ gx f456a;
    final /* synthetic */ long b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(gx gxVar, int i, long j, long j2) {
        super(i);
        this.f456a = gxVar;
        this.f24513a = j;
        this.b = j2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "check the ping-pong." + this.b;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        Thread.yield();
        if (!this.f456a.c() || this.f456a.a(this.f24513a)) {
            return;
        }
        com.xiaomi.push.service.p.a(this.f456a.b).m2345b();
        this.f456a.b.a(22, (Exception) null);
    }
}
