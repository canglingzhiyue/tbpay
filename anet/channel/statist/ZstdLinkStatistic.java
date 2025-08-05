package anet.channel.statist;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "ZstdLinkStatistic")
/* loaded from: classes2.dex */
public class ZstdLinkStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public volatile String connStrategyMsg;
    @Dimension
    public volatile String errMsg;
    @Dimension
    public volatile String host;
    @Dimension
    public volatile String ret;
    @Dimension
    public volatile String scene;
    @Dimension
    public volatile String updateMsg;
    @Dimension
    public volatile String url;
    @Measure
    public volatile int overMaxLenType = -1;
    @Measure
    public volatile int retry = -1;
    @Measure
    public volatile int dictExpired = -1;
    @Measure
    public volatile int responseCode = -1;
    @Measure
    public volatile long connectTime = -1;
    @Measure
    public volatile long reqTime = -1;
    @Measure
    public volatile long storageTime = -1;

    static {
        kge.a(1281221525);
    }

    public ZstdLinkStatistic(String str, String str2) {
        this.host = str;
        this.scene = str2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("[ZstdLinkStatistic] url=");
        sb.append(this.url);
        sb.append(",host=");
        sb.append(this.host);
        sb.append(",scene=");
        sb.append(this.scene);
        sb.append(",updateMsg=");
        sb.append(this.updateMsg);
        sb.append(",connStrategyMsg=");
        sb.append(this.connStrategyMsg);
        sb.append(",ret=");
        sb.append(this.ret);
        sb.append(",errMsg=");
        sb.append(this.errMsg);
        sb.append(",overMaxLenType=");
        sb.append(this.overMaxLenType);
        sb.append(",retry=");
        sb.append(this.retry);
        sb.append(",dictExpired=");
        sb.append(this.dictExpired);
        sb.append(",responseCode=");
        sb.append(this.responseCode);
        sb.append(",connectTime=");
        sb.append(this.connectTime);
        sb.append(",reqTime=");
        sb.append(this.reqTime);
        sb.append(",storageTime=");
        sb.append(this.storageTime);
        return sb.toString();
    }
}
