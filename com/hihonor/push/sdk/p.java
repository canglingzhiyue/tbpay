package com.hihonor.push.sdk;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class p<TResult> implements am<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public ao f7284a;
    public Executor b;
    public final Object c = new Object();

    public p(Executor executor, ao aoVar) {
        this.f7284a = aoVar;
        this.b = executor;
    }

    @Override // com.hihonor.push.sdk.am
    public final void a(y<TResult> yVar) {
        if (!yVar.b()) {
            yVar.a();
            this.b.execute(new n(this, yVar));
        }
    }
}
