package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dgs implements dgq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private dgq f26738a;

    static {
        kge.a(-314848064);
        kge.a(-1445590995);
    }

    public dgs(dgq dgqVar) {
        this.f26738a = dgqVar;
    }

    @Override // tb.dgq
    public void a(dgt dgtVar, dgr dgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276b35a8", new Object[]{this, dgtVar, dgrVar});
            return;
        }
        dgq dgqVar = this.f26738a;
        if (dgqVar == null) {
            return;
        }
        dgqVar.a(dgtVar, dgrVar);
    }
}
