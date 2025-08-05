package tb;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import anet.channel.entity.EventType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.e;
import com.taobao.adaemon.j;
import com.taobao.adaemon.k;
import com.taobao.adaemon.l;
import com.taobao.atools.StaticHook;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.mto;

/* loaded from: classes.dex */
public class exz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f27643a;
    private static final int[] b;
    private static AtomicBoolean c;
    private static AtomicBoolean d;
    private static Object e;
    private static Method f;
    private static long g;
    private static LinkedHashMap<Long, Object> h;
    private static final int[] i;
    private static final AtomicBoolean j;

    static {
        kge.a(-1464192721);
        f27643a = new int[]{1077936128, 1};
        b = new int[]{1086324736, 1, 1077936128, 1, 1082146816, EventType.ALL, 1082147072, EventType.ALL, 1082130432, EventType.ALL, 1082130688, EventType.ALL, 1082130944, EventType.ALL, 1082147328, EventType.ALL};
        i = new int[]{21037056, 1, 4194304, 3000000, 4194560, 3000000, 4194816, 3000000};
        c = new AtomicBoolean();
        d = new AtomicBoolean();
        j = new AtomicBoolean();
        h = new LinkedHashMap<Long, Object>() { // from class: com.taobao.adaemon.power.CpuPerformance$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Long, Object> entry) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue() : size() > j.a().K();
            }
        };
    }

    public static void a(Context context) {
        Class<?> cls;
        if (context != null && Build.VERSION.SDK_INT >= 28 && j.a().J() && !c.getAndSet(true)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String str = Build.BRAND;
            try {
                if ("vivo".equals(str)) {
                    cls = Class.forName("com.vivo.framework.vperf.VivoPerfManager");
                } else if ("OPPO".equals(str)) {
                    cls = Class.forName("com.qualcomm.qti.Performance");
                } else {
                    cls = Class.forName("android.util.BoostFramework");
                }
            } catch (Throwable unused) {
                cls = null;
            }
            if (cls == null) {
                e.b("CpuPerformance", "init, boostCls==null", new Object[0]);
                return;
            }
            e.b("CpuPerformance", "init, boostCls = " + cls.getName(), new Object[0]);
            try {
                if (j.get()) {
                    f = StaticHook.a(cls, "perfLockAcquire", Integer.TYPE, Integer.TYPE, int[].class);
                } else {
                    f = StaticHook.a(cls, "perfLockAcquire", Integer.TYPE, int[].class);
                }
                if (f == null) {
                    e.b("CpuPerformance", "init failure, acquireMtd is NULL", new Object[0]);
                    return;
                }
                if (j.get()) {
                    e = StaticHook.a(cls, "getInstance", new Class[0]).invoke(null, new Object[0]);
                } else {
                    Constructor a2 = StaticHook.a(cls, Context.class);
                    if (a2 != null) {
                        e = a2.newInstance(context);
                    } else {
                        e = StaticHook.a(cls, new Class[0]).newInstance(new Object[0]);
                    }
                }
                if ("OPPO".equals(str) && !j.get()) {
                    Method a3 = StaticHook.a(cls, "connectPerfServiceLocked", new Class[0]);
                    if (a3 != null) {
                        a3.setAccessible(true);
                        a3.invoke(e, new Object[0]);
                    }
                    Field b2 = StaticHook.b(e.getClass(), "sIsUntrustedDomain");
                    if (b2 != null) {
                        b2.setAccessible(true);
                        b2.set(null, true);
                    }
                    Field b3 = StaticHook.b(e.getClass(), "RestrictUnTrustedAppAccess");
                    if (b3 != null) {
                        b3.setAccessible(true);
                        b3.set(null, false);
                    }
                    Field c2 = StaticHook.c(e.getClass(), "mForWeixinTabOnly");
                    if (c2 != null) {
                        c2.setAccessible(true);
                        c2.set(e, true);
                    }
                }
                d.set(true);
                e.b("CpuPerformance", "initSuccess", "spent", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            } catch (Throwable th) {
                e.a("CpuPerformance", "init err: ", th, new Object[0]);
            }
        }
    }

    public static void a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i2)});
        } else if (!j.a().J()) {
        } else {
            a(l.e());
            int i3 = -1;
            if (d.get()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < g) {
                    e.b("CpuPerformance", "boostCpu ing", new Object[0]);
                    return;
                }
                int K = j.a().K();
                if (h.size() >= K) {
                    long longValue = elapsedRealtime - h.keySet().iterator().next().longValue();
                    if (longValue < 60000) {
                        e.b("CpuPerformance", "boostCpu", "limit", Integer.valueOf(K), "time diff", Long.valueOf(longValue));
                        return;
                    }
                }
                h.put(Long.valueOf(elapsedRealtime), null);
                int max = Math.max(0, Math.min(3000, i2));
                g = elapsedRealtime + max;
                e.b("CpuPerformance", "boostCpu start", "duration", Integer.valueOf(max));
                try {
                    if (j.get()) {
                        i3 = a(max, i);
                    } else {
                        i3 = a(max, f27643a);
                        a(max, b);
                    }
                } catch (Throwable th) {
                    e.a("CpuPerformance", "boostCpu err: ", th, new Object[0]);
                }
            } else {
                e.b("CpuPerformance", "boostCpu not support", new Object[0]);
            }
            kat.a(k.MODULE_NAME, k.c, i3 > 0 ? "success" : "failure", mto.a.GEO_NOT_SUPPORT);
        }
    }

    private static int a(int i2, int[] iArr) throws Throwable {
        int intValue = j.get() ? ((Integer) f.invoke(e, 0, Integer.valueOf(i2), iArr)).intValue() : ((Integer) f.invoke(e, Integer.valueOf(i2), iArr)).intValue();
        e.b("CpuPerformance", "perfLockAcquire ret = " + intValue, new Object[0]);
        return intValue;
    }
}
