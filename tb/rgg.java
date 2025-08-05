package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;

/* loaded from: classes9.dex */
public class rgg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG_DOWNLOAD = "download";
    public static final String ARG_ENV_CHECK = "envcheck";
    public static final String ARG_EXTRAT = "extract";
    public static final String ARG_INSTALL = "install";
    public static final String ARG_NETWORK_CHECK = "networkcheck";
    public static final String ARG_REVUPDATE = "revupdate";
    public static final String ARG_VERIFY = "verify";
    public static Context context;
    public static SharedPreferences preferences;

    static {
        kge.a(-178132203);
        AppMonitor.register("update_featureupdate", "featureupdate", MeasureSet.create(), DimensionSet.create().addDimension("toVersion").addDimension("stage").addDimension("cost").addDimension("success").addDimension("error_code").addDimension(MUSAppMonitor.ERROR_MSG));
        Application application = rfy.sContext;
        context = application;
        preferences = application.getSharedPreferences("featureupdate", 0);
    }

    public static void stat(boolean z, String str, long j, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba2d06f6", new Object[]{new Boolean(z), str, new Long(j), new Integer(i), str2, str3});
        } else {
            AppMonitor.Stat.commit("update_featureupdate", "featureupdate", DimensionValueSet.create().setValue("toVersion", String.valueOf(str3)).setValue("stage", str).setValue("cost", String.valueOf(j)).setValue("success", z ? "true" : "false").setValue("error_code", String.valueOf(i)).setValue(MUSAppMonitor.ERROR_MSG, str2), MeasureValueSet.create());
        }
    }
}
