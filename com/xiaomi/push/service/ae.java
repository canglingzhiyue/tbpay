package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.hb;
import com.xiaomi.push.iy;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes9.dex */
class ae extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ iy f24632a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f909a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f910a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(int i, XMPushService xMPushService, iy iyVar, String str) {
        super(i);
        this.f909a = xMPushService;
        this.f24632a = iyVar;
        this.f910a = str;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "send app absent ack message for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        try {
            iy a2 = z.a((Context) this.f909a, this.f24632a);
            a2.m2102a().a("absent_target_package", this.f910a);
            ai.a(this.f909a, a2);
        } catch (hb e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            this.f909a.a(10, e);
        }
    }
}
