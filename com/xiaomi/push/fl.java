package com.xiaomi.push;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import com.xiaomi.push.fj;
import com.xiaomi.push.service.XMJobService;

/* loaded from: classes9.dex */
public class fl implements fj.a {

    /* renamed from: a  reason: collision with root package name */
    JobScheduler f24475a;

    /* renamed from: a  reason: collision with other field name */
    Context f359a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f360a = false;

    fl(Context context) {
        this.f359a = context;
        this.f24475a = (JobScheduler) context.getSystemService("jobscheduler");
    }

    @Override // com.xiaomi.push.fj.a
    /* renamed from: a */
    public void mo1937a() {
        this.f360a = false;
        this.f24475a.cancel(1);
    }

    void a(long j) {
        JobInfo.Builder builder = new JobInfo.Builder(1, new ComponentName(this.f359a.getPackageName(), XMJobService.class.getName()));
        builder.setMinimumLatency(j);
        builder.setOverrideDeadline(j);
        builder.setRequiredNetworkType(1);
        builder.setPersisted(false);
        JobInfo build = builder.build();
        com.xiaomi.channel.commonutils.logger.b.c("schedule Job = " + build.getId() + " in " + j);
        this.f24475a.schedule(builder.build());
    }

    @Override // com.xiaomi.push.fj.a
    public void a(boolean z) {
        if (z || this.f360a) {
            long b = gw.b();
            if (z) {
                mo1937a();
                b -= SystemClock.elapsedRealtime() % b;
            }
            this.f360a = true;
            a(b);
        }
    }

    @Override // com.xiaomi.push.fj.a
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo1937a() {
        return this.f360a;
    }
}
