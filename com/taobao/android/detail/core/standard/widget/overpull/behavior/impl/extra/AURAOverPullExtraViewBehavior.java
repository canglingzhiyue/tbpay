package com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.extra;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.OverScroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emq;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class AURAOverPullExtraViewBehavior extends CoordinatorLayout.Behavior<View> implements emq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private OverScroller f9915a;
    private float b;
    private com.taobao.android.detail.core.standard.widget.overpull.b c;
    private boolean d;
    private final int e;
    private final int f;
    private final int g;
    private int h;
    private int i;
    private int j;
    private c k;

    static {
        kge.a(-781919614);
        kge.a(1745372999);
    }

    public static /* synthetic */ Object ipc$super(AURAOverPullExtraViewBehavior aURAOverPullExtraViewBehavior, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 845915598) {
            super.onStopNestedScroll((CoordinatorLayout) objArr[0], (View) objArr[1], (View) objArr[2], ((Number) objArr[3]).intValue());
            return null;
        } else if (hashCode != 1332091669) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onNestedPreScroll((CoordinatorLayout) objArr[0], (View) objArr[1], (View) objArr[2], ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), (int[]) objArr[5], ((Number) objArr[6]).intValue());
            return null;
        }
    }

    public static /* synthetic */ OverScroller a(AURAOverPullExtraViewBehavior aURAOverPullExtraViewBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OverScroller) ipChange.ipc$dispatch("631c1b8f", new Object[]{aURAOverPullExtraViewBehavior}) : aURAOverPullExtraViewBehavior.f9915a;
    }

    public static /* synthetic */ void a(AURAOverPullExtraViewBehavior aURAOverPullExtraViewBehavior, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("774d861b", new Object[]{aURAOverPullExtraViewBehavior, view});
        } else {
            aURAOverPullExtraViewBehavior.b(view);
        }
    }

    public static /* synthetic */ void a(AURAOverPullExtraViewBehavior aURAOverPullExtraViewBehavior, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8676705d", new Object[]{aURAOverPullExtraViewBehavior, new Boolean(z)});
        } else {
            aURAOverPullExtraViewBehavior.a(z);
        }
    }

    public static /* synthetic */ c b(AURAOverPullExtraViewBehavior aURAOverPullExtraViewBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("d64b362d", new Object[]{aURAOverPullExtraViewBehavior}) : aURAOverPullExtraViewBehavior.b();
    }

    public AURAOverPullExtraViewBehavior(Context context) {
        this(context, null);
    }

    public AURAOverPullExtraViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0.5f;
        this.d = false;
        this.e = -1;
        this.f = 0;
        this.g = 1;
        this.h = -1;
        this.i = 0;
        this.j = 1;
        this.f9915a = new OverScroller(context);
        b().a(this.j);
        emu.a("com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.extra.AURAOverPullExtraViewBehavior");
    }

    private c b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("89bad5a0", new Object[]{this});
        }
        c cVar = this.k;
        if (cVar != null) {
            return cVar;
        }
        if (c()) {
            this.k = new com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.extra.a();
            return this.k;
        }
        throw new IllegalArgumentException("目前只支持水平布局");
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.i == 0;
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39b7f443", new Object[]{this, coordinatorLayout, view, view2, view3, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.j == 2) {
            return false;
        }
        if ((i != 1 || this.i != 0) && (i != 2 || this.i != 1)) {
            z = false;
        }
        if (z) {
            this.f9915a.abortAnimation();
            a(false);
        }
        return z;
    }

    public void a(com.taobao.android.detail.core.standard.widget.overpull.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fc152cf", new Object[]{this, bVar});
        } else {
            this.c = bVar;
        }
    }

    public void a(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0ff5ab", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        this.b = f;
        b().a(f, i);
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75bc679c", new Object[]{this, coordinatorLayout, view, new Integer(i)})).booleanValue();
        }
        b().a(coordinatorLayout, view, i);
        return true;
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f661b15", new Object[]{this, coordinatorLayout, view, view2, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
            return;
        }
        super.onNestedPreScroll(coordinatorLayout, view, view2, i, i2, iArr, i3);
        if (i == 0 || !(view2 instanceof RecyclerView) || !a((RecyclerView) view2)) {
            return;
        }
        b().a(coordinatorLayout, view, view2, i, i2, iArr, i3);
        b(view);
    }

    private boolean a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4660659a", new Object[]{this, recyclerView})).booleanValue();
        }
        com.taobao.android.detail.core.standard.widget.overpull.b bVar = this.c;
        if (bVar != null) {
            return bVar.a(recyclerView);
        }
        return false;
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("326ba5ce", new Object[]{this, coordinatorLayout, view, view2, new Integer(i)});
            return;
        }
        super.onStopNestedScroll(coordinatorLayout, view, view2, i);
        a(view);
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (!this.f9915a.isFinished()) {
        } else {
            a(true);
            b().a(view, this.f9915a);
            ViewCompat.postOnAnimation(view, new a(view));
        }
    }

    private void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (this.c == null) {
        } else {
            boolean z = !a();
            if (b().a(view) >= this.b) {
                if (1 != this.h) {
                    this.c.a(view, z);
                }
                this.h = 1;
                return;
            }
            if (this.h != 0) {
                this.c.b(view, z);
            }
            this.h = 0;
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.d != z) {
            this.h = -1;
        }
        this.d = z;
    }

    @Override // tb.emq
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.d;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i == this.i) {
        } else {
            this.k = null;
            this.i = i;
            b(this.j);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.j = i;
        b().a(i);
    }

    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final View b;

        static {
            kge.a(737745930);
            kge.a(-1390502639);
        }

        public a(View view) {
            this.b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AURAOverPullExtraViewBehavior.a(AURAOverPullExtraViewBehavior.this).computeScrollOffset()) {
                AURAOverPullExtraViewBehavior.a(AURAOverPullExtraViewBehavior.this, this.b);
                AURAOverPullExtraViewBehavior.b(AURAOverPullExtraViewBehavior.this).b(this.b, AURAOverPullExtraViewBehavior.a(AURAOverPullExtraViewBehavior.this));
                ViewCompat.postOnAnimation(this.b, this);
            } else {
                AURAOverPullExtraViewBehavior.a(AURAOverPullExtraViewBehavior.this, false);
            }
        }
    }
}
