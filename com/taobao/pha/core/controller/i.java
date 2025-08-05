package com.taobao.pha.core.controller;

import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.PHAContainerType;
import com.taobao.pha.core.controller.FeatureStatistics;
import com.taobao.pha.core.e;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.manifest.ManifestProperty;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.p;
import com.taobao.weex.common.Constants;
import com.taobao.weex.common.WXPerformance;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ecg;
import tb.kge;
import tb.mto;
import tb.nfc;
import tb.ngn;
import tb.ngr;

/* loaded from: classes7.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MONITOR_RESULT_CODE_FINISH = 3;
    public static final int MONITOR_RESULT_CODE_SUCCESS = 1;
    public static final int MONITOR_RESULT_CODE_TIMEOUT = 2;
    public static final int MONITOR_STAGE_CONTAINER_START = 15;
    public static final int MONITOR_STAGE_ENTRY = 0;
    public static final int MONITOR_STAGE_HEADER_PAGE_CREATE = 20;
    public static final int MONITOR_STAGE_HEADER_VIEW_START = 19;
    public static final int MONITOR_STAGE_MANIFEST_LOAD_END = 3;
    public static final int MONITOR_STAGE_MANIFEST_LOAD_START = 2;
    public static final int MONITOR_STAGE_MANIFEST_PARSE_END = 5;
    public static final int MONITOR_STAGE_MANIFEST_PARSE_START = 4;
    public static final int MONITOR_STAGE_NAV_START = 1;
    public static final int MONITOR_STAGE_PAGE_CREATE = 12;
    public static final int MONITOR_STAGE_PAGE_LOAD_REQUEST = 13;
    public static final int MONITOR_STAGE_PAGE_RENDER_FINISHED = 14;
    public static final int MONITOR_STAGE_SPLASH_VIEW_END = 18;
    public static final int MONITOR_STAGE_SPLASH_VIEW_START = 17;
    public static final int MONITOR_STAGE_TABBAR_PAGE_CREATE = 22;
    public static final int MONITOR_STAGE_TABBAR_VIEW_START = 21;
    public static final int MONITOR_STAGE_UC_PREPARE_END = 24;
    public static final int MONITOR_STAGE_UC_PREPARE_START = 23;
    public static final int MONITOR_STAGE_VIEW_START = 16;
    public static final int MONITOR_STAGE_WORKER_CREATE_END = 7;
    public static final int MONITOR_STAGE_WORKER_CREATE_START = 6;
    public static final int MONITOR_STAGE_WORKER_DOWNLOAD_END = 9;
    public static final int MONITOR_STAGE_WORKER_DOWNLOAD_START = 8;
    public static final int MONITOR_STAGE_WORKER_EVALUATE_END = 11;
    public static final int MONITOR_STAGE_WORKER_EVALUATE_START = 10;
    private static final String i;
    private static boolean j;
    public boolean b;
    public boolean c;
    public boolean h;
    private final AppController k;
    private boolean q;
    private boolean r;
    private String s;
    private String t;
    private long u;
    private long v;
    private long w;
    private int l = 0;
    private int m = 0;
    private String n = "";
    private String o = "";
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public Map<String, Long> g = new ConcurrentHashMap();
    private Fragment x = null;
    private boolean y = true;
    private String z = null;
    private final JSONObject p = new JSONObject(new ConcurrentHashMap());

    /* renamed from: a  reason: collision with root package name */
    public final long f18721a = System.currentTimeMillis();

    static {
        kge.a(-1556905030);
        i = i.class.getSimpleName();
        j = true;
    }

    public i(AppController appController) {
        this.k = appController;
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        d D = this.k.D();
        if (D == null) {
            return;
        }
        long navStartTime = D.getNavStartTime();
        if (navStartTime == 0) {
            return;
        }
        a(1, navStartTime);
        this.v = System.currentTimeMillis() - (SystemClock.uptimeMillis() - navStartTime);
        this.p.put(nfc.PHA_MONITOR_MEASURE_PAGE_NAVIGATION_START_UTC, (Object) Long.valueOf(this.v));
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.q;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this}) : this.p;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.y = z;
        }
    }

    public void a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f0514a", new Object[]{this, fragment});
        } else if (this.x != null) {
        } else {
            this.x = fragment;
            if (!this.f) {
                return;
            }
            h();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ManifestModel u = this.k.u();
        if (u == null) {
            return;
        }
        this.e = u.offlineResources != null && u.offlineResources.size() > 0;
        Iterator<PageModel> it = u.pages.iterator();
        while (it.hasNext()) {
            PageModel next = it.next();
            if (!this.d) {
                this.d = next.html != null;
            }
        }
        ManifestProperty z = this.k.z();
        if (z == null) {
            ngr.b(i, "ManifestProperty is null.");
            return;
        }
        this.k.h().b(FeatureStatistics.FeatureNames.MANIFEST_CACHE);
        this.k.h().a(FeatureStatistics.FeatureNames.MANIFEST_CACHE, "sourceType", Integer.valueOf(z.g));
        this.k.h().a(FeatureStatistics.FeatureNames.MANIFEST_CACHE, WXPerformance.CACHE_TYPE, Integer.valueOf(z.i));
        this.l = z.i;
        this.m = z.g;
        this.n = z.e;
        this.o = z.f;
        this.p.put("template", (Object) Integer.valueOf(this.d ? 1 : 0));
        this.p.put("offlineResource", (Object) Integer.valueOf(this.e ? 1 : 0));
        this.p.put(nfc.PHA_MONITOR_MEASURE_MANIFEST_CACHE_TYPE, (Object) Integer.valueOf(this.l));
        this.p.put(nfc.PHA_MONITOR_MEASURE_MANIFEST_SOURCE_TYPE, (Object) Integer.valueOf(z.g));
        JSONObject jSONObject = this.p;
        if (this.k.p() == PHAContainerType.MINIAPP) {
            i2 = 1;
        }
        jSONObject.put("containerType", (Object) Integer.valueOf(i2));
        if (z.f18743a > 0) {
            a(2, z.f18743a);
        }
        if (z.b > 0) {
            a(3, z.b);
        }
        if (z.c > 0) {
            a(4, z.c);
        }
        if (z.d <= 0) {
            return;
        }
        a(5, z.d);
    }

    public long a(long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c11cadc", new Object[]{this, new Long(j2), new Long(j3)})).longValue();
        }
        if (j2 != 0 && !this.p.containsKey(nfc.PHA_MONITOR_MEASURE_FIRST_NAV_START)) {
            this.p.put(nfc.PHA_MONITOR_MEASURE_FIRST_NAV_START, (Object) Long.valueOf(j2));
        }
        if (j3 != 0 && !this.p.containsKey(nfc.PHA_MONITOR_MEASURE_FSP)) {
            this.p.put(nfc.PHA_MONITOR_MEASURE_FSP, (Object) Long.valueOf(j3));
            this.q = true;
        }
        a(1);
        g();
        return this.v;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.f = true;
        if (this.x == null) {
            return;
        }
        h();
    }

    private void g() {
        int i2;
        int i3;
        int i4;
        long j2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.y && !this.c) {
            this.c = true;
            int i5 = -1;
            if (this.k.J() != null) {
                i5 = this.k.J().c;
            }
            this.p.put(nfc.PHA_MONITOR_MEASURE_WORKER_JS_GET_TYPE, (Object) Integer.valueOf(i5));
            com.taobao.pha.core.phacontainer.a q = this.k.q();
            if (q != null) {
                i3 = q.c;
                i4 = q.f18772a;
                i2 = q.b;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            this.p.put(nfc.PHA_MONITOR_DATA_PREFETCH_COUNT, (Object) Integer.valueOf(i3));
            this.p.put(nfc.PHA_MONITOR_DATA_PREFETCH_SUCCESS_COUNT, (Object) Integer.valueOf(i4));
            this.p.put(nfc.PHA_MONITOR_DATA_PREFETCH_FAIL_COUNT, (Object) Integer.valueOf(i2));
            this.p.put(nfc.PHA_MONITOR_IS_COLD_START, (Object) Boolean.valueOf(j));
            j = false;
            nfc s = p.b().s();
            if (s == null) {
                return;
            }
            for (Map.Entry<String, Object> entry : this.k.h().a().entrySet()) {
                s.a(entry.getKey(), entry.getValue(), this.x);
            }
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(this.n)) {
                hashMap.put("errorCode", this.n);
            }
            if (!TextUtils.isEmpty(this.o)) {
                hashMap.put("errorMsg", this.o);
            }
            ManifestModel u = this.k.u();
            String str = "0";
            if (u != null && u.pages != null) {
                hashMap.put(nfc.PHA_MONITOR_DIMENSION_IS_SINGLE_PAGE, u.pages.size() == 1 ? "1" : str);
            }
            hashMap.put(nfc.PHA_MONITOR_DIMENSION_DOWNGRADED, this.k.s() ? "1" : str);
            hashMap.put("values", this.p.toJSONString());
            hashMap.put(nfc.PHA_MONITOR_DIMENSION_MANIFEST_URL, this.k.t().toString());
            hashMap.put(nfc.PHA_MONITOR_DIMENSION_IS_HIT, this.r ? "1" : str);
            hashMap.put(nfc.PHA_MONITOR_DIMENSION_IS_MANIFEST, "1");
            hashMap.put("isFragment", this.h ? "1" : str);
            if (this.k.e() == null) {
                z = false;
            }
            if (z) {
                str = "1";
            }
            hashMap.put(nfc.PHA_MONITOR_DIMENSION_IS_FROM_WINDVANE, str);
            if (z && !TextUtils.isEmpty(this.z)) {
                hashMap.put(nfc.PHA_MONITOR_DIMENSION_WINDVANE_PATH_STAGE, this.z);
            }
            if (this.k.p() != null) {
                hashMap.put("appType", this.k.p().name());
            }
            hashMap.put(nfc.PHA_MONITOR_DIMENSION_PRELOAD_URL, TextUtils.isEmpty(this.s) ? "" : this.s);
            hashMap.put(nfc.PHA_MONITOR_DIMENSION_PAGE_URL, this.t);
            hashMap.put(com.taobao.pha.core.o.phaVersion, "");
            h k = this.k.k();
            if (k != null) {
                hashMap.put(nfc.PHA_MONITOR_DIMENSION_PRELOAD_TYPE, String.valueOf(k.f18719a));
            }
            HashMap hashMap2 = new HashMap();
            double d = mto.a.GEO_NOT_SUPPORT;
            try {
                j2 = this.p.getLongValue(nfc.PHA_MONITOR_MEASURE_WORKER_EVALUATE_END);
            } catch (Throwable unused) {
                j2 = 0;
            }
            if (j2 != 0) {
                d = 1.0d;
            }
            hashMap2.put("status", Double.valueOf(d));
            s.a(nfc.PHA_MONITOR_MODULE, nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, hashMap, hashMap2);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            g();
        }
    }

    @Deprecated
    public void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
        } else if (!this.y) {
        } else {
            nfc s = p.b().s();
            String b = ngn.b(this.k.t().toString());
            if (TextUtils.isEmpty(b) || s == null || this.b) {
                return;
            }
            this.b = true;
            HashMap hashMap = new HashMap();
            hashMap.put("url_key", b);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("fs_time", Double.valueOf(i2 == 1 ? System.currentTimeMillis() - this.f18721a : 0L));
            hashMap2.put("render_result", Double.valueOf(i2));
            s.a(nfc.PHA_MONITOR_MODULE, nfc.PHA_MONITOR_MODULE_POINT_MEASURE, hashMap, hashMap2);
        }
    }

    public void b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
        } else {
            a(i2, SystemClock.uptimeMillis());
        }
    }

    public void a(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j2)});
        } else {
            a(str, j2, true);
        }
    }

    public void a(String str, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3531c42", new Object[]{this, str, new Long(j2), new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.p.put(str, (Object) Long.valueOf(j2));
            if (z) {
                StringBuilder sb = new StringBuilder(str);
                sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
                String sb2 = sb.toString();
                if (!str.startsWith(com.taobao.android.tschedule.protocol.b.PROTOCOL_BIZ_CODE_PHA)) {
                    str = com.taobao.android.tschedule.protocol.b.PROTOCOL_BIZ_CODE_PHA + sb2;
                }
            }
            b(str, j2);
        }
    }

    public void a(int i2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i2), new Long(j2)});
        } else if (!this.y) {
        } else {
            String str = "reportStage with stage: " + i2 + ", timestamp:" + j2;
            switch (i2) {
                case 0:
                    this.p.put(nfc.PHA_MONITOR_STAGE_ENTRY, (Object) Long.valueOf(j2));
                    b("phaEntryStage", j2);
                    return;
                case 1:
                    this.u = j2;
                    this.p.put(nfc.PHA_MONITOR_MEASURE_PAGE_NAVIGATION_START, (Object) Long.valueOf(j2));
                    b("phaPageNavigationStart", j2);
                    return;
                case 2:
                    this.w = j2;
                    this.p.put(nfc.PHA_MONITOR_MEASURE_MANIFEST_START_LOAD, (Object) Long.valueOf(j2));
                    b("phaStartTime", j2);
                    return;
                case 3:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_MANIFEST_FINISHED_LOAD, (Object) Long.valueOf(j2));
                    b("phaManifestFinishedLoad", j2);
                    return;
                case 4:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_MANIFEST_PARSE_START, (Object) Long.valueOf(j2));
                    b("phaManifestParseStart", j2);
                    return;
                case 5:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_MANIFEST_PARSE_END, (Object) Long.valueOf(j2));
                    b("phaManifestParseEnd", j2);
                    return;
                case 6:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_CREATE_PHA_WORKER_START, (Object) Long.valueOf(j2));
                    b("phaWorkerCreateStart", j2);
                    return;
                case 7:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_CREATE_PHA_WORKER_END, (Object) Long.valueOf(j2));
                    b("phaWorkerCreateEnd", j2);
                    return;
                case 8:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_WORKER_DOWNLOAD_START, (Object) Long.valueOf(j2));
                    b("phaWorkerDownloadStart", j2);
                    return;
                case 9:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_WORKER_DOWNLOAD_END, (Object) Long.valueOf(j2));
                    b("phaWorkerDownloadEnd", j2);
                    return;
                case 10:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_WORKER_EVALUATE_START, (Object) Long.valueOf(j2));
                    b("phaWorkerEvaluateStart", j2);
                    return;
                case 11:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_WORKER_EVALUATE_END, (Object) Long.valueOf(j2));
                    b("phaWorkerEvaluateEnd", j2);
                    return;
                case 12:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_PAGE_CREATE_START, (Object) Long.valueOf(j2));
                    this.z = "WebViewCreate";
                    b("phaPageCreateStart", j2);
                    return;
                case 13:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_PAGE_LOAD_REQUEST_START, (Object) Long.valueOf(j2));
                    this.z = "WebViewStart";
                    b("phaPageLoadRequestStart", j2);
                    return;
                case 14:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_PAGE_RENDER_FINISHED, (Object) Long.valueOf(j2));
                    this.z = "WebViewFinished";
                    return;
                case 15:
                    this.p.put("containerStart", (Object) Long.valueOf(j2));
                    this.z = "ContainerCreate";
                    b("phaContainerStart", j2);
                    return;
                case 16:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_VIEW_START, (Object) Long.valueOf(j2));
                    this.z = "PageCreate";
                    b("phaViewStart", j2);
                    return;
                case 17:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_SPLASH_VIEW_START, (Object) Long.valueOf(j2));
                    b("phaSplashViewStart", j2);
                    return;
                case 18:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_SPLASH_VIEW_END, (Object) Long.valueOf(j2));
                    b("phaSplashViewEnd", j2);
                    return;
                case 19:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_HEADER_VIEW_START, (Object) Long.valueOf(j2));
                    b("phaHeaderViewStart", j2);
                    return;
                case 20:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_HEADER_PAGE_CREATE_START, (Object) Long.valueOf(j2));
                    b("phaHeaderPageCreate", j2);
                    return;
                case 21:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_TABBAR_VIEW_START, (Object) Long.valueOf(j2));
                    b("phaTabbarViewStart", j2);
                    return;
                case 22:
                    this.p.put(nfc.PHA_MONITOR_MEASURE_TABBAR_PAGE_CREATE_START, (Object) Long.valueOf(j2));
                    b("phaTabbarPageCreate", j2);
                    return;
                case 23:
                    this.p.put(nfc.PHA_MONITOR_STAGE_UC_PREPARE_START, (Object) Long.valueOf(j2));
                    b(nfc.PHA_MONITOR_STAGE_UC_PREPARE_START, j2);
                    return;
                case 24:
                    this.p.put(nfc.PHA_MONITOR_STAGE_UC_PREPARE_END, (Object) Long.valueOf(j2));
                    b(nfc.PHA_MONITOR_STAGE_UC_PREPARE_END, j2);
                    this.p.put(nfc.PHA_MONITOR_STAGE_UC_PREPARE_COST, (Object) Long.valueOf(j2 - this.p.getLongValue(nfc.PHA_MONITOR_STAGE_UC_PREPARE_START)));
                    return;
                default:
                    ngr.b(i, "Unknown stage: " + i2);
                    return;
            }
        }
    }

    public void a(String str, double d, long j2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b54bdc", new Object[]{this, str, new Double(d), new Long(j2), new Boolean(z)});
        } else if (!this.y) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uct2", (Object) Double.valueOf(d));
            jSONObject.put(nfc.PHA_MONITOR_UC_T2_TIMESTAMP, (Object) Long.valueOf(j2));
            jSONObject.put("pageUrl", (Object) str);
            if (z && !this.p.containsKey("uct2")) {
                this.p.putAll(jSONObject);
            }
            jSONObject.put("manifestStartLoadTimeStamp", (Object) Long.valueOf(this.w));
            a("uct2", jSONObject);
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            a(nfc.PHA_MONITOR_MODULE_POINT_WHITE_SCREEN, new com.taobao.pha.core.error.a(PHAErrorType.THIRD_PARTY_ERROR, ecg.UMB_FEATURE_WHITE_SCREEN, jSONObject));
        }
    }

    public void a(String str, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a352e032", new Object[]{this, str, new Long(j2), new Long(j3)});
            return;
        }
        Object obj = this.p.get(nfc.PHA_MONITOR_MEASURE_DATA_PREFETCHES);
        if (!(obj instanceof JSONObject)) {
            obj = new JSONObject();
            this.p.put(nfc.PHA_MONITOR_MEASURE_DATA_PREFETCHES, obj);
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(Long.valueOf(j2));
        jSONArray.add(Long.valueOf(j3));
        ((JSONObject) obj).put(str, (Object) jSONArray);
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        jSONObject.put("isFragment", (Object) Integer.valueOf(this.h ? 1 : 0));
        AppController appController = this.k;
        if (appController != null && appController.t() != null) {
            jSONObject.put("url", (Object) this.k.t().toString());
        }
        b(str, jSONObject);
    }

    public void a(String str, com.taobao.pha.core.error.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("794687ac", new Object[]{this, str, aVar});
            return;
        }
        if (str == null) {
            str = "alarm";
        }
        JSONObject jSONObject = aVar.c;
        jSONObject.put("isFragment", (Object) Integer.valueOf(this.h ? 1 : 0));
        AppController appController = this.k;
        if (appController != null && appController.t() != null) {
            jSONObject.put("url", (Object) this.k.t().toString());
        }
        a(str, aVar.c, aVar.f18738a, aVar.b);
    }

    public static void b(String str, JSONObject jSONObject) {
        nfc s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{str, jSONObject});
        } else if (!p.d() || (s = p.b().s()) == null) {
        } else {
            jSONObject.put(com.taobao.pha.core.o.phaVersion, "");
            s.a(nfc.PHA_MONITOR_MODULE, str, jSONObject);
        }
    }

    public static void a(String str, JSONObject jSONObject, String str2, String str3) {
        nfc s;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3feecb12", new Object[]{str, jSONObject, str2, str3});
        } else if (!p.d() || (s = p.b().s()) == null || str == null) {
        } else {
            jSONObject.put(com.taobao.pha.core.o.phaVersion, "");
            String str4 = i;
            ngr.b(str4, "Exception: [" + str + "], errCode: " + str2 + ", errMsg: " + str3 + ", args: " + jSONObject.toJSONString());
            s.a(nfc.PHA_MONITOR_MODULE, str, jSONObject, str2 != null ? str2 : "", str3);
        }
    }

    private void b(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j2)});
        } else if (!this.f) {
            this.g.put(str, Long.valueOf(j2));
        } else if (this.x == null) {
            this.g.put(str, Long.valueOf(j2));
        } else {
            Map<String, Long> map = this.g;
            if (map != null && !map.isEmpty()) {
                h();
            }
            nfc s = p.b().s();
            if (s == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("phaManifestUrl", this.k.t().toString());
            hashMap.put("phaManifestCacheType", Integer.valueOf(this.l));
            hashMap.put("phaIsFragment", Integer.valueOf(this.h ? 1 : 0));
            h k = this.k.k();
            if (k != null) {
                hashMap.put(nfc.PHA_MONITOR_DIMENSION_PRELOAD_TYPE, Integer.valueOf(k.f18719a));
            }
            try {
                hashMap.put("phaContainerType", this.k.p().name().toLowerCase());
                hashMap.put("phaManifestSourceType", Integer.valueOf(this.m));
            } catch (Exception unused) {
            }
            s.a(str, hashMap, j2, this.x);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("phaManifestUrl", this.k.t().toString());
        hashMap.put("phaManifestCacheType", Integer.valueOf(this.l));
        hashMap.put("phaIsFragment", Integer.valueOf(this.h ? 1 : 0));
        try {
            hashMap.put("phaContainerType", this.k.p().name().toLowerCase());
            hashMap.put("phaManifestSourceType", Integer.valueOf(this.m));
        } catch (Exception unused) {
        }
        nfc s = p.b().s();
        if (s == null) {
            return;
        }
        for (Map.Entry<String, Long> entry : this.g.entrySet()) {
            s.a(entry.getKey(), hashMap, entry.getValue().longValue(), this.x);
        }
        this.g.clear();
    }

    public void c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i2)});
        } else if (i2 == 19) {
            if (this.p.containsKey(nfc.PHA_MONITOR_MEASURE_HEADER_VIEW_START)) {
                return;
            }
            b(19);
        } else if (i2 != 20) {
            switch (i2) {
                case 12:
                    if (this.p.containsKey(nfc.PHA_MONITOR_MEASURE_PAGE_CREATE_START)) {
                        return;
                    }
                    b(12);
                    this.k.a(new e.a(Constants.Event.PAGESTART));
                    return;
                case 13:
                    if (this.p.containsKey(nfc.PHA_MONITOR_MEASURE_PAGE_LOAD_REQUEST_START)) {
                        return;
                    }
                    b(13);
                    return;
                case 14:
                    if (this.p.containsKey(nfc.PHA_MONITOR_MEASURE_PAGE_RENDER_FINISHED)) {
                        return;
                    }
                    b(14);
                    this.k.a(new e.a("pageloaded"));
                    return;
                default:
                    ngr.b(i, "unsupported pointer");
                    return;
            }
        } else if (this.p.containsKey(nfc.PHA_MONITOR_MEASURE_HEADER_PAGE_CREATE_START)) {
        } else {
            b(20);
        }
    }

    public void a(long j2, long j3, long j4, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806733a6", new Object[]{this, new Long(j2), new Long(j3), new Long(j4), str});
        } else if (this.p.containsKey(nfc.PHA_MONITOR_MEASURE_PRELOAD_START)) {
        } else {
            this.r = true;
            this.s = str;
            if (j2 != 0) {
                this.p.put(nfc.PHA_MONITOR_MEASURE_PRELOAD_START, (Object) Long.valueOf(j2));
            }
            if (j3 != 0) {
                this.p.put(nfc.PHA_MONITOR_MEASURE_PRELOAD_PAGE_START_LOAD, (Object) Long.valueOf(j3));
            }
            if (j4 == 0) {
                return;
            }
            this.p.put(nfc.PHA_MONITOR_MEASURE_PRELOAD_PAGE_FINISHED_LOAD, (Object) Long.valueOf(j4));
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.t = str;
        }
    }
}
