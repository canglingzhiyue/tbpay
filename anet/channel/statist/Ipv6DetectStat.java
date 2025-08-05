package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.Inet64Util;
import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "ipv6_detect")
/* loaded from: classes2.dex */
public class Ipv6DetectStat extends StatObject {
    @Dimension
    public String cip;
    @Dimension
    public long detectTime;
    @Dimension
    public String detectUrl;
    @Dimension
    public String host;
    @Dimension
    public String ip;
    @Dimension
    public int ipv4MTU;
    @Dimension
    public int ipv6MTU;
    @Dimension
    public String localIpv4;
    @Dimension
    public String localIpv6;
    @Dimension
    public String netType = NetworkStatusHelper.getNetworkSubType();
    @Dimension
    public int ipStack = Inet64Util.getStackType();
    @Dimension
    public int ret = -1;

    static {
        kge.a(-1628547114);
    }

    public Ipv6DetectStat(String str) {
        this.host = str;
        Inet64Util.getIpAddressByInterfaces();
        this.localIpv4 = Inet64Util.mLocalIpv4;
        this.localIpv6 = Inet64Util.mLocalIpv6;
        this.ipv4MTU = Inet64Util.mLocalIpv4MTU;
        this.ipv6MTU = Inet64Util.mLocalIpv6MTU;
    }
}
