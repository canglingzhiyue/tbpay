package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class ah {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ah f24346a;

    /* renamed from: a  reason: collision with other field name */
    private SharedPreferences f89a;

    /* renamed from: a  reason: collision with other field name */
    private ScheduledThreadPoolExecutor f92a = new ScheduledThreadPoolExecutor(1);

    /* renamed from: a  reason: collision with other field name */
    private Map<String, ScheduledFuture> f91a = new HashMap();

    /* renamed from: a  reason: collision with other field name */
    private Object f90a = new Object();

    /* loaded from: classes9.dex */
    public static abstract class a implements Runnable {
        /* renamed from: a */
        public abstract String mo1839a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        a f24347a;

        public b(a aVar) {
            this.f24347a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
        }

        void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
            this.f24347a.run();
            b();
        }
    }

    private ah(Context context) {
        this.f89a = context.getSharedPreferences("mipush_extra", 0);
    }

    public static ah a(Context context) {
        if (f24346a == null) {
            synchronized (ah.class) {
                if (f24346a == null) {
                    f24346a = new ah(context);
                }
            }
        }
        return f24346a;
    }

    private static String a(String str) {
        return "last_job_time" + str;
    }

    private ScheduledFuture a(a aVar) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f90a) {
            scheduledFuture = this.f91a.get(aVar.mo1839a());
        }
        return scheduledFuture;
    }

    public void a(Runnable runnable) {
        a(runnable, 0);
    }

    public void a(Runnable runnable, int i) {
        this.f92a.schedule(runnable, i, TimeUnit.SECONDS);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1698a(a aVar) {
        return b(aVar, 0);
    }

    public boolean a(a aVar, int i) {
        return a(aVar, i, 0);
    }

    public boolean a(a aVar, int i, int i2) {
        return a(aVar, i, i2, false);
    }

    public boolean a(a aVar, int i, int i2, boolean z) {
        if (aVar == null || a(aVar) != null) {
            return false;
        }
        String a2 = a(aVar.mo1839a());
        ai aiVar = new ai(this, aVar, z, a2);
        if (!z) {
            long abs = Math.abs(System.currentTimeMillis() - this.f89a.getLong(a2, 0L)) / 1000;
            if (abs < i - i2) {
                i2 = (int) (i - abs);
            }
        }
        try {
            ScheduledFuture<?> scheduleAtFixedRate = this.f92a.scheduleAtFixedRate(aiVar, i2, i, TimeUnit.SECONDS);
            synchronized (this.f90a) {
                this.f91a.put(aVar.mo1839a(), scheduleAtFixedRate);
            }
            return true;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            return true;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m1699a(String str) {
        synchronized (this.f90a) {
            ScheduledFuture scheduledFuture = this.f91a.get(str);
            if (scheduledFuture == null) {
                return false;
            }
            this.f91a.remove(str);
            return scheduledFuture.cancel(false);
        }
    }

    public boolean b(a aVar, int i) {
        if (aVar == null || a(aVar) != null) {
            return false;
        }
        ScheduledFuture<?> schedule = this.f92a.schedule(new aj(this, aVar), i, TimeUnit.SECONDS);
        synchronized (this.f90a) {
            this.f91a.put(aVar.mo1839a(), schedule);
        }
        return true;
    }
}
