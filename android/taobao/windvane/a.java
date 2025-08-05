package android.taobao.windvane;

import android.content.Context;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-953400378);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            CookieSyncManager.createInstance(context);
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String cookie = CookieManager.getInstance().getCookie(str);
        m.e("WVCookieManager", "getCookie url=" + str + ",cookieStr=" + cookie);
        return cookie;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str) || str2 == null) {
        } else {
            m.e("WVCookieManager", "setCookie url=" + str + ",cookieStr=" + str2);
            if (!CookieManager.getInstance().acceptCookie()) {
                CookieManager.getInstance().setAcceptCookie(true);
            }
            CookieManager.getInstance().setCookie(str, str2);
        }
    }
}
