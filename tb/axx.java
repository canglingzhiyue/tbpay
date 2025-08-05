package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class axx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<axw> f25681a;

    static {
        kge.a(-1888568192);
        ArrayList arrayList = new ArrayList(4);
        f25681a = arrayList;
        arrayList.add(new axv());
        f25681a.add(new axu());
        f25681a.add(new axp());
        f25681a.add(new axq());
    }

    public static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a12221e4", new Object[]{obj, str});
        }
        if (obj != null && str != null) {
            Class<?> cls = obj.getClass();
            for (axw axwVar : f25681a) {
                if (axwVar.a(obj, cls, str)) {
                    return axwVar.b(obj, cls, str);
                }
            }
        }
        return null;
    }
}
