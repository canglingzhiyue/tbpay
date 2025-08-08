package com.alipay.mobile.common.transportext.biz.diagnose.network;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Link;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransportEnv;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class NetworkCheck {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_IDLE = 1;
    public static final int STATE_RUNNING = 2;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5665a = true;
    private static boolean b = true;
    private static boolean c = false;
    public static int currentState = 1;
    private static int d;
    private boolean e = false;
    private boolean f = false;
    private int g = 10;
    private boolean h = false;

    public static boolean isFakeWifi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ba0a9df", new Object[0])).booleanValue();
        }
        if (f5665a) {
            LogCatUtil.info("DIAGNOSE-NETWORKCHECK", "first time to call isFakeWifi");
            networkStateNotify(false);
        }
        return c;
    }

    public static boolean isNetworkAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f701db90", new Object[0])).booleanValue();
        }
        if (f5665a) {
            LogCatUtil.info("DIAGNOSE-NETWORKCHECK", "first time to call isNetworkAvailable");
            networkStateNotify(false);
        }
        return b;
    }

    public static int getNetType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f8f4e3b", new Object[0])).intValue();
        }
        Context appContext = ExtTransportEnv.getAppContext();
        if (appContext == null) {
            return 0;
        }
        int networkType = NetworkUtils.getNetworkType(appContext);
        d = networkType;
        return networkType;
    }

    public static void networkStateNotify(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("465ede81", new Object[]{new Boolean(z)});
            return;
        }
        synchronized (NetworkCheck.class) {
            LogCatUtil.info("DIAGNOSE-NETWORKCHECK", "networkStateNotify. begin to check network by Link. old:" + b + ". new:" + z + ". first:" + f5665a + ". netType:" + d);
            if (!f5665a && (b == z || currentState != 1)) {
                return;
            }
            f5665a = false;
            if (z) {
                b = z;
            }
            currentState = 2;
            NetworkCheck networkCheck = new NetworkCheck();
            networkCheck.h = true;
            NetworkAsyncTaskExecutor.executeLazy(new Runnable() { // from class: com.alipay.mobile.common.transportext.biz.diagnose.network.NetworkCheck.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        LogCatUtil.info("DIAGNOSE-NETWORKCHECK", "[networkStateNotify]Begin to detect the network.");
                        NetworkCheck.this.checkNetwork();
                    } catch (Throwable th) {
                        try {
                            LogCatUtil.warn("DIAGNOSE-NETWORKCHECK", "networkStateNotify throwable. " + th.toString());
                        } finally {
                            NetworkCheck.currentState = 1;
                            LogCatUtil.info("DIAGNOSE-NETWORKCHECK", "networkStateNotify. finish");
                        }
                    }
                }
            });
        }
    }

    public static void initNetworkCheck(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f40eecb7", new Object[]{context});
        } else if (!MiscUtils.isInAlipayClient(TransportEnvUtil.getContext())) {
        } else {
            LogCatUtil.info("DIAGNOSE-NETWORKCHECK", "[initNetworkCheck] begin.");
            if (NetworkConnectListener.hasInstance()) {
                return;
            }
            try {
                NetworkConnectListener.instance(context).register();
                d = getNetType();
            } catch (Throwable th) {
                LogCatUtil.warn("DIAGNOSE-NETWORKCHECK", "[initNetworkCheck] " + th);
            }
        }
    }

    public void checkNetwork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca3e58d", new Object[]{this});
        } else if (MiscUtils.isInAlipayClient(ExtTransportEnv.getAppContext())) {
            SpeedTestManager.firstTime = false;
            f5665a = false;
            try {
                d = getNetType();
                if (d == 0) {
                    SpeedTestManager.netErrCode = -2;
                    b = false;
                    c = false;
                    LogCatUtil.warn("DIAGNOSE-NETWORKCHECK", "It is no net now.");
                    return;
                }
                Configuration.DetectInf detectInf = new Configuration.DetectInf();
                detectInf.domain = "www.taobao.com";
                detectInf.protocol = 0;
                detectInf.request = "HEAD / HTTP/1.1\r\nHost: www.taobao.com\r\nContent-Length: 0\r\n\r\n";
                detectInf.response = "HTTP/1.1 200 ";
                detectInf.waiting = 30;
                detectInf.trying = 1;
                SpeedTestManager speedTestManager = new SpeedTestManager();
                Link.DftNetTest dftNetTest = new Link.DftNetTest();
                speedTestManager.register(dftNetTest);
                speedTestManager.diagnose(detectInf);
                String report = dftNetTest.getReport();
                if (report == null) {
                    SpeedTestManager.netErrCode = 10;
                    b = false;
                    c = false;
                    LogCatUtil.warn("DIAGNOSE-NETWORKCHECK", "network change. network is unavailable. the diagnose result is null.");
                    return;
                }
                List<SpeedTestLinkData> convertLinkData = SpeedTestManager.convertLinkData(report);
                if (convertLinkData != null && convertLinkData.size() != 0) {
                    boolean z = false;
                    for (SpeedTestLinkData speedTestLinkData : convertLinkData) {
                        if (speedTestLinkData.result == null || !speedTestLinkData.result.equals("y")) {
                            this.g = speedTestLinkData.errCode;
                            if (speedTestLinkData.describe != null && speedTestLinkData.describe.contains("302 redirect")) {
                                this.e = true;
                            } else if (2 == speedTestLinkData.errCode || 3 == speedTestLinkData.errCode) {
                                this.f = true;
                            }
                        } else {
                            z = true;
                        }
                    }
                    if (z) {
                        SpeedTestManager.netErrCode = 0;
                        b = true;
                        c = false;
                    } else {
                        if (3 == d && (this.e || this.f)) {
                            SpeedTestManager.netErrCode = -1;
                            c = true;
                        } else {
                            SpeedTestManager.netErrCode = this.g;
                            c = false;
                        }
                        b = false;
                    }
                    LogCatUtil.info("DIAGNOSE-NETWORKCHECK", "network change and the errCode is " + SpeedTestManager.netErrCode);
                    a(report);
                    return;
                }
                SpeedTestManager.netErrCode = 10;
                b = false;
                c = false;
                LogCatUtil.warn("DIAGNOSE-NETWORKCHECK", "network change. network is unavailable. the return list is null.");
            } catch (Throwable th) {
                LogCatUtil.warn("DIAGNOSE-NETWORKCHECK", "[checkNetwork] " + th);
            }
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!this.h || StringUtils.isEmpty(str)) {
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add("out_diago:" + str);
            UploadManager.writeLog(arrayList, "0.4", 2);
        }
    }
}
