package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.sdk.PushMessageCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPSNotificationMessage f24194a;
    final /* synthetic */ e b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(e eVar, UPSNotificationMessage uPSNotificationMessage) {
        this.b = eVar;
        this.f24194a = uPSNotificationMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.b.b;
        context = this.b.f24241a;
        pushMessageCallback.onNotificationMessageClicked(context, this.f24194a);
    }
}
