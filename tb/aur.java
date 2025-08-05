package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.e;
import com.alibaba.android.ultron.ext.vlayout.g;
import com.alibaba.android.ultron.ext.vlayout.h;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class aur extends auu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View[] f25620a;
    private int b;
    private int c;
    private int d;
    private int e;

    static {
        kge.a(-1347434317);
    }

    public static /* synthetic */ Object ipc$super(aur aurVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public aur() {
    }

    public aur(int i) {
        b_(i);
    }

    @Override // tb.bln
    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.c cVar, bls blsVar, e eVar) {
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67c9cc3", new Object[]{this, recycler, state, cVar, blsVar, eVar});
            return;
        }
        int b = cVar.b();
        if (d(b)) {
            return;
        }
        boolean z = cVar.h() == 1;
        h<Integer> e = e();
        if (!z ? b == e.b().intValue() : b == e.a().intValue()) {
            int f = f();
            View[] viewArr = this.f25620a;
            if (viewArr == null || f != viewArr.length) {
                this.f25620a = new View[f];
            }
            int a2 = a(this.f25620a, recycler, cVar, eVar);
            if (z) {
                int i4 = 0;
                while (i4 < a2) {
                    View view = this.f25620a[i4];
                    if (view == null) {
                        i3 = i4;
                    } else {
                        boolean z2 = i4 == 0;
                        a(view, cVar, eVar, a2, i4, z2, z);
                        a(view, cVar, blsVar, eVar, z2);
                        i3 = i4;
                        a(view, blsVar, eVar, this.c, this.b, this.e, this.d, true);
                    }
                    i4 = i3 + 1;
                }
            } else {
                int i5 = a2 - 1;
                int i6 = i5;
                while (i6 >= 0) {
                    View view2 = this.f25620a[i6];
                    if (view2 == null) {
                        i = i6;
                        i2 = i5;
                    } else {
                        boolean z3 = i5 == i6;
                        i = i6;
                        a(view2, cVar, eVar, a2, i6, z3, z);
                        a(view2, cVar, blsVar, eVar, z3);
                        i2 = i5;
                        a(view2, blsVar, eVar, this.c, this.b, this.e, this.d, true);
                    }
                    i6 = i - 1;
                    i5 = i2;
                }
            }
        }
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        View[] viewArr = this.f25620a;
        if (viewArr != null) {
            Arrays.fill(viewArr, (Object) null);
        }
        this.b = 0;
        this.d = 0;
        this.c = 0;
        this.e = 0;
    }

    private void a(View view, VirtualLayoutManager.c cVar, e eVar, int i, int i2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbaa0daa", new Object[]{this, view, cVar, eVar, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2)});
        } else {
            eVar.a(cVar, view, z2 ? -1 : z ? 0 : (i - i2) - 1);
        }
    }

    private void a(View view, VirtualLayoutManager.c cVar, bls blsVar, e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c366283", new Object[]{this, view, cVar, blsVar, eVar, new Boolean(z)});
            return;
        }
        boolean b = eVar.b();
        VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
        if (eVar.getOrientation() == 1) {
            z2 = true;
        }
        int a2 = eVar.a((((eVar.e() - eVar.getPaddingLeft()) - eVar.getPaddingRight()) - i()) - k(), layoutParams.width, !z2);
        int a3 = eVar.a((((eVar.f() - eVar.getPaddingTop()) - eVar.getPaddingBottom()) - j()) - l(), layoutParams.height, z2);
        if (!b) {
            eVar.measureChildWithMargins(view, a2, a3);
        } else {
            eVar.measureChild(view, a2, a3);
        }
        if (!z) {
            return;
        }
        g c = eVar.c();
        blsVar.f25966a = c.c(view);
        if (eVar.getOrientation() == 1) {
            this.b = eVar.getPaddingLeft() + this.t + this.p;
            this.d = this.b + c.d(view);
            if (cVar.h() == -1) {
                this.e = cVar.a();
                this.c = this.e - c.c(view);
                return;
            }
            this.c = cVar.a();
            this.e = this.c + c.c(view);
            return;
        }
        this.c = eVar.getPaddingTop() + this.v + this.r;
        this.e = this.c + c.d(view);
        if (cVar.h() == -1) {
            this.d = cVar.a();
            this.b = this.d - c.c(view);
            return;
        }
        this.b = cVar.a();
        this.d = this.b + c.c(view);
    }
}
