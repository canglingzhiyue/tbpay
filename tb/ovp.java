package tb;

import android.os.SystemClock;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.WeexPopContainer;

/* loaded from: classes8.dex */
public class ovp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static long f32462a;

    static {
        kge.a(547219700);
        AppMonitor.register("Page_Home", "subscribe_remote_bundle", MeasureSet.create().addMeasure("cost"), DimensionSet.create().addDimension("stat").addDimension("success").addDimension("errorCode").addDimension("errorMsg"));
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        ldf.d("SubScribeBundleLoadMonitor", "showLoadingView");
        if (f32462a == 0) {
            f32462a = SystemClock.uptimeMillis();
        }
        a(true, WeexPopContainer.PARAMS_SHOW_LOADING, 0L, 0, "");
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        ldf.d("SubScribeBundleLoadMonitor", "installFailed: " + str);
        a(false, "loading", 0L, -1, str);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        ldf.d("SubScribeBundleLoadMonitor", "retryInstall");
        a(true, "retry_install", 0L, 0, "");
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        ldf.d("SubScribeBundleLoadMonitor", "loadingLeave");
        a(true, "loading_Leave", 0L, 0, "");
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else if (f32462a == 0) {
        } else {
            long uptimeMillis = SystemClock.uptimeMillis() - f32462a;
            ldf.d("SubScribeBundleLoadMonitor", "loadingDuration : " + uptimeMillis);
            a(true, "loading", uptimeMillis, 0, "");
            f32462a = 0L;
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        ldf.d("SubScribeBundleLoadMonitor", "selected TAB");
        a(true, gbk.TYPE_SELECTED, 0L, 0, "loading");
    }

    private static void a(boolean z, String str, long j, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64422fff", new Object[]{new Boolean(z), str, new Long(j), new Integer(i), str2});
        } else {
            AppMonitor.Stat.commit("Page_Home", "subscribe_remote_bundle", DimensionValueSet.create().setValue("stat", str).setValue("success", String.valueOf(z)).setValue("errorCode", String.valueOf(i)).setValue("errorMsg", str2), MeasureValueSet.create().setValue("cost", j));
        }
    }
}
