package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.gateway.command.type.TaoliveGatewayEnum;

/* loaded from: classes8.dex */
public abstract class pje implements pjb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int interrupt = -1;

    /* renamed from: a  reason: collision with root package name */
    private pjb f32704a;

    static {
        kge.a(-2120800238);
        kge.a(331679853);
    }

    public abstract Object b(TaoliveGatewayEnum taoliveGatewayEnum, pkg pkgVar, Object... objArr);

    @Override // tb.pjb
    public pjb a(pjb pjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pjb) ipChange.ipc$dispatch("837ac7ae", new Object[]{this, pjbVar});
        }
        this.f32704a = pjbVar;
        return this;
    }

    @Override // tb.pjb
    public Object a(TaoliveGatewayEnum taoliveGatewayEnum, pkg pkgVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("38532d11", new Object[]{this, taoliveGatewayEnum, pkgVar, objArr});
        }
        Object b = b(taoliveGatewayEnum, pkgVar, objArr);
        if (b != null) {
            if (!(b instanceof Integer)) {
                return b;
            }
            return null;
        }
        pjb pjbVar = this.f32704a;
        if (pjbVar == null) {
            return null;
        }
        return pjbVar.a(taoliveGatewayEnum, pkgVar, objArr);
    }
}
