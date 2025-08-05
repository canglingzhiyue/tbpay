package com.alipay.mobile.common.transport.http;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.io.RpcBufferedOutputStream;
import com.alipay.mobile.common.transport.monitor.DataContainer;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.ssl.ZCustSSLSocketFactory;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.TransportConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import tb.cpe;
import tb.riy;

/* loaded from: classes3.dex */
public class AndroidH2UrlConnection {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AndroidH2UrlConnection f5545a;
    private Context b;
    private HttpUrlRequest c = null;
    private Object d;

    @Deprecated
    public static synchronized AndroidH2UrlConnection newInstance(Context context) {
        synchronized (AndroidH2UrlConnection.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AndroidH2UrlConnection) ipChange.ipc$dispatch("d2986e92", new Object[]{context});
            }
            return getInstance(context);
        }
    }

    public static synchronized AndroidH2UrlConnection getInstance(Context context) {
        AndroidH2UrlConnection androidH2UrlConnection;
        synchronized (AndroidH2UrlConnection.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AndroidH2UrlConnection) ipChange.ipc$dispatch("efa98148", new Object[]{context});
            } else if (f5545a != null) {
                return f5545a;
            } else {
                synchronized (AndroidH2UrlConnection.class) {
                    if (f5545a == null) {
                        f5545a = new AndroidH2UrlConnection(context);
                    }
                    androidH2UrlConnection = f5545a;
                }
                return androidH2UrlConnection;
            }
        }
    }

    private AndroidH2UrlConnection(Context context) {
        this.b = context.getApplicationContext();
        System.setProperty("http.keepAliveDuration", "30000");
        System.setProperty("http.maxConnections", "19");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0155 A[Catch: Throwable -> 0x0159, TRY_LEAVE, TryCatch #5 {Throwable -> 0x0159, blocks: (B:35:0x0151, B:37:0x0155), top: B:58:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.HttpResponse execute(org.apache.http.HttpHost r11, org.apache.http.HttpRequest r12, org.apache.http.protocol.HttpContext r13) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.http.AndroidH2UrlConnection.execute(org.apache.http.HttpHost, org.apache.http.HttpRequest, org.apache.http.protocol.HttpContext):org.apache.http.HttpResponse");
    }

    private void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else {
            throw new IOException(th);
        }
    }

    public HttpURLConnection openConnection(HttpUriRequest httpUriRequest, TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("25a8c54f", new Object[]{this, httpUriRequest, transportContext});
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) httpUriRequest.getURI().toURL().openConnection(obtainProxy(httpUriRequest));
        a(httpURLConnection, httpUriRequest, transportContext);
        return httpURLConnection;
    }

    private void a(HttpURLConnection httpURLConnection, HttpUriRequest httpUriRequest, TransportContext transportContext) {
        try {
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            Object a2 = a(httpURLConnection);
            Field declaredField = a2.getClass().getDeclaredField(cpe.PLT_SCREENSHOT_FLOAT_WINDOW_TRIGGER_ID);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(a2);
            b(obj);
            a(obj);
            Method declaredMethod = obj.getClass().getDeclaredMethod("setProtocols", List.class);
            Field declaredField2 = obj.getClass().getDeclaredField("DEFAULT_PROTOCOLS");
            declaredField2.setAccessible(true);
            declaredMethod.invoke(obj, declaredField2.get(obj.getClass()));
            if (httpURLConnection instanceof HttpsURLConnection) {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(ZCustSSLSocketFactory.getSSLSocketFactory());
            }
            LogCatUtil.debug("AndroidH2UrlConnection", "modifyParamtersInUrlConnection success");
        } catch (Throwable th) {
            LogCatUtil.error("AndroidH2UrlConnection", "modifyParamtersInUrlConnection ex:" + th.toString(), th);
        }
    }

    private void a(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("connectionPool");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            Class<?> cls = obj2.getClass();
            Field declaredField2 = cls.getDeclaredField("maxIdleConnections");
            declaredField2.setAccessible(true);
            declaredField2.set(obj2, 19);
            Field declaredField3 = cls.getDeclaredField("keepAliveDurationNs");
            declaredField3.setAccessible(true);
            declaredField3.set(obj2, 30000000000L);
        } catch (Throwable th) {
            LogCatUtil.error("AndroidH2UrlConnection", "hookConnectionPool ex:" + th.toString());
        }
    }

    private Object a(HttpURLConnection httpURLConnection) {
        Field declaredField = httpURLConnection.getClass().getDeclaredField("delegate");
        declaredField.setAccessible(true);
        return declaredField.get(httpURLConnection);
    }

    private void b(HttpURLConnection httpURLConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d656b12", new Object[]{this, httpURLConnection});
            return;
        }
        try {
            if (!httpURLConnection.getUseCaches()) {
                return;
            }
            httpURLConnection.setUseCaches(false);
        } catch (Exception e) {
            LogCatUtil.error("AndroidH2UrlConnection", "setUseCaches2False exception=" + e.getMessage());
        }
    }

    private void a(TransportContext transportContext, HttpURLConnection httpURLConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c238a9c8", new Object[]{this, transportContext, httpURLConnection});
        } else if (transportContext == null || httpURLConnection == null) {
        } else {
            if (!transportContext.enableHttpCache) {
                b(httpURLConnection);
                return;
            }
            httpURLConnection.setUseCaches(true);
            if (transportContext.cacheSetupTime <= 0) {
                return;
            }
            transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.H5_CACHE_SETUP_TIME, Integer.toString((int) transportContext.cacheSetupTime));
        }
    }

    private void a(HttpRequest httpRequest, HttpURLConnection httpURLConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d47170c", new Object[]{this, httpRequest, httpURLConnection});
        } else if (httpRequest instanceof HttpRequestBase) {
            httpURLConnection.setRequestMethod(((HttpRequestBase) httpRequest).getMethod());
        } else {
            httpURLConnection.setRequestMethod(httpRequest.getRequestLine().getMethod());
        }
    }

    private void a(TransportContext transportContext, HttpRequest httpRequest, HttpURLConnection httpURLConnection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de50bb5", new Object[]{this, transportContext, httpRequest, httpURLConnection});
            return;
        }
        b(transportContext, httpRequest, httpURLConnection);
        HttpEntity a2 = a(httpRequest);
        if (a2 == null) {
            return;
        }
        Header contentType = a2.getContentType();
        if (contentType != null) {
            httpURLConnection.setRequestProperty(contentType.getName(), contentType.getValue());
        }
        Header contentEncoding = a2.getContentEncoding();
        if (contentEncoding != null) {
            httpURLConnection.setRequestProperty(contentEncoding.getName(), contentEncoding.getValue());
        }
        if (a2.isChunked() || a2.getContentLength() < 0) {
            httpURLConnection.setChunkedStreamingMode(0);
        } else if (a2.getContentLength() <= 8192) {
            httpURLConnection.setRequestProperty("Content-Length", Long.toString(a2.getContentLength()));
        } else {
            httpURLConnection.setFixedLengthStreamingMode((int) a2.getContentLength());
        }
    }

    private void b(TransportContext transportContext, HttpRequest httpRequest, HttpURLConnection httpURLConnection) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7945076", new Object[]{this, transportContext, httpRequest, httpURLConnection});
        } else if (Build.VERSION.SDK_INT >= 26) {
            Header[] allHeaders = httpRequest.getAllHeaders();
            int length = allHeaders.length;
            while (i < length) {
                Header header = allHeaders[i];
                httpURLConnection.addRequestProperty(header.getName(), header.getValue());
                i++;
            }
        } else if (transportContext.isRpcBizType()) {
            Header[] allHeaders2 = httpRequest.getAllHeaders();
            int length2 = allHeaders2.length;
            while (i < length2) {
                Header header2 = allHeaders2[i];
                httpURLConnection.setRequestProperty(header2.getName(), header2.getValue());
                i++;
            }
        } else {
            HashMap hashMap = new HashMap();
            Header[] allHeaders3 = httpRequest.getAllHeaders();
            int length3 = allHeaders3.length;
            while (i < length3) {
                Header header3 = allHeaders3[i];
                String name = header3.getName();
                if (TextUtils.isEmpty(name)) {
                    LogCatUtil.warn("AndroidH2UrlConnection", "O, headerKey is null.");
                } else {
                    String lowerCase = name.toLowerCase(Locale.US);
                    String str = (String) hashMap.get(lowerCase);
                    if (TextUtils.isEmpty(str)) {
                        httpURLConnection.addRequestProperty(header3.getName(), header3.getValue());
                        hashMap.put(lowerCase, header3.getValue());
                    } else if (!TextUtils.equals(str, header3.getValue())) {
                        String str2 = "There is a duplicate header that needs to be switched to http/1.1 。key=[" + header3.getName() + "], value1=[" + str + "]、value2=[" + header3.getValue() + "].";
                        LogCatUtil.warn("AndroidH2UrlConnection", str2);
                        throw new RequestSwitchDirectionException(str2);
                    }
                }
                i++;
            }
        }
    }

    private HttpEntity a(HttpRequest httpRequest) {
        HttpEntity entity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpEntity) ipChange.ipc$dispatch("67c445e6", new Object[]{this, httpRequest});
        }
        if (!(httpRequest instanceof HttpEntityEnclosingRequest) || (entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity()) == null) {
            return null;
        }
        return entity;
    }

    private void a(HttpRequest httpRequest, TransportContext transportContext, HttpURLConnection httpURLConnection, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73cc755b", new Object[]{this, httpRequest, transportContext, httpURLConnection, httpContext});
            return;
        }
        HttpEntity a2 = a(httpRequest);
        if (a2 == null) {
            return;
        }
        httpURLConnection.setDoOutput(true);
        if (a2 instanceof ByteArrayEntity) {
            httpURLConnection.getOutputStream().write(EntityUtils.toByteArray(a2));
            httpURLConnection.getOutputStream().flush();
        } else {
            RpcBufferedOutputStream rpcBufferedOutputStream = new RpcBufferedOutputStream(httpURLConnection.getOutputStream());
            a2.writeTo(rpcBufferedOutputStream);
            rpcBufferedOutputStream.flush();
        }
        DataContainer currentDataContainer = transportContext.getCurrentDataContainer();
        currentDataContainer.putDataItem(RPCDataItems.REQ_SIZE, a2.getContentLength() + "");
    }

    private BasicHttpResponse c(HttpURLConnection httpURLConnection) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (BasicHttpResponse) ipChange.ipc$dispatch("a736fc86", new Object[]{this, httpURLConnection});
        }
        int responseCode = httpURLConnection.getResponseCode();
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(HttpVersion.HTTP_1_1, responseCode, httpURLConnection.getResponseMessage());
        InputStream inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        if (responseCode != 304 || inputStream.available() != 0) {
            InputStreamEntity inputStreamEntity = new InputStreamEntity(inputStream, httpURLConnection.getContentLength());
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i);
                if (headerFieldKey == null) {
                    break;
                }
                BasicHeader basicHeader = new BasicHeader(headerFieldKey, httpURLConnection.getHeaderField(i));
                basicHttpResponse.addHeader(basicHeader);
                if (headerFieldKey.equalsIgnoreCase("Content-Type")) {
                    inputStreamEntity.setContentType(basicHeader);
                } else if (headerFieldKey.equalsIgnoreCase(HttpConstant.CONTENT_ENCODING)) {
                    inputStreamEntity.setContentEncoding(basicHeader);
                } else {
                    headerFieldKey.equalsIgnoreCase("Content-Length");
                }
                i++;
            }
            basicHttpResponse.setEntity(inputStreamEntity);
        }
        return basicHttpResponse;
    }

    public HttpUrlRequest getHttpUrlRequest(HttpContext httpContext) {
        HttpUrlRequest httpUrlRequest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrlRequest) ipChange.ipc$dispatch("b4ed21f7", new Object[]{this, httpContext});
        }
        HttpUrlRequest httpUrlRequest2 = this.c;
        if (httpUrlRequest2 != null) {
            return httpUrlRequest2;
        }
        HttpUrlRequest httpUrlRequest3 = null;
        try {
            httpUrlRequest = (HttpUrlRequest) httpContext.getAttribute(TransportConstants.KEY_ORIGIN_REQUEST);
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.c = httpUrlRequest;
            return httpUrlRequest;
        } catch (Throwable th2) {
            httpUrlRequest3 = httpUrlRequest;
            th = th2;
            LogCatUtil.error("AndroidH2UrlConnection", "HttpUrlRequest cast fail. " + th.toString());
            return httpUrlRequest3;
        }
    }

    public Proxy obtainProxy(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Proxy) ipChange.ipc$dispatch("16097660", new Object[]{this, httpUriRequest});
        }
        try {
            HttpHost httpHost = (HttpHost) httpUriRequest.getParams().getParameter("http.route.default-proxy");
            Proxy proxy = null;
            if (httpHost != null && ConnRouteParams.NO_HOST != httpHost) {
                proxy = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(httpHost.getHostName(), httpHost.getPort()));
            }
            return proxy != null ? proxy : Proxy.NO_PROXY;
        } catch (Throwable th) {
            LogCatUtil.warn("AndroidH2UrlConnection", "obtainProxy fail", th);
            return Proxy.NO_PROXY;
        }
    }

    private void b(Object obj) {
        Field declaredField;
        if (obj == null) {
            LogCatUtil.warn("AndroidH2UrlConnection", "objOkHttpClient is null");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                declaredField = obj.getClass().getDeclaredField("dns");
            } else {
                declaredField = obj.getClass().getDeclaredField("network");
            }
            if (declaredField == null) {
                LogCatUtil.info("AndroidH2UrlConnection", "network field is null, return.");
                return;
            }
            declaredField.setAccessible(true);
            if (this.d != null) {
                declaredField.set(obj, this.d);
                return;
            }
            synchronized (AndroidH2UrlConnection.class) {
                if (this.d != null) {
                    declaredField.set(obj, this.d);
                    return;
                }
                Object obj2 = declaredField.get(obj);
                if (obj2 == null) {
                    LogCatUtil.info("AndroidH2UrlConnection", "Raw network is null, return.");
                    return;
                }
                this.d = java.lang.reflect.Proxy.newProxyInstance(declaredField.getType().getClassLoader(), new Class[]{declaredField.getType()}, AndroidH2DnsHandler.getInstance());
                AndroidH2DnsHandler.getInstance().setRawAndroidH2DnsHandler(obj2);
                declaredField.set(obj, this.d);
            }
        } catch (Throwable th) {
            LogCatUtil.error("AndroidH2UrlConnection", "hookH2Dns fail, error=[" + th.toString() + riy.ARRAY_END_STR);
        }
    }

    private void c(Object obj) {
        if (obj == null) {
            LogCatUtil.warn("AndroidH2UrlConnection", "[closeSocket] connection is null.");
            return;
        }
        try {
            Field declaredField = obj.getClass().getDeclaredField("socket");
            declaredField.setAccessible(true);
            Socket socket = (Socket) declaredField.get(obj);
            if (socket != null && !socket.isClosed()) {
                socket.close();
                LogCatUtil.info("AndroidH2UrlConnection", "[closeSocket] closeSocket success.");
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[closeSocket] Socket ");
            sb.append(socket == null ? "it's null." : "closed.");
            LogCatUtil.warn("AndroidH2UrlConnection", sb.toString());
        } catch (Throwable th) {
            th = th;
            if (th instanceof InvocationTargetException) {
                th = ((InvocationTargetException) th).getTargetException();
            }
            LogCatUtil.warn("AndroidH2UrlConnection", " closeSocket failed. ", th);
        }
    }

    private Object d(HttpURLConnection httpURLConnection) {
        Object a2;
        Object obj;
        try {
            if (Build.VERSION.SDK_INT < 23 || (a2 = a(httpURLConnection)) == null) {
                return null;
            }
            Field declaredField = a2.getClass().getDeclaredField("httpEngine");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(a2);
            if (obj2 == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Field declaredField2 = obj2.getClass().getDeclaredField("httpStream");
                declaredField2.setAccessible(true);
                Object obj3 = declaredField2.get(obj2);
                Field declaredField3 = obj3.getClass().getDeclaredField("framedConnection");
                declaredField3.setAccessible(true);
                obj = declaredField3.get(obj3);
            } else {
                Field declaredField4 = obj2.getClass().getDeclaredField("connection");
                declaredField4.setAccessible(true);
                obj = declaredField4.get(obj2);
            }
            if (obj != null) {
                return obj;
            }
            LogCatUtil.warn("AndroidH2UrlConnection", "[getCurrentConnection] connection is null.");
            return null;
        } catch (Throwable th) {
            LogCatUtil.warn("AndroidH2UrlConnection", "getCurrentConnection failed. errmsg: " + th.toString());
            return null;
        }
    }

    private void a(TransportContext transportContext, HttpURLConnection httpURLConnection, BasicHttpResponse basicHttpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51fdb5bb", new Object[]{this, transportContext, httpURLConnection, basicHttpResponse});
        } else if (basicHttpResponse == null || transportContext == null) {
        } else {
            Header firstHeader = basicHttpResponse.getFirstHeader("X-Android-Selected-Protocol");
            String str = "";
            String value = firstHeader != null ? firstHeader.getValue() : str;
            if (!TextUtils.isEmpty(value)) {
                transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.PROTOCOL, value);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[monitorFromRespHeaderInfos] urlconnection code:");
            sb.append(httpURLConnection.getResponseCode());
            sb.append(",protocol:");
            if (TextUtils.isEmpty(value)) {
                value = "null";
            }
            sb.append(value);
            LogCatUtil.info("AndroidH2UrlConnection", sb.toString());
            if (!transportContext.enableHttpCache) {
                return;
            }
            Header firstHeader2 = basicHttpResponse.getFirstHeader("X-Android-Response-Source");
            if (firstHeader2 != null) {
                str = firstHeader2.getValue();
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            transportContext.getCurrentDataContainer().putDataItem(RPCDataItems.H5_RESPONSE_SOURCE, str);
        }
    }
}
