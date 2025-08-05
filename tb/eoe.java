package tb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.TrafficStats;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ProcessController;
import com.taobao.adaemon.e;
import com.taobao.adaemon.g;
import com.taobao.adaemon.j;
import com.taobao.adaemon.k;
import com.taobao.adaemon.l;
import com.taobao.atools.StaticHook;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.eoe;
import tb.ezb;
import tb.ezp;
import tb.qgw;

/* loaded from: classes.dex */
public class eoe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_ALARM = "alarm";
    public static final String TYPE_CPU = "cpu";
    public static final String TYPE_NET = "net";
    public static final String TYPE_SENSOR = "sensor";
    public static final String TYPE_WAKELOCK = "wlock";
    public static final String TYPE_WIFI = "wifi";
    private static boolean g;

    /* renamed from: a */
    public final c f27489a = new a();
    public final c b = new b();
    public final c c = new d();
    public final c d = new e();
    public final c e = new h();
    public final c f = new f();
    private double h;

    public static /* synthetic */ void lambda$_NBK7MsjlzrcltgyjSncZ1p_AjU(eoe eoeVar) {
        eoeVar.d();
    }

    /* renamed from: lambda$cbn6z_lhZRwGqZmmSebph67-t18 */
    public static /* synthetic */ void m2439lambda$cbn6z_lhZRwGqZmmSebph67t18(Context context, int i) {
        a(context, i);
    }

    public static /* synthetic */ double a(eoe eoeVar, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fff6dfcf", new Object[]{eoeVar, new Double(d2)})).doubleValue();
        }
        eoeVar.h = d2;
        return d2;
    }

    static {
        kge.a(211711979);
        g = false;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            this.b.b();
            c cVar = this.d;
            cVar.j = true;
            cVar.b();
            c cVar2 = this.f;
            cVar2.j = true;
            cVar2.b();
            this.f27489a.j = true;
        } else {
            this.c.b();
            if (j.a().m()) {
                c();
            }
        }
        c cVar3 = this.e;
        cVar3.j = z;
        cVar3.b();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.taobao.adaemon.c.c().execute(new Runnable() { // from class: tb.-$$Lambda$eoe$_NBK7MsjlzrcltgyjSncZ1p_AjU
                @Override // java.lang.Runnable
                public final void run() {
                    eoe.lambda$_NBK7MsjlzrcltgyjSncZ1p_AjU(eoe.this);
                }
            });
        }
    }

    public /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            final Context a2 = kaq.a();
            PowerManager powerManager = (PowerManager) a2.getSystemService("power");
            if (Build.VERSION.SDK_INT >= 29) {
                powerManager.addThermalStatusListener(new PowerManager.OnThermalStatusChangedListener() { // from class: tb.-$$Lambda$eoe$cbn6z_lhZRwGqZmmSebph67-t18
                    @Override // android.os.PowerManager.OnThermalStatusChangedListener
                    public final void onThermalStatusChanged(int i) {
                        eoe.m2439lambda$cbn6z_lhZRwGqZmmSebph67t18(a2, i);
                    }
                });
            }
            a2.registerReceiver(new BroadcastReceiver() { // from class: com.taobao.adaemon.power.APower$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    double intExtra = intent.getIntExtra("temperature", 0) / 10.0d;
                    eoe eoeVar = eoe.this;
                    if (intExtra == eoe.$ipChange) {
                        return;
                    }
                    eoe.a(eoe.this, intExtra);
                    e.b("APower", "temperature changed", "temp", Double.valueOf(intExtra), "curPage", g.b().s());
                }
            }, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Throwable th) {
            com.taobao.adaemon.e.a("APower", "temp err", th, new Object[0]);
        }
    }

    public static /* synthetic */ void a(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i)});
            return;
        }
        boolean z = !com.taobao.adaemon.g.b().g(context);
        com.taobao.adaemon.e.b("APower", "onThermalStatusChanged", "status", Integer.valueOf(i), "foreground", Boolean.valueOf(z), "commit", Boolean.valueOf(g));
        if (i < 2) {
            g = false;
        } else if (g || !z) {
        } else {
            g = true;
            com.taobao.adaemon.c.c().execute($$Lambda$eoe$7c23pPC7eq_4PHO0Y9MzN6vcWGs.INSTANCE);
        }
    }

    public static /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        new k.h(com.taobao.adaemon.g.b().s(), qgw.b(10), SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime()).a();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!a() || l.a(l.e(), "power", "c_dump_day", "c_dump_times", null) + l.a(l.e(), "power", "m_dump_day", "m_dump_times", null) > 10) {
        } else {
            com.taobao.adaemon.e.b("APower", "start dumpAll", new Object[0]);
            ezb.b bF_ = this.f27489a.bF_();
            if (bF_ == null || TextUtils.isEmpty(bF_.d)) {
                return;
            }
            bF_.a();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_CPU_SYS_CHANNEL = "s_c";
        public static final String KEY_CPU_SYS_CHANNEL_TOTAL = "s_c_t";
        public static final String KEY_CPU_SYS_MAIN = "s_m";
        public static final String KEY_CPU_SYS_MAIN_TOTAL = "s_m_t";
        public static final String KEY_CPU_USER_CHANNEL = "u_c";
        public static final String KEY_CPU_USER_CHANNEL_TOTAL = "u_c_t";
        public static final String KEY_CPU_USER_MAIN = "u_m";
        public static final String KEY_CPU_USER_MAIN_TOTAL = "u_m_t";
        public static final String KEY_DAY = "day";
        public static final String KEY_DURATION = "dur";
        public static final String KEY_DURATION_TOTAL = "dur_t";
        public static final String KEY_PID_CHANNEL = "pid_channel";
        public static final String KEY_PID_MAIN = "pid_main";
        public static final String KEY_RX = "rx";
        public static final String KEY_RX_TOTAL = "rx_t";
        public static final String KEY_TX = "tx";
        public static final String KEY_TX_TOTAL = "tx_t";
        public boolean j;
        public SharedPreferences k;

        static {
            kge.a(1963698924);
        }

        public abstract String a();

        public abstract void b();

        public abstract ezb.b bF_();

        public abstract void c();

        public abstract void d();

        public SharedPreferences j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SharedPreferences) ipChange.ipc$dispatch("5019b485", new Object[]{this});
            }
            if (this.k == null) {
                Context e = l.e();
                this.k = e.getSharedPreferences("adaemon_energy_" + a(), 0);
            }
            return this.k;
        }
    }

    /* loaded from: classes.dex */
    public static class a extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int f27490a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public List<qgw.a> l = null;
        public long m = 0;
        public long n = 0;
        public long o = 0;

        static {
            kge.a(-817191690);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // tb.eoe.c
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : eoe.TYPE_CPU;
        }

        @Override // tb.eoe.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            Context e = l.e();
            this.f27490a = l.b(e);
            Pair<Long, Long> mainProcCpuTime = this.f27490a > 0 ? ProcessController.getInstance().getMainProcCpuTime(e) : null;
            if (mainProcCpuTime != null) {
                this.b = ((Long) mainProcCpuTime.first).longValue();
                this.c = ((Long) mainProcCpuTime.second).longValue();
            } else {
                this.b = 0L;
                this.c = 0L;
            }
            Pair<Long, Long> h = l.h();
            if (h != null) {
                this.d = ((Long) h.first).longValue();
                this.e = ((Long) h.second).longValue();
            } else {
                this.d = 0L;
                this.e = 0L;
            }
            long j = this.b;
            this.f = j;
            this.g = this.c;
            this.h = this.d;
            this.i = this.e;
            this.l = null;
            this.m = 0L;
            this.n = 0L;
            com.taobao.adaemon.e.b("APower", "CPU.reset()", "uTimeMain", Long.valueOf(j), "sTimeMain", Long.valueOf(this.c), "uTimeChannel", Long.valueOf(this.d), "sTimeChannel", Long.valueOf(this.e));
        }

        @Override // tb.eoe.c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            SharedPreferences j = j();
            j.edit().putLong(c.KEY_CPU_USER_MAIN_TOTAL, j.getLong(c.KEY_CPU_USER_MAIN_TOTAL, 0L) + j.getLong(c.KEY_CPU_USER_MAIN, 0L)).putLong(c.KEY_CPU_SYS_MAIN_TOTAL, j.getLong(c.KEY_CPU_SYS_MAIN_TOTAL, 0L) + j.getLong(c.KEY_CPU_SYS_MAIN, 0L)).putLong(c.KEY_CPU_USER_CHANNEL_TOTAL, j.getLong(c.KEY_CPU_USER_CHANNEL_TOTAL, 0L) + j.getLong(c.KEY_CPU_USER_CHANNEL, 0L)).putLong(c.KEY_CPU_SYS_CHANNEL_TOTAL, j.getLong(c.KEY_CPU_SYS_CHANNEL_TOTAL, 0L) + j.getLong(c.KEY_CPU_SYS_CHANNEL, 0L)).remove(c.KEY_CPU_USER_MAIN).remove(c.KEY_CPU_SYS_MAIN).remove(c.KEY_CPU_USER_CHANNEL).remove(c.KEY_CPU_SYS_CHANNEL).commit();
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x00bc  */
        @Override // tb.eoe.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void d() {
            /*
                Method dump skipped, instructions count: 386
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.eoe.a.d():void");
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
                return;
            }
            SharedPreferences j = j();
            int i = j.getInt(c.KEY_DAY, -1);
            int i2 = Calendar.getInstance().get(6);
            if (i <= 0 || i2 == i) {
                return;
            }
            ezb.a aVar = new ezb.a(eoe.TYPE_CPU, i2 - i);
            aVar.c = j.getLong(c.KEY_CPU_USER_MAIN_TOTAL, 0L) + j.getLong(c.KEY_CPU_USER_MAIN, 0L);
            aVar.d = j.getLong(c.KEY_CPU_SYS_MAIN_TOTAL, 0L) + j.getLong(c.KEY_CPU_SYS_MAIN, 0L);
            aVar.e = j.getLong(c.KEY_CPU_USER_CHANNEL_TOTAL, 0L) + j.getLong(c.KEY_CPU_USER_CHANNEL, 0L);
            aVar.f = j.getLong(c.KEY_CPU_SYS_CHANNEL_TOTAL, 0L) + j.getLong(c.KEY_CPU_SYS_CHANNEL_TOTAL, 0L);
            aVar.a();
            com.taobao.adaemon.e.b("APower", "CPU.report()", "uTimeMain", Long.valueOf(aVar.c), "sTimeMain", Long.valueOf(aVar.d), "uTimeChannel", Long.valueOf(aVar.e), "sTimeChannel", Long.valueOf(aVar.f));
            j.edit().remove(c.KEY_CPU_USER_MAIN_TOTAL).remove(c.KEY_CPU_SYS_MAIN_TOTAL).remove(c.KEY_CPU_USER_CHANNEL_TOTAL).remove(c.KEY_CPU_SYS_CHANNEL_TOTAL).remove(c.KEY_CPU_USER_MAIN).remove(c.KEY_CPU_SYS_MAIN).remove(c.KEY_CPU_USER_CHANNEL).remove(c.KEY_CPU_SYS_CHANNEL).commit();
            long j2 = this.f;
            if (j2 > 0) {
                this.b = j2;
                this.c = this.g;
            }
            long j3 = this.h;
            if (j3 <= 0) {
                return;
            }
            this.d = j3;
            this.e = this.i;
        }

        public ezb.a f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ezb.a) ipChange.ipc$dispatch("c8d1b1ef", new Object[]{this});
            }
            ezb.a aVar = new ezb.a(eoe.TYPE_CPU, 0);
            aVar.c = this.k.getLong(c.KEY_CPU_USER_MAIN, 0L);
            aVar.d = this.k.getLong(c.KEY_CPU_SYS_MAIN, 0L);
            aVar.e = this.k.getLong(c.KEY_CPU_USER_CHANNEL, 0L);
            aVar.f = this.k.getLong(c.KEY_CPU_SYS_CHANNEL, 0L);
            return aVar;
        }

        @Override // tb.eoe.c
        public ezb.b bF_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ezb.b) ipChange.ipc$dispatch("87972bd9", new Object[]{this});
            }
            ezb.b bVar = null;
            try {
                ezb.a f = f();
                Context e = l.e();
                if (this.j && f.e + f.f > 0) {
                    bVar = a(f.e, f.f);
                }
                if (f.c + f.d > 0) {
                    ProcessController.getInstance().tryDumpMain(e, f.c, f.d);
                }
            } catch (Throwable th) {
                com.taobao.adaemon.e.a("APower", "tryDump", th, new Object[0]);
            }
            return bVar;
        }

        public ezb.b a(long j, long j2) {
            char c;
            List<qgw.a> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ezb.b) ipChange.ipc$dispatch("ceb9b373", new Object[]{this, new Long(j), new Long(j2)});
            }
            int myPid = Process.myPid();
            Context e = l.e();
            String str = this.j ? "c_dump_day" : "m_dump_day";
            String str2 = this.j ? "c_dump_times" : "m_dump_times";
            int E = j.a().E();
            if (this.j) {
                E /= 2;
            }
            if (l.a(e, "power", str, str2, null) > 5) {
                com.taobao.adaemon.e.b("APower", "isChannel", Boolean.valueOf(this.j), "cpu dump max");
                return null;
            } else if (SystemClock.elapsedRealtime() - this.o <= 120000) {
                com.taobao.adaemon.e.b("APower", "isChannel", Boolean.valueOf(this.j), "cpu dump freq");
                return null;
            } else {
                com.taobao.adaemon.e.b("APower", "tryDumpCurrProc", "isChannel", Boolean.valueOf(this.j), "uTime", Long.valueOf(j), "sTime", Long.valueOf(j2), MspDBHelper.BizEntry.COLUMN_NAME_PID, Integer.valueOf(myPid));
                String str3 = str;
                if (this.m != 0) {
                    long elapsedRealtime = (((j + j2) - this.n) * 3600000) / (SystemClock.elapsedRealtime() - this.m);
                    com.taobao.adaemon.e.b("APower", "tryDumpCurrProc", "isChannel", Boolean.valueOf(this.j), "cpuTimePerHour", Long.valueOf(elapsedRealtime), "cpuDumpLevel", Integer.valueOf(E));
                    if (elapsedRealtime < E) {
                        return null;
                    }
                }
                List<qgw.a> a2 = qgw.a(myPid);
                l.a(e, str3, str2, null);
                if (this.l == null) {
                    this.l = a2;
                    this.m = SystemClock.elapsedRealtime();
                    this.n = j2 + j;
                    com.taobao.adaemon.e.b("APower", "lastProcStats", "isChannel", Boolean.valueOf(this.j), "firstSnapshotTime", Long.valueOf(this.m), "firstCpuTime", Long.valueOf(this.n), "lastProcStats", this.l.toString());
                    return null;
                }
                this.o = SystemClock.elapsedRealtime();
                List<qgw.a> a3 = a(this.l, a2);
                if (a3 != null) {
                    int size = a3.size();
                    if (size > 10) {
                        size = 10;
                    }
                    c = 0;
                    list = a3.subList(0, size);
                } else {
                    c = 0;
                    list = null;
                }
                if (list == null || list.size() <= 0) {
                    return null;
                }
                Object[] objArr = new Object[6];
                objArr[c] = "isChannel";
                objArr[1] = Boolean.valueOf(this.j);
                objArr[2] = "count";
                objArr[3] = Integer.valueOf(list.size());
                objArr[4] = "busyThreads";
                objArr[5] = list;
                com.taobao.adaemon.e.b("APower", "cpu active", objArr);
                ezb.b bVar = new ezb.b();
                bVar.c = j + "|" + j2;
                bVar.d = list != null ? list.toString() : "";
                bVar.b = eoe.TYPE_CPU;
                return bVar;
            }
        }

        private List<qgw.a> a(List<qgw.a> list, List<qgw.a> list2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("66db90bd", new Object[]{this, list, list2});
            }
            if (list == null || list.size() == 0 || list2 == null || list2.size() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (qgw.a aVar : list) {
                hashMap.put(Integer.valueOf(aVar.f32934a), aVar);
            }
            for (qgw.a aVar2 : list2) {
                qgw.a aVar3 = (qgw.a) hashMap.get(Integer.valueOf(aVar2.f32934a));
                if (aVar3 == null) {
                    aVar2.f = aVar2.d;
                    aVar2.g = aVar2.e;
                } else {
                    aVar2.f = aVar2.d - aVar3.d;
                    long j = 0;
                    aVar2.f = aVar2.f > 0 ? aVar2.f : 0L;
                    aVar2.g = aVar2.e - aVar3.e;
                    if (aVar2.g > 0) {
                        j = aVar2.g;
                    }
                    aVar2.g = j;
                }
            }
            Collections.sort(list2, qgw.a.COMPARATOR_BY_CPU_DIFF_TIME_DESCENDING);
            return list2;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public static AtomicBoolean f27491a;
        public long b;
        public long c;
        public long d;
        public long e;

        @Override // tb.eoe.c
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "net";
        }

        @Override // tb.eoe.c
        public ezb.b bF_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ezb.b) ipChange.ipc$dispatch("87972bd9", new Object[]{this});
            }
            return null;
        }

        static {
            kge.a(-441669712);
            f27491a = new AtomicBoolean();
        }

        @Override // tb.eoe.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            int myUid = Process.myUid();
            this.b = TrafficStats.getUidRxBytes(myUid);
            this.c = TrafficStats.getUidTxBytes(myUid);
            long j = this.b;
            this.d = j;
            this.e = this.c;
            com.taobao.adaemon.e.b("APower", "NetworkPower.reset()", "rxBytes", Long.valueOf(j), "txBytes", Long.valueOf(this.c));
            f27491a.set(true);
        }

        @Override // tb.eoe.c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            SharedPreferences j = j();
            j.edit().putLong(c.KEY_RX_TOTAL, j.getLong(c.KEY_RX_TOTAL, 0L) + j.getLong(c.KEY_RX, 0L)).putLong(c.KEY_TX_TOTAL, j.getLong(c.KEY_TX_TOTAL, 0L) + j.getLong(c.KEY_TX, 0L)).remove(c.KEY_RX).remove(c.KEY_TX).commit();
        }

        @Override // tb.eoe.c
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else if (!f27491a.get()) {
            } else {
                int myUid = Process.myUid();
                long uidRxBytes = TrafficStats.getUidRxBytes(myUid);
                long uidTxBytes = TrafficStats.getUidTxBytes(myUid);
                int i = j().getInt(c.KEY_PID_CHANNEL, 0);
                int myPid = Process.myPid();
                if (myPid != i) {
                    c();
                }
                e();
                j().edit().putInt(c.KEY_DAY, Calendar.getInstance().get(6)).putInt(c.KEY_PID_CHANNEL, myPid).putLong(c.KEY_RX, uidRxBytes - this.b).putLong(c.KEY_TX, uidTxBytes - this.c).commit();
                this.d = uidRxBytes;
                this.e = uidTxBytes;
                com.taobao.adaemon.e.b("APower", "NetworkPower.record()", "rxBytes", Long.valueOf(uidRxBytes - this.b), "txBytes", Long.valueOf(uidTxBytes - this.c));
            }
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
                return;
            }
            SharedPreferences j = j();
            int i = j.getInt(c.KEY_DAY, -1);
            int i2 = Calendar.getInstance().get(6);
            if (i <= 0 || i2 == i) {
                return;
            }
            ezb.a aVar = new ezb.a("net", i2 - i);
            aVar.g = j.getLong(c.KEY_RX_TOTAL, 0L) + j.getLong(c.KEY_RX, 0L);
            aVar.h = j.getLong(c.KEY_TX_TOTAL, 0L) + j.getLong(c.KEY_TX, 0L);
            aVar.a();
            com.taobao.adaemon.e.b("APower", "NetworkPower.report()", "rxBytes", Long.valueOf(aVar.g), "txBytes", Long.valueOf(aVar.h));
            j.edit().remove(c.KEY_RX_TOTAL).remove(c.KEY_TX_TOTAL).remove(c.KEY_RX).remove(c.KEY_TX).commit();
            long j2 = this.d;
            if (j2 <= 0) {
                return;
            }
            this.b = j2;
            this.c = this.e;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public static final ConcurrentHashMap<Integer, WeakReference<Object>> f27492a;
        public static AtomicBoolean b;
        public static Field c;
        public static Field d;
        public static boolean e;
        public AtomicBoolean f = new AtomicBoolean();
        public long g;
        public long h;

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* renamed from: lambda$8_aSj6zj9C-YvmVZhzy18Q3R2L8 */
        public static /* synthetic */ void m2440lambda$8_aSj6zj9CYvmVZhzy18Q3R2L8(d dVar) {
            dVar.i();
        }

        public static /* synthetic */ Object lambda$Yt_Wg9_YYKoD3Ye7oCChJrtrYVc(Object obj, Object obj2, Method method, Object[] objArr) {
            return a(obj, obj2, method, objArr);
        }

        @Override // tb.eoe.c
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "sensor";
        }

        @Override // tb.eoe.c
        public ezb.b bF_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ezb.b) ipChange.ipc$dispatch("87972bd9", new Object[]{this});
            }
            return null;
        }

        static {
            kge.a(-1131650542);
            f27492a = new ConcurrentHashMap<>();
            b = new AtomicBoolean();
        }

        private void g() {
            try {
                Field b2 = StaticHook.b(Class.forName("android.app.SystemServiceRegistry"), "SYSTEM_SERVICE_FETCHERS");
                b2.setAccessible(true);
                Map map = (Map) b2.get(null);
                final Object obj = map.get("sensor");
                map.put("sensor", Proxy.newProxyInstance(Class.class.getClassLoader(), new Class[]{Class.forName("android.app.SystemServiceRegistry$ServiceFetcher")}, new InvocationHandler() { // from class: tb.-$$Lambda$eoe$d$Yt_Wg9_YYKoD3Ye7oCChJrtrYVc
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj2, Method method, Object[] objArr) {
                        return eoe.d.lambda$Yt_Wg9_YYKoD3Ye7oCChJrtrYVc(obj, obj2, method, objArr);
                    }
                }));
                e = true;
                com.taobao.adaemon.e.b("APower", "SensorPower init success", new Object[0]);
            } catch (Throwable th) {
                com.taobao.adaemon.e.a("APower", "SensorPower init err", th, new Object[0]);
            }
        }

        public static /* synthetic */ Object a(Object obj, Object obj2, Method method, Object[] objArr) throws Throwable {
            if ("getService".equals(method.getName())) {
                Object invoke = method.invoke(obj, objArr);
                if (invoke != null) {
                    f27492a.put(Integer.valueOf(invoke.hashCode()), new WeakReference<>(invoke));
                }
                return invoke;
            }
            return method.invoke(obj, objArr);
        }

        @Override // tb.eoe.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (!eoe.a()) {
            } else {
                if (!b.getAndSet(true)) {
                    g();
                    this.g = SystemClock.elapsedRealtime();
                } else if (!e) {
                } else {
                    this.f.set(true);
                    com.taobao.adaemon.c.c().schedule(new Runnable() { // from class: tb.-$$Lambda$eoe$d$8_aSj6zj9C-YvmVZhzy18Q3R2L8
                        @Override // java.lang.Runnable
                        public final void run() {
                            eoe.d.m2440lambda$8_aSj6zj9CYvmVZhzy18Q3R2L8(eoe.d.this);
                        }
                    }, 3L, TimeUnit.SECONDS);
                }
            }
        }

        public /* synthetic */ void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dd2870", new Object[]{this});
                return;
            }
            this.f.set(false);
            long elapsedRealtime = h() ? SystemClock.elapsedRealtime() : 0L;
            this.g = elapsedRealtime;
            this.h = elapsedRealtime;
        }

        @Override // tb.eoe.c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (!eoe.a()) {
            } else {
                SharedPreferences j = j();
                long j2 = j.getLong("dur", 0L);
                if (j2 <= 0) {
                    return;
                }
                j.edit().putLong(c.KEY_DURATION_TOTAL, j.getLong(c.KEY_DURATION_TOTAL, 0L) + j2).remove("dur").commit();
            }
        }

        @Override // tb.eoe.c
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else if (!eoe.a() || !e || this.f.get()) {
            } else {
                int i = j().getInt(c.KEY_PID_MAIN, 0);
                int myPid = Process.myPid();
                if (myPid != i) {
                    c();
                }
                e();
                if (!h()) {
                    this.g = 0L;
                    this.h = 0L;
                    return;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.g == 0) {
                    this.g = elapsedRealtime;
                    return;
                }
                j().edit().putInt(c.KEY_DAY, Calendar.getInstance().get(6)).putInt(c.KEY_PID_MAIN, myPid).putLong("dur", elapsedRealtime - this.g).commit();
                this.h = elapsedRealtime;
                com.taobao.adaemon.e.b("APower", "SensorPower.record()", "duration", Long.valueOf(elapsedRealtime - this.g));
            }
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
                return;
            }
            SharedPreferences j = j();
            int i = j.getInt(c.KEY_DAY, -1);
            int i2 = Calendar.getInstance().get(6);
            if (i <= 0 || i2 == i) {
                return;
            }
            ezb.a aVar = new ezb.a("sensor", i2 - i);
            aVar.i = j.getLong(c.KEY_DURATION_TOTAL, 0L) + j.getLong("dur", 0L);
            aVar.a();
            com.taobao.adaemon.e.b("APower", "SensorPower.report()", "duration", Long.valueOf(aVar.i));
            j.edit().remove(c.KEY_DURATION_TOTAL).remove("dur").commit();
            long j2 = this.h;
            if (j2 <= 0) {
                return;
            }
            this.g = j2;
        }

        private boolean h() {
            boolean z;
            if (f27492a.isEmpty()) {
                return false;
            }
            try {
                if (c == null) {
                    Field c2 = StaticHook.c(Class.forName("android.hardware.SystemSensorManager"), "mSensorListeners");
                    c = c2;
                    if (c2 != null) {
                        c.setAccessible(true);
                    }
                }
            } catch (Throwable th) {
                th = th;
                z = false;
            }
            if (c == null) {
                com.taobao.adaemon.e.b("APower", "sensorListenerField not found!", new Object[0]);
                return false;
            }
            Iterator<Map.Entry<Integer, WeakReference<Object>>> it = f27492a.entrySet().iterator();
            z = false;
            while (it.hasNext()) {
                try {
                    Map.Entry<Integer, WeakReference<Object>> next = it.next();
                    if (next.getValue().get() == null) {
                        it.remove();
                    } else {
                        HashMap hashMap = (HashMap) c.get(next.getValue().get());
                        if (hashMap != null && !hashMap.isEmpty()) {
                            try {
                                StringBuilder sb = new StringBuilder();
                                for (Object obj : hashMap.keySet()) {
                                    if (obj instanceof Proxy) {
                                        Object obj2 = null;
                                        try {
                                            if (d == null) {
                                                Field declaredField = Proxy.class.getDeclaredField("h");
                                                d = declaredField;
                                                declaredField.setAccessible(true);
                                            }
                                            obj2 = d.get(obj);
                                        } catch (Throwable unused) {
                                        }
                                        sb.append(obj2 == null ? com.taobao.android.weex_framework.util.a.ATOM_Proxy : obj2.getClass().getName());
                                    } else {
                                        sb.append(obj.getClass().getName());
                                    }
                                    sb.append(",");
                                }
                                com.taobao.adaemon.e.b("APower", "hasSensorListener", "listeners", sb.toString());
                                z = true;
                            } catch (Throwable th2) {
                                th = th2;
                                z = true;
                                com.taobao.adaemon.e.a("APower", "hasSensorListener err", th, new Object[0]);
                                com.taobao.adaemon.e.b("APower", "hasSensorListener", "flag", Boolean.valueOf(z));
                                return z;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            com.taobao.adaemon.e.b("APower", "hasSensorListener", "flag", Boolean.valueOf(z));
            return z;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String KEY_WIFI_QUERY = "query";
        public static final String KEY_WIFI_QUERY_TOTAL = "query_t";
        public static final String KEY_WIFI_SCAN = "scan";
        public static final String KEY_WIFI_SCAN_TOTAL = "scan_t";

        /* renamed from: a */
        public static AtomicBoolean f27493a;
        public int b;
        public int c;
        public int d;
        public int e;
        public ezp f;

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* renamed from: lambda$uRhaie4_W5biv05gLKirtXXz-20 */
        public static /* synthetic */ void m2441lambda$uRhaie4_W5biv05gLKirtXXz20(e eVar, Method method, Object[] objArr) {
            eVar.a(method, objArr);
        }

        @Override // tb.eoe.c
        public ezb.b bF_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ezb.b) ipChange.ipc$dispatch("87972bd9", new Object[]{this});
            }
            return null;
        }

        static {
            kge.a(-1550763046);
            f27493a = new AtomicBoolean();
        }

        private void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
                return;
            }
            try {
                this.f = new ezp("wifi", "android.net.wifi.IWifiManager", new ezp.a() { // from class: tb.-$$Lambda$eoe$e$uRhaie4_W5biv05gLKirtXXz-20
                    @Override // tb.ezp.a
                    public final void beforeMethodInvoke(Method method, Object[] objArr) {
                        eoe.e.m2441lambda$uRhaie4_W5biv05gLKirtXXz20(eoe.e.this, method, objArr);
                    }
                });
                boolean a2 = this.f.a();
                Context e = l.e();
                this.k = e.getSharedPreferences("adaemon_energy_" + a(), 0);
                if (!a2) {
                    return;
                }
                com.taobao.adaemon.e.a("APower", "WifiScanPower.init  success", new Object[0]);
                f27493a.set(true);
            } catch (Throwable th) {
                com.taobao.adaemon.e.a("APower", "WifiScanPower.init", th, new Object[0]);
            }
        }

        public /* synthetic */ void a(Method method, Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85fdefa1", new Object[]{this, method, objArr});
            } else if (rrv.START_SCAN.equals(method.getName())) {
                this.b++;
            } else if (!"getScanResults".equals(method.getName())) {
            } else {
                this.c++;
            }
        }

        @Override // tb.eoe.c
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.j ? "wifiscan_c" : "wifiscan_m";
        }

        @Override // tb.eoe.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (!eoe.a()) {
            } else {
                if (!f27493a.get()) {
                    f();
                }
                com.taobao.adaemon.e.b("APower", "WifiScanPower.resetMemValue start", "scanCount", Integer.valueOf(this.b), "queryCount", Integer.valueOf(this.c), "lastScanCount", Integer.valueOf(this.d), "lastQueryCount", Integer.valueOf(this.e));
                this.b = 0;
                this.d = 0;
                this.c = 0;
                this.e = 0;
            }
        }

        @Override // tb.eoe.c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (!eoe.a() || !f27493a.get()) {
            } else {
                SharedPreferences j = j();
                int i = j.getInt("scan", 0);
                int i2 = j.getInt("query", 0);
                int i3 = j.getInt(KEY_WIFI_SCAN_TOTAL, 0);
                int i4 = j.getInt(KEY_WIFI_QUERY_TOTAL, 0);
                if (i <= 0 && i2 <= 0) {
                    return;
                }
                int i5 = i3 + i;
                int i6 = i4 + i2;
                j.edit().putInt(KEY_WIFI_SCAN_TOTAL, i5).putInt(KEY_WIFI_QUERY_TOTAL, i6).remove("scan").remove("query").commit();
                com.taobao.adaemon.e.b("APower", "WifiScanPower.calcSum", "spScanCount", Integer.valueOf(i), "spQueryCount", Integer.valueOf(i2), "finalScanTotal", Integer.valueOf(i5), "finalQueryTotal", Integer.valueOf(i6));
            }
        }

        @Override // tb.eoe.c
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else if (!eoe.a() || !f27493a.get()) {
            } else {
                com.taobao.adaemon.e.b("APower", "WifiScanPower.record start", "scanCount", Integer.valueOf(this.b), "queryCount", Integer.valueOf(this.c));
                String str = this.j ? c.KEY_PID_CHANNEL : c.KEY_PID_MAIN;
                int i = j().getInt(str, 0);
                int myPid = Process.myPid();
                if (myPid != i) {
                    c();
                }
                e();
                j().edit().putInt(c.KEY_DAY, Calendar.getInstance().get(6)).putInt(str, myPid).putInt("scan", this.b).putInt("query", this.c).commit();
                this.d = this.b;
                this.e = this.c;
                this.b = 0;
                this.c = 0;
            }
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else if (!eoe.a() || !f27493a.get()) {
            } else {
                SharedPreferences j = j();
                int i = j.getInt(c.KEY_DAY, -1);
                int i2 = Calendar.getInstance().get(6);
                if (i <= 0 || i2 == i) {
                    return;
                }
                ezb.a aVar = new ezb.a("wifi", i2 - i);
                aVar.j = j.getInt(KEY_WIFI_SCAN_TOTAL, 0) + j.getInt("scan", 0);
                aVar.k = j.getInt(KEY_WIFI_QUERY_TOTAL, 0) + j.getInt("query", 0);
                if (aVar.j > 0 || aVar.k > 0) {
                    aVar.a();
                }
                com.taobao.adaemon.e.b("APower", "WifiScanPower.report", "stat.wifiscan", Integer.valueOf(aVar.j), "stat.wifiquery", Integer.valueOf(aVar.k));
                j.edit().remove(KEY_WIFI_SCAN_TOTAL).remove("scan").remove(KEY_WIFI_QUERY_TOTAL).remove("query").commit();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public static AtomicBoolean f27496a;
        public Map<String, g> b = new ConcurrentHashMap(2);
        public Map<String, g> c = new ConcurrentHashMap(2);
        public ezp d;

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // tb.eoe.c
        public ezb.b bF_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ezb.b) ipChange.ipc$dispatch("87972bd9", new Object[]{this});
            }
            return null;
        }

        @Override // tb.eoe.c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            }
        }

        static {
            kge.a(-1296906179);
            f27496a = new AtomicBoolean();
        }

        private void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
                return;
            }
            try {
                this.d = new ezp("power", "android.os.IPowerManager", new ezp.a() { // from class: tb.eoe.h.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        h.this = this;
                    }

                    @Override // tb.ezp.a
                    public void beforeMethodInvoke(Method method, Object[] objArr) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4c51e70a", new Object[]{this, method, objArr});
                        } else if (objArr == null) {
                        } else {
                            try {
                                if ("acquireWakeLock".equals(method.getName())) {
                                    if (!(objArr[0] instanceof IBinder)) {
                                        com.taobao.adaemon.e.b("APower", "wLockPower arg[0] invalid", new Object[0]);
                                    } else if (objArr[2] != null && !(objArr[2] instanceof String)) {
                                        com.taobao.adaemon.e.b("APower", "wLockPower arg[2] invalid", new Object[0]);
                                    } else if (h.this.b.size() >= 10) {
                                        com.taobao.adaemon.e.b("APower", "wLockPower return for max size", new Object[0]);
                                    } else {
                                        g gVar = new g();
                                        gVar.f27495a = (String) objArr[2];
                                        gVar.b = System.currentTimeMillis();
                                        h.this.b.put(objArr[0].toString(), gVar);
                                    }
                                } else if (!"releaseWakeLock".equals(method.getName())) {
                                } else {
                                    if (objArr.length == 2 && (objArr[0] instanceof IBinder)) {
                                        Iterator<Map.Entry<String, g>> it = h.this.b.entrySet().iterator();
                                        g gVar2 = null;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Map.Entry<String, g> next = it.next();
                                            if (next.getKey() != null && next.getKey().equals(objArr[0].toString())) {
                                                gVar2 = next.getValue();
                                                gVar2.c += System.currentTimeMillis() - gVar2.b;
                                                it.remove();
                                                break;
                                            }
                                        }
                                        if (gVar2 == null) {
                                            com.taobao.adaemon.e.b("APower", "wLockPower miss acquire", "key", objArr[0]);
                                            return;
                                        }
                                        g gVar3 = h.this.c.get(gVar2.f27495a);
                                        if (gVar3 == null) {
                                            gVar3 = new g();
                                            gVar3.f27495a = gVar2.f27495a;
                                        }
                                        gVar3.d += gVar2.c;
                                        gVar3.e++;
                                        h.this.c.put(gVar3.f27495a, gVar3);
                                        return;
                                    }
                                    com.taobao.adaemon.e.b("APower", "wLockPower", "args", objArr);
                                }
                            } catch (Throwable th) {
                                com.taobao.adaemon.e.a("APower", "WakeLockPower invoke error", th, new Object[0]);
                            }
                        }
                    }
                });
                boolean a2 = this.d.a();
                Context e = l.e();
                this.k = e.getSharedPreferences("adaemon_energy_" + a(), 0);
                if (!a2) {
                    return;
                }
                f27496a.set(true);
                com.taobao.adaemon.e.a("APower", "WakeLockPower.init success", new Object[0]);
            } catch (Throwable th) {
                com.taobao.adaemon.e.a("APower", "WakeLockPower error", th, new Object[0]);
            }
        }

        @Override // tb.eoe.c
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.j ? "wlock_c" : "wlock_m";
        }

        @Override // tb.eoe.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (!eoe.a()) {
            } else {
                if (!f27496a.get()) {
                    f();
                }
                com.taobao.adaemon.e.b("APower", "wlock resetMemValue start", "runningLocks", this.b.toString());
                this.b.clear();
                this.c.clear();
            }
        }

        @Override // tb.eoe.c
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else if (eoe.a() && f27496a.get()) {
                e();
                if (this.c.size() == 0) {
                    return;
                }
                SharedPreferences j = j();
                SharedPreferences.Editor edit = j.edit();
                HashSet hashSet = new HashSet(2);
                Long valueOf = Long.valueOf(j.getLong("wlocktime_t", 0L));
                int i = j.getInt("wlocktimes_t", 0);
                long longValue = valueOf.longValue();
                for (Map.Entry<String, g> entry : this.c.entrySet()) {
                    g value = entry.getValue();
                    if (value != null) {
                        hashSet.add(entry.getKey());
                        longValue += value.d;
                        i += value.e;
                    }
                }
                com.taobao.adaemon.e.b("APower", "wlock record end", "tags", hashSet.toString(), "totalTime", Long.valueOf(longValue), "totalTimes", Integer.valueOf(i));
                if (longValue > 0 && i > 0) {
                    edit.putInt(c.KEY_DAY, Calendar.getInstance().get(6)).putString("wlocktag", hashSet.toString()).putLong("wlocktime_t", longValue).putInt("wlocktimes_t", i).commit();
                }
                this.c.clear();
            }
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else if (!eoe.a() || !f27496a.get()) {
            } else {
                SharedPreferences j = j();
                int i = j.getInt(c.KEY_DAY, -1);
                int i2 = Calendar.getInstance().get(6);
                if (i <= 0 || i2 == i) {
                    return;
                }
                ezb.a aVar = new ezb.a(eoe.TYPE_WAKELOCK, i2 - i);
                aVar.m = j.getString("wlocktag", "");
                aVar.n = j.getLong("wlocktime_t", 0L);
                aVar.o = j.getInt("wlocktimes_t", 0);
                if (aVar.n > 0 && aVar.o > 0) {
                    aVar.a();
                }
                j().edit().remove("wlocktag").remove("wlocktime_t").remove("wlocktimes_t").commit();
                com.taobao.adaemon.e.b("APower", "wlock report", "wlockTime", Long.valueOf(aVar.n), "wlockTimes", Integer.valueOf(aVar.o), "tags", aVar.m);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public String f27495a;
        public long b;
        public long c;
        public long d;
        public int e;

        static {
            kge.a(-1889606537);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "WLockInfo{tag='" + this.f27495a + "', startTime=" + this.b + ", wlockTime=" + this.c + ", wlockTotalTime=" + this.d + ", wlockTimes=" + this.e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class f extends c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public static AtomicBoolean f27494a;
        public ezp b;
        public int c = 0;

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ void lambda$pPPS5KTj7mMKXASgwvYkfLhFKXE(f fVar, Method method, Object[] objArr) {
            fVar.a(method, objArr);
        }

        @Override // tb.eoe.c
        public ezb.b bF_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ezb.b) ipChange.ipc$dispatch("87972bd9", new Object[]{this});
            }
            return null;
        }

        @Override // tb.eoe.c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            }
        }

        static {
            kge.a(1437982637);
            f27494a = new AtomicBoolean();
        }

        private void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
                return;
            }
            try {
                this.b = new ezp("alarm", "android.app.IAlarmManager", new ezp.a() { // from class: tb.-$$Lambda$eoe$f$pPPS5KTj7mMKXASgwvYkfLhFKXE
                    @Override // tb.ezp.a
                    public final void beforeMethodInvoke(Method method, Object[] objArr) {
                        eoe.f.lambda$pPPS5KTj7mMKXASgwvYkfLhFKXE(eoe.f.this, method, objArr);
                    }
                });
                boolean a2 = this.b.a();
                Context e = l.e();
                this.k = e.getSharedPreferences("adaemon_energy_" + a(), 0);
                if (!a2) {
                    return;
                }
                f27494a.set(true);
                com.taobao.adaemon.e.a("APower", "AlarmPower.init success", new Object[0]);
            } catch (Throwable th) {
                com.taobao.adaemon.e.a("APower", "AlarmPower.init error", th, new Object[0]);
            }
        }

        public /* synthetic */ void a(Method method, Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("85fdefa1", new Object[]{this, method, objArr});
            } else if (objArr == null || !"set".equals(method.getName())) {
            } else {
                if (objArr.length != 11) {
                    com.taobao.adaemon.e.b("APower", "arg invalid", "method", method);
                    return;
                }
                if ((objArr[1] instanceof Integer ? ((Integer) objArr[1]).intValue() : -1) != 0) {
                    return;
                }
                this.c++;
            }
        }

        @Override // tb.eoe.c
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.j ? "alarm_c" : "alarm_m";
        }

        @Override // tb.eoe.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (!eoe.a()) {
            } else {
                if (!f27494a.get()) {
                    f();
                }
                com.taobao.adaemon.e.b("APower", "alarm resetMemValue start", Integer.valueOf(this.c), "alarmSetCount");
                this.c = 0;
            }
        }

        @Override // tb.eoe.c
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else if (!eoe.a() || !f27494a.get()) {
            } else {
                e();
                if (this.c == 0) {
                    com.taobao.adaemon.e.b("APower", "record no alarm", new Object[0]);
                    return;
                }
                int i = j().getInt("alarmtimes_t", 0) + this.c;
                j().edit().putInt(c.KEY_DAY, Calendar.getInstance().get(6)).putInt("alarmtimes_t", i).commit();
                com.taobao.adaemon.e.b("APower", "alarm.record end", "totalCount", Integer.valueOf(i));
                this.c = 0;
            }
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else if (!eoe.a() || !f27494a.get()) {
            } else {
                int i = j().getInt(c.KEY_DAY, -1);
                int i2 = Calendar.getInstance().get(6);
                if (i <= 0 || i2 == i) {
                    return;
                }
                ezb.a aVar = new ezb.a("alarm", i2 - i);
                aVar.p = j().getInt("alarmtimes_t", 0);
                if (aVar.p > 0) {
                    aVar.a();
                }
                j().edit().remove("alarmtimes_t").commit();
                com.taobao.adaemon.e.b("APower", "alarm report", "alarmTimes", Integer.valueOf(aVar.p));
            }
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : j.a().H() && l.f();
    }
}
