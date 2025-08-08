package com.taobao.message.lab.comfrm.inner;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import anet.channel.Constants;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.annotation.IgnoreVirtualThread;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.gso;
import tb.kge;

/* loaded from: classes7.dex */
public class Schedules {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOGIC_THREAD_NAME = "MessageS-logic";
    private static boolean isDebug;
    private static ScheduledExecutorService lowBackgroundThreadPool;
    private static ScheduledExecutorService sIo;
    private static ScheduledExecutorService sLogic;
    private static volatile Handler sMainThreadHandler;

    public static /* synthetic */ boolean access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue() : isDebug;
    }

    static {
        kge.a(572861265);
        isDebug = ApplicationUtil.isDebug();
        staticInit();
    }

    @IgnoreVirtualThread
    private static void staticInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("884fc625", new Object[0]);
            return;
        }
        ScheduledExecutorService newScheduledThreadPool = VExecutors.newScheduledThreadPool(1, new MyThreadNameFactory(LOGIC_THREAD_NAME));
        sLogic = newScheduledThreadPool;
        ((ThreadPoolExecutor) newScheduledThreadPool).setKeepAliveTime(Constants.RECV_TIMEOUT, TimeUnit.MILLISECONDS);
        ((ThreadPoolExecutor) sLogic).allowCoreThreadTimeOut(true);
        ScheduledExecutorService newScheduledThreadPool2 = VExecutors.newScheduledThreadPool(8, new MyThreadNameFactory("MessageS-io"));
        sIo = newScheduledThreadPool2;
        ((ThreadPoolExecutor) newScheduledThreadPool2).setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        ((ThreadPoolExecutor) sIo).allowCoreThreadTimeOut(true);
        ScheduledExecutorService newScheduledThreadPool3 = VExecutors.newScheduledThreadPool(1, new MyThreadNameFactory("MessageS-low"));
        lowBackgroundThreadPool = newScheduledThreadPool3;
        ((ThreadPoolExecutor) newScheduledThreadPool3).setKeepAliveTime(3000L, TimeUnit.MILLISECONDS);
        ((ThreadPoolExecutor) lowBackgroundThreadPool).allowCoreThreadTimeOut(true);
    }

    public static void uiPost(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eedad9", new Object[]{runnable});
            return;
        }
        if (sMainThreadHandler == null) {
            synchronized (Schedules.class) {
                if (sMainThreadHandler == null) {
                    sMainThreadHandler = new Handler(Looper.getMainLooper());
                }
            }
        }
        sMainThreadHandler.post(runnable);
    }

    public static void ui(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd667819", new Object[]{runnable});
            return;
        }
        try {
            if (VExecutors.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
                return;
            }
            if (sMainThreadHandler == null) {
                synchronized (Schedules.class) {
                    if (sMainThreadHandler == null) {
                        sMainThreadHandler = new Handler(Looper.getMainLooper());
                    }
                }
            }
            sMainThreadHandler.post(runnable);
        } catch (Exception unused) {
            runnable.run();
        }
    }

    public static void logic(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6091ae3", new Object[]{runnable});
        } else {
            sLogic.execute(new MyRunnable(runnable));
        }
    }

    public static void logicTryKeep(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f8ee27", new Object[]{runnable});
        } else if (StringUtils.equals(VExecutors.currentThread().getName(), LOGIC_THREAD_NAME)) {
            new MyRunnable(runnable).run();
        } else {
            sLogic.execute(new MyRunnable(runnable));
        }
    }

    public static ScheduledExecutorService getLogic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("4c350213", new Object[0]) : sLogic;
    }

    public static void io(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5860ab", new Object[]{runnable});
        } else {
            sIo.execute(runnable);
        }
    }

    public static void lowBackground(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1a5b27", new Object[]{runnable});
        } else {
            lowBackgroundThreadPool.execute(new MyRunnable(runnable));
        }
    }

    public static ScheduledExecutorService getLowBackground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("bc8f4b57", new Object[0]) : lowBackgroundThreadPool;
    }

    public static ScheduledExecutorService getIO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("b9a70a67", new Object[0]) : sIo;
    }

    /* loaded from: classes7.dex */
    public static class MyThreadFactory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String name;

        static {
            kge.a(-1115239967);
            kge.a(-1938806936);
        }

        public MyThreadFactory(String str) {
            this.name = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, this.name);
        }
    }

    /* loaded from: classes7.dex */
    public static class MyThreadNameFactory implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String name;

        static {
            kge.a(1813758294);
            kge.a(-364397375);
        }

        public MyThreadNameFactory(String str) {
            this.name = str;
        }

        @Override // com.taobao.android.virtual_thread.face.h
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : this.name;
        }
    }

    /* loaded from: classes7.dex */
    public static class HighThreadNameFactory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String name;

        static {
            kge.a(1907936480);
            kge.a(-1938806936);
        }

        public HighThreadNameFactory(String str) {
            this.name = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(final Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            Thread thread = new Thread(new Runnable() { // from class: com.taobao.message.lab.comfrm.inner.Schedules.HighThreadNameFactory.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Logger.e("Schedules", "bindCPU");
                    gso.a();
                    runnable.run();
                }
            }, this.name);
            thread.setPriority(10);
            return thread;
        }
    }

    /* loaded from: classes7.dex */
    public static class MyRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Runnable runnable;

        static {
            kge.a(2124030012);
            kge.a(-1390502639);
        }

        public MyRunnable(Runnable runnable) {
            this.runnable = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (Schedules.access$000()) {
                SystemClock.uptimeMillis();
            }
            try {
                this.runnable.run();
            } catch (Throwable th) {
                Logger.e("Schedules", th);
                th.printStackTrace();
                String value = ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "catchExceptionList", "");
                if (!StringUtils.isEmpty(value)) {
                    List<String> list = null;
                    try {
                        list = JSON.parseArray(value, String.class);
                    } catch (Exception e) {
                        Logger.e("Schedules", Log.getStackTraceString(e));
                    }
                    String stackTraceString = Log.getStackTraceString(th);
                    if (list != null) {
                        for (String str : list) {
                            if (stackTraceString.contains(str)) {
                                return;
                            }
                        }
                    }
                }
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    defaultUncaughtExceptionHandler.uncaughtException(VExecutors.currentThread(), th);
                }
            }
            if (!Schedules.access$000()) {
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            Logger.e("Schedules", this.runnable.getClass().getName() + VExecutors.currentThread().getName() + "|" + (uptimeMillis - 0));
        }
    }
}
