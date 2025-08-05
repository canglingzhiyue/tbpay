package tb;

import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.e;
import com.alibaba.android.ultron.ext.vlayout.g;
import com.alibaba.android.ultron.ext.vlayout.h;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes2.dex */
public class blx extends bln {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean A;
    private int B;
    private WeakReference<VirtualLayoutManager> C;
    private final Runnable D;

    /* renamed from: a  reason: collision with root package name */
    private int f25970a;
    private b[] b;
    private int c;
    private int d;
    private int e;
    private int n;
    private int o;
    private BitSet x;
    private a y;
    private List<View> z;

    static {
        kge.a(-835963300);
    }

    public static /* synthetic */ Object ipc$super(blx blxVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2029767975:
                super.a((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], (e) objArr[2]);
                return null;
            case -1277220435:
                super.a((RecyclerView.State) objArr[0], (VirtualLayoutManager.a) objArr[1], (e) objArr[2]);
                return null;
            case -1031859095:
                super.a((e) objArr[0]);
                return null;
            case -690189348:
                super.a(((Number) objArr[0]).intValue(), (e) objArr[1]);
                return null;
            case 3962124:
                super.a((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), (e) objArr[5]);
                return null;
            case 279391675:
                super.b(((Number) objArr[0]).intValue(), (e) objArr[1]);
                return null;
            case 1360740620:
                super.b((RecyclerView.State) objArr[0], (VirtualLayoutManager.a) objArr[1], (e) objArr[2]);
                return null;
            case 1617066204:
                return new Boolean(super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), (e) objArr[3], ((Boolean) objArr[4]).booleanValue()));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7360eb", new Object[]{this, eVar});
        }
    }

    public static /* synthetic */ void a(blx blxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f952aa", new Object[]{blxVar});
        } else {
            blxVar.d();
        }
    }

    public blx() {
        this(1, 0);
    }

    public blx(int i, int i2) {
        this.f25970a = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.n = 0;
        this.o = 0;
        this.x = null;
        this.y = new a();
        this.z = new ArrayList();
        this.C = null;
        this.D = new Runnable() { // from class: tb.blx.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    blx.a(blx.this);
                }
            }
        };
        k(i);
        b(i2);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        c(i);
        j(i);
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d3132", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93209d1", new Object[]{this, new Integer(i)});
            return;
        }
        this.f25970a = i;
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        b[] bVarArr = this.b;
        if (bVarArr != null && bVarArr.length == this.f25970a && this.x != null) {
            return;
        }
        this.x = new BitSet(this.f25970a);
        this.b = new b[this.f25970a];
        for (int i = 0; i < this.f25970a; i++) {
            this.b[i] = new b(i);
        }
    }

    @Override // tb.bln, com.alibaba.android.ultron.ext.vlayout.c
    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, e eVar) {
        int f;
        int l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870432d9", new Object[]{this, recycler, state, eVar});
            return;
        }
        super.a(recycler, state, eVar);
        if (eVar.getOrientation() == 1) {
            f = ((eVar.e() - eVar.getPaddingLeft()) - eVar.getPaddingRight()) - i();
            l = k();
        } else {
            f = ((eVar.f() - eVar.getPaddingTop()) - eVar.getPaddingBottom()) - j();
            l = l();
        }
        int i = f - l;
        int i2 = this.c;
        int i3 = this.f25970a;
        this.e = (int) (((i - (i2 * (i3 - 1))) / i3) + 0.5d);
        int i4 = i - (this.e * i3);
        if (i3 <= 1) {
            this.o = 0;
            this.n = 0;
        } else if (i3 == 2) {
            this.n = i4;
            this.o = i4;
        } else {
            int i5 = eVar.getOrientation() == 1 ? this.c : this.d;
            this.o = i5;
            this.n = i5;
        }
        WeakReference<VirtualLayoutManager> weakReference = this.C;
        if ((weakReference != null && weakReference.get() != null && this.C.get() == eVar) || !(eVar instanceof VirtualLayoutManager)) {
            return;
        }
        this.C = new WeakReference<>((VirtualLayoutManager) eVar);
    }

    @Override // tb.bln, com.alibaba.android.ultron.ext.vlayout.c
    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c750c", new Object[]{this, recycler, state, new Integer(i), new Integer(i2), new Integer(i3), eVar});
            return;
        }
        super.a(recycler, state, i, i2, i3, eVar);
        this.A = false;
        if (i > e().b().intValue() || i2 < e().a().intValue() || state.isPreLayout() || eVar.getChildCount() <= 0) {
            return;
        }
        ViewCompat.postOnAnimation(eVar.getChildAt(0), this.D);
    }

    @Override // tb.bln
    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.c cVar, bls blsVar, e eVar) {
        int a2;
        int i;
        VirtualLayoutManager.c cVar2;
        int i2;
        int i3;
        int i4;
        int i5;
        b bVar;
        boolean z;
        int a3;
        int i6;
        int i7;
        int c;
        int i8;
        int i9;
        int i10;
        View view;
        int i11;
        boolean z2;
        b bVar2;
        int i12;
        g gVar;
        int i13;
        RecyclerView.Recycler recycler2 = recycler;
        RecyclerView.State state2 = state;
        VirtualLayoutManager.c cVar3 = cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67c9cc3", new Object[]{this, recycler2, state2, cVar3, blsVar, eVar});
        } else if (!d(cVar.b())) {
            c();
            boolean z3 = eVar.getOrientation() == 1;
            g c2 = eVar.c();
            g d = eVar.d();
            boolean b2 = eVar.b();
            this.x.set(0, this.f25970a, true);
            if (cVar.h() == 1) {
                a2 = cVar.a() + cVar.f();
                i = cVar.i() + a2 + c2.g();
            } else {
                a2 = cVar.a() - cVar.f();
                i = (a2 - cVar.i()) - c2.c();
            }
            int i14 = a2;
            int i15 = i;
            a(cVar.h(), i15, c2);
            int a4 = cVar.a();
            this.z.clear();
            while (cVar3.a(state2) && !this.x.isEmpty() && !d(cVar.b())) {
                int b3 = cVar.b();
                View a5 = cVar3.a(recycler2);
                if (a5 == null) {
                    break;
                }
                VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) a5.getLayoutParams();
                int viewLayoutPosition = layoutParams.getViewLayoutPosition();
                int i16 = i15;
                int a6 = this.y.a(viewLayoutPosition);
                if (a6 == Integer.MIN_VALUE) {
                    bVar = a(a4, cVar3, eVar);
                    this.y.a(viewLayoutPosition, bVar);
                } else {
                    bVar = this.b[a6];
                }
                b bVar3 = bVar;
                boolean z4 = viewLayoutPosition - e().a().intValue() < this.f25970a;
                boolean z5 = e().b().intValue() - viewLayoutPosition < this.f25970a;
                if (cVar.j()) {
                    this.z.add(a5);
                }
                eVar.a(cVar3, a5);
                if (z3) {
                    int a7 = eVar.a(this.e, layoutParams.width, false);
                    eVar.measureChildWithMargins(a5, a7, eVar.a(c2.f(), Float.isNaN(layoutParams.b) ? layoutParams.height : (int) ((View.MeasureSpec.getSize(a7) / layoutParams.b) + 0.5f), true));
                    z = true;
                } else {
                    int a8 = eVar.a(this.e, layoutParams.height, false);
                    int f = c2.f();
                    int size = Float.isNaN(layoutParams.b) ? layoutParams.width : (int) ((View.MeasureSpec.getSize(a8) * layoutParams.b) + 0.5f);
                    z = true;
                    eVar.measureChildWithMargins(a5, eVar.a(f, size, true), a8);
                }
                if (cVar.h() == z) {
                    c = bVar3.b(a4, c2);
                    if (z4) {
                        i13 = a(eVar, z3, z, b2);
                    } else if (this.A) {
                        if (Math.abs(b3 - this.B) >= this.f25970a) {
                            i13 = z3 ? this.d : this.c;
                        }
                        i7 = c2.c(a5) + c;
                    } else {
                        i13 = z3 ? this.d : this.c;
                    }
                    c += i13;
                    i7 = c2.c(a5) + c;
                } else {
                    if (z5) {
                        a3 = bVar3.a(a4, c2);
                        i6 = (z3 ? this.w : this.u) + this.q;
                    } else {
                        a3 = bVar3.a(a4, c2);
                        i6 = z3 ? this.d : this.c;
                    }
                    int i17 = a3 - i6;
                    i7 = i17;
                    c = i17 - c2.c(a5);
                }
                if (cVar.h() == 1) {
                    bVar3.b(a5, c2);
                } else {
                    bVar3.a(a5, c2);
                }
                if (bVar3.d == this.f25970a - 1) {
                    int i18 = bVar3.d;
                    int i19 = this.e;
                    int i20 = this.n;
                    i8 = ((i18 * (i19 + i20)) - i20) + this.o;
                } else {
                    i8 = bVar3.d * (this.e + this.n);
                }
                int c3 = i8 + d.c();
                if (z3) {
                    i9 = this.t;
                    i10 = this.p;
                } else {
                    i9 = this.v;
                    i10 = this.r;
                }
                int i21 = c3 + i9 + i10;
                int d2 = i21 + c2.d(a5);
                if (z3) {
                    view = a5;
                    i11 = a4;
                    z2 = b2;
                    a(a5, i21, c, d2, i7, eVar);
                    i12 = i16;
                    bVar2 = bVar3;
                    gVar = c2;
                } else {
                    view = a5;
                    i11 = a4;
                    z2 = b2;
                    int i22 = c;
                    bVar2 = bVar3;
                    int i23 = i7;
                    i12 = i16;
                    gVar = c2;
                    a(view, i22, i21, i23, d2, eVar);
                }
                a(bVar2, cVar.h(), i12, gVar);
                a(recycler, cVar, bVar2, i14, eVar);
                a(blsVar, view);
                recycler2 = recycler;
                cVar3 = cVar;
                i15 = i12;
                c2 = gVar;
                b2 = z2;
                a4 = i11;
                state2 = state;
            }
            g gVar2 = c2;
            if (d(cVar.b())) {
                if (cVar.h() == -1) {
                    int length = this.b.length;
                    for (int i24 = 0; i24 < length; i24++) {
                        b bVar4 = this.b[i24];
                        if (bVar4.f25973a != Integer.MIN_VALUE) {
                            bVar4.e = bVar4.f25973a;
                        }
                    }
                } else {
                    int length2 = this.b.length;
                    for (int i25 = 0; i25 < length2; i25++) {
                        b bVar5 = this.b[i25];
                        if (bVar5.b != Integer.MIN_VALUE) {
                            bVar5.f = bVar5.b;
                        }
                    }
                }
            }
            if (cVar.h() == -1) {
                if (!d(cVar.b())) {
                    cVar2 = cVar;
                    if (cVar2.a(state)) {
                        blsVar.f25966a = cVar.a() - a(gVar2.c(), gVar2);
                    }
                } else {
                    cVar2 = cVar;
                }
                int a9 = cVar.a() - b(gVar2.d(), gVar2);
                if (z3) {
                    i4 = this.v;
                    i5 = this.r;
                } else {
                    i4 = this.t;
                    i5 = this.p;
                }
                blsVar.f25966a = a9 + i4 + i5;
            } else {
                cVar2 = cVar;
                if (!d(cVar.b()) && cVar2.a(state)) {
                    blsVar.f25966a = d(gVar2.d(), gVar2) - cVar.a();
                } else {
                    int c4 = c(gVar2.d(), gVar2) - cVar.a();
                    if (z3) {
                        i2 = this.w;
                        i3 = this.s;
                    } else {
                        i2 = this.u;
                        i3 = this.q;
                    }
                    blsVar.f25966a = c4 + i2 + i3;
                }
            }
            a(recycler, cVar2, eVar);
        }
    }

    private void a(RecyclerView.Recycler recycler, VirtualLayoutManager.c cVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed0857d", new Object[]{this, recycler, cVar, eVar});
            return;
        }
        g c = eVar.c();
        for (int size = this.z.size() - 1; size >= 0; size--) {
            View view = this.z.get(size);
            if (view != null && c.a(view) > c.d()) {
                b a2 = a(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), view, false);
                if (a2 != null) {
                    a2.e(c);
                }
                eVar.c(view);
                recycler.recycleView(view);
            } else if (view != null) {
                b a3 = a(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), view, false);
                if (a3 != null) {
                    a3.e(c);
                }
                eVar.c(view);
                recycler.recycleView(view);
                return;
            }
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void a(int i, int i2, int i3, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10b697c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), eVar});
        } else if (i2 > e().b().intValue() || i3 < e().a().intValue() || i != 0) {
        } else {
            d();
        }
    }

    @Override // tb.blu, com.alibaba.android.ultron.ext.vlayout.c
    public int a(int i, boolean z, boolean z2, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56a8bb8f", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2), eVar})).intValue();
        }
        boolean z3 = eVar.getOrientation() == 1;
        g c = eVar.c();
        View findViewByPosition = eVar.findViewByPosition(e().a().intValue() + i);
        if (findViewByPosition == null) {
            return 0;
        }
        c();
        if (z3) {
            if (z) {
                if (i == f() - 1) {
                    return this.w + this.s + (c(c.b(findViewByPosition), c) - c.b(findViewByPosition));
                }
                if (!z2) {
                    return d(c.a(findViewByPosition), c) - c.b(findViewByPosition);
                }
            } else if (i == 0) {
                return ((-this.v) - this.r) - (c.a(findViewByPosition) - b(c.a(findViewByPosition), c));
            } else {
                if (!z2) {
                    return a(c.b(findViewByPosition), c) - c.a(findViewByPosition);
                }
            }
        }
        return 0;
    }

    @Override // tb.bln
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27f1469", new Object[]{this, eVar});
        } else {
            super.a(eVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0100 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c A[LOOP:1: B:59:0x010a->B:60:0x010c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.blx.d():void");
    }

    private View a(VirtualLayoutManager virtualLayoutManager, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("838d598c", new Object[]{this, virtualLayoutManager, new Integer(i), new Integer(i2)});
        }
        if (virtualLayoutManager.findViewByPosition(i) == null) {
            return null;
        }
        new BitSet(this.f25970a).set(0, this.f25970a, true);
        int length = this.b.length;
        for (int i3 = 0; i3 < length; i3++) {
            b bVar = this.b[i3];
            if (b.a(bVar).size() != 0 && a(bVar, virtualLayoutManager, i2)) {
                return virtualLayoutManager.getReverseLayout() ? (View) b.a(bVar).get(b.a(bVar).size() - 1) : (View) b.a(bVar).get(0);
            }
        }
        return null;
    }

    private boolean a(b bVar, VirtualLayoutManager virtualLayoutManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44504fa1", new Object[]{this, bVar, virtualLayoutManager, new Integer(i)})).booleanValue();
        }
        g c = virtualLayoutManager.c();
        if (virtualLayoutManager.getReverseLayout()) {
            if (bVar.d(c) < i) {
                return true;
            }
        } else if (bVar.b(c) > i) {
            return true;
        }
        return false;
    }

    private void a(RecyclerView.Recycler recycler, VirtualLayoutManager.c cVar, b bVar, int i, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902d1384", new Object[]{this, recycler, cVar, bVar, new Integer(i), eVar});
            return;
        }
        g c = eVar.c();
        if (cVar.h() == -1) {
            b(recycler, Math.max(i, a(bVar.b(c), c)) + (c.e() - c.c()), eVar);
        } else {
            a(recycler, Math.min(i, d(bVar.d(c), c)) - (c.e() - c.c()), eVar);
        }
    }

    private void a(RecyclerView.Recycler recycler, int i, e eVar) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d95a48d", new Object[]{this, recycler, new Integer(i), eVar});
            return;
        }
        g c = eVar.c();
        boolean z = true;
        while (eVar.getChildCount() > 0 && z && (childAt = eVar.getChildAt(0)) != null && c.b(childAt) < i) {
            b a2 = a(((RecyclerView.LayoutParams) childAt.getLayoutParams()).getViewPosition(), childAt, true);
            if (a2 != null) {
                a2.f(c);
                eVar.c(childAt);
                recycler.recycleView(childAt);
            } else {
                z = false;
            }
        }
    }

    private void b(RecyclerView.Recycler recycler, int i, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d4cd88e", new Object[]{this, recycler, new Integer(i), eVar});
            return;
        }
        g c = eVar.c();
        for (int childCount = eVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = eVar.getChildAt(childCount);
            if (childAt == null || c.a(childAt) <= i) {
                return;
            }
            b a2 = a(((RecyclerView.LayoutParams) childAt.getLayoutParams()).getViewPosition(), childAt, false);
            if (a2 != null) {
                a2.e(c);
                eVar.c(childAt);
                recycler.recycleView(childAt);
            }
        }
    }

    private b a(int i, View view, boolean z) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("863b2dd", new Object[]{this, new Integer(i), view, new Boolean(z)});
        }
        int a2 = this.y.a(i);
        if (a2 >= 0) {
            b[] bVarArr = this.b;
            if (a2 < bVarArr.length) {
                b bVar = bVarArr[a2];
                if (z && bVar.b(view)) {
                    return bVar;
                }
                if (!z && bVar.a(view)) {
                    return bVar;
                }
            }
        }
        while (true) {
            b[] bVarArr2 = this.b;
            if (i2 >= bVarArr2.length) {
                return null;
            }
            if (i2 != a2) {
                b bVar2 = bVarArr2[i2];
                if (z && bVar2.b(view)) {
                    return bVar2;
                }
                if (!z && bVar2.a(view)) {
                    return bVar2;
                }
            }
            i2++;
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public boolean a(int i, int i2, int i3, e eVar, boolean z) {
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("606278dc", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), eVar, new Boolean(z)})).booleanValue();
        }
        boolean a2 = super.a(i, i2, i3, eVar, z);
        if (a2 && (findViewByPosition = eVar.findViewByPosition(i)) != null) {
            g c = eVar.c();
            int viewLayoutPosition = ((RecyclerView.LayoutParams) findViewByPosition.getLayoutParams()).getViewLayoutPosition();
            if (eVar.getReverseLayout()) {
                if (z) {
                    b a3 = a(viewLayoutPosition, findViewByPosition, true);
                    if (a3 != null) {
                        a3.e(c);
                    }
                } else {
                    b a4 = a(viewLayoutPosition, findViewByPosition, false);
                    if (a4 != null) {
                        a4.f(c);
                    }
                }
            } else if (z) {
                b a5 = a(viewLayoutPosition, findViewByPosition, true);
                if (a5 != null) {
                    a5.f(c);
                }
            } else {
                b a6 = a(viewLayoutPosition, findViewByPosition, false);
                if (a6 != null) {
                    a6.e(c);
                }
            }
        }
        return a2;
    }

    private void a(int i, int i2, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e2eeb87", new Object[]{this, new Integer(i), new Integer(i2), gVar});
            return;
        }
        for (int i3 = 0; i3 < this.f25970a; i3++) {
            if (!b.a(this.b[i3]).isEmpty()) {
                a(this.b[i3], i, i2, gVar);
            }
        }
    }

    private void a(b bVar, int i, int i2, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc02e5cb", new Object[]{this, bVar, new Integer(i), new Integer(i2), gVar});
            return;
        }
        int c = bVar.c();
        if (i == -1) {
            if (bVar.b(gVar) + c >= i2) {
                return;
            }
            this.x.set(bVar.d, false);
        } else if (bVar.d(gVar) - c <= i2) {
        } else {
            this.x.set(bVar.d, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        if ((r8.h() == -1) != r9.getReverseLayout()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (((r8.h() == -1) == r9.getReverseLayout()) == r9.g()) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private tb.blx.b a(int r7, com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager.c r8, com.alibaba.android.ultron.ext.vlayout.e r9) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.blx.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L23
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            r1[r3] = r2
            r7 = 2
            r1[r7] = r8
            r7 = 3
            r1[r7] = r9
            java.lang.String r7 = "d3258401"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            tb.blx$b r7 = (tb.blx.b) r7
            return r7
        L23:
            com.alibaba.android.ultron.ext.vlayout.g r0 = r9.c()
            int r1 = r9.getOrientation()
            r4 = -1
            if (r1 != 0) goto L41
            int r1 = r8.h()
            if (r1 != r4) goto L36
            r1 = 1
            goto L37
        L36:
            r1 = 0
        L37:
            boolean r9 = r9.getReverseLayout()
            if (r1 == r9) goto L3f
        L3d:
            r9 = 1
            goto L5a
        L3f:
            r9 = 0
            goto L5a
        L41:
            int r1 = r8.h()
            if (r1 != r4) goto L49
            r1 = 1
            goto L4a
        L49:
            r1 = 0
        L4a:
            boolean r5 = r9.getReverseLayout()
            if (r1 != r5) goto L52
            r1 = 1
            goto L53
        L52:
            r1 = 0
        L53:
            boolean r9 = r9.g()
            if (r1 != r9) goto L3f
            goto L3d
        L5a:
            if (r9 == 0) goto L62
            int r9 = r6.f25970a
            int r2 = r9 + (-1)
            r9 = -1
            goto L65
        L62:
            int r4 = r6.f25970a
            r9 = 1
        L65:
            int r8 = r8.h()
            r1 = 0
            if (r8 != r3) goto L80
            r8 = 2147483647(0x7fffffff, float:NaN)
        L6f:
            if (r2 == r4) goto L7f
            tb.blx$b[] r3 = r6.b
            r3 = r3[r2]
            int r5 = r3.b(r7, r0)
            if (r5 >= r8) goto L7d
            r1 = r3
            r8 = r5
        L7d:
            int r2 = r2 + r9
            goto L6f
        L7f:
            return r1
        L80:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
        L82:
            if (r2 == r4) goto L92
            tb.blx$b[] r3 = r6.b
            r3 = r3[r2]
            int r5 = r3.a(r7, r0)
            if (r5 <= r8) goto L90
            r1 = r3
            r8 = r5
        L90:
            int r2 = r2 + r9
            goto L82
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.blx.a(int, com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager$c, com.alibaba.android.ultron.ext.vlayout.e):tb.blx$b");
    }

    private int a(int i, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6dd748d", new Object[]{this, new Integer(i), gVar})).intValue();
        }
        int a2 = this.b[0].a(i, gVar);
        for (int i2 = 1; i2 < this.f25970a; i2++) {
            int a3 = this.b[i2].a(i, gVar);
            if (a3 > a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private int b(int i, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("10a8166c", new Object[]{this, new Integer(i), gVar})).intValue();
        }
        int a2 = this.b[0].a(i, gVar);
        for (int i2 = 1; i2 < this.f25970a; i2++) {
            int a3 = this.b[i2].a(i, gVar);
            if (a3 < a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private int c(int i, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a72b84b", new Object[]{this, new Integer(i), gVar})).intValue();
        }
        int b2 = this.b[0].b(i, gVar);
        for (int i2 = 1; i2 < this.f25970a; i2++) {
            int b3 = this.b[i2].b(i, gVar);
            if (b3 > b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    private int d(int i, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("843d5a2a", new Object[]{this, new Integer(i), gVar})).intValue();
        }
        int b2 = this.b[0].b(i, gVar);
        for (int i2 = 1; i2 < this.f25970a; i2++) {
            int b3 = this.b[i2].b(i, gVar);
            if (b3 < b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void b(RecyclerView.State state, VirtualLayoutManager.a aVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511b410c", new Object[]{this, state, aVar, eVar});
            return;
        }
        super.b(state, aVar, eVar);
        c();
        if (!d(aVar.f2639a)) {
            return;
        }
        int length = this.b.length;
        for (int i = 0; i < length; i++) {
            this.b[i].a();
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void a(RecyclerView.State state, VirtualLayoutManager.a aVar, e eVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3df29ad", new Object[]{this, state, aVar, eVar});
            return;
        }
        super.a(state, aVar, eVar);
        c();
        h<Integer> e = e();
        if (aVar.c) {
            if (aVar.f2639a < (e.a().intValue() + this.f25970a) - 1) {
                aVar.f2639a = Math.min((e.a().intValue() + this.f25970a) - 1, e.b().intValue());
            }
        } else if (aVar.f2639a > e.b().intValue() - (this.f25970a - 1)) {
            aVar.f2639a = Math.max(e.a().intValue(), e.b().intValue() - (this.f25970a - 1));
        }
        View findViewByPosition = eVar.findViewByPosition(aVar.f2639a);
        int i2 = eVar.getOrientation() == 1 ? this.d : this.c;
        g c = eVar.c();
        if (findViewByPosition == null) {
            int length = this.b.length;
            while (i < length) {
                b bVar = this.b[i];
                bVar.a();
                bVar.a(aVar.b);
                i++;
            }
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = aVar.c ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        int length2 = this.b.length;
        int i5 = i4;
        for (int i6 = 0; i6 < length2; i6++) {
            b bVar2 = this.b[i6];
            if (!b.a(bVar2).isEmpty()) {
                if (aVar.c) {
                    i5 = Math.max(i5, eVar.getPosition((View) b.a(bVar2).get(b.a(bVar2).size() - 1)));
                } else {
                    i5 = Math.min(i5, eVar.getPosition((View) b.a(bVar2).get(0)));
                }
            }
        }
        if (!d(i5)) {
            if (i5 != e.a().intValue()) {
                z = false;
            }
            View findViewByPosition2 = eVar.findViewByPosition(i5);
            if (findViewByPosition2 != null) {
                if (aVar.c) {
                    aVar.f2639a = i5;
                    int b2 = c.b(findViewByPosition);
                    if (b2 < aVar.b) {
                        int i7 = aVar.b - b2;
                        if (z) {
                            i2 = 0;
                        }
                        int i8 = i7 + i2;
                        aVar.b = c.b(findViewByPosition2) + i8;
                        i3 = i8;
                    } else {
                        i3 = z ? 0 : i2;
                        aVar.b = c.b(findViewByPosition2) + i3;
                    }
                } else {
                    aVar.f2639a = i5;
                    int a2 = c.a(findViewByPosition);
                    if (a2 > aVar.b) {
                        int i9 = aVar.b - a2;
                        if (z) {
                            i2 = 0;
                        }
                        i3 = i9 - i2;
                        aVar.b = c.a(findViewByPosition2) + i3;
                    } else {
                        if (z) {
                            i2 = 0;
                        }
                        int i10 = -i2;
                        aVar.b = c.a(findViewByPosition2) + i10;
                        i3 = i10;
                    }
                }
            }
        } else {
            this.B = aVar.f2639a;
            this.A = true;
        }
        int length3 = this.b.length;
        while (i < length3) {
            this.b[i].a(eVar.getReverseLayout() ^ aVar.c, i3, c);
            i++;
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void b(int i, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a72dbb", new Object[]{this, new Integer(i), eVar});
            return;
        }
        super.b(i, eVar);
        if (eVar.getOrientation() != 1) {
            return;
        }
        int length = this.b.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.b[i2].b(i);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void a(int i, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6dc8bdc", new Object[]{this, new Integer(i), eVar});
            return;
        }
        super.a(i, eVar);
        if (eVar.getOrientation() != 0) {
            return;
        }
        int length = this.b.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.b[i2].b(i);
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f25973a;
        public int b;
        public int c;
        public final int d;
        public int e;
        public int f;
        private ArrayList<View> g;

        static {
            kge.a(-232383310);
        }

        public static /* synthetic */ ArrayList a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("76be9286", new Object[]{bVar}) : bVar.g;
        }

        private b(int i) {
            this.g = new ArrayList<>();
            this.f25973a = Integer.MIN_VALUE;
            this.b = Integer.MIN_VALUE;
            this.c = 0;
            this.e = Integer.MIN_VALUE;
            this.f = Integer.MIN_VALUE;
            this.d = i;
        }

        public void a(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c27ffd27", new Object[]{this, gVar});
            } else if (this.g.size() == 0) {
                this.f25973a = Integer.MIN_VALUE;
            } else {
                this.f25973a = gVar.a(this.g.get(0));
            }
        }

        public int b(g gVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("37fa235b", new Object[]{this, gVar})).intValue() : a(Integer.MIN_VALUE, gVar);
        }

        public int a(int i, g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d6dd748d", new Object[]{this, new Integer(i), gVar})).intValue();
            }
            int i2 = this.f25973a;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (i != Integer.MIN_VALUE && this.g.size() == 0) {
                int i3 = this.f;
                return i3 != Integer.MIN_VALUE ? i3 : i;
            }
            a(gVar);
            return this.f25973a;
        }

        public void c(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad7449a9", new Object[]{this, gVar});
            } else if (this.g.size() == 0) {
                this.b = Integer.MIN_VALUE;
            } else {
                ArrayList<View> arrayList = this.g;
                this.b = gVar.b(arrayList.get(arrayList.size() - 1));
            }
        }

        public int d(g gVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("22ee6fdd", new Object[]{this, gVar})).intValue() : b(Integer.MIN_VALUE, gVar);
        }

        public int b(int i, g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("10a8166c", new Object[]{this, new Integer(i), gVar})).intValue();
            }
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (i != Integer.MIN_VALUE && this.g.size() == 0) {
                int i3 = this.e;
                return i3 != Integer.MIN_VALUE ? i3 : i;
            }
            c(gVar);
            return this.b;
        }

        public void a(View view, g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3cd391a9", new Object[]{this, view, gVar});
                return;
            }
            RecyclerView.LayoutParams c = c(view);
            this.g.add(0, view);
            this.f25973a = Integer.MIN_VALUE;
            if (this.g.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (!c.isItemRemoved() && !c.isItemChanged()) {
                return;
            }
            this.c += gVar.c(view);
        }

        public void b(View view, g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a70319c8", new Object[]{this, view, gVar});
                return;
            }
            RecyclerView.LayoutParams c = c(view);
            this.g.add(view);
            this.b = Integer.MIN_VALUE;
            if (this.g.size() == 1) {
                this.f25973a = Integer.MIN_VALUE;
            }
            if (!c.isItemRemoved() && !c.isItemChanged()) {
                return;
            }
            this.c += gVar.c(view);
        }

        public void a(boolean z, int i, g gVar) {
            int b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f1f5316", new Object[]{this, new Boolean(z), new Integer(i), gVar});
                return;
            }
            if (z) {
                b = d(gVar);
            } else {
                b = b(gVar);
            }
            a();
            if (b == Integer.MIN_VALUE) {
                return;
            }
            if ((!z || b >= gVar.d()) && !z) {
                gVar.c();
            }
            if (i != Integer.MIN_VALUE) {
                b += i;
            }
            this.b = b;
            this.f25973a = b;
            this.f = Integer.MIN_VALUE;
            this.e = Integer.MIN_VALUE;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.g.clear();
            b();
            this.c = 0;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            this.f25973a = Integer.MIN_VALUE;
            this.b = Integer.MIN_VALUE;
            this.f = Integer.MIN_VALUE;
            this.e = Integer.MIN_VALUE;
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            this.f25973a = i;
            this.b = i;
            this.f = Integer.MIN_VALUE;
            this.e = Integer.MIN_VALUE;
        }

        public void e(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9868962b", new Object[]{this, gVar});
                return;
            }
            int size = this.g.size();
            View remove = this.g.remove(size - 1);
            RecyclerView.LayoutParams c = c(remove);
            if (c.isItemRemoved() || c.isItemChanged()) {
                this.c -= gVar.c(remove);
            }
            if (size == 1) {
                this.f25973a = Integer.MIN_VALUE;
            }
            this.b = Integer.MIN_VALUE;
        }

        public boolean a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
            }
            int size = this.g.size();
            return size > 0 && this.g.get(size - 1) == view;
        }

        public void f(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de2bc6c", new Object[]{this, gVar});
                return;
            }
            View remove = this.g.remove(0);
            RecyclerView.LayoutParams c = c(remove);
            if (this.g.size() == 0) {
                this.b = Integer.MIN_VALUE;
            }
            if (c.isItemRemoved() || c.isItemChanged()) {
                this.c -= gVar.c(remove);
            }
            this.f25973a = Integer.MIN_VALUE;
        }

        public boolean b(View view) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{this, view})).booleanValue() : this.g.size() > 0 && this.g.get(0) == view;
        }

        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.c;
        }

        public RecyclerView.LayoutParams c(View view) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView.LayoutParams) ipChange.ipc$dispatch("f862c666", new Object[]{this, view}) : (RecyclerView.LayoutParams) view.getLayoutParams();
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                return;
            }
            int i2 = this.e;
            if (i2 != Integer.MIN_VALUE) {
                this.e = i2 + i;
            }
            int i3 = this.f25973a;
            if (i3 != Integer.MIN_VALUE) {
                this.f25973a = i3 + i;
            }
            int i4 = this.f;
            if (i4 != Integer.MIN_VALUE) {
                this.f = i4 + i;
            }
            int i5 = this.b;
            if (i5 == Integer.MIN_VALUE) {
                return;
            }
            this.b = i5 + i;
        }
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int[] f25972a;

        static {
            kge.a(900112224);
        }

        public int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
            }
            int[] iArr = this.f25972a;
            if (iArr != null && i < iArr.length && i >= 0) {
                return iArr[i];
            }
            return Integer.MIN_VALUE;
        }

        public void a(int i, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d04c01f", new Object[]{this, new Integer(i), bVar});
                return;
            }
            c(i);
            this.f25972a[i] = bVar.d;
        }

        public int b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
            }
            int length = this.f25972a.length;
            while (length <= i) {
                length <<= 1;
            }
            return length;
        }

        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
                return;
            }
            int[] iArr = this.f25972a;
            if (iArr == null) {
                this.f25972a = new int[Math.max(i, 10) + 1];
                Arrays.fill(this.f25972a, Integer.MIN_VALUE);
            } else if (i < iArr.length) {
            } else {
                this.f25972a = new int[b(i)];
                System.arraycopy(iArr, 0, this.f25972a, 0, iArr.length);
                int[] iArr2 = this.f25972a;
                Arrays.fill(iArr2, iArr.length, iArr2.length, Integer.MIN_VALUE);
            }
        }
    }
}
