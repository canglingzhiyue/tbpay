package com.alipay.vi.android.phone.mrpc.core;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes3.dex */
public class HttpWorker implements Callable<Response> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HttpRequestRetryHandler f6204a = new ZHttpRequestRetryHandler();
    private HttpUriRequest b;
    private CookieManager e;
    private AbstractHttpEntity f;
    private HttpHost g;
    private URL h;
    private String m;
    public Context mContext;
    public HttpManager mHttpManager;
    public HttpUrlRequest mRequest;
    public String mUrl;
    private HttpContext c = new BasicHttpContext();
    private CookieStore d = new BasicCookieStore();
    private int i = 0;
    private boolean j = false;
    private boolean k = false;
    private String l = null;

    public boolean willHandleOtherCode(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd5a0127", new Object[]{this, new Integer(i), str})).booleanValue() : i == 304;
    }

    public HttpWorker(HttpManager httpManager, HttpUrlRequest httpUrlRequest) {
        this.mHttpManager = httpManager;
        this.mContext = this.mHttpManager.mContext;
        this.mRequest = httpUrlRequest;
    }

    public URI getUri() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URI) ipChange.ipc$dispatch("506a6a1b", new Object[]{this});
        }
        String url = this.mRequest.getUrl();
        String str = this.mUrl;
        if (str != null) {
            url = str;
        }
        if (url == null) {
            throw new RuntimeException("url should not be null");
        }
        return new URI(url);
    }

    public AbstractHttpEntity getPostData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractHttpEntity) ipChange.ipc$dispatch("66f78a10", new Object[]{this});
        }
        AbstractHttpEntity abstractHttpEntity = this.f;
        if (abstractHttpEntity != null) {
            return abstractHttpEntity;
        }
        byte[] reqData = this.mRequest.getReqData();
        String tag = this.mRequest.getTag("gzip");
        if (reqData != null) {
            if (StringUtils.equals(tag, "true")) {
                this.f = AndroidHttpClient.getCompressedEntity(reqData, null);
            } else {
                this.f = new ByteArrayEntity(reqData);
            }
            this.f.setContentType(this.mRequest.getContentType());
        }
        return this.f;
    }

    public ArrayList<Header> getHeaders() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("387b9a31", new Object[]{this}) : this.mRequest.getHeaders();
    }

    private HttpUriRequest a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUriRequest) ipChange.ipc$dispatch("9f9852be", new Object[]{this});
        }
        HttpUriRequest httpUriRequest = this.b;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        AbstractHttpEntity postData = getPostData();
        if (postData != null) {
            HttpPost httpPost = new HttpPost(getUri());
            httpPost.setEntity(postData);
            this.b = httpPost;
        } else {
            this.b = new HttpGet(getUri());
        }
        return this.b;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    /* renamed from: call */
    public Response mo599call() {
        HttpHost httpHost;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("76becbe0", new Object[]{this});
        }
        try {
            try {
                if (!NetworkUtils.isNetworkAvailable(this.mContext)) {
                    throw new HttpException(1, "The network is not available");
                }
                if (this.mRequest.getCallback() != null) {
                    this.mRequest.getCallback().onPreExecute(this.mRequest);
                }
                ArrayList<Header> headers = getHeaders();
                if (headers != null && !headers.isEmpty()) {
                    Iterator<Header> it = headers.iterator();
                    while (it.hasNext()) {
                        a().addHeader(it.next());
                    }
                }
                AndroidHttpClient.modifyRequestToAcceptGzipResponse(a());
                AndroidHttpClient.modifyRequestToKeepAlive(a());
                a().addHeader("cookie", f().getCookie(this.mRequest.getUrl()));
                this.c.setAttribute("http.cookie-store", this.d);
                this.mHttpManager.getHttpClient().setHttpRequestRetryHandler(f6204a);
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder("By Http/Https to request. operationType=");
                sb.append(c());
                sb.append(" url=");
                sb.append(this.b.getURI().toString());
                HttpParams params = this.mHttpManager.getHttpClient().getParams();
                HttpHost proxy = NetworkUtils.getProxy(this.mContext);
                if (proxy != null && StringUtils.equals(proxy.getHostName(), "127.0.0.1") && proxy.getPort() == 8087) {
                    proxy = null;
                }
                params.setParameter("http.route.default-proxy", proxy);
                if (this.g != null) {
                    httpHost = this.g;
                } else {
                    URL e = e();
                    this.g = new HttpHost(e.getHost(), d(), e.getProtocol());
                    httpHost = this.g;
                }
                if (d() == 80) {
                    httpHost = new HttpHost(e().getHost());
                }
                HttpResponse execute = this.mHttpManager.getHttpClient().execute(httpHost, (HttpRequest) this.b, this.c);
                this.mHttpManager.addConnectTime(System.currentTimeMillis() - currentTimeMillis);
                List<Cookie> cookies = this.d.getCookies();
                if (this.mRequest.isResetCookie()) {
                    f().removeAllCookie();
                }
                if (!cookies.isEmpty()) {
                    for (Cookie cookie : cookies) {
                        if (cookie.getDomain() != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(cookie.getName());
                            sb2.append("=");
                            sb2.append(cookie.getValue());
                            sb2.append("; domain=");
                            sb2.append(cookie.getDomain());
                            sb2.append(cookie.isSecure() ? "; Secure" : "");
                            f().setCookie(this.mRequest.getUrl(), sb2.toString());
                            CookieSyncManager.getInstance().sync();
                        }
                    }
                }
                Response processResponse = processResponse(execute, this.mRequest);
                if (((processResponse == null || processResponse.getResData() == null) ? -1L : processResponse.getResData().length) == -1 && (processResponse instanceof HttpUrlResponse)) {
                    try {
                        Long.parseLong(((HttpUrlResponse) processResponse).getHeader().getHead("Content-Length"));
                    } catch (Exception unused) {
                    }
                }
                String url = this.mRequest.getUrl();
                if (url != null && !StringUtils.isEmpty(c())) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(url);
                    sb3.append("#");
                    sb3.append(c());
                }
                return processResponse;
            } catch (HttpException e2) {
                b();
                if (this.mRequest.getCallback() != null) {
                    this.mRequest.getCallback().onFailed(this.mRequest, e2.getCode(), e2.getMsg());
                }
                new StringBuilder().append(e2);
                throw e2;
            } catch (NullPointerException e3) {
                b();
                int i = this.i;
                if (i <= 0) {
                    this.i = i + 1;
                    return mo599call();
                }
                new StringBuilder().append(e3);
                throw new HttpException(0, String.valueOf(e3));
            } catch (SocketTimeoutException e4) {
                b();
                if (this.mRequest.getCallback() != null) {
                    this.mRequest.getCallback().onFailed(this.mRequest, 4, String.valueOf(e4));
                }
                new StringBuilder().append(e4);
                throw new HttpException(4, String.valueOf(e4));
            } catch (UnknownHostException e5) {
                b();
                if (this.mRequest.getCallback() != null) {
                    this.mRequest.getCallback().onFailed(this.mRequest, 9, String.valueOf(e5));
                }
                new StringBuilder().append(e5);
                throw new HttpException(9, String.valueOf(e5));
            } catch (SSLHandshakeException e6) {
                b();
                if (this.mRequest.getCallback() != null) {
                    this.mRequest.getCallback().onFailed(this.mRequest, 2, String.valueOf(e6));
                }
                new StringBuilder().append(e6);
                throw new HttpException(2, String.valueOf(e6));
            } catch (SSLException e7) {
                b();
                if (this.mRequest.getCallback() != null) {
                    this.mRequest.getCallback().onFailed(this.mRequest, 6, String.valueOf(e7));
                }
                new StringBuilder().append(e7);
                throw new HttpException(6, String.valueOf(e7));
            } catch (ConnectTimeoutException e8) {
                b();
                if (this.mRequest.getCallback() != null) {
                    this.mRequest.getCallback().onFailed(this.mRequest, 3, String.valueOf(e8));
                }
                new StringBuilder().append(e8);
                throw new HttpException(3, String.valueOf(e8));
            } catch (IOException e9) {
                b();
                if (this.mRequest.getCallback() != null) {
                    this.mRequest.getCallback().onFailed(this.mRequest, 6, String.valueOf(e9));
                }
                new StringBuilder().append(e9);
                throw new HttpException(6, String.valueOf(e9));
            } catch (URISyntaxException e10) {
                throw new RuntimeException("Url parser error!", e10.getCause());
            } catch (SSLPeerUnverifiedException e11) {
                b();
                if (this.mRequest.getCallback() != null) {
                    this.mRequest.getCallback().onFailed(this.mRequest, 2, String.valueOf(e11));
                }
                new StringBuilder().append(e11);
                throw new HttpException(2, String.valueOf(e11));
            } catch (Exception e12) {
                b();
                if (this.mRequest.getCallback() != null) {
                    this.mRequest.getCallback().onFailed(this.mRequest, 0, String.valueOf(e12));
                }
                throw new HttpException(0, String.valueOf(e12));
            }
        } catch (ConnectionPoolTimeoutException e13) {
            b();
            if (this.mRequest.getCallback() != null) {
                this.mRequest.getCallback().onFailed(this.mRequest, 3, String.valueOf(e13));
            }
            new StringBuilder().append(e13);
            throw new HttpException(3, String.valueOf(e13));
        } catch (NoHttpResponseException e14) {
            b();
            if (this.mRequest.getCallback() != null) {
                this.mRequest.getCallback().onFailed(this.mRequest, 5, String.valueOf(e14));
            }
            new StringBuilder().append(e14);
            throw new HttpException(5, String.valueOf(e14));
        } catch (HttpHostConnectException e15) {
            b();
            if (this.mRequest.getCallback() != null) {
                this.mRequest.getCallback().onFailed(this.mRequest, 8, String.valueOf(e15));
            }
            throw new HttpException(8, String.valueOf(e15));
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HttpUriRequest httpUriRequest = this.b;
        if (httpUriRequest == null) {
            return;
        }
        httpUriRequest.abort();
    }

    private String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        if (!StringUtils.isEmpty(this.m)) {
            return this.m;
        }
        this.m = this.mRequest.getTag("operationType");
        return this.m;
    }

    private int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        URL e = e();
        return e.getPort() == -1 ? e.getDefaultPort() : e.getPort();
    }

    private URL e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URL) ipChange.ipc$dispatch("1d80a429", new Object[]{this});
        }
        URL url = this.h;
        if (url != null) {
            return url;
        }
        this.h = new URL(this.mRequest.getUrl());
        return this.h;
    }

    public HashMap<String, String> getContentType(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f204c6d1", new Object[]{this, str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] split2 = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split("=");
            hashMap.put(split2[0], split2[1]);
        }
        return hashMap;
    }

    public Response handleResponse(HttpResponse httpResponse, int i, String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("d47366bd", new Object[]{this, httpResponse, new Integer(i), str});
        }
        new StringBuilder("开始handle，handleResponse-1,").append(Thread.currentThread().getId());
        HttpEntity entity = httpResponse.getEntity();
        HttpUrlResponse httpUrlResponse = null;
        if (entity != null && httpResponse.getStatusLine().getStatusCode() == 200) {
            new StringBuilder("200，开始处理，handleResponse-2,threadid = ").append(Thread.currentThread().getId());
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = null;
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                writeData(entity, 0L, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                this.k = false;
                this.mHttpManager.addSocketTime(System.currentTimeMillis() - currentTimeMillis);
                this.mHttpManager.addDataSize(byteArray.length);
                new StringBuilder("res:").append(byteArray.length);
                httpUrlResponse = new HttpUrlResponse(handleResponseHeader(httpResponse), i, str, byteArray);
                fillResponse(httpUrlResponse, httpResponse);
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException("ArrayOutputStream close error!", e.getCause());
                }
            } catch (Throwable th2) {
                th = th2;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        throw new RuntimeException("ArrayOutputStream close error!", e2.getCause());
                    }
                }
                throw th;
            }
        } else if (entity == null) {
            httpResponse.getStatusLine().getStatusCode();
        }
        return httpUrlResponse;
    }

    public HttpUrlHeader handleResponseHeader(HttpResponse httpResponse) {
        Header[] allHeaders;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUrlHeader) ipChange.ipc$dispatch("f6de090e", new Object[]{this, httpResponse});
        }
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    public void fillResponse(HttpUrlResponse httpUrlResponse, HttpResponse httpResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e484d722", new Object[]{this, httpUrlResponse, httpResponse});
            return;
        }
        long period = getPeriod(httpResponse);
        Header contentType = httpResponse.getEntity().getContentType();
        String str2 = null;
        if (contentType != null) {
            HashMap<String, String> contentType2 = getContentType(contentType.getValue());
            str2 = contentType2.get("charset");
            str = contentType2.get("Content-Type");
        } else {
            str = null;
        }
        httpUrlResponse.setContentType(str);
        httpUrlResponse.setCharset(str2);
        httpUrlResponse.setCreateTime(System.currentTimeMillis());
        httpUrlResponse.setPeriod(period);
    }

    public long getPeriod(HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3408a5e7", new Object[]{this, httpResponse})).longValue();
        }
        Header firstHeader = httpResponse.getFirstHeader(HttpConstant.CACHE_CONTROL);
        if (firstHeader != null) {
            String[] split = firstHeader.getValue().split("=");
            if (split.length >= 2) {
                try {
                    return parserMaxage(split);
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

    public long parserMaxage(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d1291d2", new Object[]{this, strArr})).longValue();
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
        return ipChange instanceof IpChange ? (HttpUrlRequest) ipChange.ipc$dispatch("7381681e", new Object[]{this}) : this.mRequest;
    }

    public void writeData(HttpEntity httpEntity, long j, OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("302604d3", new Object[]{this, httpEntity, new Long(j), outputStream});
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
                        if (read == -1 || this.mRequest.isCanceled()) {
                            break;
                        }
                        outputStream.write(bArr, 0, read);
                        j += read;
                        if (this.mRequest.getCallback() != null && contentLength > 0) {
                            this.mRequest.getCallback().onProgressUpdate(this.mRequest, j / contentLength);
                        }
                    }
                    outputStream.flush();
                } catch (Exception e) {
                    e.getCause();
                    throw new IOException("HttpWorker Request Error!" + e.getLocalizedMessage());
                }
            } finally {
                IOUtil.closeStream(ungzippedContent);
            }
        }
    }

    private CookieManager f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CookieManager) ipChange.ipc$dispatch("418a90dc", new Object[]{this});
        }
        CookieManager cookieManager = this.e;
        if (cookieManager != null) {
            return cookieManager;
        }
        this.e = CookieManager.getInstance();
        return this.e;
    }

    public Response processResponse(HttpResponse httpResponse, HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("16d1f471", new Object[]{this, httpResponse, httpUrlRequest});
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        String reasonPhrase = httpResponse.getStatusLine().getReasonPhrase();
        if (statusCode != 200 && !willHandleOtherCode(statusCode, reasonPhrase)) {
            throw new HttpException(Integer.valueOf(httpResponse.getStatusLine().getStatusCode()), httpResponse.getStatusLine().getReasonPhrase());
        }
        return handleResponse(httpResponse, statusCode, reasonPhrase);
    }
}
