package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.util.Inet64Util;
import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "horseRace")
/* loaded from: classes2.dex */
public class HorseRaceStat extends StatObject {
    @Dimension
    public volatile int connErrorCode;
    @Measure
    public volatile long connTime;
    @Dimension
    public volatile String host;
    @Dimension
    public volatile String ip;
    @Dimension
    public volatile String localIP;
    @Dimension
    public volatile String path;
    @Dimension
    public volatile int pingSuccessCount;
    @Dimension
    public volatile int pingTimeoutCount;
    @Dimension
    public volatile int port;
    @Dimension
    public volatile String protocol;
    @Dimension
    public volatile int reqErrorCode;
    @Measure
    public volatile long reqTime;
    @Dimension
    public volatile int connRet = 0;
    @Dimension
    public volatile int reqRet = 0;
    @Dimension
    public volatile String nettype = NetworkStatusHelper.getNetworkSubType();
    @Dimension
    public volatile String mnc = NetworkStatusHelper.getSimOp();
    @Dimension
    public volatile String bssid = NetworkStatusHelper.getWifiBSSID();
    @Dimension
    public volatile int ipStackType = Inet64Util.getStackType();

    static {
        kge.a(1182416330);
    }

    public HorseRaceStat(String str, StrategyResultParser.Strategy strategy) {
        this.host = str;
        this.ip = strategy.ip;
        this.port = strategy.aisles.port;
        this.protocol = ConnProtocol.valueOf(strategy.aisles).name;
        this.path = strategy.path;
    }
}
