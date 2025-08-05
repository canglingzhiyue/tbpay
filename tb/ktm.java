package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes7.dex */
public class ktm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MEASURE_BATCH_COUNT = "batch_count";
    public static final String MEASURE_COMPRESS_TIME = "compress_time";
    public static final String MEASURE_TOTAL_TIME = "totalTime";

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f30304a;

    static {
        kge.a(1119929655);
        f30304a = false;
    }

    public static void a(String str, boolean z, Map<String, Long> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("881e4e63", new Object[]{str, new Boolean(z), map});
        } else if (!map.isEmpty() && !TextUtils.isEmpty(str)) {
            if (!f30304a) {
                synchronized (ktm.class) {
                    if (!f30304a) {
                        MeasureSet create = MeasureSet.create();
                        create.addMeasure("totalTime");
                        create.addMeasure(MEASURE_BATCH_COUNT);
                        create.addMeasure(MEASURE_COMPRESS_TIME);
                        DimensionSet create2 = DimensionSet.create();
                        create2.addDimension("eventName");
                        create2.addDimension("isSuccess");
                        AppMonitor.register("Highway", "upload", create, create2);
                        f30304a = true;
                    }
                }
            }
            DimensionValueSet create3 = DimensionValueSet.create();
            create3.setValue("eventName", str);
            create3.setValue("isSuccess", z ? "1" : "0");
            MeasureValueSet create4 = MeasureValueSet.create();
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                create4.setValue(entry.getKey(), entry.getValue().longValue());
            }
            AppMonitor.Stat.commit("Highway", "upload", create3, create4);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (TextUtils.isEmpty(str2)) {
                str2 = "unknown";
            }
            AppMonitor.Alarm.commitFail("Highway", "highwayError", str, str2);
        }
    }
}
