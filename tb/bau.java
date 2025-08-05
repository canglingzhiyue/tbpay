package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes2.dex */
public class bau {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-283743056);
    }

    public static <E> boolean a(Collection<E> collection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2847c1d", new Object[]{collection})).booleanValue() : collection == null || collection.isEmpty();
    }

    public static <K, V> boolean a(Map<K, V> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue() : map == null || map.isEmpty();
    }
}
