package com.huawei.hmf.tasks.a;

import java.util.concurrent.Executor;
import tb.cxn;
import tb.cxq;
import tb.cxr;

/* loaded from: classes4.dex */
public final class d<TResult> implements cxn<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private cxq<TResult> f7306a;
    private Executor b;
    private final Object c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Executor executor, cxq<TResult> cxqVar) {
        this.f7306a = cxqVar;
        this.b = executor;
    }

    @Override // tb.cxn
    public final void a() {
        synchronized (this.c) {
            this.f7306a = null;
        }
    }

    @Override // tb.cxn
    public final void a(final cxr<TResult> cxrVar) {
        if (!cxrVar.b() || cxrVar.c()) {
            return;
        }
        this.b.execute(new Runnable() { // from class: com.huawei.hmf.tasks.a.d.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (d.this.c) {
                    if (d.this.f7306a != null) {
                        d.this.f7306a.a(cxrVar.d());
                    }
                }
            }
        });
    }
}
