package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes9.dex */
class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f24340a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Intent f84a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(Context context, Intent intent) {
        this.f24340a = context;
        this.f84a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f24340a.startService(this.f84a);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m1616a(e.getMessage());
        }
    }
}
