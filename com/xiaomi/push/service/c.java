package com.xiaomi.push.service;

import com.xiaomi.push.gf;
import com.xiaomi.push.hb;
import com.xiaomi.push.service.XMPushService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class c extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    private XMPushService f24687a;

    /* renamed from: a  reason: collision with other field name */
    private gf[] f985a;

    public c(XMPushService xMPushService, gf[] gfVarArr) {
        super(4);
        this.f24687a = null;
        this.f24687a = xMPushService;
        this.f985a = gfVarArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "batch send message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        try {
            if (this.f985a == null) {
                return;
            }
            this.f24687a.a(this.f985a);
        } catch (hb e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            this.f24687a.a(10, e);
        }
    }
}
