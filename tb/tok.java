package tb;

import android.content.Context;
import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.global.SwitchConfig;

/* loaded from: classes9.dex */
public class tok {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f34243a;

    /* loaded from: classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final tok f34244a;

        static {
            kge.a(-1363818546);
            f34244a = new tok();
        }

        public static /* synthetic */ tok a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (tok) ipChange.ipc$dispatch("f0b0dce", new Object[0]) : f34244a;
        }
    }

    static {
        kge.a(-445707465);
    }

    private tok() {
    }

    public static tok a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tok) ipChange.ipc$dispatch("f0b0dce", new Object[0]) : a.a();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (context == null) {
        } else {
            this.f34243a = context.getSharedPreferences("MtopUnitConfig", 0);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str) || this.f34243a == null || SwitchConfig.getInstance().getUnitCalibrationTTL() <= 0) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor edit = this.f34243a.edit();
            edit.putString(str, str2 + "," + currentTimeMillis).apply();
        }
    }

    public String a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!StringUtils.isEmpty(str) && this.f34243a != null) {
            long unitCalibrationTTL = SwitchConfig.getInstance().getUnitCalibrationTTL();
            if (unitCalibrationTTL <= 0) {
                return null;
            }
            String string = this.f34243a.getString(str, null);
            if (!StringUtils.isEmpty(string) && (split = string.split(",")) != null && split.length == 2) {
                String str2 = split[0];
                if (System.currentTimeMillis() < Long.parseLong(split[1]) + unitCalibrationTTL) {
                    return str2;
                }
                this.f34243a.edit().remove(str).apply();
            }
        }
        return null;
    }
}
