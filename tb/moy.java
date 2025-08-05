package tb;

import android.content.Intent;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.impl.b;
import com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher;
import com.taobao.monitor.impl.trace.d;
import com.taobao.monitor.impl.trace.e;
import com.taobao.monitor.impl.trace.t;
import com.taobao.monitor.impl.util.a;
import com.taobao.monitor.impl.util.h;
import com.taobao.monitor.impl.util.i;
import com.taobao.monitor.procedure.g;
import com.taobao.monitor.procedure.p;
import com.taobao.monitor.procedure.r;
import com.taobao.orange.OConstant;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class moy implements ApplicationBackgroundChangedDispatcher.a, d.a, e.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private g f;

    /* renamed from: a  reason: collision with root package name */
    private int f31178a = 0;
    private int b = -1;
    private long c = -1;
    private boolean d = false;
    private long e = h.a();
    private int g = 0;
    private long h = 0;
    private long i = 0;
    private final Map<String, Float> j = new LinkedHashMap();
    private boolean k = true;
    private final Runnable l = new Runnable() { // from class: tb.moy.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashSet hashSet = new HashSet(moy.a(moy.this).keySet());
            int i = 0;
            for (String str : moy.a(moy.this).keySet()) {
                if (i < 20) {
                    i++;
                    hashSet.add(str);
                }
            }
            com.taobao.monitor.impl.common.e.a().b().getSharedPreferences("apm", 0).edit().putString("leakSensor", hashSet.toString()).apply();
        }
    };
    private final Map<String, Long> m = new HashMap();
    private final Map<String, JSONObject> n = new HashMap();
    private long o = 0;

    @Override // com.taobao.monitor.impl.trace.e.a
    public void a(mou mouVar, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2712cc4", new Object[]{this, mouVar, map, new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.e.a
    public void b(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e8121e", new Object[]{this, mouVar, new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.e.a
    public void c(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc5dbbd", new Object[]{this, mouVar, new Long(j)});
        }
    }

    public static /* synthetic */ Map a(moy moyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("52db0d6", new Object[]{moyVar}) : moyVar.m;
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.a
    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        Intent a2 = a.a(com.taobao.monitor.impl.common.e.a().b());
        if (1 == i) {
            a(a2);
            com.taobao.monitor.impl.common.e.a().d().postDelayed(this.l, 10000L);
        }
        if (i != 0) {
            return;
        }
        b(a2);
        com.taobao.monitor.impl.common.e.a().d().removeCallbacks(this.l);
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        if (intent != null) {
            a(intent.getIntExtra("temperature", -1) / 10.0f, intent.getIntExtra("plugged", 0), (intent.getIntExtra("level", 0) * 100) / intent.getIntExtra("scale", 100));
        }
        this.d = false;
        g gVar = this.f;
        if (gVar == null) {
            return;
        }
        gVar.b("consumeBatteryPct", Integer.valueOf(this.g));
        this.f.b("unChargeDuration", Long.valueOf(this.h));
        this.f.b("batteryTemperature", this.j.toString().replace("=", ":"));
        this.f.a("procedureEndTime", h.a());
        this.f.b("highSpeedSensor", new JSONObject(this.n));
        this.f.b("SensorTotalDuration", Long.valueOf(a(this.e) + this.o));
        this.g = 0;
        this.h = 0L;
        this.j.clear();
        this.n.clear();
        this.f.d();
        this.o = 0L;
    }

    private void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
            return;
        }
        this.d = true;
        this.e = h.a();
        this.f = r.f18232a.a(i.a("/pageLoad"), new p.a().b(false).a(true).c(true).a((g) null).a());
        this.f.b();
        this.f.a("pageName", "APMGlobalForeground");
        this.f.a("procedureStartTime", this.e);
        this.f.a(OConstant.DIMEN_PROCESS_START_TIME, mnd.m);
        this.f.a("timestampInterval", Long.valueOf(System.currentTimeMillis() - SystemClock.uptimeMillis()));
        if (this.k) {
            this.f.a("launchType", mpa.COLD);
            this.k = false;
        }
        this.b = -1;
        this.i = 0L;
        if (intent != null) {
            a(intent.getIntExtra("temperature", -1) / 10.0f, intent.getIntExtra("plugged", 0), (intent.getIntExtra("level", 0) * 100) / intent.getIntExtra("scale", 100));
        }
        this.f.b("leakSensor", com.taobao.monitor.impl.common.e.a().b().getSharedPreferences("apm", 0).getString("leakSensor", ""));
    }

    @Override // com.taobao.monitor.impl.trace.d.a
    public void a(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ef32b8", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
        } else if (!this.d) {
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i3 = this.b;
            if (i3 > 0 && i2 > 0 && this.f31178a == 0 && i3 - i2 >= 0) {
                this.h += elapsedRealtime - this.c;
                this.g += i3 - i2;
            }
            if (f > 0.0f && this.j.size() < 400) {
                long a2 = h.a();
                if (a2 - this.i > 3000) {
                    this.j.put(String.valueOf(a2), Float.valueOf(f));
                    this.i = a2;
                }
            }
            this.f31178a = i;
            this.c = elapsedRealtime;
            this.b = i2;
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.a
    public void a(String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526bd3", new Object[]{this, str, new Integer(i), new Long(j)});
            return;
        }
        this.m.put(str, Long.valueOf(j));
        if (i > 66667) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("delay", i);
            jSONObject.put("pageName", com.taobao.monitor.impl.util.d.a((Object) b.d().b()));
        } catch (JSONException e) {
            mpi.c("GlobalPageProcessor", e);
        }
        this.n.put(str, jSONObject);
    }

    @Override // com.taobao.monitor.impl.trace.d.a
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        long longValue = this.m.remove(str).longValue();
        if (!this.d) {
            return;
        }
        this.o += h.a() - Math.max(longValue, this.e);
    }

    private long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{this, new Long(j)})).longValue();
        }
        long j2 = 0;
        long a2 = h.a();
        for (Map.Entry<String, Long> entry : this.m.entrySet()) {
            long max = Math.max(entry.getValue().longValue(), j);
            if (max < a2) {
                j2 += a2 - max;
            }
        }
        return j2;
    }

    @Override // com.taobao.monitor.impl.trace.e.a
    public void a(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80a487f", new Object[]{this, mouVar, new Long(j)});
        } else if (this.f == null || mouVar == null) {
        } else {
            HashMap hashMap = new HashMap(2);
            hashMap.put("pageName", mouVar.i());
            hashMap.put("timestamp", Long.valueOf(j));
            this.f.a("onPageAppear", (Map<String, Object>) hashMap);
            t.a().a(mouVar.l());
        }
    }
}
