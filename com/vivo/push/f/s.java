package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

/* loaded from: classes9.dex */
final class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.n f24199a;
    final /* synthetic */ r b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(r rVar, com.vivo.push.b.n nVar) {
        this.b = rVar;
        this.f24199a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.b.b;
        context = this.b.f24241a;
        pushMessageCallback.onLog(context, this.f24199a.d(), this.f24199a.e(), this.f24199a.f());
    }
}
