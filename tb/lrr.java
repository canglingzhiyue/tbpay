package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;

/* loaded from: classes7.dex */
public abstract class lrr implements IJsBridgeService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1015793523);
        kge.a(-691738948);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }
}
