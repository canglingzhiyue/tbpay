package com.taobao.pha.core;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.pha.core.controller.AppController;
import com.taobao.weex.common.WXConfig;
import tb.kge;
import tb.ngn;

/* loaded from: classes7.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ANDROID = "Android";
    public static final String appGroup = "appGroup";
    public static final String appName = "appName";
    public static final String appVersion = "appVersion";
    public static final String externalUserAgent = "externalUserAgent";
    public static final String os = "os";
    public static final String phaVersion = "phaVersion";
    public static final String sysModel = "sysModel";
    public static final String sysVersion = "sysVersion";

    static {
        kge.a(867962945);
    }

    public static JSONObject a(AppController appController) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9b82aa96", new Object[]{appController});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("platform", (Object) "Android");
        jSONObject.put("osName", (Object) "Android");
        jSONObject.put("osVersion", (Object) a());
        jSONObject.put(phaVersion, (Object) "");
        jSONObject.put("appName", (Object) b());
        jSONObject.put("appVersion", (Object) ngn.f());
        jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) Build.MODEL);
        DisplayMetrics c = c();
        if (c != null) {
            jSONObject.put(WXConfig.deviceWidth, (Object) Integer.valueOf(c.widthPixels));
            jSONObject.put(WXConfig.deviceHeight, (Object) Integer.valueOf(c.heightPixels));
            jSONObject.put("scale", (Object) Float.valueOf(c.density));
        }
        if (appController != null) {
            jSONObject.putAll(appController.A());
            i = appController.R();
            i G = appController.G();
            if (G != null) {
                jSONObject.put("miniappAppInfo", (Object) G.a());
            }
        }
        jSONObject.put("__enable_new_js_api__", (Object) true);
        jSONObject.put("safeAreaInsetTop", (Object) Integer.valueOf(i));
        jSONObject.put("safeAreaInsetBottom", (Object) 0);
        jSONObject.put("safeAreaInsetLeft", (Object) 0);
        jSONObject.put("safeAreaInsetRight", (Object) 0);
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r1.equals("P") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String a() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.pha.core.o.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "aff6e538"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L12:
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            if (r0 == 0) goto L49
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r0.toUpperCase(r1)
            r3 = -1
            int r4 = r1.hashCode()
            r5 = 80
            r6 = 1
            if (r4 == r5) goto L35
            r2 = 81
            if (r4 == r2) goto L2b
            goto L3e
        L2b:
            java.lang.String r2 = "Q"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3e
            r2 = 1
            goto L3f
        L35:
            java.lang.String r4 = "P"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L3e
            goto L3f
        L3e:
            r2 = -1
        L3f:
            if (r2 == 0) goto L47
            if (r2 == r6) goto L44
            goto L49
        L44:
            java.lang.String r0 = "10.0.0"
            goto L49
        L47:
            java.lang.String r0 = "9.0.0"
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.pha.core.o.a():java.lang.String");
    }

    private static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        Context e = p.e();
        return e != null ? e.getPackageName() : "";
    }

    private static DisplayMetrics c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DisplayMetrics) ipChange.ipc$dispatch("4f86658d", new Object[0]);
        }
        Context e = p.e();
        if (e != null && e.getResources() != null) {
            return e.getResources().getDisplayMetrics();
        }
        return null;
    }
}
