package com.alipay.mobile.common.transport.http;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* loaded from: classes3.dex */
public final class GwCookieCacheHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "GwCookieCacheHelper";
    public static final Map<String, Map<String, String>> cookieCacheMaps = new LinkedHashMap(4);

    public static final synchronized void setCookies(String str, Map<String, String> map) {
        synchronized (GwCookieCacheHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ab48d27", new Object[]{str, map});
                return;
            }
            if (!StringUtils.isEmpty(str) && !map.isEmpty()) {
                getCookieMapByDomain(str).putAll(map);
            }
        }
    }

    public static final Map<String, String> getCookieMapByDomain(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("18d1fc43", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            LogCatUtil.warn(TAG, "[getCookieMapByDomain] domain is empty.");
            return null;
        }
        Map<String, String> map = cookieCacheMaps.get(str);
        if (map != null) {
            return map;
        }
        synchronized (GwCookieCacheHelper.class) {
            if (map == null) {
                map = new LinkedHashMap<>();
                cookieCacheMaps.put(str, map);
            }
        }
        return map;
    }

    public static final String getCookieWrapper(Context context, String str, TransportContext transportContext) {
        String cookie;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("893b12ab", new Object[]{context, str, transportContext});
        }
        if (StringUtils.isEmpty(str) || context == null) {
            return "";
        }
        String topDomain = MiscUtils.getTopDomain(str);
        if (TransportConfigureManager.getInstance().equalsString(TransportConfigureItem.COOKIE_CACHE_SWITCH, "T") && transportContext != null && transportContext.bizType == 1) {
            String cookie2 = getCookie(topDomain);
            if (!StringUtils.isEmpty(cookie2)) {
                LogCatUtil.info(TAG, "[getCookieWrapper] Use old cache cookie. add cookie=[" + cookie2 + "]. url=" + str);
                return cookie2;
            }
            z = true;
        }
        if (MiscUtils.isInAlipayClient(context) && MiscUtils.isPushProcess(context)) {
            LogCatUtil.info(TAG, "[getCookieWrapper] Another process is not operating a cookie.");
            return "";
        }
        if (z) {
            synchronized (GwCookieCacheHelper.class) {
                String cookie3 = getCookie(topDomain);
                if (!StringUtils.isEmpty(cookie3)) {
                    LogCatUtil.info(TAG, "[getCookieWrapper] Use new cache cookie. add cookie=[" + cookie3 + "]. url=" + str);
                    return cookie3;
                }
                cookie = CookieAccessHelper.getCookie(str, context);
                LogCatUtil.info(TAG, "[getCookieWrapper] get from CookieManager complete");
                if (StringUtils.isEmpty(cookie)) {
                    return "";
                }
                cookieStringToMap(cookie, getCookieMapByDomain(topDomain));
                LogCatUtil.info(TAG, "[getCookieWrapper] Cookie Cache load finish.");
            }
        } else {
            cookie = CookieAccessHelper.getCookie(str, context);
            if (StringUtils.isEmpty(cookie)) {
                return "";
            }
        }
        LogCatUtil.debug(TAG, "[getCookieWrapper] Use cookie manager. add cookie=[" + cookie + "] . url=" + str);
        return cookie;
    }

    public static final synchronized String getCookie(String str) {
        synchronized (GwCookieCacheHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3341ef95", new Object[]{str});
            }
            if (!cookieCacheMaps.isEmpty() && cookieCacheMaps.get(str) != null) {
                if (cookieCacheMaps.get(str).isEmpty()) {
                    return "";
                }
                return toCookieString(cookieCacheMaps.get(str));
            }
            return "";
        }
    }

    public static final String toCookieString(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("738901f2", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append("; ");
        }
        return sb.deleteCharAt(sb.length() - 2).toString().trim();
    }

    public static final synchronized void removeAllCookie() {
        synchronized (GwCookieCacheHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88e96b48", new Object[0]);
            } else {
                cookieCacheMaps.clear();
            }
        }
    }

    public static void cookieStringToMap(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34b7a08", new Object[]{str, map});
        } else if (StringUtils.isEmpty(str)) {
            LogCatUtil.warn(TAG, "[cookieStringToMap] localCookie is empty.");
        } else if (map == null) {
            LogCatUtil.warn(TAG, "[cookieStringToMap] map is null.");
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
            while (stringTokenizer.hasMoreTokens()) {
                String trim = stringTokenizer.nextToken().trim();
                if (StringUtils.isEmpty(trim)) {
                    LogCatUtil.warn(TAG, "[cookieStringToMap] kvPairStr is empty.");
                } else {
                    int indexOf = trim.indexOf("=", 0);
                    if (indexOf < 0) {
                        LogCatUtil.warn(TAG, "[cookieStringToMap] Not find '=' symbol.");
                    } else {
                        String substring = trim.substring(0, indexOf);
                        int i = indexOf + 1;
                        map.put(substring, trim.length() - i > 0 ? trim.substring(i) : "");
                    }
                }
            }
        }
    }
}
