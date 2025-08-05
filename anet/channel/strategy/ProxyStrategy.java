package anet.channel.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class ProxyStrategy implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = -9024837279783197261L;
    public volatile String ip;
    public volatile int port;
    public volatile String protocol;
    public volatile int status = -1;
    public ConnHistoryItem connHistoryItem = new ConnHistoryItem();

    static {
        kge.a(-1801758812);
        kge.a(1028243835);
    }

    public static ProxyStrategy create(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProxyStrategy) ipChange.ipc$dispatch("e277486d", new Object[]{str, new Integer(i), str2}) : new ProxyStrategy(str, i, str2);
    }

    private ProxyStrategy(String str, int i, String str2) {
        this.ip = str;
        this.port = i;
        this.protocol = str2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return riy.BLOCK_START_STR + this.ip + ' ' + this.port + ' ' + this.protocol + " historyFail=" + this.connHistoryItem.countFail() + riy.BLOCK_END_STR;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ProxyStrategy)) {
            ProxyStrategy proxyStrategy = (ProxyStrategy) obj;
            if (this.port == proxyStrategy.port && this.ip.equals(proxyStrategy.ip) && this.protocol.equals(proxyStrategy.protocol)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : ((((527 + this.ip.hashCode()) * 31) + this.port) * 31) + this.protocol.hashCode();
    }
}
