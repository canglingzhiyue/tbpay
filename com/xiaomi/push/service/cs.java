package com.xiaomi.push.service;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes9.dex */
class cs extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f24704a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs(XMPushService xMPushService, Handler handler) {
        super(handler);
        this.f24704a = xMPushService;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        boolean m2232g;
        super.onChange(z);
        m2232g = this.f24704a.m2232g();
        com.xiaomi.channel.commonutils.logger.b.m1616a("SuperPowerMode:" + m2232g);
        this.f24704a.e();
        if (!m2232g) {
            this.f24704a.a(true);
            return;
        }
        XMPushService xMPushService = this.f24704a;
        xMPushService.a(new XMPushService.g(24, null));
    }
}
