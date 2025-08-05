package com.vivo.push.restructure.a.a;

import android.content.Context;
import com.vivo.push.util.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class h extends a<com.vivo.push.restructure.a.a> {
    public h(com.vivo.push.restructure.a.a aVar, i iVar) {
        super("InitNode", aVar, iVar);
    }

    @Override // com.vivo.push.restructure.a.a.a
    protected final /* synthetic */ int a(com.vivo.push.restructure.a.a aVar) {
        Context b = com.vivo.push.restructure.a.a().b();
        com.vivo.push.m.a().a(b);
        String c = aVar.c();
        u.d("InitNode", "PushMessageReceiver " + b.getPackageName() + " ; requestId = " + c);
        return 0;
    }
}
