package com.alipay.mobile.common.transportext.biz.diagnose;

import android.content.Context;
import com.alipay.mobile.common.amnet.api.AmnetStorageListener;
import com.alipay.mobile.common.transport.ext.diagnose.NetworkDiagnoseListener;
import com.alipay.mobile.common.transport.ext.diagnose.NetworkDiagnoseService;
import com.alipay.mobile.common.transport.monitor.DeviceTrafficStateInfo;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkDiagnose;
import com.alipay.mobile.common.transportext.biz.diagnose.network.TrafficLogHelper;
import com.alipay.mobile.common.transportext.biz.diagnose.network.UploadManager;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class NetworkDiagnoseServiceImpl implements NetworkDiagnoseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DiagnoseStateListener b;
    private Runnable d;
    private ScheduledFuture<?> h;
    private Future<?> i;

    /* renamed from: a  reason: collision with root package name */
    private List<NetworkDiagnoseListener> f5660a = new ArrayList(1);
    private int c = 1;
    private String e = "开始连接服务器";
    private volatile int f = 0;
    private int g = 1;
    private DeviceTrafficStateInfo j = null;

    /* loaded from: classes3.dex */
    public class ZTimerTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ZTimerTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (!NetworkUtils.isNetworkAvailable(ExtTransportEnv.getAppContext())) {
                NetworkDiagnoseServiceImpl.access$002(NetworkDiagnoseServiceImpl.this, 5);
            }
            if (NetworkDiagnoseServiceImpl.access$000(NetworkDiagnoseServiceImpl.this) == 1 && NetworkDiagnoseServiceImpl.access$100(NetworkDiagnoseServiceImpl.this) < 40) {
                NetworkDiagnoseServiceImpl.access$108(NetworkDiagnoseServiceImpl.this);
                NetworkDiagnoseServiceImpl.this.notifyUpdateProgress();
                if (NetworkDiagnoseServiceImpl.access$100(NetworkDiagnoseServiceImpl.this) != 40) {
                    return;
                }
                NetworkDiagnoseServiceImpl.this.setProgressToStartTraceRouting();
            } else if (NetworkDiagnoseServiceImpl.access$000(NetworkDiagnoseServiceImpl.this) == 2 && NetworkDiagnoseServiceImpl.access$100(NetworkDiagnoseServiceImpl.this) < 95) {
                NetworkDiagnoseServiceImpl.access$108(NetworkDiagnoseServiceImpl.this);
                NetworkDiagnoseServiceImpl.this.notifyUpdateProgress();
                if (NetworkDiagnoseServiceImpl.access$100(NetworkDiagnoseServiceImpl.this) != 95) {
                    return;
                }
                NetworkDiagnoseServiceImpl.this.setProgressToFail();
            } else if (NetworkDiagnoseServiceImpl.access$000(NetworkDiagnoseServiceImpl.this) == 5) {
                NetworkDiagnoseServiceImpl.access$102(NetworkDiagnoseServiceImpl.this, 100);
                NetworkDiagnoseServiceImpl.this.notifyUpdateProgress();
                NetworkDiagnoseServiceImpl.this.cancel();
            } else if (NetworkDiagnoseServiceImpl.access$000(NetworkDiagnoseServiceImpl.this) != 3) {
            } else {
                NetworkDiagnoseServiceImpl.access$108(NetworkDiagnoseServiceImpl.this);
                NetworkDiagnoseServiceImpl.this.notifyUpdateProgress();
            }
        }
    }

    public static /* synthetic */ int access$000(NetworkDiagnoseServiceImpl networkDiagnoseServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("29635ac8", new Object[]{networkDiagnoseServiceImpl})).intValue() : networkDiagnoseServiceImpl.g;
    }

    public static /* synthetic */ int access$002(NetworkDiagnoseServiceImpl networkDiagnoseServiceImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72e14dc3", new Object[]{networkDiagnoseServiceImpl, new Integer(i)})).intValue();
        }
        networkDiagnoseServiceImpl.g = i;
        return i;
    }

    public static /* synthetic */ int access$100(NetworkDiagnoseServiceImpl networkDiagnoseServiceImpl) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6f049d67", new Object[]{networkDiagnoseServiceImpl})).intValue() : networkDiagnoseServiceImpl.f;
    }

    public static /* synthetic */ int access$102(NetworkDiagnoseServiceImpl networkDiagnoseServiceImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1685f04", new Object[]{networkDiagnoseServiceImpl, new Integer(i)})).intValue();
        }
        networkDiagnoseServiceImpl.f = i;
        return i;
    }

    public static /* synthetic */ int access$108(NetworkDiagnoseServiceImpl networkDiagnoseServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeff905f", new Object[]{networkDiagnoseServiceImpl})).intValue();
        }
        int i = networkDiagnoseServiceImpl.f;
        networkDiagnoseServiceImpl.f = i + 1;
        return i;
    }

    @Override // com.alipay.mobile.common.transport.ext.diagnose.NetworkDiagnoseService
    public void addDiagnoseListener(NetworkDiagnoseListener networkDiagnoseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c72636", new Object[]{this, networkDiagnoseListener});
        } else {
            this.f5660a.add(networkDiagnoseListener);
        }
    }

    @Override // com.alipay.mobile.common.transport.ext.diagnose.NetworkDiagnoseService
    public void removeDiagnoseListener(NetworkDiagnoseListener networkDiagnoseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f927cd33", new Object[]{this, networkDiagnoseListener});
        } else {
            this.f5660a.remove(networkDiagnoseListener);
        }
    }

    @Override // com.alipay.mobile.common.transport.ext.diagnose.NetworkDiagnoseService
    public void startDiagnose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d77e18c7", new Object[]{this});
            return;
        }
        synchronized (this) {
            if (this.c != 1) {
                return;
            }
            this.c = 2;
            a();
            this.d = new ZTimerTask();
            this.h = NetworkAsyncTaskExecutor.scheduleAtFixedRate(this.d, 0L, 1200L, TimeUnit.MILLISECONDS);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = new DiagnoseStateListener(this);
        final NetworkDiagnose networkDiagnose = new NetworkDiagnose();
        networkDiagnose.register(AmnetStorageListener.getInstance());
        networkDiagnose.register(this.b);
        networkDiagnose.register(System.nanoTime(), 1);
        this.j = AlipayQosService.getInstance().startTrafficMonitor();
        LogCatUtil.info("NetDiag", "submit networkDiagnose launch");
        this.i = NetworkAsyncTaskExecutor.submitLazy(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.diagnose.NetworkDiagnoseServiceImpl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LogCatUtil.info("NetDiag", "start networkDiagnose launch");
                try {
                    networkDiagnose.launch();
                } finally {
                    LogCatUtil.info("NetDiag", "networkDiagnose launch finish");
                }
            }
        });
    }

    @Override // com.alipay.mobile.common.transport.ext.diagnose.NetworkDiagnoseService
    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        c();
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = null;
        this.e = "开始连接服务器";
        this.f = 0;
        this.g = 1;
        this.c = 1;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.d != null) {
            this.d = null;
        }
        try {
            if (this.h != null) {
                this.h.cancel(true);
                this.h = null;
            }
        } catch (Exception e) {
            LogCatUtil.error("NetDiag", "scheduledFuture cancel", e);
        }
        try {
            if (this.i == null) {
                return;
            }
            this.i.cancel(true);
            this.i = null;
        } catch (Exception e2) {
            LogCatUtil.error("NetDiag", "networkDiagnoseFuture cancel", e2);
        }
    }

    public void notifyUpdateProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("721482c6", new Object[]{this});
        } else if (this.c != 1) {
            for (NetworkDiagnoseListener networkDiagnoseListener : this.f5660a) {
                networkDiagnoseListener.updateProgress(this.e, this.f, this.g);
            }
            int i = this.g;
            if (i == 5 || i == 4) {
                if (this.g == 5) {
                    writeLog();
                }
                cancel();
            } else if (i == 3) {
                writeLog();
            }
            LogCatUtil.info("NetDiag", "notifyUpdateProgress  state=" + this.g);
        }
    }

    @Override // com.alipay.mobile.common.transport.ext.diagnose.NetworkDiagnoseService
    public boolean isCanDiagnose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0c690af", new Object[]{this})).booleanValue();
        }
        Context appContext = ExtTransportEnv.getAppContext();
        return appContext != null && NetworkUtils.isNetworkAvailable(appContext);
    }

    public boolean isStateRunning() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8a396ec3", new Object[]{this})).booleanValue() : this.c == 2;
    }

    public synchronized boolean setProgressToStartTraceRouting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf348ee4", new Object[]{this})).booleanValue();
        } else if (this.g != 1 || this.f > 40) {
            return false;
        } else {
            this.g = 2;
            this.e = "正在检查路由信息";
            this.f = 41;
            return true;
        }
    }

    public synchronized boolean setProgressToStartLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed26b7b7", new Object[]{this})).booleanValue();
        } else if (this.g != 2 || this.f > 95) {
            return false;
        } else {
            this.g = 3;
            this.e = "正在上传报告";
            this.f = 96;
            return true;
        }
    }

    public synchronized boolean setProgressToFail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f4dd253", new Object[]{this})).booleanValue();
        } else if (this.g == 4 || this.f >= 100) {
            return false;
        } else {
            this.g = 5;
            this.e = ResultCode.MSG_FAILED;
            this.f = 100;
            return true;
        }
    }

    private synchronized boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        this.g = 4;
        this.e = ResultCode.MSG_SUCCESS;
        this.f = 100;
        return true;
    }

    public void writeLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e85cec", new Object[]{this});
            return;
        }
        List<String> logStrList = this.b.getLogStrList();
        String trafficLog = TrafficLogHelper.getTrafficLog(this.j);
        if (trafficLog != null) {
            logStrList.add(trafficLog);
        }
        UploadManager.writeLog(logStrList, "0.2", 1);
        if (this.g != 3 || !d()) {
            return;
        }
        notifyUpdateProgress();
    }
}
