package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class bqv<S> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile S f26048a;
    private final CopyOnWriteArrayList<Object<S>> b = new CopyOnWriteArrayList<>();

    static {
        kge.a(-1270215824);
        kge.a(2142411458);
    }

    public void a(S s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, s});
        } else {
            b(s);
        }
    }

    public S b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (S) ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.f26048a;
    }

    public void b(S s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, s});
        } else if (s == null || a(this.f26048a, s)) {
        } else {
            this.f26048a = s;
            Iterator<Object<S>> it = this.b.iterator();
            while (it.hasNext()) {
                it.next();
                S s2 = this.f26048a;
            }
        }
    }

    private static boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{obj, obj2})).booleanValue() : obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
