package com.vivo.push;

import com.vivo.push.listener.IPushQueryActionListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IPushQueryActionListener f24151a;
    final /* synthetic */ a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, IPushQueryActionListener iPushQueryActionListener) {
        this.b = aVar;
        this.f24151a = iPushQueryActionListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String b = com.vivo.push.restructure.a.a().h().b();
        IPushQueryActionListener iPushQueryActionListener = this.f24151a;
        if (iPushQueryActionListener != null) {
            iPushQueryActionListener.onSuccess(b);
        }
    }
}
