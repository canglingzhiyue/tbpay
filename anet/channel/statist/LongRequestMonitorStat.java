package anet.channel.statist;

import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "long_request_monitor")
/* loaded from: classes2.dex */
public class LongRequestMonitorStat extends StatObject {
    @Dimension
    public String header;
    @Measure
    public int headerSize;
    @Dimension
    public int httpCode;
    @Dimension
    public String maxHeader;
    @Measure
    public int maxHeaderSize;
    @Dimension
    public String method;
    @Dimension
    public String originUrl;
    @Dimension
    public String refer;
    @Dimension
    public int reportType;
    @Dimension
    public String simpleUrl;
    @Measure
    public int urlSize;

    static {
        kge.a(-1030414509);
    }

    public LongRequestMonitorStat(String str) {
        this.simpleUrl = str;
    }
}
