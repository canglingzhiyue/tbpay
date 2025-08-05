package com.vivo.push.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class h extends aa {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        com.vivo.push.b.i iVar = (com.vivo.push.b.i) vVar;
        String e = iVar.e();
        com.vivo.push.util.u.d("OnBindTask", "doTask,订阅APP结果 = " + iVar.i() + " clientToken= " + e);
        com.vivo.push.m.a().a(iVar.h(), iVar.i(), e);
        com.vivo.push.t.b(new i(this, e, iVar));
    }
}
