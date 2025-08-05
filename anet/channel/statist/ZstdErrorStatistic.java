package anet.channel.statist;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "ZstdErrorStatistic")
/* loaded from: classes2.dex */
public class ZstdErrorStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public volatile String errorCode;
    @Dimension
    public volatile String host;
    @Measure
    public volatile int isSuccess = 0;
    @Measure
    public volatile int isZstdNotReadyUse = 0;
    @Dimension
    public volatile String scene;
    @Dimension
    public volatile String url;

    static {
        kge.a(976032489);
    }

    public ZstdErrorStatistic(String str, String str2, String str3) {
        this.url = str2;
        this.host = str;
        this.scene = str3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("[ZstdErrorStatistic] scene=");
        sb.append(this.scene);
        sb.append(",host=");
        sb.append(this.host);
        sb.append(",url=");
        sb.append(this.url);
        sb.append(",errorCode=");
        sb.append(this.errorCode);
        sb.append(",isSuccess=");
        sb.append(this.isSuccess);
        sb.append(",isZstdNotReadyUse=");
        sb.append(this.isZstdNotReadyUse);
        return sb.toString();
    }
}
