package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;

/* loaded from: classes9.dex */
class cr implements bf.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f24703a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cr(XMPushService xMPushService) {
        this.f24703a = xMPushService;
    }

    @Override // com.xiaomi.push.service.bf.a
    public void a() {
        this.f24703a.e();
        if (bf.a().m2301a() <= 0) {
            XMPushService xMPushService = this.f24703a;
            xMPushService.a(new XMPushService.g(12, null));
        }
    }
}
