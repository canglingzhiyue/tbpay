package com.alipay.mobile.common.transport.utils;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.netsdkextdependapi.deviceinfo.DeviceInfoUtil;
import com.alipay.mobile.common.transport.TransportCallback;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.download.DownloadRequest;
import com.alipay.mobile.common.transport.http.AndroidHttpClient;
import com.alipay.mobile.common.transport.http.HttpUrlRequest;
import com.alipay.mobile.common.transport.http.HttpWorker;
import com.alipay.mobile.common.transport.http.inner.HttpClientPlannerHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes3.dex */
public class DownloadUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GET_METHOD = "GET";
    public static final int HTTPS_PORT = 443;
    public static final String HTTPS_SCHEME = "https";
    public static final String POST_METHOD = "POST";

    /* renamed from: a  reason: collision with root package name */
    private static String f5622a = "tfs.alipayobjects.com";
    private static String b = "pic.alipayobjects.com";
    private static String c = "api-mayi.django.t.taobao.com";
    public static String contentTypeKey = "html";
    private static String d = "oalipay-dl-django.alicdn.com";

    public static boolean validateResponseCode(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("854e77dc", new Object[]{new Integer(i)})).booleanValue() : i == 200 || i == 206 || i == 304;
    }

    public static boolean isNeedToDowngradeToHttps(HttpUriRequest httpUriRequest, HttpResponse httpResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acf8c2a2", new Object[]{httpUriRequest, httpResponse})).booleanValue();
        }
        try {
            if (!isNeedToDowngradeToHttps(httpUriRequest)) {
                return false;
            }
            return a(httpResponse);
        } catch (Throwable th) {
            LogCatUtil.error("DownloadUtils", th);
            return false;
        }
    }

    public static boolean isNeedToDowngradeToHttps(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fccf3ad", new Object[]{httpUriRequest})).booleanValue();
        }
        try {
            if (!MiscUtils.grayscaleUtdid(DeviceInfoUtil.getDeviceId(), TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.DOWNLOAD_DOWNGRADE))) {
                LogCatUtil.debug("DownloadUtils", "isNeedToDowngradeToHttps. degradeSwitch is off");
                return false;
            } else if (c(httpUriRequest)) {
                return false;
            } else {
                if (!isContainDowngradeHost(httpUriRequest) && !a(httpUriRequest.getURI().getHost())) {
                    return false;
                }
                if (!a(httpUriRequest) && !b(httpUriRequest)) {
                    LogCatUtil.info("DownloadUtils", "isNeedToDowngradeToHttps.return false");
                    return false;
                }
                LogCatUtil.info("DownloadUtils", "isNeedToDowngradeToHttps. may need downgrade.");
                return true;
            }
        } catch (Throwable th) {
            LogCatUtil.error("isNeedToDowngradeToHttps", th);
            return false;
        }
    }

    private static boolean a(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d512c02", new Object[]{httpUriRequest})).booleanValue();
        }
        if (httpUriRequest != null) {
            return "GET".equalsIgnoreCase(httpUriRequest.getMethod());
        }
        return false;
    }

    private static boolean b(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b29c661", new Object[]{httpUriRequest})).booleanValue();
        }
        if (httpUriRequest == null) {
            return false;
        }
        try {
            if (!"POST".equalsIgnoreCase(httpUriRequest.getMethod())) {
                return false;
            }
            HttpEntity entity = ((HttpEntityEnclosingRequestBase) httpUriRequest).getEntity();
            if (entity != null) {
                if (entity != null) {
                    if (entity.isRepeatable()) {
                    }
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            LogCatUtil.error("DownloadUtils", "isRepeatablePost ex:" + th.toString());
            return false;
        }
    }

    private static boolean c(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b90260c0", new Object[]{httpUriRequest})).booleanValue();
        }
        boolean equalsIgnoreCase = "https".equalsIgnoreCase(httpUriRequest.getURI().getScheme());
        if (!equalsIgnoreCase) {
            LogCatUtil.info("DownloadUtils", "requestIsHttps. no https, may need downgrade.");
        }
        return equalsIgnoreCase;
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.DOWNGRADE_HOSTS);
        if (!StringUtils.isEmpty(stringValue)) {
            for (String str2 : stringValue.split(",")) {
                if (StringUtils.equals(str2, str)) {
                    LogCatUtil.info("DownloadUtils", "isInDowngradeHosts. " + str + " in downgradeHosts , may need downgrade.");
                    return true;
                }
            }
        }
        LogCatUtil.info("DownloadUtils", "isInDowngradeHosts. " + str + " not in downgradeHosts,can't downgrade.");
        return false;
    }

    public static boolean isContainDowngradeHost(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcab8f90", new Object[]{httpUriRequest})).booleanValue();
        }
        try {
            if (StringUtils.isEmpty((String) httpUriRequest.getParams().getParameter(TransportConstants.KEY_DOWNGRADE_HTTPS_HOST))) {
                z = false;
            }
            LogCatUtil.debug("DownloadUtils", "isContainDowngradeHost return:" + z);
            return z;
        } catch (Throwable th) {
            LogCatUtil.warn("DownloadUtils", " isContainDowngradeHost error ", th);
            return false;
        }
    }

    private static boolean a(HttpResponse httpResponse) {
        int statusCode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9e3a321", new Object[]{httpResponse})).booleanValue();
        }
        if (httpResponse == null || (statusCode = httpResponse.getStatusLine().getStatusCode()) == 200 || statusCode == 206 || statusCode == 304 || statusCode == 429) {
            return false;
        }
        LogCatUtil.info("DownloadUtils", "isNeedToRetryByResponseCode. response code=" + statusCode + ",may need downgrade");
        return true;
    }

    public static URI changeUriByParams(URI uri, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URI) ipChange.ipc$dispatch("7df0cb0b", new Object[]{uri, str, str2, new Integer(i)});
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return uri;
            }
            return new URI(str, uri.getUserInfo(), str2, ((!StringUtils.equals(str, "https") || i == 443) && (!StringUtils.equals(str, "http") || i == 80)) ? -1 : i, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (Exception unused) {
            return uri;
        }
    }

    public static HttpUriRequest constructNewHttpUriRequest(HttpUriRequest httpUriRequest, HttpUrlRequest httpUrlRequest, AndroidHttpClient androidHttpClient) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpUriRequest) ipChange.ipc$dispatch("dfe53769", new Object[]{httpUriRequest, httpUrlRequest, androidHttpClient}) : constructHttpUriRequestWithURI(d(httpUriRequest), httpUriRequest, httpUrlRequest, androidHttpClient);
    }

    public static HttpUriRequest constructHttpUriRequestWithURI(URI uri, HttpUriRequest httpUriRequest, HttpUrlRequest httpUrlRequest, AndroidHttpClient androidHttpClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUriRequest) ipChange.ipc$dispatch("35d5263b", new Object[]{uri, httpUriRequest, httpUrlRequest, androidHttpClient});
        }
        HttpUriRequest a2 = a(httpUriRequest, uri);
        a2.setParams(httpUriRequest.getParams());
        a2.setHeaders(httpUriRequest.getAllHeaders());
        try {
            if (androidHttpClient != null) {
                a2.getParams().setParameter("http.route.forced-route", HttpClientPlannerHelper.determineRoute(androidHttpClient, new HttpHost(uri.toURL().getHost(), uri.getPort(), uri.getScheme()), a2, null));
            } else {
                a2.getParams().removeParameter("http.route.forced-route");
            }
        } catch (Throwable th) {
            LogCatUtil.error("DownloadUtils", "setParameter ex:" + th.toString());
        }
        if (httpUrlRequest != null) {
            httpUrlRequest.setHttpUriRequest(a2);
            httpUrlRequest.setUrl(uri.toURL().toString());
        }
        return a2;
    }

    private static URI d(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URI) ipChange.ipc$dispatch("6075477d", new Object[]{httpUriRequest});
        }
        URI uri = httpUriRequest.getURI();
        String e = e(httpUriRequest);
        if (!StringUtils.isEmpty(e)) {
            URI changeUriByParams = changeUriByParams(uri, "https", e, 443);
            LogCatUtil.debug("DownloadUtils", "oriURI:" + httpUriRequest.getURI().toString() + ",newURI:" + changeUriByParams.toString());
            return changeUriByParams;
        }
        throw new IOException("downgrade exception,no downHost find with " + uri.toURL().getHost());
    }

    private static HttpUriRequest a(HttpUriRequest httpUriRequest, URI uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpUriRequest) ipChange.ipc$dispatch("72c69036", new Object[]{httpUriRequest, uri});
        }
        String method = httpUriRequest.getMethod();
        if (StringUtils.equals(method, "GET")) {
            return new HttpGet(uri);
        }
        if (StringUtils.equals(method, "POST")) {
            HttpEntityEnclosingRequestBase httpPost = new HttpPost(uri);
            HttpEntity entity = ((HttpEntityEnclosingRequestBase) httpUriRequest).getEntity();
            if (entity != null && entity.isRepeatable()) {
                httpPost.setEntity(entity);
            }
            return httpPost;
        }
        throw new IOException("requestMethod:" + method + " not support");
    }

    public static HttpResponse executeDowngradeRequest(HttpUriRequest httpUriRequest, HttpUrlRequest httpUrlRequest, AndroidHttpClient androidHttpClient, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("dd47012f", new Object[]{httpUriRequest, httpUrlRequest, androidHttpClient, httpContext});
        }
        HttpUriRequest constructNewHttpUriRequest = constructNewHttpUriRequest(httpUriRequest, httpUrlRequest, androidHttpClient);
        LogCatUtil.debug(HttpWorker.TAG, "By Http/Https to request, method= " + constructNewHttpUriRequest.getMethod() + " ,url=" + constructNewHttpUriRequest.getURI().toString());
        a(constructNewHttpUriRequest.getAllHeaders());
        return androidHttpClient.execute(((HttpRoute) constructNewHttpUriRequest.getParams().getParameter("http.route.forced-route")).getTargetHost(), (HttpRequest) constructNewHttpUriRequest, httpContext);
    }

    public static final File createCacheFile(Context context, DownloadRequest downloadRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("fdaa8aff", new Object[]{context, downloadRequest});
        }
        File cacheDir = context.getCacheDir();
        return new File(cacheDir, Integer.toHexString(downloadRequest.getUrl().hashCode()) + Integer.toHexString(downloadRequest.getPath().hashCode()));
    }

    public static final File createCacheFile(Context context, String str, String str2, ArrayList<Header> arrayList, TransportCallback transportCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("6e433f41", new Object[]{context, str, str2, arrayList, transportCallback});
        }
        DownloadRequest downloadRequest = new DownloadRequest(str, str2, null, arrayList);
        downloadRequest.setTransportCallback(transportCallback);
        return createCacheFile(context, downloadRequest);
    }

    private static void a(Header[] headerArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbc113e", new Object[]{headerArr});
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Header header : headerArr) {
            sb.append(header.getName() + ":" + header.getValue());
            sb.append(", ");
        }
        LogCatUtil.info(HttpWorker.TAG, "Added request headers : " + sb.toString());
    }

    private static String e(HttpUriRequest httpUriRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6708c266", new Object[]{httpUriRequest});
        }
        String host = httpUriRequest.getURI().toURL().getHost();
        TransportConfigureManager transportConfigureManager = TransportConfigureManager.getInstance();
        if (StringUtils.equals(host, f5622a)) {
            return transportConfigureManager.getStringValue(TransportConfigureItem.DOWN_TFS_HOST);
        }
        if (StringUtils.equals(host, b)) {
            return transportConfigureManager.getStringValue(TransportConfigureItem.DOWN_PIC_HOST);
        }
        if (StringUtils.equals(host, c)) {
            return transportConfigureManager.getStringValue(TransportConfigureItem.DOWN_APIDJG_HOST);
        }
        if (StringUtils.equals(host, d)) {
            return transportConfigureManager.getStringValue(TransportConfigureItem.DOWN_DLDJG_HOST);
        }
        try {
            String str = (String) httpUriRequest.getParams().getParameter(TransportConstants.KEY_DOWNGRADE_HTTPS_HOST);
            if (StringUtils.isEmpty(str)) {
                return "";
            }
            LogCatUtil.debug("DownloadUtils", "downgradeHost:" + str);
            return str;
        } catch (Throwable th) {
            LogCatUtil.warn("DownloadUtils", "get downgradeHost error", th);
            return "";
        }
    }
}
