package com.vivo.push.d;

import android.content.Context;
import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.u;
import java.util.ArrayList;

/* loaded from: classes9.dex */
final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IPushRequestCallback f24184a;
    final /* synthetic */ d b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(d dVar, IPushRequestCallback iPushRequestCallback) {
        this.b = dVar;
        this.f24184a = iPushRequestCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.b("query all profileIds");
        if (com.vivo.push.restructure.a.a().g().b() != 0) {
            u.b("core not support sync profileInfo");
            IPushRequestCallback iPushRequestCallback = this.f24184a;
            if (iPushRequestCallback != null) {
                iPushRequestCallback.onError(8102);
                return;
            }
        }
        Context b = com.vivo.push.restructure.a.a().b();
        com.vivo.push.restructure.request.d.a().a(new com.vivo.push.restructure.request.b(new com.vivo.push.d.a.a(new com.vivo.push.d.a.b(b.getPackageName(), new ArrayList(), 4)), new i(this), (byte) 0));
    }
}
