package tb;

import com.alibaba.android.aura.datamodel.render.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class brl extends brm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Map<String, brj> e;

    static {
        kge.a(441599356);
    }

    public final void a(List<brj> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        if (this.e == null) {
            this.e = new HashMap();
        }
        for (brj brjVar : list) {
            this.e.put(brjVar.a(), brjVar);
        }
    }

    public brj a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (brj) ipChange.ipc$dispatch("7c6d933a", new Object[]{this, str});
        }
        Map<String, brj> map = this.e;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    @Override // tb.brj
    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : a.b.c;
    }
}
