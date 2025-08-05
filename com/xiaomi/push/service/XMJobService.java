package com.xiaomi.push.service;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.xiaomi.push.fj;

/* loaded from: classes9.dex */
public class XMJobService extends Service {

    /* renamed from: a  reason: collision with root package name */
    static Service f24605a;

    /* renamed from: a  reason: collision with other field name */
    private IBinder f867a = null;

    /* loaded from: classes9.dex */
    static class a extends JobService {

        /* renamed from: a  reason: collision with root package name */
        Binder f24606a;

        /* renamed from: a  reason: collision with other field name */
        private Handler f868a;

        /* renamed from: com.xiaomi.push.service.XMJobService$a$a  reason: collision with other inner class name */
        /* loaded from: classes9.dex */
        private static class HandlerC1055a extends Handler {

            /* renamed from: a  reason: collision with root package name */
            JobService f24607a;

            HandlerC1055a(JobService jobService) {
                super(jobService.getMainLooper());
                this.f24607a = jobService;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 1) {
                    return;
                }
                JobParameters jobParameters = (JobParameters) message.obj;
                com.xiaomi.channel.commonutils.logger.b.m1616a("Job finished " + jobParameters.getJobId());
                this.f24607a.jobFinished(jobParameters, false);
                if (jobParameters.getJobId() != 1) {
                    return;
                }
                fj.a(false);
            }
        }

        a(Service service) {
            this.f24606a = null;
            this.f24606a = (Binder) com.xiaomi.push.bh.a((Object) this, "onBind", new Intent());
            com.xiaomi.push.bh.a((Object) this, "attachBaseContext", service);
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("Job started " + jobParameters.getJobId());
            Intent intent = new Intent(this, XMPushService.class);
            intent.setAction("com.xiaomi.push.timer");
            intent.setPackage(getPackageName());
            startService(intent);
            if (this.f868a == null) {
                this.f868a = new HandlerC1055a(this);
            }
            Handler handler = this.f868a;
            handler.sendMessage(Message.obtain(handler, 1, jobParameters));
            return true;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("Job stop " + jobParameters.getJobId());
            return false;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IBinder iBinder = this.f867a;
        return iBinder != null ? iBinder : new Binder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 21) {
            this.f867a = new a(this).f24606a;
        }
        f24605a = this;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        f24605a = null;
    }
}
