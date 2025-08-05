package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.design.widget.BaseTransientBottomBar;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.design.widget.l;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;

    /* renamed from: a  reason: collision with root package name */
    static final Handler f1150a;
    private static final boolean d;
    final SnackbarBaseLayout b;
    final l.a c = new l.a() { // from class: android.support.design.widget.BaseTransientBottomBar.6
        @Override // android.support.design.widget.l.a
        public void a() {
            Handler handler = BaseTransientBottomBar.f1150a;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // android.support.design.widget.l.a
        public void a(int i) {
            Handler handler = BaseTransientBottomBar.f1150a;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    };
    private final ViewGroup e;
    private final Context f;
    private final b g;
    private int h;
    private List<BaseCallback<B>> i;
    private final AccessibilityManager j;

    /* loaded from: classes2.dex */
    public static abstract class BaseCallback<B> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes2.dex */
        public @interface DismissEvent {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Duration {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class SnackbarBaseLayout extends FrameLayout {
        private c mOnAttachStateChangeListener;
        private d mOnLayoutChangeListener;

        /* JADX INFO: Access modifiers changed from: package-private */
        public SnackbarBaseLayout(Context context) {
            this(context, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_elevation)) {
                ViewCompat.setElevation(this, obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            ViewCompat.requestApplyInsets(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            c cVar = this.mOnAttachStateChangeListener;
            if (cVar != null) {
                cVar.a(this);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            d dVar = this.mOnLayoutChangeListener;
            if (dVar != null) {
                dVar.a(this, i, i2, i3, i4);
            }
        }

        void setOnAttachStateChangeListener(c cVar) {
            this.mOnAttachStateChangeListener = cVar;
        }

        void setOnLayoutChangeListener(d dVar) {
            this.mOnLayoutChangeListener = dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class a extends SwipeDismissBehavior<SnackbarBaseLayout> {
        a() {
        }

        @Override // android.support.design.widget.SwipeDismissBehavior, android.support.design.widget.CoordinatorLayout.Behavior
        /* renamed from: a */
        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, SnackbarBaseLayout snackbarBaseLayout, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    l.a().d(BaseTransientBottomBar.this.c);
                }
            } else if (coordinatorLayout.isPointInChildBounds(snackbarBaseLayout, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                l.a().c(BaseTransientBottomBar.this.c);
            }
            return super.onInterceptTouchEvent(coordinatorLayout, snackbarBaseLayout, motionEvent);
        }

        @Override // android.support.design.widget.SwipeDismissBehavior
        public boolean a(View view) {
            return view instanceof SnackbarBaseLayout;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void animateContentIn(int i, int i2);

        void animateContentOut(int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface c {
        void a(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface d {
        void a(View view, int i, int i2, int i3, int i4);
    }

    static {
        d = Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT <= 19;
        f1150a = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: android.support.design.widget.BaseTransientBottomBar.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    ((BaseTransientBottomBar) message.obj).d();
                    return true;
                } else if (i != 1) {
                    return false;
                } else {
                    ((BaseTransientBottomBar) message.obj).c(message.arg1);
                    return true;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseTransientBottomBar(ViewGroup viewGroup, View view, b bVar) {
        if (viewGroup != null) {
            if (view == null) {
                throw new IllegalArgumentException("Transient bottom bar must have non-null content");
            }
            if (bVar == null) {
                throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
            }
            this.e = viewGroup;
            this.g = bVar;
            this.f = viewGroup.getContext();
            n.a(this.f);
            this.b = (SnackbarBaseLayout) LayoutInflater.from(this.f).inflate(R.layout.design_layout_snackbar, this.e, false);
            this.b.addView(view);
            ViewCompat.setAccessibilityLiveRegion(this.b, 1);
            ViewCompat.setImportantForAccessibility(this.b, 1);
            ViewCompat.setFitsSystemWindows(this.b, true);
            ViewCompat.setOnApplyWindowInsetsListener(this.b, new OnApplyWindowInsetsListener() { // from class: android.support.design.widget.BaseTransientBottomBar.5
                @Override // android.support.v4.view.OnApplyWindowInsetsListener
                public WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                    view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                    return windowInsetsCompat;
                }
            });
            this.j = (AccessibilityManager) this.f.getSystemService("accessibility");
            return;
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
    }

    private void e(final int i) {
        if (Build.VERSION.SDK_INT < 12) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.b.getContext(), R.anim.design_snackbar_out);
            loadAnimation.setInterpolator(android.support.design.widget.a.b);
            loadAnimation.setDuration(250L);
            loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: android.support.design.widget.BaseTransientBottomBar.4
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    BaseTransientBottomBar.this.d(i);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            this.b.startAnimation(loadAnimation);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, this.b.getHeight());
        valueAnimator.setInterpolator(android.support.design.widget.a.b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: android.support.design.widget.BaseTransientBottomBar.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.d(i);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.g.animateContentOut(0, 180);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.design.widget.BaseTransientBottomBar.3
            private int b = 0;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.d) {
                    ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.b, intValue - this.b);
                } else {
                    BaseTransientBottomBar.this.b.setTranslationY(intValue);
                }
                this.b = intValue;
            }
        });
        valueAnimator.start();
    }

    public Context a() {
        return this.f;
    }

    public B a(int i) {
        this.h = i;
        return this;
    }

    public void b() {
        l.a().a(this.h, this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        l.a().a(this.c, i);
    }

    final void c(int i) {
        if (!g() || this.b.getVisibility() != 0) {
            d(i);
        } else {
            e(i);
        }
    }

    public boolean c() {
        return l.a().e(this.c);
    }

    final void d() {
        if (this.b.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.b) {
                CoordinatorLayout.b bVar = (CoordinatorLayout.b) layoutParams;
                a aVar = new a();
                aVar.a(0.1f);
                aVar.b(0.6f);
                aVar.a(0);
                aVar.a(new SwipeDismissBehavior.a() { // from class: android.support.design.widget.BaseTransientBottomBar.7
                    @Override // android.support.design.widget.SwipeDismissBehavior.a
                    public void a(int i) {
                        if (i == 0) {
                            l.a().d(BaseTransientBottomBar.this.c);
                        } else if (i != 1 && i != 2) {
                        } else {
                            l.a().c(BaseTransientBottomBar.this.c);
                        }
                    }

                    @Override // android.support.design.widget.SwipeDismissBehavior.a
                    public void a(View view) {
                        view.setVisibility(8);
                        BaseTransientBottomBar.this.b(0);
                    }
                });
                bVar.a(aVar);
                bVar.g = 80;
            }
            this.e.addView(this.b);
        }
        this.b.setOnAttachStateChangeListener(new c() { // from class: android.support.design.widget.BaseTransientBottomBar.8
            @Override // android.support.design.widget.BaseTransientBottomBar.c
            public void a(View view) {
                if (BaseTransientBottomBar.this.c()) {
                    BaseTransientBottomBar.f1150a.post(new Runnable() { // from class: android.support.design.widget.BaseTransientBottomBar.8.1
                        @Override // java.lang.Runnable
                        public void run() {
                            BaseTransientBottomBar.this.d(3);
                        }
                    });
                }
            }
        });
        if (!ViewCompat.isLaidOut(this.b)) {
            this.b.setOnLayoutChangeListener(new d() { // from class: android.support.design.widget.BaseTransientBottomBar.9
                @Override // android.support.design.widget.BaseTransientBottomBar.d
                public void a(View view, int i, int i2, int i3, int i4) {
                    BaseTransientBottomBar.this.b.setOnLayoutChangeListener(null);
                    if (BaseTransientBottomBar.this.g()) {
                        BaseTransientBottomBar.this.e();
                    } else {
                        BaseTransientBottomBar.this.f();
                    }
                }
            });
        } else if (g()) {
            e();
        } else {
            f();
        }
    }

    void d(int i) {
        l.a().a(this.c);
        List<BaseCallback<B>> list = this.i;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.i.get(size);
            }
        }
        if (Build.VERSION.SDK_INT < 11) {
            this.b.setVisibility(8);
        }
        ViewParent parent = this.b.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.b);
        }
    }

    void e() {
        if (Build.VERSION.SDK_INT < 12) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.b.getContext(), R.anim.design_snackbar_in);
            loadAnimation.setInterpolator(android.support.design.widget.a.b);
            loadAnimation.setDuration(250L);
            loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: android.support.design.widget.BaseTransientBottomBar.12
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    BaseTransientBottomBar.this.f();
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                }
            });
            this.b.startAnimation(loadAnimation);
            return;
        }
        final int height = this.b.getHeight();
        if (d) {
            ViewCompat.offsetTopAndBottom(this.b, height);
        } else {
            this.b.setTranslationY(height);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height, 0);
        valueAnimator.setInterpolator(android.support.design.widget.a.b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: android.support.design.widget.BaseTransientBottomBar.10
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.f();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.g.animateContentIn(70, 180);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: android.support.design.widget.BaseTransientBottomBar.11
            private int c;

            {
                this.c = height;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                if (BaseTransientBottomBar.d) {
                    ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.b, intValue - this.c);
                } else {
                    BaseTransientBottomBar.this.b.setTranslationY(intValue);
                }
                this.c = intValue;
            }
        });
        valueAnimator.start();
    }

    void f() {
        l.a().b(this.c);
        List<BaseCallback<B>> list = this.i;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.i.get(size);
            }
        }
    }

    boolean g() {
        return !this.j.isEnabled();
    }

    public void i() {
        b(3);
    }

    public boolean j() {
        return l.a().h(this.c);
    }
}
