package com.taobao.android.dinamicx.template.download;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Comparator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import tb.fux;
import tb.kge;

/* loaded from: classes.dex */
public class d extends ThreadPoolExecutor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicLong f11931a;
    private static final ThreadFactory b;
    private static final Comparator c;
    private static final Comparator d;

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        if (str.hashCode() == 452660730) {
            super.execute((Runnable) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-906459536);
        f11931a = new AtomicLong(0L);
        b = new ThreadFactory() { // from class: com.taobao.android.dinamicx.template.download.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final AtomicInteger f11932a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                return new Thread(runnable, "download#" + this.f11932a.getAndIncrement());
            }
        };
        c = new Comparator() { // from class: com.taobao.android.dinamicx.template.download.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public int compare(Object obj, Object obj2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
                }
                if (!(obj instanceof e) || !(obj2 instanceof e)) {
                    return 0;
                }
                e eVar = (e) obj;
                e eVar2 = (e) obj2;
                int i = eVar.f11933a - eVar2.f11933a;
                return i == 0 ? (int) (eVar.b - eVar2.b) : i;
            }
        };
        d = new Comparator() { // from class: com.taobao.android.dinamicx.template.download.d.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public int compare(Object obj, Object obj2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
                }
                if (!(obj instanceof e) || !(obj2 instanceof e)) {
                    return 0;
                }
                e eVar = (e) obj;
                e eVar2 = (e) obj2;
                int i = eVar.f11933a - eVar2.f11933a;
                return i == 0 ? (int) (eVar2.b - eVar.b) : i;
            }
        };
    }

    public d(int i, boolean z, ThreadFactory threadFactory) {
        this(i, 8, 3L, TimeUnit.SECONDS, new PriorityBlockingQueue(512, z ? c : d), threadFactory);
    }

    public d(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory);
        try {
            allowCoreThreadTimeOut(true);
        } catch (Throwable unused) {
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            return;
        }
        try {
            if (runnable instanceof e) {
                ((e) runnable).b = f11931a.getAndIncrement();
            }
            super.execute(runnable);
        } catch (Throwable th) {
            fux.b(com.taobao.android.dinamicx.exception.a.a(th));
        }
    }
}
