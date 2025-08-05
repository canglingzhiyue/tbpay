package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class foa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<fnz> f28083a;

    static {
        kge.a(11638320);
        ArrayList arrayList = new ArrayList(4);
        f28083a = arrayList;
        arrayList.add(new fny());
        f28083a.add(new fnx());
        f28083a.add(new fnv());
        f28083a.add(new fnw());
    }

    public static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a12221e4", new Object[]{obj, str});
        }
        if (obj != null && str != null) {
            if (str.equals("this")) {
                return obj;
            }
            Class<?> cls = obj.getClass();
            for (fnz fnzVar : f28083a) {
                if (fnzVar.a(obj, cls, str)) {
                    return fnzVar.b(obj, cls, str);
                }
            }
        }
        return null;
    }
}
