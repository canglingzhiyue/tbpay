package com.vivo.push.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class x extends aa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        if (com.vivo.push.util.aa.c(this.f24241a, this.f24241a.getPackageName())) {
            e eVar = new e(vVar);
            eVar.a(this.b);
            eVar.a(vVar);
            return;
        }
        d dVar = new d(vVar);
        dVar.a(this.b);
        dVar.a(vVar);
    }
}
