package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.services.IBaseService;
import com.taobao.alimama.services.c;

/* loaded from: classes4.dex */
public class dhs implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1606006329);
        kge.a(-246331514);
    }

    @Override // com.taobao.alimama.services.IBaseService
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : IBaseService.Names.SERVICE_IMAGE_DOWNLOAD.name();
    }
}
