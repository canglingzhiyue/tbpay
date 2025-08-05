package com.taobao.android.fluid.framework.adapter;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class AppMonitorAdapter implements IAppMonitorAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1840871981);
        kge.a(1259495798);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAdapter
    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : IAppMonitorAdapter.ADAPTER_NAME;
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAppMonitorAdapter
    public void alarmCommitFail(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef4f15f", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            AppMonitor.Alarm.commitFail(str, str2, str3, str4, str5);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAppMonitorAdapter
    public void alarmCommitSuccess(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ea2f60", new Object[]{this, str, str2, str3});
        } else {
            AppMonitor.Alarm.commitSuccess(str, str2, str3);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAppMonitorAdapter
    public void counterCommit(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e9bb86", new Object[]{this, str, str2, str3, new Double(d)});
        } else {
            AppMonitor.Counter.commit(str, str2, str3, d);
        }
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAppMonitorAdapter
    public void registerStat(String str, String str2, List<String> list, List<String> list2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2bf76c0", new Object[]{this, str, str2, list, list2, new Boolean(z)});
            return;
        }
        DimensionSet dimensionSet = null;
        MeasureSet create = list != null ? MeasureSet.create(list) : null;
        if (list2 != null) {
            dimensionSet = DimensionSet.create(list2);
        }
        AppMonitor.register(str, str2, create, dimensionSet);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IAppMonitorAdapter
    public void statCommit(String str, String str2, Map<String, Double> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710c8ea6", new Object[]{this, str, str2, map, map2});
            return;
        }
        DimensionValueSet dimensionValueSet = null;
        MeasureValueSet create = map != null ? MeasureValueSet.create(map) : null;
        if (map2 != null) {
            dimensionValueSet = DimensionValueSet.fromStringMap(map2);
        }
        AppMonitor.Stat.commit(str, str2, dimensionValueSet, create);
    }
}
