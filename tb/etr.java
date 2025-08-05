package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.mainpic.holder.n;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public abstract class etr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private etr f27571a;

    public abstract String b(String str, IDMComponent iDMComponent, n nVar);

    public final etr a(etr etrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (etr) ipChange.ipc$dispatch("df10494e", new Object[]{this, etrVar});
        }
        this.f27571a = etrVar;
        return this;
    }

    public final String a(String str, IDMComponent iDMComponent, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c30a4e3", new Object[]{this, str, iDMComponent, nVar});
        }
        String b = b(str, iDMComponent, nVar);
        etr etrVar = this.f27571a;
        return etrVar == null ? b : etrVar.b(b, iDMComponent, nVar);
    }
}
