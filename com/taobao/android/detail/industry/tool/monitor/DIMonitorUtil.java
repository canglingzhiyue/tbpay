package com.taobao.android.detail.industry.tool.monitor;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bax;
import tb.kge;

/* loaded from: classes4.dex */
public class DIMonitorUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BLANK_ERROR = "renderBlankError";

    /* renamed from: a  reason: collision with root package name */
    public static String f10122a;

    /* loaded from: classes4.dex */
    public enum StageType {
        STAGE_CREATE("create"),
        STAGE_OPEN_CAMERA("open_camera"),
        STAGE_SYNC_RENDER("sync_render"),
        STAGE_ASYNC_RENDER("async_render");
        
        private final String value;

        StageType(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    static {
        kge.a(1846999217);
        f10122a = "industry_monitor";
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        AppMonitor.Alarm.commitFail("Detail_Industry_Custom", "Monitor_Component_Error", str, str2, str3);
        a("commitFail: " + str2 + ", " + str3 + ", " + str);
    }

    public static void a(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bf98b8", new Object[]{str, str2, str3, new Double(d)});
            return;
        }
        MeasureSet create = MeasureSet.create();
        create.addMeasure(StageType.STAGE_OPEN_CAMERA.value);
        create.addMeasure(StageType.STAGE_SYNC_RENDER.value);
        create.addMeasure(StageType.STAGE_ASYNC_RENDER.value);
        DimensionSet create2 = DimensionSet.create();
        create2.addDimension("subBizcode");
        create2.addDimension("componentKey");
        create2.addDimension("deviceLevel");
        AppMonitor.register("Detail_Industry_Custom", "Monitor_Component_trace", create, create2, false);
        DimensionValueSet value = DimensionValueSet.create().setValue("subBizcode", str);
        value.setValue("componentKey", str2);
        value.setValue("deviceLevel", bax.a().b);
        AppMonitor.Stat.commit("Detail_Industry_Custom", "Monitor_Component_trace", value, MeasureValueSet.create().setValue(str3, d));
        a("commitTraceStatics: " + str + "," + str2 + "," + str3 + ", " + d);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            com.taobao.android.detail.industry.tool.a.a(f10122a, str);
        }
    }
}
