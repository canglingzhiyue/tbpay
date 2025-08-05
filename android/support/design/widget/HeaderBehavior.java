package android.support.design.widget;

import android.content.Context;
import android.support.v4.math.MathUtils;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;

/* loaded from: classes2.dex */
abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: a  reason: collision with root package name */
    OverScroller f1180a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private VelocityTracker f;
    private Runnable mFlingRunnable;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        private final CoordinatorLayout b;
        private final V c;

        a(CoordinatorLayout coordinatorLayout, V v) {
            this.b = coordinatorLayout;
            this.c = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c == null || HeaderBehavior.this.f1180a == null) {
                return;
            }
            if (!HeaderBehavior.this.f1180a.computeScrollOffset()) {
                HeaderBehavior.this.a(this.b, this.c);
                return;
            }
            HeaderBehavior headerBehavior = HeaderBehavior.this;
            headerBehavior.a_(this.b, this.c, headerBehavior.f1180a.getCurrY());
            ViewCompat.postOnAnimation(this.c, this);
        }
    }

    public HeaderBehavior() {
        this.c = -1;
        this.e = -1;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = -1;
        this.e = -1;
    }

    private void c() {
        if (this.f == null) {
            this.f = VelocityTracker.obtain();
        }
    }

    int a() {
        return b();
    }

    int a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int clamp;
        int b = b();
        if (i2 == 0 || b < i2 || b > i3 || b == (clamp = MathUtils.clamp(i, i2, i3))) {
            return 0;
        }
        a(clamp);
        return b - clamp;
    }

    int a(V v) {
        return v.getHeight();
    }

    void a(CoordinatorLayout coordinatorLayout, V v) {
    }

    final boolean a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        Runnable runnable = this.mFlingRunnable;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.mFlingRunnable = null;
        }
        if (this.f1180a == null) {
            this.f1180a = new OverScroller(v.getContext());
        }
        this.f1180a.fling(0, b(), 0, Math.round(f), 0, 0, i, i2);
        if (!this.f1180a.computeScrollOffset()) {
            a(coordinatorLayout, v);
            return false;
        }
        this.mFlingRunnable = new a(coordinatorLayout, v);
        ViewCompat.postOnAnimation(v, this.mFlingRunnable);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        return a(coordinatorLayout, (CoordinatorLayout) v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return a(coordinatorLayout, (CoordinatorLayout) v, a() - i, i2, i3);
    }

    int b(V v) {
        return -v.getHeight();
    }

    boolean c(V v) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r0 != 3) goto L17;
     */
    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.support.design.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.e
            if (r0 >= 0) goto L12
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.e = r0
        L12:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L1f
            boolean r0 = r4.b
            if (r0 == 0) goto L1f
            return r2
        L1f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L5e
            r5 = -1
            if (r0 == r2) goto L4f
            if (r0 == r1) goto L2f
            r6 = 3
            if (r0 == r6) goto L4f
            goto L81
        L2f:
            int r6 = r4.c
            if (r6 == r5) goto L81
            int r6 = r7.findPointerIndex(r6)
            if (r6 == r5) goto L81
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.d
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.e
            if (r6 <= r0) goto L81
            r4.b = r2
            r4.d = r5
            goto L81
        L4f:
            r4.b = r3
            r4.c = r5
            android.view.VelocityTracker r5 = r4.f
            if (r5 == 0) goto L81
            r5.recycle()
            r5 = 0
            r4.f = r5
            goto L81
        L5e:
            r4.b = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.c(r6)
            if (r2 == 0) goto L81
            boolean r5 = r5.isPointInChildBounds(r6, r0, r1)
            if (r5 == 0) goto L81
            r4.d = r1
            int r5 = r7.getPointerId(r3)
            r4.c = r5
            r4.c()
        L81:
            android.view.VelocityTracker r5 = r4.f
            if (r5 == 0) goto L88
            r5.addMovement(r7)
        L88:
            boolean r5 = r4.b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.HeaderBehavior.onInterceptTouchEvent(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r0 != 3) goto L15;
     */
    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.support.design.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r11.e
            if (r0 >= 0) goto L12
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.e = r0
        L12:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8d
            r3 = -1
            if (r0 == r1) goto L5c
            r4 = 2
            if (r0 == r4) goto L25
            r12 = 3
            if (r0 == r12) goto L7e
            goto Lae
        L25:
            int r0 = r11.c
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L2e
            return r2
        L2e:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r2 = r11.d
            int r2 = r2 - r0
            boolean r3 = r11.b
            if (r3 != 0) goto L49
            int r3 = java.lang.Math.abs(r2)
            int r4 = r11.e
            if (r3 <= r4) goto L49
            r11.b = r1
            if (r2 <= 0) goto L48
            int r2 = r2 - r4
            goto L49
        L48:
            int r2 = r2 + r4
        L49:
            r6 = r2
            boolean r2 = r11.b
            if (r2 == 0) goto Lae
            r11.d = r0
            int r7 = r11.b(r13)
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.b(r4, r5, r6, r7, r8)
            goto Lae
        L5c:
            android.view.VelocityTracker r0 = r11.f
            if (r0 == 0) goto L7e
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f
            int r4 = r11.c
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.a(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.a(r6, r7, r8, r9, r10)
        L7e:
            r11.b = r2
            r11.c = r3
            android.view.VelocityTracker r12 = r11.f
            if (r12 == 0) goto Lae
            r12.recycle()
            r12 = 0
            r11.f = r12
            goto Lae
        L8d:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r12 = r12.isPointInChildBounds(r13, r0, r3)
            if (r12 == 0) goto Lb6
            boolean r12 = r11.c(r13)
            if (r12 == 0) goto Lb6
            r11.d = r3
            int r12 = r14.getPointerId(r2)
            r11.c = r12
            r11.c()
        Lae:
            android.view.VelocityTracker r12 = r11.f
            if (r12 == 0) goto Lb5
            r12.addMovement(r14)
        Lb5:
            return r1
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.HeaderBehavior.onTouchEvent(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
