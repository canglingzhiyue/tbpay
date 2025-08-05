package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.gr;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class cv extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f24707a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f997a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ byte[] f998a;
    final /* synthetic */ int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(XMPushService xMPushService, int i, int i2, String str, byte[] bArr) {
        super(i);
        this.f24707a = xMPushService;
        this.b = i2;
        this.f997a = str;
        this.f998a = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "clear account cache.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        gr grVar;
        v.m2362a((Context) this.f24707a);
        bf.a().m2306a("5");
        com.xiaomi.push.aa.a(this.b);
        grVar = this.f24707a.f874a;
        grVar.c(gr.a());
        com.xiaomi.channel.commonutils.logger.b.m1616a("clear account and start registration. " + this.f997a);
        this.f24707a.a(this.f998a, this.f997a);
    }
}
