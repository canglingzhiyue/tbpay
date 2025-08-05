package tb;

import android.app.Application;
import android.os.Build;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.c;
import com.taobao.tao.log.TLog;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class gvd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        TLog.loge(gve.MODULE, gve.TAG, "NegativeMonitor reached");
        DimensionSet create = DimensionSet.create();
        create.addDimension("device_brand");
        create.addDimension("device_model");
        create.addDimension("device_level");
        create.addDimension("startup_component");
        create.addDimension("version_updated");
        MeasureSet.create().addMeasure("bg_deep_idle_reached");
        AppMonitor.register(gve.MODULE, gve.TAG, MeasureSet.create(), create);
        String c = gvk.c(gve.a());
        DimensionValueSet create2 = DimensionValueSet.create();
        create2.setValue("device_brand", Build.BRAND);
        create2.setValue("device_model", Build.MODEL);
        create2.setValue("startup_component", c);
        create2.setValue("version_updated", gvs.f28523a ? "1" : "0");
        create2.setValue("device_level", String.valueOf(c.a().a("deviceLevel", -1)));
        MeasureValueSet create3 = MeasureValueSet.create();
        create3.setValue("bg_deep_idle_reached", 1.0d);
        AppMonitor.Stat.commit(gve.MODULE, gve.TAG, create2, create3);
    }
}
