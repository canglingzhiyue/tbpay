package com.xiaomi.push.service;

/* loaded from: classes9.dex */
class cn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f24699a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cn(XMPushService xMPushService) {
        this.f24699a = xMPushService;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f24699a.f888a = true;
        try {
            com.xiaomi.channel.commonutils.logger.b.m1616a("try to trigger the wifi digest broadcast.");
            Object systemService = this.f24699a.getApplicationContext().getSystemService("MiuiWifiService");
            if (systemService == null) {
                return;
            }
            com.xiaomi.push.bh.b(systemService, "sendCurrentWifiDigestInfo", new Object[0]);
        } catch (Throwable unused) {
        }
    }
}
