package com.vivo.push.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class k extends aa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        com.vivo.push.util.u.d("OnClearCacheTask", "delete push info " + this.f24241a.getPackageName());
        com.vivo.push.util.af.b(this.f24241a).a();
    }
}
