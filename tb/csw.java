package tb;

import android.os.Build;
import com.alipay.zoloz.hardware.camera.preview.utils.SPManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.c;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class csw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1595469075);
        cox.a("plt_performance", "capture", Arrays.asList(SPManager.FPS_KEY, "algo_cost_time"), Arrays.asList("device_level", "device_brand", "device_type", "system_version"));
    }

    public static void a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11cae8", new Object[]{new Long(j), new Long(j2)});
            return;
        }
        if (j != 0 && j2 != 0) {
            try {
                HashMap hashMap = new HashMap(8);
                hashMap.put(SPManager.FPS_KEY, Double.valueOf(j));
                hashMap.put("algo_cost_time", Double.valueOf(j2));
                HashMap hashMap2 = new HashMap(8);
                hashMap2.put("device_level", c.a());
                hashMap2.put("device_brand", Build.BRAND);
                hashMap2.put("device_type", Build.MODEL);
                hashMap2.put("app_version", com.g());
                hashMap2.put("system_version", Build.VERSION.RELEASE);
                cox.a("plt_performance", "capture", hashMap, hashMap2);
            } catch (Exception unused) {
            }
        }
    }
}
