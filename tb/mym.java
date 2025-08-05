package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class mym {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<Object> f31326a = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final mym f31327a = new mym();

        public static /* synthetic */ mym a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (mym) ipChange.ipc$dispatch("f0804fd", new Object[0]) : f31327a;
        }
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        Iterator<Object> it = this.f31326a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public static mym a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mym) ipChange.ipc$dispatch("f0804fd", new Object[0]) : a.a();
    }
}
