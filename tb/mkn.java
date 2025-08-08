package tb;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.c;
import com.taobao.metrickit.e;
import com.taobao.tao.log.TLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class mkn extends mkg<mkm> implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final int f31068a = Process.myPid();
    private static long b = 50;
    private static long c = 83;
    private final com.taobao.monitor.performance.cpu.e d;
    private final Handler f;
    private Map<String, ?> k;
    private Map<String, ?> l;
    private final Object e = new Object();
    private volatile long g = -1;
    private boolean h = false;
    private final Map<String, Object> i = new ConcurrentHashMap();
    private transient boolean j = false;

    public static /* synthetic */ Object ipc$super(mkn mknVar, String str, Object... objArr) {
        if (str.hashCode() == 91915241) {
            super.b();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void lambda$Z9kWoVh0FHVlJwcxP37bthTWzsA(mkn mknVar, String str, Object obj) {
        mknVar.b(str, obj);
    }

    public static /* synthetic */ long a(mkn mknVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f4abfe3c", new Object[]{mknVar})).longValue() : mknVar.g;
    }

    public static /* synthetic */ boolean a(mkn mknVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0d47d90", new Object[]{mknVar, new Boolean(z)})).booleanValue();
        }
        mknVar.j = z;
        return z;
    }

    public static /* synthetic */ Object b(mkn mknVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("f53b1d89", new Object[]{mknVar}) : mknVar.e;
    }

    public static /* synthetic */ Handler c(mkn mknVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("8adfbb3c", new Object[]{mknVar}) : mknVar.f;
    }

    public static /* synthetic */ com.taobao.monitor.performance.cpu.e d(mkn mknVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.monitor.performance.cpu.e) ipChange.ipc$dispatch("d61df323", new Object[]{mknVar}) : mknVar.d;
    }

    public static /* synthetic */ Map e(mkn mknVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4183b581", new Object[]{mknVar}) : mknVar.k;
    }

    public static /* synthetic */ long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[0])).longValue() : c;
    }

    public static /* synthetic */ Map f(mkn mknVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7ad4c642", new Object[]{mknVar}) : mknVar.i;
    }

    public static /* synthetic */ Map g(mkn mknVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b425d703", new Object[]{mknVar}) : mknVar.l;
    }

    public mkn(Application application, Handler handler) {
        this.f = handler;
        this.d = new com.taobao.monitor.performance.cpu.e(application.getPackageName());
        c.a().a(this);
    }

    public static long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[0])).longValue() : b;
    }

    public static void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
        } else {
            b = j;
        }
    }

    public static long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[0])).longValue() : c;
    }

    public static void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{new Long(j)});
        } else {
            c = j;
        }
    }

    @Override // com.taobao.metrickit.e
    public void a(final String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.f.postAtTime(new Runnable() { // from class: tb.-$$Lambda$mkn$Z9kWoVh0FHVlJwcxP37bthTWzsA
                @Override // java.lang.Runnable
                public final void run() {
                    mkn.lambda$Z9kWoVh0FHVlJwcxP37bthTWzsA(mkn.this, str, obj);
                }
            }, this.e, SystemClock.uptimeMillis());
        }
    }

    public /* synthetic */ void b(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{this, str, obj});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.i.put(str, obj);
        }
    }

    @Override // tb.mkh
    public int[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("ab8ad2ba", new Object[]{this}) : new int[]{15, 81};
    }

    @Override // tb.mkh
    public void b(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c62340b", new Object[]{this, new Integer(i), map});
            return;
        }
        if (i == 15) {
            this.k = map;
        }
        if (i != 81) {
            return;
        }
        this.l = map;
    }

    @Override // tb.mkg
    public void a(int i, Map<String, ?> map, mkf<mkm> mkfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2729eb72", new Object[]{this, new Integer(i), map, mkfVar});
            return;
        }
        if (9 == i) {
            if (this.g < 0) {
                this.g = Process.myTid();
            }
            this.i.clear();
            this.j = false;
            this.f.removeCallbacksAndMessages(this.e);
            Handler handler = this.f;
            long j = -1;
            if (map != null) {
                j = mqe.a(map.get("frameTimeNanos"), -1L);
            }
            handler.postAtTime(new a(j, mkfVar), this.e, SystemClock.uptimeMillis() + b);
            if (!this.h) {
                this.h = true;
                mkfVar.a("openCollector", null);
            }
        }
        if (10 != i) {
            return;
        }
        this.i.clear();
        this.j = false;
        this.f.removeCallbacksAndMessages(this.e);
    }

    @Override // tb.mkg
    public Handler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[]{this}) : this.f;
    }

    @Override // tb.mkg, tb.mkh
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        super.b();
        c.a().a(null);
    }

    /* loaded from: classes7.dex */
    public final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final long b;
        private final mkf<mkm> c;

        public a(long j, mkf<mkm> mkfVar) {
            mkn.this = r1;
            this.b = j;
            this.c = mkfVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            mkn.a(mkn.this, true);
            long uptimeMillis = SystemClock.uptimeMillis();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            mkm a2 = new mkm().d(mkn.a(mkn.this)).c(this.b).a(System.nanoTime());
            mkn.c(mkn.this).postAtTime(new b(a2, this.c), mkn.b(mkn.this), SystemClock.uptimeMillis() + mkn.f());
            a(a2);
            this.c.a("firstCollect", null);
            TLog.loge("MetricKit.BlockStackCollector", "isFirstDump:true", "block dump cost: ", String.valueOf(SystemClock.uptimeMillis() - uptimeMillis), String.valueOf(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis), String.valueOf(uptimeMillis), String.valueOf(currentThreadTimeMillis));
        }

        private void a(mkm mkmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ab89e9", new Object[]{this, mkmVar});
                return;
            }
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            mkmVar.a(Looper.getMainLooper().getThread().getStackTrace());
            TLog.loge("MetricKit.BlockStackCollector", "doFirstCollect: getStackTrace()", String.valueOf(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
            long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
            mkmVar.a(mkn.d(mkn.this).b());
            TLog.loge("MetricKit.BlockStackCollector", "doFirstCollect: mProcessCpuTracker.of()", String.valueOf(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis2));
            long currentThreadTimeMillis3 = SystemClock.currentThreadTimeMillis();
            mkmVar.b(mkn.d(mkn.this).a(mkn.a(mkn.this)));
            TLog.loge("MetricKit.BlockStackCollector", "doFirstCollect: mProcessCpuTracker.ofMainThread()", String.valueOf(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis3));
        }
    }

    /* loaded from: classes7.dex */
    public final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final mkm b;
        private final mkf<mkm> c;

        public b(mkm mkmVar, mkf<mkm> mkfVar) {
            mkn.this = r1;
            this.b = mkmVar;
            this.c = mkfVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            try {
                String str = "";
                mkn.f(mkn.this).put("lastMemoryRecord", mkn.e(mkn.this) == null ? str : new JSONObject(mkn.e(mkn.this)).toString());
                Map f = mkn.f(mkn.this);
                if (mkn.g(mkn.this) != null) {
                    str = new JSONObject(mkn.g(mkn.this)).toString();
                }
                f.put("lastCpuRecord", str);
            } catch (Exception unused) {
            }
            this.b.b(System.nanoTime());
            this.b.a(mkn.f(mkn.this));
            a(this.b);
            this.c.a(this.b);
            this.c.a("secondCollect", null);
            TLog.loge("MetricKit.BlockStackCollector", "isFirstDump:false", "block dump cost: ", String.valueOf(SystemClock.uptimeMillis() - uptimeMillis), String.valueOf(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis), String.valueOf(uptimeMillis), String.valueOf(currentThreadTimeMillis));
        }

        private void a(mkm mkmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4ab89e9", new Object[]{this, mkmVar});
                return;
            }
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            mkmVar.b(Looper.getMainLooper().getThread().getStackTrace());
            TLog.loge("MetricKit.BlockStackCollector", "doSecondCollect: getStackTrace()", String.valueOf(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
            long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis();
            mkmVar.c(mkn.d(mkn.this).a(mkn.a(mkn.this)));
            TLog.loge("MetricKit.BlockStackCollector", "doSecondCollect: mProcessCpuTracker.ofAllThread()", String.valueOf(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis2));
            long currentThreadTimeMillis3 = SystemClock.currentThreadTimeMillis();
            mkmVar.d(mkn.d(mkn.this).b());
            TLog.loge("MetricKit.BlockStackCollector", "doSecondCollect: mProcessCpuTracker.of()", String.valueOf(SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis3));
        }
    }
}
