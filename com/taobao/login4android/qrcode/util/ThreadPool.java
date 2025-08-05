package com.taobao.login4android.qrcode.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes7.dex */
public final class ThreadPool {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int COMMON_CORE_NUM = 4;
    private static final int CORE_POOL_SIZE = 3;
    private static final int KEEP_ALIVE_TIME = 60;
    private static final int MAX_POOL_SIZE = 5;
    private static final int QUEEN_COUNT = 30;
    private static final String TAG = "PassportWorker";
    private static volatile ThreadPool sInstance;
    private ExecutorService mExecutor;
    private Handler mHandler;
    private Runnable mSerialActive;
    private Handler mUiHandler;
    private final ArrayDeque<Runnable> mSerialTasks = new ArrayDeque<>();
    private HandlerThread mWorkThread = new HandlerThread(TAG);

    static {
        kge.a(-2096310768);
    }

    public static /* synthetic */ void access$000(ThreadPool threadPool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1be71a", new Object[]{threadPool});
        } else {
            threadPool.scheduleNext();
        }
    }

    public static ThreadPool getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPool) ipChange.ipc$dispatch("764d1533", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (ThreadPool.class) {
                if (sInstance == null) {
                    sInstance = new ThreadPool();
                }
            }
        }
        return sInstance;
    }

    private ThreadPool() {
        this.mWorkThread.start();
        this.mHandler = new Handler(this.mWorkThread.getLooper());
        this.mUiHandler = new Handler(Looper.getMainLooper());
    }

    private void initExecutor() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3fa7d0a", new Object[]{this});
        } else if (this.mExecutor != null) {
        } else {
            synchronized (ThreadPool.class) {
                if (this.mExecutor == null) {
                    int availableProcessors = Runtime.getRuntime().availableProcessors();
                    int i3 = (availableProcessors * 2) - 1;
                    if (availableProcessors < 4) {
                        i = 3;
                        i2 = 5;
                    } else {
                        i = availableProcessors;
                        i2 = i3;
                    }
                    this.mExecutor = new ThreadPoolExecutor(i, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(30), new a(5), new ThreadPoolExecutor.DiscardOldestPolicy());
                }
            }
        }
    }

    public void post(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd609e25", new Object[]{this, runnable});
            return;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.post(runnable);
    }

    public void postDelayed(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f55df7d", new Object[]{this, runnable, new Long(j)});
            return;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.postDelayed(runnable, j);
    }

    public void remove(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb0e9209", new Object[]{this, runnable});
            return;
        }
        Handler handler = this.mUiHandler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    public void postOnUi(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f61f618", new Object[]{this, runnable});
            return;
        }
        Handler handler = this.mUiHandler;
        if (handler == null) {
            return;
        }
        handler.post(runnable);
    }

    public void postDelayedOnUi(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f836ea", new Object[]{this, runnable, new Long(j)});
            return;
        }
        Handler handler = this.mUiHandler;
        if (handler == null) {
            return;
        }
        handler.postDelayed(runnable, j);
    }

    public void removeOnUi(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6b57fc", new Object[]{this, runnable});
            return;
        }
        Handler handler = this.mUiHandler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    private synchronized void scheduleNext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c0cdb1", new Object[]{this});
            return;
        }
        Runnable poll = this.mSerialTasks.poll();
        this.mSerialActive = poll;
        if (poll != null) {
            executeParallel(this.mSerialActive);
        }
    }

    public synchronized void executeSerially(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ea8f89b", new Object[]{this, runnable});
            return;
        }
        this.mSerialTasks.offer(new Runnable() { // from class: com.taobao.login4android.qrcode.util.ThreadPool.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    runnable.run();
                } finally {
                    ThreadPool.access$000(ThreadPool.this);
                }
            }
        });
        if (this.mSerialActive == null) {
            scheduleNext();
        }
    }

    public Future<?> executeParallel(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("91b4aa37", new Object[]{this, runnable});
        }
        initExecutor();
        return this.mExecutor.submit(runnable);
    }

    public void runAfterInit(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44c59546", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            post(new Runnable() { // from class: com.taobao.login4android.qrcode.util.ThreadPool.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ThreadPool.this.executeParallel(runnable);
                    }
                }
            });
        }
    }

    private void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        this.mHandler = null;
        this.mUiHandler = null;
        this.mWorkThread.quit();
        this.mWorkThread = null;
        this.mExecutor.shutdown();
        this.mExecutor = null;
    }

    public static synchronized void shutdown() {
        synchronized (ThreadPool.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b466fdd", new Object[0]);
                return;
            }
            if (sInstance != null) {
                sInstance.release();
                sInstance = null;
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static AtomicInteger f17914a;
        private int b;

        static {
            kge.a(1174963450);
            kge.a(-1938806936);
            f17914a = new AtomicInteger();
        }

        public a(int i) {
            this.b = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            int andIncrement = f17914a.getAndIncrement();
            Thread thread = new Thread(runnable, "Passport-" + andIncrement);
            thread.setPriority(this.b);
            return thread;
        }
    }
}
