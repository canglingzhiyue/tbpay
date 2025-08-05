package tb;

import android.app.Application;
import android.os.Build;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceInfo;

/* loaded from: classes4.dex */
public class isn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension("device_brand");
        create.addDimension("device_model");
        create.addDimension("device_type");
        AppMonitor.register("auto_size", "auto_size_device_info", MeasureSet.create(), create);
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("device_brand", Build.BRAND);
        create.setValue("device_model", Build.MODEL);
        create.setValue("device_type", TBDeviceInfo.a(TBDeviceInfo.a(application)));
        AppMonitor.Stat.commit("auto_size", "auto_size_device_info", create, MeasureValueSet.create());
    }
}
