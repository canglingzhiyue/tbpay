package com.vivo.push.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class b extends com.vivo.push.s {
    /* JADX INFO: Access modifiers changed from: package-private */
    public b(com.vivo.push.v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    protected final void a(com.vivo.push.v vVar) {
        com.vivo.push.model.b a2 = com.vivo.push.util.aa.a(this.f24241a, com.vivo.push.restructure.a.a().f());
        try {
            if (!(((com.vivo.push.b.d) vVar).d() ? j.a(this.f24241a) : j.b(this.f24241a))) {
                return;
            }
            com.vivo.push.model.b a3 = com.vivo.push.util.aa.a(this.f24241a, com.vivo.push.restructure.a.a().f());
            if (a2 != null && a3 != null && a3.a() != null && a3.a().equals(a2.a())) {
                return;
            }
            if (a2 != null && a2.a() != null) {
                com.vivo.push.a.a.a(this.f24241a, a2.a(), new com.vivo.push.b.y(a2.a()));
            }
            if (a3 == null || a3.a() == null) {
                return;
            }
            com.vivo.push.b.f fVar = new com.vivo.push.b.f();
            com.vivo.push.restructure.a.a();
            fVar.d();
            com.vivo.push.a.a.a(this.f24241a, a3.a(), fVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
