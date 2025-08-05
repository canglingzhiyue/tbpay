package com.xiaomi.push.service;

import android.os.SystemClock;
import com.xiaomi.push.gf;
import com.xiaomi.push.gv;
import com.xiaomi.push.hh;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes9.dex */
class cj implements gv {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f24695a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cj(XMPushService xMPushService) {
        this.f24695a = xMPushService;
    }

    @Override // com.xiaomi.push.gv
    public void a(gf gfVar) {
        if (e.a(gfVar)) {
            bq.a().a(gfVar.e(), SystemClock.elapsedRealtime(), this.f24695a.m2235a());
        }
        XMPushService xMPushService = this.f24695a;
        xMPushService.a(new XMPushService.d(gfVar));
    }

    @Override // com.xiaomi.push.gv, com.xiaomi.push.hd
    /* renamed from: a */
    public void mo1982a(hh hhVar) {
        XMPushService xMPushService = this.f24695a;
        xMPushService.a(new XMPushService.m(hhVar));
    }
}
