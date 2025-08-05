package com.taobao.android.virtual_thread;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.lang.Thread;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class VThread implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_PRIORITY = 10;
    public static final int MIN_PRIORITY = 1;
    public static final int NORM_PRIORITY = 5;
    private static final String TAG = "VThread";
    public static final a sSharedPool;
    public static boolean sSupportThreadLocal;
    private static int sThreadInitNumber;
    private static long sThreadSeqNumber;
    private static final ConcurrentHashMap<Thread, VThread> sThreadVThreadMap;
    private static final ConcurrentHashMap<Thread, VThread> sVirtualThreadVThreadMap;
    private volatile Thread carrier;
    private boolean daemon;
    private final Object lock;
    private int priority;
    private Runnable target;
    private volatile int threadStatus;
    private long tid;
    private final Thread virtualThread;

    static {
        kge.a(-1953967806);
        kge.a(-1390502639);
        sSupportThreadLocal = false;
        sSharedPool = CarrierCachedPoolImpl.a();
        sThreadVThreadMap = new ConcurrentHashMap<>();
        sVirtualThreadVThreadMap = new ConcurrentHashMap<>();
        sThreadSeqNumber = TRecyclerView.ID_HEADER;
    }

    public static Thread currentCarrierThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("27d04597", new Object[0]) : Thread.currentThread();
    }

    public static Thread currentVirtualThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("87ad91a4", new Object[0]);
        }
        Thread currentCarrierThread = currentCarrierThread();
        VThread currentVThreadByCarrier = currentVThreadByCarrier(currentCarrierThread);
        return currentVThreadByCarrier != null ? currentVThreadByCarrier.getVirtualThread() : currentCarrierThread;
    }

    private static synchronized int nextThreadNum() {
        synchronized (VThread.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dea3cf63", new Object[0])).intValue();
            }
            int i = sThreadInitNumber;
            sThreadInitNumber = i + 1;
            return i;
        }
    }

    private static synchronized long nextThreadID() {
        synchronized (VThread.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("25217133", new Object[0])).longValue();
            }
            long j = sThreadSeqNumber + 1;
            sThreadSeqNumber = j;
            return j;
        }
    }

    public static VThread currentVThreadByCarrier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VThread) ipChange.ipc$dispatch("17375df0", new Object[0]) : currentVThreadByCarrier(currentCarrierThread());
    }

    private static VThread currentVThreadByCarrier(Thread thread) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VThread) ipChange.ipc$dispatch("128d2fa1", new Object[]{thread}) : sThreadVThreadMap.get(thread);
    }

    private static VThread currentVThreadByVirtualThread(Thread thread) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VThread) ipChange.ipc$dispatch("1721041e", new Object[]{thread}) : sVirtualThreadVThreadMap.get(thread);
    }

    private void init(Thread thread, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("716bed86", new Object[]{this, thread, runnable});
        } else if (thread == null) {
            throw new NullPointerException("virtualThread cannot be null");
        } else {
            this.target = runnable;
            this.tid = nextThreadID();
        }
    }

    public VThread(Runnable runnable) {
        this.lock = new Object();
        this.daemon = false;
        this.threadStatus = 0;
        this.virtualThread = new VirtualThread(this);
        init(this.virtualThread, runnable);
    }

    public VThread(Thread thread) {
        this.lock = new Object();
        this.daemon = false;
        this.threadStatus = 0;
        this.virtualThread = thread;
        init(this.virtualThread, thread);
    }

    public VThread(String str) {
        this.lock = new Object();
        this.daemon = false;
        this.threadStatus = 0;
        this.virtualThread = new VirtualThread(str);
        Thread thread = this.virtualThread;
        init(thread, thread);
    }

    public VThread(Thread thread, Runnable runnable) {
        this.lock = new Object();
        this.daemon = false;
        this.threadStatus = 0;
        this.virtualThread = thread;
        init(thread, runnable);
    }

    public VThread(Runnable runnable, String str) {
        this.lock = new Object();
        this.daemon = false;
        this.threadStatus = 0;
        this.virtualThread = new VirtualThread(this, str);
        init(this.virtualThread, runnable);
    }

    public final void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        synchronized (this.lock) {
            if (this.threadStatus != 0) {
                throw new IllegalThreadStateException();
            }
            this.threadStatus = 1;
        }
        sSharedPool.a(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        attachCarrier(currentCarrierThread());
        try {
            if (this.target != null) {
                this.target.run();
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean isAlive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c89930ce", new Object[]{this})).booleanValue() : (this.threadStatus == 0 || this.threadStatus == 3) ? false : true;
    }

    public final void setPriority(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f878ef6", new Object[]{this, new Integer(i)});
        } else if (i > 10 || i <= 0) {
            throw new IllegalArgumentException();
        } else {
            this.priority = i;
            if (this.threadStatus == 0) {
                return;
            }
            synchronized (this.lock) {
                if (this.threadStatus != 0 && this.carrier != null) {
                    this.carrier.setPriority(i);
                }
            }
        }
    }

    public final int getPriority() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue() : this.priority;
    }

    public final void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else if (str == null) {
            throw new NullPointerException("name cannot be null");
        } else {
            this.virtualThread.setName(str);
            if (this.threadStatus == 0) {
                return;
            }
            synchronized (this.lock) {
                if (this.threadStatus != 0 && this.carrier != null) {
                    this.carrier.setName(str);
                }
            }
        }
    }

    public final String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.virtualThread.getName();
    }

    @Deprecated
    public final void setDaemon(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9169d567", new Object[]{this, new Boolean(z)});
        } else if (isAlive()) {
            throw new IllegalThreadStateException();
        } else {
            this.daemon = z;
        }
    }

    @Deprecated
    public final boolean isDaemon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6174b5d9", new Object[]{this})).booleanValue() : this.daemon;
    }

    @Deprecated
    public final void join() throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac60bcb1", new Object[]{this});
        } else {
            join(0L);
        }
    }

    @Deprecated
    public final void join(long j) throws InterruptedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb75033", new Object[]{this, new Long(j)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("timeout value is negative");
        }
        synchronized (this.lock) {
            try {
                if (i == 0) {
                    while (isAlive()) {
                        this.lock.wait(10L);
                    }
                } else {
                    long j2 = 0;
                    while (isAlive()) {
                        long j3 = j - j2;
                        if (j3 <= 0) {
                            break;
                        }
                        this.lock.wait(j3);
                        j2 = System.currentTimeMillis() - currentTimeMillis;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Thread getVirtualThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("8cecac41", new Object[]{this}) : this.virtualThread;
    }

    public Thread getCarrier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("3628d29e", new Object[]{this}) : this.carrier;
    }

    public long getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ddaaf0c", new Object[]{this})).longValue() : this.tid;
    }

    public int getVState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("832694ab", new Object[]{this})).intValue() : this.threadStatus;
    }

    public Thread.State getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread.State) ipChange.ipc$dispatch("9cc6b378", new Object[]{this});
        }
        if (this.carrier != null) {
            synchronized (this.lock) {
                if (this.carrier != null) {
                    return this.carrier.getState();
                }
            }
        }
        int i = this.threadStatus;
        if (i == 0) {
            return Thread.State.NEW;
        }
        if (i == 1 || i == 2) {
            return Thread.State.RUNNABLE;
        }
        if (i == 3) {
            return Thread.State.TERMINATED;
        }
        return Thread.State.TERMINATED;
    }

    private void attachCarrier(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423ff6ab", new Object[]{this, thread});
            return;
        }
        thread.setName(this.virtualThread.getName());
        synchronized (this.lock) {
            this.carrier = thread;
            this.carrier.setContextClassLoader(this.virtualThread.getContextClassLoader());
            this.carrier.setUncaughtExceptionHandler(this.virtualThread.getUncaughtExceptionHandler());
            this.threadStatus = 2;
        }
        sThreadVThreadMap.put(thread, this);
        synchronized (this.virtualThread) {
            sVirtualThreadVThreadMap.put(this.virtualThread, this);
        }
        if (sSupportThreadLocal) {
            g.a(this.virtualThread, thread);
        } else {
            c.a(this.virtualThread);
        }
    }

    private void detachCarrier(Thread thread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1edb81d", new Object[]{this, thread});
            return;
        }
        if (sSupportThreadLocal) {
            g.b(this.virtualThread, thread);
        } else {
            c.b(this.virtualThread);
        }
        synchronized (this.virtualThread) {
            if (sVirtualThreadVThreadMap.get(this.virtualThread) == this) {
                sVirtualThreadVThreadMap.remove(this.virtualThread);
            }
        }
        sThreadVThreadMap.remove(thread);
        synchronized (this.lock) {
            this.virtualThread.setContextClassLoader(this.carrier.getContextClassLoader());
            this.virtualThread.setUncaughtExceptionHandler(this.carrier.getUncaughtExceptionHandler());
            this.carrier.setContextClassLoader(getClass().getClassLoader());
            this.carrier.setUncaughtExceptionHandler(null);
            this.threadStatus = 3;
            this.carrier = null;
            this.lock.notifyAll();
        }
    }

    public boolean isInterrupted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a1f3343", new Object[]{this})).booleanValue();
        }
        if (this.carrier != null) {
            synchronized (this.lock) {
                if (this.carrier != null) {
                    return this.carrier.isInterrupted();
                }
            }
        }
        return false;
    }

    public static boolean interrupted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb59c1cd", new Object[0])).booleanValue() : Thread.interrupted();
    }

    public Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread.UncaughtExceptionHandler) ipChange.ipc$dispatch("cfe68928", new Object[]{this});
        }
        if (this.carrier != null) {
            synchronized (this.lock) {
                if (this.carrier != null) {
                    return this.carrier.getUncaughtExceptionHandler();
                }
            }
        }
        return this.virtualThread.getUncaughtExceptionHandler();
    }

    public void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce33732", new Object[]{this, uncaughtExceptionHandler});
        } else if (this.carrier == null) {
        } else {
            synchronized (this.lock) {
                if (this.carrier != null) {
                    this.carrier.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                }
            }
        }
    }

    public void setContextClassLoader(ClassLoader classLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48824c5", new Object[]{this, classLoader});
        } else if (this.carrier == null) {
        } else {
            synchronized (this.lock) {
                if (this.carrier != null) {
                    this.carrier.setContextClassLoader(classLoader);
                }
            }
        }
    }

    @Deprecated
    public void interrupt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("363cc96a", new Object[]{this});
        } else if (this.carrier == null) {
        } else {
            synchronized (this.lock) {
                if (this.carrier != null) {
                    this.carrier.interrupt();
                }
            }
        }
    }

    public StackTraceElement[] getStackTrace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StackTraceElement[]) ipChange.ipc$dispatch("4093147d", new Object[]{this});
        }
        Thread thread = this.carrier;
        if (thread != null) {
            return thread.getStackTrace();
        }
        return new StackTraceElement[0];
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "VThread[" + getName() + "," + getPriority() + "," + this.threadStatus + riy.ARRAY_END_STR;
    }
}
