package com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.content;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.arc;
import tb.emq;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class AURAOverPullContentViewBehavior extends CoordinatorLayout.Behavior<RecyclerView> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f9913a;
    private int[] b;
    private final Map<View, emq> c;
    private boolean d;
    private int e;
    private int f;
    private c g;

    static {
        kge.a(-520232556);
        kge.a(1080742448);
    }

    public static /* synthetic */ Object ipc$super(AURAOverPullContentViewBehavior aURAOverPullContentViewBehavior, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1609929457) {
            if (hashCode != -1041503870) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Boolean(super.layoutDependsOn((CoordinatorLayout) objArr[0], (View) objArr[1], (View) objArr[2]));
        }
        return new Boolean(super.onDependentViewChanged((CoordinatorLayout) objArr[0], (View) objArr[1], (View) objArr[2]));
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public /* synthetic */ boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c1ebe982", new Object[]{this, coordinatorLayout, recyclerView, view})).booleanValue() : a(coordinatorLayout, recyclerView, view);
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a00a6d0f", new Object[]{this, coordinatorLayout, recyclerView, view})).booleanValue() : b(coordinatorLayout, recyclerView, view);
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public /* synthetic */ boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39b7f443", new Object[]{this, coordinatorLayout, recyclerView, view, view2, new Integer(i), new Integer(i2)})).booleanValue() : a(coordinatorLayout, recyclerView, view, view2, i, i2);
    }

    public AURAOverPullContentViewBehavior(Context context) {
        this(context, null);
    }

    public AURAOverPullContentViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9913a = "AliSDetailLoadMoreContentBehavior";
        this.b = null;
        this.c = new HashMap();
        this.d = false;
        this.e = 0;
        this.f = 1;
        this.g = null;
        b().a(this.f);
        emu.a("com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.content.AURAOverPullContentViewBehavior");
    }

    public void a(int... iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c198176", new Object[]{this, iArr});
        } else {
            this.b = iArr;
        }
    }

    public boolean a(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c5a460b", new Object[]{this, coordinatorLayout, recyclerView, view, view2, new Integer(i), new Integer(i2)})).booleanValue() : (i == 1 && this.e == 0) || (i == 2 && this.e == 1);
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.e == 0;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afd31b8f", new Object[]{this, coordinatorLayout, recyclerView, view})).booleanValue();
        }
        int[] iArr = this.b;
        if (iArr == null) {
            arc.a().c("AliSDetailLoadMoreContentBehavior", "layoutDependsOn", "mDependViewIds is null");
            return super.layoutDependsOn(coordinatorLayout, recyclerView, view);
        }
        for (int i : iArr) {
            if (i == view.getId()) {
                if (!this.d) {
                    a(view);
                    b().a(coordinatorLayout, recyclerView, view);
                    this.d = true;
                    view.bringToFront();
                }
                return true;
            }
        }
        return super.layoutDependsOn(coordinatorLayout, recyclerView, view);
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        emq b = b(view);
        if (b == null) {
            arc.a().c("AliSDetailLoadMoreContentBehavior", "layoutDependsOn", "dependency View的Behavior必须为IAURAPullHandlerBehavior");
        } else {
            this.c.put(view, b);
        }
    }

    private emq b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (emq) ipChange.ipc$dispatch("4e560074", new Object[]{this, view});
        }
        emq emqVar = this.c.get(view);
        if (emqVar != null) {
            return emqVar;
        }
        CoordinatorLayout.Behavior b = ((CoordinatorLayout.b) view.getLayoutParams()).b();
        if (!(b instanceof emq)) {
            return null;
        }
        return (emq) b;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, View view) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("634c2d90", new Object[]{this, coordinatorLayout, recyclerView, view})).booleanValue();
        }
        emq b = b(view);
        if (b != null) {
            z = b.a();
        }
        b().a(coordinatorLayout, recyclerView, view, z);
        return super.onDependentViewChanged(coordinatorLayout, recyclerView, view);
    }

    private c b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("ec395257", new Object[]{this});
        }
        c cVar = this.g;
        if (cVar != null) {
            return cVar;
        }
        if (a()) {
            this.g = new a();
            return this.g;
        }
        throw new IllegalArgumentException("目前只支持水平布局");
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i == this.e) {
        } else {
            this.g = null;
            this.e = i;
            b(this.f);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.f = i;
        b().a(i);
    }
}
