package com.alipay.mobile.common.amnet.service;

import com.alipay.mobile.common.amnet.api.AmnetEnvHelper;
import com.alipay.mobile.common.amnet.service.events.ServiceLifeCycleListener;
import com.alipay.mobile.common.amnet.service.ipcservice.OutEventNotifyServiceImpl;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.strategy.NetworkTunnelStrategy;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Observable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class AmnetServiceLifeCycleListener implements ServiceLifeCycleListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AmnetServiceLifeCycleListener e;

    /* renamed from: a  reason: collision with root package name */
    private int f5374a = -1;
    private int b = -1;
    private int c = -1;
    private long d = -1;

    public static /* synthetic */ void access$000(AmnetServiceLifeCycleListener amnetServiceLifeCycleListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b563c12", new Object[]{amnetServiceLifeCycleListener});
        } else {
            amnetServiceLifeCycleListener.a();
        }
    }

    public static final AmnetServiceLifeCycleListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AmnetServiceLifeCycleListener) ipChange.ipc$dispatch("784e339f", new Object[0]);
        }
        AmnetServiceLifeCycleListener amnetServiceLifeCycleListener = e;
        if (amnetServiceLifeCycleListener != null) {
            return amnetServiceLifeCycleListener;
        }
        synchronized (AmnetServiceLifeCycleListener.class) {
            if (e != null) {
                return e;
            }
            e = new AmnetServiceLifeCycleListener();
            return e;
        }
    }

    private AmnetServiceLifeCycleListener() {
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9292f698", new Object[]{this, observable, obj});
            return;
        }
        this.f5374a = this.b;
        this.b = ((Integer) obj).intValue();
        LogCatUtil.info("AmnetServiceLifeCycleListener", "[update] currentState=" + this.b + " ,lastState=" + this.f5374a);
        if (this.b == 1) {
            this.d = System.currentTimeMillis();
        }
        doConnect();
        doNotify();
    }

    public void doNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1de463b", new Object[]{this});
            return;
        }
        int i = this.b;
        if (i != 2 && i != 3) {
            if (i != 4) {
                return;
            }
            ((OutEventNotifyServiceImpl) OutEventNotifyServiceImpl.getInstance()).notifyMainProcExistStateChanged(2);
            this.c = 4;
            return;
        }
        ((OutEventNotifyServiceImpl) OutEventNotifyServiceImpl.getInstance()).notifyMainProcExistStateChanged(1);
        this.c = 2;
        if (MiscUtils.isScreenOn(AmnetEnvHelper.getAppContext())) {
            OutEventNotifyServiceImpl.getInstance().notifySeceenOnEvent();
        }
        if (MiscUtils.isAtFrontDesk(AmnetEnvHelper.getAppContext())) {
            OutEventNotifyServiceImpl.getInstance().notifyAppResumeEvent();
        }
        resetConfig();
    }

    public void doConnect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b4e5ee6", new Object[]{this});
        } else if (this.b != 2) {
            LogCatUtil.warn("AmnetServiceLifeCycleListener", "[doConnect] Illegal currentState:" + this.b);
        } else if (!NetworkTunnelStrategy.getInstance().isCanUseAmnet()) {
            LogCatUtil.warn("AmnetServiceLifeCycleListener", "[doConnect] It's can't use amnet.");
        } else {
            NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.AmnetServiceLifeCycleListener.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!NetworkTunnelStrategy.getInstance().isCanUseAmnet()) {
                    } else {
                        AmnetServiceOperationHelper.startAmnetConnect();
                    }
                }
            });
        }
    }

    public void resetConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e187978", new Object[]{this});
        } else if ((this.b != 2 || System.currentTimeMillis() - this.d <= 5000) && this.b != 3) {
        } else {
            NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.AmnetServiceLifeCycleListener.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        AmnetServiceLifeCycleListener.access$000(AmnetServiceLifeCycleListener.this);
                    }
                }
            }, 3000L, TimeUnit.MILLISECONDS);
        }
    }

    public boolean isBindedMainProc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e0b9a040", new Object[]{this})).booleanValue() : this.c == 2;
    }

    public boolean isOnCreate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eb469910", new Object[]{this})).booleanValue() : this.b == 1;
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.executeIO(new Runnable() { // from class: com.alipay.mobile.common.amnet.service.AmnetServiceLifeCycleListener.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TransportConfigureManager.getInstance().resetConfig(AmnetEnvHelper.getAppContext());
                    }
                }
            });
        }
    }
}
