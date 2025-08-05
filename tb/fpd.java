package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.view.b;

/* loaded from: classes5.dex */
public class fpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f28087a;
    private b b;
    private Object c;
    private Object d;
    private Object e;

    static {
        kge.a(-1050527300);
    }

    public Object a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.e;
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.e = obj;
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f28087a;
    }

    public b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("65af430", new Object[]{this}) : this.b;
    }

    public Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : this.c;
    }

    public Object e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d74af246", new Object[]{this}) : this.d;
    }

    private fpd(a aVar) {
        this.f28087a = "default";
        this.f28087a = a.a(aVar);
        this.e = a.b(aVar);
        this.c = a.c(aVar);
        this.d = a.d(aVar);
        this.b = a.e(aVar);
    }

    /* loaded from: classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f28088a = "default";
        private b b;
        private Object c;
        private Object d;
        private Object e;

        static {
            kge.a(1795265683);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e57265f", new Object[]{aVar}) : aVar.f28088a;
        }

        public static /* synthetic */ Object b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("f3c488d0", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ Object c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("7bf4c8af", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ Object d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("425088e", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ b e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("4cc2bf6b", new Object[]{aVar}) : aVar.b;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1e09db9d", new Object[]{this, str});
            }
            this.f28088a = str;
            return this;
        }

        public a a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("35b6d3e1", new Object[]{this, bVar});
            }
            this.b = bVar;
            return this;
        }

        public a a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("53f3c9cb", new Object[]{this, obj});
            }
            this.c = obj;
            return this;
        }

        public a b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dc2409aa", new Object[]{this, obj});
            }
            this.d = obj;
            return this;
        }

        public a c(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("64544989", new Object[]{this, obj});
            }
            this.e = obj;
            return this;
        }

        public fpd a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fpd) ipChange.ipc$dispatch("f04b384", new Object[]{this}) : new fpd(this);
        }
    }
}
