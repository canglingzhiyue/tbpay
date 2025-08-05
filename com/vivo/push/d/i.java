package com.vivo.push.d;

import com.vivo.push.util.u;

/* loaded from: classes9.dex */
final class i implements com.vivo.push.restructure.request.c<com.vivo.push.d.a.b> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f24185a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(h hVar) {
        this.f24185a = hVar;
    }

    @Override // com.vivo.push.restructure.request.c
    public final void a(int i) {
        if (this.f24185a.f24184a != null) {
            u.b("query err : ".concat(String.valueOf(i)));
            this.f24185a.f24184a.onError(i);
        }
    }

    @Override // com.vivo.push.restructure.request.c
    public final /* synthetic */ void a(com.vivo.push.d.a.b bVar) {
        com.vivo.push.d.a.b bVar2 = bVar;
        if (this.f24185a.f24184a != null) {
            u.b("query success");
            this.f24185a.f24184a.onSuccess(bVar2.a());
        }
    }
}
