package com.vivo.push.restructure.a.a;

import android.os.SystemClock;

/* loaded from: classes9.dex */
final class g extends a<com.vivo.push.restructure.a.a> {
    private long b;

    public g(com.vivo.push.restructure.a.a aVar, i iVar) {
        super("IPCNode", aVar, iVar);
        this.b = 0L;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long d = aVar.d();
        if (d <= 0 || elapsedRealtime <= d) {
            return;
        }
        this.b = elapsedRealtime - d;
    }

    @Override // com.vivo.push.restructure.a.a.a
    protected final /* bridge */ /* synthetic */ int a(com.vivo.push.restructure.a.a aVar) {
        return 0;
    }

    @Override // com.vivo.push.restructure.a.a.a
    public final synchronized String b() {
        a(this.b);
        return super.b();
    }
}
