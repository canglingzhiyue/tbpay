package com.alibaba.mtl.appmonitor;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

@Deprecated
/* loaded from: classes.dex */
public class AppMonitorStatTable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String module;
    private String monitorPoint;

    static {
        kge.a(2032104278);
    }

    public AppMonitorStatTable(String str, String str2) {
        this.module = str;
        this.monitorPoint = str2;
    }

    public AppMonitorStatTable registerRowAndColumn(DimensionSet dimensionSet, MeasureSet measureSet, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppMonitorStatTable) ipChange.ipc$dispatch("6a0497b0", new Object[]{this, dimensionSet, measureSet, new Boolean(z)});
        }
        AppMonitor.register(this.module, this.monitorPoint, measureSet, dimensionSet, z);
        return this;
    }

    public AppMonitorStatTable update(DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppMonitorStatTable) ipChange.ipc$dispatch("67273dc5", new Object[]{this, dimensionValueSet, measureValueSet});
        }
        AppMonitor.Stat.commit(this.module, this.monitorPoint, dimensionValueSet, measureValueSet);
        return this;
    }
}
