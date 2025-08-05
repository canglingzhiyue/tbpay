package com.vivo.push.b;

/* loaded from: classes9.dex */
public final class n extends s {

    /* renamed from: a  reason: collision with root package name */
    private String f24162a;
    private int b;
    private boolean c;

    public n() {
        super(7);
        this.b = 0;
        this.c = false;
    }

    public final void a(int i) {
        this.b = i;
    }

    public final void b(String str) {
        this.f24162a = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("content", this.f24162a);
        dVar.a("log_level", this.b);
        dVar.a("is_server_log", this.c);
    }

    public final String d() {
        return this.f24162a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f24162a = dVar.a("content");
        this.b = dVar.b("log_level", 0);
        this.c = dVar.e("is_server_log");
    }

    public final int e() {
        return this.b;
    }

    public final boolean f() {
        return this.c;
    }

    public final void g() {
        this.c = false;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final String toString() {
        return "OnLogCommand";
    }
}
