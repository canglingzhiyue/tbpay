package tb;

import android.support.v7.widget.RecyclerView;
import android.util.SparseIntArray;
import android.view.View;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.e;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class blr extends bln {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final int C;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f25964a;
    private int[] A;
    private int[] B;
    private boolean D;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private b n;
    private int o;
    private int x;
    private float[] y;
    private View[] z;

    public static /* synthetic */ Object ipc$super(blr blrVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1384947477) {
            super.c((e) objArr[0]);
            return null;
        } else if (hashCode == -1031859095) {
            super.a((e) objArr[0]);
            return null;
        } else if (hashCode != 1453898639) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Integer(super.a(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue(), (e) objArr[3]));
        }
    }

    static {
        kge.a(-234970548);
        f25964a = false;
        C = View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.n.b(i);
        this.n.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0271, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02a7, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013b, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0169, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0243, code lost:
        r6 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0208  */
    @Override // tb.bln
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.support.v7.widget.RecyclerView.Recycler r28, android.support.v7.widget.RecyclerView.State r29, com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager.c r30, tb.bls r31, com.alibaba.android.ultron.ext.vlayout.e r32) {
        /*
            Method dump skipped, instructions count: 1628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.blr.a(android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State, com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager$c, tb.bls, com.alibaba.android.ultron.ext.vlayout.e):void");
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

    @Override // tb.bln
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c27f1469", new Object[]{this, eVar});
            return;
        }
        super.a(eVar);
        this.n.a();
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7360eb", new Object[]{this, eVar});
            return;
        }
        super.c(eVar);
        this.n.a();
    }

    private int a(int i, int i2, int i3, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d1615d8", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Float(f)})).intValue();
        }
        if (!Float.isNaN(f) && f > 0.0f && i3 > 0) {
            return View.MeasureSpec.makeMeasureSpec((int) ((i3 / f) + 0.5f), 1073741824);
        }
        if (!Float.isNaN(this.m) && this.m > 0.0f) {
            return View.MeasureSpec.makeMeasureSpec((int) ((i2 / this.m) + 0.5f), 1073741824);
        }
        if (i < 0) {
            return C;
        }
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        View[] viewArr = this.z;
        if (viewArr == null || viewArr.length != this.b) {
            this.z = new View[this.b];
        }
        int[] iArr = this.A;
        if (iArr == null || iArr.length != this.b) {
            this.A = new int[this.b];
        }
        int[] iArr2 = this.B;
        if (iArr2 != null && iArr2.length == this.b) {
            return;
        }
        this.B = new int[this.b];
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void a(RecyclerView.State state, VirtualLayoutManager.a aVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3df29ad", new Object[]{this, state, aVar, eVar});
        } else if (state.getItemCount() <= 0 || state.isPreLayout()) {
        } else {
            int b2 = this.n.b(aVar.f2639a, this.b);
            if (aVar.c) {
                while (b2 < this.b - 1 && aVar.f2639a < e().b().intValue()) {
                    aVar.f2639a++;
                    b2 = this.n.b(aVar.f2639a, this.b);
                }
            } else {
                while (b2 > 0 && aVar.f2639a > 0) {
                    aVar.f2639a--;
                    b2 = this.n.b(aVar.f2639a, this.b);
                }
            }
            this.D = true;
        }
    }

    private int a(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("844db71e", new Object[]{this, recycler, state, new Integer(i)})).intValue();
        }
        if (!state.isPreLayout()) {
            return this.n.b(i, this.b);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.n.b(convertPreLayoutPositionToPostLayout, this.b);
        }
        return 0;
    }

    private int b(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd59029f", new Object[]{this, recycler, state, new Integer(i)})).intValue();
        }
        if (!state.isPreLayout()) {
            return this.n.a(i);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return this.n.a(convertPreLayoutPositionToPostLayout);
        }
        return 0;
    }

    private void a(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, boolean z, e eVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        int i7 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44e95f9d", new Object[]{this, recycler, state, new Integer(i), new Integer(i2), new Boolean(z), eVar});
            return;
        }
        if (z) {
            i4 = i;
            i3 = 0;
            i5 = 1;
        } else {
            i3 = i - 1;
            i4 = -1;
            i5 = -1;
        }
        if (eVar.getOrientation() != 1 || !eVar.g()) {
            i6 = 1;
        } else {
            i7 = i2 - 1;
            i6 = -1;
        }
        while (i3 != i4) {
            int b2 = b(recycler, state, eVar.getPosition(this.z[i3]));
            if (i6 == -1 && b2 > 1) {
                this.A[i3] = i7 - (b2 - 1);
            } else {
                this.A[i3] = i7;
            }
            i7 += b2 * i6;
            i3 += i5;
        }
    }

    /* loaded from: classes2.dex */
    public static final class a extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-535577618);
        }

        @Override // tb.blr.b
        public int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
            }
            return 1;
        }

        @Override // tb.blr.b
        public int a(int i, int i2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue() : (i - this.b) % i2;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f25965a = new SparseIntArray();
        private boolean c = false;
        public int b = 0;

        static {
            kge.a(1604856125);
        }

        public abstract int a(int i);

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                this.f25965a.clear();
            }
        }

        public int b(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("90f78dfc", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
            }
            if (!this.c) {
                return a(i, i2);
            }
            int i3 = this.f25965a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int a2 = a(i, i2);
            this.f25965a.put(i, a2);
            return a2;
        }

        public int a(int i, int i2) {
            int i3;
            int c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
            }
            int a2 = a(i);
            if (a2 == i2) {
                return 0;
            }
            int i4 = this.b;
            if (!this.c || this.f25965a.size() <= 0 || (c = c(i)) < 0) {
                i3 = 0;
            } else {
                i3 = this.f25965a.get(c) + a(c);
                i4 = 1 + c;
            }
            while (i4 < i) {
                int a3 = a(i4);
                i3 += a3;
                if (i3 == i2) {
                    i3 = 0;
                } else if (i3 > i2) {
                    i3 = a3;
                }
                i4++;
            }
            if (a2 + i3 > i2) {
                return 0;
            }
            return i3;
        }

        public int c(int i) {
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue();
            }
            int size = this.f25965a.size() - 1;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.f25965a.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 >= 0 && i4 < this.f25965a.size()) {
                return this.f25965a.keyAt(i4);
            }
            return -1;
        }
    }
}
