package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;

/* loaded from: classes9.dex */
class bh extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bf.b.c f24668a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bf.b.c cVar, int i) {
        super(i);
        this.f24668a = cVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "clear peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        if (this.f24668a.f24665a == this.f24668a.f964a.f951a) {
            com.xiaomi.channel.commonutils.logger.b.b("clean peer, chid = " + this.f24668a.f964a.g);
            this.f24668a.f964a.f951a = null;
        }
    }
}
