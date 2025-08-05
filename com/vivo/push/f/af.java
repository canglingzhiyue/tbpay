package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

/* loaded from: classes9.dex */
final class af implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.i f24192a;
    final /* synthetic */ ae b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public af(ae aeVar, com.vivo.push.b.i iVar) {
        this.b = aeVar;
        this.f24192a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.b.b;
        context = this.b.f24241a;
        pushMessageCallback.onUnBind(context, this.f24192a.i(), this.f24192a.d());
    }
}
