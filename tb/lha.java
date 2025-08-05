package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.engine.invoke.biz.j;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;

/* loaded from: classes.dex */
public class lha implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30595a;

    static {
        kge.a(-1193168726);
        kge.a(1082555962);
    }

    public lha(ljs ljsVar) {
        this.f30595a = ljsVar;
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.j
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        IRocketSubService iRocketSubService = (IRocketSubService) this.f30595a.a(IRocketSubService.class);
        if (iRocketSubService != null) {
            return iRocketSubService.isOnRocketState();
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.engine.invoke.biz.j
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        IRocketSubService iRocketSubService = (IRocketSubService) this.f30595a.a(IRocketSubService.class);
        if (iRocketSubService == null) {
            return;
        }
        iRocketSubService.onClickRocket();
    }
}
