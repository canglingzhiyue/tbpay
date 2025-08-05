package com.vivo.push.restructure.a.a;

import android.text.TextUtils;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class e extends a<com.vivo.push.restructure.a.a> {
    public e(com.vivo.push.restructure.a.a aVar, i iVar) {
        super("ClientDispatchNode", aVar, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.vivo.push.restructure.a.a.a
    public int a(com.vivo.push.restructure.a.a aVar) {
        PushMessageCallback b = b(aVar);
        if (b == null) {
            return 2804;
        }
        int i = 0;
        if (aVar != null && aVar.g()) {
            com.vivo.push.restructure.request.d.a().a(aVar);
            return 0;
        }
        if (aVar != null) {
            int k = aVar.k();
            String l = aVar.l();
            if (k == 3) {
                String i2 = com.vivo.push.m.a().i();
                if (TextUtils.isEmpty(i2) || !TextUtils.equals(i2, l)) {
                    i = 2810;
                }
            } else if (k == 4) {
                com.vivo.push.m.a();
                if (!com.vivo.push.m.c().contains(l)) {
                    i = 2811;
                }
            }
            if (i != 0) {
                com.vivo.push.util.g.a().execute(new f(this, k, l));
                return i;
            }
        }
        try {
            return com.vivo.push.m.a().a(aVar.b(), b);
        } catch (Exception unused) {
            return 2808;
        }
    }

    private static PushMessageCallback b(com.vivo.push.restructure.a.a aVar) {
        try {
            return (PushMessageCallback) Class.forName(com.vivo.push.restructure.a.a().e().a(com.vivo.push.restructure.a.a().b(), aVar.b().getAction())).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            u.b("DispatchNode", "reflect e: ", e);
            return null;
        }
    }
}
