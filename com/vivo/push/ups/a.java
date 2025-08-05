package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;

/* loaded from: classes9.dex */
final class a implements IPushActionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPSRegisterCallback f24247a;
    final /* synthetic */ VUpsManager b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(VUpsManager vUpsManager, UPSRegisterCallback uPSRegisterCallback) {
        this.b = vUpsManager;
        this.f24247a = uPSRegisterCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        this.f24247a.onResult(new TokenResult(i, com.vivo.push.restructure.a.a().h().b()));
    }
}
