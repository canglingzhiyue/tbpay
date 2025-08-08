package anet.channel.request;

import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.encode.EncodingHelper;
import anet.channel.statist.RequestStatistic;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import com.alipay.android.phone.mobilecommon.verifyidentity.BuildConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.ZstdStreamDeflater;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class Request {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CHARSET = "UTF-8";
    private boolean allowRequestInBg;
    private String bizId;
    private BodyEntry body;
    private String charset;
    private int connectTimeout;
    private HttpUrl formattedUrl;
    private Map<String, String> headers;
    private HostnameVerifier hostnameVerifier;
    public boolean isGold;
    private boolean isRedirectEnable;
    private String method;
    private HttpUrl originUrl;
    private Map<String, String> params;
    private int readTimeout;
    public int recvRateBpsLimit;
    private int redirectTimes;
    public long reqBodyInflateSize;
    public long requestBodyCompressCostTime;
    public int requestBodyCompressRet;
    public String requestBodyCompressType;
    public final RequestStatistic rs;
    private HttpUrl sendUrl;
    private String seq;
    private SSLSocketFactory sslSocketFactory;
    private URL url;

    static {
        kge.a(360674928);
    }

    /* loaded from: classes.dex */
    public static final class Method {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String DELETE = "DELETE";
        public static final String GET = "GET";
        public static final String HEAD = "HEAD";
        public static final String OPTION = "OPTIONS";
        public static final String POST = "POST";
        public static final String PUT = "PUT";

        static {
            kge.a(-1000440395);
        }

        public static boolean requiresRequestBody(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39ee1a98", new Object[]{str})).booleanValue() : str.equals("POST") || str.equals("PUT");
        }

        public static boolean permitsRequestBody(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7fa6fce", new Object[]{str})).booleanValue() : requiresRequestBody(str) || str.equals("DELETE") || str.equals("OPTIONS");
        }
    }

    private Request(Builder builder) {
        this.method = "GET";
        this.isRedirectEnable = true;
        this.redirectTimes = 0;
        this.connectTimeout = 10000;
        this.readTimeout = 10000;
        this.isGold = false;
        this.recvRateBpsLimit = 0;
        this.requestBodyCompressRet = -1;
        this.requestBodyCompressType = BuildConfig.RPC_TYPE_DEF;
        this.requestBodyCompressCostTime = 0L;
        this.reqBodyInflateSize = -1L;
        this.method = Builder.access$000(builder);
        this.headers = Builder.access$100(builder);
        this.params = Builder.access$200(builder);
        this.body = Builder.access$300(builder);
        this.charset = Builder.access$400(builder);
        this.isRedirectEnable = Builder.access$500(builder);
        this.redirectTimes = Builder.access$600(builder);
        this.hostnameVerifier = Builder.access$700(builder);
        this.sslSocketFactory = Builder.access$800(builder);
        this.bizId = Builder.access$900(builder);
        this.seq = Builder.access$1000(builder);
        this.connectTimeout = Builder.access$1100(builder);
        this.readTimeout = Builder.access$1200(builder);
        this.originUrl = Builder.access$1300(builder);
        this.formattedUrl = Builder.access$1400(builder);
        if (this.formattedUrl == null) {
            formatUrl();
        }
        this.rs = Builder.access$1500(builder) != null ? Builder.access$1500(builder) : new RequestStatistic(getHost(), this.bizId);
        this.allowRequestInBg = Builder.access$1600(builder);
    }

    public Builder newBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Builder) ipChange.ipc$dispatch("d0d209fc", new Object[]{this});
        }
        Builder builder = new Builder();
        Builder.access$002(builder, this.method);
        Builder.access$102(builder, makeHeaders());
        Builder.access$202(builder, this.params);
        Builder.access$302(builder, this.body);
        Builder.access$402(builder, this.charset);
        Builder.access$502(builder, this.isRedirectEnable);
        Builder.access$602(builder, this.redirectTimes);
        Builder.access$702(builder, this.hostnameVerifier);
        Builder.access$802(builder, this.sslSocketFactory);
        Builder.access$1302(builder, this.originUrl);
        Builder.access$1402(builder, this.formattedUrl);
        Builder.access$902(builder, this.bizId);
        Builder.access$1002(builder, this.seq);
        Builder.access$1102(builder, this.connectTimeout);
        Builder.access$1202(builder, this.readTimeout);
        Builder.access$1502(builder, this.rs);
        Builder.access$1602(builder, this.allowRequestInBg);
        return builder;
    }

    private Map<String, String> makeHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fd8cba34", new Object[]{this});
        }
        if (AwcnConfig.isCookieHeaderRedundantFix()) {
            return new HashMap(this.headers);
        }
        return this.headers;
    }

    public HttpUrl getHttpUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpUrl) ipChange.ipc$dispatch("df8d72b0", new Object[]{this}) : this.formattedUrl;
    }

    public String getUrlString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6bb9898f", new Object[]{this}) : this.formattedUrl.urlString();
    }

    public URL getUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("9e2010d5", new Object[]{this});
        }
        if (this.url == null) {
            HttpUrl httpUrl = this.sendUrl;
            if (httpUrl == null) {
                httpUrl = this.formattedUrl;
            }
            this.url = httpUrl.toURL();
        }
        return this.url;
    }

    public void setDnsOptimize(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f81fcae", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (str != null) {
            if (this.sendUrl == null) {
                this.sendUrl = new HttpUrl(this.formattedUrl);
            }
            this.sendUrl.replaceIpAndPort(str, i);
        } else {
            this.sendUrl = null;
        }
        this.url = null;
        this.rs.setIPAndPort(str, i);
    }

    public void setUrlScheme(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9162f4bb", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.sendUrl == null) {
            this.sendUrl = new HttpUrl(this.formattedUrl);
        }
        this.sendUrl.setScheme(z ? "https" : "http");
        this.url = null;
    }

    public int getRedirectTimes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fad53f8e", new Object[]{this})).intValue() : this.redirectTimes;
    }

    public String getHost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9fd6f9b", new Object[]{this}) : this.formattedUrl.host();
    }

    public String getMethod() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this}) : this.method;
    }

    public Map<String, String> getHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this}) : Collections.unmodifiableMap(this.headers);
    }

    public String getContentEncoding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc1b8e03", new Object[]{this});
        }
        String str = this.charset;
        return str != null ? str : "UTF-8";
    }

    public boolean isRedirectEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2e047454", new Object[]{this})).booleanValue() : this.isRedirectEnable;
    }

    public HostnameVerifier getHostnameVerifier() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HostnameVerifier) ipChange.ipc$dispatch("a5b76288", new Object[]{this}) : this.hostnameVerifier;
    }

    public SSLSocketFactory getSslSocketFactory() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SSLSocketFactory) ipChange.ipc$dispatch("b1613904", new Object[]{this}) : this.sslSocketFactory;
    }

    public int postBody(OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93f5330e", new Object[]{this, outputStream})).intValue();
        }
        BodyEntry bodyEntry = this.body;
        if (bodyEntry == null) {
            return 0;
        }
        return bodyEntry.writeTo(outputStream);
    }

    public byte[] getBodyBytes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f8c997e3", new Object[]{this});
        }
        if (this.body == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(128);
        try {
            postBody(byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public int requestBodyCompress(Builder builder, String str) {
        ZstdStreamDeflater zstdStreamDeflater;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db98edf", new Object[]{this, builder, str})).intValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.body == null || str == null || str.isEmpty()) {
            return -1;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Pair<OutputStream, ZstdStreamDeflater> outputStream = EncodingHelper.getOutputStream(str, byteArrayOutputStream);
            OutputStream outputStream2 = null;
            if (outputStream != null) {
                outputStream2 = (OutputStream) outputStream.first;
                zstdStreamDeflater = (ZstdStreamDeflater) outputStream.second;
            } else {
                zstdStreamDeflater = null;
            }
            int writeTo = (this.body == null || outputStream2 == null) ? -1 : this.body.writeTo(outputStream2);
            if (outputStream2 == null) {
                ALog.e("awcn.Request", "[uplink encode] compressBody fail, outputStream null, encodeType=" + str, this.seq, new Object[0]);
                this.requestBodyCompressCostTime = System.currentTimeMillis() - currentTimeMillis;
                return -1;
            }
            outputStream2.close();
            if (zstdStreamDeflater != null) {
                zstdStreamDeflater.close();
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            this.reqBodyInflateSize = writeTo;
            if (byteArray != null && byteArray.length > 0 && byteArray.length < writeTo) {
                builder.setBody(new ByteArrayEntry(byteArray));
                builder.addHeader("Content-Length", String.valueOf(byteArray.length));
                builder.addHeader(HttpConstant.CONTENT_ENCODING, str);
                this.requestBodyCompressCostTime = System.currentTimeMillis() - currentTimeMillis;
                ALog.e("awcn.Request", "[uplink encode] compressBody success, srcLen=" + writeTo + " ,compressBody len=" + byteArray.length + " cost time=" + this.requestBodyCompressCostTime + " ,encodeType=" + str, this.seq, new Object[0]);
                return 1;
            }
            this.requestBodyCompressCostTime = System.currentTimeMillis() - currentTimeMillis;
            ALog.e("awcn.Request", "[uplink encode] not need compressBody, srcLen=" + writeTo + " ,compressBody len=" + byteArray.length + " cost time=" + this.requestBodyCompressCostTime + " ,encodeType=" + str, this.seq, new Object[0]);
            return -1;
        } catch (Throwable th) {
            ALog.e("awcn.Request", "[uplink encode] compressBody fail, encodeType=" + str + " ,e=" + th.toString(), this.seq, new Object[0]);
            this.requestBodyCompressCostTime = System.currentTimeMillis() - currentTimeMillis;
            return 0;
        }
    }

    public boolean containsBody() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("49e5686c", new Object[]{this})).booleanValue() : this.body != null;
    }

    public String getBizId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d09a5221", new Object[]{this}) : this.bizId;
    }

    public String getSeq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c2a3c570", new Object[]{this}) : this.seq;
    }

    public int getReadTimeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4db89faf", new Object[]{this})).intValue() : this.readTimeout;
    }

    public int getConnectTimeout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5824f407", new Object[]{this})).intValue() : this.connectTimeout;
    }

    public boolean isAllowRequestInBg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57170945", new Object[]{this})).booleanValue() : this.allowRequestInBg;
    }

    private void formatUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4850067f", new Object[]{this});
            return;
        }
        String encodeQueryParams = Utils.encodeQueryParams(this.params, getContentEncoding());
        if (!StringUtils.isEmpty(encodeQueryParams)) {
            if (!Method.requiresRequestBody(this.method) || this.body != null) {
                String urlString = this.originUrl.urlString();
                StringBuilder sb = new StringBuilder(urlString);
                if (sb.indexOf("?") == -1) {
                    sb.append(riy.CONDITION_IF);
                } else if (urlString.charAt(urlString.length() - 1) != '&') {
                    sb.append('&');
                }
                sb.append(encodeQueryParams);
                HttpUrl parse = HttpUrl.parse(sb.toString());
                if (parse != null) {
                    this.formattedUrl = parse;
                }
            } else {
                try {
                    this.body = new ByteArrayEntry(encodeQueryParams.getBytes(getContentEncoding()));
                    Map<String, String> map = this.headers;
                    map.put("Content-Type", "application/x-www-form-urlencoded; charset=" + getContentEncoding());
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        if (this.formattedUrl != null) {
            return;
        }
        this.formattedUrl = this.originUrl;
    }

    /* loaded from: classes.dex */
    public static class Builder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean allowRequestInBg;
        private String bizId;
        private BodyEntry body;
        private String charset;
        private HttpUrl formattedUrl;
        private HostnameVerifier hostnameVerifier;
        private HttpUrl originUrl;
        private Map<String, String> params;
        private String seq;
        private SSLSocketFactory sslSocketFactory;
        private String method = "GET";
        private Map<String, String> headers = new HashMap();
        private boolean isRedirectEnable = true;
        private int redirectTimes = 0;
        private int connectTimeout = 10000;
        private int readTimeout = 10000;
        private RequestStatistic rs = null;

        static {
            kge.a(-1673470649);
        }

        public static /* synthetic */ String access$000(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd5a7181", new Object[]{builder}) : builder.method;
        }

        public static /* synthetic */ String access$002(Builder builder, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e9a461f5", new Object[]{builder, str});
            }
            builder.method = str;
            return str;
        }

        public static /* synthetic */ Map access$100(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("cd0e75b5", new Object[]{builder}) : builder.headers;
        }

        public static /* synthetic */ String access$1000(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("51781b72", new Object[]{builder}) : builder.seq;
        }

        public static /* synthetic */ String access$1002(Builder builder, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("686fd1a6", new Object[]{builder, str});
            }
            builder.seq = str;
            return str;
        }

        public static /* synthetic */ Map access$102(Builder builder, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("6a9c7738", new Object[]{builder, map});
            }
            builder.headers = map;
            return map;
        }

        public static /* synthetic */ int access$1100(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26711562", new Object[]{builder})).intValue() : builder.connectTimeout;
        }

        public static /* synthetic */ int access$1102(Builder builder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2d8ade25", new Object[]{builder, new Integer(i)})).intValue();
            }
            builder.connectTimeout = i;
            return i;
        }

        public static /* synthetic */ int access$1200(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c111d7e3", new Object[]{builder})).intValue() : builder.readTimeout;
        }

        public static /* synthetic */ int access$1202(Builder builder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e7026bc4", new Object[]{builder, new Integer(i)})).intValue();
            }
            builder.readTimeout = i;
            return i;
        }

        public static /* synthetic */ HttpUrl access$1300(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (HttpUrl) ipChange.ipc$dispatch("8b3f1849", new Object[]{builder}) : builder.originUrl;
        }

        public static /* synthetic */ HttpUrl access$1302(Builder builder, HttpUrl httpUrl) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HttpUrl) ipChange.ipc$dispatch("1b9b7a2d", new Object[]{builder, httpUrl});
            }
            builder.originUrl = httpUrl;
            return httpUrl;
        }

        public static /* synthetic */ HttpUrl access$1400(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (HttpUrl) ipChange.ipc$dispatch("6e6acb8a", new Object[]{builder}) : builder.formattedUrl;
        }

        public static /* synthetic */ HttpUrl access$1402(Builder builder, HttpUrl httpUrl) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HttpUrl) ipChange.ipc$dispatch("e2cac64c", new Object[]{builder, httpUrl});
            }
            builder.formattedUrl = httpUrl;
            return httpUrl;
        }

        public static /* synthetic */ RequestStatistic access$1500(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RequestStatistic) ipChange.ipc$dispatch("9cb7338b", new Object[]{builder}) : builder.rs;
        }

        public static /* synthetic */ RequestStatistic access$1502(Builder builder, RequestStatistic requestStatistic) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RequestStatistic) ipChange.ipc$dispatch("eaadeb6b", new Object[]{builder, requestStatistic});
            }
            builder.rs = requestStatistic;
            return requestStatistic;
        }

        public static /* synthetic */ boolean access$1600(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2b94e1f8", new Object[]{builder})).booleanValue() : builder.allowRequestInBg;
        }

        public static /* synthetic */ boolean access$1602(Builder builder, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cce0e222", new Object[]{builder, new Boolean(z)})).booleanValue();
            }
            builder.allowRequestInBg = z;
            return z;
        }

        public static /* synthetic */ Map access$200(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ddc44276", new Object[]{builder}) : builder.params;
        }

        public static /* synthetic */ Map access$202(Builder builder, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("850d7057", new Object[]{builder, map});
            }
            builder.params = map;
            return map;
        }

        public static /* synthetic */ BodyEntry access$300(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (BodyEntry) ipChange.ipc$dispatch("4a29b752", new Object[]{builder}) : builder.body;
        }

        public static /* synthetic */ BodyEntry access$302(Builder builder, BodyEntry bodyEntry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BodyEntry) ipChange.ipc$dispatch("818b1852", new Object[]{builder, bodyEntry});
            }
            builder.body = bodyEntry;
            return bodyEntry;
        }

        public static /* synthetic */ String access$400(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4e542ffd", new Object[]{builder}) : builder.charset;
        }

        public static /* synthetic */ String access$402(Builder builder, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6171f971", new Object[]{builder, str});
            }
            builder.charset = str;
            return str;
        }

        public static /* synthetic */ boolean access$500(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aacb8d88", new Object[]{builder})).booleanValue() : builder.isRedirectEnable;
        }

        public static /* synthetic */ boolean access$502(Builder builder, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("347fa892", new Object[]{builder, new Boolean(z)})).booleanValue();
            }
            builder.isRedirectEnable = z;
            return z;
        }

        public static /* synthetic */ int access$600(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("456c4ff8", new Object[]{builder})).intValue() : builder.redirectTimes;
        }

        public static /* synthetic */ int access$602(Builder builder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("edf6f64f", new Object[]{builder, new Integer(i)})).intValue();
            }
            builder.redirectTimes = i;
            return i;
        }

        public static /* synthetic */ HostnameVerifier access$700(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (HostnameVerifier) ipChange.ipc$dispatch("b1c714a8", new Object[]{builder}) : builder.hostnameVerifier;
        }

        public static /* synthetic */ HostnameVerifier access$702(Builder builder, HostnameVerifier hostnameVerifier) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HostnameVerifier) ipChange.ipc$dispatch("4450c10e", new Object[]{builder, hostnameVerifier});
            }
            builder.hostnameVerifier = hostnameVerifier;
            return hostnameVerifier;
        }

        public static /* synthetic */ SSLSocketFactory access$800(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (SSLSocketFactory) ipChange.ipc$dispatch("4510b05", new Object[]{builder}) : builder.sslSocketFactory;
        }

        public static /* synthetic */ SSLSocketFactory access$802(Builder builder, SSLSocketFactory sSLSocketFactory) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SSLSocketFactory) ipChange.ipc$dispatch("d6804a2d", new Object[]{builder, sSLSocketFactory});
            }
            builder.sslSocketFactory = sSLSocketFactory;
            return sSLSocketFactory;
        }

        public static /* synthetic */ String access$900(Builder builder) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("338c5e18", new Object[]{builder}) : builder.bizId;
        }

        public static /* synthetic */ String access$902(Builder builder, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b732f6cc", new Object[]{builder, str});
            }
            builder.bizId = str;
            return str;
        }

        public Builder setUrl(HttpUrl httpUrl) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("235412a", new Object[]{this, httpUrl});
            }
            this.originUrl = httpUrl;
            this.formattedUrl = null;
            return this;
        }

        public Builder setUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("ccf41be0", new Object[]{this, str});
            }
            this.originUrl = HttpUrl.parse(str);
            this.formattedUrl = null;
            if (this.originUrl != null) {
                return this;
            }
            throw new IllegalArgumentException("toURL is invalid! toURL = " + str);
        }

        public Builder setMethod(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("f9f337ea", new Object[]{this, str});
            }
            if (StringUtils.isEmpty(str)) {
                throw new IllegalArgumentException("method is null or empty");
            }
            if ("GET".equalsIgnoreCase(str)) {
                this.method = "GET";
            } else if ("POST".equalsIgnoreCase(str)) {
                this.method = "POST";
            } else if ("OPTIONS".equalsIgnoreCase(str)) {
                this.method = "OPTIONS";
            } else if ("HEAD".equalsIgnoreCase(str)) {
                this.method = "HEAD";
            } else if ("PUT".equalsIgnoreCase(str)) {
                this.method = "PUT";
            } else if ("DELETE".equalsIgnoreCase(str)) {
                this.method = "DELETE";
            } else {
                this.method = "GET";
            }
            return this;
        }

        public Builder setHeaders(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d99b0d04", new Object[]{this, map});
            }
            this.headers.clear();
            if (map != null) {
                this.headers.putAll(map);
            }
            return this;
        }

        public Builder addHeader(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("4e602c95", new Object[]{this, str, str2});
            }
            this.headers.put(str, str2);
            return this;
        }

        public Builder setParams(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("35248c8", new Object[]{this, map});
            }
            this.params = map;
            this.formattedUrl = null;
            return this;
        }

        public Builder addParam(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("cb243377", new Object[]{this, str, str2});
            }
            if (this.params == null) {
                this.params = new HashMap();
            }
            this.params.put(str, str2);
            this.formattedUrl = null;
            return this;
        }

        public Builder setCharset(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("29b1e0e3", new Object[]{this, str});
            }
            this.charset = str;
            this.formattedUrl = null;
            return this;
        }

        public Builder setBody(BodyEntry bodyEntry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("23782215", new Object[]{this, bodyEntry});
            }
            this.body = bodyEntry;
            return this;
        }

        public Builder setRedirectEnable(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("66d64ed2", new Object[]{this, new Boolean(z)});
            }
            this.isRedirectEnable = z;
            return this;
        }

        public Builder setRedirectTimes(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("1d94b94a", new Object[]{this, new Integer(i)});
            }
            this.redirectTimes = i;
            return this;
        }

        public Builder setHostnameVerifier(HostnameVerifier hostnameVerifier) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("3266954", new Object[]{this, hostnameVerifier});
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        public Builder setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("df569d94", new Object[]{this, sSLSocketFactory});
            }
            this.sslSocketFactory = sSLSocketFactory;
            return this;
        }

        public Builder setBizId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("5901bbe1", new Object[]{this, str});
            }
            this.bizId = str;
            return this;
        }

        public Builder setSeq(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("4a910ef0", new Object[]{this, str});
            }
            this.seq = str;
            return this;
        }

        public Builder setReadTimeout(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e77ec5ab", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                this.readTimeout = i;
            }
            return this;
        }

        public Builder setConnectTimeout(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("e45ace9b", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                this.connectTimeout = i;
            }
            return this;
        }

        public Builder setRequestStatistic(RequestStatistic requestStatistic) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("d18058c0", new Object[]{this, requestStatistic});
            }
            this.rs = requestStatistic;
            return this;
        }

        public Builder setAllowRequestInBg(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Builder) ipChange.ipc$dispatch("4335b903", new Object[]{this, new Boolean(z)});
            }
            this.allowRequestInBg = z;
            return this;
        }

        public Request build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Request) ipChange.ipc$dispatch("3a635fc0", new Object[]{this});
            }
            if (this.body == null && this.params == null && Method.requiresRequestBody(this.method)) {
                ALog.e("awcn.Request", "method " + this.method + " must have a request body", null, new Object[0]);
            }
            if (this.body != null && !Method.permitsRequestBody(this.method)) {
                ALog.e("awcn.Request", "method " + this.method + " should not have a request body", null, new Object[0]);
                this.body = null;
            }
            BodyEntry bodyEntry = this.body;
            if (bodyEntry != null && bodyEntry.getContentType() != null) {
                addHeader("Content-Type", this.body.getContentType());
            }
            return new Request(this);
        }
    }
}
