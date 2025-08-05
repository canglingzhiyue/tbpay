package tb;

import android.graphics.Rect;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.SimpleArrayMap;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.ultron.ext.vlayout.e;
import com.alibaba.android.ultron.ext.vlayout.h;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bln;
import tb.blw;

/* loaded from: classes2.dex */
public class blw<T extends blw> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bln f25969a;
    public T b;
    public h<Integer> c;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    private View p;
    private int q;
    private bln.b r;
    private bln.a s;
    private int n = 0;
    private int o = 0;
    public ArrayMap<h<Integer>, T> d = new ArrayMap<>();
    public Rect m = new Rect();

    static {
        kge.a(-1201886878);
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : (i == Integer.MAX_VALUE || i == Integer.MIN_VALUE) ? false : true;
    }

    public blw(bln blnVar) {
        this.f25969a = blnVar;
    }

    public blw() {
    }

    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.e = i;
        this.f = i3;
        this.g = i2;
        this.h = i4;
    }

    public void b(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315a9029", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.i = i;
        this.k = i2;
        this.j = i3;
        this.l = i4;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.i + this.j;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.k + this.l;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.e + this.f;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.g + this.h;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.e;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.f;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.g;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.h;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.i;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : this.j;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue() : this.k;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue() : this.l;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue();
        }
        T t = this.b;
        if (t != null) {
            i = t.o();
        }
        return i + c();
    }

    public int p() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        T t = this.b;
        if (t != null) {
            i = t.p();
        }
        return i + d();
    }

    public int q() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue();
        }
        T t = this.b;
        if (t != null) {
            i = t.q();
        }
        return i + e();
    }

    public int r() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue();
        }
        T t = this.b;
        if (t != null) {
            i = t.r();
        }
        return i + f();
    }

    public int s() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66a136d", new Object[]{this})).intValue();
        }
        T t = this.b;
        if (t != null) {
            i = t.s();
        }
        return i + this.e;
    }

    public int t() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue();
        }
        T t = this.b;
        if (t != null) {
            i = t.t();
        }
        return i + this.f;
    }

    public int u() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("686426f", new Object[]{this})).intValue();
        }
        T t = this.b;
        if (t != null) {
            i = t.u();
        }
        return i + this.g;
    }

    public int v() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69459f0", new Object[]{this})).intValue();
        }
        T t = this.b;
        if (t != null) {
            i = t.v();
        }
        return i + this.h;
    }

    public int w() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue();
        }
        T t = this.b;
        if (t != null) {
            i = t.w();
        }
        return i + this.i;
    }

    public int x() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b088f2", new Object[]{this})).intValue();
        }
        T t = this.b;
        if (t != null) {
            i = t.x();
        }
        return i + this.j;
    }

    public int y() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6bea073", new Object[]{this})).intValue();
        }
        T t = this.b;
        if (t != null) {
            i = t.y();
        }
        return i + this.k;
    }

    public int z() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ccb7f4", new Object[]{this})).intValue();
        }
        T t = this.b;
        if (t != null) {
            i = t.z();
        }
        return i + this.l;
    }

    public int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a97c3b", new Object[]{this})).intValue();
        }
        T t = this.b;
        if (t == null) {
            return 0;
        }
        return t.A() + this.b.g();
    }

    public int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b793bc", new Object[]{this})).intValue();
        }
        T t = this.b;
        if (t == null) {
            return 0;
        }
        return t.B() + this.b.h();
    }

    public int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c5ab3d", new Object[]{this})).intValue();
        }
        T t = this.b;
        if (t == null) {
            return 0;
        }
        return t.C() + this.b.i();
    }

    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d3c2be", new Object[]{this})).intValue();
        }
        T t = this.b;
        if (t == null) {
            return 0;
        }
        return t.D() + this.b.j();
    }

    public int E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3e1da3f", new Object[]{this})).intValue() : this.n;
    }

    public int F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3eff1c0", new Object[]{this})).intValue() : this.o;
    }

    public h<Integer> G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("73c8a466", new Object[]{this}) : this.c;
    }

    public bln H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bln) ipChange.ipc$dispatch("4ea9adf3", new Object[]{this});
        }
        bln blnVar = this.f25969a;
        if (blnVar != null) {
            return blnVar;
        }
        T t = this.b;
        if (t == null) {
            return null;
        }
        return t.H();
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue() : this.d.isEmpty();
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : this.b == null;
    }

    public boolean e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aef4f61b", new Object[]{this, new Integer(i)})).booleanValue();
        }
        h<Integer> hVar = this.c;
        return hVar == null || !hVar.a((h<Integer>) Integer.valueOf(i));
    }

    public boolean f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0a9ceba", new Object[]{this, new Integer(i)})).booleanValue();
        }
        h<Integer> hVar = this.c;
        return hVar != null && hVar.a().intValue() == i;
    }

    public boolean g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b25ea759", new Object[]{this, new Integer(i)})).booleanValue();
        }
        h<Integer> hVar = this.c;
        return hVar != null && hVar.b().intValue() == i;
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.c = h.a(Integer.valueOf(i), Integer.valueOf(i2));
        if (this.d.isEmpty()) {
            return;
        }
        SimpleArrayMap<? extends h<Integer>, ? extends T> simpleArrayMap = new SimpleArrayMap<>();
        int size = this.d.size();
        for (int i3 = 0; i3 < size; i3++) {
            T valueAt = this.d.valueAt(i3);
            int E = valueAt.E() + i;
            int F = valueAt.F() + i;
            simpleArrayMap.put(h.a(Integer.valueOf(E), Integer.valueOf(F)), valueAt);
            valueAt.a(E, F);
        }
        this.d.clear();
        this.d.putAll(simpleArrayMap);
    }

    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870432d9", new Object[]{this, recycler, state, eVar});
            return;
        }
        if (!I()) {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                this.d.valueAt(i).a(recycler, state, eVar);
            }
        }
        if (K()) {
            if (this.p == null) {
            }
        } else if (this.p != null) {
            if (this.r != null) {
                H();
            }
            eVar.c(this.p);
            this.p = null;
        }
    }

    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, e eVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c750c", new Object[]{this, recycler, state, new Integer(i), new Integer(i2), new Integer(i3), eVar});
            return;
        }
        if (!I()) {
            int size = this.d.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.d.valueAt(i4).a(recycler, state, i, i2, i3, eVar);
            }
        }
        if (K()) {
            if (a(i3) && (view = this.p) != null) {
                this.m.union(view.getLeft(), this.p.getTop(), this.p.getRight(), this.p.getBottom());
            }
            if (!this.m.isEmpty()) {
                if (a(i3)) {
                    if (eVar.getOrientation() == 1) {
                        this.m.offset(0, -i3);
                    } else {
                        this.m.offset(-i3, 0);
                    }
                }
                a(this);
                int e = eVar.e();
                int f = eVar.f();
                if (eVar.getOrientation() != 1 ? this.m.intersects((-e) / 4, 0, e + (e / 4), f) : this.m.intersects(0, (-f) / 4, e, f + (f / 4))) {
                    if (this.p == null) {
                        this.p = eVar.d_();
                        eVar.b(this.p, true);
                    }
                    if (eVar.getOrientation() == 1) {
                        this.m.left = eVar.getPaddingLeft() + w() + A();
                        this.m.right = ((eVar.e() - eVar.getPaddingRight()) - x()) - B();
                    } else {
                        this.m.top = eVar.getPaddingTop() + y() + C();
                        this.m.bottom = ((eVar.e() - eVar.getPaddingBottom()) - z()) - D();
                    }
                    a(this.p);
                    b(eVar);
                    return;
                }
                this.m.set(0, 0, 0, 0);
                View view2 = this.p;
                if (view2 != null) {
                    view2.layout(0, 0, 0, 0);
                }
                b(eVar);
            }
        }
        b(eVar);
        if (!J()) {
            return;
        }
        a(eVar, this);
    }

    private void a(blw<T> blwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f8de4b", new Object[]{this, blwVar});
        } else if (!blwVar.I()) {
            int size = blwVar.d.size();
            for (int i = 0; i < size; i++) {
                T valueAt = blwVar.d.valueAt(i);
                a(valueAt);
                View view = valueAt.p;
                if (view != null) {
                    blwVar.m.union(view.getLeft(), valueAt.p.getTop(), valueAt.p.getRight(), valueAt.p.getBottom());
                }
            }
        }
    }

    private void a(e eVar, blw<T> blwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea27f54c", new Object[]{this, eVar, blwVar});
            return;
        }
        if (!blwVar.I()) {
            int size = blwVar.d.size();
            for (int i = 0; i < size; i++) {
                a(eVar, blwVar.d.valueAt(i));
            }
        }
        if (blwVar.p == null) {
            return;
        }
        if (blwVar.r != null) {
            H();
        }
        eVar.c(blwVar.p);
        blwVar.p = null;
    }

    private void b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f93aaa", new Object[]{this, eVar});
        } else if (!J()) {
        } else {
            b(eVar, this);
            View view = this.p;
            if (view == null) {
                return;
            }
            eVar.a(view);
        }
    }

    private void b(e eVar, blw<T> blwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("137c4a8d", new Object[]{this, eVar, blwVar});
            return;
        }
        int size = blwVar.d.size();
        for (int i = 0; i < size; i++) {
            T valueAt = blwVar.d.valueAt(i);
            if (!valueAt.I()) {
                b(eVar, valueAt);
            }
            View view = valueAt.p;
            if (view != null) {
                eVar.a(view);
            }
        }
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4366756", new Object[]{this})).booleanValue();
        }
        if (this.q != 0 || this.s != null) {
            z = true;
        }
        return !I() ? z | b(this) : z;
    }

    private boolean b(blw<T> blwVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d07be4d0", new Object[]{this, blwVar})).booleanValue();
        }
        if (blwVar.q == 0 && blwVar.s == null) {
            z = false;
        }
        int size = blwVar.d.size();
        for (int i = 0; i < size; i++) {
            T valueAt = blwVar.d.valueAt(i);
            if (!valueAt.I()) {
                z |= b(valueAt);
            } else {
                return valueAt.K();
            }
        }
        return z;
    }

    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(this.m.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.m.height(), 1073741824));
        view.layout(this.m.left, this.m.top, this.m.right, this.m.bottom);
        view.setBackgroundColor(this.q);
        if (this.s != null) {
            H();
        }
        this.m.set(0, 0, 0, 0);
    }

    public void a(bln.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b3d217", new Object[]{this, aVar});
        } else {
            this.s = aVar;
        }
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27f1469", new Object[]{this, eVar});
        } else {
            c(eVar, this);
        }
    }

    private void c(e eVar, blw<T> blwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd09fce", new Object[]{this, eVar, blwVar});
            return;
        }
        if (blwVar.p != null) {
            if (blwVar.r != null) {
                H();
            }
            eVar.c(blwVar.p);
            blwVar.p = null;
        }
        if (blwVar.d.isEmpty()) {
            return;
        }
        int size = blwVar.d.size();
        for (int i = 0; i < size; i++) {
            c(eVar, blwVar.d.valueAt(i));
        }
    }

    public void a(View view, int i, int i2, int i3, int i4, e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe1feb89", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), eVar, new Boolean(z)});
            return;
        }
        eVar.a(view, i, i2, i3, i4);
        a(i, i2, i3, i4, z);
    }

    public void a(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aeb6ac", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        if (z) {
            this.m.union((i - this.e) - this.i, (i2 - this.g) - this.k, this.f + i3 + this.j, this.h + i4 + this.l);
        } else {
            this.m.union(i - this.e, i2 - this.g, this.f + i3, this.h + i4);
        }
        T t = this.b;
        if (t == null) {
            return;
        }
        int i5 = i - this.e;
        int i6 = this.i;
        t.a(i5 - i6, (i2 - this.g) - i6, this.f + i3 + this.j, this.h + i4 + this.l, z);
    }
}
