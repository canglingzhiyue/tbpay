package anet.channel.statist;

import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "background_request_monitor")
/* loaded from: classes2.dex */
public class BackgroundStatistic extends RequestMonitor {
    static {
        kge.a(-1240995894);
    }

    public BackgroundStatistic(RequestStatistic requestStatistic) {
        super(requestStatistic);
    }
}
