package com.android.tools.ir.runtime;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Boolean> f6432a = new HashMap(2);

    private synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.f6432a.get(str) != null) {
        } else {
            this.f6432a.put(str, true);
            AppMonitor.register("applicationInit", str, MeasureSet.create().addMeasure("cost"), DimensionSet.create().addDimension("bundleName").addDimension("applicationName").addDimension("callFrom"));
        }
    }

    public void a(String str, String str2, String str3, String str4, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd745434", new Object[]{this, str, str2, str3, str4, new Long(j)});
            return;
        }
        a(str);
        AppMonitor.Stat.commit("applicationInit", str, DimensionValueSet.create().setValue("bundleName", str2).setValue("applicationName", str3).setValue("callFrom", str4), MeasureValueSet.create().setValue("cost", j));
    }
}
