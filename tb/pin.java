package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.b;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class pin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE = "FluidSDK";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f32689a;

    static {
        kge.a(453774791);
        f32689a = false;
        a();
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (f32689a) {
        } else {
            b();
            c();
            d();
            pio.a();
            pio.b();
            f32689a = true;
            spz.c("FluidFrameworkMonitor", "FluidFrameworkMonitor 注册 APP Monitor Stat 成功");
        }
    }

    public static void a(FluidContext fluidContext, b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594fcb87", new Object[]{fluidContext, bVar, str});
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        a(fluidContext, hashMap2);
        hashMap2.put("errorCode", bVar.b());
        hashMap2.put("errorMessage", str);
        hashMap2.put("errorArgs", bVar.a());
        AppMonitor.Stat.commit("FluidSDK", "FluidException", DimensionValueSet.fromStringMap(hashMap2), MeasureValueSet.fromStringMap(hashMap));
        spz.c("FluidFrameworkMonitor", "FluidFrameworkMonitor 上报错误码统计, errorCode = " + bVar + ", errorMessage = " + str);
    }

    public static void a(FluidContext fluidContext, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56de6cab", new Object[]{fluidContext, map});
        } else if (fluidContext == null) {
        } else {
            map.put("bizName", fluidContext.getInstanceConfig().getBizType());
            map.put(f.FLUID_SDK_REMOTE_VERSION, f.FLUID_SDK_REMOTE_VERSION_VALUE);
        }
    }

    private static void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{list});
            return;
        }
        list.add(f.FLUID_SDK_REMOTE_VERSION);
        list.add("bizName");
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a(arrayList2);
        arrayList2.add("errorCode");
        arrayList2.add("errorMessage");
        arrayList2.add("errorArgs");
        AppMonitor.register("FluidSDK", "FluidException", MeasureSet.create(arrayList), DimensionSet.create(arrayList2), true);
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("costTime");
        ArrayList arrayList2 = new ArrayList();
        a(arrayList2);
        arrayList2.add(FluidException.OBSERVER_NAME);
        arrayList2.add(FluidException.METHOD_NAME);
        AppMonitor.register("FluidSDK", "FluidObserverProfiler", MeasureSet.create(arrayList), DimensionSet.create(arrayList2), true);
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("costTime");
        ArrayList arrayList2 = new ArrayList();
        a(arrayList2);
        arrayList2.add(FluidException.SERVICE_NAME);
        arrayList2.add(FluidException.METHOD_NAME);
        AppMonitor.register("FluidSDK", "FluidServiceProfiler", MeasureSet.create(arrayList), DimensionSet.create(arrayList2), true);
    }
}
