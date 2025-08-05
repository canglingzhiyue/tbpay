package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class cu implements v.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService.j f24706a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f996a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cu(XMPushService xMPushService, XMPushService.j jVar) {
        this.f996a = xMPushService;
        this.f24706a = jVar;
    }

    @Override // com.xiaomi.push.service.v.a
    public void a() {
        this.f996a.a(this.f24706a);
    }
}
