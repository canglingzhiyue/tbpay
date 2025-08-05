package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Monitor(module = "networkPrefer", monitorPoint = "CustomFrame")
/* loaded from: classes.dex */
public class CustomFrameStat extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public String connType;
    @Dimension
    public int dataChannel;
    @Dimension
    public int dataQoS;
    @Dimension
    public int errCode;
    @Dimension
    public String host;
    @Dimension
    public boolean isAccs;
    @Dimension
    public int ret = 0;
    @Dimension
    public String netType = NetworkStatusHelper.getStatus().toString();

    static {
        kge.a(1888713976);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CustomFrameStat{host='" + this.host + "', isAccs=" + this.isAccs + ", ret=" + this.ret + ", errCode=" + this.errCode + ", netType='" + this.netType + ", connType='" + this.connType + ", dataChannel=" + this.dataChannel + ", dataQoS=" + this.dataQoS + "'}";
    }
}
