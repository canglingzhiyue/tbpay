package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class xnc implements xnb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f34394a;
    private final int b;
    private final int c;
    private final int d;
    private final String e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final String j;

    static {
        kge.a(997992756);
        kge.a(171496641);
    }

    private xnc(a aVar) {
        this.f34394a = a.a(aVar);
        this.b = a.b(aVar);
        this.c = a.c(aVar);
        this.d = a.d(aVar);
        this.e = a.e(aVar);
        this.f = a.f(aVar);
        this.g = a.g(aVar);
        this.h = a.h(aVar);
        this.i = a.i(aVar);
        this.j = a.j(aVar);
    }

    @Override // tb.xnb
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f34394a;
    }

    @Override // tb.xnb
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    @Override // tb.xnb
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
    }

    @Override // tb.xnb
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.d;
    }

    @Override // tb.xnb
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.g;
    }

    @Override // tb.xnb
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.e;
    }

    @Override // tb.xnb
    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.f;
    }

    @Override // tb.xnb
    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.h;
    }

    @Override // tb.xnb
    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.i;
    }

    @Override // tb.xnb
    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.j;
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f34395a;
        private final int b;
        private boolean c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private String j;

        static {
            kge.a(533761035);
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7b14d4f2", new Object[]{aVar})).booleanValue() : aVar.c;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d4f03f22", new Object[]{aVar})).intValue() : aVar.b;
        }

        public static /* synthetic */ int c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2ecba963", new Object[]{aVar})).intValue() : aVar.d;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88a713a4", new Object[]{aVar})).intValue() : aVar.e;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8848d8ee", new Object[]{aVar}) : aVar.f34395a;
        }

        public static /* synthetic */ int f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c5de826", new Object[]{aVar})).intValue() : aVar.f;
        }

        public static /* synthetic */ int g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("96395267", new Object[]{aVar})).intValue() : aVar.g;
        }

        public static /* synthetic */ int h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f014bca8", new Object[]{aVar})).intValue() : aVar.h;
        }

        public static /* synthetic */ int i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("49f026e9", new Object[]{aVar})).intValue() : aVar.i;
        }

        public static /* synthetic */ String j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("313a1849", new Object[]{aVar}) : aVar.j;
        }

        public a(String str, int i) {
            this.b = i;
            this.f34395a = str;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("75d46d70", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f3087221", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4ce3dc62", new Object[]{this, new Integer(i)});
            }
            this.e = i;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a6bf46a3", new Object[]{this, new Integer(i)});
            }
            this.f = i;
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("9ab0e4", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public a e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5a761b25", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        public a f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b4518566", new Object[]{this, new Integer(i)});
            }
            this.i = i;
            return this;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3ca4736a", new Object[]{this, str});
            }
            this.j = str;
            return this;
        }

        public xnc a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (xnc) ipChange.ipc$dispatch("f0cda91", new Object[]{this}) : new xnc(this);
        }
    }
}
