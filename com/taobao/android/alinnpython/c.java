package com.taobao.android.alinnpython;

import android.os.Build;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import tb.dqy;
import tb.kkr;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UNCOMMIT_DIMENSION = "ALINN_UNCOMMIT_VALUE";
    public static final float UNCOMMIT_MEASURE = -998.999f;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9027a = false;
    private static boolean b = false;

    static {
        try {
            Class.forName(OConstant.REFLECT_APPMONITOR);
            f9027a = true;
        } catch (ClassNotFoundException unused) {
            f9027a = false;
        }
        if (f9027a) {
            try {
                DimensionSet create = DimensionSet.create();
                create.addDimension("script_type");
                create.addDimension("script_version");
                create.addDimension("os_version");
                create.addDimension("device_code");
                create.addDimension(kkr.CPU_ARCH);
                create.addDimension("biz_name");
                create.addDimension("module_name");
                create.addDimension("error_code");
                MeasureSet create2 = MeasureSet.create();
                create2.addMeasure("succeeded_count");
                create2.addMeasure("failed_count");
                create2.addMeasure("time_cost");
                create2.addMeasure("memory_add");
                AppMonitor.register("AliNNPython", "script_stat", create2, create);
            } catch (Throwable unused2) {
                f9027a = false;
            }
        }
        try {
            Class.forName("com.alibaba.ha.bizerrorreporter.e");
            b = true;
        } catch (Throwable unused3) {
            b = false;
        }
    }

    private static DimensionValueSet a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionValueSet) ipChange.ipc$dispatch("5c7b1c03", new Object[]{str, str2});
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("script_type", dqy.TYPE);
        create.setValue("script_version", "2.4.1.25-android");
        create.setValue("os_version", String.valueOf(Build.VERSION.SDK_INT));
        create.setValue("device_code", String.valueOf(Build.MODEL));
        create.setValue(kkr.CPU_ARCH, System.getProperty("os.arch"));
        create.setValue("biz_name", str);
        create.setValue("module_name", str2);
        return create;
    }

    private static void a(DimensionValueSet dimensionValueSet, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3afee25", new Object[]{dimensionValueSet, str, str2});
        } else if ("ALINN_UNCOMMIT_VALUE".equals(str2)) {
        } else {
            dimensionValueSet.setValue(str, str2);
        }
    }

    private static void a(MeasureValueSet measureValueSet, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf9813fd", new Object[]{measureValueSet, str, new Float(f)});
        } else if (f == -998.999f) {
        } else {
            measureValueSet.setValue(str, f);
        }
    }

    public static void a(String str, String str2, String str3, boolean z, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907f47ce", new Object[]{str, str2, str3, new Boolean(z), new Float(f), new Float(f2)});
        } else if (!f9027a) {
        } else {
            DimensionValueSet a2 = a(str, str2);
            a(a2, "error_code", str3);
            MeasureValueSet create = MeasureValueSet.create();
            if (z) {
                a(create, "succeeded_count", 1.0f);
            } else {
                a(create, "failed_count", 1.0f);
            }
            a(create, "time_cost", f);
            a(create, "memory_add", f2);
            AppMonitor.Stat.commit("AliNNPython", "script_stat", a2, create);
        }
    }
}
