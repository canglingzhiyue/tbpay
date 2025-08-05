package com.huawei.hmf.tasks.a;

import java.util.concurrent.Executor;
import tb.cxn;
import tb.cxp;
import tb.cxr;

/* loaded from: classes4.dex */
public final class c<TResult> implements cxn<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private cxp f7304a;
    private Executor b;
    private final Object c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Executor executor, cxp cxpVar) {
        this.f7304a = cxpVar;
        this.b = executor;
    }

    @Override // tb.cxn
    public final void a() {
        synchronized (this.c) {
            this.f7304a = null;
        }
    }

    @Override // tb.cxn
    public final void a(final cxr<TResult> cxrVar) {
        if (cxrVar.b() || cxrVar.c()) {
            return;
        }
        this.b.execute(new Runnable() { // from class: com.huawei.hmf.tasks.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (c.this.c) {
                    if (c.this.f7304a != null) {
                        c.this.f7304a.a(cxrVar.e());
                    }
                }
            }
        });
    }
}
