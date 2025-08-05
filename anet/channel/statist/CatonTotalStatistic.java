package anet.channel.statist;

import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "caton_total_monitor")
/* loaded from: classes2.dex */
public class CatonTotalStatistic extends StatObject {
    @Measure
    public int catonCount;
    @Dimension
    public String endTime;
    @Dimension
    public boolean isNetworkChange;
    @Dimension
    public String startTime;

    static {
        kge.a(1832949257);
    }

    public CatonTotalStatistic(String str, String str2, boolean z, int i) {
        this.isNetworkChange = false;
        this.catonCount = 0;
        this.startTime = str;
        this.endTime = str2;
        this.isNetworkChange = z;
        this.catonCount = i;
    }
}
