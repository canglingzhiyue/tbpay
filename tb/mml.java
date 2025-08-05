package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.model.b;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.context.c;
import com.taobao.metrickit.event.EventCenter;
import com.taobao.metrickit.utils.a;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import tb.mly;

/* loaded from: classes.dex */
public class mml extends mme<mkt, mks> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final mly f31112a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private long m;

    public static /* synthetic */ Object ipc$super(mml mmlVar, String str, Object... objArr) {
        if (str.hashCode() == 100226930) {
            super.k();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public mml(MetricContext metricContext, mly mlyVar, mly mlyVar2, mkt mktVar) {
        super(metricContext, mlyVar, mktVar);
        this.b = true;
        this.c = false;
        this.d = false;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = 0L;
        this.i = 0L;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.f31112a = mlyVar2;
    }

    @Override // tb.mme
    public long a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938f", new Object[]{this, new Integer(i)})).longValue() : c.a(c.CONFIG_MEMORY_REPEAT_INTERVAL, 10L);
    }

    @Override // tb.mme
    public TimeUnit b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TimeUnit) ipChange.ipc$dispatch("6bc40fd1", new Object[]{this}) : TimeUnit.SECONDS;
    }

    @Override // tb.mme
    public int[] h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("b4130dd5", new Object[]{this}) : new int[]{0};
    }

    @Override // tb.mme
    public int[] i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("b5c7e674", new Object[]{this}) : new int[]{1};
    }

    @Override // tb.mme, tb.mmc
    public int[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a821217c", new Object[]{this}) : new int[]{13, 14, 17};
    }

    @Override // tb.mme
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        super.k();
        if (!this.b) {
            this.c = true;
        }
        this.b = false;
        this.d = true;
    }

    @Override // tb.mmc
    public void a(mks mksVar) {
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ae4423", new Object[]{this, mksVar});
        } else if (mksVar.c() <= 0) {
        } else {
            JSONObject b = b(mksVar);
            JSONObject c = c(mksVar);
            try {
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (!this.d && !a.a(a(), mksVar.a())) {
                a2 = "Period";
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, a2);
                jSONObject.put("memory", b);
                jSONObject.put("gc", c);
                TLog.loge("MetricKit.MemoryMetric", jSONObject.toString());
                this.d = false;
                e(mksVar);
            }
            a2 = EventCenter.a(mksVar.a());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, a2);
            jSONObject2.put("memory", b);
            jSONObject2.put("gc", c);
            TLog.loge("MetricKit.MemoryMetric", jSONObject2.toString());
            this.d = false;
            e(mksVar);
        }
    }

    private JSONObject b(mks mksVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("55960192", new Object[]{this, mksVar});
        }
        mly.a c = e().c();
        long c2 = mksVar.c();
        long e = mksVar.e();
        if (this.g) {
            this.g = false;
            c.a("javaMax", c2);
        }
        float f = c2 > 0 ? ((float) e) / ((float) c2) : 0.0f;
        if (f > 0.9d) {
            if (this.e) {
                this.e = false;
                a(c);
            }
            d().getOuterCallbackScheduler().a(1, e, c2);
            TLog.loge("MetricKit.MemoryMetric", "touchJavaThreshold:", String.format("%.2f", Float.valueOf(f)));
        }
        a(mksVar, c);
        b(mksVar, c);
        c(mksVar, c);
        if (c.b()) {
            c.a();
        }
        return a(f, mksVar);
    }

    private void a(mly.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0260e81", new Object[]{this, aVar});
            return;
        }
        aVar.a("touchJavaThresholdTimes");
        mly e = e();
        mly a2 = e.a("startup_" + MetricContext.getLaunchSession());
        a2.a("touchJavaThreshold_" + SystemClock.uptimeMillis()).c().a("startupDistanceDuration", SystemClock.uptimeMillis() - d().getProcessStartTime()).a("topActivity", d().getCurrActivityName()).a("topFragment", d().getCurrFragmentName()).a("schemaUrl", d().getSchemaUrl());
    }

    private void a(mks mksVar, mly.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2755b87c", new Object[]{this, mksVar, aVar});
            return;
        }
        long a2 = e().a("peakJavaMemoryUsage", -1L);
        long a3 = e().a("peakNativeHeapSize", -1L);
        long a4 = e().a("peakNativeHeapAllocated", -1L);
        long a5 = e().a("peakPss", -1L);
        if (mksVar.g() > c.a(c.CONFIG_NATIVE_MEMORY_THRESHOLD, 1073741824L)) {
            if (this.f) {
                this.f = false;
                int a6 = e().a("touchNativeThresholdTimes", 0);
                aVar.a("touchNativeThresholdTimes");
                TLog.loge("MetricKit.MemoryMetric", "touchNativeThresholdTimes:", String.valueOf(a6 + 1));
            }
            d().getOuterCallbackScheduler().a(2, mksVar.g(), -1L);
            TLog.loge("MetricKit.MemoryMetric", "touchNativeThreshold:", a(mksVar.g()));
        }
        long e = mksVar.e();
        if (a2 < e) {
            aVar.a("peakJavaMemoryUsage", e);
        }
        if (a3 < mksVar.f()) {
            aVar.a("peakNativeHeapSize", mksVar.f());
        }
        if (a4 < mksVar.g()) {
            aVar.a("peakNativeHeapAllocated", mksVar.g());
        }
        if (mksVar.h() <= 0 || a5 >= mksVar.h()) {
            return;
        }
        aVar.a("peakPss", mksVar.h());
    }

    private void b(mks mksVar, mly.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("718751bd", new Object[]{this, mksVar, aVar});
            return;
        }
        if (mksVar.a() == 13) {
            aVar.a("systemOnLowMemoryCount");
        }
        if (mksVar.a() != 14) {
            return;
        }
        aVar.a("systemOnTrimMemoryCount");
        mly a2 = e().a("trimMemory");
        int b = mksVar.b();
        if (b == -1) {
            return;
        }
        a2.c().a(String.valueOf(b));
    }

    private void c(mks mksVar, mly.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb8eafe", new Object[]{this, mksVar, aVar});
        } else if (mksVar.h() <= 0 || mksVar.a() != 17) {
        } else {
            aVar.a("launchInteractivePss", mksVar.h());
        }
    }

    private JSONObject c(mks mksVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d36dbd93", new Object[]{this, mksVar});
        }
        if (this.c) {
            this.c = false;
            d(mksVar);
            return new JSONObject();
        }
        long i = mksVar.i() - this.h;
        long j = mksVar.j() - this.i;
        long k = mksVar.k() - this.j;
        long l = mksVar.l() - this.k;
        long m = mksVar.m() - this.l;
        long n = mksVar.n() - this.m;
        mly.a c = this.f31112a.c();
        c.a("gc-count", this.f31112a.a("gc-count", 0L) + i).a("gc-time", this.f31112a.a("gc-time", 0L) + j).a("bytes-allocated", this.f31112a.a("bytes-allocated", 0L) + k).a("bytes-freed", this.f31112a.a("bytes-freed", 0L) + l).a("blocking-gc-count", this.f31112a.a("blocking-gc-count", 0L) + m).a("blocking-gc-time", this.f31112a.a("blocking-gc-time", 0L) + n).a("gcCollectTimes", this.f31112a.a("gcCollectTimes", 0L) + 1);
        c.a("gc-count-max", Math.max(this.f31112a.a("gc-count-max", 0L), i)).a("gc-time-max", Math.max(this.f31112a.a("gc-time-max", 0L), j)).a("bytes-allocated-max", Math.max(this.f31112a.a("bytes-allocated-max", 0L), k)).a("bytes-freed-max", Math.max(this.f31112a.a("bytes-freed-max", 0L), l)).a("blocking-gc-count-max", Math.max(this.f31112a.a("blocking-gc-count-max", 0L), m)).a("blocking-gc-time-max", Math.max(this.f31112a.a("blocking-gc-time-max", 0L), n));
        d(mksVar);
        if (c.b()) {
            c.a();
        }
        return a(i, j, k, l, m, n);
    }

    private void d(mks mksVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03757a6", new Object[]{this, mksVar});
            return;
        }
        this.h = mksVar.i();
        this.i = mksVar.j();
        this.j = mksVar.k();
        this.k = mksVar.l();
        this.l = mksVar.m();
        this.m = mksVar.n();
    }

    private JSONObject a(float f, mks mksVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("30f31981", new Object[]{this, new Float(f), mksVar});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("javaMax", a(mksVar.c()));
            jSONObject.put("javaTotal", a(mksVar.d()));
            jSONObject.put("javaUsed", a(mksVar.e()));
            jSONObject.put("javaProportion", String.format("%.2f", Float.valueOf(f)));
            jSONObject.put("nativeHeapSize", a(mksVar.f()));
            jSONObject.put("nativeHeapAllocatedSize", a(mksVar.g()));
            jSONObject.put("pss", a(mksVar.h()));
            JSONObject jSONObject2 = new JSONObject();
            Map<String, Long> o = mksVar.o();
            for (Map.Entry<String, Long> entry : o.entrySet()) {
                jSONObject2.put(entry.getKey(), a(entry.getValue().longValue()));
            }
            if (o.size() > 0) {
                jSONObject2.put(b.GL_DEV_MEM, a(mksVar.p()));
                jSONObject2.put(b.GRAPHICS_MEM, a(mksVar.q()));
                jSONObject2.put(b.GL_MEM, a(mksVar.r()));
            }
            jSONObject.put("memoryInfo", jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    private JSONObject a(long j, long j2, long j3, long j4, long j5, long j6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("29e114d6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), new Long(j6)});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("art.gc.gc-count", j);
            jSONObject.put("art.gc.gc-time", j2);
            jSONObject.put("art.gc.bytes-allocated", j3);
            jSONObject.put("art.gc.bytes-freed", j4);
            jSONObject.put("art.gc.blocking-gc-count", j5);
            jSONObject.put("art.gc.blocking-gc-time", j6);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    private void e(mks mksVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeba5e27", new Object[]{this, mksVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("dispatchNanos", Long.valueOf(System.nanoTime()));
        hashMap.put("javaUsed", Long.valueOf(mksVar.e()));
        hashMap.put("nativeHeapSize", Long.valueOf(mksVar.f()));
        hashMap.put("nativeHeapAllocatedSize", Long.valueOf(mksVar.g()));
        hashMap.put("pss", Long.valueOf(mksVar.h()));
        hashMap.put("javaTotal", Long.valueOf(mksVar.d()));
        hashMap.put("javaMax", Long.valueOf(mksVar.c()));
        hashMap.put("art.gc.gc-count", Long.valueOf(mksVar.i()));
        hashMap.put("art.gc.gc-time", Long.valueOf(mksVar.j()));
        hashMap.put("art.gc.bytes-allocated", Long.valueOf(mksVar.k()));
        hashMap.put("art.gc.bytes-freed", Long.valueOf(mksVar.l()));
        hashMap.put("art.gc.blocking-gc-count", Long.valueOf(mksVar.m()));
        hashMap.put("art.gc.blocking-gc-time", Long.valueOf(mksVar.n()));
        EventCenter.a().a(this).a(15, hashMap);
    }

    private static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        return (j / 1048576) + "M";
    }
}
