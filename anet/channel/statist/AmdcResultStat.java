package anet.channel.statist;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.Inet64Util;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

@Monitor(module = "networkPrefer", monitorPoint = "amdcResult")
/* loaded from: classes.dex */
public class AmdcResultStat extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public String bssid;
    @Dimension
    public int code;
    @Dimension
    public String host;
    @Dimension
    public boolean isContainHttp3;
    @Dimension
    public boolean isContainIpv6;
    @Dimension
    public String trace;
    @Dimension
    public String netType = NetworkStatusHelper.getStatus().toString();
    @Dimension
    public String proxyType = NetworkStatusHelper.getProxyType();
    @Dimension
    public String ttid = GlobalAppRuntimeInfo.getTtid();
    @Dimension
    public int ipStackType = Inet64Util.getStackType();

    static {
        kge.a(-1206970604);
    }

    public AmdcResultStat() {
        if (NetworkStatusHelper.getStatus().isWifi()) {
            this.bssid = NetworkStatusHelper.getWifiBSSID();
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "AmdcResultStat [host:" + this.host + ",ipStackType=" + this.ipStackType + ",isContainHttp3=" + this.isContainHttp3 + ",isContainIpv6=" + this.isContainIpv6 + ",netType=" + this.netType + ",bssid=" + this.bssid + ",code=" + this.bssid + riy.ARRAY_END_STR;
    }
}
