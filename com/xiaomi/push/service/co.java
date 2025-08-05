package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.pm.PackageManager;

/* loaded from: classes9.dex */
class co implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f24700a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public co(XMPushService xMPushService) {
        this.f24700a = xMPushService;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageManager packageManager = this.f24700a.getApplicationContext().getPackageManager();
            ComponentName componentName = new ComponentName(this.f24700a.getApplicationContext(), "com.xiaomi.push.service.receivers.PingReceiver");
            if (packageManager.getComponentEnabledSetting(componentName) == 2) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, 2, 1);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("[Alarm] disable ping receiver may be failure. " + th);
        }
    }
}
