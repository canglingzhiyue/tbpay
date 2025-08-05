package com.alipay.mobile.common.transportext.biz.mmtp.amnetlocaladapt;

import com.alipay.mobile.common.amnet.biz.AmnetTunnelManager;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.strategy.ExtTransportTunnelWatchdog;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.biz.mmtp.amnetadapt.AmnetHelper;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportStrategy;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class AmnetLocalTunnelManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AmnetLocalTunnelManager f5685a;
    private int b = 0;
    private int c = 0;
    private int d = 0;

    /* loaded from: classes3.dex */
    public class CheckerRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public CheckerRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!ExtTransportStrategy.isEnabledTransportByLocalAmnet()) {
                LogCatUtil.info("AmnetLocalTunnelManager", "[CheckerRunnable] Local amnet disabled.");
            } else if (!ExtTransportTunnelWatchdog.getInstance().isDowngraded()) {
                LogCatUtil.info("AmnetLocalTunnelManager", "[CheckerRunnable] Currently not downgraded.");
            } else {
                AmnetLocalTunnelManager.access$004(AmnetLocalTunnelManager.this);
                if (AmnetLocalTunnelManager.access$000(AmnetLocalTunnelManager.this) >= 10) {
                    AmnetLocalTunnelManager.access$100(AmnetLocalTunnelManager.this);
                    LogCatUtil.info("AmnetLocalTunnelManager", "[CheckerRunnable] check out limit.");
                } else if (!AmnetHelper.isAmnetActivite()) {
                    if (10 - AmnetLocalTunnelManager.access$000(AmnetLocalTunnelManager.this) < 3) {
                        AmnetLocalTunnelManager.access$100(AmnetLocalTunnelManager.this);
                        LogCatUtil.info("AmnetLocalTunnelManager", "[CheckerRunnable] Insufficient remaining available.");
                        return;
                    }
                    AmnetLocalTunnelManager.access$202(AmnetLocalTunnelManager.this, 0);
                    AmnetLocalTunnelManager.access$300(AmnetLocalTunnelManager.this);
                    LogCatUtil.info("AmnetLocalTunnelManager", "[CheckerRunnable] check limit.");
                } else {
                    AmnetLocalTunnelManager.access$204(AmnetLocalTunnelManager.this);
                    if (AmnetLocalTunnelManager.access$200(AmnetLocalTunnelManager.this) >= 3) {
                        ExtTransportTunnelWatchdog.getInstance().resetDowngradeFlag();
                        AmnetLocalTunnelManager.access$100(AmnetLocalTunnelManager.this);
                        LogCatUtil.info("AmnetLocalTunnelManager", "[CheckerRunnable] reset downgrade finished.");
                        return;
                    }
                    AmnetLocalTunnelManager.access$300(AmnetLocalTunnelManager.this);
                    LogCatUtil.info("AmnetLocalTunnelManager", "[CheckerRunnable] check success, count = " + AmnetLocalTunnelManager.access$200(AmnetLocalTunnelManager.this));
                }
            }
        }
    }

    public static /* synthetic */ int access$000(AmnetLocalTunnelManager amnetLocalTunnelManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac0bb363", new Object[]{amnetLocalTunnelManager})).intValue() : amnetLocalTunnelManager.d;
    }

    public static /* synthetic */ int access$004(AmnetLocalTunnelManager amnetLocalTunnelManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("42b92567", new Object[]{amnetLocalTunnelManager})).intValue();
        }
        int i = amnetLocalTunnelManager.d + 1;
        amnetLocalTunnelManager.d = i;
        return i;
    }

    public static /* synthetic */ void access$100(AmnetLocalTunnelManager amnetLocalTunnelManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451f3b1", new Object[]{amnetLocalTunnelManager});
        } else {
            amnetLocalTunnelManager.b();
        }
    }

    public static /* synthetic */ int access$200(AmnetLocalTunnelManager amnetLocalTunnelManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fc9833e5", new Object[]{amnetLocalTunnelManager})).intValue() : amnetLocalTunnelManager.c;
    }

    public static /* synthetic */ int access$202(AmnetLocalTunnelManager amnetLocalTunnelManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35ef2482", new Object[]{amnetLocalTunnelManager, new Integer(i)})).intValue();
        }
        amnetLocalTunnelManager.c = i;
        return i;
    }

    public static /* synthetic */ int access$204(AmnetLocalTunnelManager amnetLocalTunnelManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9345a5e9", new Object[]{amnetLocalTunnelManager})).intValue();
        }
        int i = amnetLocalTunnelManager.c + 1;
        amnetLocalTunnelManager.c = i;
        return i;
    }

    public static /* synthetic */ void access$300(AmnetLocalTunnelManager amnetLocalTunnelManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24de7433", new Object[]{amnetLocalTunnelManager});
        } else {
            amnetLocalTunnelManager.a();
        }
    }

    public static final AmnetLocalTunnelManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetLocalTunnelManager) ipChange.ipc$dispatch("1e8ef7fd", new Object[0]);
        }
        AmnetLocalTunnelManager amnetLocalTunnelManager = f5685a;
        if (amnetLocalTunnelManager != null) {
            return amnetLocalTunnelManager;
        }
        synchronized (AmnetLocalTunnelManager.class) {
            if (f5685a != null) {
                return f5685a;
            }
            f5685a = new AmnetLocalTunnelManager();
            return f5685a;
        }
    }

    private AmnetLocalTunnelManager() {
    }

    public void startCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290cf4d", new Object[]{this});
        } else if (!ExtTransportTunnelWatchdog.getInstance().isDowngraded()) {
            LogCatUtil.info("AmnetLocalTunnelManager", "[startCheck] Currently not downgraded.");
        } else if (this.b == 1) {
        } else {
            synchronized (this) {
                if (this.b == 1) {
                    return;
                }
                a();
                this.b = 1;
                LogCatUtil.info("AmnetLocalTunnelManager", "[startCheck] ");
            }
        }
    }

    public boolean isBifrostInDowngrade() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("490a1288", new Object[]{this})).booleanValue() : AmnetTunnelManager.getInstance().isBifrostLocalInDowngrade();
    }

    public boolean isCanLocalAmnet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1369f6b7", new Object[]{this})).booleanValue();
        }
        if (!ExtTransportStrategy.isEnabledTransportByLocalAmnet()) {
            return false;
        }
        if (!isBifrostInDowngrade()) {
            return true;
        }
        TransportStrategy.setEnabledLocamAmnetCacheFlag(false);
        LogCatUtil.debug("AmnetLocalTunnelManager", "isCanLocalAmnet return false,as bifrost in downgrade");
        return false;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.schedule(new CheckerRunnable(), 1L, TimeUnit.MINUTES);
        }
    }

    private synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c = 0;
        this.d = 0;
        this.b = 0;
    }
}
