package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class glz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<gly> f28373a;

    static {
        kge.a(215264778);
        ArrayList arrayList = new ArrayList(4);
        f28373a = arrayList;
        arrayList.add(new glx());
        f28373a.add(new glw());
        f28373a.add(new gls());
        f28373a.add(new glu());
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
            for (gly glyVar : f28373a) {
                if (glyVar.a(obj, cls, str)) {
                    return glyVar.b(obj, cls, str);
                }
            }
        }
        return null;
    }
}
