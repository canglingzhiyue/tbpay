package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.context.c;
import com.taobao.metrickit.event.EventCenter;
import com.taobao.metrickit.utils.e;
import com.taobao.monitor.performance.cpu.g;
import com.taobao.tao.log.TLog;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import tb.mly;

/* loaded from: classes.dex */
public class mmj extends mme<mkr, mkq> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f31111a;
    private final e<mkq> b;
    private boolean c;

    public static /* synthetic */ Object ipc$super(mmj mmjVar, String str, Object... objArr) {
        if (str.hashCode() == 101150451) {
            super.l();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public mmj(MetricContext metricContext, mly mlyVar, mkr mkrVar) {
        super(metricContext, mlyVar, mkrVar);
        this.f31111a = (int) (c.a(c.CONFIG_FG_CPU_ABNORMAL_INTERVAL, 180L) / c.a(c.CONFIG_FG_CPU_COLLECT_INTERVAL, 10L));
        this.b = new e<>(Math.max(this.f31111a, 1));
        this.c = true;
    }

    @Override // tb.mme
    public long a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938f", new Object[]{this, new Integer(i)})).longValue();
        }
        if (i == 1) {
            return c.a(c.CONFIG_BG_CPU_COLLECT_INTERVAL, 60L);
        }
        return c.a(c.CONFIG_FG_CPU_COLLECT_INTERVAL, 10L);
    }

    @Override // tb.mme
    public TimeUnit b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TimeUnit) ipChange.ipc$dispatch("6bc40fd1", new Object[]{this}) : TimeUnit.SECONDS;
    }

    @Override // tb.mme
    public int[] h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("b4130dd5", new Object[]{this}) : new int[]{0, 1};
    }

    @Override // tb.mme
    public int[] i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("b5c7e674", new Object[]{this}) : new int[]{1, 0};
    }

    @Override // tb.mme
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        super.l();
        this.b.c();
    }

    @Override // tb.mmc
    public void a(mkq mkqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ad5b65", new Object[]{this, mkqVar});
        } else if (mkqVar.d() == 0) {
        } else {
            b(mkqVar);
            mkq a2 = this.b.a();
            a(a2, mkqVar);
            float b = b(a2, mkqVar);
            float c = c(a2, mkqVar);
            float d = d(a2, mkqVar);
            Map<String, Float> f = f(a2, mkqVar);
            a(c);
            boolean e = e(this.b.a(), mkqVar);
            a(e, a2, mkqVar);
            a(f);
            b(f);
            a(mkqVar, b, c, d, f);
            b(mkqVar, b, c, d);
            a(mkqVar.a(), a(e, c, mkqVar));
            if (e) {
                a("50sOver80", this.b.a(4), mkqVar, 0.8f);
                a("90sOver50", this.b.a(8), mkqVar, 0.5f);
            }
            this.b.a((e<mkq>) mkqVar);
            if (!e().c().b()) {
                return;
            }
            e().c().a();
        }
    }

    private void b(mkq mkqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33061e6", new Object[]{this, mkqVar});
            return;
        }
        mly.a c = e().c();
        long c2 = mkqVar.c();
        if (!this.c || c2 <= 0) {
            return;
        }
        c.a("CPUJiffyHz", c2);
        this.c = false;
    }

    private void a(mkq mkqVar, mkq mkqVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac1fd62", new Object[]{this, mkqVar, mkqVar2});
        } else if (mkqVar == null || !mkqVar.h() || !mkqVar2.h()) {
        } else {
            com.taobao.monitor.performance.cpu.e.a(mkqVar.f(), mkqVar2.f());
            com.taobao.monitor.performance.cpu.e.a(mkqVar.g(), mkqVar2.g());
        }
    }

    private float b(mkq mkqVar, mkq mkqVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d75af2d3", new Object[]{this, mkqVar, mkqVar2})).floatValue();
        }
        if (mkqVar == null || !mkqVar.h() || !mkqVar2.h()) {
            return 0.0f;
        }
        long e = mkqVar2.e() - mkqVar.e();
        long d = mkqVar2.d() - mkqVar.d();
        if (d > 0) {
            return (((float) (d - e)) * 1.0f) / ((float) d);
        }
        return 0.0f;
    }

    private float c(mkq mkqVar, mkq mkqVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3f3e854", new Object[]{this, mkqVar, mkqVar2})).floatValue();
        }
        if (mkqVar == null || !mkqVar.h() || !mkqVar2.h()) {
            return 0.0f;
        }
        long d = mkqVar2.d() - mkqVar.d();
        long j = ((mkqVar2.f().g + mkqVar2.f().f) - mkqVar.f().g) - mkqVar.f().f;
        if (d > 0) {
            return (((1000.0f / ((float) com.taobao.monitor.performance.cpu.e.a())) * ((float) j)) * 1.0f) / ((float) d);
        }
        return 0.0f;
    }

    private float d(mkq mkqVar, mkq mkqVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f08cddd5", new Object[]{this, mkqVar, mkqVar2})).floatValue();
        }
        if (mkqVar == null || !mkqVar.h() || !mkqVar2.h()) {
            return 0.0f;
        }
        long d = mkqVar2.d() - mkqVar.d();
        long j = ((mkqVar2.g().g + mkqVar2.g().f) - mkqVar.g().g) - mkqVar.g().f;
        if (d > 0) {
            return (((1000.0f / ((float) com.taobao.monitor.performance.cpu.e.a())) * ((float) j)) * 1.0f) / ((float) d);
        }
        return 0.0f;
    }

    private Map<String, Float> f(mkq mkqVar, mkq mkqVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1aefbadc", new Object[]{this, mkqVar, mkqVar2});
        }
        if (mkqVar == null || !mkqVar.h() || !mkqVar2.h()) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        long d = mkqVar2.d() - mkqVar.d();
        for (Map.Entry<String, g> entry : mkqVar2.k().entrySet()) {
            g gVar = mkqVar.k().get(entry.getKey());
            g value = entry.getValue();
            if (gVar != null && value != null) {
                hashMap.put(entry.getKey(), Float.valueOf(d <= 0 ? 0.0f : mkqVar.i() * (((1000.0f / ((float) com.taobao.monitor.performance.cpu.e.a())) * ((float) (((mkqVar2.g().g + mkqVar2.g().f) - mkqVar.g().g) - mkqVar.g().f))) / ((float) d))));
            }
        }
        return hashMap;
    }

    private void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (f <= 0.8d) {
        } else {
            e().c().a("highProcessLoadCount");
        }
    }

    private boolean e(mkq mkqVar, mkq mkqVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd25d36a", new Object[]{this, mkqVar, mkqVar2})).booleanValue();
        }
        if (mkqVar != null && mkqVar.a() == mkqVar2.a() && mkqVar2.a() == 0) {
            return true;
        }
        if ((mkqVar != null && mkqVar.a() == mkqVar2.a() && mkqVar2.a() == 1) || mkqVar2.a() == 0) {
            return false;
        }
        if (mkqVar2.a() == 1) {
        }
        return true;
    }

    private void a(boolean z, mkq mkqVar, mkq mkqVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe70dc66", new Object[]{this, new Boolean(z), mkqVar, mkqVar2});
            return;
        }
        if (mkqVar2.f() != null) {
            e().c().a("cumulativeCPUProcessJiffy", mkqVar2.f().a());
        }
        if (mkqVar2.g() != null) {
            e().c().a("cumulativeCPUMainThreadJiffy", mkqVar2.g().a());
        }
        if (mkqVar2.f() != null && mkqVar != null && mkqVar.f() != null) {
            e().c().b(z ? "cumulativeCPUForegroundProcessJiffy" : "cumulativeCPUBackgroundProcessJiffy", mkqVar2.f().a() - mkqVar.f().a()).b(z ? "cumulativeCPUForegroundAllocationMs" : "cumulativeCPUBackgroundAllocationMs", mkqVar2.d() - mkqVar.d());
        }
        e().c().a("lastRecordTime", SystemClock.uptimeMillis());
        boolean a2 = mkqVar2.b().a(a(mkqVar2.a()) * 1000);
        if (mkqVar2.f() != null && mkqVar != null && mkqVar.f() != null && !a2) {
            long a3 = mkqVar2.f().a() - mkqVar.f().a();
            long d = mkqVar2.d() - mkqVar.d();
            e().a(mkqVar2.b().a()).c().b("cumulativeCPUProcessJiffy", a3).b("cumulativeCPUAllocationMs", d);
            e().a(mkqVar2.b().a()).a(mkqVar2.b().b()).c().b("cumulativeCPUProcessJiffy", a3).b("cumulativeCPUAllocationMs", d);
        }
        if (!a2) {
            return;
        }
        TLog.loge("MetricKit.CpuLoadMetric", "isSkippedScroll=true");
    }

    private void a(Map<String, Float> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        mly.a c = e().a("threads").c();
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                c.c(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
    }

    private void b(Map<String, Float> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        mly.a c = e().a("highLoadThreads").c();
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null && entry.getValue().floatValue() >= 0.5d) {
                c.a(entry.getKey());
            }
        }
    }

    private float a(boolean z, float f, mkq mkqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("40d3c4c1", new Object[]{this, new Boolean(z), new Float(f), mkqVar})).floatValue();
        }
        if (z && this.b.d() != this.b.e()) {
            return 0.0f;
        }
        return z ? c(this.b.b(), mkqVar) : f;
    }

    private void a(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c114785", new Object[]{this, new Integer(i), new Float(f)});
        } else if (f <= 0.5d) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("time", Long.valueOf(SystemClock.uptimeMillis()));
            hashMap.put("processLoadRate", Float.valueOf(f));
            hashMap.put("type", i == 0 ? "fg3minOver50" : "bg1minOver50");
            EventCenter.a().a(this).a(80, hashMap);
            e().c().a(i == 0 ? "fgProcessLoadAbnormalCount" : "bgProcessLoadAbnormalCount");
        }
    }

    private void a(String str, mkq mkqVar, mkq mkqVar2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77a8414", new Object[]{this, str, mkqVar, mkqVar2, new Float(f)});
            return;
        }
        float c = c(mkqVar, mkqVar2);
        if (c <= f) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("time", Long.valueOf(SystemClock.uptimeMillis()));
        hashMap.put("processLoadRate", Float.valueOf(c));
        hashMap.put("type", str);
        EventCenter.a().a(this).a(80, hashMap);
        e().a(str).c().a("processLoadAbnormalCount");
    }

    private void a(mkq mkqVar, float f, float f2, float f3, Map<String, Float> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c57f1fea", new Object[]{this, mkqVar, new Float(f), new Float(f2), new Float(f3), map});
        } else if (!mkqVar.h() || f <= 0.0f || f2 <= 0.0f || f3 <= 0.0f) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("eventType", mkqVar.a());
                jSONObject.put("optType", mkqVar.b().a());
                jSONObject.put("jiffyHz", mkqVar.c());
                jSONObject.put("cpuLoadRate", String.format("%.2f", Float.valueOf(f * 100.0f)) + riy.MOD);
                jSONObject.put("processLoadRate", String.format("%.2f", Float.valueOf(f2 * 100.0f)) + riy.MOD);
                jSONObject.put("mainThreadLoadRate", String.format("%.2f", Float.valueOf(f3 * 100.0f)) + riy.MOD);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("stat", mkqVar.f().e);
                jSONObject2.put("utime", mkqVar.f().f);
                jSONObject2.put("stime", mkqVar.f().g);
                jSONObject2.put("cutime", mkqVar.f().h);
                jSONObject2.put("cstime", mkqVar.f().i);
                jSONObject2.put("diffJiffy", mkqVar.f().k);
                jSONObject.put("processStat", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("stat", mkqVar.g().e);
                jSONObject3.put("utime", mkqVar.g().f);
                jSONObject3.put("stime", mkqVar.g().g);
                jSONObject3.put("cutime", mkqVar.g().h);
                jSONObject3.put("cstime", mkqVar.g().i);
                jSONObject3.put("diffJiffy", mkqVar.g().k);
                jSONObject.put("mainThreadStat", jSONObject3);
                jSONObject.put("threads", new JSONObject(map));
                TLog.loge("MetricKit.CpuLoadMetric", jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    private void b(mkq mkqVar, float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce2fc1a", new Object[]{this, mkqVar, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("dispatchNanos", Long.valueOf(System.nanoTime()));
        hashMap.put("wholeCpuLoadRate", Float.valueOf(f));
        hashMap.put("processLoadRate", Float.valueOf(f2));
        hashMap.put("mainThreadLoadRate", Float.valueOf(f3));
        g g = mkqVar.g();
        g f4 = mkqVar.f();
        if (g != null && f4 != null) {
            hashMap.put("mainThreadSTime", Long.valueOf(g.g));
            hashMap.put("mainThreadUTime", Long.valueOf(g.f));
            hashMap.put("totalCpuTime", Long.valueOf(mkqVar.d()));
            hashMap.put("processSTime", Long.valueOf(f4.g));
            hashMap.put("processUTime", Long.valueOf(f4.f));
        }
        EventCenter.a().a(this).a(81, hashMap);
    }
}
