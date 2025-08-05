package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public class jke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, jkc> f29594a = new ConcurrentHashMap<>();

    public static jkc a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkc) ipChange.ipc$dispatch("16bcbcc0", new Object[]{obj});
        }
        if (obj != null) {
            return a(c(obj));
        }
        return null;
    }

    private static jkc a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkc) ipChange.ipc$dispatch("7c711b12", new Object[]{str});
        }
        if (jkf.a(str)) {
            return null;
        }
        if (f29594a.containsKey(str)) {
            return f29594a.get(str);
        }
        jkc jkcVar = new jkc();
        f29594a.put(str, jkcVar);
        return jkcVar;
    }

    public static void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{obj});
        } else if (obj == null) {
        } else {
            String c = c(obj);
            if (!f29594a.containsKey(c)) {
                return;
            }
            f29594a.get(c).a();
            f29594a.remove(c);
        }
    }

    private static String c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3897149a", new Object[]{obj});
        }
        return obj.getClass().getSimpleName() + obj.hashCode();
    }
}
