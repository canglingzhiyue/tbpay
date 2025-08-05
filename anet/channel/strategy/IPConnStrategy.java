package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import anet.channel.util.Inet64Util;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class IPConnStrategy implements IConnStrategy, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SOURCE_AMDC = 0;
    public static final int SOURCE_CUSTOMIZED = 2;
    public static final int SOURCE_LOCAL_DNS = 1;
    public static final int TYPE_IP_TO_HOST = -1;
    public static final int TYPE_NORMAL = 1;
    public static final int TYPE_STATIC_BANDWITDH = 0;
    private static final long serialVersionUID = -2492035520806142510L;
    public volatile String accessPoint;
    public volatile String clientIp;
    public volatile int cto;
    public volatile int heartbeat;
    public final String ip;
    public transient boolean isToRemove;
    public final int port;
    public final ConnProtocol protocol;
    public volatile int retry;
    public volatile int rto;
    public volatile String unit;
    public volatile int status = -1;
    public volatile Map<String, Object> commonInfo = null;
    public volatile int ipType = 1;
    public volatile int ipSource = 1;
    public volatile List<ProxyStrategy> proxyStrategies = Collections.EMPTY_LIST;
    public volatile int supportMultiPath = 0;

    static {
        kge.a(-610764253);
        kge.a(-1147560597);
        kge.a(1028243835);
    }

    public static IPConnStrategy create(String str, StrategyResultParser.Aisles aisles) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPConnStrategy) ipChange.ipc$dispatch("e8fe31f5", new Object[]{str, aisles});
        }
        ConnProtocol valueOf = ConnProtocol.valueOf(aisles);
        if (valueOf != null) {
            return create(str, aisles.port, valueOf, aisles.cto, aisles.rto, aisles.retry, aisles.heartbeat, null, null, null);
        }
        return null;
    }

    public static IPConnStrategy create(String str, StrategyResultParser.ChannelAttribute channelAttribute) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPConnStrategy) ipChange.ipc$dispatch("8d0da0df", new Object[]{str, channelAttribute});
        }
        ConnProtocol valueOf = ConnProtocol.valueOf(channelAttribute);
        if (valueOf != null) {
            return create(str, channelAttribute.port, valueOf, channelAttribute.cto, channelAttribute.rto, channelAttribute.retry, channelAttribute.heartbeat, channelAttribute.unit, channelAttribute.accessPoint, channelAttribute.clientIp);
        }
        return null;
    }

    public static IPConnStrategy create(String str, int i, ConnProtocol connProtocol, int i2, int i3, int i4, int i5, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPConnStrategy) ipChange.ipc$dispatch("c4f88320", new Object[]{str, new Integer(i), connProtocol, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), str2, str3, str4});
        }
        if (!TextUtils.isEmpty(str) && connProtocol != null && i > 0) {
            return new IPConnStrategy(str, i, connProtocol, i2, i3, i4, i5, str2, str3, str4);
        }
        return null;
    }

    private IPConnStrategy(String str, int i, ConnProtocol connProtocol, int i2, int i3, int i4, int i5, String str2, String str3, String str4) {
        this.unit = null;
        this.accessPoint = null;
        this.clientIp = null;
        this.ip = str;
        this.port = i;
        this.protocol = connProtocol;
        this.cto = i2;
        this.rto = i3;
        this.retry = i4;
        this.heartbeat = i5;
        this.unit = str2;
        this.accessPoint = str3;
        this.clientIp = str4;
    }

    public ProxyStrategy selectProxyStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProxyStrategy) ipChange.ipc$dispatch("fdccd679", new Object[]{this});
        }
        if (this.proxyStrategies == null) {
            ALog.e("anet.IPConnStrategy", "[tunnel_opt] proxyStrategies null! ", null, new Object[0]);
            return null;
        }
        ProxyStrategy proxyStrategy = null;
        for (ProxyStrategy proxyStrategy2 : this.proxyStrategies) {
            if ("tunnel".equalsIgnoreCase(proxyStrategy2.protocol) && (!Inet64Util.isIPv4OnlyNetwork() || !Utils.isIPV6Address(proxyStrategy2.ip))) {
                if (proxyStrategy == null || proxyStrategy2.connHistoryItem.countFail() < proxyStrategy.connHistoryItem.countFail()) {
                    proxyStrategy = proxyStrategy2;
                }
            }
        }
        ALog.e("anet.IPConnStrategy", "[tunnel_opt]", null, "selectProxyStrategy", proxyStrategy, "proxyStrategies", this.proxyStrategies);
        return proxyStrategy;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append('{');
        sb.append(this.ip);
        if (this.ipType == 0) {
            sb.append("(*)");
        }
        sb.append(' ');
        sb.append(this.port);
        sb.append(' ');
        sb.append(this.protocol);
        if (isSupportMultiPath()) {
            sb.append(' ');
            sb.append("mp");
        }
        if (this.proxyStrategies != null && !this.proxyStrategies.isEmpty()) {
            sb.append(' ');
            sb.append(a.ATOM_proxy);
            sb.append(this.proxyStrategies);
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getIp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d02517fc", new Object[]{this}) : this.ip;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d9c8f8f1", new Object[]{this})).intValue() : this.ipType;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpSource() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e15dde12", new Object[]{this})).intValue() : this.ipSource;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getPort() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a73231f1", new Object[]{this})).intValue() : this.port;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public ConnProtocol getProtocol() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConnProtocol) ipChange.ipc$dispatch("f3fe3d0f", new Object[]{this}) : this.protocol;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getConnectionTimeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3af0dde7", new Object[]{this})).intValue() : this.cto;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getReadTimeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4db89faf", new Object[]{this})).intValue() : this.rto;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getRetryTimes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("58b4bfee", new Object[]{this})).intValue() : this.retry;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getHeartbeat() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5d15d3c0", new Object[]{this})).intValue() : this.heartbeat;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getStatus() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue() : this.status;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getUnit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9e7fcd3f", new Object[]{this}) : this.unit;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getAccessPoint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a134b63", new Object[]{this});
        }
        if (AwcnConfig.isUseClientIpOpened() && ((this.accessPoint == null || this.accessPoint.isEmpty()) && this.clientIp != null && !this.clientIp.isEmpty())) {
            return this.clientIp;
        }
        return this.accessPoint;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public Map<String, Object> getCommonInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6eaa1deb", new Object[]{this});
        }
        if (this.commonInfo == null) {
            this.commonInfo = new HashMap();
            this.commonInfo.put("selectProxyStrategy", selectProxyStrategy());
        }
        return this.commonInfo;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public List<ProxyStrategy> getProxyStrategies() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("69e2ba17", new Object[]{this}) : this.proxyStrategies;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public boolean isSupportMultiPath() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("43485f44", new Object[]{this})).booleanValue() : this.supportMultiPath == 1;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IPConnStrategy)) {
            return false;
        }
        IPConnStrategy iPConnStrategy = (IPConnStrategy) obj;
        boolean z = this.port == iPConnStrategy.port && this.ip.equals(iPConnStrategy.ip) && this.protocol.equals(iPConnStrategy.protocol);
        return (this.proxyStrategies == null || this.proxyStrategies.isEmpty() ? !(!z || (iPConnStrategy.proxyStrategies != null && !iPConnStrategy.proxyStrategies.isEmpty())) : !(!z || !this.proxyStrategies.equals(iPConnStrategy.proxyStrategies))) && this.supportMultiPath == iPConnStrategy.supportMultiPath;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = ((((527 + this.ip.hashCode()) * 31) + this.port) * 31) + this.protocol.hashCode();
        if (this.proxyStrategies != null && !this.proxyStrategies.isEmpty()) {
            hashCode = (hashCode * 31) + this.proxyStrategies.hashCode();
        }
        return (hashCode * 31) + this.supportMultiPath;
    }

    public int getUniqueId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5ea3b5bc", new Object[]{this})).intValue() : hashCode();
    }
}
