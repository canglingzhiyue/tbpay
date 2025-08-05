package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public class iks {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public interface a<T> {
        boolean a(T t);
    }

    public static <T> List<T> a(T... tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("90ab315e", new Object[]{tArr});
        }
        if (tArr == null || tArr.length == 0) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(tArr.length);
        Collections.addAll(arrayList, tArr);
        return arrayList;
    }

    public static <T> Collection<T> b(Collection<T> collection, a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("58744c4b", new Object[]{collection, aVar});
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (aVar.a(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <T> boolean a(Collection<T> collection, a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("892ef27f", new Object[]{collection, aVar})).booleanValue();
        }
        for (T t : collection) {
            if (aVar.a(t)) {
                return true;
            }
        }
        return false;
    }
}
