package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.gateway.util.o;

/* loaded from: classes8.dex */
public class oye {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f32479a;
    private static boolean b;
    private static boolean c;

    static {
        kge.a(-1722166193);
        f32479a = false;
        b = false;
        c = false;
    }

    public static void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{str, new Long(j)});
            return;
        }
        AppMonitor.Stat.commit("TaoBao_ScanCode", "recognitionTime", DimensionValueSet.create().setValue("maType", str), MeasureValueSet.create().setValue("recognitionTime", j));
        o.a("Monitor:recognitionTime->[recognitionTime]:%s,[maType]:%s", Long.valueOf(j), str);
    }
}
