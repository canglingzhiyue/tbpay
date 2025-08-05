package com.etao.feimagesearch.mnn.utils;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.utils.MnnUtils;
import com.etao.feimagesearch.nn.NetConfig;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.mnncv.MNNCVImage;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.cox;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CLIENT_EXP_CONFIG_STRING = "_clientExpConfigString";
    public static final String KEY_CONFIG_STRING = "_configString";

    /* renamed from: a  reason: collision with root package name */
    public static final String f6802a = "_image";
    public static final String b = "_image_height";
    public static final String c = "_image_width";
    public static final String d = "_format";
    public static final String e = "_strategy";
    public static final String f = "_actions";
    public static final String g = "_cid";
    private static final int h;
    public static final String i = "_querySrc";
    public static final String j = "_userZoomed";
    public static final String k = "_deviceLevel";

    static {
        kge.a(-416385809);
        h = com.etao.feimagesearch.config.b.aP();
        b();
        a();
        d();
        g();
    }

    public static String a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        Object obj = map.get("extraInfo");
        if (obj instanceof String) {
            String str = (String) obj;
            try {
                return str.length() > h ? str.substring(0, h) : str;
            } catch (StringIndexOutOfBoundsException unused) {
            }
        }
        return "";
    }

    public static HashMap<String, Object> a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("6c8b42a9", new Object[]{bitmap}) : a(bitmap, f6802a);
    }

    private static HashMap<String, Object> a(Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("41b6c873", new Object[]{bitmap, str});
        }
        MnnUtils.MnnImageFormat a2 = MnnUtils.a(bitmap);
        if (a2 == null) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<>(10);
        hashMap.put(b, Integer.valueOf(bitmap.getHeight()));
        hashMap.put(c, Integer.valueOf(bitmap.getWidth()));
        hashMap.put(d, Integer.valueOf(a2.getMnnFormatValue()));
        hashMap.put(str, new MNNCVImage(bitmap));
        return hashMap;
    }

    private static HashMap<String, String> a(NetConfig netConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("5222a59d", new Object[]{netConfig});
        }
        HashMap<String, String> hashMap = new HashMap<>(4);
        if (netConfig != null) {
            hashMap.put("name", netConfig.name);
            hashMap.put("type", netConfig.type);
        }
        return hashMap;
    }

    private static HashMap<String, String> a(NetConfig netConfig, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("306028b1", new Object[]{netConfig, str, str2});
        }
        HashMap<String, String> a2 = a(netConfig);
        a2.put("errorCode", str);
        a2.put("errorMsg", str2);
        return a2;
    }

    private static HashMap<String, Double> a(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f8602dbf", new Object[]{new Long(j2)});
        }
        HashMap<String, Double> hashMap = new HashMap<>(4);
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Double.valueOf(j2));
        return hashMap;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            cox.a("PltAlgo", "mnnRunUnitBuildSuccess", Collections.singletonList(HiAnalyticsConstant.BI_KEY_COST_TIME), Arrays.asList("name", "type"));
        }
    }

    public static void a(NetConfig netConfig, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7ae34a", new Object[]{netConfig, new Long(j2)});
        } else {
            cox.a("PltAlgo", "mnnRunUnitBuildSuccess", a(j2), a(netConfig));
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            cox.a("PltAlgo", "mnnRunUnitBuildFailed", Collections.singletonList(HiAnalyticsConstant.BI_KEY_COST_TIME), Arrays.asList("name", "type", "errorCode", "errorMsg"));
        }
    }

    public static void a(NetConfig netConfig, long j2, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ebbb5e", new Object[]{netConfig, new Long(j2), str, str2});
        } else {
            cox.a("PltAlgo", "mnnRunUnitBuildFailed", a(j2), a(netConfig, str, str2));
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            cox.a("PltAlgo", "alinnRunUnitBuildSuccess", Collections.singletonList(HiAnalyticsConstant.BI_KEY_COST_TIME), Arrays.asList("name", "type"));
        }
    }

    public static void b(NetConfig netConfig, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3bc520b", new Object[]{netConfig, new Long(j2)});
        } else {
            cox.a("PltAlgo", "alinnRunUnitBuildSuccess", a(j2), a(netConfig));
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
        } else {
            cox.a("PltAlgo", "mnnAutoDetectResult", Arrays.asList(HiAnalyticsConstant.BI_KEY_COST_TIME, "call_algo_times"), Arrays.asList("process_result", "success", "use_origin_image"));
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else {
            cox.a("PltAlgo", "alinnAutoDetectResult", Arrays.asList(HiAnalyticsConstant.BI_KEY_COST_TIME, "call_algo_times"), Arrays.asList("process_result", "success", "use_origin_image"));
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
        } else {
            cox.a("PltAlgo", "mnnAdvanceDetectionResult", Arrays.asList(HiAnalyticsConstant.BI_KEY_COST_TIME, "call_algo_times"), Arrays.asList("process_result", "success", "use_origin_image"));
        }
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("189ade64", new Object[]{bVar});
        } else {
            a("alinnAutoDetectResult", bVar);
        }
    }

    public static void a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1fe212e", new Object[]{str, bVar});
            return;
        }
        HashMap hashMap = new HashMap(5);
        hashMap.put(HiAnalyticsConstant.BI_KEY_COST_TIME, Double.valueOf(bVar.c()));
        hashMap.put("call_algo_times", Double.valueOf(bVar.d()));
        HashMap hashMap2 = new HashMap(5);
        hashMap2.put("process_result", bVar.b());
        hashMap2.put("success", "" + bVar.a());
        hashMap2.put("use_origin_image", "" + bVar.e());
        cox.a("PltAlgo", str, hashMap, hashMap2);
    }
}
