package anet.channel.statist;

import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "wifi_fg_detect_monitor")
/* loaded from: classes2.dex */
public class WifiFgDetectStatic extends StatObject {
    @Dimension
    public String url;
    @Dimension
    public int ret = 0;
    @Dimension
    public String uniqueId = "";
    @Measure
    public volatile long detectTime = 0;

    static {
        kge.a(-984775745);
    }

    public WifiFgDetectStatic(String str) {
        this.url = "";
        this.url = str;
    }
}
