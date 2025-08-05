package com.taobao.tao.log.interceptor;

import java.util.concurrent.ThreadFactory;

/* compiled from: lambda */
/* renamed from: com.taobao.tao.log.interceptor.-$$Lambda$e$RjOsQrEsSK302oaz7Fx8P6bQgOU  reason: invalid class name */
/* loaded from: classes8.dex */
public final /* synthetic */ class $$Lambda$e$RjOsQrEsSK302oaz7Fx8P6bQgOU implements ThreadFactory {
    public static final /* synthetic */ $$Lambda$e$RjOsQrEsSK302oaz7Fx8P6bQgOU INSTANCE = new $$Lambda$e$RjOsQrEsSK302oaz7Fx8P6bQgOU();

    private /* synthetic */ $$Lambda$e$RjOsQrEsSK302oaz7Fx8P6bQgOU() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread a2;
        a2 = e.a(runnable);
        return a2;
    }
}
