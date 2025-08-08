package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.analytics.core.config.s;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class cfh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, JSONObject> f26264a = new HashMap();
    private static Map<String, Object> b = new HashMap();
    private static Map<String, Object> c = new HashMap();

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        cfi.d("params", str);
        try {
            Map<String, String> e = e(str);
            if (context != null) {
                if ("true".equals(e.get("isSPA"))) {
                    UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(context);
                }
                UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(context);
            } else {
                cfi.d(null, "cannot get pageObject");
            }
            a(context, e);
            d(context);
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        cfi.d(null, "params", str);
        try {
            new JSONObject(str);
        } catch (Exception e) {
            Log.e("ut4aplus", "", e);
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(context);
    }

    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54b79e8", new Object[]{context, str});
            return;
        }
        cfi.d(null, "params", str);
        try {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, e(str));
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        cfi.d(null, "params", str);
        try {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(e(str));
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161bc7", new Object[]{context, str});
            return;
        }
        cfi.a((String) null, "params", str);
        try {
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(context, str);
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        cfi.d(null, "params", str);
        try {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(str);
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        try {
            f26264a.put(str, new JSONObject(str2));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static Object c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("c56c56fe", new Object[]{str}) : f26264a.get(str);
    }

    public static Map a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : b;
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            f26264a.remove(str);
        }
    }

    public static Map b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]) : c;
    }

    public static Map<String, String> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ddd6ceb", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (jSONObject.get(next) != null) {
                    hashMap.put(next, jSONObject.get(next) + "");
                } else {
                    hashMap.put(next, "");
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    public static void e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e0bda6", new Object[]{context, str});
            return;
        }
        cfi.d(null, "params", str);
        try {
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, e(str).get("pageName"));
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static void f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ab5f85", new Object[]{context, str});
            return;
        }
        cfi.d(null, "params", str);
        try {
            String str2 = e(str).get("pageURL");
            if (StringUtils.isEmpty(str2)) {
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageUrl(context, Uri.parse(str2));
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    private static void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
            return;
        }
        try {
            if (!map.containsKey("isRefresh")) {
                return;
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put("_h5_refresh", "1");
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, hashMap);
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    private static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
            return;
        }
        try {
            HashMap hashMap = new HashMap(1);
            hashMap.put("ut4aplus", "1");
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, hashMap);
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static Object a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c902fed2", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pageSpmUrl", UTAnalytics.getInstance().getDefaultTracker().getPageSpmUrl((Activity) context));
        } catch (Exception e) {
            Log.e("ut4aplus", "", e);
        }
        return jSONObject;
    }

    public static Object b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3e7d2513", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pageSpmPre", UTAnalytics.getInstance().getDefaultTracker().getPageSpmPre((Activity) context));
        } catch (Exception e) {
            Log.e("ut4aplus", "", e);
        }
        return jSONObject;
    }

    public static void f(String str) {
        Map hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{str});
            return;
        }
        try {
            Map<String, String> e = e(str);
            if (e == null) {
                return;
            }
            String remove = e.remove("pageName");
            int intValue = Integer.valueOf(e.remove("eventId") + "").intValue();
            String remove2 = e.remove("arg1");
            String remove3 = e.remove("arg2");
            String remove4 = e.remove("arg3");
            String remove5 = e.remove("args");
            if (!StringUtils.isEmpty(remove5)) {
                hashMap = e(remove5);
            } else {
                hashMap = new HashMap();
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(remove, intValue, remove2, remove3, remove4, hashMap).build());
        } catch (Throwable th) {
            Log.e("ut4aplus", "", th);
        }
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{str});
        } else {
            UTAnalytics.getInstance().turnOnRealTimeDebug(e(str));
        }
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{str});
        } else {
            UTAnalytics.getInstance().userRegister(e(str).get("userNick"));
        }
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{str});
            return;
        }
        Map<String, String> e = e(str);
        UTAnalytics.getInstance().updateUserAccount(e.get("userNick"), e.get("userId"), e.get("openId"));
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{str});
            return;
        }
        Map<String, String> e = e(str);
        if (e == null || e.isEmpty()) {
            return;
        }
        s sVar = new s();
        sVar.a(e.get("kn"));
        sVar.c(e.get("v"));
        sVar.b(e.get(s.TYPE_FAR));
        UTAnalytics.getInstance().getDefaultTracker().addTPKItem(sVar);
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{str});
        } else {
            UTAnalytics.getInstance().updateSessionProperties(e(str));
        }
    }

    public static void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{str});
            return;
        }
        Map<String, String> e = e(str);
        if (e == null || e.isEmpty()) {
            return;
        }
        for (String str2 : e.keySet()) {
            UTAnalytics.getInstance().getDefaultTracker().setGlobalProperty(str2, e.get(str2));
        }
    }
}
