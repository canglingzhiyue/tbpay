package com.taobao.android.purchase.aura.helper;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.purchase.aura.utils.i;
import com.taobao.android.purchase.preload.e;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.media.MediaConstant;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.bgd;
import tb.kge;
import tb.mly;
import tb.rrv;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Map<String, String>> f14743a;

    static {
        kge.a(-1136205407);
        f14743a = new HashMap();
    }

    public static Map<String, String> f(Context context) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d3765d70", new Object[]{context});
        }
        if (!f14743a.isEmpty() && (map = f14743a.get("cacheParams")) != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(b(context));
        hashMap.putAll(a(context));
        f14743a.put("cacheParams", hashMap);
        return hashMap;
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else {
            f14743a.clear();
        }
    }

    public static Map<String, String> a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{context}) : a(context, null);
    }

    public static Map<String, String> a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5b2138c5", new Object[]{context, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            String str = APSecuritySdk.getInstance(context.getApplicationContext()).getTokenResult().apdidToken;
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put(rrv.APDIDTOKEN, (Object) str);
            }
        } catch (Exception unused) {
            UnifyLog.d("RequestUtil", "addExtraParams", "APSecuritySdk 获取参数报错");
        }
        if (b.a(context)) {
            jSONObject2.put("lbsInfo", (Object) com.taobao.android.purchase.aura.utils.c.b());
        }
        jSONObject2.putAll(a());
        jSONObject2.putAll(b());
        jSONObject2.putAll(c());
        jSONObject2.putAll(d(context));
        jSONObject2.putAll(d());
        jSONObject2.putAll(e(context));
        jSONObject2.put("isLargeScreen", (Object) Boolean.toString(i.a(context)));
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("exParams", jSONObject2.toJSONString());
        return hashMap;
    }

    public static Map<String, String> b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c7c4b7f4", new Object[]{context});
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(c(context));
        return hashMap;
    }

    private static Map<String, String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("coupon", "true");
        hashMap.put("coVersion", "2.0");
        return hashMap;
    }

    private static Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tradeProtocolFeatures", "5");
        hashMap.put("tradeTemplates", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        return hashMap;
    }

    private static Map<String, String> c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ab12153", new Object[]{context});
        }
        HashMap hashMap = new HashMap();
        try {
            PositionInfo b = com.taobao.android.editionswitcher.b.b(context);
            String str = b != null ? b.countryCode : "";
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("countryCode", str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    private static Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        try {
            boolean a2 = bgd.a();
            if (a2) {
                hashMap.put("inner", a2 ? "1" : "0");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    private static JSONObject d(Context context) {
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("156dde5d", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        if (context != null && (b = e.b(context)) != null && !b.isEmpty()) {
            jSONObject.put("alipayCashierParams", (Object) b.toJSONString());
        }
        return jSONObject;
    }

    private static JSONObject d() {
        String globalProperty;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(globalProperty)) {
            return jSONObject;
        }
        String[] split = globalProperty.split(mly.UNESCAPED_SEPARATOR);
        if (split.length < 4) {
            return jSONObject;
        }
        String str = split[2];
        if (str.length() > 50) {
            return jSONObject;
        }
        jSONObject.put("bcflsrc", (Object) str);
        return jSONObject;
    }

    private static JSONObject e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a9ac4dfc", new Object[]{context});
        }
        final String a2 = a.a(context, false);
        return new JSONObject() { // from class: com.taobao.android.purchase.aura.helper.RequestConfig$1
            {
                if (!TextUtils.isEmpty(a2)) {
                    put("installApp", (Object) a2);
                }
            }
        };
    }
}
