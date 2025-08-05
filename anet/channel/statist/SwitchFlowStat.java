package anet.channel.statist;

import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "switch_flow")
/* loaded from: classes2.dex */
public class SwitchFlowStat extends StatObject {
    @Dimension
    public String host;
    @Dimension
    public String scene;
    @Dimension
    public int smoothReconnect;

    static {
        kge.a(-793295122);
    }

    public SwitchFlowStat(String str, String str2) {
        this.host = str;
        this.scene = str2;
    }
}
