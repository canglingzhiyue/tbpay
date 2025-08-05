package tb;

import com.alibaba.android.aura.dynamicFeature.model.a;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class abc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static UMLinkLogInterface f25200a;

    static {
        kge.a(210425216);
        f25200a = bpp.a();
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aac472b", new Object[]{aVar});
        } else if (!a.a(aVar)) {
            arc.a().b("AURADynamicFeatureUmbrellaMonitorUtils.monitorDynamicFeatureBundleNotInstalled:bundleInfo invalid");
        } else {
            String str = aVar.f2138a;
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            String c = aar.a().c(aVar);
            if (c == null) {
                c = "";
            }
            hashMap2.put("DynamicFeatureMD5", c);
            f25200a.logError("AURAMonitor", "DynamicFeature", str, null, "NotInstalled", "NotInstalled", hashMap, com.alibaba.android.umbrella.link.export.a.a(hashMap2));
            f25200a.commitFailure(str, "AURAMonitor", "1.0", "AURAMonitor", "DynamicFeature", hashMap2, "NotInstalled", "NotInstalled");
        }
    }

    public static void a(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de882bf", new Object[]{aVar, str, str2});
        } else if (!a.a(aVar)) {
            arc.a().b("AURADynamicFeatureUmbrellaMonitorUtils.monitorDynamicFeatureBundleInstallFailed:bundleInfo invalid");
        } else {
            String str3 = aVar.f2138a;
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            String c = aar.a().c(aVar);
            if (c == null) {
                c = "";
            }
            hashMap2.put("DynamicFeatureMD5", c);
            if (str == null) {
                str = "";
            }
            hashMap2.put("errorCode", str);
            if (str2 == null) {
                str2 = "";
            }
            hashMap2.put("errorMsg", str2);
            f25200a.logError("AURAMonitor", "DynamicFeature", str3, null, "InstallFailed", "InstallFailed", hashMap, com.alibaba.android.umbrella.link.export.a.a(hashMap2));
        }
    }
}
