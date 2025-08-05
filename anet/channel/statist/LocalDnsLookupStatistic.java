package anet.channel.statist;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "LocalDnsLookupStatistic")
/* loaded from: classes2.dex */
public class LocalDnsLookupStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public volatile String host;
    @Dimension
    public volatile String useMcc;
    @Measure
    public volatile int isUseHTTP3 = -1;
    @Measure
    public volatile int isUseHTTP2 = -1;

    static {
        kge.a(662910816);
    }

    public LocalDnsLookupStatistic(String str) {
        this.host = str;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("[LocalDnsLookupStatistic] host=");
        sb.append(this.host);
        sb.append(",useMcc=");
        sb.append(this.useMcc);
        sb.append(",isUseHTTP3=");
        sb.append(this.isUseHTTP3);
        sb.append(",isUseHTTP2=");
        sb.append(this.isUseHTTP2);
        return sb.toString();
    }
}
