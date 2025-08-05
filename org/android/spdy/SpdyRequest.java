package org.android.spdy;

import anet.channel.util.HttpConstant;
import com.alipay.mobile.common.rpc.ProtocolVersions;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import tb.fxb;
import tb.sad;

/* loaded from: classes.dex */
public final class SpdyRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GET_METHOD = "GET";
    public static final String POST_METHOD = "POST";
    private static final String TAG = "tnetsdk.SpdyRequest";
    private int bodyRdTimeoutMs;
    private int connectionTimeoutMs;
    private String domain;
    private Map<String, String> extHead;
    private String host;
    private String method;
    private int port;
    private RequestPriority priority;
    private String proxyIp;
    private int proxyPort;
    private int requestFecDownSize;
    private int requestFecUpSize;
    private int requestRdTimeoutMs;
    private int requestRecvRateBps;
    private int requestTimeoutMs;
    private int retryTimes;
    private URL url;

    public SpdyRequest(URL url, String str, String str2, int i, String str3, int i2, String str4, RequestPriority requestPriority, int i3, int i4, int i5) {
        this.domain = "";
        this.proxyIp = "0.0.0.0";
        this.proxyPort = 0;
        this.extHead = new HashMap(5);
        this.priority = RequestPriority.DEFAULT_PRIORITY;
        this.requestTimeoutMs = 20000;
        this.requestRdTimeoutMs = 0;
        this.bodyRdTimeoutMs = 0;
        this.connectionTimeoutMs = 0;
        this.retryTimes = 0;
        this.requestRecvRateBps = 0;
        this.requestFecDownSize = 0;
        this.requestFecUpSize = 0;
        this.url = url;
        if (str != null) {
            this.domain = str;
        }
        this.host = str2;
        this.port = i;
        if (str3 != null && i2 != 0) {
            this.proxyIp = str3;
            this.proxyPort = i2;
        }
        this.method = str4;
        if (requestPriority != null) {
            this.priority = requestPriority;
        }
        this.requestTimeoutMs = i3;
        this.connectionTimeoutMs = i4;
        this.retryTimes = i5;
    }

    public SpdyRequest(URL url, String str, int i, String str2, int i2, String str3, RequestPriority requestPriority, int i3, int i4, int i5) {
        this(url, null, str, i, str2, i2, str3, requestPriority, i3, i4, i5);
    }

    public SpdyRequest(URL url, String str, String str2, int i, String str3, RequestPriority requestPriority) {
        this(url, str, str2, i, null, 0, str3, requestPriority, 0, 0, 0);
    }

    public SpdyRequest(URL url, String str, int i, String str2, RequestPriority requestPriority) {
        this(url, str, i, null, 0, str2, requestPriority, 0, 0, 0);
    }

    public SpdyRequest(URL url, String str, String str2, RequestPriority requestPriority, int i, int i2) {
        this.domain = "";
        this.proxyIp = "0.0.0.0";
        this.proxyPort = 0;
        this.extHead = new HashMap(5);
        this.priority = RequestPriority.DEFAULT_PRIORITY;
        this.requestTimeoutMs = 20000;
        this.requestRdTimeoutMs = 0;
        this.bodyRdTimeoutMs = 0;
        this.connectionTimeoutMs = 0;
        this.retryTimes = 0;
        this.requestRecvRateBps = 0;
        this.requestFecDownSize = 0;
        this.requestFecUpSize = 0;
        this.url = url;
        if (str != null) {
            this.domain = str;
        }
        this.host = url.getHost();
        this.port = url.getPort();
        if (this.port < 0) {
            this.port = url.getDefaultPort();
        }
        this.method = str2;
        if (requestPriority != null) {
            this.priority = requestPriority;
        }
        this.requestTimeoutMs = i;
        this.connectionTimeoutMs = i2;
    }

    public SpdyRequest(URL url, String str, RequestPriority requestPriority, int i, int i2) {
        this(url, (String) null, str, requestPriority, i, i2);
    }

    public SpdyRequest(URL url, String str, String str2, RequestPriority requestPriority) {
        this(url, str, str2, requestPriority, 0, 0);
    }

    public SpdyRequest(URL url, String str, RequestPriority requestPriority) {
        this(url, str, requestPriority, 0, 0);
    }

    public SpdyRequest(URL url, String str, String str2) {
        this(url, str, str2, (RequestPriority) null, 0, 0);
    }

    public SpdyRequest(URL url, String str) {
        this(url, str, (RequestPriority) null, 0, 0);
    }

    public void setRequestRdTimeoutMs(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4e5594", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
        } else {
            this.requestRdTimeoutMs = i;
        }
    }

    public void setRequestTimeoutMs(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2fd202", new Object[]{this, new Integer(i)});
        } else if (i < 0) {
        } else {
            this.requestTimeoutMs = i;
        }
    }

    public void setRequestRecvRateBps(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3128448a", new Object[]{this, new Integer(i)});
        } else if (i <= 0) {
        } else {
            this.requestRecvRateBps = i;
        }
    }

    public int getRequestRecvRateBps() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("920c580", new Object[]{this})).intValue() : this.requestRecvRateBps;
    }

    public void setRequestFecSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d864544", new Object[]{this, new Integer(i)});
        } else if (i <= 0) {
        } else {
            this.requestFecDownSize = i;
        }
    }

    public int getRequestFecSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("741adf86", new Object[]{this})).intValue() : this.requestFecDownSize;
    }

    public void setRequestFecUpSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e166a9", new Object[]{this, new Integer(i)});
        } else if (i <= 0) {
        } else {
            this.requestFecUpSize = i;
        }
    }

    public int getRequestFecUpSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("54abd081", new Object[]{this})).intValue() : this.requestFecUpSize;
    }

    public void addHeader(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f9a6a9", new Object[]{this, str, str2});
        } else {
            this.extHead.put(str, str2);
        }
    }

    public void addHeaders(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933edc59", new Object[]{this, map});
        } else {
            this.extHead.putAll(map);
        }
    }

    public URL getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (URL) ipChange.ipc$dispatch("9e2010d5", new Object[]{this}) : this.url;
    }

    public String getMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this}) : this.method;
    }

    public void setRequestPriority(RequestPriority requestPriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a937426", new Object[]{this, requestPriority});
        } else if (requestPriority == null) {
        } else {
            this.priority = requestPriority;
        }
    }

    public int getPriority() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue() : this.priority.getPriorityInt();
    }

    private String getPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.url.getPath());
        if (this.url.getQuery() != null) {
            sb.append("?");
            sb.append(this.url.getQuery());
        }
        if (this.url.getRef() != null) {
            sb.append("#");
            sb.append(this.url.getRef());
        }
        if (sb.length() == 0) {
            sb.append(fxb.DIR);
        }
        return sb.toString();
    }

    public Map<String, String> getHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        HashMap hashMap = new HashMap(5);
        hashMap.put(":path", getPath());
        hashMap.put(":method", this.method);
        hashMap.put(":version", ProtocolVersions.HTTP_1_1);
        hashMap.put(":host", this.url.getAuthority());
        hashMap.put(":scheme", this.url.getProtocol());
        Map<String, String> map = this.extHead;
        if (map != null && map.size() > 0) {
            hashMap.putAll(this.extHead);
        }
        return hashMap;
    }

    public String getUrlPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70f36fbb", new Object[]{this});
        }
        return this.url.getProtocol() + HttpConstant.SCHEME_SPLIT + this.url.getAuthority() + getPath();
    }

    public String getHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this}) : this.host;
    }

    public int getPort() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a73231f1", new Object[]{this})).intValue();
        }
        int i = this.port;
        if (i >= 0) {
            return i;
        }
        return 80;
    }

    public String getProxyIp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c7f4c85a", new Object[]{this}) : this.proxyIp;
    }

    public int getProxyPort() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d8ef9153", new Object[]{this})).intValue() : this.proxyPort;
    }

    public void setDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2735add7", new Object[]{this, str});
        } else {
            this.domain = str;
        }
    }

    public String getDomain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this}) : this.domain;
    }

    public String getAuthority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3dac808c", new Object[]{this});
        }
        return this.host + ":" + Integer.toString(this.port) + "/" + this.proxyIp + ":" + this.proxyPort;
    }

    public int getRequestTimeoutMs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c5a61608", new Object[]{this})).intValue() : this.requestTimeoutMs;
    }

    public int getConnectionTimeoutMs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7b39ed6d", new Object[]{this})).intValue() : this.connectionTimeoutMs;
    }

    public int getRequestRdTimeoutMs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf6b36", new Object[]{this})).intValue() : this.requestRdTimeoutMs;
    }

    public int getBodyRdTimeoutMs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e8ce2197", new Object[]{this})).intValue() : this.bodyRdTimeoutMs;
    }

    public int getRetryTimes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("58b4bfee", new Object[]{this})).intValue() : this.retryTimes;
    }

    public void optimizeRequestTimeout() {
        int j;
        long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ccb0116", new Object[]{this});
            return;
        }
        try {
            if (!sad.i() || !sad.D() || sad.b(this.url)) {
                return;
            }
            if (sad.a(this.url, "fast")) {
                j = (int) sad.k();
                l = sad.m();
            } else if (!sad.a(this.url, "normal")) {
                return;
            } else {
                j = (int) sad.j();
                l = sad.l();
            }
            int i = (int) l;
            if (j > 0 && (this.requestRdTimeoutMs <= 0 || this.requestRdTimeoutMs > j)) {
                this.requestRdTimeoutMs = j;
            }
            if (!sad.E()) {
                return;
            }
            this.bodyRdTimeoutMs = i;
        } catch (Throwable unused) {
        }
    }
}
