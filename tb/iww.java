package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class iww {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-113296733);
        AppMonitor.register("Shake", "shake_remote_bundle", MeasureSet.create().addMeasure("cost"), DimensionSet.create().addDimension("stat").addDimension("success").addDimension("errorCode").addDimension("errorMsg"));
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        ixb.a("SubScribeBundleLoadMonitor", "installFailed: " + str);
        a(false, "loading", 0L, -1, str);
    }

    private static void a(boolean z, String str, long j, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64422fff", new Object[]{new Boolean(z), str, new Long(j), new Integer(i), str2});
        } else {
            AppMonitor.Stat.commit("Shake", "shake_remote_bundle", DimensionValueSet.create().setValue("stat", str).setValue("success", String.valueOf(z)).setValue("errorCode", String.valueOf(i)).setValue("errorMsg", str2), MeasureValueSet.create().setValue("cost", j));
        }
    }
}
