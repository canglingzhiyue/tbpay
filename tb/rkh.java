package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public final class rkh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_LAUNCH = "AppLaunch";
    public static final String DOWNLOAD_STORAGE = "DownloadStorage";

    static {
        kge.a(-523721301);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess("BaichuanLink", str, str2);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail("BaichuanLink", str, str2, str3, str4);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        AppMonitor.register("BaichuanLink", DOWNLOAD_STORAGE, MeasureSet.create(), DimensionSet.create().addDimension("fileNumber").addDimension("sizeRange"));
    }

    public static void a(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11c727", new Object[]{new Long(j), new Integer(i)});
        } else {
            AppMonitor.Stat.commit("BaichuanLink", DOWNLOAD_STORAGE, DimensionValueSet.create().setValue("fileNumber", String.valueOf(i)).setValue("sizeRange", a(j)), MeasureValueSet.create());
        }
    }

    private static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        if (0 == j) {
            return "0";
        }
        if (j < 104857600) {
            return "<100M";
        }
        if (j < 209715200) {
            return "100M<n<200M";
        }
        if (j < 524288000) {
            return "200M<n<500M";
        }
        if (j < 838860800) {
            return "500M<n<800M";
        }
        int i = (j > 1073741824L ? 1 : (j == 1073741824L ? 0 : -1));
        if (i < 0) {
            return "800M<n<1G";
        }
        if (j < -2147483648L) {
            return "1G<n<2G";
        }
        if (j < -1073741824) {
            return "2G<n<3G";
        }
        if (j < 0) {
            return "3G<n<4G";
        }
        if (i < 0) {
            return "4G<n<5G";
        }
        return (j / 1048576) + "M";
    }
}
