package tb;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.alibaba.android.ultron.ext.vlayout.e;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class bln extends blu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean i;
    private a b;
    public View k;
    public int l;
    public Rect j = new Rect();
    public float m = Float.NaN;

    /* renamed from: a  reason: collision with root package name */
    private int f25962a = 0;

    /* loaded from: classes2.dex */
    public interface a {
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    private int c(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5ddc93d", new Object[]{this, new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i2 >= i3) {
            return 0;
        }
        return i3 - i2;
    }

    public static /* synthetic */ Object ipc$super(bln blnVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void a(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.c cVar, bls blsVar, e eVar);

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27f1469", new Object[]{this, eVar});
        }
    }

    public boolean e(int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aef4f61b", new Object[]{this, new Integer(i2)})).booleanValue() : (i2 == Integer.MAX_VALUE || i2 == Integer.MIN_VALUE) ? false : true;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(1405101399);
        i = false;
    }

    public float h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10df", new Object[]{this})).floatValue() : this.m;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.f25962a;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void b_(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4da913f", new Object[]{this, new Integer(i2)});
        } else {
            this.f25962a = i2;
        }
    }

    public final View a(RecyclerView.Recycler recycler, VirtualLayoutManager.c cVar, e eVar, bls blsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6bce826", new Object[]{this, recycler, cVar, eVar, blsVar});
        }
        View a2 = cVar.a(recycler);
        if (a2 == null) {
            if (i && !cVar.c()) {
                throw new RuntimeException("received null view when unexpected");
            }
            blsVar.b = true;
            return null;
        }
        eVar.a(cVar, a2);
        return a2;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870432d9", new Object[]{this, recycler, state, eVar});
            return;
        }
        if (i) {
            String str = "call beforeLayout() on " + getClass().getSimpleName();
        }
        if (f_()) {
            if (this.k == null) {
                return;
            }
            return;
        }
        View view = this.k;
        if (view == null) {
            return;
        }
        eVar.c(view);
        this.k = null;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, int i2, int i3, int i4, e eVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c750c", new Object[]{this, recycler, state, new Integer(i2), new Integer(i3), new Integer(i4), eVar});
            return;
        }
        if (i) {
            String str = "call afterLayout() on " + getClass().getSimpleName();
        }
        if (f_()) {
            if (e(i4) && (view = this.k) != null) {
                this.j.union(view.getLeft(), this.k.getTop(), this.k.getRight(), this.k.getBottom());
            }
            if (!this.j.isEmpty()) {
                if (e(i4)) {
                    if (eVar.getOrientation() == 1) {
                        this.j.offset(0, -i4);
                    } else {
                        this.j.offset(-i4, 0);
                    }
                }
                int e = eVar.e();
                int f = eVar.f();
                if (eVar.getOrientation() != 1 ? this.j.intersects((-e) / 4, 0, e + (e / 4), f) : this.j.intersects(0, (-f) / 4, e, f + (f / 4))) {
                    if (this.k == null) {
                        this.k = eVar.d_();
                        eVar.a_(this.k, true);
                    }
                    if (eVar.getOrientation() == 1) {
                        this.j.left = eVar.getPaddingLeft() + this.t;
                        this.j.right = (eVar.e() - eVar.getPaddingRight()) - this.u;
                    } else {
                        this.j.top = eVar.getPaddingTop() + this.v;
                        this.j.bottom = (eVar.e() - eVar.getPaddingBottom()) - this.w;
                    }
                    a(this.k);
                    return;
                }
                this.j.set(0, 0, 0, 0);
                View view2 = this.k;
                if (view2 != null) {
                    view2.layout(0, 0, 0, 0);
                }
            }
        }
        View view3 = this.k;
        if (view3 == null) {
            return;
        }
        eVar.c(view3);
        this.k = null;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public final void d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22ed872c", new Object[]{this, eVar});
            return;
        }
        View view = this.k;
        if (view != null) {
            eVar.c(view);
            this.k = null;
        }
        a(eVar);
    }

    public boolean f_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b35e8cc4", new Object[]{this})).booleanValue() : (this.l == 0 && this.b == null) ? false : true;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void b(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.c cVar, bls blsVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddcffa44", new Object[]{this, recycler, state, cVar, blsVar, eVar});
        } else {
            a(recycler, state, cVar, blsVar, eVar);
        }
    }

    public void a(View view, int i2, int i3, int i4, int i5, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef6c5cab", new Object[]{this, view, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), eVar});
        } else {
            a(view, i2, i3, i4, i5, eVar, false);
        }
    }

    public void a(View view, int i2, int i3, int i4, int i5, e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe1feb89", new Object[]{this, view, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), eVar, new Boolean(z)});
            return;
        }
        eVar.a(view, i2, i3, i4, i5);
        if (!f_()) {
            return;
        }
        if (z) {
            this.j.union((i2 - this.p) - this.t, (i3 - this.r) - this.v, i4 + this.q + this.u, i5 + this.s + this.w);
        } else {
            this.j.union(i2 - this.p, i3 - this.r, i4 + this.q, i5 + this.s);
        }
    }

    public void b(View view, int i2, int i3, int i4, int i5, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("284cbd4a", new Object[]{this, view, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), eVar});
        } else {
            b(view, i2, i3, i4, i5, eVar, false);
        }
    }

    public void b(View view, int i2, int i3, int i4, int i5, e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14b9eca", new Object[]{this, view, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), eVar, new Boolean(z)});
            return;
        }
        eVar.b(view, i2, i3, i4, i5);
        if (!f_()) {
            return;
        }
        if (z) {
            this.j.union((i2 - this.p) - this.t, (i3 - this.r) - this.v, i4 + this.q + this.u, i5 + this.s + this.w);
        } else {
            this.j.union(i2 - this.p, i3 - this.r, i4 + this.q, i5 + this.s);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b3d217", new Object[]{this, aVar});
        } else {
            this.b = aVar;
        }
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(this.j.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.j.height(), 1073741824));
        view.layout(this.j.left, this.j.top, this.j.right, this.j.bottom);
        view.setBackgroundColor(this.l);
        this.j.set(0, 0, 0, 0);
    }

    public void a(bls blsVar, View view) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205083a3", new Object[]{this, blsVar, view});
        } else if (view == null) {
        } else {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                blsVar.c = true;
            }
            if (blsVar.d || view.isFocusable()) {
                z = true;
            }
            blsVar.d = z;
        }
    }

    public int a(e eVar, boolean z, boolean z2, boolean z3) {
        int i2;
        int i3;
        int c;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c51dcf3e", new Object[]{this, eVar, new Boolean(z), new Boolean(z2), new Boolean(z3)})).intValue();
        }
        blu bluVar = null;
        c a2 = eVar instanceof VirtualLayoutManager ? ((VirtualLayoutManager) eVar).a(this, z2) : null;
        if (a2 != null && (a2 instanceof blu)) {
            bluVar = a2;
        }
        if (a2 == this) {
            return 0;
        }
        if (!z3) {
            if (z) {
                i9 = this.v;
                i10 = this.r;
            } else {
                i9 = this.t;
                i10 = this.p;
            }
            return i9 + i10;
        }
        if (bluVar == null) {
            if (z) {
                i7 = this.v;
                i8 = this.r;
            } else {
                i7 = this.t;
                i8 = this.p;
            }
            c = i7 + i8;
        } else if (z) {
            if (z2) {
                i4 = bluVar.w;
                i5 = this.v;
            } else {
                i4 = bluVar.v;
                i5 = this.w;
            }
            c = c(i4, i5);
        } else {
            if (z2) {
                i2 = bluVar.u;
                i3 = this.t;
            } else {
                i2 = bluVar.t;
                i3 = this.u;
            }
            c = c(i2, i3);
        }
        if (z) {
            i6 = z2 ? this.r : this.s;
        } else {
            i6 = z2 ? this.p : this.q;
        }
        return c + i6 + 0;
    }

    public int b(e eVar, boolean z, boolean z2, boolean z3) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b6c7755d", new Object[]{this, eVar, new Boolean(z), new Boolean(z2), new Boolean(z3)})).intValue();
        }
        if (z) {
            i2 = this.w;
            i3 = this.s;
        } else {
            i2 = this.t;
            i3 = this.p;
        }
        return i2 + i3;
    }
}
