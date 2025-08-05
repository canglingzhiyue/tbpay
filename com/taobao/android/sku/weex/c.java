package com.taobao.android.sku.weex;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.p;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.sku.utils.n;
import com.taobao.android.sku.utils.o;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.q;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_PRE_WEEX_SIZE = 2;
    public static final String TAG = "WeexInstancePreloader";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f15228a;
    private static boolean b;
    private static Map<String, Map<String, MUSDKInstance>> c;

    static {
        kge.a(1087925623);
        f15228a = new HashMap();
        c = new HashMap();
    }

    public static MUSDKInstance a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("c35b5f1a", new Object[]{context, str, str2});
        }
        o.d(TAG, "getPreloadedInstance " + str2);
        MUSDKInstance mUSDKInstance = null;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!b(str) || !b) {
                return null;
            }
            Map<String, MUSDKInstance> map = c.get(str2);
            if (map != null && map.get(str) != null) {
                o.d(TAG, "has getPreloadedInstance, url : " + str + " uniqueId : " + str2);
                return map.get(str);
            }
            String b2 = b(context, str, str2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) b2);
            String b3 = b(str, str2);
            if (TextUtils.isEmpty(b3)) {
                return null;
            }
            mUSDKInstance = q.a().a(b3, jSONObject);
            StringBuilder sb = new StringBuilder();
            sb.append("getPreloadedInstance result ");
            if (mUSDKInstance == null) {
                z = false;
            }
            sb.append(z);
            o.d(TAG, sb.toString());
            if (mUSDKInstance == null) {
                o.a(o.DEFAULT_BIZ_NAME, o.UM_WEEX_SKU_PRELOAD, "getPreloadedInstance is null");
            }
            o.a(b3, str);
            if (mUSDKInstance != null && c()) {
                if (map == null) {
                    map = new HashMap<>();
                    c.put(str2, map);
                }
                map.put(str, mUSDKInstance);
            }
        }
        return mUSDKInstance;
    }

    public static void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
        } else if (!c()) {
        } else {
            try {
                MUSDKInstance a2 = a(context, str2, str3);
                if (a2 == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeStamp", (Object) String.valueOf(System.currentTimeMillis()));
                a2.fireEvent(0, str, jSONObject);
            } catch (Exception e) {
                o.b("postOnButtonClick error : " + e);
            }
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            c.remove(str);
        }
    }

    public static void a(final Context context, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea64ffc", new Object[]{context, str, str2, jSONObject});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        o.c(TAG, "preloadWeexInstance start " + str2 + ",url = " + str);
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || jSONObject == null || !b(str)) {
            return;
        }
        boolean b2 = b();
        b = b2;
        if (!b2) {
            return;
        }
        String b3 = b(str, str2);
        if (TextUtils.isEmpty(b3)) {
            return;
        }
        if (f15228a.containsKey(b3)) {
            o.c(TAG, "preloadWeexInstance has created " + b3);
            return;
        }
        f15228a.put(b3, str2);
        if (SkuPreloadModule.cacheSize() > 2) {
            a();
        }
        SkuPreloadModule.registerModule();
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.d(true);
        mUSInstanceConfig.a(MUSInstanceConfig.RenderMode.texture);
        mUSInstanceConfig.a(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.f(false);
        if (com.taobao.android.sku.pad.b.INSTANCE.a(context)) {
            mUSInstanceConfig.a(new com.taobao.android.weex.config.a() { // from class: com.taobao.android.sku.weex.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex.config.a
                public Rect a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Rect) ipChange2.ipc$dispatch("ef387fb1", new Object[]{this}) : com.taobao.android.sku.pad.b.INSTANCE.c(context);
                }
            });
        }
        String b4 = b(context, str, str2);
        JSONObject jSONObject2 = new JSONObject();
        if (c()) {
            jSONObject.put("tradeParamStr", (Object) com.taobao.android.sku.utils.q.a(context));
        }
        jSONObject2.put("bizName", (Object) b3);
        jSONObject2.put("bundleUrl", (Object) b4);
        jSONObject2.put("initData", (Object) jSONObject);
        q.a().a(context, mUSInstanceConfig, jSONObject2, 0, 0);
        o.a(b3, str, SystemClock.uptimeMillis() - uptimeMillis);
        o.c(TAG, "preloadWeexInstance end " + str2);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        String b2 = b(str, str2);
        if (TextUtils.isEmpty(b2)) {
            return;
        }
        if (f15228a.containsKey(b2)) {
            o.c(TAG, "notifyWeexCreatedBeforePreload instanceId has created " + b2);
            return;
        }
        f15228a.put(b2, str2);
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        String str3 = "";
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str3;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("id");
        if (TextUtils.isEmpty(queryParameter)) {
            return str3;
        }
        String path = parse.getPath();
        if (TextUtils.isEmpty(path)) {
            return str3;
        }
        boolean equals = "true".equals(parse.getQueryParameter("buy_button"));
        StringBuilder sb = new StringBuilder();
        sb.append(path);
        sb.append("_");
        sb.append(str2);
        sb.append("_");
        sb.append(queryParameter);
        if (equals) {
            str3 = "_isBuyButton";
        }
        sb.append(str3);
        return sb.toString();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!b) {
        } else {
            a();
            c(str);
            d(str);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        SkuPreloadModule.clearPreloadInstanceStatus();
        q.a().b();
    }

    private static void c(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else if (TextUtils.isEmpty(str) || (map = f15228a) == null || map.isEmpty()) {
        } else {
            Iterator<Map.Entry<String, String>> it = f15228a.entrySet().iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next().getValue())) {
                    it.remove();
                }
            }
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("enable_sku_preload");
            if (!TextUtils.isEmpty(queryParameter)) {
                return Boolean.parseBoolean(queryParameter);
            }
            return false;
        } catch (Throwable th) {
            o.d("isWeexPreload fail", th.toString());
            return false;
        }
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a("android_sku", "is_weex_preload_open", "true"));
        }
        return false;
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : n.a("enable_weex_preload_opt");
    }

    private static String b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3b17b6d", new Object[]{context, str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("_sku_token_", str2).appendQueryParameter("hit_sku_preload", "true");
        String d = com.taobao.android.sku.pad.b.INSTANCE.d(context);
        if (d != null && com.taobao.android.sku.pad.b.INSTANCE.a(context)) {
            buildUpon.appendQueryParameter(p.KEY_DEVICE_TYPE, d);
        }
        return buildUpon.build().toString();
    }
}
