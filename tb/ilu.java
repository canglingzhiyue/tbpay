package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.RGCategoryInfo;
import com.taobao.android.resourceguardian.data.model.RGTypeInfo;
import com.taobao.android.resourceguardian.data.model.b;

/* loaded from: classes6.dex */
public class ilu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(564292074);
    }

    private static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        return str + ":" + str2 + ",";
    }

    private static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        try {
            AppMonitor.Counter.commit("TBResourceGuardian", str, str2, 1.0d);
        } catch (Throwable th) {
            ilt.a("TBRGMonitor", "count failed", th.toString());
        }
    }

    public static void a(String str, b bVar, boolean z, boolean z2, boolean z3, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19641531", new Object[]{str, bVar, new Boolean(z), new Boolean(z2), new Boolean(z3), str2});
            return;
        }
        b("resource_guardian_warning", (((((((((a(gkl.DP_BIZ_CONTEXT, str) + a("bizUrl", str2)) + a("warning_category", RGCategoryInfo.a(bVar.f14879a))) + a("warning_type", RGTypeInfo.a(bVar.b))) + a("warning_value", bVar.d)) + a("warning_profile_type", bVar.f)) + a("warning_level", bVar.c)) + a("warning_score", String.valueOf(bVar.e))) + a(nfc.PHA_MONITOR_DIMENSION_DOWNGRADED, String.valueOf(z))) + a("ab", String.valueOf(z2))) + a("biz_ab", String.valueOf(z3)));
    }

    public static void a(String str, String str2, int i, int i2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e629a6", new Object[]{str, str2, new Integer(i), new Integer(i2), str3});
            return;
        }
        b("resource_guardian_registration", (((a(gkl.DP_BIZ_CONTEXT, str2) + a("bizUrl", str3)) + a("registration_category", RGCategoryInfo.a(i))) + a("registration_type", RGTypeInfo.a(i2))) + a("motion", str));
    }

    public static void a(String str, int i, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6348715c", new Object[]{str, new Integer(i), new Integer(i2), str2});
            return;
        }
        b("resource_guardian_error", ((a(gkl.DP_BIZ_CONTEXT, str) + a("registration_category", RGCategoryInfo.a(i))) + a("registration_type", RGTypeInfo.a(i2))) + a("msg", str2));
    }
}
