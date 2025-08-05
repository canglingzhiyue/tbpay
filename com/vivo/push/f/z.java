package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.sdk.PushMessageCallback;

/* loaded from: classes9.dex */
final class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.r f24202a;
    final /* synthetic */ y b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(y yVar, com.vivo.push.b.r rVar) {
        this.b = yVar;
        this.f24202a = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        PushMessageCallback pushMessageCallback = this.b.b;
        context = this.b.f24241a;
        pushMessageCallback.onPublish(context, this.f24202a.i(), this.f24202a.h());
    }
}
