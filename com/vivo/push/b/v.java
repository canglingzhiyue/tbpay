package com.vivo.push.b;

/* loaded from: classes9.dex */
public abstract class v extends s {

    /* renamed from: a  reason: collision with root package name */
    private String f24169a;
    private long b;

    public v(int i) {
        super(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.s, com.vivo.push.v
    public void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT", this.f24169a);
        dVar.a("notify_id", this.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.s, com.vivo.push.v
    public void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f24169a = dVar.a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT");
        this.b = dVar.b("notify_id", -1L);
    }

    public final long f() {
        return this.b;
    }

    public final String g() {
        return this.f24169a;
    }
}
