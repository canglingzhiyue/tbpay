package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.hb;
import com.xiaomi.push.iy;
import com.xiaomi.push.service.XMPushService;
import java.util.Map;

/* loaded from: classes9.dex */
class ab extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ iy f24629a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f906a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(int i, XMPushService xMPushService, iy iyVar) {
        super(i);
        this.f906a = xMPushService;
        this.f24629a = iyVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "send ack message for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        Map<String, String> map = null;
        try {
            if (com.xiaomi.push.j.m2118a((Context) this.f906a)) {
                try {
                    map = ah.a((Context) this.f906a, this.f24629a);
                } catch (Throwable unused) {
                }
            }
            ai.a(this.f906a, z.a(this.f906a, this.f24629a, map));
        } catch (hb e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            this.f906a.a(10, e);
        }
    }
}
