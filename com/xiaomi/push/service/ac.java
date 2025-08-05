package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.hb;
import com.xiaomi.push.iy;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes9.dex */
class ac extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ iy f24630a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f907a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(int i, XMPushService xMPushService, iy iyVar) {
        super(i);
        this.f907a = xMPushService;
        this.f24630a = iyVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "send ack message for obsleted message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        try {
            iy a2 = z.a((Context) this.f907a, this.f24630a);
            a2.m2102a().a("message_obsleted", "1");
            ai.a(this.f907a, a2);
        } catch (hb e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            this.f907a.a(10, e);
        }
    }
}
