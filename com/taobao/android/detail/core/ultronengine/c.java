package com.taobao.android.detail.core.ultronengine;

import android.os.Process;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.utils.i;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.joq;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String STAGE_BEFORE_MTOP = "beforeMtopTime";
    public static final String STAGE_MTOP = "mtopTime";
    public static final String STAGE_PAGE_TOTAL = "pageTotalTime";
    public static final String STAGE_PROCESS_DATA = "dataProcessTime";
    public static final String STAGE_PROCESS_DATA_ULTRON = "ultronDataTime";
    public static final String STAGE_RENDER = "renderTime";
    public static final String STAGE_RENDER_ULTRON = "ultronRenderTime";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f9923a;
    private static final int b;
    private static boolean f;
    private final Map<String, Long> c = new HashMap();
    private final Map<String, Double> d = new HashMap();
    private boolean e = false;
    private DimensionValueSet g;

    static {
        kge.a(-1359786659);
        b = Process.myPid();
        f9923a = false;
        f = false;
    }

    public c() {
        emu.a("com.taobao.android.detail.core.ultronengine.Perf");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!f9923a || this.e) {
        } else {
            this.c.put(str, Long.valueOf(System.currentTimeMillis()));
            i.c("Perf." + b + "." + str, "beginSection");
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (!f9923a || this.e) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (!this.c.containsKey(str)) {
                return;
            }
            long longValue = this.c.get(str).longValue();
            this.c.remove(str);
            long j = currentTimeMillis - longValue;
            this.d.put(str, Double.valueOf(j));
            i.c("Perf." + b + "." + str, String.valueOf(j));
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            this.e = true;
            if (!f9923a) {
                return;
            }
            i.a("detailPerf", "endPerf:" + JSON.toJSONString(this.d));
            a(this.d);
        } catch (Throwable th) {
            i.a("detailPerf", "endPerf", th);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (f) {
        } else {
            f = true;
            AppMonitor.register("Page_NewUltron_Detail_Performance", "Monitor_NewUltron_Detail", MeasureSet.create(new String[]{joq.STAGE_NETWORK, "dataParseTime", "renderTime", joq.STAGE_TOTAL}), DimensionSet.create(new String[]{"bizType"}));
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.g != null) {
        } else {
            HashMap hashMap = new HashMap(2);
            if (z) {
                hashMap.put("bizType", "detail2.0");
            } else {
                hashMap.put("bizType", "detail");
            }
            this.g = DimensionValueSet.fromStringMap(hashMap);
        }
    }

    private void a(Map<String, Double> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        b();
        DimensionValueSet dimensionValueSet = this.g;
        if (dimensionValueSet == null) {
            return;
        }
        AppMonitor.Stat.commit("Page_NewUltron_Detail_Performance", "Monitor_NewUltron_Detail", dimensionValueSet, MeasureValueSet.create(map));
    }
}
