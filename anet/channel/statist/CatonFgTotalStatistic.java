package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import tb.kge;
import tb.mto;

@Monitor(module = "networkPrefer", monitorPoint = "caton_fg_total_monitor")
/* loaded from: classes2.dex */
public class CatonFgTotalStatistic extends CatonTotalStatistic {
    @Dimension
    public String commitType;
    @Dimension
    public String nettype;
    @Measure
    public double useTime;

    static {
        kge.a(-939452950);
    }

    public CatonFgTotalStatistic(String str, String str2, String str3, boolean z, int i, double d) {
        super(str2, str3, z, i);
        this.useTime = mto.a.GEO_NOT_SUPPORT;
        this.nettype = NetworkStatusHelper.getNetworkSubType();
        this.commitType = str;
        this.useTime = d;
    }
}
