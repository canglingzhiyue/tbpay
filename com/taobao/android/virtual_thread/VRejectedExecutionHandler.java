package com.taobao.android.virtual_thread;

import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public interface VRejectedExecutionHandler {
    void vRejectedExecution(Runnable runnable, ExecutorService executorService);
}
