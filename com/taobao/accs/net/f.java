package com.taobao.accs.net;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.internal.AccsJobService;
import tb.kge;

/* loaded from: classes.dex */
public class f extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEAMON_JOB_ID = 2051;
    public static final int HB_JOB_ID = 2050;
    private JobScheduler c;
    private int d;

    static {
        kge.a(-576339233);
    }

    @Override // com.taobao.accs.net.d
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "Job";
    }

    public f(Context context) {
        super(context);
    }

    @Override // com.taobao.accs.net.d
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (Build.VERSION.SDK_INT < 21) {
        } else {
            if (this.c == null) {
                this.c = (JobScheduler) this.f8269a.getSystemService("jobscheduler");
            }
            long j = i * 1000;
            this.d = this.c.schedule(new JobInfo.Builder(HB_JOB_ID, new ComponentName(this.f8269a.getPackageName(), AccsJobService.class.getName())).setMinimumLatency(j).setOverrideDeadline(j).setRequiredNetworkType(1).build());
        }
    }
}
