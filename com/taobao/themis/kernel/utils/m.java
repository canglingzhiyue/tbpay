package com.taobao.themis.kernel.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CLEAR_CACHE = "_clear_cache";

    static {
        kge.a(-1304385136);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : "trvNative://authorize/settings";
    }

    public static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        if (uri == null || !uri.isHierarchical()) {
            return null;
        }
        return uri.getQueryParameter(com.taobao.themis.kernel.i.APP_ID);
    }

    public static boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{uri})).booleanValue() : uri != null && !TextUtils.isEmpty(a(uri));
    }

    public static boolean c(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beadfb21", new Object[]{uri})).booleanValue();
        }
        if (uri != null && uri.isHierarchical()) {
            return TextUtils.equals("true", uri.getQueryParameter("isThemis"));
        }
        return false;
    }

    public static boolean a(String str) {
        Uri b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
        } catch (Exception e) {
            TMSLogger.b("TMSUrlUtils", "isAboutPage error", e);
        }
        if (TextUtils.isEmpty(str) || (b = com.taobao.themis.utils.o.b(str)) == null) {
            return false;
        }
        return n.e().contains(b.buildUpon().clearQuery().build().toString());
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(a()) || TextUtils.equals(a(), com.taobao.themis.utils.o.c(str));
    }

    public static Uri a(ITMSPage iTMSPage, com.taobao.themis.kernel.f fVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("d2307f45", new Object[]{iTMSPage, fVar, str, jSONObject});
        }
        String str2 = "";
        Uri.Builder path = com.taobao.themis.utils.o.b(fVar.g()).buildUpon().authority("m.duanqu.com").path(str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(com.taobao.themis.kernel.i.APP_ID, (Object) fVar.h());
        jSONObject2.put("_ariver_ua", (Object) k.j(fVar));
        if (!TextUtils.isEmpty(str)) {
            jSONObject2.put("page", (Object) str);
        }
        Uri build = path.build();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str3 : build.getQueryParameterNames()) {
            if ("spm".equalsIgnoreCase(str3)) {
                linkedHashMap.put(str3, "a21bpk.21128592.0.0");
            } else {
                linkedHashMap.put(str3, build.getQueryParameter(str3));
            }
        }
        for (String str4 : jSONObject2.keySet()) {
            linkedHashMap.put(str4, jSONObject2.getString(str4));
        }
        if (jSONObject != null) {
            for (String str5 : jSONObject.keySet()) {
                linkedHashMap.put(str5, jSONObject.getString(str5));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            sb.append(Uri.encode((String) entry.getKey()));
            sb.append("=");
            sb.append(Uri.encode((String) entry.getValue()));
            sb.append("&");
        }
        Uri.Builder buildUpon = build.buildUpon();
        if (sb.length() > 0) {
            str2 = sb.substring(0, sb.length() - 1);
        }
        return buildUpon.encodedQuery(str2).build();
    }

    public static boolean d(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4533b5c0", new Object[]{uri})).booleanValue() : "true".equals(uri.getQueryParameter(KEY_CLEAR_CACHE));
    }

    public static boolean e(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cbb9705f", new Object[]{uri})).booleanValue() : uri != null && uri.isHierarchical() && TextUtils.equals(uri.getQueryParameter(com.taobao.themis.kernel.i.KEY_AFC_LINK), "1");
    }

    public static Uri f(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("4ecfc031", new Object[]{uri}) : (uri == null || !uri.isHierarchical()) ? uri : uri.buildUpon().appendQueryParameter(com.taobao.themis.kernel.i.KEY_AFC_LINK, "1").build();
    }

    public static boolean a(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bd717ceb", new Object[]{context, uri})).booleanValue();
        }
        Intent intent = new Intent();
        intent.setData(uri);
        intent.setPackage(context.getPackageName());
        intent.setAction("android.intent.action.VIEW");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null) {
            TMSLogger.a("isNav2H5", "isNav2H5 : false");
            return false;
        } else if ("com.taobao.browser.BrowserActivity".contains(resolveActivity.activityInfo.name)) {
            TMSLogger.a("isNav2H5", "isNav2H5 : true");
            return true;
        } else {
            TMSLogger.a("isNav2H5", "isNav2H5 : false");
            return false;
        }
    }
}
