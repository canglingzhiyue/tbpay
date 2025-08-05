package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import tb.gbg;
import tb.kge;

/* loaded from: classes.dex */
public class DXRenderOptions {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final DXRenderOptions DEFAULT_PRERENDER_OPTIONS;
    public static final DXRenderOptions DEFAULT_PRERENDER_X_OPTIONS;
    public static final DXRenderOptions DEFAULT_RENDER_OPTIONS;
    public static final int NORMAL = 0;
    public static final int PRE_FETCH = 1;
    public static final int PRE_RENDER = 2;
    public static final int PRE_RENDER_X = 4;
    public static final int SIMPLE = 3;

    /* renamed from: a  reason: collision with root package name */
    private int f11777a;
    private int b;
    private ba c;
    @Deprecated
    private Object d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private Map<String, String> j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private bf p;
    private boolean q;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DXRenderType {
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        int i = this.f11777a;
        return i == 0 ? gbg.a() : i;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        int i = this.b;
        return i == 0 ? gbg.b() : i;
    }

    public ba c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ba) ipChange.ipc$dispatch("52b57bc9", new Object[]{this}) : this.c;
    }

    public Object d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("50c537a7", new Object[]{this}) : this.d;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.f;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.g;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.h;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.i;
    }

    public Map<String, String> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("db121866", new Object[]{this}) : this.j;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.k;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.q;
    }

    private DXRenderOptions(a aVar) {
        this.l = true;
        this.k = true;
        this.q = true;
        this.m = true;
        this.f11777a = a.a(aVar);
        this.b = a.b(aVar);
        this.c = a.c(aVar);
        this.d = a.d(aVar);
        this.e = a.e(aVar);
        this.f = a.f(aVar);
        this.h = a.g(aVar);
        this.i = a.h(aVar);
        this.g = a.i(aVar);
        this.j = a.j(aVar);
        this.k = a.k(aVar);
        this.q = a.l(aVar);
        this.l = a.m(aVar);
        this.n = aVar.m;
        this.m = a.n(aVar);
        this.o = a.o(aVar);
        this.p = a.p(aVar);
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.m;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : this.n;
    }

    static {
        kge.a(1369193409);
        DEFAULT_RENDER_OPTIONS = new a().a();
        DEFAULT_PRERENDER_OPTIONS = new a().c(2).e(9).a();
        DEFAULT_PRERENDER_X_OPTIONS = new a().c(4).e(9).a();
    }

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private ba c;
        private Object d;
        private boolean e;
        private boolean f;
        private int g;
        private Map<String, String> j;
        public boolean m;
        private bf p;
        private boolean k = true;
        private boolean q = true;
        private boolean l = true;
        private boolean n = true;
        private boolean o = false;

        /* renamed from: a  reason: collision with root package name */
        private int f11778a = gbg.a();
        private int b = gbg.b();
        private int h = 0;
        private int i = 9;

        static {
            kge.a(-1888501352);
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6abdc18e", new Object[]{aVar})).intValue() : aVar.f11778a;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("98965bed", new Object[]{aVar})).intValue() : aVar.b;
        }

        public static /* synthetic */ ba c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ba) ipChange.ipc$dispatch("108f82fa", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ Object d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("f11c0d7a", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ boolean e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("22202b1b", new Object[]{aVar})).booleanValue() : aVar.e;
        }

        public static /* synthetic */ boolean f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4ff8c57a", new Object[]{aVar})).booleanValue() : aVar.f;
        }

        public static /* synthetic */ int g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7dd15fc8", new Object[]{aVar})).intValue() : aVar.h;
        }

        public static /* synthetic */ int h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aba9fa27", new Object[]{aVar})).intValue() : aVar.i;
        }

        public static /* synthetic */ int i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d9829486", new Object[]{aVar})).intValue() : aVar.g;
        }

        public static /* synthetic */ Map j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("604f31a7", new Object[]{aVar}) : aVar.j;
        }

        public static /* synthetic */ boolean k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3533c955", new Object[]{aVar})).booleanValue() : aVar.k;
        }

        public static /* synthetic */ boolean l(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("630c63b4", new Object[]{aVar})).booleanValue() : aVar.q;
        }

        public static /* synthetic */ boolean m(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("90e4fe13", new Object[]{aVar})).booleanValue() : aVar.l;
        }

        public static /* synthetic */ boolean n(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bebd9872", new Object[]{aVar})).booleanValue() : aVar.n;
        }

        public static /* synthetic */ boolean o(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ec9632d1", new Object[]{aVar})).booleanValue() : aVar.o;
        }

        public static /* synthetic */ bf p(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (bf) ipChange.ipc$dispatch("91d99262", new Object[]{aVar}) : aVar.p;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5896318e", new Object[]{this, new Integer(i)});
            }
            this.f11778a = i;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("866ecbed", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public a a(ba baVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e81ceaf8", new Object[]{this, baVar});
            }
            this.c = baVar;
            return this;
        }

        public a a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f5d07077", new Object[]{this, obj});
            }
            this.d = obj;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("50b96b9f", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7e9205fe", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b447664c", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e22000ab", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        public a e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ff89b0a", new Object[]{this, new Integer(i)});
            }
            this.i = i;
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("19919c90", new Object[]{this, map});
            }
            this.j = map;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ac6aa05d", new Object[]{this, new Boolean(z)});
            }
            this.k = z;
            return this;
        }

        public a g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("63cd09d9", new Object[]{this, new Boolean(z)});
            }
            this.q = z;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("da433abc", new Object[]{this, new Boolean(z)});
            }
            this.l = z;
            return this;
        }

        @Deprecated
        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("81bd51b", new Object[]{this, new Boolean(z)});
            }
            this.n = z;
            return this;
        }

        @Deprecated
        public a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("35f46f7a", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }

        public a a(bf bfVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a06d2993", new Object[]{this, bfVar});
            }
            this.p = bfVar;
            return this;
        }

        public DXRenderOptions a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXRenderOptions) ipChange.ipc$dispatch("e6d13f8", new Object[]{this}) : new DXRenderOptions(this);
        }
    }

    public bf o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bf) ipChange.ipc$dispatch("c5ac20d8", new Object[]{this}) : this.p;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.l;
    }
}
