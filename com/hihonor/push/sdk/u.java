package com.hihonor.push.sdk;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class u<TResult> implements am<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public ap<TResult> f7289a;
    public Executor b;
    public final Object c = new Object();

    public u(Executor executor, ap<TResult> apVar) {
        this.f7289a = apVar;
        this.b = executor;
    }

    @Override // com.hihonor.push.sdk.am
    public final void a(y<TResult> yVar) {
        if (yVar.b()) {
            yVar.a();
            this.b.execute(new s(this, yVar));
        }
    }
}
