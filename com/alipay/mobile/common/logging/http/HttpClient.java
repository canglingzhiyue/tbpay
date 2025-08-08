package com.alipay.mobile.common.logging.http;

import android.content.Context;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.http.AndroidHttpClient;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.alipay.mobile.common.logging.api.http.BaseHttpClient;
import com.alipay.mobile.common.logging.util.NetUtil;
import com.alipay.mobile.common.logging.util.ZipUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.security.mobile.module.http.constant.RpcConfigureConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import tb.riy;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class HttpClient extends BaseHttpClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static AndroidHttpClient c;

    /* renamed from: a  reason: collision with root package name */
    public HttpResponse f5441a;
    public String b;
    private Context d;
    private String e;
    private HttpRequest f;
    private long g;
    private long h;

    public static /* synthetic */ Object ipc$super(HttpClient httpClient, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public HttpClient(String str, Context context) {
        super(str, context);
        this.g = -1L;
        this.h = -1L;
        this.d = context;
        this.e = str;
    }

    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    public void setUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.d = context;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    public long getRequestLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3ae8b9a", new Object[]{this})).longValue();
        }
        long j = this.g;
        if (j > 0) {
            return j;
        }
        HttpPost httpPost = this.f;
        if (!(httpPost instanceof HttpPost)) {
            return -1L;
        }
        try {
            HttpEntity entity = httpPost.getEntity();
            if (entity == null) {
                return -1L;
            }
            return entity.getContentLength();
        } catch (Throwable unused) {
            return -1L;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    public int getResponseCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("baa782be", new Object[]{this})).intValue();
        }
        HttpResponse httpResponse = this.f5441a;
        if (httpResponse == null) {
            return -1;
        }
        try {
            StatusLine statusLine = httpResponse.getStatusLine();
            if (statusLine == null) {
                return -1;
            }
            return statusLine.getStatusCode();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    public String getResponseContent() {
        Header[] headers;
        String value;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af6aed77", new Object[]{this});
        }
        HttpResponse httpResponse = this.f5441a;
        if (httpResponse == null) {
            return null;
        }
        try {
            HttpEntity entity = httpResponse.getEntity();
            HttpResponse httpResponse2 = this.f5441a;
            if (httpResponse2 == null || (headers = httpResponse2.getHeaders(HttpConstant.CONTENT_ENCODING)) == null || headers.length <= 0 || (value = headers[0].getValue()) == null || value.toLowerCase().indexOf("gzip") < 0) {
                z = false;
            }
            if (!z) {
                if (entity == null) {
                    return null;
                }
                return EntityUtils.toString(entity);
            }
            byte[] unCompressGzip = ZipUtil.unCompressGzip(this.f5441a.getEntity().getContent());
            if (unCompressGzip == null) {
                return null;
            }
            this.h = unCompressGzip.length;
            return new String(unCompressGzip, "UTF-8");
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    public long getResponseLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e4d9178", new Object[]{this})).longValue();
        }
        long j = this.h;
        if (j > 0) {
            return j;
        }
        HttpResponse httpResponse = this.f5441a;
        if (httpResponse == null) {
            return -1L;
        }
        try {
            HttpEntity entity = httpResponse.getEntity();
            if (entity == null) {
                return -1L;
            }
            return entity.getContentLength();
        } catch (Throwable unused) {
            return -1L;
        }
    }

    private URL a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("b391bad", new Object[]{this});
        }
        if (StringUtils.isEmpty(this.e)) {
            return null;
        }
        try {
            return new URL(this.e);
        } catch (Throwable unused) {
            return null;
        }
    }

    private HttpHost b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("41bc79fb", new Object[]{this});
        }
        URL a2 = a();
        if (a2 == null) {
            return null;
        }
        String host = a2.getHost();
        if (StringUtils.isEmpty(host)) {
            return null;
        }
        String protocol = a2.getProtocol();
        if (StringUtils.isEmpty(protocol)) {
            return null;
        }
        int port = a2.getPort();
        if (port <= 0) {
            port = "https".equalsIgnoreCase(protocol) ? 443 : 80;
        }
        try {
            return new HttpHost(host, port, protocol);
        } catch (Throwable unused) {
            return null;
        }
    }

    private HttpHost c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("4269259a", new Object[]{this});
        }
        NetworkInfo activeNetworkInfo = NetUtil.getActiveNetworkInfo(this.d);
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable() || activeNetworkInfo.getType() != 0) {
            return null;
        }
        try {
            String defaultHost = Proxy.getDefaultHost();
            if (StringUtils.isEmpty(defaultHost)) {
                return null;
            }
            return new HttpHost(defaultHost, Proxy.getDefaultPort());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    public void closeStreamForNextExecute() {
        InputStream content;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c623638", new Object[]{this});
            return;
        }
        this.g = -1L;
        this.h = -1L;
        HttpGet httpGet = this.f;
        if (httpGet != null) {
            try {
                if (httpGet instanceof HttpGet) {
                    httpGet.abort();
                } else if (httpGet instanceof HttpPost) {
                    ((HttpPost) httpGet).abort();
                }
            } catch (Throwable unused) {
            }
            this.f = null;
        }
        HttpResponse httpResponse = this.f5441a;
        if (httpResponse == null) {
            return;
        }
        try {
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null && (content = entity.getContent()) != null) {
                content.close();
            }
        } catch (Throwable unused2) {
        }
        this.f5441a = null;
    }

    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    public HttpResponse synchronousRequestByGET(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("80d7d486", new Object[]{this, map});
        }
        closeStreamForNextExecute();
        try {
            String formatParamStringForGET = NetUtil.formatParamStringForGET(map);
            if (StringUtils.isEmpty(formatParamStringForGET)) {
                str = this.e;
            } else {
                str = this.e + riy.CONDITION_IF + formatParamStringForGET;
            }
            this.b = str;
            this.f = new HttpGet(str);
            this.f.addHeader("Content-type", "text/xml");
            this.f.addHeader("Accept-Encoding", "gzip");
            d();
            this.f5441a = c.execute(b(), this.f);
            return this.f5441a;
        } catch (Throwable th) {
            closeStreamForNextExecute();
            throw new IllegalStateException(th);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:6|(3:27|28|(1:30)(7:31|(3:12|(2:15|13)|16)|17|18|19|20|21))|8|(4:10|12|(1:13)|16)|17|18|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
        r3.f5441a = com.alipay.mobile.common.logging.http.HttpClient.c.execute(r4, r3.f, new org.apache.http.protocol.BasicHttpContext());
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: Throwable -> 0x0095, LOOP:0: B:17:0x0053->B:19:0x0059, LOOP_END, TryCatch #0 {Throwable -> 0x0095, blocks: (B:8:0x0020, B:11:0x0024, B:14:0x0045, B:16:0x004b, B:17:0x0053, B:19:0x0059, B:20:0x0071, B:21:0x0078, B:23:0x0083, B:12:0x003a), top: B:29:0x0020, inners: #1 }] */
    @Override // com.alipay.mobile.common.logging.api.http.BaseHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.HttpResponse synchronousRequestByPOST(byte[] r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.mobile.common.logging.http.HttpClient.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            r4 = 2
            r1[r4] = r5
            java.lang.String r4 = "9ee671d1"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            org.apache.http.HttpResponse r4 = (org.apache.http.HttpResponse) r4
            return r4
        L1b:
            r3.closeStreamForNextExecute()
            if (r4 == 0) goto L3a
            int r0 = r4.length     // Catch: java.lang.Throwable -> L95
            if (r0 != 0) goto L24
            goto L3a
        L24:
            org.apache.http.client.methods.HttpPost r0 = new org.apache.http.client.methods.HttpPost     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = r3.e     // Catch: java.lang.Throwable -> L95
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L95
            org.apache.http.entity.ByteArrayEntity r1 = new org.apache.http.entity.ByteArrayEntity     // Catch: java.lang.Throwable -> L95
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L95
            r0.setEntity(r1)     // Catch: java.lang.Throwable -> L95
            int r4 = r4.length     // Catch: java.lang.Throwable -> L95
            long r1 = (long) r4     // Catch: java.lang.Throwable -> L95
            r3.g = r1     // Catch: java.lang.Throwable -> L95
            r3.f = r0     // Catch: java.lang.Throwable -> L95
            goto L43
        L3a:
            org.apache.http.client.methods.HttpGet r4 = new org.apache.http.client.methods.HttpGet     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = r3.e     // Catch: java.lang.Throwable -> L95
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L95
            r3.f = r4     // Catch: java.lang.Throwable -> L95
        L43:
            if (r5 == 0) goto L71
            int r4 = r5.size()     // Catch: java.lang.Throwable -> L95
            if (r4 <= 0) goto L71
            java.util.Set r4 = r5.entrySet()     // Catch: java.lang.Throwable -> L95
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L95
        L53:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L95
            if (r5 == 0) goto L71
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L95
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = r5.getKey()     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L95
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L95
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L95
            org.apache.http.HttpRequest r1 = r3.f     // Catch: java.lang.Throwable -> L95
            r1.addHeader(r0, r5)     // Catch: java.lang.Throwable -> L95
            goto L53
        L71:
            r3.d()     // Catch: java.lang.Throwable -> L95
            org.apache.http.HttpHost r4 = r3.b()     // Catch: java.lang.Throwable -> L95
            android.net.http.AndroidHttpClient r5 = com.alipay.mobile.common.logging.http.HttpClient.c     // Catch: java.lang.NullPointerException -> L83 java.lang.Throwable -> L95
            org.apache.http.HttpRequest r0 = r3.f     // Catch: java.lang.NullPointerException -> L83 java.lang.Throwable -> L95
            org.apache.http.HttpResponse r5 = r5.execute(r4, r0)     // Catch: java.lang.NullPointerException -> L83 java.lang.Throwable -> L95
            r3.f5441a = r5     // Catch: java.lang.NullPointerException -> L83 java.lang.Throwable -> L95
            goto L92
        L83:
            android.net.http.AndroidHttpClient r5 = com.alipay.mobile.common.logging.http.HttpClient.c     // Catch: java.lang.Throwable -> L95
            org.apache.http.HttpRequest r0 = r3.f     // Catch: java.lang.Throwable -> L95
            org.apache.http.protocol.BasicHttpContext r1 = new org.apache.http.protocol.BasicHttpContext     // Catch: java.lang.Throwable -> L95
            r1.<init>()     // Catch: java.lang.Throwable -> L95
            org.apache.http.HttpResponse r4 = r5.execute(r4, r0, r1)     // Catch: java.lang.Throwable -> L95
            r3.f5441a = r4     // Catch: java.lang.Throwable -> L95
        L92:
            org.apache.http.HttpResponse r4 = r3.f5441a
            return r4
        L95:
            r4 = move-exception
            r3.closeStreamForNextExecute()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.http.HttpClient.synchronousRequestByPOST(byte[], java.util.Map):org.apache.http.HttpResponse");
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (c == null) {
            synchronized (HttpClient.class) {
                if (c == null) {
                    try {
                        AndroidHttpClient newInstance = AndroidHttpClient.newInstance("alipay", this.d);
                        c = newInstance;
                        HttpParams params = newInstance.getParams();
                        if (params != null) {
                            params.setParameter("http.connection.timeout", 30000);
                            params.setParameter("http.socket.timeout", Integer.valueOf((int) RpcConfigureConstant.STATIC_DATA_UPDATE_TIMEOUT));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        AndroidHttpClient androidHttpClient = c;
        if (androidHttpClient == null) {
            return;
        }
        try {
            HttpParams params2 = androidHttpClient.getParams();
            if (params2 == null) {
                return;
            }
            params2.setParameter("http.route.default-proxy", c());
        } catch (Throwable unused2) {
        }
    }
}
