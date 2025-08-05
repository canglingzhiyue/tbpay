package com.alipay.mars.comm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.alibaba.security.ccrc.service.build.C1238p;
import com.alipay.bifrost.BifrostEnvUtils;
import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NetStatusUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CMNET = 6;
    public static final int CMWAP = 5;
    public static final int CTNET = 8;
    public static final int CTWAP = 7;
    public static final int LTE = 10;
    public static final int MOBILE = 9;
    public static final int NETTYPE_NOT_WIFI = 0;
    public static final int NETTYPE_WIFI = 1;
    public static final int NET_3G = 4;
    public static final int NON_NETWORK = -1;
    public static final int NO_SIM_OPERATOR = 0;
    public static final int POLICY_NONE = 0;
    public static final int POLICY_REJECT_METERED_BACKGROUND = 1;
    public static final int TBACKGROUND_DATA_LIMITED = 2;
    public static final int TBACKGROUND_NOT_LIMITED = 0;
    public static final int TBACKGROUND_PROCESS_LIMITED = 1;
    public static final int TBACKGROUND_WIFI_LIMITED = 3;
    public static final int UNINET = 1;
    public static final int UNIWAP = 2;
    public static final int UNKNOW_TYPE = 999;
    public static final int WAP_3G = 3;
    public static final int WIFI = 0;

    /* renamed from: a  reason: collision with root package name */
    private static int f5323a;

    /* loaded from: classes3.dex */
    public static class StrengthListener extends PhoneStateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(StrengthListener strengthListener, String str, Object... objArr) {
            if (str.hashCode() == -2058329889) {
                super.onSignalStrengthsChanged((SignalStrength) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("855060df", new Object[]{this, signalStrength});
                return;
            }
            super.onSignalStrengthsChanged(signalStrength);
            if (!signalStrength.isGsm()) {
                NetStatusUtil.a(signalStrength.getCdmaDbm());
            } else {
                NetStatusUtil.a(signalStrength.getGsmSignalStrength());
            }
        }
    }

    public static int getStrength(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64669ebd", new Object[]{context})).intValue();
        }
        return 0;
    }

    public static boolean isLimited(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("94d28c50", new Object[]{new Integer(i)})).booleanValue() : i == 2 || i == 1 || i == 3;
    }

    public static boolean isWap(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e75a3b84", new Object[]{new Integer(i)})).booleanValue() : i == 2 || i == 5 || i == 7 || i == 3;
    }

    public static boolean isWifi(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("96ec3761", new Object[]{new Integer(i)})).booleanValue() : i == 0;
    }

    public static /* synthetic */ int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        f5323a = i;
        return i;
    }

    public static void dumpNetStatus(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eddb0aa6", new Object[]{context});
            return;
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.NetStatusUtil", "dumpNetStatus error", th);
                return;
            }
        }
        LogCatUtil.info("bifrost.NetStatusUtil", ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().toString());
    }

    public static boolean isConnected(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87349c86", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.NetStatusUtil", th);
                return false;
            }
        }
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().isConnected();
    }

    public static String getNetTypeString(Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f114dfd1", new Object[]{context});
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.NetStatusUtil", "getNetTypeString error", th);
                return "NON_NETWORK";
            }
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) ? "NON_NETWORK" : activeNetworkInfo.getType() == 1 ? "WIFI" : activeNetworkInfo.getExtraInfo() != null ? activeNetworkInfo.getExtraInfo() : "MOBILE";
    }

    public static int getNetWorkType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b14328e2", new Object[]{context})).intValue();
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.NetStatusUtil", "getNetWorkType error", th);
                return -1;
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    public static int getNetType(Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e725e73", new Object[]{context})).intValue();
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.NetStatusUtil", "getNetType", th);
                return -1;
            }
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return -1;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 0;
        }
        if (activeNetworkInfo.getExtraInfo() == null) {
            return 9;
        }
        if (activeNetworkInfo.getExtraInfo().equalsIgnoreCase(ConnectionUtil.TYPE_UNINET)) {
            return 1;
        }
        if (activeNetworkInfo.getExtraInfo().equalsIgnoreCase(ConnectionUtil.TYPE_UNIWAP)) {
            return 2;
        }
        if (activeNetworkInfo.getExtraInfo().equalsIgnoreCase(ConnectionUtil.TYPE_3GWAP)) {
            return 3;
        }
        if (activeNetworkInfo.getExtraInfo().equalsIgnoreCase(ConnectionUtil.TYPE_3GNET)) {
            return 4;
        }
        if (activeNetworkInfo.getExtraInfo().equalsIgnoreCase("cmwap")) {
            return 5;
        }
        if (activeNetworkInfo.getExtraInfo().equalsIgnoreCase(ConnectionUtil.TYPE_CMNET)) {
            return 6;
        }
        if (activeNetworkInfo.getExtraInfo().equalsIgnoreCase(ConnectionUtil.TYPE_CTWAP)) {
            return 7;
        }
        if (activeNetworkInfo.getExtraInfo().equalsIgnoreCase(ConnectionUtil.TYPE_CTNET)) {
            return 8;
        }
        return activeNetworkInfo.getExtraInfo().equalsIgnoreCase("LTE") ? 10 : 9;
    }

    public static int getISPCode(Context context) {
        String simOperator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d61d6d7", new Object[]{context})).intValue();
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.NetStatusUtil", "getISPCode error", th);
                return 0;
            }
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null && (simOperator = telephonyManager.getSimOperator()) != null && simOperator.length() >= 5) {
            StringBuilder sb = new StringBuilder();
            int length = simOperator.length();
            if (length > 6) {
                length = 6;
            }
            for (int i = 0; i < length; i++) {
                if (!Character.isDigit(simOperator.charAt(i))) {
                    if (sb.length() > 0) {
                        break;
                    }
                } else {
                    sb.append(simOperator.charAt(i));
                }
            }
            return Integer.valueOf(sb.toString()).intValue();
        }
        return 0;
    }

    public static String getISPName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fcfaa5a", new Object[]{context});
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.NetStatusUtil", "getISPName error", th);
                return "";
            }
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        if (telephonyManager.getSimOperatorName().length() <= 100) {
            return telephonyManager.getSimOperatorName();
        }
        return telephonyManager.getSimOperatorName().substring(0, 100);
    }

    public static int guessNetSpeed(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90448113", new Object[]{context})).intValue();
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.NetStatusUtil", "guessNetSpeed", th);
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo.getType() == 1) {
            return C1238p.b;
        }
        switch (activeNetworkInfo.getSubtype()) {
            case 1:
                return 4096;
            case 2:
                return 8192;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return C1238p.b;
        }
        return C1238p.b;
    }

    public static boolean isMobile(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33988239", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.NetStatusUtil", th);
                return false;
            }
        }
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().getType() != 1;
    }

    public static boolean is2G(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d33e086", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.NetStatusUtil", th);
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo.getType() == 1) {
            return false;
        }
        if (activeNetworkInfo.getSubtype() != 2 && activeNetworkInfo.getSubtype() != 1) {
            if (activeNetworkInfo.getSubtype() != 4) {
                return false;
            }
        }
        return true;
    }

    public static boolean is4G(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97057108", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.NetStatusUtil", th);
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo.getType() == 1) {
            return false;
        }
        return activeNetworkInfo.getSubtype() >= 13;
    }

    public static boolean isWap(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("76c5ed49", new Object[]{context})).booleanValue() : isWap(getNetType(context));
    }

    public static boolean is3G(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("821ca8c7", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.NetStatusUtil", th);
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo.getType() != 1 && activeNetworkInfo.getSubtype() >= 5) {
            if (activeNetworkInfo.getSubtype() < 13) {
                return true;
            }
        }
        return false;
    }

    public static boolean isWifi(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c896226", new Object[]{context})).booleanValue() : isWifi(getNetType(context));
    }

    public static WifiInfo getWifiInfo(Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WifiInfo) ipChange.ipc$dispatch("987b5a4e", new Object[]{context});
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.NetStatusUtil", th);
                return null;
            }
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && 1 == activeNetworkInfo.getType()) {
            if (((WifiManager) context.getSystemService("wifi")) == null) {
            }
        }
        return null;
    }

    public static int getWifiSleeepPolicy(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("881d0813", new Object[]{context})).intValue();
        }
        if (context == null) {
            context = BifrostEnvUtils.getContext();
        }
        return Settings.System.getInt(context.getContentResolver(), "wifi_sleep_policy", 2);
    }

    public static int getBackgroundLimitType(Context context) {
        int wifiSleeepPolicy;
        if (Build.VERSION.SDK_INT >= 14) {
            try {
                Class<?> cls = Class.forName("android.app.ActivityManagerNative");
                Object invoke = cls.getMethod("getDefault", new Class[0]).invoke(cls, new Object[0]);
                if (((Integer) invoke.getClass().getMethod("getProcessLimit", new Class[0]).invoke(invoke, new Object[0])).intValue() == 0) {
                    return 1;
                }
            } catch (Exception e) {
                LogCatUtil.error("bifrost.NetStatusUtil", e);
            }
        }
        try {
            wifiSleeepPolicy = getWifiSleeepPolicy(context);
        } catch (Exception e2) {
            LogCatUtil.error("bifrost.NetStatusUtil", e2);
        }
        if (wifiSleeepPolicy != 2) {
            if (getNetType(context) == 0) {
                return (wifiSleeepPolicy == 1 || wifiSleeepPolicy == 0) ? 3 : 0;
            }
        }
        return 0;
    }

    public static boolean isImmediatelyDestroyActivities(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c579d192", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            context = BifrostEnvUtils.getContext();
        }
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0) != 0;
    }

    public static int getProxyInfo(Context context, StringBuffer stringBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f23c0838", new Object[]{context, stringBuffer})).intValue();
        }
        if (context == null) {
            try {
                BifrostEnvUtils.getContext();
            } catch (Exception e) {
                LogCatUtil.error("bifrost.NetStatusUtil", e);
            }
        }
        String defaultHost = Proxy.getDefaultHost();
        int defaultPort = Proxy.getDefaultPort();
        if (defaultHost != null && defaultHost.length() > 0 && defaultPort > 0) {
            stringBuffer.append(defaultHost);
            return defaultPort;
        }
        String property = System.getProperty("http.proxyHost");
        String property2 = System.getProperty("http.proxyPort");
        int i = 80;
        if (property2 != null && property2.length() > 0) {
            i = Integer.parseInt(property2);
        }
        if (property != null && property.length() > 0) {
            stringBuffer.append(property);
            return i;
        }
        return 0;
    }

    public static boolean isKnownDirectNet(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e87fa4a", new Object[]{context})).booleanValue();
        }
        int netType = getNetType(context);
        return 6 == netType || 1 == netType || 4 == netType || 8 == netType || 10 == netType || netType == 0;
    }

    public static boolean isNetworkConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e6e0580", new Object[]{context})).booleanValue();
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.NetStatusUtil", "isNetworkConnected error", th);
                return false;
            }
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED;
    }

    public static int getNetTypeForStat(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11155158", new Object[]{context})).intValue();
        }
        if (context == null) {
            try {
                context = BifrostEnvUtils.getContext();
            } catch (Throwable th) {
                LogCatUtil.error("bifrost.NetStatusUtil", th);
                return 999;
            }
        }
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return 999;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 1;
        }
        int subtype = activeNetworkInfo.getSubtype();
        if (subtype != 0) {
            return subtype * 1000;
        }
        return 999;
    }
}
