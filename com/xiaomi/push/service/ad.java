package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.hb;
import com.xiaomi.push.iy;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes9.dex */
class ad extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ iy f24631a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f908a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(int i, XMPushService xMPushService, iy iyVar) {
        super(i);
        this.f908a = xMPushService;
        this.f24631a = iyVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "send ack message for unrecognized new miui message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        try {
            iy a2 = z.a((Context) this.f908a, this.f24631a);
            a2.m2102a().a("miui_message_unrecognized", "1");
            ai.a(this.f908a, a2);
        } catch (hb e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            this.f908a.a(10, e);
        }
    }
}
