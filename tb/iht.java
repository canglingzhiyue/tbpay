package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public class iht {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<ihw> f29034a;
    private final RSoException b;

    public iht(List<ihw> list, RSoException rSoException) {
        this.f29034a = list;
        this.b = rSoException;
    }

    public static iht a(List<ihw> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iht) ipChange.ipc$dispatch("fa5cf678", new Object[]{list}) : new iht(list, null);
    }

    public static iht a(RSoException rSoException) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iht) ipChange.ipc$dispatch("2e4b468a", new Object[]{rSoException}) : new iht(Collections.emptyList(), rSoException);
    }

    public List<ihw> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (ihw ihwVar : this.f29034a) {
            if (!ihwVar.g()) {
                arrayList.add(ihwVar);
            }
        }
        return arrayList;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.f29034a.isEmpty()) {
            return false;
        }
        for (ihw ihwVar : this.f29034a) {
            if (!ihwVar.g()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BatchFetchResult{results=" + this.f29034a + riy.BLOCK_END_STR;
    }
}
