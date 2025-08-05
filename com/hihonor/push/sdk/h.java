package com.hihonor.push.sdk;

import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class h<TResult> implements am<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public ac f7274a;
    public Executor b;
    public final Object c = new Object();

    public h(Executor executor, ac acVar) {
        this.f7274a = acVar;
        this.b = executor;
    }

    @Override // com.hihonor.push.sdk.am
    public final void a(y<TResult> yVar) {
        yVar.a();
    }
}
