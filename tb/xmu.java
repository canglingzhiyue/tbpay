package tb;

import android.os.Build;
import android.os.Debug;
import android.text.TextUtils;
import anet.channel.util.ALog;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.FalcoEnvironment;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class xmu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f34380a = false;
    private static boolean b = false;
    private static boolean c = false;
    private static final HashSet<c> d = new HashSet<>();
    private static WeakReference<a> e = null;
    private static xmv f = null;
    private static boolean g = false;
    private static b h = null;
    private String i = null;
    private String j = null;
    private String k = null;
    private String l = null;
    private String m = null;
    private String n = null;
    private c o = null;
    private b p = null;
    private boolean q = true;
    private volatile boolean r = false;

    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public long f34385a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;

        private b() {
            this.f34385a = -1L;
            this.b = -1L;
            this.c = -1L;
            this.d = -1L;
            this.e = -1L;
            this.f = -1L;
            this.g = -1L;
        }
    }

    /* loaded from: classes7.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public double f34386a;
        public long b;
        public long c;
        public long d;

        private c() {
            this.f34386a = -1.0d;
            this.b = -1L;
            this.c = -1L;
            this.d = -1L;
        }
    }

    private static long a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c11cadc", new Object[]{new Long(j), new Long(j2)})).longValue();
        }
        if (j != -1 && j2 != -1) {
            return j2 - j;
        }
        return -1L;
    }

    private static String h(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6bc4e8c7", new Object[]{str}) : str == "falco.load_action" ? "load" : str == "falco.scroll_action" ? "scroll" : str;
    }

    public static /* synthetic */ WeakReference a(WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("ad2eef04", new Object[]{weakReference});
        }
        e = weakReference;
        return weakReference;
    }

    public static /* synthetic */ b a(b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a439349c", new Object[]{bVar, bVar2}) : b(bVar, bVar2);
    }

    public static /* synthetic */ void a(xmu xmuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("790aab8", new Object[]{xmuVar});
        } else {
            xmuVar.g();
        }
    }

    public static /* synthetic */ void a(xmu xmuVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea851f4b", new Object[]{xmuVar, new Integer(i)});
        } else {
            xmuVar.b(i);
        }
    }

    public static /* synthetic */ HashSet c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("52e25407", new Object[0]) : d;
    }

    public static /* synthetic */ b d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("24d3a41d", new Object[0]) : i();
    }

    public static /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else {
            h();
        }
    }

    public static /* synthetic */ void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            k();
        }
    }

    public static /* synthetic */ String g(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("14a6f7e8", new Object[]{str}) : h(str);
    }

    public static void a(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271102ec", new Object[]{new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        f34380a = z;
        b = z2;
        c = z3;
        if (!f34380a) {
            ALog.e("falco.gc", "[init] monitor not enabled", null, new Object[0]);
            return;
        }
        if (c) {
            e = new WeakReference<>(new a());
        }
        if (!b) {
            return;
        }
        xmv xmvVar = new xmv();
        f = xmvVar;
        xmvVar.a();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!f34380a) {
        } else {
            this.r = true;
            dit.e(new Runnable() { // from class: tb.xmu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        xmu.a(xmu.this);
                    }
                }
            });
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(3);
        }
    }

    public void a(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!f34380a || !this.r) {
        } else {
            this.r = false;
            dit.e(new Runnable() { // from class: tb.xmu.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        xmu.a(xmu.this, i);
                    }
                }
            });
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        if (this.q) {
            this.o = new c();
        } else {
            c cVar = this.o;
            cVar.f34386a = -1.0d;
            cVar.b = -1L;
            cVar.c = -1L;
            cVar.d = -1L;
        }
        this.q = false;
        this.p = i();
        d.add(this.o);
    }

    private void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.q = true;
        String str = this.i;
        final String str2 = str == null ? "" : str;
        String str3 = this.j;
        final String str4 = str3 == null ? "" : str3;
        String str5 = this.k;
        final String str6 = str5 == null ? "" : str5;
        String str7 = this.l;
        final String str8 = str7 == null ? "" : str7;
        String str9 = this.m;
        final String str10 = str9 == null ? "" : str9;
        String str11 = this.n;
        final String str12 = str11 == null ? "" : str11;
        final c cVar = this.o;
        final b bVar = this.p;
        dit.c(new Runnable() { // from class: tb.xmu.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                xmu.c().remove(cVar);
                b d2 = xmu.d();
                b a2 = xmu.a(bVar, d2);
                if (a2.b <= 0) {
                    return;
                }
                String a3 = tmt.a();
                FalcoEnvironment a4 = FalcoEnvironment.a();
                String b2 = a4 != null ? a4.b() : "";
                xmu.e();
                DimensionValueSet create = DimensionValueSet.create();
                create.setValue("falcoId", a3);
                create.setValue("envFalcoId", b2);
                create.setValue("topic", str2);
                create.setValue("topicFalcoId", str4);
                create.setValue("fromPageName", str6);
                create.setValue("fromPageUrl", str8);
                create.setValue("pageName", str10);
                create.setValue("pageUrl", str12);
                MeasureValueSet create2 = MeasureValueSet.create();
                create2.setValue("gcActionS", bVar.f34385a);
                create2.setValue("gcActionE", d2.f34385a);
                create2.setValue("gcExceedCount", cVar.b);
                create2.setValue("gcMaxUsed", cVar.c);
                create2.setValue("gcMaxTotal", cVar.d);
                create2.setValue(com.taobao.android.diagnose.model.b.GC_COUNT, a2.b);
                create2.setValue(com.taobao.android.diagnose.model.b.GC_TIME, a2.c);
                create2.setValue("bytesAllocated", a2.d);
                create2.setValue("bytesFreed", a2.e);
                create2.setValue("blockingGcCount", a2.f);
                create2.setValue("blockingGcTime", a2.g);
                AppMonitor.Stat.commit("falco", "falco_gc", create, create2);
                StringBuilder sb = new StringBuilder(a3);
                sb.append("|");
                sb.append(xmu.g(str2));
                sb.append("|");
                sb.append("gcTimeInterval=");
                sb.append(a2.f34385a);
                sb.append(",");
                sb.append("gcCount=");
                sb.append(a2.b);
                sb.append(",");
                sb.append("gcTime=");
                sb.append(a2.c);
                sb.append(",");
                if (a2.f > 0) {
                    sb.append("blockingGcCount=");
                    sb.append(a2.f);
                    sb.append(",");
                    sb.append("blockingGcTime=");
                    sb.append(a2.g);
                    sb.append(",");
                }
                if (cVar.b > 0) {
                    sb.append("gcExceedCount=");
                    sb.append(cVar.b);
                    sb.append(",");
                }
                sb.append("gcMaxUsed=");
                sb.append(cVar.c);
                sb.append(",");
                sb.append("gcMaxTotal=");
                sb.append(cVar.d);
                sb.append(",");
                sb.append("bytesAllocated=");
                sb.append(a2.d);
                sb.append(",");
                sb.append("bytesFreed=");
                sb.append(a2.e);
                sb.append(",");
                sb.append("pageName=");
                sb.append(str10);
                ALog.e("falco.gc", sb.toString(), null, new Object[0]);
            }
        }, 3L, TimeUnit.SECONDS);
    }

    private static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
        } else if (g) {
        } else {
            g = true;
            DimensionSet create = DimensionSet.create();
            create.addDimension("falcoId");
            create.addDimension("envFalcoId");
            create.addDimension("topic");
            create.addDimension("topicFalcoId");
            create.addDimension("fromPageName");
            create.addDimension("fromPageUrl");
            create.addDimension("pageName");
            create.addDimension("pageUrl");
            MeasureSet create2 = MeasureSet.create();
            create2.addMeasure("gcActionS");
            create2.addMeasure("gcActionE");
            create2.addMeasure("gcExceedCount");
            create2.addMeasure("gcMaxUsed");
            create2.addMeasure("gcMaxTotal");
            create2.addMeasure(com.taobao.android.diagnose.model.b.GC_COUNT);
            create2.addMeasure(com.taobao.android.diagnose.model.b.GC_TIME);
            create2.addMeasure("bytesAllocated");
            create2.addMeasure("bytesFreed");
            create2.addMeasure("blockingGcCount");
            create2.addMeasure("blockingGcTime");
            AppMonitor.register("falco", "falco_gc", create2, create);
        }
    }

    private static b b(b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e158f8bb", new Object[]{bVar, bVar2});
        }
        b bVar3 = new b();
        bVar3.f34385a = a(bVar.f34385a, bVar2.f34385a);
        bVar3.b = a(bVar.b, bVar2.b);
        bVar3.c = a(bVar.c, bVar2.c);
        bVar3.d = a(bVar.d, bVar2.d);
        bVar3.e = a(bVar.e, bVar2.e);
        bVar3.f = a(bVar.f, bVar2.f);
        bVar3.g = a(bVar.g, bVar2.g);
        return bVar3;
    }

    private static b i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("8e289438", new Object[0]);
        }
        b bVar = h;
        if (bVar != null && System.currentTimeMillis() - bVar.f34385a < 100) {
            return bVar;
        }
        b j = j();
        h = j;
        return j;
    }

    private static b j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("70065dd7", new Object[0]);
        }
        b bVar = new b();
        if (Build.VERSION.SDK_INT >= 23) {
            bVar.f34385a = System.currentTimeMillis();
            bVar.b = i("art.gc.gc-count");
            bVar.c = i("art.gc.gc-time");
            bVar.d = i("art.gc.bytes-allocated");
            bVar.e = i("art.gc.bytes-freed");
            bVar.f = i("art.gc.blocking-gc-count");
            bVar.g = i("art.gc.blocking-gc-time");
        }
        return bVar;
    }

    private static long i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4533162e", new Object[]{str})).longValue();
        }
        try {
            String runtimeStat = Debug.getRuntimeStat(str);
            if (!TextUtils.isEmpty(runtimeStat)) {
                return Long.parseLong(runtimeStat);
            }
            return -1L;
        } catch (Exception e2) {
            ALog.e("falco.gc", "[parseRuntimeStat] error", null, e2, new Object[0]);
            return -1L;
        }
    }

    private static void k() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[0]);
        } else if (d.isEmpty()) {
        } else {
            Runtime runtime = Runtime.getRuntime();
            long maxMemory = runtime.maxMemory();
            long freeMemory = runtime.totalMemory() - runtime.freeMemory();
            double d2 = freeMemory / maxMemory;
            if (d2 > 0.75d) {
                z = true;
            }
            Iterator<c> it = d.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (z) {
                    if (next.b == -1) {
                        next.b = 0L;
                    }
                    next.b++;
                }
                if (d2 > next.f34386a) {
                    next.f34386a = d2;
                    next.d = maxMemory;
                    next.c = freeMemory;
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public void finalize() throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a35321a5", new Object[]{this});
                return;
            }
            super.finalize();
            dit.e(new Runnable() { // from class: tb.xmu.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        xmu.f();
                    }
                }
            });
            xmu.a(new WeakReference(new a()));
        }
    }
}
