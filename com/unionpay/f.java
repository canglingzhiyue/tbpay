package com.unionpay;

import android.content.Context;
import tb.rnl;
import tb.rnm;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class f implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        rnm rnmVar;
        Context q;
        try {
            rnmVar = a.V;
            q = a.q();
            new rnl(rnmVar, com.unionpay.utils.b.a(q)).a();
        } catch (Exception unused) {
        }
    }
}
