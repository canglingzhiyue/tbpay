package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public class fzf<ExposeKey, ExposeData> implements fyw<ExposeKey, ExposeData> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<fyv<ExposeKey, ExposeData>> f28227a = new HashSet();

    static {
        kge.a(1806339244);
        kge.a(1079890643);
    }

    @Override // tb.fyw
    public void a(fyv<ExposeKey, ExposeData> fyvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e982fdf5", new Object[]{this, fyvVar});
        } else {
            this.f28227a.add(fyvVar);
        }
    }

    @Override // tb.fyw
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (fyv<ExposeKey, ExposeData> fyvVar : this.f28227a) {
            b(fyvVar);
        }
    }

    public void b(fyv<ExposeKey, ExposeData> fyvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8060476", new Object[]{this, fyvVar});
        } else {
            fyvVar.b();
        }
    }

    @Override // tb.fyw
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        for (fyv<ExposeKey, ExposeData> fyvVar : this.f28227a) {
            if (fyvVar.a().equals(str)) {
                fyvVar.b();
            }
        }
    }

    @Override // tb.fyw
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        for (fyv<ExposeKey, ExposeData> fyvVar : this.f28227a) {
            c(fyvVar);
        }
    }

    public void c(fyv<ExposeKey, ExposeData> fyvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6890af7", new Object[]{this, fyvVar});
        } else {
            fyvVar.c();
        }
    }

    @Override // tb.fyw
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        for (fyv<ExposeKey, ExposeData> fyvVar : this.f28227a) {
            c(fyvVar);
        }
    }

    @Override // tb.fyw
    public Collection<fyv<ExposeKey, ExposeData>> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("11851419", new Object[]{this}) : this.f28227a;
    }

    @Override // tb.fyw
    public List<fyv<ExposeKey, ExposeData>> g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("706b078f", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        for (fyv<ExposeKey, ExposeData> fyvVar : this.f28227a) {
            if (fyvVar.a().equals(str)) {
                arrayList.add(fyvVar);
            }
        }
        return arrayList;
    }
}
