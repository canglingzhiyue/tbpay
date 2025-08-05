package anet.channel.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class ConnEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean isSuccess = false;
    public long connTime = Long.MAX_VALUE;
    public boolean isAccs = false;
    public boolean isTunnel = false;
    public boolean isForceCell = false;
    public ProxyStrategy useProxyStrategy = null;

    static {
        kge.a(-1585673231);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.isSuccess ? "ConnEvent#Success" : "ConnEvent#Fail";
    }
}
