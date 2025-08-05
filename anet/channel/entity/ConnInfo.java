package anet.channel.entity;

import anet.channel.strategy.IConnStrategy;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.net.g;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class ConnInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String host;
    private String seq;
    public final IConnStrategy strategy;
    public int retryTime = 0;
    public int maxRetryTime = 0;

    static {
        kge.a(-1932304825);
    }

    public ConnInfo(String str, String str2, IConnStrategy iConnStrategy) {
        this.strategy = iConnStrategy;
        this.host = str;
        this.seq = str2;
    }

    public String getIp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d02517fc", new Object[]{this});
        }
        IConnStrategy iConnStrategy = this.strategy;
        if (iConnStrategy == null) {
            return null;
        }
        return iConnStrategy.getIp();
    }

    public int getPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a73231f1", new Object[]{this})).intValue();
        }
        IConnStrategy iConnStrategy = this.strategy;
        if (iConnStrategy == null) {
            return 0;
        }
        return iConnStrategy.getPort();
    }

    public ConnType getConnType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnType) ipChange.ipc$dispatch("fdfc0fef", new Object[]{this});
        }
        IConnStrategy iConnStrategy = this.strategy;
        if (iConnStrategy != null) {
            return ConnType.valueOf(iConnStrategy.getProtocol());
        }
        return ConnType.HTTP;
    }

    public int getConnectionTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3af0dde7", new Object[]{this})).intValue();
        }
        IConnStrategy iConnStrategy = this.strategy;
        if (iConnStrategy != null && iConnStrategy.getConnectionTimeout() != 0) {
            return this.strategy.getConnectionTimeout();
        }
        return 20000;
    }

    public int getReadTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4db89faf", new Object[]{this})).intValue();
        }
        IConnStrategy iConnStrategy = this.strategy;
        if (iConnStrategy != null && iConnStrategy.getReadTimeout() != 0) {
            return this.strategy.getReadTimeout();
        }
        return 20000;
    }

    public String getHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this}) : this.host;
    }

    public int getHeartbeat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d15d3c0", new Object[]{this})).intValue();
        }
        IConnStrategy iConnStrategy = this.strategy;
        return iConnStrategy != null ? iConnStrategy.getHeartbeat() : g.FOREGROUND_INTERVAL;
    }

    public String getSeq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c2a3c570", new Object[]{this}) : this.seq;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ConnInfo [ip=" + getIp() + ",port=" + getPort() + ",type=" + getConnType() + ",hb" + getHeartbeat() + riy.ARRAY_END_STR;
    }
}
