package tb;

import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.q;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class iyc extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private iyb f29405a;
    private iyd b;

    static {
        kge.a(-1486078462);
    }

    public iyc(iyb iybVar, iyd iydVar) {
        this.f29405a = iybVar;
        this.b = iydVar;
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        iyd iydVar = this.b;
        if (iydVar == null) {
            return;
        }
        iydVar.a(new iye(eVar, this), this.f29405a);
    }
}
