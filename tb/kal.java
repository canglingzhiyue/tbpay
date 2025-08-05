package tb;

import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.orange.OConstant;
import tb.kal;
import tb.mto;

/* loaded from: classes.dex */
public class kal {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String POINT_ACQUIRE_DEFAULT_PROVIDER = "acq_default_provider";
    public static final String POINT_ACQUIRE_PROVIDER = "acq_provider";
    public static final String POINT_BIND_IN_MAIN = "bind_in_main";
    public static final String POINT_BIND_SERVICE = "bind_service";
    public static final String POINT_HOOK = "hook";
    public static final String POINT_RETRY_ACQUIRE_PROVIDER = "retry_acq_provider";

    /* renamed from: a */
    private static boolean f29911a;

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f29911a;
    }

    static {
        kge.a(-2145892223);
        try {
            Class.forName(OConstant.REFLECT_APPMONITOR);
            f29911a = true;
        } catch (Exception unused) {
            f29911a = false;
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static boolean f29912a;
        private String b;
        private String c;
        private int d;
        private int e;
        private int f;
        private long g;
        private long h;
        private long i;

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("945028e9", new Object[]{aVar})).booleanValue() : aVar.b();
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee2b9319", new Object[]{aVar})).intValue() : aVar.d;
        }

        public static /* synthetic */ int c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4806fd5a", new Object[]{aVar})).intValue() : aVar.f;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a1e2679b", new Object[]{aVar})).intValue() : aVar.e;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a17f11d7", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("29af51b6", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ long g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("af74a65f", new Object[]{aVar})).longValue() : aVar.g;
        }

        public static /* synthetic */ long h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("95010a0", new Object[]{aVar})).longValue() : aVar.h;
        }

        public static /* synthetic */ long i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("632b7ae1", new Object[]{aVar})).longValue() : aVar.i;
        }

        static {
            kge.a(654419640);
            f29912a = false;
        }

        public a(int i) {
            this.d = i;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.e = i;
            }
        }

        public void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            } else {
                this.g = j;
            }
        }

        public void b(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            } else {
                this.h = j;
            }
        }

        public void c(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
            } else {
                this.i = j;
            }
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.f = z ? 1 : 0;
            }
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (!kal.a()) {
                return false;
            }
            synchronized (this) {
                if (f29912a) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("type");
                    create.addDimension("degrade");
                    create.addDimension("result");
                    create.addDimension(FluidException.SERVICE_NAME);
                    create.addDimension(FluidException.METHOD_NAME);
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("costTime");
                    create2.addMeasure("invokeTime");
                    create2.addMeasure("dataSize");
                    AppMonitor.register("ARanger", "ipcState", create2, create, true);
                    f29912a = true;
                } catch (Exception e) {
                    kak.a("IPCMonitor", "[register][AppMonitor register]", e, new Object[0]);
                }
                return f29912a;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!kal.a()) {
            } else {
                com.taobao.aranger.utils.b.a(false, true, new Runnable() { // from class: tb.kal.a.1
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
                            kak.a("IPCMonitor", "[commit]", "IpcState", a.this.toString());
                            try {
                                DimensionValueSet create = DimensionValueSet.create();
                                create.setValue("type", String.valueOf(a.b(a.this)));
                                create.setValue("degrade", String.valueOf(a.c(a.this)));
                                create.setValue("result", String.valueOf(a.d(a.this)));
                                create.setValue(FluidException.SERVICE_NAME, a.e(a.this));
                                create.setValue(FluidException.METHOD_NAME, a.f(a.this));
                                MeasureValueSet create2 = MeasureValueSet.create();
                                create2.setValue("costTime", a.g(a.this));
                                create2.setValue("invokeTime", a.h(a.this));
                                create2.setValue("dataSize", a.i(a.this));
                                AppMonitor.Stat.commit("ARanger", "ipcState", create, create2);
                            } catch (Exception e) {
                                kak.a("IPCMonitor", "[commit][AppMonitor Stat commit]", e, new Object[0]);
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
            return "IpcState{serviceName='" + this.b + "', methodName='" + this.c + "', type=" + this.d + ", result=" + this.e + ", degrade=" + this.f + ", costTime=" + this.g + ", invokeTime=" + this.h + ", dataSize=" + this.i + '}';
        }
    }

    /* loaded from: classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static boolean f29914a;
        private String b;
        private String c;
        private long d;

        public static /* synthetic */ void lambda$50iAT_LcKeSrpnCkl1v8a30xqdM(b bVar) {
            bVar.c();
        }

        static {
            kge.a(1097107007);
            f29914a = false;
        }

        public b(String str, String str2, long j) {
            this.b = str;
            this.c = str2;
            this.d = j;
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (!kal.a()) {
                return false;
            }
            synchronized (this) {
                if (f29914a) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension(AURASubmitEvent.RPC_SERVICE_NAME);
                    create.addDimension("process");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("secs");
                    AppMonitor.register("ARanger", "ipc_service", create2, create, true);
                    f29914a = true;
                } catch (Exception e) {
                    kak.a("IPCMonitor", "[register][AppMonitor register]", e, new Object[0]);
                }
                return f29914a;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!kal.a()) {
            } else {
                com.taobao.aranger.utils.b.a(false, false, new Runnable() { // from class: tb.-$$Lambda$kal$b$50iAT_LcKeSrpnCkl1v8a30xqdM
                    @Override // java.lang.Runnable
                    public final void run() {
                        kal.b.lambda$50iAT_LcKeSrpnCkl1v8a30xqdM(kal.b.this);
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
                kak.b("IPCMonitor", "ServiceState[commit]", FluidException.SERVICE_NAME, this.b, "process", this.c, "launchSecs", Long.valueOf(this.d));
                try {
                    DimensionValueSet create = DimensionValueSet.create();
                    create.setValue(AURASubmitEvent.RPC_SERVICE_NAME, this.b);
                    create.setValue("process", this.c);
                    MeasureValueSet create2 = MeasureValueSet.create();
                    create2.setValue("secs", this.d);
                    AppMonitor.Stat.commit("ARanger", "ipc_service", create, create2);
                } catch (Exception e) {
                    kak.a("IPCMonitor", "[commit][AppMonitor Stat commit]", e, new Object[0]);
                }
            }
        }
    }

    public static void a(String str, boolean z, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34eb18fd", new Object[]{str, new Boolean(z), strArr});
            return;
        }
        String str2 = (strArr == null || strArr.length != 1) ? "" : strArr[0];
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(z ? "_succ_" : "_fail_");
        sb.append(str2);
        kat.a("ARanger", "base", sb.toString(), mto.a.GEO_NOT_SUPPORT);
    }
}
