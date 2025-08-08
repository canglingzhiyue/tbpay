package com.taobao.trade.common.kit.tracker;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.trade.common.kit.utils.c;
import com.taobao.trade.common.kit.utils.d;
import com.taobao.trade.common.kit.utils.f;
import com.taobao.trade.common.kit.utils.g;
import com.taobao.trade.common.kit.utils.h;
import com.taobao.trade.common.kit.utils.i;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.xpl;
import tb.xpm;
import tb.xpn;
import tb.xpo;
import tb.xpp;
import tb.xpq;

/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final UTTracker f22972a;
    private static final ConcurrentHashMap<String, String> b;

    public static /* synthetic */ void a(float f, xpm xpmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab559d3d", new Object[]{new Float(f), xpmVar, str});
        } else {
            b(f, xpmVar, str);
        }
    }

    public static /* synthetic */ void a(float f, xpn xpnVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31db57dc", new Object[]{new Float(f), xpnVar, str});
        } else {
            b(f, xpnVar, str);
        }
    }

    public static /* synthetic */ void a(float f, xpo xpoVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b861127b", new Object[]{new Float(f), xpoVar, str});
        } else {
            b(f, xpoVar, str);
        }
    }

    public static /* synthetic */ void a(float f, xpp xppVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ee6cd1a", new Object[]{new Float(f), xppVar, str});
        } else {
            b(f, xppVar, str);
        }
    }

    public static /* synthetic */ void a(float f, xpq xpqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c56c87b9", new Object[]{new Float(f), xpqVar, str});
        } else {
            b(f, xpqVar, str);
        }
    }

    static {
        kge.a(248796961);
        f22972a = UTAnalytics.getInstance().getDefaultTracker();
        b = new ConcurrentHashMap<>();
    }

    private static String a(xpl<?> xplVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9edd9f3c", new Object[]{xplVar});
        }
        String a2 = xplVar.a();
        if (a2 != null) {
            return a2;
        }
        String str = b.get(xplVar.d());
        return str == null ? "" : str;
    }

    public static void a(final xpp xppVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b8ab60", new Object[]{xppVar});
        } else if (h.a("newUltron_container", "disableReportPV", false)) {
        } else {
            String d = xppVar.d();
            final float a2 = h.a(d, "TRACKER_PV_SAMPLING_" + xppVar.d(), -1.0f);
            if (-1.0f == a2) {
                a2 = b(xppVar.b());
            }
            if (a(a2)) {
                return;
            }
            final String a3 = a((xpl<?>) xppVar);
            g.a(new Runnable() { // from class: com.taobao.trade.common.kit.tracker.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a(a2, xppVar, a3);
                    }
                }
            });
        }
    }

    private static void b(float f, xpp xppVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7170cf9", new Object[]{new Float(f), xppVar, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, xppVar.c());
            hashMap.put("type", "pv");
            if (!StringUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            hashMap.put("message", "__PV");
            hashMap.put("collection_url", xppVar.f());
            hashMap.put(com.taobao.android.weex_framework.util.a.ATOM_stack, xppVar.e());
            a(xppVar.d(), hashMap);
        } catch (Exception e) {
            f.b("UltronJSTracker#reportPV", e.getMessage());
        }
    }

    public static void a(final xpn xpnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7c2a2", new Object[]{xpnVar});
            return;
        }
        String d = xpnVar.d();
        f.a(d, xpnVar.h(), xpnVar.e());
        if (h.a("newUltron_container", "disableReportError", false)) {
            return;
        }
        final float a2 = h.a(d, "TRACKER_ERROR_SAMPLING_" + xpnVar.h(), -1.0f);
        if (-1.0f == a2) {
            a2 = xpnVar.b();
        }
        if (a(xpnVar.b())) {
            return;
        }
        final String a3 = a((xpl<?>) xpnVar);
        if (i.a()) {
            g.a(new Runnable() { // from class: com.taobao.trade.common.kit.tracker.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        a.a(a2, xpnVar, a3);
                    }
                }
            });
        } else {
            b(a2, xpnVar, a3);
        }
    }

    private static void b(float f, xpn xpnVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba0b97bb", new Object[]{new Float(f), xpnVar, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, xpnVar.c());
            hashMap.put("type", "error");
            if (!StringUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            hashMap.put("message", Uri.encode(xpnVar.h()));
            hashMap.put("fileName", xpnVar.g());
            hashMap.put(com.taobao.android.weex_framework.util.a.ATOM_stack, Uri.encode(xpnVar.e()));
            hashMap.put("collection_url", xpnVar.f());
            a(xpnVar.d(), hashMap);
        } catch (Exception e) {
            f.b("UltronJSTracker#reportError", e.getMessage());
        }
    }

    public static void a(final xpm xpmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b74e43", new Object[]{xpmVar});
        } else if (h.a("newUltron_container", "disableReportCustom", false)) {
        } else {
            String d = xpmVar.d();
            final float a2 = h.a(d, "TRACKER_CUSTOM_SAMPLING_" + xpmVar.g(), -1.0f);
            if (-1.0f == a2) {
                a2 = b(xpmVar.b());
            }
            if (a(a2)) {
                return;
            }
            final String a3 = a((xpl<?>) xpmVar);
            if (i.a()) {
                g.a(new Runnable() { // from class: com.taobao.trade.common.kit.tracker.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a2, xpmVar, a3);
                        }
                    }
                });
            } else {
                b(a2, xpmVar, a3);
            }
        }
    }

    private static void b(float f, xpm xpmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3385dd1c", new Object[]{new Float(f), xpmVar, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, xpmVar.c());
            hashMap.put("type", BizTaskData.MANUAL_TIME);
            if (!StringUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            hashMap.put("code", Uri.encode(xpmVar.g()));
            int l = xpmVar.l();
            if (l > 0 && l <= 9) {
                hashMap.put("branch", String.valueOf(l));
            }
            if (xpmVar.m()) {
                hashMap.put("total", "all");
            }
            if (xpmVar.h() == null) {
                hashMap.put("message", Uri.encode(xpmVar.e()));
            } else {
                hashMap.put("message", Uri.encode(xpmVar.h()));
                hashMap.put(com.taobao.android.weex_framework.util.a.ATOM_stack, Uri.encode(xpmVar.e()));
            }
            hashMap.put("success", String.valueOf(xpmVar.i()));
            hashMap.put("collection_url", xpmVar.f());
            Map<String, String> j = xpmVar.j();
            if (j != null) {
                for (String str2 : j.keySet()) {
                    hashMap.put(str2, Uri.encode(j.get(str2)));
                }
            }
            Map<String, String> k = xpmVar.k();
            if (k != null) {
                for (String str3 : k.keySet()) {
                    hashMap.put(str3, Uri.encode(k.get(str3)));
                }
            }
            a(xpmVar.d(), hashMap);
        } catch (Exception e) {
            f.a("UltronJSTracker#reportCustom", e.getMessage());
        }
    }

    public static void a(final xpo xpoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b83701", new Object[]{xpoVar});
        } else if (h.a("newUltron_container", "disableReportMtop", false)) {
        } else {
            String d = xpoVar.d();
            final float a2 = h.a(d, "TRACKER_API_SAMPLING_" + xpoVar.h(), -1.0f);
            if (-1.0f == a2) {
                a2 = b(xpoVar.b());
            }
            if (a(a2)) {
                return;
            }
            final String a3 = a((xpl<?>) xpoVar);
            if (i.a()) {
                g.a(new Runnable() { // from class: com.taobao.trade.common.kit.tracker.a.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a2, xpoVar, a3);
                        }
                    }
                });
            } else {
                b(a2, xpoVar, a3);
            }
        }
    }

    private static void b(float f, xpo xpoVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4091525a", new Object[]{new Float(f), xpoVar, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, xpoVar.c());
            hashMap.put("type", "mtop_perf");
            if (!StringUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            hashMap.put("api", Uri.encode(xpoVar.h()));
            hashMap.put("traceId", xpoVar.g());
            hashMap.put("message", Uri.encode(xpoVar.e()));
            Map<String, String> k = xpoVar.k();
            if (k != null) {
                try {
                    hashMap.put("params", Uri.encode(JSON.toJSONString(k)));
                } catch (Exception unused) {
                }
            }
            hashMap.put("timing", String.valueOf(xpoVar.j()));
            hashMap.put("success", String.valueOf(xpoVar.i()));
            hashMap.put("collection_url", xpoVar.f());
            a(xpoVar.d(), hashMap);
        } catch (Exception e) {
            f.a("UltronJSTracker#reportMtop", e.getMessage());
        }
    }

    public static void a(final xpq xpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b91fbf", new Object[]{xpqVar});
            return;
        }
        xpq.a g = xpqVar.g();
        if (g == null) {
            f.a(xpqVar.d(), "UltronJSTracker#reportPerfException", "PerfModel.Msg is null");
        } else if (StringUtils.isEmpty(g.a())) {
            f.a("UltronJSTracker", "reportPerf#name不能为空");
        } else if (g.b() == null || g.b().isEmpty()) {
            f.a("UltronJSTracker", "reportPerf#必须添加stage");
        } else if (h.a("newUltron_container", "disableReportPerf", false)) {
        } else {
            String d = xpqVar.d();
            final float a2 = h.a(d, "TRACKER_PERF_SAMPLING_" + g.a(), -1.0f);
            if (-1.0f == a2) {
                a2 = b(xpqVar.b());
            }
            if (a(a2)) {
                return;
            }
            final String a3 = a((xpl<?>) xpqVar);
            if (i.a()) {
                g.a(new Runnable() { // from class: com.taobao.trade.common.kit.tracker.a.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            a.a(a2, xpqVar, a3);
                        }
                    }
                });
            } else {
                b(a2, xpqVar, a3);
            }
        }
    }

    private static void b(float f, xpq xpqVar, String str) {
        Map<String, Long> b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d9cc798", new Object[]{new Float(f), xpqVar, str});
            return;
        }
        xpq.a g = xpqVar.g();
        if (g == null || (b2 = g.b()) == null) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf((int) (1.0f / f)));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, xpqVar.c());
            hashMap.put("collection_url", xpqVar.f());
            hashMap.put("type", com.taobao.trtc.utils.h.MTP_PERF);
            if (!StringUtils.isEmpty(str)) {
                hashMap.put("uniqId", str);
            }
            HashMap hashMap2 = new HashMap();
            for (String str2 : b2.keySet()) {
                hashMap2.put(str2, b2.get(str2));
            }
            hashMap2.put("name", Uri.encode(g.a()));
            hashMap.put("message", Uri.encode(JSON.toJSONString(hashMap2)));
            hashMap.put(com.taobao.android.weex_framework.util.a.ATOM_stack, Uri.encode(xpqVar.e()));
            Map<String, String> h = xpqVar.h();
            if (h != null) {
                for (String str3 : h.keySet()) {
                    hashMap.put(str3, Uri.encode(h.get(str3)));
                }
            }
            a(xpqVar.d(), hashMap);
            if (!c.a()) {
                return;
            }
            String d = xpqVar.d();
            f.a(d, "性能耗时:" + g.a(), hashMap2);
        } catch (Exception e) {
            f.a("UltronJSTracker#reportPerf", e.getMessage());
        }
    }

    private static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else if (!d.a()) {
        } else {
            f22972a.send(new UTOriginalCustomHitBuilder(a(str), 19999, "/jstracker.3", "", "", map).build());
        }
    }

    private static boolean a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821885c", new Object[]{new Float(f)})).booleanValue() : f <= 0.0f || f > 1.0f || f < new Random().nextFloat();
    }

    private static float b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d660e7", new Object[]{new Float(f)})).floatValue();
        }
        if (!c.a()) {
            return f;
        }
        return 1.0f;
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (!b.c()) {
            return str;
        }
        return str + "_overseas";
    }
}
