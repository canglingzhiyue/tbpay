package com.taobao.android.searchbaseframe.xsl.refact;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;
import com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader;
import kotlin.TypeCastException;
import tb.kge;
import tb.rwf;

/* loaded from: classes6.dex */
public final class p extends com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final float e;
    private MetaLayout f;
    private ValueAnimator g;
    private final int h;
    private int i;
    private boolean j;
    private boolean k;
    private final q l;
    private final TBOldRefreshHeader m;
    private final PullRefreshContainer n;

    /* loaded from: classes6.dex */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public a(boolean z) {
            this.b = z;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, it});
                return;
            }
            kotlin.jvm.internal.q.a((Object) it, "it");
            Object animatedValue = it.getAnimatedValue();
            if (!(animatedValue instanceof Integer)) {
                animatedValue = null;
            }
            Integer num = (Integer) animatedValue;
            if (num == null) {
                return;
            }
            p.a(p.this, num.intValue());
            p.d(p.this).updateOffset(p.c(p.this));
            p.a(p.this, this.b);
            MetaLayout a2 = p.a(p.this);
            if (a2 == null) {
                kotlin.jvm.internal.q.a();
            }
            a2.requestLayout();
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            MetaLayout a2 = p.a(p.this);
            if (a2 == null) {
                return;
            }
            a2.resetScrollNode();
        }
    }

    static {
        kge.a(-1937508188);
    }

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a, tb.itj
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static final /* synthetic */ MetaLayout a(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MetaLayout) ipChange.ipc$dispatch("9512b600", new Object[]{pVar}) : pVar.f;
    }

    public static final /* synthetic */ void a(p pVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2292d4b6", new Object[]{pVar, new Integer(i)});
        } else {
            pVar.b = i;
        }
    }

    public static final /* synthetic */ void a(p pVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22931487", new Object[]{pVar, new Boolean(z)});
        } else {
            pVar.b(z);
        }
    }

    public static final /* synthetic */ TBOldRefreshHeader b(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBOldRefreshHeader) ipChange.ipc$dispatch("f613e00f", new Object[]{pVar}) : pVar.m;
    }

    public static final /* synthetic */ void b(p pVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be729f7", new Object[]{pVar, new Integer(i)});
        } else {
            pVar.i = i;
        }
    }

    public static final /* synthetic */ int c(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c8191e", new Object[]{pVar})).intValue() : pVar.b;
    }

    public static final /* synthetic */ PullRefreshContainer d(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PullRefreshContainer) ipChange.ipc$dispatch("307b8dec", new Object[]{pVar}) : pVar.n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q widget, TBOldRefreshHeader refreshHeader, PullRefreshContainer container, boolean z, com.taobao.android.searchbaseframe.meta.uikit.header.behavior.d dVar) {
        super(container, z, dVar);
        kotlin.jvm.internal.q.c(widget, "widget");
        kotlin.jvm.internal.q.c(refreshHeader, "refreshHeader");
        kotlin.jvm.internal.q.c(container, "container");
        this.l = widget;
        this.m = refreshHeader;
        this.n = container;
        this.e = 0.8f;
        this.h = -com.taobao.android.searchbaseframe.util.j.a(300.0f);
        this.i = -com.taobao.android.searchbaseframe.util.j.a(50.0f);
        this.b = this.h;
        this.m.post(new Runnable() { // from class: com.taobao.android.searchbaseframe.xsl.refact.p.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    p pVar = p.this;
                    View childAt = p.b(p.this).getChildAt(0);
                    if (childAt == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
                    }
                    View childAt2 = ((FrameLayout) childAt).getChildAt(1);
                    kotlin.jvm.internal.q.a((Object) childAt2, "(refreshHeader.getChildA…rameLayout).getChildAt(1)");
                    p.b(pVar, -childAt2.getMeasuredHeight());
                } catch (Exception unused) {
                }
            }
        });
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        MetaLayout metaLayout = this.f;
        if (metaLayout == null) {
            return;
        }
        metaLayout.setCanFling(true);
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.k;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.k) {
            b(true);
        } else {
            int i = this.b;
            int i2 = this.h;
            if (i <= i2) {
                return;
            }
            a(i2, false);
        }
    }

    private final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        a(rwf.b(1.0f, ((this.b - this.h) * 1.0f) / (-this.i)));
        if (!z) {
            return;
        }
        this.l.a(true, h());
    }

    @Override // tb.itj
    public int a(int i, int i2, int i3) {
        MetaLayout metaLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (!this.j) {
            return 0;
        }
        MetaLayout metaLayout2 = this.f;
        if (metaLayout2 != null) {
            metaLayout2.setCanFling(true);
        }
        if (i == -2147483647) {
            return i;
        }
        if (i > 0) {
            MetaLayout metaLayout3 = this.f;
            if (metaLayout3 != null) {
                metaLayout3.setCanFling(false);
            }
            ValueAnimator valueAnimator = this.g;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int c = rwf.c(this.h, this.b - i);
            int i4 = this.b - c;
            this.b = c;
            this.n.updateOffset(this.b);
            b(false);
            if (i4 == 0 && (metaLayout = this.f) != null) {
                metaLayout.setCanFling(true);
            }
            return i4;
        } else if (i3 != 0) {
            return i;
        } else {
            if (!this.k) {
                return 0;
            }
            MetaLayout metaLayout4 = this.f;
            if (metaLayout4 != null) {
                metaLayout4.setCanFling(false);
            }
            int i5 = (int) (i * this.e);
            if (i5 == 0) {
                i5 = -1;
            }
            int d = rwf.d(0, this.b - i5);
            int i6 = this.b - d;
            this.b = d;
            this.n.updateOffset(this.b);
            b(false);
            return rwf.c(i, (int) (i6 / this.e));
        }
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a, tb.itj
    public void a(MetaLayout metaLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5b8809f", new Object[]{this, metaLayout});
        } else {
            this.f = metaLayout;
        }
    }

    private final void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator anim = ValueAnimator.ofInt(this.b, i);
        anim.addUpdateListener(new a(z));
        kotlin.jvm.internal.q.a((Object) anim, "anim");
        anim.setInterpolator(new LinearInterpolator());
        anim.addListener(new b());
        anim.start();
        this.g = anim;
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a, tb.itj
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (!this.j) {
        } else {
            ValueAnimator valueAnimator = this.g;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (i != 0) {
                return;
            }
            this.k = true;
            b(true);
        }
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a, tb.itj
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (!this.j || i != 0) {
        } else {
            this.k = false;
            int i2 = this.b;
            int i3 = this.h;
            int i4 = this.i;
            if (i2 > i3 - i4) {
                a(i3 - i4, true);
                this.l.b();
            } else if (this.b <= this.h) {
            } else {
                int i5 = this.b;
                int i6 = this.h;
                if (i5 >= i6 - this.i) {
                    return;
                }
                a(i6, true);
            }
        }
    }
}
