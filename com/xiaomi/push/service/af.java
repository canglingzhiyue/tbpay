package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.hb;
import com.xiaomi.push.iy;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes9.dex */
class af extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ iy f24633a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f911a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f912a;
    final /* synthetic */ String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(int i, XMPushService xMPushService, iy iyVar, String str, String str2) {
        super(i);
        this.f911a = xMPushService;
        this.f24633a = iyVar;
        this.f912a = str;
        this.b = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "send wrong message ack for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        try {
            iy a2 = z.a((Context) this.f911a, this.f24633a);
            a2.f659a.a("error", this.f912a);
            a2.f659a.a("reason", this.b);
            ai.a(this.f911a, a2);
        } catch (hb e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            this.f911a.a(10, e);
        }
    }
}
