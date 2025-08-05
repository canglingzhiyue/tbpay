package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;

/* loaded from: classes9.dex */
public class rgj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG_DOWNLOAD = "download";
    public static final String ARG_INSTALL = "install";
    public static final String ARG_MTOP_REQUEST = "request";
    public static final String ARG_PATCHDECODE = "patchdecode";
    public static final String ARG_REVUPDATE = "revupdate";

    static {
        kge.a(1561384988);
        AppMonitor.register("update_instantpatch", rfx.HOTPATCH, MeasureSet.create().addMeasure("elapsed_time"), DimensionSet.create().addDimension("toVersion").addDimension("stage").addDimension("success").addDimension("error_code").addDimension(MUSAppMonitor.ERROR_MSG));
    }

    public static void stat(boolean z, String str, long j, int i, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("159f6c18", new Object[]{new Boolean(z), str, new Long(j), new Integer(i), str2, new Long(j2)});
        } else {
            AppMonitor.Stat.commit("update_instantpatch", rfx.HOTPATCH, DimensionValueSet.create().setValue("toVersion", String.valueOf(j2)).setValue("stage", str).setValue("success", z ? "true" : "false").setValue("error_code", String.valueOf(i)).setValue(MUSAppMonitor.ERROR_MSG, str2), MeasureValueSet.create().setValue("elapsed_time", j));
        }
    }
}
