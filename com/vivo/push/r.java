package com.vivo.push;

import com.vivo.push.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f24217a;
    final /* synthetic */ m b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(m mVar, String str) {
        this.b = mVar;
        this.f24217a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.a b;
        b = this.b.b(this.f24217a);
        if (b != null) {
            b.a(1003, new Object[0]);
        }
    }
}
