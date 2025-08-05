package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "http3_detect")
/* loaded from: classes2.dex */
public class Http3DetectStat extends StatObject {
    @Dimension
    public int code;
    @Dimension
    public String host;
    @Dimension
    public String ip;
    @Dimension
    public String isBg;
    @Dimension
    public volatile String netType;
    @Dimension
    public String protocol;
    @Dimension
    public int ret;

    static {
        kge.a(-1580869974);
    }

    public Http3DetectStat(String str, IConnStrategy iConnStrategy) {
        this.host = str;
        if (iConnStrategy != null) {
            this.ip = iConnStrategy.getIp();
            this.protocol = iConnStrategy.getProtocol().protocol;
        }
        this.netType = NetworkStatusHelper.getNetworkSubType();
    }
}
