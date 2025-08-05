package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;

/* loaded from: classes9.dex */
class bi extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bf.b.c f24669a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bf.b.c cVar, int i) {
        super(i);
        this.f24669a = cVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "check peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        if (bf.a().a(this.f24669a.f964a.g, this.f24669a.f964a.f960b).f951a == null) {
            bf.b.this.f953a.a(this.f24669a.f964a.g, this.f24669a.f964a.f960b, 2, null, null);
        }
    }
}
