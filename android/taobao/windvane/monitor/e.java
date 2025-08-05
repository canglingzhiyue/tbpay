package android.taobao.windvane.monitor;

import android.taobao.windvane.extra.performance2.WVWPData;
import android.taobao.windvane.extra.performance2.WVWPManager;
import android.taobao.windvane.monitor.f;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes2.dex */
public class e implements f.a, f.b, f.c, f.d, f.e, f.InterfaceC0020f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile Pattern URL_FILTER_PATTERN;
    private static String g;
    private static AtomicBoolean h;

    /* renamed from: a  reason: collision with root package name */
    private final String f1678a = "WhitePage";
    private final String b = "MtopPlugin";
    private final String c = "H5FormatRequest";
    private final String d = "H5HttpResponse";
    private final String e = "ZCacheResponse";
    private final String f = "WVPerformance";

    static {
        kge.a(277213018);
        kge.a(1889497301);
        kge.a(-1711817894);
        kge.a(-108867223);
        kge.a(417367667);
        kge.a(-1910010165);
        kge.a(-676613813);
        g = e.class.getSimpleName();
        h = new AtomicBoolean(false);
    }

    public e() {
        try {
            if (!h.compareAndSet(false, true)) {
                return;
            }
            DimensionSet create = DimensionSet.create();
            create.addDimension("api");
            create.addDimension(com.taobao.mtop.wvplugin.a.RESULT_KEY);
            create.addDimension("url");
            create.addDimension("msg");
            MeasureSet create2 = MeasureSet.create();
            AppMonitor.register("WindVane", "MtopPlugin", create2, create);
            DimensionSet create3 = DimensionSet.create();
            create3.addDimension("pageUrl");
            create3.addDimension("method");
            create3.addDimension("requestUrl");
            AppMonitor.register("WindVane", "H5FormatRequest", create2, create3);
            DimensionSet create4 = DimensionSet.create();
            create4.addDimension("pageUrl");
            create4.addDimension("retCode");
            create4.addDimension("requestUrl");
            create4.addDimension("isHtml");
            AppMonitor.register("WindVane", "H5HttpResponse", create2, create4);
            DimensionSet create5 = DimensionSet.create();
            create5.addDimension("pageUrl");
            create5.addDimension("isSuccess");
            create5.addDimension("requestUrl");
            create5.addDimension("mimeType");
            AppMonitor.register("WindVane", "ZCacheResponse", create2, create5);
            DimensionSet create6 = DimensionSet.create();
            create6.addDimension("url");
            create6.addDimension("Type");
            MeasureSet create7 = MeasureSet.create();
            create7.addMeasure("time");
            AppMonitor.register("WindVane", "WVPerformance", create7, create6);
        } catch (Throwable unused) {
            android.taobao.windvane.util.m.c(g, "AppMonitor not found");
            h.set(false);
        }
    }

    @Override // android.taobao.windvane.monitor.f.e
    public void onOccurWhitePage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c1bea6", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                WVWPData findDataByUrl = WVWPManager.getInstance().findDataByUrl(str);
                String str3 = g;
                android.taobao.windvane.util.m.e(str3, "onOccurWhitePage " + str + findDataByUrl);
                if (android.taobao.windvane.config.j.commonConfig.aT < Math.random()) {
                    return;
                }
                a.commitWPData(str, findDataByUrl);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // android.taobao.windvane.monitor.f.b
    public void onOccurJsError(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d3260d7", new Object[]{this, str, str2, str3});
        } else if (android.taobao.windvane.config.j.commonConfig.aS < Math.random()) {
        } else {
            a.commitJsError(str, str2, str3);
        }
    }

    @Override // android.taobao.windvane.monitor.f.a
    public void onJsBridgeReturn(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417a49f0", new Object[]{this, str, str2, str3, str4});
        } else {
            a.commitJsBridgeReturn(str, str2, str3, str4);
        }
    }

    @Override // android.taobao.windvane.monitor.f.a
    public void onMtopJsBridgeReturn(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ba1258", new Object[]{this, str, str2, str3, str4});
        } else if (TextUtils.isEmpty(str) || !h.get() || android.taobao.windvane.config.j.commonConfig.aV < Math.random()) {
        } else {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("api", str);
                create.setValue(com.taobao.mtop.wvplugin.a.RESULT_KEY, str2);
                create.setValue("url", str4);
                create.setValue("msg", str3);
                AppMonitor.Stat.commit("WindVane", "MtopPlugin", create, MeasureValueSet.create());
            } catch (Throwable th) {
                String str5 = g;
                android.taobao.windvane.util.m.e(str5, "onMtopJsBridgeReturn monitor exception:" + th);
                th.printStackTrace();
            }
        }
    }

    @Override // android.taobao.windvane.monitor.f.c
    public void onFormatRequest(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f32c4de", new Object[]{this, str, str2, str3});
        } else if (TextUtils.isEmpty(str) || !h.get() || android.taobao.windvane.config.j.commonConfig.aU < Math.random()) {
        } else {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("pageUrl", str2);
                create.setValue("method", str3);
                create.setValue("requestUrl", str);
                AppMonitor.Stat.commit("WindVane", "H5FormatRequest", create, MeasureValueSet.create());
            } catch (Throwable th) {
                String str4 = g;
                android.taobao.windvane.util.m.e(str4, "onFormatRequest monitor exception:" + th);
                th.printStackTrace();
            }
        }
    }

    @Override // android.taobao.windvane.monitor.f.c
    public void onResponse(String str, String str2, int i, boolean z, Map<String, List<String>> map) {
        List<String> list;
        String[] split;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33aefb39", new Object[]{this, str, str2, new Integer(i), new Boolean(z), map});
        } else if (TextUtils.isEmpty(str) || !h.get()) {
        } else {
            if (android.taobao.windvane.config.j.commonConfig.bD && i == -202) {
                if (URL_FILTER_PATTERN == null) {
                    synchronized (e.class) {
                        URL_FILTER_PATTERN = Pattern.compile(android.taobao.windvane.config.j.commonConfig.bE);
                    }
                }
                if (URL_FILTER_PATTERN != null && !URL_FILTER_PATTERN.matcher(str).find()) {
                    return;
                }
            }
            if (android.taobao.windvane.config.j.commonConfig.bD && i == 404 && !TextUtils.isEmpty(str) && (split = str.split("\\?")) != null && split.length > 0 && !TextUtils.isEmpty(split[0]) && split[0].contains("hybird.miniapp.taobao.com")) {
                return;
            }
            if (!(android.taobao.windvane.config.j.commonConfig.df && i == 302 && map != null && (list = map.get("x-wormhole-error")) != null && !list.isEmpty() && TextUtils.equals(list.get(0), "404"))) {
                if (android.taobao.windvane.config.j.commonConfig.bl != null) {
                    Map<String, String> map2 = android.taobao.windvane.config.j.commonConfig.bl;
                    String valueOf = String.valueOf(i);
                    if (map2.containsKey(valueOf)) {
                        if (Double.valueOf(Double.parseDouble(map2.get(valueOf))).doubleValue() < Math.random()) {
                            return;
                        }
                        if (!z2 && android.taobao.windvane.config.j.commonConfig.aU < Math.random()) {
                            return;
                        }
                    }
                }
                z2 = false;
                if (!z2) {
                    return;
                }
            }
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("pageUrl", str2);
                create.setValue("retCode", i + "");
                create.setValue("requestUrl", str);
                create.setValue("isHtml", z ? "true" : "false");
                com.taobao.application.common.d a2 = c.a();
                if (a2 != null) {
                    String a3 = a2.a("lastJumpPageSchemaUrl", "unknown");
                    if (!TextUtils.isEmpty(a3)) {
                        create.setValue("lastJumpPageUrl", a3);
                    }
                }
                if (map != null) {
                    map.remove(null);
                    TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                    treeMap.putAll(map);
                    Iterator it = new ArrayList(Arrays.asList("x-air-trace-id", "eagleeye-traceid", HttpConstant.Content_MD52, "via", "content-type")).iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        List list2 = (List) treeMap.get(str3);
                        if (list2 != null && !list2.isEmpty()) {
                            String str4 = (String) list2.get(0);
                            if (!TextUtils.isEmpty(str4)) {
                                create.setValue(str3, str4);
                            }
                        }
                    }
                }
                AppMonitor.Stat.commit("WindVane", "H5HttpResponse", create, MeasureValueSet.create());
                String str5 = g;
                android.taobao.windvane.util.m.e(str5, "onResponse retCode:" + i + " pageUrl:" + str2 + " requestUrl:" + str);
            } catch (Throwable th) {
                String str6 = g;
                android.taobao.windvane.util.m.e(str6, "onResponse monitor exception:" + th);
                th.printStackTrace();
            }
        }
    }

    @Override // android.taobao.windvane.monitor.f.InterfaceC0020f
    public void onZCacheResponse(String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b80495b", new Object[]{this, str, str2, new Boolean(z), str3});
        } else if (TextUtils.isEmpty(str) || !h.get() || android.taobao.windvane.config.j.commonConfig.aW < Math.random()) {
        } else {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("pageUrl", str2);
                create.setValue("isSuccess", z + "");
                create.setValue("requestUrl", str);
                create.setValue("mimeType", str3);
                AppMonitor.Stat.commit("WindVane", "ZCacheResponse", create, MeasureValueSet.create());
            } catch (Throwable th) {
                String str4 = g;
                android.taobao.windvane.util.m.e(str4, "onZacheResponse: occur exception:" + th);
                th.printStackTrace();
            }
        }
    }

    @Override // android.taobao.windvane.monitor.f.d
    public void recordTTI(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea48f7b", new Object[]{this, str, new Long(j)});
        } else if (TextUtils.isEmpty(str) || !h.get()) {
        } else {
            String str2 = g;
            android.taobao.windvane.util.m.b(str2, "recordTTI url:" + str + " useTime=" + j);
            if (android.taobao.windvane.config.j.commonConfig.aY < Math.random()) {
                return;
            }
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("url", str);
                create.setValue("Type", "TTI");
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("time", j);
                AppMonitor.Stat.commit("WindVane", "WVPerformance", create, create2);
            } catch (Throwable th) {
                String str3 = g;
                android.taobao.windvane.util.m.e(str3, "recordTTI monitor exception:" + th);
                th.printStackTrace();
            }
        }
    }

    @Override // android.taobao.windvane.monitor.f.d
    public void recordFSP(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49c9ee1", new Object[]{this, str, new Long(j)});
        } else if (TextUtils.isEmpty(str) || !h.get()) {
        } else {
            String str2 = g;
            android.taobao.windvane.util.m.b(str2, "recordFSP url:" + str + " useTime=" + j);
            if (android.taobao.windvane.config.j.commonConfig.aY < Math.random()) {
                return;
            }
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("url", str);
                create.setValue("Type", a.MONITOR_POINT_FSP_TIME);
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("time", j);
                AppMonitor.Stat.commit("WindVane", "WVPerformance", create, create2);
            } catch (Throwable th) {
                String str3 = g;
                android.taobao.windvane.util.m.e(str3, "recordFSP monitor exception:" + th);
                th.printStackTrace();
            }
        }
    }

    @Override // android.taobao.windvane.monitor.f.d
    public void recordDeviceCreateTime(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce85503", new Object[]{this, str, new Long(j)});
        } else if (TextUtils.isEmpty(str) || !h.get()) {
        } else {
            String str2 = g;
            android.taobao.windvane.util.m.b(str2, "recordDeviceCreateTime url:" + str + " useTime=" + j);
            if (android.taobao.windvane.config.j.commonConfig.aY < Math.random()) {
                return;
            }
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("url", str);
                create.setValue("Type", "DeviceCreate");
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("time", j);
                AppMonitor.Stat.commit("WindVane", "WVPerformance", create, create2);
            } catch (Throwable th) {
                String str3 = g;
                android.taobao.windvane.util.m.e(str3, "recordDeviceCreateTime monitor exception:" + th);
                th.printStackTrace();
            }
        }
    }
}
