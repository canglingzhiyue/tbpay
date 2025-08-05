package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;

/* loaded from: classes9.dex */
class cl extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f24697a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(XMPushService xMPushService, int i) {
        super(i);
        this.f24697a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "disconnect for service destroy.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        if (this.f24697a.f873a != null) {
            this.f24697a.f873a.b(15, (Exception) null);
            this.f24697a.f873a = null;
        }
    }
}
