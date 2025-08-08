package com.taobao.adaemon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.state.a;
import com.taobao.agoo.TaobaoRegister;
import com.taobao.android.dinamicx_v4.animation.util.b;
import com.taobao.atools.StaticHook;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.android.agoo.common.CallBack;
import tb.alj;
import tb.dcd;
import tb.dcz;
import tb.exz;
import tb.gbx;
import tb.kaq;
import tb.kat;
import tb.kav;
import tb.kge;
import tb.mto;
import tb.qgv;

/* loaded from: classes.dex */
public class ADaemon {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BOOST_LENGTH_LONG = 2;
    public static final int BOOST_LENGTH_SHORT = 1;
    private static final AtomicBoolean IS_INITIALIZED;
    private static final String KEY_DAY = "push_day";
    private static final String KEY_MINUTE = "push_minute";
    private static final String KEY_TIMES = "push_times";
    public static final int REASON_LIFECYCLE = 1;
    public static final int REASON_ND_PIC = 4;
    public static final int REASON_TAOLIVE = 2;
    public static final int REASON_TAOLIVE_PLAYER = 3;
    private static final String TAG = "adaemon";
    private static final byte[] TRACE_LOCK;
    public static volatile long appLaunchTimeInMill;
    public static volatile int curTabIndex;
    private static Method keepAliveInitMethod;
    private static boolean tab2Boosted;
    private static boolean tab5Boosted;
    public static boolean traceEnabled;

    private static boolean checkLockFrameReason(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("30d31862", new Object[]{new Integer(i)})).booleanValue() : i > 0 && i <= 4;
    }

    public static boolean isChannelMemOptimizeEnable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10657e29", new Object[]{context})).booleanValue();
        }
        return true;
    }

    public static boolean isChannelNativeOptimizeEnable(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51b19a55", new Object[]{context})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void access$000(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe40831", new Object[]{context});
        } else {
            startTargetProcess(context);
        }
    }

    static {
        kge.a(1743258024);
        IS_INITIALIZED = new AtomicBoolean(false);
        TRACE_LOCK = new byte[]{gbx.OP_MINIFY_CALL_FUNC, 115, 100, 99, 97, 114, 100, gbx.OP_MINIFY_CALL_FUNC, gbx.OP_ASSIGN, 116, 98, 95, 116, 114, 97, 99, 101};
        try {
            keepAliveInitMethod = Class.forName("com.taobao.keepalive.KeepAliveManager").getDeclaredMethod("initInChannel", Context.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        curTabIndex = -1;
    }

    public static void initialize(final Context context) {
        try {
            j.a().a(context);
        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
        if (l.k(context)) {
            e.b(TAG, "dual app", new Object[0]);
            return;
        }
        e.b(TAG, "initialize LocalProcessMonitor start", new Object[0]);
        g.b().b(context);
        final boolean g = l.g(context);
        if (j.a().b(context)) {
            c.a(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$ADaemon$daPNkUq9MtwL1OwaeIJOvR3rZ64
                @Override // java.lang.Runnable
                public final void run() {
                    ADaemon.lambda$initialize$1(g, context);
                }
            });
        }
        if (!g) {
            return;
        }
        Method method = keepAliveInitMethod;
        if (method != null) {
            try {
                method.invoke(null, context);
                e.b(TAG, "initialize keepAliveInitMethod success", new Object[0]);
            } catch (Throwable th) {
                e.a(TAG, "initialize keepAliveInitMethod err", th, new Object[0]);
            }
        }
        if (j.a().o()) {
            e.b(TAG, "start light process when launch, delay 3s", new Object[0]);
            g.b().a(3000L, false);
        }
        registerPush(context);
        c.a(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$ADaemon$WpyRkZCG5U-Q8NzVUfhche1FeGY
            @Override // java.lang.Runnable
            public final void run() {
                ADaemon.lambda$initialize$2(context);
            }
        });
    }

    public static /* synthetic */ void lambda$initialize$1(boolean z, final Context context) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f8a6d95", new Object[]{new Boolean(z), context});
            return;
        }
        try {
            if (IS_INITIALIZED.getAndSet(true)) {
                return;
            }
            if (z) {
                f.a().a(context);
                kat.a("accs", k.POINT_PROC_LAUNCHER, context.getPackageName() + ":channel", mto.a.GEO_NOT_SUPPORT);
            } else {
                String packageName = context.getPackageName();
                if (appLaunchTimeInMill > 0 && Build.VERSION.SDK_INT >= 30) {
                    long a2 = n.a(context, context.getPackageName());
                    long h = g.b().h(context);
                    boolean g = g.b().g(context);
                    if (h > 0 && a2 > h && appLaunchTimeInMill > a2 && a2 - h < 5000 && appLaunchTimeInMill - a2 < 10000 && !g) {
                        String i2 = g.b().i(context);
                        e.b(TAG, "restart after remove task", "page", i2);
                        packageName = packageName + "~~" + i2;
                        kat.a("accs", k.POINT_PROC_LAUNCHER, packageName, i);
                        c.e().execute(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$ADaemon$-nmP5lffR57topXAGH7U49RsKiQ
                            @Override // java.lang.Runnable
                            public final void run() {
                                ADaemon.lambda$null$0(context);
                            }
                        });
                    }
                }
                i = 0;
                kat.a("accs", k.POINT_PROC_LAUNCHER, packageName, i);
                c.e().execute(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$ADaemon$-nmP5lffR57topXAGH7U49RsKiQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        ADaemon.lambda$null$0(context);
                    }
                });
            }
            HashMap<String, String> hashMap = new HashMap<>(2);
            hashMap.put(TAG, "true");
            alj.a().a("accs_adaemon", hashMap);
        } catch (Throwable th) {
            e.a(TAG, "initialize error", th, new Object[0]);
        }
    }

    public static /* synthetic */ void lambda$null$0(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b132751", new Object[]{context});
        } else {
            exz.a(context);
        }
    }

    public static /* synthetic */ void lambda$initialize$2(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763af126", new Object[]{context});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.alibaba.android.instantpatch_action");
            context.registerReceiver(new PatchReceiver(), intentFilter);
        } catch (Throwable th) {
            e.a(TAG, "register patch err", th, new Object[0]);
        }
    }

    public static void initializeLifecycle(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d544f1a7", new Object[]{context});
        } else if (l.k(context) || context == null) {
        } else {
            e.b(TAG, "initialize activity lifecycle", new Object[0]);
            appLaunchTimeInMill = System.currentTimeMillis();
            j.a().h(context);
            g.b().a(context);
            g.b().d(false);
            c.a($$Lambda$ADaemon$3HzZ0ZsPIOwfSzqp5Yi7PLpQGz4.INSTANCE);
            try {
                com.taobao.tao.navigation.e.a(new com.taobao.tao.navigation.d() { // from class: com.taobao.adaemon.-$$Lambda$ADaemon$CPbwedNaNkA-o8b62z6gYnnAoq0
                    @Override // com.taobao.tao.navigation.d
                    public final void onTabChanged(int i, String str) {
                        ADaemon.lambda$initializeLifecycle$4(context, i, str);
                    }
                });
            } catch (Throwable th) {
                e.a(TAG, "addOnTabChangeListener err", th, new Object[0]);
            }
        }
    }

    public static /* synthetic */ void lambda$initializeLifecycle$3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2747d33", new Object[0]);
            return;
        }
        l.a((kav<Choreographer>) null);
        enableMainLooperTrace();
    }

    public static /* synthetic */ void lambda$initializeLifecycle$4(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f1267f9", new Object[]{context, new Integer(i), str});
        } else if (curTabIndex == i) {
        } else {
            curTabIndex = i;
            e.b(TAG, "onTabChanged", "tabIndex", Integer.valueOf(i), "tabName", str);
            if (i == 1 && !tab2Boosted) {
                tab2Boosted = true;
                boostCpu(1);
            }
            if (i == 4 && !tab5Boosted && o.a(o.KEY_TAO_TAB_BOOST)) {
                tab5Boosted = true;
                boostCpu(2);
            }
            qgv a2 = qgv.a();
            if (i == 0) {
                i2 = 10102;
            }
            a2.a(context, i2);
        }
    }

    private static void enableMainLooperTrace() {
        try {
            File file = new File(new String(TRACE_LOCK));
            File file2 = new File("/data/local/tmp/.trace_adaemon");
            if (!file.exists() && !file2.exists()) {
                return;
            }
            traceEnabled = true;
            Looper mainLooper = Looper.getMainLooper();
            Field c = StaticHook.c(Looper.class, "mTraceTag");
            c.setAccessible(true);
            e.b(TAG, "trace mTraceTagF：" + c.get(mainLooper), new Object[0]);
            c.set(mainLooper, 4097L);
            Field b = StaticHook.b(Trace.class, "sEnabledTags");
            b.setAccessible(true);
            e.b(TAG, "trace sEnabledTagsF：" + b.get(null), new Object[0]);
            b.set(null, 4097L);
            Method a2 = StaticHook.a(Trace.class, "nativeGetEnabledTags", new Class[0]);
            a2.setAccessible(true);
            e.b(TAG, "trace nativeGetEnabledTagsMtd: " + a2.invoke(null, new Object[0]), new Object[0]);
            Method a3 = StaticHook.a(Trace.class, "isTagEnabled", Long.TYPE);
            e.b(TAG, "enableMainLooperTrace succ: " + a3.invoke(null, 4097L), new Object[0]);
        } catch (Throwable th) {
            e.a(TAG, "enableMainLooperTrace err", th, new Object[0]);
        }
    }

    public static void postMainLooper(Runnable runnable, long... jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2854be", new Object[]{runnable, jArr});
        } else if (runnable == null) {
        } else {
            long j = (jArr == null || jArr.length != 1) ? 0L : jArr[0];
            e.b(TAG, "postMainLooper", "Runnable", runnable, b.DELAY_MILLIS, Long.valueOf(j));
            qgv.a().a(runnable, j);
        }
    }

    public static void removeMainLooperCallback(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c64cff8", new Object[]{runnable});
        } else if (runnable == null) {
        } else {
            e.b(TAG, "removeMainLooperCallback", "Runnable", runnable);
            if (traceEnabled) {
                Trace.beginSection("ADaemon:removeMainLooperCallback():" + runnable.hashCode());
            }
            qgv.a().a(runnable);
            if (!traceEnabled) {
                return;
            }
            Trace.endSection();
        }
    }

    public static void removeAllMainLooperCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c128b5ce", new Object[0]);
            return;
        }
        e.b(TAG, "removeAllMainLooperCallbacks", new Object[0]);
        if (traceEnabled) {
            Trace.beginSection("ADaemon:removeAllMainLooperCallbacks()");
        }
        qgv.a().b();
        if (!traceEnabled) {
            return;
        }
        Trace.endSection();
    }

    public static void interruptFrameLock(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e829328", new Object[]{new Long(j)});
            return;
        }
        e.b(TAG, "interruptFrameLock", Long.valueOf(j), Long.valueOf(j));
        qgv.a().a(j);
    }

    public static void pauseFrameLock(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26149ba", new Object[]{new Integer(i)});
        } else if (!checkLockFrameReason(i)) {
            e.b(TAG, "pauseFrameLock, illegalArgs", "reason", Integer.valueOf(i));
        } else {
            int t = g.b().t();
            e.b(TAG, "pauseFrameLock", "hash", Integer.valueOf(t), "reason", Integer.valueOf(i));
            qgv.a().b(t, i);
        }
    }

    public static void resumeFrameLock(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daf73fb1", new Object[]{new Integer(i)});
        } else if (!checkLockFrameReason(i)) {
            e.b(TAG, "resumeFrameLock, illegalArgs", "reason", Integer.valueOf(i));
        } else {
            int t = g.b().t();
            e.b(TAG, "resumeFrameLock", "hash", Integer.valueOf(t), "reason", Integer.valueOf(i));
            qgv.a().a(t, i);
        }
    }

    private static void registerPush(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adfb6de4", new Object[]{context});
        } else {
            TaobaoRegister.registerPushListener(context, new CallBack() { // from class: com.taobao.adaemon.ADaemon.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // org.android.agoo.common.CallBack
                public void onFailure(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                    }
                }

                @Override // org.android.agoo.common.CallBack
                public void onSuccess() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d0e393ab", new Object[]{this});
                    } else if (a.a().a(context)) {
                    } else {
                        if (l.a(l.e(), "push", ADaemon.KEY_DAY, ADaemon.KEY_TIMES, ADaemon.KEY_MINUTE) >= j.a().x()) {
                            e.b(ADaemon.TAG, "push execute limit", new Object[0]);
                        } else if (!m.a().c(context)) {
                            e.b(ADaemon.TAG, "push execute limit, install", new Object[0]);
                        } else {
                            ADaemon.access$000(context);
                            l.a(context, ADaemon.KEY_DAY, ADaemon.KEY_TIMES, ADaemon.KEY_MINUTE);
                        }
                    }
                }
            });
        }
    }

    private static void startTargetProcess(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d97ba045", new Object[]{context});
            return;
        }
        e.b(TAG, "startTargetProcess from push", new Object[0]);
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setClass(context, TriggerService.class);
        intent.putExtra("type", 4);
        dcd.a(context, intent);
    }

    public static void boostCpu(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e43fb77", new Object[]{new Integer(i)});
        } else if (i != 1 && i != 2) {
            e.b(TAG, "boostCpu illegalArgs", "duration", Integer.valueOf(i));
        } else {
            final int i2 = i * 1000;
            try {
                int i3 = l.i();
                e.b(TAG, "boostCpu", "devLevel", Integer.valueOf(i3));
                if (i3 == 2) {
                    i2 = (int) (i2 * 1.5d);
                }
            } catch (Throwable th) {
                e.a(TAG, "boostCpu err", th, new Object[0]);
            }
            c.e().execute(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$ADaemon$KBz_VoG7fze_vdCac740gdGA8tc
                @Override // java.lang.Runnable
                public final void run() {
                    ADaemon.lambda$boostCpu$5(i2);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$boostCpu$5(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b444a7e9", new Object[]{new Integer(i)});
        } else {
            exz.a(i);
        }
    }

    public static boolean optMyTaoTabBoost() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c92719c", new Object[0])).booleanValue() : o.a(o.KEY_TAO_TAB_BOOST);
    }

    public static boolean optPrewarmByProvider(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57fe0f88", new Object[]{context})).booleanValue();
        }
        try {
            kaq.a(context);
            if (!o.a(o.KEY_CLOSE_PROVIDER)) {
                return j.a().r();
            }
            return false;
        } catch (Throwable th) {
            e.a(TAG, "optPrewarmByProvider err", th, new Object[0]);
            return false;
        }
    }

    public static boolean optProviderPreload(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80e8cfa0", new Object[]{context})).booleanValue();
        }
        try {
            kaq.a(context);
            if (!o.a(o.KEY_CLOSE_PROVIDER)) {
                return o.a(o.KEY_PROVIDER_PRELOAD);
            }
            return false;
        } catch (Throwable th) {
            e.a(TAG, "optProviderPreload err", th, new Object[0]);
            return false;
        }
    }

    public static boolean isProcessAlive(String str) {
        i process;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb5e867d", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || (process = ProcessController.getInstance().getProcess(str)) == null) {
            return false;
        }
        return process.c();
    }

    public static boolean isProcessBackground(String str) {
        i process;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e5cef48", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || (process = ProcessController.getInstance().getProcess(str)) == null || !process.c()) {
            return true;
        }
        return process.a();
    }

    /* loaded from: classes.dex */
    public static class PatchReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2067606587);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null) {
            } else {
                e.b("PatchReceiver", "action", intent.getAction());
                if (!j.a().c()) {
                    e.b("PatchReceiver", "getPatchRestartSwitch not allowed", new Object[0]);
                    return;
                }
                boolean booleanExtra = intent.getBooleanExtra("triggered_from_app_after_instantpatch", false);
                boolean booleanExtra2 = intent.getBooleanExtra("triggered_from_app_background", false);
                boolean booleanExtra3 = intent.getBooleanExtra("instantpatch_channelProcNeedRestart", false);
                if (!booleanExtra || !booleanExtra2 || !booleanExtra3) {
                    return;
                }
                dcz.d().a();
            }
        }
    }
}
