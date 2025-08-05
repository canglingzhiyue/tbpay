package com.taobao.weex.common;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes.dex */
public class WXWorkThreadManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ExecutorService singleThreadExecutor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.taobao.weex.common.WXWorkThreadManager.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "WX-DefaultWXStorage-Executor");
        }
    });

    static {
        kge.a(1167228392);
    }

    public WXWorkThreadManager() {
        ((ThreadPoolExecutor) this.singleThreadExecutor).allowCoreThreadTimeOut(true);
    }

    public void post(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd609e25", new Object[]{this, runnable});
            return;
        }
        ExecutorService executorService = this.singleThreadExecutor;
        if (executorService == null) {
            return;
        }
        executorService.execute(runnable);
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ExecutorService executorService = this.singleThreadExecutor;
        if (executorService != null) {
            executorService.shutdown();
        }
        this.singleThreadExecutor = null;
    }
}
