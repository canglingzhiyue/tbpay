package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.e;
import com.alibaba.android.ultron.ext.vlayout.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class aup extends blq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    public static final int RIGHT_CENTER = 4;
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    private Handler F;
    private Runnable G;
    public int b;
    public int c;
    private int x;

    /* renamed from: a  reason: collision with root package name */
    private int f25615a = -1;
    private boolean y = false;
    public View d = null;
    public boolean e = false;
    private boolean z = true;
    private boolean A = false;
    private boolean B = true;
    private boolean C = false;
    private boolean D = false;
    private long E = 0;
    private a H = new a();
    private b I = new b();

    static {
        kge.a(-1642549640);
    }

    public static /* synthetic */ Object ipc$super(aup aupVar, String str, Object... objArr) {
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

    @Override // tb.blu
    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public boolean a(e eVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c426459e", new Object[]{this, eVar, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        return true;
    }

    @Override // tb.bln
    public boolean f_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b35e8cc4", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ int a(aup aupVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e0bfaa8f", new Object[]{aupVar})).intValue() : aupVar.f25615a;
    }

    public static /* synthetic */ void a(aup aupVar, RecyclerView.Recycler recycler, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f232c2e4", new Object[]{aupVar, recycler, eVar});
        } else {
            aupVar.a(recycler, eVar);
        }
    }

    public static /* synthetic */ void a(aup aupVar, View view, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae16d737", new Object[]{aupVar, view, eVar});
        } else {
            aupVar.a(view, eVar);
        }
    }

    public static /* synthetic */ void a(aup aupVar, e eVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58444015", new Object[]{aupVar, eVar, view});
        } else {
            aupVar.a(eVar, view);
        }
    }

    public static /* synthetic */ boolean a(aup aupVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37365bbc", new Object[]{aupVar, new Boolean(z)})).booleanValue();
        }
        aupVar.B = z;
        return z;
    }

    public static /* synthetic */ boolean b(aup aupVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cf42b121", new Object[]{aupVar})).booleanValue() : aupVar.A;
    }

    public aup(int i, int i2, int i3) {
        this.x = 0;
        this.b = 0;
        this.c = 0;
        this.x = i;
        this.b = i2;
        this.c = i3;
        b_(1);
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

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.D = z;
        }
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.E = j;
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.c
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f25615a = i;
        }
    }

    @Override // tb.bln
    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.c cVar, bls blsVar, e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d67c9cc3", new Object[]{this, recycler, state, cVar, blsVar, eVar});
        } else if (d(cVar.b())) {
        } else {
            if (!this.z) {
                cVar.d();
                return;
            }
            View view = this.d;
            if (view == null) {
                view = cVar.a(recycler);
            } else {
                cVar.d();
            }
            if (view == null) {
                blsVar.b = true;
                return;
            }
            this.e = state.isPreLayout();
            if (this.e) {
                eVar.a(cVar, view);
            }
            this.d = view;
            a(view, eVar);
            blsVar.f25966a = 0;
            blsVar.c = true;
            a(blsVar, view);
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
            this.A = true;
        }
        this.e = false;
    }

    @Override // tb.bln, com.alibaba.android.ultron.ext.vlayout.c
    public void a(final RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, final e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c750c", new Object[]{this, recycler, state, new Integer(i), new Integer(i2), new Integer(i3), eVar});
            return;
        }
        super.a(recycler, state, i, i2, i3, eVar);
        if (this.f25615a < 0) {
            return;
        }
        if (this.e && state.isPreLayout()) {
            View view = this.d;
            if (view != null) {
                eVar.c(view);
                recycler.recycleView(this.d);
                this.A = false;
            }
            this.d = null;
        } else if (a(eVar, i, i2, i3) && c()) {
            this.z = true;
            View view2 = this.d;
            if (view2 != null) {
                if (view2.getParent() == null) {
                    a(eVar, this.d);
                } else {
                    eVar.e(this.d);
                    this.B = false;
                }
            } else {
                Runnable runnable = new Runnable() { // from class: tb.aup.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        aup aupVar = aup.this;
                        aupVar.d = recycler.getViewForPosition(aup.a(aupVar));
                        aup aupVar2 = aup.this;
                        aup.a(aupVar2, aupVar2.d, eVar);
                        if (aup.b(aup.this)) {
                            eVar.e(aup.this.d);
                            aup.a(aup.this, false);
                            return;
                        }
                        aup aupVar3 = aup.this;
                        aup.a(aupVar3, eVar, aupVar3.d);
                    }
                };
                if (this.I.a()) {
                    this.I.a(runnable);
                } else {
                    runnable.run();
                }
            }
            b(recycler, eVar);
        } else {
            a(recycler, eVar);
        }
    }

    private void a(RecyclerView.Recycler recycler, e eVar) {
        Runnable runnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d7a198", new Object[]{this, recycler, eVar});
            return;
        }
        this.z = false;
        if (this.d != null) {
            b(eVar);
            a(recycler, eVar, this.d);
            this.d = null;
            this.C = true;
        }
        Handler handler = this.F;
        if (handler == null || (runnable = this.G) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : !this.D || !this.C;
    }

    private void b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f93aaa", new Object[]{this, eVar});
        } else if (!this.D) {
        } else {
            auq.a(eVar.f(this.d));
        }
    }

    private void b(final RecyclerView.Recycler recycler, final e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7596977", new Object[]{this, recycler, eVar});
        } else if (this.E <= 0) {
        } else {
            Runnable runnable = new Runnable() { // from class: tb.aup.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        aup.a(aup.this, recycler, eVar);
                    }
                }
            };
            this.F = new Handler(Looper.getMainLooper());
            this.F.postDelayed(runnable, this.E);
        }
    }

    private void a(e eVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70011c9", new Object[]{this, eVar, view});
            return;
        }
        if (this.o != null) {
            ViewPropertyAnimator a2 = this.o.a(view);
            if (a2 != null) {
                view.setVisibility(4);
                eVar.e(view);
                this.H.a(eVar, view);
                a2.setListener(this.H).start();
            } else {
                eVar.e(view);
            }
        } else {
            eVar.e(view);
        }
        this.B = false;
    }

    private void a(RecyclerView.Recycler recycler, e eVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d70c03a", new Object[]{this, recycler, eVar, view});
        } else if (!this.B && this.o != null) {
            ViewPropertyAnimator b2 = this.o.b(view);
            if (b2 != null) {
                this.I.a(recycler, eVar, view);
                b2.setListener(this.I).start();
                this.A = false;
                return;
            }
            eVar.c(view);
            recycler.recycleView(view);
            this.A = false;
        } else {
            eVar.c(view);
            recycler.recycleView(view);
            this.A = false;
        }
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
        eVar.c(view);
        eVar.g(this.d);
        this.d.animate().cancel();
        this.d = null;
        this.A = false;
    }

    private void a(View view, e eVar) {
        int a2;
        int paddingTop;
        int c;
        int i;
        int d;
        int i2;
        int i3;
        int paddingTop2;
        int e;
        int measuredWidth;
        int i4;
        int measuredHeight;
        int a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd2a8eb", new Object[]{this, view, eVar});
        } else if (view == null || eVar == null) {
        } else {
            VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
            g c2 = eVar.c();
            boolean z = eVar.getOrientation() == 1;
            float h = h();
            if (z) {
                int i5 = -1;
                int a4 = eVar.a((eVar.e() - eVar.getPaddingLeft()) - eVar.getPaddingRight(), layoutParams.width >= 0 ? layoutParams.width : (!this.y || !z) ? -2 : -1, false);
                if (!Float.isNaN(layoutParams.b) && layoutParams.b > 0.0f) {
                    a3 = eVar.a((eVar.f() - eVar.getPaddingTop()) - eVar.getPaddingBottom(), (int) ((View.MeasureSpec.getSize(a4) / layoutParams.b) + 0.5f), false);
                } else if (!Float.isNaN(h) && h > 0.0f) {
                    a3 = eVar.a((eVar.f() - eVar.getPaddingTop()) - eVar.getPaddingBottom(), (int) ((View.MeasureSpec.getSize(a4) / h) + 0.5f), false);
                } else {
                    int f = (eVar.f() - eVar.getPaddingTop()) - eVar.getPaddingBottom();
                    if (layoutParams.height >= 0) {
                        i5 = layoutParams.height;
                    } else if (!this.y || z) {
                        i5 = -2;
                    }
                    a3 = eVar.a(f, i5, false);
                }
                eVar.measureChildWithMargins(view, a4, a3);
            } else {
                int a5 = eVar.a((eVar.f() - eVar.getPaddingTop()) - eVar.getPaddingBottom(), layoutParams.height, false);
                if (!Float.isNaN(layoutParams.b) && layoutParams.b > 0.0f) {
                    a2 = eVar.a((eVar.e() - eVar.getPaddingLeft()) - eVar.getPaddingRight(), (int) ((View.MeasureSpec.getSize(a5) * layoutParams.b) + 0.5f), false);
                } else if (!Float.isNaN(h) && h > 0.0f) {
                    a2 = eVar.a((eVar.e() - eVar.getPaddingLeft()) - eVar.getPaddingRight(), (int) ((View.MeasureSpec.getSize(a5) * h) + 0.5f), false);
                } else {
                    a2 = eVar.a((eVar.e() - eVar.getPaddingLeft()) - eVar.getPaddingRight(), layoutParams.width, false);
                }
                eVar.measureChildWithMargins(view, a2, a5);
            }
            int i6 = this.x;
            if (i6 == 1) {
                paddingTop2 = eVar.getPaddingTop() + this.c + this.n.b;
                e = ((eVar.e() - eVar.getPaddingRight()) - this.b) - this.n.c;
                measuredWidth = ((e - layoutParams.leftMargin) - layoutParams.rightMargin) - view.getMeasuredWidth();
                i4 = layoutParams.topMargin + paddingTop2 + layoutParams.bottomMargin;
                measuredHeight = view.getMeasuredHeight();
            } else if (i6 == 4) {
                if (eVar.f() > view.getMeasuredHeight()) {
                    b((eVar.f() - view.getMeasuredHeight()) / 2);
                }
                paddingTop2 = eVar.getPaddingTop() + this.c + this.n.b;
                e = ((eVar.e() - eVar.getPaddingRight()) - this.b) - this.n.c;
                measuredWidth = ((e - layoutParams.leftMargin) - layoutParams.rightMargin) - view.getMeasuredWidth();
                i4 = layoutParams.topMargin + paddingTop2 + layoutParams.bottomMargin;
                measuredHeight = view.getMeasuredHeight();
            } else {
                if (i6 == 2) {
                    i3 = eVar.getPaddingLeft() + this.b + this.n.f25963a;
                    int f2 = ((eVar.f() - eVar.getPaddingBottom()) - this.c) - this.n.d;
                    i = layoutParams.leftMargin + i3 + layoutParams.rightMargin + view.getMeasuredWidth();
                    i2 = f2;
                    paddingTop = ((f2 - view.getMeasuredHeight()) - layoutParams.topMargin) - layoutParams.bottomMargin;
                } else if (i6 == 3) {
                    int e2 = ((eVar.e() - eVar.getPaddingRight()) - this.b) - this.n.c;
                    int f3 = ((eVar.f() - eVar.getPaddingBottom()) - this.c) - this.n.d;
                    i = e2;
                    i3 = ((e2 - layoutParams.leftMargin) - layoutParams.rightMargin) - view.getMeasuredWidth();
                    i2 = f3;
                    paddingTop = ((f3 - view.getMeasuredHeight()) - layoutParams.topMargin) - layoutParams.bottomMargin;
                } else {
                    int paddingLeft = eVar.getPaddingLeft() + this.b + this.n.f25963a;
                    paddingTop = eVar.getPaddingTop() + this.c + this.n.b;
                    if (z) {
                        c = c2.d(view);
                    } else {
                        c = c2.c(view);
                    }
                    i = c + paddingLeft;
                    if (z) {
                        d = c2.c(view);
                    } else {
                        d = c2.d(view);
                    }
                    i2 = d + paddingTop;
                    i3 = paddingLeft;
                }
                a(view, i3, paddingTop, i, i2, eVar);
            }
            i2 = i4 + measuredHeight;
            int i7 = e;
            paddingTop = paddingTop2;
            i3 = measuredWidth;
            i = i7;
            a(view, i3, paddingTop, i, i2, eVar);
        }
    }

    /* loaded from: classes2.dex */
    public static class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private e f25618a;
        private View b;

        static {
            kge.a(-85387234);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            }
        }

        private a() {
        }

        public void a(e eVar, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e70011c9", new Object[]{this, eVar, view});
                return;
            }
            this.f25618a = eVar;
            this.b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            } else {
                this.b.setVisibility(0);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f25619a;
        private RecyclerView.Recycler b;
        private e c;
        private View d;
        private Runnable e;

        static {
            kge.a(-1638649840);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }

        private b() {
        }

        public void a(RecyclerView.Recycler recycler, e eVar, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d70c03a", new Object[]{this, recycler, eVar, view});
                return;
            }
            this.f25619a = true;
            this.b = recycler;
            this.c = eVar;
            this.d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            this.c.c(this.d);
            this.b.recycleView(this.d);
            this.f25619a = false;
            Runnable runnable = this.e;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.e = null;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f25619a;
        }

        public void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            } else {
                this.e = runnable;
            }
        }
    }
}
