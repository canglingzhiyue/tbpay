package anet.channel.statist;

import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "amdcAseResult")
/* loaded from: classes.dex */
public class AmdcAesStatistic extends StatObject {
    @Dimension
    public String amdcAesResult;
    @Measure
    public volatile long amdcAesTime;
    @Dimension
    public String amdcAesType;

    static {
        kge.a(1181945732);
    }
}
