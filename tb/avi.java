package tb;

import android.content.Context;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.v;
import com.alibaba.android.aura.y;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public class avi implements y {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static y b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, List<s>> f25630a = new HashMap();

    static {
        kge.a(806737567);
        kge.a(-1067255988);
    }

    public static y a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y) ipChange.ipc$dispatch("3c3ead0f", new Object[0]);
        }
        if (baz.a("useNewInstancePoolManager", true, true)) {
            return v.a();
        }
        if (b == null) {
            synchronized (avi.class) {
                if (b == null) {
                    b = new avi();
                }
            }
        }
        return b;
    }

    @Override // com.alibaba.android.aura.y
    public void a(Context context, s sVar) {
        List<s> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7fc9fc7", new Object[]{this, context, sVar});
        } else if (sVar == null) {
        } else {
            int identityHashCode = System.identityHashCode(context);
            if (!this.f25630a.containsKey(Integer.valueOf(identityHashCode))) {
                list = new ArrayList<>();
            } else {
                list = this.f25630a.get(Integer.valueOf(identityHashCode));
            }
            if (list == null) {
                list = new ArrayList<>();
            }
            if (list.contains(sVar)) {
                return;
            }
            ard a2 = arc.a();
            a2.a("AURAInstanceManager cacheInstance " + identityHashCode);
            list.add(sVar);
            this.f25630a.put(Integer.valueOf(identityHashCode), list);
        }
    }

    @Override // com.alibaba.android.aura.y
    public void b(Context context, s sVar) {
        List<s> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e9b6e6", new Object[]{this, context, sVar});
        } else if (sVar == null) {
        } else {
            int identityHashCode = System.identityHashCode(context);
            if (!this.f25630a.containsKey(Integer.valueOf(identityHashCode)) || (list = this.f25630a.get(Integer.valueOf(identityHashCode))) == null) {
                return;
            }
            ard a2 = arc.a();
            a2.a("AURAInstanceManager rmInstance " + identityHashCode);
            list.remove(sVar);
            if (!list.isEmpty()) {
                return;
            }
            this.f25630a.remove(Integer.valueOf(identityHashCode));
        }
    }

    @Override // com.alibaba.android.aura.y
    public List<s> a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("962721e7", new Object[]{this, context}) : this.f25630a.get(Integer.valueOf(System.identityHashCode(context)));
    }

    @Override // com.alibaba.android.aura.y
    public s a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("4cc13e4b", new Object[]{this, str});
        }
        for (s sVar : b()) {
            if (str.equals(sVar.c().d())) {
                return sVar;
            }
        }
        return null;
    }

    @Override // com.alibaba.android.aura.y
    public List<s> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.f25630a.keySet()) {
            List<s> list = this.f25630a.get(num);
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }
}
