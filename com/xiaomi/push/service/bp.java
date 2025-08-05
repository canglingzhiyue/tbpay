package com.xiaomi.push.service;

import com.alipay.security.mobile.module.http.constant.RpcConfigureConstant;
import com.xiaomi.push.gb;
import com.xiaomi.push.service.XMPushService;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class bp {
    private static int d = 300000;

    /* renamed from: a  reason: collision with other field name */
    private XMPushService f971a;
    private int b = 0;
    private int c = 0;

    /* renamed from: a  reason: collision with root package name */
    private int f24675a = 500;

    /* renamed from: a  reason: collision with other field name */
    private long f970a = 0;

    public bp(XMPushService xMPushService) {
        this.f971a = xMPushService;
    }

    private int a() {
        if (this.b > 8) {
            return RpcConfigureConstant.STATIC_DATA_UPDATE_TIMEOUT;
        }
        double random = (Math.random() * 2.0d) + 1.0d;
        int i = this.b;
        if (i > 4) {
            return (int) (random * 60000.0d);
        }
        if (i > 1) {
            return (int) (random * 10000.0d);
        }
        if (this.f970a == 0) {
            return 0;
        }
        if (System.currentTimeMillis() - this.f970a >= 310000) {
            this.f24675a = 1000;
            this.c = 0;
            return 0;
        }
        int i2 = this.f24675a;
        int i3 = d;
        if (i2 >= i3) {
            return i2;
        }
        this.c++;
        if (this.c >= 4) {
            return i3;
        }
        this.f24675a = (int) (i2 * 1.5d);
        return i2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m2316a() {
        this.f970a = System.currentTimeMillis();
        this.f971a.a(1);
        this.b = 0;
    }

    public void a(boolean z) {
        if (!this.f971a.m2239a()) {
            com.xiaomi.channel.commonutils.logger.b.c("should not reconnect as no client or network.");
        } else if (z) {
            if (!this.f971a.m2240a(1)) {
                this.b++;
            }
            this.f971a.a(1);
            com.xiaomi.channel.commonutils.logger.b.m1617a("ReconnectionManager", "-->tryReconnect(): exec ConnectJob");
            XMPushService xMPushService = this.f971a;
            Objects.requireNonNull(xMPushService);
            xMPushService.a(new XMPushService.e());
        } else if (this.f971a.m2240a(1)) {
        } else {
            int a2 = a();
            this.b++;
            com.xiaomi.channel.commonutils.logger.b.m1616a("schedule reconnect in " + a2 + "ms");
            XMPushService xMPushService2 = this.f971a;
            Objects.requireNonNull(xMPushService2);
            xMPushService2.a(new XMPushService.e(), (long) a2);
            if (this.b == 2 && gb.m1954a().m1959a()) {
                ao.b();
            }
            if (this.b != 3) {
                return;
            }
            ao.a();
        }
    }
}
