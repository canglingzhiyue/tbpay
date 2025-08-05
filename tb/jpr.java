package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.android.weex_framework.util.a;
import com.taobao.calendar.sdk.db.schedule.Repeat;
import com.taobao.trtc.utils.h;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import tb.fgf;

/* loaded from: classes6.dex */
public final class jpr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final UTTracker f29679a;
    private static final ConcurrentHashMap<String, String> b;

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        }
    }

    public static /* synthetic */ void a(float f, fgf fgfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d313ed", new Object[]{new Float(f), fgfVar, str});
        } else {
            b(f, fgfVar, str);
        }
    }

    public static /* synthetic */ void a(float f, jpt jptVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e7e764", new Object[]{new Float(f), jptVar, str});
        } else {
            b(f, jptVar, str);
        }
    }

    public static /* synthetic */ void a(float f, jpu jpuVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("176da203", new Object[]{new Float(f), jpuVar, str});
        } else {
            b(f, jpuVar, str);
        }
    }

    public static /* synthetic */ void a(float f, sda sdaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b5e462", new Object[]{new Float(f), sdaVar, str});
        } else {
            b(f, sdaVar, str);
        }
    }

    public static /* synthetic */ void a(float f, sdb sdbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3b9f01", new Object[]{new Float(f), sdbVar, str});
        } else {
            b(f, sdbVar, str);
        }
    }

    static {
        kge.a(-1923264068);
        f29679a = UTAnalytics.getInstance().getDefaultTracker();
        b = new ConcurrentHashMap<>();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!ipb.a()) {
        } else {
            b.put(str, UUID.randomUUID().toString());
        }
    }

    private static String a(jps<?> jpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e855f435", new Object[]{jpsVar});
        }
        String m = jpsVar.m();
        if (m != null) {
            return m;
        }
        String str = b.get(jpsVar.c());
        return str == null ? "" : str;
    }

    public static void a(final sdb sdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe80f907", new Object[]{sdbVar});
        } else if (jqi.a("newUltron_container", "disableReportPV", false)) {
        } else {
            String c = sdbVar.c();
            final float a2 = jqi.a(c, "TRACKER_PV_SAMPLING_" + sdbVar.c(), -1.0f);
            if (-1.0f == a2) {
                a2 = a(sdbVar.a());
            }
            if (b(a2)) {
                return;
            }
            final String a3 = a((jps<?>) sdbVar);
            jqh.a(new Runnable() { // from class: tb.jpr.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        jpr.a(a2, sdbVar, a3);
                    }
                }
            });
        }
    }

    private static void b(float f, sdb sdbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56bdee0", new Object[]{new Float(f), sdbVar, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, sdbVar.b());
            hashMap.put("type", "pv");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            hashMap.put("message", "__PV");
            hashMap.put("collection_url", sdbVar.e());
            hashMap.put(a.ATOM_stack, sdbVar.d());
            a(sdbVar.c(), hashMap);
        } catch (Exception e) {
            jqg.b("UltronJSTracker#reportPV", e.getMessage());
        }
    }

    public static void a(final jpu jpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd71889", new Object[]{jpuVar});
            return;
        }
        String c = jpuVar.c();
        jqg.a(c, jpuVar.h(), jpuVar.d());
        if (jqi.a("newUltron_container", "disableReportError", false)) {
            return;
        }
        final float a2 = jqi.a(c, "TRACKER_ERROR_SAMPLING_" + jpuVar.h(), -1.0f);
        if (-1.0f == a2) {
            a2 = jpuVar.a();
        }
        if (b(jpuVar.a())) {
            return;
        }
        final String a3 = a((jps<?>) jpuVar);
        if (sfk.a()) {
            jqh.a(new Runnable() { // from class: tb.jpr.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        jpr.a(a2, jpuVar, a3);
                    }
                }
            });
        } else {
            b(a2, jpuVar, a3);
        }
    }

    private static void b(float f, jpu jpuVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f9de1e2", new Object[]{new Float(f), jpuVar, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, jpuVar.b());
            hashMap.put("type", "error");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            String h = jpuVar.h();
            if (TextUtils.isEmpty(h)) {
                hashMap.put("message", Uri.encode(jpuVar.d()));
            } else {
                hashMap.put("message", Uri.encode(h));
                hashMap.put(a.ATOM_stack, Uri.encode(jpuVar.d()));
            }
            hashMap.put("fileName", jpuVar.f());
            hashMap.put("collection_url", jpuVar.e());
            a(jpuVar.c(), hashMap);
        } catch (Exception e) {
            jqg.b("UltronJSTracker#reportError", e.getMessage());
        }
    }

    public static void a(final jpt jptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efd6a42a", new Object[]{jptVar});
        } else if (jqi.a("newUltron_container", "disableReportCustom", false)) {
        } else {
            String c = jptVar.c();
            final float a2 = jqi.a(c, "TRACKER_CUSTOM_SAMPLING_" + jptVar.f(), -1.0f);
            if (-1.0f == a2) {
                a2 = a(jptVar.a());
            }
            if (b(a2)) {
                return;
            }
            final String a3 = a((jps<?>) jptVar);
            if (sfk.a()) {
                jqh.a(new Runnable() { // from class: tb.jpr.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            jpr.a(a2, jptVar, a3);
                        }
                    }
                });
            } else {
                b(a2, jptVar, a3);
            }
        }
    }

    private static void b(float f, jpt jptVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19182743", new Object[]{new Float(f), jptVar, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, jptVar.b());
            hashMap.put("type", BizTaskData.MANUAL_TIME);
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            hashMap.put("code", Uri.encode(jptVar.f()));
            int j = jptVar.j();
            if (j > 0 && j <= 9) {
                hashMap.put("branch", String.valueOf(j));
            }
            if (jptVar.k()) {
                hashMap.put("total", "all");
            }
            if (jptVar.l() == null) {
                hashMap.put("message", Uri.encode(jptVar.d()));
            } else {
                hashMap.put("message", Uri.encode(jptVar.l()));
                hashMap.put(a.ATOM_stack, Uri.encode(jptVar.d()));
            }
            hashMap.put("success", String.valueOf(jptVar.g()));
            hashMap.put("collection_url", jptVar.e());
            Map<String, String> h = jptVar.h();
            if (h != null) {
                for (String str2 : h.keySet()) {
                    hashMap.put(str2, Uri.encode(h.get(str2)));
                }
            }
            Map<String, String> i = jptVar.i();
            if (i != null) {
                for (String str3 : i.keySet()) {
                    hashMap.put(str3, Uri.encode(i.get(str3)));
                }
            }
            a(jptVar.c(), hashMap);
        } catch (Exception e) {
            jqg.a("UltronJSTracker#reportCustom", e.getMessage());
        }
    }

    public static void a(final sda sdaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8084a8", new Object[]{sdaVar});
        } else if (jqi.a("newUltron_container", "disableReportMtop", false)) {
        } else {
            String c = sdaVar.c();
            final float a2 = jqi.a(c, "TRACKER_API_SAMPLING_" + sdaVar.g(), -1.0f);
            if (-1.0f == a2) {
                a2 = a(sdaVar.a());
            }
            if (b(a2)) {
                return;
            }
            final String a3 = a((jps<?>) sdaVar);
            if (sfk.a()) {
                jqh.a(new Runnable() { // from class: tb.jpr.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            jpr.a(a2, sdaVar, a3);
                        }
                    }
                });
            } else {
                b(a2, sdaVar, a3);
            }
        }
    }

    private static void b(float f, sda sdaVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ee62441", new Object[]{new Float(f), sdaVar, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, sdaVar.b());
            hashMap.put("type", "mtop_perf");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            hashMap.put("api", Uri.encode(sdaVar.g()));
            hashMap.put("traceId", sdaVar.f());
            hashMap.put("message", Uri.encode(sdaVar.d()));
            Map<String, String> j = sdaVar.j();
            if (j != null) {
                try {
                    hashMap.put("params", Uri.encode(JSON.toJSONString(j)));
                } catch (Exception unused) {
                }
            }
            hashMap.put("timing", String.valueOf(sdaVar.i()));
            hashMap.put("success", String.valueOf(sdaVar.h()));
            hashMap.put("collection_url", sdaVar.e());
            a(sdaVar.c(), hashMap);
        } catch (Exception e) {
            jqg.a("UltronJSTracker#reportMtop", e.getMessage());
        }
    }

    public static void a(final fgf fgfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87e10f3", new Object[]{fgfVar});
            return;
        }
        fgf.a f = fgfVar.f();
        if (f == null) {
            jqg.a(fgfVar.c(), "UltronJSTracker#reportPerfException", "PerfModel.Msg is null");
        } else if (TextUtils.isEmpty(f.a())) {
            jqg.a("UltronJSTracker", "reportPerf#name不能为空");
        } else if (f.b() == null || f.b().isEmpty()) {
            jqg.a("UltronJSTracker", "reportPerf#必须添加stage");
        } else if (jqi.a("newUltron_container", "disableReportPerf", false)) {
        } else {
            String c = fgfVar.c();
            final float a2 = jqi.a(c, "TRACKER_PERF_SAMPLING_" + f.a(), -1.0f);
            if (-1.0f == a2) {
                a2 = a(fgfVar.a());
            }
            if (b(a2)) {
                return;
            }
            final String a3 = a((jps<?>) fgfVar);
            if (sfk.a()) {
                jqh.a(new Runnable() { // from class: tb.jpr.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            jpr.a(a2, fgfVar, a3);
                        }
                    }
                });
            } else {
                b(a2, fgfVar, a3);
            }
        }
    }

    private static void b(float f, fgf fgfVar, String str) {
        Map<String, Long> b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("320353cc", new Object[]{new Float(f), fgfVar, str});
            return;
        }
        fgf.a f2 = fgfVar.f();
        if (f2 == null || (b2 = f2.b()) == null) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, fgfVar.b());
            hashMap.put("collection_url", fgfVar.e());
            hashMap.put("type", h.MTP_PERF);
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            HashMap hashMap2 = new HashMap();
            for (String str2 : b2.keySet()) {
                hashMap2.put(str2, b2.get(str2));
            }
            hashMap2.put("name", Uri.encode(f2.a()));
            hashMap.put("message", Uri.encode(JSON.toJSONString(hashMap2)));
            hashMap.put(a.ATOM_stack, Uri.encode(fgfVar.d()));
            Map<String, String> g = fgfVar.g();
            if (g != null) {
                if (jqi.a(fgfVar.c(), "uploadBizPropsToJSTracker", false)) {
                    if (!g.isEmpty()) {
                        hashMap.put("bizProps", Uri.encode(JSON.toJSONString(g)));
                    }
                } else {
                    for (String str3 : g.keySet()) {
                        if (str3.startsWith(Repeat.D)) {
                            hashMap.put(str3, Uri.encode(g.get(str3)));
                        }
                    }
                }
            }
            String c = fgfVar.c();
            a(c, hashMap);
            if (!ifp.a()) {
                return;
            }
            jqg.b(c, "性能耗时:" + f2.a(), hashMap2);
        } catch (Exception e) {
            jqg.a("UltronJSTracker#reportPerf", e.getMessage());
        }
    }

    private static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else if (!ipb.a()) {
        } else {
            f29679a.send(new UTOriginalCustomHitBuilder(c(str), 19999, "/jstracker.3", "", "", map).build());
        }
    }

    private static boolean b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d660fb", new Object[]{new Float(f)})).booleanValue();
        }
        if (ifp.a()) {
            return false;
        }
        return f <= 0.0f || f > 1.0f || f < new Random().nextFloat();
    }

    private static float a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{new Float(f)})).floatValue();
        }
        if (!ifp.a()) {
            return f;
        }
        return 1.0f;
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (!b.c()) {
            return str;
        }
        return str + "_overseas";
    }
}
