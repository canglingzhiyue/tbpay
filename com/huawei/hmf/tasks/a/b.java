package com.huawei.hmf.tasks.a;

import java.util.concurrent.Executor;
import tb.cxn;
import tb.cxo;
import tb.cxr;

/* loaded from: classes4.dex */
public final class b<TResult> implements cxn<TResult> {

    /* renamed from: a  reason: collision with root package name */
    Executor f7302a;
    private cxo<TResult> b;
    private final Object c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Executor executor, cxo<TResult> cxoVar) {
        this.b = cxoVar;
        this.f7302a = executor;
    }

    @Override // tb.cxn
    public final void a() {
        synchronized (this.c) {
            this.b = null;
        }
    }

    @Override // tb.cxn
    public final void a(final cxr<TResult> cxrVar) {
        this.f7302a.execute(new Runnable() { // from class: com.huawei.hmf.tasks.a.b.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (b.this.c) {
                    if (b.this.b != null) {
                        b.this.b.onComplete(cxrVar);
                    }
                }
            }
        });
    }
}
