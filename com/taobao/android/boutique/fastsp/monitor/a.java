package com.taobao.android.boutique.fastsp.monitor;

import android.app.Application;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.tco;

/* loaded from: classes4.dex */
public class a implements Monitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1448478438);
        kge.a(260520199);
    }

    public a(Application application) {
        AppMonitor.init(application);
        AppMonitor.register("fast_sp", "fast_sp", MeasureSet.create(), DimensionSet.create().addDimension("spName").addDimension("spFactory").addDimension("spType").addDimension("isFirstLoad").addDimension("functionName").addDimension("duration"));
    }

    @Override // com.taobao.android.boutique.fastsp.monitor.Monitor
    public void a(String str, String str2, String str3, String str4, String str5, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d81e7aa", new Object[]{this, str, str2, str3, str4, str5, new Long(j)});
            return;
        }
        try {
            AppMonitor.Stat.commit("fast_sp", "fast_sp", DimensionValueSet.create().setValue("spName", str).setValue("spFactory", str2).setValue("spType", str3).setValue("isFirstLoad", str4).setValue("functionName", str5).setValue("duration", String.valueOf(j)), MeasureValueSet.create());
        } catch (Throwable th) {
            tco.a(th);
        }
    }
}
