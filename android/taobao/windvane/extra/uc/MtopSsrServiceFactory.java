package android.taobao.windvane.extra.uc;

import android.taobao.windvane.config.j;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mtd;
import tb.mtf;

/* loaded from: classes2.dex */
public class MtopSsrServiceFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1453729951);
    }

    public static mtd createSsrService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mtd) ipChange.ipc$dispatch("8606ec63", new Object[0]);
        }
        if (j.commonConfig.cA) {
            return new FirstTruckCacheSSRService();
        }
        return mtf.b();
    }
}
