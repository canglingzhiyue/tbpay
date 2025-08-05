package com.taobao.android.virtual_thread.face;

import java.util.concurrent.ThreadFactory;

/* compiled from: lambda */
/* renamed from: com.taobao.android.virtual_thread.face.-$$Lambda$DefaultThreadPoolFactory$SHZqOA2_renxAEr8DwLRzQqaJEs  reason: invalid class name */
/* loaded from: classes6.dex */
public final /* synthetic */ class $$Lambda$DefaultThreadPoolFactory$SHZqOA2_renxAEr8DwLRzQqaJEs implements ThreadFactory {
    public static final /* synthetic */ $$Lambda$DefaultThreadPoolFactory$SHZqOA2_renxAEr8DwLRzQqaJEs INSTANCE = new $$Lambda$DefaultThreadPoolFactory$SHZqOA2_renxAEr8DwLRzQqaJEs();

    private /* synthetic */ $$Lambda$DefaultThreadPoolFactory$SHZqOA2_renxAEr8DwLRzQqaJEs() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread a2;
        a2 = DefaultThreadPoolFactory.a(runnable);
        return a2;
    }
}
