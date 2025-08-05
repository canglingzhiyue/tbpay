package com.taobao.keepalive;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.accs.connection.state.a;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.adaemon.TriggerInstrumentation;
import com.taobao.atools.StaticHook;
import com.taobao.keepalive.KeepAliveManager;
import com.taobao.keepalive.account.AccountProvider;
import com.taobao.keepalive.account.SyncService;
import com.taobao.keepalive.periodic.AliveReceiver;
import com.taobao.orange.OrangeConfig;
import com.taobao.weex.utils.TBWXConfigManger;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kap;
import tb.kaq;
import tb.kat;
import tb.kge;
import tb.mto;
import tb.rtx;
import tb.rty;
import tb.rtz;
import tb.rua;
import tb.ruc;
import tb.rud;
import tb.syk;

/* loaded from: classes.dex */
public class KeepAliveManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FILE_LAUNCH = "f_launch";
    public static final String FILE_RECENT_ENTRANCE = "f_recent_entrance";
    public static final String FILE_REMOVE_TASK = "f_remove_task";
    public static final String SP_NAME_CHANNEL = "alive_channel";
    public static final String SP_NAME_MAIN = "alive_main";
    public static final String TAG = "KeepAliveManager";
    public static final AtomicBoolean initMain;
    public static boolean isLaunched;
    public static final BroadcastReceiver mReceiver;

    /* loaded from: classes.dex */
    public static class a implements a.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-606721380);
            kge.a(544005498);
        }

        @Override // com.taobao.accs.connection.state.a.b
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            rty.f33380a.d(KeepAliveManager.TAG, "onProcessDied", "process", str);
            ka.ka.ka.f.a.b.set(true);
            Context a2 = kaq.a();
            try {
                Intent intent = new Intent("com.taobao.alive.kill.finish_now");
                intent.setPackage(a2.getPackageName());
                a2.sendBroadcast(intent);
            } catch (Throwable th) {
                rty.f33380a.b(KeepAliveManager.TAG, "onActivityStarted sendBroadcast err", th, new Object[0]);
            }
            KeepAliveManager.access$000(a2);
        }

        @Override // com.taobao.accs.connection.state.a.b
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class b extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-606721379);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    rty.f33380a.d(KeepAliveManager.TAG, "ACTION_SCREEN_OFF", new Object[0]);
                } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                    rty.f33380a.d(KeepAliveManager.TAG, "ACTION_SCREEN_ON", new Object[0]);
                } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                } else {
                    rty.f33380a.d(KeepAliveManager.TAG, "ACTION_USER_PRESENT", new Object[0]);
                    KeepAliveManager.access$100(context.getApplicationContext());
                }
            } catch (Throwable th) {
                rty.f33380a.b(KeepAliveManager.TAG, "onReceive err", th, new Object[0]);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class c implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int f17641a = 0;
        public int b;
        public boolean c;

        static {
            kge.a(-606721378);
            kge.a(-1894394539);
        }

        public static /* synthetic */ void a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
                return;
            }
            rtx.a(context, KeepAliveManager.FILE_LAUNCH, Process.myPid() + "");
        }

        public static void b(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
                return;
            }
            try {
                rty.f33380a.d(KeepAliveManager.TAG, "send recent finish broadcast", new Object[0]);
                Intent intent = new Intent("tb.alive.recent.finish");
                intent.setPackage(context.getPackageName());
                context.sendBroadcast(intent);
            } catch (Exception e) {
                rty.f33380a.b(KeepAliveManager.TAG, "sendBroadcast err", e, new Object[0]);
            }
        }

        public static void c(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
                return;
            }
            try {
                Intent intent = new Intent("com.taobao.alive.kill.finish_now");
                intent.setPackage(context.getPackageName());
                context.sendBroadcast(intent);
            } catch (Throwable th) {
                rty.f33380a.b(KeepAliveManager.TAG, "onActivityStarted sendBroadcast err", th, new Object[0]);
            }
        }

        public void d(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
                return;
            }
            try {
                if (!syk.a.f33954a.e(context)) {
                    rty.f33380a.d(KeepAliveManager.TAG, "onActivityStopped switch off", new Object[0]);
                } else if (!TimeMeter.a("com.taobao.alive.kill.finish_delay", syk.a.f33954a.f(context) * 1000)) {
                    rty.f33380a.d(KeepAliveManager.TAG, "ACTION_DELAY_FINISH freq", new Object[0]);
                } else {
                    Intent intent = new Intent("com.taobao.alive.kill.finish_delay");
                    intent.setPackage(context.getPackageName());
                    context.sendOrderedBroadcast(intent, null);
                    this.c = true;
                }
            } catch (Exception e) {
                rty.f33380a.b(KeepAliveManager.TAG, "onBackState err", e, new Object[0]);
            }
        }

        public static /* synthetic */ void lambda$GcCeGvX7qqVPQFI4GPljHeBs2p8(c cVar, Context context) {
            cVar.d(context);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            final Context applicationContext = activity.getApplicationContext();
            if (!KeepAliveManager.access$200()) {
                KeepAliveManager.access$202(true);
                rtz.b().schedule(new Runnable() { // from class: com.taobao.keepalive.-$$Lambda$fRiNvuTFFYfzOINVWbFWKfxfkus
                    @Override // java.lang.Runnable
                    public final void run() {
                        KeepAliveManager.c.a(applicationContext);
                    }
                }, 3L, TimeUnit.SECONDS);
            }
            int i = this.b + 1;
            this.b = i;
            if (i != 1 || !syk.a.f33954a.d(applicationContext)) {
                return;
            }
            rtz.a().schedule(new Runnable() { // from class: com.taobao.keepalive.-$$Lambda$8rCubdbnP4neAMkQFxn_5XGsOno
                @Override // java.lang.Runnable
                public final void run() {
                    KeepAliveManager.c.b(applicationContext);
                }
            }, 10L, TimeUnit.SECONDS);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                this.b--;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            int i = this.f17641a;
            this.f17641a = i + 1;
            if (i != 0) {
                return;
            }
            rty.f33380a.d(KeepAliveManager.TAG, "onForeground", new Object[0]);
            if (!this.c) {
                return;
            }
            this.c = false;
            rty.f33380a.d(KeepAliveManager.TAG, "send finish broad cast", new Object[0]);
            final Context applicationContext = activity.getApplicationContext();
            rtz.a().execute(new Runnable() { // from class: com.taobao.keepalive.-$$Lambda$TnkF7-AcgsxByo0NPv9xKUN_pGc
                @Override // java.lang.Runnable
                public final void run() {
                    KeepAliveManager.c.c(applicationContext);
                }
            });
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            int max = Math.max(0, this.f17641a - 1);
            this.f17641a = max;
            if (max != 0) {
                return;
            }
            rty.f33380a.d(KeepAliveManager.TAG, "onBackground", new Object[0]);
            final Context a2 = kaq.a();
            rtz.a().execute(new Runnable() { // from class: com.taobao.keepalive.-$$Lambda$KeepAliveManager$c$GcCeGvX7qqVPQFI4GPljHeBs2p8
                {
                    KeepAliveManager.c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    KeepAliveManager.c.lambda$GcCeGvX7qqVPQFI4GPljHeBs2p8(KeepAliveManager.c.this, a2);
                }
            });
        }
    }

    static {
        kge.a(-1332473441);
        initMain = new AtomicBoolean();
        mReceiver = new b();
    }

    public static void a(Context context) {
        long j;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            if (!syk.a.f33954a.d(context)) {
                return;
            }
            rty.f33380a.d(TAG, "addRecentEntrance", new Object[0]);
            String b2 = rtx.b(context, FILE_RECENT_ENTRANCE, "-1");
            if ("-1".equals(b2)) {
                rty.f33380a.d(TAG, "recentStr err", new Object[0]);
            } else if (!TextUtils.isEmpty(b2) && Integer.parseInt(b2) == Calendar.getInstance().get(6)) {
                rty.f33380a.c(TAG, "addRecentEntrance, already added today", new Object[0]);
                kat.a("keepalive", "full_verify", "recent added", mto.a.GEO_NOT_SUPPORT);
            } else {
                try {
                    j = Long.parseLong(rtx.b(context, FILE_REMOVE_TASK, "-1"));
                } catch (Throwable unused) {
                    j = 0;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (j > 0 && currentTimeMillis > j) {
                    long j2 = currentTimeMillis - j;
                    try {
                        string = context.getSharedPreferences("keepalive", 4).getString("r_e_kill_delay", "2880");
                    } catch (Exception e) {
                        rty.f33380a.b("RemoteConfig", "getConfigFromSP fail:", null, e, "key", "r_e_kill_delay");
                    }
                    if (j2 < Integer.parseInt(string) * 60000) {
                        rty.f33380a.d(TAG, "addRecentEntrance, kill recently", "lastKillTime", Long.valueOf(j));
                        return;
                    }
                }
                Iterator it = ((ArrayList) rtx.a(context)).iterator();
                String str = "";
                boolean z = false;
                while (it.hasNext()) {
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
                    if ("com.taobao.taobao".equals(runningAppProcessInfo.processName)) {
                        str = runningAppProcessInfo.pid + "";
                    } else if (runningAppProcessInfo.processName.endsWith(TBWXConfigManger.WX_SUPPORT_KEY)) {
                        z = true;
                    }
                }
                if (z) {
                    rty.f33380a.d(TAG, "addRecentEntrance, support process alive", new Object[0]);
                    return;
                }
                String b3 = rtx.b(context, FILE_LAUNCH, "");
                if (!TextUtils.isEmpty(str) && str.equals(b3)) {
                    rty.f33380a.d(TAG, "addRecentEntrance, activity already started", "mainProcessPid", str, "lastMainPid", b3);
                } else {
                    addRecentEntranceImpl(context);
                }
            }
        } catch (Throwable th) {
            rty.f33380a.b(TAG, "addRecentEntrance err", th, new Object[0]);
        }
    }

    public static /* synthetic */ void access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            recordLastRemoveTask(context);
        }
    }

    public static /* synthetic */ void access$100(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18144810", new Object[]{context});
        } else {
            addRecentEntrance(context);
        }
    }

    public static /* synthetic */ boolean access$200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("26a27dfd", new Object[0])).booleanValue() : isLaunched;
    }

    public static /* synthetic */ boolean access$202(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b117a53d", new Object[]{new Boolean(z)})).booleanValue();
        }
        isLaunched = z;
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x009f, code lost:
        if (r0 <= r11) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void accountSync(android.content.Context r11) {
        /*
            java.lang.String r0 = "RemoteConfig"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.keepalive.KeepAliveManager.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L14
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r4] = r11
            java.lang.String r11 = "b2181bb9"
            r1.ipc$dispatch(r11, r0)
            return
        L14:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            tb.rty r2 = tb.rty.f33380a
            java.lang.String r5 = "KeepAliveManager"
            java.lang.String r6 = "accountSync"
            r2.d(r5, r6, r1)
            java.lang.String r1 = "淘宝"
            java.lang.String r2 = "tb_alive.account"
            java.lang.String r6 = "com.taobao.alive.account"
            java.lang.String r7 = "account"
            java.lang.Object r7 = r11.getSystemService(r7)
            android.accounts.AccountManager r7 = (android.accounts.AccountManager) r7
            android.accounts.Account[] r8 = r7.getAccountsByType(r2)     // Catch: java.lang.Throwable -> Lbd
            android.accounts.Account r9 = new android.accounts.Account     // Catch: java.lang.Throwable -> Lbd
            r9.<init>(r1, r2)     // Catch: java.lang.Throwable -> Lbd
            int r1 = r8.length     // Catch: java.lang.Throwable -> Lbd
            if (r1 != 0) goto L46
            java.lang.String r1 = "tb20231127"
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lbd
            r2.<init>()     // Catch: java.lang.Throwable -> Lbd
            r7.addAccountExplicitly(r9, r1, r2)     // Catch: java.lang.Throwable -> Lbd
        L46:
            android.content.ContentResolver.setIsSyncable(r9, r6, r3)     // Catch: java.lang.Throwable -> Lbd
            android.content.ContentResolver.setSyncAutomatically(r9, r6, r3)     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r1 = "reduce_account_range"
            java.lang.String r2 = "39-39"
            java.lang.String r7 = "keepalive"
            r8 = 4
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r7, r8)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            java.lang.String r2 = r11.getString(r1, r2)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            goto L77
        L5e:
            r11 = move-exception
            goto La2
        L60:
            r11 = move-exception
            java.lang.String r7 = "getConfigFromSP fail:"
            r8 = 0
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L5e
            r10[r4] = r11     // Catch: java.lang.Throwable -> L5e
            java.lang.String r11 = "key"
            r10[r3] = r11     // Catch: java.lang.Throwable -> L5e
            r11 = 2
            r10[r11] = r1     // Catch: java.lang.Throwable -> L5e
            tb.rty r11 = tb.rty.f33380a     // Catch: java.lang.Throwable -> L5e
            r11.b(r0, r7, r8, r10)     // Catch: java.lang.Throwable -> L5e
        L77:
            boolean r11 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L5e
            if (r11 != 0) goto Lab
            boolean r11 = com.taobao.accs.utl.UtilityImpl.isAppKeepAlive()     // Catch: java.lang.Throwable -> L5e
            if (r11 == 0) goto Lab
            java.lang.String r11 = "-"
            java.lang.String[] r11 = r2.split(r11)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> Lab
            r1 = r11[r4]     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> Lab
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> Lab
            r11 = r11[r3]     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> Lab
            int r11 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> Lab
            android.content.Context r2 = tb.kaq.a()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> Lab
            int r0 = com.taobao.accs.utl.UtilityImpl.getAppKeepAliveBucketId(r2)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> Lab
            if (r0 < r1) goto Lab
            if (r0 > r11) goto Lab
            goto Lac
        La2:
            java.lang.String r1 = "[optReduceAccountEnabled] err"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lbd
            tb.rty r3 = tb.rty.f33380a     // Catch: java.lang.Throwable -> Lbd
            r3.b(r0, r1, r11, r2)     // Catch: java.lang.Throwable -> Lbd
        Lab:
            r3 = 0
        Lac:
            if (r3 == 0) goto Lb1
            r11 = 3600(0xe10, float:5.045E-42)
            goto Lb3
        Lb1:
            r11 = 900(0x384, float:1.261E-42)
        Lb3:
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lbd
            r0.<init>()     // Catch: java.lang.Throwable -> Lbd
            long r1 = (long) r11     // Catch: java.lang.Throwable -> Lbd
            android.content.ContentResolver.addPeriodicSync(r9, r6, r0, r1)     // Catch: java.lang.Throwable -> Lbd
            return
        Lbd:
            r11 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r4]
            tb.rty r1 = tb.rty.f33380a
            java.lang.String r2 = "set account err"
            r1.b(r5, r2, r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.keepalive.KeepAliveManager.accountSync(android.content.Context):void");
    }

    public static void addRecentEntrance(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6000c12f", new Object[]{context});
        } else if (Build.VERSION.SDK_INT < 30) {
        } else {
            rtz.b().execute(new Runnable() { // from class: com.taobao.keepalive.-$$Lambda$yS4sj0GC3wEyaffTxC6MHnoLa5s
                @Override // java.lang.Runnable
                public final void run() {
                    KeepAliveManager.a(context);
                }
            });
        }
    }

    public static void addRecentEntranceImpl(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3dbef", new Object[]{context});
            return;
        }
        rty.f33380a.d(TAG, "addRecentEntranceImpl", new Object[0]);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Intent intent = new Intent(context, SupportRecentActivity.class);
            intent.putExtra("time", elapsedRealtime);
            intent.putExtra("seed", new Random().nextInt(1000));
            intent.addFlags(268435456);
            context.startActivity(intent);
            rty.f33380a.d(TAG, "addRecentEntranceImpl success", new Object[0]);
        } catch (Throwable th) {
            rty.f33380a.b(TAG, "addRecentEntranceImpl err", th, new Object[0]);
        }
    }

    public static /* synthetic */ void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else {
            AliveReceiver.a(context);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{context});
            return;
        }
        ComponentName componentName = new ComponentName(context, AccountProvider.class);
        ComponentName componentName2 = new ComponentName(context, SyncService.class);
        if (syk.a.f33954a.c(context)) {
            rtx.b(context, componentName);
            rtx.b(context, componentName2);
            accountSync(context);
            return;
        }
        rtx.a(context, componentName);
        rtx.a(context, componentName2);
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{context});
        } else if (Build.VERSION.SDK_INT >= 30) {
            long j = 0;
            for (ApplicationExitInfo applicationExitInfo : ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(context.getPackageName(), 0, 16)) {
                if (!TextUtils.isEmpty(applicationExitInfo.getDescription()) && applicationExitInfo.getDescription().toLowerCase().contains("remove task")) {
                    j = Math.max(j, applicationExitInfo.getTimestamp());
                }
            }
            if (j <= 0) {
                return;
            }
            rtx.a(context, FILE_REMOVE_TASK, j + "");
            rty.f33380a.d(TAG, "record remove-task", "lastKillTime", Long.valueOf(j));
        }
    }

    public static void initInChannel(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52299af3", new Object[]{context});
        } else if (kap.e()) {
        } else {
            rty.f33380a.d(TAG, "initInChannel", MspDBHelper.BizEntry.COLUMN_NAME_PID, Integer.valueOf(Process.myPid()));
            recordLastRemoveTask(context);
            syk sykVar = syk.a.f33954a;
            sykVar.f33953a = context;
            try {
                Class.forName("com.taobao.orange.OrangeConfig");
                Class.forName("com.taobao.orange.d");
                OrangeConfig.getInstance().registerListener(new String[]{"keepalive"}, new rua(sykVar), true);
            } catch (Exception e) {
                rty.f33380a.b("RemoteConfig", "[init]error.", null, e);
            }
            if (syk.a.f33954a.a(context)) {
                if (rud.f33385a == null) {
                    synchronized (rud.class) {
                        if (rud.f33385a == null) {
                            rud.f33385a = new rud();
                        }
                    }
                }
                rud rudVar = rud.f33385a;
                if (rudVar != null) {
                    rty.f33380a.d("ProcessAdjuster", "init", new Object[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        Context a2 = kaq.a();
                        boolean b2 = syk.a.f33954a.b(a2);
                        boolean a3 = com.taobao.accs.connection.state.a.a().a(a2);
                        if (!b2 && !a3) {
                            rudVar.b();
                        } else {
                            com.taobao.accs.connection.state.a.a().a(new ruc(rudVar));
                            if (!a3) {
                                rudVar.b();
                            }
                        }
                    }
                } else {
                    throw null;
                }
            }
            rtz.b().execute($$Lambda$FJ5sH7Q7Neef2XTQdHkGLN32vs.INSTANCE);
            if (UtilityImpl.isAppKeepAlive()) {
                rtz.b().scheduleWithFixedDelay(new Runnable() { // from class: com.taobao.keepalive.-$$Lambda$D5afOzycOjxNVE8EKTZPljazXEg
                    @Override // java.lang.Runnable
                    public final void run() {
                        KeepAliveManager.b(context);
                    }
                }, 0L, 60L, TimeUnit.MINUTES);
            }
            listenToProcessState();
            if (syk.a.f33954a.e(context)) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.taobao.alive.kill.finish_delay");
                    intentFilter.addAction("com.taobao.alive.kill.finish_now");
                    context.registerReceiver(new ka.ka.ka.f.a(), intentFilter);
                    rty.f33380a.d(TAG, "register PreventKillReceiver", new Object[0]);
                } catch (Throwable th) {
                    rty.f33380a.b(TAG, "register PreventKillReceiver err", th, new Object[0]);
                }
            }
            rtz.b().execute(new Runnable() { // from class: com.taobao.keepalive.-$$Lambda$mBN1AIlTcn9-yPnuaJSLiHXLPko
                @Override // java.lang.Runnable
                public final void run() {
                    KeepAliveManager.c(context);
                }
            });
        }
    }

    public static void initInMainProcess(Context context) {
        if (initMain.getAndSet(true)) {
            rty.f33380a.d(TAG, "main process has been initialized", new Object[0]);
            return;
        }
        rty.f33380a.d(TAG, "initInMainProcess", new Object[0]);
        recordLastRemoveTask(context);
        if (!(context instanceof Application)) {
            return;
        }
        Application application = (Application) context;
        try {
            Field a2 = StaticHook.a(Application.class, "mActivityLifecycleCallbacks");
            a2.setAccessible(true);
            ArrayList arrayList = (ArrayList) a2.get(application);
            Object[] objArr = new Object[2];
            objArr[0] = "lifecycleList is null";
            objArr[1] = Boolean.valueOf(arrayList == null);
            rty.f33380a.d(TAG, "Add lifecycle", objArr);
            if (arrayList == null) {
                return;
            }
            synchronized (arrayList) {
                arrayList.add(0, new c());
            }
        } catch (Exception e) {
            rty.f33380a.b(TAG, "hook lifecycle err", e, new Object[0]);
        }
    }

    public static boolean isInstrMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1ca6a6b0", new Object[0])).booleanValue() : TriggerInstrumentation.triggered.get();
    }

    public static void listenToProcessState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef3e9ab", new Object[0]);
        } else {
            com.taobao.accs.connection.state.a.a().a(new a());
        }
    }

    public static void recordLastRemoveTask(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f53c1511", new Object[]{context});
        } else {
            rtz.b().schedule(new Runnable() { // from class: com.taobao.keepalive.-$$Lambda$6JY3IqOWgjhdDfZDUIiHTnEJ6yw
                @Override // java.lang.Runnable
                public final void run() {
                    KeepAliveManager.d(context);
                }
            }, UtilityImpl.isMainProcess(context) ? 3L : 0L, TimeUnit.SECONDS);
        }
    }

    public static void registerScreenReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f15985", new Object[0]);
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            kaq.a().registerReceiver(mReceiver, intentFilter);
        } catch (Throwable th) {
            rty.f33380a.b(TAG, "registerScreenReceiver err", th, new Object[0]);
        }
    }
}
