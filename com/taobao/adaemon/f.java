package com.taobao.adaemon;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.os.Process;
import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ProcessController;
import com.taobao.adaemon.d;
import com.taobao.adaemon.k;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import java.util.List;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.orq;
import tb.suq;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private long f8340a;
    private int b;
    private long c;
    private Context d;
    private boolean e;
    private ProcessController.c f;
    private d g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private final ServiceConnection n;
    private final BroadcastReceiver o;

    /* renamed from: com.taobao.adaemon.f$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ f f8341a;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!f.a(this.f8341a)) {
                e.a("Worker", "not started", new Object[0]);
            } else {
                e.a("Worker", "stop", new Object[0]);
                f.a(this.f8341a, false);
                ProcessController.getInstance().unregisterProcessListener(f.b(this.f8341a));
                if (f.c(this.f8341a) <= 0 || f.d(this.f8341a) == null || f.e(this.f8341a) == null) {
                    return;
                }
                f.e(this.f8341a).unregisterReceiver(f.d(this.f8341a));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final f f8344a;

        static {
            kge.a(854674294);
            f8344a = new f(null);
        }

        public static /* synthetic */ f a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("90874d94", new Object[0]) : f8344a;
        }
    }

    static {
        kge.a(-19694177);
    }

    public static /* synthetic */ void lambda$G1ZCTfXJXxs8BMyYStqWiQxUZ8w(f fVar, int i, long j) {
        fVar.a(i, j);
    }

    public static /* synthetic */ void lambda$TUeQkRhI7_ocWLjBzD9JsAVb3qY(f fVar, int i) {
        fVar.g(i);
    }

    public /* synthetic */ f(AnonymousClass1 anonymousClass1) {
        this();
    }

    public static /* synthetic */ long a(f fVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99c9e96a", new Object[]{fVar, new Long(j)})).longValue();
        }
        fVar.c = j;
        return j;
    }

    public static /* synthetic */ void a(f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c9e5b5", new Object[]{fVar, new Integer(i)});
        } else {
            fVar.b(i);
        }
    }

    public static /* synthetic */ void a(f fVar, long j, TimeUnit timeUnit, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9552f41", new Object[]{fVar, new Long(j), timeUnit, new Integer(i)});
        } else {
            fVar.a(j, timeUnit, i);
        }
    }

    public static /* synthetic */ boolean a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3ec46f12", new Object[]{fVar})).booleanValue() : fVar.e;
    }

    public static /* synthetic */ boolean a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99ca258a", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.e = z;
        return z;
    }

    public static /* synthetic */ ProcessController.c b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ProcessController.c) ipChange.ipc$dispatch("ef5ec229", new Object[]{fVar}) : fVar.f;
    }

    public static /* synthetic */ void b(f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a9aed14", new Object[]{fVar, new Integer(i)});
        } else {
            fVar.f(i);
        }
    }

    public static /* synthetic */ long c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1669084", new Object[]{fVar})).longValue() : fVar.i;
    }

    public static /* synthetic */ BroadcastReceiver d(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("13ba0108", new Object[]{fVar}) : fVar.o;
    }

    public static /* synthetic */ Context e(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("4d047b0a", new Object[]{fVar}) : fVar.d;
    }

    public static /* synthetic */ long f(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5d59c2c7", new Object[]{fVar})).longValue() : fVar.h;
    }

    public static /* synthetic */ int g(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("96aad387", new Object[]{fVar})).intValue() : fVar.d();
    }

    public static /* synthetic */ int h(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cffbe448", new Object[]{fVar})).intValue() : fVar.b;
    }

    public static /* synthetic */ d i(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("32b09d68", new Object[]{fVar}) : fVar.g;
    }

    public static /* synthetic */ ServiceConnection j(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ServiceConnection) ipChange.ipc$dispatch("886a5acb", new Object[]{fVar}) : fVar.n;
    }

    private f() {
        this.f8340a = 0L;
        this.b = 0;
        this.c = -1L;
        this.e = false;
        this.h = 480000L;
        this.i = 60000L;
        this.j = 120000L;
        this.k = 30L;
        this.n = new ServiceConnection() { // from class: com.taobao.adaemon.f.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                f.this = this;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                    return;
                }
                e.a("Worker", "onServiceConnected unbind TriggerService", new Object[0]);
                f.e(f.this).unbindService(this);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
                    return;
                }
                e.a("Worker", "onServiceDisconnected unbind TriggerService", new Object[0]);
                f.e(f.this).unbindService(this);
            }
        };
        this.o = new BroadcastReceiver() { // from class: com.taobao.adaemon.DaemonWorker$5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_ON".equals(action)) {
                    e.b("Worker", "ACTION_SCREEN_ON", new Object[0]);
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    e.b("Worker", "ACTION_SCREEN_OFF", new Object[0]);
                    f.b(f.a(), 7);
                } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                    e.b("Worker", "ACTION_USER_PRESENT", new Object[0]);
                    g.b().a(0L, true);
                }
                if (!j.a().H()) {
                    return;
                }
                g.b().c();
            }
        };
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("90874d94", new Object[0]) : a.a();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            a(context, (d) null);
        }
    }

    private void a(Context context, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee5db448", new Object[]{this, context, dVar});
        } else if (this.e) {
            e.a("Worker", "already started", new Object[0]);
        } else {
            this.l = System.currentTimeMillis();
            e.a("Worker", "start", new Object[0]);
            this.e = true;
            this.d = context.getApplicationContext();
            if (dVar == null) {
                this.g = new d.a().a();
            }
            this.f = new b(this.d.getPackageName(), this);
            ProcessController.getInstance().registerProcessListener(this.f);
            c(j.a().a(this.d, "work_max_time", 30));
            b(j.a().a(this.d, "work_interval", 120000));
            a(j.a().a(this.d, "work_background_delay", 480000));
            this.i = j.a().a(this.d, "screen_off_delay", 60000);
            f();
        }
    }

    /* loaded from: classes.dex */
    public class b implements ProcessController.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private f b;
        private String c;

        static {
            kge.a(528374192);
            kge.a(-1898921331);
        }

        public b(String str, f fVar) {
            f.this = r1;
            this.b = fVar;
            this.c = str;
        }

        @Override // com.taobao.adaemon.ProcessController.c
        public void a(String str, boolean z, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3b0622c", new Object[]{this, str, new Boolean(z), str2});
            } else if (!j.a().h() && !this.c.equals(str)) {
                e.b("Worker", "onLifecycleUpdate return", new Object[0]);
            } else {
                e.b("Worker", "onLifecycleUpdate", "name", str, "bg", Boolean.valueOf(z), "bgType", str2);
                f.a(this.b, z ? System.currentTimeMillis() : -1L);
                if (!z || l.e(f.e(f.this))) {
                    return;
                }
                if ("back".equals(str2)) {
                    f.a(this.b, f.f(f.this), TimeUnit.MILLISECONDS, 1);
                } else if (j.a().b()) {
                    f.a(this.b, f.f(f.this), TimeUnit.MILLISECONDS, 2);
                } else if (ProcessController.getInstance().isBgFromHomePage(f.e(f.this).getPackageName())) {
                    f.a(this.b, f.f(f.this), TimeUnit.MILLISECONDS, 6);
                }
                long j = 10000;
                if ("OPPO".equalsIgnoreCase(Build.BRAND)) {
                    j = 120000;
                }
                g.b().b(j);
                if (!l.g(f.e(f.this)) || !j.a().y()) {
                    return;
                }
                try {
                    MemArt.a(f.e(f.this), orq.FRAME_CHECK_TIMEOUT);
                } catch (Exception e) {
                    e.b("Worker", e.getMessage(), new Object[0]);
                }
            }
        }

        @Override // com.taobao.adaemon.ProcessController.c
        public void a(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
                return;
            }
            if (j.a().H()) {
                g.b().c();
            }
            if (!this.c.equals(str)) {
                return;
            }
            e.a("Worker", "onTrimMemory", "level", Integer.valueOf(i), "name", str);
            if (i != 5 && i != 10 && i != 15 && i != 20) {
                if (i == 40) {
                    f.a(this.b, 3);
                } else if (i == 60) {
                    f.a(this.b, 4);
                } else if (i == 80) {
                    f.a(this.b, 5);
                }
            }
            if (!str.endsWith(":channel")) {
                return;
            }
            g.b().a(0L, false);
        }
    }

    private void a(final long j, TimeUnit timeUnit, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58bc527", new Object[]{this, new Long(j), timeUnit, new Integer(i)});
        } else if (!j.a().b(this.d)) {
        } else {
            try {
                c.a(new Runnable() { // from class: com.taobao.adaemon.f.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        f.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            int g = f.g(f.this);
                            if (g == 1) {
                                f.i(f.this).e = true;
                                f.i(f.this).b = l.b(f.e(f.this));
                                e.a("Worker", "trigger start delay", "delay", Long.valueOf(j), MspDBHelper.BizEntry.COLUMN_NAME_PID, Integer.valueOf(f.i(f.this).b));
                                return;
                            }
                            e.a("Worker", "trigger can't work", "reason", Integer.valueOf(g));
                            k.e eVar = new k.e();
                            eVar.b = false;
                            eVar.c = g;
                            eVar.f8371a = i;
                            eVar.d = f.h(f.this);
                            eVar.a();
                        } catch (Throwable th) {
                            e.a("Worker", "collect trigger info", th, new Object[0]);
                        }
                    }
                });
                c.a(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$f$G1ZCTfXJXxs8BMyYStqWiQxUZ8w
                    {
                        f.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        f.lambda$G1ZCTfXJXxs8BMyYStqWiQxUZ8w(f.this, i, j);
                    }
                });
            } catch (Throwable th) {
                e.a("Worker", JarvisConstant.KEY_JARVIS_TRIGGER, null, th);
            }
        }
    }

    public /* synthetic */ void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        try {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, i);
            ((JobScheduler) this.d.getSystemService("jobscheduler")).schedule(new JobInfo.Builder(2040, new ComponentName(this.d.getPackageName(), DaemonJobService.class.getName())).setMinimumLatency(j).setOverrideDeadline(j).setExtras(persistableBundle).build());
            e.b("Worker", "JobScheduler trigger", "delay", Long.valueOf(j));
        } catch (Throwable th) {
            e.a("Worker", "JobScheduler trigger", th, new Object[0]);
        }
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (!j.a().d()) {
        } else {
            if (this.c == -1) {
                e.b("Worker", "triggerByTrimMem not trigger, TO_BG_TIME_INVALID", new Object[0]);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.c;
            long j = currentTimeMillis / 60000;
            if (currentTimeMillis < 120000 || l.e(this.d)) {
                e.b("Worker", "triggerByTrimMem not trigger, interval(min):" + j, new Object[0]);
                return;
            }
            e.a("Worker", "triggerByTrimMem trigger interval(min):" + j, new Object[0]);
            a(0L, TimeUnit.MILLISECONDS, i);
        }
    }

    private void f(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            c.a(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$f$TUeQkRhI7_ocWLjBzD9JsAVb3qY
                {
                    f.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    f.lambda$TUeQkRhI7_ocWLjBzD9JsAVb3qY(f.this, i);
                }
            }, 100L, TimeUnit.MILLISECONDS);
        }
    }

    public /* synthetic */ void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else if (!c(i)) {
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.c;
            long j = this.i;
            if (currentTimeMillis - j > 0) {
                j = 0;
            }
            e.a("Worker", "trigger by ScreenOff", null, "delay", Long.valueOf(j));
            a(j, TimeUnit.MILLISECONDS, i);
        }
    }

    private boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b44dd", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!this.e) {
            e.b("Worker", "triggerByScreenOff not init", new Object[0]);
            k.e eVar = new k.e();
            eVar.b = false;
            eVar.c = -9;
            eVar.f8371a = i;
            eVar.d = this.b;
            eVar.a();
            return false;
        } else if (this.i <= 0) {
            e.a("Worker", "triggerByScreenOff disable", new Object[0]);
            return false;
        } else if (l.e(this.d)) {
            e.a("Worker", "triggerByScreenOff trigger fail, isForeground", new Object[0]);
            k.e eVar2 = new k.e();
            eVar2.b = false;
            eVar2.c = -4;
            eVar2.f8371a = i;
            eVar2.d = this.b;
            eVar2.a();
            return false;
        } else {
            boolean isBgFromHomePage = ProcessController.getInstance().isBgFromHomePage(this.d.getPackageName());
            if (this.c == -1) {
                e.b("Worker", "triggerByScreenOff fail", new Object[0]);
                k.e eVar3 = new k.e();
                eVar3.b = false;
                eVar3.c = -11;
                eVar3.f8371a = i;
                eVar3.d = this.b;
                eVar3.a();
                return false;
            } else if (!isBgFromHomePage && System.currentTimeMillis() - this.c < this.h) {
                e.b("Worker", "triggerByScreenOff fail", "isHome", Boolean.valueOf(isBgFromHomePage), "time", Long.valueOf(System.currentTimeMillis() - this.c));
                k.e eVar4 = new k.e();
                eVar4.b = false;
                eVar4.c = -12;
                eVar4.f8371a = i;
                eVar4.d = this.b;
                eVar4.a();
                return false;
            } else if (!this.g.e || this.g.b >= 0) {
                return true;
            } else {
                e.a("Worker", "triggerByScreenOff trigger fail", "canWork", Boolean.valueOf(this.g.e), MspDBHelper.BizEntry.COLUMN_NAME_PID, Integer.valueOf(this.g.b));
                return false;
            }
        }
    }

    private int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences f = l.f(this.d);
        if (this.b == 0) {
            this.b = f.getInt("adaemon_work_times", 0);
        }
        long j = f.getLong("adaemon_first_work_timestamp", currentTimeMillis);
        if (this.b != 0 && currentTimeMillis - j > 86400000) {
            this.b = 0;
            f.edit().putInt("adaemon_work_times", 0).putLong("adaemon_first_work_timestamp", currentTimeMillis).apply();
        }
        long j2 = currentTimeMillis - this.f8340a;
        e.a("Worker", "work times:" + this.b + " interval:" + j2, new Object[0]);
        if (j2 <= this.j) {
            return -2;
        }
        return (((long) this.b) < this.k || currentTimeMillis - j >= 86400000) ? 1 : -1;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!j.a().b(this.d)) {
        } else {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                e.a("Worker", "doWork start", null, "type", Integer.valueOf(i));
                k.e eVar = new k.e();
                int d = d(i);
                if (d == 1) {
                    d = e(i);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (this.f8340a != 0) {
                        eVar.e = currentTimeMillis2 - this.f8340a;
                    }
                    this.f8340a = currentTimeMillis2;
                    this.b++;
                    SharedPreferences.Editor edit = l.f(this.d).edit();
                    edit.putInt("adaemon_work_times", this.b);
                    if (this.b == 1) {
                        edit.putLong("adaemon_first_work_timestamp", this.f8340a);
                    }
                    edit.apply();
                }
                eVar.f8371a = i;
                eVar.b = d == 1;
                eVar.c = d;
                eVar.d = this.b;
                eVar.a();
                e.a("Worker", "doWork end. ", "result", Integer.valueOf(d), "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            } catch (Throwable th) {
                e.a("Worker", "doRestart", null, th);
            }
        }
    }

    private int d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad401d6b", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.g == null) {
            e.b("Worker", "checkConstraints null", new Object[0]);
            return -3;
        }
        e.a("Worker", "checkConstraints:" + this.g.toString(), new Object[0]);
        if (this.g.f8337a && l.e(this.d)) {
            e.b("Worker", "foreground, cancel", new Object[0]);
            return -4;
        } else if (i == 80) {
            e.b("Worker", "checkConstraints true " + i, new Object[0]);
            return 1;
        } else if (l.d(this.d)) {
            e.b("Worker", "has notifications, cancel", new Object[0]);
            return -5;
        } else if (l.a(this.d, this.g.b)) {
            e.b("Worker", "has foreground service, cancel", new Object[0]);
            return -6;
        } else {
            e.b("Worker", "checkConstraints true " + i, new Object[0]);
            return 1;
        }
    }

    private int e(int i) {
        boolean clearActivityStack;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aef4f60a", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.g.b < 0) {
            e.b("Worker", "restart pid invalid", new Object[0]);
            e();
            return -7;
        }
        j a2 = j.a();
        if (a2.h()) {
            clearActivityStack = ProcessController.getInstance().clearActivityStack(ProcessController.CLEAR_STACK_ALL);
        } else {
            clearActivityStack = ProcessController.getInstance().clearActivityStack(this.d.getPackageName());
        }
        e.a("Worker", "clear stack ret:" + clearActivityStack, new Object[0]);
        if (!clearActivityStack) {
            e.b("Worker", "clear stack fail, return", new Object[0]);
            return -8;
        }
        g.b().a(2, false);
        if (l.c() && ProcessController.getInstance().isTinyProcess(this.d.getPackageName())) {
            e.b("Worker", "Don't clear tiny process", new Object[0]);
            return -13;
        }
        e.b("Worker", "killed Process", new Object[0]);
        if (a2.f()) {
            List<Integer> c = l.c(this.d);
            if (c == null) {
                return -7;
            }
            for (Integer num : c) {
                int intValue = num.intValue();
                e.a("Worker", "killed Process " + intValue, new Object[0]);
                Process.killProcess(intValue);
            }
        } else {
            Process.killProcess(this.g.b);
        }
        d dVar = this.g;
        dVar.b = -1;
        dVar.e = false;
        if (i != 7) {
            e();
        }
        if (a2.g() && (i == 3 || i == 4 || i == 5)) {
            e.b("Worker", "killed Self", new Object[0]);
            Process.killProcess(Process.myPid());
        }
        return 1;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!j.a().e()) {
            e.b("Worker", "startTargetProcess() not allowed, try to start light process", new Object[0]);
            if (TextUtils.isEmpty(j.a().i())) {
                return;
            }
            g.b().a(500L, false);
        } else {
            c.a(new Runnable() { // from class: com.taobao.adaemon.f.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    f.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Intent intent = new Intent();
                    intent.setPackage(f.e(f.this).getPackageName());
                    intent.setClassName(f.e(f.this).getPackageName(), TriggerService.class.getName());
                    if (Build.VERSION.SDK_INT < 26) {
                        e.b("Worker", "start TriggerService", new Object[0]);
                        f.e(f.this).startService(intent);
                        return;
                    }
                    e.b("Worker", "bind TriggerService", new Object[0]);
                    f.e(f.this).bindService(intent, f.j(f.this), 1);
                }
            }, 500L, TimeUnit.MILLISECONDS);
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (j <= 0) {
        } else {
            this.h = j;
        }
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
        } else if (j <= 0) {
        } else {
            this.j = j;
        }
    }

    public void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
        } else if (j < 0) {
        } else {
            this.k = j;
        }
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.l;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.d.registerReceiver(this.o, intentFilter);
    }
}
