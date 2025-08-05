package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class bg implements bf.b.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bf.b f24667a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bg(bf.b bVar) {
        this.f24667a = bVar;
    }

    @Override // com.xiaomi.push.service.bf.b.a
    public void a(bf.c cVar, bf.c cVar2, int i) {
        XMPushService.c cVar3;
        XMPushService.c cVar4;
        if (cVar2 == bf.c.binding) {
            XMPushService xMPushService = this.f24667a.f953a;
            cVar4 = this.f24667a.f952a;
            xMPushService.a(cVar4, 60000L);
            return;
        }
        XMPushService xMPushService2 = this.f24667a.f953a;
        cVar3 = this.f24667a.f952a;
        xMPushService2.b(cVar3);
    }
}
