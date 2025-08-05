package anet.channel.entity;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.strategy.ConnProtocol;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.android.spdy.SpdyProtocol;
import tb.kge;

/* loaded from: classes.dex */
public class ConnType {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String H2S = "h2s";
    public static ConnType HTTP = null;
    public static final String HTTP2 = "http2";
    public static final String HTTP3 = "http3";
    public static final String HTTP3_1RTT = "http3_1rtt";
    public static final String HTTP3_PLAIN = "http3plain";
    public static ConnType HTTPS = null;
    public static final String PK_ACS = "acs";
    public static final String PK_AUTO = "auto";
    public static final String PK_CDN = "cdn";
    public static final String PK_OPEN = "open";
    public static final String QUIC = "quic";
    public static final String QUIC_PLAIN = "quicplain";
    public static final String RTT_0 = "0rtt";
    public static final String RTT_1 = "1rtt";
    public static final String SPDY = "spdy";
    private static Map<ConnProtocol, ConnType> connTypeMap;
    private String name;
    private String publicKey;
    private int spdyProtocol;

    @Deprecated
    /* loaded from: classes.dex */
    public enum TypeLevel {
        SPDY,
        HTTP
    }

    static {
        kge.a(-1931966253);
        HTTP = new ConnType("http");
        HTTPS = new ConnType("https");
        connTypeMap = new HashMap();
    }

    private ConnType(String str) {
        this.name = "";
        this.name = str;
    }

    public static ConnType valueOf(ConnProtocol connProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConnType) ipChange.ipc$dispatch("263ed8d5", new Object[]{connProtocol});
        }
        if (connProtocol == null) {
            return null;
        }
        if ("http".equalsIgnoreCase(connProtocol.protocol)) {
            return HTTP;
        }
        if ("https".equalsIgnoreCase(connProtocol.protocol)) {
            return HTTPS;
        }
        synchronized (connTypeMap) {
            if (connTypeMap.containsKey(connProtocol)) {
                return connTypeMap.get(connProtocol);
            }
            ConnType connType = new ConnType(connProtocol.toString());
            connType.publicKey = connProtocol.publicKey;
            if (HTTP2.equalsIgnoreCase(connProtocol.protocol)) {
                connType.spdyProtocol |= 8;
            } else if ("spdy".equalsIgnoreCase(connProtocol.protocol)) {
                connType.spdyProtocol |= 2;
            } else if (H2S.equals(connProtocol.protocol)) {
                connType.spdyProtocol = 40;
            } else if (QUIC.equalsIgnoreCase(connProtocol.protocol)) {
                connType.spdyProtocol = 12;
            } else if (QUIC_PLAIN.equalsIgnoreCase(connProtocol.protocol)) {
                connType.spdyProtocol = 32780;
            } else if (HTTP3.equalsIgnoreCase(connProtocol.protocol)) {
                connType.spdyProtocol = 256;
            } else if (HTTP3_1RTT.equalsIgnoreCase(connProtocol.protocol)) {
                connType.spdyProtocol = 8448;
            } else if (HTTP3_PLAIN.equalsIgnoreCase(connProtocol.protocol)) {
                connType.spdyProtocol = SpdyProtocol.HTTP3_PLAIN;
            }
            if (connType.spdyProtocol == 0) {
                return null;
            }
            if (!TextUtils.isEmpty(connProtocol.publicKey)) {
                connType.spdyProtocol |= 128;
                if (RTT_1.equalsIgnoreCase(connProtocol.rtt)) {
                    connType.spdyProtocol |= 8192;
                } else if (!RTT_0.equalsIgnoreCase(connProtocol.rtt)) {
                    return null;
                } else {
                    connType.spdyProtocol |= 4096;
                }
            }
            connTypeMap.put(connProtocol, connType);
            return connType;
        }
    }

    public int getTnetConType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b3ddebb7", new Object[]{this})).intValue() : this.spdyProtocol;
    }

    public int getTnetPublicKey(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("859498a9", new Object[]{this, new Boolean(z)})).intValue();
        }
        if ("cdn".equals(this.publicKey)) {
            return 1;
        }
        if (GlobalAppRuntimeInfo.getEnv() == ENV.TEST) {
            return 0;
        }
        if ("open".equals(this.publicKey)) {
            return z ? 11 : 10;
        } else if (!PK_ACS.equals(this.publicKey)) {
            return -1;
        } else {
            return z ? 4 : 3;
        }
    }

    public boolean isPublicKeyAuto() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e0069c06", new Object[]{this})).booleanValue() : "auto".equals(this.publicKey);
    }

    public boolean isH2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dc7b0e1f", new Object[]{this})).booleanValue() : (this.spdyProtocol & 8) != 0;
    }

    public boolean isH2S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b4f2cc4a", new Object[]{this})).booleanValue() : this.spdyProtocol == 40;
    }

    public boolean isQuic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("910aff13", new Object[]{this})).booleanValue() : (this.spdyProtocol & 4) != 0;
    }

    public boolean isHTTP3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ee069cc", new Object[]{this})).booleanValue();
        }
        int i = this.spdyProtocol;
        return i == 256 || i == 8448 || i == 33024;
    }

    public boolean is1RttHTTP3() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4898e76b", new Object[]{this})).booleanValue() : isHTTP3() && (this.spdyProtocol & 8192) != 0;
    }

    public boolean isHttpType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d51b3db7", new Object[]{this})).booleanValue() : equals(HTTP) || equals(HTTPS);
    }

    public boolean isSSL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32c4a00d", new Object[]{this})).booleanValue();
        }
        int i = this.spdyProtocol;
        return (i & 128) != 0 || (i & 32) != 0 || i == 12 || i == 256 || i == 8448 || equals(HTTPS);
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
        if (obj == null || !(obj instanceof ConnType)) {
            return false;
        }
        if (this != obj) {
            return this.name.equals(((ConnType) obj).name);
        }
        return true;
    }

    @Deprecated
    public TypeLevel getTypeLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TypeLevel) ipChange.ipc$dispatch("a0485051", new Object[]{this});
        }
        if (isHttpType()) {
            return TypeLevel.HTTP;
        }
        return TypeLevel.SPDY;
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        if (equals(HTTP) || equals(HTTPS)) {
            return SessionType.SHORT_LINK;
        }
        return SessionType.LONG_LINK;
    }

    public int getProtocolType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c8f28e2", new Object[]{this})).intValue();
        }
        if (isHTTP3()) {
            return ProtocolType.UDP;
        }
        return ProtocolType.TCP;
    }

    private int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        int i = this.spdyProtocol;
        if ((i & 8) != 0) {
            return 0;
        }
        return (i & 2) != 0 ? 1 : 2;
    }

    public static int compare(ConnType connType, ConnType connType2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("345fc157", new Object[]{connType, connType2})).intValue() : connType.getPriority() - connType2.getPriority();
    }
}
