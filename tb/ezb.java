package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.e;
import com.taobao.adaemon.k;
import com.taobao.adaemon.l;

/* loaded from: classes.dex */
public class ezb extends k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1183432664);
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : g;
    }

    public static /* synthetic */ boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : g;
    }

    public static /* synthetic */ boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : g;
    }

    public static /* synthetic */ boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : g;
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static boolean l;

        /* renamed from: a  reason: collision with root package name */
        public String f27669a;
        public int b;
        public long c;
        public long d;
        public long e;
        public long f;
        public long g;
        public long h;
        public long i;
        public int j;
        public int k;
        public String m;
        public long n;
        public int o;
        public int p;
        public String q;

        static {
            kge.a(1384656733);
            l = false;
        }

        public a(String str, int i) {
            this.f27669a = str;
            this.b = i;
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (!ezb.b()) {
                return false;
            }
            synchronized (this) {
                if (l) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("type");
                    create.addDimension("subType");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("daysApart");
                    create2.addMeasure("uTimeMain");
                    create2.addMeasure("sTimeMain");
                    create2.addMeasure("uTimeChannel");
                    create2.addMeasure("sTimeChannel");
                    create2.addMeasure("rxBytes");
                    create2.addMeasure("txBytes");
                    create2.addMeasure("sensorDuration");
                    create2.addMeasure("wifiscan");
                    create2.addMeasure("wifiquery");
                    create2.addMeasure("wlockTime");
                    create2.addMeasure("wlockTimes");
                    create2.addMeasure("alarmTimes");
                    AppMonitor.register(k.MODULE_NAME, "PowerStat", create2, create, true);
                    l = true;
                } catch (Exception unused) {
                }
                return l;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!ezb.c() || !b()) {
            } else {
                try {
                    DimensionValueSet create = DimensionValueSet.create();
                    create.setValue("type", this.f27669a);
                    create.setValue("subType", this.m);
                    MeasureValueSet create2 = MeasureValueSet.create();
                    create2.setValue("daysApart", this.b);
                    create2.setValue("uTimeMain", this.c);
                    create2.setValue("sTimeMain", this.d);
                    create2.setValue("uTimeChannel", this.e);
                    create2.setValue("sTimeChannel", this.f);
                    create2.setValue("rxBytes", this.g);
                    create2.setValue("txBytes", this.h);
                    create2.setValue("sensorDuration", this.i);
                    create2.setValue("wifiscan", this.j);
                    create2.setValue("wifiquery", this.k);
                    create2.setValue("wlockTime", this.n);
                    create2.setValue("wlockTimes", this.o);
                    create2.setValue("alarmTimes", this.p);
                    AppMonitor.Stat.commit(k.MODULE_NAME, "PowerStat", create, create2);
                } catch (Exception e) {
                    e.a("PowerStatMonitor", "[PowerStat]commit fail.", e, new Object[0]);
                }
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "PowerStat{type='" + this.f27669a + "', subType='" + this.m + "', daysApart=" + this.b + ", uTimeMain=" + this.c + ", sTimeMain=" + this.d + ", uTimeChannel=" + this.e + ", sTimeChannel=" + this.f + ", rxBytes=" + this.g + ", txBytes=" + this.h + ", sensorDuration=" + this.i + ", wifiscan=" + this.j + ", wifiquery=" + this.k + ", wlockTime=" + this.n + ", wlockTimes=" + this.o + ", alarmTimes=" + this.p + ", dumpInfo='" + this.q + "'}";
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static boolean e;

        /* renamed from: a  reason: collision with root package name */
        public String f27670a;
        public String b;
        public String c;
        public String d;

        static {
            kge.a(1681969869);
            e = false;
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (!ezb.d()) {
                return false;
            }
            synchronized (this) {
                if (e) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE);
                    create.addDimension("type");
                    create.addDimension("snapshot_cpu");
                    create.addDimension("snapshot_net");
                    create.addDimension("snapshot_wlock");
                    create.addDimension("snapshot_sensor");
                    create.addDimension("snapshot_scan");
                    create.addDimension("dumpInfo");
                    AppMonitor.register(k.MODULE_NAME, "PowerBadCase", MeasureSet.create(), create, true);
                    e = true;
                } catch (Exception unused) {
                }
                return e;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!ezb.e() || !b() || l.a(l.e(), "power", "bad_day", "bad_times", null) > 0) {
            } else {
                try {
                    DimensionValueSet create = DimensionValueSet.create();
                    create.setValue("type", this.b);
                    create.setValue(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, this.f27670a);
                    create.setValue("snapshot_cpu", this.c);
                    create.setValue("dumpInfo", this.d);
                    AppMonitor.Stat.commit(k.MODULE_NAME, "PowerBadCase", create, MeasureValueSet.create());
                    l.a(l.e(), "bad_day", "bad_times", null);
                    e.b("PowerStatMonitor", "[BadCaseReport]", "commit", "type", this.b, MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, this.f27670a, "cpuSnapshot", this.c, "dump", this.d);
                } catch (Exception e2) {
                    e.a("PowerStatMonitor", "[BadCaseReport]commit fail.", e2, new Object[0]);
                }
            }
        }
    }
}
