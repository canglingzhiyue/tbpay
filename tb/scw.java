package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class scw implements scy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<scy> f33485a = new ArrayList();

    @Override // tb.scy
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (scy scyVar : this.f33485a) {
            scyVar.a();
        }
    }

    public scw a(scy scyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (scw) ipChange.ipc$dispatch("79b5aa50", new Object[]{this, scyVar});
        }
        this.f33485a.add(scyVar);
        return this;
    }
}
