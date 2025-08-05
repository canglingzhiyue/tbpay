package com.vivo.push.b;

import com.alipay.mobile.security.bio.api.BioError;

/* loaded from: classes9.dex */
public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private String f24153a;
    private String b;
    private int c;
    private boolean d;

    public b(boolean z, String str) {
        super(z ? 2006 : BioError.RESULT_FAIL_EXIT, str);
        this.c = 1;
        this.d = false;
    }

    public final void a(int i) {
        this.c = i;
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("sdk_clients", this.f24153a);
        dVar.a("sdk_version", 341L);
        dVar.a("PUSH_REGID", this.b);
        if (b() == 2007) {
            dVar.a("PUSH_UNBIND_SOURCE_CODE", this.c);
        }
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        this.f24153a = dVar.a("sdk_clients");
        this.b = dVar.a("PUSH_REGID");
        if (b() == 2007) {
            this.c = dVar.b("PUSH_UNBIND_SOURCE_CODE", 1);
        }
    }

    @Override // com.vivo.push.b.c, com.vivo.push.v
    public final String toString() {
        return "AppCommand:" + b();
    }
}
