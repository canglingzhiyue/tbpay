package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.services.IBaseService;
import com.taobao.alimama.services.b;

/* loaded from: classes4.dex */
public class dhr implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1160575724);
        kge.a(706909759);
    }

    @Override // com.taobao.alimama.services.IBaseService
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : IBaseService.Names.SERVICE_CONFIGURATION.name();
    }
}
