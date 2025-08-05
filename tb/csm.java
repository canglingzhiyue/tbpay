package tb;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.result.ScrollInterceptView;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes3.dex */
public final class csm implements csl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Float[] A;

    /* renamed from: a  reason: collision with root package name */
    private float f26490a;
    private ruw<? super Boolean, ? super Boolean, t> b;
    private ruk<t> c;
    private Context d;
    private ScrollInterceptView e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private float n;
    private ScrollInterceptView.a o;
    private ScrollInterceptView.b p;
    private int q;
    private csp r;
    private boolean s;
    private ruk<t> t;
    private int u;
    private boolean x;
    private Map<Integer, Float[]> y;
    private int z;

    static {
        kge.a(98425954);
        kge.a(639676225);
    }

    public csm() {
        csn.a();
        this.f = 300;
        this.j = -1;
        this.u = -1;
        this.y = ai.b(j.a(0, new Float[]{Float.valueOf(0.3f), Float.valueOf(0.8f)}), j.a(1, new Float[]{Float.valueOf(0.1f), Float.valueOf(0.9f)}), j.a(2, new Float[]{Float.valueOf(0.4f), Float.valueOf(0.7f)}));
        this.A = j(this.z);
    }

    public static final /* synthetic */ View a(csm csmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("c04a0f3d", new Object[]{csmVar}) : csmVar.m();
    }

    public static final /* synthetic */ void a(csm csmVar, View view, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6d4fa8", new Object[]{csmVar, view, new Integer(i), new Boolean(z)});
        } else {
            csmVar.a(view, i, z);
        }
    }

    public static final /* synthetic */ void b(csm csmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28ed63c", new Object[]{csmVar});
        } else {
            csmVar.d();
        }
    }

    @Override // tb.csl
    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
            return;
        }
        this.z = i;
        this.A = j(i);
    }

    @Override // tb.csl
    public void a(ScrollInterceptView parent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9706222", new Object[]{this, parent});
            return;
        }
        q.c(parent, "parent");
        this.e = parent;
        Context context = parent.getContext();
        q.a((Object) context, "parent.context");
        this.d = context;
    }

    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.q != 0) {
        } else {
            Context context = this.d;
            if (context == null) {
                q.b("context");
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            q.a((Object) viewConfiguration, "ViewConfiguration.get(context)");
            this.q = viewConfiguration.getScaledTouchSlop();
        }
    }

    @Override // tb.csl
    public boolean a(MotionEvent ev) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, ev})).booleanValue();
        }
        q.c(ev, "ev");
        if (this.j == -1 || !c(ev)) {
            return false;
        }
        csp cspVar = this.r;
        if (cspVar != null && cspVar.c()) {
            return true;
        }
        if (ev.getAction() == 0) {
            this.k = false;
            this.m = ev.getY() < ((float) (this.i + this.h));
        }
        if (this.k) {
            return true;
        }
        int action = ev.getAction();
        if (action == 0) {
            this.l = l();
            this.k = false;
            this.f26490a = ev.getY();
            this.n = ev.getY();
            return false;
        } else if (action != 2) {
            return false;
        } else {
            h();
            float y = ev.getY() - this.n;
            if (this.j != 3) {
                if (Math.abs(y) < this.q) {
                    return false;
                }
                this.k = true;
                return true;
            } else if ((!this.l && !this.m) || Math.abs(y) < this.q) {
                return false;
            } else {
                this.n = ev.getY();
                if (y < 0) {
                    this.l = false;
                    return false;
                }
                this.k = true;
                return true;
            }
        }
    }

    @Override // tb.csl
    public boolean b(MotionEvent ev) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, ev})).booleanValue();
        }
        q.c(ev, "ev");
        boolean c = c(ev);
        if (this.s || this.j == -1) {
            return false;
        }
        csp cspVar = this.r;
        if (cspVar != null && cspVar.c()) {
            return false;
        }
        int action = ev.getAction();
        if (action != 0) {
            if (action == 1) {
                b(c);
                return true;
            } else if (action != 2) {
                if (action == 3) {
                    b(c);
                    return true;
                }
            } else if (!c) {
                return this.t != null;
            } else {
                if (this.u == -1) {
                    this.u = this.h;
                }
                h();
                g(1);
                float y = ev.getY() - this.n;
                if (!this.x) {
                    if (Math.abs(y) >= this.q) {
                        z = true;
                    }
                    this.x = z;
                }
                if (!this.x) {
                    return true;
                }
                ruk<t> rukVar = this.c;
                if (rukVar != null) {
                    rukVar.mo2427invoke();
                }
                this.n = ev.getY();
                View m = m();
                if (m != null) {
                    a(m, (int) y, true);
                }
            }
        } else if (!c) {
            return this.t != null;
        } else {
            this.u = this.h;
            this.n = ev.getY();
            this.f26490a = ev.getY();
            g(1);
        }
        return true;
    }

    private final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            ruk<t> rukVar = this.t;
            if (rukVar != null) {
                rukVar.mo2427invoke();
            }
            d();
        } else {
            if (this.f26490a - this.n >= ((float) 0)) {
                if (this.h < this.A[1].floatValue() * c()) {
                    ruw<? super Boolean, ? super Boolean, t> ruwVar = this.b;
                    if (ruwVar == null) {
                        c(this.g);
                    } else if (ruwVar != null) {
                        ruwVar.mo2423invoke(true, true);
                    }
                } else {
                    ruw<? super Boolean, ? super Boolean, t> ruwVar2 = this.b;
                    if (ruwVar2 == null) {
                        c(c());
                    } else if (ruwVar2 != null) {
                        ruwVar2.mo2423invoke(false, true);
                    }
                }
            } else if (this.h < this.A[0].floatValue() * c()) {
                ruw<? super Boolean, ? super Boolean, t> ruwVar3 = this.b;
                if (ruwVar3 == null) {
                    c(this.g);
                } else if (ruwVar3 != null) {
                    ruwVar3.mo2423invoke(true, false);
                }
            } else {
                ruw<? super Boolean, ? super Boolean, t> ruwVar4 = this.b;
                if (ruwVar4 == null) {
                    c(c());
                } else if (ruwVar4 != null) {
                    ruwVar4.mo2423invoke(false, false);
                }
            }
            k();
        }
    }

    private final Float[] j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float[]) ipChange.ipc$dispatch("19654c48", new Object[]{this, new Integer(i)});
        }
        if (i == 1) {
            Float[] fArr = this.y.get(1);
            if (fArr == null) {
                q.a();
            }
            return fArr;
        } else if (i == 2) {
            Float[] fArr2 = this.y.get(2);
            if (fArr2 == null) {
                q.a();
            }
            return fArr2;
        } else {
            Float[] fArr3 = this.y.get(0);
            if (fArr3 == null) {
                q.a();
            }
            return fArr3;
        }
    }

    private final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.u = -1;
        this.n = 0.0f;
        this.f26490a = 0.0f;
        this.x = false;
    }

    @Override // tb.csl
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    @Override // tb.csl
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        if (i < 0) {
            i = 0;
        }
        this.g = i;
    }

    @Override // tb.csl
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        if (z) {
            i = h(i);
        }
        View m = m();
        if (m != null) {
            ViewCompat.offsetTopAndBottom(m, this.h - i);
        }
        ScrollInterceptView.b bVar = this.p;
        if (bVar != null) {
            int i2 = this.h;
            int c = c();
            ScrollInterceptView scrollInterceptView = this.e;
            if (scrollInterceptView == null) {
                q.b(c.MSG_SOURCE_PARENT);
            }
            bVar.a(i2, i, c, scrollInterceptView.getHeight());
        }
        ScrollInterceptView scrollInterceptView2 = this.e;
        if (scrollInterceptView2 == null) {
            q.b(c.MSG_SOURCE_PARENT);
        }
        scrollInterceptView2.notifyScrollChange();
        this.h = i;
    }

    private final int h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4137fe7", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i > c()) {
            return c();
        }
        int i2 = this.g;
        return i < i2 ? i2 : i;
    }

    private final void a(View view, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c25511b", new Object[]{this, view, new Integer(i), new Boolean(z)});
            return;
        }
        int i2 = this.h;
        if (z) {
            this.h = h(i + i2);
        } else {
            this.h = i + i2;
        }
        ViewCompat.offsetTopAndBottom(view, this.h - i2);
        ScrollInterceptView.b bVar = this.p;
        if (bVar != null) {
            int i3 = this.h;
            int c = c();
            ScrollInterceptView scrollInterceptView = this.e;
            if (scrollInterceptView == null) {
                q.b(c.MSG_SOURCE_PARENT);
            }
            bVar.a(i2, i3, c, scrollInterceptView.getHeight());
        }
        ScrollInterceptView scrollInterceptView2 = this.e;
        if (scrollInterceptView2 == null) {
            q.b(c.MSG_SOURCE_PARENT);
        }
        scrollInterceptView2.notifyScrollChange();
    }

    private final void a(int i, long j, boolean z, cso csoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c36c67c", new Object[]{this, new Integer(i), new Long(j), new Boolean(z), csoVar});
            return;
        }
        csp cspVar = this.r;
        if (cspVar != null) {
            cspVar.b();
        }
        g(2);
        this.r = new csp(this.h, i, j);
        csp cspVar2 = this.r;
        if (cspVar2 != null) {
            cspVar2.a(new a(csoVar, z));
        }
        csp cspVar3 = this.r;
        if (cspVar3 == null) {
            return;
        }
        cspVar3.d();
    }

    /* loaded from: classes3.dex */
    public static final class a implements cso {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ cso b;
        public final /* synthetic */ boolean c;

        public a(cso csoVar, boolean z) {
            this.b = csoVar;
            this.c = z;
        }

        @Override // tb.cso
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            cso csoVar = this.b;
            if (csoVar != null) {
                csoVar.a(i);
            }
            View a2 = csm.a(csm.this);
            if (a2 == null) {
                return;
            }
            csm.a(csm.this, a2, i, this.c);
        }

        @Override // tb.cso
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            cso csoVar = this.b;
            if (csoVar != null) {
                csoVar.a();
            }
            csm.b(csm.this);
        }
    }

    @Override // tb.csl
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            a(i, 300L, true, (cso) null);
        }
    }

    @Override // tb.csl
    public void a(float f, long j, cso csoVar) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e5017d", new Object[]{this, new Float(f), new Long(j), csoVar});
            return;
        }
        int c = c() - this.g;
        if (f < 0) {
            f = 0.0f;
        } else if (f > 1) {
            f = 1.0f;
        }
        if (j <= 0) {
            j2 = 0;
        } else {
            if (j > 1000) {
                j = 450;
            }
            j2 = j;
        }
        a((int) ((c * f) + this.g), j2, false, csoVar);
    }

    @Override // tb.csl
    public void a(ScrollInterceptView.a provider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db559c5", new Object[]{this, provider});
            return;
        }
        q.c(provider, "provider");
        this.o = provider;
    }

    @Override // tb.csl
    public void a(ScrollInterceptView.b callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db5ce24", new Object[]{this, callback});
            return;
        }
        q.c(callback, "callback");
        this.p = callback;
    }

    @Override // tb.csl
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.j;
    }

    @Override // tb.csl
    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    @Override // tb.csl
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.h;
    }

    @Override // tb.csl
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        ScrollInterceptView scrollInterceptView = this.e;
        if (scrollInterceptView == null) {
            q.b(c.MSG_SOURCE_PARENT);
        }
        return scrollInterceptView.getHeight() - this.f;
    }

    public void g(int i) {
        ScrollInterceptView.b bVar;
        ScrollInterceptView.b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.j != -1 && i == -1 && (bVar2 = this.p) != null) {
            bVar2.a();
        }
        int i2 = this.j;
        this.j = i;
        if (i == i2 || (bVar = this.p) == null) {
            return;
        }
        bVar.a(i2, i);
    }

    @Override // tb.csl
    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    @Override // tb.csl
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.s = z;
        }
    }

    @Override // tb.csl
    public void a(ruw<? super Boolean, ? super Boolean, t> ruwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc53bc4", new Object[]{this, ruwVar});
        } else {
            this.b = ruwVar;
        }
    }

    @Override // tb.csl
    public void a(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdbfc750", new Object[]{this, rukVar});
        } else {
            this.t = rukVar;
        }
    }

    @Override // tb.csl
    public void b(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec42cdd1", new Object[]{this, rukVar});
        } else {
            this.c = rukVar;
        }
    }

    @Override // tb.csl
    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.h == this.g;
    }

    private final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        ScrollInterceptView.a aVar = this.o;
        if (aVar == null) {
            return false;
        }
        return aVar.a();
    }

    private final View m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93b2e9b6", new Object[]{this});
        }
        ScrollInterceptView scrollInterceptView = this.e;
        if (scrollInterceptView == null) {
            q.b(c.MSG_SOURCE_PARENT);
        }
        return scrollInterceptView.getChildAt(0);
    }

    private final boolean c(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("89094503", new Object[]{this, motionEvent})).booleanValue() : motionEvent.getY() >= ((float) this.h);
    }

    private final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        int i = this.h;
        if (i == this.g) {
            g(3);
        } else if (i == c()) {
            g(0);
        } else {
            g(4);
        }
    }
}
