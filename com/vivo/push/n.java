package com.vivo.push;

import com.vivo.push.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class n implements IPushActionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m.a f24213a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ m d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(m mVar, m.a aVar, String str, String str2) {
        this.d = mVar;
        this.f24213a = aVar;
        this.b = str;
        this.c = str2;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        if (i != 0) {
            com.vivo.push.restructure.a.a().h().a("");
            return;
        }
        Object[] b = this.f24213a.b();
        if (b == null || b.length == 0) {
            com.vivo.push.util.u.a("PushClientManager", "bind app result is null");
        } else {
            com.vivo.push.restructure.a.a().h().a((String) this.f24213a.b()[0], this.b, this.c);
        }
    }
}
