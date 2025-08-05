package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.gateway.command.type.TaoliveGatewayEnum;

/* loaded from: classes8.dex */
public class pis {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pjc f32697a;
    private pjd b;

    static {
        kge.a(1957831219);
    }

    public pis a(pkg pkgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pis) ipChange.ipc$dispatch("73a3e920", new Object[]{this, pkgVar});
        }
        if (this.f32697a == null) {
            this.f32697a = new pjc();
        }
        if (this.b == null) {
            this.b = new pjd();
        }
        this.f32697a.a(pkgVar).a(this.b);
        return this;
    }

    public Object a(TaoliveGatewayEnum taoliveGatewayEnum, pkg pkgVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("38532d11", new Object[]{this, taoliveGatewayEnum, pkgVar, objArr});
        }
        pjc pjcVar = this.f32697a;
        if (pjcVar == null) {
            return null;
        }
        return pjcVar.a(taoliveGatewayEnum, pkgVar, objArr);
    }
}
