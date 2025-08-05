package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class bzv<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<K, ArrayList<V>> f26214a = new HashMap<>();

    static {
        kge.a(373386361);
    }

    public ArrayList<V> a(K k) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("29742c1e", new Object[]{this, k}) : this.f26214a.get(k);
    }

    public void a(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184a7920", new Object[]{this, k, v});
            return;
        }
        ArrayList<V> a2 = a(k);
        if (a2 == null) {
            a2 = new ArrayList<>();
        }
        a2.add(v);
        this.f26214a.put(k, a2);
    }

    public HashMap<K, ArrayList<V>> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this}) : this.f26214a;
    }
}
