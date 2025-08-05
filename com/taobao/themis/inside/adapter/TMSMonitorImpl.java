package com.taobao.themis.inside.adapter;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.Dimension;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IMonitorAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import tb.kge;
import tb.qpt;

/* loaded from: classes9.dex */
public class TMSMonitorImpl implements IMonitorAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(715998237);
        kge.a(193500994);
    }

    @Override // com.taobao.themis.kernel.adapter.IMonitorAdapter
    public void trackAlarm(final boolean z, final String str, final String str2, final String str3, final String str4, final String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a3bf059", new Object[]{this, new Boolean(z), str, str2, str3, str4, str5});
        } else {
            ((IExecutorService) qpt.b(IExecutorService.class)).getExecutor(ExecutorType.IDLE).execute(new Runnable() { // from class: com.taobao.themis.inside.adapter.TMSMonitorImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (z) {
                            AppMonitor.Alarm.commitSuccess(str, str2, str5);
                        } else {
                            AppMonitor.Alarm.commitFail(str, str2, str5, str3, str4);
                        }
                    } catch (Throwable th) {
                        TMSLogger.b("TMSMonitorImpl", "", th);
                    }
                }
            });
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IMonitorAdapter
    public void trackStat(final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a50b04da", new Object[]{this, str, str2, jSONObject, jSONObject2});
        } else {
            ((IExecutorService) qpt.b(IExecutorService.class)).getExecutor(ExecutorType.IDLE).execute(new Runnable() { // from class: com.taobao.themis.inside.adapter.TMSMonitorImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (jSONObject != null && jSONObject.size() > 0 && jSONObject2 != null) {
                            DimensionSet create = DimensionSet.create();
                            DimensionValueSet create2 = DimensionValueSet.create();
                            for (String str3 : jSONObject.keySet()) {
                                create.addDimension(new Dimension(str3));
                                create2.setValue(str3, jSONObject.getString(str3));
                            }
                            MeasureSet create3 = MeasureSet.create();
                            MeasureValueSet create4 = MeasureValueSet.create();
                            for (String str4 : jSONObject2.keySet()) {
                                create3.addMeasure(new Measure(str4));
                                create4.setValue(str4, jSONObject2.getDoubleValue(str4));
                            }
                            AppMonitor.register(str, str2, create3, create, true);
                            AppMonitor.Stat.commit(str, str2, create2, create4);
                        }
                    } catch (Throwable th) {
                        TMSLogger.b("TMSMonitorImpl", "", th);
                    }
                }
            });
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IMonitorAdapter
    public void trackCounter(final String str, final String str2, final int i, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79fec741", new Object[]{this, str, str2, new Integer(i), str3});
        } else {
            ((IExecutorService) qpt.b(IExecutorService.class)).getExecutor(ExecutorType.IDLE).execute(new Runnable() { // from class: com.taobao.themis.inside.adapter.TMSMonitorImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        AppMonitor.Counter.commit(str, str2, str3, i);
                    } catch (Throwable th) {
                        TMSLogger.b("TMSMonitorImpl", "", th);
                    }
                }
            });
        }
    }
}
