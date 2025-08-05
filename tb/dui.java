package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.detail.core.event.subscriber.trade.b;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.ut.device.UTDevice;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import tb.ifz;

/* loaded from: classes4.dex */
public class dui {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(73290280);
    }

    public static int b(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1532099", new Object[]{intent})).intValue() : intent.getIntExtra("purchase_from", 3);
    }

    public static String c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("249b0259", new Object[]{intent});
        }
        if (intent == null) {
            ifz.a(ifz.a.b("buyFragment").a("intent is empty").c("EMPTY_INTENT_FORM_(getOpenFrom)").a(1.0f));
            return "异常";
        }
        String str = d(intent).get("openFrom");
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        int b = b(intent);
        return 2 == b ? "detail" : 1 == b ? "carts" : "未知源";
    }

    public static Map<String, String> a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f612a99a", new Object[]{intent});
        }
        if (iyp.a()) {
            return new HashMap();
        }
        return d(intent);
    }

    private static Map<String, String> d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a5d6f5dd", new Object[]{intent});
        }
        HashMap hashMap = new HashMap();
        if (intent == null) {
            ifz.a(ifz.a.b("buyFragment").a("intent is empty").c("EMPTY_INTENT_FORM_(getPageParams)").a(1.0f));
            return hashMap;
        }
        String stringExtra = intent.getStringExtra("openFrom");
        String stringExtra2 = intent.getStringExtra("pageType");
        Uri data = intent.getData();
        if (data != null) {
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = data.getQueryParameter("openFrom");
            }
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = data.getQueryParameter("pageType");
            }
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            hashMap.put("openFrom", stringExtra);
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            hashMap.put("pageType", stringExtra2);
        }
        return hashMap;
    }

    public static Map<String, String> a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3241e792", new Object[]{context, intent});
        }
        HashMap hashMap = new HashMap();
        int intExtra = intent.getIntExtra("purchase_from", 3);
        if (intExtra == 1) {
            Map map = (Map) intent.getSerializableExtra("buildOrderParams");
            if (map != null) {
                b(map);
                return a(context, map, a(intent));
            }
            hashMap.put("buyNow", "false");
            a(hashMap, "cartIds", b(intent.getStringExtra("cartIds")));
            a(hashMap, "buyParam", intent.getStringExtra("buyParam"));
            a(hashMap, b.K_BOOKING_DATE, intent.getStringExtra(b.K_BOOKING_DATE));
            a(hashMap, b.K_ENTRANCE_DATE, intent.getStringExtra(b.K_ENTRANCE_DATE));
        } else if (intExtra == 2) {
            Map map2 = (Map) intent.getSerializableExtra("buildOrderParams");
            if (map2 != null) {
                a(map2);
                b(map2);
                return a(context, map2, a(intent));
            }
            hashMap.put("buyNow", "true");
            a(hashMap, "itemId", intent.getStringExtra("itemId"));
            a(hashMap, "skuId", intent.getStringExtra("skuId"));
            a(hashMap, "quantity", String.valueOf(intent.getIntExtra("quantity", 1)));
            a(hashMap, "tgKey", a(intent.getStringExtra("tgKey")));
            a(hashMap, "serviceId", intent.getStringExtra("serviceId"));
            a(hashMap, b.K_BOOKING_DATE, intent.getStringExtra(b.K_BOOKING_DATE));
            a(hashMap, b.K_ENTRANCE_DATE, intent.getStringExtra(b.K_ENTRANCE_DATE));
            a(hashMap, "exParams", intent.getStringExtra("exParams"));
        } else {
            Map<String, String> a2 = a(intent.getData());
            b(a2);
            return a(context, a2, a(intent));
        }
        a(hashMap);
        a(hashMap, "itemNum", "1");
        return a(context, hashMap, a(intent));
    }

    private static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else if (map == null || map.isEmpty()) {
        } else {
            UnifyLog.a("purchase", "ParamsMaker", "logBuildOrderParams", map.toString());
        }
    }

    private static void b(Map<String, String> map) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{map});
            return;
        }
        String str = map.get("buyParam");
        String str2 = map.get("cartIds");
        map.put("itemNum", "1");
        if (TextUtils.isEmpty(str)) {
            str = str2;
        }
        if (TextUtils.isEmpty(str) || (split = str.split(",")) == null) {
            return;
        }
        map.put("itemNum", split.length + "");
    }

    public static Map<String, String> a(Context context, Map<String, String> map, Map<String, String> map2) {
        String str;
        Map<String, Object> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("43dc63f5", new Object[]{context, map, map2});
        }
        if (map == null) {
            map = new HashMap<>();
        }
        String str2 = map.get("exParams");
        JSONObject jSONObject = null;
        try {
            jSONObject = str2 != null ? JSON.parseObject(str2) : new JSONObject();
        } catch (Exception unused) {
            UnifyLog.d("ParamsMaker", "exParams json 转换错误");
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            str = context.getResources().getConfiguration().locale.toString();
        } catch (Exception unused2) {
            UnifyLog.d("ParamsMaker", "addExtraParams", "获取locale 参数报错");
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("websiteLanguage", (Object) str);
        }
        Map<String, Object> aBTestParams = AliBuyPerfSwitcher.getABTestParams();
        if (aBTestParams != null) {
            jSONObject.putAll(aBTestParams);
        }
        if (PopStrategy.IDENTIFIER_FLOAT.equals(map2.get("pageType")) && (b = com.taobao.android.buy.toggle.b.b()) != null) {
            jSONObject.putAll(b);
        }
        jSONObject.put("umfVersions", (Object) a());
        jSONObject.putAll(map2);
        String b2 = b(context);
        if (!TextUtils.isEmpty(b2)) {
            jSONObject.put("needNativeContainer", (Object) b2);
        }
        a(map, "exParams", jSONObject.toJSONString());
        return map;
    }

    private static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        Intent b = fke.b(context);
        if (b != null) {
            return b.getStringExtra("needNativeContainer");
        }
        return null;
    }

    private static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", (Object) "0.1.0");
        jSONObject.put("features", (Object) new JSONObject());
        return jSONObject;
    }

    public static Map<String, String> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{context});
        }
        HashMap hashMap = new HashMap();
        String utdid = UTDevice.getUtdid(context);
        if (!TextUtils.isEmpty(utdid)) {
            hashMap.put("orderMarker", "v:utdid=" + utdid);
        }
        return hashMap;
    }

    private static void a(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38873cb1", new Object[]{map, str, str2});
        } else if (str2 == null) {
        } else {
            map.put(str, str2);
        }
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{str}) : (str == null || !str.endsWith(",")) ? str : str.substring(0, str.length() - 1);
    }

    private static Map<String, String> a(Uri uri) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e82965d4", new Object[]{uri});
        }
        if (uri == null || uri.isOpaque()) {
            return new HashMap();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            hashMap.put(Uri.decode(encodedQuery.substring(i, indexOf2)), Uri.decode(indexOf2 < indexOf ? encodedQuery.substring(indexOf2 + 1, indexOf) : ""));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return hashMap;
    }
}
