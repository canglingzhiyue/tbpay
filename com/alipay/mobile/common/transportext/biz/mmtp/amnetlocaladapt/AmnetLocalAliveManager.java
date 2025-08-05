package com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.biz.mmtp.mrpc.internal.MRpcConnection;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportStrategy;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class AmnetLocalAliveManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static int f5682a = 2;
    private static int b = 0;
    private static int c = 1;
    private static AmnetLocalAliveManager e;
    private int d = b;

    /* loaded from: classes3.dex */
    public class CheckRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public CheckRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!AmnetClientLocalAdapter.getInstance().isCanShutdown()) {
                NetworkAsyncTaskExecutor.schedule(new CheckRunnable(), AmnetLocalAliveManager.access$000(), TimeUnit.MINUTES);
                LogCatUtil.info("AmnetLocalAliveManager", "[CheckRunnable] Can't shutdown , continue to the next check.");
            } else if (!MRpcConnection.getInstance().hasLocalAmnetStream()) {
                AmnetLocalAliveManager.this.asyncShutdownAmnet();
            } else {
                NetworkAsyncTaskExecutor.schedule(new CheckRunnable(), AmnetLocalAliveManager.access$000(), TimeUnit.MINUTES);
                LogCatUtil.info("AmnetLocalAliveManager", "[CheckRunnable] Continue to the next check.");
            }
        }
    }

    /* loaded from: classes3.dex */
    public class ShutdownAmnetRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ShutdownAmnetRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!ExtTransportStrategy.isEnabledTransportByLocalAmnet()) {
                AmnetClientLocalAdapter.getInstance().forceShutdownAmnet();
                LogCatUtil.info("AmnetLocalAliveManager", "[ShutdownAmnetRunnable] Switch off, forceShutdownAmnet.");
            } else if (!AmnetClientLocalAdapter.getInstance().isCanShutdown()) {
                NetworkAsyncTaskExecutor.schedule(new CheckRunnable(), AmnetLocalAliveManager.access$000(), TimeUnit.MINUTES);
                LogCatUtil.info("AmnetLocalAliveManager", "[ShutdownAmnetRunnable] Can't shutdown , continue to the next check.");
            } else if (MRpcConnection.getInstance().hasLocalAmnetStream()) {
                NetworkAsyncTaskExecutor.schedule(new CheckRunnable(), AmnetLocalAliveManager.access$000(), TimeUnit.MINUTES);
                LogCatUtil.info("AmnetLocalAliveManager", "[ShutdownAmnetRunnable] Continue to the next check.");
            } else {
                synchronized (AmnetClientLocalAdapter.getInstance()) {
                    if (!AmnetClientLocalAdapter.getInstance().shutdownAmnet()) {
                        NetworkAsyncTaskExecutor.schedule(new CheckRunnable(), AmnetLocalAliveManager.access$000(), TimeUnit.MINUTES);
                        LogCatUtil.info("AmnetLocalAliveManager", "[ShutdownAmnetRunnable] Shutdown failed.");
                        return;
                    }
                    LogCatUtil.info("AmnetLocalAliveManager", "[ShutdownAmnetRunnable] Shutdown finished.");
                    AmnetLocalAliveManager.access$102(AmnetLocalAliveManager.this, AmnetLocalAliveManager.access$200());
                }
            }
        }
    }

    public static /* synthetic */ int access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue() : f5682a;
    }

    public static /* synthetic */ int access$102(AmnetLocalAliveManager amnetLocalAliveManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d91617e", new Object[]{amnetLocalAliveManager, new Integer(i)})).intValue();
        }
        amnetLocalAliveManager.d = i;
        return i;
    }

    public static /* synthetic */ int access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26a27dec", new Object[0])).intValue() : b;
    }

    public static final AmnetLocalAliveManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetLocalAliveManager) ipChange.ipc$dispatch("3bc07bf4", new Object[0]);
        }
        AmnetLocalAliveManager amnetLocalAliveManager = e;
        if (amnetLocalAliveManager != null) {
            return amnetLocalAliveManager;
        }
        synchronized (AmnetLocalAliveManager.class) {
            if (e == null) {
                e = new AmnetLocalAliveManager();
            }
        }
        return e;
    }

    public void startTimerCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d9a58cc", new Object[]{this});
        } else if (this.d == c) {
        } else {
            NetworkAsyncTaskExecutor.schedule(new CheckRunnable(), f5682a, TimeUnit.MINUTES);
            this.d = c;
            LogCatUtil.info("AmnetLocalAliveManager", "[startTimerCheck] Start finished.");
        }
    }

    public void asyncShutdownAmnet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1af2126", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.executeIO(new ShutdownAmnetRunnable());
        }
    }

    public boolean isRunning() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue() : this.d == c;
    }
}
