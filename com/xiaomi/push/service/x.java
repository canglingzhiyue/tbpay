package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.hb;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes9.dex */
public class x extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    private XMPushService f24729a;

    /* renamed from: a  reason: collision with other field name */
    private String f1032a;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f1033a;
    private String b;
    private String c;

    public x(XMPushService xMPushService, String str, String str2, String str3, byte[] bArr) {
        super(9);
        this.f24729a = xMPushService;
        this.f1032a = str;
        this.f1033a = bArr;
        this.b = str2;
        this.c = str3;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo2367a() {
        return "register app";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo2367a() {
        bf.b next;
        u m2360a = v.m2360a((Context) this.f24729a);
        if (m2360a == null) {
            try {
                m2360a = v.a(this.f24729a, this.f1032a, this.b, this.c);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d("fail to register push account. " + e);
            }
        }
        if (m2360a == null) {
            com.xiaomi.channel.commonutils.logger.b.d("no account for registration.");
            y.a(this.f24729a, ErrorCode.ERROR_AUTHERICATION_ERROR, "no account.");
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m1616a("do registration now.");
        Collection<bf.b> m2303a = bf.a().m2303a("5");
        if (m2303a.isEmpty()) {
            next = m2360a.a(this.f24729a);
            ai.a(this.f24729a, next);
            bf.a().a(next);
        } else {
            next = m2303a.iterator().next();
        }
        if (!this.f24729a.m2244c()) {
            y.a(this.f1032a, this.f1033a);
            this.f24729a.a(true);
            return;
        }
        try {
            if (next.f955a == bf.c.binded) {
                ai.a(this.f24729a, this.f1032a, this.f1033a);
            } else if (next.f955a != bf.c.unbind) {
            } else {
                y.a(this.f1032a, this.f1033a);
                XMPushService xMPushService = this.f24729a;
                XMPushService xMPushService2 = this.f24729a;
                Objects.requireNonNull(xMPushService2);
                xMPushService.a(new XMPushService.b(next));
            }
        } catch (hb e2) {
            com.xiaomi.channel.commonutils.logger.b.d("meet error, disconnect connection. " + e2);
            this.f24729a.a(10, e2);
        }
    }
}
