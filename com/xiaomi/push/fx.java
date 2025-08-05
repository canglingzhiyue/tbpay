package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* loaded from: classes9.dex */
class fx extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ fw f24485a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(fw fwVar, int i) {
        super(i);
        this.f24485a = fwVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "Handling bind stats";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        this.f24485a.c();
    }
}
