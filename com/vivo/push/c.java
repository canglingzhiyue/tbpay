package com.vivo.push;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IPushActionListener f24174a;
    final /* synthetic */ a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(a aVar, IPushActionListener iPushActionListener) {
        this.b = aVar;
        this.f24174a = iPushActionListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a2 = com.vivo.push.restructure.a.a().h().a();
        IPushActionListener iPushActionListener = this.f24174a;
        if (iPushActionListener != null) {
            iPushActionListener.onStateChanged(a2);
        }
    }
}
