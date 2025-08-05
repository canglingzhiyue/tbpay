package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class dhp extends dho {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f26763a;
    private int b;
    private int c;
    private int d;
    private Map<String, String> e;
    private Map<String, String> f;

    static {
        kge.a(1949892246);
    }

    public dhp(a aVar) {
        super(a.a(aVar), a.b(aVar));
        this.f26763a = a.c(aVar);
        this.b = a.d(aVar);
        this.c = a.e(aVar);
        this.d = a.f(aVar);
        this.e = a.g(aVar);
        this.f = Collections.unmodifiableMap(a.h(aVar));
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.f26763a;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.b;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.c;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.d;
    }

    public Map<String, String> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a8bc7a27", new Object[]{this}) : this.f;
    }

    @Override // tb.dho
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : "200".equals(str);
    }

    @Override // tb.dho
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : str.startsWith("-");
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f26764a;
        private final dhm b;
        private boolean c = true;
        private int d = 3;
        private int e = 30000;
        private int f = 30000;
        private Map<String, String> g;
        private Map<String, String> h;

        static {
            kge.a(-1894064275);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f03d4471", new Object[]{aVar}) : aVar.f26764a;
        }

        public static /* synthetic */ dhm b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dhm) ipChange.ipc$dispatch("9949caed", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e9fdc495", new Object[]{aVar})).booleanValue() : aVar.c;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43d92ec5", new Object[]{aVar})).intValue() : aVar.d;
        }

        public static /* synthetic */ int e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9db49906", new Object[]{aVar})).intValue() : aVar.e;
        }

        public static /* synthetic */ int f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7900347", new Object[]{aVar})).intValue() : aVar.f;
        }

        public static /* synthetic */ Map g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("28cf970a", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ Map h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("521f7b8b", new Object[]{aVar}) : aVar.h;
        }

        public a(String str, dhm dhmVar) {
            this.f26764a = str;
            this.b = dhmVar;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5364dcd1", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d098e182", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2a744bc3", new Object[]{this, new Integer(i)});
            }
            this.e = i;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("844fb604", new Object[]{this, new Integer(i)});
            }
            this.f = i;
            return this;
        }

        public a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2ab774c1", new Object[]{this, str, str2});
            }
            if (this.h == null) {
                this.h = new HashMap(4);
            }
            this.h.put(str, str2);
            return this;
        }
    }
}
