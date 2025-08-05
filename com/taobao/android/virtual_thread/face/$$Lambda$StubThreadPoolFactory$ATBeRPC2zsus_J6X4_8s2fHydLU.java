package com.taobao.android.virtual_thread.face;

import java.util.concurrent.ThreadFactory;

/* compiled from: lambda */
/* renamed from: com.taobao.android.virtual_thread.face.-$$Lambda$StubThreadPoolFactory$ATBeRPC2zsus_J6X4_8s2fHydLU  reason: invalid class name */
/* loaded from: classes6.dex */
public final /* synthetic */ class $$Lambda$StubThreadPoolFactory$ATBeRPC2zsus_J6X4_8s2fHydLU implements ThreadFactory {
    public static final /* synthetic */ $$Lambda$StubThreadPoolFactory$ATBeRPC2zsus_J6X4_8s2fHydLU INSTANCE = new $$Lambda$StubThreadPoolFactory$ATBeRPC2zsus_J6X4_8s2fHydLU();

    private /* synthetic */ $$Lambda$StubThreadPoolFactory$ATBeRPC2zsus_J6X4_8s2fHydLU() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread a2;
        a2 = StubThreadPoolFactory.a(runnable);
        return a2;
    }
}
