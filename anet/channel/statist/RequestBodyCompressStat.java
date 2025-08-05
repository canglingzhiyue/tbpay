package anet.channel.statist;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "request_body_compress_stat")
/* loaded from: classes2.dex */
public class RequestBodyCompressStat extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public int deflateRet;
    @Measure
    public volatile long deflateSize;
    @Dimension
    public long deflateTime;
    @Dimension
    public String deflateType;
    @Dimension
    public String host;
    @Measure
    public volatile long inflateSize;
    @Dimension
    public String url;

    static {
        kge.a(-1063144369);
    }

    public RequestBodyCompressStat(String str, String str2, int i, String str3, long j, long j2, long j3) {
        this.host = str;
        this.url = str2;
        this.deflateRet = i;
        this.deflateType = str3;
        this.deflateTime = j;
        this.inflateSize = j2;
        this.deflateSize = j3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(256);
        sb.append("[RequestBodyCompressStat] deflateRet=");
        sb.append(this.deflateRet);
        sb.append(",host=");
        sb.append(this.host);
        sb.append(",deflateType=");
        sb.append(this.deflateType);
        sb.append(",deflateTime=");
        sb.append(this.deflateTime);
        sb.append(",inflateSize=");
        sb.append(this.inflateSize);
        sb.append(",deflateSize=");
        sb.append(this.deflateSize);
        sb.append(",url=");
        sb.append(this.url);
        return sb.toString();
    }
}
