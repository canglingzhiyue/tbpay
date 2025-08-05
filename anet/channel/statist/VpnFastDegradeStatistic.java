package anet.channel.statist;

import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "vpn_fast_degrade_monitor")
/* loaded from: classes2.dex */
public class VpnFastDegradeStatistic extends RequestMonitor {
    static {
        kge.a(1055104402);
    }

    public VpnFastDegradeStatistic(RequestStatistic requestStatistic) {
        super(requestStatistic);
    }
}
