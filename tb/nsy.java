package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import com.taobao.android.searchbaseframe.meta.uikit.header.behavior.d;
import kotlin.TypeCastException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.iqt;

/* loaded from: classes8.dex */
public final class nsy extends com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private MetaLayout e;
    private int f;
    private final int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private ValueAnimator l;
    private int m;
    private itl n;
    private final ValueAnimator.AnimatorUpdateListener o;
    private final ius<?, ?, ?> p;

    /* loaded from: classes8.dex */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, animation});
                return;
            }
            nsy nsyVar = nsy.this;
            q.a((Object) animation, "animation");
            Object animatedValue = animation.getAnimatedValue();
            if (animatedValue == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
            }
            nsy.a(nsyVar, ((Integer) animatedValue).intValue());
            nsy.e(nsy.this);
            itl f = nsy.f(nsy.this);
            if (f != null) {
                f.a(nsy.this.f(), nsy.this.h());
            }
            if (ite.a(nsy.this.h(), 0.0f)) {
                itl f2 = nsy.f(nsy.this);
                if (f2 != null) {
                    f2.aH_();
                }
            } else {
                itl f3 = nsy.f(nsy.this);
                if (f3 != null) {
                    f3.aG_();
                }
            }
            MetaLayout g = nsy.g(nsy.this);
            if (g == null) {
                return;
            }
            g.requestLayout();
        }
    }

    static {
        kge.a(35787568);
        Companion = new a(null);
    }

    public static /* synthetic */ Object ipc$super(nsy nsyVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a, tb.itj
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a, tb.itj
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-1588084104);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsy(View view, ius<?, ?, ?> widget) {
        super(view, true, new d(1000, 1001, 1000), 0);
        q.c(widget, "widget");
        this.p = widget;
        this.g = 150;
        this.i = -this.h;
        this.j = 2;
        this.o = new b();
    }

    public static final /* synthetic */ void a(nsy nsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6d69304", new Object[]{nsyVar});
        } else {
            nsyVar.l();
        }
    }

    public static final /* synthetic */ void a(nsy nsyVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3fc407f", new Object[]{nsyVar, new Integer(i)});
        } else {
            nsyVar.b = i;
        }
    }

    public static final /* synthetic */ void b(nsy nsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5599985", new Object[]{nsyVar});
        } else {
            nsyVar.n();
        }
    }

    public static final /* synthetic */ itk c(nsy nsyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itk) ipChange.ipc$dispatch("1b803f20", new Object[]{nsyVar}) : nsyVar.d;
    }

    public static final /* synthetic */ int d(nsy nsyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c25fa67a", new Object[]{nsyVar})).intValue() : nsyVar.m;
    }

    public static final /* synthetic */ void e(nsy nsyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e2ad08", new Object[]{nsyVar});
        } else {
            nsyVar.k();
        }
    }

    public static final /* synthetic */ itl f(nsy nsyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (itl) ipChange.ipc$dispatch("d265c25c", new Object[]{nsyVar}) : nsyVar.n;
    }

    public static final /* synthetic */ MetaLayout g(nsy nsyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MetaLayout) ipChange.ipc$dispatch("bdbc7683", new Object[]{nsyVar}) : nsyVar.e;
    }

    public final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        this.f = i;
        this.b = -i;
        this.i = -this.h;
    }

    public final void a(itl itlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee568697", new Object[]{this, itlVar});
        } else {
            this.n = itlVar;
        }
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        this.b = -i;
        this.i = -this.h;
        this.j = 2;
    }

    @Override // tb.itj
    public int a(int i, int i2, int i3) {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        this.m = i2;
        m();
        float f = 1.0f;
        float f2 = this.b;
        if (f2 < (-this.f) || i >= 0) {
            z = false;
        } else {
            f = 0.5f;
            z = true;
        }
        int i4 = (int) (i * f);
        if (i < 0 && i4 == 0) {
            i4 = -1;
        }
        float f3 = f2 - i4;
        if (i4 < 0 && f3 > 0) {
            f3 = 0.0f;
        } else if (i4 > 0) {
            View view = this.f14987a;
            q.a((Object) view, "view");
            float measuredHeight = view.getMeasuredHeight() + f3;
            if (!f()) {
                measuredHeight += i2;
            }
            float f4 = i2;
            if (measuredHeight < f4) {
                if (!f()) {
                    f4 = 0.0f;
                }
                View view2 = this.f14987a;
                q.a((Object) view2, "view");
                f3 = f4 - view2.getMeasuredHeight();
            }
        }
        float b2 = rwf.b(f3, this.i);
        this.b = (int) b2;
        k();
        MetaLayout metaLayout = this.e;
        if (metaLayout != null) {
            if (this.b > (-this.f)) {
                z2 = false;
            }
            metaLayout.setCanFling(z2);
        }
        l();
        return z ? i : (int) (f2 - b2);
    }

    private final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        View view = this.f14987a;
        q.a((Object) view, "view");
        a(rwf.a(-1.0f, rwf.b(0.0f, ((this.f + this.b) * 1.0f) / ((view.getMeasuredHeight() - this.f) - this.m))) + 1.0f);
    }

    private final void l() {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        if (this.b >= (-this.f)) {
            i = (this.b < (-this.f) || this.b >= (-this.h)) ? 3 : 2;
        }
        this.j = i;
    }

    private final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (!o()) {
        } else {
            ValueAnimator valueAnimator = this.l;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.l = null;
        }
    }

    private final void a(ValueAnimator valueAnimator, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46f953b7", new Object[]{this, valueAnimator, new Integer(i)});
            return;
        }
        m();
        this.l = valueAnimator;
        valueAnimator.addUpdateListener(this.o);
        valueAnimator.addListener(new c());
        if (i >= 0) {
            valueAnimator.setDuration(i);
        } else {
            valueAnimator.setDuration(300L);
        }
        valueAnimator.start();
    }

    /* loaded from: classes8.dex */
    public static final class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animation});
                return;
            }
            q.c(animation, "animation");
            nsy.a(nsy.this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            q.c(animation, "animation");
            nsy.a(nsy.this);
            nsy.b(nsy.this);
            itk c = nsy.c(nsy.this);
            if (c == null) {
                return;
            }
            c.a(0, nsy.d(nsy.this), 0);
        }
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a
    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : -this.b;
    }

    private final void n() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.k = this.j;
        MetaLayout metaLayout = this.e;
        if (metaLayout != null) {
            metaLayout.setCanFling(true);
        }
        if (this.k == 1) {
            i = this.f;
        } else {
            i = this.h;
        }
        this.i = -i;
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a, tb.itj
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i != 0) {
        } else {
            n();
        }
    }

    private final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null) {
            if (valueAnimator == null) {
                q.a();
            }
            if (valueAnimator.isRunning()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void a(nsy nsyVar, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87345cf", new Object[]{nsyVar, new Boolean(z), new Integer(i), obj});
            return;
        }
        if ((i & 1) != 0) {
            z = true;
        }
        nsyVar.a(z);
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.j == 3 || o()) {
        } else {
            MetaLayout metaLayout = this.e;
            if (metaLayout != null) {
                metaLayout.setCanFling(false);
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(this.b, -this.h);
            q.a((Object) ofInt, "ValueAnimator.ofInt(translation, -minHeight)");
            if (z) {
                i = -1;
            }
            a(ofInt, i);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.b, -this.f);
        q.a((Object) ofInt, "ValueAnimator.ofInt(translation, -initHeight)");
        a(ofInt, -1);
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        View view = this.f14987a;
        q.a((Object) view, "view");
        ValueAnimator ofInt = ValueAnimator.ofInt(this.b, (-view.getMeasuredHeight()) + this.m);
        q.a((Object) ofInt, "ValueAnimator.ofInt(tran…asuredHeight + listStart)");
        a(ofInt, -1);
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a, tb.itj
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        l();
        int i2 = this.k;
        if (i2 == 2) {
            if (this.b <= (-this.f)) {
                return;
            }
            if (this.b >= (-this.f) + this.g) {
                this.p.postScopeEvent(iqt.g.a("dragHandler", false), "childPageWidget");
                a(this, false, 1, null);
                return;
            }
            this.p.postScopeEvent(iqt.h.a("dragHandler"), "childPageWidget");
        } else if (i2 != 3) {
        } else {
            if (this.b <= (-this.h) - this.g) {
                this.p.postScopeEvent(iqt.i.a("dragHandler"), "childPageWidget");
                j();
                return;
            }
            this.p.postScopeEvent(iqt.g.a("dragHandler"), "childPageWidget");
            a(this, false, 1, null);
        }
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a, tb.itj
    public void a(MetaLayout layout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b8809f", new Object[]{this, layout});
            return;
        }
        q.c(layout, "layout");
        this.e = layout;
        this.m = layout.getListStart();
    }
}
