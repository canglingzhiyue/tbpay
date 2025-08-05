package com.alipay.android.msp.network.http.http;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.metaInfo.appinfo.cacheConfig.a;
import java.io.IOException;
import java.net.SocketException;
import java.security.Security;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;
import tb.orq;

@Deprecated
/* loaded from: classes3.dex */
public class PhoneCashierHttpClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static PhoneCashierHttpClient f4926a = null;
    private static boolean b = false;
    private static DefaultHttpClient c;
    private static int d;
    private HttpUriRequest e;

    public static /* synthetic */ HttpUriRequest a(PhoneCashierHttpClient phoneCashierHttpClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpUriRequest) ipChange.ipc$dispatch("bd256dea", new Object[]{phoneCashierHttpClient}) : phoneCashierHttpClient.e;
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            b();
        }
    }

    private PhoneCashierHttpClient() {
    }

    private static synchronized void c() {
        synchronized (PhoneCashierHttpClient.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[0]);
                return;
            }
            d++;
            LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.timeOutThreadInc", "sTimeOutThreadCnt:" + d);
        }
    }

    private static synchronized void b() {
        synchronized (PhoneCashierHttpClient.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
                return;
            }
            d--;
            LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.timeOutThreadDec", "sTimeOutThreadCnt:" + d);
        }
    }

    public static PhoneCashierHttpClient newInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhoneCashierHttpClient) ipChange.ipc$dispatch("5e4a1788", new Object[0]);
        }
        if (f4926a == null) {
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
            Security.setProperty("networkaddress.cache.ttl", "-1");
            basicHttpParams.setBooleanParameter("http.protocol.expect-continue", false);
            HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, GlobalConstant.HTTP_CONNECTION_TIMEOUT);
            HttpConnectionParams.setSoTimeout(basicHttpParams, GlobalConstant.HTTP_SO_TIMEOUT);
            HttpConnectionParams.setSocketBufferSize(basicHttpParams, GlobalConstant.HTTP_SOCKET_BUFFER_SIZE);
            HttpClientParams.setRedirecting(basicHttpParams, true);
            Scheme scheme = new Scheme("https", new ZSSLSocketFactory(), 443);
            Scheme scheme2 = new Scheme("http", PlainSocketFactory.getSocketFactory(), 80);
            SchemeRegistry schemeRegistry = new SchemeRegistry();
            schemeRegistry.register(scheme);
            schemeRegistry.register(scheme2);
            ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
            ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(10));
            ConnManagerParams.setTimeout(basicHttpParams, 60000L);
            try {
                DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ZThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams) { // from class: com.alipay.android.msp.network.http.http.PhoneCashierHttpClient.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                        if (str.hashCode() == -2133082364) {
                            return super.createHttpProcessor();
                        }
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }

                    public BasicHttpProcessor createHttpProcessor() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (BasicHttpProcessor) ipChange2.ipc$dispatch("80dbbf04", new Object[]{this}) : super.createHttpProcessor();
                    }

                    public HttpContext createHttpContext() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (HttpContext) ipChange2.ipc$dispatch("1a291a92", new Object[]{this});
                        }
                        BasicHttpContext basicHttpContext = new BasicHttpContext();
                        basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
                        basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
                        basicHttpContext.setAttribute("http.cookie-store", getCookieStore());
                        basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
                        return basicHttpContext;
                    }

                    public RedirectHandler createRedirectHandler() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (RedirectHandler) ipChange2.ipc$dispatch("e60fb571", new Object[]{this}) : new DefaultRedirectHandler() { // from class: com.alipay.android.msp.network.http.http.PhoneCashierHttpClient.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            /* renamed from: a  reason: collision with root package name */
                            public int f4928a;

                            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                                if (str.hashCode() == 1628537942) {
                                    return new Boolean(super.isRedirectRequested((HttpResponse) objArr[0], (HttpContext) objArr[1]));
                                }
                                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                            }

                            public boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
                                int statusCode;
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return ((Boolean) ipChange3.ipc$dispatch("61118456", new Object[]{this, httpResponse, httpContext})).booleanValue();
                                }
                                this.f4928a++;
                                boolean isRedirectRequested = super.isRedirectRequested(httpResponse, httpContext);
                                if (!isRedirectRequested && this.f4928a < 5 && ((statusCode = httpResponse.getStatusLine().getStatusCode()) == 301 || statusCode == 302)) {
                                    return true;
                                }
                                return isRedirectRequested;
                            }
                        };
                    }

                    public ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (ConnectionKeepAliveStrategy) ipChange2.ipc$dispatch("aa827552", new Object[]{this}) : new ConnectionKeepAliveStrategy() { // from class: com.alipay.android.msp.network.http.http.PhoneCashierHttpClient.2.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return ((Number) ipChange3.ipc$dispatch("e11ceca4", new Object[]{this, httpResponse, httpContext})).longValue();
                                }
                                return 90000L;
                            }
                        };
                    }
                };
                c = defaultHttpClient;
                defaultHttpClient.setHttpRequestRetryHandler(new HttpRequestRetryHandler() { // from class: com.alipay.android.msp.network.http.http.PhoneCashierHttpClient.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public boolean retryRequest(IOException iOException, int i, HttpContext httpContext) {
                        String str;
                        StringBuilder sb;
                        String str2;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("ace81c4f", new Object[]{this, iOException, new Integer(i), httpContext})).booleanValue();
                        }
                        if (i >= 2) {
                            return false;
                        }
                        PluginManager.getDnsEngine().inscLoopCount();
                        if (iOException instanceof NoHttpResponseException) {
                            sb = new StringBuilder("try:");
                            sb.append(i);
                            str2 = "::Nohttp";
                        } else if (!(iOException instanceof ClientProtocolException)) {
                            if (!(iOException instanceof SocketException) && (!(iOException instanceof SSLException) || iOException.getMessage() == null || !iOException.getMessage().contains("pipe"))) {
                                LogUtil.record(8, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.newInstance", "try:null::" + iOException.getClass().getSimpleName());
                                return false;
                            }
                            str = "try:" + i + "::" + iOException.getClass().getSimpleName();
                            LogUtil.record(8, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.newInstance", str);
                            return true;
                        } else {
                            sb = new StringBuilder("try:");
                            sb.append(i);
                            str2 = "::ClientPro";
                        }
                        sb.append(str2);
                        str = sb.toString();
                        LogUtil.record(8, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.newInstance", str);
                        return true;
                    }
                });
                f4926a = new PhoneCashierHttpClient();
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
                LogUtil.record(8, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.newInstance", "不应该执行到的地方");
                c = new DefaultHttpClient(basicHttpParams);
                f4926a = new PhoneCashierHttpClient();
            }
        }
        return f4926a;
    }

    public static void setIsNeedShutdownAtPayEnd(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2a5c4f", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static boolean isNeedShutdownAtPayEnd() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d5a0f927", new Object[0])).booleanValue() : b;
    }

    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
            return;
        }
        LogUtil.record(2, "PhoneCashierHttpClient", "shutdown");
        PluginManager.getDnsEngine().inscLoopCount();
        ClientConnectionManager connectionManager = c.getConnectionManager();
        if (connectionManager != null) {
            clear();
            connectionManager.shutdown();
        }
        f4926a = null;
    }

    public HttpParams getParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpParams) ipChange.ipc$dispatch("233d330e", new Object[]{this}) : c.getParams();
    }

    public HttpResponse execute(HttpUriRequest httpUriRequest, int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("b7376892", new Object[]{this, httpUriRequest, new Integer(i)});
        }
        if (i != -1) {
            PluginManager.getDnsEngine().updateDns();
        }
        this.e = httpUriRequest;
        final HandlerThread handlerThread = new HandlerThread("timeout thread");
        handlerThread.start();
        c();
        Handler handler = new Handler(handlerThread.getLooper()) { // from class: com.alipay.android.msp.network.http.http.PhoneCashierHttpClient.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                int i2 = message.what;
                if (i2 == 0) {
                    LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.createTimeoutHandler", "COUNT_TIME_OUT");
                    sendEmptyMessageDelayed(2, orq.FRAME_CHECK_TIMEOUT);
                } else if (i2 != 2) {
                } else {
                    LogUtil.record(4, AlipaySDKJSBridge.LOG_TAG, "PhoneCashierHttpClient.createTimeoutHandler", "TRIGGER_TIME_OUT");
                    try {
                        if (PhoneCashierHttpClient.a(PhoneCashierHttpClient.this) != null && !PhoneCashierHttpClient.a(PhoneCashierHttpClient.this).isAborted()) {
                            try {
                                PhoneCashierHttpClient.a(PhoneCashierHttpClient.this).abort();
                            } catch (Exception e) {
                                LogUtil.printExceptionStackTrace(e);
                            }
                        }
                        handlerThread.getLooper().quit();
                        PhoneCashierHttpClient.a();
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            }
        };
        handler.sendEmptyMessage(0);
        try {
            try {
                HttpResponse execute = c.execute(httpUriRequest);
                this.e = null;
                handler.sendEmptyMessage(2);
                return execute;
            } catch (IOException e) {
                shutdown();
                throw e;
            } catch (AssertionError e2) {
                LogUtil.printExceptionStackTrace(e2);
                this.e = null;
                handler.sendEmptyMessage(2);
                return null;
            }
        } catch (Throwable th) {
            this.e = null;
            handler.sendEmptyMessage(2);
            throw th;
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        ClientConnectionManager connectionManager = c.getConnectionManager();
        if (connectionManager == null) {
            return;
        }
        connectionManager.closeExpiredConnections();
        connectionManager.closeIdleConnections((long) a.DEF_MAX_ASYNC_SECONDS, TimeUnit.SECONDS);
    }
}
