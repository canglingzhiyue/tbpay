package anet.channel.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.assist.ICapability;
import anet.channel.assist.IDualWifiCapability;
import anet.channel.assist.NetworkAssist;
import anet.channel.fulltrace.AnalysisFactory;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.Inet64Util;
import anet.channel.util.StringUtils;
import anet.channel.util.Utils;
import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.resourceguardian.data.model.b;
import com.taobao.application.common.c;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import tb.ild;
import tb.kge;

/* loaded from: classes.dex */
public class NetworkStatusMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DEFAULT_BSSID = "02:00:00:00:00:00";
    private static final String DEFAULT_SSID = "<unknown ssid>";
    private static final String TAG = "awcn.NetworkStatusMonitor";
    private static String accessPoint;
    public static volatile String apn;
    public static volatile String bssid;
    public static volatile String carrier;
    private static String clientIp;
    public static volatile Context context;
    private static String[] dftDnsNames;
    public static volatile List<InetAddress> dnsServers;
    private static Method getSubInfoMethod;
    public static volatile boolean isNetworkAvailable;
    private static volatile boolean isNetworkCallbackRegistered;
    private static volatile boolean isRegistered;
    public static volatile boolean isRoaming;
    private static boolean isSavePower;
    private static int isVPN;
    private static long lastSavePowerTime;
    private static long lastStatusChangeTime;
    private static int lowPowerVal;
    private static ConnectivityManager mConnectivityManager;
    private static TelephonyManager mTelephonyManager;
    private static WifiManager mWifiManager;
    public static volatile String mcc;
    private static ConnectivityManager.NetworkCallback networkCallback;
    public static volatile Pair<String, Integer> proxy;
    private static BroadcastReceiver receiver;
    private static Network sCellularNetwork;
    public static volatile String simOp;
    public static volatile String ssid;
    public static volatile NetworkStatusHelper.NetworkStatus status;
    public static volatile String subType;
    private static SubscriptionManager subscriptionManager;

    public static /* synthetic */ Network access$002(Network network) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Network) ipChange.ipc$dispatch("ebea2da1", new Object[]{network});
        }
        sCellularNetwork = network;
        return network;
    }

    public static /* synthetic */ void access$100(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c92275", new Object[]{intent});
        } else {
            dueToBroadcastReceiver(intent);
        }
    }

    static {
        kge.a(-978770536);
        dftDnsNames = new String[]{"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
        context = null;
        isNetworkAvailable = false;
        status = NetworkStatusHelper.NetworkStatus.NONE;
        subType = "unknown";
        apn = "";
        ssid = "";
        bssid = "";
        carrier = "unknown";
        mcc = "";
        simOp = "";
        proxy = null;
        isRoaming = false;
        dnsServers = Collections.EMPTY_LIST;
        isRegistered = false;
        isNetworkCallbackRegistered = false;
        mConnectivityManager = null;
        mTelephonyManager = null;
        mWifiManager = null;
        subscriptionManager = null;
        networkCallback = null;
        isVPN = -1;
        lastStatusChangeTime = -1L;
        lastSavePowerTime = System.currentTimeMillis();
        isSavePower = false;
        lowPowerVal = -1;
        accessPoint = "network_def";
        clientIp = "network_def";
        receiver = new BroadcastReceiver() { // from class: anet.channel.status.NetworkStatusMonitor.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, final Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                if (ALog.isPrintLog(1)) {
                    ALog.d(NetworkStatusMonitor.TAG, "receiver:" + intent.getAction(), null, new Object[0]);
                }
                ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.status.NetworkStatusMonitor.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            NetworkStatusMonitor.access$100(intent);
                        }
                    }
                });
            }
        };
    }

    public static void registerNetworkReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd610a1", new Object[0]);
        } else if (isRegistered || context == null) {
        } else {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.intent.action.PROXY_CHANGE");
            try {
                context.registerReceiver(receiver, intentFilter);
            } catch (Exception unused) {
                ALog.e(TAG, "registerReceiver failed", null, new Object[0]);
            }
            if (AwcnConfig.isAsyncIpStackDetect()) {
                initNetworkStatus();
            } else {
                checkNetworkStatus();
            }
            isRegistered = true;
        }
    }

    public static void unregisterNetworkReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472aaa68", new Object[0]);
        } else if (context == null) {
        } else {
            context.unregisterReceiver(receiver);
        }
    }

    public static void registerNetworkCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97772bf7", new Object[0]);
        } else if (Build.VERSION.SDK_INT < 24 || isNetworkCallbackRegistered) {
        } else {
            NetworkInfo networkInfo = getNetworkInfo();
            isNetworkAvailable = networkInfo != null && networkInfo.isConnected();
            mConnectivityManager.registerDefaultNetworkCallback(new ConnectivityManager.NetworkCallback() { // from class: anet.channel.status.NetworkStatusMonitor.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1047581786) {
                        super.onLinkPropertiesChanged((Network) objArr[0], (LinkProperties) objArr[1]);
                        return null;
                    } else if (hashCode == 838841652) {
                        super.onAvailable((Network) objArr[0]);
                        return null;
                    } else if (hashCode != 2071672155) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.onLost((Network) objArr[0]);
                        return null;
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c18f2ba6", new Object[]{this, network, linkProperties});
                        return;
                    }
                    super.onLinkPropertiesChanged(network, linkProperties);
                    NetworkStatusMonitor.dnsServers = new ArrayList(linkProperties.getDnsServers());
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7b7b355b", new Object[]{this, network});
                        return;
                    }
                    super.onLost(network);
                    ALog.i(NetworkStatusMonitor.TAG, "network onLost", null, new Object[0]);
                    NetworkStatusMonitor.isNetworkAvailable = false;
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("31ffb534", new Object[]{this, network});
                        return;
                    }
                    super.onAvailable(network);
                    ALog.i(NetworkStatusMonitor.TAG, "network onAvailable", null, new Object[0]);
                    NetworkStatusMonitor.isNetworkAvailable = true;
                }
            });
            try {
                registerCellularNetworkCallback();
            } catch (Throwable unused) {
                ALog.e(TAG, "[registerCellularNetworkCallback]error.", null, new Object[0]);
            }
            isNetworkCallbackRegistered = true;
        }
    }

    private static void registerCellularNetworkCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c6b912d", new Object[0]);
        } else if (!AwcnConfig.isMultiPathMonitorEnable()) {
        } else {
            if (Utils.isHarmonyOS() && !AwcnConfig.isInHarmonyWhiteList(Utils.getHarmonyVersion())) {
                ALog.e(TAG, "close multi path in harmonyOS system.", null, new Object[0]);
                return;
            }
            ALog.e(TAG, "[registerCellularNetworkCallback]", null, new Object[0]);
            mConnectivityManager.requestNetwork(new NetworkRequest.Builder().addTransportType(0).addCapability(12).build(), new ConnectivityManager.NetworkCallback() { // from class: anet.channel.status.NetworkStatusMonitor.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                    int hashCode = str.hashCode();
                    if (hashCode == 838841652) {
                        super.onAvailable((Network) objArr[0]);
                        return null;
                    } else if (hashCode != 2071672155) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    } else {
                        super.onLost((Network) objArr[0]);
                        return null;
                    }
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("31ffb534", new Object[]{this, network});
                        return;
                    }
                    super.onAvailable(network);
                    NetworkStatusMonitor.access$002(network);
                    ALog.e(NetworkStatusMonitor.TAG, "TRANSPORT_CELLULAR onAvailable", null, new Object[0]);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7b7b355b", new Object[]{this, network});
                        return;
                    }
                    super.onLost(network);
                    NetworkStatusMonitor.access$002(null);
                    ALog.e(NetworkStatusMonitor.TAG, "TRANSPORT_CELLULAR onLost", null, new Object[0]);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126 A[Catch: Throwable -> 0x0172, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x000b, B:10:0x0017, B:12:0x002f, B:14:0x0038, B:16:0x003c, B:18:0x0046, B:20:0x0050, B:22:0x0057, B:23:0x005a, B:26:0x0062, B:28:0x0066, B:32:0x006d, B:34:0x0079, B:36:0x007f, B:38:0x0083, B:43:0x0094, B:46:0x009c, B:48:0x00f6, B:50:0x00fe, B:53:0x0115, B:55:0x0126, B:58:0x014b, B:59:0x0156, B:61:0x015c), top: B:74:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b A[Catch: Throwable -> 0x0172, TRY_ENTER, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x000b, B:10:0x0017, B:12:0x002f, B:14:0x0038, B:16:0x003c, B:18:0x0046, B:20:0x0050, B:22:0x0057, B:23:0x005a, B:26:0x0062, B:28:0x0066, B:32:0x006d, B:34:0x0079, B:36:0x007f, B:38:0x0083, B:43:0x0094, B:46:0x009c, B:48:0x00f6, B:50:0x00fe, B:53:0x0115, B:55:0x0126, B:58:0x014b, B:59:0x0156, B:61:0x015c), top: B:74:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static synchronized void dueToBroadcastReceiver(android.content.Intent r14) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.status.NetworkStatusMonitor.dueToBroadcastReceiver(android.content.Intent):void");
    }

    private static void initNetworkStatus() {
        NetworkInfo networkInfo;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207d17", new Object[0]);
            return;
        }
        ALog.d(TAG, "[initNetworkStatus]", null, new Object[0]);
        NetworkStatusHelper.NetworkStatus networkStatus = status;
        String str = apn;
        String str2 = ssid;
        String formatNetwork = formatNetwork();
        boolean z2 = true;
        try {
            try {
                networkInfo = getNetworkInfo();
                z = false;
            } catch (Exception e) {
                ALog.e(TAG, "getNetworkInfo exception", null, e, new Object[0]);
                resetStatus(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                networkInfo = null;
                z = true;
            }
            if (!z) {
                if (networkInfo != null && networkInfo.isConnected()) {
                    ALog.i(TAG, "initNetworkStatus", null, "info.isConnected", Boolean.valueOf(networkInfo.isConnected()), "info.isAvailable", Boolean.valueOf(networkInfo.isAvailable()), "info.getType", Integer.valueOf(networkInfo.getType()));
                    if (networkInfo.getType() == 0) {
                        String subtypeName = networkInfo.getSubtypeName();
                        String str3 = "";
                        if (!TextUtils.isEmpty(subtypeName)) {
                            str3 = subtypeName.replace(" ", str3);
                        }
                        resetStatus(parseNetworkStatus(networkInfo.getSubtype(), str3), str3);
                        apn = parseExtraInfo(networkInfo.getExtraInfo());
                        parseCarrierInfo();
                        parseMcc();
                    } else if (networkInfo.getType() == 1) {
                        resetStatus(NetworkStatusHelper.NetworkStatus.WIFI, "wifi");
                        bssid = DEFAULT_BSSID;
                        ssid = DEFAULT_SSID;
                        parseMcc();
                        carrier = "wifi";
                        simOp = "wifi";
                        proxy = parseWifiProxy();
                        ICapability capability = NetworkAssist.getAssistManager().getCapability(2);
                        if (capability != null && capability.isEnable()) {
                            ((IDualWifiCapability) capability).request();
                        }
                    } else {
                        resetStatus(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                    }
                    isRoaming = networkInfo.isRoaming();
                    ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.status.NetworkStatusMonitor.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                Inet64Util.startIpStackDetect();
                            }
                        }
                    });
                }
                resetStatus(NetworkStatusHelper.NetworkStatus.NO, "no network");
                ALog.i(TAG, "initNetworkStatus", null, "no network");
            }
            if (status == networkStatus && apn.equalsIgnoreCase(str) && ssid.equalsIgnoreCase(str2)) {
                return;
            }
            if (ALog.isPrintLog(2)) {
                NetworkStatusHelper.printNetworkDetail();
            }
            AnalysisFactory.getV3Instance().recordAppStatus("Network_Changed", formatNetwork + " -> " + formatNetwork());
            status.isLastNone.set(networkStatus == NetworkStatusHelper.NetworkStatus.NONE);
            StringBuilder sb = new StringBuilder();
            sb.append("[initNetworkStatus] isLastNone = ");
            if (networkStatus != NetworkStatusHelper.NetworkStatus.NONE) {
                z2 = false;
            }
            sb.append(z2);
            ALog.e(TAG, sb.toString(), null, new Object[0]);
            NetworkStatusHelper.notifyStatusChanged(status);
        } catch (Exception e2) {
            ALog.e(TAG, "initNetworkStatus", null, e2, new Object[0]);
        }
    }

    public static void checkNetworkStatus() {
        NetworkInfo networkInfo;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196eec1f", new Object[0]);
            return;
        }
        ALog.d(TAG, "[checkNetworkStatus]", null, new Object[0]);
        NetworkStatusHelper.NetworkStatus networkStatus = status;
        String str = apn;
        String str2 = ssid;
        String formatNetwork = formatNetwork();
        boolean z2 = true;
        try {
            try {
                networkInfo = getNetworkInfo();
                z = false;
            } catch (Exception e) {
                ALog.e(TAG, "getNetworkInfo exception", null, e, new Object[0]);
                resetStatus(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                networkInfo = null;
                z = true;
            }
            if (!z) {
                if (networkInfo != null && networkInfo.isConnected()) {
                    ALog.i(TAG, "checkNetworkStatus", null, "info.isConnected", Boolean.valueOf(networkInfo.isConnected()), "info.isAvailable", Boolean.valueOf(networkInfo.isAvailable()), "info.getType", Integer.valueOf(networkInfo.getType()));
                    if (networkInfo.getType() == 0) {
                        String subtypeName = networkInfo.getSubtypeName();
                        String str3 = "";
                        if (!TextUtils.isEmpty(subtypeName)) {
                            str3 = subtypeName.replace(" ", str3);
                        }
                        resetStatus(parseNetworkStatus(networkInfo.getSubtype(), str3), str3);
                        apn = parseExtraInfo(networkInfo.getExtraInfo());
                        parseCarrierInfo();
                    } else if (networkInfo.getType() == 1) {
                        resetStatus(NetworkStatusHelper.NetworkStatus.WIFI, "wifi");
                        bssid = DEFAULT_BSSID;
                        ssid = DEFAULT_SSID;
                        carrier = "wifi";
                        simOp = "wifi";
                        proxy = parseWifiProxy();
                        ICapability capability = NetworkAssist.getAssistManager().getCapability(2);
                        if (capability != null && capability.isEnable()) {
                            ((IDualWifiCapability) capability).request();
                        }
                    } else {
                        resetStatus(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                    }
                    isRoaming = networkInfo.isRoaming();
                    Inet64Util.startIpStackDetect();
                }
                resetStatus(NetworkStatusHelper.NetworkStatus.NO, "no network");
                ALog.i(TAG, "checkNetworkStatus", null, "no network");
            }
            if (status == networkStatus && apn.equalsIgnoreCase(str) && ssid.equalsIgnoreCase(str2)) {
                return;
            }
            if (ALog.isPrintLog(2)) {
                NetworkStatusHelper.printNetworkDetail();
            }
            AnalysisFactory.getV3Instance().recordAppStatus("Network_Changed", formatNetwork + " -> " + formatNetwork());
            status.isLastNone.set(networkStatus == NetworkStatusHelper.NetworkStatus.NONE);
            StringBuilder sb = new StringBuilder();
            sb.append("[checkNetworkStatus] isLastNone = ");
            if (networkStatus != NetworkStatusHelper.NetworkStatus.NONE) {
                z2 = false;
            }
            sb.append(z2);
            ALog.e(TAG, sb.toString(), null, new Object[0]);
            NetworkStatusHelper.notifyStatusChanged(status);
        } catch (Exception e2) {
            ALog.e(TAG, "checkNetworkStatus", null, e2, new Object[0]);
        }
    }

    public static String formatNetwork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6f9a122", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(status.getType());
        sb.append("_");
        sb.append(subType);
        if (status != NetworkStatusHelper.NetworkStatus.NO && status != NetworkStatusHelper.NetworkStatus.NONE) {
            if (status.isMobile()) {
                sb.append("_");
                sb.append(apn);
                sb.append("_");
                sb.append(carrier);
            } else {
                sb.append("_");
                sb.append(ssid);
                sb.append("_");
                sb.append(bssid);
            }
        }
        return sb.toString();
    }

    private static void resetStatus(NetworkStatusHelper.NetworkStatus networkStatus, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ce9b37", new Object[]{networkStatus, str});
            return;
        }
        status = networkStatus;
        subType = str;
        apn = "";
        ssid = "";
        bssid = "";
        proxy = null;
        carrier = "";
        simOp = "";
    }

    private static NetworkStatusHelper.NetworkStatus parseNetworkStatus(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStatusHelper.NetworkStatus) ipChange.ipc$dispatch("b75e8a7e", new Object[]{new Integer(i), str});
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkStatusHelper.NetworkStatus.G2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkStatusHelper.NetworkStatus.G3;
            case 13:
            case 18:
            case 19:
                return NetworkStatusHelper.NetworkStatus.G4;
            case 20:
                return NetworkStatusHelper.NetworkStatus.G5;
            default:
                if (str.equalsIgnoreCase("TD-SCDMA") || str.equalsIgnoreCase("WCDMA") || str.equalsIgnoreCase("CDMA2000")) {
                    return NetworkStatusHelper.NetworkStatus.G3;
                }
                return NetworkStatusHelper.NetworkStatus.NONE;
        }
    }

    private static String parseExtraInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f61864", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.contains("cmwap")) {
                return "cmwap";
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_UNIWAP)) {
                return ConnectionUtil.TYPE_UNIWAP;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_3GWAP)) {
                return ConnectionUtil.TYPE_3GWAP;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_CTWAP)) {
                return ConnectionUtil.TYPE_CTWAP;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_CMNET)) {
                return ConnectionUtil.TYPE_CMNET;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_UNINET)) {
                return ConnectionUtil.TYPE_UNINET;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_3GNET)) {
                return ConnectionUtil.TYPE_3GNET;
            }
            if (lowerCase.contains(ConnectionUtil.TYPE_CTNET)) {
                return ConnectionUtil.TYPE_CTNET;
            }
        }
        return "unknown";
    }

    private static void parseCarrierInfo() {
        try {
            if (mTelephonyManager == null) {
                mTelephonyManager = (TelephonyManager) context.getSystemService("phone");
            }
            simOp = mTelephonyManager.getSimOperator();
            if (Build.VERSION.SDK_INT < 22) {
                return;
            }
            if (subscriptionManager == null) {
                SubscriptionManager from = SubscriptionManager.from(context);
                subscriptionManager = from;
                getSubInfoMethod = from.getClass().getDeclaredMethod("getDefaultDataSubscriptionInfo", new Class[0]);
            }
            if (getSubInfoMethod == null) {
                return;
            }
            carrier = ((SubscriptionInfo) getSubInfoMethod.invoke(subscriptionManager, new Object[0])).getCarrierName().toString();
        } catch (Exception unused) {
        }
    }

    private static String parseMcc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e98895f", new Object[0]);
        }
        try {
            if (mTelephonyManager == null) {
                mTelephonyManager = (TelephonyManager) context.getSystemService("phone");
            }
            mcc = mTelephonyManager.getSimCountryIso();
        } catch (Exception unused) {
        }
        return mcc;
    }

    public static String getMcc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eae70502", new Object[0]);
        }
        try {
            if ("".equalsIgnoreCase(mcc)) {
                mcc = parseMcc();
            }
        } catch (Exception unused) {
        }
        return mcc;
    }

    public static boolean isInternalAddr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c649b23", new Object[0])).booleanValue();
        }
        if ("".equalsIgnoreCase(mcc)) {
            mcc = parseMcc();
        }
        return "".equalsIgnoreCase(mcc) || AdvanceSetting.CLEAR_NOTIFICATION.equalsIgnoreCase(mcc);
    }

    public static String getRealMcc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d84d5dc0", new Object[0]) : mcc;
    }

    public static NetworkInfo getNetworkInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkInfo) ipChange.ipc$dispatch("246119f4", new Object[0]);
        }
        if (mConnectivityManager == null) {
            mConnectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        }
        return mConnectivityManager.getActiveNetworkInfo();
    }

    public static NetworkInfo getNetworkInfo(Network network) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkInfo) ipChange.ipc$dispatch("3181863f", new Object[]{network});
        }
        if (network == null) {
            return getNetworkInfo();
        }
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (mConnectivityManager == null) {
            mConnectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        }
        return mConnectivityManager.getNetworkInfo(network);
    }

    public static NetworkStatusHelper.NetworkStatus getNetworkStatus(Network network) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkStatusHelper.NetworkStatus) ipChange.ipc$dispatch("ced3f159", new Object[]{network});
        }
        NetworkInfo networkInfo = getNetworkInfo(network);
        if (networkInfo == null) {
            return null;
        }
        String subtypeName = networkInfo.getSubtypeName();
        String str = "";
        if (!TextUtils.isEmpty(subtypeName)) {
            str = subtypeName.replace(" ", str);
        }
        return parseNetworkStatus(networkInfo.getSubtype(), str);
    }

    private static Pair<String, Integer> parseWifiProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("ec1ee177", new Object[0]);
        }
        try {
            String property = System.getProperty("http.proxyHost");
            if (TextUtils.isEmpty(property)) {
                return null;
            }
            return Pair.create(property, Integer.valueOf(Integer.parseInt(System.getProperty("http.proxyPort"))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String getDnsServerFromSystemProperties() {
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            String[] strArr = dftDnsNames;
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str = (String) method.invoke(null, strArr[i]);
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static int getRestrictBackgroundStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56d63a8c", new Object[0])).intValue();
        }
        if (mConnectivityManager != null && Build.VERSION.SDK_INT >= 24) {
            return mConnectivityManager.getRestrictBackgroundStatus();
        }
        return -1;
    }

    public static Network getCellularNetwork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Network) ipChange.ipc$dispatch("948448ea", new Object[0]);
        }
        if (status != NetworkStatusHelper.NetworkStatus.WIFI) {
            return null;
        }
        return sCellularNetwork;
    }

    public static boolean isVPN() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc74f6f5", new Object[0])).booleanValue();
        }
        if (isVPN == -1) {
            ALog.e(TAG, "[VPN] isVPN, not registerVPNCallback or this method not support", null, new Object[0]);
        }
        return isVPN == 1;
    }

    public static int getLowPowerVal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52010d94", new Object[0])).intValue();
        }
        try {
            b a2 = ild.a(4, 401, 199);
            if (a2 != null && a2.d != null && !a2.d.isEmpty()) {
                ALog.e(TAG, "[LowPower] getLowPower value=" + a2.d, null, new Object[0]);
                return Integer.parseInt(a2.d);
            }
            ALog.e(TAG, "[LowPower] getLowPower not ready or not support!!", null, new Object[0]);
            return -1;
        } catch (Throwable th) {
            ALog.e(TAG, "[LowPower] getLowPower fail, e=" + th.toString(), null, new Object[0]);
            return -1;
        }
    }

    public static synchronized void updatePowerMode() {
        synchronized (NetworkStatusMonitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28d09286", new Object[0]);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - lastSavePowerTime >= AwcnConfig.getSavePowerTimeInterval()) {
                lastSavePowerTime = currentTimeMillis;
                isSavePower = c.a().a("saveMode", false);
                lowPowerVal = getLowPowerVal();
            }
        }
    }

    public static synchronized String getLowPowerMode() {
        synchronized (NetworkStatusMonitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("79ad576f", new Object[0]);
            }
            updatePowerMode();
            return lowPowerVal < 0 ? "" : lowPowerVal > 20 ? "normal" : (lowPowerVal <= 10 || lowPowerVal > 20) ? "exlow" : "low";
        }
    }

    public static synchronized boolean isSavePower() {
        synchronized (NetworkStatusMonitor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3c8f1509", new Object[0])).booleanValue();
            }
            return isSavePower;
        }
    }

    public static boolean isAccessPointChange(String str, String str2, String str3) {
        boolean isStringEqual;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("241ad1fb", new Object[]{str, str2, str3})).booleanValue();
        }
        if (AwcnConfig.isUseClientIpOpened() && str == null && str2 != null) {
            isStringEqual = StringUtils.isStringEqual(clientIp, str2);
        } else {
            isStringEqual = StringUtils.isStringEqual(accessPoint, str);
        }
        boolean z = !isStringEqual;
        if (z) {
            ALog.e(TAG, "[DetectOpt] [amdc_file] AccessPointChange!! newAccessPoint=" + str + " ,accessPoint=" + accessPoint + " ,newClientIp=" + str2 + " ,clientIp=" + clientIp, null, "flag", Boolean.valueOf(z), "uniqueId", str3);
        }
        accessPoint = str;
        clientIp = str2;
        return z;
    }

    public static boolean isNetworkRestricted(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f1891a1", new Object[]{new Integer(i)})).booleanValue();
        }
        try {
            if (mConnectivityManager == null && context != null) {
                mConnectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            }
            if (Build.VERSION.SDK_INT >= 23) {
                Network activeNetwork = mConnectivityManager.getActiveNetwork();
                if (activeNetwork == null) {
                    ALog.e(TAG, "[RUM] active networks null, isNetworkRestricted is false!", null, new Object[0]);
                    return false;
                }
                NetworkCapabilities networkCapabilities = mConnectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    ALog.e(TAG, "[RUM] networkCapabilities null, isNetworkRestricted is false!", null, new Object[0]);
                    return false;
                }
                int i2 = i == 0 ? 0 : 1;
                boolean hasTransport = networkCapabilities.hasTransport(i2);
                boolean hasCapability = networkCapabilities.hasCapability(17);
                boolean z = !networkCapabilities.hasCapability(13);
                ALog.e(TAG, "[RUM] isNetworkRestricted", null, "hasCaptivePortal", Boolean.valueOf(hasCapability), "isRestricted", Boolean.valueOf(z), "networkType", Integer.valueOf(i2), "isNetworkType", Boolean.valueOf(hasTransport));
                return hasTransport && (hasCapability || z);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "[RUM] isNetworkRestricted error=" + th.toString(), null, new Object[0]);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (android.provider.Settings.Global.getInt(anet.channel.status.NetworkStatusMonitor.context.getContentResolver(), "airplane_mode_on", 0) != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isAirplaneMode() {
        /*
            java.lang.String r0 = "awcn.NetworkStatusMonitor"
            com.android.alibaba.ip.runtime.IpChange r1 = anet.channel.status.NetworkStatusMonitor.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 0
            if (r2 == 0) goto L18
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r2 = "ea42836a"
            java.lang.Object r0 = r1.ipc$dispatch(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L18:
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L53
            r4 = 17
            java.lang.String r5 = "airplane_mode_on"
            r6 = 1
            if (r2 < r4) goto L32
            android.content.Context r2 = anet.channel.status.NetworkStatusMonitor.context     // Catch: java.lang.Throwable -> L53
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L53
            int r2 = android.provider.Settings.Global.getInt(r2, r5, r3)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L30
        L2e:
            r2 = 1
            goto L3f
        L30:
            r2 = 0
            goto L3f
        L32:
            android.content.Context r2 = anet.channel.status.NetworkStatusMonitor.context     // Catch: java.lang.Throwable -> L53
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Throwable -> L53
            int r2 = android.provider.Settings.System.getInt(r2, r5, r3)     // Catch: java.lang.Throwable -> L53
            if (r2 == 0) goto L30
            goto L2e
        L3f:
            java.lang.String r4 = "[RUM] "
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = "isAirplaneMode"
            r5[r3] = r7     // Catch: java.lang.Throwable -> L53
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L53
            r5[r6] = r7     // Catch: java.lang.Throwable -> L53
            anet.channel.util.ALog.e(r0, r4, r1, r5)     // Catch: java.lang.Throwable -> L53
            return r2
        L53:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[RUM] isAirplaneModeOn error="
            r4.append(r5)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            anet.channel.util.ALog.e(r0, r2, r1, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.status.NetworkStatusMonitor.isAirplaneMode():boolean");
    }
}
