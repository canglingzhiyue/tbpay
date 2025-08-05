package com.vivo.push;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class p implements IPushActionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f24215a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(m mVar) {
        this.f24215a = mVar;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        if (i == 0) {
            com.vivo.push.restructure.a.a().h().b("");
        } else {
            com.vivo.push.restructure.a.a().h().c("");
        }
    }
}
