package com.taobao.tao.recommend4.manager.weex2.container.drawer.impl;

import android.content.Context;
import android.os.Handler;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.ScrollInterceptView;
import com.taobao.tao.util.DensityUtil;
import tb.kge;
import tb.mto;

/* loaded from: classes8.dex */
public class NewScrollLogic implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int B;
    private int C;
    private int D;
    private VelocityTracker G;

    /* renamed from: a  reason: collision with root package name */
    private boolean f20960a;
    private Context d;
    private ScrollInterceptView e;
    private ScrollInterceptView.a n;
    private ScrollInterceptView.b o;
    private d q;
    private double x;
    private double y;
    private double z;
    private int b = -1;
    private int c = -1;
    private int f = 1;
    private int g = 0;
    private int h = 0;
    private int L = 0;
    private int i = -1;
    private boolean j = false;
    private boolean k = false;
    private boolean l = false;
    private float m = 0.0f;
    private int p = 0;
    private boolean r = false;
    private int s = -1;
    private float t = 0.5f;
    private float u = 0.3f;
    private boolean v = false;
    private boolean w = false;
    private int A = 0;
    private PullState E = PullState.PULL_DISMISS;
    private PullState F = PullState.PULL_MEDIUM;
    private int H = 300;
    private boolean I = false;
    private boolean J = false;
    private int K = 300;

    /* renamed from: com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.NewScrollLogic$3  reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20963a = new int[PullState.values().length];

        static {
            try {
                f20963a[PullState.PULL_TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20963a[PullState.PULL_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20963a[PullState.PULL_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20963a[PullState.PULL_DISMISS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes8.dex */
    public enum PullState {
        PULL_TOP,
        PULL_MEDIUM,
        PULL_END,
        PULL_DISMISS;

        @Override // java.lang.Enum
        public String toString() {
            int i = AnonymousClass3.f20963a[ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "3" : "2" : "1" : "0";
        }
    }

    static {
        kge.a(71071879);
        kge.a(484839292);
    }

    public static /* synthetic */ int a(NewScrollLogic newScrollLogic) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ca150ae3", new Object[]{newScrollLogic})).intValue() : newScrollLogic.C;
    }

    public static /* synthetic */ PullState a(NewScrollLogic newScrollLogic, PullState pullState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PullState) ipChange.ipc$dispatch("9ec50926", new Object[]{newScrollLogic, pullState});
        }
        newScrollLogic.E = pullState;
        return pullState;
    }

    public static /* synthetic */ void a(NewScrollLogic newScrollLogic, int i, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8882a1e3", new Object[]{newScrollLogic, new Integer(i), new Long(j), new Boolean(z)});
        } else {
            newScrollLogic.a(i, j, z);
        }
    }

    public static /* synthetic */ void a(NewScrollLogic newScrollLogic, View view, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b69793", new Object[]{newScrollLogic, view, new Integer(i), new Boolean(z)});
        } else {
            newScrollLogic.a(view, i, z);
        }
    }

    public static /* synthetic */ int b(NewScrollLogic newScrollLogic) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7190e4a4", new Object[]{newScrollLogic})).intValue() : newScrollLogic.K;
    }

    public static /* synthetic */ View c(NewScrollLogic newScrollLogic) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("20f75e34", new Object[]{newScrollLogic}) : newScrollLogic.m();
    }

    public static /* synthetic */ int d(NewScrollLogic newScrollLogic) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c0889826", new Object[]{newScrollLogic})).intValue() : newScrollLogic.g;
    }

    public static /* synthetic */ int e(NewScrollLogic newScrollLogic) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("680471e7", new Object[]{newScrollLogic})).intValue() : newScrollLogic.D;
    }

    public static /* synthetic */ ScrollInterceptView.b f(NewScrollLogic newScrollLogic) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScrollInterceptView.b) ipChange.ipc$dispatch("dbd9cc24", new Object[]{newScrollLogic}) : newScrollLogic.o;
    }

    public static /* synthetic */ PullState g(NewScrollLogic newScrollLogic) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PullState) ipChange.ipc$dispatch("b6c7de0", new Object[]{newScrollLogic}) : newScrollLogic.E;
    }

    public static /* synthetic */ PullState h(NewScrollLogic newScrollLogic) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PullState) ipChange.ipc$dispatch("dea0c2ff", new Object[]{newScrollLogic}) : newScrollLogic.F;
    }

    public static /* synthetic */ int i(NewScrollLogic newScrollLogic) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f3d8eb", new Object[]{newScrollLogic})).intValue() : newScrollLogic.B;
    }

    public static /* synthetic */ int j(NewScrollLogic newScrollLogic) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ad6fb2ac", new Object[]{newScrollLogic})).intValue() : newScrollLogic.c;
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void a(ScrollInterceptView scrollInterceptView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("983dad5", new Object[]{this, scrollInterceptView});
            return;
        }
        this.e = scrollInterceptView;
        this.d = scrollInterceptView.getContext();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.p != 0) {
        } else {
            this.p = ViewConfiguration.get(this.d).getScaledTouchSlop();
        }
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.i == -1 || !c(motionEvent)) {
            return false;
        }
        d dVar = this.q;
        if (dVar != null && dVar.b()) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            this.j = false;
            this.l = motionEvent.getY() < ((float) (this.h + this.g));
        }
        if (this.j) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.k = l();
            this.j = false;
            this.m = motionEvent.getY();
            return false;
        } else if (action != 2) {
            return false;
        } else {
            g();
            if (this.i != 3) {
                if (Math.abs(motionEvent.getY() - this.m) < this.p) {
                    return false;
                }
                this.j = true;
                return true;
            } else if (!this.k && !this.l) {
                return false;
            } else {
                float y = motionEvent.getY() - this.m;
                if (Math.abs(y) < this.p) {
                    return false;
                }
                this.m = motionEvent.getY();
                if (y < 0.0f) {
                    this.k = false;
                    return false;
                }
                this.j = true;
                return true;
            }
        }
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public boolean b(MotionEvent motionEvent) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.G == null) {
            this.G = VelocityTracker.obtain();
        }
        this.G.addMovement(motionEvent);
        boolean c = c(motionEvent);
        if (this.i == -1) {
            return false;
        }
        d dVar = this.q;
        if (dVar != null && dVar.b()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                h();
                return true;
            } else if (action == 2) {
                if (this.s == -1) {
                    this.s = this.g;
                    j();
                }
                g();
                h(1);
                float y = motionEvent.getY() - this.m;
                if (!this.v) {
                    this.v = Math.abs(y) >= ((float) this.p);
                }
                if (!this.v) {
                    return true;
                }
                this.m = motionEvent.getY();
                if (m() != null) {
                    a(m(), (int) y, true);
                }
                if (this.r && ((i = this.s) == 0 || i == c())) {
                    float f = this.t;
                    int i2 = this.c;
                    float f2 = (1.0f - f) * i2;
                    float f3 = i2 * (1.0f + f);
                    int i3 = this.g;
                    if (i3 <= f2 || i3 >= f3) {
                        return true;
                    }
                    if ((i3 < i2 ? (i3 - f2) / (f * i2) : (f3 - i3) / (f * i2)) >= this.u) {
                        i();
                        b(this.c);
                        ScrollInterceptView scrollInterceptView = this.e;
                        if (scrollInterceptView != null) {
                            scrollInterceptView.setDropTouch(true);
                        }
                        return false;
                    }
                }
            } else if (action == 3) {
                h();
                return true;
            }
        } else if (!c) {
            return false;
        } else {
            this.s = this.g;
            j();
            this.m = motionEvent.getY();
            h(1);
        }
        return true;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        this.G.computeCurrentVelocity(1000);
        int i = this.g;
        if (i > this.D) {
            if (this.I) {
                b(this.A + DensityUtil.dip2px(this.d, 32.0f));
                ScrollInterceptView.b bVar = this.o;
                if (bVar == null) {
                    return;
                }
                bVar.a(this.E, PullState.PULL_DISMISS);
                this.o.a();
                return;
            }
            this.F = PullState.PULL_MEDIUM;
            b(this.C);
            return;
        }
        if (i - this.s >= 0) {
            z = true;
        }
        this.F = this.E;
        int i2 = this.g;
        if (i2 < this.B || i2 >= this.C) {
            int i3 = this.g;
            if (i3 >= this.C && i3 < this.D) {
                if (z) {
                    if (this.E == PullState.PULL_TOP) {
                        this.F = PullState.PULL_MEDIUM;
                        b(this.C);
                    } else {
                        this.F = PullState.PULL_MEDIUM;
                        b(this.C);
                    }
                } else if (this.G.getYVelocity() != 0.0f && Math.abs(this.G.getYVelocity()) > 8000.0f) {
                    this.F = PullState.PULL_TOP;
                    b(this.B);
                } else {
                    this.F = PullState.PULL_MEDIUM;
                    b(this.C);
                }
            }
        } else if (z) {
            this.F = PullState.PULL_MEDIUM;
            b(this.C);
        } else {
            this.F = PullState.PULL_TOP;
            b(this.B);
        }
        i();
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.s = -1;
        this.r = false;
        this.v = false;
    }

    private void a(View view, int i, boolean z) {
        ScrollInterceptView.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c25511b", new Object[]{this, view, new Integer(i), new Boolean(z)});
            return;
        }
        int i2 = this.g;
        if (z) {
            this.g = i(i + i2);
        } else {
            this.g = i + i2;
        }
        ViewCompat.offsetTopAndBottom(view, this.g - i2);
        if (this.e == null || (bVar = this.o) == null) {
            return;
        }
        bVar.a(i2, this.g, c(), this.e.getHeight(), this.b, this.t);
        this.e.notifyScrollChange();
    }

    private int i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5c85886", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i > c()) {
            return c();
        }
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    private void j() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (!this.f20960a) {
        } else {
            int i = this.s;
            float f = this.t;
            int i2 = this.c;
            if (i < (1.0f - f) * i2 || i > i2 * (f + 1.0f)) {
                z = true;
            }
            this.r = z;
        }
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        if (z) {
            i = i(i);
        }
        if (m() != null) {
            ViewCompat.offsetTopAndBottom(m(), this.g - i);
        }
        if (this.e != null) {
            ScrollInterceptView.b bVar = this.o;
            if (bVar != null) {
                bVar.a(this.g, i, c(), this.e.getHeight(), this.b, this.t);
            }
            this.e.notifyScrollChange();
        }
        this.g = i;
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            a(i, this.H, true);
        }
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            a(z ? 0 : c(), 450L, false);
        }
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void a(ScrollInterceptView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6cd71b8", new Object[]{this, aVar});
        } else {
            this.n = aVar;
        }
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void a(ScrollInterceptView.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6cde617", new Object[]{this, bVar});
        } else {
            this.o = bVar;
        }
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.i;
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        this.g = i;
        this.A = i;
        this.B = 0;
        if (this.x < mto.a.GEO_NOT_SUPPORT || this.y <= mto.a.GEO_NOT_SUPPORT || this.z <= mto.a.GEO_NOT_SUPPORT || this.A <= 0) {
            return;
        }
        k();
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.g;
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        ScrollInterceptView scrollInterceptView = this.e;
        if (scrollInterceptView == null) {
            return 0;
        }
        return scrollInterceptView.getHeight() - this.f;
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void d(int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        if (i <= 0) {
            z = false;
        }
        this.f20960a = z;
        this.b = i;
        this.c = i;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.b;
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a(f(), 400L, false);
        }
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        JSONObject parseObject = JSONObject.parseObject(str);
        if (parseObject == null || parseObject.keySet().size() == 0) {
            return;
        }
        double parseDouble = Double.parseDouble(parseObject.getString("top_percent"));
        double parseDouble2 = Double.parseDouble(parseObject.getString("medium_percent"));
        double parseDouble3 = Double.parseDouble(parseObject.getString("end_percent"));
        if (a(parseDouble, this.x) && a(parseDouble2, this.y) && a(parseDouble3, this.z)) {
            z = false;
        }
        if (com.taobao.homepage.utils.b.c() && z) {
            this.w = false;
        }
        this.x = parseDouble;
        this.y = parseDouble2;
        this.z = parseDouble3;
        if (this.x < mto.a.GEO_NOT_SUPPORT || this.y <= mto.a.GEO_NOT_SUPPORT || this.z <= mto.a.GEO_NOT_SUPPORT || this.A <= 0) {
            return;
        }
        k();
    }

    private boolean a(double d, double d2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0efa2c", new Object[]{this, new Double(d), new Double(d2)})).booleanValue() : Math.abs(d - d2) < 1.0E-6d;
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        VelocityTracker velocityTracker = this.G;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.recycle();
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
        } else {
            this.H = i;
        }
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d3132", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = i - this.L;
        if (Math.abs(i2) <= 0) {
            return;
        }
        ViewCompat.offsetTopAndBottom(m(), i2);
        this.L = i;
        this.C += i2;
        this.g = i(this.g + i2);
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.I = z;
        }
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.J = z;
        }
    }

    @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.b
    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
        } else {
            this.K = i;
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams.topMargin = (int) (this.A * this.x);
        this.e.setLayoutParams(layoutParams);
        int i = this.A;
        this.C = (int) (i * this.y);
        this.D = (int) (i * this.z);
        if (this.w) {
            return;
        }
        this.w = true;
        if (this.J) {
            a(m(), this.C - this.A, true);
            ScrollInterceptView.b bVar = this.o;
            if (bVar != null) {
                bVar.a(this.E, this.F);
            }
            this.E = this.F;
            h(1);
            return;
        }
        new Handler().postDelayed(new Runnable() { // from class: com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.NewScrollLogic.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                NewScrollLogic newScrollLogic = NewScrollLogic.this;
                NewScrollLogic.a(newScrollLogic, NewScrollLogic.a(newScrollLogic), NewScrollLogic.b(NewScrollLogic.this), false);
            }
        }, 100L);
    }

    private void a(int i, long j, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261a2d6b", new Object[]{this, new Integer(i), new Long(j), new Boolean(z)});
            return;
        }
        d dVar = this.q;
        if (dVar != null) {
            dVar.a();
        }
        h(2);
        this.q = new d(this.g, i, j);
        this.q.f20965a = new c() { // from class: com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.NewScrollLogic.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.c
            public void a(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i2)});
                } else if (NewScrollLogic.c(NewScrollLogic.this) == null) {
                } else {
                    NewScrollLogic newScrollLogic = NewScrollLogic.this;
                    NewScrollLogic.a(newScrollLogic, NewScrollLogic.c(newScrollLogic), i2, z);
                }
            }

            @Override // com.taobao.tao.recommend4.manager.weex2.container.drawer.impl.c
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (NewScrollLogic.d(NewScrollLogic.this) > NewScrollLogic.e(NewScrollLogic.this)) {
                } else {
                    if (NewScrollLogic.f(NewScrollLogic.this) != null) {
                        NewScrollLogic.f(NewScrollLogic.this).a(NewScrollLogic.g(NewScrollLogic.this), NewScrollLogic.h(NewScrollLogic.this));
                    }
                    NewScrollLogic newScrollLogic = NewScrollLogic.this;
                    NewScrollLogic.a(newScrollLogic, NewScrollLogic.h(newScrollLogic));
                    if (NewScrollLogic.d(NewScrollLogic.this) == NewScrollLogic.i(NewScrollLogic.this)) {
                        NewScrollLogic.this.h(3);
                    } else if (NewScrollLogic.d(NewScrollLogic.this) == NewScrollLogic.j(NewScrollLogic.this)) {
                        NewScrollLogic.this.h(4);
                    } else if (NewScrollLogic.d(NewScrollLogic.this) == NewScrollLogic.this.c()) {
                        NewScrollLogic.this.h(0);
                    } else {
                        NewScrollLogic.this.h(1);
                    }
                }
            }
        };
        this.q.c();
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        ScrollInterceptView.a aVar = this.n;
        if (aVar == null) {
            return false;
        }
        return aVar.a();
    }

    private View m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93b2e9b6", new Object[]{this});
        }
        ScrollInterceptView scrollInterceptView = this.e;
        if (scrollInterceptView == null) {
            return null;
        }
        return scrollInterceptView.getChildAt(0);
    }

    private boolean c(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("89094503", new Object[]{this, motionEvent})).booleanValue() : motionEvent.getY() >= ((float) this.g);
    }
}
