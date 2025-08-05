package anet.channel.status;

import android.content.Context;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.ProxySetting;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.weex_framework.util.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes.dex */
public class NetworkStatusHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.NetworkStatusHelper";
    public static AtomicInteger curVpnChangeCount;
    public static CopyOnWriteArraySet<INetworkStatusChangeListener> listeners;
    private static boolean started;
    public static CopyOnWriteArraySet<IVpnProxyStatusChangeListener> statusChangeListeners;

    /* loaded from: classes.dex */
    public interface INetworkStatusChangeListener {
        void onNetworkStatusChanged(NetworkStatus networkStatus);
    }

    /* loaded from: classes2.dex */
    public interface IVpnProxyStatusChangeListener {
        void onVpnProxyStatusChanged(boolean z, boolean z2);
    }

    /* loaded from: classes.dex */
    public enum NetworkStatus {
        NONE,
        NO,
        G2,
        G3,
        G4,
        WIFI,
        G5;
        
        public AtomicBoolean isLastNone = new AtomicBoolean(false);

        NetworkStatus() {
        }

        public String getType() {
            return this == G2 ? "2G" : this == G3 ? "3G" : this == G4 ? "4G" : this == G5 ? "5G" : toString();
        }

        public boolean isMobile() {
            return this == G2 || this == G3 || this == G4 || this == G5;
        }

        public boolean isWifi() {
            return this == WIFI;
        }
    }

    static {
        kge.a(647276464);
        started = false;
        listeners = new CopyOnWriteArraySet<>();
        statusChangeListeners = new CopyOnWriteArraySet<>();
        curVpnChangeCount = new AtomicInteger();
    }

    public static void registerVpnProxyStatusListener(IVpnProxyStatusChangeListener iVpnProxyStatusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24029d2", new Object[]{iVpnProxyStatusChangeListener});
        } else if (!AwcnConfig.isVpnListenOpened() || iVpnProxyStatusChangeListener == null) {
        } else {
            statusChangeListeners.add(iVpnProxyStatusChangeListener);
        }
    }

    public static void unregisterVpnProxyStatusListener(IVpnProxyStatusChangeListener iVpnProxyStatusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a94e359", new Object[]{iVpnProxyStatusChangeListener});
        } else if (!AwcnConfig.isVpnListenOpened() || iVpnProxyStatusChangeListener == null) {
        } else {
            statusChangeListeners.remove(iVpnProxyStatusChangeListener);
        }
    }

    public static synchronized void startListener(Context context) {
        synchronized (NetworkStatusHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("270805ab", new Object[]{context});
            } else if (context == null) {
                throw new NullPointerException("context is null");
            } else {
                if (started) {
                    return;
                }
                NetworkStatusMonitor.context = context;
                NetworkStatusMonitor.registerNetworkReceiver();
                NetworkStatusMonitor.registerNetworkCallback();
                started = true;
            }
        }
    }

    public static synchronized void stopListener(Context context) {
        synchronized (NetworkStatusHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dedc860b", new Object[]{context});
            } else if (!started) {
            } else {
                NetworkStatusMonitor.unregisterNetworkReceiver();
                started = false;
            }
        }
    }

    public static void addStatusChangeListener(INetworkStatusChangeListener iNetworkStatusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("869f1e1e", new Object[]{iNetworkStatusChangeListener});
        } else {
            listeners.add(iNetworkStatusChangeListener);
        }
    }

    public static void removeStatusChangeListener(INetworkStatusChangeListener iNetworkStatusChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315356c1", new Object[]{iNetworkStatusChangeListener});
        } else {
            listeners.remove(iNetworkStatusChangeListener);
        }
    }

    public static void notifyStatusChanged(final NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d28c35", new Object[]{networkStatus});
        } else {
            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.status.NetworkStatusHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        Iterator<INetworkStatusChangeListener> it = NetworkStatusHelper.listeners.iterator();
                        while (it.hasNext()) {
                            INetworkStatusChangeListener next = it.next();
                            long currentTimeMillis = System.currentTimeMillis();
                            next.onNetworkStatusChanged(NetworkStatus.this);
                            if (System.currentTimeMillis() - currentTimeMillis > 500) {
                                ALog.e(NetworkStatusHelper.TAG, "call back cost too much time", null, DataReceiveMonitor.CB_LISTENER, next);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public static NetworkStatus getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetworkStatus) ipChange.ipc$dispatch("9f1f21b4", new Object[0]) : NetworkStatusMonitor.status;
    }

    public static String getNetworkSubType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b76cf7b7", new Object[0]) : NetworkStatusMonitor.subType;
    }

    public static String getApn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a7181fb0", new Object[0]) : NetworkStatusMonitor.apn;
    }

    public static String getMcc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eae70502", new Object[0]);
        }
        String mcc = NetworkStatusMonitor.getMcc();
        if ("".equalsIgnoreCase(mcc)) {
            return "def.";
        }
        return mcc + ".";
    }

    public static String getCarrier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15bec177", new Object[0]) : NetworkStatusMonitor.carrier;
    }

    public static boolean isInternalAddr() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7c649b23", new Object[0])).booleanValue() : NetworkStatusMonitor.isInternalAddr();
    }

    public static String getRealMcc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d84d5dc0", new Object[0]) : NetworkStatusMonitor.getRealMcc();
    }

    public static String getSimOp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2f62ecd7", new Object[0]) : NetworkStatusMonitor.simOp;
    }

    public static boolean isRoaming() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c256c89a", new Object[0])).booleanValue() : NetworkStatusMonitor.isRoaming;
    }

    public static String getWifiBSSID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1d739c27", new Object[0]) : NetworkStatusMonitor.bssid;
    }

    public static String getWifiSSID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ecf0a933", new Object[0]) : NetworkStatusMonitor.ssid;
    }

    public static NetworkStatus getNetworkStatus(Network network) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetworkStatus) ipChange.ipc$dispatch("ced3f159", new Object[]{network}) : NetworkStatusMonitor.getNetworkStatus(network);
    }

    public static String getDnsServerAddress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("424659bb", new Object[0]);
        }
        if (!NetworkStatusMonitor.dnsServers.isEmpty()) {
            return NetworkStatusMonitor.dnsServers.get(0).getHostAddress();
        }
        return NetworkStatusMonitor.getDnsServerFromSystemProperties();
    }

    public static boolean isConnected() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1c220a", new Object[0])).booleanValue();
        }
        boolean z2 = true;
        boolean z3 = Build.VERSION.SDK_INT < 24 ? !(NetworkStatusMonitor.status == NetworkStatus.NO || NetworkStatusMonitor.status == NetworkStatus.NONE) : NetworkStatusMonitor.isNetworkAvailable;
        if (!z3) {
            try {
                NetworkInfo networkInfo = NetworkStatusMonitor.getNetworkInfo();
                if (networkInfo != null) {
                    if (networkInfo.isConnected()) {
                        z = true;
                    }
                }
                z2 = z;
            } catch (Exception unused) {
            }
        } else {
            z2 = z3;
        }
        if (z2 && NetworkStatusMonitor.status == NetworkStatus.NO) {
            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.status.NetworkStatusHelper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (NetworkStatusMonitor.status != NetworkStatus.NO) {
                    } else {
                        NetworkStatusMonitor.checkNetworkStatus();
                    }
                }
            });
        }
        return z2;
    }

    public static boolean isProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29cba9ef", new Object[0])).booleanValue();
        }
        NetworkStatus networkStatus = NetworkStatusMonitor.status;
        String str = NetworkStatusMonitor.apn;
        if (networkStatus == NetworkStatus.WIFI && getWifiProxy() != null) {
            return true;
        }
        return networkStatus.isMobile() && (str.contains("wap") || ProxySetting.get() != null);
    }

    public static String getProxyType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("568af627", new Object[0]);
        }
        NetworkStatus networkStatus = NetworkStatusMonitor.status;
        return (networkStatus != NetworkStatus.WIFI || getWifiProxy() == null) ? (!networkStatus.isMobile() || !NetworkStatusMonitor.apn.contains("wap")) ? (!networkStatus.isMobile() || ProxySetting.get() == null) ? "" : "auth" : "wap" : a.ATOM_proxy;
    }

    public static Pair<String, Integer> getWifiProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("90ff9874", new Object[0]);
        }
        if (NetworkStatusMonitor.status == NetworkStatus.WIFI) {
            return NetworkStatusMonitor.proxy;
        }
        return null;
    }

    public static void printNetworkDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da07df9", new Object[0]);
            return;
        }
        try {
            NetworkStatus status = getStatus();
            StringBuilder sb = new StringBuilder(128);
            sb.append("\nNetwork detail*******************************\n");
            sb.append("Status: ");
            sb.append(status.getType());
            sb.append('\n');
            sb.append("Subtype: ");
            sb.append(getNetworkSubType());
            sb.append('\n');
            if (status != NetworkStatus.NO) {
                if (status.isMobile()) {
                    sb.append("Apn: ");
                    sb.append(getApn());
                    sb.append('\n');
                    sb.append("Carrier: ");
                    sb.append(getCarrier());
                    sb.append('\n');
                } else {
                    sb.append("BSSID: ");
                    sb.append(getWifiBSSID());
                    sb.append('\n');
                    sb.append("SSID: ");
                    sb.append(getWifiSSID());
                    sb.append('\n');
                }
            }
            if (isProxy()) {
                sb.append("Proxy: ");
                sb.append(getProxyType());
                sb.append('\n');
                Pair<String, Integer> wifiProxy = getWifiProxy();
                if (wifiProxy != null) {
                    sb.append("ProxyHost: ");
                    sb.append((String) wifiProxy.first);
                    sb.append('\n');
                    sb.append("ProxyPort: ");
                    sb.append(wifiProxy.second);
                    sb.append('\n');
                }
            }
            sb.append("*********************************************");
            ALog.i(TAG, sb.toString(), null, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public static String getUniqueId(NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75163034", new Object[]{networkStatus});
        }
        if (AwcnConfig.isVpnChangeDetectOpened()) {
            return StrategyCenter.getInstance().getUniqueId(networkStatus);
        }
        if (networkStatus.isWifi()) {
            String md5ToHex = StringUtils.md5ToHex(getWifiBSSID());
            if (TextUtils.isEmpty(md5ToHex)) {
                md5ToHex = "";
            }
            return "WIFI$" + md5ToHex;
        } else if (!networkStatus.isMobile()) {
            return "";
        } else {
            return networkStatus.getType() + "$" + getApn();
        }
    }

    public static int getRestrictBackgroundStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56d63a8c", new Object[0])).intValue() : NetworkStatusMonitor.getRestrictBackgroundStatus();
    }

    public static Network getCellularNetwork() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Network) ipChange.ipc$dispatch("948448ea", new Object[0]) : NetworkStatusMonitor.getCellularNetwork();
    }

    public static String getFormatNetwork() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b2af5718", new Object[0]) : NetworkStatusMonitor.formatNetwork();
    }

    public static boolean isVpn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d2faf5", new Object[0])).booleanValue();
        }
        if (!AwcnConfig.isVpnListenOpened()) {
            return false;
        }
        return NetworkStatusMonitor.isVPN();
    }

    public static String getLowPowerMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79ad576f", new Object[0]) : AwcnConfig.isLowPowerOpened() ? NetworkStatusMonitor.getLowPowerMode() : "";
    }

    public static boolean isSavePower() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c8f1509", new Object[0])).booleanValue();
        }
        if (!AwcnConfig.isLowPowerOpened()) {
            return false;
        }
        return NetworkStatusMonitor.isSavePower();
    }

    public static boolean isAccessPointChange(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("241ad1fb", new Object[]{str, str2, str3})).booleanValue() : NetworkStatusMonitor.isAccessPointChange(str, str2, str3);
    }

    public static int isWifiRestricted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d18f6c94", new Object[0])).intValue() : NetworkStatusMonitor.isNetworkRestricted(1) ? 1 : 0;
    }

    public static int isCellularRestricted() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8303e929", new Object[0])).intValue() : NetworkStatusMonitor.isNetworkRestricted(0) ? 1 : 0;
    }

    public static int isAirplaneMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ea428359", new Object[0])).intValue() : NetworkStatusMonitor.isAirplaneMode() ? 1 : 0;
    }
}
