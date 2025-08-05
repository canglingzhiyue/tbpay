package com.taobao.vessel.utils;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import tb.ado;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DOWN_GRADE = "downgrade_url";
    public static final String HTTPS_SCHEMA = "https:";
    public static final String NATIVE = "vessel";
    public static final String WH_WEEX = "wh_weex";
    public static final String WH_WEEX_TRUE = "wh_weex=true";
    public static final String WX_TPL = "_wx_tpl";

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f23450a;

    static {
        kge.a(-425158963);
        f23450a = new AtomicInteger(2000);
    }

    public static VesselType a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselType) ipChange.ipc$dispatch("f3ecbb9f", new Object[]{str});
        }
        if (h(str)) {
            return VesselType.Weex;
        }
        if (k(str)) {
            return VesselType.Web;
        }
        if (i(str)) {
            return VesselType.Native;
        }
        return VesselType.Web;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitFail("vessel", "vessel", str, str2);
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (!b(str, DOWN_GRADE)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = Uri.parse(parse.getQueryParameter(DOWN_GRADE)).buildUpon();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                if (!WX_TPL.equals(str2)) {
                    buildUpon.appendQueryParameter(str2, parse.getQueryParameter(str2));
                }
            }
        }
        return buildUpon.toString();
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str}) : (str != null && h(str)) ? j(str) : str;
    }

    public static int a() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        do {
            i = f23450a.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!f23450a.compareAndSet(i, i2));
        return i;
    }

    public static String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        if (obj == null) {
            return c.DEFAULT_URL;
        }
        Map hashMap = new HashMap();
        if (obj instanceof Map) {
            hashMap = (Map) obj;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : hashMap.keySet()) {
            jSONObject.put(str, hashMap.get(str));
        }
        return JSON.toJSONString(jSONObject);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        if (str == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return null;
        }
        return parse.getQueryParameter("classname");
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{str});
        }
        if (str == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return null;
        }
        return parse.getHost();
    }

    private static boolean f(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && !TextUtils.isEmpty(Uri.parse(str).getScheme());
    }

    private static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith(ado.URL_SEPARATOR)) {
            return str;
        }
        return HTTPS_SCHEMA + str;
    }

    private static boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb017cfd", new Object[]{str})).booleanValue();
        }
        if (!k(str)) {
            return false;
        }
        return b(str, WX_TPL) || str.contains("wh_weex=true");
    }

    private static boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4533163e", new Object[]{str})).booleanValue();
        }
        if (!f(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() != null && "vessel".equals(parse.getScheme());
    }

    private static String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a00ca85", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return c.DEFAULT_URL;
        }
        Uri parse = Uri.parse(str);
        if (!TextUtils.isEmpty(parse.getQueryParameter(WX_TPL))) {
            Uri.Builder buildUpon = Uri.parse(parse.getQueryParameter(WX_TPL)).buildUpon();
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames != null && queryParameterNames.size() > 0) {
                for (String str2 : queryParameterNames) {
                    if (!WX_TPL.equals(str2)) {
                        buildUpon.appendQueryParameter(str2, parse.getQueryParameter(str2));
                    }
                }
            }
            return buildUpon.toString();
        } else if (TextUtils.equals("true", parse.getQueryParameter("wh_weex"))) {
            return parse.toString();
        } else {
            return null;
        }
    }

    private static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        return parse.isHierarchical() && !TextUtils.isEmpty(parse.getQueryParameter(str2));
    }

    private static boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d99648c0", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!f(str)) {
            str = g(str);
        }
        Uri parse = Uri.parse(str);
        return "http".equals(parse.getScheme()) || "https".equals(parse.getScheme());
    }

    public static String a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        String str = (map == null || map.isEmpty()) ? "" : (String) map.get("bundleUrl");
        return TextUtils.isEmpty(str) ? c.DEFAULT_URL : str;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null || !(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        if (activity.isFinishing()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && activity.isDestroyed();
    }
}
