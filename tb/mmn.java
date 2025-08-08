package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class mmn implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Map<String, Object>> f31114a = new HashMap();
    private static boolean b = false;
    private final String c;
    private final Map<String, Object> d;

    public mmn(String str, Map<String, Object> map) {
        this.c = str;
        this.d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            if (StringUtils.isEmpty(this.c)) {
                return;
            }
            if (!a()) {
                f31114a.put(this.c, this.d);
            }
            a(this.c, this.d);
            if (!f31114a.isEmpty()) {
                return;
            }
            for (Map.Entry<String, Map<String, Object>> entry : f31114a.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
        } catch (Exception e) {
            TLog.loge("MetricKit.BlockStackUT", e.getMessage(), e);
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!UTAnalytics.getInstance().isInit()) {
            return false;
        }
        if (!b) {
            b = true;
            AppMonitor.register("APM", "ApmBlockStack", MeasureSet.create().addMeasure("count"), DimensionSet.create().addDimension("funnelPoint"));
        }
        return true;
    }

    private void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            AppMonitor.Stat.commit("APM", "ApmBlockStack", DimensionValueSet.create().setValue("funnelPoint", str), MeasureValueSet.create().setValue("count", 1.0d));
        }
    }
}
