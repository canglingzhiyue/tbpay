package com.vivo.push.restructure.b;

import android.content.Context;
import com.vivo.push.PushConfig;
import com.vivo.push.util.ag;

/* loaded from: classes9.dex */
final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f24230a;
    final /* synthetic */ PushConfig b;
    final /* synthetic */ d c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(d dVar, Context context, PushConfig pushConfig) {
        this.c = dVar;
        this.f24230a = context;
        this.b = pushConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f24230a;
        ag.a(context, context.getPackageName(), this.b.isAgreePrivacyStatement());
    }
}
