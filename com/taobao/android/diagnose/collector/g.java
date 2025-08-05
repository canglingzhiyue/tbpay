package com.taobao.android.diagnose.collector;

import android.app.Application;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import com.taobao.tao.log.logger.MetricLogger;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes.dex */
public class g extends f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final com.taobao.android.diagnose.model.b d;
    private long e;
    private com.taobao.android.diagnose.scene.a f;
    private Method g;
    private final com.taobao.android.diagnose.func.a h;

    static {
        kge.a(480005927);
    }

    public static /* synthetic */ void lambda$QVb6u2sVIk4Eq04v37xa3HA9NEc(g gVar, AtomicBoolean atomicBoolean, long j) {
        gVar.a(atomicBoolean, j);
    }

    public g(Application application, com.taobao.android.diagnose.model.a aVar) {
        super(application, aVar);
        this.d = new com.taobao.android.diagnose.model.b();
        this.h = new com.taobao.android.diagnose.func.a(application, aVar);
        aVar.a(this.d);
        this.g = null;
    }

    @Override // com.taobao.android.diagnose.collector.f
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            v.a("RuntimeInfoCollector", "init RuntimeInfoCollector");
            final long e = com.taobao.android.diagnose.config.a.e() * 60;
            if (e < 0) {
                v.d("RuntimeInfoCollector", "Schedule collect is disable!");
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            com.taobao.android.diagnose.common.c.a().a(new Runnable() { // from class: com.taobao.android.diagnose.collector.-$$Lambda$g$QVb6u2sVIk4Eq04v37xa3HA9NEc
                {
                    g.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    g.lambda$QVb6u2sVIk4Eq04v37xa3HA9NEc(g.this, atomicBoolean, e);
                }
            }, 10L, e, TimeUnit.SECONDS);
            if (!com.taobao.android.diagnose.config.a.o || Build.VERSION.SDK_INT < 23) {
                return;
            }
            this.g = com.taobao.android.diagnose.common.f.a(Debug.MemoryInfo.class, "getOtherPrivate", Integer.TYPE);
        } catch (Exception e2) {
            v.a("RuntimeInfoCollector", "init failed: ", e2);
        }
    }

    public /* synthetic */ void a(AtomicBoolean atomicBoolean, long j) {
        IpChange ipChange = $ipChange;
        int i = 3;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46829bdc", new Object[]{this, atomicBoolean, new Long(j)});
            return;
        }
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            i = 1;
        }
        try {
            if (System.currentTimeMillis() - this.e < (j - 1) * 1000) {
                return;
            }
            a(i);
            this.e = System.currentTimeMillis();
            if (i != 1) {
                return;
            }
            this.d.f11714a = this.d.b(com.taobao.android.diagnose.model.b.DALVIK_USED);
        } catch (Exception e) {
            v.a("RuntimeInfoCollector", "init runnable: ", e);
        }
    }

    public void a(com.taobao.android.diagnose.scene.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc45ab9", new Object[]{this, aVar});
            return;
        }
        this.f = aVar;
        this.h.a(aVar);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        b();
        d();
        e();
        MetricLogger.builder(1, i).setTime(System.currentTimeMillis()).setData(this.d.a()).log(this.c);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            c();
        }
    }

    public com.taobao.android.diagnose.model.b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.diagnose.model.b) ipChange.ipc$dispatch("fd0c72dd", new Object[]{this});
        }
        f();
        long b = this.d.b(com.taobao.android.diagnose.model.b.NATIVE_HEAP_USED);
        long maxMemory = Runtime.getRuntime().maxMemory();
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long round = Math.round((freeMemory / maxMemory) * 100.0d);
        this.d.a(maxMemory, freeMemory, round);
        this.h.a(freeMemory, round, b, 0L, 0L);
        return this.d;
    }

    public void d() {
        long availableBlocks;
        long blockSize;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        if (Build.VERSION.SDK_INT >= 18) {
            availableBlocks = statFs.getAvailableBytes();
            blockSize = statFs.getTotalBytes();
        } else {
            availableBlocks = statFs.getAvailableBlocks() * statFs.getBlockSize();
            blockSize = statFs.getBlockSize() * statFs.getBlockCount();
        }
        this.d.c(blockSize, availableBlocks);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0037, code lost:
        if (r0.getIntProperty(6) == 2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0039, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x004f, code lost:
        if (r0.getIntProperty(2) > 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e() {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.diagnose.collector.g.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r9
            java.lang.String r2 = "5a4ca6c"
            r0.ipc$dispatch(r2, r1)
            return
        L12:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L57
            android.app.Application r0 = r9.f11695a
            java.lang.String r1 = "batterymanager"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.os.BatteryManager r0 = (android.os.BatteryManager) r0
            if (r0 != 0) goto L25
            return
        L25:
            r1 = 4
            int r1 = r0.getIntProperty(r1)
            long r4 = (long) r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            r7 = 2
            if (r1 < r6) goto L3b
            r1 = 6
            int r0 = r0.getIntProperty(r1)
            if (r0 != r7) goto L52
        L39:
            r2 = 1
            goto L52
        L3b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r1 < r6) goto L46
            boolean r2 = r0.isCharging()
            goto L52
        L46:
            int r0 = r0.getIntProperty(r7)
            long r0 = (long) r0
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 <= 0) goto L52
            goto L39
        L52:
            com.taobao.android.diagnose.model.b r0 = r9.d
            r0.a(r4, r2)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.diagnose.collector.g.e():void");
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            try {
                Map<String, String> runtimeStats = Debug.getRuntimeStats();
                String str = runtimeStats.get("art.gc.gc-count");
                String str2 = runtimeStats.get("art.gc.gc-time");
                String str3 = runtimeStats.get("art.gc.bytes-allocated");
                String str4 = runtimeStats.get("art.gc.bytes-freed");
                String str5 = runtimeStats.get("art.gc.blocking-gc-count");
                String str6 = runtimeStats.get("art.gc.blocking-gc-time");
                if (str3 != null) {
                    this.d.a(com.taobao.android.diagnose.model.b.GC_ALLOC_SIZE, Long.parseLong(str3));
                }
                if (str4 != null) {
                    this.d.a(com.taobao.android.diagnose.model.b.GC_FREE_SIZE, Long.parseLong(str4));
                }
                if (str != null) {
                    this.d.a(com.taobao.android.diagnose.model.b.GC_COUNT, Long.parseLong(str));
                }
                if (str2 != null) {
                    this.d.a(com.taobao.android.diagnose.model.b.GC_TIME, Long.parseLong(str2));
                }
                if (str5 != null) {
                    this.d.a(com.taobao.android.diagnose.model.b.GC_BLOCK_COUNT, Long.parseLong(str5));
                }
                if (str6 == null) {
                    return;
                }
                this.d.a(com.taobao.android.diagnose.model.b.GC_BLOCK_TIME, Long.parseLong(str6));
            } catch (Exception e) {
                v.a("RuntimeInfoCollector", "collectGCInfo: ", e);
            }
        }
    }
}
