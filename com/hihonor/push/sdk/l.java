package com.hihonor.push.sdk;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class l<TResult> implements am<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public an<TResult> f7280a;
    public Executor b;
    public final Object c = new Object();

    public l(Executor executor, an<TResult> anVar) {
        this.f7280a = anVar;
        this.b = executor;
    }

    @Override // com.hihonor.push.sdk.am
    public final void a(y<TResult> yVar) {
        this.b.execute(new j(this, yVar));
    }
}
