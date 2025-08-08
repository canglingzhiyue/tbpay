package com.alipay.literpc.android.phone.mrpc.core;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes3.dex */
public class HttpWorker implements Callable<Response> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final HttpRequestRetryHandler e = new ZHttpRequestRetryHandler();

    /* renamed from: a  reason: collision with root package name */
    public HttpManager f5294a;
    public Context b;
    public HttpUrlRequest c;
    public String d;
    private HttpUriRequest f;
    private CookieManager i;
    private AbstractHttpEntity j;
    private HttpHost k;
    private URL l;
    private String q;
    private HttpContext g = new BasicHttpContext();
    private CookieStore h = new BasicCookieStore();
    private int m = 0;
    private boolean n = false;
    private boolean o = false;
    private String p = null;

    public boolean a(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{this, new Integer(i), str})).booleanValue() : i == 304;
    }

    public HttpWorker(HttpManager httpManager, HttpUrlRequest httpUrlRequest) {
        this.f5294a = httpManager;
        this.b = this.f5294a.f5291a;
        this.c = httpUrlRequest;
    }

    public URI a() throws URISyntaxException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URI) ipChange.ipc$dispatch("b391b50", new Object[]{this});
        }
        String url = this.c.getUrl();
        String str = this.d;
        if (str != null) {
            url = str;
        }
        if (url == null) {
            throw new RuntimeException("url should not be null");
        }
        return new URI(url);
    }

    public AbstractHttpEntity b() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractHttpEntity) ipChange.ipc$dispatch("bcd68d12", new Object[]{this});
        }
        AbstractHttpEntity abstractHttpEntity = this.j;
        if (abstractHttpEntity != null) {
            return abstractHttpEntity;
        }
        byte[] reqData = this.c.getReqData();
        String tag = this.c.getTag("gzip");
        if (reqData != null) {
            if (StringUtils.equals(tag, "true")) {
                this.j = AndroidHttpClient.getCompressedEntity(reqData, null);
            } else {
                this.j = new ByteArrayEntity(reqData);
            }
            this.j.setContentType(this.c.getContentType());
        }
        return this.j;
    }

    public ArrayList<Header> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b36da644", new Object[]{this}) : this.c.getHeaders();
    }

    private HttpUriRequest d() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUriRequest) ipChange.ipc$dispatch("6a39ac01", new Object[]{this});
        }
        HttpUriRequest httpUriRequest = this.f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        AbstractHttpEntity b = b();
        if (b != null) {
            HttpPost httpPost = new HttpPost(a());
            httpPost.setEntity(b);
            this.f = httpPost;
        } else {
            this.f = new HttpGet(a());
        }
        return this.f;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    /* renamed from: call */
    public Response mo552call() throws HttpException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("256ee86c", new Object[]{this});
        }
        try {
            try {
                NetworkUtils.isNetworkAvailable(this.b);
                if (f() != null) {
                    f().onPreExecute(this.c);
                }
                k();
                this.g.setAttribute("http.cookie-store", this.h);
                j().setHttpRequestRetryHandler(e);
                long currentTimeMillis = System.currentTimeMillis();
                HttpResponse g = g();
                this.f5294a.addConnectTime(System.currentTimeMillis() - currentTimeMillis);
                List<Cookie> cookies = this.h.getCookies();
                if (this.c.isResetCookie()) {
                    p().removeAllCookie();
                }
                if (!cookies.isEmpty()) {
                    for (Cookie cookie : cookies) {
                        if (cookie.getDomain() != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(cookie.getName());
                            sb.append("=");
                            sb.append(cookie.getValue());
                            sb.append("; domain=");
                            sb.append(cookie.getDomain());
                            sb.append(cookie.isSecure() ? "; Secure" : "");
                            p().setCookie(this.c.getUrl(), sb.toString());
                            CookieSyncManager.getInstance().sync();
                        }
                    }
                }
                Response processResponse = processResponse(g, this.c);
                if (((processResponse == null || processResponse.getResData() == null) ? -1L : processResponse.getResData().length) == -1 && (processResponse instanceof HttpUrlResponse)) {
                    try {
                        Long.parseLong(((HttpUrlResponse) processResponse).getHeader().getHead("Content-Length"));
                    } catch (Exception unused) {
                        Log.e(com.alipay.mobile.common.transport.http.HttpWorker.TAG, "parse Content-Length error");
                    }
                }
                String url = this.c.getUrl();
                if (url != null && !StringUtils.isEmpty(i())) {
                    String str = url + "#" + i();
                }
                return processResponse;
            } catch (HttpException e2) {
                e();
                if (f() != null) {
                    f().onFailed(this.c, e2.getCode(), e2.getMsg());
                }
                Log.e("HttpManager", e2 + "");
                throw e2;
            } catch (IOException e3) {
                e();
                if (f() != null) {
                    f().onFailed(this.c, 6, e3 + "");
                }
                Log.e("HttpManager", e3 + "");
                throw new HttpException(6, e3 + "");
            } catch (NullPointerException e4) {
                e();
                int i = this.m;
                if (i <= 0) {
                    this.m = i + 1;
                    return mo552call();
                }
                Log.e("HttpManager", e4 + "");
                throw new HttpException(0, e4 + "");
            } catch (SocketTimeoutException e5) {
                e();
                if (f() != null) {
                    f().onFailed(this.c, 4, e5 + "");
                }
                Log.e("HttpManager", e5 + "");
                throw new HttpException(4, e5 + "");
            } catch (URISyntaxException e6) {
                throw new RuntimeException("Url parser error!", e6.getCause());
            } catch (UnknownHostException e7) {
                e();
                if (f() != null) {
                    f().onFailed(this.c, 9, e7 + "");
                }
                Log.e("HttpManager", e7 + "");
                throw new HttpException(9, e7 + "");
            } catch (SSLHandshakeException e8) {
                e();
                if (f() != null) {
                    f().onFailed(this.c, 2, e8 + "");
                }
                Log.e("HttpManager", e8 + "");
                throw new HttpException(2, e8 + "");
            } catch (SSLPeerUnverifiedException e9) {
                e();
                if (f() != null) {
                    f().onFailed(this.c, 2, e9 + "");
                }
                Log.e("HttpManager", e9 + "");
                throw new HttpException(2, e9 + "");
            } catch (SSLException e10) {
                e();
                if (f() != null) {
                    f().onFailed(this.c, 6, e10 + "");
                }
                Log.e("HttpManager", e10 + "");
                throw new HttpException(6, e10 + "");
            } catch (ConnectTimeoutException e11) {
                e();
                if (f() != null) {
                    f().onFailed(this.c, 3, e11 + "");
                }
                Log.e("HttpManager", e11 + "");
                throw new HttpException(3, e11 + "");
            } catch (Exception e12) {
                Log.e("HttpManager", "", e12);
                e();
                if (f() != null) {
                    f().onFailed(this.c, 0, e12 + "");
                }
                throw new HttpException(0, e12 + "");
            }
        } catch (HttpHostConnectException e13) {
            e();
            if (f() != null) {
                f().onFailed(this.c, 8, e13 + "");
            }
            Log.e("HttpManager", "", e13);
            throw new HttpException(8, e13 + "");
        } catch (NoHttpResponseException e14) {
            e();
            if (f() != null) {
                f().onFailed(this.c, 5, e14 + "");
            }
            Log.e("HttpManager", e14 + "");
            throw new HttpException(5, e14 + "");
        } catch (ConnectionPoolTimeoutException e15) {
            e();
            if (f() != null) {
                f().onFailed(this.c, 3, e15 + "");
            }
            Log.e("HttpManager", e15 + "");
            throw new HttpException(3, e15 + "");
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        HttpUriRequest httpUriRequest = this.f;
        if (httpUriRequest == null) {
            return;
        }
        httpUriRequest.abort();
    }

    private TransportCallback f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TransportCallback) ipChange.ipc$dispatch("6d90d253", new Object[]{this}) : this.c.getCallback();
    }

    private HttpResponse g() throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpResponse) ipChange.ipc$dispatch("a4658f1d", new Object[]{this}) : h();
    }

    private HttpResponse h() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("e185533c", new Object[]{this});
        }
        String str = "By Http/Https to request. operationType=" + i() + " url=" + this.f.getURI().toString();
        j().getParams().setParameter("http.route.default-proxy", o());
        HttpHost l = l();
        if (m() == 80) {
            l = new HttpHost(n().getHost());
        }
        return j().execute(l, (HttpRequest) this.f, this.g);
    }

    private String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        if (!StringUtils.isEmpty(this.q)) {
            return this.q;
        }
        this.q = this.c.getTag("operationType");
        return this.q;
    }

    private AndroidHttpClient j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AndroidHttpClient) ipChange.ipc$dispatch("7893359b", new Object[]{this}) : this.f5294a.getHttpClient();
    }

    private void k() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        ArrayList<Header> c = c();
        if (c != null && !c.isEmpty()) {
            Iterator<Header> it = c.iterator();
            while (it.hasNext()) {
                d().addHeader(it.next());
            }
        }
        AndroidHttpClient.modifyRequestToAcceptGzipResponse(d());
        AndroidHttpClient.modifyRequestToKeepAlive(d());
        d().addHeader("cookie", p().getCookie(this.c.getUrl()));
    }

    private HttpHost l() throws MalformedURLException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("487b2e31", new Object[]{this});
        }
        HttpHost httpHost = this.k;
        if (httpHost != null) {
            return httpHost;
        }
        URL n = n();
        this.k = new HttpHost(n.getHost(), m(), n.getProtocol());
        return this.k;
    }

    private int m() throws MalformedURLException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        URL n = n();
        return n.getPort() == -1 ? n.getDefaultPort() : n.getPort();
    }

    private URL n() throws MalformedURLException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("6a19740", new Object[]{this});
        }
        URL url = this.l;
        if (url != null) {
            return url;
        }
        this.l = new URL(this.c.getUrl());
        return this.l;
    }

    private HttpHost o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpHost) ipChange.ipc$dispatch("4a81310e", new Object[]{this});
        }
        HttpHost proxy = NetworkUtils.getProxy(this.b);
        if (proxy != null && StringUtils.equals(proxy.getHostName(), "127.0.0.1") && proxy.getPort() == 8087) {
            return null;
        }
        return proxy;
    }

    public HashMap<String, String> a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("a40d9915", new Object[]{this, str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] split2 = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split("=");
            hashMap.put(split2[0], split2[1]);
        }
        return hashMap;
    }

    public Response a(HttpResponse httpResponse, int i, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("e9f580d7", new Object[]{this, httpResponse, new Integer(i), str});
        }
        String str2 = "开始handle，handleResponse-1," + Thread.currentThread().getId();
        HttpEntity entity = httpResponse.getEntity();
        HttpUrlResponse httpUrlResponse = null;
        if (entity != null && httpResponse.getStatusLine().getStatusCode() == 200) {
            String str3 = "200，开始处理，handleResponse-2,threadid = " + Thread.currentThread().getId();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = null;
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                a(entity, 0L, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                this.o = false;
                this.f5294a.addSocketTime(System.currentTimeMillis() - currentTimeMillis);
                this.f5294a.addDataSize(byteArray.length);
                String str4 = "res:" + byteArray.length;
                httpUrlResponse = new HttpUrlResponse(a(httpResponse), i, str, byteArray);
                a(httpUrlResponse, httpResponse);
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e2) {
                    throw new RuntimeException("ArrayOutputStream close error!", e2.getCause());
                }
            } catch (Throwable th2) {
                th = th2;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e3) {
                        throw new RuntimeException("ArrayOutputStream close error!", e3.getCause());
                    }
                }
                throw th;
            }
        } else if (entity == null) {
            httpResponse.getStatusLine().getStatusCode();
        }
        return httpUrlResponse;
    }

    public HttpUrlHeader a(HttpResponse httpResponse) {
        Header[] allHeaders;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrlHeader) ipChange.ipc$dispatch("e315cc3d", new Object[]{this, httpResponse});
        }
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    public void a(HttpUrlResponse httpUrlResponse, HttpResponse httpResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ccd0d", new Object[]{this, httpUrlResponse, httpResponse});
            return;
        }
        long b = b(httpResponse);
        Header contentType = httpResponse.getEntity().getContentType();
        String str2 = null;
        if (contentType != null) {
            HashMap<String, String> a2 = a(contentType.getValue());
            str2 = a2.get("charset");
            str = a2.get("Content-Type");
        } else {
            str = null;
        }
        httpUrlResponse.setContentType(str);
        httpUrlResponse.setCharset(str2);
        httpUrlResponse.setCreateTime(System.currentTimeMillis());
        httpUrlResponse.setPeriod(b);
    }

    public long b(HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30bc62d2", new Object[]{this, httpResponse})).longValue();
        }
        Header firstHeader = httpResponse.getFirstHeader(HttpConstant.CACHE_CONTROL);
        if (firstHeader != null) {
            String[] split = firstHeader.getValue().split("=");
            if (split.length >= 2) {
                try {
                    return a(split);
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 == null) {
            return 0L;
        }
        return AndroidHttpClient.parseDate(firstHeader2.getValue()) - System.currentTimeMillis();
    }

    public long a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b26fab", new Object[]{this, strArr})).longValue();
        }
        for (int i = 0; i < strArr.length; i++) {
            if ("max-age".equalsIgnoreCase(strArr[i])) {
                int i2 = i + 1;
                if (strArr[i2] != null) {
                    try {
                        return Long.parseLong(strArr[i2]);
                    } catch (Exception unused) {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return 0L;
    }

    public HttpUrlRequest getRequest() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpUrlRequest) ipChange.ipc$dispatch("729eb200", new Object[]{this}) : this.c;
    }

    public void a(HttpEntity httpEntity, long j, OutputStream outputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7388599b", new Object[]{this, httpEntity, new Long(j), outputStream});
        } else if (outputStream == null) {
            httpEntity.consumeContent();
            throw new IllegalArgumentException("Output stream may not be null");
        } else {
            InputStream ungzippedContent = AndroidHttpClient.getUngzippedContent(httpEntity);
            long contentLength = httpEntity.getContentLength();
            try {
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = ungzippedContent.read(bArr);
                        if (read == -1 || this.c.isCanceled()) {
                            break;
                        }
                        outputStream.write(bArr, 0, read);
                        j += read;
                        if (f() != null && contentLength > 0) {
                            f().onProgressUpdate(this.c, j / contentLength);
                        }
                    }
                    outputStream.flush();
                } catch (Exception e2) {
                    e2.getCause();
                    throw new IOException("HttpWorker Request Error!" + e2.getLocalizedMessage());
                }
            } finally {
                IOUtil.closeStream(ungzippedContent);
            }
        }
    }

    private CookieManager p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CookieManager) ipChange.ipc$dispatch("a4c83a12", new Object[]{this});
        }
        CookieManager cookieManager = this.i;
        if (cookieManager != null) {
            return cookieManager;
        }
        this.i = CookieManager.getInstance();
        return this.i;
    }

    public Response processResponse(HttpResponse httpResponse, HttpUrlRequest httpUrlRequest) throws HttpException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("f456766b", new Object[]{this, httpResponse, httpUrlRequest});
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        String reasonPhrase = httpResponse.getStatusLine().getReasonPhrase();
        if (statusCode != 200 && !a(statusCode, reasonPhrase)) {
            throw new HttpException(Integer.valueOf(httpResponse.getStatusLine().getStatusCode()), httpResponse.getStatusLine().getReasonPhrase());
        }
        return a(httpResponse, statusCode, reasonPhrase);
    }
}
