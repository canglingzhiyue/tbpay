package tb;

import com.alibaba.android.ultron.trade.presenter.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes2.dex */
public class bnd implements bnf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IDMComponent f25993a;
    private c b;

    static {
        kge.a(-1652861194);
        kge.a(1931494709);
    }

    public bnd(IDMComponent iDMComponent, c cVar) {
        this.f25993a = iDMComponent;
        this.b = cVar;
        if (iDMComponent != null) {
            iDMComponent.record();
        }
    }

    @Override // tb.bnf
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        IDMComponent iDMComponent = this.f25993a;
        if (iDMComponent != null) {
            iDMComponent.rollBack();
        }
        c cVar = this.b;
        if (cVar == null) {
            return;
        }
        cVar.y().m();
    }
}
