package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* loaded from: classes9.dex */
class gz extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ gx f24514a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Exception f457a;
    final /* synthetic */ int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz(gx gxVar, int i, int i2, Exception exc) {
        super(i);
        this.f24514a = gxVar;
        this.b = i2;
        this.f457a = exc;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "shutdown the connection. " + this.b + ", " + this.f457a;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        this.f24514a.b.a(this.b, this.f457a);
    }
}
