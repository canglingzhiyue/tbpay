package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;

/* loaded from: classes8.dex */
public abstract class suu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<String>> f33917a = new LinkedHashMap();

    static {
        kge.a(715641126);
    }

    public abstract void a(sur surVar);

    public final void a(String sender, List<String> names) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa3523", new Object[]{this, sender, names});
            return;
        }
        q.d(sender, "sender");
        q.d(names, "names");
        ArrayList arrayList = new ArrayList();
        for (String str : names) {
            if (!d(sender, str)) {
                arrayList.add(str);
            }
        }
        List<String> list = this.f33917a.get(sender);
        if (list == null) {
            this.f33917a.put(sender, arrayList);
        } else {
            list.addAll(arrayList);
        }
    }

    public final void b(String sender, List<String> names) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aab2c64", new Object[]{this, sender, names});
            return;
        }
        q.d(sender, "sender");
        q.d(names, "names");
        List<String> list = this.f33917a.get(sender);
        if (list == null) {
            return;
        }
        list.removeAll(names);
    }

    public final void d(String sender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, sender});
            return;
        }
        q.d(sender, "sender");
        this.f33917a.remove(sender);
    }

    public final boolean d(String sender, String name) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f180e83", new Object[]{this, sender, name})).booleanValue();
        }
        q.d(sender, "sender");
        q.d(name, "name");
        List<String> list = this.f33917a.get(sender);
        if (list == null) {
            return false;
        }
        return list.contains(name);
    }

    public final boolean e(String sender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, sender})).booleanValue();
        }
        q.d(sender, "sender");
        List<String> list = this.f33917a.get(sender);
        return list != null && !list.isEmpty();
    }

    public final boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
        }
        for (List<String> list : this.f33917a.values()) {
            if (!list.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
