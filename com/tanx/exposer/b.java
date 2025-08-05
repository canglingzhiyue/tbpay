package com.tanx.exposer;

import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.achieve.AdMonitorType;
import java.util.Arrays;
import java.util.List;
import tb.dgm;
import tb.dgq;
import tb.dgs;
import tb.dgw;
import tb.dgy;
import tb.dgz;
import tb.dha;
import tb.kge;

/* loaded from: classes4.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f8159a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final List<AdMonitorType> e;
    private final dgs f;
    private final dgz g;
    private final dgm h;
    private boolean i;
    private final String j;
    private final String k;

    static {
        kge.a(-1872856178);
    }

    public b(a aVar) {
        this.f8159a = a.a(aVar);
        this.b = a.b(aVar);
        this.c = a.c(aVar);
        this.d = a.d(aVar);
        this.e = a.e(aVar);
        this.f = new dgs(a.f(aVar));
        this.g = new dgz(a.g(aVar));
        this.h = a.h(aVar);
        this.i = a.i(aVar);
        this.j = a.j(aVar);
        this.k = a.k(aVar);
        dha.a(a.l(aVar));
        dgy.a(this.f8159a);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.d;
    }

    public dgq d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dgq) ipChange.ipc$dispatch("26189aad", new Object[]{this}) : this.f;
    }

    public dgz e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dgz) ipChange.ipc$dispatch("2dca4123", new Object[]{this}) : this.g;
    }

    public dgm f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dgm) ipChange.ipc$dispatch("357be4ef", new Object[]{this}) : this.h;
    }

    public List<AdMonitorType> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this}) : this.e;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.i;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.j;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.k;
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final dgq f;
        private final dgw g;
        private dgm h;
        private String j;
        private String k;
        private boolean l;

        /* renamed from: a  reason: collision with root package name */
        private int f8160a = dgy.a();
        private boolean b = true;
        private boolean c = true;
        private int d = 5;
        private List<AdMonitorType> e = Arrays.asList(AdMonitorType.CLICK, AdMonitorType.EXPOSE, AdMonitorType.INTERACT);
        private boolean i = false;

        static {
            kge.a(2119165029);
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b3a1cf56", new Object[]{aVar})).intValue() : aVar.f8160a;
        }

        public static /* synthetic */ boolean b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ecf2e028", new Object[]{aVar})).booleanValue() : aVar.b;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2643f0e9", new Object[]{aVar})).booleanValue() : aVar.c;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f950199", new Object[]{aVar})).intValue() : aVar.d;
        }

        public static /* synthetic */ List e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("229c500", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ dgq f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dgq) ipChange.ipc$dispatch("29c1dbd0", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ dgw g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dgw) ipChange.ipc$dispatch("66e1a0a9", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ dgm h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dgm) ipChange.ipc$dispatch("a4016392", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ boolean i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7e2a556f", new Object[]{aVar})).booleanValue() : aVar.i;
        }

        public static /* synthetic */ String j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4a2bf4", new Object[]{aVar}) : aVar.j;
        }

        public static /* synthetic */ String k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c3369553", new Object[]{aVar}) : aVar.k;
        }

        public static /* synthetic */ boolean l(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a1d87b2", new Object[]{aVar})).booleanValue() : aVar.l;
        }

        public a(dgq dgqVar, dgw dgwVar) {
            this.f = dgqVar;
            this.g = dgwVar;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f0f825d6", new Object[]{this, new Integer(i)});
            }
            this.f8160a = i;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ad12a2a5", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e663b366", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("2a493697", new Object[]{this, new Integer(i)});
            }
            this.d = i;
            return this;
        }

        public a a(List<AdMonitorType> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bad432d8", new Object[]{this, list});
            }
            this.e = list;
            return this;
        }

        public a a(dgm dgmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("76e3e903", new Object[]{this, dgmVar});
            }
            this.h = dgmVar;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1fb4c427", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fd10d295", new Object[]{this, str, str2});
            }
            this.j = str;
            this.k = str2;
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5905d4e8", new Object[]{this, new Boolean(z)});
            }
            this.l = z;
            return this;
        }

        public b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ec9bb306", new Object[]{this}) : new b(this);
        }
    }
}
