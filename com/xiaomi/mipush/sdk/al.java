package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class al implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f24309a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Intent f44a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public al(Context context, Intent intent) {
        this.f24309a = context;
        this.f44a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        PushMessageHandler.b(this.f24309a, this.f44a);
    }
}
