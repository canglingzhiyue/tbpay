package com.alibaba.android.split.core.splitinstall;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import tb.asi;
import tb.bgm;
import tb.bgn;
import tb.bgq;
import tb.bgr;
import tb.bhd;
import tb.bhe;
import tb.bhf;
import tb.bhg;
import tb.kge;

/* loaded from: classes.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Set<String> f2468a;
    private com.alibaba.android.split.g b;
    private asi c;
    private boolean d;

    static {
        kge.a(1017777946);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("f70adf46", new Object[0]) : new a();
    }

    private j(a aVar) {
        g a2;
        this.b = new com.alibaba.android.split.b();
        this.c = (asi) com.alibaba.android.split.a.a((Class<? extends Object>) asi.class, new Object[0]);
        this.d = a.a(aVar);
        try {
            a2 = this.c.a(com.alibaba.android.split.k.a().b().t());
        } catch (Exception e) {
            e.printStackTrace();
            a2 = this.c.a(com.android.tools.ir.runtime.d.b().a());
        }
        this.f2468a = new HashSet(a.b(aVar));
        if (a.c(aVar).size() > 0) {
            for (final bhf bhfVar : a.c(aVar)) {
                if (this.b.b(bhfVar.a()) != null) {
                    bhfVar.b(this.b.b(bhfVar.a()));
                    a2.a(bhfVar);
                    String a3 = this.b.a(bhfVar.a());
                    HashSet hashSet = new HashSet();
                    if (!StringUtils.isEmpty(a3)) {
                        bhfVar.a(a3);
                        hashSet.add(a3);
                        hashSet.addAll(this.b.g(a3));
                    }
                    if (StringUtils.isEmpty(a3) || com.alibaba.android.split.p.a().a().containsAll(hashSet)) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alibaba.android.split.core.splitinstall.j.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange = $ipChange;
                                if (ipChange instanceof IpChange) {
                                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    new bgq(bhfVar).b();
                                }
                            }
                        });
                    } else {
                        bhfVar.a(a3);
                        this.f2468a.add(a3);
                    }
                }
            }
        }
        if (a.d(aVar).size() > 0) {
            for (final bhd bhdVar : a.d(aVar)) {
                String d = this.b.d(bhdVar.a());
                a2.a(bhdVar);
                HashSet hashSet2 = new HashSet();
                if (!StringUtils.isEmpty(d)) {
                    bhdVar.a(d);
                    hashSet2.add(d);
                    hashSet2.addAll(this.b.g(d));
                }
                if (StringUtils.isEmpty(d) || com.alibaba.android.split.p.a().a().containsAll(hashSet2)) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alibaba.android.split.core.splitinstall.j.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                new bgm(bhdVar).a();
                            }
                        }
                    });
                } else if (!StringUtils.isEmpty(d)) {
                    bhdVar.a(d);
                    this.f2468a.add(bhdVar.d());
                }
            }
        }
        if (a.e(aVar).size() > 0) {
            for (final bhg bhgVar : a.e(aVar)) {
                if (StringUtils.isEmpty(bhgVar.d())) {
                    a2.a(bhgVar);
                    String c = this.b.c(bhgVar.a());
                    HashSet hashSet3 = new HashSet();
                    if (!StringUtils.isEmpty(c)) {
                        bhgVar.a(c);
                        hashSet3.add(c);
                        hashSet3.addAll(this.b.g(c));
                    }
                    if (StringUtils.isEmpty(c) || com.alibaba.android.split.p.a().a().containsAll(hashSet3)) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alibaba.android.split.core.splitinstall.j.3
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange = $ipChange;
                                if (ipChange instanceof IpChange) {
                                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    new bgr(bhgVar).a();
                                }
                            }
                        });
                    } else if (!StringUtils.isEmpty(c)) {
                        this.f2468a.add(c);
                        bhgVar.a(this.b.d(bhgVar.a()));
                    }
                }
            }
        }
        if (a.f(aVar).size() > 0) {
            for (final bhe bheVar : a.f(aVar)) {
                a2.a(bheVar);
                if (StringUtils.isEmpty(bheVar.d())) {
                    String f = this.b.f(bheVar.a());
                    HashSet hashSet4 = new HashSet();
                    if (!StringUtils.isEmpty(f)) {
                        bheVar.a(f);
                        hashSet4.add(f);
                        hashSet4.addAll(this.b.g(f));
                    }
                    if (StringUtils.isEmpty(f) || com.alibaba.android.split.p.a().a().containsAll(hashSet4)) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alibaba.android.split.core.splitinstall.j.4
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange = $ipChange;
                                if (ipChange instanceof IpChange) {
                                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    new bgn(bheVar).a();
                                }
                            }
                        });
                    } else if (!StringUtils.isEmpty(f)) {
                        this.f2468a.add(f);
                        bheVar.a(f);
                    }
                }
            }
        }
        if (a.g(aVar) && a.h(aVar) != null) {
            for (String str : this.f2468a) {
                a2.a(str, a.h(aVar));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.f2468a) {
            if (this.b.g(str2) != null && this.b.g(str2).size() > 0) {
                arrayList.addAll(this.b.g(str2));
            }
        }
        this.f2468a.addAll(arrayList);
        Iterator<String> it = this.f2468a.iterator();
        while (it.hasNext()) {
            if (((com.alibaba.android.split.s) com.alibaba.android.split.a.a((Class<? extends Object>) com.alibaba.android.split.s.class, new Object[0])).a(it.next()) == null) {
                it.remove();
            }
        }
    }

    public List<String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : new ArrayList(this.f2468a);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : String.format("SplitInstallRequest{modulesNames=%s}", this.f2468a);
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final List f2473a;
        private final List<bhf> b;
        private final List<bhd> c;
        private final List<bhg> d;
        private final List<bhe> e;
        private boolean f;
        private com.alibaba.android.split.ui.c g;
        private boolean h;

        static {
            kge.a(281357297);
        }

        public static /* synthetic */ boolean a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bdda5ca", new Object[]{aVar})).booleanValue() : aVar.h;
        }

        public static /* synthetic */ List b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("cb2cb742", new Object[]{aVar}) : aVar.f2473a;
        }

        public static /* synthetic */ List c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("bc7e46c3", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ List d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("adcfd644", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ List e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9f2165c5", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ List f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9072f546", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ boolean g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8829d84", new Object[]{aVar})).booleanValue() : aVar.f;
        }

        public static /* synthetic */ com.alibaba.android.split.ui.c h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.alibaba.android.split.ui.c) ipChange.ipc$dispatch("e606f548", new Object[]{aVar}) : aVar.g;
        }

        private a() {
            this.f2473a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("aefe4310", new Object[]{this, str});
            }
            this.f2473a.add(str);
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f0f82ce9", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public a a(bhe bheVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f16f3e77", new Object[]{this, bheVar});
            }
            this.e.add(bheVar);
            return this;
        }

        public a a(bhf bhfVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1f47d8d6", new Object[]{this, bhfVar});
            }
            this.b.add(bhfVar);
            return this;
        }

        public a a(bhd bhdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c396a418", new Object[]{this, bhdVar});
            }
            this.c.add(bhdVar);
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d6dcae4a", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a a(com.alibaba.android.split.ui.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("53782f37", new Object[]{this, cVar});
            }
            this.g = cVar;
            return this;
        }

        public j a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("79ff3663", new Object[]{this}) : new j(this);
        }
    }
}
