package com.uc.webview.internal.setup.component;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    static long f23904a;
    private static AtomicBoolean b = new AtomicBoolean(false);

    public static void a() {
        q[] qVarArr;
        if (b.getAndSet(true)) {
            return;
        }
        f23904a = System.currentTimeMillis();
        for (q qVar : r.f23934a) {
            if (qVar != null && qVar.d == 1) {
                if (qVar.e == 1 && (n.f23917a == null || n.b == null)) {
                    Object[] objArr = {qVar.f23933a};
                    if (!l.a(3)) {
                        String a2 = l.a("%s disabled, pars not exists", objArr);
                        Throwable a3 = l.a(objArr);
                        if (a3 == null) {
                            a3 = null;
                        }
                        l.a(3, "ComponentManager", a2, a3);
                    }
                } else {
                    new b(qVar).a(5000);
                }
            }
        }
    }
}
