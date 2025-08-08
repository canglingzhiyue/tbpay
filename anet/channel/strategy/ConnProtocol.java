package anet.channel.strategy;

import mtopsdk.common.util.StringUtils;
import anet.channel.entity.ConnType;
import anet.channel.strategy.StrategyResultParser;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class ConnProtocol implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final ConnProtocol HTTP;
    public static final ConnProtocol HTTPS;
    private static Map<String, ConnProtocol> protocolMap = null;
    private static final long serialVersionUID = -3523201990674557001L;
    public final int isHttp;
    public final int isHttp3;
    public final String name;
    public final String protocol;
    public final String publicKey;
    public final String rtt;

    static {
        kge.a(286876129);
        kge.a(1028243835);
        protocolMap = new HashMap();
        HTTP = valueOf("http", null, null);
        HTTPS = valueOf("https", null, null);
    }

    public static ConnProtocol valueOf(StrategyResultParser.Aisles aisles) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnProtocol) ipChange.ipc$dispatch("c9d684d9", new Object[]{aisles});
        }
        if (aisles != null) {
            return valueOf(aisles.protocol, aisles.rtt, aisles.publicKey);
        }
        return null;
    }

    public static ConnProtocol valueOf(StrategyResultParser.ChannelAttribute channelAttribute) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnProtocol) ipChange.ipc$dispatch("b76503c3", new Object[]{channelAttribute});
        }
        if (channelAttribute != null) {
            return valueOf(channelAttribute.protocol, channelAttribute.rtt, channelAttribute.publicKey);
        }
        return null;
    }

    @Deprecated
    public static ConnProtocol valueOf(String str, String str2, String str3, @Deprecated boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConnProtocol) ipChange.ipc$dispatch("26e87d3d", new Object[]{str, str2, str3, new Boolean(z)}) : valueOf(str, str2, str3);
    }

    public static ConnProtocol valueOf(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnProtocol) ipChange.ipc$dispatch("61989f57", new Object[]{str, str2, str3});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        String buildName = buildName(str, str2, str3);
        synchronized (protocolMap) {
            if (protocolMap.containsKey(buildName)) {
                return protocolMap.get(buildName);
            }
            ConnProtocol connProtocol = new ConnProtocol(buildName, str, str2, str3);
            protocolMap.put(buildName, connProtocol);
            return connProtocol;
        }
    }

    private ConnProtocol(String str, String str2, String str3, String str4) {
        this.name = str;
        this.protocol = str2;
        this.rtt = str3;
        this.publicKey = str4;
        int i = 0;
        this.isHttp = ("http".equalsIgnoreCase(str2) || "https".equalsIgnoreCase(str2)) ? 1 : 0;
        this.isHttp3 = (ConnType.HTTP3.equalsIgnoreCase(str2) || ConnType.HTTP3_1RTT.equalsIgnoreCase(str2) || ConnType.HTTP3_PLAIN.equalsIgnoreCase(str2)) ? 1 : i;
    }

    private static String buildName(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f61fa862", new Object[]{str, str2, str3});
        }
        if (StringUtils.isEmpty(str3)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(18);
        sb.append(str);
        if (!StringUtils.isEmpty(str2)) {
            sb.append("_");
            sb.append(str2);
        } else {
            sb.append("_0rtt");
        }
        sb.append("_");
        sb.append(str3);
        return sb.toString();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.name;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ConnProtocol)) {
            return this.name.equals(((ConnProtocol) obj).name);
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = 527 + this.protocol.hashCode();
        String str = this.rtt;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        String str2 = this.publicKey;
        return str2 != null ? (hashCode * 31) + str2.hashCode() : hashCode;
    }
}
