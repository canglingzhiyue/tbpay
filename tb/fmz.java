package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class fmz implements Iterable<fmy> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<fmy> f28070a;

    static {
        kge.a(2095620726);
        kge.a(-1037398426);
    }

    public fmz(Collection<fmy> collection) {
        this.f28070a = new CopyOnWriteArrayList(collection);
    }

    public fmz(fmy... fmyVarArr) {
        this.f28070a = new CopyOnWriteArrayList(fmyVarArr);
    }

    public void a(fmy... fmyVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("753016cb", new Object[]{this, fmyVarArr});
        } else if (fmyVarArr != null) {
            for (fmy fmyVar : fmyVarArr) {
                if (fmyVar != null) {
                    this.f28070a.add(fmyVar);
                }
            }
        }
    }

    public void b(fmy... fmyVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("570de06a", new Object[]{this, fmyVarArr});
        } else if (fmyVarArr != null) {
            for (fmy fmyVar : fmyVarArr) {
                if (fmyVar != null) {
                    this.f28070a.remove(fmyVar);
                }
            }
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f28070a.isEmpty();
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f28070a.size();
    }

    @Override // java.lang.Iterable
    public Iterator<fmy> iterator() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this}) : this.f28070a.iterator();
    }

    public fmy a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fmy) ipChange.ipc$dispatch("7c6f53c2", new Object[]{this, str});
        }
        for (fmy fmyVar : this.f28070a) {
            if (fmyVar.a().equals(str)) {
                return fmyVar;
            }
        }
        return null;
    }
}
