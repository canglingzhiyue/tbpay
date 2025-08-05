package tb;

import android.os.Build;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.Arrays;
import java.util.Random;
import tb.mto;

/* loaded from: classes4.dex */
public class dpn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UNCOMMIT_DIMENSION = "ALINN_UNCOMMIT_VALUE";
    public static final float UNCOMMIT_MEASURE = -998.999f;

    static {
        kge.a(-1979424570);
        DimensionSet create = DimensionSet.create();
        create.addDimension("biz_name");
        create.addDimension("package_id");
        create.addDimension("alinn_version");
        MeasureSet create2 = MeasureSet.create();
        create2.addMeasure("received_count");
        AppMonitor.register("AliNN", "receive_stat", create2, create);
        DimensionSet create3 = DimensionSet.create();
        create3.addDimension("alinn_version");
        create3.addDimension("biz_name");
        create3.addDimension("package_id");
        create3.addDimension(PushMessageHelper.ERROR_TYPE);
        create3.addDimension("error_code");
        MeasureSet create4 = MeasureSet.create();
        create4.addMeasure("succeeded_count");
        create4.addMeasure("failed_count");
        Double valueOf = Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
        Double valueOf2 = Double.valueOf(120000.0d);
        create4.addMeasure(a("downloaded_time", valueOf, valueOf, valueOf2));
        AppMonitor.register("AliNN", "download_stat", create4, create3);
        DimensionSet create5 = DimensionSet.create();
        create5.addDimension("alinn_version");
        create5.addDimension("device_code");
        create5.addDimension("biz_name");
        create5.addDimension("package_id");
        create5.addDimension("model_name");
        create5.addDimension("os_version");
        create5.addDimension(kkr.CPU_ARCH);
        create5.addDimension("error_code");
        MeasureSet create6 = MeasureSet.create();
        create6.addMeasure("succeeded_count");
        create6.addMeasure("failed_count");
        create6.addMeasure(a("loaded_time", valueOf, valueOf, valueOf2));
        AppMonitor.register("AliNN", "loadmodel_stat", create6, create5);
        DimensionSet create7 = DimensionSet.create();
        create7.addDimension("alinn_version");
        create7.addDimension("os_version");
        create7.addDimension("device_code");
        create7.addDimension(kkr.CPU_ARCH);
        create7.addDimension("gpu_support");
        create7.addDimension("nnapi_support");
        create7.addDimension("biz_name");
        create7.addDimension("package_id");
        create7.addDimension("model_name");
        create7.addDimension("error_code");
        MeasureSet create8 = MeasureSet.create();
        create8.addMeasure("succeeded_count");
        create8.addMeasure("failed_count");
        create8.addMeasure(a("inferenced_time", valueOf, valueOf, Double.valueOf(60000.0d)));
        create8.addMeasure(a("memory_add", valueOf, valueOf, Double.valueOf(1.0E8d)));
        AppMonitor.register("AliNN", "inference_stat", create8, create7);
        DimensionSet create9 = DimensionSet.create();
        create9.addDimension("alinn_version");
        create9.addDimension("os_version");
        create9.addDimension("device_code");
        create9.addDimension(kkr.CPU_ARCH);
        create9.addDimension("gpu_support");
        create9.addDimension("nnapi_support");
        create9.addDimension("biz_name");
        create9.addDimension("package_id");
        create9.addDimension("model_name");
        create9.addDimension("layers_cost_time");
        MeasureSet create10 = MeasureSet.create();
        create10.addMeasure(a("layers_cost_time_sum", valueOf, valueOf, Double.valueOf(60000.0d)));
        AppMonitor.register("AliNN", "layer_stat", create10, create9);
    }

    private static DimensionValueSet a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DimensionValueSet) ipChange.ipc$dispatch("baee68f9", new Object[]{str, str2, str3}) : a(str, str2, str3, -1);
    }

    private static DimensionValueSet a(String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DimensionValueSet) ipChange.ipc$dispatch("a7e2d862", new Object[]{str, str2, str3, new Integer(i)});
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("alinn_version", "2.9.3.6");
        create.setValue("os_version", String.valueOf(Build.VERSION.SDK_INT));
        create.setValue("device_code", String.valueOf(Build.MODEL));
        create.setValue(kkr.CPU_ARCH, System.getProperty("os.arch"));
        if (i >= 0) {
            create.setValue("gpu_support", String.valueOf(i));
        }
        create.setValue("biz_name", str);
        create.setValue("package_id", str2);
        create.setValue("model_name", str3);
        return create;
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

    private static void a(DimensionValueSet dimensionValueSet, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3afee25", new Object[]{dimensionValueSet, str, str2});
        } else if ("ALINN_UNCOMMIT_VALUE".equals(str2)) {
        } else {
            dimensionValueSet.setValue(str, str2);
        }
    }

    private static Measure a(String str, Double d, Double d2, Double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Measure) ipChange.ipc$dispatch("1d83b5a8", new Object[]{str, d, d2, d3});
        }
        Measure measure = new Measure(str, d);
        if (d2 != null && d3 != null) {
            measure.setRange(d2, d3);
        }
        return measure;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("biz_name", str);
        create.setValue("package_id", str2);
        create.setValue("alinn_version", "2.9.3.6");
        MeasureValueSet create2 = MeasureValueSet.create();
        a(create2, "received_count", 1.0f);
        AppMonitor.Stat.commit("AliNN", "receive_stat", create, create2);
    }

    public static void a(String str, String str2, String str3, String str4, boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e11ddffc", new Object[]{str, str2, str3, str4, new Boolean(z), new Float(f)});
            return;
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("biz_name", str);
        create.setValue("package_id", str2);
        create.setValue("alinn_version", "2.9.3.6");
        create.setValue(PushMessageHelper.ERROR_TYPE, str3);
        if (str4.equals("ALINN_UNCOMMIT_VALUE")) {
            str4 = "0";
        }
        create.setValue("error_code", str4);
        MeasureValueSet create2 = MeasureValueSet.create();
        if (z) {
            a(create2, "succeeded_count", 1.0f);
        } else {
            a(create2, "failed_count", 1.0f);
        }
        a(create2, "downloaded_time", f);
        AppMonitor.Stat.commit("AliNN", "download_stat", create, create2);
    }

    public static void b(String str, String str2, String str3, String str4, boolean z, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e846c23d", new Object[]{str, str2, str3, str4, new Boolean(z), new Float(f)});
            return;
        }
        DimensionValueSet a2 = a(str, str2, str3);
        a(a2, "error_code", str4);
        MeasureValueSet create = MeasureValueSet.create();
        if (z) {
            a(create, "succeeded_count", 1.0f);
        } else {
            a(create, "failed_count", 1.0f);
        }
        a(create, "loaded_time", f);
        AppMonitor.Stat.commit("AliNN", "loadmodel_stat", a2, create);
    }

    public static void a(String str, String str2, String str3, String str4, float f, float f2, float f3, float f4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f32a6844", new Object[]{str, str2, str3, str4, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Boolean(z)});
            return;
        }
        DimensionValueSet a2 = a(str, str2, str3, z ? 1 : 0);
        a(a2, "error_code", str4);
        MeasureValueSet create = MeasureValueSet.create();
        a(create, "succeeded_count", f);
        a(create, "failed_count", f2);
        a(create, "inferenced_time", f3);
        if (f4 >= 0.0f) {
            a(create, "memory_add", f4);
        }
        AppMonitor.Stat.commit("AliNN", "inference_stat", a2, create);
    }

    public static void a(String str, String str2, String str3, float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("573e5a91", new Object[]{str, str2, str3, fArr});
            return;
        }
        DimensionValueSet a2 = a(str, str2, str3);
        StringBuilder sb = new StringBuilder();
        float f = 0.0f;
        for (float f2 : fArr) {
            float f3 = f2 / 1000.0f;
            sb.append(String.valueOf(f3));
            sb.append(",");
            f += f3;
        }
        a(a2, "layers_cost_time", sb.toString());
        MeasureValueSet create = MeasureValueSet.create();
        a(create, "layers_cost_time_sum", f);
        dpq.b("AliNNJava", "layerCommit: bizName=%s, packageId=%s, moduleName=%s, layerCostTimeArray=%s", str, str2, str3, Arrays.toString(fArr));
        AppMonitor.Stat.commit("AliNN", "layer_stat", a2, create);
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static Random d;

        /* renamed from: a  reason: collision with root package name */
        public float f26892a;
        public float b;
        public float[] c;

        static {
            kge.a(1944169511);
            d = new Random();
        }

        public void a(String str, String str2, String str3, String str4, float f, float f2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4184fc44", new Object[]{this, str, str2, str3, str4, new Float(f), new Float(f2), new Boolean(z)});
                return;
            }
            float[] fArr = this.c;
            if (fArr != null) {
                dpn.a(str, str2, str3, fArr);
            }
            dpq.b("AliNNJava", "inferenceCommit: bizName=%s, packageId=%s, moduleName=%s, inference cost=%.2fms, memoryIncSize=%s, errorCode=%s, gpuSupport=%b", str, str2, str3, Float.valueOf(this.b), Float.valueOf(this.f26892a), str4, Boolean.valueOf(z));
            dpn.a(str, str2, str3, str4, f, f2, this.b, this.f26892a, z);
        }
    }
}
