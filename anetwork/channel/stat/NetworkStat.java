package anetwork.channel.stat;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class NetworkStat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1652226805);
    }

    public static INetworkStat getNetworkStat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (INetworkStat) ipChange.ipc$dispatch("b1d2d6ec", new Object[0]) : NetworkStatCache.getInstance();
    }
}
