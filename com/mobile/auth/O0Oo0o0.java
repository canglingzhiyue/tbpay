package com.mobile.auth;

import mtopsdk.common.util.StringUtils;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/* loaded from: classes4.dex */
public class O0Oo0o0 {
    public static String[] O000000o(boolean z) {
        String[] strArr = {"", ""};
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (!z || !nextElement.getName().toLowerCase().contains("wlan")) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if (!nextElement2.isLoopbackAddress() && !nextElement2.isLinkLocalAddress()) {
                            String hostAddress = nextElement2.getHostAddress();
                            if (!StringUtils.isEmpty(hostAddress)) {
                                if (nextElement2 instanceof Inet6Address) {
                                    sb.append(hostAddress);
                                    sb.append(",");
                                } else if (nextElement2 instanceof Inet4Address) {
                                    sb2.append(hostAddress);
                                    sb2.append(",");
                                }
                            }
                        }
                    }
                }
            }
            if (!StringUtils.isEmpty(sb)) {
                sb = sb.delete(sb.length() - 1, sb.length());
            }
            if (!StringUtils.isEmpty(sb2)) {
                sb2 = sb2.delete(sb2.length() - 1, sb2.length());
            }
            strArr[0] = sb2.toString();
            strArr[1] = sb.toString();
            O0O000o.O00000Oo("UmcIPUtils", "onlyMobileDataIp " + z + " IPV6 ip：" + sb.toString());
            O0O000o.O00000Oo("UmcIPUtils", "onlyMobileDataIp " + z + " IPV4 ip：" + sb2.toString());
            return strArr;
        } catch (Exception e) {
            e.printStackTrace();
            return strArr;
        }
    }
}
