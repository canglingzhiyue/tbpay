package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.WeexPopContainer;
import com.taobao.android.behavix.feature.a;
import com.taobao.android.remoteso.log.RSoLog;

/* loaded from: classes6.dex */
public final class iif {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        AppMonitor.register("remote", "remote_loading", MeasureSet.create().addMeasure("cost"), DimensionSet.create().addDimension("stat").addDimension(a.FEATURE_NAME).addDimension("success").addDimension("errorCode").addDimension("errorMsg"));
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        RSoLog.c("remo,LoadingMonitor showLoadingView, feature=" + str);
        a(true, WeexPopContainer.PARAMS_SHOW_LOADING, str, 0L, 0, "");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        RSoLog.c("remo,LoadingMonitor installFailed: " + str2);
        a(false, "loading", str, 0L, -1, str2);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        RSoLog.c("remo,LoadingMonitor retryInstall");
        a(true, "retry_install", str, 0L, 0, "");
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            return;
        }
        RSoLog.c("remo,LoadingMonitor loadingLeave");
        a(true, "loading_Leave", str, 0L, 0, "");
    }

    public static void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{str, new Long(j)});
            return;
        }
        RSoLog.c("remo,LoadingMonitor loadingDuration : " + j);
        a(true, "loading", str, j, 0, "");
    }

    private static void a(boolean z, String str, String str2, long j, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd106f49", new Object[]{new Boolean(z), str, str2, new Long(j), new Integer(i), str3});
        } else {
            AppMonitor.Stat.commit("remote", "remote_loading", DimensionValueSet.create().setValue("stat", str).setValue(a.FEATURE_NAME, str2).setValue("success", String.valueOf(z)).setValue("errorCode", String.valueOf(i)).setValue("errorMsg", str3), MeasureValueSet.create().setValue("cost", j));
        }
    }
}
