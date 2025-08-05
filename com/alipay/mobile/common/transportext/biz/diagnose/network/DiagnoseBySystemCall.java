package com.alipay.mobile.common.transportext.biz.diagnose.network;

import android.text.TextUtils;
import com.alipay.mobile.common.amnet.api.AmnetNetworkDiagnoseListener;
import com.alipay.mobile.common.amnet.api.AmnetStorageListener;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorInfoUtil;
import com.alipay.mobile.common.transport.monitor.DeviceTrafficStateInfo;
import com.alipay.mobile.common.transport.monitor.networkqos.AlipayQosService;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class DiagnoseBySystemCall implements AmnetNetworkDiagnoseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static int f5661a = 1;
    private static long j = 0;
    private static long k = 300000;
    private ScheduledFuture<?> b;
    private List<String> c = new ArrayList(5);
    private boolean d = false;
    private DeviceTrafficStateInfo e = null;
    private DiagnoseResultState f = null;
    private boolean g = false;
    private boolean h = false;
    private String i = "";

    /* loaded from: classes3.dex */
    public interface DiagnoseResultState {
        void stateNotify(boolean z);
    }

    public static /* synthetic */ void access$000(DiagnoseBySystemCall diagnoseBySystemCall) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7368db", new Object[]{diagnoseBySystemCall});
        } else {
            diagnoseBySystemCall.c();
        }
    }

    private DiagnoseBySystemCall() {
    }

    public static void diagnoseNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa9a3ae", new Object[0]);
        } else {
            diagnoseNotify(null);
        }
    }

    public static void diagnoseNotify(DiagnoseResultState diagnoseResultState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e7f732", new Object[]{diagnoseResultState});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - j < k) {
            LogCatUtil.info("DIAGNOSE-SYS", "curTime: " + currentTimeMillis + ",lastDiagnoseTime: " + j + ",ignore this diagnose");
            return;
        }
        synchronized (DiagnoseBySystemCall.class) {
            if (f5661a != 1) {
                if (diagnoseResultState != null) {
                    diagnoseResultState.stateNotify(false);
                }
                LogCatUtil.debug("DIAGNOSE-SYS", "diagnoseNotify,currentState is busy");
                return;
            }
            f5661a = 2;
            j = currentTimeMillis;
            DiagnoseBySystemCall diagnoseBySystemCall = new DiagnoseBySystemCall();
            diagnoseBySystemCall.a(diagnoseResultState);
            diagnoseBySystemCall.a();
        }
    }

    @Override // com.alipay.mobile.common.amnet.api.AmnetNetworkDiagnoseListener, com.alipay.mobile.common.transportext.amnet.NetTest
    public void report(boolean z, boolean z2, boolean z3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10057843", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(z);
        sb.append(";");
        sb.append(z2);
        sb.append(";");
        sb.append(z3);
        sb.append(";");
        if (str != null) {
            str2 = str;
        }
        sb.append(str2);
        String sb2 = sb.toString();
        if (1 == f5661a) {
            LogCatUtil.warn("DIAGNOSE-SYS", "the diagnose already stop. this result ignore. " + sb2);
            return;
        }
        LogCatUtil.info("DIAGNOSE-SYS", sb2);
        if (!TextUtils.isEmpty(str)) {
            this.c.add(str);
            if (str.contains(Configuration.LOG_TYPE_OUT_DIAGO)) {
                a(z2, str);
            }
        }
        if (!z3) {
            return;
        }
        this.b.cancel(true);
        c();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        final NetworkDiagnose networkDiagnose = new NetworkDiagnose();
        networkDiagnose.register(AmnetStorageListener.getInstance());
        networkDiagnose.register(this);
        networkDiagnose.register(System.nanoTime(), 2);
        this.b = NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseBySystemCall.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LogCatUtil.info("DIAGNOSE-SYS", "200 seconds timeout, set currentState idle.");
                DiagnoseBySystemCall.access$000(DiagnoseBySystemCall.this);
            }
        }, 200L, TimeUnit.SECONDS);
        this.e = AlipayQosService.getInstance().startTrafficMonitor();
        LogCatUtil.info("DIAGNOSE-SYS", "system networkDiagnose launch");
        NetworkAsyncTaskExecutor.executeLazy(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.diagnose.network.DiagnoseBySystemCall.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LogCatUtil.info("DIAGNOSE-SYS", "system start networkDiagnose launch");
                try {
                    networkDiagnose.launch();
                } catch (Throwable th) {
                    try {
                        LogCatUtil.warn("DIAGNOSE-SYS", "system diagnoseNotify throwable. " + th.toString());
                    } finally {
                        LogCatUtil.info("DIAGNOSE-SYS", "system networkDiagnose launch finish");
                    }
                }
            }
        });
    }

    private void a(DiagnoseResultState diagnoseResultState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c868cab8", new Object[]{this, diagnoseResultState});
        } else {
            this.f = diagnoseResultState;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f = null;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.d = true;
            d();
            try {
                String trafficLog = TrafficLogHelper.getTrafficLog(this.e);
                if (trafficLog != null) {
                    this.c.add(trafficLog);
                }
                UploadManager.writeLog(this.c, "0.3", 2);
            } catch (Throwable th) {
                try {
                    LogCatUtil.warn("DIAGNOSE-SYS", "writeLog error. " + th.toString());
                    DiagnoseResultState diagnoseResultState = this.f;
                    if (diagnoseResultState != null) {
                        diagnoseResultState.stateNotify(true);
                        b();
                    }
                    f5661a = 1;
                } finally {
                    DiagnoseResultState diagnoseResultState2 = this.f;
                    if (diagnoseResultState2 != null) {
                        diagnoseResultState2.stateNotify(true);
                        b();
                    }
                    f5661a = 1;
                }
            }
        }
    }

    private void a(boolean z, String str) {
        List<SpeedTestLinkData> convertLinkData;
        SpeedTestLinkData speedTestLinkData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.g |= z;
            this.h = true;
            try {
                int indexOf = str.indexOf("out_diago:");
                if (indexOf < 0) {
                    return;
                }
                String substring = str.substring(indexOf + 10);
                if (!TextUtils.isEmpty(substring) && !z && (convertLinkData = SpeedTestManager.convertLinkData(substring)) != null && !convertLinkData.isEmpty() && (speedTestLinkData = convertLinkData.get(0)) != null) {
                    this.i += speedTestLinkData.describe + ";" + speedTestLinkData.errCode + ";";
                }
            } catch (Throwable th) {
                LogCatUtil.warn("DIAGNOSE-SYS", "outDiag " + th.toString());
            }
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.h || this.g) {
        } else {
            LogCatUtil.warn("DIAGNOSE-SYS", "notifyOutDiagResult, the describe is " + this.i);
            try {
                MonitorInfoUtil.kickOnNetworkDiagnose(true, this.i);
            } catch (Throwable th) {
                LogCatUtil.error("DIAGNOSE-SYS", th);
            }
        }
    }
}
