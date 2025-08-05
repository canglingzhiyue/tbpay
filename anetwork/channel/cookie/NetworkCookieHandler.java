package anetwork.channel.cookie;

import android.os.Build;
import android.webkit.CookieSyncManager;
import anet.channel.AwcnConfig;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class NetworkCookieHandler extends CookieHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private android.webkit.CookieManager cm;

    static {
        kge.a(-189299147);
    }

    public NetworkCookieHandler(android.webkit.CookieManager cookieManager) {
        this.cm = cookieManager;
    }

    @Override // java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c41deedb", new Object[]{this, uri, map});
        }
        if (!CookieManager.checkSetup() || !CookieManager.isCookieValid) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
        } catch (Throwable th) {
            ALog.e("NetworkCookieHandler", "[network cookie][NetworkCookieHandler] get cookie failed", null, th, "url", uri.toString(), "\nheaders", map);
        }
        if (this.cm != null && uri != null) {
            String cookie = this.cm.getCookie(uri.toString());
            if (cookie != null && !cookie.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(cookie);
                hashMap.put("Cookie", arrayList);
            }
            return hashMap;
        }
        ALog.e("NetworkCookieHandler", "[network cookie][NetworkCookieHandler] get, cm or uri is null", null, "url", uri.toString(), "\nheaders", map);
        return hashMap;
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f034e8d", new Object[]{this, uri, map});
        } else if (CookieManager.checkSetup() && CookieManager.isCookieValid) {
            if (this.cm == null || uri == null) {
                ALog.e("NetworkCookieHandler", "[network cookie][NetworkCookieHandler] put, cm or uri is null", null, "url", uri.toString(), "\nheaders", map);
                return;
            }
            String uri2 = uri.toString();
            try {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null && (key.equalsIgnoreCase("Set-Cookie") || key.equalsIgnoreCase(HttpConstant.SET_COOKIE2))) {
                        for (String str : entry.getValue()) {
                            this.cm.setCookie(uri2, str);
                            if (AwcnConfig.isHostInCookiePrintLogWhiteList(uri.getHost())) {
                                ALog.e("NetworkCookieHandler", "[network cookie][NetworkCookieHandler] set cookie.", null, "url", uri2, "cookies", str);
                            }
                            if (Build.VERSION.SDK_INT < 21) {
                                CookieSyncManager.getInstance().sync();
                            } else {
                                this.cm.flush();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                ALog.e("NetworkCookieHandler", "[network cookie][NetworkCookieHandler] set cookie failed", null, th, "url", uri2, "\nheaders", map);
            }
        }
    }
}
