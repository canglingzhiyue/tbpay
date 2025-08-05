package com.vivo.push.sdk;

import android.content.Context;
import com.vivo.push.m;
import com.vivo.push.util.u;

/* loaded from: classes9.dex */
final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.vivo.push.restructure.a.a f24244a;
    final /* synthetic */ a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, com.vivo.push.restructure.a.a aVar2) {
        this.b = aVar;
        this.f24244a = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        u.d("CommandWorker", " handleMessage type: ".concat(String.valueOf(this.f24244a.j())));
        m a2 = m.a();
        context = this.b.f24149a;
        a2.a(context);
        com.vivo.push.restructure.a.a().d().a(this.f24244a);
    }
}
