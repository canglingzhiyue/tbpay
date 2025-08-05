package com.vivo.push;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.b f24216a;
    final /* synthetic */ String b;
    final /* synthetic */ m c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(m mVar, com.vivo.push.b.b bVar, String str) {
        this.c = mVar;
        this.f24216a = bVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.f24216a);
        this.c.c(this.b);
    }
}
