package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.services.IBaseService;
import com.taobao.alimama.services.g;

/* loaded from: classes4.dex */
public class dhv implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2066052934);
        kge.a(1775248397);
    }

    @Override // com.taobao.alimama.services.IBaseService
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : IBaseService.Names.SERVICE_URL_NAV.name();
    }
}
