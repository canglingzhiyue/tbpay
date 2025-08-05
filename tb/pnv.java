package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class pnv implements pnp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pnp f32778a;
    private pno b;

    static {
        kge.a(1489321106);
        kge.a(-641131650);
    }

    public void a(pnp pnpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f5b766", new Object[]{this, pnpVar});
        } else {
            this.f32778a = pnpVar;
        }
    }

    public void a(pno pnoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f54307", new Object[]{this, pnoVar});
        } else {
            this.b = pnoVar;
        }
    }

    @Override // tb.pnp
    public pns b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pns) ipChange.ipc$dispatch("16badee8", new Object[]{this});
        }
        pnp pnpVar = this.f32778a;
        if (pnpVar == null) {
            return null;
        }
        pns b = pnpVar.b();
        if (!pav.INSTANCE.a()) {
            return b;
        }
        pnt pntVar = new pnt();
        pntVar.a(b);
        pntVar.a(this.b);
        return pntVar;
    }
}
