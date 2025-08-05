package com.xiaomi.push.service;

import com.xiaomi.push.em;
import com.xiaomi.push.gr;
import com.xiaomi.push.gu;
import java.util.Map;

/* loaded from: classes9.dex */
class cq extends gr {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f24702a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(XMPushService xMPushService, Map map, int i, String str, gu guVar) {
        super(map, i, str, guVar);
        this.f24702a = xMPushService;
    }

    @Override // com.xiaomi.push.gr
    /* renamed from: a */
    public byte[] mo1992a() {
        try {
            em.b bVar = new em.b();
            bVar.a(bw.a().m2323a());
            return bVar.mo1910a();
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("getOBBString err: " + e.toString());
            return null;
        }
    }
}
