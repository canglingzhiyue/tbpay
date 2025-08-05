package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class abf<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<abg> f25203a = new ArrayList();

    static {
        kge.a(488704778);
    }

    public void a(abg<? extends T> abgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfafd4b2", new Object[]{this, abgVar});
        } else {
            this.f25203a.add(abgVar);
        }
    }

    public boolean a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue();
        }
        for (abg abgVar : this.f25203a) {
            if (abgVar.a(t)) {
                return true;
            }
        }
        return false;
    }
}
