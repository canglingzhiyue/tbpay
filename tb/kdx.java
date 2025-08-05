package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class kdx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String c = "FrequencyLimitController";

    /* renamed from: a  reason: collision with root package name */
    private final kdy f29999a = new kdy();
    private final kdw b = new kdw();

    static {
        kge.a(-968665593);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        this.f29999a.e();
        boolean b = this.f29999a.b();
        kej.a("FrequencyLimitController", "isInGlobalLimit inDayFatigue= " + b);
        if (b) {
            return true;
        }
        boolean c = this.f29999a.c();
        kej.a("FrequencyLimitController", "isInGlobalLimit inHourFatigue = " + c);
        return c;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        this.b.e();
        boolean b = this.b.b();
        kej.a("FrequencyLimitController", "isInAdLimit inDayFatigue = " + b);
        if (b) {
            return true;
        }
        boolean c = this.b.c();
        kej.a("FrequencyLimitController", "isInAdLimit inHourFatigue = " + c);
        return c;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        kej.a("FrequencyLimitController", "saveGlobalFatigue ");
        this.f29999a.a();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        kej.a("FrequencyLimitController", "saveGlobalFatigue");
        this.f29999a.a();
        kej.a("FrequencyLimitController", "saveAdFatigue");
        this.b.a();
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.f29999a.a(jSONObject);
            this.b.a(jSONObject);
        }
    }
}
