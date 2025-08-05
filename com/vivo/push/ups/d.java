package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;

/* loaded from: classes9.dex */
final class d implements IPushActionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ UPSTurnCallback f24250a;
    final /* synthetic */ VUpsManager b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(VUpsManager vUpsManager, UPSTurnCallback uPSTurnCallback) {
        this.b = vUpsManager;
        this.f24250a = uPSTurnCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        this.f24250a.onResult(new CodeResult(i));
    }
}
