package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.ConnType;
import anet.channel.security.SecurityHelper;
import anet.channel.strategy.dispatch.AmdcPriorityHelper;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.network.diagnosis.c;
import com.taobao.android.weex_framework.util.a;
import com.taobao.taolive.room.utils.ag;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.nog;

/* loaded from: classes.dex */
public class StrategyResultParser {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public static class Aisles {
        public final int cto;
        public final int heartbeat;
        public final int port;
        public final String protocol;
        public final String publicKey;
        public final int retry;
        public final int rto;
        public final String rtt;
        public final int supportMultiPath;

        static {
            kge.a(1911463943);
        }

        public Aisles(JSONObject jSONObject) {
            this.port = jSONObject.optInt("port");
            this.protocol = jSONObject.optString("protocol");
            this.cto = jSONObject.optInt("cto");
            this.rto = jSONObject.optInt("rto");
            this.retry = jSONObject.optInt("retry");
            this.heartbeat = jSONObject.optInt("heartbeat");
            this.rtt = jSONObject.optString("rtt", "");
            this.publicKey = jSONObject.optString("publickey");
            this.supportMultiPath = "mp".equalsIgnoreCase(jSONObject.optString("path")) ? 1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public static class Channel {
        public ChannelAttribute[] attributes;
        public boolean hasHttp3;
        public boolean hasIpv6;
        public String[] ips;

        static {
            kge.a(855662827);
        }

        public Channel(JSONObject jSONObject) {
            this.hasIpv6 = false;
            this.hasHttp3 = false;
            JSONArray optJSONArray = jSONObject.optJSONArray(DnsPreference.KEY_IPS);
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.ips = new String[length];
                for (int i = 0; i < length; i++) {
                    this.ips[i] = optJSONArray.optString(i);
                    if (Utils.isIPV6Address(this.ips[i])) {
                        this.hasIpv6 = true;
                    }
                }
            } else {
                this.ips = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("attributes");
            if (optJSONArray2 == null) {
                this.attributes = null;
                return;
            }
            int length2 = optJSONArray2.length();
            this.attributes = new ChannelAttribute[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                this.attributes[i2] = new ChannelAttribute(optJSONArray2.optJSONObject(i2));
                if (this.attributes[i2].hasHttp3) {
                    this.hasHttp3 = true;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class ChannelAttribute {
        public final int cto;
        public boolean hasHttp3;
        public final int heartbeat;
        public final int port;
        public final String protocol;
        public final String publicKey;
        public final int retry;
        public final int rto;
        public final String rtt;
        public final int supportMultiPath;
        public String unit = null;
        public String accessPoint = null;
        public String clientIp = null;

        static {
            kge.a(1863336433);
        }

        public ChannelAttribute(JSONObject jSONObject) {
            this.hasHttp3 = false;
            this.port = jSONObject.optInt("port");
            this.protocol = jSONObject.optString("protocol");
            this.hasHttp3 = ConnType.HTTP3.equalsIgnoreCase(this.protocol);
            this.cto = jSONObject.optInt("cto");
            this.rto = jSONObject.optInt("rto");
            this.retry = jSONObject.optInt("retry");
            this.heartbeat = jSONObject.optInt("heartbeat");
            this.publicKey = jSONObject.optString("publickey");
            this.rtt = jSONObject.optString("rtt");
            this.supportMultiPath = "mp".equalsIgnoreCase(jSONObject.optString("path")) ? 1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public static class Dns {
        public HashMap<String, Boolean> abStrategy;
        public boolean clear;
        public String cname;
        public boolean effectNow;
        public boolean hasHttp3;
        public boolean hasIPv6;
        public String host;
        public String safeAisles;
        public Server[] servers;
        public String tags;
        public int ttl;
        public String unit;
        public int updateMode;
        public int version;

        static {
            kge.a(-1214997231);
        }

        public Dns(JSONObject jSONObject) {
            this.host = jSONObject.optString("host");
            this.ttl = jSONObject.optInt(RemoteMessageConst.TTL);
            this.safeAisles = jSONObject.optString("safeAisles");
            this.cname = jSONObject.optString("cname", null);
            this.unit = jSONObject.optString(nog.PRICE_UNIT, null);
            this.clear = jSONObject.optInt(a.ATOM_EXT_clear) == 1;
            this.effectNow = jSONObject.optBoolean("effectNow");
            this.version = jSONObject.optInt("version");
            this.updateMode = jSONObject.optInt("um");
            this.tags = jSONObject.optString("tags");
            String str = this.tags;
            if (str != null && !str.isEmpty()) {
                ALog.e("anet.HttpDnsResponse", "[amdc priority] tags=" + this.tags, SwitchMonitorLogUtil.SRC_AMDC, "host", this.host);
                AmdcPriorityHelper.updatePriorityHost(SwitchMonitorLogUtil.SRC_AMDC, GlobalAppRuntimeInfo.getUserId(), this.tags, this.host);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(com.taobao.android.searchbaseframe.chitu.a.SERVERS);
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.servers = new Server[length];
                for (int i = 0; i < length; i++) {
                    this.servers[i] = new Server(optJSONArray.optJSONObject(i));
                }
            } else {
                this.servers = null;
            }
            if (this.servers != null) {
                int i2 = 0;
                while (true) {
                    Server[] serverArr = this.servers;
                    if (i2 >= serverArr.length) {
                        break;
                    }
                    Channel[] channelArr = serverArr[i2].channels;
                    if (channelArr != null && channelArr.length > 0) {
                        this.hasIPv6 = channelArr[0] != null && channelArr[0].hasIpv6;
                        this.hasHttp3 = channelArr[0] != null && channelArr[0].hasHttp3;
                    }
                    i2++;
                }
            }
            String optString = jSONObject.optString(DispatchConstants.AB_STRATEGY);
            if (TextUtils.isEmpty(optString)) {
                this.abStrategy = null;
                return;
            }
            this.abStrategy = new HashMap<>();
            String[] split = optString.split(",");
            if (split == null || split.length <= 0) {
                return;
            }
            for (String str2 : split) {
                String[] split2 = str2.split("=");
                if (split2 != null && split2.length == 2) {
                    try {
                        this.abStrategy.put(split2[0], Boolean.valueOf(Integer.parseInt(split2[1]) == 1));
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class HrTask {
        public final String host;
        public final Strategy[] strategies;

        static {
            kge.a(2119246023);
        }

        public HrTask(JSONObject jSONObject) {
            this.host = jSONObject.optString("host");
            JSONArray optJSONArray = jSONObject.optJSONArray("strategies");
            if (optJSONArray == null) {
                this.strategies = null;
                return;
            }
            int length = optJSONArray.length();
            this.strategies = new Strategy[length];
            for (int i = 0; i < length; i++) {
                this.strategies[i] = new Strategy(optJSONArray.optJSONObject(i));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class HttpDnsResponse {
        public final String accessPoint;
        public final String clientIp;
        public final int configVersion;
        public Dns[] dns;
        public final int fcLevel;
        public final int fcTime;
        public final HrTask[] hrTasks;
        public final String rm;
        public final String uPriority;
        public final long uPriorityTtl;
        public final String userId;

        static {
            kge.a(951958218);
        }

        public HttpDnsResponse(JSONObject jSONObject) throws JSONException {
            this.clientIp = jSONObject.optString(c.IP);
            this.userId = jSONObject.optString("uid", null);
            this.configVersion = jSONObject.optInt(DispatchConstants.CONFIG_VERSION);
            this.fcLevel = jSONObject.optInt("fcl");
            this.fcTime = jSONObject.optInt("fct");
            this.rm = jSONObject.optString("rm");
            String decryptNoDeps = "l".equalsIgnoreCase(this.rm) ? SecurityHelper.decryptNoDeps(SecurityHelper.getSecretKey(jSONObject.optString("st")), jSONObject.optString("secData"), null, "[amdc]") : AmdcRuntimeInfo.getSign().aesDecryptStr(jSONObject.optString("secData"));
            if (decryptNoDeps != null) {
                JSONObject jSONObject2 = new JSONObject(decryptNoDeps);
                this.accessPoint = jSONObject2.optString(ag.KEY_ACCESS_POINT);
                this.uPriority = jSONObject2.optString(DispatchConstants.U_PRIORITY);
                this.uPriorityTtl = jSONObject2.optLong("uPriorityTtl");
                String str = this.uPriority;
                if (str != null && !str.isEmpty()) {
                    ALog.e("anet.HttpDnsResponse", "[amdc priority] uPriority=" + this.uPriority, SwitchMonitorLogUtil.SRC_AMDC, RemoteMessageConst.TTL, Long.valueOf(this.uPriorityTtl));
                    AmdcPriorityHelper.updatePriorityInfo(SwitchMonitorLogUtil.SRC_AMDC, GlobalAppRuntimeInfo.getUserId(), this.uPriority, this.uPriorityTtl);
                }
            } else {
                this.accessPoint = null;
                this.uPriority = null;
                this.uPriorityTtl = -1L;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("dns");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.dns = new Dns[length];
                for (int i = 0; i < length; i++) {
                    this.dns[i] = new Dns(optJSONArray.optJSONObject(i));
                }
            } else {
                this.dns = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("hrTask");
            if (optJSONArray2 == null) {
                this.hrTasks = null;
                return;
            }
            int length2 = optJSONArray2.length();
            this.hrTasks = new HrTask[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                this.hrTasks[i2] = new HrTask(optJSONArray2.optJSONObject(i2));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class ProxyServer {
        public Channel[] proxyChannel;

        static {
            kge.a(1959103289);
        }

        public ProxyServer(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.optJSONArray("channels");
            if (optJSONArray == null) {
                this.proxyChannel = null;
                return;
            }
            int length = optJSONArray.length();
            this.proxyChannel = new Channel[length];
            for (int i = 0; i < length; i++) {
                this.proxyChannel[i] = new Channel(optJSONArray.optJSONObject(i));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Server {
        public Channel[] channels;
        public boolean isStaticBgp;
        public ProxyServer[] proxies;

        static {
            kge.a(-1871892901);
        }

        public Server(JSONObject jSONObject) {
            JSONArray optJSONArray = jSONObject.optJSONArray("channels");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                this.channels = new Channel[length];
                for (int i = 0; i < length; i++) {
                    this.channels[i] = new Channel(optJSONArray.optJSONObject(i));
                }
            } else {
                this.channels = null;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("proxies");
            if (optJSONArray2 != null) {
                int length2 = optJSONArray2.length();
                this.proxies = new ProxyServer[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    this.proxies[i2] = new ProxyServer(optJSONArray2.optJSONObject(i2));
                }
            } else {
                this.proxies = null;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("labels");
            if (optJSONObject != null) {
                this.isStaticBgp = "bgp-static".equalsIgnoreCase(optJSONObject.optString("networkRouteProtocolType"));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class Strategy {
        public final Aisles aisles;
        public final String ip;
        public final String path;

        static {
            kge.a(1110916235);
        }

        public Strategy(JSONObject jSONObject) {
            this.ip = jSONObject.optString(c.IP);
            this.path = jSONObject.optString("path");
            this.aisles = new Aisles(jSONObject);
        }
    }

    static {
        kge.a(201287852);
    }

    public static HttpDnsResponse parse(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDnsResponse) ipChange.ipc$dispatch("94805637", new Object[]{jSONObject});
        }
        try {
            return new HttpDnsResponse(jSONObject);
        } catch (Exception e) {
            ALog.e("StrategyResultParser", "Parse HttpDns response failed.", null, e, "JSON Content", jSONObject.toString());
            return null;
        }
    }
}
