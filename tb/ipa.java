package tb;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.detail2.core.framework.j;
import com.taobao.android.home.component.utils.m;
import com.taobao.android.home.component.utils.n;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.Globals;

/* loaded from: classes5.dex */
public class ipa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static volatile boolean A = false;
    private static volatile long B = 0;
    private static volatile int D = 0;
    public static final String FIXED_SJS_FAST_SWITCH_LIST_VALUE = "f_async_nd|f_high_async_nd|f_async_parse|f_server_weex|f_close_img_load|f_idle_event|f_simple_video|f_delay_right_menu|f_base_opt|f_high_base_opt|f_second_holder|f_cloud_blur|f_home_skip_tran|f_wx_container_size|f_time_cre_sl_wx|f_skip_ab_check|f_time_pg_idle";
    private static int I;
    private static int K;
    private static int L;
    private static int M;
    private static int N;
    private static int O;
    private static int P;
    private static int Q;
    private static int X;
    private static int Z;

    /* renamed from: a  reason: collision with root package name */
    private static int f29198a;
    private static int ab;
    private static int ae;
    private static int af;
    private static int ah;
    private static int aj;
    private static int ak;
    private static int an;
    private static int ao;
    private static int ap;
    private static int aq;
    private static int as;
    private static int at;
    private static volatile String au;
    private static String av;
    private static volatile String aw;
    private static volatile Intent ax;
    private static int b;
    private static Handler h;
    private static volatile int i;
    private static int k;
    private static int l;
    private static volatile int m;
    private static String n;
    private static int o;
    private static int s;
    private static int u;
    private static int v;
    private static int y;
    private static Runnable z;

    /* loaded from: classes5.dex */
    public static abstract class b extends c implements xje {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-950736615);
            kge.a(1988482480);
        }

        public Intent d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("d02bf1c8", new Object[]{this});
            }
            return null;
        }
    }

    public static boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[0])).booleanValue();
        }
        return false;
    }

    private static int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c6cb129", new Object[]{str})).intValue();
        }
        return 0;
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{str})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[0]);
        } else {
            H();
        }
    }

    public static /* synthetic */ Handler a(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("89f9002e", new Object[]{handler});
        }
        h = handler;
        return handler;
    }

    public static /* synthetic */ Handler d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a41b85fb", new Object[0]) : h;
    }

    static {
        kge.a(1450234542);
        A = false;
        ax = null;
        k = 0;
        l = 0;
        n = null;
        B = 0L;
        i = -1;
        m = -1;
        D = -1;
        av = null;
        f29198a = -1;
        b = -1;
        o = -1;
        s = -1;
        u = -1;
        v = -1;
        y = -1;
        X = -1;
        I = -1;
        K = -1;
        Z = -1;
        ab = -1;
        ae = -1;
        af = -1;
        ah = -1;
        aj = -1;
        ak = -1;
        as = -1;
        at = -1;
        L = -1;
        M = -1;
        N = -1;
        O = -1;
        P = -1;
        Q = -1;
        an = -1;
        ao = -1;
        ap = -1;
        aq = -1;
    }

    public static long D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d3c2bf", new Object[0])).longValue() : B;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : a("fast_true_new_monitor_utils");
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : aM();
    }

    public static boolean M() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4529658", new Object[0])).booleanValue() : ao();
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : a("fast_key_simplify_non_core_layout");
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        if (o()) {
            return a("fast_key_simplify_pull_base_layout");
        }
        return false;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue() : a("fast_key_cache_weex_url_version");
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : a("fast_key_pre_init_ui_info_task");
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : m == 1 || D == 1;
    }

    @Deprecated
    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : m == -1 && D == -1;
    }

    public static int a(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i2)})).intValue();
        }
        String str2 = n;
        if (str2 == null) {
            str2 = fkt.aM();
            n = str2;
        }
        if (str2 != null && !str2.isEmpty() && str2.contains(str)) {
            String[] split = str2.split(str);
            if (split.length >= 3) {
                return fjs.a(split[2].trim(), i2);
            }
        }
        return i2;
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[0]);
        } else {
            n = fkt.aM();
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : aR();
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
            return;
        }
        Runnable runnable2 = z;
        z = null;
        if (runnable2 != null) {
            runnable2.run();
        }
        z = runnable;
        if (!A) {
            return;
        }
        if (bf()) {
            a(ax, false);
        } else {
            E();
        }
    }

    public static void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[0]);
            return;
        }
        A = true;
        Runnable runnable = z;
        z = null;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    public static void a(Intent intent, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2864fb4f", new Object[]{intent, new Boolean(z2)});
            return;
        }
        A = true;
        Runnable runnable = z;
        z = null;
        if (runnable != null) {
            ax = null;
            xjh.a(runnable, intent);
            runnable.run();
        } else if (z2) {
            ax = intent;
        } else {
            ax = null;
        }
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[0]);
        } else if (j()) {
        } else {
            B++;
            A = false;
            n = fkt.aM();
        }
    }

    public static void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{runnable});
        } else if (!i()) {
        } else {
            if (runnable == z) {
                z = null;
            }
            k = 0;
            l = 0;
            G();
        }
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (!(context instanceof j)) {
            return false;
        }
        return ((j) context).c();
    }

    private static void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[0]);
        } else {
            Coordinator.execute(new c() { // from class: tb.ipa.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ipa.c
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "processLowPriorityTask";
                }

                @Override // tb.ipa.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    ipa.C();
                    ipa.n();
                    ipa.h("lowPriority");
                    ipa.i("lowPriority");
                    ipa.aJ();
                    xji.b();
                    xjg.a();
                }
            }, 50);
        }
    }

    private static void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[0]);
        } else {
            k();
        }
    }

    public static void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb46e1df", new Object[]{cVar});
        } else {
            b(cVar);
        }
    }

    public static Handler N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("fbf93ed1", new Object[0]);
        }
        Handler handler = h;
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }

    public static void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25224c20", new Object[]{cVar});
        } else if (cVar == null) {
        } else {
            Handler handler = h;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                h = handler;
            }
            if (k > 2000) {
                k = 2000;
            }
            int c2 = cVar.c();
            if (c2 == -1) {
                handler.postDelayed(cVar, k + 2000);
            } else if (c2 == 0) {
                handler.post(cVar);
            } else {
                handler.postDelayed(cVar, cVar.c());
            }
            k += 15;
        }
    }

    public static void c(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efdb661", new Object[]{cVar});
        } else {
            d(cVar);
        }
    }

    public static void d(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d920a2", new Object[]{cVar});
        } else if (cVar == null) {
        } else {
            Handler handler = h;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                h = handler;
            }
            if (l > 1000) {
                l = 1000;
            }
            int c2 = cVar.c();
            if (c2 == -1) {
                handler.postDelayed(cVar, l + 1000);
            } else if (c2 == 0) {
                handler.post(cVar);
            } else {
                handler.postDelayed(cVar, cVar.c());
            }
            l += 5;
        }
    }

    public static void e(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b48ae3", new Object[]{cVar});
        } else {
            d(cVar);
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1308280911);
            kge.a(-1390502639);
        }

        public abstract void a();

        public abstract String b();

        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
            }
            return -1;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                fjt.c("FastStartDelayTaskUtil", "FastDelayTask 开始执行: " + b() + " getCustomDelayTime:" + c());
                a();
                StringBuilder sb = new StringBuilder();
                sb.append("FastDelayTask 执行结束: ");
                sb.append(b());
                fjt.c("FastStartDelayTaskUtil", sb.toString());
            } catch (Throwable th) {
                nlb.a("run_task_with_error", b());
                fjt.b("FastStartDelayTaskUtil", "runTask with error. taskName: " + b(), th);
                if (jqm.a()) {
                    throw new RuntimeException(th);
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class a extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public volatile boolean b = false;

        static {
            kge.a(-424393176);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 1548812690) {
                super.run();
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // tb.ipa.c, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.b) {
                super.run();
            } else {
                this.b = true;
                Handler d = ipa.d();
                if (d == null) {
                    d = new Handler(Looper.getMainLooper());
                    ipa.a(d);
                }
                d.post(this);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class d extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final long f29199a = System.currentTimeMillis();

        static {
            kge.a(-1744160384);
        }

        public long d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.f29199a;
        }
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[0])).booleanValue();
        }
        if (o == -1) {
            o = e("fast_key_force_modify_weex");
        }
        return o == 1;
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[0])).booleanValue() : aF();
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[0])).booleanValue() : aU();
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6864280", new Object[0])).booleanValue();
        }
        if (s == -1) {
            s = e("fast_key_delay_monitor_utils");
        }
        return s == 1;
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[0])).booleanValue();
        }
        if (u == -1) {
            u = e("fast_key_force_remove_atmosphere");
        }
        return u == 1;
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[0])).booleanValue() : aQ();
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[0])).booleanValue();
        }
        if (v == -1) {
            v = e("fast_key_right_nav_bar_with_anim");
        }
        return v == 1;
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[0])).booleanValue() : I();
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[0])).booleanValue();
        }
        if (y == -1) {
            if (aV()) {
                y = 1;
            } else if (O()) {
                y = 1;
            } else {
                y = 0;
            }
        }
        return y == 1;
    }

    public static boolean ae() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab2adeaf", new Object[0])).booleanValue();
        }
        if (X == -1) {
            if (e("fast_key_nd_log_level_l2") == 1) {
                X = 1;
            } else if (O()) {
                X = 1;
            } else {
                X = 0;
            }
        }
        return X == 1;
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[0])).booleanValue();
        }
        if (L()) {
            return true;
        }
        nlb.a("weex_sync_delete_code", "hitIndependentFastKeyNdWeexAsync getFastSjsListStr:" + ba() + " getTppSwitchListStr:" + be());
        return false;
    }

    public static boolean aA() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a92f908b", new Object[0])).booleanValue() : aY();
    }

    public static boolean P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("47cdcdb", new Object[0])).booleanValue() : L();
    }

    public static boolean S() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a7235e", new Object[0])).booleanValue() : aQ();
    }

    public static boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b53adf", new Object[0])).booleanValue();
        }
        if (I == -1) {
            I = e("fast_key_frozen_ui");
        }
        return I == 1;
    }

    public static boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d169e1", new Object[0])).booleanValue();
        }
        if (K == -1) {
            K = e("nd_open_red_tip");
        }
        return K == 1;
    }

    public static boolean ah() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab552532", new Object[0])).booleanValue();
        }
        if (ab == -1) {
            ab = e("fast_key_batch_dispatch");
        }
        return ab == 1;
    }

    public static boolean aj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab715434", new Object[0])).booleanValue() : aK();
    }

    public static boolean ak() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab7f6bb5", new Object[0])).booleanValue() : aE();
    }

    public static boolean al() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8d8336", new Object[0])).booleanValue();
        }
        if (ae == -1) {
            ae = e("fast_key_async_ut");
        }
        return ae == 1;
    }

    public static boolean am() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab9b9ab7", new Object[0])).booleanValue();
        }
        if (af == -1) {
            af = e("fast_key_split_success");
        }
        return af == 1;
    }

    public static boolean an() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[0])).booleanValue() : aS();
    }

    public static boolean ao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abb7c9b9", new Object[0])).booleanValue();
        }
        if (ah == -1) {
            ah = e("fast_key_no_nd_anim_check");
        }
        return ah == 1;
    }

    public static boolean aq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abd3f8bb", new Object[0])).booleanValue();
        }
        if (aj == -1) {
            aj = e("fast_key_weex_no_cache");
        }
        return aj == 1;
    }

    public static boolean ar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abe2103c", new Object[0])).booleanValue();
        }
        if (ak == -1) {
            ak = e("fast_key_skip_clone_intent");
        }
        return ak == 1;
    }

    public static boolean aB() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a93da80c", new Object[0])).booleanValue();
        }
        if (as == -1) {
            as = e("fast_key_slow_next_page");
        }
        return as == 1;
    }

    public static boolean aC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a94bbf8d", new Object[0])).booleanValue();
        }
        if (at == -1) {
            at = e("fast_key_slow2_next_page");
        }
        return at == 1;
    }

    public static String J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99f320ef", new Object[0]);
        }
        StringBuilder sb = new StringBuilder(fkt.aP());
        a(sb);
        String sb2 = sb.toString();
        if (!ae()) {
            fjt.c("FastStartDelayTaskUtil", "NdWeexSwitchListStr: " + sb2);
        }
        return sb2;
    }

    public static void a(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5279f0c3", new Object[]{sb});
            return;
        }
        if (aO()) {
            sb.append("|nd_close_video_auto_play");
        }
        if (aN()) {
            sb.append("|nd_close_image_auto_play");
        }
        if (V()) {
            sb.append("|nd_open_red_tip");
        }
        if (e("nd_close_video_ref") == 1) {
            sb.append("|nd_close_video_ref");
        }
        if (e("nd_no_data_fetch") == 1) {
            sb.append("|nd_no_data_fetch");
        }
        if (ae()) {
            sb.append("|nd_close_log");
        }
        if (aG()) {
            sb.append("|nd_close_image_auto_load");
        }
        if (aH()) {
            sb.append("|nd_degrade_image_blur");
        }
        if (!bh()) {
            return;
        }
        sb.append("|nd_black_bg_align");
    }

    public static int W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4df8151", new Object[0])).intValue();
        }
        int i2 = L;
        if (i2 != -1) {
            return i2;
        }
        int a2 = a("delay_nav_time", 300);
        L = a2;
        return a2;
    }

    public static int X() {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ed98d2", new Object[0])).intValue();
        }
        int i2 = M;
        if (i2 != -1) {
            return i2;
        }
        if (au()) {
            a2 = a("delay_fix_ui_h_time", 200);
        } else {
            a2 = a("delay_fix_ui_time", 350);
        }
        M = a2;
        return a2;
    }

    public static boolean au() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ac0c56bf", new Object[0])).booleanValue() : l();
    }

    public static int Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fbb053", new Object[0])).intValue();
        }
        int i2 = N;
        if (i2 != -1) {
            return i2;
        }
        int a2 = a(y() ? "right_anim_nav_time" : "right_nav_time", 850);
        N = a2;
        return a2;
    }

    public static int Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("509c7d4", new Object[0])).intValue();
        }
        int i2 = O;
        if (i2 != -1) {
            return i2;
        }
        int a2 = a("delay_start_wx_frozen", 100);
        O = a2;
        return a2;
    }

    public static int aa() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aaf2809a", new Object[0])).intValue();
        }
        int i2 = P;
        if (i2 != -1) {
            return i2;
        }
        int a2 = a("delay_end_wx_notify", 20);
        P = a2;
        return a2;
    }

    public static int ab() {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab00981b", new Object[0])).intValue();
        }
        if (k("f_time_cre_sl_wx")) {
            return 200;
        }
        int i2 = 50;
        if (k("f_time_cre_wx")) {
            return 50;
        }
        int i3 = Q;
        if (i3 != -1) {
            return i3;
        }
        if (aB()) {
            a2 = a("delay_create_wx_sl_time", 800);
        } else {
            if (aC()) {
                i2 = 260;
            }
            a2 = a("delay_create_wx_time", i2);
        }
        Q = a2;
        fjt.c("FastStartDelayTaskUtil", "DelayCreateWxTime: " + Q);
        return a2;
    }

    public static int av() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac1a6e2f", new Object[0])).intValue();
        }
        int i2 = an;
        if (i2 != -1) {
            return i2;
        }
        int a2 = a("scroll_idle_time", 1500);
        an = a2;
        return a2;
    }

    public static int aw() {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac2885b0", new Object[0])).intValue();
        }
        int i2 = ao;
        if (i2 != -1) {
            return i2;
        }
        if (k("f_time_pg_sl_idle")) {
            a2 = 800;
        } else {
            a2 = k("f_time_pg_idle") ? 350 : a("page_idle_time", 380);
        }
        ao = a2;
        return a2;
    }

    public static int ax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac369d31", new Object[0])).intValue();
        }
        int i2 = ap;
        if (i2 != -1) {
            return i2;
        }
        int a2 = a("batch_fire_time", 800);
        ap = a2;
        return a2;
    }

    public static int ay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac44b4b2", new Object[0])).intValue();
        }
        int i2 = aq;
        if (i2 != -1) {
            return i2;
        }
        int a2 = a("batch_dispatch_time", 100);
        aq = a2;
        return a2;
    }

    public static void ac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab0eafa9", new Object[0]);
            return;
        }
        fjt.c("FastStartDelayTaskUtil", "preInitSwitch-Start");
        J();
        W();
        X();
        Y();
        Z();
        aa();
        ab();
        av();
        aw();
        ax();
        ay();
        fkt.r();
        fkt.s();
        fkt.t();
        xji.b();
        xjg.a();
        xjf.b();
        fjt.c("FastStartDelayTaskUtil", "preInitSwitch-End .");
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[0])).booleanValue();
        }
        if (i == -1) {
            n();
        }
        return i == 1;
    }

    public static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[0]);
            return;
        }
        if (akt.b() <= fjs.a(fkt.aN(), 20)) {
            return;
        }
        i = 1;
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4366756", new Object[0])).booleanValue();
        }
        if (k("f_close_slow_bg") || g("fast_direct_close_slow_bg")) {
            return false;
        }
        return I();
    }

    public static boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[0])).booleanValue();
        }
        if (l()) {
            if (k("f_high_async_nd")) {
                return true;
            }
            nlb.a("weex_sync_delete_code", "High:directHitAsyncNdFeature:" + ba() + " getTppSwitchListStr:" + be());
            return false;
        } else if (k("f_async_nd")) {
            return true;
        } else {
            nlb.a("weex_sync_delete_code", "Low:directHitAsyncNdFeature:" + ba() + " getTppSwitchListStr:" + be());
            return false;
        }
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : k("f_sup_check_pull_base");
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : k("f_cb_wx_no_data");
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[0])).booleanValue() : k("f_degrade_apm_token");
    }

    public static boolean ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab1cc72e", new Object[0])).booleanValue() : k("f_degrade_ignore_native");
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[0])).booleanValue() : k("f_force_check_ad_task");
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[0])).booleanValue() : k("f_skip_e_url");
    }

    public static boolean a(boolean z2, boolean z3, String str) {
        StringBuilder sb;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("620c0cb6", new Object[]{new Boolean(z2), new Boolean(z3), str})).booleanValue();
        }
        if (z3) {
            str = "Battery_" + str;
        }
        if (z2) {
            str = "Anim_" + str;
        }
        if (Q()) {
            sb = new StringBuilder();
            str2 = "f_topSpeedPic_";
        } else {
            sb = new StringBuilder();
            str2 = "f_largeTopSpeedPic_";
        }
        sb.append(str2);
        sb.append(str);
        return k(sb.toString());
    }

    public static boolean bc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acc3884c", new Object[0])).booleanValue() : k("f_wx_container_size");
    }

    public static boolean bf() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acedcecf", new Object[0])).booleanValue() : k("f_check_render_v2");
    }

    public static boolean bg() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("acfbe650", new Object[0])).booleanValue() : k("f_wx_only_ctn_height");
    }

    public static boolean bh() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad09fdd1", new Object[0])).booleanValue() : k("f_black_bg_align");
    }

    public static boolean bi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad181552", new Object[0])).booleanValue() : k("f_pre_weex_skip");
    }

    public static boolean bj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad262cd3", new Object[0])).booleanValue() : k("f_out_weex_skip");
    }

    public static boolean bk() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad344454", new Object[0])).booleanValue() : k("f_anim_for_async");
    }

    public static boolean bp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad7ab9d9", new Object[0])).booleanValue() : k("f_anim_close_frozen");
    }

    public static boolean aE() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a967ee8f", new Object[0])).booleanValue() : k("f_async_parse");
    }

    public static boolean aF() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9760610", new Object[0])).booleanValue() : k("f_server_weex");
    }

    public static boolean aG() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9841d91", new Object[0])).booleanValue() : k("f_close_img_load");
    }

    public static boolean aH() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9923512", new Object[0])).booleanValue() : l() ? k("f_high_degrade_img_blur") : k("f_degrade_img_blur");
    }

    public static String aI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("303877f1", new Object[0]);
        }
        String str = av;
        if (str != null) {
            return str;
        }
        String aU = fkt.aU();
        av = aU;
        return aU;
    }

    public static void aJ() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ae6410", new Object[0]);
            return;
        }
        String aU = fkt.aU();
        if (TextUtils.isEmpty(aU)) {
            return;
        }
        av = aU;
    }

    public static boolean aK() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9bc7b95", new Object[0])).booleanValue() : k("f_idle_event");
    }

    public static boolean aL() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9ca9316", new Object[0])).booleanValue() : k("f_simple_video");
    }

    public static boolean aM() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d8aa97", new Object[0])).booleanValue() : k("f_no_rearrange");
    }

    public static boolean aN() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9e6c218", new Object[0])).booleanValue() : l() ? k("f_high_close_img_play") : k("f_close_img_play");
    }

    public static boolean aO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9f4d999", new Object[0])).booleanValue() : l() ? k("f_high_close_video_play") : k("f_close_video_play");
    }

    public static boolean aQ() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa11089b", new Object[0])).booleanValue() : l() ? k("f_high_delay_right_menu") : k("f_delay_right_menu");
    }

    public static boolean aR() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa1f201c", new Object[0])).booleanValue() : l() ? k("f_high_base_opt") : k("f_base_opt");
    }

    public static boolean aS() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa2d379d", new Object[0])).booleanValue() : l() ? k("f_high_sec_holder") : k("f_sec_holder");
    }

    public static boolean aT() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa3b4f1e", new Object[0])).booleanValue() : k("f_align_pref_home");
    }

    public static boolean aU() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa49669f", new Object[0])).booleanValue() : l() ? k("f_high_cloud_blur") : k("f_cloud_blur");
    }

    public static boolean aV() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa577e20", new Object[0])).booleanValue() : l() ? k("f_high_log_lite") : k("f_log_lite");
    }

    public static boolean aW() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa6595a1", new Object[0])).booleanValue() : k("f_client_pre_align");
    }

    public static boolean aX() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa73ad22", new Object[0])).booleanValue() : l() ? k("f_high_close_delay_prepare") : k("f_close_delay_prepare");
    }

    public static boolean aY() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa81c4a3", new Object[0])).booleanValue() : k("f_old_optimize_key");
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[0])).booleanValue();
        }
        int i2 = b;
        if (i2 == 0) {
            return false;
        }
        if (i2 == -1) {
            if (l.d(Globals.getApplication())) {
                b = 1;
            } else {
                b = 0;
            }
        }
        return b == 1;
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[0])).booleanValue();
        }
        int i2 = f29198a;
        if (i2 == 0) {
            return false;
        }
        if (i2 == -1) {
            if (l.b(Globals.getApplication())) {
                f29198a = 1;
            } else {
                f29198a = 0;
            }
        }
        return f29198a == 1;
    }

    public static boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[0])).booleanValue();
        }
        if (f29198a == 0 && b == 0) {
            return true;
        }
        return !A() && !F();
    }

    private static String bd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84bff7", new Object[0]);
        }
        String str = au;
        if (str == null) {
            try {
                str = (String) m.a().a("ndLowOptimizationThird", String.class);
            } catch (Throwable th) {
                fjt.b(fjt.TAG_TIP, "执行 HomeClientABTestTool getAbTestValue 异常了(temp)。", th);
                qxo.a("HomeClientABTestTool.getAbTestValue 调用异常。(temp)", th);
            }
            if (TextUtils.isEmpty(str)) {
                str = "f_async_nd|f_high_async_nd|f_async_parse|f_server_weex|f_close_img_load|f_idle_event|f_simple_video|f_delay_right_menu|f_base_opt|f_high_base_opt|f_second_holder|f_cloud_blur|f_home_skip_tran|f_wx_container_size|f_time_cre_sl_wx|f_skip_ab_check|f_time_pg_idle";
            }
            au = str;
            fjt.c(fjt.TAG_TIP, "tempUpdateFastSwitchListStr: " + str);
        }
        return str;
    }

    private static String be() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("310a7a96", new Object[0]);
        }
        String str = aw;
        if (str == null) {
            try {
                str = n.a();
            } catch (Throwable th) {
                fjt.b(fjt.TAG_TIP, "执行 TPPUtils getNdLowFeatureList 异常了。(temp)", th);
                qxo.a("TPPUtils.getNdLowFeatureList 调用异常。(temp)", th);
            }
            if (str == null) {
                str = "f_no_value";
            }
            aw = str;
            fjt.c(fjt.TAG_TIP, "tempUpdateTppSwitchListStr: " + str);
        }
        return str;
    }

    public static String ba() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16f3901a", new Object[0]);
        }
        String str = au;
        return str == null ? "" : str;
    }

    public static String bb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9d794ab9", new Object[0]);
        }
        String str = aw;
        return str == null ? "" : str;
    }

    public static String h(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bc4e8c7", new Object[]{str});
        }
        try {
            str2 = (String) m.a().a("ndLowOptimizationThird", String.class);
        } catch (Throwable th) {
            fjt.b(fjt.TAG_TIP, "执行 HomeClientABTestTool getAbTestValue 异常了。", th);
            qxo.a("HomeClientABTestTool.getAbTestValue 调用异常。", th);
            str2 = au;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "f_async_nd|f_high_async_nd|f_async_parse|f_server_weex|f_close_img_load|f_idle_event|f_simple_video|f_delay_right_menu|f_base_opt|f_high_base_opt|f_second_holder|f_cloud_blur|f_home_skip_tran|f_wx_container_size|f_time_cre_sl_wx|f_skip_ab_check|f_time_pg_idle";
        }
        fjt.c(fjt.TAG_TIP, str + ":forceUpdateFastSwitchListStr: " + str2);
        au = str2;
        return str2;
    }

    public static String i(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2e2d9a6", new Object[]{str});
        }
        try {
            str2 = n.a();
        } catch (Throwable th) {
            fjt.b(fjt.TAG_TIP, "执行 TPPUtils getNdLowFeatureList 异常了。", th);
            qxo.a("TPPUtils.getNdLowFeatureList 调用异常。", th);
            str2 = aw;
        }
        if (str2 == null) {
            str2 = "f_no_refresh_value";
        }
        fjt.c(fjt.TAG_TIP, str + ":forceUpdateTppSwitchListStr: " + str2);
        aw = str2;
        return str2;
    }

    private static boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d99648c0", new Object[]{str})).booleanValue();
        }
        String be = be();
        if (be.startsWith("f_ver")) {
            if (!be.contains(str + "_ev2")) {
                return false;
            }
            D = 1;
            return true;
        } else if (be.contains(str)) {
            D = 1;
            return true;
        } else {
            String bd = bd();
            if (bd.startsWith("f_ver")) {
                if (!bd.contains(str + "_ev2")) {
                    return false;
                }
                m = 1;
                return true;
            } else if (!bd.contains(str)) {
                return false;
            } else {
                m = 1;
                return true;
            }
        }
    }
}
