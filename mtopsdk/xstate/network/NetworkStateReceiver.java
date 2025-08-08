package mtopsdk.xstate.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.ConnectionUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.xstate.NetworkClassEnum;
import tb.kge;

/* loaded from: classes9.dex */
public class NetworkStateReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f25047a;
    public static volatile String b;
    public static volatile String c;
    private static ConnectivityManager d;
    private static WifiManager e;

    public static /* synthetic */ Object ipc$super(NetworkStateReceiver networkStateReceiver, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-2077359988);
        d = null;
        e = null;
        f25047a = "";
        b = "";
        c = "unknown";
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("mtopsdk.NetworkStateReceiver", "[onReceive] networkStateReceiver onReceive");
        }
        MtopSDKThreadPoolExecutorFactory.submit(new Runnable() { // from class: mtopsdk.xstate.network.NetworkStateReceiver.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    NetworkStateReceiver.this.a(context);
                } catch (Throwable th) {
                    TBSdkLog.e("mtopsdk.NetworkStateReceiver", "[onReceive] updateNetworkStatus error", th);
                }
            }
        });
    }

    public void a(Context context) {
        NetworkInfo networkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (context == null) {
        } else {
            WifiInfo wifiInfo = null;
            try {
                if (d == null) {
                    d = (ConnectivityManager) context.getSystemService("connectivity");
                }
                networkInfo = d.getActiveNetworkInfo();
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.NetworkStateReceiver", "getNetworkInfo error.", th);
                networkInfo = null;
            }
            if (networkInfo == null || !networkInfo.isConnected()) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.NetworkStateReceiver", "[updateNetworkStatus]no network");
                }
                mtopsdk.xstate.a.c("nq", NetworkClassEnum.NET_NO.getNetClass());
                mtopsdk.xstate.a.c("netType", NetworkClassEnum.NET_NO.getNetClass());
                return;
            }
            int type = networkInfo.getType();
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.NetworkStateReceiver", "[updateNetworkStatus] NetworkInfo isConnected=" + networkInfo.isConnected() + ", isAvailable=" + networkInfo.isAvailable() + ", type=" + a(type));
            }
            if (type == 0) {
                int subtype = networkInfo.getSubtype();
                NetworkClassEnum b2 = a.b(subtype);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    TBSdkLog.d("mtopsdk.NetworkStateReceiver", "[updateNetworkStatus]Mobile network," + b2.getNetClass());
                }
                c = a(networkInfo.getExtraInfo());
                mtopsdk.xstate.a.c("nq", b2.getNetClass());
                mtopsdk.xstate.a.c("netType", a.a(subtype));
            } else if (type != 1) {
                if (type == 9) {
                    mtopsdk.xstate.a.c("nq", NetworkClassEnum.NET_ETHERNET.getNetClass());
                    mtopsdk.xstate.a.c("netType", NetworkClassEnum.NET_ETHERNET.getNetClass());
                    return;
                }
                String a2 = a(type);
                mtopsdk.xstate.a.c("nq", a2);
                mtopsdk.xstate.a.c("netType", a2);
            } else {
                if (RemoteConfig.getInstance().removeWifiInfo) {
                    b = "02:00:00:00:00:00";
                    f25047a = "<unknown ssid>";
                } else {
                    try {
                        if (e == null) {
                            e = (WifiManager) context.getSystemService("wifi");
                        }
                        wifiInfo = e.getConnectionInfo();
                    } catch (Throwable th2) {
                        TBSdkLog.e("mtopsdk.NetworkStateReceiver", "[updateNetworkStatus]getWifiInfo error.", th2);
                    }
                    if (wifiInfo != null) {
                        b = wifiInfo.getBSSID();
                        f25047a = wifiInfo.getSSID();
                    }
                }
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.NetworkStateReceiver", "[updateNetworkStatus]WIFI network.ssid= " + f25047a + ", bssid=" + b);
                }
                mtopsdk.xstate.a.c("nq", NetworkClassEnum.NET_WIFI.getNetClass());
                mtopsdk.xstate.a.c("netType", NetworkClassEnum.NET_WIFI.getNetClass());
            }
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str)) {
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

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        switch (i) {
            case 0:
                return "MOBILE";
            case 1:
                return "WIFI";
            case 2:
                return "MOBILE_MMS";
            case 3:
                return "MOBILE_SUPL";
            case 4:
                return "MOBILE_DUN";
            case 5:
                return "MOBILE_HIPRI";
            case 6:
                return "WIMAX";
            case 7:
                return "BLUETOOTH";
            case 8:
                return "DUMMY";
            case 9:
                return "ETHERNET";
            case 10:
                return "MOBILE_FOTA";
            case 11:
                return "MOBILE_IMS";
            case 12:
                return "MOBILE_CBS";
            case 13:
                return "WIFI_P2P";
            case 14:
                return "MOBILE_IA";
            case 15:
                return "MOBILE_EMERGENCY";
            case 16:
                return RPCDataItems.PROXY;
            case 17:
                return "VPN";
            default:
                return Integer.toString(i);
        }
    }
}
