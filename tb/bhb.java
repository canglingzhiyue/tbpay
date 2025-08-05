package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import mtopsdk.network.impl.ResponseProtocolType;

/* loaded from: classes2.dex */
public class bhb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, bhb> f25893a;
    private static String c;
    private final Stack<a> b = new Stack<>();

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : c;
    }

    static {
        kge.a(-2113196954);
        f25893a = new HashMap();
    }

    public bhb(String str) {
        Stack<a> stack = this.b;
        stack.push(new a("Recorded timings for " + str));
        c = str;
        f25893a.put(str, this);
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f25894a;
        public final Stack<a> b = new Stack<>();
        public final long c = System.nanoTime();
        public long d = -1;

        static {
            kge.a(-767618144);
        }

        public a(String str) {
            this.f25894a = str;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.d = System.nanoTime();
            }
        }

        public long b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.d - this.c;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.f25894a + ResponseProtocolType.COMMENT + (b() / 1000000) + "ms.";
        }

        public String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d92648e1", new Object[]{this, aVar});
            }
            if (this == aVar) {
                return toString();
            }
            long b = (b() * 100) / aVar.b();
            return toString() + " (" + b + "%)";
        }

        public void a(int i, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53e0c112", new Object[]{this, new Integer(i), aVar});
                return;
            }
            Log.e(bhb.c(), a(aVar));
            Iterator<a> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().a(i + 1, aVar);
            }
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        a aVar = new a(str);
        this.b.peek().b.add(aVar);
        this.b.push(aVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.peek().a();
        this.b.pop();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        a peek = this.b.peek();
        peek.a();
        peek.a(0, peek);
        f25893a.remove(peek.f25894a);
    }
}
