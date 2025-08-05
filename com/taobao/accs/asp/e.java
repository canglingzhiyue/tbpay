package com.taobao.accs.asp;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import com.taobao.orange.OConstant;
import tb.kge;
import tb.nfc;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f8188a;

    static {
        kge.a(-2038717205);
        try {
            Class.forName(OConstant.REFLECT_APPMONITOR);
            f8188a = true;
        } catch (Exception unused) {
            f8188a = false;
        }
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f8188a;
    }

    /* loaded from: classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static boolean e;

        /* renamed from: a  reason: collision with root package name */
        public String f8191a;
        public int b;
        public long c;
        public int d;

        public static /* synthetic */ boolean a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7826a2d5", new Object[]{bVar})).booleanValue() : bVar.b();
        }

        static {
            kge.a(-1466657321);
            e = false;
        }

        public b(String str, int i) {
            this.f8191a = str;
            this.b = i;
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (!e.a()) {
                return false;
            }
            synchronized (this) {
                if (e) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("name");
                    create.addDimension("type");
                    create.addDimension("result");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("costTime");
                    AppMonitor.register("APreferences", nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, create2, create, true);
                    e = true;
                } catch (Exception e2) {
                    ALog.e("StatMonitor", "[Performance][register]register fail.", e2, new Object[0]);
                }
                return e;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!e.a()) {
            } else {
                com.taobao.accs.asp.a.b(new Runnable() { // from class: com.taobao.accs.asp.e.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!b.a(b.this)) {
                        } else {
                            ALog.i("StatMonitor", "[commit]", "Performance", b.this.toString());
                            try {
                                DimensionValueSet create = DimensionValueSet.create();
                                create.setValue("name", b.this.f8191a);
                                create.setValue("type", String.valueOf(b.this.b));
                                create.setValue("result", String.valueOf(b.this.d));
                                MeasureValueSet create2 = MeasureValueSet.create();
                                create2.setValue("costTime", b.this.c);
                                AppMonitor.Stat.commit("APreferences", nfc.PHA_MONITOR_MODULE_POINT_PERFORMANCE, create, create2);
                            } catch (Exception e2) {
                                ALog.e("StatMonitor", "[Performance][commit]commit fail.", e2, new Object[0]);
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
            return "[Performance]name=" + this.f8191a + ",type=" + this.b + ",result=" + this.d + ",costTime=" + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static boolean d;

        /* renamed from: a  reason: collision with root package name */
        public final int f8189a;
        public int b;
        public long c;

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("78262e76", new Object[]{aVar})).booleanValue() : aVar.b();
        }

        static {
            kge.a(1131681207);
            d = false;
        }

        public a(int i) {
            this.f8189a = i;
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (!e.a()) {
                return false;
            }
            synchronized (this) {
                if (d) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("type");
                    create.addDimension("result");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("costTime");
                    AppMonitor.register("APreferences", "ipcStat", create2, create, true);
                    d = true;
                } catch (Exception e) {
                    ALog.e("StatMonitor", "[IpcStat][register]register fail.", e, new Object[0]);
                }
                return d;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!e.a()) {
            } else {
                com.taobao.accs.asp.a.b(new Runnable() { // from class: com.taobao.accs.asp.e.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!a.a(a.this)) {
                        } else {
                            ALog.i("StatMonitor", "[commit]", "IpcStat", a.this.toString());
                            try {
                                DimensionValueSet create = DimensionValueSet.create();
                                create.setValue("type", String.valueOf(a.this.f8189a));
                                create.setValue("result", String.valueOf(a.this.b));
                                MeasureValueSet create2 = MeasureValueSet.create();
                                create2.setValue("costTime", a.this.c);
                                AppMonitor.Stat.commit("APreferences", "ipcStat", create, create2);
                            } catch (Exception e) {
                                ALog.e("StatMonitor", "[IpcStat][commit]commit fail.", e, new Object[0]);
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
            return "[IpcStat]type=" + this.f8189a + ",result=" + this.b + ",costTime=" + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static boolean f;

        /* renamed from: a  reason: collision with root package name */
        public String f8193a;
        public String b;
        public String c;
        public long d;
        public long e;

        public static /* synthetic */ boolean a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("78271734", new Object[]{cVar})).booleanValue() : cVar.b();
        }

        static {
            kge.a(115754551);
            f = false;
        }

        public c(String str) {
            this.f8193a = str;
        }

        private boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            if (!e.a()) {
                return false;
            }
            synchronized (this) {
                if (f) {
                    return true;
                }
                try {
                    DimensionSet create = DimensionSet.create();
                    create.addDimension("name");
                    create.addDimension("key");
                    create.addDimension("value");
                    MeasureSet create2 = MeasureSet.create();
                    create2.addMeasure("keySize");
                    create2.addMeasure("valueSize");
                    AppMonitor.register("APreferences", "sizeAlarm", create2, create, true);
                    f = true;
                } catch (Exception e) {
                    ALog.e("StatMonitor", "[IpcStat][register]register fail.", e, new Object[0]);
                }
                return f;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (!e.a()) {
            } else {
                com.taobao.accs.asp.a.b(new Runnable() { // from class: com.taobao.accs.asp.e.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!c.a(c.this)) {
                        } else {
                            ALog.i("StatMonitor", "[commit]", "SizeAlarm", c.this.toString());
                            try {
                                DimensionValueSet create = DimensionValueSet.create();
                                create.setValue("name", c.this.f8193a);
                                create.setValue("key", c.this.b);
                                create.setValue("value", c.this.c);
                                MeasureValueSet create2 = MeasureValueSet.create();
                                create2.setValue("keySize", c.this.d);
                                create2.setValue("valueSize", c.this.e);
                                AppMonitor.Stat.commit("APreferences", "sizeAlarm", create, create2);
                            } catch (Exception e) {
                                ALog.e("StatMonitor", "[IpcStat][commit]commit fail.", e, new Object[0]);
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
            return "[SizeAlarm]name=" + this.f8193a + ",key=" + this.b + ",value=" + this.c + ",keySize=" + this.d + ",valueSize=" + this.e;
        }
    }
}
