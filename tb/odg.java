package tb;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.common.SimpleEntry;
import java.util.Map;

/* loaded from: classes5.dex */
public class odg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f31940a;
    private static b b;
    private static o c;
    private static e d;
    private static h e;
    private static k f;
    private static a g;
    private static j h;
    private static n i;
    private static m j;
    private static d k;
    private static c l;
    private static q m;
    private static r n;
    private static p o;
    private static t p;
    private static s q;
    private static u r;

    /* loaded from: classes5.dex */
    public interface a {
        void a(String str, Context context);
    }

    /* loaded from: classes5.dex */
    public interface b {
        Application a();
    }

    /* loaded from: classes5.dex */
    public interface c {
        void a(String str, Object obj, Map<String, String> map);

        void a(String str, String str2, Object obj, String... strArr);

        void a(String str, String str2, String str3, View view, String... strArr);

        void a(String str, String str2, String str3, String... strArr);

        void b(String str, String str2, Object obj, String... strArr);

        void b(String str, String str2, String str3, View view, String... strArr);
    }

    /* loaded from: classes5.dex */
    public interface d {
        boolean a(String str, int i, int i2, l lVar);

        boolean a(String str, Map<String, String> map, g gVar);

        boolean a(String str, g gVar);

        boolean a(String str, i iVar);
    }

    /* loaded from: classes5.dex */
    public interface e {
        lqv a();

        boolean a(Context context);

        boolean b(Context context);

        boolean c(Context context);
    }

    /* loaded from: classes5.dex */
    public interface g {
        void a();

        void a(String str, String str2);
    }

    /* loaded from: classes5.dex */
    public interface h {
        String a(Context context);

        String b(Context context);

        String c(Context context);
    }

    /* loaded from: classes5.dex */
    public interface i {
        void a(String str, String str2);

        void a(boolean z);
    }

    /* loaded from: classes5.dex */
    public interface j {
        boolean a(Context context, eyx eyxVar, JSONObject jSONObject, g gVar);

        boolean b(Context context, eyx eyxVar, JSONObject jSONObject, g gVar);
    }

    /* loaded from: classes5.dex */
    public interface k {
        String a();
    }

    /* loaded from: classes5.dex */
    public interface l {
        void a(String str, String str2);

        void a(Map<String, Object> map);
    }

    /* loaded from: classes5.dex */
    public interface m {
        void a(SimpleEntry<String, String> simpleEntry);

        void a(String... strArr);
    }

    /* loaded from: classes5.dex */
    public interface n {
        int a(String str, String str2, int i);

        String a(String str, String str2);

        boolean a();

        boolean b();
    }

    /* loaded from: classes5.dex */
    public interface o {
        boolean a(Context context);
    }

    /* loaded from: classes5.dex */
    public interface p {
        String a();
    }

    /* loaded from: classes5.dex */
    public interface q {
        String a(int i);

        boolean a();

        String b();
    }

    /* loaded from: classes5.dex */
    public interface r {
        String a();

        void a(boolean z);

        String b();

        boolean c();
    }

    /* loaded from: classes5.dex */
    public interface s {
        String a();

        String b();
    }

    /* loaded from: classes5.dex */
    public interface t {
        Drawable a();

        Drawable a(boolean z, boolean z2);

        iyw a(Context context, eyx eyxVar, eyq eyqVar);

        void a(Context context, String str);

        int b();

        Drawable b(boolean z, boolean z2);

        Drawable c();

        Drawable d();

        Drawable e();
    }

    /* loaded from: classes5.dex */
    public interface u {
        boolean a(String str);
    }

    public static /* synthetic */ a a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4cd9774e", new Object[]{aVar});
        }
        g = aVar;
        return aVar;
    }

    public static /* synthetic */ b a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3b5c7dee", new Object[]{bVar});
        }
        b = bVar;
        return bVar;
    }

    public static /* synthetic */ c a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("29df848e", new Object[]{cVar});
        }
        l = cVar;
        return cVar;
    }

    public static /* synthetic */ d a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("18628b2e", new Object[]{dVar});
        }
        k = dVar;
        return dVar;
    }

    public static /* synthetic */ e a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("6e591ce", new Object[]{eVar});
        }
        d = eVar;
        return eVar;
    }

    public static /* synthetic */ h a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("d26ea5ae", new Object[]{hVar});
        }
        e = hVar;
        return hVar;
    }

    public static /* synthetic */ j a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("af74b2ee", new Object[]{jVar});
        }
        h = jVar;
        return jVar;
    }

    public static /* synthetic */ k a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("9df7b98e", new Object[]{kVar});
        }
        f = kVar;
        return kVar;
    }

    public static /* synthetic */ m a(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("7afdc6ce", new Object[]{mVar});
        }
        j = mVar;
        return mVar;
    }

    public static /* synthetic */ n a(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("6980cd6e", new Object[]{nVar});
        }
        i = nVar;
        return nVar;
    }

    public static /* synthetic */ o a(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o) ipChange.ipc$dispatch("5803d40e", new Object[]{oVar});
        }
        c = oVar;
        return oVar;
    }

    public static /* synthetic */ p a(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("4686daae", new Object[]{pVar});
        }
        o = pVar;
        return pVar;
    }

    public static /* synthetic */ q a(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("3509e14e", new Object[]{qVar});
        }
        m = qVar;
        return qVar;
    }

    public static /* synthetic */ r a(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r) ipChange.ipc$dispatch("238ce7ee", new Object[]{rVar});
        }
        n = rVar;
        return rVar;
    }

    public static /* synthetic */ s a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("120fee8e", new Object[]{sVar});
        }
        q = sVar;
        return sVar;
    }

    public static /* synthetic */ t a(t tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t) ipChange.ipc$dispatch("92f52e", new Object[]{tVar});
        }
        p = tVar;
        return tVar;
    }

    public static /* synthetic */ u a(u uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("ef15fbce", new Object[]{uVar});
        }
        r = uVar;
        return uVar;
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        f31940a = z;
        return z;
    }

    public static /* synthetic */ boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : f31940a;
    }

    public static synchronized boolean a() {
        synchronized (odg.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
            }
            return f31940a;
        }
    }

    public static b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5137428d", new Object[0]) : b;
    }

    public static o c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("33150dbf", new Object[0]) : c;
    }

    public static e d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("14f2d628", new Object[0]) : d;
    }

    public static h e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("f6d0a024", new Object[0]) : e;
    }

    public static k f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("d8ae6a20", new Object[0]) : f;
    }

    public static a g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ba8c3289", new Object[0]) : g;
    }

    public static j h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("9c69fd3f", new Object[0]) : h;
    }

    public static n i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("7e47c75a", new Object[0]) : i;
    }

    public static m j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("602590da", new Object[0]) : j;
    }

    public static d k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("42035962", new Object[0]) : k;
    }

    public static q o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (q) ipChange.ipc$dispatch("c97a8171", new Object[0]) : m;
    }

    public static c l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("23e122e2", new Object[0]) : l;
    }

    public static r p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("ab584b2f", new Object[0]) : n;
    }

    public static p q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("8d361490", new Object[0]) : o;
    }

    public static t r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (t) ipChange.ipc$dispatch("6f13deab", new Object[0]) : p;
    }

    public static s s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("50f1a82b", new Object[0]) : q;
    }

    public static u t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (u) ipChange.ipc$dispatch("32cf7208", new Object[0]) : r;
    }

    static {
        kge.a(312882137);
        m();
    }

    public static boolean m() {
        if (!a()) {
            try {
                Class.forName("com.taobao.android.detail.alittdetail.TaobaoEvnInitializer").getDeclaredMethod("initialize", new Class[0]).invoke(null, new Object[0]);
                return true;
            } catch (Throwable th) {
                com.taobao.android.detail.ttdetail.utils.i.a("PlatformEvn", "initTaobaoEvn() error", th);
            }
        }
        return false;
    }

    public static boolean a(Context context, eyx eyxVar) {
        try {
            Class.forName("com.taobao.android.detail.alittdetail.TaobaoEvnInitializer").getDeclaredMethod("overrideOrImplementDefaultBehaviors", Context.class, eyx.class).invoke(null, context, eyxVar);
            return true;
        } catch (Throwable th) {
            com.taobao.android.detail.ttdetail.utils.i.a("PlatformEvn", "defaultInitTaobaoBehaviors() error", th);
            return false;
        }
    }

    /* loaded from: classes5.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private b f31941a;
        private o b;
        private e c;
        private h d;
        private k e;
        private a f;
        private j g;
        private n h;
        private m i;
        private d j;
        private c k;
        private q l;
        private r m;
        private p n;
        private t o;
        private s p;
        private u q;

        static {
            kge.a(1391773303);
        }

        public f a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("3b5c7e6a", new Object[]{this, bVar});
            }
            this.f31941a = bVar;
            return this;
        }

        public f a(o oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("5803d2f7", new Object[]{this, oVar});
            }
            this.b = oVar;
            return this;
        }

        public f a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("6e591ed", new Object[]{this, eVar});
            }
            this.c = eVar;
            return this;
        }

        public f a(h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("d26ea570", new Object[]{this, hVar});
            }
            this.d = hVar;
            return this;
        }

        public f a(k kVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("9df7b8f3", new Object[]{this, kVar});
            }
            this.e = kVar;
            return this;
        }

        public f a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("4cd977e9", new Object[]{this, aVar});
            }
            this.f = aVar;
            return this;
        }

        public f a(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("af74b272", new Object[]{this, jVar});
            }
            this.g = jVar;
            return this;
        }

        public f a(n nVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("6980cc76", new Object[]{this, nVar});
            }
            this.h = nVar;
            return this;
        }

        public f a(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("7afdc5f5", new Object[]{this, mVar});
            }
            this.i = mVar;
            return this;
        }

        public f a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("18628b6c", new Object[]{this, dVar});
            }
            this.j = dVar;
            return this;
        }

        public f a(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("3509dff9", new Object[]{this, qVar});
            }
            this.l = qVar;
            return this;
        }

        public f a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("29df84eb", new Object[]{this, cVar});
            }
            this.k = cVar;
            return this;
        }

        public f a(r rVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("238ce67a", new Object[]{this, rVar});
            }
            this.m = rVar;
            return this;
        }

        public f a(p pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("4686d978", new Object[]{this, pVar});
            }
            this.n = pVar;
            return this;
        }

        public f a(t tVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("92f37c", new Object[]{this, tVar});
            }
            this.o = tVar;
            return this;
        }

        public f a(s sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("120fecfb", new Object[]{this, sVar});
            }
            this.p = sVar;
            return this;
        }

        public f a(u uVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("ef15f9fd", new Object[]{this, uVar});
            }
            this.q = uVar;
            return this;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (odg.n()) {
            } else {
                odg.a(true);
                b();
                odg.a(this.f31941a);
                odg.a(this.b);
                odg.a(this.c);
                odg.a(this.d);
                odg.a(this.e);
                odg.a(this.f);
                odg.a(this.g);
                odg.a(this.h);
                odg.a(this.i);
                odg.a(this.j);
                odg.a(this.l);
                odg.a(this.k);
                odg.a(this.m);
                odg.a(this.n);
                odg.a(this.o);
                odg.a(this.p);
                odg.a(this.q);
            }
        }

        private void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (this.f31941a == null) {
                throw new IllegalArgumentException("must set AndroidEvn with builder");
            } else {
                if (this.b == null) {
                    throw new IllegalArgumentException("must set VideoEvn with builder");
                }
                if (this.c == null) {
                    throw new IllegalArgumentException("must set DeviceEvn with builder");
                }
                if (this.d == null) {
                    throw new IllegalArgumentException("must set LocationEvn with builder");
                }
                if (this.e == null) {
                    throw new IllegalArgumentException("must set RuntimeEvn with builder");
                }
                if (this.f == null) {
                    throw new IllegalArgumentException("must set ABEvn with builder");
                }
                if (this.g == null) {
                    throw new IllegalArgumentException("must set ReminderEvn with builder");
                }
                if (this.h == null) {
                    throw new IllegalArgumentException("must set ThemeEvn with builder");
                }
                if (this.i == null) {
                    throw new IllegalArgumentException("must set TCacheEvn with builder");
                }
                if (this.j == null) {
                    throw new IllegalArgumentException("must set CollectorEvn with builder");
                }
                if (this.l == null) {
                    throw new IllegalArgumentException("must set LocalizationEvn with builder");
                }
                if (this.k == null) {
                    throw new IllegalArgumentException("must set BehaviorTrackerEvn with builder");
                }
                if (this.m == null) {
                    throw new IllegalArgumentException("must set LoginEvn with builder");
                }
                if (this.n == null) {
                    throw new IllegalArgumentException("must set ConfigSpaceEvn with builder");
                }
                if (this.p == null) {
                    throw new IllegalArgumentException("must set SpmEvn with builder");
                }
                if (this.q == null) {
                    throw new IllegalArgumentException("must set BizContextInstaller with builder");
                }
            }
        }
    }
}
