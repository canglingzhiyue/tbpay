package com.taobao.android.weex_framework.monitor;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValue;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.r;
import com.taobao.android.weex_framework.util.f;
import com.taobao.android.weex_framework.util.g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.mto;

/* loaded from: classes6.dex */
public class MUSMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIMS_PAGE_DATA_PRELOAD = "page_data_preload";
    public static final String DIMS_PAGE_DOWNLOAD_CACHE = "page_download_cache";
    public static final String DIMS_PAGE_TEMPLATE_DOWNLOAD_COUNT = "page_template_download_count";
    public static final String DIMS_PAGE_TEMPLATE_DOWNLOAD_SUCC_COUNT = "page_template_download_succ_count";
    public static final String KEY_BATCH_TIME = "batch_time";
    public static final String KEY_BG_TIME_ALL = "bg_time_all";
    public static final String KEY_BG_TIME_JS = "bg_time_js";
    public static final String KEY_BG_TIME_LAYOUT = "bg_time_layout";
    public static final String KEY_DELAY_TIME_AFTER = "thread_delay_time_after";
    public static final String KEY_DELAY_TIME_BEFORE = "thread_delay_time_before";
    public static final String KEY_DOWNLOAD_TIME = "download_time";
    public static final String KEY_MAIN_TIME_ALL = "main_time_all";
    public static final String KEY_MEM_MAX_SIZE = "mem_max_size";
    public static final String KEY_MEM_SIZE = "mem_size";
    public static final String KEY_MUS_UNICORN_RENDER = "mus_unicorn_render";
    public static final String KEY_MUS_UNICORN_RENDER_OPT = "mus_unicorn_render_opt";
    public static final String KEY_MUS_UNICORN_RENDER_OPT_RASTER = "mus_unicorn_render_raster_opt";
    public static final String KEY_NODE_COUNT = "node_count";
    public static final String KEY_NODE_DEPTH = "node_depth";
    public static final String KEY_NODE_MAX_COUNT = "node_max_count";
    public static final String KEY_NODE_MAX_DEPTH = "node_max_depth";
    public static final String KEY_PAGE_CONTAINER_TO_PRELOAD_FINISH = "page_container_to_preload_finish";
    public static final String KEY_PAGE_CONTAINER_TO_PRELOAD_START = "page_container_to_preload_start";
    public static final String KEY_PAGE_FIRST_SCREEN_TIME = "page_first_screen_time";
    public static final String KEY_PAGE_MTOP_TIME = "page_mtop_time";
    public static final String KEY_PAGE_RENDER_TIME = "page_render_time";
    public static final String KEY_PAGE_TEMPLATE_DOWNLOAD_COUNT = "page_template_download_count";
    public static final String KEY_PAGE_TEMPLATE_DOWNLOAD_SUCC_COUNT = "page_template_download_succ_count";
    public static final String KEY_PAGE_TEMPLATE_DOWNLOAD_TIME = "page_template_download_time";
    public static final String KEY_PAGE_WLM_DOWNLOAD = "page_wlm_download";
    public static final String KEY_RESERVE_1 = "reserve_1";
    public static final String KEY_RESERVE_10 = "reserve_10";
    public static final String KEY_RESERVE_2 = "reserve_2";
    public static final String KEY_RESERVE_3 = "reserve_3";
    public static final String KEY_RESERVE_4 = "reserve_4";
    public static final String KEY_RESERVE_5 = "reserve_5";
    public static final String KEY_RESERVE_6 = "reserve_6";
    public static final String KEY_RESERVE_7 = "reserve_7";
    public static final String KEY_RESERVE_8 = "reserve_8";
    public static final String KEY_RESERVE_9 = "reserve_9";
    public static final String MODULE = "MUSAppMonitor";
    public static final String MODULE_DIM_ABILITY = "ability";
    public static final String MODULE_DIM_API = "api";
    public static final String MODULE_DIM_BIZ_ID = "bizId";
    public static final String MODULE_DIM_CONTAINER_TYPE = "containerType";
    public static final String MODULE_INVOKE = "OpenAbility";
    public static final String MODULE_MEASURE_KEY_COUNT = "count";
    public static final int PHASE_DETAIL = 3;
    public static final int PHASE_PREPARE = 0;
    public static final int PHASE_REFRESH = 2;
    public static final int PHASE_RENDER = 1;
    public static final String POINT_DETAIL = "detail";
    public static final String POINT_PREPARE = "prepare";
    public static final String POINT_REFRESH = "refresh";
    public static final String POINT_RENDER = "render";
    public static final String POINT_TEMPLATE_DOWNLOAD = "template_download";

    /* renamed from: a  reason: collision with root package name */
    private static int f16063a;
    private static com.taobao.android.weex_framework.monitor.a b;
    private static boolean c;
    private static int k;
    private final Map<String, a> d = new ConcurrentHashMap();
    private final Map<String, a> e = new ConcurrentHashMap();
    private final Map<String, a> f = new ConcurrentHashMap();
    private final Map<String, a> g = new ConcurrentHashMap();
    private final Map<String, String> h = new ConcurrentHashMap();
    private final Map<String, String> i = new ConcurrentHashMap();
    private final r j;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface DetailDimsType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface DetailMeasureType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface KEY {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface PHASE {
    }

    static {
        kge.a(-120543808);
        c = true;
        f16063a = f.n();
        k = (int) (Math.random() * f16063a);
        String[] strArr = {"bundle_url", "page_name", MUSAppMonitor.T_ITEM_TYPE, MUSAppMonitor.SCRIPT_URL, "sversion", MUSAppMonitor.MUISE_SDK_VERSION, MUSAppMonitor.ALIMUISE_SDK_VERSION, MUSAppMonitor.BYTECODE};
        try {
            AppMonitor.register("MUSAppMonitor", "prepare", new String[]{KEY_BG_TIME_ALL, KEY_MAIN_TIME_ALL}, strArr, false);
            AppMonitor.register("MUSAppMonitor", "render", new String[]{KEY_BG_TIME_JS, KEY_BG_TIME_LAYOUT, KEY_BG_TIME_ALL, KEY_MAIN_TIME_ALL, KEY_BATCH_TIME, KEY_DELAY_TIME_BEFORE, KEY_DELAY_TIME_AFTER, KEY_MUS_UNICORN_RENDER}, strArr, false);
            AppMonitor.register("MUSAppMonitor", "refresh", new String[]{KEY_BG_TIME_JS, KEY_BG_TIME_LAYOUT, KEY_BG_TIME_ALL, KEY_MAIN_TIME_ALL, KEY_BATCH_TIME, KEY_DELAY_TIME_BEFORE, KEY_DELAY_TIME_AFTER}, strArr, false);
            AppMonitor.register("MUSAppMonitor", "detail", new String[]{KEY_NODE_COUNT, KEY_NODE_DEPTH, KEY_NODE_MAX_COUNT, KEY_NODE_MAX_DEPTH, KEY_MEM_SIZE, KEY_MEM_MAX_SIZE, KEY_PAGE_WLM_DOWNLOAD, KEY_PAGE_RENDER_TIME, "page_template_download_count", "page_template_download_succ_count", KEY_PAGE_FIRST_SCREEN_TIME, KEY_PAGE_TEMPLATE_DOWNLOAD_TIME, KEY_PAGE_MTOP_TIME, KEY_PAGE_CONTAINER_TO_PRELOAD_FINISH, KEY_PAGE_CONTAINER_TO_PRELOAD_START, KEY_RESERVE_1, KEY_RESERVE_2, KEY_RESERVE_3, KEY_RESERVE_4, KEY_RESERVE_5, KEY_RESERVE_6, KEY_RESERVE_7, KEY_RESERVE_8, KEY_RESERVE_9, KEY_RESERVE_10}, new String[]{DIMS_PAGE_DOWNLOAD_CACHE, DIMS_PAGE_DATA_PRELOAD, "page_template_download_count", "page_template_download_succ_count", "bundle_url", "page_name", MUSAppMonitor.T_ITEM_TYPE, MUSAppMonitor.SCRIPT_URL, "sversion", MUSAppMonitor.MUISE_SDK_VERSION, MUSAppMonitor.ALIMUISE_SDK_VERSION, MUSAppMonitor.BYTECODE}, false);
            AppMonitor.register("MUSAppMonitor", POINT_TEMPLATE_DOWNLOAD, new String[]{KEY_DOWNLOAD_TIME}, strArr, false);
            DimensionSet create = DimensionSet.create();
            create.addDimension("containerType");
            create.addDimension(MODULE_DIM_ABILITY);
            create.addDimension("api");
            create.addDimension("bizId");
            MeasureSet create2 = MeasureSet.create();
            create2.addMeasure("count");
            AppMonitor.register(MODULE_INVOKE, "PreInvokeApi", create2, create, false);
        } catch (Throwable unused) {
            g.d("MUSMonitor AppMonitor not found");
            c = false;
        }
    }

    public MUSMonitor(r rVar) {
        this.j = rVar;
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f16064a = 0;
        public double b = mto.a.GEO_NOT_SUPPORT;
        public double c = mto.a.GEO_NOT_SUPPORT;

        static {
            kge.a(1862282507);
        }

        public synchronized void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
                return;
            }
            double d = j;
            this.b = d;
            this.c = d;
            this.f16064a = 1;
        }

        public synchronized void b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
                return;
            }
            double d = j;
            this.b += d;
            this.c = d;
            this.f16064a++;
        }

        public synchronized double c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5889b58", new Object[]{this})).doubleValue();
            } else if (this.f16064a == 0) {
                return mto.a.GEO_NOT_SUPPORT;
            } else {
                return this.b / this.f16064a;
            }
        }
    }

    public synchronized void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.h.put(str, str2);
        }
    }

    public synchronized void a(int i, String str, long j) {
        Map<String, a> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd34debf", new Object[]{this, new Integer(i), str, new Long(j)});
            return;
        }
        if (i == 0) {
            map = this.d;
        } else if (i == 1) {
            map = this.f;
        } else if (i == 2) {
            map = this.e;
        } else if (i != 3) {
            return;
        } else {
            map = this.g;
        }
        a aVar = map.get(str);
        if (aVar == null) {
            aVar = new a();
            map.put(str, aVar);
        }
        aVar.b(j);
    }

    public synchronized void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        Map<String, a> map = this.g;
        a aVar = map.get(str);
        if (aVar == null) {
            aVar = new a();
            map.put(str, aVar);
        }
        aVar.a(j);
    }

    public synchronized void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            this.i.put(str, str2);
        }
    }

    public synchronized void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        boolean z3 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if ((z2 || z) && StringUtils.isEmpty(this.j.g()) && StringUtils.isEmpty(this.j.i())) {
            MUSAppMonitor.d(this.j);
        }
        if (z) {
            a("prepare", this.d, (Map<String, String>) null);
        }
        if (z2) {
            a("render", this.f, (Map<String, String>) null);
            if (!this.e.isEmpty()) {
                Iterator<a> it = this.e.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().f16064a != 0) {
                            z3 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!z3) {
                    a("refresh", this.e, (Map<String, String>) null);
                }
            }
            a("detail", this.g, this.i);
        }
    }

    private void a(String str, Map<String, a> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb874e12", new Object[]{this, str, map, map2});
            return;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, a> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), Double.valueOf(entry.getValue().c()));
        }
        a(this.j, "MUSAppMonitor", str, hashMap, new HashMap(this.h), map2);
    }

    public Map<String, a> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f;
    }

    public Map<String, a> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.g;
    }

    private static void a(r rVar, String str, String str2, Map<String, Double> map, Map<String, String> map2, Map<String, String> map3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f0aa20e", new Object[]{rVar, str, str2, map, map2, map3});
        } else if (c) {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                String e = rVar.e();
                String f = rVar.f();
                String g = rVar.g();
                String i = rVar.i();
                String k2 = rVar.k();
                String p = rVar.p();
                String l = rVar.l();
                String m = rVar.m();
                if (e != null) {
                    create.setValue("bundle_url", e);
                }
                if (f != null) {
                    create.setValue("page_name", f);
                }
                if (g != null) {
                    create.setValue(MUSAppMonitor.T_ITEM_TYPE, g);
                }
                if (i != null) {
                    create.setValue(MUSAppMonitor.SCRIPT_URL, i);
                }
                if (k2 != null) {
                    create.setValue(MUSAppMonitor.BYTECODE, k2);
                }
                if (p != null) {
                    create.setValue("sversion", p);
                }
                if (l != null) {
                    create.setValue(MUSAppMonitor.MUISE_SDK_VERSION, l);
                }
                if (m != null) {
                    create.setValue(MUSAppMonitor.ALIMUISE_SDK_VERSION, m);
                }
                if (map2 != null) {
                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                        create.setValue(entry.getKey(), entry.getValue());
                    }
                }
                if (map3 != null) {
                    for (Map.Entry<String, String> entry2 : map3.entrySet()) {
                        create.setValue(entry2.getKey(), entry2.getValue());
                    }
                }
                MeasureValueSet create2 = MeasureValueSet.create();
                for (Map.Entry<String, Double> entry3 : map.entrySet()) {
                    create2.setValue(entry3.getKey(), entry3.getValue().doubleValue());
                }
                if (g.a() || g.f16089a) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, MeasureValue> entry4 : create2.getMap().entrySet()) {
                        hashMap.put(entry4.getKey(), String.valueOf(entry4.getValue().getValue()));
                    }
                    if (m.c()) {
                        g.a(MUSAppMonitor.LOG_TAG, String.format("Track <%s>: %s\n    --Dim: %s", str2, hashMap, create.getMap()));
                    } else {
                        g.e(MUSAppMonitor.LOG_TAG, String.format("Track <%s>: %s\n    --Dim: %s", str2, hashMap, create.getMap()), null);
                    }
                }
                if (!m.c() && !com.taobao.android.riverlogger.inspector.a.a() && !rVar.c()) {
                    AppMonitor.Stat.commit(str, str2, create, create2);
                }
            } catch (Throwable unused) {
                g.d("AppMonitor not found");
            }
        }
    }

    public static void a(r rVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b4a9541", new Object[]{rVar, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KEY_DOWNLOAD_TIME, Double.valueOf(j));
        a(rVar, "MUSAppMonitor", POINT_TEMPLATE_DOWNLOAD, hashMap, null, null);
    }

    public static void a(com.taobao.android.weex_framework.monitor.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41aea229", new Object[]{aVar});
        } else {
            b = aVar;
        }
    }

    public static void a(String str, String str2, String str3) {
        com.taobao.android.weex_framework.monitor.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (!c() || !c || (aVar = b) == null || !aVar.a() || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            String str4 = "unknown";
            if (!StringUtils.isEmpty(str3)) {
                try {
                    str4 = Uri.parse(str3).buildUpon().clearQuery().build().toString();
                } catch (Throwable unused) {
                }
            }
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("containerType", "muise");
                create.setValue(MODULE_DIM_ABILITY, str);
                create.setValue("api", str + '.' + str2);
                create.setValue("bizId", str4);
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("count", 1.0d);
                AppMonitor.Stat.commit(MODULE_INVOKE, "PreInvokeApi", create, create2);
            } catch (Throwable unused2) {
                g.d("AppMonitor not found");
            }
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        int i = k;
        k = i + 1;
        return i % f16063a == 0;
    }
}
