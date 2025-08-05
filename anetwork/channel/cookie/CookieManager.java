package anetwork.channel.cookie;

import android.content.Context;
import android.os.Build;
import android.webkit.CookieSyncManager;
import anet.channel.AwcnConfig;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anetwork.channel.config.NetworkConfigCenter;
import anetwork.channel.http.NetworkSdkSetting;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.CookieHandler;
import java.net.CookieStore;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class CookieManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "anet.CookieManager";
    public static boolean isCookieValid;
    private static volatile boolean isSetup;
    private static android.webkit.CookieManager webkitCookMgr;

    @Deprecated
    public static void setTargetMonitorCookieName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb095c7", new Object[]{str});
        }
    }

    public static /* synthetic */ void access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            doSetupTask(context);
        }
    }

    static {
        kge.a(-572269108);
        isSetup = false;
        isCookieValid = true;
    }

    public static void setup(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de2fc4", new Object[]{context});
        } else if (AwcnConfig.isLaunchOptV2Opened()) {
            ThreadPoolExecutorFactory.submitPriorityTask(new Runnable() { // from class: anetwork.channel.cookie.CookieManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        CookieManager.access$000(context);
                    }
                }
            }, ThreadPoolExecutorFactory.Priority.NORMAL);
        } else {
            doSetupTask(context);
        }
    }

    private static synchronized void doSetupTask(Context context) {
        synchronized (CookieManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d837732a", new Object[]{context});
            } else if (isSetup) {
            } else {
                if (NetworkConfigCenter.isCookieDisable()) {
                    ALog.e(TAG, "cookie manager disable.", null, new Object[0]);
                    isSetup = true;
                    isCookieValid = false;
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (Build.VERSION.SDK_INT < 21) {
                    CookieSyncManager.createInstance(context);
                }
                android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
                webkitCookMgr = cookieManager;
                cookieManager.setAcceptCookie(true);
                if (Build.VERSION.SDK_INT < 21) {
                    webkitCookMgr.removeExpiredCookie();
                }
                if (AwcnConfig.isCookieOptEnable()) {
                    CookieHandler.setDefault(new NetworkCookieHandler(webkitCookMgr));
                }
                ALog.e(TAG, "CookieManager setup.", null, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), "isCookieOptEnable", Boolean.valueOf(AwcnConfig.isCookieOptEnable()));
                isSetup = true;
            }
        }
    }

    public static boolean checkSetup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca799c60", new Object[0])).booleanValue();
        }
        if (!isSetup && NetworkSdkSetting.getContext() != null) {
            ALog.e(TAG, "CookieManager checkSetup!", null, new Object[0]);
            doSetupTask(NetworkSdkSetting.getContext());
        }
        return isSetup;
    }

    public static synchronized void setCookie(String str, String str2) {
        synchronized (CookieManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d42fc581", new Object[]{str, str2});
            } else if (!checkSetup() || !isCookieValid) {
            } else {
                webkitCookMgr.setCookie(str, str2);
                if (Build.VERSION.SDK_INT < 21) {
                    CookieSyncManager.getInstance().sync();
                } else {
                    webkitCookMgr.flush();
                }
            }
        }
    }

    public static void setCookie(String str, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5430b32e", new Object[]{str, map});
        } else {
            setCookie("", str, map);
        }
    }

    public static void setCookie(String str, String str2, Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8043e4", new Object[]{str, str2, map});
        } else if (str2 != null && map != null) {
            try {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null && (key.equalsIgnoreCase("Set-Cookie") || key.equalsIgnoreCase(HttpConstant.SET_COOKIE2))) {
                        for (String str3 : entry.getValue()) {
                            setCookie(str2, str3);
                            if (AwcnConfig.isHostInCookiePrintLogWhiteList(str)) {
                                ALog.e(TAG, "[cookie] " + key, null, "url", str2, "cookies", str3);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                ALog.e(TAG, "set cookie failed", null, e, "url", str2, "\nheaders", map);
            }
        }
    }

    public static synchronized String getCookie(String str) {
        synchronized (CookieManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3341ef95", new Object[]{str});
            } else if (!checkSetup() || !isCookieValid) {
                return null;
            } else {
                return webkitCookMgr.getCookie(str);
            }
        }
    }

    public static void printLog(String str, String str2, String str3, String str4) {
        CookieStore cookieStore;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d812086", new Object[]{str, str2, str3, str4});
            return;
        }
        try {
            ALog.e(TAG, "[cookie] get " + str, str2, "url", str4, "cookies", str3);
            java.net.CookieManager cookieManager = (java.net.CookieManager) CookieHandler.getDefault();
            if (cookieManager == null || (cookieStore = cookieManager.getCookieStore()) == null) {
                return;
            }
            ALog.e(TAG, "[cookie] get " + str, str2, "url", str4, "cookieClass", cookieStore.getClass().toString());
        } catch (Throwable th) {
            ALog.e(TAG, "[cookie] get error " + str, str2, "url", str4, "cookies", str3, "error", th);
        }
    }
}
