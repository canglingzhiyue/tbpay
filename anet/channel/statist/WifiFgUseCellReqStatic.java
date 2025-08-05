package anet.channel.statist;

import tb.kge;
import tb.mto;

@Monitor(module = "networkPrefer", monitorPoint = "wifi_fg_use_cell_monitor")
/* loaded from: classes2.dex */
public class WifiFgUseCellReqStatic extends RequestMonitor {
    @Dimension
    public volatile String scene;
    @Measure
    public volatile double useForceCellFlowByDay;

    static {
        kge.a(22624497);
    }

    public WifiFgUseCellReqStatic(RequestStatistic requestStatistic, String str) {
        super(requestStatistic);
        this.useForceCellFlowByDay = mto.a.GEO_NOT_SUPPORT;
        this.scene = "";
        this.scene = str;
    }
}
