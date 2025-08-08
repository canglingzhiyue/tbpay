package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Criteria;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.preference.PreferenceManager;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes7.dex */
public class ndr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31372a;
    public static boolean b;
    public static boolean c;
    private final String d = "lbs_location_user_control";
    private ndt e;
    private Context f;
    private ndq g;
    private boolean h;

    static {
        kge.a(880846163);
        f31372a = false;
        b = false;
        c = false;
    }

    public ndr(Context context) {
        try {
            this.f = context;
            this.e = new ndt();
            this.g = ndq.a();
            this.h = c();
        } catch (Exception e) {
            nea.a("lbs_passive.loc_LPCF", "init LocationParamConfig error: " + e.getMessage());
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        try {
            if (!b()) {
                return false;
            }
            Criteria criteria = new Criteria();
            criteria.setPowerRequirement(1);
            List<String> providers = ((LocationManager) this.f.getSystemService("location")).getProviders(criteria, true);
            if (providers != null && providers.size() > 0) {
                nea.d("lbs_passive.loc_LPCF", "[canSampling()] providers:" + providers);
            } else {
                WifiManager wifiManager = (WifiManager) this.f.getSystemService("wifi");
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                int ipAddress = connectionInfo == null ? 0 : connectionInfo.getIpAddress();
                if (!wifiManager.isWifiEnabled() || ipAddress == 0) {
                    return false;
                }
                nea.d("lbs_passive.loc_LPCF", "[canSampling()] 高功耗状态但是有wifi可以采集位置信息~");
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        String c2 = this.g.c();
        boolean parseBoolean = Boolean.parseBoolean(this.g.b());
        nea.c("lbs_passive.loc_LPCF", "[isGatheringEnabled] reportSwitch=" + parseBoolean + ",clientSwitchStatus=" + c2);
        if (StringUtils.isEmpty(c2)) {
            return parseBoolean;
        }
        nea.c("lbs_passive.loc_LPCF", "[isGatheringEnabled] clientSwitchStatus=" + c2);
        if ("FORCE_ON".equals(c2)) {
            return true;
        }
        if ("FORCE_OFF".equals(c2)) {
            return false;
        }
        if (this.h) {
            nea.c("lbs_passive.loc_LPCF", "[isGatheringEnabled] userControlStatus=" + this.h + ",reportSwitch=" + parseBoolean);
            return parseBoolean;
        }
        nea.c("lbs_passive.loc_LPCF", "[isGatheringEnabled] clientSwitchStatus=" + c2 + ",reportSwitch=" + parseBoolean);
        return parseBoolean && "DEFAULT_ON".equals(c2);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        b(z);
        if (a()) {
            this.e.a(this.f, false);
        } else {
            this.e.a(this.f);
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h = z;
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.f).edit();
        edit.putBoolean("lbs_location_user_control", z);
        edit.apply();
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        this.h = PreferenceManager.getDefaultSharedPreferences(this.f).getBoolean("lbs_location_user_control", false);
        return this.h;
    }
}
