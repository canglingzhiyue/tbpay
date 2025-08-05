package com.taobao.android.detail.core.utils;

import android.app.Activity;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import java.util.HashMap;
import java.util.Map;
import tb.dya;
import tb.emu;
import tb.eps;
import tb.kge;
import tb.oqd;

/* loaded from: classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f9938a;

    static {
        kge.a(-523018864);
        f9938a = new HashMap();
        emu.a("com.taobao.android.detail.core.utils.DetailStageTrackUtils");
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            if (f9938a.containsKey(str)) {
                return;
            }
            f9938a.put(str, String.valueOf(SystemClock.uptimeMillis()));
        } catch (Exception unused) {
        }
    }

    public static void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{activity});
            return;
        }
        try {
            eps.a(activity, (String) null, f9938a);
            f9938a.clear();
        } catch (Exception unused) {
        }
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
            return;
        }
        try {
            f9938a.put("nav_start", String.valueOf(j));
        } catch (Exception unused) {
        }
    }

    private static boolean a(Activity activity) {
        dya y;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{activity})).booleanValue() : (activity instanceof DetailCoreActivity) && (y = ((DetailCoreActivity) activity).y()) != null && y.c();
    }

    public static void a(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb084a", new Object[]{activity, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("containerInit", String.valueOf(j));
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void b(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8c0fa9", new Object[]{activity, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("setContentView", String.valueOf(j));
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void a(Activity activity, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828f64a", new Object[]{activity, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aura_visible", String.valueOf(j));
        hashMap.put("mtopCallbackToAuraVisible", String.valueOf(j2));
        hashMap.put("callbackToAuraVisible", String.valueOf(j3));
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void b(Activity activity, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d5a1e9", new Object[]{activity, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aura_preload_visible", String.valueOf(j));
        hashMap.put("mtopCallbackToAuraPreloadVisible", String.valueOf(j2));
        hashMap.put("callbackToAuraPreloadVisible", String.valueOf(j3));
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void c(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5d1708", new Object[]{activity, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aura_visibleIntervals", String.valueOf(j));
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void c(Activity activity, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4640bc", new Object[]{activity, new Long(j), new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("visible", String.valueOf(j));
        hashMap.put("mtopCallbackToVisible", String.valueOf(j2));
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void d(Activity activity, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896253d", new Object[]{activity, new Long(j), new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("preload_visible", String.valueOf(j));
        hashMap.put("mtopCallbackToPreloadVisible", String.valueOf(j2));
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void d(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2e1e67", new Object[]{activity, new Long(j)});
        } else if (!a(activity)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("detailRefreshLayout", String.valueOf(j));
            eps.a(activity, (String) null, (Map<String, String>) hashMap);
        }
    }

    public static void e(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dff25c6", new Object[]{activity, new Long(j)});
        } else if (!a(activity)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("detailRefresh", String.valueOf(j));
            eps.a(activity, (String) null, (Map<String, String>) hashMap);
        }
    }

    public static void f(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed02d25", new Object[]{activity, new Long(j)});
        } else if (!a(activity)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("HandleSuccessCallback", String.valueOf(j));
            eps.a(activity, (String) null, (Map<String, String>) hashMap);
        }
    }

    public static void g(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa13484", new Object[]{activity, new Long(j)});
        } else if (!a(activity)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("internalDoInBackground", String.valueOf(j));
            eps.a(activity, (String) null, (Map<String, String>) hashMap);
        }
    }

    public static void e(Activity activity, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e609be", new Object[]{activity, new Long(j), new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("startDataRequest", String.valueOf(j));
        hashMap.put(oqd.MTOP_STAGE_NETWORKREQUEST, String.valueOf(j2));
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void h(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60723be3", new Object[]{activity, new Long(j)});
        } else if (!a(activity)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("detailDataProcess", String.valueOf(j));
            eps.a(activity, (String) null, (Map<String, String>) hashMap);
        }
    }

    public static void i(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51434342", new Object[]{activity, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cache_aura_visible", String.valueOf(j));
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void f(Activity activity, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b35ee3f", new Object[]{activity, new Long(j), new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("detailNav", String.valueOf(j));
        hashMap.put("detailNavNavigator", String.valueOf(j2));
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void j(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42144aa1", new Object[]{activity, new Long(j)});
        } else if (!a(activity)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("videoPlayerInit", String.valueOf(j));
            eps.a(activity, (String) null, (Map<String, String>) hashMap);
        }
    }

    public static void g(Activity activity, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8485d2c0", new Object[]{activity, new Long(j), new Long(j2)});
        } else if (!a(activity)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("mainExParamsBuild", String.valueOf(j));
            hashMap.put("mtopRequestStart", String.valueOf(j2));
            eps.a(activity, (String) null, (Map<String, String>) hashMap);
        }
    }

    public static void k(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e55200", new Object[]{activity, new Long(j)});
        } else if (!a(activity)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("mtopRequestStart", String.valueOf(j));
            eps.a(activity, (String) null, (Map<String, String>) hashMap);
        }
    }

    public static void a(Activity activity, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca6b3ca", new Object[]{activity, new Long(j), new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(z ? "preloadPlayVideo" : "defaultPlayVideo", String.valueOf(j));
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void a(Activity activity, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5944a8b", new Object[]{activity, map});
        } else if (!a(activity) || map == null || map.isEmpty()) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            eps.a(activity, (String) null, (Map<String, String>) hashMap);
        }
    }

    public static void a(DetailCoreActivity detailCoreActivity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee6c231", new Object[]{detailCoreActivity, new Long(j)});
        } else if (detailCoreActivity == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("isGalleryV3", String.valueOf(detailCoreActivity.K_()));
            hashMap.put("picGalleryRender", String.valueOf(j));
            eps.a((Activity) detailCoreActivity, (String) null, (Map<String, String>) hashMap);
        }
    }

    public static void l(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23b6595f", new Object[]{activity, new Long(j)});
        } else if (!a(activity)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("refreshAuraPage", String.valueOf(j));
            eps.a(activity, (String) null, (Map<String, String>) hashMap);
        }
    }

    public static void a(DetailCoreActivity detailCoreActivity, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df1fab3", new Object[]{detailCoreActivity, new Long(j), new Long(j2)});
        } else if (!a(detailCoreActivity)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("mainPage", String.valueOf(j));
            hashMap.put("bottomBar", String.valueOf(j2));
            eps.a((Activity) detailCoreActivity, (String) null, (Map<String, String>) hashMap);
        }
    }

    public static void m(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148760be", new Object[]{activity, new Long(j)});
        } else if (!a(activity)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("sideTabView", String.valueOf(j));
            eps.a(activity, (String) null, (Map<String, String>) hashMap);
        }
    }

    public static void b(Activity activity, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f6984b", new Object[]{activity, new Long(j), new Boolean(z)});
        } else if (!a(activity)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("isV3ActionBar", String.valueOf(z));
            hashMap.put("actionBar", String.valueOf(j));
            eps.a(activity, (String) null, (Map<String, String>) hashMap);
        }
    }

    public static void n(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("558681d", new Object[]{activity, new Long(j)});
        } else if (!a(activity)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("descSetData", String.valueOf(j));
            eps.a(activity, (String) null, (Map<String, String>) hashMap);
        }
    }

    public static void o(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6296f7c", new Object[]{activity, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("nativeDescLoad", String.valueOf(j));
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void p(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6fa76db", new Object[]{activity, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("nativeDescFirstView", String.valueOf(j));
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void q(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7cb7e3a", new Object[]{activity, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("h5DescLoadUrl", String.valueOf(j));
        eps.a(activity, (String) null, (Map<String, String>) hashMap);
    }

    public static void r(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c89c8599", new Object[]{activity, new Long(j)});
        } else if (!a(activity)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("mtopOnSuccess", String.valueOf(j));
            eps.a(activity, (String) null, (Map<String, String>) hashMap);
        }
    }

    public static void s(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b96d8cf8", new Object[]{activity, new Long(j)});
        } else if (!a(activity)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("threadSwitch", String.valueOf(j));
            eps.a(activity, (String) null, (Map<String, String>) hashMap);
        }
    }
}
