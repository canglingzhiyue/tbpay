package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.services.IBaseService;
import com.taobao.alimama.services.h;
import com.taobao.statistic.TBS;

/* loaded from: classes4.dex */
public class dhw implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1838084572);
        kge.a(-1357565527);
    }

    @Override // com.taobao.alimama.services.h
    public void a(String str, int i, Object obj, Object obj2, Object obj3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55d9201a", new Object[]{this, str, new Integer(i), obj, obj2, obj3, strArr});
        } else {
            TBS.Ext.commitEvent(str, i, obj, obj2, obj3, strArr);
        }
    }

    @Override // com.taobao.alimama.services.IBaseService
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : IBaseService.Names.SERVICE_USER_TRACK.name();
    }
}
