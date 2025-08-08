package com.taobao.android.weex_ability;

import android.app.Application;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.b;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.o;
import com.taobao.orange.OrangeConfig;
import com.taobao.zcache.r;
import java.util.Map;
import tb.dpj;
import tb.jve;
import tb.jvf;
import tb.jvt;
import tb.kge;
import tb.riy;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static j f15926a;
    private Application b;
    private a c;

    static {
        kge.a(-1418808173);
    }

    public static j a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("44dc8bf", new Object[0]);
        }
        if (f15926a == null) {
            synchronized (j.class) {
                if (f15926a == null) {
                    f15926a = new j();
                }
            }
        }
        return f15926a;
    }

    private j() {
    }

    public Application b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("2271dcb8", new Object[]{this}) : this.b;
    }

    public e c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("964fb6a6", new Object[]{this});
        }
        a aVar = this.c;
        if (aVar != null) {
            return a.a(aVar);
        }
        return null;
    }

    public f d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("5f50ae06", new Object[]{this});
        }
        a aVar = this.c;
        if (aVar != null) {
            return a.b(aVar);
        }
        return null;
    }

    public b e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c2c62227", new Object[]{this});
        }
        a aVar = this.c;
        if (aVar != null) {
            return a.c(aVar);
        }
        return null;
    }

    private boolean a(e eVar) {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ef63468", new Object[]{this, eVar})).booleanValue();
        }
        if (Build.VERSION.SDK_INT <= 19) {
            return true;
        }
        try {
            if (eVar != null) {
                config = eVar.a("alimuise", "renderNodeDisable", "");
            } else {
                config = OrangeConfig.getInstance().getConfig("alimuise", "renderNodeDisable", "");
            }
            return StringUtils.equals(config, "true");
        } catch (Throwable unused) {
            return false;
        }
    }

    public void a(Application application, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("608be8f3", new Object[]{this, application, aVar});
            return;
        }
        this.b = application;
        this.c = aVar;
        try {
            r.a();
        } catch (Throwable th) {
            com.taobao.android.weex_framework.util.g.d(com.taobao.android.weex_framework.util.g.b(th));
        }
        c.a();
        o.a j = o.j();
        j.a(a.d(aVar));
        j.a(a.e(aVar) == null ? new dpj() : a.e(aVar));
        j.a(a.f(aVar));
        j.a(a.g(aVar) == null ? new h() : a.g(aVar));
        j.b(a.h(aVar));
        try {
            j.a(a.i(aVar) == null ? new i() : a.i(aVar));
        } catch (Throwable th2) {
            com.taobao.android.weex_framework.util.g.d(com.taobao.android.weex_framework.util.g.b(th2));
        }
        j.a(new g());
        j.a(a.j(aVar));
        j.c(!a(a.a(aVar)));
        a.k(aVar);
        j.a(a.l(aVar) == null ? g() : a.l(aVar));
        j.a(a.m(aVar) == null ? h() : a.m(aVar));
        j.a(a.n(aVar) == null ? i() : a.n(aVar));
        j.a(a.a(aVar));
        o a2 = j.a();
        a2.a(jvf.d());
        MUSEngine.initialize(application, a2);
        if (a.o(aVar) == null) {
            String h = android.taobao.windvane.config.a.a().h();
            String i = android.taobao.windvane.config.a.a().i();
            if (!StringUtils.isEmpty(h) && !StringUtils.isEmpty(i)) {
                a.a(aVar, " AliApp(" + h + "/" + i + riy.BRACKET_END_STR);
            }
        }
        if (a.h(aVar) && a.o(aVar) == null) {
            com.taobao.android.weex_framework.util.g.e("AliMuise.Config.userAgent 没有设置集团通用UA, 严重错误, 必须设置!!!");
        }
        if (a.o(aVar) != null) {
            String a3 = m.a("system", "userAgent");
            m.d().get("system").put("userAgent", a3 + " " + a.o(aVar));
            String a4 = m.a("userAgent");
            Map<String, Object> e = m.e();
            e.put("userAgent", a4 + " " + a.o(aVar));
        }
        if (a.p(aVar) != null) {
            m.e().putAll(a.p(aVar));
        }
        Map<String, Object> map = m.d().get(g4.a.f3423a);
        map.put("alimusGitHashTag", d.GIT_HASH_NAME);
        map.put("alimusVersion", "0.17.0.0-android");
    }

    private jve g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jve) ipChange.ipc$dispatch("3d307bdf", new Object[]{this});
        }
        try {
            return new jve();
        } catch (Throwable unused) {
            return null;
        }
    }

    private com.taobao.android.weex_framework.adapter.h h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.adapter.h) ipChange.ipc$dispatch("93877b4", new Object[]{this});
        }
        try {
            return new com.taobao.android.weex_ability.page.g();
        } catch (Throwable unused) {
            return null;
        }
    }

    private com.taobao.android.weex_framework.adapter.j i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.adapter.j) ipChange.ipc$dispatch("8c211f3", new Object[]{this});
        }
        try {
            return new com.taobao.android.weex_ability.page.h();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private com.taobao.android.weex_framework.adapter.d f15927a;
        private com.taobao.android.weex_framework.adapter.c b;
        private com.taobao.android.weex_framework.d c;
        private com.taobao.android.weex_framework.module.builtin.storage.b d;
        private e e;
        private f f;
        private com.taobao.android.weex_framework.adapter.i g;
        private b h;
        private com.taobao.android.weex_framework.adapter.a i;
        private jvt j;
        private com.taobao.android.weex_framework.adapter.h k;
        private boolean l;
        private String m;
        private boolean n;
        private Map<String, Object> o;
        private com.taobao.android.weex_framework.adapter.j p;

        static {
            kge.a(531649683);
        }

        public static /* synthetic */ e a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("b8382bde", new Object[]{aVar}) : aVar.e;
        }

        public static /* synthetic */ e a(a aVar, e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("82944326", new Object[]{aVar, eVar});
            }
            aVar.e = eVar;
            return eVar;
        }

        public static /* synthetic */ f a(a aVar, f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("e3e6dfe4", new Object[]{aVar, fVar});
            }
            aVar.f = fVar;
            return fVar;
        }

        public static /* synthetic */ b a(a aVar, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ca273dd4", new Object[]{aVar, bVar});
            }
            aVar.h = bVar;
            return bVar;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.adapter.a a(a aVar, com.taobao.android.weex_framework.adapter.a aVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.weex_framework.adapter.a) ipChange.ipc$dispatch("ea23c2c6", new Object[]{aVar, aVar2});
            }
            aVar.i = aVar2;
            return aVar2;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.adapter.c a(a aVar, com.taobao.android.weex_framework.adapter.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.weex_framework.adapter.c) ipChange.ipc$dispatch("5db906c2", new Object[]{aVar, cVar});
            }
            aVar.b = cVar;
            return cVar;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.adapter.d a(a aVar, com.taobao.android.weex_framework.adapter.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.weex_framework.adapter.d) ipChange.ipc$dispatch("9783a8c0", new Object[]{aVar, dVar});
            }
            aVar.f15927a = dVar;
            return dVar;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.adapter.h a(a aVar, com.taobao.android.weex_framework.adapter.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.weex_framework.adapter.h) ipChange.ipc$dispatch("7eae30b8", new Object[]{aVar, hVar});
            }
            aVar.k = hVar;
            return hVar;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.adapter.i a(a aVar, com.taobao.android.weex_framework.adapter.i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.weex_framework.adapter.i) ipChange.ipc$dispatch("b878d2b6", new Object[]{aVar, iVar});
            }
            aVar.g = iVar;
            return iVar;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.adapter.j a(a aVar, com.taobao.android.weex_framework.adapter.j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.weex_framework.adapter.j) ipChange.ipc$dispatch("f24374b4", new Object[]{aVar, jVar});
            }
            aVar.p = jVar;
            return jVar;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.d a(a aVar, com.taobao.android.weex_framework.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.weex_framework.d) ipChange.ipc$dispatch("98be4740", new Object[]{aVar, dVar});
            }
            aVar.c = dVar;
            return dVar;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.module.builtin.storage.b a(a aVar, com.taobao.android.weex_framework.module.builtin.storage.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.weex_framework.module.builtin.storage.b) ipChange.ipc$dispatch("603aa034", new Object[]{aVar, bVar});
            }
            aVar.d = bVar;
            return bVar;
        }

        public static /* synthetic */ String a(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d3556634", new Object[]{aVar, str});
            }
            aVar.m = str;
            return str;
        }

        public static /* synthetic */ Map a(a aVar, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("3085d98", new Object[]{aVar, map});
            }
            aVar.o = map;
            return map;
        }

        public static /* synthetic */ jvt a(a aVar, jvt jvtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jvt) ipChange.ipc$dispatch("e91cfa34", new Object[]{aVar, jvtVar});
            }
            aVar.j = jvtVar;
            return jvtVar;
        }

        public static /* synthetic */ boolean a(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8164a876", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.l = z;
            return z;
        }

        public static /* synthetic */ f b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("fa4f595c", new Object[]{aVar}) : aVar.f;
        }

        public static /* synthetic */ boolean b(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("66a61737", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.n = z;
            return z;
        }

        public static /* synthetic */ b c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d3880933", new Object[]{aVar}) : aVar.h;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.d d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.d) ipChange.ipc$dispatch("2e6d3688", new Object[]{aVar}) : aVar.c;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.adapter.c e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.adapter.c) ipChange.ipc$dispatch("19aecec8", new Object[]{aVar}) : aVar.b;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.module.builtin.storage.b f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.module.builtin.storage.b) ipChange.ipc$dispatch("1c2367cd", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.adapter.d g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.adapter.d) ipChange.ipc$dispatch("a4f15425", new Object[]{aVar}) : aVar.f15927a;
        }

        public static /* synthetic */ boolean h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e55c527f", new Object[]{aVar})).booleanValue() : aVar.l;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.adapter.i i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.adapter.i) ipChange.ipc$dispatch("3033d9fe", new Object[]{aVar}) : aVar.g;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.adapter.a j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.adapter.a) ipChange.ipc$dispatch("75d51ba5", new Object[]{aVar}) : aVar.i;
        }

        public static /* synthetic */ boolean k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb8bf1dc", new Object[]{aVar})).booleanValue() : aVar.n;
        }

        public static /* synthetic */ jvt l(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jvt) ipChange.ipc$dispatch("3664b407", new Object[]{aVar}) : aVar.j;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.adapter.h m(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.adapter.h) ipChange.ipc$dispatch("46b8e45b", new Object[]{aVar}) : aVar.k;
        }

        public static /* synthetic */ com.taobao.android.weex_framework.adapter.j n(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.adapter.j) ipChange.ipc$dispatch("8c5a2738", new Object[]{aVar}) : aVar.p;
        }

        public static /* synthetic */ String o(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e8dc20cc", new Object[]{aVar}) : aVar.m;
        }

        public static /* synthetic */ Map p(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("48358868", new Object[]{aVar}) : aVar.o;
        }

        public static C0615a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0615a) ipChange.ipc$dispatch("2195dfc5", new Object[0]) : new C0615a();
        }

        /* renamed from: com.taobao.android.weex_ability.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static class C0615a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private com.taobao.android.weex_framework.adapter.d f15928a;
            private com.taobao.android.weex_framework.adapter.c b;
            private com.taobao.android.weex_framework.d c;
            private com.taobao.android.weex_framework.module.builtin.storage.b d;
            private e e;
            private com.taobao.android.weex_framework.adapter.i f;
            private b g;
            private f h;
            private com.taobao.android.weex_framework.adapter.a i;
            private jvt j;
            private com.taobao.android.weex_framework.adapter.h k;
            private boolean l;
            private String m;
            private boolean n;
            private Map<String, Object> o;
            private com.taobao.android.weex_framework.adapter.j p;

            static {
                kge.a(336521322);
            }

            private C0615a() {
            }

            public a a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("27fe4aa2", new Object[]{this});
                }
                a aVar = new a();
                a.a(aVar, this.c);
                a.a(aVar, this.f15928a);
                a.a(aVar, this.b);
                a.a(aVar, this.d);
                a.a(aVar, this.l);
                a.a(aVar, this.e);
                a.a(aVar, this.f);
                a.a(aVar, this.g);
                a.a(aVar, this.h);
                a.a(aVar, this.m);
                a.b(aVar, this.n);
                a.a(aVar, this.i);
                a.a(aVar, this.j);
                a.a(aVar, this.k);
                a.a(aVar, this.o);
                a.a(aVar, this.p);
                return aVar;
            }

            public C0615a a(f fVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0615a) ipChange.ipc$dispatch("e0eaffe0", new Object[]{this, fVar});
                }
                this.h = fVar;
                return this;
            }

            public C0615a a(com.taobao.android.weex_framework.d dVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0615a) ipChange.ipc$dispatch("4394354e", new Object[]{this, dVar});
                }
                this.c = dVar;
                return this;
            }

            public C0615a a(com.taobao.android.weex_framework.adapter.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0615a) ipChange.ipc$dispatch("c72a8fb1", new Object[]{this, aVar});
                }
                this.i = aVar;
                return this;
            }

            public C0615a a(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0615a) ipChange.ipc$dispatch("9c09e3c9", new Object[]{this, new Boolean(z)});
                }
                this.l = z;
                return this;
            }

            public C0615a a(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0615a) ipChange.ipc$dispatch("f33980f", new Object[]{this, str});
                }
                this.m = str;
                return this;
            }

            public C0615a a(Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (C0615a) ipChange.ipc$dispatch("ebb695ba", new Object[]{this, map});
                }
                this.o = map;
                return this;
            }
        }
    }
}
