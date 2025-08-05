package com.taobao.metrickit.context;

import android.os.Handler;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.LowMemoryListener;
import com.taobao.metrickit.l;
import com.taobao.tao.log.TLog;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f18073a = new Handler(a.a().c().getLooper());

    public void a(final int i, final long j, final long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619f15b", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
        } else {
            this.f18073a.post(new Runnable() { // from class: com.taobao.metrickit.context.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    for (LowMemoryListener lowMemoryListener : l.a().b()) {
                        try {
                            lowMemoryListener.a(i, j, j2);
                        } catch (Exception e) {
                            TLog.loge("MetricKit.OuterCallbackScheduler", "listener.onLowMemory callback exception", e);
                        }
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("memoryType", i);
                        jSONObject.put("currSize", j);
                        jSONObject.put("totalSize", j2);
                        WVStandardEventCenter.postNotificationToJS("PerformanceMetric.onLowMemory", jSONObject.toString());
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
    }
}
