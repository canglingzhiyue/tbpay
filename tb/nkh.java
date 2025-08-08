package tb;

import mtopsdk.common.util.StringUtils;
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
public class nkh implements nke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f31531a;

    static {
        kge.a(-1335757777);
        kge.a(2043963864);
        f31531a = new String[]{"android.app.Fragment.requestPermissions(java.lang.String[],int)", "android.app.Activity.requestPermissions(java.lang.String[],int)"};
    }

    @Override // tb.nke
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        DimensionSet create = DimensionSet.create();
        create.addDimension("privacyName");
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
        AppMonitor.register(nkd.MONITOR_MODULE, "PermissionRequest", create2, create);
    }

    @Override // tb.nke
    public boolean a(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5afdd1f5", new Object[]{this, invocation})).booleanValue();
        }
        for (String str : f31531a) {
            if (StringUtils.equals(invocation.getProxyName(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.nke
    public void b(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75195090", new Object[]{this, invocation});
        } else if (invocation == null) {
        } else {
            try {
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("privacyName", ((String[]) invocation.args[0])[0]);
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
                InvocationConfig invocationConfig = invocation.invocationConfig;
                if (invocationConfig != null) {
                    create.setValue("ruleID", invocationConfig.getRuleId() + "");
                    create.setValue("strategyID", invocationConfig.matchedStrategyId + "");
                }
                create.setValue("appStartUuid", nkb.e().a());
                create.setValue("stageUuid", nkb.e().c());
                long nanoTime = System.nanoTime();
                long currentTimeMillis = System.currentTimeMillis();
                create.setValue("appStartInterval", (currentTimeMillis - nkb.e().b()) + "");
                create.setValue("switchStageInterval", (currentTimeMillis - nkb.e().d()) + "");
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("invokeTimeCost", (double) invocation.invokeTimeCost);
                create2.setValue("stackTimeCost", (double) invocation.stackTimeCost);
                create2.setValue("basicIncTimeCost", invocation.basicIncTimeCost);
                create2.setValue("fullProxyTimeCost", (nanoTime - invocation.aopStartTime) / 1000);
                AppMonitor.Stat.commit(nkd.MONITOR_MODULE, "PermissionRequest", create, create2);
                Log.e("PermRequestReporter", String.format("report: report request permission, API name: [%s], page name: [%s], app stage: [%s]", invocation.getProxyName(), nkb.e().h(), Integer.valueOf(nkb.e().g())));
            } catch (Throwable th) {
                Log.e("PermRequestReporter", "report: occur error when report PermissionRequestReporter! ");
                th.printStackTrace();
            }
        }
    }
}
