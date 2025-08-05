package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class iha implements igy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<igy> f29017a = new ArrayList();

    @Override // tb.igy
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        for (igy igyVar : this.f29017a) {
            try {
                igyVar.a(application);
            } catch (Throwable unused) {
            }
        }
    }

    public iha a(igy igyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iha) ipChange.ipc$dispatch("47598327", new Object[]{this, igyVar});
        }
        this.f29017a.add(igyVar);
        return this;
    }
}
