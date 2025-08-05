package anet.channel.statist;

import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "block_scene")
/* loaded from: classes2.dex */
public class BlockingSceneStat extends StatObject {
    @Dimension
    public volatile String bizId;
    @Dimension
    public int errorCode;
    @Dimension
    public volatile String f_refer;
    @Dimension
    public volatile String host;
    @Dimension
    public volatile String ip;
    @Dimension
    public int isFromExternal;
    @Measure(max = 60000.0d)
    public volatile long oneWayTime;
    @Dimension
    public volatile int port;
    @Dimension
    public volatile String protocolType;
    @Dimension
    public volatile int ret;
    @Dimension
    public long sinceInitTime;
    @Dimension
    public int startType;
    @Dimension
    public volatile String url;

    static {
        kge.a(-500818349);
    }

    public BlockingSceneStat(RequestStatistic requestStatistic) {
        this.startType = 0;
        this.isFromExternal = 0;
        this.errorCode = 0;
        this.oneWayTime = 0L;
        if (requestStatistic != null) {
            this.host = requestStatistic.host;
            this.ip = requestStatistic.ip;
            this.port = requestStatistic.port;
            this.url = requestStatistic.url;
            this.bizId = requestStatistic.bizId;
            this.f_refer = requestStatistic.f_refer;
            this.ret = requestStatistic.ret;
            this.protocolType = requestStatistic.protocolType;
            this.startType = requestStatistic.startType;
            this.sinceInitTime = requestStatistic.sinceInitTime;
            this.isFromExternal = requestStatistic.isFromExternal;
            this.errorCode = requestStatistic.statusCode;
            this.oneWayTime = requestStatistic.oneWayTime;
        }
    }
}
