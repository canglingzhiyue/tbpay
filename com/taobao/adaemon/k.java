package com.taobao.adaemon;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.k;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.orange.OConstant;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;
import tb.mto;
import tb.suq;

/* loaded from: classes.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "Adaemon";
    public static final String POINT_PROC_LAUNCHER = "channel_launcher";

    /* renamed from: a */
    public static String f8365a;
    public static String b;
    public static String c;
    public static String e;
    public static String f;
    public static boolean g;
    private static boolean h;

    static {
        kge.a(179595849);
        f8365a = "fully_point";
        b = "start_proc";
        e = "app_list";
        f = "mem_art";
        c = "cpu_perf";
        try {
            Class.forName(OConstant.REFLECT_APPMONITOR);
            g = true;
        } catch (Exception unused) {
            g = false;
        }
        if (g) {
            try {
                Class.forName("com.taobao.analysis.scene.SceneIdentifier");
                h = true;
            } catch (Exception unused2) {
                h = false;
            }
        }
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : h;
    }

    /* loaded from: classes.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static boolean g;

        /* renamed from: a */
        public final String f8370a;
        public int b;
        public long c;
        public String d;
        public boolean e;
        public String f;

        /* renamed from: lambda$oz7QUy7_f4KtRhWx-c2n7uZvcpQ */
        public static /* synthetic */ void m819lambda$oz7QUy7_f4KtRhWxc2n7uZvcpQ(d dVar) {
            dVar.c();
        }

        static {
            kge.a(1698232168);
            g = false;
        }

        public d(String str) {
            this.f8370a = str;
            if (k.a()) {
                this.b = SceneIdentifier.getDeviceLevel();
            }
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (!k.g) {
                return false;
            }
            synchronized (d.class) {
                if (g) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("process");
                    create.addDimension("deviceLevel");
                    create.addDimension("memoryTrace");
                    create.addDimension("restarted");
                    create.addDimension("switch");
                    create.addDimension("keepAlive");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("liveTime");
                    AppMonitor.register(k.MODULE_NAME, "processStat", create2, create, true);
                    g = true;
                } catch (Exception e) {
                    com.taobao.adaemon.e.a("StatMonitor", "[ProcessStat][register]fail.", null, e);
                }
                return g;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!k.g) {
            } else {
                com.taobao.adaemon.c.b(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$k$d$oz7QUy7_f4KtRhWx-c2n7uZvcpQ
                    {
                        k.d.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        k.d.m819lambda$oz7QUy7_f4KtRhWxc2n7uZvcpQ(k.d.this);
                    }
                });
            }
        }

        public /* synthetic */ void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (!b()) {
            } else {
                com.taobao.adaemon.e.a("StatMonitor", "[commit]", null, "ProcessStat", toString());
                try {
                    DimensionValueSet create = DimensionValueSet.create();
                    create.setValue("process", this.f8370a);
                    create.setValue("keepAlive", String.valueOf(l.c()));
                    create.setValue("deviceLevel", String.valueOf(this.b));
                    create.setValue("memoryTrace", this.d);
                    create.setValue("restarted", String.valueOf(this.e));
                    create.setValue("switch", this.f);
                    MeasureValueSet create2 = MeasureValueSet.create();
                    create2.setValue("liveTime", this.c);
                    AppMonitor.Stat.commit(k.MODULE_NAME, "processStat", create, create2);
                } catch (Exception e) {
                    com.taobao.adaemon.e.a("StatMonitor", "[ProcessStat][commit]fail.", null, e);
                }
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "ProcessStat{process='" + this.f8370a + "', deviceLevel=" + this.b + ", liveTime=" + this.c + ", memoryTrace='" + this.d + "', restarted=" + this.e + ", sw=" + this.f + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static boolean g;

        /* renamed from: a */
        public final String f8366a;
        public int b;
        public boolean c;
        public boolean d;
        public String e;
        public long f;

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6c216d0", new Object[]{aVar})).booleanValue() : aVar.c();
        }

        static {
            kge.a(-901751389);
            g = false;
        }

        public a(String str) {
            this.f8366a = str;
        }

        private boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
            }
            if (!k.g) {
                return false;
            }
            synchronized (a.class) {
                if (g) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("process");
                    create.addDimension("state");
                    create.addDimension("restarted");
                    create.addDimension("bgType");
                    create.addDimension("type");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("liveTime");
                    AppMonitor.register(k.MODULE_NAME, "lifecycleStat", create2, create, true);
                    g = true;
                } catch (Exception e) {
                    com.taobao.adaemon.e.a("StatMonitor", "[LifecycleStat][register]fail.", null, e);
                }
                return g;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!k.g) {
            } else {
                com.taobao.adaemon.c.b(new Runnable() { // from class: com.taobao.adaemon.k.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        a.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!a.a(a.this)) {
                        } else {
                            com.taobao.adaemon.e.a("StatMonitor", "[commit]", null, "LifecycleStat", a.this.toString());
                            try {
                                DimensionValueSet create = DimensionValueSet.create();
                                create.setValue("process", a.this.f8366a);
                                create.setValue("state", String.valueOf(a.this.c ? 1 : 0));
                                create.setValue("restarted", String.valueOf(a.this.d ? 1 : 0));
                                create.setValue("bgType", String.valueOf("back".equals(a.this.e) ? 1 : 0));
                                create.setValue("type", String.valueOf(a.this.b));
                                MeasureValueSet create2 = MeasureValueSet.create();
                                create2.setValue("liveTime", a.this.f);
                                AppMonitor.Stat.commit(k.MODULE_NAME, "lifecycleStat", create, create2);
                            } catch (Exception e) {
                                com.taobao.adaemon.e.a("StatMonitor", "[LifecycleStat][commit]fail.", null, e);
                            }
                        }
                    }
                });
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "[LifecycleStat]process=" + this.f8366a + ",state=" + this.c + ",restarted=" + this.d + ",bgType=" + this.e + ",type=" + this.b + ",liveTime=" + this.f;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("state", this.c);
                jSONObject.put("restarted", this.d);
                jSONObject.put("bgType", this.e);
                jSONObject.put("liveTime", this.f);
            } catch (JSONException e) {
                com.taobao.adaemon.e.a("StatMonitor", "[toJson]", null, e);
            }
            return jSONObject.toString();
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.c = jSONObject.getBoolean("state");
                this.d = jSONObject.getBoolean("restarted");
                if (!jSONObject.isNull("bgType")) {
                    this.e = jSONObject.getString("bgType");
                }
                this.f = jSONObject.getLong("liveTime");
            } catch (JSONException e) {
                com.taobao.adaemon.e.a("StatMonitor", "[updateFromJson]", null, e);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static boolean f;

        /* renamed from: a */
        public int f8371a;
        public boolean b;
        public int c;
        public int d;
        public long e;

        public static /* synthetic */ boolean a(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6c3e84c", new Object[]{eVar})).booleanValue() : eVar.b();
        }

        static {
            kge.a(-1995593976);
            f = false;
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (!k.g) {
                return false;
            }
            synchronized (e.class) {
                if (f) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE);
                    create.addDimension(com.taobao.mtop.wvplugin.a.RESULT_KEY);
                    create.addDimension("reason");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("workTimes");
                    create2.addMeasure("workInterval");
                    AppMonitor.register(k.MODULE_NAME, "restartStat", create2, create, true);
                    f = true;
                } catch (Exception e) {
                    com.taobao.adaemon.e.a("StatMonitor", "[RestartStat][register]fail.", null, e);
                }
                return f;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!k.g) {
            } else {
                com.taobao.adaemon.c.b(new Runnable() { // from class: com.taobao.adaemon.k.e.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        e.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!e.a(e.this)) {
                        } else {
                            com.taobao.adaemon.e.a("StatMonitor", "[commit]", null, "RestartStat", e.this.toString());
                            try {
                                DimensionValueSet create = DimensionValueSet.create();
                                create.setValue(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, String.valueOf(e.this.f8371a));
                                create.setValue(com.taobao.mtop.wvplugin.a.RESULT_KEY, String.valueOf(e.this.b ? 1 : 0));
                                create.setValue("reason", String.valueOf(e.this.c));
                                MeasureValueSet create2 = MeasureValueSet.create();
                                create2.setValue("workTimes", e.this.d);
                                create2.setValue("workInterval", e.this.e);
                                AppMonitor.Stat.commit(k.MODULE_NAME, "restartStat", create, create2);
                            } catch (Exception e) {
                                com.taobao.adaemon.e.a("StatMonitor", "[RestartStat][commit]fail.", null, e);
                            }
                        }
                    }
                });
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "[RestartStat]triggerType=" + this.f8371a + "," + com.taobao.mtop.wvplugin.a.RESULT_KEY + "=" + this.b + ",reason=" + this.c + ",workTimes=" + this.d + ",workInterval=" + this.e;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int TYPE_BEFORE_KILL = 2;
        public static final int TYPE_BG = 1;
        public static final int TYPE_DEEP_BG = 3;
        public static final int TYPE_START = 0;
        private static boolean p;

        /* renamed from: a */
        public final String f8368a;
        public int b;
        public String c;
        public boolean d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public float k;
        public int l;
        public int m;
        public int n;
        public int o;

        public static /* synthetic */ boolean a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6c2ff8e", new Object[]{cVar})).booleanValue() : cVar.b();
        }

        static {
            kge.a(165458997);
            p = false;
        }

        public c(String str) {
            this.f8368a = str;
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (!k.g) {
                return false;
            }
            synchronized (c.class) {
                if (p) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("process");
                    create.addDimension("type");
                    create.addDimension("restarted");
                    create.addDimension("bgType");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("useMem");
                    create2.addMeasure("currentMem");
                    create2.addMeasure("privateClean");
                    create2.addMeasure("privateDirty");
                    create2.addMeasure("javaHeap");
                    create2.addMeasure(com.taobao.android.diagnose.model.b.NATIVE_HEAP);
                    create2.addMeasure("javaProportion");
                    create2.addMeasure("summaryCode");
                    create2.addMeasure("summaryStack");
                    create2.addMeasure("summarySystem");
                    create2.addMeasure("summaryPrivateOther");
                    AppMonitor.register(k.MODULE_NAME, "processMemStat", create2, create, true);
                    p = true;
                } catch (Exception e) {
                    com.taobao.adaemon.e.a("StatMonitor", "[ProcessMemStat][register]fail.", null, e);
                }
                return p;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!k.g) {
            } else {
                com.taobao.adaemon.c.b(new Runnable() { // from class: com.taobao.adaemon.k.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        c.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!c.a(c.this)) {
                        } else {
                            com.taobao.adaemon.e.a("StatMonitor", "commit", null, "v", c.this.toString());
                            try {
                                DimensionValueSet create = DimensionValueSet.create();
                                create.setValue("process", c.this.f8368a);
                                create.setValue("type", String.valueOf(c.this.b));
                                create.setValue("restarted", String.valueOf(c.this.d ? 1 : 0));
                                create.setValue("bgType", String.valueOf("back".equals(c.this.c) ? 1 : 0));
                                MeasureValueSet create2 = MeasureValueSet.create();
                                create2.setValue("useMem", c.this.e);
                                create2.setValue("currentMem", c.this.f);
                                create2.setValue("privateClean", c.this.g);
                                create2.setValue("privateDirty", c.this.h);
                                create2.setValue("javaHeap", c.this.i);
                                create2.setValue(com.taobao.android.diagnose.model.b.NATIVE_HEAP, c.this.j);
                                create2.setValue("javaProportion", c.this.k);
                                create2.setValue("summaryCode", c.this.l);
                                create2.setValue("summaryStack", c.this.m);
                                create2.setValue("summaryPrivateOther", c.this.n);
                                create2.setValue("summarySystem", c.this.o);
                                AppMonitor.Stat.commit(k.MODULE_NAME, "processMemStat", create, create2);
                            } catch (Exception e) {
                                com.taobao.adaemon.e.a("StatMonitor", "[ProcessMemStat]commit fail.", null, e);
                            }
                        }
                    }
                });
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "[ProcessMemStat]process=" + this.f8368a + ",type=" + this.b + ",restarted=" + this.d + ",bgType=" + this.c + ",useMem=" + this.e + ",privateClean=" + this.g + ",privateDirty=" + this.h + ",javaHeap=" + this.i + "," + com.taobao.android.diagnose.model.b.NATIVE_HEAP + "=" + this.j + ",currentMem=" + this.f + ",javaProportion=" + this.k + ",summaryCode=" + this.l + ",summaryStack=" + this.m + ",summaryPrivateOther=" + this.n + ",summarySystem=" + this.o;
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static boolean f8374a;
        private String b;
        private String c;
        private long d;

        /* renamed from: lambda$7s1zmC9Za4NOFad-OGhKL_x5Yq0 */
        public static /* synthetic */ void m820lambda$7s1zmC9Za4NOFadOGhKL_x5Yq0(h hVar) {
            hVar.c();
        }

        static {
            kge.a(-353672276);
            f8374a = false;
        }

        public h(String str, String str2, long j) {
            this.b = str;
            this.c = str2;
            this.d = j;
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (!k.g) {
                return false;
            }
            synchronized (c.class) {
                if (f8374a) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("page_name");
                    create.addDimension("info");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("spent");
                    AppMonitor.register(k.MODULE_NAME, "all_thread_cpu", create2, create, true);
                    f8374a = true;
                } catch (Exception e) {
                    com.taobao.adaemon.e.a("StatMonitor", "AllThreadCpuStat register err", e, new Object[0]);
                }
                return f8374a;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!k.g) {
            } else {
                com.taobao.adaemon.c.b(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$k$h$7s1zmC9Za4NOFad-OGhKL_x5Yq0
                    {
                        k.h.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        k.h.m820lambda$7s1zmC9Za4NOFadOGhKL_x5Yq0(k.h.this);
                    }
                });
            }
        }

        public /* synthetic */ void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (!b()) {
            } else {
                com.taobao.adaemon.e.b("StatMonitor", "commit", "page", this.b, "info", this.c);
                try {
                    DimensionValueSet create = DimensionValueSet.create();
                    create.setValue("page_name", this.b);
                    create.setValue("info", this.c);
                    MeasureValueSet create2 = MeasureValueSet.create();
                    create2.setValue("spent", this.d);
                    AppMonitor.Stat.commit(k.MODULE_NAME, "all_thread_cpu", create, create2);
                } catch (Exception e) {
                    com.taobao.adaemon.e.a("StatMonitor", "[AllThreadCpuStat]commit fail.", e, new Object[0]);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static boolean e;

        /* renamed from: a */
        public final String f8373a;
        public int b;
        public int c;
        public int d;

        static {
            kge.a(814768689);
            e = false;
        }

        public f(String str) {
            this.f8373a = str;
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (!k.g) {
                return false;
            }
            synchronized (this) {
                if (e) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("origin");
                    create.addDimension("type");
                    create.addDimension("state");
                    create.addDimension("channel");
                    AppMonitor.register(k.MODULE_NAME, "TriggerStat", MeasureSet.create(), create, true);
                    e = true;
                } catch (Exception e2) {
                    com.taobao.adaemon.e.a("StatMonitor", "[TriggerStat][register]fail.", null, e2);
                }
                return e;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!k.g) {
                com.taobao.adaemon.e.a("StatMonitor", "monitor valid", new Object[0]);
            } else if (!b()) {
                com.taobao.adaemon.e.a("StatMonitor", "register error", new Object[0]);
            } else {
                com.taobao.adaemon.e.a("StatMonitor", "[commit]", null, "TriggerStat", toString());
                try {
                    DimensionValueSet create = DimensionValueSet.create();
                    create.setValue("origin", this.f8373a);
                    create.setValue("type", String.valueOf(this.c));
                    create.setValue("state", String.valueOf(this.d));
                    create.setValue("channel", String.valueOf(this.b));
                    AppMonitor.Stat.commit(k.MODULE_NAME, "TriggerStat", create, MeasureValueSet.create());
                } catch (Exception e2) {
                    com.taobao.adaemon.e.a("StatMonitor", "[TriggerStat]commit fail.", null, e2);
                }
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "TriggerStat{origin='" + this.f8373a + "', channel=" + this.b + ", type=" + this.c + ", state=" + this.d + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2000022508);
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            com.taobao.accs.utl.d.a(k.MODULE_NAME, "process_died_info", str, l.c() ? 1.0d : mto.a.GEO_NOT_SUPPORT);
            com.taobao.adaemon.e.b("StatMonitor", "ProcessDeadStat", "info", str);
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(727083174);
        }

        public static void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            } else {
                com.taobao.accs.utl.d.a(k.MODULE_NAME, "frame_rate", "");
            }
        }

        public static void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            } else {
                com.taobao.accs.utl.d.a(k.MODULE_NAME, "frame_rate", str, null, null);
            }
        }
    }
}
