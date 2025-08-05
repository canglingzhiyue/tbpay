package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class rdu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-393692240);
    }

    public static <T> T a(T t, T t2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("218a0212", new Object[]{t, t2}) : t != null ? t : t2;
    }

    public static <K, V> void a(Map<K, V> map, K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("779a2855", new Object[]{map, k, v});
        } else if (map == null || k == null || v == null) {
        } else {
            map.put(k, v);
        }
    }

    public static <K, V> void a(Map<K, V> map, K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a3294b9", new Object[]{map, k});
        } else if (map == null || k == null) {
        } else {
            map.remove(k);
        }
    }

    public static <K, V> V b(Map<K, V> map, K k, V v) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (V) ipChange.ipc$dispatch("9cedea7e", new Object[]{map, k, v}) : (map == null || k == null) ? v : map.get(k);
    }

    public static <K, V> V b(Map<K, V> map, K k) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (V) ipChange.ipc$dispatch("c3ffc0da", new Object[]{map, k}) : (V) b(map, k, null);
    }

    public static <V> void a(List<V> list, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeecd4f5", new Object[]{list, v});
        } else if (list == null || v == null) {
        } else {
            list.add(v);
        }
    }

    public static <T> boolean a(List<T> list, List<T> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78fe44e", new Object[]{list, list2})).booleanValue();
        }
        if (list == list2) {
            return true;
        }
        if ((list == null && list2 != null && list2.size() == 0) || (list2 == null && list != null && list.size() == 0)) {
            return true;
        }
        return list.size() == list2.size() && list.containsAll(list2) && list2.containsAll(list);
    }
}
