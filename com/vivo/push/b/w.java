package com.vivo.push.b;

/* loaded from: classes9.dex */
public final class w extends com.vivo.push.v {

    /* renamed from: a  reason: collision with root package name */
    private int f24170a;

    public w() {
        super(2011);
        this.f24170a = 0;
    }

    @Override // com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        dVar.a("com.bbk.push.ikey.MODE_TYPE", this.f24170a);
    }

    @Override // com.vivo.push.v
    public final boolean c() {
        return true;
    }

    public final int d() {
        return this.f24170a;
    }

    @Override // com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        this.f24170a = dVar.b("com.bbk.push.ikey.MODE_TYPE", 0);
    }

    @Override // com.vivo.push.v
    public final String toString() {
        return "PushModeCommand";
    }
}
