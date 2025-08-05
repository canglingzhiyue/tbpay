package tb;

import com.alibaba.android.aura.dynamicFeature.model.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.common.util.k;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import tb.abd;
import tb.abe;
import tb.ara;

/* loaded from: classes2.dex */
public class aba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static arb f25198a;
    private static Map<a, Long> b;
    private static OrangeConfig c;

    static {
        kge.a(-1470048601);
        f25198a = arb.a();
        b = new ConcurrentHashMap();
        c = OrangeConfig.getInstance();
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aac472b", new Object[]{aVar});
            return;
        }
        float a2 = a();
        if (!a(a2)) {
            return;
        }
        if (!a.a(aVar)) {
            arc.a().b("AURADynamicFeatureJsTrackerUtils.monitorDynamicFeatureBundleAlreadyInstalled:bundleInfo invalid");
            return;
        }
        ara.a a3 = new ara.a().a(aVar.d).b("26684-tracker").e("install_status").c("already_installed").a((Boolean) true).f(aar.a().c(aVar)).a(a2);
        f25198a.a(a3.d(k.HTTP_PREFIX + aVar.f2138a).a());
    }

    public static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c7c5ca", new Object[]{aVar});
            return;
        }
        float a2 = a();
        if (!a(a2)) {
            return;
        }
        if (!a.a(aVar)) {
            arc.a().b("AURADynamicFeatureJsTrackerUtils.monitorDynamicFeatureBundleNotInstalled:bundleInfo invalid");
            return;
        }
        ara.a a3 = new ara.a().a(aVar.d).b("26684-tracker").e("install_status").c("not_install").a((Boolean) false).f(aar.a().c(aVar)).a(a2);
        f25198a.a(a3.d(k.HTTP_PREFIX + aVar.f2138a).a());
    }

    public static void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ee34469", new Object[]{aVar});
            return;
        }
        float a2 = a();
        if (!a(a2)) {
            return;
        }
        if (!a.a(aVar)) {
            arc.a().b("AURADynamicFeatureJsTrackerUtils.monitorDynamicFeatureBundleInstallSuccess:bundleInfo invalid");
            return;
        }
        ara.a a3 = new ara.a().a(aVar.d).b("26684-tracker").e("install_success_status").c("success").a((Boolean) true).f(aar.a().c(aVar)).a(a2);
        f25198a.a(a3.d(k.HTTP_PREFIX + aVar.f2138a).a());
    }

    public static void a(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de882bf", new Object[]{aVar, str, str2});
            return;
        }
        float a2 = a();
        if (!a(a2)) {
            return;
        }
        if (!a.a(aVar)) {
            arc.a().b("AURADynamicFeatureJsTrackerUtils.monitorDynamicFeatureBundleInstallFailed:bundleInfo invalid");
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("_");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        String sb2 = sb.toString();
        ara.a a3 = new ara.a().a(aVar.d).b("26684-tracker").e("install_success_status").c(sb2).a((Boolean) false).f(aar.a().c(aVar)).a(a2);
        f25198a.a(a3.d(k.HTTP_PREFIX + aVar.f2138a).a());
        f25198a.a(new abd.a().a(aVar.d).b("26684-tracker").c(sb2).a(a2).a());
    }

    public static void d(a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8fec308", new Object[]{aVar});
        } else if (!a.a(aVar)) {
            arc.a().b("AURADynamicFeatureJsTrackerUtils.markDynamicFeatureBundleStartInstall:bundleInfo is invalid");
        } else {
            Iterator<Map.Entry<a, Long>> it = b.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<a, Long> next = it.next();
                    if (next != null && a.a(aVar, next.getKey())) {
                        next.setValue(Long.valueOf(System.currentTimeMillis()));
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                return;
            }
            b.put(aVar, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31a41a7", new Object[]{aVar});
        } else if (!a.a(aVar)) {
            arc.a().b("AURADynamicFeatureJsTrackerUtils.markDynamicFeatureBundleEndInstall:bundleInfo is invalid");
        } else {
            for (Map.Entry<a, Long> entry : b.entrySet()) {
                if (entry != null && a.a(aVar, entry.getKey())) {
                    Long value = entry.getValue();
                    if (value == null || value.longValue() <= 0) {
                        arc.a().b("AURADynamicFeatureJsTrackerUtils.markDynamicFeatureBundleEndInstall:invalid timestamp");
                        return;
                    }
                    abe.a b2 = new abe.a().a(aVar.d).b(String.valueOf(System.currentTimeMillis() - value.longValue()));
                    f25198a.a(b2.c(k.HTTP_PREFIX + aVar.f2138a).a());
                    return;
                }
            }
        }
    }

    private static float a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c58", new Object[0])).floatValue();
        }
        try {
            return Float.valueOf(c.getConfig("aura_framework", "dynamic_feature_js_tracker_sampling", "0.5")).floatValue();
        } catch (Exception unused) {
            return 0.5f;
        }
    }

    private static boolean a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821885c", new Object[]{new Float(f)})).booleanValue() : f > new Random().nextFloat();
    }
}
