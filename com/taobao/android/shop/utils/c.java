package com.taobao.android.shop.utils;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.performance.UmbrellaProcessTracker;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.FeatureStatistics;
import com.taobao.search.common.util.i;
import com.taobao.weex.WXEnvironment;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.bpp;
import tb.ept;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final UMLinkLogInterface h;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private Map<String, String> g = new HashMap();
    private long i = 0;
    private Map<String, Long> j = new ConcurrentHashMap();
    private Long k = 0L;
    private Long l = 0L;

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            UmbrellaProcessTracker.register("Shop");
        }
    }

    static {
        kge.a(-1650869953);
        h = bpp.a();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.b = str;
        if (StringUtils.isEmpty(str)) {
            return;
        }
        UmbrellaProcessTracker.addArgs("Shop", "mParamForLog", str);
        this.g.put("mParamForLog", str);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        this.c = str;
        if (StringUtils.isEmpty(str)) {
            return;
        }
        UmbrellaProcessTracker.addArgs("Shop", "mBundleUrl", str);
        this.g.put("mBundleUrl", str);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        this.d = str;
        if (StringUtils.isEmpty(str)) {
            return;
        }
        UmbrellaProcessTracker.addArgs("Shop", "mShopNaviForLog", str);
        this.g.put("mShopNaviForLog", str);
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        this.e = str;
        if (StringUtils.isEmpty(str)) {
            return;
        }
        UmbrellaProcessTracker.addArgs("Shop", "mParamUUIDForLog", str);
        this.g.put("mParamUUIDForLog", str);
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        this.f = str;
        if (StringUtils.isEmpty(str)) {
            return;
        }
        UmbrellaProcessTracker.addArgs("Shop", "shopId", str);
        this.g.put("shopId", str);
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.i;
    }

    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if ("router".equals(str)) {
            UmbrellaProcessTracker.addProcess("Shop", com.alibaba.android.umbrella.performance.d.INIT, j);
            UmbrellaProcessTracker.addSubProcess("Shop", com.alibaba.android.umbrella.performance.d.INIT, "router", j);
        } else if ("activityOnCreate".equals(str)) {
            UmbrellaProcessTracker.addProcess("Shop", com.alibaba.android.umbrella.performance.d.LIFECYCLE, j);
            UmbrellaProcessTracker.addSubProcess("Shop", com.alibaba.android.umbrella.performance.d.LIFECYCLE, i.b.MEASURE_ONCREATE, j);
        } else if ("activityOnResume".equals(str)) {
            UmbrellaProcessTracker.addSubProcess("Shop", com.alibaba.android.umbrella.performance.d.LIFECYCLE, "onResume", j);
        } else if (FeatureStatistics.FeatureNames.DATA_PREFETCH.equals(str)) {
            UmbrellaProcessTracker.addProcess("Shop", com.alibaba.android.umbrella.performance.d.DATAPARSE, j);
            UmbrellaProcessTracker.addSubProcess("Shop", com.alibaba.android.umbrella.performance.d.DATAPARSE, FeatureStatistics.FeatureNames.DATA_PREFETCH, j);
        } else if ("frameJSLoad".equals(str)) {
            UmbrellaProcessTracker.addSubProcess("Shop", com.alibaba.android.umbrella.performance.d.NETWORK, "frameJSLoad", j);
        } else if ("innerJSLoad".equals(str)) {
            UmbrellaProcessTracker.addSubProcess("Shop", com.alibaba.android.umbrella.performance.d.NETWORK, "innerJSLoad", j);
        } else if ("render".equals(str)) {
            UmbrellaProcessTracker.addProcess("Shop", com.alibaba.android.umbrella.performance.d.DRAWVIEW, j);
        } else if ("frameJSRender".equals(str)) {
            UmbrellaProcessTracker.addSubProcess("Shop", com.alibaba.android.umbrella.performance.d.SUB_CREATE_VIEW, "frameJSRender", j);
        } else if ("innerJSRender".equals(str)) {
            UmbrellaProcessTracker.addSubProcess("Shop", com.alibaba.android.umbrella.performance.d.SUB_CREATE_VIEW, "innerJSRender", j);
        } else if ("preVistCdn-downgrade".equals(str)) {
            UmbrellaProcessTracker.addOtherProcess("Shop", "preVistCdn-downgrade", j);
        } else if ("preVistCdn-pagedata".equals(str)) {
            UmbrellaProcessTracker.addOtherProcess("Shop", "preVistCdn-pagedata", j);
        } else if ("preloadFetchImage".equals(str)) {
            UmbrellaProcessTracker.addOtherProcess("Shop", "preloadFetchImage", j);
        } else if ("preloadPagedataImage".equals(str)) {
            UmbrellaProcessTracker.addOtherProcess("Shop", "preloadPagedataImage", j);
        } else if (ept.PAGELOAD.equals(str)) {
            UmbrellaProcessTracker.addProcess("Shop", com.alibaba.android.umbrella.performance.d.PAGELOAD, j);
            UmbrellaProcessTracker.commit("Shop");
        }
        this.i += System.currentTimeMillis() - currentTimeMillis;
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis();
        this.j.put(str, Long.valueOf(currentTimeMillis2));
        if (("frameJSRender".equals(str) || "innerJSRender".equals(str)) && 0 == this.k.longValue()) {
            this.k = Long.valueOf(currentTimeMillis2);
        }
        this.i += System.currentTimeMillis() - currentTimeMillis;
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else if (this.j.get(str) == null) {
            String str2 = "main-cost not pair metric finded. " + str;
            a("-67001", "not pair metric finded.", "pageRender", str);
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            long currentTimeMillis2 = System.currentTimeMillis();
            a(str, currentTimeMillis2 - this.j.get(str).longValue());
            if ("frameJSRender".equals(str) || "innerJSRender".equals(str)) {
                if (0 != this.l.longValue() && 0 != this.k.longValue()) {
                    a("render", currentTimeMillis2 - this.k.longValue());
                } else {
                    this.l = Long.valueOf(currentTimeMillis2);
                }
            }
            this.i += System.currentTimeMillis() - currentTimeMillis;
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            h.logInfo("page_shop", "", "pageRender", null, null, com.alibaba.android.umbrella.link.export.a.a(str, str2));
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            a(str, "1.0", str2);
        }
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            h.commitSuccess(str3, str, str2, "page_shop", "", this.g);
        }
    }

    public void a(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("281d92b", new Object[]{this, str, str2, str3, objArr});
        } else {
            a("", "", str3, str, str2, null, this.g, objArr);
        }
    }

    public void a(String str, String str2, String str3, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70cbf362", new Object[]{this, str, str2, str3, th, objArr});
        } else {
            a("", "", str3, str, str2, th, this.g, objArr);
        }
    }

    public void a(String str, String str2, String str3, String str4, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("928f6ca1", new Object[]{this, str, str2, str3, str4, objArr});
        } else {
            a(str, str2, str3, "1.0", str4, null, this.g, objArr);
        }
    }

    private static void a(String str, String str2, String str3, String str4, String str5, Throwable th, Map<String, String> map, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c716ea7", new Object[]{str, str2, str3, str4, str5, th, map, objArr});
            return;
        }
        HashMap hashMap = new HashMap();
        if (objArr != null) {
            StringBuilder sb = new StringBuilder();
            if (objArr != null) {
                for (Object obj : objArr) {
                    sb.append(obj);
                    sb.append(" | ");
                    if (WXEnvironment.isApkDebugable()) {
                        sb.append("\n");
                    }
                }
            }
            hashMap.put("extra", sb.toString());
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        if (th != null) {
            hashMap.put("throwable", a.a(th));
        }
        h.commitFailure(str5, str3, str4, "page_shop", "", hashMap, str, str2);
    }

    public static void b(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b832aca", new Object[]{str, str2, str3, objArr});
        } else {
            a("", "", str3, str, str2, null, null, objArr);
        }
    }

    public static void b(String str, String str2, String str3, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f862b23", new Object[]{str, str2, str3, th, objArr});
        } else {
            a("", "", str3, str, str2, th, null, objArr);
        }
    }

    public static Map<String, Object> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        HashMap hashMap = new HashMap();
        if (map != null && map.keySet() != null) {
            for (String str : map.keySet()) {
                hashMap.put(str, map.get(str));
            }
        }
        return hashMap;
    }
}
