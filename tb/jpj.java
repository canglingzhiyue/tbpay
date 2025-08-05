package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class jpj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<jpi> f29673a;

    static {
        kge.a(1758375141);
        ArrayList arrayList = new ArrayList(4);
        f29673a = arrayList;
        arrayList.add(new jpg());
        f29673a.add(new jpf());
        f29673a.add(new jpb());
        f29673a.add(new jpc());
    }

    public static Object a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a12221e4", new Object[]{obj, str});
        }
        if (obj != null && str != null) {
            Class<?> cls = obj.getClass();
            for (jpi jpiVar : f29673a) {
                if (jpiVar.a(obj, cls, str)) {
                    return jpiVar.b(obj, cls, str);
                }
            }
        }
        return null;
    }
}
