package tb;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class sci {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "qmtopsdk.CookieManager";

    /* renamed from: a  reason: collision with root package name */
    public static CookieManager f33471a;
    private static volatile boolean b;

    static {
        kge.a(-1271740211);
        b = false;
    }

    public static synchronized void a(Context context) {
        synchronized (sci.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
                return;
            }
            if (!b && context != null) {
                CookieSyncManager.createInstance(context);
                CookieManager cookieManager = CookieManager.getInstance();
                f33471a = cookieManager;
                cookieManager.setAcceptCookie(true);
                f33471a.removeExpiredCookie();
                b = true;
            }
        }
    }

    public static synchronized void a(String str, String str2) {
        synchronized (sci.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            } else if (!b) {
            } else {
                f33471a.setCookie(str, str2);
                CookieSyncManager.getInstance().sync();
            }
        }
    }

    public static synchronized String a(String str) {
        synchronized (sci.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
            } else if (!b) {
                return null;
            } else {
                return f33471a.getCookie(str);
            }
        }
    }
}
