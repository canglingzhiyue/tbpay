package com.xiaomi.push.service;

import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.service.bf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class ak implements bf.b.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f24637a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ak(XMPushService xMPushService) {
        this.f24637a = xMPushService;
    }

    @Override // com.xiaomi.push.service.bf.b.a
    public void a(bf.c cVar, bf.c cVar2, int i) {
        if (cVar2 == bf.c.binded) {
            y.a(this.f24637a, true);
            y.a(this.f24637a);
        } else if (cVar2 != bf.c.unbind) {
        } else {
            com.xiaomi.channel.commonutils.logger.b.m1616a("onChange unbind");
            y.a(this.f24637a, ErrorCode.ERROR_SERVICE_UNAVAILABLE, " the push is not connected.");
        }
    }
}
