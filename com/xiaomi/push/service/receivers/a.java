package com.xiaomi.push.service.receivers;

import android.content.Context;

/* loaded from: classes9.dex */
class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f24723a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ NetworkStatusReceiver f1025a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(NetworkStatusReceiver networkStatusReceiver, Context context) {
        this.f1025a = networkStatusReceiver;
        this.f24723a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1025a.a(this.f24723a);
    }
}
