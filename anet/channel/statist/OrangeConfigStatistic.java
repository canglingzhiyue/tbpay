package anet.channel.statist;

import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "orange_config_error_stat")
/* loaded from: classes2.dex */
public class OrangeConfigStatistic extends StatObject {
    @Dimension
    public String errorMsg;
    @Dimension
    public String nameSpace;

    static {
        kge.a(-1950409176);
    }

    public OrangeConfigStatistic(String str, String str2) {
        this.nameSpace = str;
        this.errorMsg = str2;
    }
}
