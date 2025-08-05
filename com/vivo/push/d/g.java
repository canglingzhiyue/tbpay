package com.vivo.push.d;

import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.u;

/* loaded from: classes9.dex */
final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IPushRequestCallback f24183a;
    final /* synthetic */ d b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(d dVar, IPushRequestCallback iPushRequestCallback) {
        this.b = dVar;
        this.f24183a = iPushRequestCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.b("delete all profileIds");
        d.a(this.b, "", this.f24183a, 3);
    }
}
