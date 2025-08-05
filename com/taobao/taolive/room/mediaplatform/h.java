package com.taobao.taolive.room.mediaplatform;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.controller2.g;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.sdk.utils.y;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.pmd;
import tb.poz;

/* loaded from: classes8.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_VERSION = "6.0";
    public static final String SDK_VERSION = "1";

    static {
        kge.a(-982572410);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : "6.0";
    }

    public static JSONObject a(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f1005cd3", new Object[]{context, aVar});
        }
        if (context == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            float e = e(context);
            jSONObject.put("apiVersion", a());
            jSONObject.put("appVersion", a(context));
            jSONObject.put("sdkVersion", "1");
            jSONObject.put("platform", c(context));
            jSONObject.put("scale", e);
            jSONObject.put("apScale", h(context));
            jSONObject.put("safeAreaInsetTop", com.taobao.taolive.room.utils.d.a(context));
            jSONObject.put("safeAreaInsetBottom", com.taobao.taolive.room.utils.d.g(context));
            jSONObject.put(com.taobao.android.detail2.core.framework.data.model.d.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, f(context) / e);
            jSONObject.put("screenHeight", g(context) / e);
            jSONObject.put(aw.PARAM_SCREEN_ORIENTATION, d(context));
            jSONObject.put("isPad", y.b(context));
            jSONObject.put("isFoldableScreen", y.i(context));
            jSONObject.put("bottomRightPocketWidth", y.f(context) / e);
            jSONObject.put("padMaxHeight", y.g(context) / e);
            jSONObject.put("isLandscape", y.d(context));
            jSONObject.put("isDisplayCutout", poz.v(((g) aVar).y()));
            jSONObject.put("cutoutHeight", poz.x(((g) aVar).y()));
            jSONObject.put("realCutoutHeight", poz.y(((g) aVar).y()));
            if (aVar != null) {
                jSONObject.put("landscapeContext", aVar.b);
            }
            jSONObject.put("appKey", b());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (context == null) {
            return "1.0";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "1.0";
        }
    }

    public static String b(Context context) {
        Resources resources;
        int identifier;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (context != null && (resources = context.getResources()) != null && (identifier = resources.getIdentifier("build_id", "string", context.getPackageName())) > 0) {
            try {
                return resources.getString(identifier);
            } catch (Exception unused) {
            }
        }
        return "unknown";
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : pmd.a().u() != null ? pmd.a().u().b() : "";
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context}) : pmd.a().u() != null ? pmd.a().u().a(context) : "unknow";
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1c344f03", new Object[]{context}) : (context == null || !(context instanceof Activity) || ((Activity) context).getRequestedOrientation() != 0) ? "portrait" : "landscape";
    }

    public static float e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0d012cc", new Object[]{context})).floatValue();
        }
        if (context == null) {
            return 1.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static float h(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a2d615a9", new Object[]{context})).floatValue() : f(context) / 375.0f;
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a17cbe6e", new Object[]{context})).intValue();
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return "landscape".equals(d(context)) ? displayMetrics.widthPixels > displayMetrics.heightPixels ? displayMetrics.widthPixels : displayMetrics.heightPixels : displayMetrics.widthPixels < displayMetrics.heightPixels ? displayMetrics.widthPixels : displayMetrics.heightPixels;
    }

    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2296a0d", new Object[]{context})).intValue();
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return "landscape".equals(d(context)) ? displayMetrics.heightPixels < displayMetrics.widthPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels : displayMetrics.heightPixels > displayMetrics.widthPixels ? displayMetrics.heightPixels : displayMetrics.widthPixels;
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        if (v.f(str) || v.f(str2)) {
        }
        return false;
    }
}
