package tb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceInfo;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.l;
import com.taobao.android.autosize.orientation.FoldPosture;

/* loaded from: classes4.dex */
public class iuq {
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
        create.addDimension("manufacture");
        create.addDimension("support_hinge_angle_sensor");
        create.addDimension("easygo_opened");
        create.addDimension("is_in_multi_window_mode");
        create.addDimension("type_from_manufacture");
        create.addDimension("type_from_system_properties");
        create.addDimension("type_from_layout");
        create.addDimension("characteristics");
        create.addDimension("foldStatus");
        create.addDimension("isPortraitLayout");
        AppMonitor.register("auto_size", "auto_size_pv", MeasureSet.create(), create);
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
        create.setValue("manufacture", Build.MANUFACTURER.toLowerCase());
        create.setValue("device_type", TBDeviceInfo.a(TBDeviceInfo.a(application)));
        create.setValue("support_hinge_angle_sensor", String.valueOf(iuu.a().c()));
        create.setValue("easygo_opened", String.valueOf(l.b(h.a().h())));
        create.setValue("is_in_multi_window_mode", String.valueOf(l.a(h.a().h())));
        if (l.b(application)) {
            create.setValue("type_from_manufacture", String.valueOf(l.r(application)));
            create.setValue("type_from_system_properties", String.valueOf(l.b()));
            create.setValue("type_from_layout", String.valueOf(l.j(application)));
        }
        create.setValue("characteristics", b());
        create.setValue("foldStatus", FoldPosture.a(l.q(application)));
        create.setValue("isPortraitLayout", String.valueOf(h.a().b((Context) application)));
        AppMonitor.Stat.commit("auto_size", "auto_size_pv", create, MeasureValueSet.create());
    }

    private static String b() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, "ro.build.characteristics");
        } catch (Exception unused) {
            return "";
        }
    }
}
