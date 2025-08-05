package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class jkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<jka> f29591a;

    static {
        kge.a(-117688753);
        ArrayList arrayList = new ArrayList(4);
        f29591a = arrayList;
        arrayList.add(new jjx());
        f29591a.add(new jjw());
        f29591a.add(new jjr());
        f29591a.add(new jjs());
    }

    public static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a12221e4", new Object[]{obj, str});
        }
        if (obj != null && str != null) {
            Class<?> cls = obj.getClass();
            for (jka jkaVar : f29591a) {
                if (jkaVar.a(obj, cls, str)) {
                    return jkaVar.b(obj, cls, str);
                }
            }
        }
        return null;
    }
}
