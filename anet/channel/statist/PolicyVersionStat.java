package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "policyVersion")
/* loaded from: classes2.dex */
public class PolicyVersionStat extends StatObject {
    @Dimension
    public String host;
    @Dimension
    public int reportType;
    @Dimension
    public int version;
    @Dimension
    public String netType = NetworkStatusHelper.getNetworkSubType();
    @Dimension
    public String mnc = NetworkStatusHelper.getSimOp();

    static {
        kge.a(-1628590910);
    }

    public PolicyVersionStat(String str, int i) {
        this.host = str;
        this.version = i;
    }
}
