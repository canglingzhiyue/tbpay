package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;

/* loaded from: classes6.dex */
public class izj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1192897598);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        MtopConfig mtopConfig = Mtop.instance(null).getMtopConfig();
        return (mtopConfig == null || mtopConfig.envMode == null || mtopConfig.envMode != EnvModeEnum.ONLINE) ? false : true;
    }
}
