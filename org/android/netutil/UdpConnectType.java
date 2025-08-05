package org.android.netutil;

import com.android.alibaba.ip.runtime.IpChange;
import org.android.spdy.SpdyAgent;

/* loaded from: classes.dex */
public class UdpConnectType {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private static native int nativeTestUdpConnectIpv4();

    private static native int nativeTestUdpConnectIpv6();

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : SpdyAgent.checkLoadSucc() && nativeTestUdpConnectIpv4() != 0;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : SpdyAgent.checkLoadSucc() && nativeTestUdpConnectIpv6() != 0;
    }
}
