package com.android.taobao.aop.report;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import tb.kge;

/* loaded from: classes3.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.android.taobao.aop.report.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0204a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f6393a;

        static {
            kge.a(-378130519);
            f6393a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b1f3f593", new Object[0]) : f6393a;
        }
    }

    static {
        kge.a(376327527);
        kge.a(1750151855);
        AppMonitor.register("ResourceUsage", Constants.SEND_TYPE_RES, MeasureSet.create(), DimensionSet.create().addDimension("packageName").addDimension("resValue"));
    }

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b1f3f593", new Object[0]) : C0204a.a();
    }

    public void a(ReportType reportType, ResModel resModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb663aa", new Object[]{this, reportType, resModel, new Integer(i)});
            return;
        }
        Log.e("UsageReporter", String.format("%s%s->%s", reportType.name(), JSON.toJSONString(resModel), Integer.valueOf(i)));
        if (!reportType.name().equals("RESOURCE")) {
            return;
        }
        DimensionValueSet value = DimensionValueSet.create().setValue("packageName", resModel.packageName);
        AppMonitor.Stat.commit("ResourceUsage", Constants.SEND_TYPE_RES, value.setValue("resValue", resModel.resType + "/" + resModel.resName + "=" + i), MeasureValueSet.create());
    }
}
