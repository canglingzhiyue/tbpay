package com.vivo.push.util;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes9.dex */
final class h implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f24262a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(String str) {
        this.f24262a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(this.f24262a);
        thread.setDaemon(true);
        return thread;
    }
}
