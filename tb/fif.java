package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes5.dex */
public class fif {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static LinkedList<a> f27969a;
    public static HashMap<String, com.taobao.android.detail2.core.framework.a> b;
    private static int d;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public com.taobao.android.detail2.core.framework.a f27970a;

        static {
            kge.a(897951817);
        }

        public a(com.taobao.android.detail2.core.framework.a aVar) {
            this.f27970a = aVar;
        }
    }

    static {
        kge.a(-243334915);
        d = 2;
        f27969a = new LinkedList<>();
        b = new HashMap<>();
    }

    public static void a(com.taobao.android.detail2.core.framework.a aVar) {
        a poll;
        com.taobao.android.detail2.core.framework.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8afcf8", new Object[]{aVar});
        } else if (aVar == null) {
        } else {
            Iterator<a> it = f27969a.iterator();
            while (it.hasNext()) {
                if (it.next().f27970a == aVar) {
                    return;
                }
            }
            f27969a.add(new a(aVar));
            b.put(aVar.toString(), aVar);
            if (f27969a.size() <= d || (poll = f27969a.poll()) == null || (aVar2 = poll.f27970a) == null) {
                return;
            }
            b.remove(aVar2.toString());
            aVar2.finishNewDetailContainer();
        }
    }

    public static void b(com.taobao.android.detail2.core.framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134a317", new Object[]{aVar});
            return;
        }
        a aVar2 = null;
        Iterator<a> it = f27969a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            if (aVar == next.f27970a) {
                aVar2 = next;
                break;
            }
        }
        if (aVar2 == null) {
            return;
        }
        f27969a.remove(aVar2);
        b.remove(aVar2.f27970a.toString());
    }
}
