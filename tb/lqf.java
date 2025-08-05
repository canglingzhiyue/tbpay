package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class lqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<lqm> f30823a = new ArrayList();

    static {
        kge.a(1027001330);
    }

    public lqf(ljs ljsVar) {
        this.f30823a.add(new lqk(ljsVar));
        this.f30823a.add(new lqj(ljsVar));
        this.f30823a.add(new lqg(ljsVar));
        this.f30823a.add(new lqn(ljsVar));
        this.f30823a.add(new krv(ljsVar));
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (lqm lqmVar : this.f30823a) {
            lqmVar.a();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (lqm lqmVar : this.f30823a) {
            lqmVar.b();
        }
    }
}
