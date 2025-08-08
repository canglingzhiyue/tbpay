package tb;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Debug;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import com.alipay.zoloz.hardware.camera.preview.utils.SPManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.application.common.IAppLaunchListener;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.impl.common.ProcessStart;
import com.taobao.monitor.impl.common.a;
import com.taobao.monitor.impl.common.d;
import com.taobao.monitor.impl.common.e;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.PageLeaveDispatcher;
import com.taobao.monitor.impl.trace.b;
import com.taobao.monitor.impl.trace.c;
import com.taobao.monitor.impl.trace.h;
import com.taobao.monitor.impl.trace.k;
import com.taobao.monitor.impl.trace.m;
import com.taobao.monitor.impl.trace.n;
import com.taobao.monitor.impl.trace.o;
import com.taobao.monitor.impl.trace.p;
import com.taobao.monitor.impl.trace.q;
import com.taobao.monitor.impl.trace.r;
import com.taobao.monitor.impl.util.f;
import com.taobao.monitor.impl.util.i;
import com.taobao.monitor.procedure.NotifyApm;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.p;
import com.taobao.monitor.procedure.s;
import com.taobao.orange.OConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class mpa extends mop implements ApplicationBackgroundChangedDispatcher.a, PageLeaveDispatcher.a, b.a, c.a, h.a, k, n.a, o.a, p.a, q.a, r.a, NotifyApm.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLD = "COLD";
    public static final String HOT = "HOT";
    public static final String RECOVERY_FROM_SAVED_INSTANCE = "recoveryFromSavedInstance";
    public static final String WARM = "WARM";

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f31181a = "COLD";
    public static boolean b = false;
    public static String c = "onlyPullProcess";
    private long A;
    private boolean B;
    private long[] C;
    private HashMap<String, Integer> D;
    private String E;
    private volatile boolean F;
    private boolean G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private int O;
    private mmz P;
    private mmz Q;
    private mmz R;
    private final List<String> S;
    private boolean T;
    private Map<String, Long> U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    public String d;
    public g e;
    public int f;
    public int g;
    public IAppLaunchListener h;
    private String i;
    private String j;
    private m k;
    private m l;
    private m m;
    private m n;
    private m o;
    private m p;
    private m q;
    private m r;
    private m s;
    private m t;
    private m u;
    private List<String> v;
    private List<String> w;
    private List<Integer> x;
    private final Map<String, Integer> y;
    private int z;

    public static /* synthetic */ Object ipc$super(mpa mpaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1474193572) {
            super.a(((Number) objArr[0]).longValue());
            return null;
        } else if (hashCode != 90991720) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a();
            return null;
        }
    }

    @Override // com.taobao.monitor.impl.trace.h.a
    public void blockFps(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e069e7c0", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.h.a
    public void scrollHitchRate(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93e51", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ boolean a(mpa mpaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8a5871e", new Object[]{mpaVar, new Boolean(z)})).booleanValue();
        }
        mpaVar.G = z;
        return z;
    }

    public static /* synthetic */ boolean b(mpa mpaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a8350bd", new Object[]{mpaVar, new Boolean(z)})).booleanValue();
        }
        mpaVar.X = z;
        return z;
    }

    public static /* synthetic */ boolean c(mpa mpaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c611a5c", new Object[]{mpaVar, new Boolean(z)})).booleanValue();
        }
        mpaVar.V = z;
        return z;
    }

    public mpa(long j) {
        super(false);
        this.v = new ArrayList(4);
        this.w = new ArrayList(4);
        this.x = new ArrayList();
        this.y = new HashMap();
        this.z = 0;
        this.f = 0;
        this.g = 0;
        this.B = false;
        this.D = new HashMap<>();
        this.E = f31181a;
        this.F = false;
        this.h = com.taobao.application.common.impl.b.d().h();
        this.G = true;
        this.P = mmz.DEFAULT;
        this.Q = mmz.DEFAULT;
        this.R = mmz.DEFAULT;
        this.S = new ArrayList();
        this.T = true;
        this.U = new HashMap();
        this.V = true;
        this.W = true;
        this.X = true;
        this.Y = true;
        this.Z = false;
        a(j);
    }

    public mpa(String str, long j) {
        super(false);
        this.v = new ArrayList(4);
        this.w = new ArrayList(4);
        this.x = new ArrayList();
        this.y = new HashMap();
        this.z = 0;
        this.f = 0;
        this.g = 0;
        this.B = false;
        this.D = new HashMap<>();
        this.E = f31181a;
        this.F = false;
        this.h = com.taobao.application.common.impl.b.d().h();
        this.G = true;
        this.P = mmz.DEFAULT;
        this.Q = mmz.DEFAULT;
        this.R = mmz.DEFAULT;
        this.S = new ArrayList();
        this.T = true;
        this.U = new HashMap();
        this.V = true;
        this.W = true;
        this.X = true;
        this.Y = true;
        this.Z = false;
        f31181a = str;
        this.E = str;
        a(j);
    }

    @Override // tb.mop
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        super.a(j);
        this.C = mog.a();
        this.e = s.f18233a.d();
        if (!this.e.c()) {
            this.e = com.taobao.monitor.procedure.r.f18232a.a(i.a("/startup"), new p.a().b(false).a(true).d(d.G).c(true).a((g) null).a());
            this.e.b();
            ProcedureGlobal.PROCEDURE_MANAGER.a(this.e);
            SharedPreferences.Editor edit = e.a().b().getSharedPreferences("apm", 0).edit();
            edit.putString(mor.KEY_LAST_LAUNCH_SESSION, this.e.a());
            edit.apply();
        }
        this.e.a("procedureStartTime", j);
        this.k = a(a.WINDOW_EVENT_DISPATCHER);
        this.l = a(a.APPLICATION_LOW_MEMORY_DISPATCHER);
        this.m = a(a.PAGE_RENDER_DISPATCHER);
        this.n = a(a.ACTIVITY_FPS_DISPATCHER);
        this.o = a(a.APPLICATION_BACKGROUND_CHANGED_DISPATCHER);
        this.p = a(a.NETWORK_STAGE_DISPATCHER);
        this.q = a(a.IMAGE_STAGE_DISPATCHER);
        this.r = a(a.FRAGMENT_LIFECYCLE_FUNCTION_DISPATCHER);
        this.s = a(a.PAGE_RENDER_DISPATCHER);
        this.t = a(a.PAGE_LEAVE_DISPATCHER);
        this.u = a(a.LOOPER_HEAVY_MSG_DISPATCHER);
        this.l.a(this);
        this.n.a(this);
        this.k.a(this);
        this.m.a(this);
        this.o.a(this);
        this.p.a(this);
        this.q.a(this);
        this.r.a(this);
        this.s.a(this);
        this.t.a(this);
        this.u.a(this);
        if (d.L) {
            NotifyApm.a().a(1, this);
        }
        c();
        b = false;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.A = COLD.equals(f31181a) ? mnd.o : com.taobao.monitor.impl.util.h.a();
        this.e.a("errorCode", (Object) 1);
        this.e.a("launchType", f31181a);
        this.e.a("isFirstInstall", Boolean.valueOf(mnd.c));
        this.e.a("isFirstLaunch", Boolean.valueOf(mnd.e));
        this.e.a("installType", mnd.k);
        this.e.a("oppoCPUResource", mnd.q);
        this.e.a("leaveType", "other");
        this.e.a("lastProcessStartTime", Long.valueOf(mnd.p));
        this.e.a("systemInitDuration", Long.valueOf(mnd.o - mnd.m));
        this.e.a("timestampInterval", Long.valueOf(System.currentTimeMillis() - SystemClock.uptimeMillis()));
        this.e.a(OConstant.DIMEN_PROCESS_START_TIME, mnd.m);
        this.e.a("appLauncherStartTime", mnd.n);
        this.e.a("launchStartTime", mnd.o);
        f.b(this.e, "lastAppVersion", mnd.f);
        f.b(this.e, com.etao.feimagesearch.p.KEY_DEVICE_TYPE, mnd.a());
        if (l.d(e.a().b())) {
            this.e.a("foldStatus", Integer.valueOf(l.q(e.a().b())));
        }
        if (COLD.equals(f31181a) || WARM.equals(f31181a)) {
            this.e.a("channelExistWhenLaunch", Boolean.valueOf(com.taobao.monitor.impl.util.g.b()));
        }
        if (WARM.equals(f31181a)) {
            this.e.a("warnType", c);
        }
        if (!COLD.equals(f31181a)) {
            return;
        }
        this.P = mmz.a("apm_startup_root", com.taobao.monitor.impl.util.h.b(mnd.m));
    }

    @Override // com.taobao.monitor.impl.trace.b.a
    public void a(Activity activity, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf57d99", new Object[]{this, activity, map, new Long(j)});
            return;
        }
        String b2 = com.taobao.monitor.impl.util.d.b(activity);
        this.i = com.taobao.monitor.impl.util.d.a((Object) activity);
        String a2 = mqe.a(map.get("schemaUrl"), "");
        String a3 = mqe.a(map.get("groupRelatedId"), "");
        if (!this.B) {
            boolean equals = Boolean.TRUE.equals(map.get(RECOVERY_FROM_SAVED_INSTANCE));
            this.e.a("systemRecovery", Boolean.valueOf(equals));
            if (COLD.equals(f31181a) && equals) {
                this.d = this.i;
                this.j = a3;
                this.R = this.P.a("apm_startup_target_page");
                this.v.add(b2);
            }
            Object obj = map.get("outLink");
            if (obj != null) {
                this.e.a("outLink", obj);
            }
            Object obj2 = map.get("blackPage");
            if (obj2 != null) {
                this.e.a("blackPage", obj2);
            }
            if (!StringUtils.isEmpty(a2)) {
                this.e.a("schemaUrl", a2);
            }
            this.e.a("firstPageName", b2);
            this.e.a("firstPageCreateTime", j);
            this.P.b("apm_system_startup", com.taobao.monitor.impl.util.h.b(mnd.m)).a(com.taobao.monitor.impl.util.h.b(j));
            this.Q = this.P.a("apm_startup_intermediate_page");
            this.E = f31181a;
            f31181a = HOT;
            this.B = true;
        }
        if (this.v.size() < 10) {
            if (StringUtils.isEmpty(this.d)) {
                this.v.add(b2);
            }
            if (!StringUtils.isEmpty(a2)) {
                this.w.add(a2);
            }
        }
        if (!d.I && StringUtils.isEmpty(this.d) && !mpe.c(this.i) && (mpe.a() || mpe.e(this.i))) {
            this.d = this.i;
            this.j = a3;
            this.R = this.P.b("apm_startup_target_page", com.taobao.monitor.impl.util.h.b(j));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("timestamp", Long.valueOf(j));
        hashMap.put("pageName", b2);
        this.e.a("onActivityCreated", (Map<String, Object>) hashMap);
    }

    @Override // com.taobao.monitor.impl.trace.b.a
    public void a(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabb084a", new Object[]{this, activity, new Long(j)});
            return;
        }
        if (HOT.equals(f31181a)) {
            if (d.I) {
                this.i = com.taobao.monitor.impl.util.d.a((Object) activity);
            }
            if (!this.B) {
                this.B = true;
                if (!d.I) {
                    this.i = com.taobao.monitor.impl.util.d.a((Object) activity);
                    this.d = this.i;
                }
                if (activity.getIntent() != null && !StringUtils.isEmpty(activity.getIntent().getDataString())) {
                    this.e.a("schemaUrl", activity.getIntent().getDataString());
                }
                this.e.a("firstPageName", com.taobao.monitor.impl.util.d.a((Object) activity));
                this.e.a("firstPageCreateTime", j);
            }
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("timestamp", Long.valueOf(j));
        hashMap.put("pageName", com.taobao.monitor.impl.util.d.b(activity));
        this.e.a("onActivityStarted", (Map<String, Object>) hashMap);
        mpi.c("LauncherProcessor", "launchType", this.E);
    }

    @Override // com.taobao.monitor.impl.trace.b.a
    public void b(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb8c0fa9", new Object[]{this, activity, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("timestamp", Long.valueOf(j));
        hashMap.put("pageName", com.taobao.monitor.impl.util.d.b(activity));
        this.e.a("onActivityResumed", (Map<String, Object>) hashMap);
        if (d.I && StringUtils.isEmpty(this.d)) {
            String a2 = com.taobao.monitor.impl.util.d.a((Object) activity);
            if (!mpe.c(a2) && (mpe.a() || mpe.e(a2))) {
                this.d = a2;
            }
        }
        if (this.G && !StringUtils.isEmpty(moi.b().a())) {
            e.a().d().post(new Runnable() { // from class: tb.mpa.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    mpa.this.e.a("utSession", moi.b().a());
                    mpa.a(mpa.this, false);
                }
            });
        }
        if (!a(activity)) {
            return;
        }
        this.e.a("pageStructureTime", j);
    }

    @Override // com.taobao.monitor.impl.trace.b.a
    public void c(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5d1708", new Object[]{this, activity, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("timestamp", Long.valueOf(j));
        hashMap.put("pageName", com.taobao.monitor.impl.util.d.b(activity));
        this.e.a("onActivityPaused", (Map<String, Object>) hashMap);
    }

    @Override // com.taobao.monitor.impl.trace.b.a
    public void d(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2e1e67", new Object[]{this, activity, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("timestamp", Long.valueOf(j));
        hashMap.put("pageName", com.taobao.monitor.impl.util.d.b(activity));
        this.e.a("onActivityStopped", (Map<String, Object>) hashMap);
    }

    @Override // com.taobao.monitor.impl.trace.b.a
    public void e(Activity activity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dff25c6", new Object[]{this, activity, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("timestamp", Long.valueOf(j));
        hashMap.put("pageName", com.taobao.monitor.impl.util.d.b(activity));
        this.e.a("onActivityDestroyed", (Map<String, Object>) hashMap);
    }

    @Override // com.taobao.monitor.procedure.NotifyApm.a
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (!d.L) {
        } else {
            Object obj = map.get("activity");
            final Activity activity = null;
            if (obj instanceof Activity) {
                activity = (Activity) obj;
            }
            e.a().d().post(new Runnable() { // from class: tb.mpa.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    Activity activity2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (StringUtils.isEmpty(mpa.this.d) || (activity2 = activity) == null || !com.taobao.monitor.impl.util.d.a((Object) activity2).equals(mpa.this.d)) {
                    } else {
                        mpa mpaVar = mpa.this;
                        mpaVar.d = null;
                        mpa.b(mpaVar, true);
                        mpa.this.e.a("errorCode", (Object) 1);
                        mpa.this.e.a("firstInteractiveTime", -1L);
                        mpa.this.e.a("firstInteractiveDuration", (Object) (-1));
                        mpa.this.e.a("appInitDuration", (Object) (-1));
                        mpa.this.e.a("renderStartTime", -1L);
                        mpa.this.e.a("onRenderPercent", (Object) (-1));
                        mpa.this.e.a("drawPercentTime", (Object) (-1));
                        mpa.this.e.a("displayDuration", (Object) (-1));
                        mpa.this.e.a("displayedTime", -1L);
                        mpa.this.e.a("firstScreenPaint", -1L);
                        mpa.c(mpa.this, false);
                        mpa.this.e.a("interactiveDuration", (Object) (-1));
                        mpa.this.e.a("launchDuration", (Object) (-1));
                        mpa.this.e.a("interactiveTime", -1L);
                    }
                }
            });
        }
    }

    @Override // com.taobao.monitor.impl.trace.PageLeaveDispatcher.a
    public void a(mou mouVar, int i, long j) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593ec9c6", new Object[]{this, mouVar, new Integer(i), new Long(j)});
            return;
        }
        if (mouVar != null && mouVar.w() && a(mouVar.m())) {
            this.e.a("leaveTime", j);
            if (i == -5) {
                this.e.a("leaveType", "jumpNextPage");
            } else if (i == -4) {
                this.e.a("leaveType", "back");
            }
            z = true;
        }
        if (i == -3) {
            this.e.a("leaveTime", j);
            this.e.a("leaveType", "F2B");
            z = true;
        }
        if (!z) {
            return;
        }
        b();
    }

    @Override // com.taobao.monitor.impl.trace.c.a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(com.taobao.monitor.impl.util.h.a()));
        this.e.a("onLowMemory", (Map<String, Object>) hashMap);
    }

    @Override // com.taobao.monitor.impl.trace.r.a
    public void a(Activity activity, int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb07419b", new Object[]{this, activity, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        } else if (!this.T || mpe.c(com.taobao.monitor.impl.util.d.a((Object) activity))) {
        } else {
            if (!d.I && StringUtils.isEmpty(this.d)) {
                this.d = com.taobao.monitor.impl.util.d.a((Object) activity);
                try {
                    if (!StringUtils.isEmpty(this.d) && this.U.containsKey(this.d)) {
                        long longValue = this.U.get(this.d).longValue();
                        this.e.a("appInitDuration", Long.valueOf(longValue - this.A));
                        this.e.a("renderStartTime", longValue);
                    }
                } catch (Exception unused) {
                }
            }
            if (!a(activity)) {
                return;
            }
            this.e.a("firstInteractiveTime", j);
            this.e.a("firstInteractiveDuration", Long.valueOf(j - this.A));
            this.T = false;
        }
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void d(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4da3a55c", new Object[]{this, mouVar, new Long(j)});
            return;
        }
        Activity m = mouVar.m();
        String k = mouVar.k();
        if (StringUtils.isEmpty(k) || m == null || this.U.containsKey(k)) {
            return;
        }
        this.U.put(mouVar.k(), Long.valueOf(j));
        if (!a(m)) {
            return;
        }
        this.e.a("appInitDuration", Long.valueOf(j - this.A));
        this.e.a("renderStartTime", j);
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void a(mou mouVar, float f, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593d6ca9", new Object[]{this, mouVar, new Float(f), new Long(j)});
            return;
        }
        Activity m = mouVar.m();
        if (m == null || !a(m)) {
            return;
        }
        this.e.a("onRenderPercent", Float.valueOf(f));
        this.e.a("drawPercentTime", Long.valueOf(j));
    }

    private int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.E.equals(COLD) ? 0 : 1;
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void e(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f816efb", new Object[]{this, mouVar, new Long(j)});
            return;
        }
        Activity m = mouVar.m();
        if (m == null || !this.V) {
            return;
        }
        if (!mpe.c(this.i) && StringUtils.isEmpty(this.d)) {
            this.d = this.i;
        }
        if (!a(m)) {
            return;
        }
        this.e.a("displayDuration", Long.valueOf(j - this.A));
        this.e.a("displayedTime", j);
        this.e.a("firstScreenPaint", j);
        this.h.a(d(), 1);
        this.V = false;
        f.a(this.e, "firstFrameTime", mouVar.u());
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void f(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("115f389a", new Object[]{this, mouVar, new Long(j)});
        } else if (mouVar.m() == null || !a(mouVar.m())) {
        } else {
            this.e.a("customFirstScreenPaint", j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void g(mou mouVar, long j) {
        Activity m;
        Map<String, String> runtimeStats;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33d0239", new Object[]{this, mouVar, new Long(j)});
        } else if (!this.W || (m = mouVar.m()) == null || !a(m)) {
        } else {
            this.e.a("interactiveDuration", Long.valueOf(j - this.A));
            this.e.a("launchDuration", Long.valueOf(j - this.A));
            this.e.a("interactiveTime", j);
            long b2 = com.taobao.monitor.impl.util.h.b(j);
            this.P.a(b2);
            this.Q.a(this.R.a());
            this.R.a(b2);
            this.h.a(d(), 2);
            com.taobao.application.common.impl.d.a().b("launchInteractiveTime", j);
            e();
            this.W = false;
            if (mouVar.h() != null || d.K) {
                a(mouVar, 0);
                this.e.a("errorCode", (Object) 0);
            }
            if (Build.VERSION.SDK_INT < 23 || (runtimeStats = Debug.getRuntimeStats()) == null) {
                return;
            }
            this.e.b("blocking-gc-count", runtimeStats.get("art.gc.blocking-gc-count"));
            this.e.b("blocking-gc-time", runtimeStats.get("art.gc.blocking-gc-time"));
        }
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void a(mou mouVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80a44be", new Object[]{this, mouVar, new Integer(i)});
            return;
        }
        Activity m = mouVar.m();
        if (!this.X || m == null || !a(m)) {
            return;
        }
        this.e.a("errorCode", Integer.valueOf(i));
        this.X = false;
    }

    @Override // com.taobao.monitor.impl.trace.q.a
    public void h(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51acbd8", new Object[]{this, mouVar, new Long(j)});
        } else if (!this.Y) {
        } else {
            Activity m = mouVar.m();
            if (m != null && a(m)) {
                this.e.a("customDisplayedTime", j);
            }
            this.Y = false;
        }
    }

    @Override // tb.mop
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.Z) {
        } else {
            this.Z = true;
            e();
            if (this.G) {
                this.e.a("utSession", moi.b().a());
            }
            if (!StringUtils.isEmpty(this.d)) {
                this.e.a("currentPageName", this.d.substring(this.d.lastIndexOf(".") + 1));
                this.e.a("fullPageName", this.d);
                try {
                    if (!StringUtils.isEmpty(this.d) && this.U.containsKey(this.d)) {
                        long longValue = this.U.get(this.d).longValue();
                        this.e.a("appInitDuration", Long.valueOf(longValue - this.A));
                        this.e.a("renderStartTime", longValue);
                    }
                } catch (Exception unused) {
                }
                if (COLD.equals(this.E)) {
                    f.b(this.e, "currentPageGroupId", this.j);
                }
            }
            this.U.clear();
            this.e.a("processStartType", Integer.valueOf(ProcessStart.a()));
            this.e.a("linkPageName", this.v.toString());
            this.e.a("linkPageUrl", this.w.toString());
            this.v.clear();
            this.w.clear();
            com.taobao.application.common.d a2 = com.taobao.application.common.c.a();
            this.e.a("deviceLevel", Integer.valueOf(a2.a("deviceLevel", -1)));
            this.e.a("runtimeLevel", Integer.valueOf(aks.a().g().d));
            this.e.a("cpuUsageOfDevcie", Float.valueOf(aks.a().e().d));
            this.e.a("memoryRuntimeLevel", Integer.valueOf(aks.a().f().k));
            this.e.a("hasSplash", Boolean.valueOf(mnd.d));
            this.e.a("saveMode", Boolean.valueOf(a2.a("saveMode", false)));
            this.e.b(SPManager.FPS_KEY, this.x.toString());
            this.e.b("jankCount", Integer.valueOf(this.z));
            this.e.b("movieJankCount", Integer.valueOf(this.f));
            this.e.b("movieBigJankCount", Integer.valueOf(this.g));
            this.e.b("image", Integer.valueOf(this.H));
            this.e.b("imageOnRequest", Integer.valueOf(this.H));
            this.e.b("imageSuccessCount", Integer.valueOf(this.I));
            this.e.b("imageFailedCount", Integer.valueOf(this.J));
            this.e.b("imageCanceledCount", Integer.valueOf(this.K));
            this.e.b("network", Integer.valueOf(this.L));
            this.e.b("networkOnRequest", Integer.valueOf(this.L));
            this.e.b("networkSuccessCount", Integer.valueOf(this.M));
            this.e.b("networkFailedCount", Integer.valueOf(this.N));
            this.e.b("networkCanceledCount", Integer.valueOf(this.O));
            this.e.b("mainThreadBlock", (Object) this.y);
            long[] a3 = mog.a();
            this.e.b("totalRx", Long.valueOf(a3[0] - this.C[0]));
            this.e.b("totalTx", Long.valueOf(a3[1] - this.C[1]));
            this.e.a("procedureEndTime", com.taobao.monitor.impl.util.h.a());
            mnd.d = false;
            this.o.b(this);
            this.l.b(this);
            this.n.b(this);
            this.k.b(this);
            this.m.b(this);
            this.q.b(this);
            this.p.b(this);
            this.r.b(this);
            this.s.b(this);
            this.t.b(this);
            this.u.b(this);
            if (d.L) {
                NotifyApm.a().b(1, this);
            }
            this.e.d();
            super.a();
        }
    }

    public boolean a(Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68a25be", new Object[]{this, activity})).booleanValue() : com.taobao.monitor.impl.util.d.a((Object) activity).equals(this.d);
    }

    @Override // com.taobao.monitor.impl.trace.h.a
    public void frameDataPerSecond(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d825ceeb", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
        } else if (this.x.size() >= 200) {
        } else {
            this.x.add(Integer.valueOf(i));
            this.z += i2;
            this.f += i3;
            this.g += i4;
        }
    }

    @Override // com.taobao.monitor.impl.trace.o.a
    public void a(Looper looper, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44ec33c7", new Object[]{this, looper, str});
        } else if (looper != Looper.getMainLooper() || this.y.size() >= 100 || !this.W) {
        } else {
            Integer num = this.y.get(str);
            Map<String, Integer> map = this.y;
            if (num != null) {
                i = Integer.valueOf(num.intValue() + 1).intValue();
            }
            map.put(str, Integer.valueOf(i));
        }
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.a
    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
        } else if (i != 1) {
        } else {
            HashMap hashMap = new HashMap(1);
            hashMap.put("timestamp", Long.valueOf(j));
            this.e.a("foreground2Background", (Map<String, Object>) hashMap);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.F) {
        } else {
            this.h.a(!this.E.equals(COLD), 4);
            this.F = true;
        }
    }

    @Override // com.taobao.monitor.impl.trace.r.a
    public void a(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c497142", new Object[]{this, activity, keyEvent, new Long(j)});
            return;
        }
        int action = keyEvent.getAction();
        int keyCode = keyEvent.getKeyCode();
        if (action != 0) {
            return;
        }
        if (keyCode != 4 && keyCode != 3) {
            return;
        }
        if (!d.I && StringUtils.isEmpty(this.d)) {
            this.d = com.taobao.monitor.impl.util.d.a((Object) activity);
            if (activity != null) {
                try {
                    if (this.U.containsKey(com.taobao.monitor.impl.util.d.a((Object) activity))) {
                        long longValue = this.U.get(activity.getClass().getName()).longValue();
                        this.e.a("appInitDuration", Long.valueOf(longValue - this.A));
                        this.e.a("renderStartTime", longValue);
                    }
                } catch (Exception unused) {
                }
            }
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("timestamp", Long.valueOf(j));
        hashMap.put("key", Integer.valueOf(keyEvent.getKeyCode()));
        this.e.a("keyEvent", (Map<String, Object>) hashMap);
    }

    @Override // com.taobao.monitor.impl.trace.n.a
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.H++;
        } else if (i == 1) {
            this.I++;
        } else if (i == 2) {
            this.J++;
        } else if (i != 3) {
        } else {
            this.K++;
        }
    }

    @Override // com.taobao.monitor.impl.trace.p.a
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.L++;
        } else if (i == 1) {
            this.M++;
        } else if (i == 2) {
            this.N++;
        } else if (i != 3) {
        } else {
            this.O++;
        }
    }

    @Override // com.taobao.monitor.impl.trace.k
    public void a(Activity activity, Fragment fragment, String str, long j) {
        int valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3ca102", new Object[]{this, activity, fragment, str, new Long(j)});
        } else if (fragment == null || activity == null || !StringUtils.equals(activity.getClass().getName(), this.i)) {
        } else {
            String str2 = fragment.getClass().getSimpleName() + "_" + str;
            Integer num = this.D.get(str2);
            if (num == null) {
                valueOf = 0;
            } else {
                valueOf = Integer.valueOf(num.intValue() + 1);
            }
            this.D.put(str2, valueOf);
            this.e.a(str2 + valueOf, j);
        }
    }
}
