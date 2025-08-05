package com.taobao.android.virtual_thread.stub;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThread;
import com.taobao.android.virtual_thread.e;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes6.dex */
public class StubExecutors {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(904979631);
    }

    public static ExecutorService newFixedThreadPool(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("c6bdf6d9", new Object[]{new Integer(i)}) : new StubThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    public static ExecutorService newFixedThreadPool(int i, e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("3eef25a3", new Object[]{new Integer(i), eVar}) : new StubThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), eVar);
    }

    public static ExecutorService newSingleThreadExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("94180b6f", new Object[0]) : new StubThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    public static ExecutorService newSingleThreadExecutor(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("1c7956cd", new Object[]{eVar}) : new StubThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), eVar);
    }

    public static ExecutorService newCachedThreadPool() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("b9c0d22c", new Object[0]) : new StubThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue());
    }

    public static ExecutorService newCachedThreadPool(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ExecutorService) ipChange.ipc$dispatch("9ef1f230", new Object[]{eVar}) : new StubThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), eVar);
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("fa1b3b79", new Object[0]) : new StubScheduledThreadPoolExecutor(1);
    }

    public static ScheduledExecutorService newSingleThreadScheduledExecutor(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("92a6c129", new Object[]{eVar}) : new StubScheduledThreadPoolExecutor(1, eVar);
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("5c9d018d", new Object[]{new Integer(i)}) : new StubScheduledThreadPoolExecutor(i);
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i, e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("dc5cf795", new Object[]{new Integer(i), eVar}) : new StubScheduledThreadPoolExecutor(i, eVar);
    }

    public static ThreadFactory defaultThreadFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadFactory) ipChange.ipc$dispatch("b81f5477", new Object[0]) : new a();
    }

    public static <T> Callable<T> callable(Runnable runnable, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Callable) ipChange.ipc$dispatch("812d8ada", new Object[]{runnable, t});
        }
        if (runnable == null) {
            throw new NullPointerException();
        }
        return new c(runnable, t);
    }

    public static Callable<Object> callable(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Callable) ipChange.ipc$dispatch("2a57493e", new Object[]{runnable});
        }
        if (runnable == null) {
            throw new NullPointerException();
        }
        return new c(runnable, null);
    }

    public static Callable<Object> callable(final PrivilegedAction<?> privilegedAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Callable) ipChange.ipc$dispatch("5edd8f44", new Object[]{privilegedAction});
        }
        if (privilegedAction == null) {
            throw new NullPointerException();
        }
        return new Callable<Object>() { // from class: com.taobao.android.virtual_thread.stub.StubExecutors.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.Callable
            public Object call() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : privilegedAction.run();
            }
        };
    }

    public static Callable<Object> callable(final PrivilegedExceptionAction<?> privilegedExceptionAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Callable) ipChange.ipc$dispatch("ca87a6b3", new Object[]{privilegedExceptionAction});
        }
        if (privilegedExceptionAction == null) {
            throw new NullPointerException();
        }
        return new Callable<Object>() { // from class: com.taobao.android.virtual_thread.stub.StubExecutors.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : privilegedExceptionAction.run();
            }
        };
    }

    public static <T> Callable<T> privilegedCallable(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Callable) ipChange.ipc$dispatch("b32ab8a0", new Object[]{callable});
        }
        if (callable == null) {
            throw new NullPointerException();
        }
        return new b(callable);
    }

    /* loaded from: classes6.dex */
    public static final class c<T> implements Callable<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f15820a;
        public final T b;

        static {
            kge.a(-542003363);
            kge.a(-119797776);
        }

        public c(Runnable runnable, T t) {
            this.f15820a = runnable;
            this.b = t;
        }

        @Override // java.util.concurrent.Callable
        public T call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            this.f15820a.run();
            return this.b;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b<T> implements Callable<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Callable<T> f15818a;
        private final AccessControlContext b = AccessController.getContext();

        static {
            kge.a(-848686112);
            kge.a(-119797776);
        }

        public static /* synthetic */ Callable a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Callable) ipChange.ipc$dispatch("df9eb8b", new Object[]{bVar}) : bVar.f15818a;
        }

        public b(Callable<T> callable) {
            this.f15818a = callable;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
            }
            try {
                return (T) AccessController.doPrivileged(new PrivilegedExceptionAction<T>() { // from class: com.taobao.android.virtual_thread.stub.StubExecutors.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.security.PrivilegedExceptionAction
                    public T run() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (T) ipChange2.ipc$dispatch("b35b2be0", new Object[]{this}) : (T) b.a(b.this).call();
                    }
                }, this.b);
            } catch (PrivilegedActionException e) {
                throw e.getException();
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final AtomicInteger f15817a;
        private final AtomicInteger b = new AtomicInteger(1);
        private final String c = "f" + f15817a.getAndIncrement() + "-t-";

        static {
            kge.a(-1851658284);
            f15817a = new AtomicInteger(1);
        }

        @Override // com.taobao.android.virtual_thread.e
        public VirtualThread a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VirtualThread) ipChange.ipc$dispatch("ac603360", new Object[]{this, runnable});
            }
            return new VirtualThread(runnable, this.c + this.b.getAndIncrement());
        }
    }

    private StubExecutors() {
    }

    public static void main(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2272e75f", new Object[]{strArr});
        } else {
            newCachedThreadPool().execute($$Lambda$StubExecutors$M3ZDXT_hdlN1pgJ8LEtz_PJvsAw.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$main$0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68df709", new Object[0]);
        } else {
            System.out.println("StubExecutors");
        }
    }
}
