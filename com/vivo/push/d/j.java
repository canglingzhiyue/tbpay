package com.vivo.push.d;

import com.vivo.push.restructure.request.IPushRequestCallback;
import com.vivo.push.util.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class j implements com.vivo.push.restructure.request.c<com.vivo.push.d.a.b> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IPushRequestCallback f24186a;
    final /* synthetic */ int b;
    final /* synthetic */ d c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(d dVar, IPushRequestCallback iPushRequestCallback, int i) {
        this.c = dVar;
        this.f24186a = iPushRequestCallback;
        this.b = i;
    }

    @Override // com.vivo.push.restructure.request.c
    public final void a(int i) {
        if (this.f24186a != null) {
            u.b(this.b + " sync err : " + i);
            this.f24186a.onError(i);
        }
    }

    @Override // com.vivo.push.restructure.request.c
    public final /* synthetic */ void a(com.vivo.push.d.a.b bVar) {
        if (this.f24186a != null) {
            u.b(this.b + " sync success");
            this.f24186a.onSuccess(0);
        }
    }
}
