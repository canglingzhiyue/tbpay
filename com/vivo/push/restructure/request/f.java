package com.vivo.push.restructure.request;

/* loaded from: classes9.dex */
final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f24240a;
    final /* synthetic */ e b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(e eVar, b bVar) {
        this.b = eVar;
        this.f24240a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.f24240a;
        if (bVar == null || bVar.b() == null) {
            return;
        }
        this.f24240a.b().a(1003);
    }
}
