package com.taobao.android.msoa;

import android.app.Activity;
import android.net.Uri;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.TBPlayerConst;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f14439a = new ArrayList<String>() { // from class: com.taobao.android.msoa.ServerSKUUtils$1
        {
            add("cart");
            add("minidetail");
            add("taobaolive_msoa");
            add("tbshortvideo");
        }
    };

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f14440a;
        public Map<String, Object> b;

        public a(String str, Map<String, Object> map) {
            this.f14440a = str;
            this.b = map;
        }
    }

    public static a a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2b7a0e33", new Object[]{str, str2, map});
        }
        if ("msoa.taobao.detail.showsku".equals(str)) {
            if (map == null) {
                map = new HashMap<String, Object>() { // from class: com.taobao.android.msoa.ServerSKUUtils$2
                    {
                        put("exParams", new JSONObject());
                    }
                };
            } else if (!(map.get("exParams") instanceof JSONObject)) {
                map.put("exParams", new JSONObject());
            }
            return new a("2.0", map);
        }
        return new a(str2, map);
    }

    public static Map<String, Object> a(Map<String, Object> map, JSONObject jSONObject) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7c7a6d68", new Object[]{map, jSONObject});
        }
        if (map == null) {
            return map;
        }
        Object obj2 = map.get("exParams");
        if (!(obj2 instanceof JSONObject)) {
            return map;
        }
        JSONObject jSONObject2 = (JSONObject) obj2;
        a(jSONObject, (Map<String, Object>) jSONObject2);
        String string = jSONObject2.getString("bizName");
        if (TextUtils.isEmpty(string) && (obj = map.get("bizName")) != null) {
            string = obj.toString();
        }
        if (jSONObject != null) {
            if (TextUtils.isEmpty(string)) {
                string = jSONObject.getString("bizName");
            }
            if (TextUtils.isEmpty(string)) {
                string = jSONObject.getString(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName);
            }
        }
        if (TextUtils.isEmpty(string)) {
            string = "null";
        }
        jSONObject2.put("bizName", (Object) string);
        return map;
    }

    private static void a(JSONObject jSONObject, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37335efd", new Object[]{jSONObject, map});
        } else if (jSONObject == null) {
        } else {
            try {
                long longValue = jSONObject.getLongValue("JSBRIDGE_START_UPTIME");
                if (longValue == 0) {
                    return;
                }
                map.put("JSBRIDGE_START_UPTIME", Long.valueOf(longValue));
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str, Map<String, Object> map, IWVWebView iWVWebView) {
        Map a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0dfd437", new Object[]{str, map, iWVWebView});
        } else if (a(str, map) || (a2 = a(map)) == null) {
        } else {
            a2.put("_sku_webviewUrl_", b(iWVWebView));
            a2.put("_sku_unique_marker_", a(iWVWebView));
            a2.put("_sku_actStack_", a());
        }
    }

    private static Map a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        Object obj = map.get("exParams");
        if (!(obj instanceof Map)) {
            return null;
        }
        return (Map) obj;
    }

    private static boolean a(String str, Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20476517", new Object[]{str, map})).booleanValue();
        }
        if (!"msoa.taobao.detail.showsku".equalsIgnoreCase(str)) {
            return true;
        }
        if (map != null) {
            Object obj2 = map.get("exParams");
            if ((obj2 instanceof Map) && (obj = ((Map) obj2).get("bizName")) != null) {
                return f14439a.contains(obj.toString());
            }
        }
        return false;
    }

    private static String a(IWVWebView iWVWebView) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7979e14", new Object[]{iWVWebView});
        }
        if (iWVWebView != null) {
            str = iWVWebView.getUrl();
            try {
                Uri parse = Uri.parse(str);
                return parse.getScheme() + HttpConstant.SCHEME_SPLIT + parse.getHost() + "" + parse.getPath();
            } catch (Throwable unused) {
            }
        } else {
            str = "";
        }
        return TextUtils.isEmpty(str) ? "WebView_NULL" : str;
    }

    private static String b(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31c72633", new Object[]{iWVWebView});
        }
        String url = iWVWebView != null ? iWVWebView.getUrl() : "";
        return TextUtils.isEmpty(url) ? "NULL" : url;
    }

    private static String a() {
        Activity activity;
        JSONArray jSONArray = new JSONArray();
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]))).values()) {
                Field declaredField2 = obj.getClass().getDeclaredField("activity");
                declaredField2.setAccessible(true);
                String str = "" + activity.getClass().getCanonicalName();
                jSONArray.add(((Activity) declaredField2.get(obj)).getIntent() != null ? str + " : " + activity.getIntent().getDataString() : str + " : NULL");
            }
            return jSONArray.toJSONString();
        } catch (Throwable unused) {
            return jSONArray.toJSONString();
        }
    }
}
