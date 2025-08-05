package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.Window;
import com.alibaba.ability.impl.performance.PerformanceAbility;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.connection.state.TimeMeter;
import com.taobao.adaemon.ADaemon;
import com.taobao.adaemon.g;
import com.taobao.adaemon.j;
import com.taobao.adaemon.k;
import com.taobao.adaemon.l;
import com.taobao.adaemon.o;
import com.taobao.android.detail.core.standard.video.AbsPicGalleryVideoPlayer;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.atools.StaticHook;
import dalvik.system.PathClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import tb.mto;
import tb.qgv;

/* loaded from: classes.dex */
public class qgv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RATE_DEFAULT = 0;
    public static final int RATE_HIGH = 10102;
    public static final int RATE_MIDDLE = 20201;
    private static volatile int d;

    /* renamed from: a */
    private final Handler f32927a;
    private final a b;
    private final a c;
    private final a e;
    private final List<Integer> f;
    private final Set<Integer> g;

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final qgv f32929a;

        static {
            kge.a(-853066748);
            f32929a = new qgv();
        }
    }

    public static /* synthetic */ void lambda$9Vn_mGTdV35_SiHGk0YaeGPAuZ4(qgv qgvVar, int i) {
        qgvVar.a(i);
    }

    public static /* synthetic */ void lambda$G8Y6jSba6gbrhJGhcF3gTx_tlGs(qgv qgvVar, Runnable runnable, long j) {
        qgvVar.b(runnable, j);
    }

    /* renamed from: lambda$HUJzTlH9OtUkfGKzO0TwXV-H_UY */
    public static /* synthetic */ void m2480lambda$HUJzTlH9OtUkfGKzO0TwXVH_UY(qgv qgvVar, int i, int i2) {
        qgvVar.d(i, i2);
    }

    public static /* synthetic */ void lambda$JZNgqdh36M_txyoKs9tbNxcHmzg(qgv qgvVar, Activity activity) {
        qgvVar.c(activity);
    }

    /* renamed from: lambda$S_IqcS7HUmc2Z-DfDDcXaK60TU4 */
    public static /* synthetic */ void m2481lambda$S_IqcS7HUmc2ZDfDDcXaK60TU4(qgv qgvVar, long j) {
        qgvVar.b(j);
    }

    /* renamed from: lambda$SdL4dHSu-G7gBl98B561wf3SGD4 */
    public static /* synthetic */ void m2482lambda$SdL4dHSuG7gBl98B561wf3SGD4(qgv qgvVar, int i) {
        qgvVar.c(i);
    }

    public static /* synthetic */ Object lambda$fxrfj0RrDdjzAWCewx7rYyDXLLg(qgv qgvVar, Activity activity, Object obj, Method method, Object[] objArr) {
        return qgvVar.a(activity, obj, method, objArr);
    }

    /* renamed from: lambda$iNzlFDYaNxT8N-GhZD-chUeL6-I */
    public static /* synthetic */ void m2483lambda$iNzlFDYaNxT8NGhZDchUeL6I(qgv qgvVar) {
        qgvVar.g();
    }

    public static /* synthetic */ void lambda$n3Y_HFob7wBXr6kANsuNSgfd3yA(qgv qgvVar, int i, int i2) {
        qgvVar.c(i, i2);
    }

    /* renamed from: lambda$qI88pG-q_LaY7KVc-dDCmUng4E8 */
    public static /* synthetic */ void m2484lambda$qI88pGq_LaY7KVcdDCmUng4E8(qgv qgvVar, Runnable runnable) {
        qgvVar.b(runnable);
    }

    public static /* synthetic */ Set a(qgv qgvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("e8af1fa7", new Object[]{qgvVar}) : qgvVar.g;
    }

    public static /* synthetic */ List b(qgv qgvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1da50cee", new Object[]{qgvVar}) : qgvVar.f;
    }

    static {
        kge.a(-585326228);
        d = -1;
    }

    public static qgv a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qgv) ipChange.ipc$dispatch("f0993fe", new Object[0]) : c.f32929a;
    }

    private qgv() {
        this.f = new CopyOnWriteArrayList();
        this.g = new HashSet();
        this.f32927a = new Handler(Looper.getMainLooper());
        Context e2 = l.e();
        this.b = new b(e2);
        this.c = new e(e2);
        this.e = new d(e2);
    }

    public void a(Context context, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{this, context, new Integer(i)});
            return;
        }
        String str = Build.BRAND;
        if ((!"Xiaomi".equals(str) && !"Redmi".equals(str)) || !j.a().L() || context == null) {
            return;
        }
        if ((i != 0 && i != 10102 && i != 20201) || i == d) {
            return;
        }
        d = i;
        com.taobao.adaemon.e.b("FrameRater", "limit", RateNode.TAG, Integer.valueOf(i));
        com.taobao.adaemon.c.f().execute(new Runnable() { // from class: tb.-$$Lambda$qgv$9Vn_mGTdV35_SiHGk0YaeGPAuZ4
            @Override // java.lang.Runnable
            public final void run() {
                qgv.lambda$9Vn_mGTdV35_SiHGk0YaeGPAuZ4(qgv.this, i);
            }
        });
    }

    public /* synthetic */ void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.arg1 = i;
        this.b.a(obtain);
    }

    public void a(final Runnable runnable, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{this, runnable, new Long(j)});
        } else if (!o.a()) {
            this.f32927a.postDelayed(runnable, j);
        } else {
            com.taobao.adaemon.c.f().execute(new Runnable() { // from class: tb.-$$Lambda$qgv$G8Y6jSba6gbrhJGhcF3gTx_tlGs
                @Override // java.lang.Runnable
                public final void run() {
                    qgv.lambda$G8Y6jSba6gbrhJGhcF3gTx_tlGs(qgv.this, runnable, j);
                }
            });
        }
    }

    public /* synthetic */ void b(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706b13bd", new Object[]{this, runnable, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = runnable;
        obtain.arg1 = (int) j;
        this.c.a(obtain);
    }

    public void a(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (!o.a()) {
            this.f32927a.removeCallbacks(runnable);
        } else {
            com.taobao.adaemon.c.f().execute(new Runnable() { // from class: tb.-$$Lambda$qgv$qI88pG-q_LaY7KVc-dDCmUng4E8
                @Override // java.lang.Runnable
                public final void run() {
                    qgv.m2484lambda$qI88pGq_LaY7KVcdDCmUng4E8(qgv.this, runnable);
                }
            });
        }
    }

    public /* synthetic */ void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = runnable;
        this.c.a(obtain);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!o.a()) {
            this.f32927a.removeCallbacksAndMessages(null);
        } else {
            com.taobao.adaemon.c.f().execute(new Runnable() { // from class: tb.-$$Lambda$qgv$iNzlFDYaNxT8N-GhZD-chUeL6-I
                @Override // java.lang.Runnable
                public final void run() {
                    qgv.m2483lambda$iNzlFDYaNxT8NGhZDchUeL6I(qgv.this);
                }
            });
        }
    }

    public /* synthetic */ void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 3;
        this.c.a(obtain);
    }

    private boolean b(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{this, activity})).booleanValue();
        }
        if (l.n(activity) < 60.0f) {
            com.taobao.adaemon.e.b("FrameRater", "hookTouchEvent, refreshRate < 60", new Object[0]);
            return false;
        }
        try {
            activity.getWindow().setCallback((Window.Callback) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Window.Callback.class}, new InvocationHandler() { // from class: tb.-$$Lambda$qgv$fxrfj0RrDdjzAWCewx7rYyDXLLg
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    return qgv.lambda$fxrfj0RrDdjzAWCewx7rYyDXLLg(qgv.this, activity, obj, method, objArr);
                }
            }));
            this.f.add(Integer.valueOf(activity.hashCode()));
            com.taobao.adaemon.e.b("FrameRater", "hookTouchEvent, success", "activity", activity.getLocalClassName());
            return true;
        } catch (Throwable th) {
            com.taobao.adaemon.e.a("FrameRater", "hookTouchEvent err", th, new Object[0]);
            return false;
        }
    }

    public /* synthetic */ Object a(Activity activity, Object obj, Method method, Object[] objArr) throws Throwable {
        if ("dispatchTouchEvent".equals(method.getName()) && TimeMeter.a("FrameRater_hookTouchEvent", 500L)) {
            com.taobao.adaemon.e.b("FrameRater", "dispatchTouchEvent", new Object[0]);
            a(3000L);
        }
        return method.invoke(activity, objArr);
    }

    public void a(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (!j.a().M()) {
        } else {
            com.taobao.adaemon.c.f().execute(new Runnable() { // from class: tb.-$$Lambda$qgv$JZNgqdh36M_txyoKs9tbNxcHmzg
                @Override // java.lang.Runnable
                public final void run() {
                    qgv.lambda$JZNgqdh36M_txyoKs9tbNxcHmzg(qgv.this, activity);
                }
            });
        }
    }

    public /* synthetic */ void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{this, activity});
            return;
        }
        if (j.a().m()) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException unused) {
            }
        }
        if (!b(activity)) {
            return;
        }
        com.taobao.adaemon.e.b("FrameRater", "lock start", new Object[0]);
        Message obtain = Message.obtain();
        obtain.what = 4;
        this.e.a(obtain);
    }

    public void a(final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            com.taobao.adaemon.c.f().execute(new Runnable() { // from class: tb.-$$Lambda$qgv$S_IqcS7HUmc2Z-DfDDcXaK60TU4
                @Override // java.lang.Runnable
                public final void run() {
                    qgv.m2481lambda$S_IqcS7HUmc2ZDfDDcXaK60TU4(qgv.this, j);
                }
            });
        }
    }

    public /* synthetic */ void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 6;
        obtain.arg1 = (int) j;
        this.e.a(obtain);
    }

    public void a(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            com.taobao.adaemon.c.f().execute(new Runnable() { // from class: tb.-$$Lambda$qgv$HUJzTlH9OtUkfGKzO0TwXV-H_UY
                @Override // java.lang.Runnable
                public final void run() {
                    qgv.m2480lambda$HUJzTlH9OtUkfGKzO0TwXVH_UY(qgv.this, i, i2);
                }
            });
        }
    }

    public /* synthetic */ void d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac4048b", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!this.f.contains(Integer.valueOf(i))) {
        } else {
            com.taobao.adaemon.e.b("FrameRater", "resumeLock start", new Object[0]);
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = i;
            obtain.arg2 = i2;
            this.e.a(obtain);
        }
    }

    public void b(final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            com.taobao.adaemon.c.f().execute(new Runnable() { // from class: tb.-$$Lambda$qgv$n3Y_HFob7wBXr6kANsuNSgfd3yA
                @Override // java.lang.Runnable
                public final void run() {
                    qgv.lambda$n3Y_HFob7wBXr6kANsuNSgfd3yA(qgv.this, i, i2);
                }
            });
        }
    }

    public /* synthetic */ void c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ddc94a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!this.f.contains(Integer.valueOf(i))) {
            if (i2 != 3) {
                return;
            }
            this.g.add(Integer.valueOf(i2));
        } else {
            com.taobao.adaemon.e.b("FrameRater", "pauseLock start", new Object[0]);
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = i;
            obtain.arg2 = i2;
            this.e.a(obtain);
        }
    }

    public void b(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            com.taobao.adaemon.c.f().execute(new Runnable() { // from class: tb.-$$Lambda$qgv$SdL4dHSu-G7gBl98B561wf3SGD4
                @Override // java.lang.Runnable
                public final void run() {
                    qgv.m2482lambda$SdL4dHSuG7gBl98B561wf3SGD4(qgv.this, i);
                }
            });
        }
    }

    public /* synthetic */ void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (!this.f.remove(Integer.valueOf(i))) {
        } else {
            com.taobao.adaemon.e.b("FrameRater", "unlock start", new Object[0]);
            Message obtain = Message.obtain();
            obtain.what = 5;
            obtain.arg1 = i;
            this.e.a(obtain);
        }
    }

    /* loaded from: classes.dex */
    public abstract class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public Context f32928a;
        private final AtomicBoolean c = new AtomicBoolean();

        static {
            kge.a(-1547702157);
        }

        public abstract void a();

        public a(Context context) {
            qgv.this = r1;
            this.f32928a = context;
        }

        public void a(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
            } else if (this.c.getAndSet(true)) {
            } else {
                a();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Object d;
        private Method e;
        private boolean f;

        static {
            kge.a(-567548446);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 1788467643) {
                super.a((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(context);
            qgv.this = r1;
        }

        @Override // tb.qgv.a
        public void a() {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                PathClassLoader pathClassLoader = new PathClassLoader("/system/framework/MiuiBooster.jar", ClassLoader.getSystemClassLoader());
                Class loadClass = pathClassLoader.loadClass("com.miui.performance.MiuiBooster");
                this.d = loadClass.newInstance();
                Class loadClass2 = pathClassLoader.loadClass("com.miui.performance.DeviceLevelUtils");
                int intValue = ((Integer) loadClass2.getDeclaredMethod(PerformanceAbility.API_GET_DEVICE_LEVEL, Integer.TYPE).invoke(loadClass2.getConstructor(Context.class).newInstance(this.f32928a), 1)).intValue();
                if (intValue != 2 && intValue != 3) {
                    com.taobao.adaemon.e.b("FrameRater_BoostFrame", "init, low level return", "level", Integer.valueOf(intValue));
                    return;
                }
                boolean booleanValue = ((Boolean) loadClass.getDeclaredMethod(com.taobao.desktop.channel.calendar.a.CALENDAR_EVENT_PERMISSION_CHECK, String.class, Integer.TYPE).invoke(this.d, this.f32928a.getPackageName(), Integer.valueOf(Process.myUid()))).booleanValue();
                com.taobao.adaemon.e.b("FrameRater_BoostFrame", "init permission", "result", Boolean.valueOf(booleanValue));
                if (!booleanValue) {
                    return;
                }
                this.e = loadClass.getDeclaredMethod("setDynamicRefreshRateScene", Integer.TYPE, String.class, Integer.TYPE);
                com.taobao.adaemon.e.b("FrameRater_BoostFrame", "init success", "setFrameMtd", this.e, "spent", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            } catch (Throwable th) {
                com.taobao.adaemon.e.a("FrameRater_BoostFrame", "init err", th, new Object[0]);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        @Override // tb.qgv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.os.Message r10) {
            /*
                r9 = this;
                super.a(r10)
                int r10 = r10.arg1
                java.lang.reflect.Method r0 = r9.e
                r1 = 3
                r2 = 2
                java.lang.String r3 = "FrameRater_BoostFrame"
                r4 = 1
                r5 = 0
                if (r0 == 0) goto L3f
                java.lang.Object r6 = r9.d     // Catch: java.lang.Throwable -> L36
                java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L36
                int r8 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> L36
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L36
                r7[r5] = r8     // Catch: java.lang.Throwable -> L36
                android.content.Context r8 = r9.f32928a     // Catch: java.lang.Throwable -> L36
                java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Throwable -> L36
                r7[r4] = r8     // Catch: java.lang.Throwable -> L36
                java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L36
                r7[r2] = r8     // Catch: java.lang.Throwable -> L36
                java.lang.Object r0 = r0.invoke(r6, r7)     // Catch: java.lang.Throwable -> L36
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L36
                int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L36
                goto L40
            L36:
                r0 = move-exception
                java.lang.Object[] r6 = new java.lang.Object[r5]
                java.lang.String r7 = "setFrameRate err"
                com.taobao.adaemon.e.a(r3, r7, r0, r6)
            L3f:
                r0 = -1
            L40:
                r6 = 4
                java.lang.Object[] r6 = new java.lang.Object[r6]
                java.lang.String r7 = "ret"
                r6[r5] = r7
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                r6[r4] = r5
                java.lang.String r5 = "rate"
                r6[r2] = r5
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r6[r1] = r10
                java.lang.String r10 = "setFrameRate"
                com.taobao.adaemon.e.b(r3, r10, r6)
                boolean r10 = r9.f
                if (r10 != 0) goto L7a
                r9.f = r4
                if (r0 != 0) goto L6b
                com.taobao.adaemon.k.g.a()
                return
            L6b:
                java.lang.reflect.Method r10 = r9.e
                if (r10 != 0) goto L73
                java.lang.String r10 = "permission"
                goto L77
            L73:
                java.lang.String r10 = java.lang.String.valueOf(r0)
            L77:
                com.taobao.adaemon.k.g.a(r10)
            L7a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.qgv.b.a(android.os.Message):void");
        }
    }

    /* loaded from: classes.dex */
    public class e extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final AtomicBoolean d;
        private final List<Runnable> e;
        private final LinkedBlockingQueue<Runnable> f;
        private Handler g;
        private Choreographer h;
        private Choreographer.FrameCallback i;
        private volatile Handler j;
        private long k;
        private final AtomicBoolean l;

        static {
            kge.a(-135304258);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 1788467643) {
                super.a((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ void lambda$_z0sTAzy6QfsQF28n08WqoSLCr0(e eVar, Runnable runnable) {
            eVar.b(runnable);
        }

        public static /* synthetic */ void lambda$wVNgitQJPY3D0k0DooBS4VVaeu4(e eVar, Choreographer choreographer) {
            eVar.a(choreographer);
        }

        public static /* synthetic */ long a(e eVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("efcdc041", new Object[]{eVar, new Long(j)})).longValue();
            }
            eVar.k = j;
            return j;
        }

        public static /* synthetic */ Handler a(e eVar, Handler handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("112fec5f", new Object[]{eVar, handler});
            }
            eVar.j = handler;
            return handler;
        }

        public static /* synthetic */ LinkedBlockingQueue a(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LinkedBlockingQueue) ipChange.ipc$dispatch("8ed874e3", new Object[]{eVar}) : eVar.f;
        }

        public static /* synthetic */ Handler b(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("5e8ecc2e", new Object[]{eVar}) : eVar.g;
        }

        public static /* synthetic */ Choreographer c(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Choreographer) ipChange.ipc$dispatch("241544cd", new Object[]{eVar}) : eVar.h;
        }

        public static /* synthetic */ List d(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("af513aed", new Object[]{eVar}) : eVar.e;
        }

        public static /* synthetic */ AtomicBoolean e(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("f0a9dddb", new Object[]{eVar}) : eVar.d;
        }

        public static /* synthetic */ long f(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1357f490", new Object[]{eVar})).longValue() : eVar.k;
        }

        public static /* synthetic */ Handler g(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("902da0c9", new Object[]{eVar}) : eVar.j;
        }

        public static /* synthetic */ AtomicBoolean h(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("6165f8de", new Object[]{eVar}) : eVar.l;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(context);
            qgv.this = r1;
            this.d = new AtomicBoolean();
            this.e = new CopyOnWriteArrayList();
            this.f = new LinkedBlockingQueue<>();
            this.k = 0L;
            this.l = new AtomicBoolean();
        }

        @Override // tb.qgv.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.g = new Handler(Looper.getMainLooper());
            l.a(new kav() { // from class: tb.-$$Lambda$qgv$e$wVNgitQJPY3D0k0DooBS4VVaeu4
                @Override // tb.kav
                public final void accept(Object obj) {
                    qgv.e.lambda$wVNgitQJPY3D0k0DooBS4VVaeu4(qgv.e.this, (Choreographer) obj);
                }
            });
        }

        public /* synthetic */ void a(Choreographer choreographer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45920e18", new Object[]{this, choreographer});
            } else {
                this.h = choreographer;
            }
        }

        @Override // tb.qgv.a
        public void a(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
                return;
            }
            super.a(message);
            int i = message.what;
            if (i == 1) {
                a((Runnable) message.obj, message.arg1);
            } else if (i == 2) {
                a((Runnable) message.obj);
            } else if (i != 3) {
            } else {
                b();
            }
        }

        private void a(final Runnable runnable, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e91bcdd", new Object[]{this, runnable, new Integer(i)});
            } else if (this.h == null) {
                com.taobao.adaemon.e.b("FrameRater_ScheduleFrame", "postCallback, mainChoreographer is null", new Object[0]);
                this.g.postDelayed(runnable, i);
            } else {
                int max = Math.max(0, i);
                this.e.add(runnable);
                com.taobao.adaemon.e.b("FrameRater_ScheduleFrame", "postCallback", "runnable", runnable, com.taobao.android.dinamicx_v4.animation.util.b.DELAY_MILLIS, Integer.valueOf(max), "runningCnt", Integer.valueOf(this.e.size()));
                if (this.i == null) {
                    this.i = c();
                }
                if (this.j == null) {
                    HandlerThread handlerThread = new HandlerThread("ADaemon-Frame_HT");
                    handlerThread.start();
                    this.j = new Handler(handlerThread.getLooper());
                }
                this.j.postDelayed(new Runnable() { // from class: tb.-$$Lambda$qgv$e$_z0sTAzy6QfsQF28n08WqoSLCr0
                    @Override // java.lang.Runnable
                    public final void run() {
                        qgv.e.lambda$_z0sTAzy6QfsQF28n08WqoSLCr0(qgv.e.this, runnable);
                    }
                }, max);
            }
        }

        public /* synthetic */ void b(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
                return;
            }
            try {
                if (ADaemon.traceEnabled) {
                    Trace.beginSection("ADaemon:frameQueue.add():" + runnable.hashCode());
                    Trace.endSection();
                }
                this.f.add(runnable);
                this.k = SystemClock.elapsedRealtime();
                if (!this.d.getAndSet(true)) {
                    this.h.postFrameCallback(this.i);
                }
                d();
            } catch (Throwable th) {
                com.taobao.adaemon.e.a("FrameRater_ScheduleFrame", "queueHandler run err", th, new Object[0]);
            }
        }

        private void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            } else if (!this.e.remove(runnable)) {
            } else {
                com.taobao.adaemon.e.b("FrameRater_ScheduleFrame", "removeCallback", "runnable", runnable);
                if (this.j != null) {
                    this.j.removeCallbacks(runnable);
                }
                this.f.remove(runnable);
                Handler handler = this.g;
                if (handler == null) {
                    return;
                }
                handler.removeCallbacks(runnable);
            }
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            com.taobao.adaemon.e.b("FrameRater_ScheduleFrame", "removeAllCallback", new Object[0]);
            if (this.j != null) {
                this.j.removeCallbacksAndMessages(null);
            }
            this.f.clear();
            Handler handler = this.g;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.e.clear();
        }

        private Choreographer.FrameCallback c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Choreographer.FrameCallback) ipChange.ipc$dispatch("c3c3158e", new Object[]{this}) : new Choreographer.FrameCallback() { // from class: tb.qgv.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a */
                public Runnable f32932a;

                {
                    e.this = this;
                }

                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                        return;
                    }
                    Runnable runnable = (Runnable) e.a(e.this).poll();
                    this.f32932a = runnable;
                    if (runnable == null) {
                        e.e(e.this).set(false);
                        com.taobao.adaemon.e.b("FrameRater_ScheduleFrame", "doFrame, cancel:", "runningCnt", Integer.valueOf(e.d(e.this).size()));
                        return;
                    }
                    if (ADaemon.traceEnabled) {
                        Trace.beginSection("ADaemon:mainHandler.post():" + this.f32932a.hashCode());
                    }
                    e.b(e.this).post(this.f32932a);
                    e.c(e.this).postFrameCallback(this);
                    e.d(e.this).remove(this.f32932a);
                    com.taobao.adaemon.e.b("FrameRater_ScheduleFrame", "doFrame, post:", "runnable", Integer.valueOf(this.f32932a.hashCode()), "runningCnt", Integer.valueOf(e.d(e.this).size()));
                    if (!ADaemon.traceEnabled) {
                        return;
                    }
                    Trace.endSection();
                }
            };
        }

        private void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else if ((Build.VERSION.SDK_INT >= 23 && this.j != null && !this.j.getLooper().getQueue().isIdle()) || this.l.getAndSet(true)) {
            } else {
                com.taobao.adaemon.c.f().schedule(new Runnable() { // from class: tb.qgv.e.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* renamed from: a */
                    public int f32933a;

                    {
                        e.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int size = e.d(e.this).size();
                        this.f32933a = size;
                        if (size > 0) {
                            if (SystemClock.elapsedRealtime() - e.f(e.this) > 30000) {
                                kat.a(k.MODULE_NAME, k.f8365a, "sch_frame_timeout", mto.a.GEO_NOT_SUPPORT);
                                com.taobao.adaemon.e.b("FrameRater_ScheduleFrame", "quitHandlerThread timeout", "postingCnt", Integer.valueOf(this.f32933a));
                                e.a(e.this, Long.MAX_VALUE);
                            }
                            com.taobao.adaemon.c.f().schedule(this, 10000L, TimeUnit.MILLISECONDS);
                            return;
                        }
                        com.taobao.adaemon.e.b("FrameRater_ScheduleFrame", "queueHandler.quit", new Object[0]);
                        if (e.g(e.this) != null) {
                            Looper looper = e.g(e.this).getLooper();
                            e.a(e.this, (Handler) null);
                            looper.quit();
                        }
                        e.h(e.this).set(false);
                    }
                }, 10000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public double c;
        public int d;
        public long e;
        public long f;
        public int g;
        private Choreographer i;
        private Field j;
        private Field k;
        private final AtomicInteger l;
        private final AtomicBoolean m;
        private final AtomicBoolean n;
        private final AtomicBoolean o;
        private Choreographer.FrameCallback p;
        private Choreographer.FrameCallback q;
        private boolean r;
        private long s;
        private final AtomicBoolean t;
        private ConcurrentHashMap<Integer, Set<String>> u;

        static {
            kge.a(1744390570);
        }

        private String b(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("da9643a6", new Object[]{this, new Integer(i)}) : i != 1 ? i != 2 ? i != 3 ? i != 4 ? "REASON_OTHERS" : "REASON_ND_PIC" : "REASON_TAOLIVE_PLAYER" : "REASON_TAOLIVE" : "REASON_LIFECYCLE";
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == 1788467643) {
                super.a((Message) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* renamed from: lambda$F9Nm1oxWdWBI-Bn7OFDBKCH2Jrc */
        public static /* synthetic */ void m2485lambda$F9Nm1oxWdWBIBn7OFDBKCH2Jrc(d dVar, Choreographer choreographer) {
            dVar.a(choreographer);
        }

        /* renamed from: lambda$qxlO3nz6J61NlUxzR-mLEyj2HKw */
        public static /* synthetic */ void m2486lambda$qxlO3nz6J61NlUxzRmLEyj2HKw(d dVar) {
            dVar.d();
        }

        public static /* synthetic */ AtomicBoolean a(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("a0e22c38", new Object[]{dVar}) : dVar.m;
        }

        public static /* synthetic */ boolean a(d dVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("efbfe4e0", new Object[]{dVar, new Boolean(z)})).booleanValue();
            }
            dVar.r = z;
            return z;
        }

        public static /* synthetic */ AtomicBoolean b(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("c6763539", new Object[]{dVar}) : dVar.t;
        }

        public static /* synthetic */ void b(d dVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d151c2bb", new Object[]{dVar, new Boolean(z)});
            } else {
                dVar.b(z);
            }
        }

        public static /* synthetic */ Choreographer c(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Choreographer) ipChange.ipc$dispatch("f2c7c8c", new Object[]{dVar}) : dVar.i;
        }

        public static /* synthetic */ Field d(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Field) ipChange.ipc$dispatch("a23375b8", new Object[]{dVar}) : dVar.j;
        }

        public static /* synthetic */ boolean e(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b97c1600", new Object[]{dVar})).booleanValue() : dVar.b();
        }

        public static /* synthetic */ void f(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1357803d", new Object[]{dVar});
            } else {
                dVar.c();
            }
        }

        public static /* synthetic */ AtomicBoolean g(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("825a623e", new Object[]{dVar}) : dVar.o;
        }

        public static /* synthetic */ void h(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c70e54bf", new Object[]{dVar});
            } else {
                dVar.e();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(context);
            qgv.this = r1;
            this.l = new AtomicInteger();
            this.m = new AtomicBoolean();
            this.n = new AtomicBoolean();
            this.o = new AtomicBoolean();
            this.t = new AtomicBoolean();
            this.u = new ConcurrentHashMap<>();
        }

        public /* synthetic */ void a(Choreographer choreographer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45920e18", new Object[]{this, choreographer});
            } else {
                this.i = choreographer;
            }
        }

        @Override // tb.qgv.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            l.a(new kav() { // from class: tb.-$$Lambda$qgv$d$F9Nm1oxWdWBI-Bn7OFDBKCH2Jrc
                @Override // tb.kav
                public final void accept(Object obj) {
                    qgv.d.m2485lambda$F9Nm1oxWdWBIBn7OFDBKCH2Jrc(qgv.d.this, (Choreographer) obj);
                }
            });
            if (Build.VERSION.SDK_INT >= 28) {
                try {
                    this.k = StaticHook.c(Choreographer.class, "mFPSDivisor");
                    this.k.setAccessible(true);
                    this.r = true;
                } catch (Throwable th) {
                    com.taobao.adaemon.e.a("FrameRater_LockFrame", "init mFPSDivisor err", th, new Object[0]);
                }
            }
            try {
                this.j = StaticHook.c(Choreographer.class, "mLastFrameTimeNanos");
                this.j.setAccessible(true);
            } catch (Throwable th2) {
                com.taobao.adaemon.e.a("FrameRater_LockFrame", "init mLastFrameTimeNanos err", th2, new Object[0]);
            }
        }

        @Override // tb.qgv.a
        public void a(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
                return;
            }
            super.a(message);
            switch (message.what) {
                case 4:
                    this.l.incrementAndGet();
                    e();
                    return;
                case 5:
                    this.l.decrementAndGet();
                    d(message.arg1);
                    return;
                case 6:
                    a(message.arg1);
                    return;
                case 7:
                    b(message.arg1, message.arg2);
                    return;
                case 8:
                    a(message.arg1, message.arg2);
                    return;
                default:
                    return;
            }
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.l.get() > 0;
        }

        private void e() {
            if (this.i == null) {
                com.taobao.adaemon.e.b("FrameRater_LockFrame", "lock, illegalArg", new Object[0]);
            } else if (!b()) {
            } else {
                com.taobao.adaemon.e.b("FrameRater_LockFrame", "lock success", AbsPicGalleryVideoPlayer.PlayStatus.PLAY_STATUS_PAUSING, Boolean.valueOf(this.t.get()), "usingFPSDivisor", Boolean.valueOf(this.r));
                if (this.r) {
                    try {
                        if (this.t.get()) {
                            return;
                        }
                        this.k.set(this.i, 2);
                        com.taobao.adaemon.e.b("FrameRater_LockFrame", "lock fps divisor succ", new Object[0]);
                        b(false);
                    } catch (Throwable th) {
                        com.taobao.adaemon.e.a("FrameRater_LockFrame", "lock fps divisor err", th, new Object[0]);
                    }
                } else if (this.j == null) {
                } else {
                    if (this.p == null) {
                        this.p = new Choreographer.FrameCallback() { // from class: tb.qgv.d.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;
                            public long b;

                            {
                                d.this = this;
                            }

                            @Override // android.view.Choreographer.FrameCallback
                            public void doFrame(long j) {
                                if (this.b == j) {
                                    return;
                                }
                                this.b = j;
                                if (!d.a(d.this).get() && !d.b(d.this).get()) {
                                    try {
                                        d.d(d.this).set(d.c(d.this), Long.valueOf(System.nanoTime() + 20000000));
                                    } catch (Throwable th2) {
                                        com.taobao.adaemon.e.a("FrameRater_LockFrame", "lock err", th2, new Object[0]);
                                    }
                                }
                                if (!d.e(d.this) || d.b(d.this).get()) {
                                    return;
                                }
                                d.c(d.this).postFrameCallback(this);
                            }
                        };
                    }
                    this.i.postFrameCallback(this.p);
                }
            }
        }

        private void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (!b()) {
                com.taobao.adaemon.e.b("FrameRater_LockFrame", "interrupt, not locking", new Object[0]);
            } else if (this.o.get()) {
                com.taobao.adaemon.e.b("FrameRater_LockFrame", "interrupt, detecting", new Object[0]);
            } else {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long min = Math.min(3000L, i);
                long j = elapsedRealtime + min;
                if (j < this.s) {
                    return;
                }
                if (min == 3000 && !TimeMeter.a("FrameRater_LockFrame", 300L)) {
                    com.taobao.adaemon.e.b("FrameRater_LockFrame", "interrupt, freq", new Object[0]);
                    return;
                }
                this.s = j;
                com.taobao.adaemon.e.b("FrameRater_LockFrame", "interrupt success", com.taobao.android.dinamicx_v4.animation.util.b.DURATION_MILLIS, Integer.valueOf(i));
                this.m.set(true);
                c();
                com.taobao.adaemon.c.f().schedule(new Runnable() { // from class: tb.-$$Lambda$qgv$d$qxlO3nz6J61NlUxzR-mLEyj2HKw
                    @Override // java.lang.Runnable
                    public final void run() {
                        qgv.d.m2486lambda$qxlO3nz6J61NlUxzRmLEyj2HKw(qgv.d.this);
                    }
                }, min + 50, TimeUnit.MILLISECONDS);
            }
        }

        public /* synthetic */ void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else if (SystemClock.elapsedRealtime() <= this.s) {
            } else {
                com.taobao.adaemon.e.b("FrameRater_LockFrame", "interrupt finish", new Object[0]);
                this.m.set(false);
                if (!this.r) {
                    return;
                }
                e();
            }
        }

        private void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (!b()) {
            } else {
                c(i);
                String b = b(i2);
                Set<String> set = this.u.get(Integer.valueOf(i));
                if (set != null && !set.isEmpty()) {
                    set.remove(b);
                    if (!set.isEmpty()) {
                        com.taobao.adaemon.e.b("FrameRater_LockFrame", "resume, but reasons not empty, pausing", new Object[0]);
                        this.t.set(true);
                        c();
                        return;
                    }
                }
                com.taobao.adaemon.e.b("FrameRater_LockFrame", "resume success", "reason", b, "hash", Integer.valueOf(i));
                this.t.set(false);
                e();
            }
        }

        private void c(int i) {
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            } else if (qgv.a(qgv.this).isEmpty() || !com.taobao.android.live.plugin.proxy.e.TAO_LIVE_VIDEO_ACTIVITY.equals(g.b().s())) {
            } else {
                Iterator it = qgv.a(qgv.this).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = 0;
                        break;
                    }
                    i2 = ((Integer) it.next()).intValue();
                    if (i2 == 3) {
                        break;
                    }
                }
                qgv.a(qgv.this).clear();
                if (i2 <= 0) {
                    return;
                }
                Set<String> set = this.u.get(Integer.valueOf(i));
                if (set == null) {
                    set = new HashSet<>();
                    this.u.put(Integer.valueOf(i), set);
                }
                set.add(b(i2));
            }
        }

        private void b(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (!b()) {
            } else {
                Set<String> set = this.u.get(Integer.valueOf(i));
                if (set == null) {
                    set = new HashSet<>();
                    this.u.put(Integer.valueOf(i), set);
                }
                String b = b(i2);
                set.add(b);
                com.taobao.adaemon.e.b("FrameRater_LockFrame", "pause success", "reason", b, "activityHash", Integer.valueOf(i));
                this.t.set(true);
                c();
            }
        }

        private void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
                return;
            }
            com.taobao.adaemon.e.b("FrameRater_LockFrame", "unlock success", "activityHash", Integer.valueOf(i));
            this.u.remove(Integer.valueOf(i));
            if (!b()) {
                this.t.set(false);
                c();
                return;
            }
            qgv.b(qgv.this).contains(Integer.valueOf(g.b().t()));
        }

        private void c() {
            if (this.r) {
                try {
                    this.k.set(this.i, 1);
                    com.taobao.adaemon.e.b("FrameRater_LockFrame", "unlockFPSDivisor succ", new Object[0]);
                } catch (Throwable th) {
                    com.taobao.adaemon.e.a("FrameRater_LockFrame", "unlockFPSDivisor err", th, new Object[0]);
                }
            }
        }

        private void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            } else if (!z && this.n.getAndSet(true)) {
            } else {
                int i = this.g + 1;
                this.g = i;
                if (i > 3) {
                    com.taobao.adaemon.e.b("FrameRater_LockFrame", "detectFps exceeded", new Object[0]);
                    return;
                }
                com.taobao.adaemon.e.b("FrameRater_LockFrame", "detectFps", "detectTimes", Integer.valueOf(this.g));
                this.o.set(true);
                this.c = mto.a.GEO_NOT_SUPPORT;
                this.d = 0;
                this.f = 0L;
                this.e = SystemClock.elapsedRealtime();
                if (this.q == null) {
                    this.q = new Choreographer.FrameCallback() { // from class: tb.qgv.d.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            d.this = this;
                        }

                        @Override // android.view.Choreographer.FrameCallback
                        public void doFrame(long j) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                            } else if (d.this.f == j) {
                            } else {
                                if (d.this.f > 0) {
                                    d.this.c += 1000000000 / (j - d.this.f);
                                    d.this.d++;
                                    if (SystemClock.elapsedRealtime() - d.this.e >= 1000) {
                                        double d = d.this.c / d.this.d;
                                        com.taobao.adaemon.e.b("FrameRater_LockFrame", "detectFps", "avgFps", Double.valueOf(d));
                                        if (d < 24.0d) {
                                            com.taobao.adaemon.e.b("FrameRater_LockFrame", "detectFps over, degrade", new Object[0]);
                                            d.f(d.this);
                                            d.a(d.this, false);
                                            d.g(d.this).set(false);
                                            d.h(d.this);
                                            return;
                                        } else if (d.this.g != 3) {
                                            d.b(d.this, true);
                                            return;
                                        } else {
                                            com.taobao.adaemon.e.b("FrameRater_LockFrame", "detectFps over, keep fps divisor", new Object[0]);
                                            d.g(d.this).set(false);
                                            return;
                                        }
                                    }
                                }
                                d dVar = d.this;
                                dVar.f = j;
                                d.c(dVar).postFrameCallback(this);
                            }
                        }
                    };
                }
                this.i.postFrameCallback(this.q);
            }
        }
    }
}
