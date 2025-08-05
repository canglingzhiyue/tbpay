package com.xiaomi.push.service;

import com.xiaomi.push.hb;
import com.xiaomi.push.iy;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes9.dex */
class aa extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ iy f24628a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f905a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(int i, XMPushService xMPushService, iy iyVar) {
        super(i);
        this.f905a = xMPushService;
        this.f24628a = iyVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "send app absent message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        try {
            ai.a(this.f905a, ai.a(this.f24628a.b(), this.f24628a.m2103a()));
        } catch (hb e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            this.f905a.a(10, e);
        }
    }
}
