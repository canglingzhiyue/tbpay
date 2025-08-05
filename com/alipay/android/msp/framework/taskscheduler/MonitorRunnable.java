package com.alipay.android.msp.framework.taskscheduler;

import android.os.SystemClock;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MonitorRunnable implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static volatile long sThreshold = 1000;

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f4876a;
    private final long b;
    private final String c;
    private final long d;

    public MonitorRunnable(Runnable runnable, String str, long j) {
        this.f4876a = runnable;
        this.c = str;
        this.b = SystemClock.elapsedRealtime();
        this.d = j;
    }

    public MonitorRunnable(Runnable runnable, long j) {
        this(runnable, String.valueOf(runnable.hashCode()), j);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            long elapsedRealtime = (SystemClock.elapsedRealtime() - this.b) - this.d;
            if (elapsedRealtime > sThreshold) {
                LogUtil.record(8, "threadDelayRun:" + this.f4876a.getClass().getName(), String.valueOf(elapsedRealtime));
                Object obj = StatisticCollector.GLOBAL_AGENT;
                StatisticCollector.addError(obj, ErrorType.DEFAULT, "threadDelayRun", this.f4876a.getClass().getName() + ":" + elapsedRealtime);
            }
        } catch (Throwable th) {
            try {
                LogUtil.printExceptionStackTrace(th);
            } finally {
                this.f4876a.run();
            }
        }
    }
}
