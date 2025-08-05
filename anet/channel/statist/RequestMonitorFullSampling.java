package anet.channel.statist;

import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "request_monitor_full_sampling")
/* loaded from: classes2.dex */
public class RequestMonitorFullSampling extends RequestMonitor {
    static {
        kge.a(2048409081);
    }

    public RequestMonitorFullSampling(RequestStatistic requestStatistic) {
        super(requestStatistic);
    }
}
