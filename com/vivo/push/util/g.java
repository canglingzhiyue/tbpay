package com.vivo.push.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final int f24261a = Runtime.getRuntime().availableProcessors();
    private static final int b = Math.max(2, Math.min(f24261a - 1, 4));
    private static final int c = (f24261a << 1) + 1;
    private static ExecutorService d = new ThreadPoolExecutor(b, c, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(128), new h("COMMON_THREAD"), new ThreadPoolExecutor.DiscardPolicy());

    public static ExecutorService a() {
        return d;
    }
}
