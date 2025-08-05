package anet.channel.statist;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "ErrorStatistic")
/* loaded from: classes2.dex */
public class ErrorStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public volatile String illegalUrlType;
    @Dimension
    public volatile int statusCode;
    @Dimension
    public volatile String url = "";

    static {
        kge.a(-1109263584);
    }

    public ErrorStatistic(String str, int i) {
        this.illegalUrlType = "";
        this.statusCode = 0;
        this.illegalUrlType = str;
        this.statusCode = i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("[ErrorStatistic] illegalUrlType=");
        sb.append(this.illegalUrlType);
        sb.append(",statusCode=");
        sb.append(this.statusCode);
        sb.append(",url=");
        sb.append(this.url);
        return sb.toString();
    }
}
