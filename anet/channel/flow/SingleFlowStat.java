package anet.channel.flow;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.RequestStatistic;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class SingleFlowStat implements Serializable {
    public String host;
    public String launchTime;
    public OneFlowStat oneFlowStat;
    public String url;

    static {
        kge.a(1625715500);
        kge.a(1028243835);
    }

    public SingleFlowStat(RequestStatistic requestStatistic, OneFlowStat oneFlowStat) {
        this.launchTime = null;
        this.host = null;
        this.url = null;
        this.oneFlowStat = null;
        this.oneFlowStat = oneFlowStat;
        this.url = requestStatistic.url;
        this.host = requestStatistic.host;
        this.launchTime = GlobalAppRuntimeInfo.getLaunchTime();
    }
}
