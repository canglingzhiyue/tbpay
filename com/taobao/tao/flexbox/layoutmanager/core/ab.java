package com.taobao.tao.flexbox.layoutmanager.core;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.SparseArray;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.flexa.compat.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.d;
import com.taobao.tao.flexbox.layoutmanager.component.TabBarControllerComponent;
import com.taobao.tao.flexbox.layoutmanager.container.m;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ac;
import com.taobao.tao.flexbox.layoutmanager.core.af;
import com.taobao.tao.flexbox.layoutmanager.core.h;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate;
import com.uc.webview.export.media.MessageID;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import tb.acg;
import tb.drd;
import tb.kge;
import tb.oea;
import tb.oeb;
import tb.oec;
import tb.oge;
import tb.ogf;
import tb.ogg;
import tb.ogh;
import tb.ogt;
import tb.ogu;
import tb.ogv;
import tb.ohc;
import tb.ohd;
import tb.ohg;
import tb.ohh;
import tb.ohk;
import tb.tjy;

/* loaded from: classes8.dex */
public class ab {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMMIT_MODE_APPEND = "append";
    public static final String COMMIT_MODE_IGNORE_LIST = "ignoredlist";
    public static final String COMMIT_MODE_LIST_DATASETCHANGE = "list-datasetchange";
    public static final String COMMIT_MODE_NONE = "none";
    public static final String LAYOUT_STRATEGY_KEY = "kTNodeRenderOptionLocalFirst";
    public static final int LAYOUT_STRATEGY_LOCAL = 0;
    public static final int LAYOUT_STRATEGY_NETWORK = 1;
    public static final int LAYOUT_STRATEGY_UNSET = -1;
    private static List<b> P;
    private static AtomicInteger S;

    /* renamed from: a  reason: collision with root package name */
    public static Context f20303a;
    public static boolean b;
    private static final List<ab> i;
    private k A;
    private g B;
    private TNodeView C;
    private n D;
    private com.taobao.tao.flexbox.layoutmanager.animation.shareelement.b E;
    private int F;
    private ohg.a G;
    private boolean H;
    private h.a I;
    private boolean J;
    private oge K;
    private Handler L;
    private Runnable M;
    private final HashMap<String, Integer> N;
    private Map<String, PreloadDelegate.b> O;
    private SparseArray<Object> Q;
    private drd R;
    private String T;
    private com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t U;
    public volatile boolean c;
    public List<s> d;
    public List<s> e;
    public e f;
    public SparseArray<aa> g;
    public Context h;
    private d.a j;
    private Map<String, Integer> k;
    private HashMap<String, Class> l;
    private aa m;
    private final List<aa> n;
    private com.taobao.tao.flexbox.layoutmanager.ac.g o;
    private int p;
    private boolean q;
    private Boolean r;
    private boolean s;
    private boolean t;
    private ComponentCallbacks u;
    private Object v;
    private ac.a w;
    private String x;
    private Object y;
    private JSONObject z;

    /* loaded from: classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f20317a;
        public int b;
        public final ab c;
        public final String d;
        public final aa e;
        public final Object f;
        public final g g;
        public final boolean h;
        public final Object i;
        public final boolean j;
        public final String k;
        public final long l;
        public final g.c m;

        static {
            kge.a(315639397);
        }

        public a(g.c cVar, String str, long j, ab abVar, String str2, aa aaVar, Object obj, g gVar, Object obj2, boolean z) {
            this.m = cVar;
            this.c = abVar;
            this.d = str2;
            this.e = aaVar;
            this.f = obj;
            this.g = gVar;
            aa aaVar2 = this.e;
            boolean z2 = false;
            boolean z3 = true;
            if (aaVar2 == null || aaVar2.J() != null) {
                if (abVar.A() != null && abVar.A().x() != null) {
                    z3 = false;
                }
                this.h = z3;
            } else {
                this.h = this.e.x() == null ? true : z2;
            }
            this.j = z;
            this.i = obj2;
            this.k = str;
            this.l = j;
        }
    }

    /* loaded from: classes8.dex */
    public interface b {
    }

    /* loaded from: classes8.dex */
    public interface c {
        boolean isAlive();

        boolean isDestroy();
    }

    /* loaded from: classes8.dex */
    public interface e {
        void a(String str, s sVar);

        void b(String str, s sVar);
    }

    /* loaded from: classes8.dex */
    public interface g {
        void a(aa aaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes8.dex */
    public interface i {
        void a();
    }

    /* loaded from: classes8.dex */
    public interface j extends g {
        void b(aa aaVar);
    }

    public static /* synthetic */ List J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("92ebc656", new Object[0]) : P;
    }

    public static /* synthetic */ aa a(ab abVar, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("d40aec7", new Object[]{abVar, aaVar});
        }
        abVar.m = aaVar;
        return aaVar;
    }

    public static /* synthetic */ aa a(ab abVar, aa aaVar, h hVar, g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("c7b17e00", new Object[]{abVar, aaVar, hVar, gVar}) : abVar.a(aaVar, hVar, gVar);
    }

    public static /* synthetic */ g a(ab abVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("a4994307", new Object[]{abVar, gVar});
        }
        abVar.B = gVar;
        return gVar;
    }

    public static /* synthetic */ n a(ab abVar, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("1097df15", new Object[]{abVar, nVar});
        }
        abVar.D = nVar;
        return nVar;
    }

    public static /* synthetic */ List a(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7ea259b8", new Object[]{abVar}) : abVar.n;
    }

    public static /* synthetic */ void a(ab abVar, long j2, h hVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a9c41c", new Object[]{abVar, new Long(j2), hVar, gVar});
        } else {
            abVar.a(j2, hVar, gVar);
        }
    }

    public static /* synthetic */ void a(ab abVar, g.c cVar, String str, long j2, aa aaVar, String str2, Object obj, g gVar, Object obj2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b381037c", new Object[]{abVar, cVar, str, new Long(j2), aaVar, str2, obj, gVar, obj2, new Boolean(z)});
        } else {
            abVar.a(cVar, str, j2, aaVar, str2, obj, gVar, obj2, z);
        }
    }

    public static /* synthetic */ void a(ab abVar, aa aaVar, String str, Object obj, g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea35213", new Object[]{abVar, aaVar, str, obj, gVar, new Boolean(z)});
        } else {
            abVar.b(aaVar, str, obj, gVar, z);
        }
    }

    public static /* synthetic */ void a(ab abVar, h hVar, long j2, aa aaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43424c9a", new Object[]{abVar, hVar, new Long(j2), aaVar, new Boolean(z)});
        } else {
            abVar.a(hVar, j2, aaVar, z);
        }
    }

    public static /* synthetic */ void a(ab abVar, h hVar, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b578ec5a", new Object[]{abVar, hVar, aaVar});
        } else {
            abVar.a(hVar, aaVar);
        }
    }

    public static /* synthetic */ void a(ab abVar, String str, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43567ee1", new Object[]{abVar, str, aaVar});
        } else {
            abVar.a(str, aaVar);
        }
    }

    public static /* synthetic */ void a(ab abVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba97a405", new Object[]{abVar, new Boolean(z)});
        } else {
            abVar.b(z);
        }
    }

    public static /* synthetic */ boolean a(ab abVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7cbaa0bd", new Object[]{abVar, str})).booleanValue() : abVar.g(str);
    }

    public static /* synthetic */ int b(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aca8c263", new Object[]{abVar})).intValue();
        }
        int i2 = abVar.F;
        abVar.F = i2 + 1;
        return i2;
    }

    public static /* synthetic */ void b(ab abVar, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c043858", new Object[]{abVar, aaVar});
        } else {
            abVar.e(aaVar);
        }
    }

    public static /* synthetic */ void b(ab abVar, h hVar, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee01ba5b", new Object[]{abVar, hVar, aaVar});
        } else {
            abVar.b(hVar, aaVar);
        }
    }

    public static /* synthetic */ void b(ab abVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e0c303a", new Object[]{abVar, str});
        } else {
            abVar.f(str);
        }
    }

    public static /* synthetic */ n c(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("6194e3b", new Object[]{abVar}) : abVar.D;
    }

    public static /* synthetic */ void c(ab abVar, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abbb6c59", new Object[]{abVar, aaVar});
        } else {
            abVar.f(aaVar);
        }
    }

    public static /* synthetic */ aa d(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("9d92150c", new Object[]{abVar}) : abVar.m;
    }

    public static /* synthetic */ void d(ab abVar, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db72a05a", new Object[]{abVar, aaVar});
        } else {
            abVar.g(aaVar);
        }
    }

    public static /* synthetic */ void e(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("774a1bb3", new Object[]{abVar});
        } else {
            abVar.P();
        }
    }

    public static /* synthetic */ com.taobao.tao.flexbox.layoutmanager.ac.g f(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.ac.g) ipChange.ipc$dispatch("cc0d0b02", new Object[]{abVar}) : abVar.o;
    }

    public static /* synthetic */ Runnable g(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("845e503f", new Object[]{abVar}) : abVar.M;
    }

    public static /* synthetic */ Handler h(ab abVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("d7afba10", new Object[]{abVar}) : abVar.L;
    }

    static {
        kge.a(1534084913);
        S = new AtomicInteger(0);
        b = false;
        i = new ArrayList();
        P = null;
    }

    public static synchronized void a(Context context) {
        synchronized (ab.class) {
            if (f20303a == null) {
                f20303a = context.getApplicationContext();
                ogh.a();
                try {
                    try {
                        ohc.a(TBPlayerConst.TBPlayerMethodSetup, (Class) Class.forName("com.taobao.android.layoutmanager.LayoutManagerInitializer"), (Class<?>[]) new Class[0]).invoke(null, new Object[0]);
                    } catch (ClassNotFoundException e2) {
                        e2.printStackTrace();
                    } catch (IllegalAccessException e3) {
                        e3.printStackTrace();
                    }
                } catch (InvocationTargetException e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    public static Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("75941360", new Object[0]);
        }
        Context context = f20303a;
        return context != null ? context : acg.a();
    }

    public static void a(String str, Class<? extends Component> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7af6b54b", new Object[]{str, cls});
        } else {
            com.taobao.tao.flexbox.layoutmanager.core.e.a(str, cls);
        }
    }

    public static void b(String str, Class<? extends Object> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d214a62a", new Object[]{str, cls});
        } else {
            com.taobao.tao.flexbox.layoutmanager.ac.e.a(str, cls);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            com.taobao.tao.flexbox.layoutmanager.core.e.a(str, str2);
        }
    }

    public double b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83d7", new Object[]{this})).doubleValue();
        }
        if (c() == null) {
            return 1.0d;
        }
        k c2 = c();
        if (!c2.c()) {
            return 1.0d;
        }
        if (c2.d() != 1.0d) {
            return c2.d();
        }
        return com.taobao.tao.flexbox.layoutmanager.adapter.a.a().z().a(l());
    }

    public k c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("494cd797", new Object[]{this}) : this.A;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    /* loaded from: classes8.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f20321a;
        public final String b;
        public String c;
        public String d;
        public Map e;
        public boolean f;
        public ab g;
        public final boolean k;
        public int l;
        public String m;
        public m.b n;
        public boolean o;
        public boolean p;
        public a q;
        private String r;
        private final String s;
        private int t;
        private int u;
        private Map v;
        private Map w;
        private Map x;
        private aa y;
        public int h = 0;
        public int i = 0;
        public String j = "unknown";
        public boolean z = false;

        static {
            kge.a(-29221194);
        }

        public static /* synthetic */ int a(h hVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4ccc8cab", new Object[]{hVar, new Integer(i)})).intValue();
            }
            hVar.u = i;
            return i;
        }

        public static /* synthetic */ aa a(h hVar, aa aaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (aa) ipChange.ipc$dispatch("42825a4b", new Object[]{hVar, aaVar});
            }
            hVar.y = aaVar;
            return aaVar;
        }

        public static /* synthetic */ String a(h hVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1cce0455", new Object[]{hVar}) : hVar.s;
        }

        public static /* synthetic */ Map a(h hVar, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("14c0092f", new Object[]{hVar, map});
            }
            hVar.w = map;
            return map;
        }

        public static /* synthetic */ int b(h hVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("66e80b4a", new Object[]{hVar, new Integer(i)})).intValue();
            }
            hVar.t = i;
            return i;
        }

        public static /* synthetic */ Map b(h hVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8aa7a261", new Object[]{hVar}) : hVar.w;
        }

        public static /* synthetic */ Map b(h hVar, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("4371734e", new Object[]{hVar, map});
            }
            hVar.x = map;
            return map;
        }

        public static /* synthetic */ String c(h hVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8e8ec593", new Object[]{hVar}) : hVar.r;
        }

        public static /* synthetic */ Map d(h hVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("422a99e3", new Object[]{hVar}) : hVar.v;
        }

        public static /* synthetic */ int e(h hVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cc0a21a2", new Object[]{hVar})).intValue() : hVar.u;
        }

        public static /* synthetic */ int f(h hVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5944d323", new Object[]{hVar})).intValue() : hVar.t;
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public h(android.content.Context r16, java.lang.String r17, com.taobao.tao.flexbox.layoutmanager.container.m.b r18, boolean r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, int r24, java.util.Map r25, java.util.Map r26, boolean r27, java.util.Map r28, boolean r29, int r30, java.lang.String r31, boolean r32) {
            /*
                Method dump skipped, instructions count: 364
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.ab.h.<init>(android.content.Context, java.lang.String, com.taobao.tao.flexbox.layoutmanager.container.m$b, boolean, java.lang.String, java.lang.String, java.lang.String, int, int, java.util.Map, java.util.Map, boolean, java.util.Map, boolean, int, java.lang.String, boolean):void");
        }

        public m.b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (m.b) ipChange.ipc$dispatch("c7b970e9", new Object[]{this}) : this.n;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.t;
        }

        public Context c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c833dc62", new Object[]{this}) : this.f20321a;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.u;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.s;
        }

        public Map f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.e;
        }

        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            this.t = i;
            this.u = i2;
            a aVar = this.q;
            if (aVar == null) {
                return;
            }
            a.a(aVar, i);
            a.b(this.q, i2);
        }

        public aa g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("a6f49310", new Object[]{this}) : this.y;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "TNodeRenderContext{url='" + this.s + "', renderUrl='" + this.b + "', containerWidth=" + this.t + ", containerHeight=" + this.u + '}';
        }

        /* loaded from: classes8.dex */
        public static class a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private Context f20322a;
            private String b;
            private String c;
            private boolean d;
            private String e;
            private String f;
            private int g;
            private Map i;
            private Map j;
            private Map l;
            private String o;
            private m.b p;
            private int h = -1;
            private boolean k = true;
            private boolean m = false;
            private int n = -1;
            private boolean q = true;
            private boolean r = false;

            static {
                kge.a(378658701);
            }

            public static /* synthetic */ int a(a aVar, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("25f6ffa8", new Object[]{aVar, new Integer(i)})).intValue();
                }
                aVar.h = i;
                return i;
            }

            public static /* synthetic */ Context a(a aVar, Context context) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Context) ipChange.ipc$dispatch("4821b372", new Object[]{aVar, context});
                }
                aVar.f20322a = context;
                return context;
            }

            public static /* synthetic */ int b(a aVar, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("272d5287", new Object[]{aVar, new Integer(i)})).intValue();
                }
                aVar.g = i;
                return i;
            }

            public a(Context context) {
                this.f20322a = context;
            }

            public a a(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("a3b83a90", new Object[]{this, new Boolean(z)});
                }
                this.q = z;
                return this;
            }

            public a a(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("cfc93e8a", new Object[]{this, str});
                }
                this.c = str;
                return this;
            }

            public a b(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("cd0c8fd1", new Object[]{this, new Boolean(z)});
                }
                this.d = z;
                return this;
            }

            public a b(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("5213f369", new Object[]{this, str});
                }
                this.b = str;
                return this;
            }

            public a c(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("f660e512", new Object[]{this, new Boolean(z)});
                }
                this.m = z;
                return this;
            }

            public a e(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("49098f94", new Object[]{this, new Boolean(z)});
                }
                this.r = z;
                return this;
            }

            public a c(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("d45ea848", new Object[]{this, str});
                }
                this.e = str;
                return this;
            }

            public a d(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("56a95d27", new Object[]{this, str});
                }
                this.f = str;
                return this;
            }

            public a a(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("9855fa41", new Object[]{this, new Integer(i)});
                }
                this.g = i;
                return this;
            }

            public a b(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("c1aa4f82", new Object[]{this, new Integer(i)});
                }
                this.h = i;
                return this;
            }

            public a a(Map map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("221f97ff", new Object[]{this, map});
                }
                this.i = map;
                return this;
            }

            public a b(Map map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("13712780", new Object[]{this, map});
                }
                this.j = map;
                return this;
            }

            @Deprecated
            public a a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("40963df4", new Object[]{this, jSONObject});
                }
                this.j = jSONObject;
                return this;
            }

            public a d(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("1fb53a53", new Object[]{this, new Boolean(z)});
                }
                this.k = z;
                return this;
            }

            public a c(Map map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("4c2b701", new Object[]{this, map});
                }
                this.l = map;
                return this;
            }

            public a c(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("eafea4c3", new Object[]{this, new Integer(i)});
                }
                this.n = i;
                return this;
            }

            public a e(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("d8f41206", new Object[]{this, str});
                }
                this.o = str;
                return this;
            }

            public a a(m.b bVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (a) ipChange.ipc$dispatch("6804d279", new Object[]{this, bVar});
                }
                this.p = bVar;
                return this;
            }

            public Context a() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.f20322a;
            }

            public String b() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.e;
            }

            public String c() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
            }

            public Map d() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.j;
            }

            public h e() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (h) ipChange.ipc$dispatch("606b052d", new Object[]{this});
                }
                h hVar = new h(this.f20322a, this.c, this.p, this.d, this.b, this.e, this.f, this.h, this.g, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q);
                hVar.z = this.r;
                hVar.q = this;
                return hVar;
            }
        }
    }

    public n d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (n) ipChange.ipc$dispatch("48d671f5", new Object[]{this}) : this.D;
    }

    public drd a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (drd) ipChange.ipc$dispatch("2d458b6", new Object[]{this, activity});
        }
        if (this.R == null && activity != null && Build.VERSION.SDK_INT >= 16) {
            this.R = new drd(activity);
        }
        return this.R;
    }

    public oge e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oge) ipChange.ipc$dispatch("2dcf3ead", new Object[]{this}) : this.K;
    }

    public com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t W() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t) ipChange.ipc$dispatch("610d207", new Object[]{this}) : this.U;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.x;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.x != null) {
        } else {
            this.x = str;
        }
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else if (this.v != null) {
        } else {
            this.v = obj;
        }
    }

    public Object g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e4566784", new Object[]{this}) : this.v;
    }

    public void a(TNodeView tNodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29395e05", new Object[]{this, tNodeView});
        } else {
            this.C = tNodeView;
        }
    }

    public TNodeView h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("5b1acbcc", new Object[]{this}) : this.C;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.s;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.t;
    }

    public com.taobao.tao.flexbox.layoutmanager.ac.g k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.ac.g) ipChange.ipc$dispatch("caa8cb80", new Object[]{this}) : this.o;
    }

    @Deprecated
    public void a(com.taobao.tao.flexbox.layoutmanager.ac.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fe429b6", new Object[]{this, gVar});
        } else {
            this.o = gVar;
        }
    }

    public aa a(int i2) {
        aa aaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("e5ca1e03", new Object[]{this, new Integer(i2)});
        }
        synchronized (this.g) {
            aaVar = this.g.get(i2);
        }
        return aaVar;
    }

    public void a(int i2, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3bb643", new Object[]{this, new Integer(i2), aaVar});
            return;
        }
        synchronized (this.g) {
            this.g.put(i2, aaVar);
        }
    }

    public void b(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i2)});
            return;
        }
        synchronized (this.g) {
            this.g.remove(i2);
        }
    }

    public Context l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3c02e4eb", new Object[]{this}) : this.h;
    }

    public JSONObject m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5c7d6194", new Object[]{this}) : this.z;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        if (!oec.b(this.h) || oeb.ae()) {
            return false;
        }
        if (this.r == null) {
            if (!oec.c(l()) || !oeb.Z()) {
                z = false;
            }
            this.r = Boolean.valueOf(z);
        }
        return this.r.booleanValue();
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.q;
    }

    public boolean a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("971f5baf", new Object[]{this, hVar})).booleanValue() : g(h.a(hVar));
    }

    public static ab b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ab) ipChange.ipc$dispatch("7082eb4a", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        final String c2 = ohk.c(str);
        return (ab) ogv.b(i, new ogv.a<ab>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ogv.a
            public boolean a(ab abVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("691da4b3", new Object[]{this, abVar})).booleanValue();
                }
                if (abVar.A() != null) {
                    if (oec.a((Object) c2, (Object) ohk.c(h.a(abVar.A().c())))) {
                        return true;
                    }
                } else if (ab.a(abVar, str)) {
                    return true;
                }
                return false;
            }
        });
    }

    public static List<ab> p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f4f19870", new Object[0]) : i;
    }

    public ab() {
        this(null);
    }

    public ab(Context context) {
        this.l = new HashMap<>();
        this.g = new SparseArray<>();
        this.n = new ArrayList();
        this.s = false;
        this.t = false;
        this.A = new k();
        this.D = new n.a();
        this.K = new oge();
        this.L = new Handler(Looper.getMainLooper());
        this.U = tjy.b();
        this.M = new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                for (aa aaVar : ab.a(ab.this)) {
                    if (com.taobao.tao.flexbox.layoutmanager.core.h.b(ad.g(aaVar))) {
                        ab.b(ab.this);
                        ab.this.c(aaVar);
                        return;
                    }
                }
            }
        };
        this.N = new HashMap<>();
        this.O = new HashMap();
        this.h = context;
        this.T = "TNodeEngine-" + S.getAndIncrement();
        if (!oeb.ca()) {
            this.f = new t();
        }
        a((s) new x());
        b((s) new com.taobao.tao.flexbox.layoutmanager.core.a(this));
        com.taobao.tao.flexbox.layoutmanager.filter.a.a(this.l);
        this.o = new com.taobao.tao.flexbox.layoutmanager.ac.g(this);
        ogg.a("init engine at tnode engine constructor");
        V();
        this.o.c();
        this.E = new com.taobao.tao.flexbox.layoutmanager.animation.shareelement.b(this);
        i.add(this);
        q();
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        w.a(false, "type", "ToolManager");
        com.alibaba.flexa.compat.c.a("com.taobao.tao.flexbox.layoutmanager.tool.ToolManager", new c.a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.flexa.compat.c.a
            public void onClassLoaded(Class<?> cls) {
                try {
                    ab.a(ab.this, (n) cls.getConstructor(ab.class).newInstance(ab.this));
                    ab.c(ab.this).setEnableDebugTool(ab.b);
                    if (!ab.b) {
                        return;
                    }
                    ab.c(ab.this).showTool(ab.this.k().d());
                } catch (Throwable th) {
                    th.printStackTrace();
                    ogg.a(w.TAG, "FlexaClass load ToolManager error:Throwable: " + th.toString());
                    w.a(true, "type", "ToolManager", "error", th.toString());
                }
            }

            @Override // com.alibaba.flexa.compat.c.a
            public void onClassNotFound() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                    return;
                }
                ogg.a(w.TAG, "FlexaClass load ToolManager error:onClassNotFound");
                w.a(true, "type", "ToolManager", "error", "ClassNotFound");
            }
        });
    }

    public void a(final int i2, final aa aaVar, final String str, final String str2, final Map map, final com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e54779", new Object[]{this, new Integer(i2), aaVar, str, str2, map, bVar});
        } else {
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ab.this.b(i2, aaVar, str, str2, map, bVar);
                    }
                }
            });
        }
    }

    public void b(int i2, aa aaVar, String str, String str2, Map map, com.taobao.tao.flexbox.layoutmanager.event.b bVar) {
        s sVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2652cfa", new Object[]{this, new Integer(i2), aaVar, str, str2, map, bVar});
        } else if (aaVar == null) {
        } else {
            try {
                ogh.a(str != null ? str : "sendMessage");
                aa.e a2 = aa.e.a(aaVar, aaVar, str, map, i2, bVar);
                aaVar.a(a2);
                boolean c2 = aaVar.c(a2);
                aaVar.b(a2);
                if (!c2 && (sVar = (s) aaVar.ak().a(202)) != null) {
                    sVar.onHandleMessage(a2);
                }
                a2.a();
            } catch (Exception e2) {
                ogg.b("sendMessage, name:" + str + "  msg:" + e2.getMessage());
            } finally {
                ogh.b();
            }
        }
    }

    public e r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("b46adba3", new Object[]{this}) : this.f;
    }

    public void a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e786cd", new Object[]{this, sVar});
            return;
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        if (this.d.contains(sVar)) {
            return;
        }
        this.d.add(sVar);
    }

    public void b(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4912cec", new Object[]{this, sVar});
            return;
        }
        if (this.e == null) {
            this.e = new ArrayList();
        }
        if (this.e.contains(sVar)) {
            return;
        }
        this.e.add(sVar);
    }

    public Class c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Class) ipChange.ipc$dispatch("ea2b2761", new Object[]{this, str}) : this.l.get(str);
    }

    public void a(String str, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3975ad05", new Object[]{this, str, num});
            return;
        }
        if (this.k == null) {
            this.k = new HashMap();
        }
        this.k.put(str, num);
    }

    public int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e8", new Object[]{this, str})).intValue();
        }
        Map<String, Integer> map = this.k;
        if (map != null && map.containsKey(str)) {
            return this.k.get(str).intValue();
        }
        return 0;
    }

    public void c(String str, Class<? extends Object> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29329709", new Object[]{this, str, cls});
        } else {
            this.o.a(str, cls);
        }
    }

    private void a(h hVar, Map map, final i iVar) {
        String str;
        Map map2;
        String str2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10908c1c", new Object[]{this, hVar, map, iVar});
            return;
        }
        Map map3 = (Map) map.get(".");
        if (map3 != null) {
            Map map4 = (Map) map3.get("ac");
            if (map4 != null) {
                String str3 = (String) map4.get("code");
                String str4 = (String) map4.get("name");
                String str5 = (String) map3.get(com.taobao.android.weex_framework.util.a.ATOM_debugger);
                if (!this.o.d()) {
                    if (str5 != null && (oec.e(a()) || oeb.h("enableTNodeDebug"))) {
                        this.o.b(str4, str5);
                    }
                    this.o.a(str4, str3);
                }
            }
            hVar.e.put("md5", (String) map3.get("md5"));
            if ("dev".equals(map3.get("mode"))) {
                this.D.setEnableDebugTool(true);
            }
            this.p = oec.a(map3.get("version"), 2);
            List a2 = oec.a(map3.get("register"), (List) null);
            final boolean[] zArr = {false};
            if (a2 != null && !a2.isEmpty()) {
                boolean z2 = false;
                for (int i2 = 0; i2 < a2.size(); i2++) {
                    Object obj = a2.get(i2);
                    if (obj instanceof h.b) {
                        h.b bVar = (h.b) obj;
                        map2 = bVar.c;
                        str = bVar.f20355a;
                    } else if (obj instanceof Map) {
                        Map map5 = (Map) obj;
                        map2 = oec.a(map5.get("attrs"), (Map) null);
                        str = oec.a(map5.get("type"), (String) null);
                    } else {
                        str = null;
                        map2 = null;
                    }
                    if (map2 != null && (((str2 = (String) map2.get("platform")) == null || str2.equals("android")) && "register".equals(str))) {
                        String[] b2 = oec.b((String) map2.get("value"));
                        oec.a(b2[0], b2[1], new oec.a<Object>() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.13
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
                            /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
                            @Override // tb.oec.a
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public void a(java.lang.Class<java.lang.Object> r3) {
                                /*
                                    r2 = this;
                                    java.lang.String r0 = "TNodeEngine"
                                    if (r3 == 0) goto L1c
                                    r3.newInstance()     // Catch: java.lang.Exception -> L8 java.lang.IllegalAccessException -> Le java.lang.InstantiationException -> L14
                                    goto L1c
                                L8:
                                    r3 = move-exception
                                    java.lang.String r3 = r3.getMessage()
                                    goto L19
                                Le:
                                    r3 = move-exception
                                    java.lang.String r3 = r3.getMessage()
                                    goto L19
                                L14:
                                    r3 = move-exception
                                    java.lang.String r3 = r3.getMessage()
                                L19:
                                    tb.ogg.a(r0, r3)
                                L1c:
                                    boolean[] r3 = r2
                                    r0 = 0
                                    boolean r3 = r3[r0]
                                    if (r3 != 0) goto L2d
                                    com.taobao.tao.flexbox.layoutmanager.core.ab$i r3 = r3
                                    r3.a()
                                    boolean[] r3 = r2
                                    r1 = 1
                                    r3[r0] = r1
                                L2d:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.core.ab.AnonymousClass13.a(java.lang.Class):void");
                            }
                        });
                        z2 = true;
                    }
                }
                z = z2;
            }
        }
        if (z) {
            return;
        }
        iVar.a();
    }

    public com.taobao.tao.flexbox.layoutmanager.animation.shareelement.b s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tao.flexbox.layoutmanager.animation.shareelement.b) ipChange.ipc$dispatch("7037aee7", new Object[]{this}) : this.E;
    }

    public void a(int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d12ba58", new Object[]{this, new Integer(i2), intent});
        } else {
            this.E.a(i2, intent);
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else {
            this.E.d();
        }
    }

    public void a(int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i2), new Integer(i3), intent});
            return;
        }
        if (com.taobao.tao.flexbox.layoutmanager.adapter.a.a().n() != null) {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().n().a(this, i2, i3, intent);
        }
        if (this.m == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("requestCode", Integer.valueOf(i2));
        hashMap.put("resultCode", Integer.valueOf(i3));
        hashMap.put("data", intent);
        b(512, this.m, "onactivityresult", null, hashMap, null);
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        try {
            if (this.m == null || this.m.x() == null) {
                return;
            }
            b(512, this.m, "onpagewillappear", null, null, null);
        } catch (Exception unused) {
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else {
            a(this.m);
        }
    }

    public void a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
        } else if (Q()) {
        } else {
            try {
                HashMap hashMap = new HashMap();
                if (TabBarControllerComponent.f20080a) {
                    hashMap.put("source", 1);
                } else {
                    hashMap.put("source", 2);
                }
                hashMap.put("sourcePage", "page");
                hashMap.put("type", "page");
                if (aaVar != null) {
                    if (aaVar.x() == null && oeb.a(aaVar.c())) {
                        ogg.a("ignore pageappear for view is null");
                        try {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("name", aaVar.c().b);
                            w.a(this, "InCorrectPageAppear", hashMap2);
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    ogg.a("onResume, send page appear");
                    b(130, aaVar, "onpageappear", null, hashMap, null);
                }
            } catch (Exception unused2) {
            }
            if (aaVar != null && com.taobao.tao.flexbox.layoutmanager.adapter.a.a().n() != null) {
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().n();
            }
            this.D.onResume();
        }
    }

    public void h(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41eb0097", new Object[]{this, aaVar});
            return;
        }
        try {
            ogg.a("onStart");
            b(130, aaVar, "onstart", null, null, null);
        } catch (Exception unused) {
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else {
            b(this.m);
        }
    }

    public void b(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca84e11", new Object[]{this, aaVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("sourcePage", "page");
            hashMap.put("type", "page");
            if (aaVar != null) {
                if (aaVar.x() == null && oeb.a(aaVar.c())) {
                    ogg.a("ignore pagedisappear for view is null");
                    return;
                } else {
                    ogg.a("onPause, send page disappear");
                    b(130, aaVar, "onpagedisappear", null, hashMap, null);
                }
            }
        } catch (Exception unused) {
        }
        if (aaVar != null && com.taobao.tao.flexbox.layoutmanager.adapter.a.a().n() != null) {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().n();
        }
        this.D.onPause();
    }

    public void i(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85761e58", new Object[]{this, aaVar});
            return;
        }
        try {
            ogg.a(MessageID.onStop);
            b(Component.MSG_FLAG_DISAPPEAR, aaVar, "onstop", null, null, null);
        } catch (Exception unused) {
        }
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        try {
            ogg.a("onBack");
            HashMap hashMap = new HashMap();
            b(130, this.m, "onbackclick", null, hashMap, null);
            return oec.a(hashMap.get("handled"), false);
        } catch (Exception unused) {
            return false;
        }
    }

    public void a(aa aaVar, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7172b110", new Object[]{this, aaVar, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else if (aaVar == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("oldType", Integer.valueOf(i2));
            hashMap.put("newType", Integer.valueOf(i3));
            hashMap.put("x", Integer.valueOf(ohd.b(aaVar, aaVar.N(), 0.0f)));
            hashMap.put("y", Integer.valueOf(ohd.b(aaVar, aaVar.N(), 0.0f)));
            hashMap.put("w", Integer.valueOf(ohd.b(aaVar, aaVar.N(), i4)));
            hashMap.put("h", Integer.valueOf(ohd.b(aaVar, aaVar.N(), i5)));
            ogg.a("onWindowSizeTypeChanged, oldType:" + i2 + " newType:" + i3 + " newWidth:" + i4 + " newHeight:" + i5);
            String str = (String) aaVar.e("onwindowsizetypechanged");
            if (aaVar.I() == null || str == null) {
                return;
            }
            aaVar.I().sendMessage(aaVar, "onwindowsizetypechanged", str, hashMap, null);
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        ogg.a(MessageID.onDestroy);
        if (this.s || this.t) {
            return;
        }
        if (oeb.bZ()) {
            this.t = true;
        }
        aa aaVar = this.m;
        if (aaVar != null) {
            this.t = true;
            if (aaVar.e("ondestroy") != null) {
                z = true;
            }
            try {
                b(Component.MSG_FLAG_DISAPPEAR, this.m, "ondestroy", null, null, null);
            } catch (Exception unused) {
            }
        }
        oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ab.a(ab.this, true);
                }
            }
        }, z ? 2000L : 0L);
    }

    private void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
        } else if (this.m == null || !oeb.bs() || (this.m.N() instanceof Application)) {
        } else {
            oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ab.d(ab.this) == null) {
                    } else {
                        ab.d(ab.this).d(true);
                    }
                }
            }, 400L);
        }
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        ogg.a("doDestroy, fullDestroy:" + z);
        if (z) {
            K();
            if (this.G != null) {
                ohg.a().b("weitao_switch", com.taobao.tao.flexbox.layoutmanager.core.h.BAD_DSL, this.G);
                this.G = null;
            }
            O();
            this.D.destroy();
            if (!(g() instanceof com.taobao.tao.flexbox.layoutmanager.container.f)) {
                ogu.g(this.h);
            }
            M();
            if (com.taobao.tao.flexbox.layoutmanager.adapter.a.a().n() != null) {
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().n().a(this);
            }
            com.taobao.tao.flexbox.layoutmanager.ac.e.a(this);
            com.taobao.tao.flexbox.layoutmanager.component.w.a(this);
            i(this);
        }
        T();
        if (z) {
            PreloadDelegate.a(this);
        }
        L();
        this.o.e();
        this.o.f();
        if (z) {
            this.s = true;
            this.t = false;
            if (this.w != null) {
                ac.a().a(this.w);
            }
        }
        if (ogv.a(P)) {
            return;
        }
        Iterator<b> it = P.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void L() {
        TabBarControllerComponent tabBarControllerComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        try {
            if (this.m == null || (tabBarControllerComponent = (TabBarControllerComponent) this.m.a(TabBarControllerComponent.class)) == null) {
                return;
            }
            tabBarControllerComponent.h();
        } catch (Exception unused) {
        }
    }

    private void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d169dd", new Object[]{this});
            return;
        }
        ogh.a("init Engine");
        if (this.h == null) {
            this.h = a();
        }
        a(this.h);
        oea.a(this.h);
        ogf.a(this.h);
        com.taobao.tao.flexbox.layoutmanager.drawable.b.a(this.h);
        N();
        com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d b2 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
        if (b2 != null) {
            this.A.a(b2, this);
        }
        ogh.b();
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        ComponentCallbacks componentCallbacks = this.u;
        if (componentCallbacks == null) {
            return;
        }
        componentCallbacks.onLowMemory();
    }

    private void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4529654", new Object[]{this});
        } else if (this.u == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 14) {
                a().unregisterComponentCallbacks(this.u);
            }
            this.u = null;
        }
    }

    private void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460add5", new Object[]{this});
        } else if (this.u != null) {
        } else {
            this.u = new ComponentCallbacks() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
                    }
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4bbd23dd", new Object[]{this});
                    } else if (!oeb.bl()) {
                    } else {
                        ab.e(ab.this);
                        com.taobao.tao.flexbox.layoutmanager.core.h.a();
                    }
                }
            };
            if (Build.VERSION.SDK_INT < 14) {
                return;
            }
            a().registerComponentCallbacks(this.u);
        }
    }

    private static void i(ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857692b7", new Object[]{abVar});
            return;
        }
        Iterator<ab> it = i.iterator();
        while (it.hasNext()) {
            if (it.next() == abVar) {
                it.remove();
            }
        }
    }

    public aa A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("c7c5ea76", new Object[]{this}) : this.m;
    }

    private void c(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b194bead", new Object[]{this, hVar});
        } else if (this.j != null || com.taobao.tao.flexbox.layoutmanager.adapter.a.a().o() == null) {
        } else {
            this.j = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().o().a(this);
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().o().a(this.j);
        }
    }

    private void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
        } else if (this.j == null) {
        } else {
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().o().b(this.j);
            this.j = null;
        }
    }

    private void a(final long j2, final h hVar, final g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8475df83", new Object[]{this, new Long(j2), hVar, gVar});
            return;
        }
        ogt.a(hVar, ogt.TASK_DSL_LOAD);
        ogh.a("loadDSL");
        com.taobao.tao.flexbox.layoutmanager.core.h.a(this, hVar, new h.a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.h.a
            public void a(Map map, String str) {
                aa aaVar;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d7b3cea7", new Object[]{this, map, str});
                    return;
                }
                if (map != null) {
                    aaVar = ab.this.a(hVar, map, gVar);
                    if (aaVar == null && !TextUtils.equals(str, "local") && !TextUtils.isEmpty(hVar.c)) {
                        aaVar = ab.this.a(hVar, com.taobao.tao.flexbox.layoutmanager.core.h.d(hVar), gVar);
                    }
                } else {
                    g gVar2 = gVar;
                    if (gVar2 != null) {
                        gVar2.a(null);
                        ogg.a("TNode", "node is null for no dsl");
                    }
                    aaVar = null;
                }
                if (aaVar != null) {
                    ogt.a(hVar, ogt.TASK_DSL_LOAD, (JSONObject) null);
                    return;
                }
                ogt.a(hVar, ogt.TASK_DSL_LOAD, "download_error", (JSONObject) null);
                ab.a(ab.this, hVar, j2, (aa) null, false);
            }
        });
        ogh.b();
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue() : this.H;
    }

    private void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
            return;
        }
        aa aaVar = this.m;
        if (!((aaVar == null || aaVar.x() == null) ? false : true) || this.m.o()) {
            return;
        }
        if (!(g() instanceof com.taobao.tao.flexbox.layoutmanager.container.l) && !(g() instanceof com.taobao.tao.flexbox.layoutmanager.container.f)) {
            return;
        }
        this.I = this.m.c().q;
        b(false);
        R();
        this.n.clear();
        this.m = null;
        this.H = true;
    }

    private boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48af45c", new Object[]{this})).booleanValue();
        }
        if (!this.H) {
            return false;
        }
        this.o = new com.taobao.tao.flexbox.layoutmanager.ac.g(this);
        h.a aVar = this.I;
        h.a.a(aVar, this.h);
        a(aVar.e(), false, this.B);
        this.H = false;
        return true;
    }

    public void c(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0336bd2", new Object[]{this, aaVar});
            return;
        }
        boolean z = this.m.x() == null;
        h c2 = aaVar.c();
        com.taobao.tao.flexbox.layoutmanager.core.h.b(c2);
        b(false);
        R();
        com.taobao.tao.flexbox.layoutmanager.container.g.b(c2.b);
        h c3 = this.m.c();
        this.o = new com.taobao.tao.flexbox.layoutmanager.ac.g(this);
        h.a aVar = c3.q;
        h.a.a(aVar, this.m.N());
        if (z) {
            a(aVar.e(), true, this.B);
        } else {
            a(aVar.e(), false, this.B);
        }
    }

    private void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4990bd9", new Object[]{this});
            return;
        }
        for (aa aaVar : this.n) {
            aaVar.q = false;
            aaVar.Q();
        }
    }

    public void d(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33be8993", new Object[]{this, aaVar});
        } else {
            this.n.remove(aaVar);
        }
    }

    public void a(h hVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("949b248f", new Object[]{this, hVar, gVar});
        } else {
            a(hVar, true, gVar);
        }
    }

    public void b(h hVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda67010", new Object[]{this, hVar, gVar});
        } else {
            a(hVar, false, gVar);
        }
    }

    private void a(h hVar, boolean z, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fc216d", new Object[]{this, hVar, new Boolean(z), gVar});
        } else if (!hVar.p) {
            ogg.a("renderContext invalid, url: " + h.a(hVar) + " renderUrl:" + hVar.b);
            if (gVar == null) {
                return;
            }
            gVar.a(null);
        } else {
            ogg.a("start render, " + hVar);
            if (z) {
                c(hVar, gVar);
            } else {
                d(hVar, gVar);
            }
        }
    }

    private void c(h hVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46b1bb91", new Object[]{this, hVar, gVar});
            return;
        }
        ogh.a("preload render");
        boolean e2 = e(h.a(hVar));
        ogg.a("in preloadRender render. whether continue: " + e2);
        if (e2) {
            this.h = hVar.f20321a;
            hVar.g = this;
            a(hVar, true);
            long nanoTime = System.nanoTime();
            a(nanoTime, hVar, new f(hVar, nanoTime, gVar));
        }
        ogh.b();
    }

    private void d(final h hVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fbd0712", new Object[]{this, hVar, gVar});
            return;
        }
        ogh.a("layout render");
        ogg.a("start layoutRender");
        drd drdVar = this.R;
        if (drdVar != null) {
            drdVar.b();
        }
        c(hVar);
        long nanoTime = System.nanoTime();
        final d dVar = new d(hVar, nanoTime, gVar);
        this.h = hVar.f20321a;
        hVar.g = this;
        PreloadDelegate.PreloadHitResult a2 = a(h.a(hVar), new PreloadDelegate.a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate.a
            public void a(aa aaVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("691d3050", new Object[]{this, aaVar});
                    return;
                }
                ogg.a("in layout render. use cached tnode to continue render");
                ab.b(ab.this, h.a(hVar));
                ab.a(ab.this, aaVar, hVar, dVar);
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                ogg.a("in layout render. preload fail,have to render again");
                ab.b(ab.this, h.a(hVar));
                if (PreloadDelegate.a(ab.this, h.a(hVar))) {
                    ab.a(ab.this, (aa) null);
                }
                ab.a(ab.this, System.nanoTime(), hVar, dVar);
            }
        });
        if (a2 == PreloadDelegate.PreloadHitResult.REUSE || a2 == PreloadDelegate.PreloadHitResult.WAIT) {
            w.a(this, true, hVar.b, "tnode");
            hVar.j = com.taobao.tao.flexbox.layoutmanager.core.h.DSL_TYPE_REUSE;
        }
        ogg.a("in layout render.preload hit result is " + a2.getTip());
        if (a2 == PreloadDelegate.PreloadHitResult.NONE) {
            a(hVar, false);
            a(nanoTime, hVar, dVar);
        }
        ogh.b();
    }

    private void a(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ccccc89", new Object[]{this, hVar, new Boolean(z)});
        } else if (hVar == null) {
        } else {
            Map map = hVar.e;
            if (map == null) {
                map = new HashMap();
                hVar.e = map;
            }
            map.put("preload", Boolean.valueOf(z));
        }
    }

    /* loaded from: classes8.dex */
    public class f implements j {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private h b;
        private long c;
        private g d;

        static {
            kge.a(99758353);
            kge.a(-475275260);
        }

        public f(h hVar, long j, g gVar) {
            this.b = hVar;
            this.c = j;
            this.d = gVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.g
        public void a(aa aaVar) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("render complete from preload render,result is ");
            if (aaVar == null) {
                z = false;
            }
            sb.append(z);
            ogg.a(sb.toString());
            g gVar = this.d;
            if (gVar != null) {
                gVar.a(aaVar);
            }
            if (aaVar != null) {
                if (!ab.a(ab.this).contains(aaVar)) {
                    ab.a(ab.this).add(aaVar);
                }
                if (ab.d(ab.this) == aaVar) {
                    ab.a(ab.this, this.d);
                }
                ab.a(ab.this, h.a(this.b), aaVar);
                ab.b(ab.this, aaVar);
                return;
            }
            ab.a(ab.this, h.a(this.b), (aa) null);
            ab.a(ab.this, this.b, this.c, (aa) null, false);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.j
        public void b(aa aaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aca84e11", new Object[]{this, aaVar});
                return;
            }
            g gVar = this.d;
            if (!(gVar instanceof j)) {
                return;
            }
            ((j) gVar).b(aaVar);
        }
    }

    /* loaded from: classes8.dex */
    public class d implements g {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private h b;
        private long c;
        private g d;

        static {
            kge.a(1965707640);
            kge.a(-430973458);
        }

        public static /* synthetic */ h a(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("c411b30a", new Object[]{dVar}) : dVar.b;
        }

        public d(h hVar, long j, g gVar) {
            this.b = hVar;
            this.c = j;
            this.d = gVar;
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.g
        public void a(final aa aaVar) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("render complete from layout render,result is ");
            sb.append(aaVar != null);
            ogg.a(sb.toString());
            g gVar = this.d;
            if (gVar != null) {
                gVar.a(aaVar);
            }
            if (aaVar != null) {
                if (!ab.a(ab.this).contains(aaVar)) {
                    ab.a(ab.this).add(aaVar);
                }
                if (aaVar.x() != null) {
                    ab.a(ab.this, this.b, this.c, aaVar, true);
                    if (oeb.by() && ab.this.h() != null && !ab.this.h().isContainerResumed() && ab.this.h().getRenderIntercept().a()) {
                        z = false;
                    }
                    if (oeb.cz() && (aaVar.e() instanceof com.taobao.tao.flexbox.layoutmanager.component.p)) {
                        z &= oec.a(((Component) aaVar.e()).getNode());
                    }
                    if (z) {
                        oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.d.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                ab.a(ab.this, d.a(d.this), aaVar);
                                ab.c(ab.this, aaVar);
                                h.a(d.a(d.this), (Map) null);
                                ab.b(ab.this, d.a(d.this), aaVar);
                            }
                        }, oeb.a("syncSendPageAppear", false));
                    }
                    if (ab.this.h instanceof Activity) {
                        ab.c(ab.this).showTool(ab.f(ab.this).d());
                    }
                }
                if (ab.d(ab.this) == aaVar) {
                    ab.a(ab.this, this.d);
                }
                ab.b(ab.this, aaVar);
                return;
            }
            ab.a(ab.this, this.b, this.c, (aa) null, false);
            if (ab.d(ab.this) != null) {
                return;
            }
            if (ab.this.g() instanceof com.taobao.tao.flexbox.layoutmanager.container.f) {
                ((com.taobao.tao.flexbox.layoutmanager.container.f) ab.this.g()).startPostponedEnterTransition(null);
            } else if (!(ab.this.h instanceof Activity) || ((Activity) ab.this.h).isFinishing() || Build.VERSION.SDK_INT < 21) {
            } else {
                ((Activity) ab.this.h).startPostponedEnterTransition();
            }
        }
    }

    private void a(h hVar, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfde253", new Object[]{this, hVar, aaVar});
            return;
        }
        boolean z = hVar.o;
        if ((aaVar.e() instanceof com.taobao.tao.flexbox.layoutmanager.component.p) && oeb.a("checkNodeAppearState", true)) {
            z = ((com.taobao.tao.flexbox.layoutmanager.component.p) aaVar.e()).getNode().o();
        }
        if (!z) {
            return;
        }
        if (h.b(hVar) == null) {
            h.a(hVar, new HashMap());
        }
        if (TabBarControllerComponent.f20080a) {
            h.b(hVar).put("source", 1);
        } else {
            h.b(hVar).put("source", 2);
        }
        h.b(hVar).put("sourcePage", "page");
        h.b(hVar).put("type", "page");
        b(130, aaVar, "onstart", null, h.b(hVar), null);
        b(130, aaVar, "onpageappear", null, h.b(hVar), null);
    }

    private void b(h hVar, aa aaVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab81a14", new Object[]{this, hVar, aaVar});
        } else if (!hVar.o || this.m != aaVar || !(g() instanceof Fragment)) {
        } else {
            try {
                Bundle arguments = ((Fragment) g()).getArguments();
                if (arguments != null && arguments.containsKey("disappear_flag")) {
                    z = arguments.getBoolean("disappear_flag");
                }
                if (!z) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("sourcePage", "page");
                hashMap.put("type", "page");
                if (oeb.by()) {
                    b(130, aaVar, "onpagedisappear", null, hashMap, null);
                    b(130, aaVar, "onstop", null, hashMap, null);
                    return;
                }
                a(130, aaVar, "onpagedisappear", (String) null, hashMap, (com.taobao.tao.flexbox.layoutmanager.event.b) null);
                a(130, aaVar, "onstop", (String) null, hashMap, (com.taobao.tao.flexbox.layoutmanager.event.b) null);
            } catch (Exception unused) {
            }
        }
    }

    private void e(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7749a754", new Object[]{this, aaVar});
        } else if (com.taobao.tao.flexbox.layoutmanager.core.h.b(ad.g(aaVar)) && this.F < 3) {
            this.L.removeCallbacks(this.M);
            this.L.post(this.M);
        } else if (this.G != null) {
        } else {
            this.G = new ohg.a() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ohg.a
                public void a(String str, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                    } else if (!com.taobao.tao.flexbox.layoutmanager.core.h.BAD_DSL.equals(str2)) {
                    } else {
                        ab.h(ab.this).removeCallbacks(ab.g(ab.this));
                        ab.h(ab.this).post(ab.g(ab.this));
                    }
                }
            };
            ohg.a().a("weitao_switch", com.taobao.tao.flexbox.layoutmanager.core.h.BAD_DSL, this.G);
        }
    }

    private void f(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad4c515", new Object[]{this, aaVar});
        } else if (aaVar == null) {
        } else {
            String a2 = oec.a(aaVar.e(Component.KEY_PAGE_NAME), (String) null);
            String a3 = oec.a(aaVar.e("spm"), (String) null);
            String a4 = oec.a(aaVar.e("spm-url"), (String) null);
            if (!TextUtils.isEmpty(a2)) {
                com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().b(aaVar, a2);
            }
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(a3)) {
                hashMap.put("spm-cnt", a3);
            }
            if (!TextUtils.isEmpty(a4)) {
                hashMap.put("spm-url", a4);
            }
            com.taobao.tao.flexbox.layoutmanager.adapter.a.a().k().a(aaVar, hashMap);
        }
    }

    private void a(h hVar, long j2, aa aaVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c61a853", new Object[]{this, hVar, new Long(j2), aaVar, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", hVar.b);
        Object obj = null;
        hashMap.put("pageURL", hVar.e != null ? hVar.e.get("url") : null);
        if (hVar.e != null) {
            obj = hVar.e.get("pageName");
        }
        hashMap.put("pageName", obj);
        if (z) {
            w.a(this, aaVar, System.nanoTime() - j2, 3, hashMap);
        } else {
            w.a(this, (aa) null, System.nanoTime() - j2, 2, hashMap);
        }
    }

    public aa a(final h hVar, Map map, final g gVar) {
        aa aaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("9f794f20", new Object[]{this, hVar, map, gVar});
        }
        ogt.a(hVar, ogt.TASK_DSL_RENDER);
        ogh.a("renderInternal");
        if (this.z == null) {
            this.z = oea.b(this.h);
        }
        h.b(hVar, map);
        try {
            h.b bVar = (h.b) map.get(h.c(hVar) == null ? "main" : h.c(hVar));
            final Object a2 = a(hVar, bVar);
            try {
                aaVar = null;
                try {
                    final aa aaVar2 = new aa(hVar, new af(this, map, bVar, bVar, a2, hVar.e, null, null, null, null, new af.b("", -1)), null);
                    h.a(hVar, aaVar2);
                    a(hVar, map, new i() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.i
                        public void a() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            ab.d(ab.this, aaVar2);
                            g gVar2 = gVar;
                            if (gVar2 instanceof j) {
                                ((j) gVar2).b(aaVar2);
                            }
                            if (!ogv.a(ab.J())) {
                                Iterator it = ab.J().iterator();
                                while (it.hasNext()) {
                                    it.next();
                                }
                            }
                            ogt.a(hVar, ogt.TASK_DSL_RENDER, (JSONObject) null);
                            if (aaVar2.e("onready") != null) {
                                ab.this.b(34, aaVar2, "onready", null, null, null);
                            }
                            if (!ab.this.a(hVar) || hVar.k) {
                                ab.a(ab.this, null, null, 0L, aaVar2, hVar.b, a2, gVar, null, false);
                            } else {
                                ab.a(ab.this, aaVar2, hVar.b, a2, gVar, false);
                            }
                        }
                    });
                    if (hVar.g.n() && !this.J && oec.b(this.h)) {
                        this.J = true;
                        oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.6
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (ab.this.g() instanceof com.taobao.tao.flexbox.layoutmanager.container.f) {
                                    ((com.taobao.tao.flexbox.layoutmanager.container.f) ab.this.g()).startPostponedEnterTransition(null);
                                } else if (ab.this.h == null || !(ab.this.h instanceof Activity) || ((Activity) ab.this.h).isFinishing()) {
                                } else {
                                    ((Activity) ab.this.h).startPostponedEnterTransition();
                                }
                            }
                        }, 500L);
                    }
                    ogh.b();
                    return aaVar2;
                } catch (Exception e2) {
                    e = e2;
                    ogh.b();
                    e.printStackTrace();
                    if (gVar != null) {
                        gVar.a(aaVar);
                    }
                    return aaVar;
                }
            } catch (Exception e3) {
                e = e3;
                aaVar = null;
            }
        } catch (Exception e4) {
            e = e4;
            aaVar = null;
        }
    }

    private Object a(h hVar, h.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f5f9247b", new Object[]{this, hVar, bVar});
        }
        Map map = null;
        if (h.d(hVar) != null) {
            map = h.d(hVar);
        } else if (!TextUtils.isEmpty(hVar.d)) {
            Object c2 = ohh.c(hVar.d);
            if (c2 instanceof JSONObject) {
                map = (JSONObject) c2;
            } else if (c2 instanceof String) {
                try {
                    map = JSON.parseObject((String) c2);
                } catch (Exception unused) {
                    ogg.b("initData is invalid json" + c2);
                }
            }
        } else if (bVar.i != null) {
            map = bVar.i;
            if ((map instanceof Map) && !(map instanceof JSONObject)) {
                map = new JSONObject(map);
            }
        }
        if (map == null) {
            map = new JSONObject();
        }
        TNodeView tNodeView = this.C;
        if (tNodeView != null) {
            tNodeView.getRenderIntercept().a(l(), this.v, map, hVar.a());
        }
        return map;
    }

    private aa a(aa aaVar, h hVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("4306dea7", new Object[]{this, aaVar, hVar, gVar});
        }
        aaVar.a(this);
        g(aaVar);
        aaVar.f20292a.f20321a = hVar.f20321a;
        aaVar.f20292a.e = hVar.e;
        aaVar.f20292a.i = 0;
        a(aaVar.f20292a, true);
        h.b(aaVar.f20292a, h.f(hVar));
        h.a(aaVar.f20292a, h.e(hVar));
        a(aaVar, hVar.b, (Object) h.d(hVar), gVar, false);
        return aaVar;
    }

    private void g(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe5fe2d6", new Object[]{this, aaVar});
            return;
        }
        aa aaVar2 = this.m;
        if (aaVar2 != null && aaVar2.q) {
            return;
        }
        this.m = aaVar;
    }

    public void a(g.c cVar, String str, long j2, aa aaVar, String str2, Object obj, Object obj2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686308c7", new Object[]{this, cVar, str, new Long(j2), aaVar, str2, obj, obj2, new Boolean(z)});
        } else {
            a(cVar, str, j2, aaVar, str2, obj, null, obj2, z);
        }
    }

    private void a(g.c cVar, String str, long j2, aa aaVar, String str2, Object obj, g gVar, Object obj2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c05163", new Object[]{this, cVar, str, new Long(j2), aaVar, str2, obj, gVar, obj2, new Boolean(z)});
            return;
        }
        S();
        this.w.f20324a.a(new a(cVar, str, j2, this, str2, aaVar, obj, gVar, obj2, z));
    }

    private void a(aa aaVar, String str, Object obj, g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ddd3ba", new Object[]{this, aaVar, str, obj, gVar, new Boolean(z)});
            return;
        }
        S();
        this.w.f20324a.b(new a(null, null, 0L, this, str, aaVar, obj, gVar, null, z));
    }

    private void b(aa aaVar, String str, Object obj, g gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0521099", new Object[]{this, aaVar, str, obj, gVar, new Boolean(z)});
            return;
        }
        S();
        this.w.f20324a.d(new a(null, null, 0L, this, str, aaVar, obj, gVar, null, z));
    }

    public void a(final aa aaVar, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a0bcb0", new Object[]{this, aaVar, new Integer(i2), new Integer(i3)});
        } else if (aaVar == null || aaVar.J() != null || i2 <= 0 || i3 <= 0) {
        } else {
            if (oec.a(aaVar.a(200), false)) {
                aaVar.a(201, new int[]{i2, i3});
                return;
            }
            ogg.a("refreshLayout node:" + aaVar + " width:" + i2 + " height:" + i3);
            aaVar.a(200, (Object) true);
            C();
            S();
            a aVar = new a(null, "forceRefreshLayout", System.currentTimeMillis(), this, aaVar.c().b, aaVar, aaVar.D(), new g() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.g
                public void a(aa aaVar2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("691d3050", new Object[]{this, aaVar2});
                        return;
                    }
                    aaVar.a(200, (Object) false);
                    int[] iArr = (int[]) aaVar.a(201);
                    if (iArr == null) {
                        return;
                    }
                    aaVar.a(201, (Object) null);
                    ab.this.a(aaVar, iArr[0], iArr[1]);
                }
            }, null, true);
            aVar.f20317a = i2;
            aVar.b = i3;
            this.w.f20324a.c(aVar);
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else {
            this.z = oea.b(this.h);
        }
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        S();
        this.w.f20324a.a(runnable);
    }

    public void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
            return;
        }
        S();
        if (this.w.b == null) {
            return;
        }
        this.w.b.a(runnable);
    }

    public static void c(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1ace8", new Object[]{runnable});
        } else {
            ac.a().c().a(runnable);
        }
    }

    public static void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9021f9e9", new Object[]{runnable});
        } else {
            ac.a().d().a(runnable);
        }
    }

    public void e(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("145246ea", new Object[]{this, runnable});
            return;
        }
        final MessageQueue.IdleHandler idleHandler = new MessageQueue.IdleHandler() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                }
                runnable.run();
                return false;
            }
        };
        oec.a(new Runnable() { // from class: com.taobao.tao.flexbox.layoutmanager.core.ab.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Looper.myQueue().addIdleHandler(idleHandler);
                }
            }
        }, true);
    }

    private void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7235a", new Object[]{this});
        } else if (this.w != null) {
        } else {
            this.w = ac.a().b();
        }
    }

    public Handler D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("23e9aa1b", new Object[]{this}) : this.w.f20324a.c();
    }

    public Handler E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("1feb38fa", new Object[]{this}) : this.w.b.c();
    }

    public String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fdc3673", new Object[]{this});
        }
        aa aaVar = this.m;
        if (aaVar == null) {
            return null;
        }
        return ad.g(aaVar);
    }

    public String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("661f112", new Object[]{this});
        }
        aa aaVar = this.m;
        if (aaVar == null) {
            return null;
        }
        return ad.h(aaVar);
    }

    public Object H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9a24ce43", new Object[]{this}) : this.y;
    }

    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, obj});
        } else {
            this.y = obj;
        }
    }

    public void a(int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i2), obj});
            return;
        }
        if (this.Q == null) {
            this.Q = new SparseArray<>();
        }
        this.Q.put(i2, obj);
    }

    public Object c(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3204ff79", new Object[]{this, new Integer(i2)});
        }
        SparseArray<Object> sparseArray = this.Q;
        if (sparseArray == null) {
            return null;
        }
        return sparseArray.get(i2);
    }

    public List<aa> I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ab49eff7", new Object[]{this}) : this.n;
    }

    private boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue();
        }
        String d2 = PreloadDelegate.d(str);
        if (TextUtils.isEmpty(d2)) {
            return false;
        }
        synchronized (this.N) {
            Integer num = this.N.get(d2);
            if (num != null && num.intValue() == 2) {
                return false;
            }
            this.N.put(d2, 1);
            this.O.put(d2, new PreloadDelegate.b());
            return true;
        }
    }

    private PreloadDelegate.PreloadHitResult a(String str, PreloadDelegate.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreloadDelegate.PreloadHitResult) ipChange.ipc$dispatch("93d5d88a", new Object[]{this, str, aVar});
        }
        String d2 = PreloadDelegate.d(str);
        synchronized (this.N) {
            Integer num = this.N.get(d2);
            if (num != null && num.intValue() == 1) {
                PreloadDelegate.b bVar = null;
                if (this.O != null) {
                    bVar = this.O.get(d2);
                }
                if (bVar == null) {
                    return PreloadDelegate.PreloadHitResult.NONE;
                } else if (bVar.a()) {
                    if (bVar.b() != null) {
                        aVar.a(bVar.b());
                    } else {
                        aVar.a();
                    }
                    return PreloadDelegate.PreloadHitResult.REUSE;
                } else {
                    bVar.a(aVar);
                    return PreloadDelegate.PreloadHitResult.WAIT;
                }
            }
            this.N.put(d2, 2);
            return PreloadDelegate.PreloadHitResult.NONE;
        }
    }

    private void a(String str, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("754afe9a", new Object[]{this, str, aaVar});
            return;
        }
        String d2 = PreloadDelegate.d(str);
        if (TextUtils.isEmpty(d2)) {
            return;
        }
        synchronized (this.N) {
            PreloadDelegate.b bVar = this.O.get(d2);
            if (bVar == null) {
                bVar = new PreloadDelegate.b();
                this.O.put(d2, bVar);
            }
            bVar.a(true);
            if (bVar.c() == null) {
                bVar.a(aaVar);
            } else if (aaVar == null) {
                bVar.c().a();
            } else {
                bVar.c().a(aaVar);
            }
        }
    }

    private void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        String d2 = PreloadDelegate.d(str);
        if (TextUtils.isEmpty(d2)) {
            return;
        }
        synchronized (this.N) {
            this.N.put(d2, 2);
        }
    }

    private boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{this, str})).booleanValue();
        }
        String d2 = PreloadDelegate.d(str);
        if (TextUtils.isEmpty(d2)) {
            return false;
        }
        synchronized (this.N) {
            Integer num = this.N.get(d2);
            return num != null && num.intValue() == 1;
        }
    }

    private void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b53adb", new Object[]{this});
            return;
        }
        synchronized (this.N) {
            this.N.clear();
            this.O.clear();
        }
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971ca171", new Object[]{bVar});
        } else if (bVar == null) {
        } else {
            if (P == null) {
                P = new ArrayList();
            }
            P.add(bVar);
        }
    }

    public String U() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("61b225c4", new Object[]{this}) : this.T;
    }
}
