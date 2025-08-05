package com.alipay.mobile.common.transport.http;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.alipay.mobile.common.netsdkextdependapi.appinfo.AppInfoUtil;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.DefaultHttpRoutePlanner;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;
import tb.riy;

/* loaded from: classes3.dex */
public final class AndroidHttpClient implements HttpClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CONNECTION_POOL_TIMEOUT = Integer.MAX_VALUE;
    public static long DEFAULT_SYNC_MIN_GZIP_BYTES = 160;
    public static int INSTANCE_TYPE_BIG = 1;
    public static int INSTANCE_TYPE_NORMAL = 0;
    public static final int MAX_CONNECTIONS = 70;
    public static final int MAX_ROUTE = 30;
    public static final int NORMAL_ROUTE = 6;

    /* renamed from: a  reason: collision with root package name */
    private static String[] f5547a = {"text/", "application/xml", "application/json"};
    private static final HttpRequestInterceptor b = new HttpRequestInterceptor() { // from class: com.alipay.mobile.common.transport.http.AndroidHttpClient.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void process(HttpRequest httpRequest, HttpContext httpContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7665a43", new Object[]{this, httpRequest, httpContext});
            } else if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
                throw new RuntimeException("This thread forbids HTTP requests");
            }
        }
    };
    private final HttpClient c;
    private RuntimeException d = new IllegalStateException("AndroidHttpClient created and never closed");
    private volatile LoggingConfiguration e;

    public static /* synthetic */ HttpRequestInterceptor access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpRequestInterceptor) ipChange.ipc$dispatch("aea8c3ff", new Object[0]) : b;
    }

    public static /* synthetic */ LoggingConfiguration access$300(AndroidHttpClient androidHttpClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoggingConfiguration) ipChange.ipc$dispatch("23dea701", new Object[]{androidHttpClient}) : androidHttpClient.e;
    }

    public static /* synthetic */ String access$500(HttpUriRequest httpUriRequest, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c32c73f6", new Object[]{httpUriRequest, new Boolean(z)}) : a(httpUriRequest, z);
    }

    public static AndroidHttpClient newInstance(String str, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AndroidHttpClient) ipChange.ipc$dispatch("921a79e4", new Object[]{str, context}) : newInstance(str, context, INSTANCE_TYPE_NORMAL);
    }

    public static AndroidHttpClient newInstance(String str, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidHttpClient) ipChange.ipc$dispatch("d567a5a3", new Object[]{str, context, new Integer(i)});
        }
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 15000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, false);
        HttpConnectionParams.setTcpNoDelay(basicHttpParams, true);
        setMaxTotalConnections(basicHttpParams, i);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", new ZSSLSocketFactory(), 443));
        ZThreadSafeClientConnManager zThreadSafeClientConnManager = new ZThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
        a();
        return new AndroidHttpClient(zThreadSafeClientConnManager, basicHttpParams);
    }

    public static void setMaxTotalConnections(HttpParams httpParams, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8333c82", new Object[]{httpParams, new Integer(i)});
            return;
        }
        ConnManagerParams.setTimeout(httpParams, 2147483647L);
        int i2 = 6;
        if (i == INSTANCE_TYPE_BIG) {
            i2 = 30;
        }
        ConnManagerParams.setMaxConnectionsPerRoute(httpParams, new ConnPerRouteBean(i2));
        ConnManagerParams.setMaxTotalConnections(httpParams, 70);
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (TransportEnvUtil.getContext() == null || !AppInfoUtil.isDebuggable()) {
        } else {
            LogCatUtil.printInfo("AndroidHttpClient", "Open HttpClient Log !");
        }
    }

    public static AndroidHttpClient newInstance(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AndroidHttpClient) ipChange.ipc$dispatch("a62f8a8", new Object[]{str}) : newInstance(str, null);
    }

    public static AndroidHttpClient newDefaultInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AndroidHttpClient) ipChange.ipc$dispatch("a10db07f", new Object[0]) : newInstance("Android_Ant_Client", null);
    }

    public static AndroidHttpClient newInstanceOfBigConn(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AndroidHttpClient) ipChange.ipc$dispatch("49adcff3", new Object[]{str}) : newInstance(str, null, INSTANCE_TYPE_BIG);
    }

    private AndroidHttpClient(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.c = new DefaultHttpClient(clientConnectionManager, httpParams) { // from class: com.alipay.mobile.common.transport.http.AndroidHttpClient.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == -2133082364) {
                    return super.createHttpProcessor();
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            public BasicHttpProcessor createHttpProcessor() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (BasicHttpProcessor) ipChange.ipc$dispatch("80dbbf04", new Object[]{this});
                }
                BasicHttpProcessor createHttpProcessor = super.createHttpProcessor();
                createHttpProcessor.addRequestInterceptor(AndroidHttpClient.access$000());
                createHttpProcessor.addRequestInterceptor(new CurlLogger());
                return createHttpProcessor;
            }

            public HttpContext createHttpContext() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (HttpContext) ipChange.ipc$dispatch("1a291a92", new Object[]{this});
                }
                BasicHttpContext basicHttpContext = new BasicHttpContext();
                basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
                basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
                basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
                return basicHttpContext;
            }

            public ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ConnectionKeepAliveStrategy) ipChange.ipc$dispatch("aa827552", new Object[]{this}) : new ConnectionKeepAliveStrategy() { // from class: com.alipay.mobile.common.transport.http.AndroidHttpClient.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Number) ipChange2.ipc$dispatch("e11ceca4", new Object[]{this, httpResponse, httpContext})).longValue();
                        }
                        return 30000L;
                    }
                };
            }

            public HttpRoutePlanner createHttpRoutePlanner() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (HttpRoutePlanner) ipChange.ipc$dispatch("f4ddbd9", new Object[]{this}) : new DefaultHttpRoutePlanner(getConnectionManager().getSchemeRegistry());
            }

            public RedirectHandler createRedirectHandler() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (RedirectHandler) ipChange.ipc$dispatch("e60fb571", new Object[]{this}) : new DefaultRedirectHandler();
            }
        };
        enableCurlLogging("AndroidHttpClient", 2);
    }

    public static void modifyRequestToAcceptGzipResponse(HttpRequest httpRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("477c66b1", new Object[]{httpRequest});
        } else {
            httpRequest.addHeader("Accept-Encoding", "gzip");
        }
    }

    public void setHttpRequestRetryHandler(HttpRequestRetryHandler httpRequestRetryHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab38767", new Object[]{this, httpRequestRetryHandler});
        } else {
            this.c.setHttpRequestRetryHandler(httpRequestRetryHandler);
        }
    }

    public static void modifyRequestToKeepAlive(HttpRequest httpRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08481cc", new Object[]{httpRequest});
        } else {
            httpRequest.addHeader("Connection", "Keep-Alive");
        }
    }

    public static InputStream getUngzippedContent(HttpEntity httpEntity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("57ad3b70", new Object[]{httpEntity}) : getUngzippedContent(httpEntity.getContent(), httpEntity.getContentEncoding());
    }

    public static InputStream getUngzippedContent(InputStream inputStream, Header header) {
        String value;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InputStream) ipChange.ipc$dispatch("48f1004d", new Object[]{inputStream, header}) : (inputStream == null || header == null || (value = header.getValue()) == null || !value.contains("gzip")) ? inputStream : new GZIPInputStream(inputStream);
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.d == null) {
        } else {
            getConnectionManager().shutdown();
            this.d = null;
        }
    }

    public HttpParams getParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpParams) ipChange.ipc$dispatch("233d330e", new Object[]{this}) : this.c.getParams();
    }

    public ClientConnectionManager getConnectionManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ClientConnectionManager) ipChange.ipc$dispatch("81729133", new Object[]{this}) : this.c.getConnectionManager();
    }

    public RedirectHandler getRedirectHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RedirectHandler) ipChange.ipc$dispatch("13301f4b", new Object[]{this}) : this.c.getRedirectHandler();
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("2e48d5a1", new Object[]{this, httpUriRequest}) : this.c.execute(httpUriRequest);
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("ef755873", new Object[]{this, httpUriRequest, httpContext}) : this.c.execute(httpUriRequest, httpContext);
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("3908d64a", new Object[]{this, httpHost, httpRequest}) : this.c.execute(httpHost, httpRequest);
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("9bd8925c", new Object[]{this, httpHost, httpRequest, httpContext}) : this.c.execute(httpHost, httpRequest, httpContext);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("dcc2fbcf", new Object[]{this, httpUriRequest, responseHandler}) : (T) this.c.execute(httpUriRequest, responseHandler);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("3d9a9c61", new Object[]{this, httpUriRequest, responseHandler, httpContext}) : (T) this.c.execute(httpUriRequest, responseHandler, httpContext);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("8d40d4f8", new Object[]{this, httpHost, httpRequest, responseHandler}) : (T) this.c.execute(httpHost, httpRequest, responseHandler);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("ab154eca", new Object[]{this, httpHost, httpRequest, responseHandler, httpContext}) : (T) this.c.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    public static AbstractHttpEntity getCompressedEntity(byte[] bArr, ContentResolver contentResolver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractHttpEntity) ipChange.ipc$dispatch("ead307f9", new Object[]{bArr, contentResolver});
        }
        LogCatUtil.info("RPC_PERF", "gzip...");
        if (bArr.length < getMinGzipSize(contentResolver)) {
            return new ByteArrayEntity(bArr);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
        byteArrayEntity.setContentEncoding("gzip");
        LogCatUtil.info("RPC_PERF", "gzip size:" + bArr.length + "->" + byteArrayEntity.getContentLength());
        return byteArrayEntity;
    }

    public static long getMinGzipSize(ContentResolver contentResolver) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d6b8fce", new Object[]{contentResolver})).longValue() : DEFAULT_SYNC_MIN_GZIP_BYTES;
    }

    /* loaded from: classes3.dex */
    public static class LoggingConfiguration {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f5548a;
        private final int b;

        public static /* synthetic */ boolean access$400(LoggingConfiguration loggingConfiguration) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ba7107c2", new Object[]{loggingConfiguration})).booleanValue() : loggingConfiguration.a();
        }

        public static /* synthetic */ void access$600(LoggingConfiguration loggingConfiguration, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3726440a", new Object[]{loggingConfiguration, str});
            } else {
                loggingConfiguration.a(str);
            }
        }

        private LoggingConfiguration(String str, int i) {
            this.f5548a = str;
            this.b = i;
        }

        private boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            if (MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
                return true;
            }
            if (this.f5548a.length() <= 23) {
                return Log.isLoggable(this.f5548a, this.b);
            }
            return false;
        }

        private void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else if (MiscUtils.isDebugger(TransportEnvUtil.getContext())) {
                LogCatUtil.printInfo("AndroidHttpClient", "AndroidHttpClient level=[" + this.b + "]  tag=[" + this.f5548a + "]  message=[" + str + riy.ARRAY_END_STR);
            } else {
                Log.println(this.b, this.f5548a, str);
            }
        }
    }

    public void enableCurlLogging(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5402282", new Object[]{this, str, new Integer(i)});
        } else if (str == null) {
            throw new IllegalArgumentException("name may not be null");
        } else {
            if (i < 2 || i > 7) {
                throw new IllegalArgumentException("Level is out of range [2..7]");
            }
            this.e = new LoggingConfiguration(str, i);
        }
    }

    public void disableCurlLogging() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33227e92", new Object[]{this});
        } else {
            this.e = null;
        }
    }

    /* loaded from: classes3.dex */
    public class CurlLogger implements HttpRequestInterceptor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private CurlLogger() {
        }

        public void process(HttpRequest httpRequest, HttpContext httpContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7665a43", new Object[]{this, httpRequest, httpContext});
                return;
            }
            LoggingConfiguration access$300 = AndroidHttpClient.access$300(AndroidHttpClient.this);
            if (access$300 == null || !LoggingConfiguration.access$400(access$300) || !(httpRequest instanceof HttpUriRequest)) {
                return;
            }
            LoggingConfiguration.access$600(access$300, AndroidHttpClient.access$500((HttpUriRequest) httpRequest, true));
        }
    }

    private static String a(HttpUriRequest httpUriRequest, boolean z) {
        Header[] allHeaders;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39cc2cca", new Object[]{httpUriRequest, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("curl ");
        for (Header header : httpUriRequest.getAllHeaders()) {
            if (z || (!TextUtils.equals(header.getName(), "Authorization") && !TextUtils.equals(header.getName(), "Cookie"))) {
                sb.append("--header \"");
                sb.append(header.toString().trim());
                sb.append("\" ");
            }
        }
        URI uri = httpUriRequest.getURI();
        HttpRequest httpRequest = null;
        if (httpUriRequest instanceof RequestWrapper) {
            httpRequest = ((RequestWrapper) httpUriRequest).getOriginal();
        }
        if (httpRequest != null && (httpRequest instanceof HttpUriRequest)) {
            uri = ((HttpUriRequest) httpRequest).getURI();
        }
        sb.append("\"");
        sb.append(uri);
        sb.append("\"");
        if (!(httpUriRequest instanceof HttpEntityEnclosingRequest)) {
            return sb.toString();
        }
        HttpEntity entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity();
        if (entity == null || !entity.isRepeatable()) {
            return sb.toString();
        }
        if (entity.getContentLength() > 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            entity.writeTo(byteArrayOutputStream);
            a(httpUriRequest, sb, byteArrayOutputStream);
        } else {
            sb.append(" [NO DATA]");
        }
        return sb.toString();
    }

    private static void a(HttpUriRequest httpUriRequest, StringBuilder sb, ByteArrayOutputStream byteArrayOutputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d0e6efe", new Object[]{httpUriRequest, sb, byteArrayOutputStream});
        } else if (a(httpUriRequest)) {
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            sb.insert(0, "echo '" + encodeToString + "' | base64 -d > /tmp/$$.bin; ");
            sb.append(" --data-binary @/tmp/$$.bin");
        } else {
            String byteArrayOutputStream2 = byteArrayOutputStream.toString();
            sb.append(" --data-ascii \"");
            sb.append(byteArrayOutputStream2);
            sb.append("\"");
        }
    }

    private static boolean a(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d512c02", new Object[]{httpUriRequest})).booleanValue();
        }
        Header[] headers = httpUriRequest.getHeaders("content-encoding");
        if (headers != null) {
            for (Header header : headers) {
                if ("gzip".equalsIgnoreCase(header.getValue())) {
                    return true;
                }
            }
        }
        Header[] headers2 = httpUriRequest.getHeaders("content-type");
        if (headers2 != null) {
            for (Header header2 : headers2) {
                for (String str : f5547a) {
                    if (header2.getValue().startsWith(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static long parseDate(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("78e300c6", new Object[]{str})).longValue() : HttpDateTime.parse(str);
    }
}
