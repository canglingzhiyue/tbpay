package com.alipay.mars.comm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.telephony.TelephonyManager;
import com.alipay.bifrost.BifrostEnvUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY;

/* loaded from: classes3.dex */
public class PlatformComm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Context context;
    public static Handler handler;

    /* loaded from: classes3.dex */
    public static class APNInfo {
        public String extraInfo;
        public int netType;
        public int subNetType;
    }

    /* loaded from: classes3.dex */
    public static class Assert {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static void assertTrue(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("86058def", new Object[]{str, new Boolean(z)});
            }
        }

        public static void assertTrue(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74be8db9", new Object[]{new Boolean(z)});
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class ProxyInfo {
        public String password;
        public String proxyHost;
        public int proxyPort;
        public int proxyType;
        public String username;
    }

    /* loaded from: classes3.dex */
    public static class SIMInfo {
        public String ispCode;
        public String ispName;
    }

    /* loaded from: classes3.dex */
    public static class WifiInfo {
        public String bssid;
        public String ssid;
    }

    public static void init(Context context2, Handler handler2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36d8ec1", new Object[]{context2, handler2});
            return;
        }
        context = context2;
        handler = handler2;
        NetworkSignalUtil.InitNetworkSignalUtil(context2);
    }

    /* loaded from: classes3.dex */
    public static class C2Java {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static int getProxyInfo(StringBuffer stringBuffer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("23e2ebea", new Object[]{stringBuffer})).intValue();
            }
            return -1;
        }

        public static int getNetInfo() {
            NetworkInfo activeNetworkInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("727a49af", new Object[0])).intValue();
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) PlatformComm.context.getSystemService("connectivity");
                if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                    return -1;
                }
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 1;
                    }
                    if (type != 2 && type != 3 && type != 4 && type != 5) {
                        return 3;
                    }
                }
                return 2;
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return 3;
            }
        }

        public static ProxyInfo getProxyInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ProxyInfo) ipChange.ipc$dispatch("4e7236e7", new Object[0]);
            }
            ProxyInfo proxyInfo = new ProxyInfo();
            try {
                proxyInfo.proxyHost = System.getProperty("bifrost.proxyHost");
                String property = System.getProperty("bifrost.proxyPort");
                proxyInfo.username = System.getProperty("bifrost.proxyUsername");
                proxyInfo.password = System.getProperty("bifrost.proxyPassword");
                if (proxyInfo.proxyHost == null || proxyInfo.proxyHost.length() <= 0) {
                    proxyInfo.proxyHost = System.getProperty("http.proxyHost");
                    property = System.getProperty("http.proxyPort");
                    proxyInfo.username = null;
                    proxyInfo.password = null;
                }
                if (property != null && property.length() > 0) {
                    proxyInfo.proxyPort = Integer.parseInt(property);
                } else {
                    proxyInfo.proxyPort = -1;
                }
                if (proxyInfo.proxyHost == null || proxyInfo.proxyHost.length() <= 0) {
                    return proxyInfo;
                }
                proxyInfo.proxyType = 1;
                return proxyInfo;
            } catch (Exception e) {
                LogCatUtil.error("bifrost.PlatformComm", e);
                return null;
            }
        }

        public static int getStatisticsNetType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e992cc98", new Object[0])).intValue();
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                if (PlatformComm.context == null) {
                    Assert.assertTrue(false);
                    return 0;
                }
                int netType = NetStatusUtil.getNetType(PlatformComm.context);
                if (netType == -1) {
                    return -1;
                }
                if (NetStatusUtil.is2G(PlatformComm.context)) {
                    return 3;
                }
                if (NetStatusUtil.is3G(PlatformComm.context)) {
                    return 4;
                }
                if (NetStatusUtil.is4G(PlatformComm.context)) {
                    return 5;
                }
                if (NetStatusUtil.isWifi(netType)) {
                    return 1;
                }
                return NetStatusUtil.isWap(netType) ? 2 : 6;
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return -1;
            }
        }

        public static boolean startAlarm(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("77f14afa", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                if (PlatformComm.context == null) {
                    Assert.assertTrue(false);
                    return false;
                }
                return Alarm.start(i, i2, PlatformComm.context);
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return false;
            }
        }

        public static boolean stopAlarm(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3f0e1951", new Object[]{new Integer(i)})).booleanValue();
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                if (PlatformComm.context == null) {
                    Assert.assertTrue(false);
                    return false;
                }
                return Alarm.stop(i, PlatformComm.context);
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return false;
            }
        }

        public static WifiInfo getCurWifiInfo() {
            ConnectivityManager connectivityManager;
            NetworkInfo activeNetworkInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WifiInfo) ipChange.ipc$dispatch("bc2e56e9", new Object[0]);
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                if (PlatformComm.context == null || (connectivityManager = (ConnectivityManager) PlatformComm.context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || 1 != activeNetworkInfo.getType() || !MiscUtils.isAtFrontDesk(PlatformComm.context)) {
                    return null;
                }
                if (((WifiManager) PlatformComm.context.getSystemService("wifi")) == null) {
                }
                return null;
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return null;
            }
        }

        public static SIMInfo getCurSIMInfo() {
            int iSPCode;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SIMInfo) ipChange.ipc$dispatch("179eed93", new Object[0]);
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                if (PlatformComm.context == null || (iSPCode = NetStatusUtil.getISPCode(PlatformComm.context)) == 0) {
                    return null;
                }
                SIMInfo sIMInfo = new SIMInfo();
                sIMInfo.ispCode = "" + iSPCode;
                sIMInfo.ispName = NetStatusUtil.getISPName(PlatformComm.context);
                return sIMInfo;
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return null;
            }
        }

        public static APNInfo getAPNInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (APNInfo) ipChange.ipc$dispatch("44f2d3c7", new Object[0]);
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) PlatformComm.context.getSystemService("connectivity")).getActiveNetworkInfo();
                APNInfo aPNInfo = new APNInfo();
                if (activeNetworkInfo == null) {
                    return null;
                }
                aPNInfo.netType = activeNetworkInfo.getType();
                aPNInfo.subNetType = activeNetworkInfo.getSubtype();
                if (1 != activeNetworkInfo.getType()) {
                    aPNInfo.extraInfo = activeNetworkInfo.getExtraInfo() == null ? "" : activeNetworkInfo.getExtraInfo();
                } else {
                    aPNInfo.extraInfo = getCurWifiInfo().ssid;
                }
                return aPNInfo;
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return null;
            }
        }

        public static int getCurRadioAccessNetworkInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("90bf6de1", new Object[0])).intValue();
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                if (PlatformComm.context == null) {
                    Assert.assertTrue(false);
                    return 0;
                } else if (MiscUtils.isAtFrontDesk(PlatformComm.context)) {
                    return ANDROID_TELEPHONY_TELEPHONYMANAGER_PROXY.proxy_getNetworkType((TelephonyManager) PlatformComm.context.getSystemService("phone"));
                } else {
                    return 0;
                }
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return 0;
            }
        }

        public static long getSignal(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ff1f8043", new Object[]{new Boolean(z)})).longValue();
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                if (PlatformComm.context == null) {
                    Assert.assertTrue(false);
                    return 0L;
                } else if (z) {
                    return NetworkSignalUtil.getWifiSignalStrength();
                } else {
                    return NetworkSignalUtil.getGSMSignalStrength();
                }
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return 0L;
            }
        }

        public static boolean isNetworkConnected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("614c23d0", new Object[0])).booleanValue();
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                if (PlatformComm.context == null) {
                    Assert.assertTrue(false);
                    return false;
                }
                return NetStatusUtil.isNetworkConnected(PlatformComm.context);
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return false;
            }
        }

        public static WakerLock wakeupLock_new() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WakerLock) ipChange.ipc$dispatch("cad63fba", new Object[0]);
            }
            try {
                if (PlatformComm.context == null) {
                    PlatformComm.context = BifrostEnvUtils.getContext();
                }
                if (PlatformComm.context == null) {
                    Assert.assertTrue(false);
                    return null;
                }
                return new WakerLock(PlatformComm.context);
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.PlatformComm", th);
                return null;
            }
        }
    }
}
