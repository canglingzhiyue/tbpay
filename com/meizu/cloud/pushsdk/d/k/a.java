package com.meizu.cloud.pushsdk.d.k;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.meizu.cloud.pushinternal.DebugLogger;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private AlarmManager f7883a;
    private Context b;
    private Runnable c;
    private long d;
    private int e;
    private b f;
    private PendingIntent g;
    private String h;
    private boolean i;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !intent.getAction().equals("alarm.util")) {
                return;
            }
            DebugLogger.i("AlarmUtils", "on receive delayed task, keyword: " + a.this.h);
            a.this.i = true;
            a.this.b();
            a.this.c.run();
        }
    }

    public a(Context context, Runnable runnable, long j) {
        this(context, runnable, j, true);
    }

    public a(Context context, Runnable runnable, long j, boolean z) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = runnable;
        this.d = j;
        this.e = !z ? 1 : 0;
        this.f7883a = (AlarmManager) applicationContext.getSystemService("alarm");
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            b bVar = this.f;
            if (bVar == null) {
                return;
            }
            this.b.unregisterReceiver(bVar);
            this.f = null;
        } catch (Exception e) {
            DebugLogger.e("AlarmUtils", "clean error, " + e.getMessage());
        }
    }

    public void a() {
        if (this.f7883a != null && this.g != null && !this.i) {
            DebugLogger.i("AlarmUtils", "cancel  delayed task, keyword: " + this.h);
            this.f7883a.cancel(this.g);
        }
        b();
    }

    public boolean c() {
        if (!this.i) {
            DebugLogger.e("AlarmUtils", "last task not completed");
            return false;
        }
        this.i = false;
        b bVar = new b();
        this.f = bVar;
        this.b.registerReceiver(bVar, new IntentFilter("alarm.util"));
        this.h = String.valueOf(System.currentTimeMillis());
        this.g = com.android.taobao.aop.a.b(this.b, 0, new Intent("alarm.util"), 1140850688);
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            this.f7883a.setExactAndAllowWhileIdle(this.e, System.currentTimeMillis() + this.d, this.g);
        } else if (i >= 19) {
            this.f7883a.setExact(this.e, System.currentTimeMillis() + this.d, this.g);
        } else {
            this.f7883a.set(this.e, System.currentTimeMillis() + this.d, this.g);
        }
        DebugLogger.i("AlarmUtils", "start delayed task, keyword: " + this.h);
        return true;
    }
}
