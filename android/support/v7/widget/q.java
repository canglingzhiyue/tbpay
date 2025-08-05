package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class q extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {
    private static final int[] g = {16842919};
    private static final int[] h = new int[0];

    /* renamed from: a  reason: collision with root package name */
    int f1498a;
    int b;
    float c;
    int d;
    int e;
    float f;
    private final int i;
    private final int j;
    private final StateListDrawable k;
    private final Drawable l;
    private final int m;
    private final int n;
    private final StateListDrawable o;
    private final Drawable p;
    private final int q;
    private final int r;
    private RecyclerView u;
    private int s = 0;
    private int t = 0;
    private boolean v = false;
    private boolean w = false;
    private int x = 0;
    private int y = 0;
    private final int[] z = new int[2];
    private final int[] A = new int[2];
    private final ValueAnimator B = ValueAnimator.ofFloat(0.0f, 1.0f);
    private int C = 0;
    private final Runnable D = new Runnable() { // from class: android.support.v7.widget.q.1
        @Override // java.lang.Runnable
        public void run() {
            q.this.a(500);
        }
    };
    private final RecyclerView.OnScrollListener E = new RecyclerView.OnScrollListener() { // from class: android.support.v7.widget.q.2
        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            q.this.a(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    };

    /* loaded from: classes2.dex */
    private class a extends AnimatorListenerAdapter {
        private boolean b;

        private a() {
            this.b = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.b) {
                this.b = false;
            } else if (((Float) q.this.B.getAnimatedValue()).floatValue() == 0.0f) {
                q.this.C = 0;
                q.this.b(0);
            } else {
                q.this.C = 2;
                q.this.d();
            }
        }
    }

    /* loaded from: classes2.dex */
    private class b implements ValueAnimator.AnimatorUpdateListener {
        private b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            q.this.k.setAlpha(floatValue);
            q.this.l.setAlpha(floatValue);
            q.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.k = stateListDrawable;
        this.l = drawable;
        this.o = stateListDrawable2;
        this.p = drawable2;
        this.m = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.n = Math.max(i, drawable.getIntrinsicWidth());
        this.q = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.r = Math.max(i, drawable2.getIntrinsicWidth());
        this.i = i2;
        this.j = i3;
        this.k.setAlpha(255);
        this.l.setAlpha(255);
        this.B.addListener(new a());
        this.B.addUpdateListener(new b());
        a(recyclerView);
    }

    private int a(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 < i5 && i7 >= 0) {
            return i6;
        }
        return 0;
    }

    private void a(float f) {
        int[] g2 = g();
        float max = Math.max(g2[0], Math.min(g2[1], f));
        if (Math.abs(this.b - max) < 2.0f) {
            return;
        }
        int a2 = a(this.c, max, g2, this.u.computeVerticalScrollRange(), this.u.computeVerticalScrollOffset(), this.t);
        if (a2 != 0) {
            this.u.scrollBy(0, a2);
        }
        this.c = max;
    }

    private void a(Canvas canvas) {
        int i = this.s;
        int i2 = this.m;
        int i3 = i - i2;
        int i4 = this.b;
        int i5 = this.f1498a;
        int i6 = i4 - (i5 / 2);
        this.k.setBounds(0, 0, i2, i5);
        this.l.setBounds(0, 0, this.n, this.t);
        if (e()) {
            this.l.draw(canvas);
            canvas.translate(this.m, i6);
            canvas.scale(-1.0f, 1.0f);
            this.k.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.m;
        } else {
            canvas.translate(i3, 0.0f);
            this.l.draw(canvas);
            canvas.translate(0.0f, i6);
            this.k.draw(canvas);
        }
        canvas.translate(-i3, -i6);
    }

    private void b() {
        this.u.addItemDecoration(this);
        this.u.addOnItemTouchListener(this);
        this.u.addOnScrollListener(this.E);
    }

    private void b(float f) {
        int[] h2 = h();
        float max = Math.max(h2[0], Math.min(h2[1], f));
        if (Math.abs(this.e - max) < 2.0f) {
            return;
        }
        int a2 = a(this.f, max, h2, this.u.computeHorizontalScrollRange(), this.u.computeHorizontalScrollOffset(), this.s);
        if (a2 != 0) {
            this.u.scrollBy(a2, 0);
        }
        this.f = max;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        int i2;
        if (i == 2 && this.x != 2) {
            this.k.setState(g);
            f();
        }
        if (i == 0) {
            d();
        } else {
            a();
        }
        if (this.x != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.x = i;
        }
        this.k.setState(h);
        i2 = 1200;
        c(i2);
        this.x = i;
    }

    private void b(Canvas canvas) {
        int i = this.t;
        int i2 = this.q;
        int i3 = i - i2;
        int i4 = this.e;
        int i5 = this.d;
        int i6 = i4 - (i5 / 2);
        this.o.setBounds(0, 0, i5, i2);
        this.p.setBounds(0, 0, this.s, this.r);
        canvas.translate(0.0f, i3);
        this.p.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.o.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    private void c() {
        this.u.removeItemDecoration(this);
        this.u.removeOnItemTouchListener(this);
        this.u.removeOnScrollListener(this.E);
        f();
    }

    private void c(int i) {
        f();
        this.u.postDelayed(this.D, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.u.invalidate();
    }

    private boolean e() {
        return ViewCompat.getLayoutDirection(this.u) == 1;
    }

    private void f() {
        this.u.removeCallbacks(this.D);
    }

    private int[] g() {
        int[] iArr = this.z;
        int i = this.j;
        iArr[0] = i;
        iArr[1] = this.t - i;
        return iArr;
    }

    private int[] h() {
        int[] iArr = this.A;
        int i = this.j;
        iArr[0] = i;
        iArr[1] = this.s - i;
        return iArr;
    }

    public void a() {
        int i = this.C;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.B.cancel();
        }
        this.C = 1;
        ValueAnimator valueAnimator = this.B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.B.setDuration(500L);
        this.B.setStartDelay(0L);
        this.B.start();
    }

    void a(int i) {
        int i2 = this.C;
        if (i2 == 1) {
            this.B.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.C = 3;
        ValueAnimator valueAnimator = this.B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.B.setDuration(i);
        this.B.start();
    }

    void a(int i, int i2) {
        int computeVerticalScrollRange = this.u.computeVerticalScrollRange();
        int i3 = this.t;
        this.v = computeVerticalScrollRange - i3 > 0 && i3 >= this.i;
        int computeHorizontalScrollRange = this.u.computeHorizontalScrollRange();
        int i4 = this.s;
        this.w = computeHorizontalScrollRange - i4 > 0 && i4 >= this.i;
        if (!this.v && !this.w) {
            if (this.x == 0) {
                return;
            }
            b(0);
            return;
        }
        if (this.v) {
            float f = i3;
            this.b = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
            this.f1498a = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.w) {
            float f2 = i4;
            this.e = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
            this.d = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.x;
        if (i5 != 0 && i5 != 1) {
            return;
        }
        b(1);
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.u;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            c();
        }
        this.u = recyclerView;
        if (this.u == null) {
            return;
        }
        b();
    }

    boolean a(float f, float f2) {
        if (e()) {
            if (f > this.m / 2) {
                return false;
            }
        } else if (f < this.s - this.m) {
            return false;
        }
        int i = this.b;
        int i2 = this.f1498a;
        return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
    }

    boolean b(float f, float f2) {
        if (f2 >= this.t - this.q) {
            int i = this.e;
            int i2 = this.d;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.s != this.u.getWidth() || this.t != this.u.getHeight()) {
            this.s = this.u.getWidth();
            this.t = this.u.getHeight();
            b(0);
        } else if (this.C == 0) {
        } else {
            if (this.v) {
                a(canvas);
            }
            if (!this.w) {
                return;
            }
            b(canvas);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.x;
        if (i == 1) {
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!a2 && !b2) {
                return false;
            }
            if (b2) {
                this.y = 1;
                this.f = (int) motionEvent.getX();
            } else if (a2) {
                this.y = 2;
                this.c = (int) motionEvent.getY();
            }
            b(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // android.support.v7.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.x == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            if (!a2 && !b2) {
                return;
            }
            if (b2) {
                this.y = 1;
                this.f = (int) motionEvent.getX();
            } else if (a2) {
                this.y = 2;
                this.c = (int) motionEvent.getY();
            }
            b(2);
        } else if (motionEvent.getAction() == 1 && this.x == 2) {
            this.c = 0.0f;
            this.f = 0.0f;
            b(1);
            this.y = 0;
        } else if (motionEvent.getAction() != 2 || this.x != 2) {
        } else {
            a();
            if (this.y == 1) {
                b(motionEvent.getX());
            }
            if (this.y != 2) {
                return;
            }
            a(motionEvent.getY());
        }
    }
}
