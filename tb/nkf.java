package tb;

import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alibaba.wireless.security.aopsdk.Invocation;
import com.alibaba.wireless.security.aopsdk.InvocationConfig;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes7.dex */
public class nkf implements nke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1361226781);
        kge.a(2043963864);
    }

    @Override // tb.nke
    public boolean a(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5afdd1f5", new Object[]{this, invocation})).booleanValue();
        }
        return true;
    }

    @Override // tb.nke
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension("apiName");
        create.addDimension("className");
        create.addDimension("params");
        create.addDimension("th");
        create.addDimension("pageName");
        create.addDimension("pageUrl");
        create.addDimension("appStage");
        create.addDimension(a.ATOM_stack);
        create.addDimension("ruleID");
        create.addDimension("strategyID");
        create.addDimension("appStartUuid");
        create.addDimension("stageUuid");
        create.addDimension("appStartInterval");
        create.addDimension("switchStageInterval");
        MeasureSet create2 = MeasureSet.create();
        create2.addMeasure("invokeTimeCost");
        create2.addMeasure("stackTimeCost");
        create2.addMeasure("basicIncTimeCost");
        create2.addMeasure("fullProxyTimeCost");
        AppMonitor.register(nkd.MONITOR_MODULE, "invocation", create2, create);
    }

    @Override // tb.nke
    public void b(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75195090", new Object[]{this, invocation});
        } else if (invocation == null) {
            Log.e("InvocationReporter", "report: invocation is empty!");
        } else {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("apiName", invocation.getProxyName());
                create.setValue("className", invocation.methodInfo);
                create.setValue("params", nkb.e().a(invocation));
                Object obj = invocation.thiz;
                if (obj != null) {
                    create.setValue("th", obj.toString());
                }
                create.setValue("pageName", nkb.e().h());
                create.setValue("pageUrl", nkb.e().i());
                create.setValue("appStage", nkb.e().g() + "");
                create.setValue(a.ATOM_stack, nkb.b(invocation));
                create.setValue("appStartUuid", nkb.e().a());
                create.setValue("stageUuid", nkb.e().c());
                InvocationConfig invocationConfig = invocation.invocationConfig;
                if (invocationConfig != null) {
                    create.setValue("ruleID", invocationConfig.getRuleId() + "");
                    create.setValue("strategyID", invocationConfig.matchedStrategyId + "");
                }
                long nanoTime = System.nanoTime();
                long currentTimeMillis = System.currentTimeMillis();
                create.setValue("appStartInterval", (currentTimeMillis - nkb.e().b()) + "");
                create.setValue("switchStageInterval", (currentTimeMillis - nkb.e().d()) + "");
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("invokeTimeCost", (double) invocation.invokeTimeCost);
                create2.setValue("stackTimeCost", (double) invocation.stackTimeCost);
                create2.setValue("basicIncTimeCost", invocation.basicIncTimeCost);
                create2.setValue("fullProxyTimeCost", (nanoTime - invocation.aopStartTime) / 1000);
                AppMonitor.Stat.commit(nkd.MONITOR_MODULE, "invocation", create, create2);
                Log.e("InvocationReporter", String.format("report: report invocation info, API name: [%s], page name: [%s], app stage: [%s]", invocation.getProxyName(), nkb.e().h(), Integer.valueOf(nkb.e().g())));
            } catch (Throwable th) {
                Log.e("InvocationReporter", "report: occur error when report invocation info!");
                th.printStackTrace();
            }
        }
    }
}
