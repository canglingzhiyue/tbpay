package com.taobao.analysis.v3;

import anet.channel.util.ALog;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class e implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f8589a = false;

    public e() {
        try {
            Class.forName(OConstant.REFLECT_APPMONITOR);
            f8589a = true;
        } catch (Exception unused) {
            f8589a = false;
            ALog.e("falco.DefaultFalcoMetrics", "AppMonitor not support.", null, new Object[0]);
        }
    }

    @Override // com.taobao.analysis.v3.j
    public void a(String str, String str2, Set<String> set, Set<String> set2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb8969c", new Object[]{this, str, str2, set, set2});
        } else if (!f8589a) {
        } else {
            try {
                AppMonitor.register(str, str2, MeasureSet.create(set), DimensionSet.create(set2));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.taobao.analysis.v3.j
    public void a(String str, String str2, Map<String, Double> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37ab1dc", new Object[]{this, str, str2, map, map2});
            return;
        }
        try {
            DimensionValueSet create = DimensionValueSet.create();
            create.setMap(map2);
            MeasureValueSet create2 = MeasureValueSet.create();
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                create2.setValue(entry.getKey(), entry.getValue().doubleValue());
            }
            AppMonitor.Stat.commit(str, str2, create, create2);
        } catch (Throwable unused) {
        }
    }
}
