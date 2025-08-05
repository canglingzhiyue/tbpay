package com.taobao.android.detail.ttdetail.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.android.detail.ttdetail.request.callback.CompatibleRequestCallback;
import com.taobao.android.detail.ttdetail.request.params.MainRequestParams;
import com.ut.share.utils.Constants;
import java.util.HashMap;
import java.util.Map;
import tb.arz;
import tb.kge;
import tb.smo;
import tb.soa;

/* loaded from: classes5.dex */
public class ab {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1555140354);
    }

    public static boolean a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("data")) != null && (jSONObject3 = jSONObject2.getJSONObject("feature")) != null) {
            return Boolean.parseBoolean(jSONObject3.getString("degradeToErrorPage"));
        }
        return false;
    }

    private static boolean b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("data")) != null && (jSONObject3 = jSONObject2.getJSONObject("feature")) != null) {
            return Boolean.parseBoolean(jSONObject3.getString("degradeToBaseDetail"));
        }
        return false;
    }

    public static String a(Context context, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c45eb86", new Object[]{context, jSONObject, str});
        }
        String str2 = null;
        if (!b(jSONObject)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data").getJSONObject("trade");
        if (jSONObject2 != null) {
            str2 = jSONObject2.getString(Constants.WEIBO_REDIRECTURL_KEY);
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        return j.m() + str;
    }

    public static void a(int i, String str, String str2, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f624fdc", new Object[]{new Integer(i), str, str2, uri, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("traceId", str2);
        if (uri != null) {
            hashMap.put("uri", uri.toString());
        }
        hashMap.put("isFliggyData", String.valueOf(z));
        ae.a(hashMap, i, "返回数据类型监控");
    }

    public static void a(String str, String str2, String str3, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9deb5133", new Object[]{str, str2, str3, uri, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.WEIBO_REDIRECTURL_KEY, str);
        hashMap.put("itemId", str2);
        hashMap.put("traceId", str3);
        if (uri != null) {
            hashMap.put("uri", uri.toString());
        }
        hashMap.put("isFliggyData", String.valueOf(z));
        i.a("DetailDowngradeUtils", "-100025跳转到兜底url");
        ae.a(hashMap, -100025, "跳转到兜底url");
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.WEIBO_REDIRECTURL_KEY, str);
        hashMap.put("itemId", str2);
        hashMap.put("traceId", str3);
        i.a("DetailDowngradeUtils", "-100017degradeToBaseDetail跳转到重定向url");
        ae.a(hashMap, -100017, "degradeToBaseDetail跳转到重定向url");
    }

    public static void a(String str, boolean z, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d29d8f6", new Object[]{str, new Boolean(z), str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.WEIBO_REDIRECTURL_KEY, str);
        hashMap.put("itemId", str2);
        hashMap.put("fromServerDegrade", String.valueOf(z));
        hashMap.put("traceId", str3);
        i.a("DetailDowngradeUtils", "-100018跳转到重定向url");
        ae.a(hashMap, -100018, "跳转到重定向url");
    }

    public static void a(String str, String str2, boolean z, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59de7dec", new Object[]{str, str2, new Boolean(z), str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("retCode", str);
        hashMap.put(arz.KEY_RET_MSG, str2);
        hashMap.put("itemId", str3);
        hashMap.put("fromServerDegrade", String.valueOf(z));
        hashMap.put("traceId", str4);
        ae.a(hashMap, -100016, "新详情架构显示错误页");
    }

    public static void a(String str, String str2, String str3, Uri uri, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9006da", new Object[]{str, str2, str3, uri, str4, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.WEIBO_REDIRECTURL_KEY, str);
        hashMap.put("itemId", str2);
        hashMap.put("traceId", str3);
        if (uri != null) {
            hashMap.put("uri", uri.toString());
        }
        hashMap.put("reason", !TextUtils.isEmpty(str4) ? str4 : "no reason");
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        i.a("DetailDowngradeUtils", "-100030 for reason: " + str4 + " : 端侧异常跳转到兜底URL");
        ae.a(hashMap, -100030, "端侧异常跳转到兜底URL");
    }

    public static void a(Context context, Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420ddaf1", new Object[]{context, uri, str});
            return;
        }
        try {
            i.a("DetailDowngradeUtils", "downgrade to DetailActivity");
            Activity activity = (Activity) context;
            Intent intent = new Intent(activity, Class.forName("com.taobao.android.detail.wrapper.activity.DetailActivity"));
            intent.setData(uri);
            intent.putExtra(TTDetailPageManager.DOWNGRADE_DATA_ID, str);
            activity.startActivity(intent);
            activity.finish();
            activity.overridePendingTransition(0, 0);
            i.a("DetailDowngradeUtils", "downgrade2DetailWrapper done");
        } catch (Throwable th) {
            i.a("DetailDowngradeUtils", "downgrade2DetailWrapper exception", th);
        }
    }

    public static void a(Context context, String str, String str2, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742d5b91", new Object[]{context, str, str2, map});
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            if (map != null) {
                l.a(str2, map);
            }
            Bundle bundle = new Bundle();
            bundle.putString("myBrowserUrl", str2);
            bundle.putString("ItemIdForceH5", str);
            l.a(context, bundle, str2);
            if (!(context instanceof Activity)) {
                return;
            }
            Activity activity = (Activity) context;
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
    }

    public static void a(MainRequestParams mainRequestParams, soa soaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffdced48", new Object[]{mainRequestParams, soaVar, str});
        } else if (mainRequestParams == null || soaVar == null) {
        } else {
            new smo(mainRequestParams).a(new CompatibleRequestCallback(mainRequestParams, soaVar)).k();
            a(mainRequestParams.getItemId(), str);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("traceId", str2);
        ae.a(hashMap, -300010, "主接口请求降级getDetail");
    }

    public static void a(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da24c280", new Object[]{new Boolean(z), str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("traceId", str2);
        ae.a(hashMap, z ? -300006 : -300012, z ? "getdetail降级请求失败" : "data.get单响应请求回调失败");
    }

    public static void b(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e189f79f", new Object[]{new Boolean(z), str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put("traceId", str2);
        ae.a(hashMap, z ? -300005 : -300011, z ? "getdetail降级请求返回数据为空" : "data.get单响应请求返回数据为空");
    }

    public static void a(MainRequestParams mainRequestParams, soa soaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5046fe", new Object[]{mainRequestParams, soaVar});
        } else {
            a(mainRequestParams, soaVar, "0");
        }
    }

    public static void a(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7197a36", new Object[]{new Boolean(z), str});
        } else {
            a(z, str, "0");
        }
    }

    public static void b(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f31b0915", new Object[]{new Boolean(z), str});
        } else {
            b(z, str, "0");
        }
    }
}
