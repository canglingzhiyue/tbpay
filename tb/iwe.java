package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.os.StatFs;
import anet.channel.util.ALog;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.i;
import com.taobao.android.diagnose.model.b;
import com.taobao.falco.FalcoEnvironment;
import com.taobao.metrickit.event.EventCenter;
import com.taobao.metrickit.event.d;
import com.taobao.monitor.impl.trace.d;
import com.taobao.monitor.impl.trace.m;
import java.io.File;
import java.util.Map;

/* loaded from: classes7.dex */
public class iwe implements d, d.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FalcoEnvironment f29365a;
    private volatile a b;
    private volatile boolean c;
    private boolean d;

    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f29371a = tmt.a();
        public final qrj b;
        public final spn c;
        public final tes d;
        public final qri e;

        public a(qrj qrjVar, spn spnVar, tes tesVar, qri qriVar) {
            this.b = qrjVar;
            this.c = spnVar;
            this.d = tesVar;
            this.e = qriVar;
        }
    }

    private static int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{new Integer(i), new Integer(i2)})).intValue() : i <= 0 ? i : i2 == 100 ? 2 : 1;
    }

    @Override // com.taobao.monitor.impl.trace.d.a
    public void a(String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526bd3", new Object[]{this, str, new Integer(i), new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.a
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        }
    }

    public static /* synthetic */ void a(iwe iweVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7d9e81", new Object[]{iweVar});
        } else {
            iweVar.e();
        }
    }

    public static /* synthetic */ void a(iwe iweVar, float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e041dff", new Object[]{iweVar, new Float(f), new Integer(i), new Integer(i2)});
        } else {
            iweVar.b(f, i, i2);
        }
    }

    public static /* synthetic */ void a(iwe iweVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a54ae4", new Object[]{iweVar, map});
        } else {
            iweVar.a(map);
        }
    }

    public static /* synthetic */ void a(iwe iweVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e136e473", new Object[]{iweVar, new Boolean(z)});
        } else {
            iweVar.b(z);
        }
    }

    public iwe(FalcoEnvironment falcoEnvironment) {
        qrj qrjVar = new qrj();
        qrjVar.f33049a = Runtime.getRuntime().availableProcessors();
        this.f29365a = falcoEnvironment;
        this.b = new a(qrjVar, new spn(), new tes(), new qri());
    }

    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.d = z;
        dit.g(new Runnable() { // from class: tb.iwe.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    iwe.a(iwe.this);
                }
            }
        });
        if (z2) {
            EventCenter a2 = EventCenter.a();
            if (a2 != null) {
                a2.a(81, this);
                a2.a(92, this);
                a2.a(93, this);
            } else {
                ALog.e("falco.env", "[init] register cpu/power listener error", null, new Object[0]);
            }
        }
        m a3 = com.taobao.monitor.impl.common.a.a(com.taobao.monitor.impl.common.a.BATTERY_DISPATCHER);
        if (a3 != null) {
            a3.a(this);
        } else {
            ALog.e("falco.env", "[init] register battery listener error", null, new Object[0]);
        }
    }

    public qrj a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qrj) ipChange.ipc$dispatch("f09bbd5", new Object[]{this}) : this.b.b;
    }

    public spn b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (spn) ipChange.ipc$dispatch("16bc42ec", new Object[]{this}) : this.b.c;
    }

    public tes c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tes) ipChange.ipc$dispatch("1e6e33fa", new Object[]{this}) : this.b.d;
    }

    public qri d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qri) ipChange.ipc$dispatch("261eabd3", new Object[]{this}) : this.b.e;
    }

    @Override // com.taobao.metrickit.event.d
    public void a(int i, final Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
        } else if (i == 81) {
            dit.g(new Runnable() { // from class: tb.iwe.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        iwe.a(iwe.this, map);
                    }
                }
            });
        } else if (i == 92) {
            dit.g(new Runnable() { // from class: tb.iwe.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        iwe.a(iwe.this, true);
                    }
                }
            });
        } else if (i != 93) {
        } else {
            dit.g(new Runnable() { // from class: tb.iwe.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        iwe.a(iwe.this, false);
                    }
                }
            });
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.a
    public void a(final float f, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ef32b8", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
        } else {
            dit.g(new Runnable() { // from class: tb.iwe.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        iwe.a(iwe.this, f, i, i2);
                    }
                }
            });
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        a aVar = new a(this.b.b, f(), g(), h());
        a(aVar, "");
        FalcoEnvironment falcoEnvironment = this.f29365a;
        falcoEnvironment.a("CpuInfo Init|" + aVar.b);
        FalcoEnvironment falcoEnvironment2 = this.f29365a;
        falcoEnvironment2.a("MemoryInfo Init|" + aVar.c);
        FalcoEnvironment falcoEnvironment3 = this.f29365a;
        falcoEnvironment3.a("StorageInfo Init|" + aVar.d);
        FalcoEnvironment falcoEnvironment4 = this.f29365a;
        falcoEnvironment4.a("BatteryInfo Init|" + aVar.e);
    }

    private void a(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        a aVar = this.b;
        qrj qrjVar = aVar.b;
        qrj qrjVar2 = new qrj();
        qrjVar2.f33049a = qrjVar.f33049a;
        if (map != null) {
            qrjVar2.b = a(map.get("wholeCpuLoadRate"), -1.0f).floatValue();
            qrjVar2.c = a(map.get("processLoadRate"), -1.0f).floatValue();
        }
        a aVar2 = new a(qrjVar2, f(), aVar.d, aVar.e);
        a(aVar2, "");
        FalcoEnvironment falcoEnvironment = this.f29365a;
        falcoEnvironment.a("CpuInfo Update|" + aVar2.b);
        FalcoEnvironment falcoEnvironment2 = this.f29365a;
        falcoEnvironment2.a("MemoryInfo Update|" + aVar2.c);
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        a aVar = this.b;
        qri qriVar = aVar.e;
        qri qriVar2 = new qri();
        qriVar2.f33048a = qriVar.f33048a;
        qriVar2.b = qriVar.b;
        qriVar2.c = z ? 1 : 0;
        qriVar2.d = qriVar.d;
        a aVar2 = new a(aVar.b, aVar.c, aVar.d, qriVar2);
        a(aVar2, "BatteryInfo Update|lowPowerMode=" + qriVar2.c);
    }

    private void b(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd05f97", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
            return;
        }
        a aVar = this.b;
        qri qriVar = aVar.e;
        int a2 = a(i, i2);
        int i3 = (int) (f * 10.0f);
        if (a2 == qriVar.f33048a && i2 == qriVar.b && i3 == qriVar.d) {
            return;
        }
        qri qriVar2 = new qri();
        qriVar2.f33048a = a2;
        qriVar2.b = i2;
        qriVar2.c = qriVar.c;
        qriVar2.d = i3;
        a aVar2 = new a(aVar.b, aVar.c, aVar.d, qriVar2);
        a(aVar2, "BatteryInfo Update|" + qriVar2);
    }

    private static spn f() {
        ActivityManager activityManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spn) ipChange.ipc$dispatch("3582d868", new Object[0]);
        }
        spn spnVar = new spn();
        Context a2 = i.a();
        if (a2 != null && (activityManager = (ActivityManager) a2.getSystemService("activity")) != null) {
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                spnVar.f33815a = memoryInfo.totalMem >> 20;
                spnVar.b = memoryInfo.availMem >> 20;
                spnVar.d = memoryInfo.lowMemory ? 1 : 0;
            } catch (Exception e) {
                ALog.e("falco.env", "[obtainMemoryInfo] error", null, e, new Object[0]);
            }
            Runtime runtime = Runtime.getRuntime();
            spnVar.c = (runtime.totalMemory() - runtime.freeMemory()) >> 20;
        }
        return spnVar;
    }

    private static tes g() {
        File parentFile;
        long blockCount;
        long availableBlocks;
        long blockSize;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tes) ipChange.ipc$dispatch("3d34c976", new Object[0]);
        }
        tes tesVar = new tes();
        Context a2 = i.a();
        if (a2 != null && (parentFile = a2.getCacheDir().getParentFile()) != null) {
            try {
                StatFs statFs = new StatFs(parentFile.getAbsolutePath());
                if (Build.VERSION.SDK_INT >= 18) {
                    blockCount = statFs.getBlockCountLong() * statFs.getBlockSizeLong();
                    availableBlocks = statFs.getAvailableBlocksLong();
                    blockSize = statFs.getBlockSizeLong();
                } else {
                    blockCount = statFs.getBlockCount() * statFs.getBlockSize();
                    availableBlocks = statFs.getAvailableBlocks();
                    blockSize = statFs.getBlockSize();
                }
                long j = availableBlocks * blockSize;
                tesVar.f34059a = blockCount >> 20;
                tesVar.b = j >> 20;
            } catch (Exception e) {
                ALog.e("falco.env", "[obtainStorageInfo] error", null, e, new Object[0]);
            }
        }
        return tesVar;
    }

    private static qri h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qri) ipChange.ipc$dispatch("44e5414f", new Object[0]);
        }
        qri qriVar = new qri();
        qriVar.c = i();
        Context a2 = i.a();
        if (a2 != null) {
            try {
                a(qriVar, a2.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
            } catch (Exception e) {
                ALog.e("falco.env", "[obtainBatteryInfo] error", null, e, new Object[0]);
            }
        }
        return qriVar;
    }

    private static int i() {
        Context a2;
        PowerManager powerManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[0])).intValue();
        }
        if (Build.VERSION.SDK_INT < 21 || (a2 = i.a()) == null || (powerManager = (PowerManager) a2.getSystemService("power")) == null) {
            return -1;
        }
        return powerManager.isPowerSaveMode() ? 1 : 0;
    }

    private static void a(qri qriVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2feff72d", new Object[]{qriVar, intent});
        } else if (intent == null) {
        } else {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            int intExtra3 = intent.getIntExtra("temperature", -1);
            int intExtra4 = intent.getIntExtra("plugged", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                qriVar.b = (int) ((intExtra / intExtra2) * 100.0f);
            }
            if (intExtra3 != -1) {
                qriVar.d = intExtra3;
            }
            qriVar.f33048a = a(intExtra4, qriVar.b);
        }
    }

    private void a(a aVar, String str) {
        String str2;
        String str3;
        String str4;
        iwe iweVar = this;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02dd32e", new Object[]{iweVar, aVar, str});
            return;
        }
        iweVar.b = aVar;
        if (iweVar.d) {
            if (!iweVar.c) {
                iweVar.c = true;
                MeasureSet create = MeasureSet.create();
                create.addMeasure("cpuCores");
                create.addMeasure("deviceCpuUsage");
                create.addMeasure("appCpuUsage");
                create.addMeasure("memTotal");
                create.addMeasure("memFree");
                create.addMeasure("javaMemUsage");
                create.addMeasure("isLowMemory");
                create.addMeasure("diskTotal");
                create.addMeasure("diskFree");
                create.addMeasure("batteryState");
                create.addMeasure(b.BATTERY_CAPACITY);
                create.addMeasure("lowPowerMode");
                create.addMeasure("temperature");
                str2 = "cpuCores";
                DimensionSet create2 = DimensionSet.create();
                create2.addDimension("falcoId");
                str3 = "falcoId";
                str4 = "temperature";
                AppMonitor.register("falco", "falco_sysload", create, create2, true);
            } else {
                str2 = "cpuCores";
                str3 = "falcoId";
                str4 = "temperature";
            }
            MeasureValueSet create3 = MeasureValueSet.create();
            create3.setValue(str2, aVar.b.f33049a);
            create3.setValue("deviceCpuUsage", aVar.b.b);
            create3.setValue("appCpuUsage", aVar.b.c);
            create3.setValue("memTotal", aVar.c.f33815a);
            create3.setValue("memFree", aVar.c.b);
            create3.setValue("javaMemUsage", aVar.c.c);
            create3.setValue("isLowMemory", aVar.c.d);
            create3.setValue("diskTotal", aVar.d.f34059a);
            create3.setValue("diskFree", aVar.d.b);
            create3.setValue("batteryState", aVar.e.f33048a);
            create3.setValue(b.BATTERY_CAPACITY, aVar.e.b);
            create3.setValue("lowPowerMode", aVar.e.c);
            create3.setValue(str4, aVar.e.d);
            DimensionValueSet create4 = DimensionValueSet.create();
            create4.setValue(str3, aVar.f29371a);
            AppMonitor.Stat.commit("falco", "falco_sysload", create4, create3);
            iweVar = this;
            iweVar.f29365a.a(FalcoEnvironment.Category.SYSTEM_LOAD, aVar.f29371a);
        }
        iweVar.f29365a.a(str);
    }

    private static Float a(Object obj, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("5f6c5a45", new Object[]{obj, new Float(f)});
        }
        if (obj instanceof Float) {
            return (Float) obj;
        }
        return Float.valueOf(f);
    }
}
