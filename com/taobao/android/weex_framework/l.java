package com.taobao.android.weex_framework;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.b;
import com.taobao.android.weex_framework.adapter.i;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.dpk;
import tb.jvt;
import tb.kge;
import tb.odm;

/* loaded from: classes6.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean b;
    private static volatile int t;

    /* renamed from: a  reason: collision with root package name */
    private boolean f15994a;
    private volatile com.taobao.android.weex_framework.adapter.d c;
    private volatile com.taobao.android.weex_framework.adapter.c d;
    private volatile b e;
    private volatile d f;
    private volatile com.taobao.android.weex_framework.module.builtin.storage.b g;
    private volatile i h;
    private volatile com.taobao.android.weex_framework.adapter.a i;
    private volatile com.taobao.android.weex_framework.adapter.f j;
    private volatile com.taobao.android.weex_framework.adapter.g k;
    private volatile com.taobao.android.weex_framework.adapter.e l;
    private volatile jvt m;
    private volatile com.taobao.android.weex_framework.adapter.h n;
    private volatile com.taobao.android.weex_framework.adapter.j o;
    private volatile j p;
    private volatile h q;
    private Map<Integer, WeakReference<p>> r;
    private volatile com.taobao.android.weex_framework.adapter.k s;

    /* loaded from: classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final l f15995a;

        static {
            kge.a(-2097458823);
            f15995a = new l();
        }

        public static /* synthetic */ l a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("8088e569", new Object[0]) : f15995a;
        }
    }

    static {
        kge.a(-746547817);
        b = true;
        t = 0;
    }

    public static l a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("8088e569", new Object[0]) : a.a();
    }

    private l() {
        this.r = new ConcurrentHashMap();
    }

    public void a(Application application, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0dc4b17", new Object[]{this, application, oVar});
        } else if (oVar == null) {
        } else {
            if (this.c == null) {
                a(oVar.a());
            }
            a(oVar.b());
            a(oVar.c());
            a(oVar.d());
            com.taobao.android.weex_framework.module.builtin.storage.b k = oVar.k();
            if (k == null) {
                k = new com.taobao.android.weex_framework.module.builtin.storage.a(application);
            }
            a(k);
            a(oVar.f());
            a(oVar.g());
            a(oVar.e());
            a(oVar.l());
            a(oVar.m());
            a(oVar.o());
            this.f15994a = oVar.i();
            b = oVar.h();
            com.taobao.android.weex_framework.util.g.a(m.c());
            t = oVar.n();
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : b && !m.c;
    }

    public com.taobao.android.weex_framework.module.builtin.storage.b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.module.builtin.storage.b) ipChange.ipc$dispatch("514b9480", new Object[]{this}) : this.g;
    }

    public com.taobao.android.weex_framework.adapter.a d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.adapter.a) ipChange.ipc$dispatch("b120ed7", new Object[]{this}) : this.i;
    }

    public b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a9ba8f7", new Object[]{this}) : this.e;
    }

    public void a(com.taobao.android.weex_framework.module.builtin.storage.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3250fc", new Object[]{this, bVar});
        } else {
            this.g = bVar;
        }
    }

    public void a(com.taobao.android.weex_framework.adapter.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ad2d54", new Object[]{this, aVar});
        } else {
            this.i = aVar;
        }
    }

    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b0d04c", new Object[]{this, iVar});
        } else {
            this.h = iVar;
        }
    }

    public void a(com.taobao.android.weex_framework.adapter.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ae8a71", new Object[]{this, dVar});
        } else {
            this.c = dVar;
        }
    }

    public com.taobao.android.weex_framework.adapter.d f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.adapter.d) ipChange.ipc$dispatch("a254336", new Object[]{this}) : this.c;
    }

    public com.taobao.android.weex_framework.adapter.c g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.adapter.c) ipChange.ipc$dispatch("9aedd18", new Object[]{this});
        }
        if (this.d == null) {
            this.d = dpk.a(true);
        }
        return this.d;
    }

    public d h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("58ea1178", new Object[]{this}) : this.f;
    }

    public i i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("8c211d4", new Object[]{this}) : this.h;
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e340b1", new Object[]{this, dVar});
        } else {
            this.f = dVar;
        }
    }

    public void a(com.taobao.android.weex_framework.adapter.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ae1612", new Object[]{this, cVar});
        } else {
            this.d = cVar;
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ada1b3", new Object[]{this, bVar});
        } else {
            this.e = bVar;
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.f15994a;
    }

    public com.taobao.android.weex_framework.adapter.f k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.adapter.f) ipChange.ipc$dispatch("7d54579", new Object[]{this}) : this.j;
    }

    public com.taobao.android.weex_framework.adapter.g l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.adapter.g) ipChange.ipc$dispatch("75edf99", new Object[]{this}) : this.k;
    }

    public com.taobao.android.weex_framework.adapter.e m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.adapter.e) ipChange.ipc$dispatch("6e8795c", new Object[]{this}) : this.l;
    }

    public com.taobao.android.weex_framework.adapter.j n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.adapter.j) ipChange.ipc$dispatch("67213f8", new Object[]{this}) : this.o;
    }

    public void a(com.taobao.android.weex_framework.adapter.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b144ab", new Object[]{this, jVar});
        } else {
            this.o = jVar;
        }
    }

    public jvt o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvt) ipChange.ipc$dispatch("7abda8a8", new Object[]{this}) : this.m;
    }

    public void a(jvt jvtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02b3130", new Object[]{this, jvtVar});
        } else {
            this.m = jvtVar;
        }
    }

    public com.taobao.android.weex_framework.adapter.h p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.adapter.h) ipChange.ipc$dispatch("58547bc", new Object[]{this}) : this.n;
    }

    public void a(com.taobao.android.weex_framework.adapter.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b05bed", new Object[]{this, hVar});
        } else {
            this.n = hVar;
        }
    }

    public j q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("4a8b953b", new Object[]{this}) : this.p;
    }

    public void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e5faeb", new Object[]{this, jVar});
        } else {
            this.p = jVar;
        }
    }

    public h r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("d72bbffe", new Object[]{this}) : this.q;
    }

    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11e5122d", new Object[]{this, hVar});
        } else {
            this.q = hVar;
        }
    }

    public com.taobao.android.weex_framework.adapter.k s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.adapter.k) ipChange.ipc$dispatch("422161c", new Object[]{this});
        }
        if (this.s == null) {
            try {
                this.s = new odm();
            } catch (Throwable unused) {
                com.taobao.android.weex.util.c.a(false, "Must be setting weex config adapter or use orange");
            }
        }
        return this.s;
    }

    public void a(com.taobao.android.weex_framework.adapter.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b1b90a", new Object[]{this, kVar});
        } else {
            this.s = kVar;
        }
    }

    public int t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue() : t;
    }
}
