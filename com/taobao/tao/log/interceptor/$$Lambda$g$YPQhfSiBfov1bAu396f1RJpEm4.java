package com.taobao.tao.log.interceptor;

import java.util.concurrent.ThreadFactory;

/* compiled from: lambda */
/* renamed from: com.taobao.tao.log.interceptor.-$$Lambda$g$YPQhfSiBfov1bAu396f1RJpE-m4  reason: invalid class name */
/* loaded from: classes8.dex */
public final /* synthetic */ class $$Lambda$g$YPQhfSiBfov1bAu396f1RJpEm4 implements ThreadFactory {
    public static final /* synthetic */ $$Lambda$g$YPQhfSiBfov1bAu396f1RJpEm4 INSTANCE = new $$Lambda$g$YPQhfSiBfov1bAu396f1RJpEm4();

    private /* synthetic */ $$Lambda$g$YPQhfSiBfov1bAu396f1RJpEm4() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread a2;
        a2 = g.a(runnable);
        return a2;
    }
}
