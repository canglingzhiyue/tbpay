package com.vivo.push.b;

/* loaded from: classes9.dex */
public final class i extends s {

    /* renamed from: a  reason: collision with root package name */
    private String f24158a;
    private String b;
    private String c;
    private String d;

    public i(int i) {
        super(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("app_id", this.f24158a);
        dVar.a("client_id", this.b);
        dVar.a("client_token", this.c);
        dVar.a("client_token_validity_period", this.d);
    }

    public final String d() {
        return this.f24158a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f24158a = dVar.a("app_id");
        this.b = dVar.a("client_id");
        this.c = dVar.a("client_token");
        this.d = dVar.a("client_token_validity_period");
    }

    public final String e() {
        return this.c;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final String toString() {
        return "OnBindCommand";
    }
}
