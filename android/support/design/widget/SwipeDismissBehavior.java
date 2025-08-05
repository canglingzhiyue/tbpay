package android.support.design.widget;

import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;

    /* renamed from: a  reason: collision with root package name */
    private boolean f1185a;
    ViewDragHelper b;
    a c;
    private boolean i;
    private float h = 0.0f;
    int d = 2;
    float e = 0.5f;
    float f = 0.0f;
    float g = 0.5f;
    private final ViewDragHelper.Callback j = new ViewDragHelper.Callback() { // from class: android.support.design.widget.SwipeDismissBehavior.1
        private int b;
        private int c = -1;

        private boolean a(View view, float f) {
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i == 0) {
                return Math.abs(view.getLeft() - this.b) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.e);
            }
            boolean z = ViewCompat.getLayoutDirection(view) == 1;
            if (SwipeDismissBehavior.this.d == 2) {
                return true;
            }
            if (SwipeDismissBehavior.this.d == 0) {
                return z ? f < 0.0f : i > 0;
            }
            if (SwipeDismissBehavior.this.d == 1) {
                if (z) {
                    return i > 0;
                } else if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
            r5 = r2.b;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
            if (r5 != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
            if (r5 != false) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
            r5 = r2.b - r3.getWidth();
            r3 = r2.b;
         */
        @Override // android.support.v4.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int clampViewPositionHorizontal(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = android.support.v4.view.ViewCompat.getLayoutDirection(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = 1
                goto La
            L9:
                r5 = 0
            La:
                android.support.design.widget.SwipeDismissBehavior r1 = android.support.design.widget.SwipeDismissBehavior.this
                int r1 = r1.d
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.b
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.b
                goto L3b
            L1c:
                int r5 = r2.b
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L3b
            L24:
                android.support.design.widget.SwipeDismissBehavior r1 = android.support.design.widget.SwipeDismissBehavior.this
                int r1 = r1.d
                if (r1 != r0) goto L2d
                if (r5 == 0) goto L12
                goto L1c
            L2d:
                int r5 = r2.b
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.b
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L3b:
                int r3 = android.support.design.widget.SwipeDismissBehavior.a(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior.AnonymousClass1.clampViewPositionHorizontal(android.view.View, int, int):int");
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i) {
            this.c = i;
            this.b = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            if (SwipeDismissBehavior.this.c != null) {
                SwipeDismissBehavior.this.c.a(i);
            }
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            float width = this.b + (view.getWidth() * SwipeDismissBehavior.this.f);
            float width2 = this.b + (view.getWidth() * SwipeDismissBehavior.this.g);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.a(0.0f, 1.0f - SwipeDismissBehavior.b(width, width2, f), 1.0f));
            }
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            int i;
            boolean z;
            this.c = -1;
            int width = view.getWidth();
            if (a(view, f)) {
                int left = view.getLeft();
                int i2 = this.b;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.b;
                z = false;
            }
            if (SwipeDismissBehavior.this.b.settleCapturedViewAt(i, view.getTop())) {
                ViewCompat.postOnAnimation(view, new b(view, z));
            } else if (!z || SwipeDismissBehavior.this.c == null) {
            } else {
                SwipeDismissBehavior.this.c.a(view);
            }
        }

        @Override // android.support.v4.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            return this.c == -1 && SwipeDismissBehavior.this.a(view);
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    private @interface SwipeDirection {
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a(int i);

        void a(View view);
    }

    /* loaded from: classes2.dex */
    private class b implements Runnable {
        private final View b;
        private final boolean c;

        b(View view, boolean z) {
            this.b = view;
            this.c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SwipeDismissBehavior.this.b != null && SwipeDismissBehavior.this.b.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.b, this);
            } else if (!this.c || SwipeDismissBehavior.this.c == null) {
            } else {
                SwipeDismissBehavior.this.c.a(this.b);
            }
        }
    }

    static float a(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    static int a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    private void a(ViewGroup viewGroup) {
        if (this.b == null) {
            this.b = this.i ? ViewDragHelper.create(viewGroup, this.h, this.j) : ViewDragHelper.create(viewGroup, this.j);
        }
    }

    static float b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    public void a(float f) {
        this.f = a(0.0f, f, 1.0f);
    }

    public void a(int i) {
        this.d = i;
    }

    public void a(a aVar) {
        this.c = aVar;
    }

    public boolean a(View view) {
        return true;
    }

    public void b(float f) {
        this.g = a(0.0f, f, 1.0f);
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f1185a;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1185a = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            z = this.f1185a;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1185a = false;
        }
        if (z) {
            a((ViewGroup) coordinatorLayout);
            return this.b.shouldInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.support.design.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper = this.b;
        if (viewDragHelper != null) {
            viewDragHelper.processTouchEvent(motionEvent);
            return true;
        }
        return false;
    }
}
