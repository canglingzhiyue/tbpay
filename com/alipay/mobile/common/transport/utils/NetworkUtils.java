package com.alipay.mobile.common.transport.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.wifi.WifiManager;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import android.text.format.Formatter;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import org.apache.http.HttpHost;
import tb.shc;

/* loaded from: classes3.dex */
public class NetworkUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANDROID_NETWORK_CLASS_2_G = 1;
    public static final int ANDROID_NETWORK_CLASS_3_G = 2;
    public static final int ANDROID_NETWORK_CLASS_4_G = 3;
    public static final int NETWORK_TYPE_2G = 1;
    public static final int NETWORK_TYPE_3G = 2;
    public static final int NETWORK_TYPE_4G = 4;
    public static final int NETWORK_TYPE_5G = 5;
    public static final int NETWORK_TYPE_EHRPD = 14;
    public static final int NETWORK_TYPE_GSM = 16;
    public static final int NETWORK_TYPE_HSPAP = 15;
    public static final int NETWORK_TYPE_INVALID = 0;
    public static final int NETWORK_TYPE_IWLAN = 18;
    public static final int NETWORK_TYPE_LTE = 13;
    public static final int NETWORK_TYPE_LTE_CA = 19;
    public static final int NETWORK_TYPE_TD_SCDMA = 17;
    public static final int NETWORK_TYPE_WIFI = 3;

    private static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return 1;
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
                return 2;
            case 13:
            case 18:
            case 19:
            case 20:
                return 4;
            default:
                return 0;
        }
    }

    public static boolean isWiFiMobileNetwork(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41bc8a58", new Object[]{context})).booleanValue();
        }
        if (context != null) {
            return getNetworkType(context) == 3;
        }
        LogCatUtil.error("NetworkUtils", "[isWiFiMobileNetwork] Severe exception，application context is null. ");
        return false;
    }

    public static boolean is4GMobileNetwork(NetworkInfo networkInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f24ce485", new Object[]{networkInfo})).booleanValue() : networkInfo != null && getMobileNetworkClass(networkInfo) == 4;
    }

    public static boolean is4GMobileNetwork(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b5206696", new Object[]{context})).booleanValue() : context != null && getNetworkType(context) == 4;
    }

    public static boolean is3GMobileNetwork(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f233fd37", new Object[]{context})).booleanValue() : context != null && getNetworkType(context) == 2;
    }

    public static boolean is3GMobileNetwork(NetworkInfo networkInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2f607b26", new Object[]{networkInfo})).booleanValue() : networkInfo != null && getMobileNetworkClass(networkInfo) == 2;
    }

    public static boolean is2GMobileNetwork(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2f4793d8", new Object[]{context})).booleanValue() : context != null && getNetworkType(context) == 1;
    }

    public static int getNetworkType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("263d9902", new Object[]{context})).intValue();
        }
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return 0;
        }
        int type = activeNetworkInfo.getType();
        if (type == 1) {
            return 3;
        }
        if (type == 0) {
            return getMobileNetworkClass(activeNetworkInfo);
        }
        return 0;
    }

    public static HttpHost getProxy(Context context) {
        NetworkInfo networkInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("ee4da67b", new Object[]{context});
        }
        try {
            networkInfo = getActiveNetworkInfo(context);
        } catch (Throwable th) {
            LogCatUtil.error("NetworkUtils", th);
            networkInfo = null;
        }
        if (networkInfo == null || !networkInfo.isAvailable()) {
            return null;
        }
        String defaultHost = Proxy.getDefaultHost();
        int defaultPort = Proxy.getDefaultPort();
        if (!StringUtils.isEmpty(defaultHost) && defaultPort > 0 && defaultPort < 65535) {
            return new HttpHost(defaultHost, defaultPort);
        }
        return null;
    }

    public static HttpHost getProxyOfEnhanced(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("ecad2f48", new Object[]{context});
        }
        HttpHost proxy = getProxy(context);
        if (proxy == null) {
            return null;
        }
        if (!TransportStrategy.isMobileWapProxyIp(proxy.getHostName()) || getNetworkType(context) != 3) {
            return proxy;
        }
        LogCatUtil.warn("NetworkUtils", " The proxy ip is wap = [" + proxy.getHostName() + "], but is now wifi network !");
        return null;
    }

    public static NetworkInfo getActiveNetworkInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkInfo) ipChange.ipc$dispatch("6ad73668", new Object[]{context});
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable th) {
            LogCatUtil.error("NetworkUtils", "getActiveNetworkInfo exception ", th);
            return null;
        }
    }

    public static int getNetType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e725e73", new Object[]{context})).intValue();
        }
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getType();
        }
        return -1;
    }

    public static boolean isNetworkAvailable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc285c0", new Object[]{context})).booleanValue();
        }
        try {
            NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnectedOrConnecting()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            LogCatUtil.warn("NetworkUtils", "isNetworkAvailable exception : " + e.toString());
            return false;
        }
    }

    public static int getMobileNetworkClass(NetworkInfo networkInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("908ee6a1", new Object[]{networkInfo})).intValue();
        }
        if (networkInfo != null) {
            return getMobileNetworkClass(networkInfo.getSubtype());
        }
        return 0;
    }

    public static int getMobileNetworkClass(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e7d04ed", new Object[]{new Integer(i)})).intValue();
        }
        int a2 = a(i);
        if (a2 == 0) {
            LogCatUtil.debug("NetworkUtils", "getMobileNetworkClass, networkType= " + i + ",result= " + a2);
        }
        return a2;
    }

    public static boolean isVpnUsed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d608df52", new Object[0])).booleanValue() : getVpnNetworkInterface() != null;
    }

    public static NetworkInterface getVpnNetworkInterface() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkInterface) ipChange.ipc$dispatch("5671bb7", new Object[0]);
        }
        try {
        } catch (Throwable th) {
            LogCatUtil.warn("NetworkUtils", "if isVpnUsed fail", th);
        }
        if (!TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.GET_VPN_INTER_SWITCH, "T")) {
            LogCatUtil.warn("NetworkUtils", "GET_VPN_INTER_SWITCH off");
            return null;
        }
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        if (networkInterfaces == null) {
            return null;
        }
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface nextElement = networkInterfaces.nextElement();
            if (nextElement.isUp() && nextElement.getInterfaceAddresses().size() != 0) {
                String name = nextElement.getName();
                if (!StringUtils.isEmpty(name) && (name.startsWith("tun") || name.startsWith(shc.SCENE_TAP) || name.startsWith("ppp"))) {
                    LogCatUtil.debug("NetworkUtils", "isVpnUsed. Used vpn, name: " + nextElement.getName());
                    return nextElement;
                }
            }
        }
        return null;
    }

    public static List getDnsServer() {
        int i;
        Network[] allNetworks;
        try {
        } catch (Throwable th) {
            LogCatUtil.error("NetworkUtils", "getDnsServer ex:" + th.toString());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            ConnectivityManager connectivityManager = (ConnectivityManager) TransportEnvUtil.getContext().getSystemService("connectivity");
            for (Network network : connectivityManager.getAllNetworks()) {
                if (connectivityManager.getNetworkInfo(network).isAvailable()) {
                    return connectivityManager.getLinkProperties(network).getDnsServers();
                }
            }
            return null;
        }
        Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"net.dns1", "net.dns2", "net.dns3"};
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str = (String) method.invoke(null, strArr[i2]);
            if (!StringUtils.isEmpty(str) && !arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static String getLocalIPv4Address() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ceb129bf", new Object[0]);
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return null;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if ((nextElement2 instanceof Inet4Address) && !nextElement2.isLoopbackAddress() && !nextElement2.isLinkLocalAddress()) {
                        LogCatUtil.debug("NetworkUtils", "ipv4,hostName:" + nextElement2.getHostName() + ",address:" + nextElement2.getHostAddress() + ",name:" + nextElement.getName());
                        return nextElement2.getHostAddress();
                    }
                }
            }
            return "";
        } catch (Throwable th) {
            LogCatUtil.error("NetworkUtils", "getLocalIPv4Address ex:" + th.toString());
            return "";
        }
    }

    public static String getLocalIPv6Address() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2150f2c1", new Object[0]);
        }
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return null;
            }
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    if ((nextElement2 instanceof Inet6Address) && !nextElement2.isLoopbackAddress() && !nextElement2.isLinkLocalAddress()) {
                        LogCatUtil.debug("NetworkUtils", "ipv6,hostName:" + nextElement2.getHostName() + ",address:" + nextElement2.getHostAddress() + ",name:" + nextElement.getName());
                        return nextElement2.getHostAddress();
                    }
                }
            }
            return "";
        } catch (Throwable th) {
            LogCatUtil.error("NetworkUtils", "getLocalIPv6Address ex:" + th.toString());
            return "";
        }
    }

    public static String getGateWayAddress() {
        DhcpInfo dhcpInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eebd6093", new Object[0]);
        }
        try {
            Context context = TransportEnvUtil.getContext();
            return (3 == getNetworkType(context) && (dhcpInfo = ((WifiManager) context.getSystemService("wifi")).getDhcpInfo()) != null) ? Formatter.formatIpAddress(dhcpInfo.gateway) : "";
        } catch (Throwable th) {
            LogCatUtil.error("NetworkUtils", "getGateWay ex: " + th.toString());
            return "";
        }
    }
}
