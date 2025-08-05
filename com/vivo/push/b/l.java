package com.vivo.push.b;

import com.alipay.mobile.security.bio.api.BioError;

/* loaded from: classes9.dex */
public final class l extends s {

    /* renamed from: a  reason: collision with root package name */
    private int f24160a;
    private int b;

    public l() {
        super(BioError.RESULT_UNABLE_GET_IMAGE);
        this.f24160a = -1;
        this.b = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("key_dispatch_environment", this.f24160a);
        dVar.a("key_dispatch_area", this.b);
    }

    public final int d() {
        return this.f24160a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f24160a = dVar.b("key_dispatch_environment", 1);
        this.b = dVar.b("key_dispatch_area", 1);
    }

    public final int e() {
        return this.b;
    }
}
