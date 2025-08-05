package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.android.fluid.launcher.task.ScheduleTask;
import com.taobao.application.common.c;
import com.taobao.application.common.d;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class rhi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE = "FluidSDK";

    static {
        kge.a(-1902907297);
        a();
    }

    public static void a(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ec118ca", new Object[]{scheduleTask});
        } else if (scheduleTask == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("costTime", String.valueOf(scheduleTask.k()));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("bizName", scheduleTask.h());
            hashMap2.put("deviceLevel", String.valueOf(b()));
            hashMap2.put(BaseMnnRunUnit.KEY_TASK_NAME, scheduleTask.f());
            hashMap2.put("taskState", scheduleTask.j());
            hashMap2.put("delayTime", String.valueOf(scheduleTask.m()));
            hashMap2.put("threadMode", scheduleTask.l());
            AppMonitor.Stat.commit("FluidSDK", "FluidLauncherTask", DimensionValueSet.fromStringMap(hashMap2), MeasureValueSet.fromStringMap(hashMap));
        }
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("costTime");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("bizName");
        arrayList2.add("deviceLevel");
        arrayList2.add(BaseMnnRunUnit.KEY_TASK_NAME);
        arrayList2.add("taskState");
        arrayList2.add("delayTime");
        arrayList2.add("threadMode");
        AppMonitor.register("FluidSDK", "FluidLauncherTask", MeasureSet.create(arrayList), DimensionSet.create(arrayList2), true);
    }

    private static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        d a2 = c.a();
        if (a2 == null) {
            return -1;
        }
        return a2.a("deviceLevel", -1);
    }
}
