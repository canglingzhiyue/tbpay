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
import tb.arc;

/* loaded from: classes2.dex */
public class auo extends auu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View[] c;

    /* renamed from: a  reason: collision with root package name */
    private float[] f25614a = new float[0];
    private int b = 0;
    private int d = 0;

    static {
        kge.a(642041795);
    }

    public static /* synthetic */ Object ipc$super(auo auoVar, String str, Object... objArr) {
        if (str.hashCode() == 1453898639) {
            return new Integer(super.a(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue(), (e) objArr[3]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public auo(int i) {
        b_(i);
    }

    public void a(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c197633", new Object[]{this, fArr});
        } else if (fArr != null) {
            this.f25614a = Arrays.copyOf(fArr, fArr.length);
        } else {
            this.f25614a = new float[0];
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    @Override // tb.bln
    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.c cVar, bls blsVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67c9cc3", new Object[]{this, recycler, state, cVar, blsVar, eVar});
            return;
        }
        int b = cVar.b();
        if (d(b)) {
            return;
        }
        if (!b(eVar)) {
            arc.a().b("只支持垂直方向的布局", arc.a.a().b("AURAColumnLayoutHelper").b());
            return;
        }
        boolean z = cVar.h() == 1;
        h<Integer> e = e();
        if (!z ? b == e.b().intValue() : b == e.a().intValue()) {
            int f = f();
            View[] viewArr = this.c;
            if (viewArr == null || f != viewArr.length) {
                this.c = new View[f];
            }
            int a2 = a(this.c, recycler, cVar, eVar);
            int i = Integer.MIN_VALUE;
            for (int i2 = 0; i2 < a2; i2++) {
                View view = this.c[i2];
                if (view != null) {
                    eVar.a(cVar, view);
                    a(view, eVar, i2, z);
                    i = Math.max(i, eVar.c().c(view));
                }
            }
            blsVar.f25966a = p() + i + q();
            if (z) {
                int a3 = cVar.a() + p();
                int i3 = 0;
                while (i3 < a2) {
                    a(this.c[i3], i3 == 0 ? o() : this.b, a3, i, blsVar, eVar);
                    i3++;
                }
            } else {
                int a4 = (cVar.a() - i) - q();
                int i4 = a2 - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    a(this.c[i5], i4 == 0 ? o() : this.b, a4, i, blsVar, eVar);
                }
            }
        }
        c();
    }

    private void a(View view, int i, int i2, int i3, bls blsVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("612ebc61", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), blsVar, eVar});
        } else if (view == null) {
        } else {
            g c = eVar.c();
            int i4 = this.d + i;
            int d = i4 + c.d(view);
            a(view, blsVar, eVar, i2, i4, i2 + i3, d, false);
            this.d = d;
        }
    }

    private void a(View view, e eVar, int i, boolean z) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52daba5c", new Object[]{this, view, eVar, new Integer(i), new Boolean(z)});
            return;
        }
        VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
        float[] fArr = this.f25614a;
        int length = fArr.length - i;
        if (length > 0) {
            if (!z) {
                i = length - 1;
            }
            f = fArr[i];
        } else {
            f = 0.0f;
        }
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 100.0f) {
            f = 100.0f;
        }
        int e = ((((eVar.e() - eVar.getPaddingLeft()) - eVar.getPaddingRight()) - i()) - k()) - ((f() - 1) * this.b);
        int i2 = (int) ((e * f) / 100.0f);
        int a2 = eVar.a(e, i2, false);
        int a3 = eVar.a((((eVar.f() - eVar.getPaddingTop()) - eVar.getPaddingBottom()) - j()) - l(), layoutParams.height, true);
        layoutParams.width = i2;
        eVar.measureChild(view, a2, a3);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        View[] viewArr = this.c;
        if (viewArr != null) {
            Arrays.fill(viewArr, (Object) null);
        }
        this.d = 0;
    }

    @Override // tb.blu, com.alibaba.android.ultron.ext.vlayout.c
    public int a(int i, boolean z, boolean z2, e eVar) {
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56a8bb8f", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2), eVar})).intValue();
        }
        if (eVar.getOrientation() == 1) {
            z3 = true;
        }
        if (z) {
            if (i == f() - 1) {
                return z3 ? this.w + this.s : this.u + this.q;
            }
        } else if (i == 0) {
            return z3 ? (-this.v) - this.r : (-this.t) - this.p;
        }
        return super.a(i, z, z2, eVar);
    }
}
