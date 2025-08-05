package com.xiaomi.push.service;

import com.xiaomi.push.gf;
import com.xiaomi.push.hb;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes9.dex */
public class bu extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    private gf f24680a;

    /* renamed from: a  reason: collision with other field name */
    private XMPushService f973a;

    public bu(XMPushService xMPushService, gf gfVar) {
        super(4);
        this.f973a = null;
        this.f973a = xMPushService;
        this.f24680a = gfVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "send a message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        try {
            if (this.f24680a == null) {
                return;
            }
            if (e.a(this.f24680a)) {
                this.f24680a.c(System.currentTimeMillis() - this.f24680a.m1961a());
            }
            this.f973a.a(this.f24680a);
        } catch (hb e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            this.f973a.a(10, e);
        }
    }
}
