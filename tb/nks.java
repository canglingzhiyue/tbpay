package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.cus.CusDataController;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class nks {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_POINT_CLEAR_FILES = "ClearApkFiles";
    public static final String MONITOR_POINT_FINISH = "PreDownloadFinish";
    public static final String MONITOR_POINT_INSTALL_APK = "PreDownloadInstallApk";
    public static final String MONITOR_POINT_START = "PreDownloadStart";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f31537a;

    static {
        kge.a(1061194825);
        f31537a = false;
    }

    public static void a(String str, CusDataController.ApkDownloadContext apkDownloadContext, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be781c1f", new Object[]{str, apkDownloadContext, map});
            return;
        }
        try {
            if (!f31537a) {
                b();
            }
            map.put("newAppVersion", apkDownloadContext != null ? apkDownloadContext.appVersion : "");
            map.put("downloadUrl", apkDownloadContext != null ? apkDownloadContext.downloadUrl : "");
            DimensionValueSet create = DimensionValueSet.create();
            create.setMap(map);
            AppMonitor.Stat.commit("ApkUpdater", str, create, MeasureValueSet.create());
            c.b("ApkUpdater", "", "[point]" + str + "-[arg]" + map);
        } catch (Throwable th) {
            c.a("AppVersionUtils.trackAM.error.", th);
        }
    }

    public static void b(String str, CusDataController.ApkDownloadContext apkDownloadContext, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a2a4e0", new Object[]{str, apkDownloadContext, map});
            return;
        }
        try {
            String str2 = apkDownloadContext != null ? apkDownloadContext.appVersion : "";
            String str3 = apkDownloadContext != null ? apkDownloadContext.downloadUrl : "";
            if (map == null) {
                map = new HashMap<>();
            }
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_ApkUpdate", 19999, str, str2, str3, map).build());
        } catch (Throwable th) {
            c.a("AppVersionUtils.trackUT.error.", th);
        }
    }

    private static DimensionSet a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DimensionSet) ipChange.ipc$dispatch("5821678c", new Object[0]) : DimensionSet.create().addDimension("newAppVersion").addDimension("downloadUrl");
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            f31537a = true;
            AppMonitor.register("ApkUpdater", MONITOR_POINT_START, MeasureSet.create(), a().addDimension("errorCode").addDimension("success"), true);
            AppMonitor.register("ApkUpdater", MONITOR_POINT_FINISH, MeasureSet.create(), a().addDimension("errorCode").addDimension("success"), true);
            AppMonitor.register("ApkUpdater", MONITOR_POINT_INSTALL_APK, MeasureSet.create(), a().addDimension("errorCode"), true);
            AppMonitor.register("ApkUpdater", MONITOR_POINT_CLEAR_FILES, MeasureSet.create(), a().addDimension("fileName").addDimension("filePath"), true);
        } catch (Throwable th) {
            c.a("AppVersionUtils.registerAppMonitor.error.", th);
        }
    }
}
