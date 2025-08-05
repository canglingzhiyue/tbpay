package com.alipay.mobile.common.transport.utils;

import anet.channel.util.HttpConstant;
import com.alipay.mobile.common.transportext.util.InnerLogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.impl.cookie.BestMatchSpec;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes3.dex */
public class HttpUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static final void extractCookiesFromResponse(HttpHost httpHost, HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b9b200", new Object[]{httpHost, httpRequest, httpResponse, httpContext});
            return;
        }
        CookieStore cookieStore = (CookieStore) httpContext.getAttribute("http.cookie-store");
        if (cookieStore == null) {
            return;
        }
        CookieOrigin cookieOrigin = new CookieOrigin(httpHost.getHostName(), MiscUtils.getEffectivePort(httpHost.getSchemeName(), httpHost.getPort()), getRequestURI(httpRequest).getPath(), true);
        HeaderIterator headerIterator = httpResponse.headerIterator("Set-Cookie");
        BestMatchSpec bestMatchSpec = new BestMatchSpec();
        add2CookieStore(headerIterator, bestMatchSpec, cookieOrigin, cookieStore);
        if (bestMatchSpec.getVersion() <= 0) {
            return;
        }
        add2CookieStore(httpResponse.headerIterator(HttpConstant.SET_COOKIE2), bestMatchSpec, cookieOrigin, cookieStore);
    }

    public static final void add2CookieStore(HeaderIterator headerIterator, CookieSpec cookieSpec, CookieOrigin cookieOrigin, CookieStore cookieStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9f9f0", new Object[]{headerIterator, cookieSpec, cookieOrigin, cookieStore});
            return;
        }
        while (headerIterator.hasNext()) {
            try {
                for (Cookie cookie : cookieSpec.parse(headerIterator.nextHeader(), cookieOrigin)) {
                    try {
                        cookieSpec.validate(cookie, cookieOrigin);
                        cookieStore.addCookie(cookie);
                    } catch (MalformedCookieException e) {
                        LogCatUtil.warn(InnerLogUtil.MWALLET_SPDY_TAG, "add2CookieStore1 exception : " + e.toString());
                    }
                }
            } catch (MalformedCookieException e2) {
                LogCatUtil.warn(InnerLogUtil.MWALLET_SPDY_TAG, "add2CookieStore2 exception : " + e2.toString());
            }
        }
    }

    public static final URI getRequestURI(HttpRequest httpRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URI) ipChange.ipc$dispatch("3e26d527", new Object[]{httpRequest});
        }
        if (httpRequest instanceof HttpUriRequest) {
            return ((HttpUriRequest) httpRequest).getURI();
        }
        try {
            return new URI(httpRequest.getRequestLine().getUri());
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid request URI: " + httpRequest.getRequestLine().getUri(), e);
        }
    }
}
