package tb;

import android.content.Context;
import com.alibaba.analytics.core.network.NetworkUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class aon {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int IPV4_ONLY = 1;
    public static final int IPV6_ONLY = 2;
    public static final int IP_DUAL_STACK = 3;
    public static final int IP_STACK_UNKNOWN = 0;

    /* renamed from: a  reason: collision with root package name */
    private static int f25478a;

    static {
        kge.a(-1649496938);
        f25478a = -1;
    }

    public static synchronized int a() {
        synchronized (aon.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
            } else if (f25478a >= 0) {
                return f25478a;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                f25478a = 0;
                try {
                    f25478a = b();
                } catch (Exception unused) {
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                aoo.a(f25478a);
                aoo.a(currentTimeMillis2);
                apr.d("Inet64Util", "detectIpStack status", Integer.valueOf(f25478a));
                return f25478a;
            }
        }
    }

    private static int b() throws SocketException {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        TreeMap treeMap = new TreeMap();
        Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
        while (it.hasNext()) {
            NetworkInterface networkInterface = (NetworkInterface) it.next();
            if (!networkInterface.getInterfaceAddresses().isEmpty()) {
                String displayName = networkInterface.getDisplayName();
                apr.a("Inet64Util", "find NetworkInterface", displayName);
                int i2 = 0;
                for (InterfaceAddress interfaceAddress : networkInterface.getInterfaceAddresses()) {
                    InetAddress address = interfaceAddress.getAddress();
                    if (address instanceof Inet6Address) {
                        Inet6Address inet6Address = (Inet6Address) address;
                        if (!a(inet6Address)) {
                            apr.d("Inet64Util", "Found IPv6 address", inet6Address.toString());
                            i2 |= 2;
                        }
                    } else if (address instanceof Inet4Address) {
                        Inet4Address inet4Address = (Inet4Address) address;
                        if (!a(inet4Address) && !inet4Address.getHostAddress().startsWith("192.168.43.")) {
                            apr.a("Inet64Util", "Found IPv4 address", inet4Address.toString());
                            i2 |= 1;
                        }
                    }
                }
                if (i2 != 0) {
                    treeMap.put(displayName.toLowerCase(), Integer.valueOf(i2));
                }
            }
        }
        if (treeMap.isEmpty()) {
            return 0;
        }
        if (treeMap.size() == 1) {
            return ((Integer) treeMap.firstEntry().getValue()).intValue();
        }
        Context k = aob.a().k();
        String str = null;
        if (NetworkUtil.f(k)) {
            str = "wlan";
        } else if (NetworkUtil.e(k)) {
            str = "rmnet";
        }
        if (str != null) {
            Iterator it2 = treeMap.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (((String) entry.getKey()).startsWith(str)) {
                    i = ((Integer) entry.getValue()).intValue();
                    break;
                }
            }
        }
        if (i == 2 && treeMap.containsKey("v4-wlan0")) {
            return 3;
        }
        return i;
    }

    private static boolean a(InetAddress inetAddress) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b62ebcfa", new Object[]{inetAddress})).booleanValue() : inetAddress.isLoopbackAddress() || inetAddress.isLinkLocalAddress() || inetAddress.isAnyLocalAddress();
    }
}
