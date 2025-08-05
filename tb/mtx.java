package tb;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.base.c;
import com.taobao.mytaobao.basement.monitor.b;
import com.taobao.tao.log.TLog;
import com.taobao.utils.Global;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class mtx implements mtw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final mtw u;
    private static final ScheduledThreadPoolExecutor v;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f31256a;
    private volatile int b;
    private volatile long c;
    private volatile float d;
    private volatile long e;
    private volatile long f;
    private volatile long g;
    private volatile long h;
    private volatile long i;
    private volatile long j;
    private volatile long k;
    private volatile long l;
    private volatile long m;
    private volatile long n;
    private volatile long o;
    private volatile boolean p;
    private volatile boolean q;
    private volatile boolean r;
    private volatile boolean s;
    private volatile String t;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final mtx f31261a;

        static {
            kge.a(982892776);
            f31261a = new mtx();
        }

        public static /* synthetic */ mtx a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (mtx) ipChange.ipc$dispatch("f07f38d", new Object[0]) : f31261a;
        }
    }

    public static /* synthetic */ int a(mtx mtxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f52f5d7a", new Object[]{mtxVar})).intValue() : mtxVar.b;
    }

    public static /* synthetic */ int a(mtx mtxVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0bcc64f", new Object[]{mtxVar, new Integer(i)})).intValue();
        }
        mtxVar.b = i;
        return i;
    }

    public static /* synthetic */ long a(mtx mtxVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0bcca11", new Object[]{mtxVar, new Long(j)})).longValue();
        }
        mtxVar.e = j;
        return j;
    }

    public static /* synthetic */ void a(mtx mtxVar, int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8cb014", new Object[]{mtxVar, new Integer(i), jSONObject});
        } else {
            mtxVar.a(i, jSONObject);
        }
    }

    public static /* synthetic */ void a(mtx mtxVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8490d391", new Object[]{mtxVar, str});
        } else {
            mtxVar.c(str);
        }
    }

    public static /* synthetic */ void a(mtx mtxVar, String str, long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c75bfd", new Object[]{mtxVar, str, new Long(j), jSONObject});
        } else {
            mtxVar.a(str, j, jSONObject);
        }
    }

    public static /* synthetic */ boolean a(mtx mtxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0bd0631", new Object[]{mtxVar, new Boolean(z)})).booleanValue();
        }
        mtxVar.f31256a = z;
        return z;
    }

    public static /* synthetic */ long b(mtx mtxVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("929a93b0", new Object[]{mtxVar, new Long(j)})).longValue();
        }
        mtxVar.f = j;
        return j;
    }

    public static /* synthetic */ String b(mtx mtxVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4475370e", new Object[]{mtxVar, str});
        }
        mtxVar.t = str;
        return str;
    }

    public static /* synthetic */ boolean b(mtx mtxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e3b2640c", new Object[]{mtxVar})).booleanValue() : mtxVar.e();
    }

    public static /* synthetic */ boolean b(mtx mtxVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929acfd0", new Object[]{mtxVar, new Boolean(z)})).booleanValue();
        }
        mtxVar.q = z;
        return z;
    }

    public static /* synthetic */ long c(mtx mtxVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74785d4f", new Object[]{mtxVar, new Long(j)})).longValue();
        }
        mtxVar.g = j;
        return j;
    }

    public static /* synthetic */ void c(mtx mtxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2356a89", new Object[]{mtxVar});
        } else {
            mtxVar.f();
        }
    }

    public static /* synthetic */ long d(mtx mtxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c0b870fe", new Object[]{mtxVar})).longValue() : mtxVar.f;
    }

    public static /* synthetic */ long d(mtx mtxVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("565626ee", new Object[]{mtxVar, new Long(j)})).longValue();
        }
        mtxVar.h = j;
        return j;
    }

    public static /* synthetic */ long e(mtx mtxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("af3b777f", new Object[]{mtxVar})).longValue() : mtxVar.g;
    }

    public static /* synthetic */ long e(mtx mtxVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3833f08d", new Object[]{mtxVar, new Long(j)})).longValue();
        }
        mtxVar.i = j;
        return j;
    }

    public static /* synthetic */ long f(mtx mtxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9dbe7e00", new Object[]{mtxVar})).longValue() : mtxVar.h;
    }

    public static /* synthetic */ long f(mtx mtxVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a11ba2c", new Object[]{mtxVar, new Long(j)})).longValue();
        }
        mtxVar.j = j;
        return j;
    }

    public static /* synthetic */ long g(mtx mtxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8c418481", new Object[]{mtxVar})).longValue() : mtxVar.i;
    }

    public static /* synthetic */ long g(mtx mtxVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fbef83cb", new Object[]{mtxVar, new Long(j)})).longValue();
        }
        mtxVar.k = j;
        return j;
    }

    public static /* synthetic */ long h(mtx mtxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7ac48b02", new Object[]{mtxVar})).longValue() : mtxVar.j;
    }

    public static /* synthetic */ long h(mtx mtxVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddcd4d6a", new Object[]{mtxVar, new Long(j)})).longValue();
        }
        mtxVar.l = j;
        return j;
    }

    public static /* synthetic */ long i(mtx mtxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("69479183", new Object[]{mtxVar})).longValue() : mtxVar.k;
    }

    public static /* synthetic */ long i(mtx mtxVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfab1709", new Object[]{mtxVar, new Long(j)})).longValue();
        }
        mtxVar.m = j;
        return j;
    }

    public static /* synthetic */ long j(mtx mtxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57ca9804", new Object[]{mtxVar})).longValue() : mtxVar.l;
    }

    public static /* synthetic */ long j(mtx mtxVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a188e0a8", new Object[]{mtxVar, new Long(j)})).longValue();
        }
        mtxVar.n = j;
        return j;
    }

    public static /* synthetic */ long k(mtx mtxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("464d9e85", new Object[]{mtxVar})).longValue() : mtxVar.m;
    }

    public static /* synthetic */ long k(mtx mtxVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8366aa47", new Object[]{mtxVar, new Long(j)})).longValue();
        }
        mtxVar.o = j;
        return j;
    }

    public static /* synthetic */ long l(mtx mtxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("34d0a506", new Object[]{mtxVar})).longValue() : mtxVar.n;
    }

    public static /* synthetic */ long m(mtx mtxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2353ab87", new Object[]{mtxVar})).longValue() : mtxVar.o;
    }

    public static /* synthetic */ String n(mtx mtxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("28c32d0c", new Object[]{mtxVar}) : mtxVar.t;
    }

    static {
        kge.a(-1531151504);
        kge.a(-231469441);
        u = new mtv();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactory() { // from class: tb.mtx.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "mtbBasementMonitor");
            }
        });
        v = scheduledThreadPoolExecutor;
        scheduledThreadPoolExecutor.setKeepAliveTime(10000L, TimeUnit.MILLISECONDS);
        v.allowCoreThreadTimeOut(true);
    }

    public static JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("nodeLoadSuccess", (Object) "false");
        return jSONObject;
    }

    private mtx() {
        this.f31256a = true;
        this.d = -1.0f;
        this.b = 0;
        this.c = d();
    }

    public static mtw c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mtw) ipChange.ipc$dispatch("1e6b3e2c", new Object[0]) : d(false);
    }

    public static mtw d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mtw) ipChange.ipc$dispatch("eace736d", new Object[]{new Boolean(z)});
        }
        if (c.i()) {
            return u;
        }
        if (z) {
            return u;
        }
        return a.a();
    }

    @Override // tb.mtw
    public void a(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            v.execute(new Runnable() { // from class: tb.mtx.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    mtx.a(mtx.this, String.format("structProcessorWithType:%s isLoggedIn:%b", Integer.valueOf(i), Boolean.valueOf(Login.checkSessionValid())));
                    if (!Login.checkSessionValid()) {
                        return;
                    }
                    if (mtx.a(mtx.this) != 0) {
                        mtx mtxVar = mtx.this;
                        mtx.a(mtxVar, String.format("TaoLiveStartLinkMonitor exception oldType:%s newType:%s", Integer.valueOf(mtx.a(mtxVar)), Integer.valueOf(i)));
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("oldType", (Object) Integer.valueOf(mtx.a(mtx.this)));
                        jSONObject.put("newType", (Object) Integer.valueOf(i));
                        if (com.taobao.mytaobao.basement.a.b()) {
                            jSONObject.put("isWeex", (Object) true);
                        }
                        b.a().a("StructProcessorException", jSONObject, 1.0d, false);
                    }
                    mtx.a(mtx.this, i);
                    mtx mtxVar2 = mtx.this;
                    mtx.a(mtxVar2, mtx.b(mtxVar2));
                    mtx.c(mtx.this);
                    mtx.a(mtx.this, System.currentTimeMillis());
                    mtx.b(mtx.this, -1L);
                    mtx.c(mtx.this, -1L);
                    mtx.d(mtx.this, -1L);
                    mtx.e(mtx.this, -1L);
                    mtx.f(mtx.this, -1L);
                    mtx.g(mtx.this, -1L);
                    mtx.h(mtx.this, -1L);
                    mtx.i(mtx.this, -1L);
                    mtx.j(mtx.this, -1L);
                    mtx.k(mtx.this, -1L);
                    mtx.b(mtx.this, UUID.randomUUID().toString());
                }
            });
        }
    }

    @Override // tb.mtw
    public void b(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            v.execute(new Runnable() { // from class: tb.mtx.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        mtx.a(mtx.this, i, (JSONObject) null);
                    }
                }
            });
        }
    }

    @Override // tb.mtw
    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            v.execute(new Runnable() { // from class: tb.mtx.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (mtx.a(mtx.this) == 0) {
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (TextUtils.equals(str, "PageInit")) {
                            if (mtx.d(mtx.this) >= 0) {
                                return;
                            }
                            mtx.b(mtx.this, currentTimeMillis);
                        } else if (TextUtils.equals(str, "MainInterface")) {
                            if (mtx.e(mtx.this) >= 0) {
                                return;
                            }
                            mtx.c(mtx.this, currentTimeMillis);
                        } else if (TextUtils.equals(str, "NaitveRender")) {
                            if (mtx.f(mtx.this) >= 0) {
                                return;
                            }
                            mtx.d(mtx.this, currentTimeMillis);
                        } else if (TextUtils.equals(str, "PreloadInterface")) {
                            if (mtx.g(mtx.this) >= 0) {
                                return;
                            }
                            mtx.e(mtx.this, currentTimeMillis);
                        } else if (TextUtils.equals(str, "WebCreat")) {
                            if (mtx.h(mtx.this) >= 0) {
                                return;
                            }
                            mtx.f(mtx.this, currentTimeMillis);
                        } else if (TextUtils.equals(str, "WebLoad")) {
                            if (mtx.i(mtx.this) >= 0) {
                                return;
                            }
                            mtx.g(mtx.this, currentTimeMillis);
                        } else if (TextUtils.equals(str, "firstPreload")) {
                            mtx.h(mtx.this, currentTimeMillis);
                        } else if (TextUtils.equals(str, "secondPreload")) {
                            mtx.i(mtx.this, currentTimeMillis);
                        } else if (TextUtils.equals(str, "renderList")) {
                            mtx.j(mtx.this, currentTimeMillis);
                        } else if (TextUtils.equals(str, "renderFirstCard")) {
                            mtx.k(mtx.this, currentTimeMillis);
                        }
                        mtx.a(mtx.this, String.format("startPoint step:%s startTime:%s", str, String.valueOf(currentTimeMillis)));
                    }
                }
            });
        }
    }

    @Override // tb.mtw
    public void a(final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else {
            v.execute(new Runnable() { // from class: tb.mtx.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Removed duplicated region for block: B:100:0x024a  */
                /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:86:0x0216  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x0234 A[ADDED_TO_REGION] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 592
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: tb.mtx.AnonymousClass5.run():void");
                }
            });
        }
    }

    @Override // tb.mtw
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    @Override // tb.mtw
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b == 0;
    }

    @Override // tb.mtw
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        c("TaoLiveStartLinkMonitor setMytaobaoLocalDataValid:" + z);
        this.p = z;
    }

    private void a(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e86c6b5", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        c(String.format("destructProcessorWithType:%s isLoggedIn:%b startLinkType:%s", Integer.valueOf(i), Boolean.valueOf(Login.checkSessionValid()), Integer.valueOf(this.b)));
        if (this.b != 0) {
            b(i, jSONObject);
        } else if (i == 3 || i == 4) {
            c(String.format("TaoLiveStartLinkMonitor exception startLinkType:%s destructType:%s", Integer.valueOf(this.b), Integer.valueOf(i)));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("startLinkType", (Object) Integer.valueOf(this.b));
            jSONObject2.put("destructType", (Object) Integer.valueOf(i));
            if (com.taobao.mytaobao.basement.a.b()) {
                jSONObject2.put("isWeex", (Object) true);
            }
            jSONObject2.put("traceId", (Object) this.t);
            b.a().a("DestructProcessorException", jSONObject2, 1.0d, false);
        }
        this.b = 0;
        this.f = 0L;
        this.g = 0L;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = null;
    }

    private void a(String str, long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8cf6c5e", new Object[]{this, str, new Long(j), jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        if (!jSONObject2.containsKey("nodeLoadSuccess")) {
            jSONObject2.put("nodeLoadSuccess", (Object) "true");
        }
        jSONObject2.put("timeFromAppLaunch", (Object) Long.valueOf(this.c));
        jSONObject2.put("batteryState", (Object) Float.valueOf(this.d));
        jSONObject2.put("deviceLeavel", (Object) Integer.valueOf(c.a()));
        jSONObject2.put("startLinkType", (Object) Integer.valueOf(this.b));
        jSONObject2.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_nodeType, (Object) str);
        jSONObject2.put("bizType", (Object) c.m());
        jSONObject2.put("time", (Object) Long.valueOf(j));
        jSONObject2.put("hasNetwork", (Object) Integer.valueOf(this.f31256a ? 1 : 0));
        if (com.taobao.mytaobao.basement.a.b()) {
            jSONObject2.put("isWeex", (Object) true);
        }
        jSONObject2.put("traceId", (Object) this.t);
        String jSONString = jSONObject2.toJSONString();
        mua.a(b.MODULE_NAME, 19997, "TBLoadPerformance", null, null, jSONObject2);
        b.a().a("TBLoadPerformance", jSONObject2, 1.0d, false);
        c(String.format("TaoLiveStartLinkMonitor monitorFineNode:%s", jSONString));
    }

    private void b(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1787bdf6", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        jSONObject2.put("nodeLoadSuccess", (Object) (i == 4 ? "true" : "false"));
        jSONObject2.put("timeFromAppLaunch", (Object) Long.valueOf(this.c));
        jSONObject2.put("batteryState", (Object) Float.valueOf(this.d));
        jSONObject2.put("deviceLeavel", (Object) Integer.valueOf(c.a()));
        jSONObject2.put("startLinkType", (Object) Integer.valueOf(this.b));
        jSONObject2.put(com.taobao.android.weex_framework.util.a.ATOM_EXT_nodeType, (Object) "CompleteFlow");
        jSONObject2.put("bizType", (Object) c.m());
        jSONObject2.put("time", (Object) Long.valueOf(System.currentTimeMillis() - this.e));
        jSONObject2.put("hasNetwork", (Object) Integer.valueOf(this.f31256a ? 1 : 0));
        jSONObject2.put("destructType", (Object) Integer.valueOf(i));
        jSONObject2.put("mytaobaoLocalDataValid", (Object) Integer.valueOf(this.p ? 1 : 0));
        jSONObject2.put("taoLiveLocalDataValid", (Object) Integer.valueOf(this.q ? 1 : 0));
        jSONObject2.put("taoLiveVisibleWhenInit", (Object) Integer.valueOf(this.r ? 1 : 0));
        jSONObject2.put("isUCCoreInit", (Object) Integer.valueOf(this.s ? 1 : 0));
        if (com.taobao.mytaobao.basement.a.b()) {
            jSONObject2.put("isWeex", (Object) true);
        }
        jSONObject2.put("traceId", (Object) this.t);
        String jSONString = jSONObject2.toJSONString();
        mua.a(b.MODULE_NAME, 19997, "TBLoadPerformance", null, null, jSONObject2);
        b.a().a("TBLoadPerformance", jSONObject2, 1.0d, false);
        c(String.format("TaoLiveStartLinkMonitor monitorCompleteFlowNode:%s", jSONString));
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        TLog.loge("basementLaunch", "MyTaobao_TaoFriend", str + ",traceId=" + this.t);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            TLog.loge("basementLaunch", "basementLaunch", str);
        }
    }

    private long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue();
        }
        long a2 = com.taobao.application.common.c.a().a("startProcessSystemTime", 0L);
        if (a2 > 0) {
            return System.currentTimeMillis() - a2;
        }
        return 0L;
    }

    private NetworkInfo a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetworkInfo) ipChange.ipc$dispatch("101bd107", new Object[]{this, context});
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return (activeNetworkInfo != null || Build.VERSION.SDK_INT < 23) ? activeNetworkInfo : connectivityManager.getNetworkInfo(connectivityManager.getActiveNetwork());
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        NetworkInfo a2 = a(Global.getApplication());
        if (a2 != null) {
            return a2.isConnected();
        }
        return false;
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            if (Build.VERSION.SDK_INT < 21) {
                return;
            }
            this.d = ((BatteryManager) Global.getApplication().getSystemService("batterymanager")).getIntProperty(4) / 100.0f;
        } catch (Throwable unused) {
        }
    }
}
