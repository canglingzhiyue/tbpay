package com.vivo.push.b;

/* loaded from: classes9.dex */
public final class y extends com.vivo.push.v {

    /* renamed from: a  reason: collision with root package name */
    private String f24172a;

    public y() {
        super(2008);
    }

    public y(String str) {
        super(2008);
        this.f24172a = str;
    }

    @Override // com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        dVar.a("package_name", this.f24172a);
    }

    @Override // com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        this.f24172a = dVar.a("package_name");
    }

    @Override // com.vivo.push.v
    public final String toString() {
        return "StopServiceCommand";
    }
}
