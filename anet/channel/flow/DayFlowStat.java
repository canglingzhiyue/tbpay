package anet.channel.flow;

import anet.channel.statist.RequestStatistic;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes2.dex */
public class DayFlowStat implements Serializable {
    public OneFlowStat oneFlowStat;
    public int startUpCount = 0;

    static {
        kge.a(-349559428);
        kge.a(1028243835);
    }

    public DayFlowStat(RequestStatistic requestStatistic, OneFlowStat oneFlowStat) {
        this.oneFlowStat = null;
        this.oneFlowStat = oneFlowStat;
    }
}
