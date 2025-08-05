package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.AttributionReporter;
import com.taobao.runtimepermission.d;
import com.taobao.weex.common.Constants;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.Arrays;

/* loaded from: classes7.dex */
public class nmn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension("BizName");
        create.addDimension("PermissionName");
        create.addDimension("PermissionStatus");
        create.addDimension(arz.KEY_MAPPING_CODE);
        AppMonitor.register("RuntimePermission", "BizPermissionReq", MeasureSet.create(), create);
        DimensionSet create2 = DimensionSet.create();
        create2.addDimension("BizName");
        create2.addDimension("PermissionName");
        create2.addDimension("PermissionStatus");
        create2.addDimension(arz.KEY_MAPPING_CODE);
        AppMonitor.register("RuntimePermission", "BizPermissionCheck", MeasureSet.create(), create2);
        DimensionSet create3 = DimensionSet.create();
        create3.addDimension("BizName");
        create3.addDimension("PermissionName");
        AppMonitor.register("RuntimePermission", "BizPermissionUniform", MeasureSet.create(), create3);
    }

    private static void a(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bfab7d", new Object[]{str, str2, str3, new Integer(i)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("BizName", str);
        create.setValue("PermissionName", str3);
        create.setValue("PermissionStatus", String.valueOf(i));
        create.setValue(arz.KEY_MAPPING_CODE, str2);
        AppMonitor.Stat.commit("RuntimePermission", "BizPermissionReq", create, MeasureValueSet.create());
    }

    private static void b(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c376dc", new Object[]{str, str2, str3, new Integer(i)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("BizName", str);
        create.setValue("PermissionName", str3);
        create.setValue("PermissionStatus", String.valueOf(i));
        create.setValue(arz.KEY_MAPPING_CODE, str2);
        AppMonitor.Stat.commit("RuntimePermission", "BizPermissionCheck", create, MeasureValueSet.create());
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("BizName", str);
        create.setValue("PermissionName", str2);
        AppMonitor.Stat.commit("RuntimePermission", "BizPermissionUniform", create, MeasureValueSet.create());
    }

    public static void a(String str, String str2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4db6d0a2", new Object[]{str, str2, dVar});
        } else if (TextUtils.isEmpty(str) || dVar == null || dVar.f18987a == null || dVar.b == null) {
            tfr.b("AppMonitorUtil", "commitPermissionCheckResult: param is empty, exit.");
        } else {
            if (str2 == null) {
                str2 = "";
            }
            for (int i = 0; i < dVar.f18987a.length; i++) {
                try {
                    if (i > dVar.b.length) {
                        tfr.b("AppMonitorUtil", "commitPermissionCheckResult: index is out of boundary, exit.");
                    }
                    b(str, str2, dVar.f18987a[i], dVar.b[i]);
                } catch (Throwable th) {
                    tfr.b("AppMonitorUtil", "commitPermissionCheckResult: commit monitor with exception " + th);
                    return;
                }
            }
        }
    }

    public static void b(String str, String str2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c2b7a3", new Object[]{str, str2, dVar});
        } else if (TextUtils.isEmpty(str) || dVar == null || dVar.f18987a == null || dVar.b == null) {
            tfr.b("AppMonitorUtil", "commitPermissionCheckResult: param is empty, exit.");
        } else {
            if (str2 == null) {
                str2 = "";
            }
            for (int i = 0; i < dVar.f18987a.length; i++) {
                try {
                    if (i > dVar.b.length) {
                        tfr.b("AppMonitorUtil", "commitPermissionCheckResult: index is out of boundary, exit.");
                    }
                    a(str, str2, dVar.f18987a[i], dVar.b[i]);
                } catch (Throwable th) {
                    tfr.b("AppMonitorUtil", "commitPermissionReqResult: commit monitor with exception " + th);
                    return;
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f31573a;

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f31573a = System.currentTimeMillis();
            }
        }

        public void a(String str, String str2, String[] strArr, int[] iArr) {
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9820071", new Object[]{this, str, str2, strArr, iArr});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f31573a;
            String str4 = TextUtils.isEmpty(str) ? "default" : str;
            String str5 = str2 == null ? "" : str2;
            for (int i = 0; i < strArr.length; i++) {
                if (i < iArr.length) {
                    str3 = iArr[i] == 0 ? "agree" : "reject";
                } else {
                    str3 = "unknown";
                }
                a(str4, str5, strArr[i], str3, currentTimeMillis);
            }
        }

        public void a(String str, String str2, String[] strArr, boolean z) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26800911", new Object[]{this, str, str2, strArr, new Boolean(z)});
                return;
            }
            int[] iArr = new int[strArr.length];
            if (!z) {
                i = -1;
            }
            Arrays.fill(iArr, i);
            a(str, str2, strArr, iArr);
        }

        private void a(String str, String str2, String str3, String str4, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd745434", new Object[]{this, str, str2, str3, str4, new Long(j)});
                return;
            }
            UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("user_authorization");
            uTCustomHitBuilder.setEventPage("privacy_compliance");
            uTCustomHitBuilder.setProperty("action", str4);
            uTCustomHitBuilder.setProperty("bizCode", str);
            uTCustomHitBuilder.setProperty(arz.KEY_MAPPING_CODE, str2);
            uTCustomHitBuilder.setProperty(AttributionReporter.SYSTEM_PERMISSION, str3);
            uTCustomHitBuilder.setProperty(Constants.Name.INTERVAL, Long.toString(j));
            UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
        }
    }
}
