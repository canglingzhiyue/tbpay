package com.taobao.appbundle.scheduler.internal;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.scheduler.Priority;
import com.taobao.appbundle.scheduler.internal.g;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes6.dex */
public final class f extends g.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f16309a = new a();
    private final PriorityBlockingQueue<e> b;
    private final Priority c;
    private final int d;

    static {
        kge.a(33769878);
    }

    public static /* synthetic */ PriorityBlockingQueue a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PriorityBlockingQueue) ipChange.ipc$dispatch("5d803a33", new Object[]{fVar}) : fVar.b;
    }

    public f(PriorityBlockingQueue<e> priorityBlockingQueue, Priority priority, int i) {
        this.b = priorityBlockingQueue;
        this.c = priority;
        this.d = i;
    }

    @Override // com.taobao.appbundle.scheduler.internal.g.a
    public c a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("fb949993", new Object[]{this, runnable}) : a(runnable, 0L, TimeUnit.MILLISECONDS);
    }

    public c a(Runnable runnable, long j, TimeUnit timeUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("835b1d87", new Object[]{this, runnable, new Long(j), timeUnit});
        }
        final e eVar = new e(runnable, this.c, this.d);
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(eVar, this.f16309a);
        scheduledRunnable.setFuture(new Future<Object>() { // from class: com.taobao.appbundle.scheduler.internal.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.Future
            public Object get() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("6352d3f5", new Object[]{this});
                }
                return null;
            }

            @Override // java.util.concurrent.Future
            public Object get(long j2, TimeUnit timeUnit2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("122d0181", new Object[]{this, new Long(j2), timeUnit2});
                }
                return null;
            }

            @Override // java.util.concurrent.Future
            public boolean isDone() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("15dabe57", new Object[]{this})).booleanValue();
                }
                return false;
            }

            @Override // java.util.concurrent.Future
            public boolean cancel(boolean z) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("9f7d8cf7", new Object[]{this, new Boolean(z)})).booleanValue() : f.a(f.this).remove(eVar);
            }

            @Override // java.util.concurrent.Future
            public boolean isCancelled() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("6ff5f452", new Object[]{this})).booleanValue() : f.a(f.this).contains(eVar);
            }
        });
        this.f16309a.a(scheduledRunnable);
        this.b.offer(eVar, j, timeUnit);
        return scheduledRunnable;
    }

    @Override // com.taobao.appbundle.scheduler.internal.c
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            this.f16309a.dispose();
        }
    }
}
