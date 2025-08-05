package com.taobao.runtimepermission.privacy;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.aliprivacyext.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightvane.jsbridge.d;
import com.taobao.android.lightvane.jsbridge.i;
import com.taobao.tao.welcome.ViewModeWVApi;
import tb.lst;
import tb.mty;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f19002a = false;

    public static /* synthetic */ i a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("ea46c56d", new Object[]{str}) : b(str);
    }

    /* renamed from: com.taobao.runtimepermission.privacy.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0754a implements ViewModeWVApi.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private C0754a() {
        }

        @Override // com.taobao.tao.welcome.ViewModeWVApi.a
        public boolean a(String str, d dVar) {
            String b;
            String b2;
            String b3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("68fe2382", new Object[]{this, str, dVar})).booleanValue();
            }
            com.taobao.android.lightvane.webview.a a2 = dVar.a();
            if (a2 == null) {
                dVar.b(a.a("webview of context is null"));
                return false;
            }
            Context context = a2.getView().getContext();
            if (!(context instanceof Activity)) {
                dVar.b(a.a("the container should be Android Activity"));
                return false;
            }
            JSONArray parseArray = JSON.parseArray(str);
            if (parseArray == null || parseArray.isEmpty()) {
                dVar.b(a.a("param invalid"));
                return false;
            }
            i iVar = new i();
            if (parseArray.contains("recommend") && (b3 = c.b(context, "recommend")) != null) {
                iVar.a("recommend", b3);
            }
            if (parseArray.contains("innerAd") && (b2 = c.b(context, "innerAd")) != null) {
                iVar.a("innerAd", b2);
            }
            if (parseArray.contains("outerAd") && (b = c.b(context, "outerAd")) != null) {
                iVar.a("outerAd", b);
            }
            dVar.a(iVar);
            return true;
        }
    }

    /* loaded from: classes7.dex */
    public static final class b implements ViewModeWVApi.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private b() {
        }

        @Override // com.taobao.tao.welcome.ViewModeWVApi.a
        public boolean a(String str, d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("68fe2382", new Object[]{this, str, dVar})).booleanValue();
            }
            com.taobao.android.lightvane.webview.a a2 = dVar.a();
            if (a2 == null) {
                dVar.b(a.a("webview of context is null"));
                return false;
            }
            Context context = a2.getView().getContext();
            if (!(context instanceof Activity)) {
                dVar.b(a.a("the container should be Android Activity"));
                return false;
            }
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject == null || parseObject.isEmpty()) {
                dVar.b(a.a("param invalid"));
                return false;
            }
            i iVar = new i();
            String str2 = "false";
            if (parseObject.containsKey("recommend")) {
                iVar.a("recommend", c.a(context, "recommend", "true".equalsIgnoreCase(parseObject.getString("recommend")) ? "true" : str2) ? "true" : str2);
            }
            if (parseObject.containsKey("innerAd")) {
                iVar.a("innerAd", c.a(context, "innerAd", "true".equalsIgnoreCase(parseObject.getString("innerAd")) ? "true" : str2) ? "true" : str2);
            }
            if (parseObject.containsKey("outerAd")) {
                if (c.a(context, "outerAd", "true".equalsIgnoreCase(parseObject.getString("outerAd")) ? "true" : str2)) {
                    str2 = "true";
                }
                iVar.a("outerAd", str2);
            }
            dVar.a(iVar);
            return true;
        }
    }

    private static i b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("ddd649ae", new Object[]{str});
        }
        i iVar = new i();
        iVar.a("msg", str);
        return iVar;
    }

    private static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    private static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        mty mtyVar = new mty();
        mtyVar.g = RVEnvironmentService.PLATFORM_TB;
        mtyVar.h = b(context);
        lst.INSTANCE.a(context, mtyVar);
        ViewModeWVApi.registerActionListener("readPrivacyKey", new C0754a());
        ViewModeWVApi.registerActionListener("writePrivacyKey", new b());
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (f19002a) {
        } else {
            synchronized (a.class) {
                if (!f19002a) {
                    c(context);
                    f19002a = true;
                }
            }
        }
    }
}
