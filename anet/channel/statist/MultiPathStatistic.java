package anet.channel.statist;

import anet.channel.AwcnConfig;
import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = AwcnConfig.MULTI_PATH_MONITOR_KEY)
/* loaded from: classes2.dex */
public class MultiPathStatistic extends RequestMonitor {
    static {
        kge.a(1641454826);
    }

    public MultiPathStatistic(RequestStatistic requestStatistic) {
        super(requestStatistic);
    }
}
