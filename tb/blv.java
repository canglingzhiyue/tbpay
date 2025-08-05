package tb;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.e;
import com.alibaba.android.ultron.ext.vlayout.h;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bln;
import tb.blr;

/* loaded from: classes2.dex */
public class blv extends bln {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f25968a;
    private static final int d;
    private a b;
    private int c;
    private boolean e;

    public static /* synthetic */ Object ipc$super(blv blvVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1659494104:
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case -1384947477:
                super.c((e) objArr[0]);
                return null;
            case -1031859095:
                super.a((e) objArr[0]);
                return null;
            case 828018729:
                super.b(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1453898639:
                return new Integer(super.a(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue(), (e) objArr[3]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(1935376781);
        f25968a = false;
        d = View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    public blv(int i) {
        this(i, -1, -1);
    }

    public blv(int i, int i2, int i3) {
        this(i, i2, i3, i3);
    }

    public blv(int i, int i2, int i3, int i4) {
        this.c = 0;
        this.e = false;
        this.b = new a(this);
        this.b.d(i);
        this.b.b(i3);
        this.b.c(i4);
        b_(i2);
    }

    @Override // tb.blu
    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.a(i, i2, i3, i4);
        this.b.b(i, i2, i3, i4);
    }

    @Override // tb.blu
    public void b(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315a9029", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.b(i, i2, i3, i4);
        this.b.a(i, i2, i3, i4);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.b.a(i, i2);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.b.b(i);
        }
    }

    @Override // tb.bln
    public float h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10df", new Object[]{this})).floatValue() : this.b.b();
    }

    @Override // tb.bln
    public void a(bln.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b3d217", new Object[]{this, aVar});
        } else {
            this.b.a(aVar);
        }
    }

    @Override // tb.bln
    public boolean f_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b35e8cc4", new Object[]{this})).booleanValue() : this.b.K();
    }

    @Override // tb.bln, com.alibaba.android.ultron.ext.vlayout.c
    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("870432d9", new Object[]{this, recycler, state, eVar});
        } else {
            this.b.a(recycler, state, eVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x02e2, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0312, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0348, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016b, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0188, code lost:
        if (r3 == r30.b.G().a().intValue()) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x019d, code lost:
        if (r3 == r30.b.G().b().intValue()) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x019f, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a1, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ac, code lost:
        r10 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x039a A[LOOP:2: B:73:0x0234->B:139:0x039a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x091e  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x096c  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x03dd A[EDGE_INSN: B:399:0x03dd->B:144:0x03dd ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026b  */
    @Override // tb.bln
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.support.v7.widget.RecyclerView.Recycler r31, android.support.v7.widget.RecyclerView.State r32, com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager.c r33, tb.bls r34, com.alibaba.android.ultron.ext.vlayout.e r35) {
        /*
            Method dump skipped, instructions count: 2825
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.blv.a(android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State, com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager$c, tb.bls, com.alibaba.android.ultron.ext.vlayout.e):void");
    }

    @Override // tb.bln, com.alibaba.android.ultron.ext.vlayout.c
    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c750c", new Object[]{this, recycler, state, new Integer(i), new Integer(i2), new Integer(i3), eVar});
        } else {
            this.b.a(recycler, state, i, i2, i3, eVar);
        }
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
                return a.a(this.b, z3);
            }
        } else if (i == 0) {
            return a.b(this.b, z3);
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
        this.b.a(eVar);
        this.b.a();
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7360eb", new Object[]{this, eVar});
            return;
        }
        super.c(eVar);
        this.b.a();
    }

    private int a(a aVar, int i, int i2, int i3, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1094ff", new Object[]{this, aVar, new Integer(i), new Integer(i2), new Integer(i3), new Float(f)})).intValue();
        }
        if (!Float.isNaN(f) && f > 0.0f && i3 > 0) {
            return View.MeasureSpec.makeMeasureSpec((int) ((i3 / f) + 0.5f), 1073741824);
        }
        if (!Float.isNaN(a.l(aVar)) && a.l(aVar) > 0.0f) {
            return View.MeasureSpec.makeMeasureSpec((int) ((i2 / a.l(aVar)) + 0.5f), 1073741824);
        }
        if (i < 0) {
            return d;
        }
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void a(RecyclerView.State state, VirtualLayoutManager.a aVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3df29ad", new Object[]{this, state, aVar, eVar});
        } else if (state.getItemCount() <= 0) {
        } else {
            a a2 = this.b.a(aVar.f2639a);
            int b = a.e(a2).b(aVar.f2639a, a.a(a2));
            if (aVar.c) {
                while (b < a.a(a2) - 1 && aVar.f2639a < e().b().intValue()) {
                    aVar.f2639a++;
                    b = a.e(a2).b(aVar.f2639a, a.a(a2));
                }
            } else {
                while (b > 0 && aVar.f2639a > 0) {
                    aVar.f2639a--;
                    b = a.e(a2).b(aVar.f2639a, a.a(a2));
                }
            }
            this.e = true;
        }
    }

    private int a(blr.b bVar, int i, RecyclerView.Recycler recycler, RecyclerView.State state, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a098707", new Object[]{this, bVar, new Integer(i), recycler, state, new Integer(i2)})).intValue();
        }
        if (!state.isPreLayout()) {
            return bVar.b(i2, i);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i2);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return bVar.b(convertPreLayoutPositionToPostLayout, i);
        }
        return 0;
    }

    private int a(blr.b bVar, RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e15afba8", new Object[]{this, bVar, recycler, state, new Integer(i)})).intValue();
        }
        if (!state.isPreLayout()) {
            return bVar.a(i);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout != -1) {
            return bVar.a(convertPreLayoutPositionToPostLayout);
        }
        return 0;
    }

    private void a(a aVar, RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, boolean z, e eVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        int i7 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f857c4", new Object[]{this, aVar, recycler, state, new Integer(i), new Integer(i2), new Boolean(z), eVar});
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
            int a2 = a(a.e(aVar), recycler, state, eVar.getPosition(a.f(aVar)[i3]));
            if (i6 == -1 && a2 > 1) {
                a.j(aVar)[i3] = i7 - (a2 - 1);
            } else {
                a.j(aVar)[i3] = i7;
            }
            i7 += a2 * i6;
            i3 += i5;
        }
    }

    public int b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37f93a9d", new Object[]{this, eVar})).intValue();
        }
        a a2 = this.b.a(e().a().intValue());
        if (eVar.getOrientation() == 1) {
            return a2.y() + a2.u();
        }
        return a2.w() + a2.s();
    }

    public int e(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9867ad60", new Object[]{this, eVar})).intValue();
        }
        a a2 = this.b.a(e().b().intValue());
        if (eVar.getOrientation() == 1) {
            return a2.z() + a2.v();
        }
        return a2.x() + a2.t();
    }

    /* loaded from: classes2.dex */
    public static class a extends blw<a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float n;
        private int o;
        private int p;
        private boolean q;
        private boolean r;
        private blr.b s;
        private int t;
        private int u;
        private float[] v;
        private View[] w;
        private int[] x;
        private int[] y;

        static {
            kge.a(-1572074895);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 1544639176) {
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("445a9702", new Object[]{aVar})).intValue() : aVar.o;
        }

        public static /* synthetic */ int a(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("46f8bdc7", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.p = i;
            return i;
        }

        public static /* synthetic */ int b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e360143", new Object[]{aVar})).intValue() : aVar.u;
        }

        public static /* synthetic */ int c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f8116b84", new Object[]{aVar})).intValue() : aVar.t;
        }

        public static /* synthetic */ void d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51ecd5d2", new Object[]{aVar});
            } else {
                aVar.L();
            }
        }

        public static /* synthetic */ blr.b e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (blr.b) ipChange.ipc$dispatch("5ef051ad", new Object[]{aVar}) : aVar.s;
        }

        public static /* synthetic */ View[] f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View[]) ipChange.ipc$dispatch("18d70c1f", new Object[]{aVar}) : aVar.w;
        }

        public static /* synthetic */ boolean g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f7f1499", new Object[]{aVar})).booleanValue() : aVar.q;
        }

        public static /* synthetic */ float[] h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("71f55ccb", new Object[]{aVar}) : aVar.v;
        }

        public static /* synthetic */ int[] i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("53873aad", new Object[]{aVar}) : aVar.y;
        }

        public static /* synthetic */ int[] j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("3519188c", new Object[]{aVar}) : aVar.x;
        }

        public static /* synthetic */ int k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c6ecbd8c", new Object[]{aVar})).intValue() : aVar.p;
        }

        public static /* synthetic */ float l(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("20c827ca", new Object[]{aVar})).floatValue() : aVar.n;
        }

        public a(blv blvVar) {
            super(blvVar);
            this.n = Float.NaN;
            this.o = 4;
            this.p = 0;
            this.q = true;
            this.r = false;
            this.s = new blr.a();
            this.t = 0;
            this.u = 0;
            this.v = new float[0];
            this.s.a(true);
        }

        public a() {
            this.n = Float.NaN;
            this.o = 4;
            this.p = 0;
            this.q = true;
            this.r = false;
            this.s = new blr.a();
            this.t = 0;
            this.u = 0;
            this.v = new float[0];
            this.s.a(true);
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("cd6a4882", new Object[]{this, new Integer(i)}) : b(this, i);
        }

        private a b(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e58cdb6a", new Object[]{this, aVar, new Integer(i)});
            }
            int size = aVar.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar2 = (a) aVar.d.valueAt(i2);
                h hVar = (h) aVar.d.keyAt(i2);
                if (!aVar2.I()) {
                    return b(aVar2, i);
                }
                if (hVar.a((h) Integer.valueOf(i))) {
                    return (a) aVar.d.valueAt(i2);
                }
            }
            return aVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.s.a();
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                ((a) this.d.valueAt(i)).a();
            }
        }

        public static int a(a aVar, boolean z) {
            int i;
            int i2;
            int i3;
            int i4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("46f8fd98", new Object[]{aVar, new Boolean(z)})).intValue();
            }
            if (z) {
                i = aVar.l;
                i2 = aVar.h;
            } else {
                i = aVar.j;
                i2 = aVar.f;
            }
            int i5 = i + i2;
            int intValue = aVar.G().b().intValue();
            int size = aVar.d.size();
            for (int i6 = 0; i6 < size; i6++) {
                a aVar2 = (a) aVar.d.valueAt(i6);
                if (!aVar2.I()) {
                    i5 += a(aVar2, z);
                } else if (aVar2.c.b().intValue() == intValue) {
                    if (z) {
                        i3 = aVar2.l;
                        i4 = aVar2.h;
                    } else {
                        i3 = aVar2.j;
                        i4 = aVar2.f;
                    }
                    return i5 + i3 + i4;
                }
            }
            return i5;
        }

        public static int b(a aVar, boolean z) {
            int i;
            int i2;
            int i3;
            int i4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("288adb77", new Object[]{aVar, new Boolean(z)})).intValue();
            }
            if (z) {
                i = -aVar.k;
                i2 = aVar.g;
            } else {
                i = -aVar.i;
                i2 = aVar.e;
            }
            int i5 = i - i2;
            int intValue = aVar.G().a().intValue();
            int size = aVar.d.size();
            for (int i6 = 0; i6 < size; i6++) {
                a aVar2 = (a) aVar.d.valueAt(i6);
                if (!aVar2.I()) {
                    i5 += b(aVar2, z);
                } else if (aVar2.c.a().intValue() == intValue) {
                    if (z) {
                        i3 = -aVar2.k;
                        i4 = aVar2.g;
                    } else {
                        i3 = -aVar2.i;
                        i4 = aVar2.e;
                    }
                    return i5 + (i3 - i4);
                }
            }
            return i5;
        }

        public float b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83d9", new Object[]{this})).floatValue() : this.n;
        }

        @Override // tb.blw
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            super.a(i, i2);
            this.s.b(i);
            this.s.a();
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                return;
            }
            if (i < 0) {
                i = 0;
            }
            this.t = i;
        }

        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
                return;
            }
            if (i < 0) {
                i = 0;
            }
            this.u = i;
        }

        public void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            } else if (i == this.o) {
            } else {
                if (i <= 0) {
                    throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
                }
                this.o = i;
                this.s.a();
                L();
            }
        }

        private void L() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4447ed3", new Object[]{this});
                return;
            }
            View[] viewArr = this.w;
            if (viewArr == null || viewArr.length != this.o) {
                this.w = new View[this.o];
            }
            int[] iArr = this.x;
            if (iArr == null || iArr.length != this.o) {
                this.x = new int[this.o];
            }
            int[] iArr2 = this.y;
            if (iArr2 != null && iArr2.length == this.o) {
                return;
            }
            this.y = new int[this.o];
        }
    }
}
