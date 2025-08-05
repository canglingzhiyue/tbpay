package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.math.MathUtils;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;

    /* renamed from: a  reason: collision with root package name */
    int f1165a;
    int b;
    boolean c;
    int d;
    ViewDragHelper e;
    int f;
    WeakReference<V> g;
    WeakReference<View> h;
    int i;
    boolean j;
    private float k;
    private int l;
    private boolean m;
    private int n;
    private boolean o;
    private boolean p;
    private int q;
    private boolean r;
    private a s;
    private VelocityTracker t;
    private int u;
    private final ViewDragHelper.Callback v;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.design.widget.BottomSheetBehavior.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        final int state;

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }

        @Override // android.support.v4.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface State {
    }

    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract void a(View view, float f);

        public abstract void a(View view, int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        private final View b;
        private final int c;

        b(View view, int i) {
            this.b = view;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BottomSheetBehavior.this.e == null || !BottomSheetBehavior.this.e.continueSettling(true)) {
                BottomSheetBehavior.this.c(this.c);
            } else {
                ViewCompat.postOnAnimation(this.b, this);
            }
        }
    }

    public BottomSheetBehavior() {
        this.d = 4;
        this.v = new ViewDragHelper.Callback() { // from class: android.support.design.widget.BottomSheetBehavior.2
            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i, int i2) {
                return MathUtils.clamp(i, BottomSheetBehavior.this.f1165a, BottomSheetBehavior.this.c ? BottomSheetBehavior.this.f : BottomSheetBehavior.this.b);
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(View view) {
                return (BottomSheetBehavior.this.c ? BottomSheetBehavior.this.f : BottomSheetBehavior.this.b) - BottomSheetBehavior.this.f1165a;
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                if (i == 1) {
                    BottomSheetBehavior.this.c(1);
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                BottomSheetBehavior.this.d(i2);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
                if (java.lang.Math.abs(r6 - r3.f1167a.f1165a) < java.lang.Math.abs(r6 - r3.f1167a.b)) goto L3;
             */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
            @Override // android.support.v4.widget.ViewDragHelper.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onViewReleased(android.view.View r4, float r5, float r6) {
                /*
                    r3 = this;
                    r5 = 4
                    r0 = 3
                    r1 = 0
                    int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                    if (r2 >= 0) goto Lc
                L7:
                    android.support.design.widget.BottomSheetBehavior r5 = android.support.design.widget.BottomSheetBehavior.this
                    int r5 = r5.f1165a
                    goto L45
                Lc:
                    android.support.design.widget.BottomSheetBehavior r2 = android.support.design.widget.BottomSheetBehavior.this
                    boolean r2 = r2.c
                    if (r2 == 0) goto L21
                    android.support.design.widget.BottomSheetBehavior r2 = android.support.design.widget.BottomSheetBehavior.this
                    boolean r2 = r2.a(r4, r6)
                    if (r2 == 0) goto L21
                    android.support.design.widget.BottomSheetBehavior r5 = android.support.design.widget.BottomSheetBehavior.this
                    int r5 = r5.f
                    r6 = 5
                    r0 = 5
                    goto L45
                L21:
                    int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                    if (r6 != 0) goto L3f
                    int r6 = r4.getTop()
                    android.support.design.widget.BottomSheetBehavior r1 = android.support.design.widget.BottomSheetBehavior.this
                    int r1 = r1.f1165a
                    int r1 = r6 - r1
                    int r1 = java.lang.Math.abs(r1)
                    android.support.design.widget.BottomSheetBehavior r2 = android.support.design.widget.BottomSheetBehavior.this
                    int r2 = r2.b
                    int r6 = r6 - r2
                    int r6 = java.lang.Math.abs(r6)
                    if (r1 >= r6) goto L3f
                    goto L7
                L3f:
                    android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                    int r6 = r6.b
                    r5 = r6
                    r0 = 4
                L45:
                    android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                    android.support.v4.widget.ViewDragHelper r6 = r6.e
                    int r1 = r4.getLeft()
                    boolean r5 = r6.settleCapturedViewAt(r1, r5)
                    if (r5 == 0) goto L64
                    android.support.design.widget.BottomSheetBehavior r5 = android.support.design.widget.BottomSheetBehavior.this
                    r6 = 2
                    r5.c(r6)
                    android.support.design.widget.BottomSheetBehavior$b r5 = new android.support.design.widget.BottomSheetBehavior$b
                    android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                    r5.<init>(r4, r0)
                    android.support.v4.view.ViewCompat.postOnAnimation(r4, r5)
                    return
                L64:
                    android.support.design.widget.BottomSheetBehavior r4 = android.support.design.widget.BottomSheetBehavior.this
                    r4.c(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.AnonymousClass2.onViewReleased(android.view.View, float, float):void");
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                View view2;
                if (BottomSheetBehavior.this.d != 1 && !BottomSheetBehavior.this.j) {
                    return (BottomSheetBehavior.this.d != 3 || BottomSheetBehavior.this.i != i || (view2 = BottomSheetBehavior.this.h.get()) == null || !view2.canScrollVertically(-1)) && BottomSheetBehavior.this.g != null && BottomSheetBehavior.this.g.get() == view;
                }
                return false;
            }
        };
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 4;
        this.v = new ViewDragHelper.Callback() { // from class: android.support.design.widget.BottomSheetBehavior.2
            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i, int i2) {
                return MathUtils.clamp(i, BottomSheetBehavior.this.f1165a, BottomSheetBehavior.this.c ? BottomSheetBehavior.this.f : BottomSheetBehavior.this.b);
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int getViewVerticalDragRange(View view) {
                return (BottomSheetBehavior.this.c ? BottomSheetBehavior.this.f : BottomSheetBehavior.this.b) - BottomSheetBehavior.this.f1165a;
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                if (i == 1) {
                    BottomSheetBehavior.this.c(1);
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                BottomSheetBehavior.this.d(i2);
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onViewReleased(android.view.View r4, float r5, float r6) {
                /*
                    r3 = this;
                    r5 = 4
                    r0 = 3
                    r1 = 0
                    int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                    if (r2 >= 0) goto Lc
                L7:
                    android.support.design.widget.BottomSheetBehavior r5 = android.support.design.widget.BottomSheetBehavior.this
                    int r5 = r5.f1165a
                    goto L45
                Lc:
                    android.support.design.widget.BottomSheetBehavior r2 = android.support.design.widget.BottomSheetBehavior.this
                    boolean r2 = r2.c
                    if (r2 == 0) goto L21
                    android.support.design.widget.BottomSheetBehavior r2 = android.support.design.widget.BottomSheetBehavior.this
                    boolean r2 = r2.a(r4, r6)
                    if (r2 == 0) goto L21
                    android.support.design.widget.BottomSheetBehavior r5 = android.support.design.widget.BottomSheetBehavior.this
                    int r5 = r5.f
                    r6 = 5
                    r0 = 5
                    goto L45
                L21:
                    int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                    if (r6 != 0) goto L3f
                    int r6 = r4.getTop()
                    android.support.design.widget.BottomSheetBehavior r1 = android.support.design.widget.BottomSheetBehavior.this
                    int r1 = r1.f1165a
                    int r1 = r6 - r1
                    int r1 = java.lang.Math.abs(r1)
                    android.support.design.widget.BottomSheetBehavior r2 = android.support.design.widget.BottomSheetBehavior.this
                    int r2 = r2.b
                    int r6 = r6 - r2
                    int r6 = java.lang.Math.abs(r6)
                    if (r1 >= r6) goto L3f
                    goto L7
                L3f:
                    android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                    int r6 = r6.b
                    r5 = r6
                    r0 = 4
                L45:
                    android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                    android.support.v4.widget.ViewDragHelper r6 = r6.e
                    int r1 = r4.getLeft()
                    boolean r5 = r6.settleCapturedViewAt(r1, r5)
                    if (r5 == 0) goto L64
                    android.support.design.widget.BottomSheetBehavior r5 = android.support.design.widget.BottomSheetBehavior.this
                    r6 = 2
                    r5.c(r6)
                    android.support.design.widget.BottomSheetBehavior$b r5 = new android.support.design.widget.BottomSheetBehavior$b
                    android.support.design.widget.BottomSheetBehavior r6 = android.support.design.widget.BottomSheetBehavior.this
                    r5.<init>(r4, r0)
                    android.support.v4.view.ViewCompat.postOnAnimation(r4, r5)
                    return
                L64:
                    android.support.design.widget.BottomSheetBehavior r4 = android.support.design.widget.BottomSheetBehavior.this
                    r4.c(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.AnonymousClass2.onViewReleased(android.view.View, float, float):void");
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                View view2;
                if (BottomSheetBehavior.this.d != 1 && !BottomSheetBehavior.this.j) {
                    return (BottomSheetBehavior.this.d != 3 || BottomSheetBehavior.this.i != i || (view2 = BottomSheetBehavior.this.h.get()) == null || !view2.canScrollVertically(-1)) && BottomSheetBehavior.this.g != null && BottomSheetBehavior.this.g.get() == view;
                }
                return false;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        a((peekValue == null || peekValue.data != -1) ? obtainStyledAttributes.getDimensionPixelSize(R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight, -1) : peekValue.data);
        a(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        b(obtainStyledAttributes.getBoolean(R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.k = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static <V extends View> BottomSheetBehavior<V> b(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.b) {
            CoordinatorLayout.Behavior b2 = ((CoordinatorLayout.b) layoutParams).b();
            if (!(b2 instanceof BottomSheetBehavior)) {
                throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
            }
            return (BottomSheetBehavior) b2;
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private void b() {
        this.i = -1;
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    private float c() {
        this.t.computeCurrentVelocity(1000, this.k);
        return this.t.getYVelocity(this.i);
    }

    public final int a() {
        if (this.m) {
            return -1;
        }
        return this.l;
    }

    View a(View view) {
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View a2 = a(viewGroup.getChildAt(i));
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public final void a(int i) {
        WeakReference<V> weakReference;
        V v;
        boolean z = true;
        if (i == -1) {
            if (!this.m) {
                this.m = true;
            }
            z = false;
        } else {
            if (this.m || this.l != i) {
                this.m = false;
                this.l = Math.max(0, i);
                this.b = this.f - i;
            }
            z = false;
        }
        if (!z || this.d != 4 || (weakReference = this.g) == null || (v = weakReference.get()) == null) {
            return;
        }
        v.requestLayout();
    }

    public void a(a aVar) {
        this.s = aVar;
    }

    void a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.b;
        } else if (i == 3) {
            i2 = this.f1165a;
        } else if (!this.c || i != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + i);
        } else {
            i2 = this.f;
        }
        if (!this.e.smoothSlideViewTo(view, view.getLeft(), i2)) {
            c(i);
            return;
        }
        c(2);
        ViewCompat.postOnAnimation(view, new b(view, i));
    }

    public void a(boolean z) {
        this.c = z;
    }

    boolean a(View view, float f) {
        if (this.o) {
            return true;
        }
        return view.getTop() >= this.b && Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.b)) / ((float) this.l) > 0.5f;
    }

    public final void b(final int i) {
        if (i == this.d) {
            return;
        }
        WeakReference<V> weakReference = this.g;
        if (weakReference == null) {
            if (i != 4 && i != 3 && (!this.c || i != 5)) {
                return;
            }
            this.d = i;
            return;
        }
        final V v = weakReference.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent == null || !parent.isLayoutRequested() || !ViewCompat.isAttachedToWindow(v)) {
            a((View) v, i);
        } else {
            v.post(new Runnable() { // from class: android.support.design.widget.BottomSheetBehavior.1
                @Override // java.lang.Runnable
                public void run() {
                    BottomSheetBehavior.this.a(v, i);
                }
            });
        }
    }

    public void b(boolean z) {
        this.o = z;
    }

    void c(int i) {
        a aVar;
        if (this.d == i) {
            return;
        }
        this.d = i;
        V v = this.g.get();
        if (v == null || (aVar = this.s) == null) {
            return;
        }
        aVar.a((View) v, i);
    }

    public final int d() {
        return this.d;
    }

    void d(int i) {
        a aVar;
        V v = this.g.get();
        if (v == null || (aVar = this.s) == null) {
            return;
        }
        int i2 = this.b;
        if (i > i2) {
            aVar.a(v, (i2 - i) / (this.f - i2));
        } else {
            aVar.a(v, (i2 - i) / (i2 - this.f1165a));
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            this.p = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            b();
        }
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
        this.t.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.u = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.h;
            View view = weakReference != null ? weakReference.get() : null;
            if (view != null && coordinatorLayout.isPointInChildBounds(view, x, this.u)) {
                this.i = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.j = true;
            }
            this.p = this.i == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.u);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.j = false;
            this.i = -1;
            if (this.p) {
                this.p = false;
                return false;
            }
        }
        if (!this.p && this.e.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        View view2 = this.h.get();
        return actionMasked == 2 && view2 != null && !this.p && this.d != 1 && !coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) && Math.abs(((float) this.u) - motionEvent.getY()) > ((float) this.e.getTouchSlop());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onLayoutChild(android.support.design.widget.CoordinatorLayout r6, V r7, int r8) {
        /*
            r5 = this;
            boolean r0 = android.support.v4.view.ViewCompat.getFitsSystemWindows(r6)
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = android.support.v4.view.ViewCompat.getFitsSystemWindows(r7)
            if (r0 != 0) goto L10
            android.support.v4.view.ViewCompat.setFitsSystemWindows(r7, r1)
        L10:
            int r0 = r7.getTop()
            r6.onLayoutChild(r7, r8)
            int r8 = r6.getHeight()
            r5.f = r8
            boolean r8 = r5.m
            if (r8 == 0) goto L43
            int r8 = r5.n
            if (r8 != 0) goto L31
            android.content.res.Resources r8 = r6.getResources()
            int r2 = com.taobao.taobao.R.dimen.design_bottom_sheet_peek_height_min
            int r8 = r8.getDimensionPixelSize(r2)
            r5.n = r8
        L31:
            int r8 = r5.n
            int r2 = r5.f
            int r3 = r6.getWidth()
            int r3 = r3 * 9
            int r3 = r3 / 16
            int r2 = r2 - r3
            int r8 = java.lang.Math.max(r8, r2)
            goto L45
        L43:
            int r8 = r5.l
        L45:
            r2 = 0
            int r3 = r5.f
            int r4 = r7.getHeight()
            int r3 = r3 - r4
            int r2 = java.lang.Math.max(r2, r3)
            r5.f1165a = r2
            int r2 = r5.f
            int r2 = r2 - r8
            int r8 = r5.f1165a
            int r8 = java.lang.Math.max(r2, r8)
            r5.b = r8
            int r8 = r5.d
            r2 = 3
            if (r8 != r2) goto L69
            int r8 = r5.f1165a
        L65:
            android.support.v4.view.ViewCompat.offsetTopAndBottom(r7, r8)
            goto L88
        L69:
            boolean r2 = r5.c
            if (r2 == 0) goto L73
            r2 = 5
            if (r8 != r2) goto L73
            int r8 = r5.f
            goto L65
        L73:
            int r8 = r5.d
            r2 = 4
            if (r8 != r2) goto L7b
            int r8 = r5.b
            goto L65
        L7b:
            if (r8 == r1) goto L80
            r2 = 2
            if (r8 != r2) goto L88
        L80:
            int r8 = r7.getTop()
            int r0 = r0 - r8
            android.support.v4.view.ViewCompat.offsetTopAndBottom(r7, r0)
        L88:
            android.support.v4.widget.ViewDragHelper r8 = r5.e
            if (r8 != 0) goto L94
            android.support.v4.widget.ViewDragHelper$Callback r8 = r5.v
            android.support.v4.widget.ViewDragHelper r6 = android.support.v4.widget.ViewDragHelper.create(r6, r8)
            r5.e = r6
        L94:
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r7)
            r5.g = r6
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            android.view.View r7 = r5.a(r7)
            r6.<init>(r7)
            r5.h = r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.onLayoutChild(android.support.design.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        if (view == this.h.get()) {
            return this.d != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2);
        }
        return false;
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        int i3;
        if (view != this.h.get()) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            int i5 = this.f1165a;
            if (i4 < i5) {
                iArr[1] = top - i5;
                ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                i3 = 3;
                c(i3);
            } else {
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(v, -i2);
                c(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.b;
            if (i4 <= i6 || this.c) {
                iArr[1] = i2;
                ViewCompat.offsetTopAndBottom(v, -i2);
                c(1);
            } else {
                iArr[1] = top - i6;
                ViewCompat.offsetTopAndBottom(v, -iArr[1]);
                i3 = 4;
                c(i3);
            }
        }
        d(v.getTop());
        this.q = i2;
        this.r = true;
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        this.d = (savedState.state == 1 || savedState.state == 2) ? 4 : savedState.state;
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), this.d);
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        this.q = 0;
        this.r = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        if (java.lang.Math.abs(r4 - r3.f1165a) < java.lang.Math.abs(r4 - r3.b)) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStopNestedScroll(android.support.design.widget.CoordinatorLayout r4, V r5, android.view.View r6) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r0 = r3.f1165a
            r1 = 3
            if (r4 != r0) goto Ld
            r3.c(r1)
            return
        Ld:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.h
            if (r4 == 0) goto L72
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L72
            boolean r4 = r3.r
            if (r4 != 0) goto L1c
            goto L72
        L1c:
            int r4 = r3.q
            r6 = 4
            if (r4 <= 0) goto L24
        L21:
            int r4 = r3.f1165a
            goto L53
        L24:
            boolean r4 = r3.c
            if (r4 == 0) goto L36
            float r4 = r3.c()
            boolean r4 = r3.a(r5, r4)
            if (r4 == 0) goto L36
            int r4 = r3.f
            r1 = 5
            goto L53
        L36:
            int r4 = r3.q
            if (r4 != 0) goto L50
            int r4 = r5.getTop()
            int r0 = r3.f1165a
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r2 = r3.b
            int r4 = r4 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L50
            goto L21
        L50:
            int r4 = r3.b
            r1 = 4
        L53:
            android.support.v4.widget.ViewDragHelper r6 = r3.e
            int r0 = r5.getLeft()
            boolean r4 = r6.smoothSlideViewTo(r5, r0, r4)
            if (r4 == 0) goto L6c
            r4 = 2
            r3.c(r4)
            android.support.design.widget.BottomSheetBehavior$b r4 = new android.support.design.widget.BottomSheetBehavior$b
            r4.<init>(r5, r1)
            android.support.v4.view.ViewCompat.postOnAnimation(r5, r4)
            goto L6f
        L6c:
            r3.c(r1)
        L6f:
            r4 = 0
            r3.r = r4
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.BottomSheetBehavior.onStopNestedScroll(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.View):void");
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.d == 1 && actionMasked == 0) {
            return true;
        }
        this.e.processTouchEvent(motionEvent);
        if (actionMasked == 0) {
            b();
        }
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
        this.t.addMovement(motionEvent);
        if (actionMasked == 2 && !this.p && Math.abs(this.u - motionEvent.getY()) > this.e.getTouchSlop()) {
            this.e.captureChildView(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.p;
    }
}
