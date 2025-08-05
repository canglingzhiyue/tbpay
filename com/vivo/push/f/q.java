package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

/* loaded from: classes9.dex */
final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.m f24198a;
    final /* synthetic */ p b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(p pVar, com.vivo.push.b.m mVar) {
        this.b = pVar;
        this.f24198a = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.b.b;
        context = this.b.f24241a;
        pushMessageCallback.onListTags(context, this.f24198a.i(), this.f24198a.d(), this.f24198a.h());
    }
}
