package com.taobao.android.virtual_thread;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes6.dex */
public class CarrierCachedPoolImpl implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final a f15799a;
    private int b = 0;
    private final ThreadPoolExecutor c = new ThreadPoolExecutor(10, Integer.MAX_VALUE, 2, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.taobao.android.virtual_thread.-$$Lambda$CarrierCachedPoolImpl$LQ3d0KovPafkv1jjzBzXuhA6Cek
        {
            CarrierCachedPoolImpl.this = this;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return CarrierCachedPoolImpl.lambda$LQ3d0KovPafkv1jjzBzXuhA6Cek(CarrierCachedPoolImpl.this, runnable);
        }
    });

    public static /* synthetic */ Thread lambda$LQ3d0KovPafkv1jjzBzXuhA6Cek(CarrierCachedPoolImpl carrierCachedPoolImpl, Runnable runnable) {
        return carrierCachedPoolImpl.b(runnable);
    }

    static {
        kge.a(33480792);
        kge.a(1256511000);
        f15799a = new CarrierCachedPoolImpl();
    }

    private CarrierCachedPoolImpl() {
    }

    public /* synthetic */ Thread b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("be8f90c0", new Object[]{this, runnable});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ca-");
        int i = this.b;
        this.b = i + 1;
        sb.append(i);
        return new Carrier(runnable, sb.toString());
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("dcaf30d6", new Object[0]) : f15799a;
    }

    @Override // com.taobao.android.virtual_thread.a
    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.c.execute(runnable);
        }
    }

    public Future<?> submit(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{this, runnable}) : this.c.submit(runnable);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("b2277828", new Object[]{this, callable}) : this.c.submit(callable);
    }

    public <T> Future<T> submit(Runnable runnable, T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("f26f004f", new Object[]{this, runnable, t}) : this.c.submit(runnable, t);
    }

    public int getActiveCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4edbaf6d", new Object[]{this})).intValue() : this.c.getActiveCount();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.c.toString();
    }
}
