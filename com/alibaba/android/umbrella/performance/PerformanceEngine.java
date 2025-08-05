package com.alibaba.android.umbrella.performance;

import android.text.TextUtils;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes2.dex */
public class PerformanceEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void commitPerformancePage(PerformanceEntity performanceEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5b1b34", new Object[]{performanceEntity});
        }
    }

    public static void commitPerformancePage(ProcessEntity processEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4783b55", new Object[]{processEntity});
        } else if (processEntity == null || TextUtils.isEmpty(processEntity.bizName) || com.alibaba.android.umbrella.trace.b.f()) {
        } else {
            TLog.loge("PerformanceEngine", processEntity.toJsonString());
            AppMonitor.Alarm.commitSuccess("Page_Umbrella_Performance_Govern", "Monitor_Page_Load_Service", processEntity.toJsonString());
        }
    }

    public static void commitPerformancePoint(PerformanceEntity performanceEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb6cd23", new Object[]{performanceEntity});
        } else if (com.alibaba.android.umbrella.trace.b.e()) {
        } else {
            AppMonitor.Alarm.commitSuccess("Page_Umbrella_Performance_Govern", UmbrellaTracker.PURCHASE_POINT_PRE + performanceEntity.bizName + UmbrellaTracker.PURCHASE_POINT_POST, performanceEntity.toJsonString());
        }
    }
}
