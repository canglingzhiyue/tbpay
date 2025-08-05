package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jfn implements jfl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public jfn() {
        AppMonitor.register("crash_life", "crash_life", MeasureSet.create(), DimensionSet.create().addDimension("stage").addDimension("type").addDimension("content"));
    }

    @Override // tb.jfl
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            AppMonitor.Stat.commit("crash_life", "crash_life", DimensionValueSet.create().setValue("stage", str).setValue("type", str2).setValue("content", str3), MeasureValueSet.create());
        } catch (Throwable th) {
            jfj.b(th);
        }
    }
}
