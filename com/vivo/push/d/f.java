package com.vivo.push.d;

import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.u;

/* loaded from: classes9.dex */
final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f24182a;
    final /* synthetic */ IPushRequestCallback b;
    final /* synthetic */ d c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(d dVar, String str, IPushRequestCallback iPushRequestCallback) {
        this.c = dVar;
        this.f24182a = str;
        this.b = iPushRequestCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u.b("delete profileId");
        d.a(this.c, this.f24182a, this.b, 2);
    }
}
