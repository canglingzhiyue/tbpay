package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.context.c;
import com.taobao.tao.log.TLog;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class mmg extends mme<mkl, mkk> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private mkk f31109a;

    public static /* synthetic */ Object ipc$super(mmg mmgVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public mmg(MetricContext metricContext, mly mlyVar, mkl mklVar) {
        super(metricContext, mlyVar, mklVar);
    }

    @Override // tb.mme
    public long a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938f", new Object[]{this, new Integer(i)})).longValue();
        }
        if (i == 1) {
            return c.a(c.CONFIG_BG_BATTERY_COLLECT_INTERVAL, 180L);
        }
        return c.a(c.CONFIG_FG_BATTERY_COLLECT_INTERVAL, 10L);
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

    @Override // tb.mmc
    public void a(mkk mkkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4aaa12b", new Object[]{this, mkkVar});
            return;
        }
        b(mkkVar);
        boolean a2 = mkkVar.b().a(a(mkkVar.a()) * 1000);
        if (this.f31109a == null || mkkVar.d() || a2) {
            TLog.loge("MetricKit.BatteryMetric", "lastCollectResult=" + this.f31109a + " isCharging=" + mkkVar.d() + " isSkippedScroll=" + a2);
            this.f31109a = mkkVar;
            return;
        }
        mly a3 = e().a(mkkVar.b().a());
        a3.c().a("consumedChargeCounter", (this.f31109a.c() - mkkVar.c()) + a3.a("consumedChargeCounter", 0L)).a("durationMs", (mkkVar.e() - this.f31109a.e()) + a3.a("durationMs", 0L)).a();
        this.f31109a = mkkVar;
    }

    private void b(mkk mkkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32da7ac", new Object[]{this, mkkVar});
        } else if (mkkVar.c() <= 0) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", mkkVar.b().a());
                jSONObject.put("scrollDuration", mkkVar.b().c());
                jSONObject.put("charging", mkkVar.d());
                jSONObject.put("chargeCounter", mkkVar.c());
                TLog.loge("MetricKit.BatteryMetric", jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
