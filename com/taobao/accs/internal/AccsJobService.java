package com.taobao.accs.internal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import tb.kge;

/* loaded from: classes.dex */
public class AccsJobService extends JobService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1049408594);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        return 1;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d429dbb", new Object[]{this, jobParameters})).booleanValue();
        }
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55aa337d", new Object[]{this, jobParameters})).booleanValue();
        }
        ALog.e("AccsJobService", "onStartJob", new Object[0]);
        return false;
    }
}
