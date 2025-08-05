package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.services.IBaseService;
import com.taobao.alimama.services.f;

/* loaded from: classes4.dex */
public class dhu implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1415165119);
        kge.a(903913300);
    }

    @Override // com.taobao.alimama.services.f
    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : System.currentTimeMillis();
    }

    @Override // com.taobao.alimama.services.IBaseService
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : IBaseService.Names.SERVICE_TIME.name();
    }
}
