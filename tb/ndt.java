package tb;

import android.content.Context;
import com.alipay.android.msp.utils.UserLocation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes7.dex */
public class ndt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f31374a = "lbs_passive.loc_GatheringCommand";

    static {
        kge.a(-1408044302);
    }

    public void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{this, context, new Boolean(z)});
        } else if ("off".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "passivelocationoption", "off"))) {
        } else {
            ndr ndrVar = new ndr(ndw.f31376a);
            if (ndr.f31372a || !ndrVar.a()) {
                return;
            }
            ndv ndvVar = new ndv(context, ndv.PASSIVE_LOCATION_CHANNEL_GATHER_SOURCE);
            long j = 3600000;
            long j2 = 100;
            if (z) {
                String config = OrangeConfig.getInstance().getConfig("gps", "backGatherNormalRate", "30");
                if (config != null && !config.isEmpty()) {
                    j = Long.parseLong(config) * 60 * 1000;
                }
                String config2 = OrangeConfig.getInstance().getConfig("gps", "backAccuracy", "500");
                if (config2 != null && !config2.isEmpty()) {
                    j2 = Long.parseLong(config2);
                }
            } else {
                String config3 = OrangeConfig.getInstance().getConfig("gps", "gatherNormalRate", "10");
                if (config3 != null && !config3.isEmpty()) {
                    j = Long.parseLong(config3) * 60 * 1000;
                }
                String config4 = OrangeConfig.getInstance().getConfig("gps", UserLocation.KEY_DOUBLE_ACCURACY, "500");
                if (config4 != null && !config4.isEmpty()) {
                    j2 = Long.parseLong(config4);
                }
            }
            ndvVar.a(j, (float) j2);
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            new ndv(context, ndv.PASSIVE_LOCATION_CHANNEL_GATHER_SOURCE).a();
        }
    }
}
