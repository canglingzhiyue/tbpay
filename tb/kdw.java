package tb;

import android.content.SharedPreferences;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class kdw extends kdv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1778246670);
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
            sb.append("saveLastShowDayValue AdFrequencyLimit: currentDay: ");
            sb.append(str);
            sb.append(",lastShowDayCountValue");
            int i2 = i + 1;
            sb.append(i2);
            kej.a("AdFrequencyLimit", sb.toString());
            SharedPreferences.Editor edit = kel.a().edit();
            edit.putString("advLastShowDay", str).apply();
            edit.putInt("advLastShowDayCount", i2).apply();
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
            kej.a("AdFrequencyLimit", "saveLastShowDayValue AdFrequencyLimit: saveLastShowTime: " + j);
            kel.a().edit().putLong("advLastShowLime", j).apply();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (!kel.b()) {
        } else {
            this.f29997a = kel.a().getInt("advLimitInSingleDay", Integer.MAX_VALUE);
            this.b = kel.a().getLong("advLimitSeconds", 0L);
            this.c = kel.a().getString("advLastShowDay", "");
            this.d = kel.a().getInt("advLastShowDayCount", 0);
            this.e = kel.a().getLong("advLastShowLime", 0L);
            kej.a("AdFrequencyLimit", "AdFrequencyLimit: limitInSingleDayValue = " + this.f29997a + ",limitSecondsValue=" + this.b + ",lastShowDayValue =" + this.c + ",lastShowDayCountValue =" + this.d + ",lastShowTimeValue = " + this.e);
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (!kel.b()) {
        } else {
            SharedPreferences.Editor edit = kel.a().edit();
            if (jSONObject.containsKey("advLimitInSingleDay")) {
                this.f29997a = Integer.parseInt(jSONObject.getString("advLimitInSingleDay"));
                edit.putInt("advLimitInSingleDay", this.f29997a);
                kej.a("AdFrequencyLimit", "updateFrequencyLimit AdFrequencyLimit: limitInSingleDayValue: " + this.f29997a);
            }
            if (jSONObject.containsKey("advLimitSeconds")) {
                this.b = Integer.parseInt(jSONObject.getString("advLimitSeconds"));
                edit.putLong("advLimitSeconds", this.b);
                kej.a("AdFrequencyLimit", "updateFrequencyLimit AdFrequencyLimit: limitSecondsValue: " + this.b);
            }
            edit.apply();
        }
    }
}
