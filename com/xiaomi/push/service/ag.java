package com.xiaomi.push.service;

import com.xiaomi.push.hb;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.it;
import com.xiaomi.push.iy;
import com.xiaomi.push.jb;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes9.dex */
class ag extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ iy f24634a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ jb f913a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f914a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(int i, jb jbVar, iy iyVar, XMPushService xMPushService) {
        super(i);
        this.f913a = jbVar;
        this.f24634a = iyVar;
        this.f914a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "send ack message for clear push message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        try {
            it itVar = new it();
            itVar.c(im.CancelPushMessageACK.f538a);
            itVar.a(this.f913a.m2128a());
            itVar.a(this.f913a.a());
            itVar.b(this.f913a.b());
            itVar.e(this.f913a.c());
            itVar.a(0L);
            itVar.d("success clear push message.");
            ai.a(this.f914a, ai.b(this.f24634a.b(), this.f24634a.m2103a(), itVar, ic.Notification));
        } catch (hb e) {
            com.xiaomi.channel.commonutils.logger.b.d("clear push message. " + e);
            this.f914a.a(10, e);
        }
    }
}
