package tb;

import android.content.Context;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.export.h;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.mto;

/* loaded from: classes.dex */
public class rpf implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f33298a = new AtomicBoolean(true);

    @Override // com.uploader.export.h
    public void a(String str, String str2, Set<String> set, Set<String> set2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85aefb8", new Object[]{this, str, str2, set, set2, new Boolean(z)});
            return;
        }
        try {
            AppMonitor.register(str, str2, MeasureSet.create(set), DimensionSet.create(set2), z);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.uploader.export.h
    public void a(String str, String str2, Map<String, Double> map, Map<String, String> map2) {
        try {
            if (this.f33298a.get()) {
                Double d = map.get("upstream");
                Double d2 = map.get("downstream");
                if (d == null) {
                    d = Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
                }
                if (d2 == null) {
                    d2 = Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
                }
                Class<?> cls = Class.forName("com.taobao.analysis.FlowCenter");
                cls.getMethod("commitFlow", Context.class, String.class, Boolean.TYPE, String.class, Long.TYPE, Long.TYPE).invoke(cls.getMethod("getInstance", new Class[0]).invoke(cls, new Object[0]), rpb.f33295a, "arup", false, "arup", Long.valueOf(d.longValue()), Long.valueOf(d2.longValue()));
            }
        } catch (Throwable th) {
            if ((th instanceof ClassNotFoundException) || (th instanceof NoSuchMethodException)) {
                this.f33298a.compareAndSet(true, false);
            } else {
                th.printStackTrace();
            }
        }
        try {
            DimensionValueSet create = DimensionValueSet.create();
            create.setMap(map2);
            MeasureValueSet create2 = MeasureValueSet.create();
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                create2.setValue(entry.getKey(), entry.getValue().doubleValue());
            }
            AppMonitor.Stat.commit(str, str2, create, create2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
