package com.vivo.push.f;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.sdk.PushMessageCallback;

/* loaded from: classes9.dex */
final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f24195a;
    final /* synthetic */ com.vivo.push.b.i b;
    final /* synthetic */ h c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(h hVar, String str, com.vivo.push.b.i iVar) {
        this.c = hVar;
        this.f24195a = str;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context context2;
        if (!TextUtils.isEmpty(this.f24195a)) {
            PushMessageCallback pushMessageCallback = this.c.b;
            context2 = this.c.f24241a;
            pushMessageCallback.onReceiveRegId(context2, this.f24195a);
        }
        PushMessageCallback pushMessageCallback2 = this.c.b;
        context = this.c.f24241a;
        pushMessageCallback2.onBind(context, this.b.i(), this.b.d());
    }
}
