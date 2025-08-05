package com.alipay.mobile.common.transportext.biz.mmtp;

import com.alipay.mobile.common.ipc.api.push.BindEventListener;
import com.alipay.mobile.common.ipc.api.push.BindPushServiceManager;
import com.alipay.mobile.common.transport.strategy.ExtTransportTunnelWatchdog;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.biz.appevent.AmnetEventNotify;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BindEventListenerManger implements BindEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static BindEventListenerManger f5672a;
    private boolean b;
    private Object c = new Object();
    private Object d = new Object();

    public static final BindEventListenerManger getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BindEventListenerManger) ipChange.ipc$dispatch("d35f8016", new Object[0]);
        }
        if (f5672a == null) {
            synchronized (BindEventListenerManger.class) {
                if (f5672a == null) {
                    f5672a = new BindEventListenerManger();
                }
            }
        }
        return f5672a;
    }

    private BindEventListenerManger() {
        this.b = false;
        this.b = BindPushServiceManager.BindPushServiceFactory.getInstance().isBindedService();
    }

    @Override // com.alipay.mobile.common.ipc.api.push.BindEventListener
    public void binded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52cf6c23", new Object[]{this});
            return;
        }
        this.b = true;
        synchronized (this.c) {
            try {
                this.c.notifyAll();
            } catch (Exception e) {
                LogCatUtil.error("BindEventListenerManger", e);
            }
        }
        AmnetEventNotify.onSyncConnState();
    }

    @Override // com.alipay.mobile.common.ipc.api.push.BindEventListener
    public void unBinde() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("444b31b6", new Object[]{this});
            return;
        }
        this.b = false;
        synchronized (this.d) {
            try {
                this.d.notifyAll();
            } catch (Exception e) {
                LogCatUtil.error("BindEventListenerManger", e);
            }
        }
        LogCatUtil.debug("EXT_Watchdog", "Unbind event captured, ticking watchdog");
        ExtTransportTunnelWatchdog.getInstance().bindFailureTick();
    }

    public void waitToBinded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d5d1713", new Object[]{this});
        } else if (this.b) {
        } else {
            synchronized (this.c) {
                try {
                    this.c.wait(3000L);
                } catch (InterruptedException e) {
                    LogCatUtil.error("BindEventListenerManger", e);
                }
            }
        }
    }

    public void waitToUnBinded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e55a8c", new Object[]{this});
        } else if (!this.b) {
        } else {
            synchronized (this.d) {
                try {
                    this.d.wait(3000L);
                } catch (InterruptedException e) {
                    LogCatUtil.error("BindEventListenerManger", e);
                }
            }
        }
    }

    public boolean isBinded() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d43a68f1", new Object[]{this})).booleanValue() : this.b;
    }
}
