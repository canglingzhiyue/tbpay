package com.vivo.push;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.util.ag;

/* loaded from: classes9.dex */
final class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f24148a;
    final /* synthetic */ z b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aa(z zVar, String str) {
        this.b = zVar;
        this.f24148a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context b = com.vivo.push.restructure.a.a().b();
        if (b == null) {
            return;
        }
        long j = m.a().f() ? 488L : 341L;
        if (TextUtils.isEmpty(this.f24148a) || !ag.a(b, b.getPackageName(), this.f24148a, j)) {
            return;
        }
        com.vivo.push.restructure.a.a().e().e();
        this.b.d = "";
    }
}
