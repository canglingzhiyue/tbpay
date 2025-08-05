package com.taobao.linkmanager.flowout;

import android.os.Process;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG1_OUTGOING_AUTHORIZED = "mgr_flow_lost_fly";
    public static final String ARG1_OUTGOING_BLOCKED = "mgr_flow_lost_handle";
    public static final int EVENT_ID_19999 = 19999;
    public static final String MGR_FLOW_BROWSER_FLY = "mgr_flow_browser_fly";

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f17707a;

    static {
        kge.a(1373270408);
        f17707a = new AtomicBoolean(false);
    }

    public static void a(int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c673040", new Object[]{new Integer(i), str, map});
        } else {
            a(i, str, null, null, map);
        }
    }

    public static void a(int i, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82762f2c", new Object[]{new Integer(i), str, str2, str3, map});
            return;
        }
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(com.taobao.flowcustoms.afc.utils.b.PAGE_FLOWCUSTOMS, i, str, str2, str3, map);
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "eventId: " + i + "  arg1: " + str + "  arg2: " + str2 + "  arg3: " + str3 + "  properties: " + map);
        com.taobao.flowcustoms.afc.utils.b.a(str, uTOriginalCustomHitBuilder.build());
    }

    public static void a(com.taobao.linkmanager.flowout.data.a aVar, String str, long j, boolean z, long j2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c565c395", new Object[]{aVar, str, new Long(j), new Boolean(z), new Long(j2), str2});
            return;
        }
        if (f17707a.compareAndSet(false, true)) {
            a();
        }
        DimensionValueSet create = DimensionValueSet.create();
        create.setValue("pageName", aVar.f17708a);
        create.setValue("pageUrl", aVar.b);
        create.setValue("jumpUrl", str);
        create.setValue("openTimestamp", String.valueOf(aVar.c));
        create.setValue("jumpTimestamp", String.valueOf(j));
        create.setValue("isRisk", z ? "1" : "0");
        create.setValue("processId", String.valueOf(Process.myPid()));
        create.setValue("sampleId", str2);
        MeasureValueSet create2 = MeasureValueSet.create();
        create2.setValue("riskCost", j2);
        AppMonitor.Stat.commit("tbFlowCustoms", "flowoutSC", create, create2);
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        MeasureSet create = MeasureSet.create();
        DimensionSet create2 = DimensionSet.create();
        create2.addDimension("pageName");
        create2.addDimension("pageUrl");
        create2.addDimension("jumpUrl");
        create2.addDimension("openTimestamp");
        create2.addDimension("jumpTimestamp");
        create2.addDimension("processId");
        create2.addDimension("sampleId");
        create2.addDimension("isRisk");
        create.addMeasure("riskCost");
        AppMonitor.register("tbFlowCustoms", "flowoutSC", create, create2, false);
    }
}
