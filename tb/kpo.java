package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class kpo implements igy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ihh f30213a;
    private final nof b;

    public kpo(ihh ihhVar, nof nofVar) {
        this.f30213a = ihhVar;
        this.b = nofVar;
    }

    @Override // tb.igy
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else if (!this.f30213a.a("useFastSp", this.b.a())) {
        } else {
            ixr.a(application, new HashMap());
        }
    }
}
