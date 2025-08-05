package com.xiaomi.push.service;

import com.xiaomi.push.hb;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class ck extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f24696a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f994a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ byte[] f995a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(XMPushService xMPushService, int i, String str, byte[] bArr) {
        super(i);
        this.f24696a = xMPushService;
        this.f994a = str;
        this.f995a = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "send mi push message";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        try {
            ai.a(this.f24696a, this.f994a, this.f995a);
        } catch (hb e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            this.f24696a.a(10, e);
        }
    }
}
