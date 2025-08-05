package tb;

import com.alibaba.android.aura.dynamicFeature.model.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class abb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<a, Long> f25199a;

    static {
        kge.a(-1134136659);
        f25199a = new ConcurrentHashMap();
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aac472b", new Object[]{aVar});
        } else if (!a.a(aVar)) {
            arc.a().b("AURADynamicFeatureUTUtils.markDynamicFeatureBundleAlreadyInstalled:bundleInfo is invalid");
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("aura_dynamic_feature", 19997, "already_installed", aVar.d, "", null).build());
        }
    }

    public static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c7c5ca", new Object[]{aVar});
        } else if (!a.a(aVar)) {
            arc.a().b("AURADynamicFeatureUTUtils.markDynamicFeatureBundleNotInstalled:bundleInfo is invalid");
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("aura_dynamic_feature", 19997, "not_installed", aVar.d, "", null).build());
        }
    }

    public static void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ee34469", new Object[]{aVar});
        } else if (!a.a(aVar)) {
            arc.a().b("AURADynamicFeatureUTUtils.markDynamicFeatureBundleInstallSuccess:bundleInfo is invalid");
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("aura_dynamic_feature", 19997, "install_success", aVar.d, "", null).build());
        }
    }

    public static void a(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de882bf", new Object[]{aVar, str, str2});
        } else if (!a.a(aVar)) {
            arc.a().b("AURADynamicFeatureUTUtils.markDynamicFeatureBundleInstallFailed:bundleInfo is invalid");
        } else {
            String str3 = aVar.d;
            StringBuilder sb = new StringBuilder();
            sb.append("errorCode:");
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(" errorMsg:");
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("aura_dynamic_feature", 19997, "install_failed", str3, sb.toString(), null).build());
        }
    }

    public static void d(a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8fec308", new Object[]{aVar});
        } else if (!a.a(aVar)) {
            arc.a().b("AURADynamicFeatureUTUtils.markDynamicFeatureBundleStartInstall:bundleInfo is invalid");
        } else {
            Iterator<Map.Entry<a, Long>> it = f25199a.entrySet().iterator();
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
            f25199a.put(aVar, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31a41a7", new Object[]{aVar});
        } else if (!a.a(aVar)) {
            arc.a().b("AURADynamicFeatureUTUtils.markDynamicFeatureBundleEndInstall:bundleInfo is invalid");
        } else {
            for (Map.Entry<a, Long> entry : f25199a.entrySet()) {
                if (entry != null && a.a(aVar, entry.getKey())) {
                    Long value = entry.getValue();
                    if (value == null || value.longValue() <= 0) {
                        arc.a().b("AURADynamicFeatureUTUtils.markDynamicFeatureBundleEndInstall:invalid timestamp");
                        return;
                    } else {
                        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("aura_dynamic_feature", 19997, "install_time_cost", aVar.d, String.valueOf(System.currentTimeMillis() - value.longValue()), null).build());
                        return;
                    }
                }
            }
        }
    }
}
