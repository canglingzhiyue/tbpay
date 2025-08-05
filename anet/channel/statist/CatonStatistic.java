package anet.channel.statist;

import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "caton_monitor")
/* loaded from: classes2.dex */
public class CatonStatistic extends RequestMonitor {
    static {
        kge.a(1638956947);
    }

    public CatonStatistic(RequestStatistic requestStatistic) {
        super(requestStatistic);
    }
}
