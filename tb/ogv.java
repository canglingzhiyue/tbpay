package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class ogv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface a<T> {
        boolean a(T t);
    }

    static {
        kge.a(1721490255);
    }

    public static boolean a(Collection collection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2847c1d", new Object[]{collection})).booleanValue() : collection == null || collection.isEmpty();
    }

    public static boolean b(Collection collection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bd58cde", new Object[]{collection})).booleanValue() : !a(collection);
    }

    public static boolean a(Map map, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee00a48a", new Object[]{map, new Integer(i)})).booleanValue() : map != null && map.size() < i;
    }

    public static boolean a(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{map})).booleanValue() : map == null || map.isEmpty();
    }

    public static boolean b(Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41e3e880", new Object[]{map})).booleanValue() : !a(map);
    }

    public static <T> T b(List<T> list, a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("dc1a1503", new Object[]{list, aVar});
        }
        if (!a(list) && aVar != null) {
            for (T t : list) {
                if (aVar.a(t)) {
                    return t;
                }
            }
        }
        return null;
    }
}
