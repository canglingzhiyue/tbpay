package com.alipay.mobile.common.transportext.biz.mmtp;

import com.alipay.mobile.common.transport.monitor.SignalStateHelper;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class LinkStateListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5673a = "LinkStateListener";
    public static final long changeInterval = 3600000;
    private static LinkStateListener j;
    private boolean b;
    private ScheduledFuture<?> c;
    private int d = 1;
    private int e = 2;
    private int g = 15;
    private int f = this.d;
    private int h = 0;
    private long i = System.currentTimeMillis();

    public static /* synthetic */ void access$000(LinkStateListener linkStateListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93fd6b09", new Object[]{linkStateListener});
        } else {
            linkStateListener.b();
        }
    }

    public static LinkStateListener getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkStateListener) ipChange.ipc$dispatch("86ee9156", new Object[0]);
        }
        LinkStateListener linkStateListener = j;
        if (linkStateListener != null) {
            return linkStateListener;
        }
        synchronized (LinkStateListener.class) {
            if (j == null) {
                j = new LinkStateListener();
            }
        }
        return j;
    }

    private LinkStateListener() {
        this.b = false;
        this.b = false;
    }

    public void change(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8d39ac", new Object[]{this, new Integer(i)});
            return;
        }
        String str = f5673a;
        LogCatUtil.debug(str, "--change-->state = " + i);
        if (i == 4 || !MiscUtils.isAtFrontDesk(ExtTransportEnv.getAppContext())) {
            return;
        }
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = false;
        synchronized (this) {
            if (this.f == this.e) {
                LogCatUtil.debug(f5673a, "schedule task is busy...");
                return;
            }
            this.f = this.e;
            LogCatUtil.debug(f5673a, "schedule task start...");
            this.c = NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.LinkStateListener.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        LinkStateListener.access$000(LinkStateListener.this);
                    }
                }
            }, 30L, TimeUnit.SECONDS);
        }
    }

    public void notifyInitOk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("febd35bc", new Object[]{this});
            return;
        }
        LogCatUtil.debug(f5673a, "--notifyInitOk--");
        this.b = true;
        ScheduledFuture<?> scheduledFuture = this.c;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
        this.f = this.d;
        LogCatUtil.debug(f5673a, "--cancle diagnose task--");
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b) {
            LogCatUtil.debug(f5673a, "initOk,no need to diagnose");
            ScheduledFuture<?> scheduledFuture = this.c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                LogCatUtil.debug(f5673a, "--cancle diagnose task--");
            }
            this.f = this.d;
        } else {
            try {
                if (this.h > this.g) {
                    if (this.i + 3600000 >= System.currentTimeMillis()) {
                        LogCatUtil.debug(f5673a, "diagnoseNum is out " + this.g);
                        return;
                    }
                    this.h = 0;
                    this.i = System.currentTimeMillis();
                }
                LogCatUtil.debug(f5673a, "init has not success,start diagnose");
                NetworkAsyncTaskExecutor.executeLazy(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.mmtp.LinkStateListener.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        SignalStateHelper.getInstance().reportNetStateInfo();
                        AlipayQosService.getInstance().getQosLevel();
                    }
                });
            } catch (Throwable th) {
                try {
                    LogCatUtil.error(f5673a, "checkInitState", th);
                } finally {
                    this.f = this.d;
                    this.h++;
                }
            }
        }
    }
}
