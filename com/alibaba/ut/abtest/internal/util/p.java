package com.alibaba.ut.abtest.internal.util;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f4205a;
    private static volatile Handler b;
    private static final List<Runnable> c;
    private static boolean d;

    static {
        kge.a(1489201216);
        f4205a = new Handler(Looper.getMainLooper());
        b = null;
        c = new ArrayList();
        d = false;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        synchronized (p.class) {
            d = true;
            for (Runnable runnable : c) {
                a(runnable);
            }
            c.clear();
        }
    }

    public static Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("ac18683d", new Object[0]);
        }
        if (b == null) {
            synchronized (p.class) {
                if (b == null) {
                    HandlerThread handlerThread = new HandlerThread("TaskExecutor");
                    handlerThread.start();
                    b = new Handler(handlerThread.getLooper()) { // from class: com.alibaba.ut.abtest.internal.util.p.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                            if (str.hashCode() == 673877017) {
                                super.handleMessage((Message) objArr[0]);
                                return null;
                            }
                            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                        }

                        @Override // android.os.Handler
                        public void handleMessage(Message message) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                                return;
                            }
                            super.handleMessage(message);
                            try {
                                if (!(message.obj instanceof Runnable)) {
                                    return;
                                }
                                p.a((Runnable) message.obj);
                            } catch (Throwable th) {
                                b.a("TaskExecutor.handleMessage", th);
                            }
                        }
                    };
                }
            }
        }
        return b;
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(runnable);
        }
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
            return;
        }
        synchronized (p.class) {
            if (!d) {
                c.add(runnable);
            } else {
                a(runnable);
            }
        }
    }

    public static void a(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{runnable, new Long(j)});
        } else {
            a(0, runnable, j);
        }
    }

    public static void a(int i, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0f274b", new Object[]{new Integer(i), runnable, new Long(j)});
            return;
        }
        try {
            if (b == null) {
                b();
            }
            Message obtain = Message.obtain(b, i);
            obtain.obj = runnable;
            b.sendMessageDelayed(obtain, j);
        } catch (Throwable th) {
            b.a("TaskExecutor.executeBackgroundDelayed", th);
        }
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
            return;
        }
        try {
            if (b == null) {
                b();
            }
            b.removeMessages(i);
        } catch (Throwable th) {
            b.a("TaskExecutor.removeBackgroundCallbacks", th);
        }
    }

    public static boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{new Integer(i)})).booleanValue();
        }
        try {
            if (b == null) {
                b();
            }
            return b.hasMessages(i);
        } catch (Throwable th) {
            b.a("TaskExecutor.hasBackgroundCallbacks", th);
            return false;
        }
    }
}
