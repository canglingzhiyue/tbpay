package com.taobao.update.monitor;

import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.update.framework.UpdateRuntime;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Boolean> f23442a = new HashMap(2);
    private String b;

    static {
        kge.a(1066604213);
    }

    private synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.f23442a.get(str) != null) {
        } else {
            this.f23442a.put(str, true);
            AppMonitor.register("update", str, MeasureSet.create().addMeasure("elapsed_time"), DimensionSet.create().addDimension("fromVersion").addDimension("toVersion").addDimension("stage").addDimension("success").addDimension("error_code").addDimension(MUSAppMonitor.ERROR_MSG).addDimension("url").addDimension("disk_size"));
        }
    }

    public void a(String str, UpdateAlarmData updateAlarmData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71de125", new Object[]{this, str, updateAlarmData});
        } else if (updateAlarmData == null) {
        } else {
            a(str);
            if (StringUtils.isEmpty(this.b)) {
                try {
                    this.b = UpdateRuntime.getContext().getPackageManager().getPackageInfo(UpdateRuntime.getContext().getPackageName(), 0).versionName;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            AppMonitor.Stat.commit("update", str, DimensionValueSet.create().setValue("fromVersion", StringUtils.isEmpty(updateAlarmData.fromVersion) ? this.b : updateAlarmData.fromVersion).setValue("toVersion", updateAlarmData.toVersion).setValue("stage", updateAlarmData.arg).setValue("success", updateAlarmData.success ? "true" : "false").setValue("error_code", updateAlarmData.errorCode).setValue(MUSAppMonitor.ERROR_MSG, updateAlarmData.errorMsg).setValue("url", updateAlarmData.url).setValue("disk_size", updateAlarmData.disk_size), MeasureValueSet.create().setValue("elapsed_time", updateAlarmData.elapsed_time));
        }
    }
}
