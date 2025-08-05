package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.c;
import com.alibaba.android.ultron.ext.vlayout.e;
import com.alibaba.android.ultron.ext.vlayout.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bly extends blq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f25974a;
    private boolean b;
    private int c;
    private View d;
    private boolean e;
    private boolean x;
    private a y;

    /* loaded from: classes2.dex */
    public interface a {
    }

    static {
        kge.a(745670895);
    }

    public static /* synthetic */ Object ipc$super(bly blyVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2029767975:
                super.a((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], (e) objArr[2]);
                return null;
            case -1031859095:
                super.a((e) objArr[0]);
                return null;
            case -455438017:
                super.b_(((Number) objArr[0]).intValue());
                return null;
            case 3962124:
                super.a((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), (e) objArr[5]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.bln
    public boolean f_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b35e8cc4", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public bly() {
        this(true);
    }

    public bly(boolean z) {
        this.f25974a = -1;
        this.b = true;
        this.c = 0;
        this.d = null;
        this.e = false;
        this.x = true;
        this.b = z;
        b_(1);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : !this.e;
    }

    @Override // tb.bln, com.alibaba.android.ultron.ext.vlayout.c
    public void b_(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4da913f", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            super.b_(1);
        } else {
            super.b_(0);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f25974a = i;
        }
    }

    @Override // tb.bln
    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.c cVar, bls blsVar, e eVar) {
        View view;
        int d;
        int a2;
        int a3;
        int i;
        int i2;
        int paddingLeft;
        int d2;
        int d3;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67c9cc3", new Object[]{this, recycler, state, cVar, blsVar, eVar});
        } else if (d(cVar.b())) {
        } else {
            View view2 = this.d;
            if (view2 == null) {
                view = cVar.a(recycler);
            } else {
                cVar.d();
                view = view2;
            }
            if (view == null) {
                blsVar.b = true;
                return;
            }
            a(view, eVar);
            boolean z = eVar.getOrientation() == 1;
            g c = eVar.c();
            blsVar.f25966a = c.c(view);
            view.getLayoutParams();
            this.e = true;
            int f = (cVar.f() - blsVar.f25966a) + cVar.i();
            if (eVar.getOrientation() == 1) {
                if (eVar.g()) {
                    d2 = (eVar.e() - eVar.getPaddingRight()) - this.u;
                    paddingLeft = d2 - c.d(view);
                } else {
                    paddingLeft = this.t + eVar.getPaddingLeft();
                    d2 = c.d(view) + paddingLeft;
                }
                if (cVar.h() == -1) {
                    d3 = cVar.a() - this.w;
                    i3 = cVar.a() - blsVar.f25966a;
                } else if (this.b) {
                    i3 = this.v + cVar.a();
                    d3 = cVar.a() + blsVar.f25966a;
                } else {
                    d3 = ((c.d() - this.w) - this.c) - this.n.d;
                    i3 = d3 - blsVar.f25966a;
                }
                if (eVar.getReverseLayout() || !this.b) {
                    if ((f < this.c + this.n.d && cVar.g() == 1) || d3 > this.w + this.c + this.n.d) {
                        this.e = false;
                        this.d = view;
                        int d4 = ((c.d() - this.w) - this.c) - this.n.d;
                        i = d4 - blsVar.f25966a;
                        a3 = d2;
                        i2 = paddingLeft;
                        d = d4;
                    }
                    a3 = d2;
                    i2 = paddingLeft;
                    d = d3;
                    i = i3;
                } else if ((f < this.c + this.n.b && cVar.g() == -1) || i3 < this.v + this.c + this.n.b) {
                    this.e = false;
                    this.d = view;
                    int c2 = c.c() + this.v + this.c + this.n.b;
                    i = c2;
                    a3 = d2;
                    i2 = paddingLeft;
                    d = blsVar.f25966a + c2;
                } else {
                    if (VirtualLayoutManager.d) {
                        String str = "remainingSpace: " + f + "    offset: " + this.c;
                    }
                    a3 = d2;
                    i2 = paddingLeft;
                    d = d3;
                    i = i3;
                }
            } else {
                int paddingTop = eVar.getPaddingTop();
                d = c.d(view) + paddingTop + this.v;
                if (cVar.h() == -1) {
                    a3 = cVar.a() - this.u;
                    a2 = cVar.a() - blsVar.f25966a;
                } else {
                    a2 = this.t + cVar.a();
                    a3 = cVar.a() + blsVar.f25966a;
                }
                if (eVar.getReverseLayout() || !this.b) {
                    if (f < this.c + this.n.c) {
                        this.e = false;
                        this.d = view;
                        int d5 = (c.d() - this.c) - this.n.c;
                        a3 = d5;
                        i = paddingTop;
                        i2 = d5 - blsVar.f25966a;
                    }
                    i = paddingTop;
                    i2 = a2;
                } else {
                    if (f < this.c + this.n.f25963a) {
                        this.e = false;
                        this.d = view;
                        int c3 = c.c() + this.c + this.n.f25963a;
                        a3 = blsVar.f25966a;
                        i = paddingTop;
                        i2 = c3;
                    }
                    i = paddingTop;
                    i2 = a2;
                }
            }
            a(view, i2, i, a3, d, eVar);
            blsVar.f25966a += z ? j() : i();
            if (state.isPreLayout()) {
                this.e = true;
            }
            if (!this.e) {
                return;
            }
            eVar.a(cVar, view);
            a(blsVar, view);
            this.d = null;
        }
    }

    @Override // tb.bln, com.alibaba.android.ultron.ext.vlayout.c
    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870432d9", new Object[]{this, recycler, state, eVar});
            return;
        }
        super.a(recycler, state, eVar);
        View view = this.d;
        if (view != null && eVar.d(view)) {
            eVar.c(this.d);
            recycler.recycleView(this.d);
            this.d = null;
        }
        this.e = false;
    }

    @Override // tb.bln, com.alibaba.android.ultron.ext.vlayout.c
    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, e eVar) {
        View view;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c750c", new Object[]{this, recycler, state, new Integer(i), new Integer(i2), new Integer(i3), eVar});
            return;
        }
        super.a(recycler, state, i, i2, i3, eVar);
        if (this.f25974a < 0) {
            return;
        }
        g c = eVar.c();
        if (!this.e && (i4 = this.f25974a) >= i && i4 <= i2) {
            a(c, recycler, i, i2, eVar);
        }
        if (this.e || state.isPreLayout()) {
            state.isPreLayout();
            View view2 = this.d;
            if (view2 == null) {
                return;
            }
            eVar.c(view2);
        }
        if (!this.e && (view = this.d) != null) {
            if (view.getParent() == null) {
                eVar.e(this.d);
            } else {
                b(c, recycler, i, i2, eVar);
            }
        } else {
            c(c, recycler, i, i2, eVar);
        }
        if (this.y == null) {
            return;
        }
        if (this.x && !r()) {
            this.x = false;
        } else if (this.x || !r()) {
        } else {
            this.x = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.alibaba.android.ultron.ext.vlayout.g r5, android.support.v7.widget.RecyclerView.Recycler r6, int r7, int r8, com.alibaba.android.ultron.ext.vlayout.e r9) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bly.a(com.alibaba.android.ultron.ext.vlayout.g, android.support.v7.widget.RecyclerView$Recycler, int, int, com.alibaba.android.ultron.ext.vlayout.e):void");
    }

    private void b(g gVar, RecyclerView.Recycler recycler, int i, int i2, e eVar) {
        int d;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int paddingLeft;
        int d2;
        View view;
        int m;
        int i8;
        int i9;
        int n;
        IpChange ipChange = $ipChange;
        int i10 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c011a938", new Object[]{this, gVar, recycler, new Integer(i), new Integer(i2), eVar});
        } else if ((this.b && i2 >= this.f25974a) || (!this.b && i <= this.f25974a)) {
            int c = gVar.c(this.d);
            boolean z = eVar.getOrientation() == 1;
            int i11 = z ? this.n.b : this.n.f25963a;
            int i12 = z ? this.n.d : this.n.c;
            int i13 = -1;
            if (z) {
                if (eVar.g()) {
                    d2 = eVar.e() - eVar.getPaddingRight();
                    paddingLeft = d2 - gVar.d(this.d);
                } else {
                    paddingLeft = eVar.getPaddingLeft();
                    d2 = gVar.d(this.d) + paddingLeft;
                }
                if (this.b) {
                    i9 = eVar.getChildCount() - 1;
                    view = null;
                    while (i9 >= 0) {
                        view = eVar.getChildAt(i9);
                        int position = eVar.getPosition(view);
                        if (position < this.f25974a) {
                            int b = gVar.b(view);
                            c a2 = eVar.a(position);
                            if (a2 instanceof blv) {
                                n = ((blv) a2).e(eVar);
                            } else {
                                if (a2 instanceof blu) {
                                    blu bluVar = (blu) a2;
                                    b += bluVar.q();
                                    n = bluVar.n();
                                }
                                this.e = true;
                                i5 = b + c;
                                i8 = b;
                                i13 = i9;
                            }
                            b += n;
                            this.e = true;
                            i5 = b + c;
                            i8 = b;
                            i13 = i9;
                        } else {
                            i9--;
                        }
                    }
                    i5 = 0;
                    i8 = 0;
                } else {
                    view = null;
                    for (int i14 = 0; i14 < eVar.getChildCount(); i14++) {
                        view = eVar.getChildAt(i14);
                        int position2 = eVar.getPosition(view);
                        if (position2 > this.f25974a) {
                            int a3 = gVar.a(view);
                            c a4 = eVar.a(position2);
                            if (a4 instanceof blv) {
                                m = ((blv) a4).b(eVar);
                            } else {
                                if (a4 instanceof blu) {
                                    blu bluVar2 = (blu) a4;
                                    a3 -= bluVar2.p();
                                    m = bluVar2.m();
                                }
                                i8 = a3 - c;
                                i9 = i14 + 1;
                                this.e = true;
                                i5 = a3;
                                i13 = i9;
                            }
                            a3 -= m;
                            i8 = a3 - c;
                            i9 = i14 + 1;
                            this.e = true;
                            i5 = a3;
                            i13 = i9;
                        }
                    }
                    i5 = 0;
                    i8 = 0;
                }
                if (view == null || i13 < 0) {
                    this.e = false;
                }
                if (eVar.getReverseLayout() || !this.b) {
                    if (i5 > (gVar.d() - this.c) - i12) {
                        this.e = false;
                    }
                } else if (i8 < gVar.c() + this.c + i11) {
                    this.e = false;
                }
                if (!this.e) {
                    if (eVar.getReverseLayout() || !this.b) {
                        int d3 = (gVar.d() - this.c) - i12;
                        i5 = d3;
                        i4 = d3 - c;
                        i3 = d2;
                        i6 = paddingLeft;
                    } else {
                        i8 = gVar.c() + this.c + i11;
                        i5 = i8 + c;
                    }
                }
                i3 = d2;
                i6 = paddingLeft;
                i4 = i8;
            } else {
                int paddingTop = eVar.getPaddingTop();
                int d4 = gVar.d(this.d) + paddingTop;
                if (this.e) {
                    if (this.b) {
                        for (int childCount = eVar.getChildCount() - 1; childCount >= 0; childCount--) {
                            View childAt = eVar.getChildAt(childCount);
                            if (eVar.getPosition(childAt) < this.f25974a) {
                                i10 = gVar.b(childAt);
                                i7 = i10 + c;
                            }
                        }
                        i4 = paddingTop;
                        i5 = d4;
                        i6 = 0;
                        i3 = 0;
                    } else {
                        for (int i15 = 0; i15 < eVar.getChildCount(); i15++) {
                            View childAt2 = eVar.getChildAt(i15);
                            if (eVar.getPosition(childAt2) > this.f25974a) {
                                d = gVar.a(childAt2);
                                i3 = d;
                                i4 = paddingTop;
                                i5 = d4;
                                i6 = d - c;
                                break;
                            }
                        }
                        i7 = 0;
                    }
                    i3 = i7;
                    i4 = paddingTop;
                    i6 = i10;
                    i5 = d4;
                    break;
                } else if (eVar.getReverseLayout() || !this.b) {
                    d = (gVar.d() - this.c) - i12;
                    i3 = d;
                    i4 = paddingTop;
                    i5 = d4;
                    i6 = d - c;
                    break;
                } else {
                    int c2 = gVar.c() + this.c + i11;
                    i3 = c + c2;
                    i4 = paddingTop;
                    i5 = d4;
                    i6 = c2;
                }
            }
            a(this.d, i6, i4, i3, i5, eVar);
            if (!this.e) {
                eVar.b(this.d);
                eVar.e(this.d);
            } else if (i13 >= 0) {
                if (this.d.getParent() == null) {
                    eVar.a(this.d, i13);
                }
                this.d = null;
            }
        } else {
            eVar.c(this.d);
            eVar.g(this.d);
            this.d = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(com.alibaba.android.ultron.ext.vlayout.g r19, android.support.v7.widget.RecyclerView.Recycler r20, int r21, int r22, com.alibaba.android.ultron.ext.vlayout.e r23) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bly.c(com.alibaba.android.ultron.ext.vlayout.g, android.support.v7.widget.RecyclerView$Recycler, int, int, com.alibaba.android.ultron.ext.vlayout.e):void");
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.d;
    }

    @Override // tb.bln
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27f1469", new Object[]{this, eVar});
            return;
        }
        super.a(eVar);
        View view = this.d;
        if (view == null) {
            return;
        }
        eVar.g(view);
        eVar.c(this.d);
        this.d = null;
    }

    private void a(View view, e eVar) {
        int a2;
        int a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd2a8eb", new Object[]{this, view, eVar});
            return;
        }
        VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
        boolean z = eVar.getOrientation() == 1;
        int e = ((eVar.e() - eVar.getPaddingLeft()) - eVar.getPaddingRight()) - i();
        int f = ((eVar.f() - eVar.getPaddingTop()) - eVar.getPaddingBottom()) - j();
        float f2 = layoutParams.b;
        if (z) {
            int a4 = eVar.a(e, layoutParams.width, false);
            if (!Float.isNaN(f2) && f2 > 0.0f) {
                a3 = View.MeasureSpec.makeMeasureSpec((int) ((e / f2) + 0.5f), 1073741824);
            } else if (!Float.isNaN(this.m) && this.m > 0.0f) {
                a3 = View.MeasureSpec.makeMeasureSpec((int) ((e / this.m) + 0.5d), 1073741824);
            } else {
                a3 = eVar.a(f, layoutParams.height, true);
            }
            eVar.measureChildWithMargins(view, a4, a3);
            return;
        }
        int a5 = eVar.a(f, layoutParams.height, false);
        if (!Float.isNaN(f2) && f2 > 0.0f) {
            a2 = View.MeasureSpec.makeMeasureSpec((int) ((f * f2) + 0.5d), 1073741824);
        } else if (!Float.isNaN(this.m) && this.m > 0.0f) {
            a2 = View.MeasureSpec.makeMeasureSpec((int) ((f * this.m) + 0.5d), 1073741824);
        } else {
            a2 = eVar.a(e, layoutParams.width, true);
        }
        eVar.measureChildWithMargins(view, a2, a5);
    }
}
