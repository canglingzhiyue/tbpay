package com.alipay.literpc.android.phone.mrpc.core;

import android.content.ContentResolver;
import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.security.Security;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.ClientProtocolException;
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
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;
import tb.cew;

/* loaded from: classes3.dex */
public final class AndroidHttpClient implements HttpClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static long DEFAULT_SYNC_MIN_GZIP_BYTES = 160;

    /* renamed from: a  reason: collision with root package name */
    private static String[] f5280a = {"text/", "application/xml", "application/json"};
    private static final HttpRequestInterceptor b = new HttpRequestInterceptor() { // from class: com.alipay.literpc.android.phone.mrpc.core.AndroidHttpClient.1
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

    public static /* synthetic */ LoggingConfiguration a(AndroidHttpClient androidHttpClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LoggingConfiguration) ipChange.ipc$dispatch("8bd713ed", new Object[]{androidHttpClient}) : androidHttpClient.e;
    }

    public static /* synthetic */ String a(HttpUriRequest httpUriRequest, boolean z) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("39cc2cca", new Object[]{httpUriRequest, new Boolean(z)}) : b(httpUriRequest, z);
    }

    public static /* synthetic */ HttpRequestInterceptor a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpRequestInterceptor) ipChange.ipc$dispatch("3e99a1ee", new Object[0]) : b;
    }

    public static AndroidHttpClient newInstance(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AndroidHttpClient) ipChange.ipc$dispatch("9ddb77ca", new Object[]{str, context});
        }
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 20000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, true);
        HttpClientParams.setAuthenticating(basicHttpParams, false);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", SSLCertificateSocketFactory.getHttpSocketFactory(30000, context == null ? null : new SSLSessionCache(context)), 443));
        ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
        ConnManagerParams.setTimeout(basicHttpParams, 60000L);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(10));
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
        Security.setProperty("networkaddress.cache.ttl", String.valueOf(-1));
        b();
        return new AndroidHttpClient(threadSafeClientConnManager, basicHttpParams);
    }

    public static AndroidHttpClient newInstance(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AndroidHttpClient) ipChange.ipc$dispatch("1a335286", new Object[]{str}) : newInstance(str, null);
    }

    private AndroidHttpClient(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.c = new DefaultHttpClient(clientConnectionManager, httpParams) { // from class: com.alipay.literpc.android.phone.mrpc.core.AndroidHttpClient.2
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
                createHttpProcessor.addRequestInterceptor(AndroidHttpClient.a());
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

            public RedirectHandler createRedirectHandler() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (RedirectHandler) ipChange.ipc$dispatch("e60fb571", new Object[]{this}) : new DefaultRedirectHandler() { // from class: com.alipay.literpc.android.phone.mrpc.core.AndroidHttpClient.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a  reason: collision with root package name */
                    public int f5282a;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                        if (str.hashCode() == 1628537942) {
                            return new Boolean(super.isRedirectRequested((HttpResponse) objArr[0], (HttpContext) objArr[1]));
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }

                    public boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
                        int statusCode;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("61118456", new Object[]{this, httpResponse, httpContext})).booleanValue();
                        }
                        this.f5282a++;
                        boolean isRedirectRequested = super.isRedirectRequested(httpResponse, httpContext);
                        if (!isRedirectRequested && this.f5282a < 5 && ((statusCode = httpResponse.getStatusLine().getStatusCode()) == 301 || statusCode == 302)) {
                            return true;
                        }
                        return isRedirectRequested;
                    }
                };
            }

            public ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ConnectionKeepAliveStrategy) ipChange.ipc$dispatch("aa827552", new Object[]{this}) : new ConnectionKeepAliveStrategy() { // from class: com.alipay.literpc.android.phone.mrpc.core.AndroidHttpClient.2.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("e11ceca4", new Object[]{this, httpResponse, httpContext})).longValue() : cew.a.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT;
                    }
                };
            }
        };
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

    public static InputStream getUngzippedContent(HttpEntity httpEntity) throws IOException {
        Header contentEncoding;
        String value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InputStream) ipChange.ipc$dispatch("57ad3b70", new Object[]{httpEntity});
        }
        InputStream content = httpEntity.getContent();
        if (content != null && (contentEncoding = httpEntity.getContentEncoding()) != null && (value = contentEncoding.getValue()) != null && value.contains("gzip")) {
            return new GZIPInputStream(content);
        }
        return content;
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

    public HttpResponse execute(HttpUriRequest httpUriRequest) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("2e48d5a1", new Object[]{this, httpUriRequest}) : this.c.execute(httpUriRequest);
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("ef755873", new Object[]{this, httpUriRequest, httpContext}) : this.c.execute(httpUriRequest, httpContext);
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("3908d64a", new Object[]{this, httpHost, httpRequest}) : this.c.execute(httpHost, httpRequest);
    }

    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("9bd8925c", new Object[]{this, httpHost, httpRequest, httpContext}) : this.c.execute(httpHost, httpRequest, httpContext);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) throws IOException, ClientProtocolException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("dcc2fbcf", new Object[]{this, httpUriRequest, responseHandler}) : (T) this.c.execute(httpUriRequest, responseHandler);
    }

    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException, ClientProtocolException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("3d9a9c61", new Object[]{this, httpUriRequest, responseHandler, httpContext}) : (T) this.c.execute(httpUriRequest, responseHandler, httpContext);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException, ClientProtocolException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("8d40d4f8", new Object[]{this, httpHost, httpRequest, responseHandler}) : (T) this.c.execute(httpHost, httpRequest, responseHandler);
    }

    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException, ClientProtocolException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("ab154eca", new Object[]{this, httpHost, httpRequest, responseHandler, httpContext}) : (T) this.c.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    public static AbstractHttpEntity getCompressedEntity(byte[] bArr, ContentResolver contentResolver) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractHttpEntity) ipChange.ipc$dispatch("ead307f9", new Object[]{bArr, contentResolver});
        }
        if (bArr.length < getMinGzipSize(contentResolver)) {
            return new ByteArrayEntity(bArr);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
        byteArrayEntity.setContentEncoding("gzip");
        String str = "gzip size:" + bArr.length + "->" + byteArrayEntity.getContentLength();
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
        private final String f5285a;
        private final int b;

        public static /* synthetic */ void a(LoggingConfiguration loggingConfiguration, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52f9e461", new Object[]{loggingConfiguration, str});
            } else {
                loggingConfiguration.a(str);
            }
        }

        public static /* synthetic */ boolean a(LoggingConfiguration loggingConfiguration) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("50a025b", new Object[]{loggingConfiguration})).booleanValue() : loggingConfiguration.a();
        }

        private LoggingConfiguration(String str, int i) {
            this.f5285a = str;
            this.b = i;
        }

        private boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : Log.isLoggable(this.f5285a, this.b);
        }

        private void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                Log.println(this.b, this.f5285a, str);
            }
        }
    }

    public void enableCurlLogging(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5402282", new Object[]{this, str, new Integer(i)});
        } else if (str == null) {
            throw new NullPointerException("name");
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

        public void process(HttpRequest httpRequest, HttpContext httpContext) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7665a43", new Object[]{this, httpRequest, httpContext});
                return;
            }
            LoggingConfiguration a2 = AndroidHttpClient.a(AndroidHttpClient.this);
            if (a2 == null || !LoggingConfiguration.a(a2) || !(httpRequest instanceof HttpUriRequest)) {
                return;
            }
            LoggingConfiguration.a(a2, AndroidHttpClient.a((HttpUriRequest) httpRequest, false));
        }
    }

    private static String b(HttpUriRequest httpUriRequest, boolean z) throws IOException {
        Header[] allHeaders;
        HttpEntity entity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72ac8d69", new Object[]{httpUriRequest, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("curl ");
        for (Header header : httpUriRequest.getAllHeaders()) {
            if (z || (!header.getName().equals("Authorization") && !header.getName().equals("Cookie"))) {
                sb.append("--header \"");
                sb.append(header.toString().trim());
                sb.append("\" ");
            }
        }
        URI uri = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpUriRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = original.getURI();
            }
        }
        sb.append("\"");
        sb.append(uri);
        sb.append("\"");
        if ((httpUriRequest instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity()) != null && entity.isRepeatable()) {
            if (entity.getContentLength() < 1024) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                if (a(httpUriRequest)) {
                    sb.insert(0, "echo '" + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2) + "' | base64 -d > /tmp/$$.bin; ");
                    sb.append(" --data-binary @/tmp/$$.bin");
                } else {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                    sb.append(" --data-ascii \"");
                    sb.append(byteArrayOutputStream2);
                    sb.append("\"");
                }
            } else {
                sb.append(" [TOO MUCH DATA TO INCLUDE]");
            }
        }
        return sb.toString();
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
                for (String str : f5280a) {
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

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        }
    }
}
