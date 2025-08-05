package com.taobao.android.msoa.util;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.g;
import com.taobao.android.sku.utils.o;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.weex.WXSDKInstance;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bpp;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f14445a = new ArrayList<String>() { // from class: com.taobao.android.msoa.util.ClientSKUUtils$1
        {
            add("cart");
            add("minidetail");
            add("taobaolive_msoa");
            add("tbshortvideo");
        }
    };
    private static String b = "Native_NULL";

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f14446a;
        public Map<String, Object> b;

        public a(String str, Map<String, Object> map) {
            this.f14446a = str;
            this.b = map;
        }
    }

    public static g a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("4a173284", new Object[]{gVar});
        }
        if ("msoa.taobao.detail.showsku".equals(gVar.b)) {
            gVar.c = "2.0";
            if (gVar.f == null) {
                gVar.f = new HashMap<String, Object>() { // from class: com.taobao.android.msoa.util.ClientSKUUtils$2
                    {
                        put("exParams", new JSONObject());
                    }
                };
            } else if (!(gVar.f.get("exParams") instanceof JSONObject)) {
                gVar.f.put("exParams", new JSONObject());
            }
        }
        return gVar;
    }

    public static a a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ad75a906", new Object[]{str, str2, map});
        }
        if ("msoa.taobao.detail.showsku".equals(str)) {
            if (map == null) {
                map = new HashMap<String, Object>() { // from class: com.taobao.android.msoa.util.ClientSKUUtils$3
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
            return;
        }
        if (jSONObject != null) {
            try {
                long longValue = jSONObject.getLongValue("JSBRIDGE_START_UPTIME");
                if (longValue != 0) {
                    map.put("JSBRIDGE_START_UPTIME", Long.valueOf(longValue));
                }
            } catch (Throwable unused) {
            }
        }
        map.put("MSOA_START_UPTIME", Long.valueOf(System.currentTimeMillis()));
    }

    public static void a(String str, String str2) {
        UMLinkLogInterface a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!"msoa.taobao.detail.showsku".equalsIgnoreCase(str) || !"1.0".equalsIgnoreCase(str2) || (a2 = bpp.a()) == null) {
        } else {
            try {
                a2.commitFailure("Main", "sku1.0", "", "New_Sku", o.DEFAULT_BIZ_NAME, new HashMap<String, String>() { // from class: com.taobao.android.msoa.util.ClientSKUUtils$4
                    {
                        put("errorMsg", "sku1.0");
                    }
                }, "UME_SKU_MSOA_SKU1.0", "sku1.0");
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(String str, Map<String, Object> map, WXSDKInstance wXSDKInstance) {
        Map a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c427b", new Object[]{str, map, wXSDKInstance});
        } else if (b(str, map) || (a2 = a(map)) == null) {
        } else {
            a2.put("_sku_weexUrl_", b(wXSDKInstance));
            a2.put("_sku_unique_marker_", a(wXSDKInstance));
            a2.put("_sku_actStack_", b());
        }
    }

    public static void a(String str, Map<String, Object> map) {
        Map a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else if (b(str, map) || (a2 = a(map)) == null || a2.containsKey("_sku_webviewUrl_") || a2.containsKey("_sku_unique_marker_") || a2.containsKey("_sku_weexUrl_") || a2.containsKey("_sku_actStack_") || a2.containsKey("_sku_codeStack_")) {
        } else {
            a2.put("_sku_actStack_", b());
            a2.put("_sku_unique_marker_", b);
            a2.put("_sku_codeStack_", a());
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

    private static boolean b(String str, Map<String, Object> map) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("819a01b6", new Object[]{str, map})).booleanValue();
        }
        if (!"msoa.taobao.detail.showsku".equalsIgnoreCase(str)) {
            return true;
        }
        if (map != null) {
            Object obj2 = map.get("exParams");
            if ((obj2 instanceof Map) && (obj = ((Map) obj2).get("bizName")) != null) {
                return f14445a.contains(obj.toString());
            }
        }
        return false;
    }

    private static String a(WXSDKInstance wXSDKInstance) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("140cc0da", new Object[]{wXSDKInstance});
        }
        if (wXSDKInstance != null) {
            str = wXSDKInstance.ak();
            try {
                Uri parse = Uri.parse(str);
                return parse.getScheme() + HttpConstant.SCHEME_SPLIT + parse.getHost() + "" + parse.getPath();
            } catch (Throwable unused) {
            }
        } else {
            str = "";
        }
        return TextUtils.isEmpty(str) ? "Weex_NULL" : str;
    }

    private static String b(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a147725b", new Object[]{wXSDKInstance});
        }
        String ak = wXSDKInstance != null ? wXSDKInstance.ak() : "";
        return TextUtils.isEmpty(ak) ? "NULL" : ak;
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int length = stackTrace.length;
        if (length > 5) {
            length = 5;
        }
        for (int i = 0; i < length; i++) {
            jSONArray.add(stackTrace[i].toString());
        }
        return jSONArray.toJSONString();
    }

    private static String b() {
        JSONArray jSONArray = new JSONArray();
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]))).values()) {
                Field declaredField2 = obj.getClass().getDeclaredField("activity");
                declaredField2.setAccessible(true);
                Activity activity = (Activity) declaredField2.get(obj);
                String str = "" + activity.getClass().getCanonicalName();
                b = str;
                jSONArray.add(activity.getIntent() != null ? str + " : " + activity.getIntent().getDataString() : str + " : NULL");
            }
            if (TextUtils.isEmpty(b)) {
                b = "Native_NULL";
            }
            return jSONArray.toJSONString();
        } catch (Throwable unused) {
            if (TextUtils.isEmpty(b)) {
                b = "Native_Exception_NULL";
            }
            return jSONArray.toJSONString();
        }
    }
}
