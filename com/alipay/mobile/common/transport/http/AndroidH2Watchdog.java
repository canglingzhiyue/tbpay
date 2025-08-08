package com.alipay.mobile.common.transport.http;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.NetworkServiceTracer;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AndroidH2Watchdog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AndroidH2Watchdog f5546a;
    private int b = 0;
    private int c = 0;
    private final int d = 3;

    public static AndroidH2Watchdog getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidH2Watchdog) ipChange.ipc$dispatch("aa9c0590", new Object[0]);
        }
        AndroidH2Watchdog androidH2Watchdog = f5546a;
        if (androidH2Watchdog != null) {
            return androidH2Watchdog;
        }
        synchronized (AndroidH2Watchdog.class) {
            if (f5546a == null) {
                f5546a = new AndroidH2Watchdog();
            }
        }
        return f5546a;
    }

    private AndroidH2Watchdog() {
    }

    public void resetFailCount(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a13e53", new Object[]{this, new Byte(b)});
            return;
        }
        LogCatUtil.printInfo("AndroidH2Watchdog", "resetFailCount,bizType:" + String.valueOf((int) b));
        if (1 == b) {
            a();
        } else {
            b();
        }
    }

    public synchronized void reportH2Error(byte b, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4037a1f6", new Object[]{this, new Byte(b), str, str2, th});
        } else if (a(th)) {
            a(b, str2, true);
        } else if (!NetworkUtils.isNetworkAvailable(TransportEnvUtil.getContext())) {
        } else {
            if (b == 1) {
                this.b++;
            } else {
                this.c++;
            }
            LogCatUtil.debug("AndroidH2Watchdog", "reportH2Error bizType:" + ((int) b) + ",errcode:" + str + ",errmsg:" + str2 + ",rpcFailureCount:" + this.b + ",rsrcFailureCount:" + this.c);
            a(b, str2, false);
        }
    }

    private synchronized void a(byte b, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8d0076", new Object[]{this, new Byte(b), str, new Boolean(z)});
            return;
        }
        TransportConfigureManager transportConfigureManager = TransportConfigureManager.getInstance();
        if (!StringUtils.equals(transportConfigureManager.getStringValue(TransportConfigureItem.H2_DOWNGRADE_SWITCH), "T")) {
            LogCatUtil.debug("AndroidH2Watchdog", "h2DownSwitch off");
        } else if (b == 1) {
            b(str, transportConfigureManager, z);
        } else {
            a(str, transportConfigureManager, z);
        }
    }

    private void a(String str, TransportConfigureManager transportConfigureManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4f4799c", new Object[]{this, str, transportConfigureManager, new Boolean(z)});
        } else if (!MiscUtils.grayscaleUtdidForABTest(TransportConfigureItem.GO_URLCONNECTION_SWITCH)) {
            LogCatUtil.debug("AndroidH2Watchdog", "rsrcGoH2Switch is off");
        } else {
            if (z) {
                LogCatUtil.debug("AndroidH2Watchdog", "rsrc fatal error,downgrade right now");
                this.c = 4;
            }
            if (this.c <= 3) {
                return;
            }
            synchronized (AndroidH2Watchdog.class) {
                String stringValue = transportConfigureManager.getStringValue(TransportConfigureItem.GO_URLCONNECTION_SWITCH);
                LogCatUtil.debug("AndroidH2Watchdog", "RSRC tunnel downgrade to http1.1,original RSRC H2 SWTICH:" + stringValue);
                transportConfigureManager.setValue(TransportConfigureItem.GO_URLCONNECTION_SWITCH, "0");
                transportConfigureManager.setValue(TransportConfigureItem.VERSION, String.valueOf(transportConfigureManager.getLatestVersion() + 1));
                b();
                a(NetworkServiceTracer.REPORT_SUB_NAME_RSRC, str);
            }
        }
    }

    private void b(String str, TransportConfigureManager transportConfigureManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba9fd61d", new Object[]{this, str, transportConfigureManager, new Boolean(z)});
        } else if (!MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), transportConfigureManager.getStringValue(TransportConfigureItem.RPC_GO_H2_SWITCH))) {
            LogCatUtil.debug("AndroidH2Watchdog", "rpcGoH2Switch is off");
        } else {
            if (z) {
                LogCatUtil.debug("AndroidH2Watchdog", "rpc fatal error,downgrade right now");
                this.b = 4;
            }
            if (this.b <= 3) {
                return;
            }
            synchronized (AndroidH2Watchdog.class) {
                String stringValue = transportConfigureManager.getStringValue(TransportConfigureItem.RPC_GO_H2_SWITCH);
                LogCatUtil.debug("AndroidH2Watchdog", "RPC tunnel downgrade to http1.1, original RPC H2 SWTICH:" + stringValue);
                transportConfigureManager.setValue(TransportConfigureItem.RPC_GO_H2_SWITCH, "0");
                transportConfigureManager.setValue(TransportConfigureItem.VERSION, String.valueOf(transportConfigureManager.getLatestVersion() + 1));
                a();
                a(NetworkServiceTracer.REPORT_SUB_NAME_RPC, str);
            }
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = 0;
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.c = 0;
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
        monitorLoggerModel.setSubType("H2");
        monitorLoggerModel.setParam1(NetworkServiceTracer.REPORT_SUB_NAME_RPC);
        monitorLoggerModel.setParam2("downgrade");
        monitorLoggerModel.getExtPramas().put("bizType", str);
        monitorLoggerModel.getExtPramas().put("errmsg", str2);
        MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
        LogCatUtil.debug("AndroidH2Watchdog", "Dumping perfLog:" + monitorLoggerModel.toString());
    }

    private boolean a(Throwable th) {
        Throwable rootCause;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb9ad891", new Object[]{this, th})).booleanValue();
        }
        try {
            rootCause = MiscUtils.getRootCause(th);
        } catch (Throwable th2) {
            LogCatUtil.error("AndroidH2Watchdog", "isFatalError ex:" + th2);
        }
        if (rootCause == null) {
            return false;
        }
        String th3 = rootCause.toString();
        if (StringUtils.isEmpty(th3)) {
            return false;
        }
        return th3.contains("stream was reset");
    }
}
