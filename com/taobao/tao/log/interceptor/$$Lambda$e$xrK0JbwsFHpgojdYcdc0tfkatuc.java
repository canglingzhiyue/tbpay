package com.taobao.tao.log.interceptor;

import java.util.concurrent.ThreadFactory;

/* compiled from: lambda */
/* renamed from: com.taobao.tao.log.interceptor.-$$Lambda$e$xrK0JbwsFHpgojdYcdc0tfkatuc  reason: invalid class name */
/* loaded from: classes8.dex */
public final /* synthetic */ class $$Lambda$e$xrK0JbwsFHpgojdYcdc0tfkatuc implements ThreadFactory {
    public static final /* synthetic */ $$Lambda$e$xrK0JbwsFHpgojdYcdc0tfkatuc INSTANCE = new $$Lambda$e$xrK0JbwsFHpgojdYcdc0tfkatuc();

    private /* synthetic */ $$Lambda$e$xrK0JbwsFHpgojdYcdc0tfkatuc() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread b;
        b = e.b(runnable);
        return b;
    }
}
