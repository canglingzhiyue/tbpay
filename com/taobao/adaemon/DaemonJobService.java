package com.taobao.adaemon;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.suq;

/* loaded from: classes.dex */
public class DaemonJobService extends JobService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1818342873);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55aa337d", new Object[]{this, jobParameters})).booleanValue();
        }
        c.a(new Runnable() { // from class: com.taobao.adaemon.DaemonJobService.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                e.a("DaemonJob", "onStartJob", new Object[0]);
                int i = jobParameters.getExtras().getInt(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE);
                if (System.currentTimeMillis() - f.a().b() < 10000) {
                    l.a(true);
                }
                f.a().a(i);
            }
        });
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d429dbb", new Object[]{this, jobParameters})).booleanValue();
        }
        e.a("DaemonJob", "onStopJob", new Object[0]);
        return false;
    }
}
