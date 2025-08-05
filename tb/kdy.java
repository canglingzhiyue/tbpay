package tb;

import android.content.SharedPreferences;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class kdy extends kdv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-219400818);
    }

    @Override // tb.kdv
    public void a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ad11", new Object[]{this, str, new Integer(i)});
        } else if (!kel.b()) {
        } else {
            this.c = str;
            this.d = i;
            StringBuilder sb = new StringBuilder();
            sb.append("saveLastShowDayValue GlobalFrequencyLimit: currentDay: ");
            sb.append(str);
            sb.append(",lastShowDayCountValue");
            int i2 = i + 1;
            sb.append(i2);
            kej.a("GlobalFrequencyLimit", sb.toString());
            SharedPreferences.Editor edit = kel.a().edit();
            edit.putString("globalLastShowDay", str);
            edit.putInt("globalLastShowDayCount", i2);
            edit.apply();
        }
    }

    @Override // tb.kdv
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else if (!kel.b()) {
        } else {
            this.e = j;
            kej.a("GlobalFrequencyLimit", "saveLastShowDayValue GlobalFrequencyLimit: saveLastShowTime: " + j);
            kel.a().edit().putLong("globalLastShowTime", j).apply();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!kel.b()) {
        } else {
            this.f29997a = kel.a().getInt("globalLimitInSingleDay", Integer.MAX_VALUE);
            this.b = kel.a().getLong("globalLimitSeconds", 0L);
            this.c = kel.a().getString("globalLastShowDay", "");
            this.d = kel.a().getInt("globalLastShowDayCount", 0);
            this.e = kel.a().getLong("globalLastShowTime", 0L);
            kej.a("GlobalFrequencyLimit", "GlobalFrequencyLimit: limitInSingleDayValue = " + this.f29997a + ",limitSecondsValue=" + this.b + ",lastShowDayValue =" + this.c + ",lastShowDayCountValue =" + this.d + ",lastShowTimeValue = " + this.e);
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (!kel.b()) {
        } else {
            SharedPreferences.Editor edit = kel.a().edit();
            if (jSONObject.containsKey("globalLimitInSingleDay")) {
                this.f29997a = Integer.parseInt(jSONObject.getString("globalLimitInSingleDay"));
                edit.putInt("globalLimitInSingleDay", this.f29997a);
                kej.a("GlobalFrequencyLimit", "updateFrequencyLimit GlobalFrequencyLimit: limitInSingleDayValue: " + this.f29997a);
            }
            if (jSONObject.containsKey("globalLimitSeconds")) {
                this.b = Integer.parseInt(jSONObject.getString("globalLimitSeconds"));
                edit.putLong("globalLimitSeconds", this.b);
                kej.a("GlobalFrequencyLimit", "updateFrequencyLimit GlobalFrequencyLimit: limitSecondsValue: " + this.b);
            }
            edit.apply();
        }
    }
}
