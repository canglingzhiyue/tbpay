package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.ITopViewService;
import com.taobao.infoflow.protocol.engine.invoke.biz.k;

/* loaded from: classes7.dex */
public class lhb implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ITopViewService f30596a;

    static {
        kge.a(-1593291044);
        kge.a(-631758388);
    }

    public lhb(ljs ljsVar) {
        this.f30596a = (ITopViewService) ljsVar.a(ITopViewService.class);
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.k
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        ITopViewService iTopViewService = this.f30596a;
        if (iTopViewService == null) {
            return false;
        }
        return iTopViewService.expendTopViewRecord();
    }
}
